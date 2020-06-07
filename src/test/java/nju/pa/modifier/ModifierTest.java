package nju.pa.modifier;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import nju.pa.visitor.collector.TestMethodCollector;
import nju.pa.visitor.modifier.JasModifier;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class ModifierTest {

    private final String rbtTestJavaPath = "material/RedBlackTreeTest.java";
    private final File rbtTestJavaFile = new File(rbtTestJavaPath);
    private CompilationUnit rbtTestCU = new CompilationUnit();

    private final String asTestJavaPath = "material/AStarTest.java";
    private final File asTestJavaFile = new File(asTestJavaPath);
    private CompilationUnit asTestCU = new CompilationUnit();

    {
        try {
            rbtTestCU = StaticJavaParser.parse(rbtTestJavaFile);
            asTestCU = StaticJavaParser.parse(asTestJavaFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testModifyASTest() {
        List<MethodDeclaration> tmds = new NodeList<>();
        TestMethodCollector tmdCollector = new TestMethodCollector();
        tmdCollector.visit(asTestCU, tmds);

        MethodDeclaration aTmd = tmds.get(0);

        // Modifier
        JasModifier jasModifier = new JasModifier();
        jasModifier.visit(aTmd, null);

        System.out.println(aTmd);
    }

    @Test
    public void testModifyRBTTest() {
        List<MethodDeclaration> tmds = new NodeList<>();
        TestMethodCollector tmdCollector = new TestMethodCollector();
        tmdCollector.visit(rbtTestCU, tmds);

        MethodDeclaration aTmd = tmds.get(0);

        // Modifier
        JasModifier jasModifier = new JasModifier();
        jasModifier.visit(aTmd, null);

        System.out.println(aTmd);
    }

}
