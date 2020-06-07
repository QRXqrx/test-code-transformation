package util;

import java.util.List;

/**
 * Test util.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class Util {

    public static <E> void dumpList(List<E> elems, String split){
        for (E elem : elems) {
            System.out.println(split);
            System.out.println(elem);
            System.out.println(split);
        }
    }

    public static <E> void dumpList(List<E> elems) {
        dumpList(elems, "-------------------------------------");
    }

}
