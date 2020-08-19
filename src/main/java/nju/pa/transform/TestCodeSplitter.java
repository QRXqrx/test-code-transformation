package nju.pa.transform;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import lombok.NoArgsConstructor;
import nju.pa.util.IOUtil;
import nju.pa.util.Util;
import nju.pa.visitor.collector.TestAnnotatedMethodCollector;
import nju.pa.visitor.modifier.NewTestAdder;
import nju.pa.visitor.modifier.OldTestRemover;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * TestCodeSplitter can transform a test class into several new test classes
 * add ensure each new class only contains one test method.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-08-19
 */
@NoArgsConstructor
public class TestCodeSplitter extends CodeTransformer{

    public TestCodeSplitter(String javaPath) {
        super(javaPath);
    }

    public TestCodeSplitter(File javaFile) {
        super(javaFile);
    }

    private final Map<String, CompilationUnit> nameCUMap = new HashMap<>();

    /**
     * Core logic of transformation.
     *
     * @param classOrInterface A class needs transformation
     * @param commentOn Whether generate comment for sake of debugging.
     * @return New test classes. Each class only contains one test annotated method.
     */
    private NodeList<ClassOrInterfaceDeclaration> transformOneClass(
            ClassOrInterfaceDeclaration classOrInterface, boolean commentOn
    ) {
        ClassOrInterfaceDeclaration classTemp = classOrInterface.clone();
        // Preserve old method Name
        String oldName = classOrInterface.getNameAsString();
        // Collect methods annotated with @Test
        TestAnnotatedMethodCollector collector = new TestAnnotatedMethodCollector();
        NodeList<MethodDeclaration> testMDs = new NodeList<>();
        collector.visit(classTemp, testMDs);
        // Remove test methods from test class to generate a class template.
        OldTestRemover remover = new OldTestRemover();
        remover.visit(classTemp, testMDs);
        // Generate new test classes.
        NodeList<ClassOrInterfaceDeclaration> newTCs = new NodeList<>();
        for(int i = 0 ; i < testMDs.size() ; i++) {
            ClassOrInterfaceDeclaration newTC = classTemp.clone();
            // Set comment for sake of debugging.
            if(commentOn)
                newTC.setBlockComment("Transform from " + oldName);
            // Set name.
            newTC.setName(Util.toNewSimpleName(oldName, i));
            // Add method.
            NewTestAdder adder = new NewTestAdder();
            NodeList<MethodDeclaration> oneMethod = new NodeList<>();
            oneMethod.add(testMDs.get(i));
            adder.visit(newTC, oneMethod);
            // Update new test class list
            newTCs.add(newTC);
        }
        return newTCs;
    }

    /**
     * Core logic.
     * @param commentOn Whether generated test code has comments about where the changed code come from.
     */
    @Override
    public void transform(boolean commentOn) {
        if(getAlreadyTransformed()) return;
        // One compilation indicates one class java source file, which may contains more than one class.
        NodeList<TypeDeclaration<?>> types = getCu().getTypes();
        // Collect newTCs
        NodeList<ClassOrInterfaceDeclaration> newTCs = new NodeList<>();
        for (TypeDeclaration<?> type : types) {
            if(type instanceof ClassOrInterfaceDeclaration) {
                ClassOrInterfaceDeclaration classOrInterface = (ClassOrInterfaceDeclaration) type;
                // Only process test class, which cannot be an interface or abstract class.
                if(classOrInterface.isInterface()) {
                    String pattern = "[LOG] type[%s] in file[%s] is not a class so it cannot be a test class, pass";
                    System.out.println(String.format(pattern, type.getFullyQualifiedName(), getJavaPath()));
                    continue;
                }
                if(classOrInterface.isAbstract()) {
                    String pattern = "[LOG] type[%s] in file[%s] is an abstract class, pass";
                    System.out.println(String.format(pattern, type.getFullyQualifiedName(), getJavaPath()));
                    continue;
                }
                // Transform this class, and add new TCs into list.
                newTCs.addAll(transformOneClass(classOrInterface, commentOn));
                // Generate new compilation units.
                generateNewCUs(newTCs);
            } else {
                String pattern = "[LOG] type[%s] in file[%s] is not a class or an interface, pass";
                System.out.println(String.format(pattern, type.getFullyQualifiedName(), getJavaPath()));
            }
        }
        setAlreadyTransformed(true);
    }

    /**
     * Transform TC into CU to get prepared for outputting.
     *
     * @param newTCs New test classes represented by ClassOrInterfaceDeclaration instance.
     */
    private void generateNewCUs(NodeList<ClassOrInterfaceDeclaration> newTCs) {
        NodeList<ImportDeclaration> imports = getCu().getImports();
        Optional<PackageDeclaration> packOpt = getCu().getPackageDeclaration();
        newTCs.forEach((newTC) -> {
            CompilationUnit newCU = new CompilationUnit();
            newCU.setImports(imports);
            newCU.setPackageDeclaration(packOpt.orElse(null));
            // Get class name.
            String name = newTC.getNameAsString();
            // Set types.
            NodeList<TypeDeclaration<?>> oneClass = new NodeList<>();
            oneClass.add(newTC);
            newCU.setTypes(oneClass);
            // Update new compilation unit map.
            nameCUMap.put(name, newCU);
        });
    }

    public void output() {
        output(true);
    }

    /**
     * This method can output new compilation units into new java files.
     */
    public void output(boolean commentOn) {
        if(!getAlreadyTransformed()) {
            System.out.println(String.format("[LOG] %s has not been transformed yet, now transform", getJavaPath()));
            transform(commentOn);
            System.out.println("[LOG] Start to output.");
        }
        File outputDir = getJavaFile().getParentFile();
        if(!outputDir.isDirectory())
            throw new RuntimeException(outputDir + " is not a directory.");
        nameCUMap.forEach((name, CU) -> {
            String javaName = name + ".java";
            String content = CU.toString();
            try {
                IOUtil.writeContentIntoFile(new File(outputDir, javaName), content);
            } catch (IOException e) {
                System.out.println("[LOG] In TestCodeSplitter.output()");
                e.printStackTrace();
            }
        });
    }

}
