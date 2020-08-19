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
import org.apache.commons.functor.Function;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.Identity;
import org.junit.Test;

/**
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestCompositeFunction extends BaseFunctorTest {

    static class __CLR4_4_16du6dukcq4suzh {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 8316, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_16du6dukcq4suzh.R.inc(8274);
            __CLR4_4_16du6dukcq4suzh.R.inc(8275);
            return Composite.function(Constant.of(3));
        } finally {
            __CLR4_4_16du6dukcq4suzh.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() throws Exception {
        __CLR4_4_16du6dukcq4suzh.R.globalSliceStart(getClass().getName(), 8276);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1czkatq6dw();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16du6dukcq4suzh.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16du6dukcq4suzh.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestCompositeFunction.testEvaluate", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8276, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1czkatq6dw() throws Exception {
        try {
            __CLR4_4_16du6dukcq4suzh.R.inc(8276);
            __CLR4_4_16du6dukcq4suzh.R.inc(8277);
            assertEquals(Integer.valueOf(4), (new CompositeFunction<Object, Integer>(Constant.of(4))).evaluate(null));
            __CLR4_4_16du6dukcq4suzh.R.inc(8278);
            assertEquals(Integer.valueOf(4), (Composite.function(Constant.of(4)).of(Constant.of(3)).evaluate("xyzzy")));
            __CLR4_4_16du6dukcq4suzh.R.inc(8279);
            assertEquals(Integer.valueOf(3), (new CompositeFunction<Object, Integer>(Constant.of(3)).of(Constant.of(4)).evaluate("xyzzy")));
        } finally {
            __CLR4_4_16du6dukcq4suzh.R.flushNeeded();
        }
    }

    @Test
    public void testOf() throws Exception {
        __CLR4_4_16du6dukcq4suzh.R.globalSliceStart(getClass().getName(), 8280);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1w0oi7k6e0();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16du6dukcq4suzh.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16du6dukcq4suzh.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestCompositeFunction.testOf", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8280, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1w0oi7k6e0() throws Exception {
        try {
            __CLR4_4_16du6dukcq4suzh.R.inc(8280);
            __CLR4_4_16du6dukcq4suzh.R.inc(8281);
            Function<Object, Integer> uf = new Function<Object, Integer>() {

                public Integer evaluate(Object obj) {
                    try {
                        __CLR4_4_16du6dukcq4suzh.R.inc(8282);
                        __CLR4_4_16du6dukcq4suzh.R.inc(8283);
                        if ((((obj instanceof Integer) && (__CLR4_4_16du6dukcq4suzh.R.iget(8284) != 0 | true)) || (__CLR4_4_16du6dukcq4suzh.R.iget(8285) == 0 & false))) {
                            {
                                __CLR4_4_16du6dukcq4suzh.R.inc(8286);
                                return (((Integer) obj).intValue()) + 1;
                            }
                        } else {
                            {
                                __CLR4_4_16du6dukcq4suzh.R.inc(8287);
                                return 1;
                            }
                        }
                    } finally {
                        __CLR4_4_16du6dukcq4suzh.R.flushNeeded();
                    }
                }
            };
            __CLR4_4_16du6dukcq4suzh.R.inc(8288);
            CompositeFunction<Object, Integer> f = null;
            __CLR4_4_16du6dukcq4suzh.R.inc(8289);
            for (int i = 0; (((i < 10) && (__CLR4_4_16du6dukcq4suzh.R.iget(8290) != 0 | true)) || (__CLR4_4_16du6dukcq4suzh.R.iget(8291) == 0 & false)); i++) {
                {
                    __CLR4_4_16du6dukcq4suzh.R.inc(8292);
                    f = (((f == null) && (__CLR4_4_16du6dukcq4suzh.R.iget(8293) != 0 | true)) || (__CLR4_4_16du6dukcq4suzh.R.iget(8294) == 0 & false)) ? new CompositeFunction<Object, Integer>(uf) : f.of(uf);
                    __CLR4_4_16du6dukcq4suzh.R.inc(8295);
                    assertEquals(Integer.valueOf(i + 1), f.evaluate(null));
                }
            }
        } finally {
            __CLR4_4_16du6dukcq4suzh.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_16du6dukcq4suzh.R.globalSliceStart(getClass().getName(), 8296);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6086eg();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16du6dukcq4suzh.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16du6dukcq4suzh.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestCompositeFunction.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8296, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6086eg() throws Exception {
        try {
            __CLR4_4_16du6dukcq4suzh.R.inc(8296);
            __CLR4_4_16du6dukcq4suzh.R.inc(8297);
            CompositeFunction<Object, String> f = new CompositeFunction<Object, String>(Constant.of("x"));
            __CLR4_4_16du6dukcq4suzh.R.inc(8298);
            assertEquals(f, f);
            __CLR4_4_16du6dukcq4suzh.R.inc(8299);
            CompositeFunction<Object, String> g = new CompositeFunction<Object, String>(Constant.of("x"));
            __CLR4_4_16du6dukcq4suzh.R.inc(8300);
            assertObjectsAreEqual(f, g);
            __CLR4_4_16du6dukcq4suzh.R.inc(8301);
            for (int i = 0; (((i < 3) && (__CLR4_4_16du6dukcq4suzh.R.iget(8302) != 0 | true)) || (__CLR4_4_16du6dukcq4suzh.R.iget(8303) == 0 & false)); i++) {
                {
                    __CLR4_4_16du6dukcq4suzh.R.inc(8304);
                    f = f.of(Constant.of("y")).of(Constant.of("z"));
                    __CLR4_4_16du6dukcq4suzh.R.inc(8305);
                    System.out.println(f);
                    __CLR4_4_16du6dukcq4suzh.R.inc(8306);
                    System.out.println(f.hashCode());
                    __CLR4_4_16du6dukcq4suzh.R.inc(8307);
                    System.out.println(g);
                    __CLR4_4_16du6dukcq4suzh.R.inc(8308);
                    System.out.println(g.hashCode());
                    __CLR4_4_16du6dukcq4suzh.R.inc(8309);
                    assertObjectsAreNotEqual(f, g);
                    __CLR4_4_16du6dukcq4suzh.R.inc(8310);
                    g = g.of(Constant.of("y")).of(Constant.of("z"));
                    __CLR4_4_16du6dukcq4suzh.R.inc(8311);
                    assertObjectsAreEqual(f, g);
                }
            }
            __CLR4_4_16du6dukcq4suzh.R.inc(8312);
            assertObjectsAreNotEqual(f, Constant.of("y"));
            __CLR4_4_16du6dukcq4suzh.R.inc(8313);
            assertObjectsAreNotEqual(Constant.of("y"), f);
            __CLR4_4_16du6dukcq4suzh.R.inc(8314);
            assertObjectsAreNotEqual(f, Identity.instance());
            __CLR4_4_16du6dukcq4suzh.R.inc(8315);
            assertTrue(!f.equals(null));
        } finally {
            __CLR4_4_16du6dukcq4suzh.R.flushNeeded();
        }
    }
}

