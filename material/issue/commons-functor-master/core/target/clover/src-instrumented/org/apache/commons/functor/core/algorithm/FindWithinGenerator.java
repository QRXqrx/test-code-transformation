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

import java.util.NoSuchElementException;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.Generator;

/**
 * Return the first Object in a {@link Generator} matching a {@link Predicate}.
 *
 * @param <E> the arguments type.
 * @version $Revision$ $Date$
 */
public final class FindWithinGenerator<E> implements BinaryFunction<Generator<? extends E>, Predicate<? super E>, E> {

    public static class __CLR4_4_11bv1bvkcq4stfe {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 1776, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Basic instance.
     */
    public static final FindWithinGenerator<Object> INSTANCE = new FindWithinGenerator<Object>();

    /**
     * Helper procedure.
     *
     * @param <T> the argument type.
     */
    private static class FindProcedure<T> implements Procedure<T> {

        /**
         * The object found, if any.
         */
        private T found;

        /**
         * Flag to mark an object has been found.
         */
        private boolean wasFound;

        /**
         * The adapted predicate.
         */
        private Predicate<? super T> pred;

        /**
         * Create a new FindProcedure.
         * @param pred the adapted predicate.
         */
        public FindProcedure(Predicate<? super T> pred) {
            try {
                __CLR4_4_11bv1bvkcq4stfe.R.inc(1723);
                __CLR4_4_11bv1bvkcq4stfe.R.inc(1724);
                this.pred = pred;
            } finally {
                __CLR4_4_11bv1bvkcq4stfe.R.flushNeeded();
            }
        }

        /**
         * {@inheritDoc}
         */
        public void run(T obj) {
            try {
                __CLR4_4_11bv1bvkcq4stfe.R.inc(1725);
                __CLR4_4_11bv1bvkcq4stfe.R.inc(1726);
                if ((((!wasFound && pred.test(obj)) && (__CLR4_4_11bv1bvkcq4stfe.R.iget(1727) != 0 | true)) || (__CLR4_4_11bv1bvkcq4stfe.R.iget(1728) == 0 & false))) {
                    {
                        __CLR4_4_11bv1bvkcq4stfe.R.inc(1729);
                        wasFound = true;
                        __CLR4_4_11bv1bvkcq4stfe.R.inc(1730);
                        found = obj;
                    }
                }
            } finally {
                __CLR4_4_11bv1bvkcq4stfe.R.flushNeeded();
            }
        }
    }

    /**
     * Flag to mark the {@link FindWithinGenerator#evaluate(Generator, Predicate)} method must return a user
     * defined object when the adapted procedure does not find any object.
     */
    private final boolean useIfNone;

    /**
     * Object to be returned in the case the adapted procedure does not find any object.
     */
    private final E ifNone;

    /**
     * Create a new FindWithinGenerator.
     */
    public FindWithinGenerator() {
        super();
        __CLR4_4_11bv1bvkcq4stfe.R.inc(1732);
        try {
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1731);
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1733);
            ifNone = null;
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1734);
            useIfNone = false;
        } finally {
            __CLR4_4_11bv1bvkcq4stfe.R.flushNeeded();
        }
    }

    /**
     * Create a new FindWithinGenerator.
     * @param ifNone object to return if the Generator contains no matches.
     */
    public FindWithinGenerator(E ifNone) {
        super();
        __CLR4_4_11bv1bvkcq4stfe.R.inc(1736);
        try {
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1735);
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1737);
            this.ifNone = ifNone;
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1738);
            useIfNone = true;
        } finally {
            __CLR4_4_11bv1bvkcq4stfe.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     * @param left Generator
     * @param right Predicate
     */
    public E evaluate(Generator<? extends E> left, Predicate<? super E> right) {
        try {
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1739);
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1740);
            FindProcedure<E> findProcedure = new FindProcedure<E>(right);
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1741);
            left.run(findProcedure);
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1742);
            if ((((!findProcedure.wasFound) && (__CLR4_4_11bv1bvkcq4stfe.R.iget(1743) != 0 | true)) || (__CLR4_4_11bv1bvkcq4stfe.R.iget(1744) == 0 & false))) {
                {
                    __CLR4_4_11bv1bvkcq4stfe.R.inc(1745);
                    if ((((useIfNone) && (__CLR4_4_11bv1bvkcq4stfe.R.iget(1746) != 0 | true)) || (__CLR4_4_11bv1bvkcq4stfe.R.iget(1747) == 0 & false))) {
                        {
                            __CLR4_4_11bv1bvkcq4stfe.R.inc(1748);
                            return ifNone;
                        }
                    }
                    __CLR4_4_11bv1bvkcq4stfe.R.inc(1749);
                    throw new NoSuchElementException("No element matching " + right + " was found.");
                }
            }
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1750);
            return findProcedure.found;
        } finally {
            __CLR4_4_11bv1bvkcq4stfe.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1751);
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1752);
            if ((((obj == this) && (__CLR4_4_11bv1bvkcq4stfe.R.iget(1753) != 0 | true)) || (__CLR4_4_11bv1bvkcq4stfe.R.iget(1754) == 0 & false))) {
                {
                    __CLR4_4_11bv1bvkcq4stfe.R.inc(1755);
                    return true;
                }
            }
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1756);
            if ((((!(obj instanceof FindWithinGenerator<?>)) && (__CLR4_4_11bv1bvkcq4stfe.R.iget(1757) != 0 | true)) || (__CLR4_4_11bv1bvkcq4stfe.R.iget(1758) == 0 & false))) {
                {
                    __CLR4_4_11bv1bvkcq4stfe.R.inc(1759);
                    return false;
                }
            }
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1760);
            FindWithinGenerator<?> other = (FindWithinGenerator<?>) obj;
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1761);
            return other.useIfNone == useIfNone && !useIfNone || (other.ifNone == this.ifNone || other.ifNone != null && other.ifNone.equals(this.ifNone));
        } finally {
            __CLR4_4_11bv1bvkcq4stfe.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1762);
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1763);
            if ((((!this.useIfNone) && (__CLR4_4_11bv1bvkcq4stfe.R.iget(1764) != 0 | true)) || (__CLR4_4_11bv1bvkcq4stfe.R.iget(1765) == 0 & false))) {
                {
                    __CLR4_4_11bv1bvkcq4stfe.R.inc(1766);
                    return System.identityHashCode(INSTANCE);
                }
            }
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1767);
            int result = "FindWithinGenerator".hashCode();
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1768);
            result ^= (((this.ifNone == null) && (__CLR4_4_11bv1bvkcq4stfe.R.iget(1769) != 0 | true)) || (__CLR4_4_11bv1bvkcq4stfe.R.iget(1770) == 0 & false)) ? 0 : this.ifNone.hashCode();
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1771);
            return result;
        } finally {
            __CLR4_4_11bv1bvkcq4stfe.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1772);
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1773);
            return "FindWithinGenerator<" + ifNone + "," + useIfNone + ">";
        } finally {
            __CLR4_4_11bv1bvkcq4stfe.R.flushNeeded();
        }
    }

    /**
     * Get a static {@link FindWithinGenerator} instance.
     * @return {@link FindWithinGenerator}
     */
    public static FindWithinGenerator<Object> instance() {
        try {
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1774);
            __CLR4_4_11bv1bvkcq4stfe.R.inc(1775);
            return INSTANCE;
        } finally {
            __CLR4_4_11bv1bvkcq4stfe.R.flushNeeded();
        }
    }
}

