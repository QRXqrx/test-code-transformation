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
package org.apache.commons.functor.aggregator.functions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Random;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.aggregator.functions.DoubleMaxAggregatorBinaryFunction;
import org.junit.Test;

/**
 * Unit test for {@link DoubleMaxAggregatorBinaryFunction}.
 */
public class DoubleMaxAggregatorBinaryFunctionTest extends BaseFunctorTest {

    static class __CLR4_4_14ed4edkcq4suev {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 5727, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    // make room for some poor
    private static final double DELTA = 0.01;

    // floating point support
    @Override
    protected Object makeFunctor() throws Exception {
        try {
            __CLR4_4_14ed4edkcq4suev.R.inc(5701);
            __CLR4_4_14ed4edkcq4suev.R.inc(5702);
            return new DoubleMaxAggregatorBinaryFunction();
        } finally {
            __CLR4_4_14ed4edkcq4suev.R.flushNeeded();
        }
    }

    @Test
    public void testNulls() throws Exception {
        __CLR4_4_14ed4edkcq4suev.R.globalSliceStart(getClass().getName(), 5703);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1qr8a734ef();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14ed4edkcq4suev.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14ed4edkcq4suev.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.aggregator.functions.DoubleMaxAggregatorBinaryFunctionTest.testNulls", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 5703, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1qr8a734ef() throws Exception {
        try {
            __CLR4_4_14ed4edkcq4suev.R.inc(5703);
            __CLR4_4_14ed4edkcq4suev.R.inc(5704);
            DoubleMaxAggregatorBinaryFunction fct = (DoubleMaxAggregatorBinaryFunction) makeFunctor();
            __CLR4_4_14ed4edkcq4suev.R.inc(5705);
            Double d = fct.evaluate(null, null);
            __CLR4_4_14ed4edkcq4suev.R.inc(5706);
            assertNull(d);
            __CLR4_4_14ed4edkcq4suev.R.inc(5707);
            d = fct.evaluate(null, 1.0);
            __CLR4_4_14ed4edkcq4suev.R.inc(5708);
            assertEquals(1.0, d.doubleValue(), DELTA);
            __CLR4_4_14ed4edkcq4suev.R.inc(5709);
            d = fct.evaluate(2.0, null);
            __CLR4_4_14ed4edkcq4suev.R.inc(5710);
            assertEquals(2.0, d.doubleValue(), DELTA);
        } finally {
            __CLR4_4_14ed4edkcq4suev.R.flushNeeded();
        }
    }

    @Test
    public void testMax() throws Exception {
        __CLR4_4_14ed4edkcq4suev.R.globalSliceStart(getClass().getName(), 5711);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1hxwg3r4en();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14ed4edkcq4suev.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14ed4edkcq4suev.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.aggregator.functions.DoubleMaxAggregatorBinaryFunctionTest.testMax", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 5711, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1hxwg3r4en() throws Exception {
        try {
            __CLR4_4_14ed4edkcq4suev.R.inc(5711);
            __CLR4_4_14ed4edkcq4suev.R.inc(5712);
            DoubleMaxAggregatorBinaryFunction fct = (DoubleMaxAggregatorBinaryFunction) makeFunctor();
            __CLR4_4_14ed4edkcq4suev.R.inc(5713);
            double max = 0.0;
            __CLR4_4_14ed4edkcq4suev.R.inc(5714);
            double result = 0.0;
            __CLR4_4_14ed4edkcq4suev.R.inc(5715);
            double number1 = 0.0;
            __CLR4_4_14ed4edkcq4suev.R.inc(5716);
            double number2 = 0.0;
            __CLR4_4_14ed4edkcq4suev.R.inc(5717);
            int calls = 31;
            __CLR4_4_14ed4edkcq4suev.R.inc(5718);
            Random rnd = new Random();
            __CLR4_4_14ed4edkcq4suev.R.inc(5719);
            for (int i = 0; (((i < calls) && (__CLR4_4_14ed4edkcq4suev.R.iget(5720) != 0 | true)) || (__CLR4_4_14ed4edkcq4suev.R.iget(5721) == 0 & false)); i++) {
                {
                    __CLR4_4_14ed4edkcq4suev.R.inc(5722);
                    number1 = rnd.nextDouble();
                    __CLR4_4_14ed4edkcq4suev.R.inc(5723);
                    number2 = rnd.nextDouble();
                    __CLR4_4_14ed4edkcq4suev.R.inc(5724);
                    max = Math.max(number1, number2);
                    __CLR4_4_14ed4edkcq4suev.R.inc(5725);
                    result = fct.evaluate(number1, number2);
                    __CLR4_4_14ed4edkcq4suev.R.inc(5726);
                    assertEquals(result, max, DELTA);
                }
            }
        } finally {
            __CLR4_4_14ed4edkcq4suev.R.flushNeeded();
        }
    }
}

