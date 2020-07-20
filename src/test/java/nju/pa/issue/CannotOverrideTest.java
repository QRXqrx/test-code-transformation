package nju.pa.issue;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import nju.pa.driver.TransformationDriver;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Relate to commons-cli: some test classes of commons-cli override methods of its super class
 * jpt may make the super method not exist because it will change super methods' name
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-07-20
 */
public class CannotOverrideTest {

    @Test
    public void testCommonsCli() {
        String target = "C:/Users/QRX/IdeaProjects/test-code-transformation/material/issue/commons-cli-master/src/test";
        String cmd = String.format("-d %s", target);
        String[] params = cmd.split(" ");
        TransformationDriver.main(params);
    }
}
