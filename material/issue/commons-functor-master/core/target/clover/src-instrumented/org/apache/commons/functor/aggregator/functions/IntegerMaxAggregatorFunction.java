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

import java.util.List;
import org.apache.commons.functor.Function;

/**
 * Aggregator function to be used with subclasses of
 * {@link org.apache.commons.functor.aggregator.AbstractListBackedAggregator}
 * which finds the maximum number in a list. It does this by traversing the list
 * (once) -- so the complexity of this will be <i>O(n)</i>.
 */
public class IntegerMaxAggregatorFunction implements Function<List<Integer>, Integer> {

    public static class __CLR4_4_1118118kcq4stb2 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 1358, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Does the actual traversal of the list and finds the maximum value then
     * returns the result. Please note that caller is responsible for
     * synchronizing access to the list.
     *
     * @param data
     *            List to traverse and find max
     * @return max number in the list or null if the list is empty.
     */
    public Integer evaluate(List<Integer> data) {
        try {
            __CLR4_4_1118118kcq4stb2.R.inc(1340);
            __CLR4_4_1118118kcq4stb2.R.inc(1341);
            if ((((data == null || data.size() == 0) && (__CLR4_4_1118118kcq4stb2.R.iget(1342) != 0 | true)) || (__CLR4_4_1118118kcq4stb2.R.iget(1343) == 0 & false))) {
                {
                    __CLR4_4_1118118kcq4stb2.R.inc(1344);
                    return null;
                }
            }
            __CLR4_4_1118118kcq4stb2.R.inc(1345);
            Integer max = null;
            __CLR4_4_1118118kcq4stb2.R.inc(1346);
            for (Integer d : data) {
                {
                    __CLR4_4_1118118kcq4stb2.R.inc(1347);
                    if ((((max == null) && (__CLR4_4_1118118kcq4stb2.R.iget(1348) != 0 | true)) || (__CLR4_4_1118118kcq4stb2.R.iget(1349) == 0 & false))) {
                        {
                            __CLR4_4_1118118kcq4stb2.R.inc(1350);
                            max = d;
                        }
                    } else {
                        {
                            __CLR4_4_1118118kcq4stb2.R.inc(1351);
                            if ((((max.intValue() < d.intValue()) && (__CLR4_4_1118118kcq4stb2.R.iget(1352) != 0 | true)) || (__CLR4_4_1118118kcq4stb2.R.iget(1353) == 0 & false))) {
                                {
                                    __CLR4_4_1118118kcq4stb2.R.inc(1354);
                                    max = d;
                                }
                            }
                        }
                    }
                }
            }
            __CLR4_4_1118118kcq4stb2.R.inc(1355);
            return max;
        } finally {
            __CLR4_4_1118118kcq4stb2.R.flushNeeded();
        }
    }

    @Override
    public String toString() {
        try {
            __CLR4_4_1118118kcq4stb2.R.inc(1356);
            __CLR4_4_1118118kcq4stb2.R.inc(1357);
            return IntegerMaxAggregatorFunction.class.getName();
        } finally {
            __CLR4_4_1118118kcq4stb2.R.flushNeeded();
        }
    }
}

