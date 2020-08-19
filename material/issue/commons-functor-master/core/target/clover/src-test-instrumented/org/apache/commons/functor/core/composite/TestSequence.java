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
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.core.NoOp;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
@SuppressWarnings("unchecked")
public class TestSequence extends BaseFunctorTest {

    static class __CLR4_4_16x76x7kcq4sv3l {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 9046, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8971);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8972);
            return new Sequence<Object>(new NoOp(), new NoOp());
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testConstructors() throws Exception {
        __CLR4_4_16x76x7kcq4sv3l.R.globalSliceStart(getClass().getName(), 8973);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1lwxahe6x9();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16x76x7kcq4sv3l.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestSequence.testConstructors", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8973, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1lwxahe6x9() throws Exception {
        try {
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8973);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8974);
            Sequence<Object> seq1 = new Sequence<Object>((Procedure<? super Object>) null);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8975);
            Sequence<Object> seq2 = new Sequence<Object>();
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8976);
            assertObjectsAreEqual(seq1, seq2);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8977);
            RunCounter p1 = new RunCounter();
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8978);
            RunCounter p2 = new RunCounter();
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8979);
            List<Procedure<? super Object>> iterable = new ArrayList<Procedure<? super Object>>();
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8980);
            iterable.add(p1);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8981);
            iterable.add(p2);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8982);
            Sequence<Object> seq3 = new Sequence<Object>(iterable);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8983);
            Sequence<Object> seq4 = new Sequence<Object>(p1, p2);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8984);
            assertObjectsAreEqual(seq3, seq4);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8985);
            Sequence<Object> seq5 = new Sequence<Object>((Iterable<Procedure<? super Object>>) null);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8986);
            Sequence<Object> seq6 = new Sequence<Object>((Procedure<? super Object>[]) null);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8987);
            assertObjectsAreEqual(seq5, seq6);
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.flushNeeded();
        }
    }

    @Test
    public void testRunZero() throws Exception {
        __CLR4_4_16x76x7kcq4sv3l.R.globalSliceStart(getClass().getName(), 8988);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ho3ny06xo();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16x76x7kcq4sv3l.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestSequence.testRunZero", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8988, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ho3ny06xo() throws Exception {
        try {
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8988);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8989);
            Sequence<String> seq = new Sequence<String>();
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8990);
            seq.run(null);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8991);
            seq.run("xyzzy");
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.flushNeeded();
        }
    }

    @Test
    public void testRunOne() throws Exception {
        __CLR4_4_16x76x7kcq4sv3l.R.globalSliceStart(getClass().getName(), 8992);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1g9x4cs6xs();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16x76x7kcq4sv3l.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestSequence.testRunOne", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8992, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1g9x4cs6xs() throws Exception {
        try {
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8992);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8993);
            RunCounter counter = new RunCounter();
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8994);
            Sequence<String> seq = new Sequence<String>(counter);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8995);
            assertEquals(0, counter.count);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8996);
            seq.run(null);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8997);
            assertEquals(1, counter.count);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8998);
            seq.run("xyzzy");
            __CLR4_4_16x76x7kcq4sv3l.R.inc(8999);
            assertEquals(2, counter.count);
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.flushNeeded();
        }
    }

    @Test
    public void testRunTwo() throws Exception {
        __CLR4_4_16x76x7kcq4sv3l.R.globalSliceStart(getClass().getName(), 9000);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1b3wzs66y0();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16x76x7kcq4sv3l.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestSequence.testRunTwo", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 9000, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1b3wzs66y0() throws Exception {
        try {
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9000);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9001);
            RunCounter[] counter = { new RunCounter(), new RunCounter() };
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9002);
            Sequence<String> seq = new Sequence<String>(counter[0], counter[1]);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9003);
            assertEquals(0, counter[0].count);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9004);
            assertEquals(0, counter[1].count);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9005);
            seq.run(null);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9006);
            assertEquals(1, counter[0].count);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9007);
            assertEquals(1, counter[1].count);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9008);
            seq.run("xyzzy");
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9009);
            assertEquals(2, counter[0].count);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9010);
            assertEquals(2, counter[1].count);
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.flushNeeded();
        }
    }

    @Test
    public void testThen() throws Exception {
        __CLR4_4_16x76x7kcq4sv3l.R.globalSliceStart(getClass().getName(), 9011);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1bnohca6yb();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16x76x7kcq4sv3l.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestSequence.testThen", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 9011, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1bnohca6yb() throws Exception {
        try {
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9011);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9012);
            List<RunCounter> list = new ArrayList<RunCounter>();
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9013);
            Sequence<String> seq = new Sequence<String>();
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9014);
            seq.run(null);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9015);
            for (int i = 0; (((i < 10) && (__CLR4_4_16x76x7kcq4sv3l.R.iget(9016) != 0 | true)) || (__CLR4_4_16x76x7kcq4sv3l.R.iget(9017) == 0 & false)); i++) {
                {
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9018);
                    RunCounter counter = new RunCounter();
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9019);
                    seq.then(counter);
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9020);
                    list.add(counter);
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9021);
                    seq.run("xyzzy");
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9022);
                    for (int j = 0; (((j < list.size()) && (__CLR4_4_16x76x7kcq4sv3l.R.iget(9023) != 0 | true)) || (__CLR4_4_16x76x7kcq4sv3l.R.iget(9024) == 0 & false)); j++) {
                        {
                            __CLR4_4_16x76x7kcq4sv3l.R.inc(9025);
                            assertEquals(list.size() - j, ((list.get(j)).count));
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_16x76x7kcq4sv3l.R.globalSliceStart(getClass().getName(), 9026);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6086yq();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16x76x7kcq4sv3l.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestSequence.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 9026, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6086yq() throws Exception {
        try {
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9026);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9027);
            Sequence<?> p = new Sequence<Object>();
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9028);
            assertEquals(p, p);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9029);
            Sequence<?> q = new Sequence<Object>();
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9030);
            assertObjectsAreEqual(p, q);
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9031);
            for (int i = 0; (((i < 3) && (__CLR4_4_16x76x7kcq4sv3l.R.iget(9032) != 0 | true)) || (__CLR4_4_16x76x7kcq4sv3l.R.iget(9033) == 0 & false)); i++) {
                {
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9034);
                    p.then(new NoOp());
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9035);
                    assertObjectsAreNotEqual(p, q);
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9036);
                    q.then(new NoOp());
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9037);
                    assertObjectsAreEqual(p, q);
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9038);
                    p.then(new Sequence<Object>(new NoOp(), new NoOp()));
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9039);
                    assertObjectsAreNotEqual(p, q);
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9040);
                    q.then(new Sequence<Object>(new NoOp(), new NoOp()));
                    __CLR4_4_16x76x7kcq4sv3l.R.inc(9041);
                    assertObjectsAreEqual(p, q);
                }
            }
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9042);
            assertObjectsAreNotEqual(p, new NoOp());
            __CLR4_4_16x76x7kcq4sv3l.R.inc(9043);
            assertFalse(p.equals(null));
        } finally {
            __CLR4_4_16x76x7kcq4sv3l.R.flushNeeded();
        }
    }

    // Classes
    // ------------------------------------------------------------------------
    static class RunCounter implements Procedure<Object> {

        public void run(Object that) {
            try {
                __CLR4_4_16x76x7kcq4sv3l.R.inc(9044);
                __CLR4_4_16x76x7kcq4sv3l.R.inc(9045);
                count++;
            } finally {
                __CLR4_4_16x76x7kcq4sv3l.R.flushNeeded();
            }
        }

        public int count = 0;
    }
}

