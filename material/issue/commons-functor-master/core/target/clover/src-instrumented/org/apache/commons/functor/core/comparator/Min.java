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
package org.apache.commons.functor.core.comparator;

import java.util.Comparator;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.adapter.RightBoundFunction;
import org.apache.commons.lang3.Validate;

/**
 * Adapts a {@link Comparator Comparator} to the
 * {@link BinaryFunction} interface.
 *
 * @param <T> the binary function arguments and return types.
 * @version $Revision$ $Date$
 */
public final class Min<T> implements BinaryFunction<T, T, T> {

    public static class __CLR4_4_11z81z8kcq4stm9 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 2591, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Basic Min instance.
     */
    public static final Min<Comparable<?>> INSTANCE = Min.<Comparable<?>>instance();

    /**
     * The wrapped comparator.
     */
    private final Comparator<T> comparator;

    /**
     * Create a new Min.
     */
    @SuppressWarnings("unchecked")
    public Min() {
        this((Comparator<T>) ComparableComparator.INSTANCE);
        __CLR4_4_11z81z8kcq4stm9.R.inc(2565);
        try {
            __CLR4_4_11z81z8kcq4stm9.R.inc(2564);
        } finally {
            __CLR4_4_11z81z8kcq4stm9.R.flushNeeded();
        }
    }

    /**
     * Create a new Min.
     * @param comparator to use
     */
    public Min(Comparator<T> comparator) {
        try {
            __CLR4_4_11z81z8kcq4stm9.R.inc(2566);
            __CLR4_4_11z81z8kcq4stm9.R.inc(2567);
            this.comparator = Validate.notNull(comparator, "Comparator argument must not be null");
        } finally {
            __CLR4_4_11z81z8kcq4stm9.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public T evaluate(T left, T right) {
        try {
            __CLR4_4_11z81z8kcq4stm9.R.inc(2568);
            __CLR4_4_11z81z8kcq4stm9.R.inc(2569);
            return ((((comparator.compare(left, right) <= 0)) && (__CLR4_4_11z81z8kcq4stm9.R.iget(2570) != 0 | true)) || (__CLR4_4_11z81z8kcq4stm9.R.iget(2571) == 0 & false)) ? left : right;
        } finally {
            __CLR4_4_11z81z8kcq4stm9.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_11z81z8kcq4stm9.R.inc(2572);
            __CLR4_4_11z81z8kcq4stm9.R.inc(2573);
            if ((((obj == this) && (__CLR4_4_11z81z8kcq4stm9.R.iget(2574) != 0 | true)) || (__CLR4_4_11z81z8kcq4stm9.R.iget(2575) == 0 & false))) {
                {
                    __CLR4_4_11z81z8kcq4stm9.R.inc(2576);
                    return true;
                }
            }
            __CLR4_4_11z81z8kcq4stm9.R.inc(2577);
            if ((((!(obj instanceof Min<?>)) && (__CLR4_4_11z81z8kcq4stm9.R.iget(2578) != 0 | true)) || (__CLR4_4_11z81z8kcq4stm9.R.iget(2579) == 0 & false))) {
                {
                    __CLR4_4_11z81z8kcq4stm9.R.inc(2580);
                    return false;
                }
            }
            __CLR4_4_11z81z8kcq4stm9.R.inc(2581);
            Min<?> that = (Min<?>) obj;
            __CLR4_4_11z81z8kcq4stm9.R.inc(2582);
            return this.comparator.equals(that.comparator);
        } finally {
            __CLR4_4_11z81z8kcq4stm9.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_11z81z8kcq4stm9.R.inc(2583);
            __CLR4_4_11z81z8kcq4stm9.R.inc(2584);
            return "Min".hashCode() ^ comparator.hashCode();
        } finally {
            __CLR4_4_11z81z8kcq4stm9.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_11z81z8kcq4stm9.R.inc(2585);
            __CLR4_4_11z81z8kcq4stm9.R.inc(2586);
            return "Min<" + comparator + ">";
        } finally {
            __CLR4_4_11z81z8kcq4stm9.R.flushNeeded();
        }
    }

    /**
     * Get a basic Min instance.
     *
     * @param <T> the binary function arguments and return types.
     * @return Min
     */
    public static <T extends Comparable<?>> Min<T> instance() {
        try {
            __CLR4_4_11z81z8kcq4stm9.R.inc(2587);
            __CLR4_4_11z81z8kcq4stm9.R.inc(2588);
            return new Min<T>();
        } finally {
            __CLR4_4_11z81z8kcq4stm9.R.flushNeeded();
        }
    }

    /**
     * Get a Min Function.
     *
     * @param <T> the binary function arguments and return types.
     * @param right the right side argument of the Min function
     * @return Function<T, T>
     */
    public static <T extends Comparable<?>> Function<T, T> instance(T right) {
        try {
            __CLR4_4_11z81z8kcq4stm9.R.inc(2589);
            __CLR4_4_11z81z8kcq4stm9.R.inc(2590);
            return RightBoundFunction.bind(new Min<T>(), right);
        } finally {
            __CLR4_4_11z81z8kcq4stm9.R.flushNeeded();
        }
    }
}

