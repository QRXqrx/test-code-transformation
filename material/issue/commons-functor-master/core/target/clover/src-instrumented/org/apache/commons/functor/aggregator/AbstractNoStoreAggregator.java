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

import org.apache.commons.functor.BinaryFunction;

/**
 * An implementation of an aggregator which doesn't store the data series but
 * instead it processes the data on the fly, as it arrives in
 * {@link #add(Object)} and stores the result after each addition. It processes
 * the data by using a {@link BinaryFunction} which takes the result of the
 * previous {@link #add(Object)} and the data passed in and returns a new result
 * which gets stored (for using again in the next call to {@link #add(Object)}.
 * The call to {@link #evaluate()} simply returns this stored value at any
 * point. This has a lower memory footprint compared to
 * {@link AbstractListBackedAggregator} however it only allows for simpler
 * processing on the data received.
 *
 * @param <T>
 *            Type of object stored.
 */
public abstract class AbstractNoStoreAggregator<T> extends AbstractTimedAggregator<T> {

    public static class __CLR4_4_1t9t9kcq4st8b {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 1077, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Function used to aggregate the data on the fly in {@link #add(Object)}.
     *
     * @see #add(Object)
     * @see #AbstractNoStoreAggregator(BinaryFunction)
     */
    private BinaryFunction<T, T, T> aggregationFunction;

    /**
     * Stores the result of the last {@link #add(Object)} operation.
     *
     * @see #add(Object)
     */
    private T result;

    /**
     * Similar to {@link #AbstractNoStoreAggregator(BinaryFunction, long)
     * AbstractNoStoreAggregator(aggregationFunction,0L)}.
     *
     * @param aggregationFunction
     *            Aggregation function to use in {@link #add(Object)}. Throws
     *            <code>NullPointerException</code> if this is <code>null</code>
     * @see #add(Object)
     * @see #aggregationFunction
     */
    public AbstractNoStoreAggregator(BinaryFunction<T, T, T> aggregationFunction) {
        this(aggregationFunction, 0L);
        __CLR4_4_1t9t9kcq4st8b.R.inc(1054);
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1053);
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }

    /**
     * Similar to
     * {@link #AbstractNoStoreAggregator(BinaryFunction, long,boolean)
     * AbstractNoStoreAggregator(aggregationFunction,0L,false)}.
     *
     * @param aggregationFunction
     *            Aggregation function to use in {@link #add(Object)}. Throws
     *            <code>NullPointerException</code> if this is <code>null</code>
     * @param interval
     *            interval in miliseconds to reset this aggregator
     * @see #add(Object)
     * @see #aggregationFunction
     */
    public AbstractNoStoreAggregator(BinaryFunction<T, T, T> aggregationFunction, long interval) {
        this(aggregationFunction, interval, false);
        __CLR4_4_1t9t9kcq4st8b.R.inc(1056);
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1055);
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }

    /**
     * Constructs an aggregator which will use the given function, reset itself
     * at the given interval and will use a shared timer on own private timer.
     * Simply prepares an aggregator which will use the given aggregation
     * function each time {@link #add(Object)} is called. Also it initializes
     * {@link #result} with the value returned by {@link #initialValue()}, thus
     * allowing subclasses to have a custom way of specifying the start value.
     *
     * @param aggregationFunction
     *            Aggregation function to use in {@link #add(Object)}. Throws
     *            <code>NullPointerException</code> if this is <code>null</code>
     * @param interval
     *            interval in miliseconds to reset this aggregator
     * @param useSharedTimer
     *            if set to true, it will use a shared timer, as per
     *            {@link AbstractTimedAggregator#AbstractTimedAggregator(long, boolean)}
     *            ; otherwise if it's false it will use its own timer instance
     * @see AbstractTimedAggregator#AbstractTimedAggregator(long, boolean)
     */
    public AbstractNoStoreAggregator(BinaryFunction<T, T, T> aggregationFunction, long interval, boolean useSharedTimer) {
        super(interval, useSharedTimer);
        __CLR4_4_1t9t9kcq4st8b.R.inc(1058);
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1057);
            __CLR4_4_1t9t9kcq4st8b.R.inc(1059);
            this.aggregationFunction = aggregationFunction;
            __CLR4_4_1t9t9kcq4st8b.R.inc(1060);
            result = initialValue();
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }

    /**
     * Receives data to be aggregated/processed on the fly. This implementation
     * simply calls {@link #aggregationFunction} and stores the result.
     *
     * @param data
     *            Data to aggregate
     */
    @Override
    protected final void doAdd(T data) {
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1061);
            __CLR4_4_1t9t9kcq4st8b.R.inc(1062);
            result = aggregationFunction.evaluate(result, data);
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }

    /**
     * Returns the value already computed and stored in {@link #result}.
     *
     * @return Current (aggregated) value stored in {@link #result}
     * @see Aggregator#evaluate()
     */
    @Override
    protected final T doEvaluate() {
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1063);
            __CLR4_4_1t9t9kcq4st8b.R.inc(1064);
            return result;
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }

    /**
     * Resets the {@link #result} member to the {@link #initialValue()}.
     *
     * @see #initialValue()
     */
    @Override
    protected final void doReset() {
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1065);
            __CLR4_4_1t9t9kcq4st8b.R.inc(1066);
            result = initialValue();
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }

    /**
     * Allows subclasses to define the "initial" value. This value will be
     * stored in {@link #result} when an instance of this class is created or
     * when {@link #reset()} is called.
     *
     * @return Initial value to be used in {@link #result}.
     */
    protected abstract T initialValue();

    /**
     * Getter for {@link #aggregationFunction}.
     *
     * @return Current value of the member.
     */
    final BinaryFunction<T, T, T> getAggregationFunction() {
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1067);
            __CLR4_4_1t9t9kcq4st8b.R.inc(1068);
            return aggregationFunction;
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }

    /**
     * Getter for {@link #result}. Provided for test purposes only.
     *
     * @return Current value of the aggregated data.
     */
    final T getResult() {
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1069);
            __CLR4_4_1t9t9kcq4st8b.R.inc(1070);
            return result;
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }

    /**
     * Setter for {@link #result}. Provided for test purposes only.
     *
     * @param result
     *            New value to store in {@link #result}
     */
    final void setResult(T result) {
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1071);
            __CLR4_4_1t9t9kcq4st8b.R.inc(1072);
            this.result = result;
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }

    /**
     * This aggregator doesn't store any data, so the data series size is always
     * 0 (zero).
     *
     * @return 0
     */
    @Override
    protected int retrieveDataSize() {
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1073);
            __CLR4_4_1t9t9kcq4st8b.R.inc(1074);
            return 0;
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }

    @Override
    public String toString() {
        try {
            __CLR4_4_1t9t9kcq4st8b.R.inc(1075);
            __CLR4_4_1t9t9kcq4st8b.R.inc(1076);
            return AbstractNoStoreAggregator.class.getName();
        } finally {
            __CLR4_4_1t9t9kcq4st8b.R.flushNeeded();
        }
    }
}

