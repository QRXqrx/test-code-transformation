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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
@SuppressWarnings("unchecked")
public class TestAnd extends BaseFunctorTest {

    static class __CLR4_4_1632632kcq4suws {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 7963, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_1632632kcq4suws.R.inc(7886);
            __CLR4_4_1632632kcq4suws.R.inc(7887);
            return new And<Object>(Constant.TRUE, Constant.TRUE);
        } finally {
            __CLR4_4_1632632kcq4suws.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testTrue() throws Exception {
        __CLR4_4_1632632kcq4suws.R.globalSliceStart(getClass().getName(), 7888);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1cy4y9l634();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1632632kcq4suws.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1632632kcq4suws.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestAnd.testTrue", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7888, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1cy4y9l634() throws Exception {
        try {
            __CLR4_4_1632632kcq4suws.R.inc(7888);
            __CLR4_4_1632632kcq4suws.R.inc(7889);
            assertTrue((new And<Object>()).test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7890);
            assertTrue((new And<Object>(Constant.TRUE)).test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7891);
            assertTrue((new And<Object>(Constant.TRUE, Constant.TRUE)).test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7892);
            assertTrue((new And<Object>(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7893);
            And<Object> p = new And<Object>(Constant.TRUE);
            __CLR4_4_1632632kcq4suws.R.inc(7894);
            assertTrue(p.test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7895);
            for (int i = 0; (((i < 10) && (__CLR4_4_1632632kcq4suws.R.iget(7896) != 0 | true)) || (__CLR4_4_1632632kcq4suws.R.iget(7897) == 0 & false)); i++) {
                {
                    __CLR4_4_1632632kcq4suws.R.inc(7898);
                    p.and(Constant.TRUE);
                    __CLR4_4_1632632kcq4suws.R.inc(7899);
                    assertTrue(p.test("xyzzy"));
                }
            }
            __CLR4_4_1632632kcq4suws.R.inc(7900);
            And<Object> q = new And<Object>(Constant.TRUE);
            __CLR4_4_1632632kcq4suws.R.inc(7901);
            assertTrue(q.test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7902);
            for (int i = 0; (((i < 10) && (__CLR4_4_1632632kcq4suws.R.iget(7903) != 0 | true)) || (__CLR4_4_1632632kcq4suws.R.iget(7904) == 0 & false)); i++) {
                {
                    __CLR4_4_1632632kcq4suws.R.inc(7905);
                    q.and(Constant.TRUE);
                    __CLR4_4_1632632kcq4suws.R.inc(7906);
                    assertTrue(q.test("xyzzy"));
                }
            }
            __CLR4_4_1632632kcq4suws.R.inc(7907);
            And<Object> r = new And<Object>(p, q);
            __CLR4_4_1632632kcq4suws.R.inc(7908);
            assertTrue(r.test("xyzzy"));
        } finally {
            __CLR4_4_1632632kcq4suws.R.flushNeeded();
        }
    }

    @Test
    public void testFalse() throws Exception {
        __CLR4_4_1632632kcq4suws.R.globalSliceStart(getClass().getName(), 7909);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s5vdwo63p();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1632632kcq4suws.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1632632kcq4suws.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestAnd.testFalse", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7909, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s5vdwo63p() throws Exception {
        try {
            __CLR4_4_1632632kcq4suws.R.inc(7909);
            __CLR4_4_1632632kcq4suws.R.inc(7910);
            assertFalse(new And<Object>(Constant.FALSE).test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7911);
            assertFalse(new And<Object>(Constant.TRUE, Constant.FALSE).test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7912);
            assertFalse(new And<Object>(Constant.TRUE, Constant.TRUE, Constant.FALSE).test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7913);
            And<Object> p = new And<Object>(Constant.FALSE);
            __CLR4_4_1632632kcq4suws.R.inc(7914);
            assertTrue(!p.test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7915);
            for (int i = 0; (((i < 10) && (__CLR4_4_1632632kcq4suws.R.iget(7916) != 0 | true)) || (__CLR4_4_1632632kcq4suws.R.iget(7917) == 0 & false)); i++) {
                {
                    __CLR4_4_1632632kcq4suws.R.inc(7918);
                    p.and(Constant.TRUE);
                    __CLR4_4_1632632kcq4suws.R.inc(7919);
                    assertTrue(!p.test("xyzzy"));
                }
            }
            __CLR4_4_1632632kcq4suws.R.inc(7920);
            And<Object> q = new And<Object>(Constant.TRUE);
            __CLR4_4_1632632kcq4suws.R.inc(7921);
            assertTrue(q.test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7922);
            for (int i = 0; (((i < 10) && (__CLR4_4_1632632kcq4suws.R.iget(7923) != 0 | true)) || (__CLR4_4_1632632kcq4suws.R.iget(7924) == 0 & false)); i++) {
                {
                    __CLR4_4_1632632kcq4suws.R.inc(7925);
                    q.and(Constant.TRUE);
                    __CLR4_4_1632632kcq4suws.R.inc(7926);
                    assertTrue(q.test("xyzzy"));
                }
            }
            __CLR4_4_1632632kcq4suws.R.inc(7927);
            And<Object> r = new And<Object>(p, q);
            __CLR4_4_1632632kcq4suws.R.inc(7928);
            assertTrue(!r.test("xyzzy"));
        } finally {
            __CLR4_4_1632632kcq4suws.R.flushNeeded();
        }
    }

    @Test
    public void testDuplicateAdd() throws Exception {
        __CLR4_4_1632632kcq4suws.R.globalSliceStart(getClass().getName(), 7929);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_18atuof649();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1632632kcq4suws.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1632632kcq4suws.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestAnd.testDuplicateAdd", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7929, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_18atuof649() throws Exception {
        try {
            __CLR4_4_1632632kcq4suws.R.inc(7929);
            __CLR4_4_1632632kcq4suws.R.inc(7930);
            Predicate<Object> p = Constant.TRUE;
            __CLR4_4_1632632kcq4suws.R.inc(7931);
            And<Object> q = new And<Object>(p, p);
            __CLR4_4_1632632kcq4suws.R.inc(7932);
            assertTrue(q.test("xyzzy"));
            __CLR4_4_1632632kcq4suws.R.inc(7933);
            for (int i = 0; (((i < 10) && (__CLR4_4_1632632kcq4suws.R.iget(7934) != 0 | true)) || (__CLR4_4_1632632kcq4suws.R.iget(7935) == 0 & false)); i++) {
                {
                    __CLR4_4_1632632kcq4suws.R.inc(7936);
                    q.and(p);
                    __CLR4_4_1632632kcq4suws.R.inc(7937);
                    assertTrue(q.test("xyzzy"));
                }
            }
        } finally {
            __CLR4_4_1632632kcq4suws.R.flushNeeded();
        }
    }

    @SuppressWarnings("rawtypes")
    @Test
    public void testEquals() throws Exception {
        __CLR4_4_1632632kcq4suws.R.globalSliceStart(getClass().getName(), 7938);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e60864i();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_1632632kcq4suws.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_1632632kcq4suws.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestAnd.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7938, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e60864i() throws Exception {
        try {
            __CLR4_4_1632632kcq4suws.R.inc(7938);
            __CLR4_4_1632632kcq4suws.R.inc(7939);
            And<Object> p = new And<Object>();
            __CLR4_4_1632632kcq4suws.R.inc(7940);
            assertEquals(p, p);
            __CLR4_4_1632632kcq4suws.R.inc(7941);
            And<Object> q = new And<Object>();
            __CLR4_4_1632632kcq4suws.R.inc(7942);
            assertObjectsAreEqual(p, q);
            __CLR4_4_1632632kcq4suws.R.inc(7943);
            for (int i = 0; (((i < 3) && (__CLR4_4_1632632kcq4suws.R.iget(7944) != 0 | true)) || (__CLR4_4_1632632kcq4suws.R.iget(7945) == 0 & false)); i++) {
                {
                    __CLR4_4_1632632kcq4suws.R.inc(7946);
                    p.and(Constant.truePredicate());
                    __CLR4_4_1632632kcq4suws.R.inc(7947);
                    assertObjectsAreNotEqual(p, q);
                    __CLR4_4_1632632kcq4suws.R.inc(7948);
                    q.and(Constant.truePredicate());
                    __CLR4_4_1632632kcq4suws.R.inc(7949);
                    assertObjectsAreEqual(p, q);
                    __CLR4_4_1632632kcq4suws.R.inc(7950);
                    p.and(new And<Object>(Constant.truePredicate(), Constant.falsePredicate()));
                    __CLR4_4_1632632kcq4suws.R.inc(7951);
                    assertObjectsAreNotEqual(p, q);
                    __CLR4_4_1632632kcq4suws.R.inc(7952);
                    q.and(new And<Object>(Constant.truePredicate(), Constant.falsePredicate()));
                    __CLR4_4_1632632kcq4suws.R.inc(7953);
                    assertObjectsAreEqual(p, q);
                }
            }
            __CLR4_4_1632632kcq4suws.R.inc(7954);
            assertObjectsAreNotEqual(p, Constant.truePredicate());
            __CLR4_4_1632632kcq4suws.R.inc(7955);
            And<Object> r = new And<Object>();
            __CLR4_4_1632632kcq4suws.R.inc(7956);
            r.and(Constant.truePredicate());
            __CLR4_4_1632632kcq4suws.R.inc(7957);
            r.and(new And<Object>(Constant.truePredicate(), Constant.falsePredicate()));
            __CLR4_4_1632632kcq4suws.R.inc(7958);
            assertObjectsAreEqual(r, new And<Object>(r.getPredicateList()));
            __CLR4_4_1632632kcq4suws.R.inc(7959);
            assertObjectsAreNotEqual(p, new And((Iterable<Predicate<Object>>) null));
            __CLR4_4_1632632kcq4suws.R.inc(7960);
            assertObjectsAreNotEqual(p, new And((Predicate<Object>[]) null));
            __CLR4_4_1632632kcq4suws.R.inc(7961);
            assertObjectsAreNotEqual(p, new And((Predicate<Object>) null));
            __CLR4_4_1632632kcq4suws.R.inc(7962);
            assertTrue(!p.equals(null));
        } finally {
            __CLR4_4_1632632kcq4suws.R.flushNeeded();
        }
    }
}

