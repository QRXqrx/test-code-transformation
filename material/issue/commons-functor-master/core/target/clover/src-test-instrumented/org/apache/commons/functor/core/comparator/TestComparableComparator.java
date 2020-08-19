/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.functor.core.comparator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestComparableComparator {

    static class __CLR4_4_15w45w4kcq4susu {

        public static com_atlassian_clover.CoverageRecorder R;

        public static com_atlassian_clover.CloverProfile[] profiles = {};

        @java.lang.SuppressWarnings("unchecked")
        public static <I, T extends I> I lambdaInc(final int i, final T l, final int si) {
            java.lang.reflect.InvocationHandler h = new java.lang.reflect.InvocationHandler() {

                public java.lang.Object invoke(java.lang.Object p, java.lang.reflect.Method m, java.lang.Object[] a) throws Throwable {
                    R.inc(i);
                    R.inc(si);
                    try {
                        return m.invoke(l, a);
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        throw e.getCause() != null ? e.getCause() : new RuntimeException("Clover failed to invoke instrumented lambda", e);
                    }
                }
            };
            return (I) java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(), l.getClass().getInterfaces(), h);
        }

        static {
            com_atlassian_clover.CoverageRecorder _R = null;
            try {
                com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();
                if (2019101123313948L != com_atlassian_clover.CloverVersionInfo.getBuildStamp()) {
                    com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");
                    com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime=" + com_atlassian_clover.CloverVersionInfo.getReleaseNum() + "#" + com_atlassian_clover.CloverVersionInfo.getBuildStamp());
                }
                R = com_atlassian_clover.Clover.getNullRecorder();
                _R = com_atlassian_clover.Clover.getNullRecorder();
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 7648, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
            } catch (java.lang.SecurityException e) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. (" + e.getClass() + ":" + e.getMessage() + ")");
            } catch (java.lang.NoClassDefFoundError e) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? (" + e.getClass() + ":" + e.getMessage() + ")");
            } catch (java.lang.Throwable t) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. (" + t.getClass() + ":" + t.getMessage() + ")");
            }
            R = _R;
        }
    }

    public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER = com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testCompareIntegers() {
        __CLR4_4_15w45w4kcq4susu.R.globalSliceStart(getClass().getName(), 7636);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_182p3rj5w4();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15w45w4kcq4susu.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15w45w4kcq4susu.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.comparator.TestComparableComparator.testCompareIntegers", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7636, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_182p3rj5w4() {
        try {
            __CLR4_4_15w45w4kcq4susu.R.inc(7636);
            __CLR4_4_15w45w4kcq4susu.R.inc(7637);
            assertTrue(ComparableComparator.<Integer>instance().compare(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(Integer.MIN_VALUE)) == 0);
            __CLR4_4_15w45w4kcq4susu.R.inc(7638);
            assertTrue(ComparableComparator.<Integer>instance().compare(Integer.valueOf(-1), Integer.valueOf(-1)) == 0);
            __CLR4_4_15w45w4kcq4susu.R.inc(7639);
            assertTrue(ComparableComparator.<Integer>instance().compare(Integer.valueOf(0), Integer.valueOf(0)) == 0);
            __CLR4_4_15w45w4kcq4susu.R.inc(7640);
            assertTrue(ComparableComparator.<Integer>instance().compare(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE)) == 0);
            __CLR4_4_15w45w4kcq4susu.R.inc(7641);
            assertTrue(ComparableComparator.<Integer>instance().compare(Integer.valueOf(1), Integer.valueOf(1)) == 0);
        } finally {
            __CLR4_4_15w45w4kcq4susu.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testCompareNull() {
        __CLR4_4_15w45w4kcq4susu.R.globalSliceStart(getClass().getName(), 7642);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1akxmox5wa();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 67, 111, 109, 112, 97, 114, 101, 78, 117, 108, 108, 58, 32, 91, 78, 117, 108, 108, 80, 111, 105, 110, 116, 101, 114, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_t2$ instanceof NullPointerException) {
                $CLV_p$ = 1;
                $CLV_t$ = null;
            } else {
                $CLV_p$ = 0;
                $CLV_t$ = $CLV_t2$;
            }
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15w45w4kcq4susu.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15w45w4kcq4susu.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.comparator.TestComparableComparator.testCompareNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7642, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1akxmox5wa() {
        try {
            __CLR4_4_15w45w4kcq4susu.R.inc(7642);
            __CLR4_4_15w45w4kcq4susu.R.inc(7643);
            ComparableComparator.<Integer>instance().compare(null, Integer.valueOf(2));
        } finally {
            __CLR4_4_15w45w4kcq4susu.R.flushNeeded();
        }
    }

    @Test
    public void testEqualsAndHashCode() {
        __CLR4_4_15w45w4kcq4susu.R.globalSliceStart(getClass().getName(), 7644);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1o4n4w85wc();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15w45w4kcq4susu.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15w45w4kcq4susu.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.comparator.TestComparableComparator.testEqualsAndHashCode", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7644, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1o4n4w85wc() {
        try {
            __CLR4_4_15w45w4kcq4susu.R.inc(7644);
            __CLR4_4_15w45w4kcq4susu.R.inc(7645);
            assertEquals(new ComparableComparator<Integer>(), new ComparableComparator<Integer>());
            __CLR4_4_15w45w4kcq4susu.R.inc(7646);
            assertEquals(new ComparableComparator<Integer>().hashCode(), new ComparableComparator<Integer>().hashCode());
            __CLR4_4_15w45w4kcq4susu.R.inc(7647);
            assertTrue(!new ComparableComparator<Integer>().equals(null));
        } finally {
            __CLR4_4_15w45w4kcq4susu.R.flushNeeded();
        }
    }
}

