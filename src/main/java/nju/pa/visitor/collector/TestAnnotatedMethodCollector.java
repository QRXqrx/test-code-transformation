package nju.pa.visitor.collector;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import nju.pa.util.JunitUtil;

import java.util.List;

/**
 * This collector will collect methods annotated by @Test (Junit test annotation)
 * The collection condition is not as strict as TestMethodCollector.
 *
 * @see TestMethodCollector
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-08-19
 */
public class TestAnnotatedMethodCollector extends VoidVisitorAdapter<List<MethodDeclaration>> {
    @Override
    public void visit(MethodDeclaration md, List<MethodDeclaration> list) {
        super.visit(md, list);
        if(JunitUtil.isTestAnnotatedMethod(md))
            list.add(md);
    }
}
