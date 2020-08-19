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
import org.apache.commons.lang3.Validate;

/**
 * A {@link BinaryFunction BinaryFunction} composed of
 * three binary functions, <i>f</i>, <i>g</i> and <i>h</i>,
 * evaluating the ordered parameters <i>x</i>, <i>y</i>
 * to <code><i>f</i>(<i>g</i>(<i>x</i>,<i>y</i>),<i>h</i>(<i>x</i>,<i>y</i>))</code>.
 * @param <L> the function left argument type.
 * @param <R> the function right argument type.
 * @param <T> the function returned value type.
 * @version $Revision$ $Date$
 */
public class BinaryCompositeBinaryFunction<L, R, T> implements BinaryFunction<L, R, T> {

    public static class __CLR4_4_124w24wkcq4stnv {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 2800, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Type-remembering Helper.
     *
     * @param <G> the function left argument type.
     * @param <H> the function right argument type.
     */
    private static class Helper<G, H, L, R, T> implements BinaryFunction<L, R, T> {

        /**
         * Global evaluator.
         */
        private BinaryFunction<? super G, ? super H, ? extends T> f;

        /**
         * This function evaluation will be the left argument of main evaluator.
         */
        private BinaryFunction<? super L, ? super R, ? extends G> g;

        /**
         * This function evaluation will be the right argument of main evaluator.
         */
        private BinaryFunction<? super L, ? super R, ? extends H> h;

        /**
         * Create a new Helper.
         * @param f final BinaryFunction to evaluate
         * @param g left preceding BinaryFunction
         * @param h right preceding BinaryFunction
         */
        public Helper(BinaryFunction<? super G, ? super H, ? extends T> f, BinaryFunction<? super L, ? super R, ? extends G> g, BinaryFunction<? super L, ? super R, ? extends H> h) {
            try {
                __CLR4_4_124w24wkcq4stnv.R.inc(2768);
                __CLR4_4_124w24wkcq4stnv.R.inc(2769);
                this.f = f;
                __CLR4_4_124w24wkcq4stnv.R.inc(2770);
                this.g = g;
                __CLR4_4_124w24wkcq4stnv.R.inc(2771);
                this.h = h;
            } finally {
                __CLR4_4_124w24wkcq4stnv.R.flushNeeded();
            }
        }

        /**
         * {@inheritDoc}
         */
        public T evaluate(L left, R right) {
            try {
                __CLR4_4_124w24wkcq4stnv.R.inc(2772);
                __CLR4_4_124w24wkcq4stnv.R.inc(2773);
                return f.evaluate(g.evaluate(left, right), h.evaluate(left, right));
            } finally {
                __CLR4_4_124w24wkcq4stnv.R.flushNeeded();
            }
        }
    }

    /**
     * The helper used for the evaluation.
     */
    private final Helper<?, ?, L, R, T> helper;

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new BinaryCompositeBinaryFunction.
     *
     * @param <G> the main function left argument type.
     * @param <H> the main function right argument type.
     * @param f final BinaryFunction to evaluate
     * @param g left preceding BinaryFunction
     * @param h right preceding BinaryFunction
     */
    public <G, H> BinaryCompositeBinaryFunction(BinaryFunction<? super G, ? super H, ? extends T> f, BinaryFunction<? super L, ? super R, ? extends G> g, BinaryFunction<? super L, ? super R, ? extends H> h) {
        try {
            __CLR4_4_124w24wkcq4stnv.R.inc(2774);
            __CLR4_4_124w24wkcq4stnv.R.inc(2775);
            this.helper = new Helper<G, H, L, R, T>(Validate.notNull(f, "final BinaryFunction argument must not be null"), Validate.notNull(g, "left preceding BinaryFunction argument must not be null"), Validate.notNull(h, "right preceding BinaryFunction argument must not be null"));
        } finally {
            __CLR4_4_124w24wkcq4stnv.R.flushNeeded();
        }
    }

    // function interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public final T evaluate(L left, R right) {
        try {
            __CLR4_4_124w24wkcq4stnv.R.inc(2776);
            __CLR4_4_124w24wkcq4stnv.R.inc(2777);
            return helper.evaluate(left, right);
        } finally {
            __CLR4_4_124w24wkcq4stnv.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(Object obj) {
        try {
            __CLR4_4_124w24wkcq4stnv.R.inc(2778);
            __CLR4_4_124w24wkcq4stnv.R.inc(2779);
            if ((((obj == this) && (__CLR4_4_124w24wkcq4stnv.R.iget(2780) != 0 | true)) || (__CLR4_4_124w24wkcq4stnv.R.iget(2781) == 0 & false))) {
                {
                    __CLR4_4_124w24wkcq4stnv.R.inc(2782);
                    return true;
                }
            }
            __CLR4_4_124w24wkcq4stnv.R.inc(2783);
            if ((((!(obj instanceof BinaryCompositeBinaryFunction<?, ?, ?>)) && (__CLR4_4_124w24wkcq4stnv.R.iget(2784) != 0 | true)) || (__CLR4_4_124w24wkcq4stnv.R.iget(2785) == 0 & false))) {
                {
                    __CLR4_4_124w24wkcq4stnv.R.inc(2786);
                    return false;
                }
            }
            __CLR4_4_124w24wkcq4stnv.R.inc(2787);
            BinaryCompositeBinaryFunction<?, ?, ?> that = (BinaryCompositeBinaryFunction<?, ?, ?>) obj;
            __CLR4_4_124w24wkcq4stnv.R.inc(2788);
            return this.helper.f.equals(that.helper.f) && this.helper.g.equals(that.helper.g) && this.helper.h.equals(that.helper.h);
        } finally {
            __CLR4_4_124w24wkcq4stnv.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_124w24wkcq4stnv.R.inc(2789);
            __CLR4_4_124w24wkcq4stnv.R.inc(2790);
            int hash = "BinaryCompositeBinaryFunction".hashCode();
            __CLR4_4_124w24wkcq4stnv.R.inc(2791);
            hash <<= HASH_SHIFT;
            __CLR4_4_124w24wkcq4stnv.R.inc(2792);
            hash ^= helper.f.hashCode();
            __CLR4_4_124w24wkcq4stnv.R.inc(2793);
            hash <<= HASH_SHIFT;
            __CLR4_4_124w24wkcq4stnv.R.inc(2794);
            hash ^= helper.g.hashCode();
            __CLR4_4_124w24wkcq4stnv.R.inc(2795);
            hash <<= HASH_SHIFT;
            __CLR4_4_124w24wkcq4stnv.R.inc(2796);
            hash ^= helper.h.hashCode();
            __CLR4_4_124w24wkcq4stnv.R.inc(2797);
            return hash;
        } finally {
            __CLR4_4_124w24wkcq4stnv.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_124w24wkcq4stnv.R.inc(2798);
            __CLR4_4_124w24wkcq4stnv.R.inc(2799);
            return "BinaryCompositeBinaryFunction<" + helper.f + ";" + helper.g + ";" + helper.h + ">";
        } finally {
            __CLR4_4_124w24wkcq4stnv.R.flushNeeded();
        }
    }
}

