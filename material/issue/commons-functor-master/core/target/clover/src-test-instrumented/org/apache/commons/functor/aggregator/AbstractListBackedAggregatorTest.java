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
package org.apache.commons.functor.aggregator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.aggregator.AbstractListBackedAggregator;
import org.junit.Test;

/**
 * Unit test for {@link AbstractListBackedAggregator}. TODO: revisit after the
 * class hierarchy change
 */
public class AbstractListBackedAggregatorTest extends BaseFunctorTest {

    static class __CLR4_4_146s46skcq4sudq {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 5540, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    @Override
    protected Object makeFunctor() throws Exception {
        try {
            __CLR4_4_146s46skcq4sudq.R.inc(5428);
            __CLR4_4_146s46skcq4sudq.R.inc(5429);
            return new TestListBackedAggregator<Object>();
        } finally {
            __CLR4_4_146s46skcq4sudq.R.flushNeeded();
        }
    }

    /**
     * Ensure <code>series</code> is created in constructor.
     */
    @Test
    public void testListCreated() throws Exception {
        __CLR4_4_146s46skcq4sudq.R.globalSliceStart(getClass().getName(), 5430);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1u8k0jj46u();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_146s46skcq4sudq.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_146s46skcq4sudq.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.aggregator.AbstractListBackedAggregatorTest.testListCreated", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 5430, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1u8k0jj46u() throws Exception {
        try {
            __CLR4_4_146s46skcq4sudq.R.inc(5430);
            __CLR4_4_146s46skcq4sudq.R.inc(5431);
            @SuppressWarnings("unchecked")
            TestListBackedAggregator<Object> fct = (TestListBackedAggregator<Object>) makeFunctor();
            __CLR4_4_146s46skcq4sudq.R.inc(5432);
            assertNotNull(fct.getSeries());
            __CLR4_4_146s46skcq4sudq.R.inc(5433);
            assertEquals(fct.getSeries().size(), 0);
        } finally {
            __CLR4_4_146s46skcq4sudq.R.flushNeeded();
        }
    }

    /**
     * Ensures beforeAdd/afterAdd is called correctly.
     */
    @Test
    public void testAdd() throws Exception {
        __CLR4_4_146s46skcq4sudq.R.globalSliceStart(getClass().getName(), 5434);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1vtx82e46y();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_146s46skcq4sudq.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_146s46skcq4sudq.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.aggregator.AbstractListBackedAggregatorTest.testAdd", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 5434, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1vtx82e46y() throws Exception {
        try {
            __CLR4_4_146s46skcq4sudq.R.inc(5434);
            __CLR4_4_146s46skcq4sudq.R.inc(5435);
            @SuppressWarnings("unchecked")
            TestListBackedAggregator<Object> fct = (TestListBackedAggregator<Object>) makeFunctor();
            // nearly 10 pies :)
            __CLR4_4_146s46skcq4sudq.R.inc(5436);
            // nearly 10 pies :)
            int calls = 31;
            __CLR4_4_146s46skcq4sudq.R.inc(5437);
            for (int i = 1; (((i <= calls) && (__CLR4_4_146s46skcq4sudq.R.iget(5438) != 0 | true)) || (__CLR4_4_146s46skcq4sudq.R.iget(5439) == 0 & false)); i++) {
                {
                    __CLR4_4_146s46skcq4sudq.R.inc(5440);
                    fct.add(new Object());
                    __CLR4_4_146s46skcq4sudq.R.inc(5441);
                    assertEquals(fct.getSeries().size(), i);
                    __CLR4_4_146s46skcq4sudq.R.inc(5442);
                    assertEquals(fct.callsCreateList, 0);
                }
            }
        } finally {
            __CLR4_4_146s46skcq4sudq.R.flushNeeded();
        }
    }

    @Test
    public void testReset() throws Exception {
        __CLR4_4_146s46skcq4sudq.R.globalSliceStart(getClass().getName(), 5443);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_16jq2kc477();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_146s46skcq4sudq.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_146s46skcq4sudq.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.aggregator.AbstractListBackedAggregatorTest.testReset", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 5443, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_16jq2kc477() throws Exception {
        try {
            __CLR4_4_146s46skcq4sudq.R.inc(5443);
            __CLR4_4_146s46skcq4sudq.R.inc(5444);
            @SuppressWarnings("unchecked")
            TestListBackedAggregator<Object> fct = (TestListBackedAggregator<Object>) makeFunctor();
            // nearly 10 pies :)
            __CLR4_4_146s46skcq4sudq.R.inc(5445);
            // nearly 10 pies :)
            int calls = 31;
            __CLR4_4_146s46skcq4sudq.R.inc(5446);
            for (int i = 1; (((i <= calls) && (__CLR4_4_146s46skcq4sudq.R.iget(5447) != 0 | true)) || (__CLR4_4_146s46skcq4sudq.R.iget(5448) == 0 & false)); i++) {
                {
                    __CLR4_4_146s46skcq4sudq.R.inc(5449);
                    fct.reset();
                    __CLR4_4_146s46skcq4sudq.R.inc(5450);
                    assertEquals(fct.getSeries().size(), 0);
                    __CLR4_4_146s46skcq4sudq.R.inc(5451);
                    assertEquals(fct.callsCreateList, 0);
                }
            }
        } finally {
            __CLR4_4_146s46skcq4sudq.R.flushNeeded();
        }
    }

