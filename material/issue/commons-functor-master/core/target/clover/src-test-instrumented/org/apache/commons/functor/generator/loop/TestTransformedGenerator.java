/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.functor.generator.loop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.functor.generator.loop.TransformedGenerator;
import org.apache.commons.functor.range.IntegerRange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Transformed Generator class.
 * @version $Revision: 1508677 $ $Date: 2013-07-30 19:48:02 -0300 (Tue, 30 Jul 2013) $
 */
public class TestTransformedGenerator {

    static class __CLR4_4_18cc8cckcq4svom {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 10849, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    @Before
    public void setUp() throws Exception {
        try {
            __CLR4_4_18cc8cckcq4svom.R.inc(10812);
            __CLR4_4_18cc8cckcq4svom.R.inc(10813);
            wrappedGenerator = IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10));
            __CLR4_4_18cc8cckcq4svom.R.inc(10814);
            sumsTwoGenerator = new TransformedGenerator<Integer, Integer>(wrappedGenerator, sumsTwo);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
        }
    }

    @After
    public void tearDown() {
        try {
            __CLR4_4_18cc8cckcq4svom.R.inc(10815);
            __CLR4_4_18cc8cckcq4svom.R.inc(10816);
            wrappedGenerator = null;
            __CLR4_4_18cc8cckcq4svom.R.inc(10817);
            sumsTwo = null;
            __CLR4_4_18cc8cckcq4svom.R.inc(10818);
            sumsTwoGenerator = null;
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullWrappedGenerator() {
        __CLR4_4_18cc8cckcq4svom.R.globalSliceStart(getClass().getName(), 10819);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1npa22w8cj();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 67, 111, 110, 115, 116, 114, 117, 99, 116, 111, 114, 80, 114, 111, 104, 105, 98, 105, 116, 115, 78, 117, 108, 108, 87, 114, 97, 112, 112, 101, 100, 71, 101, 110, 101, 114, 97, 116, 111, 114, 58, 32, 91, 78, 117, 108, 108, 80, 111, 105, 110, 116, 101, 114, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
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
            __CLR4_4_18cc8cckcq4svom.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.generator.loop.TestTransformedGenerator.testConstructorProhibitsNullWrappedGenerator", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 10819, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1npa22w8cj() {
        try {
            __CLR4_4_18cc8cckcq4svom.R.inc(10819);
            __CLR4_4_18cc8cckcq4svom.R.inc(10820);
            new TransformedGenerator<Integer, Integer>(null, sumsTwo);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullFunction() {
        __CLR4_4_18cc8cckcq4svom.R.globalSliceStart(getClass().getName(), 10821);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1cpl9si8cl();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 67, 111, 110, 115, 116, 114, 117, 99, 116, 111, 114, 80, 114, 111, 104, 105, 98, 105, 116, 115, 78, 117, 108, 108, 70, 117, 110, 99, 116, 105, 111, 110, 58, 32, 91, 78, 117, 108, 108, 80, 111, 105, 110, 116, 101, 114, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
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
            __CLR4_4_18cc8cckcq4svom.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.generator.loop.TestTransformedGenerator.testConstructorProhibitsNullFunction", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 10821, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1cpl9si8cl() {
        try {
            __CLR4_4_18cc8cckcq4svom.R.inc(10821);
            __CLR4_4_18cc8cckcq4svom.R.inc(10822);
            new TransformedGenerator<Integer, Integer>(wrappedGenerator, null);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullWrappedGeneratorOrNullFunction() {
        __CLR4_4_18cc8cckcq4svom.R.globalSliceStart(getClass().getName(), 10823);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_19eptxy8cn();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 67, 111, 110, 115, 116, 114, 117, 99, 116, 111, 114, 80, 114, 111, 104, 105, 98, 105, 116, 115, 78, 117, 108, 108, 87, 114, 97, 112, 112, 101, 100, 71, 101, 110, 101, 114, 97, 116, 111, 114, 79, 114, 78, 117, 108, 108, 70, 117, 110, 99, 116, 105, 111, 110, 58, 32, 91, 78, 117, 108, 108, 80, 111, 105, 110, 116, 101, 114, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
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
            __CLR4_4_18cc8cckcq4svom.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.generator.loop.TestTransformedGenerator.testConstructorProhibitsNullWrappedGeneratorOrNullFunction", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 10823, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_19eptxy8cn() {
        try {
            __CLR4_4_18cc8cckcq4svom.R.inc(10823);
            __CLR4_4_18cc8cckcq4svom.R.inc(10824);
            new TransformedGenerator<Integer, Integer>(null, null);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() {
        __CLR4_4_18cc8cckcq4svom.R.globalSliceStart(getClass().getName(), 10825);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6088cp();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18cc8cckcq4svom.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.generator.loop.TestTransformedGenerator.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 10825, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6088cp() {
        try {
            __CLR4_4_18cc8cckcq4svom.R.inc(10825);
            __CLR4_4_18cc8cckcq4svom.R.inc(10826);
            TransformedGenerator<Integer, Integer> anotherTransformedGenerator = new TransformedGenerator<Integer, Integer>(wrappedGenerator, sumsTwo);
            __CLR4_4_18cc8cckcq4svom.R.inc(10827);
            assertEquals(sumsTwoGenerator, sumsTwoGenerator);
            __CLR4_4_18cc8cckcq4svom.R.inc(10828);
            assertEquals(sumsTwoGenerator, anotherTransformedGenerator);
            __CLR4_4_18cc8cckcq4svom.R.inc(10829);
            assertTrue(!sumsTwoGenerator.equals((TransformedGenerator<Integer, Integer>) null));
            __CLR4_4_18cc8cckcq4svom.R.inc(10830);
            TransformedGenerator<Integer, Integer> aGenerateWithADifferentFunction = new TransformedGenerator<Integer, Integer>(wrappedGenerator, new Function<Integer, Integer>() {

                public Integer evaluate(Integer obj) {
                    try {
                        __CLR4_4_18cc8cckcq4svom.R.inc(10831);
                        __CLR4_4_18cc8cckcq4svom.R.inc(10832);
                        return obj;
                    } finally {
                        __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
                    }
                }
            });
            __CLR4_4_18cc8cckcq4svom.R.inc(10833);
            assertTrue(!sumsTwoGenerator.equals(aGenerateWithADifferentFunction));
            __CLR4_4_18cc8cckcq4svom.R.inc(10834);
            TransformedGenerator<Integer, Integer> aTransformedGeneratorWithADifferentWrapped = new TransformedGenerator<Integer, Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 2)), sumsTwo);
            __CLR4_4_18cc8cckcq4svom.R.inc(10835);
            assertTrue(!sumsTwoGenerator.equals(aTransformedGeneratorWithADifferentWrapped));
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
        }
    }

    @Test
    public void testHashcode() {
        __CLR4_4_18cc8cckcq4svom.R.globalSliceStart(getClass().getName(), 10836);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1h790lw8d0();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18cc8cckcq4svom.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.generator.loop.TestTransformedGenerator.testHashcode", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 10836, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1h790lw8d0() {
        try {
            __CLR4_4_18cc8cckcq4svom.R.inc(10836);
            __CLR4_4_18cc8cckcq4svom.R.inc(10837);
            assertEquals(sumsTwoGenerator.hashCode(), sumsTwoGenerator.hashCode());
            __CLR4_4_18cc8cckcq4svom.R.inc(10838);
            assertEquals(sumsTwoGenerator.hashCode(), new TransformedGenerator<Integer, Integer>(wrappedGenerator, sumsTwo).hashCode());
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
        }
    }

    @Test
    public void testGenerate() {
        __CLR4_4_18cc8cckcq4svom.R.globalSliceStart(getClass().getName(), 10839);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1u8ovhu8d3();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18cc8cckcq4svom.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.generator.loop.TestTransformedGenerator.testGenerate", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 10839, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1u8ovhu8d3() {
        try {
            __CLR4_4_18cc8cckcq4svom.R.inc(10839);
            __CLR4_4_18cc8cckcq4svom.R.inc(10840);
            final List<Integer> doubledValues = new ArrayList<Integer>();
            __CLR4_4_18cc8cckcq4svom.R.inc(10841);
            sumsTwoGenerator.run(new Procedure<Integer>() {

                public void run(Integer obj) {
                    try {
                        __CLR4_4_18cc8cckcq4svom.R.inc(10842);
                        __CLR4_4_18cc8cckcq4svom.R.inc(10843);
                        doubledValues.add(obj);
                    } finally {
                        __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
                    }
                }
            });
            __CLR4_4_18cc8cckcq4svom.R.inc(10844);
            final List<Integer> expected = Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10, 11);
            __CLR4_4_18cc8cckcq4svom.R.inc(10845);
            assertEquals(9, doubledValues.size());
            __CLR4_4_18cc8cckcq4svom.R.inc(10846);
            assertEquals(expected, doubledValues);
        } finally {
            __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
        }
    }

    // Attributes
    // ------------------------------------------------------------------------
    private static final Integer TWO = Integer.valueOf(2);

    private Generator<Integer> wrappedGenerator = null;

    private Function<Integer, Integer> sumsTwo = new Function<Integer, Integer>() {

        public Integer evaluate(Integer obj) {
            try {
                __CLR4_4_18cc8cckcq4svom.R.inc(10847);
                __CLR4_4_18cc8cckcq4svom.R.inc(10848);
                return obj += TWO;
            } finally {
                __CLR4_4_18cc8cckcq4svom.R.flushNeeded();
            }
        }
    };

    private TransformedGenerator<Integer, Integer> sumsTwoGenerator = null;
}

