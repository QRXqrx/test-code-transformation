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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Predicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIsEqual extends BaseFunctorTest {

    static class __CLR4_4_14za4zakcq4suiu {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 6483, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_14za4zakcq4suiu.R.inc(6454);
            __CLR4_4_14za4zakcq4suiu.R.inc(6455);
            return new IsEqual<Object, Object>();
        } finally {
            __CLR4_4_14za4zakcq4suiu.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testTest() throws Exception {
        __CLR4_4_14za4zakcq4suiu.R.globalSliceStart(getClass().getName(), 6456);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1447pqj4zc();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14za4zakcq4suiu.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14za4zakcq4suiu.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestIsEqual.testTest", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6456, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1447pqj4zc() throws Exception {
        try {
            __CLR4_4_14za4zakcq4suiu.R.inc(6456);
            __CLR4_4_14za4zakcq4suiu.R.inc(6457);
            IsEqual<Object, Object> p = new IsEqual<Object, Object>();
            __CLR4_4_14za4zakcq4suiu.R.inc(6458);
            assertTrue("For symmetry, two nulls should be equal", p.test(null, null));
            __CLR4_4_14za4zakcq4suiu.R.inc(6459);
            assertTrue(p.test("foo", "foo"));
            __CLR4_4_14za4zakcq4suiu.R.inc(6460);
            assertFalse(p.test(null, "foo"));
            __CLR4_4_14za4zakcq4suiu.R.inc(6461);
            assertFalse(p.test("foo", null));
            __CLR4_4_14za4zakcq4suiu.R.inc(6462);
            assertTrue(p.test(Integer.valueOf(3), Integer.valueOf(3)));
            __CLR4_4_14za4zakcq4suiu.R.inc(6463);
            assertFalse(p.test(null, Integer.valueOf(3)));
            __CLR4_4_14za4zakcq4suiu.R.inc(6464);
            assertFalse(p.test(Integer.valueOf(3), null));
            __CLR4_4_14za4zakcq4suiu.R.inc(6465);
            assertFalse(p.test(Integer.valueOf(3), Integer.valueOf(4)));
            __CLR4_4_14za4zakcq4suiu.R.inc(6466);
            assertFalse(p.test(Integer.valueOf(4), Integer.valueOf(3)));
            __CLR4_4_14za4zakcq4suiu.R.inc(6467);
            assertFalse(p.test("3", Integer.valueOf(3)));
            __CLR4_4_14za4zakcq4suiu.R.inc(6468);
            assertFalse(p.test(Integer.valueOf(3), "3"));
        } finally {
            __CLR4_4_14za4zakcq4suiu.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_14za4zakcq4suiu.R.globalSliceStart(getClass().getName(), 6469);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6084zp();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14za4zakcq4suiu.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14za4zakcq4suiu.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestIsEqual.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6469, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6084zp() throws Exception {
        try {
            __CLR4_4_14za4zakcq4suiu.R.inc(6469);
            __CLR4_4_14za4zakcq4suiu.R.inc(6470);
            BinaryPredicate<Object, Object> f = new IsEqual<Object, Object>();
            __CLR4_4_14za4zakcq4suiu.R.inc(6471);
            assertEquals(f, f);
            __CLR4_4_14za4zakcq4suiu.R.inc(6472);
            assertObjectsAreEqual(f, new IsEqual<Object, Object>());
            __CLR4_4_14za4zakcq4suiu.R.inc(6473);
            assertObjectsAreEqual(f, IsEqual.instance());
            __CLR4_4_14za4zakcq4suiu.R.inc(6474);
            assertObjectsAreNotEqual(f, Constant.truePredicate());
        } finally {
            __CLR4_4_14za4zakcq4suiu.R.flushNeeded();
        }
    }

    @Test
    public void testConstant() throws Exception {
        __CLR4_4_14za4zakcq4suiu.R.globalSliceStart(getClass().getName(), 6475);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1159o9v4zv();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14za4zakcq4suiu.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14za4zakcq4suiu.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestIsEqual.testConstant", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6475, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1159o9v4zv() throws Exception {
        try {
            __CLR4_4_14za4zakcq4suiu.R.inc(6475);
            __CLR4_4_14za4zakcq4suiu.R.inc(6476);
            assertEquals(IsEqual.instance(), IsEqual.instance());
            __CLR4_4_14za4zakcq4suiu.R.inc(6477);
            assertNotSame(IsEqual.instance(), IsEqual.instance());
            __CLR4_4_14za4zakcq4suiu.R.inc(6478);
            assertSame(IsEqual.INSTANCE, IsEqual.INSTANCE);
        } finally {
            __CLR4_4_14za4zakcq4suiu.R.flushNeeded();
        }
    }

    @Test
    public void testToPredicate() {
        __CLR4_4_14za4zakcq4suiu.R.globalSliceStart(getClass().getName(), 6479);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1n9ef0x4zz();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14za4zakcq4suiu.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14za4zakcq4suiu.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestIsEqual.testToPredicate", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6479, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1n9ef0x4zz() {
        try {
            __CLR4_4_14za4zakcq4suiu.R.inc(6479);
            __CLR4_4_14za4zakcq4suiu.R.inc(6480);
            Predicate<Integer> isEqual = IsEqual.to(Integer.valueOf(1));
            __CLR4_4_14za4zakcq4suiu.R.inc(6481);
            assertTrue(isEqual.test(Integer.valueOf(1)));
            __CLR4_4_14za4zakcq4suiu.R.inc(6482);
            assertFalse(isEqual.test(Integer.valueOf(2)));
        } finally {
            __CLR4_4_14za4zakcq4suiu.R.flushNeeded();
        }
    }
}

