package nju.pa.issue;

import nju.pa.driver.TransformationDriver;
import org.junit.Test;

/**
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-07-12
 */
public class CannotResolveSymbolTest {

    @Test
    public void testJfreeChart() {
        String target = "C:/Users/QRX/Desktop/MyWorkplace/Postgraduate/Tasks/task4_atom_test_generation/0-jpt-experiment/jfreechart-experiment/src/test";
        String cmd = String.format("-d %s", target);
        String[] params = cmd.split(" ");
        TransformationDriver.main(params);
    }

    @Test
    public void testAreaChartTest() {
        String target = "material/issue/AreaChartTest.java";
        String cmd = String.format("-f %s", target);
        String[] params = cmd.split(" ");
        TransformationDriver.main(params);
    }
}
