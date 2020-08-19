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
package org.apache.commons.functor.core.composite;

import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.BinaryProcedure;
import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.Procedure;

/**
 * Utility methods for creating conditional functors.
 * @version $Revision$ $Date$
 */
public final class Conditional {

    public static class __CLR4_4_12dc2dckcq4stqe {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3097, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Hidden constructor as this only is a helper class with static methods.
     */
    private Conditional() {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3072);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    // ------------------------------------------------------------------------
    /**
     * Create a guarded NullaryProcedure.
     * @param q if
     * @param r then
     * @return NullaryProcedure
     */
    public static NullaryProcedure procedure(NullaryPredicate q, NullaryProcedure r) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3073);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3074);
            return new ConditionalNullaryProcedure(q, r);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a conditional NullaryProcedure.
     * @param q if
     * @param r then
     * @param s else
     * @return NullaryProcedure
     */
    public static NullaryProcedure procedure(NullaryPredicate q, NullaryProcedure r, NullaryProcedure s) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3075);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3076);
            return new ConditionalNullaryProcedure(q, r, s);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a conditional NullaryFunction.
     * @param <T> the input functions parameter type
     * @param q if
     * @param r then
     * @param s else
     * @return NullaryFunction<T>
     */
    public static <T> NullaryFunction<T> function(NullaryPredicate q, NullaryFunction<? extends T> r, NullaryFunction<? extends T> s) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3077);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3078);
            return new ConditionalNullaryFunction<T>(q, r, s);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a conditional NullaryPredicate.
     * @param q if
     * @param r then
     * @param s else
     * @return NullaryPredicate
     */
    public static NullaryPredicate predicate(NullaryPredicate q, NullaryPredicate r, NullaryPredicate s) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3079);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3080);
            return new ConditionalNullaryPredicate(q, r, s);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a guarded Procedure.
     *
     * @param <A> the predicates argument type.
     * @param q if
     * @param r then
     * @return Procedure<A>
     */
    public static <A> Procedure<A> procedure(Predicate<? super A> q, Procedure<? super A> r) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3081);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3082);
            return new ConditionalProcedure<A>(q, r);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a conditional Procedure.
     *
     * @param <A> the predicates argument type.
     * @param q if
     * @param r then
     * @param s else
     * @return Procedure<A>
     */
    public static <A> Procedure<A> procedure(Predicate<? super A> q, Procedure<? super A> r, Procedure<? super A> s) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3083);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3084);
            return new ConditionalProcedure<A>(q, r, s);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a conditional Function.
     * @param <A> the predicates argument type.
     * @param <T> the output function returned value type.
     * @param q if
     * @param r then
     * @param s else
     * @return Function<A, T>
     */
    public static <A, T> Function<A, T> function(Predicate<? super A> q, Function<? super A, ? extends T> r, Function<? super A, ? extends T> s) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3085);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3086);
            return new ConditionalFunction<A, T>(q, r, s);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a conditional Predicate.
     * @param <A> the predicates argument type.
     * @param q if
     * @param r then
     * @param s else
     * @return Predicate<A>
     */
    public static <A> Predicate<A> predicate(Predicate<? super A> q, Predicate<? super A> r, Predicate<? super A> s) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3087);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3088);
            return new ConditionalPredicate<A>(q, r, s);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a guarded BinaryProcedure.
     * @param <L> the left argument type.
     * @param <R> the right argument type.
     * @param q if
     * @param r then
     * @return BinaryProcedure<L, R>
     */
    public static <L, R> BinaryProcedure<L, R> procedure(BinaryPredicate<? super L, ? super R> q, BinaryProcedure<? super L, ? super R> r) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3089);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3090);
            return new ConditionalBinaryProcedure<L, R>(q, r);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a conditional BinaryProcedure.
     *
     * @param <L> the left argument type.
     * @param <R> the right argument type.
     * @param q if
     * @param r then
     * @param s else
     * @return BinaryProcedure<L, R>
     */
    public static <L, R> BinaryProcedure<L, R> procedure(BinaryPredicate<? super L, ? super R> q, BinaryProcedure<? super L, ? super R> r, BinaryProcedure<? super L, ? super R> s) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3091);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3092);
            return new ConditionalBinaryProcedure<L, R>(q, r, s);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a conditional BinaryFunction.
     *
     * @param <L> the left argument type.
     * @param <R> the right argument type.
     * @param <T> the output function returned value type.
     * @param q if
     * @param r then
     * @param s else
     * @return BinaryFunction<L, R, T>
     */
    public static <L, R, T> BinaryFunction<L, R, T> function(BinaryPredicate<? super L, ? super R> q, BinaryFunction<? super L, ? super R, ? extends T> r, BinaryFunction<? super L, ? super R, ? extends T> s) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3093);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3094);
            return new ConditionalBinaryFunction<L, R, T>(q, r, s);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }

    /**
     * Create a conditional BinaryPredicate.
     *
     * @param <L> the left argument type.
     * @param <R> the right argument type.
     * @param q if
     * @param r then
     * @param s else
     * @return BinaryPredicate<L, R>
     */
    public static <L, R> BinaryPredicate<L, R> predicate(BinaryPredicate<? super L, ? super R> q, BinaryPredicate<? super L, ? super R> r, BinaryPredicate<? super L, ? super R> s) {
        try {
            __CLR4_4_12dc2dckcq4stqe.R.inc(3095);
            __CLR4_4_12dc2dckcq4stqe.R.inc(3096);
            return new ConditionalBinaryPredicate<L, R>(q, r, s);
        } finally {
            __CLR4_4_12dc2dckcq4stqe.R.flushNeeded();
        }
    }
}

