package nju.pa.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Provide some common utils.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-07-12
 */
public class Util {

    private Util(){}



    public static <E> void dumpList(List<E> elems, String split){
        System.out.println(split);
        int cnt = 1;
        for (E elem : elems)
            System.out.println(String.format("[%d] %s", cnt++, elem.toString()));
        System.out.println(split);
    }

    public static <E> void dumpList(List<E> elems) {
        dumpList(elems, "-------------------------------------");
    }

    public static void simpleLog(String type, Object content) {
        System.out.println(String.format("[%s] %s", type, content.toString()));
    }

}
