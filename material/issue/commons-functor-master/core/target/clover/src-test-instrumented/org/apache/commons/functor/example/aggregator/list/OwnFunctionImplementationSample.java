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
package org.apache.commons.functor.example.aggregator.list;

import java.util.List;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.aggregator.ArrayListBackedAggregator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Shows how to implement own aggregation function with a List-backed
 * aggregator. In this example we want to monitor whether a certain value
 * appears in the list or not.
 */
public class OwnFunctionImplementationSample {

    public static class __CLR4_4_17ex7exkcq4sv8e {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 9646, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    /**
     * This function returns the index of the first occurrence in the list of
     * the given value.
     */
    static class OwnFunction implements Function<List<Integer>, Integer> {

        /**
         * Value to find in the list.
         */
        private int valueToFind;

        public OwnFunction(int valueToFind) {
            try {
                __CLR4_4_17ex7exkcq4sv8e.R.inc(9631);
                __CLR4_4_17ex7exkcq4sv8e.R.inc(9632);
                this.valueToFind = valueToFind;
            } finally {
                __CLR4_4_17ex7exkcq4sv8e.R.flushNeeded();
            }
        }

        /**
         * Search in the list and find the first index of the given value.
         *
         * @param lst
         *            List to search in
         * @return index of {@link #valueToFind} if found or -1 if value not
         *         present in the list
         */
        public Integer evaluate(List<Integer> lst) {
            try {
                __CLR4_4_17ex7exkcq4sv8e.R.inc(9633);
                __CLR4_4_17ex7exkcq4sv8e.R.inc(9634);
                if ((((lst == null || lst.size() == 0) && (__CLR4_4_17ex7exkcq4sv8e.R.iget(9635) != 0 | true)) || (__CLR4_4_17ex7exkcq4sv8e.R.iget(9636) == 0 & false))) {
                    {
                        __CLR4_4_17ex7exkcq4sv8e.R.inc(9637);
                        return -1;
                    }
                }
                __CLR4_4_17ex7exkcq4sv8e.R.inc(9638);
                for (int i = 0; (((i < lst.size()) && (__CLR4_4_17ex7exkcq4sv8e.R.iget(9639) != 0 | true)) || (__CLR4_4_17ex7exkcq4sv8e.R.iget(9640) == 0 & false)); i++) {
                    {
                        __CLR4_4_17ex7exkcq4sv8e.R.inc(9641);
                        if ((((lst.get(i).intValue() == valueToFind) && (__CLR4_4_17ex7exkcq4sv8e.R.iget(9642) != 0 | true)) || (__CLR4_4_17ex7exkcq4sv8e.R.iget(9643) == 0 & false))) {
                            {
                                __CLR4_4_17ex7exkcq4sv8e.R.inc(9644);
                                return i;
                            }
                        }
                    }
                }
                __CLR4_4_17ex7exkcq4sv8e.R.inc(9645);
                return -1;
            } finally {
                __CLR4_4_17ex7exkcq4sv8e.R.flushNeeded();
            }
        }
    }

    @Test
    public void findValue() throws Exception {
        try {
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9609);
            // we're looking for 10
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9610);
            ArrayListBackedAggregator<Integer> agg = new ArrayListBackedAggregator<Integer>(new OwnFunction(10));
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9611);
            int eval = agg.evaluate();
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9612);
            assertEquals(eval, -1);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9613);
            agg.add(1);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9614);
            eval = agg.evaluate();
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9615);
            assertEquals(eval, -1);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9616);
            agg.add(2);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9617);
            eval = agg.evaluate();
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9618);
            assertEquals(eval, -1);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9619);
            agg.add(10);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9620);
            eval = agg.evaluate();
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9621);
            assertEquals(eval, 2);
            // function finds FIRST occurence!
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9622);
            agg.add(10);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9623);
            eval = agg.evaluate();
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9624);
            assertEquals(eval, 2);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9625);
            agg.add(10);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9626);
            eval = agg.evaluate();
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9627);
            assertEquals(eval, 2);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9628);
            agg.add(10);
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9629);
            eval = agg.evaluate();
            __CLR4_4_17ex7exkcq4sv8e.R.inc(9630);
            assertEquals(eval, 2);
        } finally {
            __CLR4_4_17ex7exkcq4sv8e.R.flushNeeded();
        }
    }
}

