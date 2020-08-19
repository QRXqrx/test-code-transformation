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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.aggregator.functions.DoubleSumAggregatorFunction;
import org.junit.Test;

/**
 * Unit test for {@link DoubleSumAggregatorFunction}.
 */
public class DoubleSumAggregatorFunctionTest extends BaseFunctorTest {

    static class __CLR4_4_14mi4mikcq4sugl {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 6028, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_14mi4mikcq4sugl.R.inc(5994);
            __CLR4_4_14mi4mikcq4sugl.R.inc(5995);
            return new DoubleSumAggregatorFunction();
        } finally {
            __CLR4_4_14mi4mikcq4sugl.R.flushNeeded();
        }
    }

    @Test
    public void testEmptyList() throws Exception {
        __CLR4_4_14mi4mikcq4sugl.R.globalSliceStart(getClass().getName(), 5996);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s6zsw4mk();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14mi4mikcq4sugl.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14mi4mikcq4sugl.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.aggregator.functions.DoubleSumAggregatorFunctionTest.testEmptyList", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 5996, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s6zsw4mk() throws Exception {
        try {
            __CLR4_4_14mi4mikcq4sugl.R.inc(5996);
            __CLR4_4_14mi4mikcq4sugl.R.inc(5997);
            DoubleSumAggregatorFunction fct = (DoubleSumAggregatorFunction) makeFunctor();
            __CLR4_4_14mi4mikcq4sugl.R.inc(5998);
            List<Double> lst = null;
            __CLR4_4_14mi4mikcq4sugl.R.inc(5999);
            Double res = fct.evaluate(lst);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6000);
            assertNull(res);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6001);
            lst = new ArrayList<Double>();
            __CLR4_4_14mi4mikcq4sugl.R.inc(6002);
            res = fct.evaluate(lst);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6003);
            assertNull(res);
        } finally {
            __CLR4_4_14mi4mikcq4sugl.R.flushNeeded();
        }
    }

    @Test
    public void testSum() throws Exception {
        __CLR4_4_14mi4mikcq4sugl.R.globalSliceStart(getClass().getName(), 6004);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1undh1c4ms();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_14mi4mikcq4sugl.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_14mi4mikcq4sugl.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.aggregator.functions.DoubleSumAggregatorFunctionTest.testSum", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6004, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1undh1c4ms() throws Exception {
        try {
            __CLR4_4_14mi4mikcq4sugl.R.inc(6004);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6005);
            DoubleSumAggregatorFunction fct = (DoubleSumAggregatorFunction) makeFunctor();
            __CLR4_4_14mi4mikcq4sugl.R.inc(6006);
            List<Double> lst = new ArrayList<Double>();
            __CLR4_4_14mi4mikcq4sugl.R.inc(6007);
            lst.add(0.0);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6008);
            double res = fct.evaluate(lst);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6009);
            assertEquals(res, 0.0, 0.01);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6010);
            lst.add(1.0);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6011);
            res = fct.evaluate(lst);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6012);
            assertEquals(res, 1.0, 0.01);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6013);
            lst.add(2.0);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6014);
            res = fct.evaluate(lst);
            __CLR4_4_14mi4mikcq4sugl.R.inc(6015);
            assertEquals(res, 3.0, 0.01);
            // finally carry out a random addition
            __CLR4_4_14mi4mikcq4sugl.R.inc(6016);
            lst.clear();
            __CLR4_4_14mi4mikcq4sugl.R.inc(6017);
            int calls = 31;
            __CLR4_4_14mi4mikcq4sugl.R.inc(6018);
            double total = 0.0;
            __CLR4_4_14mi4mikcq4sugl.R.inc(6019);
            Random rnd = new Random();
            __CLR4_4_14mi4mikcq4sugl.R.inc(6020);
            for (int i = 0; (((i < calls) && (__CLR4_4_14mi4mikcq4sugl.R.iget(6021) != 0 | true)) || (__CLR4_4_14mi4mikcq4sugl.R.iget(6022) == 0 & false)); i++) {
                {
                    __CLR4_4_14mi4mikcq4sugl.R.inc(6023);
                    double random = rnd.nextDouble();
                    __CLR4_4_14mi4mikcq4sugl.R.inc(6024);
                    lst.add(random);
                    __CLR4_4_14mi4mikcq4sugl.R.inc(6025);
                    total += random;
                    __CLR4_4_14mi4mikcq4sugl.R.inc(6026);
                    res = fct.evaluate(lst);
                    __CLR4_4_14mi4mikcq4sugl.R.inc(6027);
                    assertEquals(res, total, 0.01);
                }
            }
        } finally {
            __CLR4_4_14mi4mikcq4sugl.R.flushNeeded();
        }
    }
}

