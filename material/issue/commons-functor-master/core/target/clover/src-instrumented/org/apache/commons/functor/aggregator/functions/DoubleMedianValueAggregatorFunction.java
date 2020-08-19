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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.functor.Function;

/**
 * Aggregator function to be used with subclasses of
 * {@link org.apache.commons.functor.aggregator.AbstractListBackedAggregator}
 * which computes the <a href="http://en.wikipedia.org/wiki/Median">median</a>
 * of all the numbers in the list.
 */
public final class DoubleMedianValueAggregatorFunction implements Function<List<Double>, Double> {

    public static class __CLR4_4_1y7y7kcq4sta2 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 1261, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Flag to indicate whether we are going to operate on a copy of the list
     * given or not. In order to compute the median, we need to sort the list
     * first (and then choose the item in the middle). This function offers 2
     * ways of doing the sorting:
     * <ul>
     * <li>by sorting (modifying) the original list (<code>useCopy=false</code>)
     * </li>
     * <li>by operating on a copy of the original list and leaving the original
     * untouched (<code>useCopy=true</code>)</li>
     * </ul>
     * NOTE: While using a copy ensures the original list is untouched, it does
     * mean we are creating a temporary list for the purpose of this computation
     * so it will have an impact on memory!
     */
    private boolean useCopy;

    /**
     * By default create a function which will operate on a copy of the original
     * list ({@link #useCopy} = true).
     *
     * @see #useCopy
     */
    public DoubleMedianValueAggregatorFunction() {
        this(true);
        __CLR4_4_1y7y7kcq4sta2.R.inc(1232);
        try {
            __CLR4_4_1y7y7kcq4sta2.R.inc(1231);
        } finally {
            __CLR4_4_1y7y7kcq4sta2.R.flushNeeded();
        }
    }

    /**
     * Constructor which allows the caller to specify whether to operate on the
     * original list or a copy of it.
     *
     * @param useCopy
     *            Set to true to operate on a copy of the list or false to
     *            operate on the original list.
     * @see #useCopy
     */
    public DoubleMedianValueAggregatorFunction(boolean useCopy) {
        try {
            __CLR4_4_1y7y7kcq4sta2.R.inc(1233);
            __CLR4_4_1y7y7kcq4sta2.R.inc(1234);
            this.useCopy = useCopy;
        } finally {
            __CLR4_4_1y7y7kcq4sta2.R.flushNeeded();
        }
    }

    /**
     * Getter for {@link #useCopy}.
     *
     * @return Current value of {@link #useCopy}.
     * @see #useCopy
     */
    public boolean isUseCopy() {
        try {
            __CLR4_4_1y7y7kcq4sta2.R.inc(1235);
            __CLR4_4_1y7y7kcq4sta2.R.inc(1236);
            return useCopy;
        } finally {
            __CLR4_4_1y7y7kcq4sta2.R.flushNeeded();
        }
    }

    /**
     * Sorts the given list and chooses the median value. The sorting can be
     * carried out against the original list or a copy of it, based on the value
     * of {@link #useCopy}.
     *
     * @param data
     *            List to compute the median value for
     * @return the median value of the given list or <code>null</code> if the
     *         list is <code>null</code> or empty.
     */
    public Double evaluate(List<Double> data) {
        try {
            __CLR4_4_1y7y7kcq4sta2.R.inc(1237);
            __CLR4_4_1y7y7kcq4sta2.R.inc(1238);
            if ((((data == null || data.size() == 0) && (__CLR4_4_1y7y7kcq4sta2.R.iget(1239) != 0 | true)) || (__CLR4_4_1y7y7kcq4sta2.R.iget(1240) == 0 & false))) {
                {
                    __CLR4_4_1y7y7kcq4sta2.R.inc(1241);
                    return null;
                }
            // if only one element in it, it is the mean
            }
            __CLR4_4_1y7y7kcq4sta2.R.inc(1242);
            if ((((data.size() == 1) && (__CLR4_4_1y7y7kcq4sta2.R.iget(1243) != 0 | true)) || (__CLR4_4_1y7y7kcq4sta2.R.iget(1244) == 0 & false))) {
                {
                    __CLR4_4_1y7y7kcq4sta2.R.inc(1245);
                    return data.get(0);
                }
            }
            __CLR4_4_1y7y7kcq4sta2.R.inc(1246);
            List<Double> copy = data;
            __CLR4_4_1y7y7kcq4sta2.R.inc(1247);
            if ((((useCopy) && (__CLR4_4_1y7y7kcq4sta2.R.iget(1248) != 0 | true)) || (__CLR4_4_1y7y7kcq4sta2.R.iget(1249) == 0 & false))) {
                {
                    __CLR4_4_1y7y7kcq4sta2.R.inc(1250);
                    copy = new ArrayList<Double>(data);
                }
            }
            __CLR4_4_1y7y7kcq4sta2.R.inc(1251);
            Collections.sort(copy);
            __CLR4_4_1y7y7kcq4sta2.R.inc(1252);
            int n = copy.size();
            __CLR4_4_1y7y7kcq4sta2.R.inc(1253);
            int middle = n / 2;
            __CLR4_4_1y7y7kcq4sta2.R.inc(1254);
            if ((((n % 2 == 0) && (__CLR4_4_1y7y7kcq4sta2.R.iget(1255) != 0 | true)) || (__CLR4_4_1y7y7kcq4sta2.R.iget(1256) == 0 & false))) {
                {
                    // need to compute the mean of middle and middle-1 (zero based
                    // index!)
                    __CLR4_4_1y7y7kcq4sta2.R.inc(1257);
                    return (copy.get(middle) + copy.get(middle - 1)) / 2;
                }
            // we're already positioned on the element in the middle so just return
            // it
            }
            __CLR4_4_1y7y7kcq4sta2.R.inc(1258);
            return copy.get(middle);
        } finally {
            __CLR4_4_1y7y7kcq4sta2.R.flushNeeded();
        }
    }

    @Override
    public String toString() {
        try {
            __CLR4_4_1y7y7kcq4sta2.R.inc(1259);
            __CLR4_4_1y7y7kcq4sta2.R.inc(1260);
            return DoubleMedianValueAggregatorFunction.class.getName();
        } finally {
            __CLR4_4_1y7y7kcq4sta2.R.flushNeeded();
        }
    }
}

