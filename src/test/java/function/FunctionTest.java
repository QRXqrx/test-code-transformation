package function;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class FunctionTest {

    @SuppressWarnings(value = "all")
    @Test
    public void test() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(1, 3);
        Assert.assertEquals(3, map.get(1).intValue());
    }
}
