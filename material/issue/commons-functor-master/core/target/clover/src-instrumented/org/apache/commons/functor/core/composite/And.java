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

import org.apache.commons.functor.Predicate;

/**
 * {@link #test Tests} <code>true</code> iff
 * none of its children test <code>false</code>.
 * Note that by this definition, the "and" of
 * an empty collection of predicates tests <code>true</code>.
 * @param <A> the predicate argument type.
 * @version $Revision$ $Date$
 */
public final class And<A> extends BasePredicateList<A> {

    public static class __CLR4_4_120r20rkcq4stmp {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 2650, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new And.
     */
    public And() {
        super();
        __CLR4_4_120r20rkcq4stmp.R.inc(2620);
        try {
            __CLR4_4_120r20rkcq4stmp.R.inc(2619);
        } finally {
            __CLR4_4_120r20rkcq4stmp.R.flushNeeded();
        }
    }

    /**
     * Create a new And instance.
     *
     * @param predicates the predicates to put in and.
     */
    public And(Iterable<Predicate<? super A>> predicates) {
        super(predicates);
        __CLR4_4_120r20rkcq4stmp.R.inc(2622);
        try {
            __CLR4_4_120r20rkcq4stmp.R.inc(2621);
        } finally {
            __CLR4_4_120r20rkcq4stmp.R.flushNeeded();
        }
    }

    /**
     * Create a new And instance.
     *
     * @param predicates the predicates to put in and.
     */
    public And(Predicate<? super A>... predicates) {
        super(predicates);
        __CLR4_4_120r20rkcq4stmp.R.inc(2624);
        try {
            __CLR4_4_120r20rkcq4stmp.R.inc(2623);
        } finally {
            __CLR4_4_120r20rkcq4stmp.R.flushNeeded();
        }
    }

    // modifiers
    // ------------------------------------------------------------------------
    /**
     * Fluently add a Predicate.
     * @param p Predicate to add
     * @return this
     */
    public And<A> and(Predicate<? super A> p) {
        try {
            __CLR4_4_120r20rkcq4stmp.R.inc(2625);
            __CLR4_4_120r20rkcq4stmp.R.inc(2626);
            super.addPredicate(p);
            __CLR4_4_120r20rkcq4stmp.R.inc(2627);
            return this;
        } finally {
            __CLR4_4_120r20rkcq4stmp.R.flushNeeded();
        }
    }

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public boolean test(A obj) {
        try {
            __CLR4_4_120r20rkcq4stmp.R.inc(2628);
            __CLR4_4_120r20rkcq4stmp.R.inc(2629);
            for (Predicate<? super A> p : getPredicateList()) {
                {
                    __CLR4_4_120r20rkcq4stmp.R.inc(2630);
                    if ((((!p.test(obj)) && (__CLR4_4_120r20rkcq4stmp.R.iget(2631) != 0 | true)) || (__CLR4_4_120r20rkcq4stmp.R.iget(2632) == 0 & false))) {
                        {
                            __CLR4_4_120r20rkcq4stmp.R.inc(2633);
                            return false;
                        }
                    }
                }
            }
            __CLR4_4_120r20rkcq4stmp.R.inc(2634);
            return true;
        } finally {
            __CLR4_4_120r20rkcq4stmp.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_120r20rkcq4stmp.R.inc(2635);
            __CLR4_4_120r20rkcq4stmp.R.inc(2636);
            if ((((obj == this) && (__CLR4_4_120r20rkcq4stmp.R.iget(2637) != 0 | true)) || (__CLR4_4_120r20rkcq4stmp.R.iget(2638) == 0 & false))) {
                {
                    __CLR4_4_120r20rkcq4stmp.R.inc(2639);
                    return true;
                }
            }
            __CLR4_4_120r20rkcq4stmp.R.inc(2640);
            if ((((!(obj instanceof And<?>)) && (__CLR4_4_120r20rkcq4stmp.R.iget(2641) != 0 | true)) || (__CLR4_4_120r20rkcq4stmp.R.iget(2642) == 0 & false))) {
                {
                    __CLR4_4_120r20rkcq4stmp.R.inc(2643);
                    return false;
                }
            }
            __CLR4_4_120r20rkcq4stmp.R.inc(2644);
            And<?> that = (And<?>) obj;
            __CLR4_4_120r20rkcq4stmp.R.inc(2645);
            return getPredicateListEquals(that);
        } finally {
            __CLR4_4_120r20rkcq4stmp.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_120r20rkcq4stmp.R.inc(2646);
            __CLR4_4_120r20rkcq4stmp.R.inc(2647);
            return "And".hashCode() ^ getPredicateListHashCode();
        } finally {
            __CLR4_4_120r20rkcq4stmp.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_120r20rkcq4stmp.R.inc(2648);
            __CLR4_4_120r20rkcq4stmp.R.inc(2649);
            return "And<" + getPredicateListToString() + ">";
        } finally {
            __CLR4_4_120r20rkcq4stmp.R.flushNeeded();
        }
    }
}

