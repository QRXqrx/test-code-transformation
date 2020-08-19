package nju.pa.transform;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.expr.SimpleName;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import lombok.NoArgsConstructor;
import nju.pa.exception.EmptyMethodBodyException;
import nju.pa.visitor.collector.FinalStmtCollector;
import nju.pa.visitor.collector.TestMethodCollector;
import nju.pa.visitor.modifier.JasModifier;
import nju.pa.visitor.modifier.NewTestAdder;
import nju.pa.visitor.modifier.OldTestRemover;

import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The core of test code transformation. This class will leverage diverse visitors to
 * implement transformation. The ultimate target of this class is to split test method
 * contains several final statements into test methods each of which only contains one
 * untransformed final statement.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */

@NoArgsConstructor
public class TestCodeTransformer extends CodeTransformer {

    public TestCodeTransformer(String javaPath) {
        super(javaPath);
    }

    public TestCodeTransformer(File javaFile) {
        super(javaFile);
    }

    private void transformOneClass(ClassOrInterfaceDeclaration aClassType, boolean commentOn) {
        // Collect all old test methods.
        TestMethodCollector tmdCollector = new TestMethodCollector();
        List<MethodDeclaration> oldTMDs = new NodeList<>();
        tmdCollector.visit(aClassType, oldTMDs);
        // Remove all old test methods.
        OldTestRemover remover = new OldTestRemover();
        remover.visit(aClassType, oldTMDs);
        // Generate new test methods.
        List<MethodDeclaration> newTMDs = generateNewTestMethods(oldTMDs, commentOn);
        // Add new test methods.
        NewTestAdder adder = new NewTestAdder();
        adder.visit(aClassType, newTMDs);
    }

    /**
     * The integrated process of transformation.
     *
     * @param commentOn Whether generated test code has comments about where the changed code come from.
     */
    public void transform(boolean commentOn) {
        if(getAlreadyTransformed()) return;
        // One compilation indicates one class java source file, which may contains more than one class.
        NodeList<TypeDeclaration<?>> types = getCu().getTypes();
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
                // Transform this class.
                transformOneClass(classOrInterface, commentOn);
            } else {
                String pattern = "[LOG] type[%s] in file[%s] is not a class or an interface, pass";
                System.out.println(String.format(pattern, type.getFullyQualifiedName(), getJavaPath()));
            }
        }
        setAlreadyTransformed(true);
    }

    // Method Transform before 20200720
//    public void transform(boolean commentOn) {
//        if(alreadyTransformed) return;
//        // Collect all old test methods.
//        TestMethodCollector tmdCollector = new TestMethodCollector();
//        List<MethodDeclaration> oldTMDs = new NodeList<>();
//        tmdCollector.visit(cu, oldTMDs);
//        // Remove all old test methods.
//        OldTestRemover remover = new OldTestRemover();
//        remover.visit(cu, oldTMDs);
//        // Generate new test methods.
//        List<MethodDeclaration> newTMDs = generateNewTestMethods(oldTMDs, commentOn);
//        // Add new test methods.
//        NewTestAdder adder = new NewTestAdder();
//        adder.visit(cu, newTMDs);
//        alreadyTransformed = true;
//    }

    /**
     * Split old test methods into new test methods.
     *
     * @param oldTMDs Original test methods, represented by MethodDeclarations.
     * @param commentOn Whether generated test code has comments about where the changed code come from.
     * @return A list of MethodDeclarations represents transformed test methods.
     */
    private List<MethodDeclaration> generateNewTestMethods(List<MethodDeclaration> oldTMDs, boolean commentOn) {
        NodeList<MethodDeclaration> newTMDs = new NodeList<>();
        for (MethodDeclaration oldTMD : oldTMDs)
            newTMDs.addAll(splitOneOldTestMethod(oldTMD, commentOn));
        return newTMDs;
    }

    /**
     * Split one original test methods into several new test methods according to junit assert* statement.
     *
     * @param oldTMD A MethodDeclaration instance represents one original test method.
     * @param commentOn Whether generated test code has comments about where the changed code come from.
     * @return A list of MethodDeclarations represents test methods split from the original test method.
     */
    private List<MethodDeclaration> splitOneOldTestMethod(MethodDeclaration oldTMD, boolean commentOn) {
        // Build new method bodies.
        Optional<BlockStmt> op = oldTMD.getBody();
        if(!op.isPresent())
            throw new EmptyMethodBodyException("Test method doesn't have body!" + oldTMD.getDeclarationAsString());

        NodeList<Statement> oldTMDStmts = op.get().getStatements();
        NodeList<BlockStmt> newBodies = new NodeList<>();

        // Collect all final statements.
        FinalStmtCollector fsCollector = new FinalStmtCollector();
        NodeList<Statement> fss = new NodeList<>();
        fsCollector.visit(oldTMD, fss);

        // TODO - Can be optimized.
        for (Statement finalStmt : fss) {
            BlockStmt newMethodBody = new BlockStmt();
            for (Statement statement : oldTMDStmts) {
                // This line is very crucial.
                Statement stmt = statement.clone(); // Clone to prevent jasModifier from modifying statement.
                if(stmt == statement)
                    System.out.println("stmt and statement has the same location");
                if(finalStmt.equals(stmt)) { // Each final stmt indicate one new method body.
                    // Refactor all previous assert.
                    JasModifier jasModifier = new JasModifier();
                    jasModifier.visit(newMethodBody, commentOn);
                    // Add final stmt.
                    newMethodBody.addStatement(stmt);
                    newBodies.add(newMethodBody);
                    break;
                }
                newMethodBody.addStatement(stmt); // TODO - Someone may not put final statement at final?
            }
        }

        // Deduplicate new method bodies.
        List<BlockStmt> tempBodies = newBodies.stream().distinct().collect(Collectors.toList());
        newBodies = new NodeList<>(tempBodies);

        // Construct new test methods.
        NodeList<MethodDeclaration> newTMDs = new NodeList<>();
        for(int i = 0 ; i < newBodies.size() ; i++) { // Each body for one new test method.
            SimpleName newSimpleName = toNewSimpleName(oldTMD.getName(), i);
            MethodDeclaration newTMD = oldTMD.clone(); // Preserve annotation, access modifier etc.
            if(newTMD == oldTMD)
                System.out.println("newTMD and oldTMD have the same location");
            newTMD.setName(newSimpleName);
            newTMD.setBody(newBodies.get(i));
            newTMDs.add(newTMD);
        }
        return newTMDs;
    }


    /**
     * Name the generated test methods using old simple name and count number.
     *
     * @param oldSimpleName The simple name of one original test method.
     * @param cnt The index of the generated test methods in new test methods list.
     * @return New simple name for transformed test methods. New name is like: OldSimpleName_cnt.
     */
    private SimpleName toNewSimpleName(SimpleName oldSimpleName, int cnt) {
        if(cnt == 0) // For the first generated test method, don't add cnt for it.
            return oldSimpleName;
        return toNewSimpleName(oldSimpleName.asString(), cnt);
    }

    private SimpleName toNewSimpleName(String oldSimpleNameStr, int cnt) {
        if(cnt == 0)
            return new SimpleName(oldSimpleNameStr);
        StringBuilder newNameBuilder = new StringBuilder(oldSimpleNameStr.length() + 5);
        newNameBuilder.append(oldSimpleNameStr).append("_").append(cnt);
        return new SimpleName(newNameBuilder.toString());
    }

}
