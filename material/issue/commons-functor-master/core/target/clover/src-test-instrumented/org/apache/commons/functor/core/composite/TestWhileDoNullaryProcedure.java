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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.functor.adapter.BoundNullaryPredicate;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.NoOp;
import org.apache.commons.functor.core.collection.IsEmpty;
import org.junit.Test;

/**
 * @version $Revision: 1345136 $ $Date: 2012-06-01 09:47:06 -0300 (Fri, 01 Jun 2012) $
 */
public class TestWhileDoNullaryProcedure extends BaseFunctorTest {

    static class __CLR4_4_174h74hkcq4sv50 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 9274, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_174h74hkcq4sv50.R.inc(9233);
            __CLR4_4_174h74hkcq4sv50.R.inc(9234);
            return new WhileDoNullaryProcedure(Constant.FALSE, NoOp.INSTANCE);
        } finally {
            __CLR4_4_174h74hkcq4sv50.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    public class ListRemoveFirstProcedure implements NullaryProcedure {

        protected List<Object> list;

        public ListRemoveFirstProcedure(List<Object> list) {
            try {
                __CLR4_4_174h74hkcq4sv50.R.inc(9235);
                __CLR4_4_174h74hkcq4sv50.R.inc(9236);
                this.list = list;
            } finally {
                __CLR4_4_174h74hkcq4sv50.R.flushNeeded();
            }
        }

        public void run() {
            try {
                __CLR4_4_174h74hkcq4sv50.R.inc(9237);
                __CLR4_4_174h74hkcq4sv50.R.inc(9238);
                list.remove(0);
            } finally {
                __CLR4_4_174h74hkcq4sv50.R.flushNeeded();
            }
        }
    }

    private List<Object> getList() {
        try {
            __CLR4_4_174h74hkcq4sv50.R.inc(9239);
            __CLR4_4_174h74hkcq4sv50.R.inc(9240);
            List<Object> list = new LinkedList<Object>();
            __CLR4_4_174h74hkcq4sv50.R.inc(9241);
            list.add("a");
            __CLR4_4_174h74hkcq4sv50.R.inc(9242);
            list.add("b");
            __CLR4_4_174h74hkcq4sv50.R.inc(9243);
            list.add("c");
            __CLR4_4_174h74hkcq4sv50.R.inc(9244);
            list.add("d");
            __CLR4_4_174h74hkcq4sv50.R.inc(9245);
            return list;
        } finally {
            __CLR4_4_174h74hkcq4sv50.R.flushNeeded();
        }
    }

    @Test
    public void testLoopWithAction() throws Exception {
        __CLR4_4_174h74hkcq4sv50.R.globalSliceStart(getClass().getName(), 9246);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_19jmmqh74u();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_174h74hkcq4sv50.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_174h74hkcq4sv50.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestWhileDoNullaryProcedure.testLoopWithAction", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 9246, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_19jmmqh74u() throws Exception {
        try {
            __CLR4_4_174h74hkcq4sv50.R.inc(9246);
            __CLR4_4_174h74hkcq4sv50.R.inc(9247);
            List<Object> list = getList();
            __CLR4_4_174h74hkcq4sv50.R.inc(9248);
            NullaryProcedure action = new ListRemoveFirstProcedure(list);
            __CLR4_4_174h74hkcq4sv50.R.inc(9249);
            NullaryPredicate condition = new NullaryNot(new BoundNullaryPredicate(new IsEmpty<List<Object>>(), list));
            __CLR4_4_174h74hkcq4sv50.R.inc(9250);
            NullaryProcedure procedure = new WhileDoNullaryProcedure(condition, action);
            __CLR4_4_174h74hkcq4sv50.R.inc(9251);
            assertTrue("The condition should be true before running the loop", condition.test());
            __CLR4_4_174h74hkcq4sv50.R.inc(9252);
            assertFalse("The list should not be empty then", list.isEmpty());
            __CLR4_4_174h74hkcq4sv50.R.inc(9253);
            procedure.run();
            __CLR4_4_174h74hkcq4sv50.R.inc(9254);
            assertFalse("The condition should be false after running the loop", condition.test());
            __CLR4_4_174h74hkcq4sv50.R.inc(9255);
            assertTrue("The list should be empty then", list.isEmpty());
            __CLR4_4_174h74hkcq4sv50.R.inc(9256);
            list = getList();
            __CLR4_4_174h74hkcq4sv50.R.inc(9257);
            action = new ListRemoveFirstProcedure(list);
            __CLR4_4_174h74hkcq4sv50.R.inc(9258);
            condition = new NullaryPredicate() {

                private int count = 2;

                public boolean test() {
                    __CLR4_4_174h74hkcq4sv50.R.globalSliceStart(getClass().getName(), 9259);
                    int $CLV_p$ = 0;
                    java.lang.Throwable $CLV_t$ = null;
                    try {
                        boolean $CLV_r$ = __CLR4_4_1qua645757();
                        $CLV_p$ = 1;
                        return $CLV_r$;
                    } catch (java.lang.Throwable $CLV_t2$) {
                        if ($CLV_p$ == 0 && $CLV_t$ == null) {
                            $CLV_t$ = $CLV_t2$;
                        }
                        __CLR4_4_174h74hkcq4sv50.R.rethrow($CLV_t2$);
                        return false;
                    } finally {
                        __CLR4_4_174h74hkcq4sv50.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestWhileDoNullaryProcedure.testLoopWithAction.test", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 9259, $CLV_p$, $CLV_t$);
                    }
                }

                private boolean __CLR4_4_1qua645757() {
                    try {
                        __CLR4_4_174h74hkcq4sv50.R.inc(9259);
                        __CLR4_4_174h74hkcq4sv50.R.inc(9260);
                        return count-- > 0;
                    } finally {
                        __CLR4_4_174h74hkcq4sv50.R.flushNeeded();
                    }
                }
            };
            __CLR4_4_174h74hkcq4sv50.R.inc(9261);
            procedure = new WhileDoNullaryProcedure(condition, action);
            __CLR4_4_174h74hkcq4sv50.R.inc(9262);
            procedure.run();
            __CLR4_4_174h74hkcq4sv50.R.inc(9263);
            assertFalse("The list should not contain \"a\" anymore", list.contains("a"));
            __CLR4_4_174h74hkcq4sv50.R.inc(9264);
            assertFalse("The list should not contain \"b\" anymore", list.contains("b"));
            __CLR4_4_174h74hkcq4sv50.R.inc(9265);
            assertTrue("The list should still contain \"c\"", list.contains("c"));
            __CLR4_4_174h74hkcq4sv50.R.inc(9266);
            assertTrue("The list should still contain \"d\"", list.contains("d"));
        } finally {
            __CLR4_4_174h74hkcq4sv50.R.flushNeeded();
        }
    }

    @Test
    public void testLoopForNothing() {
        __CLR4_4_174h74hkcq4sv50.R.globalSliceStart(getClass().getName(), 9267);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_11h7tmp75f();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_174h74hkcq4sv50.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_174h74hkcq4sv50.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestWhileDoNullaryProcedure.testLoopForNothing", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 9267, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_11h7tmp75f() {
        try {
            __CLR4_4_174h74hkcq4sv50.R.inc(9267);
            __CLR4_4_174h74hkcq4sv50.R.inc(9268);
            List<Object> list = getList();
            __CLR4_4_174h74hkcq4sv50.R.inc(9269);
            NullaryProcedure action = new ListRemoveFirstProcedure(list);
            __CLR4_4_174h74hkcq4sv50.R.inc(9270);
            NullaryProcedure procedure = new WhileDoNullaryProcedure(Constant.FALSE, action);
            __CLR4_4_174h74hkcq4sv50.R.inc(9271);
            assertTrue("The list should contain 4 elements before runnning the loop", list.size() == 4);
            __CLR4_4_174h74hkcq4sv50.R.inc(9272);
            procedure.run();
            __CLR4_4_174h74hkcq4sv50.R.inc(9273);
            assertTrue("The list should contain 4 elements after runnning the loop", list.size() == 4);
        } finally {
            __CLR4_4_174h74hkcq4sv50.R.flushNeeded();
        }
    }
}