    /**
     * Ensures beforeEvaluate/afterEvauate is called correctly.
     */
    @Test
    public void testEvaluate() throws Exception {
        __CLR4_4_146s46skcq4sudq.R.globalSliceStart(getClass().getName(), 5452);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1czkatq47g();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_146s46skcq4sudq.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_146s46skcq4sudq.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.aggregator.AbstractListBackedAggregatorTest.testEvaluate", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 5452, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1czkatq47g() throws Exception {
        try {
            __CLR4_4_146s46skcq4sudq.R.inc(5452);
            __CLR4_4_146s46skcq4sudq.R.inc(5453);
            @SuppressWarnings("unchecked")
            TestListBackedAggregator<Object> fct = (TestListBackedAggregator<Object>) makeFunctor();
            __CLR4_4_146s46skcq4sudq.R.inc(5454);
            TestFunction<Object> agg = (TestFunction<Object>) fct.getAggregationFunction();
            // nearly 10 pies :)
            __CLR4_4_146s46skcq4sudq.R.inc(5455);
            // nearly 10 pies :)
            int calls = 31;
            // test first without throwing an exception
            __CLR4_4_146s46skcq4sudq.R.inc(5456);
            for (int i = 1; (((i <= calls) && (__CLR4_4_146s46skcq4sudq.R.iget(5457) != 0 | true)) || (__CLR4_4_146s46skcq4sudq.R.iget(5458) == 0 & false)); i++) {
                {
                    __CLR4_4_146s46skcq4sudq.R.inc(5459);
                    Object o = fct.evaluate();
                    __CLR4_4_146s46skcq4sudq.R.inc(5460);
                    assertNull(o);
                    __CLR4_4_146s46skcq4sudq.R.inc(5461);
                    assertEquals(fct.getSeries().size(), 0);
                    __CLR4_4_146s46skcq4sudq.R.inc(5462);
                    assertEquals(agg.calls, i);
                    __CLR4_4_146s46skcq4sudq.R.inc(5463);
                    assertEquals(fct.callsCreateList, 0);
                }
            // now throw the exception and make sure we still count ok
            }
            __CLR4_4_146s46skcq4sudq.R.inc(5464);
            fct.resetUsage();
            __CLR4_4_146s46skcq4sudq.R.inc(5465);
            agg.exception = true;
            __CLR4_4_146s46skcq4sudq.R.inc(5466);
            boolean exc = false;
            __CLR4_4_146s46skcq4sudq.R.inc(5467);
            for (int i = 1; (((i <= calls) && (__CLR4_4_146s46skcq4sudq.R.iget(5468) != 0 | true)) || (__CLR4_4_146s46skcq4sudq.R.iget(5469) == 0 & false)); i++) {
                {
                    __CLR4_4_146s46skcq4sudq.R.inc(5470);
                    Object o = null;
                    __CLR4_4_146s46skcq4sudq.R.inc(5471);
                    exc = false;
                    __CLR4_4_146s46skcq4sudq.R.inc(5472);
                    try {
                        __CLR4_4_146s46skcq4sudq.R.inc(5473);
                        o = fct.evaluate();
                    } catch (Exception e) {
                        __CLR4_4_146s46skcq4sudq.R.inc(5474);
                        exc = true;
                    }
                    __CLR4_4_146s46skcq4sudq.R.inc(5475);
                    assertNull(o);
                    // make sure we have actually thrown it!
                    __CLR4_4_146s46skcq4sudq.R.inc(5476);
                    // make sure we have actually thrown it!
                    assertTrue(exc);
                    __CLR4_4_146s46skcq4sudq.R.inc(5477);
                    assertEquals(fct.getSeries().size(), 0);
                    __CLR4_4_146s46skcq4sudq.R.inc(5478);
                    assertEquals(agg.calls, i);
                    __CLR4_4_146s46skcq4sudq.R.inc(5479);
                    assertEquals(fct.callsCreateList, 0);
                }
            }
        } finally {
            __CLR4_4_146s46skcq4sudq.R.flushNeeded();
        }
    }

