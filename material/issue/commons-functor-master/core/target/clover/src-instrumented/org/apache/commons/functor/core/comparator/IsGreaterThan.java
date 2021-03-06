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
package org.apache.commons.functor.core.comparator;

import java.util.Comparator;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.adapter.RightBoundPredicate;
import org.apache.commons.lang3.Validate;

/**
 * A {@link BinaryPredicate BinaryPredicate} that {@link #test tests}
 * <code>true</code> iff the left argument is greater than the
 * right argument under the specified {@link Comparator}.
 * When no (or a <code>null</code> <code>Comparator</code> is specified,
 * a {@link Comparable Comparable} <code>Comparator</code> is used.
 *
 * @param <T> the binary predicate input types
 * @version $Revision$ $Date$
 */
public final class IsGreaterThan<T> implements BinaryPredicate<T, T> {

    public static class __CLR4_4_11ty1tykcq4stkq {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 2401, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Basic IsGreaterThan instance.
     */
    public static final IsGreaterThan<Comparable<?>> INSTANCE = IsGreaterThan.<Comparable<?>>instance();

    /**
     * The wrapped comparator.
     */
    private final Comparator<? super T> comparator;

    /**
     * Construct a <code>IsGreaterThan</code> {@link BinaryPredicate predicate}
     * for {@link Comparable Comparable}s.
     */
    @SuppressWarnings("unchecked")
    public IsGreaterThan() {
        this((Comparator<? super T>) ComparableComparator.INSTANCE);
        __CLR4_4_11ty1tykcq4stkq.R.inc(2375);
        try {
            __CLR4_4_11ty1tykcq4stkq.R.inc(2374);
        } finally {
            __CLR4_4_11ty1tykcq4stkq.R.flushNeeded();
        }
    }

    /**
     * Construct a <code>IsGreaterThan</code> {@link BinaryPredicate predicate}
     * for the given {@link Comparator Comparator}.
     *
     * @param comparator the {@link Comparator Comparator}, when <code>null</code>,
     *        a <code>Comparator</code> for {@link Comparable Comparable}s will
     *        be used.
     */
    public IsGreaterThan(Comparator<? super T> comparator) {
        try {
            __CLR4_4_11ty1tykcq4stkq.R.inc(2376);
            __CLR4_4_11ty1tykcq4stkq.R.inc(2377);
            this.comparator = Validate.notNull(comparator, "Comparator argument must not be null");
        } finally {
            __CLR4_4_11ty1tykcq4stkq.R.flushNeeded();
        }
    }

    /**
     * Return <code>true</code> iff the <i>left</i> parameter is
     * greater than the <i>right</i> parameter under my current
     * {@link Comparator Comparator}.
     * {@inheritDoc}
     */
    public boolean test(T left, T right) {
        try {
            __CLR4_4_11ty1tykcq4stkq.R.inc(2378);
            __CLR4_4_11ty1tykcq4stkq.R.inc(2379);
            return comparator.compare(left, right) > 0;
        } finally {
            __CLR4_4_11ty1tykcq4stkq.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_11ty1tykcq4stkq.R.inc(2380);
            __CLR4_4_11ty1tykcq4stkq.R.inc(2381);
            if ((((obj == this) && (__CLR4_4_11ty1tykcq4stkq.R.iget(2382) != 0 | true)) || (__CLR4_4_11ty1tykcq4stkq.R.iget(2383) == 0 & false))) {
                {
                    __CLR4_4_11ty1tykcq4stkq.R.inc(2384);
                    return true;
                }
            }
            __CLR4_4_11ty1tykcq4stkq.R.inc(2385);
            if ((((!(obj instanceof IsGreaterThan<?>)) && (__CLR4_4_11ty1tykcq4stkq.R.iget(2386) != 0 | true)) || (__CLR4_4_11ty1tykcq4stkq.R.iget(2387) == 0 & false))) {
                {
                    __CLR4_4_11ty1tykcq4stkq.R.inc(2388);
                    return false;
                }
            }
            __CLR4_4_11ty1tykcq4stkq.R.inc(2389);
            IsGreaterThan<?> that = (IsGreaterThan<?>) obj;
            __CLR4_4_11ty1tykcq4stkq.R.inc(2390);
            return this.comparator.equals(that.comparator);
        } finally {
            __CLR4_4_11ty1tykcq4stkq.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_11ty1tykcq4stkq.R.inc(2391);
            __CLR4_4_11ty1tykcq4stkq.R.inc(2392);
            int hash = "IsGreaterThan".hashCode();
            // by construction, comparator is never null
            __CLR4_4_11ty1tykcq4stkq.R.inc(2393);
            hash ^= comparator.hashCode();
            __CLR4_4_11ty1tykcq4stkq.R.inc(2394);
            return hash;
        } finally {
            __CLR4_4_11ty1tykcq4stkq.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_11ty1tykcq4stkq.R.inc(2395);
            __CLR4_4_11ty1tykcq4stkq.R.inc(2396);
            return "IsGreaterThan<" + comparator + ">";
        } finally {
            __CLR4_4_11ty1tykcq4stkq.R.flushNeeded();
        }
    }

    /**
     * Get a typed IsGreaterThan instance.
     *
     * @param <T> the binary predicate input types
     * @return IsGreaterThan<T>
     */
    public static <T extends Comparable<?>> IsGreaterThan<T> instance() {
        try {
            __CLR4_4_11ty1tykcq4stkq.R.inc(2397);
            __CLR4_4_11ty1tykcq4stkq.R.inc(2398);
            return new IsGreaterThan<T>();
        } finally {
            __CLR4_4_11ty1tykcq4stkq.R.flushNeeded();
        }
    }

    /**
     * Get an IsGreaterThan Predicate.
     *
     * @param <T> the binary predicate input types
     * @param right the right side object of the IsGreaterThan comparison
     * @return Predicate<T>
     */
    public static <T extends Comparable<?>> Predicate<T> instance(T right) {
        try {
            __CLR4_4_11ty1tykcq4stkq.R.inc(2399);
            __CLR4_4_11ty1tykcq4stkq.R.inc(2400);
            return RightBoundPredicate.bind(new IsGreaterThan<T>(), right);
        } finally {
            __CLR4_4_11ty1tykcq4stkq.R.flushNeeded();
        }
    }
}

