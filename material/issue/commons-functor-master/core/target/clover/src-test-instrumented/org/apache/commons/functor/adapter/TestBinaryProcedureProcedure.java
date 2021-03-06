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
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.core.NoOp;
import org.junit.Test;

/**
 * @version $Revision: 1365377 $ $Date: 2012-07-24 21:59:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestBinaryProcedureProcedure extends BaseFunctorTest {

    static class __CLR4_4_13qc3qckcq4su7a {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 4852, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_13qc3qckcq4su7a.R.inc(4836);
            __CLR4_4_13qc3qckcq4su7a.R.inc(4837);
            return new BinaryProcedureProcedure<Object>(NoOp.INSTANCE);
        } finally {
            __CLR4_4_13qc3qckcq4su7a.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testRun() throws Exception {
        __CLR4_4_13qc3qckcq4su7a.R.globalSliceStart(getClass().getName(), 4838);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1yzvxa83qe();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_13qc3qckcq4su7a.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_13qc3qckcq4su7a.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.adapter.TestBinaryProcedureProcedure.testRun", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 4838, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1yzvxa83qe() throws Exception {
        try {
            __CLR4_4_13qc3qckcq4su7a.R.inc(4838);
            __CLR4_4_13qc3qckcq4su7a.R.inc(4839);
            Procedure<Object> p = new BinaryProcedureProcedure<Object>(NoOp.INSTANCE);
            __CLR4_4_13qc3qckcq4su7a.R.inc(4840);
            p.run(null);
        } finally {
            __CLR4_4_13qc3qckcq4su7a.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_13qc3qckcq4su7a.R.globalSliceStart(getClass().getName(), 4841);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6083qh();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_13qc3qckcq4su7a.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_13qc3qckcq4su7a.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.adapter.TestBinaryProcedureProcedure.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 4841, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6083qh() throws Exception {
        try {
            __CLR4_4_13qc3qckcq4su7a.R.inc(4841);
            __CLR4_4_13qc3qckcq4su7a.R.inc(4842);
            Procedure<Object> p = new BinaryProcedureProcedure<Object>(NoOp.INSTANCE);
            __CLR4_4_13qc3qckcq4su7a.R.inc(4843);
            assertEquals(p, p);
            __CLR4_4_13qc3qckcq4su7a.R.inc(4844);
            assertObjectsAreEqual(p, new BinaryProcedureProcedure<Object>(NoOp.INSTANCE));
            __CLR4_4_13qc3qckcq4su7a.R.inc(4845);
            assertObjectsAreNotEqual(p, NoOp.INSTANCE);
            __CLR4_4_13qc3qckcq4su7a.R.inc(4846);
            assertObjectsAreNotEqual(p, new BinaryProcedureProcedure<Object>(IgnoreLeftProcedure.adapt(NoOp.INSTANCE)));
            __CLR4_4_13qc3qckcq4su7a.R.inc(4847);
            assertTrue(!p.equals(null));
        } finally {
            __CLR4_4_13qc3qckcq4su7a.R.flushNeeded();
        }
    }

    @Test
    public void testAdaptNull() throws Exception {
        __CLR4_4_13qc3qckcq4su7a.R.globalSliceStart(getClass().getName(), 4848);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1t45fwe3qo();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_13qc3qckcq4su7a.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_13qc3qckcq4su7a.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.adapter.TestBinaryProcedureProcedure.testAdaptNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 4848, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1t45fwe3qo() throws Exception {
        try {
            __CLR4_4_13qc3qckcq4su7a.R.inc(4848);
            __CLR4_4_13qc3qckcq4su7a.R.inc(4849);
            assertNull(BinaryProcedureProcedure.adapt(null));
        } finally {
            __CLR4_4_13qc3qckcq4su7a.R.flushNeeded();
        }
    }

    @Test
    public void testAdapt() throws Exception {
        __CLR4_4_13qc3qckcq4su7a.R.globalSliceStart(getClass().getName(), 4850);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_11awe893qq();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_13qc3qckcq4su7a.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_13qc3qckcq4su7a.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.adapter.TestBinaryProcedureProcedure.testAdapt", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 4850, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_11awe893qq() throws Exception {
        try {
            __CLR4_4_13qc3qckcq4su7a.R.inc(4850);
            __CLR4_4_13qc3qckcq4su7a.R.inc(4851);
            assertNotNull(BinaryProcedureProcedure.adapt(NoOp.INSTANCE));
        } finally {
            __CLR4_4_13qc3qckcq4su7a.R.flushNeeded();
        }
    }
}

