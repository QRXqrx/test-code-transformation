package nju.pa.issue;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.TypeDeclaration;
import nju.pa.driver.TransformationDriver;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-07-20
 */
public class DontTransformAbstractTest {

    @Test
    public void testDontTransformAbstract() {
        String target = "C:/Users/QRX/IdeaProjects/test-code-transformation/material/issue/ParserTestCase.java";
        String cmd = String.format("-f %s", target);
        String[] params = cmd.split(" ");
        TransformationDriver.main(params);
    }

}
