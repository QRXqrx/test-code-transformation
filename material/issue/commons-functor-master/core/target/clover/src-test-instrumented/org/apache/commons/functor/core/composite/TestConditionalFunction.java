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
import org.apache.commons.functor.core.Identity;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestConditionalFunction extends BaseFunctorTest {

    static class __CLR4_4_16is6iskcq4sv0m {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 8466, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_16is6iskcq4sv0m.R.inc(8452);
            __CLR4_4_16is6iskcq4sv0m.R.inc(8453);
            return new ConditionalFunction<Object, Object>(Constant.TRUE, Constant.of("left"), Constant.of("right"));
        } finally {
            __CLR4_4_16is6iskcq4sv0m.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() throws Exception {
        __CLR4_4_16is6iskcq4sv0m.R.globalSliceStart(getClass().getName(), 8454);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1czkatq6iu();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16is6iskcq4sv0m.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16is6iskcq4sv0m.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestConditionalFunction.testEvaluate", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8454, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1czkatq6iu() throws Exception {
        try {
            __CLR4_4_16is6iskcq4sv0m.R.inc(8454);
            __CLR4_4_16is6iskcq4sv0m.R.inc(8455);
            ConditionalFunction<Object, Object> f = new ConditionalFunction<Object, Object>(Identity.INSTANCE, Constant.of("left"), Constant.of("right"));
            __CLR4_4_16is6iskcq4sv0m.R.inc(8456);
            assertEquals("left", f.evaluate(Boolean.TRUE));
            __CLR4_4_16is6iskcq4sv0m.R.inc(8457);
            assertEquals("right", f.evaluate(Boolean.FALSE));
        } finally {
            __CLR4_4_16is6iskcq4sv0m.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_16is6iskcq4sv0m.R.globalSliceStart(getClass().getName(), 8458);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6086iy();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16is6iskcq4sv0m.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16is6iskcq4sv0m.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestConditionalFunction.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8458, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6086iy() throws Exception {
        try {
            __CLR4_4_16is6iskcq4sv0m.R.inc(8458);
            __CLR4_4_16is6iskcq4sv0m.R.inc(8459);
            ConditionalFunction<Object, Object> f = new ConditionalFunction<Object, Object>(Identity.INSTANCE, Constant.of("left"), Constant.of("right"));
            __CLR4_4_16is6iskcq4sv0m.R.inc(8460);
            assertEquals(f, f);
            __CLR4_4_16is6iskcq4sv0m.R.inc(8461);
            assertObjectsAreEqual(f, new ConditionalFunction<Object, Object>(Identity.INSTANCE, Constant.of("left"), Constant.of("right")));
            __CLR4_4_16is6iskcq4sv0m.R.inc(8462);
            assertObjectsAreNotEqual(f, new ConditionalFunction<Object, Object>(Identity.INSTANCE, Constant.of(null), Constant.of("right")));
            __CLR4_4_16is6iskcq4sv0m.R.inc(8463);
            assertObjectsAreNotEqual(f, new ConditionalFunction<Object, Object>(Constant.TRUE, Constant.of("left"), Constant.of("right")));
            __CLR4_4_16is6iskcq4sv0m.R.inc(8464);
            assertObjectsAreNotEqual(f, new ConditionalFunction<Object, Object>(Identity.INSTANCE, Constant.of("left"), Constant.of(null)));
            __CLR4_4_16is6iskcq4sv0m.R.inc(8465);
            assertTrue(!f.equals(null));
        } finally {
            __CLR4_4_16is6iskcq4sv0m.R.flushNeeded();
        }
    }
}

