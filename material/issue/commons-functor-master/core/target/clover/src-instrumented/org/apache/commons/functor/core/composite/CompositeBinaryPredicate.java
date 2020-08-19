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

import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Function;
import org.apache.commons.lang3.Validate;

/**
 * A {@link BinaryPredicate BinaryPredicate} composed of
 * one binary predicate, <i>p</i>, and two
 * functions, <i>f</i> and <i>g</i>,
 * evaluating the ordered parameters <i>x</i>, <i>y</i>
 * to <code><i>p</i>(<i>f</i>(<i>x</i>),<i>g</i>(<i>y</i>))</code>.
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @version $Revision: 1345136 $ $Date: 2012-06-01 09:47:06 -0300 (Fri, 01 Jun 2012) $
 */
public class CompositeBinaryPredicate<L, R> implements BinaryPredicate<L, R> {

    public static class __CLR4_4_129u29ukcq4stpa {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 2978, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Base hash integer used to shift hash.
     */
    private static final int HASH_SHIFT = 4;

    /**
     * Internal helper.
     *
     * @param <G> right function type.
     * @param <H> right function type.
     * @param <L> left function type.
     * @param <R> left function type.
     */
    private static class Helper<G, H, L, R> implements BinaryPredicate<L, R> {

        /**
         * BinaryPredicate to test <i>output(</i><code>f</code><i>), output(</i><code>g</code><i>)</i>.
         */
        private BinaryPredicate<? super G, ? super H> f;

        /**
         * left Function.
         */
        private Function<? super L, ? extends G> g;

        /**
         * right Function.
         */
        private Function<? super R, ? extends H> h;

        /**
         * Create a new Helper.
         * @param f BinaryPredicate to test <i>output(</i><code>f</code><i>), output(</i><code>g</code><i>)</i>
         * @param g left Function
         * @param h right Function
         */
        public Helper(BinaryPredicate<? super G, ? super H> f, Function<? super L, ? extends G> g, Function<? super R, ? extends H> h) {
            try {
                __CLR4_4_129u29ukcq4stpa.R.inc(2946);
                __CLR4_4_129u29ukcq4stpa.R.inc(2947);
                this.f = f;
                __CLR4_4_129u29ukcq4stpa.R.inc(2948);
                this.g = g;
                __CLR4_4_129u29ukcq4stpa.R.inc(2949);
                this.h = h;
            } finally {
                __CLR4_4_129u29ukcq4stpa.R.flushNeeded();
            }
        }

        /**
         * {@inheritDoc}
         */
        public boolean test(L left, R right) {
            try {
                __CLR4_4_129u29ukcq4stpa.R.inc(2950);
                __CLR4_4_129u29ukcq4stpa.R.inc(2951);
                return f.test(g.evaluate(left), h.evaluate(right));
            } finally {
                __CLR4_4_129u29ukcq4stpa.R.flushNeeded();
            }
        }
    }

    // attributes
    // ------------------------------------------------------------------------
    /**
     * The adapted helper.
     */
    private final Helper<?, ?, L, R> helper;

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new CompositeBinaryPredicate.
     *
     * @param <G> right function type.
     * @param <H> right function type.
     * @param f BinaryPredicate to test <i>output(</i><code>f</code><i>), output(</i><code>g</code><i>)</i>
     * @param g left Function
     * @param h right Function
     */
    public <G, H> CompositeBinaryPredicate(final BinaryPredicate<? super G, ? super H> f, final Function<? super L, ? extends G> g, final Function<? super R, ? extends H> h) {
        try {
            __CLR4_4_129u29ukcq4stpa.R.inc(2952);
            __CLR4_4_129u29ukcq4stpa.R.inc(2953);
            helper = new Helper<G, H, L, R>(Validate.notNull(f, "BinaryPredicate must not be null"), Validate.notNull(g, "left Function must not be null"), Validate.notNull(h, "right Function must not be null"));
        } finally {
            __CLR4_4_129u29ukcq4stpa.R.flushNeeded();
        }
    }

    // function interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public boolean test(L left, R right) {
        try {
            __CLR4_4_129u29ukcq4stpa.R.inc(2954);
            __CLR4_4_129u29ukcq4stpa.R.inc(2955);
            return helper.test(left, right);
        } finally {
            __CLR4_4_129u29ukcq4stpa.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_129u29ukcq4stpa.R.inc(2956);
            __CLR4_4_129u29ukcq4stpa.R.inc(2957);
            if ((((obj == this) && (__CLR4_4_129u29ukcq4stpa.R.iget(2958) != 0 | true)) || (__CLR4_4_129u29ukcq4stpa.R.iget(2959) == 0 & false))) {
                {
                    __CLR4_4_129u29ukcq4stpa.R.inc(2960);
                    return true;
                }
            }
            __CLR4_4_129u29ukcq4stpa.R.inc(2961);
            if ((((!(obj instanceof CompositeBinaryPredicate<?, ?>)) && (__CLR4_4_129u29ukcq4stpa.R.iget(2962) != 0 | true)) || (__CLR4_4_129u29ukcq4stpa.R.iget(2963) == 0 & false))) {
                {
                    __CLR4_4_129u29ukcq4stpa.R.inc(2964);
                    return false;
                }
            }
            __CLR4_4_129u29ukcq4stpa.R.inc(2965);
            CompositeBinaryPredicate<?, ?> that = (CompositeBinaryPredicate<?, ?>) obj;
            __CLR4_4_129u29ukcq4stpa.R.inc(2966);
            return this.helper.f.equals(that.helper.f) && this.helper.g.equals(that.helper.g) && this.helper.h.equals(that.helper.h);
        } finally {
            __CLR4_4_129u29ukcq4stpa.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_129u29ukcq4stpa.R.inc(2967);
            __CLR4_4_129u29ukcq4stpa.R.inc(2968);
            int hash = "CompositeBinaryPredicate".hashCode();
            __CLR4_4_129u29ukcq4stpa.R.inc(2969);
            hash <<= HASH_SHIFT;
            __CLR4_4_129u29ukcq4stpa.R.inc(2970);
            hash ^= helper.f.hashCode();
            __CLR4_4_129u29ukcq4stpa.R.inc(2971);
            hash <<= HASH_SHIFT;
            __CLR4_4_129u29ukcq4stpa.R.inc(2972);
            hash ^= helper.g.hashCode();
            __CLR4_4_129u29ukcq4stpa.R.inc(2973);
            hash <<= HASH_SHIFT;
            __CLR4_4_129u29ukcq4stpa.R.inc(2974);
            hash ^= helper.h.hashCode();
            __CLR4_4_129u29ukcq4stpa.R.inc(2975);
            return hash;
        } finally {
            __CLR4_4_129u29ukcq4stpa.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_129u29ukcq4stpa.R.inc(2976);
            __CLR4_4_129u29ukcq4stpa.R.inc(2977);
            return "CompositeBinaryPredicate<" + helper.f + ";" + helper.g + ";" + helper.h + ">";
        } finally {
            __CLR4_4_129u29ukcq4stpa.R.flushNeeded();
        }
    }
}

