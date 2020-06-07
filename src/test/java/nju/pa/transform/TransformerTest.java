package nju.pa.transform;

import nju.pa.util.IOUtil;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class TransformerTest {

    private final String rbtTestJavaPath = "material/RedBlackTreeTest.java";
    private final String asTestJavaPath = "material/AStarTest.java";
    private final String bcTestJavaPath = "material/BreadcrumbsTest.java";

    public void write(String javaPath) throws IOException {
        File javaFile = new File(javaPath);
        File jptFile = new File(javaFile.getParent(), "JPT/" + javaFile.getName());
        TestCodeTransformer transformer = new TestCodeTransformer();
        transformer.setJavaPath(javaPath);
        String content = transformer.transformToSrc();
        IOUtil.writeContentIntoFile(jptFile, content);
    }

    @Test
    public void testWriteIntoNewFile2() {
        try {
            write(bcTestJavaPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWriteIntoNewFile1() {
        try {
            write(asTestJavaPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testWriteIntoNewFile0() {
        try {
            write(rbtTestJavaPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWriteIntoNewFile() {
        try {
            write(rbtTestJavaPath);
            write(asTestJavaPath);
            write(bcTestJavaPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testTransformBC() {
        TestCodeTransformer transformer = new TestCodeTransformer(bcTestJavaPath);
        System.out.println(transformer.transformToSrc());
    }

    @Test
    public void testTransformAS() {
        TestCodeTransformer transformer = new TestCodeTransformer(asTestJavaPath);
        System.out.println(transformer.transformToSrc());
    }

    @Test
    public void testTransformRBT() {
        TestCodeTransformer transformer = new TestCodeTransformer(rbtTestJavaPath);
        System.out.println(transformer.transformToSrc());
    }
}
