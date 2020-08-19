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
import static org.junit.Assert.assertFalse;
import java.util.Collections;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestMin extends BaseFunctorTest {

    static class __CLR4_4_1627627kcq4suwc {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 7875, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    // Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        try {
            __CLR4_4_1627627kcq4suwc.R.inc(7855);
            __CLR4_4_1627627kcq4suwc.R.inc(7856);
            return Min.instance();
        } finally {
            __CLR4_4_1627627kcq4suwc.R.flushNeeded();
        }
    }

    private Integer MIN = Integer.valueOf(Integer.MIN_VALUE);

    private Integer MINUS_TWO = Integer.valueOf(-2);

    private Integer ZERO = Integer.valueOf(0);

    private Integer ONE = Integer.valueOf(1);

    private Integer MAX = Integer.valueOf(Integer.MAX_VALUE);

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() {
        __CLR4_4_1627627kcq4suwc.R.globalSliceStart(getClass().getName(), 7857);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1czkatq629();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1627627kcq4suwc.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1627627kcq4suwc.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.comparator.TestMin.testEvaluate", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7857, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1czkatq629() {
        try {
            __CLR4_4_1627627kcq4suwc.R.inc(7857);
            __CLR4_4_1627627kcq4suwc.R.inc(7858);
            Min<Integer> f = Min.instance();
            __CLR4_4_1627627kcq4suwc.R.inc(7859);
            assertEquals(ONE, f.evaluate(ONE, ONE));
            __CLR4_4_1627627kcq4suwc.R.inc(7860);
            assertEquals(ZERO, f.evaluate(ZERO, ONE));
            __CLR4_4_1627627kcq4suwc.R.inc(7861);
            assertEquals(ZERO, f.evaluate(ONE, ZERO));
            __CLR4_4_1627627kcq4suwc.R.inc(7862);
            assertEquals(ONE, f.evaluate(ONE, MAX));
            __CLR4_4_1627627kcq4suwc.R.inc(7863);
            assertEquals(MIN, f.evaluate(MIN, MAX));
            __CLR4_4_1627627kcq4suwc.R.inc(7864);
            assertEquals(MIN, f.evaluate(MIN, MINUS_TWO));
        } finally {
            __CLR4_4_1627627kcq4suwc.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() {
        __CLR4_4_1627627kcq4suwc.R.globalSliceStart(getClass().getName(), 7865);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e60862h();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1627627kcq4suwc.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1627627kcq4suwc.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.comparator.TestMin.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7865, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e60862h() {
        try {
            __CLR4_4_1627627kcq4suwc.R.inc(7865);
            __CLR4_4_1627627kcq4suwc.R.inc(7866);
            Min<Comparable<?>> f = Min.instance();
            __CLR4_4_1627627kcq4suwc.R.inc(7867);
            assertObjectsAreEqual(f, f);
            __CLR4_4_1627627kcq4suwc.R.inc(7868);
            assertObjectsAreEqual(f, Min.instance());
            __CLR4_4_1627627kcq4suwc.R.inc(7869);
            assertObjectsAreEqual(f, new Min<Integer>(ComparableComparator.<Integer>instance()));
            __CLR4_4_1627627kcq4suwc.R.inc(7870);
            assertObjectsAreNotEqual(f, new Min<Comparable<?>>(Collections.<Comparable<?>>reverseOrder()));
            __CLR4_4_1627627kcq4suwc.R.inc(7871);
            assertFalse(f.equals(null));
        } finally {
            __CLR4_4_1627627kcq4suwc.R.flushNeeded();
        }
    }

    @Test
    public void testFunctionMin() {
        __CLR4_4_1627627kcq4suwc.R.globalSliceStart(getClass().getName(), 7872);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1gx6te962o();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1627627kcq4suwc.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1627627kcq4suwc.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.comparator.TestMin.testFunctionMin", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7872, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1gx6te962o() {
        try {
            __CLR4_4_1627627kcq4suwc.R.inc(7872);
            __CLR4_4_1627627kcq4suwc.R.inc(7873);
            Function<Integer, Integer> min = Min.instance(ONE);
            __CLR4_4_1627627kcq4suwc.R.inc(7874);
            assertEquals(ZERO, min.evaluate(ZERO));
        } finally {
            __CLR4_4_1627627kcq4suwc.R.flushNeeded();
        }
    }
}

