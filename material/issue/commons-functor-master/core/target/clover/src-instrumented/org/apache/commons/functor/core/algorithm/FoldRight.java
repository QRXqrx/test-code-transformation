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
package org.apache.commons.functor.core.algorithm;

import java.util.Stack;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.Generator;

/**
 * Functional right-fold algorithm against the elements of a {@link Generator}.
 * Uses the seed object (if supplied) as the initial right-side argument to the {@link BinaryFunction},
 * then uses the result of that evaluation as the next right-side argument, until the {@link Generator}'s
 * elements have been expended.
 *
 * @param <T> the returned evaluation type.
 * @version $Revision$ $Date$
 */
public class FoldRight<T> implements Function<Generator<T>, T>, BinaryFunction<Generator<T>, T, T> {

    public static class __CLR4_4_11ej1ejkcq4stfy {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 1868, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Helper class.
     *
     * @param <T> the returned evaluation type.
     */
    private static class FoldRightHelper<T> implements Procedure<T> {

        /**
         * The stack where storing the wrapped function evaluations.
         */
        private final Stack<T> stk = new Stack<T>();

        /**
         * The wrapped function.
         */
        private final BinaryFunction<? super T, ? super T, ? extends T> function;

        /**
         * The seed object.
         */
        private final T seed;

        /**
         * Flag to check the helper started or not.
         */
        private final boolean hasSeed;

        /**
         * Create a seedless FoldRightHelper.
         *
         * @param function The wrapped function
         */
        public FoldRightHelper(BinaryFunction<? super T, ? super T, ? extends T> function) {
            this(null, function);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1820);
            try {
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1819);
            } finally {
                __CLR4_4_11ej1ejkcq4stfy.R.flushNeeded();
            }
        }

        /**
         * Create a new FoldRightHelper.
         *
         * @param seed initial right-side argument
         * @param function The wrapped function
         */
        FoldRightHelper(T seed, BinaryFunction<? super T, ? super T, ? extends T> function) {
            try {
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1821);
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1822);
                this.seed = seed;
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1823);
                hasSeed = (((seed != null) && (__CLR4_4_11ej1ejkcq4stfy.R.iget(1824) != 0 | true)) || (__CLR4_4_11ej1ejkcq4stfy.R.iget(1825) == 0 & false)) ? true : false;
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1826);
                this.function = function;
            } finally {
                __CLR4_4_11ej1ejkcq4stfy.R.flushNeeded();
            }
        }

        /**
         * {@inheritDoc}
         */
        public void run(T obj) {
            try {
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1827);
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1828);
                stk.push(obj);
            } finally {
                __CLR4_4_11ej1ejkcq4stfy.R.flushNeeded();
            }
        }

        /**
         * Get result after processing.
         * Get current result.
         * @return Object
         */
        T getResult() {
            try {
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1829);
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1830);
                T right = seed;
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1831);
                if ((((!hasSeed) && (__CLR4_4_11ej1ejkcq4stfy.R.iget(1832) != 0 | true)) || (__CLR4_4_11ej1ejkcq4stfy.R.iget(1833) == 0 & false))) {
                    {
                        __CLR4_4_11ej1ejkcq4stfy.R.inc(1834);
                        if ((((stk.isEmpty()) && (__CLR4_4_11ej1ejkcq4stfy.R.iget(1835) != 0 | true)) || (__CLR4_4_11ej1ejkcq4stfy.R.iget(1836) == 0 & false))) {
                            {
                                __CLR4_4_11ej1ejkcq4stfy.R.inc(1837);
                                return null;
                            }
                        }
                        __CLR4_4_11ej1ejkcq4stfy.R.inc(1838);
                        right = stk.pop();
                    }
                }
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1839);
                while ((((!stk.isEmpty()) && (__CLR4_4_11ej1ejkcq4stfy.R.iget(1840) != 0 | true)) || (__CLR4_4_11ej1ejkcq4stfy.R.iget(1841) == 0 & false))) {
                    {
                        __CLR4_4_11ej1ejkcq4stfy.R.inc(1842);
                        right = function.evaluate(stk.pop(), right);
                    }
                }
                __CLR4_4_11ej1ejkcq4stfy.R.inc(1843);
                return right;
            } finally {
                __CLR4_4_11ej1ejkcq4stfy.R.flushNeeded();
            }
        }
    }

    /**
     * {@link BinaryFunction} to apply to each (seed, next).
     */
    private final BinaryFunction<? super T, ? super T, ? extends T> function;

    /**
     * Create a new FoldRight.
     * @param function {@link BinaryFunction} to apply to each (seed, next)
     */
    public FoldRight(BinaryFunction<? super T, ? super T, ? extends T> function) {
        try {
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1844);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1845);
            this.function = function;
        } finally {
            __CLR4_4_11ej1ejkcq4stfy.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     * @param obj {@link Generator} to transform
     */
    public final T evaluate(Generator<T> obj) {
        try {
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1846);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1847);
            FoldRightHelper<T> helper = new FoldRightHelper<T>(function);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1848);
            obj.run(helper);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1849);
            return helper.getResult();
        } finally {
            __CLR4_4_11ej1ejkcq4stfy.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     * @param left {@link Generator} to transform
     * @param right initial right-side seed object
     */
    public final T evaluate(Generator<T> left, T right) {
        try {
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1850);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1851);
            FoldRightHelper<T> helper = new FoldRightHelper<T>(right, function);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1852);
            left.run(helper);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1853);
            return helper.getResult();
        } finally {
            __CLR4_4_11ej1ejkcq4stfy.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(Object obj) {
        try {
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1854);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1855);
            if ((((obj == this) && (__CLR4_4_11ej1ejkcq4stfy.R.iget(1856) != 0 | true)) || (__CLR4_4_11ej1ejkcq4stfy.R.iget(1857) == 0 & false))) {
                {
                    __CLR4_4_11ej1ejkcq4stfy.R.inc(1858);
                    return true;
                }
            }
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1859);
            if ((((!(obj instanceof FoldRight<?>)) && (__CLR4_4_11ej1ejkcq4stfy.R.iget(1860) != 0 | true)) || (__CLR4_4_11ej1ejkcq4stfy.R.iget(1861) == 0 & false))) {
                {
                    __CLR4_4_11ej1ejkcq4stfy.R.inc(1862);
                    return false;
                }
            }
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1863);
            return ((FoldRight<?>) obj).function.equals(function);
        } finally {
            __CLR4_4_11ej1ejkcq4stfy.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1864);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1865);
            return "FoldRight".hashCode() << 2 ^ function.hashCode();
        } finally {
            __CLR4_4_11ej1ejkcq4stfy.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1866);
            __CLR4_4_11ej1ejkcq4stfy.R.inc(1867);
            return "FoldRight<" + function + ">";
        } finally {
            __CLR4_4_11ej1ejkcq4stfy.R.flushNeeded();
        }
    }
}

