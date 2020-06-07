package nju.pa.util;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.SimpleName;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.Statement;
import nju.pa.util.enums.JunitAssert;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Factory class provide method of operations on JAS statement.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-04-24
 */
public class JunitAssertUtil {

    private JunitAssertUtil() {}

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
