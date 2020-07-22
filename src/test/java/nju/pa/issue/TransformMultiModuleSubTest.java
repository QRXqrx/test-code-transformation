package nju.pa.issue;

import nju.pa.driver.TransformationDriver;
import org.junit.Test;

/**
 * This test relate to commons-functor. commons-functor is a subject contains multiple modules
 * Experiment process executed badly on it since the test class file is not transformed properly.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-07-21
 */
public class TransformMultiModuleSubTest {

    @Test
    public void testTransformProject() {
        String target = "C:/Users/QRX/IdeaProjects/test-code-transformation/material/issue/commons-functor-master";
        String cmd = String.format("-d %s", target);
        String[] params = cmd.split(" ");
        TransformationDriver.main(params);
    }
}
