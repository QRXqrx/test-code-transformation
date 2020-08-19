package nju.pa.transform;

import nju.pa.util.IOUtil;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * Test functionality of TestCodeSplitter.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-08-19
 */
public class SplitterTest {

    @Test
    public void testOutputForProject() {
        String dirPath = "C:/Users/QRX/IdeaProjects/test-code-transformation/material/triangle3/src/test/java";
        List<File> allJavaFiles = IOUtil.getAllFilesBySuffix(dirPath, IOUtil.JAVA_SUFFIX);
        allJavaFiles.forEach((javaFile) -> {
            TestCodeSplitter splitter = new TestCodeSplitter(javaFile);
            splitter.output();
        });
    }
    
    @Test
    public void testTransform() {
        String path = "material/output/ALUTest.java";
        TestCodeSplitter splitter = new TestCodeSplitter(path);
        splitter.transform();
    }

    @Test
    public void testOutput() {
        String path = "material/output/ALUTest.java";
        TestCodeSplitter splitter = new TestCodeSplitter(path);
        splitter.output();
    }

}
