package nju.pa.util;

import com.github.javaparser.ast.expr.SimpleName;

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

    /**
     * Name the generated test methods using old simple name and count number.
     *
     * @param oldSimpleName The simple name of one original test method.
     * @param cnt The index of the generated test methods in new test methods list.
     * @return New simple name for transformed test methods. New name is like: OldSimpleName_cnt.
     */
    public static SimpleName toNewSimpleName(SimpleName oldSimpleName, int cnt) {
        if(cnt == 0) // For the first generated test method, don't add cnt for it.
            return oldSimpleName;
        return toNewSimpleName(oldSimpleName.asString(), cnt);
    }

    public static SimpleName toNewSimpleName(String oldSimpleNameStr, int cnt) {
        if(cnt == 0)
            return new SimpleName(oldSimpleNameStr);
        StringBuilder newNameBuilder = new StringBuilder(oldSimpleNameStr.length() + 5);
        newNameBuilder.append(oldSimpleNameStr).append("_").append(cnt);
        return new SimpleName(newNameBuilder.toString());
    }

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
