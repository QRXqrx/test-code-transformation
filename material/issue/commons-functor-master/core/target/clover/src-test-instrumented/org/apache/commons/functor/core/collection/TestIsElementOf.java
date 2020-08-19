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
package org.apache.commons.functor.core.collection;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIsElementOf extends BaseFunctorTest {

    static class __CLR4_4_15pc5pckcq4sur8 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 7438, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_15pc5pckcq4sur8.R.inc(7392);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7393);
            return new IsElementOf<Integer, Collection<Integer>>();
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testTestCollection() throws Exception {
        __CLR4_4_15pc5pckcq4sur8.R.globalSliceStart(getClass().getName(), 7394);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_15c0d1l5pe();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15pc5pckcq4sur8.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsElementOf.testTestCollection", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7394, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_15c0d1l5pe() throws Exception {
        try {
            __CLR4_4_15pc5pckcq4sur8.R.inc(7394);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7395);
            List<Integer> list = new ArrayList<Integer>();
            __CLR4_4_15pc5pckcq4sur8.R.inc(7396);
            list.add(Integer.valueOf(5));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7397);
            list.add(Integer.valueOf(10));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7398);
            list.add(Integer.valueOf(15));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7399);
            Predicate<Integer> p = IsElementOf.instance(list);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7400);
            assertTrue(p.test(Integer.valueOf(5)));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7401);
            assertTrue(p.test(Integer.valueOf(10)));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7402);
            assertTrue(p.test(Integer.valueOf(15)));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7403);
            assertTrue(!p.test(Integer.valueOf(4)));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7404);
            assertTrue(!p.test(Integer.valueOf(11)));
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.flushNeeded();
        }
    }

    @Test
    public void testTestArray() throws Exception {
        __CLR4_4_15pc5pckcq4sur8.R.globalSliceStart(getClass().getName(), 7405);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1fmekf85pp();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15pc5pckcq4sur8.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsElementOf.testTestArray", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7405, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1fmekf85pp() throws Exception {
        try {
            __CLR4_4_15pc5pckcq4sur8.R.inc(7405);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7406);
            int[] list = new int[] { 5, 10, 15 };
            __CLR4_4_15pc5pckcq4sur8.R.inc(7407);
            Predicate<Integer> p = IsElementOf.instance(list);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7408);
            assertTrue(p.test(Integer.valueOf(5)));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7409);
            assertTrue(p.test(Integer.valueOf(10)));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7410);
            assertTrue(p.test(Integer.valueOf(15)));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7411);
            assertTrue(!p.test(Integer.valueOf(4)));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7412);
            assertTrue(!p.test(Integer.valueOf(11)));
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.flushNeeded();
        }
    }

    @Test
    public void testTestArrayWithNull() throws Exception {
        __CLR4_4_15pc5pckcq4sur8.R.globalSliceStart(getClass().getName(), 7413);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1qa6mev5px();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15pc5pckcq4sur8.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsElementOf.testTestArrayWithNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7413, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1qa6mev5px() throws Exception {
        try {
            __CLR4_4_15pc5pckcq4sur8.R.inc(7413);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7414);
            assertTrue(!IsElementOf.instance().test(null, new int[] { 5, 10, 15 }));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7415);
            assertTrue(IsElementOf.instance().test(null, new Integer[] { Integer.valueOf(5), null, Integer.valueOf(15) }));
            __CLR4_4_15pc5pckcq4sur8.R.inc(7416);
            assertTrue(IsElementOf.instance().test(Integer.valueOf(15), new Integer[] { Integer.valueOf(5), null, Integer.valueOf(15) }));
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.flushNeeded();
        }
    }

    @Test
    public void testWrapNull() {
        __CLR4_4_15pc5pckcq4sur8.R.globalSliceStart(getClass().getName(), 7417);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1aqqv065q1();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15pc5pckcq4sur8.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsElementOf.testWrapNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7417, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1aqqv065q1() {
        try {
            __CLR4_4_15pc5pckcq4sur8.R.inc(7417);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7418);
            try {
                __CLR4_4_15pc5pckcq4sur8.R.inc(7419);
                IsElementOf.instance(null);
                __CLR4_4_15pc5pckcq4sur8.R.inc(7420);
                fail("expected NullPointerException");
            } catch (NullPointerException e) {
            // expected
            }
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.flushNeeded();
        }
    }

    @Test
    public void testWrapNonCollection() {
        __CLR4_4_15pc5pckcq4sur8.R.globalSliceStart(getClass().getName(), 7421);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1eumu525q5();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15pc5pckcq4sur8.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsElementOf.testWrapNonCollection", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7421, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1eumu525q5() {
        try {
            __CLR4_4_15pc5pckcq4sur8.R.inc(7421);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7422);
            try {
                __CLR4_4_15pc5pckcq4sur8.R.inc(7423);
                IsElementOf.instance(Integer.valueOf(3));
                __CLR4_4_15pc5pckcq4sur8.R.inc(7424);
                fail("expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testTestNull() {
        __CLR4_4_15pc5pckcq4sur8.R.globalSliceStart(getClass().getName(), 7425);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1sipfpu5q9();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 84, 101, 115, 116, 78, 117, 108, 108, 58, 32, 91, 78, 117, 108, 108, 80, 111, 105, 110, 116, 101, 114, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
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
            __CLR4_4_15pc5pckcq4sur8.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsElementOf.testTestNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7425, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1sipfpu5q9() {
        try {
            __CLR4_4_15pc5pckcq4sur8.R.inc(7425);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7426);
            IsElementOf.instance().test(Integer.valueOf(5), null);
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.flushNeeded();
        }
    }

    @Test
    public void testTestNonCollection() {
        __CLR4_4_15pc5pckcq4sur8.R.globalSliceStart(getClass().getName(), 7427);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_14m77wu5qb();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15pc5pckcq4sur8.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsElementOf.testTestNonCollection", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7427, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_14m77wu5qb() {
        try {
            __CLR4_4_15pc5pckcq4sur8.R.inc(7427);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7428);
            try {
                __CLR4_4_15pc5pckcq4sur8.R.inc(7429);
                IsElementOf.instance().test(Integer.valueOf(5), Long.valueOf(5));
                __CLR4_4_15pc5pckcq4sur8.R.inc(7430);
                fail("expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_15pc5pckcq4sur8.R.globalSliceStart(getClass().getName(), 7431);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6085qf();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15pc5pckcq4sur8.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsElementOf.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7431, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6085qf() throws Exception {
        try {
            __CLR4_4_15pc5pckcq4sur8.R.inc(7431);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7432);
            IsElementOf<Integer, Collection<Integer>> p1 = new IsElementOf<Integer, Collection<Integer>>();
            __CLR4_4_15pc5pckcq4sur8.R.inc(7433);
            assertObjectsAreEqual(p1, p1);
            __CLR4_4_15pc5pckcq4sur8.R.inc(7434);
            assertObjectsAreEqual(p1, new IsElementOf<Integer, Collection<Integer>>());
            __CLR4_4_15pc5pckcq4sur8.R.inc(7435);
            assertObjectsAreEqual(p1, IsElementOf.instance());
            __CLR4_4_15pc5pckcq4sur8.R.inc(7436);
            assertSame(IsElementOf.instance(), IsElementOf.instance());
            __CLR4_4_15pc5pckcq4sur8.R.inc(7437);
            assertObjectsAreNotEqual(p1, Constant.falsePredicate());
        } finally {
            __CLR4_4_15pc5pckcq4sur8.R.flushNeeded();
        }
    }
}

