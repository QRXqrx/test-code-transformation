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
package org.apache.commons.functor.adapter;

import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.Function;
import org.apache.commons.lang3.Validate;

/**
 * Adapts a
 * {@link Function Function}
 * to the
 * {@link BinaryFunction BinaryFunction} interface
 * by ignoring the first binary argument.
 *
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @param <T> the returned value type.
 * @version $Revision$ $Date$
 */
public final class IgnoreLeftFunction<L, R, T> implements BinaryFunction<L, R, T> {

    public static class __CLR4_4_1cicikcq4st2q {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 475, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * The {@link Function Function} I'm wrapping.
     */
    private final Function<? super R, ? extends T> function;

    /**
     * Create a new IgnoreLeftFunction.
     * @param function Function for right argument
     */
    public IgnoreLeftFunction(Function<? super R, ? extends T> function) {
        try {
            __CLR4_4_1cicikcq4st2q.R.inc(450);
            __CLR4_4_1cicikcq4st2q.R.inc(451);
            this.function = Validate.notNull(function, "Function argument was null");
        } finally {
            __CLR4_4_1cicikcq4st2q.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public T evaluate(L left, R right) {
        try {
            __CLR4_4_1cicikcq4st2q.R.inc(452);
            __CLR4_4_1cicikcq4st2q.R.inc(453);
            return function.evaluate(right);
        } finally {
            __CLR4_4_1cicikcq4st2q.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_1cicikcq4st2q.R.inc(454);
            __CLR4_4_1cicikcq4st2q.R.inc(455);
            if ((((obj == this) && (__CLR4_4_1cicikcq4st2q.R.iget(456) != 0 | true)) || (__CLR4_4_1cicikcq4st2q.R.iget(457) == 0 & false))) {
                {
                    __CLR4_4_1cicikcq4st2q.R.inc(458);
                    return true;
                }
            }
            __CLR4_4_1cicikcq4st2q.R.inc(459);
            if ((((!(obj instanceof IgnoreLeftFunction<?, ?, ?>)) && (__CLR4_4_1cicikcq4st2q.R.iget(460) != 0 | true)) || (__CLR4_4_1cicikcq4st2q.R.iget(461) == 0 & false))) {
                {
                    __CLR4_4_1cicikcq4st2q.R.inc(462);
                    return false;
                }
            }
            __CLR4_4_1cicikcq4st2q.R.inc(463);
            IgnoreLeftFunction<?, ?, ?> that = (IgnoreLeftFunction<?, ?, ?>) obj;
            __CLR4_4_1cicikcq4st2q.R.inc(464);
            return this.function.equals(that.function);
        } finally {
            __CLR4_4_1cicikcq4st2q.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_1cicikcq4st2q.R.inc(465);
            __CLR4_4_1cicikcq4st2q.R.inc(466);
            int hash = "IgnoreLeftFunction".hashCode();
            __CLR4_4_1cicikcq4st2q.R.inc(467);
            hash ^= function.hashCode();
            __CLR4_4_1cicikcq4st2q.R.inc(468);
            return hash;
        } finally {
            __CLR4_4_1cicikcq4st2q.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_1cicikcq4st2q.R.inc(469);
            __CLR4_4_1cicikcq4st2q.R.inc(470);
            return "IgnoreLeftFunction<" + function + ">";
        } finally {
            __CLR4_4_1cicikcq4st2q.R.flushNeeded();
        }
    }

    /**
     * Adapt a Function to the BinaryFunction interface.
     * @param <L> left type
     * @param <R> right type
     * @param <T> result type
     * @param function to adapt
     * @return IgnoreLeftFunction
     */
    public static <L, R, T> IgnoreLeftFunction<L, R, T> adapt(Function<? super R, ? extends T> function) {
        try {
            __CLR4_4_1cicikcq4st2q.R.inc(471);
            __CLR4_4_1cicikcq4st2q.R.inc(472);
            return (((null == function) && (__CLR4_4_1cicikcq4st2q.R.iget(473) != 0 | true)) || (__CLR4_4_1cicikcq4st2q.R.iget(474) == 0 & false)) ? null : new IgnoreLeftFunction<L, R, T>(function);
        } finally {
            __CLR4_4_1cicikcq4st2q.R.flushNeeded();
        }
    }
}

