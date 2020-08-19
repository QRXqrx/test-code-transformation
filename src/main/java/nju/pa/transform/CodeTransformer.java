package nju.pa.transform;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.expr.SimpleName;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import lombok.Data;
import lombok.NoArgsConstructor;
import nju.pa.exception.EmptyMethodBodyException;
import nju.pa.visitor.collector.FinalStmtCollector;
import nju.pa.visitor.collector.TestMethodCollector;
import nju.pa.visitor.modifier.JasModifier;
import nju.pa.visitor.modifier.NewTestAdder;
import nju.pa.visitor.modifier.OldTestRemover;

import java.io.File;
import java.io.FileNotFoundException;
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
@Data
public abstract class CodeTransformer {

    private String javaPath;
    private File javaFile;
    private CompilationUnit cu = new CompilationUnit();

    private Boolean alreadyTransformed = false;

    public CodeTransformer(String javaPath) {
        this.javaPath = javaPath;
        this.javaFile = new File(javaPath);
        try {
            this.cu = StaticJavaParser.parse(javaFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error in TestCodeTransformer, constructor");
            e.printStackTrace();
        }
    }

    public CodeTransformer(File javaFile) {
        this.javaFile = javaFile;
        this.javaPath = javaFile.getAbsolutePath();
        try {
            this.cu = StaticJavaParser.parse(javaFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error in TestCodeTransformer, constructor");
            e.printStackTrace();
        }
    }


    public void setJavaPath(String javaPath) {
        this.javaPath = javaPath;
        this.javaFile = new File(javaPath);
        try {
            this.cu = StaticJavaParser.parse(javaFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error in TestCodeTransformer, setJavaPath");
            e.printStackTrace();
        }
        this.alreadyTransformed = false;
    }

    public void setJavaFile(File javaFile) {
        this.javaFile = javaFile;
        this.javaPath = javaFile.getAbsolutePath();
        try {
            this.cu = StaticJavaParser.parse(javaFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error in TestCodeTransformer, setJavaFile");
            e.printStackTrace();
        }
        this.alreadyTransformed = false;
    }

    public String transformToSrc() {return transformToSrc(true);}

    public String transformToSrc(boolean commentOn) {
        transform(commentOn);
        return cu.toString();
    }

    public void transform() { transform(true); }

    /**
     * The integrated process of transformation.
     *
     * @param commentOn Whether generated test code has comments about where the changed code come from.
     */
    public abstract void transform(boolean commentOn);


}
