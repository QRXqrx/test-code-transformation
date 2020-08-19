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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.Predicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestOffset extends BaseFunctorTest {

    static class __CLR4_4_1571571kcq4sull {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 6767, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_1571571kcq4sull.R.inc(6733);
            __CLR4_4_1571571kcq4sull.R.inc(6734);
            return new Offset(3);
        } finally {
            __CLR4_4_1571571kcq4sull.R.flushNeeded();
        }
    }

    // Lifecycle
    // ------------------------------------------------------------------------
    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testZero() throws Exception {
        __CLR4_4_1571571kcq4sull.R.globalSliceStart(getClass().getName(), 6735);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1cqj5i7573();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1571571kcq4sull.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1571571kcq4sull.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestOffset.testZero", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6735, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1cqj5i7573() throws Exception {
        try {
            __CLR4_4_1571571kcq4sull.R.inc(6735);
            __CLR4_4_1571571kcq4sull.R.inc(6736);
            NullaryPredicate p = new Offset(0);
            __CLR4_4_1571571kcq4sull.R.inc(6737);
            assertTrue(p.test());
            __CLR4_4_1571571kcq4sull.R.inc(6738);
            assertTrue(p.test());
            __CLR4_4_1571571kcq4sull.R.inc(6739);
            assertTrue(p.test());
        } finally {
            __CLR4_4_1571571kcq4sull.R.flushNeeded();
        }
    }

    @Test
    public void testBadArgs() throws Exception {
        __CLR4_4_1571571kcq4sull.R.globalSliceStart(getClass().getName(), 6740);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ceflqv578();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1571571kcq4sull.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1571571kcq4sull.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestOffset.testBadArgs", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6740, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ceflqv578() throws Exception {
        try {
            __CLR4_4_1571571kcq4sull.R.inc(6740);
            __CLR4_4_1571571kcq4sull.R.inc(6741);
            try {
                __CLR4_4_1571571kcq4sull.R.inc(6742);
                new Offset(-1);
                __CLR4_4_1571571kcq4sull.R.inc(6743);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
        } finally {
            __CLR4_4_1571571kcq4sull.R.flushNeeded();
        }
    }

    @Test
    public void testTestNullary() throws Exception {
        __CLR4_4_1571571kcq4sull.R.globalSliceStart(getClass().getName(), 6744);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ebdqv857c();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1571571kcq4sull.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1571571kcq4sull.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestOffset.testTestNullary", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6744, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ebdqv857c() throws Exception {
        try {
            __CLR4_4_1571571kcq4sull.R.inc(6744);
            __CLR4_4_1571571kcq4sull.R.inc(6745);
            NullaryPredicate p = new Offset(3);
            __CLR4_4_1571571kcq4sull.R.inc(6746);
            assertTrue(!p.test());
            __CLR4_4_1571571kcq4sull.R.inc(6747);
            assertTrue(!p.test());
            __CLR4_4_1571571kcq4sull.R.inc(6748);
            assertTrue(!p.test());
            __CLR4_4_1571571kcq4sull.R.inc(6749);
            assertTrue(p.test());
        } finally {
            __CLR4_4_1571571kcq4sull.R.flushNeeded();
        }
    }

    @Test
    public void testTestUnary() throws Exception {
        __CLR4_4_1571571kcq4sull.R.globalSliceStart(getClass().getName(), 6750);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1yeuzhu57i();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1571571kcq4sull.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1571571kcq4sull.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestOffset.testTestUnary", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6750, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1yeuzhu57i() throws Exception {
        try {
            __CLR4_4_1571571kcq4sull.R.inc(6750);
            __CLR4_4_1571571kcq4sull.R.inc(6751);
            Predicate<Object> p = new Offset(3);
            __CLR4_4_1571571kcq4sull.R.inc(6752);
            assertTrue(!p.test(null));
            __CLR4_4_1571571kcq4sull.R.inc(6753);
            assertTrue(!p.test(null));
            __CLR4_4_1571571kcq4sull.R.inc(6754);
            assertTrue(!p.test(null));
            __CLR4_4_1571571kcq4sull.R.inc(6755);
            assertTrue(p.test(null));
        } finally {
            __CLR4_4_1571571kcq4sull.R.flushNeeded();
        }
    }

    @Test
    public void testTestBinary() throws Exception {
        __CLR4_4_1571571kcq4sull.R.globalSliceStart(getClass().getName(), 6756);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1tvgumk57o();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1571571kcq4sull.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1571571kcq4sull.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestOffset.testTestBinary", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6756, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1tvgumk57o() throws Exception {
        try {
            __CLR4_4_1571571kcq4sull.R.inc(6756);
            __CLR4_4_1571571kcq4sull.R.inc(6757);
            BinaryPredicate<Object, Object> p = new Offset(3);
            __CLR4_4_1571571kcq4sull.R.inc(6758);
            assertTrue(!p.test(null, null));
            __CLR4_4_1571571kcq4sull.R.inc(6759);
            assertTrue(!p.test(null, null));
            __CLR4_4_1571571kcq4sull.R.inc(6760);
            assertTrue(!p.test(null, null));
            __CLR4_4_1571571kcq4sull.R.inc(6761);
            assertTrue(p.test(null, null));
        } finally {
            __CLR4_4_1571571kcq4sull.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() {
        __CLR4_4_1571571kcq4sull.R.globalSliceStart(getClass().getName(), 6762);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e60857u();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1571571kcq4sull.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1571571kcq4sull.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestOffset.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6762, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e60857u() {
        try {
            __CLR4_4_1571571kcq4sull.R.inc(6762);
            __CLR4_4_1571571kcq4sull.R.inc(6763);
            Offset offset = new Offset(1);
            __CLR4_4_1571571kcq4sull.R.inc(6764);
            assertObjectsAreEqual(new Offset(1), offset);
            __CLR4_4_1571571kcq4sull.R.inc(6765);
            assertObjectsAreNotEqual(new Offset(2), offset);
            __CLR4_4_1571571kcq4sull.R.inc(6766);
            assertTrue(!offset.equals(null));
        } finally {
            __CLR4_4_1571571kcq4sull.R.flushNeeded();
        }
    }
}

