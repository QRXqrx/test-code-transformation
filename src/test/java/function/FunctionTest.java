package function;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import nju.pa.util.Util;
import nju.pa.visitor.collector.TestAnnotatedMethodCollector;
import nju.pa.visitor.collector.TestMethodCollector;
import nju.pa.visitor.modifier.NewTestAdder;
import nju.pa.visitor.modifier.OldTestRemover;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class FunctionTest {

    @Test
    public void testSplitTestClass1() throws FileNotFoundException {
        String path = "material/ALUTest.java";
        CompilationUnit cu = StaticJavaParser.parse(new File(path));

        NodeList<TypeDeclaration<?>> types = cu.getTypes();
        for (TypeDeclaration<?> type : types) {
            if(type instanceof ClassOrInterfaceDeclaration) {
                ClassOrInterfaceDeclaration aClass = (ClassOrInterfaceDeclaration) type;

                TestAnnotatedMethodCollector collector = new TestAnnotatedMethodCollector();
                NodeList<MethodDeclaration> testMDs = new NodeList<>();
                collector.visit(aClass, testMDs);

                Util.dumpList(testMDs);
            }
        }
    }

    @Test
    public void testSplitTestClass0() throws FileNotFoundException {
        String path = "material/ALUTest.java";
        CompilationUnit cu = StaticJavaParser.parse(new File(path));

        NodeList<ImportDeclaration> imports = cu.getImports();
        Optional<PackageDeclaration> optPack = cu.getPackageDeclaration();

        NodeList<TypeDeclaration<?>> types = cu.getTypes();
        NodeList<ClassOrInterfaceDeclaration> newTCs = new NodeList<>();
        for (TypeDeclaration<?> type : types) {
            if(type instanceof ClassOrInterfaceDeclaration) {
                ClassOrInterfaceDeclaration classOrInterface = (ClassOrInterfaceDeclaration) type;
                // Collect all class methods
                TestAnnotatedMethodCollector collector = new TestAnnotatedMethodCollector();
                NodeList<MethodDeclaration> testMDs = new NodeList<>();
                collector.visit(classOrInterface, testMDs);
                // Remove all test methods, preserve test dependencies.
                OldTestRemover remover = new OldTestRemover();
                remover.visit(classOrInterface, testMDs);
                // Preserve old class name.
                String oldClassName = classOrInterface.getNameAsString();
                // Generate new test classes.
                for(int i = 0 ; i < testMDs.size() ; i++) {
                    String newNameTemp = "%s_%d";
                    // Get class template.
                    ClassOrInterfaceDeclaration classTemp = classOrInterface.clone();
                    // Set name and comment.
                    classTemp.setName(String.format(newNameTemp, oldClassName, i));
                    classTemp.setBlockComment("Transform from " + oldClassName);
                    // Add method.
                    NewTestAdder adder = new NewTestAdder();
                    NodeList<MethodDeclaration> oneTestMethod = new NodeList<>();
                    oneTestMethod.add(testMDs.get(i));
                    adder.visit(classTemp, oneTestMethod);
                    // Update new test class list.
                    newTCs.add(classTemp);
                }
            }
        }

        NodeList<CompilationUnit> newCUs = new NodeList<>();
        newTCs.forEach((newTC) -> {
            CompilationUnit newCU = new CompilationUnit();
            newCU.setImports(imports);
            newCU.setPackageDeclaration(optPack.orElse(null));
            NodeList<TypeDeclaration<?>> oneClass = new NodeList<>();
            oneClass.add(newTC);
            newCU.setTypes(oneClass);
            newCUs.add(newCU);
        });

        Util.dumpList(newCUs);
    }

    @Test
    public void testDetectingAbstract1() {
        String path = "C:/Users/QRX/IdeaProjects/test-code-transformation/src/test/java/function/Test.java";
        File javaFile = new File(path);
        try {
            CompilationUnit cu = StaticJavaParser.parse(javaFile);
            NodeList<TypeDeclaration<?>> types = cu.getTypes();
            System.out.println(types.size());
            for (TypeDeclaration<?> type : types) {
                System.out.println(type.getFullyQualifiedName());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testDetectingAbstract() {
        String path = "C:/Users/QRX/IdeaProjects/test-code-transformation/material/issue/ParserTestCase.java";
        File javaFile = new File(path);
        try {
            CompilationUnit cu = StaticJavaParser.parse(javaFile);
            NodeList<TypeDeclaration<?>> types = cu.getTypes();
            System.out.println(types.size());
            TypeDeclaration<?> typeDeclaration = types.get(0);
            if(typeDeclaration instanceof ClassOrInterfaceDeclaration) {
                ClassOrInterfaceDeclaration classOrInterface = (ClassOrInterfaceDeclaration) typeDeclaration;
                if(classOrInterface.isInterface())
                    System.out.println(classOrInterface.getFullyQualifiedName() + "is an interface.");
                System.out.println(classOrInterface.getName() + "[-]" +classOrInterface.isAbstract());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBlockStmtEquals() {
        BlockStmt blockStmt1 = new BlockStmt();
        BlockStmt blockStmt2 = new BlockStmt();
        // Generate content.
        // System.out.println("Hello world!");
        Statement statement1 = StaticJavaParser.parseStatement("System.out.println(\"Hello world!\");");
        Statement statement2 = StaticJavaParser.parseStatement("System.out.println(\"Hello world!\");");
        // Add content.
        blockStmt1.addStatement(statement1);
        blockStmt2.addStatement(statement2);
        // Print Result
        Util.simpleLog("BStmt1", blockStmt1);
        Util.simpleLog("BStmt2", blockStmt2);
        Util.simpleLog("blockStmt1.equals(blockStmt2)", blockStmt1.equals(blockStmt2));
        Util.simpleLog("blockStmt1 == blockStmt2", blockStmt1 == blockStmt2);
    }

    @SuppressWarnings(value = "all")
    @Test
    public void test() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(1, 3);
        Assert.assertEquals(3, map.get(1).intValue());
    }
}
