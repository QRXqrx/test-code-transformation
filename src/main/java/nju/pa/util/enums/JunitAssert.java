package nju.pa.util.enums;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This enum limit operations about junit assert test(JAS) method.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-04-22
 */
public enum JunitAssert {

    ASSERT_ARRAY_EQUALS("assertArrayEquals"),

    ASSERT_EQUALS("assertEquals"),

    ASSERT_TRUE("assertTrue"),

    ASSERT_FALSE("assertFalse"),

    ASSERT_NOT_EQUALS("assertNotEquals"),

    ASSERT_NULL("assertNull"),

    // TODO: Support assertSame, assertThat...
    ASSERT_SAME("assertSame"), // assertSame is like assertThat

    ASSERT_NOT_SAME("assertNotSame"),

    ASSERT_THAT("assertThat"), // assertThat is not same with others.

    FAIL("fail"); // It seems that fail() needed processed, too.

    private final String MethodName;

    JunitAssert(String methodName) {
        MethodName = methodName;
    }

    public String getMethodName() {
        return MethodName;
    }

    /**
     * Whether a string represent a Junit Assert Method
     *
     * @param name A string
     * @return Judgment result
     */
    public static boolean isJunitAssert(String name) {
        JunitAssert[] values = JunitAssert.values();
        return Stream.of(values)
                     .map(JunitAssert::getMethodName)
                     .collect(Collectors.toList())
                     .contains(name);
    }

    /**
     * Whether a string line contains assert methods
     *
     * @param line A string represents a source line
     * @return Judgment result.
     */
    public static boolean hasJunitAssert(String line) {
        JunitAssert[] values = JunitAssert.values();
        List<String> assertNames = Stream.of(values)
                .map(JunitAssert::getMethodName)
                .collect(Collectors.toList());
        for (String assertName : assertNames) {
            if(line.contains(assertName)) {
                return true;
            }
        }
        return false;
    }

}
