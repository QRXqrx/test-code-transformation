package nju.pa.visitor;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.Statement;
import nju.pa.util.Util;
import nju.pa.visitor.collector.FinalStmtCollector;
import nju.pa.visitor.collector.TestMethodCollector;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class VisitorTest {

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
    public void testCollectFinalStmts2() {
        List<MethodDeclaration> tmds = new ArrayList<>();
        TestMethodCollector tmdCollector = new TestMethodCollector();
        tmdCollector.visit(asTestCU, tmds);
        MethodDeclaration aTestMD = tmds.get(2);

        FinalStmtCollector fsCollector = new FinalStmtCollector();
        List<Statement> fss = new NodeList<>();
        fsCollector.visit(aTestMD, fss);

        Util.dumpList(fss);
    }

    @Test
    public void testCollectFinalStmts1() {
        List<MethodDeclaration> tmds = new ArrayList<>();
        TestMethodCollector tmdCollector = new TestMethodCollector();
        tmdCollector.visit(rbtTestCU, tmds);
        MethodDeclaration aTestMD = tmds.get(0);

//        System.out.println(aTestMD);

        FinalStmtCollector fsCollector = new FinalStmtCollector();
        List<Statement> fss = new NodeList<>();
        fsCollector.visit(aTestMD, fss);

        Util.dumpList(fss);
    }

    @Test
    public void testCollectFromTryCatch() {
        List<MethodDeclaration> tmds = new ArrayList<>();
        TestMethodCollector tmdCollector = new TestMethodCollector();
        tmdCollector.visit(asTestCU, tmds);
        MethodDeclaration aTmdWithTryCatch = tmds.get(2);

        Optional<BlockStmt> op = aTmdWithTryCatch.getBody();
        Assert.assertTrue(op.isPresent());

        // Get one try statement.
        BlockStmt methodBS = op.get();
        Statement aTryStmt = methodBS.getStatements().get(73);
        System.out.println(aTryStmt);


    }



}
