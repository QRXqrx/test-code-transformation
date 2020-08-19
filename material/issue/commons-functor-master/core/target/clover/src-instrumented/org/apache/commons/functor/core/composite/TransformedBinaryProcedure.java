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
import org.apache.commons.functor.BinaryProcedure;
import org.apache.commons.functor.Procedure;
import org.apache.commons.lang3.Validate;

/**
 * A BinaryProcedure composed of a BinaryFunction whose result is then run through a Procedure.
 *
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @version $Revision$ $Date$
 */
public class TransformedBinaryProcedure<L, R> implements BinaryProcedure<L, R> {

    public static class __CLR4_4_12te2tekcq4stui {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3679, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * @param <X> the wrapped procedure argument.
     */
    private static final class Helper<X, L, R> implements BinaryProcedure<L, R> {

        /**
         * The wrapped function.
         */
        private BinaryFunction<? super L, ? super R, ? extends X> function;

        /**
         * The wrapped procedure.
         */
        private Procedure<? super X> procedure;

        /**
         * Create a new Helper.
         * @param function BinaryFunction
         * @param procedure Function
         */
        private Helper(BinaryFunction<? super L, ? super R, ? extends X> function, Procedure<? super X> procedure) {
            try {
                __CLR4_4_12te2tekcq4stui.R.inc(3650);
                __CLR4_4_12te2tekcq4stui.R.inc(3651);
                this.function = Validate.notNull(function, "BinaryFunction argument was null");
                __CLR4_4_12te2tekcq4stui.R.inc(3652);
                this.procedure = Validate.notNull(procedure, "Procedure argument was null");
            } finally {
                __CLR4_4_12te2tekcq4stui.R.flushNeeded();
            }
        }

        /**
         * {@inheritDoc}
         */
        public void run(L left, R right) {
            try {
                __CLR4_4_12te2tekcq4stui.R.inc(3653);
                __CLR4_4_12te2tekcq4stui.R.inc(3654);
                procedure.run(function.evaluate(left, right));
            } finally {
                __CLR4_4_12te2tekcq4stui.R.flushNeeded();
            }
        }
    }

    /**
     * The adapted helper.
     */
    private final Helper<?, L, R> helper;

    /**
     * Create a new TransformedBinaryProcedure.
     * @param <X> the wrapped procedure argument.
     * @param function BinaryFunction
     * @param procedure Procedure
     */
    public <X> TransformedBinaryProcedure(BinaryFunction<? super L, ? super R, ? extends X> function, Procedure<? super X> procedure) {
        try {
            __CLR4_4_12te2tekcq4stui.R.inc(3655);
            __CLR4_4_12te2tekcq4stui.R.inc(3656);
            this.helper = new Helper<X, L, R>(function, procedure);
        } finally {
            __CLR4_4_12te2tekcq4stui.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public final void run(L left, R right) {
        try {
            __CLR4_4_12te2tekcq4stui.R.inc(3657);
            __CLR4_4_12te2tekcq4stui.R.inc(3658);
            helper.run(left, right);
        } finally {
            __CLR4_4_12te2tekcq4stui.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(Object obj) {
        try {
            __CLR4_4_12te2tekcq4stui.R.inc(3659);
            __CLR4_4_12te2tekcq4stui.R.inc(3660);
            if ((((obj == this) && (__CLR4_4_12te2tekcq4stui.R.iget(3661) != 0 | true)) || (__CLR4_4_12te2tekcq4stui.R.iget(3662) == 0 & false))) {
                {
                    __CLR4_4_12te2tekcq4stui.R.inc(3663);
                    return true;
                }
            }
            __CLR4_4_12te2tekcq4stui.R.inc(3664);
            if ((((!(obj instanceof TransformedBinaryProcedure<?, ?>)) && (__CLR4_4_12te2tekcq4stui.R.iget(3665) != 0 | true)) || (__CLR4_4_12te2tekcq4stui.R.iget(3666) == 0 & false))) {
                {
                    __CLR4_4_12te2tekcq4stui.R.inc(3667);
                    return false;
                }
            }
            __CLR4_4_12te2tekcq4stui.R.inc(3668);
            TransformedBinaryProcedure<?, ?> that = (TransformedBinaryProcedure<?, ?>) obj;
            __CLR4_4_12te2tekcq4stui.R.inc(3669);
            return this.helper.function.equals(that.helper.function) && this.helper.procedure.equals(that.helper.procedure);
        } finally {
            __CLR4_4_12te2tekcq4stui.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_12te2tekcq4stui.R.inc(3670);
            __CLR4_4_12te2tekcq4stui.R.inc(3671);
            int result = "TransformedBinaryProcedure".hashCode();
            __CLR4_4_12te2tekcq4stui.R.inc(3672);
            result <<= 2;
            __CLR4_4_12te2tekcq4stui.R.inc(3673);
            result |= helper.procedure.hashCode();
            __CLR4_4_12te2tekcq4stui.R.inc(3674);
            result <<= 2;
            __CLR4_4_12te2tekcq4stui.R.inc(3675);
            result |= helper.function.hashCode();
            __CLR4_4_12te2tekcq4stui.R.inc(3676);
            return result;
        } finally {
            __CLR4_4_12te2tekcq4stui.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_12te2tekcq4stui.R.inc(3677);
            __CLR4_4_12te2tekcq4stui.R.inc(3678);
            return "TransformedBinaryProcedure<" + helper.function + "; " + helper.procedure + ">";
        } finally {
            __CLR4_4_12te2tekcq4stui.R.flushNeeded();
        }
    }
}

