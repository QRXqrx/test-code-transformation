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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.functor.BaseFunctorTest;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestConstant extends BaseFunctorTest {

    static class __CLR4_4_14x34x3kcq4suii {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 6427, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_14x34x3kcq4suii.R.inc(6375);
            __CLR4_4_14x34x3kcq4suii.R.inc(6376);
            return new Constant<Object>("K");
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() throws Exception {
        __CLR4_4_14x34x3kcq4suii.R.globalSliceStart(getClass().getName(), 6377);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1czkatq4x5();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14x34x3kcq4suii.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestConstant.testEvaluate", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6377, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1czkatq4x5() throws Exception {
        try {
            __CLR4_4_14x34x3kcq4suii.R.inc(6377);
            __CLR4_4_14x34x3kcq4suii.R.inc(6378);
            Constant<Object> f = new Constant<Object>("xyzzy");
            __CLR4_4_14x34x3kcq4suii.R.inc(6379);
            assertEquals("xyzzy", f.evaluate());
            __CLR4_4_14x34x3kcq4suii.R.inc(6380);
            assertEquals("xyzzy", f.evaluate(null));
            __CLR4_4_14x34x3kcq4suii.R.inc(6381);
            assertEquals("xyzzy", f.evaluate(null, null));
            __CLR4_4_14x34x3kcq4suii.R.inc(6382);
            assertEquals("xyzzy", f.evaluate());
            __CLR4_4_14x34x3kcq4suii.R.inc(6383);
            assertEquals("xyzzy", f.evaluate("foo"));
            __CLR4_4_14x34x3kcq4suii.R.inc(6384);
            assertEquals("xyzzy", f.evaluate("foo", Integer.valueOf(2)));
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.flushNeeded();
        }
    }

    @Test
    public void testEvaluateConstantNull() throws Exception {
        __CLR4_4_14x34x3kcq4suii.R.globalSliceStart(getClass().getName(), 6385);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_14ro1bx4xd();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14x34x3kcq4suii.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestConstant.testEvaluateConstantNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6385, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_14ro1bx4xd() throws Exception {
        try {
            __CLR4_4_14x34x3kcq4suii.R.inc(6385);
            __CLR4_4_14x34x3kcq4suii.R.inc(6386);
            Constant<Object> f = new Constant<Object>(null);
            __CLR4_4_14x34x3kcq4suii.R.inc(6387);
            assertNull(f.evaluate());
            __CLR4_4_14x34x3kcq4suii.R.inc(6388);
            assertNull(f.evaluate(null));
            __CLR4_4_14x34x3kcq4suii.R.inc(6389);
            assertNull(f.evaluate(null, null));
            __CLR4_4_14x34x3kcq4suii.R.inc(6390);
            assertNull(f.evaluate());
            __CLR4_4_14x34x3kcq4suii.R.inc(6391);
            assertNull(f.evaluate("foo"));
            __CLR4_4_14x34x3kcq4suii.R.inc(6392);
            assertNull(f.evaluate("foo", Integer.valueOf(2)));
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.flushNeeded();
        }
    }

    @Test
    public void testConstantTrue() throws Exception {
        __CLR4_4_14x34x3kcq4suii.R.globalSliceStart(getClass().getName(), 6393);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_15zh8zv4xl();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14x34x3kcq4suii.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestConstant.testConstantTrue", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6393, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_15zh8zv4xl() throws Exception {
        try {
            __CLR4_4_14x34x3kcq4suii.R.inc(6393);
            __CLR4_4_14x34x3kcq4suii.R.inc(6394);
            Constant<Object> truePred = new Constant<Object>(Boolean.TRUE);
            __CLR4_4_14x34x3kcq4suii.R.inc(6395);
            assertTrue(truePred.test());
            __CLR4_4_14x34x3kcq4suii.R.inc(6396);
            assertTrue(truePred.test(null));
            __CLR4_4_14x34x3kcq4suii.R.inc(6397);
            assertTrue(truePred.test(null, null));
            __CLR4_4_14x34x3kcq4suii.R.inc(6398);
            assertTrue(truePred.test());
            __CLR4_4_14x34x3kcq4suii.R.inc(6399);
            assertTrue(truePred.test("foo"));
            __CLR4_4_14x34x3kcq4suii.R.inc(6400);
            assertTrue(truePred.test("foo", Integer.valueOf(2)));
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.flushNeeded();
        }
    }

    @Test
    public void testConstantFalse() throws Exception {
        __CLR4_4_14x34x3kcq4suii.R.globalSliceStart(getClass().getName(), 6401);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_19gnkks4xt();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14x34x3kcq4suii.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestConstant.testConstantFalse", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6401, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_19gnkks4xt() throws Exception {
        try {
            __CLR4_4_14x34x3kcq4suii.R.inc(6401);
            __CLR4_4_14x34x3kcq4suii.R.inc(6402);
            Constant<Object> falsePred = new Constant<Object>(Boolean.FALSE);
            __CLR4_4_14x34x3kcq4suii.R.inc(6403);
            assertTrue(!falsePred.test());
            __CLR4_4_14x34x3kcq4suii.R.inc(6404);
            assertTrue(!falsePred.test(null));
            __CLR4_4_14x34x3kcq4suii.R.inc(6405);
            assertTrue(!falsePred.test(null, null));
            __CLR4_4_14x34x3kcq4suii.R.inc(6406);
            assertTrue(!falsePred.test());
            __CLR4_4_14x34x3kcq4suii.R.inc(6407);
            assertTrue(!falsePred.test("foo"));
            __CLR4_4_14x34x3kcq4suii.R.inc(6408);
            assertTrue(!falsePred.test("foo", Integer.valueOf(2)));
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_14x34x3kcq4suii.R.globalSliceStart(getClass().getName(), 6409);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6084y1();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14x34x3kcq4suii.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestConstant.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6409, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6084y1() throws Exception {
        try {
            __CLR4_4_14x34x3kcq4suii.R.inc(6409);
            __CLR4_4_14x34x3kcq4suii.R.inc(6410);
            Constant<Object> f = new Constant<Object>("xyzzy");
            __CLR4_4_14x34x3kcq4suii.R.inc(6411);
            assertEquals(f, f);
            __CLR4_4_14x34x3kcq4suii.R.inc(6412);
            assertObjectsAreEqual(f, new Constant<Object>("xyzzy"));
            __CLR4_4_14x34x3kcq4suii.R.inc(6413);
            assertObjectsAreNotEqual(f, new Constant<Object>("abcde"));
            __CLR4_4_14x34x3kcq4suii.R.inc(6414);
            assertObjectsAreNotEqual(f, new Constant<Object>(null));
            __CLR4_4_14x34x3kcq4suii.R.inc(6415);
            assertObjectsAreEqual(new Constant<Object>(null), new Constant<Object>(null));
            __CLR4_4_14x34x3kcq4suii.R.inc(6416);
            assertTrue(!f.equals(null));
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.flushNeeded();
        }
    }

    @Test
    public void testConstants() throws Exception {
        __CLR4_4_14x34x3kcq4suii.R.globalSliceStart(getClass().getName(), 6417);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_15epzlw4y9();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14x34x3kcq4suii.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.TestConstant.testConstants", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6417, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_15epzlw4y9() throws Exception {
        try {
            __CLR4_4_14x34x3kcq4suii.R.inc(6417);
            __CLR4_4_14x34x3kcq4suii.R.inc(6418);
            assertEquals(Constant.predicate(true), Constant.TRUE);
            __CLR4_4_14x34x3kcq4suii.R.inc(6419);
            assertEquals(Constant.truePredicate(), Constant.TRUE);
            __CLR4_4_14x34x3kcq4suii.R.inc(6420);
            assertSame(Constant.truePredicate(), Constant.TRUE);
            __CLR4_4_14x34x3kcq4suii.R.inc(6421);
            assertEquals(Constant.predicate(true), Constant.TRUE);
            __CLR4_4_14x34x3kcq4suii.R.inc(6422);
            assertSame(Constant.predicate(true), Constant.TRUE);
            __CLR4_4_14x34x3kcq4suii.R.inc(6423);
            assertEquals(Constant.falsePredicate(), Constant.FALSE);
            __CLR4_4_14x34x3kcq4suii.R.inc(6424);
            assertSame(Constant.falsePredicate(), Constant.FALSE);
            __CLR4_4_14x34x3kcq4suii.R.inc(6425);
            assertEquals(Constant.predicate(false), Constant.FALSE);
            __CLR4_4_14x34x3kcq4suii.R.inc(6426);
            assertSame(Constant.predicate(false), Constant.FALSE);
        } finally {
            __CLR4_4_14x34x3kcq4suii.R.flushNeeded();
        }
    }
}

