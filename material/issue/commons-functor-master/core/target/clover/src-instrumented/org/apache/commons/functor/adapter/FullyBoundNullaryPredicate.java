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

import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.lang3.Validate;

/**
 * Adapts a
 * {@link BinaryPredicate BinaryPredicate}
 * to the
 * {@link org.apache.commons.functor.NullaryPredicate NullaryPredicate} interface
 * using a constant left-side argument.
 *
 * @version $Revision: 1365377 $ $Date: 2012-07-24 21:59:23 -0300 (Tue, 24 Jul 2012) $
 */
public final class FullyBoundNullaryPredicate implements NullaryPredicate {

    public static class __CLR4_4_18s8skcq4st1b {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 358, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * The {@link BinaryPredicate BinaryPredicate} I'm wrapping.
     */
    private final BinaryPredicate<Object, Object> predicate;

    /**
     * The left parameter to pass to {@code predicate}.
     */
    private final Object left;

    /**
     * The right parameter to pass to {@code predicate}.
     */
    private final Object right;

    /**
     * Create a new FullyBoundNullaryPredicate instance.
     * @param <L> left type
     * @param <R> right type
     * @param predicate the predicate to adapt
     * @param left the left argument to use
     * @param right the right argument to use
     */
    @SuppressWarnings("unchecked")
    public <L, R> FullyBoundNullaryPredicate(BinaryPredicate<? super L, ? super R> predicate, L left, R right) {
        try {
            __CLR4_4_18s8skcq4st1b.R.inc(316);
            __CLR4_4_18s8skcq4st1b.R.inc(317);
            this.predicate = (BinaryPredicate<Object, Object>) Validate.notNull(predicate, "BinaryPredicate argument was null");
            __CLR4_4_18s8skcq4st1b.R.inc(318);
            this.left = left;
            __CLR4_4_18s8skcq4st1b.R.inc(319);
            this.right = right;
        } finally {
            __CLR4_4_18s8skcq4st1b.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean test() {
        try {
            __CLR4_4_18s8skcq4st1b.R.inc(320);
            __CLR4_4_18s8skcq4st1b.R.inc(321);
            return predicate.test(left, right);
        } finally {
            __CLR4_4_18s8skcq4st1b.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_18s8skcq4st1b.R.inc(322);
            __CLR4_4_18s8skcq4st1b.R.inc(323);
            if ((((obj == this) && (__CLR4_4_18s8skcq4st1b.R.iget(324) != 0 | true)) || (__CLR4_4_18s8skcq4st1b.R.iget(325) == 0 & false))) {
                {
                    __CLR4_4_18s8skcq4st1b.R.inc(326);
                    return true;
                }
            }
            __CLR4_4_18s8skcq4st1b.R.inc(327);
            if ((((!(obj instanceof FullyBoundNullaryPredicate)) && (__CLR4_4_18s8skcq4st1b.R.iget(328) != 0 | true)) || (__CLR4_4_18s8skcq4st1b.R.iget(329) == 0 & false))) {
                {
                    __CLR4_4_18s8skcq4st1b.R.inc(330);
                    return false;
                }
            }
            __CLR4_4_18s8skcq4st1b.R.inc(331);
            FullyBoundNullaryPredicate that = (FullyBoundNullaryPredicate) obj;
            __CLR4_4_18s8skcq4st1b.R.inc(332);
            return predicate.equals(that.predicate) && ((((null == left) && (__CLR4_4_18s8skcq4st1b.R.iget(333) != 0 | true)) || (__CLR4_4_18s8skcq4st1b.R.iget(334) == 0 & false)) ? null == that.left : left.equals(that.left)) && ((((null == right) && (__CLR4_4_18s8skcq4st1b.R.iget(335) != 0 | true)) || (__CLR4_4_18s8skcq4st1b.R.iget(336) == 0 & false)) ? null == that.right : right.equals(that.right));
        } finally {
            __CLR4_4_18s8skcq4st1b.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_18s8skcq4st1b.R.inc(337);
            __CLR4_4_18s8skcq4st1b.R.inc(338);
            int hash = "FullyBoundNullaryPredicate".hashCode();
            __CLR4_4_18s8skcq4st1b.R.inc(339);
            hash <<= 2;
            __CLR4_4_18s8skcq4st1b.R.inc(340);
            hash ^= predicate.hashCode();
            __CLR4_4_18s8skcq4st1b.R.inc(341);
            hash <<= 2;
            __CLR4_4_18s8skcq4st1b.R.inc(342);
            if ((((null != left) && (__CLR4_4_18s8skcq4st1b.R.iget(343) != 0 | true)) || (__CLR4_4_18s8skcq4st1b.R.iget(344) == 0 & false))) {
                {
                    __CLR4_4_18s8skcq4st1b.R.inc(345);
                    hash ^= left.hashCode();
                }
            }
            __CLR4_4_18s8skcq4st1b.R.inc(346);
            hash <<= 2;
            __CLR4_4_18s8skcq4st1b.R.inc(347);
            if ((((null != right) && (__CLR4_4_18s8skcq4st1b.R.iget(348) != 0 | true)) || (__CLR4_4_18s8skcq4st1b.R.iget(349) == 0 & false))) {
                {
                    __CLR4_4_18s8skcq4st1b.R.inc(350);
                    hash ^= right.hashCode();
                }
            }
            __CLR4_4_18s8skcq4st1b.R.inc(351);
            return hash;
        } finally {
            __CLR4_4_18s8skcq4st1b.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_18s8skcq4st1b.R.inc(352);
            __CLR4_4_18s8skcq4st1b.R.inc(353);
            return "FullyBoundNullaryPredicate<" + predicate + "(" + left + ", " + right + ")>";
        } finally {
            __CLR4_4_18s8skcq4st1b.R.flushNeeded();
        }
    }

    /**
     * Adapt a BinaryPredicate to the NullaryPredicate interface.
     * @param predicate to adapt
     * @param <L> left type
     * @param <R> right type
     * @param left L argument to always send as the left operand to the wrapped function
     * @param right R argument to always send as the right operand to the wrapped function
     * @return FullyBoundNullaryPredicate
     */
    public static <L, R> FullyBoundNullaryPredicate bind(BinaryPredicate<? super L, ? super R> predicate, L left, R right) {
        try {
            __CLR4_4_18s8skcq4st1b.R.inc(354);
            __CLR4_4_18s8skcq4st1b.R.inc(355);
            return (((null == predicate) && (__CLR4_4_18s8skcq4st1b.R.iget(356) != 0 | true)) || (__CLR4_4_18s8skcq4st1b.R.iget(357) == 0 & false)) ? null : new FullyBoundNullaryPredicate(predicate, left, right);
        } finally {
            __CLR4_4_18s8skcq4st1b.R.flushNeeded();
        }
    }
}