    /**
     * "Complete" add/evaluate/reset chain.
     */
    @Test
    public void testAddEvaluateReset() throws Exception {
        __CLR4_4_146s46skcq4sudq.R.globalSliceStart(getClass().getName(), 5480);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_17zj93m488();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_146s46skcq4sudq.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_146s46skcq4sudq.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.aggregator.AbstractListBackedAggregatorTest.testAddEvaluateReset", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 5480, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_17zj93m488() throws Exception {
        try {
            __CLR4_4_146s46skcq4sudq.R.inc(5480);
            __CLR4_4_146s46skcq4sudq.R.inc(5481);
            @SuppressWarnings("unchecked")
            TestListBackedAggregator<Object> fct = (TestListBackedAggregator<Object>) makeFunctor();
            __CLR4_4_146s46skcq4sudq.R.inc(5482);
            TestFunction<Object> agg = (TestFunction<Object>) fct.getAggregationFunction();
            // nearly 10 pies :)
            __CLR4_4_146s46skcq4sudq.R.inc(5483);
            // nearly 10 pies :)
            int callsAdd = 31;
            // circumference (i.e. 2 pies)
            __CLR4_4_146s46skcq4sudq.R.inc(5484);
            // circumference (i.e. 2 pies)
            int callsEvaluate = 2;
            __CLR4_4_146s46skcq4sudq.R.inc(5485);
            int callsReset = 17;
            __CLR4_4_146s46skcq4sudq.R.inc(5486);
            for (int i = 1; (((i <= callsAdd) && (__CLR4_4_146s46skcq4sudq.R.iget(5487) != 0 | true)) || (__CLR4_4_146s46skcq4sudq.R.iget(5488) == 0 & false)); i++) {
                __CLR4_4_146s46skcq4sudq.R.inc(5489);
                fct.add(new Object());
            }
            __CLR4_4_146s46skcq4sudq.R.inc(5490);
            assertEquals(fct.getSeries().size(), callsAdd);
            __CLR4_4_146s46skcq4sudq.R.inc(5491);
            assertEquals(agg.calls, 0);
            __CLR4_4_146s46skcq4sudq.R.inc(5492);
            assertEquals(fct.callsCreateList, 0);
            __CLR4_4_146s46skcq4sudq.R.inc(5493);
            for (int i = 1; (((i <= callsEvaluate) && (__CLR4_4_146s46skcq4sudq.R.iget(5494) != 0 | true)) || (__CLR4_4_146s46skcq4sudq.R.iget(5495) == 0 & false)); i++) {
                __CLR4_4_146s46skcq4sudq.R.inc(5496);
                fct.evaluate();
            }
            __CLR4_4_146s46skcq4sudq.R.inc(5497);
            assertEquals(fct.getSeries().size(), callsAdd);
            __CLR4_4_146s46skcq4sudq.R.inc(5498);
            assertEquals(agg.calls, callsEvaluate);
            __CLR4_4_146s46skcq4sudq.R.inc(5499);
            assertEquals(fct.callsCreateList, 0);
            __CLR4_4_146s46skcq4sudq.R.inc(5500);
            for (int i = 1; (((i <= callsReset) && (__CLR4_4_146s46skcq4sudq.R.iget(5501) != 0 | true)) || (__CLR4_4_146s46skcq4sudq.R.iget(5502) == 0 & false)); i++) {
                __CLR4_4_146s46skcq4sudq.R.inc(5503);
                fct.reset();
            }
            __CLR4_4_146s46skcq4sudq.R.inc(5504);
            assertEquals(fct.getSeries().size(), 0);
            __CLR4_4_146s46skcq4sudq.R.inc(5505);
            assertEquals(agg.calls, callsEvaluate);
            __CLR4_4_146s46skcq4sudq.R.inc(5506);
            assertEquals(fct.callsCreateList, 0);
        } finally {
            __CLR4_4_146s46skcq4sudq.R.flushNeeded();
        }
    }

