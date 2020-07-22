package nju.pa.issue;

import nju.pa.driver.TransformationDriver;
import org.junit.Test;

/**
 * This class relate to the issue in 2nd round of experiments on real world
 * projects, which occurs when transforming projects:
 * 1: commons-bcel,
 * 4: commons,
 * 7: commons,
 * 8: commons,
 * and reports StringIndexOutOfBoundsException
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-07-22
 */
public class CannotTransformTest {

    @Test
    public void testCannotTransform1() {
        String target = "material/issue/commons-bcel-master";
        String cmd = String.format("-d %s", target);
        String[] params = cmd.split(" ");
        TransformationDriver.main(params);
    }

}
