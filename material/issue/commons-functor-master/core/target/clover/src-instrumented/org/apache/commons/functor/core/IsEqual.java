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
package org.apache.commons.functor.core;

import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.adapter.RightBoundPredicate;

/**
 * {@link #test Tests}
 * <code>true</code> iff its arguments are
 * {@link Object#equals equal} or both
 * <code>null</code>.
 * <p>
 * This relation is
 * an equivalence relation on
 * the set of objects that adhere to the
 * <code>Object.equals</code> contract.
 * </p>
 *
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @version $Revision$ $Date$
 */
public final class IsEqual<L, R> implements BinaryPredicate<L, R> {

    public static class __CLR4_4_1165165kcq4stcq {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 1530, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    // static attributes
    // ------------------------------------------------------------------------
    /**
     * Basic IsEqual<Object, Object> instance.
     */
    public static final IsEqual<Object, Object> INSTANCE = IsEqual.<Object, Object>instance();

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new IsEqual.
     */
    public IsEqual() {
        try {
            __CLR4_4_1165165kcq4stcq.R.inc(1517);
        } finally {
            __CLR4_4_1165165kcq4stcq.R.flushNeeded();
        }
    }

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public boolean test(L left, R right) {
        try {
            __CLR4_4_1165165kcq4stcq.R.inc(1518);
            __CLR4_4_1165165kcq4stcq.R.inc(1519);
            return left == right || left != null && left.equals(right);
        } finally {
            __CLR4_4_1165165kcq4stcq.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object that) {
        try {
            __CLR4_4_1165165kcq4stcq.R.inc(1520);
            __CLR4_4_1165165kcq4stcq.R.inc(1521);
            return that instanceof IsEqual<?, ?>;
        } finally {
            __CLR4_4_1165165kcq4stcq.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_1165165kcq4stcq.R.inc(1522);
            __CLR4_4_1165165kcq4stcq.R.inc(1523);
            return "IsEqual".hashCode();
        } finally {
            __CLR4_4_1165165kcq4stcq.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_1165165kcq4stcq.R.inc(1524);
            __CLR4_4_1165165kcq4stcq.R.inc(1525);
            return "IsEqual";
        } finally {
            __CLR4_4_1165165kcq4stcq.R.flushNeeded();
        }
    }

    // static methods
    // ------------------------------------------------------------------------
    /**
     * Get an IsEqual instance.
     * @param <L> the left argument type.
     * @param <R> the right argument type.
     * @return IsEqual
     */
    public static <L, R> IsEqual<L, R> instance() {
        try {
            __CLR4_4_1165165kcq4stcq.R.inc(1526);
            __CLR4_4_1165165kcq4stcq.R.inc(1527);
            return new IsEqual<L, R>();
        } finally {
            __CLR4_4_1165165kcq4stcq.R.flushNeeded();
        }
    }

    /**
     * Get an IsEqual Predicate.
     * @param <L> the left argument type.
     * @param <R> the right argument type.
     * @param object bound comparison object
     * @return Predicate<L>
     */
    public static <L, R> Predicate<L> to(R object) {
        try {
            __CLR4_4_1165165kcq4stcq.R.inc(1528);
            __CLR4_4_1165165kcq4stcq.R.inc(1529);
            return new RightBoundPredicate<L>(new IsEqual<L, R>(), object);
        } finally {
            __CLR4_4_1165165kcq4stcq.R.flushNeeded();
        }
    }
}

