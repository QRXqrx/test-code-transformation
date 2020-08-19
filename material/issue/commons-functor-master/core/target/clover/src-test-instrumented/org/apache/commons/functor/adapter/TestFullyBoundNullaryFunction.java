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
package org.apache.commons.functor.adapter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.LeftIdentity;
import org.apache.commons.functor.core.RightIdentity;
import org.junit.Test;

/**
 * @version $Revision: 1365377 $ $Date: 2012-07-24 21:59:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestFullyBoundNullaryFunction extends BaseFunctorTest {

    static class __CLR4_4_13sh3shkcq4su84 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 4937, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_13sh3shkcq4su84.R.inc(4913);
            __CLR4_4_13sh3shkcq4su84.R.inc(4914);
            return new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, null, "xyzzy");
        } finally {
            __CLR4_4_13sh3shkcq4su84.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() throws Exception {
        __CLR4_4_13sh3shkcq4su84.R.globalSliceStart(getClass().getName(), 4915);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1czkatq3sj();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_13sh3shkcq4su84.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_13sh3shkcq4su84.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.adapter.TestFullyBoundNullaryFunction.testEvaluate", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 4915, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1czkatq3sj() throws Exception {
        try {
            __CLR4_4_13sh3shkcq4su84.R.inc(4915);
            __CLR4_4_13sh3shkcq4su84.R.inc(4916);
            NullaryFunction<Object> f = new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, null, "foo");
            __CLR4_4_13sh3shkcq4su84.R.inc(4917);
            assertEquals("foo", f.evaluate());
        } finally {
            __CLR4_4_13sh3shkcq4su84.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_13sh3shkcq4su84.R.globalSliceStart(getClass().getName(), 4918);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6083sm();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_13sh3shkcq4su84.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_13sh3shkcq4su84.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.adapter.TestFullyBoundNullaryFunction.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 4918, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6083sm() throws Exception {
        try {
            __CLR4_4_13sh3shkcq4su84.R.inc(4918);
            __CLR4_4_13sh3shkcq4su84.R.inc(4919);
            NullaryFunction<Object> f = new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, null, "xyzzy");
            __CLR4_4_13sh3shkcq4su84.R.inc(4920);
            assertEquals(f, f);
            __CLR4_4_13sh3shkcq4su84.R.inc(4921);
            assertObjectsAreEqual(f, new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, null, "xyzzy"));
            __CLR4_4_13sh3shkcq4su84.R.inc(4922);
            assertObjectsAreEqual(new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, "bar", "xyzzy"), new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, "bar", "xyzzy"));
            __CLR4_4_13sh3shkcq4su84.R.inc(4923);
            assertObjectsAreEqual(new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, "bar", null), new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, "bar", null));
            __CLR4_4_13sh3shkcq4su84.R.inc(4924);
            assertObjectsAreNotEqual(f, Constant.of("xyzzy"));
            __CLR4_4_13sh3shkcq4su84.R.inc(4925);
            assertObjectsAreNotEqual(f, new FullyBoundNullaryFunction<Object>(LeftIdentity.FUNCTION, null, "xyzzy"));
            __CLR4_4_13sh3shkcq4su84.R.inc(4926);
            assertObjectsAreNotEqual(f, new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, "bar", "xyzzy"));
            __CLR4_4_13sh3shkcq4su84.R.inc(4927);
            assertObjectsAreNotEqual(f, new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, null, "bar"));
            __CLR4_4_13sh3shkcq4su84.R.inc(4928);
            assertObjectsAreNotEqual(f, new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, null, null));
            __CLR4_4_13sh3shkcq4su84.R.inc(4929);
            assertObjectsAreNotEqual(new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, "xyzzy", "bar"), new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, null, "bar"));
            __CLR4_4_13sh3shkcq4su84.R.inc(4930);
            assertObjectsAreNotEqual(new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, "xyzzy", "bar"), new FullyBoundNullaryFunction<Object>(RightIdentity.FUNCTION, "bar", "bar"));
            __CLR4_4_13sh3shkcq4su84.R.inc(4931);
            assertTrue(!f.equals(null));
        } finally {
            __CLR4_4_13sh3shkcq4su84.R.flushNeeded();
        }
    }

    @Test
    public void testAdaptNull() throws Exception {
        __CLR4_4_13sh3shkcq4su84.R.globalSliceStart(getClass().getName(), 4932);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1t45fwe3t0();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_13sh3shkcq4su84.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_13sh3shkcq4su84.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.adapter.TestFullyBoundNullaryFunction.testAdaptNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 4932, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1t45fwe3t0() throws Exception {
        try {
            __CLR4_4_13sh3shkcq4su84.R.inc(4932);
            __CLR4_4_13sh3shkcq4su84.R.inc(4933);
            assertNull(FullyBoundNullaryFunction.bind(null, null, "xyzzy"));
        } finally {
            __CLR4_4_13sh3shkcq4su84.R.flushNeeded();
        }
    }

    @Test
    public void testAdapt() throws Exception {
        __CLR4_4_13sh3shkcq4su84.R.globalSliceStart(getClass().getName(), 4934);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_11awe893t2();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_13sh3shkcq4su84.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_13sh3shkcq4su84.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.adapter.TestFullyBoundNullaryFunction.testAdapt", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 4934, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_11awe893t2() throws Exception {
        try {
            __CLR4_4_13sh3shkcq4su84.R.inc(4934);
            __CLR4_4_13sh3shkcq4su84.R.inc(4935);
            assertNotNull(FullyBoundNullaryFunction.bind(RightIdentity.FUNCTION, "xyzzy", "foobar"));
            __CLR4_4_13sh3shkcq4su84.R.inc(4936);
            assertNotNull(FullyBoundNullaryFunction.bind(RightIdentity.FUNCTION, null, null));
        } finally {
            __CLR4_4_13sh3shkcq4su84.R.flushNeeded();
        }
    }
}

