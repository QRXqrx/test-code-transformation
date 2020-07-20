package nju.pa.issue;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import nju.pa.driver.TransformationDriver;
import org.junit.Test;
import sun.nio.cs.ISO_8859_2;
import sun.nio.cs.ext.ISO_8859_11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;

/**
 * Relate to commons-fileupload: org.apache.commons.fileupload2.util.mime.MimeUtilityTestCase
 * was encoded wrongly after jpt.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-07-20
 */
public class WrongEncodeTest {

    @Test
    public void testReadCU() {
        String target = "C:/Users/QRX/IdeaProjects/test-code-transformation/material/issue/MimeUtilityTestCase.java";
        File javaFile = new File(target);
        Charset charset = new ISO_8859_11();
        try {
//            CompilationUnit cu = StaticJavaParser.parse(new FileInputStream(javaFile), charset);
//            CompilationUnit cu = StaticJavaParser.parse(new FileInputStream(javaFile));
            CompilationUnit cu = StaticJavaParser.parse(new FileInputStream(javaFile));
            System.out.println(cu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCommonsFileUpload() {
        String target = "C:/Users/QRX/IdeaProjects/test-code-transformation/material/issue/MimeUtilityTestCase.java";
        String cmd = String.format("-f %s", target);
        String[] params = cmd.split(" ");
        TransformationDriver.main(params);
    }
    
}
