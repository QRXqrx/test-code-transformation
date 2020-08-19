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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIsEmpty extends BaseFunctorTest {

    static class __CLR4_4_15qm5qmkcq4suri {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 7476, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_15qm5qmkcq4suri.R.inc(7438);
            __CLR4_4_15qm5qmkcq4suri.R.inc(7439);
            return new IsEmpty<Object>();
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testTest() throws Exception {
        __CLR4_4_15qm5qmkcq4suri.R.globalSliceStart(getClass().getName(), 7440);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1447pqj5qo();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15qm5qmkcq4suri.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsEmpty.testTest", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7440, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1447pqj5qo() throws Exception {
        try {
            __CLR4_4_15qm5qmkcq4suri.R.inc(7440);
            __CLR4_4_15qm5qmkcq4suri.R.inc(7441);
            assertTrue(IsEmpty.instance().test(Collections.EMPTY_LIST));
            __CLR4_4_15qm5qmkcq4suri.R.inc(7442);
            assertTrue(IsEmpty.instance().test(Collections.EMPTY_SET));
            {
                __CLR4_4_15qm5qmkcq4suri.R.inc(7443);
                List<String> list = new ArrayList<String>();
                __CLR4_4_15qm5qmkcq4suri.R.inc(7444);
                assertTrue(IsEmpty.instance().test(list));
                __CLR4_4_15qm5qmkcq4suri.R.inc(7445);
                list.add("Xyzzy");
                __CLR4_4_15qm5qmkcq4suri.R.inc(7446);
                assertTrue(!IsEmpty.instance().test(list));
            }
            {
                __CLR4_4_15qm5qmkcq4suri.R.inc(7447);
                Set<String> set = new HashSet<String>();
                __CLR4_4_15qm5qmkcq4suri.R.inc(7448);
                assertTrue(IsEmpty.instance().test(set));
                __CLR4_4_15qm5qmkcq4suri.R.inc(7449);
                set.add("Xyzzy");
                __CLR4_4_15qm5qmkcq4suri.R.inc(7450);
                assertTrue(!IsEmpty.instance().test(set));
            }
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testTestNull() throws Exception {
        __CLR4_4_15qm5qmkcq4suri.R.globalSliceStart(getClass().getName(), 7451);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1sipfpu5qz();
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
            __CLR4_4_15qm5qmkcq4suri.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsEmpty.testTestNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7451, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1sipfpu5qz() throws Exception {
        try {
            __CLR4_4_15qm5qmkcq4suri.R.inc(7451);
            __CLR4_4_15qm5qmkcq4suri.R.inc(7452);
            IsEmpty.instance().test(null);
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.flushNeeded();
        }
    }

    @Test
    public void testTestNonCollection() throws Exception {
        __CLR4_4_15qm5qmkcq4suri.R.globalSliceStart(getClass().getName(), 7453);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_14m77wu5r1();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15qm5qmkcq4suri.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsEmpty.testTestNonCollection", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7453, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_14m77wu5r1() throws Exception {
        try {
            __CLR4_4_15qm5qmkcq4suri.R.inc(7453);
            __CLR4_4_15qm5qmkcq4suri.R.inc(7454);
            try {
                __CLR4_4_15qm5qmkcq4suri.R.inc(7455);
                IsEmpty.instance().test(Integer.valueOf(3));
                __CLR4_4_15qm5qmkcq4suri.R.inc(7456);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.flushNeeded();
        }
    }

    @Test
    public void testTestArray() throws Exception {
        __CLR4_4_15qm5qmkcq4suri.R.globalSliceStart(getClass().getName(), 7457);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1fmekf85r5();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15qm5qmkcq4suri.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsEmpty.testTestArray", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7457, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1fmekf85r5() throws Exception {
        try {
            __CLR4_4_15qm5qmkcq4suri.R.inc(7457);
            __CLR4_4_15qm5qmkcq4suri.R.inc(7458);
            assertTrue(!IsEmpty.instance().test(new int[10]));
            __CLR4_4_15qm5qmkcq4suri.R.inc(7459);
            assertTrue(!IsEmpty.instance().test(new Object[10]));
            __CLR4_4_15qm5qmkcq4suri.R.inc(7460);
            assertTrue(IsEmpty.instance().test(new int[0]));
            __CLR4_4_15qm5qmkcq4suri.R.inc(7461);
            assertTrue(IsEmpty.instance().test(new Object[0]));
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.flushNeeded();
        }
    }

    @Test
    public void testTestString() throws Exception {
        __CLR4_4_15qm5qmkcq4suri.R.globalSliceStart(getClass().getName(), 7462);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1k68roc5ra();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15qm5qmkcq4suri.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsEmpty.testTestString", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7462, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1k68roc5ra() throws Exception {
        try {
            __CLR4_4_15qm5qmkcq4suri.R.inc(7462);
            __CLR4_4_15qm5qmkcq4suri.R.inc(7463);
            assertTrue(!IsEmpty.instance().test("xyzzy"));
            __CLR4_4_15qm5qmkcq4suri.R.inc(7464);
            assertTrue(IsEmpty.instance().test(""));
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.flushNeeded();
        }
    }

    @Test
    public void testTestMap() throws Exception {
        __CLR4_4_15qm5qmkcq4suri.R.globalSliceStart(getClass().getName(), 7465);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1qouce95rd();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15qm5qmkcq4suri.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsEmpty.testTestMap", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7465, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1qouce95rd() throws Exception {
        try {
            __CLR4_4_15qm5qmkcq4suri.R.inc(7465);
            __CLR4_4_15qm5qmkcq4suri.R.inc(7466);
            Map<String, String> map = new HashMap<String, String>();
            __CLR4_4_15qm5qmkcq4suri.R.inc(7467);
            assertTrue(IsEmpty.instance().test(map));
            __CLR4_4_15qm5qmkcq4suri.R.inc(7468);
            map.put("x", "y");
            __CLR4_4_15qm5qmkcq4suri.R.inc(7469);
            assertTrue(!IsEmpty.instance().test(map));
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_15qm5qmkcq4suri.R.globalSliceStart(getClass().getName(), 7470);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6085ri();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15qm5qmkcq4suri.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestIsEmpty.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7470, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6085ri() throws Exception {
        try {
            __CLR4_4_15qm5qmkcq4suri.R.inc(7470);
            __CLR4_4_15qm5qmkcq4suri.R.inc(7471);
            Predicate<String> p = new IsEmpty<String>();
            __CLR4_4_15qm5qmkcq4suri.R.inc(7472);
            assertEquals(p, p);
            __CLR4_4_15qm5qmkcq4suri.R.inc(7473);
            assertObjectsAreEqual(p, new IsEmpty<Long>());
            __CLR4_4_15qm5qmkcq4suri.R.inc(7474);
            assertObjectsAreEqual(p, IsEmpty.instance());
            __CLR4_4_15qm5qmkcq4suri.R.inc(7475);
            assertObjectsAreNotEqual(p, new Constant<Boolean>(Boolean.TRUE));
        } finally {
            __CLR4_4_15qm5qmkcq4suri.R.flushNeeded();
        }
    }
}

