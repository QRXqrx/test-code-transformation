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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryProcedure;
import org.apache.commons.functor.core.NoOp;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
@SuppressWarnings("unchecked")
public class TestBinarySequence extends BaseFunctorTest {

    static class __CLR4_4_16aw6awkcq4suyp {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 8233, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_16aw6awkcq4suyp.R.inc(8168);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8169);
            return new BinarySequence<String, String>(new NoOp(), new NoOp());
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testRunZero() throws Exception {
        __CLR4_4_16aw6awkcq4suyp.R.globalSliceStart(getClass().getName(), 8170);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ho3ny06ay();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16aw6awkcq4suyp.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestBinarySequence.testRunZero", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8170, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ho3ny06ay() throws Exception {
        try {
            __CLR4_4_16aw6awkcq4suyp.R.inc(8170);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8171);
            BinarySequence<String, String> seq = new BinarySequence<String, String>();
            __CLR4_4_16aw6awkcq4suyp.R.inc(8172);
            seq.run(null, null);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8173);
            seq.run("xyzzy", "xyzzy");
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.flushNeeded();
        }
    }

    @Test
    public void testRunOne() throws Exception {
        __CLR4_4_16aw6awkcq4suyp.R.globalSliceStart(getClass().getName(), 8174);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1g9x4cs6b2();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16aw6awkcq4suyp.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestBinarySequence.testRunOne", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8174, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1g9x4cs6b2() throws Exception {
        try {
            __CLR4_4_16aw6awkcq4suyp.R.inc(8174);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8175);
            RunCounter counter = new RunCounter();
            __CLR4_4_16aw6awkcq4suyp.R.inc(8176);
            BinarySequence<String, String> seq = new BinarySequence<String, String>(counter);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8177);
            assertEquals(0, counter.count);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8178);
            seq.run(null, null);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8179);
            assertEquals(1, counter.count);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8180);
            seq.run("xyzzy", "xyzzy");
            __CLR4_4_16aw6awkcq4suyp.R.inc(8181);
            assertEquals(2, counter.count);
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.flushNeeded();
        }
    }

    @Test
    public void testRunTwo() throws Exception {
        __CLR4_4_16aw6awkcq4suyp.R.globalSliceStart(getClass().getName(), 8182);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1b3wzs66ba();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16aw6awkcq4suyp.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestBinarySequence.testRunTwo", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8182, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1b3wzs66ba() throws Exception {
        try {
            __CLR4_4_16aw6awkcq4suyp.R.inc(8182);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8183);
            RunCounter[] counter = { new RunCounter(), new RunCounter() };
            __CLR4_4_16aw6awkcq4suyp.R.inc(8184);
            BinarySequence<String, String> seq = new BinarySequence<String, String>(counter[0], counter[1]);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8185);
            assertEquals(0, counter[0].count);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8186);
            assertEquals(0, counter[1].count);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8187);
            seq.run(null, null);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8188);
            assertEquals(1, counter[0].count);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8189);
            assertEquals(1, counter[1].count);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8190);
            seq.run("xyzzy", "xyzzy");
            __CLR4_4_16aw6awkcq4suyp.R.inc(8191);
            assertEquals(2, counter[0].count);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8192);
            assertEquals(2, counter[1].count);
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.flushNeeded();
        }
    }

    @Test
    public void testThen() throws Exception {
        __CLR4_4_16aw6awkcq4suyp.R.globalSliceStart(getClass().getName(), 8193);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1bnohca6bl();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16aw6awkcq4suyp.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestBinarySequence.testThen", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8193, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1bnohca6bl() throws Exception {
        try {
            __CLR4_4_16aw6awkcq4suyp.R.inc(8193);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8194);
            List<RunCounter> list = new ArrayList<RunCounter>();
            __CLR4_4_16aw6awkcq4suyp.R.inc(8195);
            BinarySequence<String, String> seq = new BinarySequence<String, String>();
            __CLR4_4_16aw6awkcq4suyp.R.inc(8196);
            seq.run(null, null);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8197);
            for (int i = 0; (((i < 10) && (__CLR4_4_16aw6awkcq4suyp.R.iget(8198) != 0 | true)) || (__CLR4_4_16aw6awkcq4suyp.R.iget(8199) == 0 & false)); i++) {
                {
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8200);
                    RunCounter counter = new RunCounter();
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8201);
                    seq.then(counter);
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8202);
                    list.add(counter);
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8203);
                    seq.run("xyzzy", "xyzzy");
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8204);
                    for (int j = 0; (((j < list.size()) && (__CLR4_4_16aw6awkcq4suyp.R.iget(8205) != 0 | true)) || (__CLR4_4_16aw6awkcq4suyp.R.iget(8206) == 0 & false)); j++) {
                        {
                            __CLR4_4_16aw6awkcq4suyp.R.inc(8207);
                            assertEquals(list.size() - j, (((RunCounter) (list.get(j))).count));
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.flushNeeded();
        }
    }

    @SuppressWarnings("rawtypes")
    @Test
    public void testEquals() throws Exception {
        __CLR4_4_16aw6awkcq4suyp.R.globalSliceStart(getClass().getName(), 8208);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6086c0();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_16aw6awkcq4suyp.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.composite.TestBinarySequence.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 8208, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6086c0() throws Exception {
        try {
            __CLR4_4_16aw6awkcq4suyp.R.inc(8208);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8209);
            BinarySequence<String, String> p = new BinarySequence<String, String>();
            __CLR4_4_16aw6awkcq4suyp.R.inc(8210);
            assertEquals(p, p);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8211);
            BinarySequence<String, String> q = new BinarySequence<String, String>();
            __CLR4_4_16aw6awkcq4suyp.R.inc(8212);
            assertObjectsAreEqual(p, q);
            __CLR4_4_16aw6awkcq4suyp.R.inc(8213);
            for (int i = 0; (((i < 3) && (__CLR4_4_16aw6awkcq4suyp.R.iget(8214) != 0 | true)) || (__CLR4_4_16aw6awkcq4suyp.R.iget(8215) == 0 & false)); i++) {
                {
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8216);
                    p.then(new NoOp());
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8217);
                    assertObjectsAreNotEqual(p, q);
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8218);
                    q.then(new NoOp());
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8219);
                    assertObjectsAreEqual(p, q);
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8220);
                    p.then(new BinarySequence<String, String>(new NoOp(), new NoOp()));
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8221);
                    assertObjectsAreNotEqual(p, q);
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8222);
                    q.then(new BinarySequence<String, String>(new NoOp(), new NoOp()));
                    __CLR4_4_16aw6awkcq4suyp.R.inc(8223);
                    assertObjectsAreEqual(p, q);
                }
            }
            __CLR4_4_16aw6awkcq4suyp.R.inc(8224);
            assertObjectsAreNotEqual(p, new NoOp());
            __CLR4_4_16aw6awkcq4suyp.R.inc(8225);
            assertObjectsAreNotEqual(p, new BinarySequence<String, String>((BinaryProcedure<String, String>[]) null));
            __CLR4_4_16aw6awkcq4suyp.R.inc(8226);
            assertObjectsAreNotEqual(p, new BinarySequence<String, String>((BinaryProcedure<String, String>) null));
            __CLR4_4_16aw6awkcq4suyp.R.inc(8227);
            assertObjectsAreNotEqual(p, new BinarySequence((Iterable<BinaryProcedure>) null));
            __CLR4_4_16aw6awkcq4suyp.R.inc(8228);
            Iterable<BinaryProcedure> iterable = Arrays.<BinaryProcedure>asList(new NoOp(), new BinarySequence<String, String>(new NoOp(), new NoOp()), new NoOp(), new BinarySequence<String, String>(new NoOp(), new NoOp()), new NoOp(), new BinarySequence<String, String>(new NoOp(), new NoOp()));
            __CLR4_4_16aw6awkcq4suyp.R.inc(8229);
            assertObjectsAreEqual(p, new BinarySequence(iterable));
            __CLR4_4_16aw6awkcq4suyp.R.inc(8230);
            assertTrue(!p.equals(null));
        } finally {
            __CLR4_4_16aw6awkcq4suyp.R.flushNeeded();
        }
    }

    // Classes
    // ------------------------------------------------------------------------
    static class RunCounter implements BinaryProcedure<String, String> {

        public void run(String a, String b) {
            try {
                __CLR4_4_16aw6awkcq4suyp.R.inc(8231);
                __CLR4_4_16aw6awkcq4suyp.R.inc(8232);
                count++;
            } finally {
                __CLR4_4_16aw6awkcq4suyp.R.flushNeeded();
            }
        }

        public int count = 0;
    }
}

