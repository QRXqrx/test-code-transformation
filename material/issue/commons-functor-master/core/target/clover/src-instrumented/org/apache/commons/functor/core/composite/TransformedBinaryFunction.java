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
import org.apache.commons.functor.Function;
import org.apache.commons.lang3.Validate;

/**
 * A BinaryFunction whose result is then run through a Function.
 *
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @param <T> the returned value type.
 * @version $Revision$ $Date$
 */
public class TransformedBinaryFunction<L, R, T> implements BinaryFunction<L, R, T> {

    public static class __CLR4_4_12sl2slkcq4stu8 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3650, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * @param <X> the following function left argument.
     */
    private static final class Helper<X, L, R, T> implements BinaryFunction<L, R, T> {

        /**
         * The preceding function.
         */
        private BinaryFunction<? super L, ? super R, ? extends X> preceding;

        /**
         * The following function.
         */
        private Function<? super X, ? extends T> following;

        /**
         * Create a new Helper.
         * @param preceding BinaryFunction
         * @param following Function
         */
        private Helper(BinaryFunction<? super L, ? super R, ? extends X> preceding, Function<? super X, ? extends T> following) {
            try {
                __CLR4_4_12sl2slkcq4stu8.R.inc(3621);
                __CLR4_4_12sl2slkcq4stu8.R.inc(3622);
                this.preceding = Validate.notNull(preceding, "BinaryFunction argument was null");
                __CLR4_4_12sl2slkcq4stu8.R.inc(3623);
                this.following = Validate.notNull(following, "Function argument was null");
            } finally {
                __CLR4_4_12sl2slkcq4stu8.R.flushNeeded();
            }
        }

        /**
         * {@inheritDoc}
         */
        public T evaluate(L left, R right) {
            try {
                __CLR4_4_12sl2slkcq4stu8.R.inc(3624);
                __CLR4_4_12sl2slkcq4stu8.R.inc(3625);
                return following.evaluate(preceding.evaluate(left, right));
            } finally {
                __CLR4_4_12sl2slkcq4stu8.R.flushNeeded();
            }
        }
    }

    /**
     * The adapted helper.
     */
    private final Helper<?, L, R, T> helper;

    /**
     * Create a new TransformedBinaryFunction.
     * @param <X> the following function left argument.
     * @param preceding BinaryFunction
     * @param following Function
     */
    public <X> TransformedBinaryFunction(BinaryFunction<? super L, ? super R, ? extends X> preceding, Function<? super X, ? extends T> following) {
        try {
            __CLR4_4_12sl2slkcq4stu8.R.inc(3626);
            __CLR4_4_12sl2slkcq4stu8.R.inc(3627);
            this.helper = new Helper<X, L, R, T>(preceding, following);
        } finally {
            __CLR4_4_12sl2slkcq4stu8.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public final T evaluate(L left, R right) {
        try {
            __CLR4_4_12sl2slkcq4stu8.R.inc(3628);
            __CLR4_4_12sl2slkcq4stu8.R.inc(3629);
            return helper.evaluate(left, right);
        } finally {
            __CLR4_4_12sl2slkcq4stu8.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(Object obj) {
        try {
            __CLR4_4_12sl2slkcq4stu8.R.inc(3630);
            __CLR4_4_12sl2slkcq4stu8.R.inc(3631);
            if ((((obj == this) && (__CLR4_4_12sl2slkcq4stu8.R.iget(3632) != 0 | true)) || (__CLR4_4_12sl2slkcq4stu8.R.iget(3633) == 0 & false))) {
                {
                    __CLR4_4_12sl2slkcq4stu8.R.inc(3634);
                    return true;
                }
            }
            __CLR4_4_12sl2slkcq4stu8.R.inc(3635);
            if ((((!(obj instanceof TransformedBinaryFunction<?, ?, ?>)) && (__CLR4_4_12sl2slkcq4stu8.R.iget(3636) != 0 | true)) || (__CLR4_4_12sl2slkcq4stu8.R.iget(3637) == 0 & false))) {
                {
                    __CLR4_4_12sl2slkcq4stu8.R.inc(3638);
                    return false;
                }
            }
            __CLR4_4_12sl2slkcq4stu8.R.inc(3639);
            TransformedBinaryFunction<?, ?, ?> that = (TransformedBinaryFunction<?, ?, ?>) obj;
            __CLR4_4_12sl2slkcq4stu8.R.inc(3640);
            return this.helper.preceding.equals(that.helper.preceding) && this.helper.following.equals(that.helper.following);
        } finally {
            __CLR4_4_12sl2slkcq4stu8.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_12sl2slkcq4stu8.R.inc(3641);
            __CLR4_4_12sl2slkcq4stu8.R.inc(3642);
            int result = "TransformedBinaryFunction".hashCode();
            __CLR4_4_12sl2slkcq4stu8.R.inc(3643);
            result <<= 2;
            __CLR4_4_12sl2slkcq4stu8.R.inc(3644);
            result |= helper.following.hashCode();
            __CLR4_4_12sl2slkcq4stu8.R.inc(3645);
            result <<= 2;
            __CLR4_4_12sl2slkcq4stu8.R.inc(3646);
            result |= helper.preceding.hashCode();
            __CLR4_4_12sl2slkcq4stu8.R.inc(3647);
            return result;
        } finally {
            __CLR4_4_12sl2slkcq4stu8.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_12sl2slkcq4stu8.R.inc(3648);
            __CLR4_4_12sl2slkcq4stu8.R.inc(3649);
            return "TransformedBinaryFunction<" + helper.preceding + "; " + helper.following + ">";
        } finally {
            __CLR4_4_12sl2slkcq4stu8.R.flushNeeded();
        }
    }
}

