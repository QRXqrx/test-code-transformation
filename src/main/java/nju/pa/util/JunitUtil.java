package nju.pa.util;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.SimpleName;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.Statement;
import nju.pa.util.enums.JunitAssert;
import nju.pa.util.enums.JunitTestAnnotation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Factory class provide methods related to Junit.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-04-24
 */
public class JunitUtil {

    private JunitUtil() {}

    /**
     * Judge whether a method contains junit assert statements.
     *
     * @param md An instance of MethodDeclaration
     * @return Judgment result
     */
    public static boolean hasAssert(MethodDeclaration md) {
        Optional<BlockStmt> op = md.getBody();
        if(!op.isPresent()) {
            return false;
        }
        BlockStmt mdBody = op.get();
        NodeList<Statement> statements = mdBody.getStatements();
        for (Statement statement : statements) {
            if(JunitAssert.hasJunitAssert(statement.toString())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Judge whether a method is annotated by junit test annotation
     * like @Test, @org.junit.Test and @org.junit.jupiter.api.Test.
     *
     * @see JunitTestAnnotation
     *
     * @param md An instance of MethodDeclaration
     * @return Judgment result
     */
    public static boolean isTestAnnotatedMethod(MethodDeclaration md) {
        NodeList<AnnotationExpr> annotations = md.getAnnotations();
        if(annotations.isEmpty())
            return false;

        List<String> annoNameList = annotations.stream()
                .map((anno) -> anno.getName().toString())
                .collect(Collectors.toList());

        for (String annoName : annoNameList)
            if(JunitTestAnnotation.isJunitTestAnnotation(annoName))
                return true;

        return false;
    }

    /**
     * Transform a junit assert statement which is not final statement into several method call
     * Like: assertEquals(255, tree.root.value.intValue()) --> tree.root.value.intValue();
     *
     * @param jas A junit assert statement.
     * @return Arguments of this jas which are method calls.
     */
    public static NodeList<Statement> transformJunitAssertStmt(Statement jas) {
        NodeList<Statement> stmts = new NodeList<>();
        jas.getChildNodes().forEach((node) -> {
            if(node instanceof MethodCallExpr) {
                MethodCallExpr junitAssertInvoc = (MethodCallExpr) node;
                // Only preserve method call arguments.
                List<ExpressionStmt> methodCalls = junitAssertInvoc.getArguments()
                        .stream()
                        .filter(Expression::isMethodCallExpr)
                        .map(ExpressionStmt::new)
                        .collect(Collectors.toList());
                stmts.addAll(methodCalls);
            }
        });

        return stmts;
    }

    public static boolean isMethodCallStatement(Statement statement) {
        List<Node> childNodes = statement.getChildNodes();
        if(childNodes.isEmpty())
            return false;
        for (Node childNode : childNodes)
            if(childNode instanceof MethodCallExpr)
                return true;
        return false;
    }

    public static boolean isJunitAssertStmt(Statement statement) {
        if(!isMethodCallStatement(statement))
            return false;
        for (Node node : statement.getChildNodes()) {
            if(node instanceof MethodCallExpr) {
                MethodCallExpr callExpr = (MethodCallExpr) node;
                SimpleName name = callExpr.getName();
                if(JunitAssert.isJunitAssert(name.asString()))
                    return true;
                // Add this temporarily, for simplicity.
                if(JunitAssert.hasJunitAssert(callExpr.toString()))
                    return true;
            }
        }
        return false;
    }
}
