package nju.pa.util;

/**
 * Provide some common utils.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-07-12
 */
public class Util {

    private Util(){}

    public static void simpleLog(String type, Object content) {
        System.out.println(String.format("[%s] %s", type, content.toString()));
    }

}
