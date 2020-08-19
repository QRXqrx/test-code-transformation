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
import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.lang3.Validate;

/**
 * Adapts a
 * {@link BinaryFunction BinaryFunction}
 * to the
 * {@link NullaryFunction NullaryFunction} interface
 * using constant arguments.
 *
 * @param <T> the returned value type.
 * @version $Revision: 1365377 $ $Date: 2012-07-24 21:59:23 -0300 (Tue, 24 Jul 2012) $
 */
public final class FullyBoundNullaryFunction<T> implements NullaryFunction<T> {

    public static class __CLR4_4_17m7mkcq4st0y {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 316, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * The {@link BinaryFunction BinaryFunction} I'm wrapping.
     */
    private final BinaryFunction<Object, Object, ? extends T> function;

    /**
     * The left parameter to pass to {@code function}.
     */
    private final Object left;

    /**
     * The right parameter to pass to {@code function}.
     */
    private final Object right;

    /**
     * Create a new FullyBoundNullaryFunction.
     * @param <L> the left argument type.
     * @param <R> the right argument type.
     * @param function the function to adapt
     * @param left the left side argument to use
     * @param right the right side argument to use
     */
    @SuppressWarnings("unchecked")
    public <L, R> FullyBoundNullaryFunction(BinaryFunction<? super L, ? super R, ? extends T> function, L left, R right) {
        try {
            __CLR4_4_17m7mkcq4st0y.R.inc(274);
            __CLR4_4_17m7mkcq4st0y.R.inc(275);
            this.function = (BinaryFunction<Object, Object, T>) Validate.notNull(function, "BinaryFunction argument was null");
            __CLR4_4_17m7mkcq4st0y.R.inc(276);
            this.left = left;
            __CLR4_4_17m7mkcq4st0y.R.inc(277);
            this.right = right;
        } finally {
            __CLR4_4_17m7mkcq4st0y.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public T evaluate() {
        try {
            __CLR4_4_17m7mkcq4st0y.R.inc(278);
            __CLR4_4_17m7mkcq4st0y.R.inc(279);
            return function.evaluate(left, right);
        } finally {
            __CLR4_4_17m7mkcq4st0y.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_17m7mkcq4st0y.R.inc(280);
            __CLR4_4_17m7mkcq4st0y.R.inc(281);
            if ((((obj == this) && (__CLR4_4_17m7mkcq4st0y.R.iget(282) != 0 | true)) || (__CLR4_4_17m7mkcq4st0y.R.iget(283) == 0 & false))) {
                {
                    __CLR4_4_17m7mkcq4st0y.R.inc(284);
                    return true;
                }
            }
            __CLR4_4_17m7mkcq4st0y.R.inc(285);
            if ((((!(obj instanceof FullyBoundNullaryFunction<?>)) && (__CLR4_4_17m7mkcq4st0y.R.iget(286) != 0 | true)) || (__CLR4_4_17m7mkcq4st0y.R.iget(287) == 0 & false))) {
                {
                    __CLR4_4_17m7mkcq4st0y.R.inc(288);
                    return false;
                }
            }
            __CLR4_4_17m7mkcq4st0y.R.inc(289);
            FullyBoundNullaryFunction<?> that = (FullyBoundNullaryFunction<?>) obj;
            __CLR4_4_17m7mkcq4st0y.R.inc(290);
            return function.equals(that.function) && ((((null == left) && (__CLR4_4_17m7mkcq4st0y.R.iget(291) != 0 | true)) || (__CLR4_4_17m7mkcq4st0y.R.iget(292) == 0 & false)) ? null == that.left : left.equals(that.left)) && ((((null == right) && (__CLR4_4_17m7mkcq4st0y.R.iget(293) != 0 | true)) || (__CLR4_4_17m7mkcq4st0y.R.iget(294) == 0 & false)) ? null == that.right : right.equals(that.right));
        } finally {
            __CLR4_4_17m7mkcq4st0y.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_17m7mkcq4st0y.R.inc(295);
            __CLR4_4_17m7mkcq4st0y.R.inc(296);
            int hash = "FullyBoundNullaryFunction".hashCode();
            __CLR4_4_17m7mkcq4st0y.R.inc(297);
            hash <<= 2;
            __CLR4_4_17m7mkcq4st0y.R.inc(298);
            hash ^= function.hashCode();
            __CLR4_4_17m7mkcq4st0y.R.inc(299);
            hash <<= 2;
            __CLR4_4_17m7mkcq4st0y.R.inc(300);
            if ((((null != left) && (__CLR4_4_17m7mkcq4st0y.R.iget(301) != 0 | true)) || (__CLR4_4_17m7mkcq4st0y.R.iget(302) == 0 & false))) {
                {
                    __CLR4_4_17m7mkcq4st0y.R.inc(303);
                    hash ^= left.hashCode();
                }
            }
            __CLR4_4_17m7mkcq4st0y.R.inc(304);
            hash <<= 2;
            __CLR4_4_17m7mkcq4st0y.R.inc(305);
            if ((((null != right) && (__CLR4_4_17m7mkcq4st0y.R.iget(306) != 0 | true)) || (__CLR4_4_17m7mkcq4st0y.R.iget(307) == 0 & false))) {
                {
                    __CLR4_4_17m7mkcq4st0y.R.inc(308);
                    hash ^= right.hashCode();
                }
            }
            __CLR4_4_17m7mkcq4st0y.R.inc(309);
            return hash;
        } finally {
            __CLR4_4_17m7mkcq4st0y.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_17m7mkcq4st0y.R.inc(310);
            __CLR4_4_17m7mkcq4st0y.R.inc(311);
            return "FullyBoundNullaryFunction<" + function + "(" + left + ", " + right + ")>";
        } finally {
            __CLR4_4_17m7mkcq4st0y.R.flushNeeded();
        }
    }

    /**
     * Adapt a BinaryNullaryFunction as a NullaryFunction.
     * @param <L> left type
     * @param <R> right type
     * @param <T> result type
     * @param function to adapt
     * @param left left side argument
     * @param right right side argument
     * @return FullyBoundNullaryFunction
     */
    public static <L, R, T> FullyBoundNullaryFunction<T> bind(BinaryFunction<? super L, ? super R, ? extends T> function, L left, R right) {
        try {
            __CLR4_4_17m7mkcq4st0y.R.inc(312);
            __CLR4_4_17m7mkcq4st0y.R.inc(313);
            return (((null == function) && (__CLR4_4_17m7mkcq4st0y.R.iget(314) != 0 | true)) || (__CLR4_4_17m7mkcq4st0y.R.iget(315) == 0 & false)) ? null : new FullyBoundNullaryFunction<T>(function, left, right);
        } finally {
            __CLR4_4_17m7mkcq4st0y.R.flushNeeded();
        }
    }
}

