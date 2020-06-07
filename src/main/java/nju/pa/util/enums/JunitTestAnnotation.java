package nju.pa.util.enums;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This enum limit operations about junit test annotation.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-04-22
 */
public enum JunitTestAnnotation {

    TEST("Test"),
    SIMPLE_TEST("Test"),

    ORG_JUNIT_JUPITER_API_TEST("org.junit.jupiter.api.Test"),
    JUNIT5_TEST("org.junit.jupiter.api.Test"),

    ORG_JUNIT_TEST("org.junit.Test"),
    JUNIT4_TEST("org.junit.Test");

    private final String annoName;

    JunitTestAnnotation(String annoName) {
        this.annoName = annoName;
    }

    /**
     * Judge whether a string represent a Junit Test Annotation
     *
     * @param name a string
     * @return Judgment result
     */
    public static boolean isJunitTestAnnotation(String name) {
        JunitTestAnnotation[] values = JunitTestAnnotation.values();
        return Stream.of(values)
                .map(JunitTestAnnotation::getAnnoName)
                .collect(Collectors.toList())
                .contains(name);
    }

    public String getAnnoName() {
        return annoName;
    }
}
