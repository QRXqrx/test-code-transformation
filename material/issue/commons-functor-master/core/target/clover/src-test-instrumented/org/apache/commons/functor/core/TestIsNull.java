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
package org.apache.commons.functor.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Predicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIsNull extends BaseFunctorTest {

    static class __CLR4_4_152y52ykcq4suk7 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 6606, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        try {
            __CLR4_4_152y52ykcq4suk7.R.inc(6586);
            __CLR4_4_152y52ykcq4suk7.R.inc(6587);
            return new IsNull<Object>();
        } finally {
            __CLR4_4_152y52ykcq4suk7.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testTest() throws Exception {
        __CLR4_4_152y52ykcq4suk7.R.globalSliceStart(getClass().getName(), 6588);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1447pqj530();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_152y52ykcq4suk7.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_152y52ykcq4suk7.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestIsNull.testTest", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6588, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1447pqj530() throws Exception {
        try {
            __CLR4_4_152y52ykcq4suk7.R.inc(6588);
            __CLR4_4_152y52ykcq4suk7.R.inc(6589);
            Predicate<Object> p = new IsNull<Object>();
            __CLR4_4_152y52ykcq4suk7.R.inc(6590);
            assertTrue(p.test(null));
            __CLR4_4_152y52ykcq4suk7.R.inc(6591);
            assertFalse(p.test("foo"));
            __CLR4_4_152y52ykcq4suk7.R.inc(6592);
            assertFalse(p.test(Integer.valueOf(3)));
        } finally {
            __CLR4_4_152y52ykcq4suk7.R.flushNeeded();
        }
    }

    @Test
    public void testAsBinary() throws Exception {
        __CLR4_4_152y52ykcq4suk7.R.globalSliceStart(getClass().getName(), 6593);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1aq0i50535();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_152y52ykcq4suk7.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_152y52ykcq4suk7.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestIsNull.testAsBinary", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6593, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1aq0i50535() throws Exception {
        try {
            __CLR4_4_152y52ykcq4suk7.R.inc(6593);
            __CLR4_4_152y52ykcq4suk7.R.inc(6594);
            assertTrue(IsNull.left().test(null, "not null"));
            __CLR4_4_152y52ykcq4suk7.R.inc(6595);
            assertFalse(IsNull.left().test("not null", null));
            __CLR4_4_152y52ykcq4suk7.R.inc(6596);
            assertTrue(IsNull.right().test("not null", null));
            __CLR4_4_152y52ykcq4suk7.R.inc(6597);
            assertFalse(IsNull.right().test(null, "not null"));
        } finally {
            __CLR4_4_152y52ykcq4suk7.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_152y52ykcq4suk7.R.globalSliceStart(getClass().getName(), 6598);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e60853a();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_152y52ykcq4suk7.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_152y52ykcq4suk7.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestIsNull.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6598, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e60853a() throws Exception {
        try {
            __CLR4_4_152y52ykcq4suk7.R.inc(6598);
            __CLR4_4_152y52ykcq4suk7.R.inc(6599);
            Predicate<Object> p = new IsNull<Object>();
            __CLR4_4_152y52ykcq4suk7.R.inc(6600);
            assertEquals(p, p);
            __CLR4_4_152y52ykcq4suk7.R.inc(6601);
            assertObjectsAreEqual(p, new IsNull<Object>());
            __CLR4_4_152y52ykcq4suk7.R.inc(6602);
            assertObjectsAreEqual(p, IsNull.instance());
            __CLR4_4_152y52ykcq4suk7.R.inc(6603);
            assertObjectsAreNotEqual(p, Constant.TRUE);
        } finally {
            __CLR4_4_152y52ykcq4suk7.R.flushNeeded();
        }
    }

    @Test
    public void testConstant() throws Exception {
        __CLR4_4_152y52ykcq4suk7.R.globalSliceStart(getClass().getName(), 6604);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1159o9v53g();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_152y52ykcq4suk7.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_152y52ykcq4suk7.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestIsNull.testConstant", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6604, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1159o9v53g() throws Exception {
        try {
            __CLR4_4_152y52ykcq4suk7.R.inc(6604);
            __CLR4_4_152y52ykcq4suk7.R.inc(6605);
            assertEquals(IsNull.instance(), IsNull.instance());
        } finally {
            __CLR4_4_152y52ykcq4suk7.R.flushNeeded();
        }
    }
}

