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

import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.Function;
import org.apache.commons.lang3.Validate;

/**
 * A NullaryFunction whose result is then run through a Function.
 *
 * @param <T> the returned value type.
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TransformedNullaryFunction<T> implements NullaryFunction<T> {

    public static class __CLR4_4_12u72u7kcq4stuo {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3708, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Type-remembering helper.
     *
     * @param <X> the adapted function argument type
     */
    private static final class Helper<X, T> implements NullaryFunction<T> {

        /**
         * The preceding function.
         */
        private NullaryFunction<? extends X> preceding;

        /**
         * The following function.
         */
        private Function<? super X, ? extends T> following;

        /**
         * Create a new Helper.
         * @param preceding NullaryFunction
         * @param following Function
         */
        private Helper(NullaryFunction<? extends X> preceding, Function<? super X, ? extends T> following) {
            try {
                __CLR4_4_12u72u7kcq4stuo.R.inc(3679);
                __CLR4_4_12u72u7kcq4stuo.R.inc(3680);
                this.preceding = Validate.notNull(preceding, "NullaryFunction argument was null");
                __CLR4_4_12u72u7kcq4stuo.R.inc(3681);
                this.following = Validate.notNull(following, "Function argument was null");
            } finally {
                __CLR4_4_12u72u7kcq4stuo.R.flushNeeded();
            }
        }

        /**
         * {@inheritDoc}
         */
        public T evaluate() {
            try {
                __CLR4_4_12u72u7kcq4stuo.R.inc(3682);
                __CLR4_4_12u72u7kcq4stuo.R.inc(3683);
                return following.evaluate(preceding.evaluate());
            } finally {
                __CLR4_4_12u72u7kcq4stuo.R.flushNeeded();
            }
        }
    }

    /**
     * The adapted helper.
     */
    private final Helper<?, T> helper;

    /**
     * Create a new TransformedNullaryFunction.
     * @param <X> the preceding function argument type.
     * @param preceding NullaryFunction
     * @param following Function
     */
    public <X> TransformedNullaryFunction(NullaryFunction<? extends X> preceding, Function<? super X, ? extends T> following) {
        try {
            __CLR4_4_12u72u7kcq4stuo.R.inc(3684);
            __CLR4_4_12u72u7kcq4stuo.R.inc(3685);
            this.helper = new Helper<X, T>(preceding, following);
        } finally {
            __CLR4_4_12u72u7kcq4stuo.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public final T evaluate() {
        try {
            __CLR4_4_12u72u7kcq4stuo.R.inc(3686);
            __CLR4_4_12u72u7kcq4stuo.R.inc(3687);
            return helper.evaluate();
        } finally {
            __CLR4_4_12u72u7kcq4stuo.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(Object obj) {
        try {
            __CLR4_4_12u72u7kcq4stuo.R.inc(3688);
            __CLR4_4_12u72u7kcq4stuo.R.inc(3689);
            if ((((obj == this) && (__CLR4_4_12u72u7kcq4stuo.R.iget(3690) != 0 | true)) || (__CLR4_4_12u72u7kcq4stuo.R.iget(3691) == 0 & false))) {
                {
                    __CLR4_4_12u72u7kcq4stuo.R.inc(3692);
                    return true;
                }
            }
            __CLR4_4_12u72u7kcq4stuo.R.inc(3693);
            if ((((!(obj instanceof TransformedNullaryFunction<?>)) && (__CLR4_4_12u72u7kcq4stuo.R.iget(3694) != 0 | true)) || (__CLR4_4_12u72u7kcq4stuo.R.iget(3695) == 0 & false))) {
                {
                    __CLR4_4_12u72u7kcq4stuo.R.inc(3696);
                    return false;
                }
            }
            __CLR4_4_12u72u7kcq4stuo.R.inc(3697);
            TransformedNullaryFunction<?> that = (TransformedNullaryFunction<?>) obj;
            __CLR4_4_12u72u7kcq4stuo.R.inc(3698);
            return this.helper.preceding.equals(that.helper.preceding) && this.helper.following.equals(that.helper.following);
        } finally {
            __CLR4_4_12u72u7kcq4stuo.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_12u72u7kcq4stuo.R.inc(3699);
            __CLR4_4_12u72u7kcq4stuo.R.inc(3700);
            int result = "TransformedNullaryFunction".hashCode();
            __CLR4_4_12u72u7kcq4stuo.R.inc(3701);
            result <<= 2;
            __CLR4_4_12u72u7kcq4stuo.R.inc(3702);
            result |= helper.following.hashCode();
            __CLR4_4_12u72u7kcq4stuo.R.inc(3703);
            result <<= 2;
            __CLR4_4_12u72u7kcq4stuo.R.inc(3704);
            result |= helper.preceding.hashCode();
            __CLR4_4_12u72u7kcq4stuo.R.inc(3705);
            return result;
        } finally {
            __CLR4_4_12u72u7kcq4stuo.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_12u72u7kcq4stuo.R.inc(3706);
            __CLR4_4_12u72u7kcq4stuo.R.inc(3707);
            return "TransformedNullaryFunction<" + helper.preceding + "; " + helper.following + ">";
        } finally {
            __CLR4_4_12u72u7kcq4stuo.R.flushNeeded();
        }
    }
}