    @Test
    public void testGetSize() throws Exception {
        __CLR4_4_146s46skcq4sudq.R.globalSliceStart(getClass().getName(), 5507);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1424v1o48z();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_146s46skcq4sudq.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_146s46skcq4sudq.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.aggregator.AbstractListBackedAggregatorTest.testGetSize", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 5507, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1424v1o48z() throws Exception {
        try {
            __CLR4_4_146s46skcq4sudq.R.inc(5507);
            __CLR4_4_146s46skcq4sudq.R.inc(5508);
            @SuppressWarnings("unchecked")
            TestListBackedAggregator<Object> fct = (TestListBackedAggregator<Object>) makeFunctor();
            // this decides how many adds we do at each
            __CLR4_4_146s46skcq4sudq.R.inc(5509);
            // this decides how many adds we do at each
            Random nAdds = new Random();
            // step
            __CLR4_4_146s46skcq4sudq.R.inc(5510);
            int callsAdd = 31;
            __CLR4_4_146s46skcq4sudq.R.inc(5511);
            int currSize = 0;
            // maximum objects to add in one cycle
            __CLR4_4_146s46skcq4sudq.R.inc(5512);
            // maximum objects to add in one cycle
            int maxAdds = 100;
            __CLR4_4_146s46skcq4sudq.R.inc(5513);
            for (int i = 0; (((i < callsAdd) && (__CLR4_4_146s46skcq4sudq.R.iget(5514) != 0 | true)) || (__CLR4_4_146s46skcq4sudq.R.iget(5515) == 0 & false)); i++) {
                {
                    __CLR4_4_146s46skcq4sudq.R.inc(5516);
                    int currAdds = nAdds.nextInt(maxAdds);
                    __CLR4_4_146s46skcq4sudq.R.inc(5517);
                    currSize += currAdds;
                    __CLR4_4_146s46skcq4sudq.R.inc(5518);
                    for (int j = 0; (((j < currAdds) && (__CLR4_4_146s46skcq4sudq.R.iget(5519) != 0 | true)) || (__CLR4_4_146s46skcq4sudq.R.iget(5520) == 0 & false)); j++) {
                        {
                            __CLR4_4_146s46skcq4sudq.R.inc(5521);
                            fct.add(new Object());
                        }
                    }
                    __CLR4_4_146s46skcq4sudq.R.inc(5522);
                    assertEquals(currSize, fct.getDataSize());
                }
            }
        } finally {
            __CLR4_4_146s46skcq4sudq.R.flushNeeded();
        }
    }

    /**
     * Dummy Function which counts the number of calls to
     * {@link #evaluate(List)}.
     */
    class TestFunction<T> implements Function<List<T>, T> {

        int calls = 0;

        // when set to true, evaluate will throw an
        boolean exception = false;

        // exception
        public T evaluate(List<T> obj) {
            try {
                __CLR4_4_146s46skcq4sudq.R.inc(5523);
                __CLR4_4_146s46skcq4sudq.R.inc(5524);
                calls++;
                __CLR4_4_146s46skcq4sudq.R.inc(5525);
                if ((((exception) && (__CLR4_4_146s46skcq4sudq.R.iget(5526) != 0 | true)) || (__CLR4_4_146s46skcq4sudq.R.iget(5527) == 0 & false))) {
                    __CLR4_4_146s46skcq4sudq.R.inc(5528);
                    throw new RuntimeException();
                }
                __CLR4_4_146s46skcq4sudq.R.inc(5529);
                return null;
            } finally {
                __CLR4_4_146s46skcq4sudq.R.flushNeeded();
            }
        }
    }

    /**
     * Dummy aggregator which counts calls to before/after functions.
     */
    class TestListBackedAggregator<T> extends AbstractListBackedAggregator<T> {

        int callsCreateList;

        public TestListBackedAggregator() {
            super(new TestFunction<T>());
            __CLR4_4_146s46skcq4sudq.R.inc(5531);
            try {
                __CLR4_4_146s46skcq4sudq.R.inc(5530);
                __CLR4_4_146s46skcq4sudq.R.inc(5532);
                resetUsage();
            } finally {
                __CLR4_4_146s46skcq4sudq.R.flushNeeded();
            }
        }

        /**
         * Convenience method to reset all counters to zero (rather than
         * creating a new instance of this)
         */
        public void resetUsage() {
            try {
                __CLR4_4_146s46skcq4sudq.R.inc(5533);
                __CLR4_4_146s46skcq4sudq.R.inc(5534);
                callsCreateList = 0;
                __CLR4_4_146s46skcq4sudq.R.inc(5535);
                TestFunction<T> fct = (TestFunction<T>) getAggregationFunction();
                __CLR4_4_146s46skcq4sudq.R.inc(5536);
                fct.calls = 0;
            } finally {
                __CLR4_4_146s46skcq4sudq.R.flushNeeded();
            }
        }

        @Override
        protected List<T> createList() {
            try {
                __CLR4_4_146s46skcq4sudq.R.inc(5537);
                // for the purpose of testing we'll be using a sync'd implementation
                // of List
                __CLR4_4_146s46skcq4sudq.R.inc(5538);
                callsCreateList++;
                __CLR4_4_146s46skcq4sudq.R.inc(5539);
                return new CopyOnWriteArrayList<T>();
            } finally {
                __CLR4_4_146s46skcq4sudq.R.flushNeeded();
            }
        }
    }
}

