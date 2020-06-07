package nju.pa.visitor.collector;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import nju.pa.util.enums.JunitAssert;
import nju.pa.util.enums.JunitTestAnnotation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * TestMethodCollector can collect test method from cu. It extends VoidVisitorAdapter
 * And treat MethodDeclaration as targets.
 * @see VoidVisitorAdapter
 * @see MethodDeclaration
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-04-22
 */
public class TestMethodCollector extends VoidVisitorAdapter<List<MethodDeclaration>> {
    /**
     * Judge whether a method contains junit assert statements.
     *
     * @param md An instance of MethodDeclaration
     * @return Judgment result
     */
    private boolean hasAssert(MethodDeclaration md) {
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
     * Judge whether a method is a test method
     *
     * @param md An instance of MethodDeclaration
     * @return Judgment result
     */
    private boolean isTestMethod(MethodDeclaration md) {
        NodeList<AnnotationExpr> annotations = md.getAnnotations();
        if(annotations.isEmpty()) {
            return false;
        }

        List<String> annoNameList = annotations.stream()
                .map((anno) -> anno.getName().toString())
                .collect(Collectors.toList());

        for (String annoName : annoNameList) {
            if(JunitTestAnnotation.isJunitTestAnnotation(annoName)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void visit(MethodDeclaration md, List<MethodDeclaration> list) {
        super.visit(md, list);

        if(isTestMethod(md) && hasAssert(md)) {
            list.add(md);
        }
    }
}
