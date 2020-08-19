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
package org.apache.commons.functor.core.composite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.LeftIdentity;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestConditionalBinaryFunction extends BaseFunctorTest {

    static class __CLR4_4_16h76h7kcq4sv05 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 8409, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_16h76h7kcq4sv05.R.inc(8395);
            __CLR4_4_16h76h7kcq4sv05.R.inc(8396);
            return new ConditionalBinaryFunction<Object, Object, String>(Constant.TRUE, Constant.of("left"), Constant.of("right"));
        } finally {
            __CLR4_4_16h76h7kcq4sv05.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() throws Exception {
        __CLR4_4_16h76h7kcq4sv05.R.globalSliceStart(getClass().getName(), 8397);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1czkatq6h9();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16h76h7kcq4sv05.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16h76h7kcq4sv05.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestConditionalBinaryFunction.testEvaluate", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8397, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1czkatq6h9() throws Exception {
        try {
            __CLR4_4_16h76h7kcq4sv05.R.inc(8397);
            __CLR4_4_16h76h7kcq4sv05.R.inc(8398);
            ConditionalBinaryFunction<Boolean, Object, String> f = new ConditionalBinaryFunction<Boolean, Object, String>(LeftIdentity.PREDICATE, Constant.of("left"), Constant.of("right"));
            __CLR4_4_16h76h7kcq4sv05.R.inc(8399);
            assertEquals("left", f.evaluate(Boolean.TRUE, null));
            __CLR4_4_16h76h7kcq4sv05.R.inc(8400);
            assertEquals("right", f.evaluate(Boolean.FALSE, null));
        } finally {
            __CLR4_4_16h76h7kcq4sv05.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_16h76h7kcq4sv05.R.globalSliceStart(getClass().getName(), 8401);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6086hd();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16h76h7kcq4sv05.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16h76h7kcq4sv05.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestConditionalBinaryFunction.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8401, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6086hd() throws Exception {
        try {
            __CLR4_4_16h76h7kcq4sv05.R.inc(8401);
            __CLR4_4_16h76h7kcq4sv05.R.inc(8402);
            ConditionalBinaryFunction<Boolean, Object, String> f = new ConditionalBinaryFunction<Boolean, Object, String>(LeftIdentity.PREDICATE, Constant.of("left"), Constant.of("right"));
            __CLR4_4_16h76h7kcq4sv05.R.inc(8403);
            assertEquals(f, f);
            __CLR4_4_16h76h7kcq4sv05.R.inc(8404);
            assertObjectsAreEqual(f, new ConditionalBinaryFunction<Boolean, Object, String>(LeftIdentity.PREDICATE, Constant.of("left"), Constant.of("right")));
            __CLR4_4_16h76h7kcq4sv05.R.inc(8405);
            assertObjectsAreNotEqual(f, new ConditionalBinaryFunction<Boolean, Object, Object>(LeftIdentity.PREDICATE, Constant.of(null), Constant.of("right")));
            __CLR4_4_16h76h7kcq4sv05.R.inc(8406);
            assertObjectsAreNotEqual(f, new ConditionalBinaryFunction<Boolean, Object, String>(Constant.TRUE, Constant.of("left"), Constant.of("right")));
            __CLR4_4_16h76h7kcq4sv05.R.inc(8407);
            assertObjectsAreNotEqual(f, new ConditionalBinaryFunction<Boolean, Object, Object>(LeftIdentity.PREDICATE, Constant.of("left"), Constant.of(null)));
            __CLR4_4_16h76h7kcq4sv05.R.inc(8408);
            assertTrue(!f.equals(null));
        } finally {
            __CLR4_4_16h76h7kcq4sv05.R.flushNeeded();
        }
    }
}

