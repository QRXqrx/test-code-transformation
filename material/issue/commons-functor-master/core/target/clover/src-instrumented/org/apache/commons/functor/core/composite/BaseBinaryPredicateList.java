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

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.functor.BinaryPredicate;

/**
 * Abstract base class for {@link BinaryPredicate BinaryPredicates}
 * composed of a list of {@link BinaryPredicate BinaryPredicates}.
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @version $Revision$ $Date$
 */
abstract class BaseBinaryPredicateList<L, R> implements BinaryPredicate<L, R> {

    public static class __CLR4_4_121m21mkcq4stmw {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 2679, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    // attributes
    // ------------------------------------------------------------------------
    /**
     * A list to maintain all the adapted predicates.
     */
    private final List<BinaryPredicate<? super L, ? super R>> list = new ArrayList<BinaryPredicate<? super L, ? super R>>();

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new BaseBinaryPredicateList.
     */
    protected BaseBinaryPredicateList() {
        super();
        __CLR4_4_121m21mkcq4stmw.R.inc(2651);
        try {
            __CLR4_4_121m21mkcq4stmw.R.inc(2650);
        } finally {
            __CLR4_4_121m21mkcq4stmw.R.flushNeeded();
        }
    }

    /**
     * Create a new BaseBinaryPredicateList instance.
     *
     * @param predicates to add
     */
    protected BaseBinaryPredicateList(BinaryPredicate<? super L, ? super R>... predicates) {
        this();
        __CLR4_4_121m21mkcq4stmw.R.inc(2653);
        try {
            __CLR4_4_121m21mkcq4stmw.R.inc(2652);
            __CLR4_4_121m21mkcq4stmw.R.inc(2654);
            if ((((predicates != null) && (__CLR4_4_121m21mkcq4stmw.R.iget(2655) != 0 | true)) || (__CLR4_4_121m21mkcq4stmw.R.iget(2656) == 0 & false))) {
                {
                    __CLR4_4_121m21mkcq4stmw.R.inc(2657);
                    for (BinaryPredicate<? super L, ? super R> p : predicates) {
                        {
                            __CLR4_4_121m21mkcq4stmw.R.inc(2658);
                            addBinaryPredicate(p);
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_121m21mkcq4stmw.R.flushNeeded();
        }
    }

    /**
     * Create a new BaseBinaryPredicateList instance.
     *
     * @param predicates to add
     */
    protected BaseBinaryPredicateList(Iterable<BinaryPredicate<? super L, ? super R>> predicates) {
        this();
        __CLR4_4_121m21mkcq4stmw.R.inc(2660);
        try {
            __CLR4_4_121m21mkcq4stmw.R.inc(2659);
            __CLR4_4_121m21mkcq4stmw.R.inc(2661);
            if ((((predicates != null) && (__CLR4_4_121m21mkcq4stmw.R.iget(2662) != 0 | true)) || (__CLR4_4_121m21mkcq4stmw.R.iget(2663) == 0 & false))) {
                {
                    __CLR4_4_121m21mkcq4stmw.R.inc(2664);
                    for (BinaryPredicate<? super L, ? super R> p : predicates) {
                        {
                            __CLR4_4_121m21mkcq4stmw.R.inc(2665);
                            addBinaryPredicate(p);
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_121m21mkcq4stmw.R.flushNeeded();
        }
    }

    // abstract
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public abstract boolean equals(Object that);

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract int hashCode();

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract String toString();

    // modifiers
    // ------------------------------------------------------------------------
    /**
     * Add a BinaryPredicate to the list.
     * @param p BinaryPredicate to add
     */
    protected void addBinaryPredicate(BinaryPredicate<? super L, ? super R> p) {
        try {
            __CLR4_4_121m21mkcq4stmw.R.inc(2666);
            __CLR4_4_121m21mkcq4stmw.R.inc(2667);
            if ((((p != null) && (__CLR4_4_121m21mkcq4stmw.R.iget(2668) != 0 | true)) || (__CLR4_4_121m21mkcq4stmw.R.iget(2669) == 0 & false))) {
                {
                    __CLR4_4_121m21mkcq4stmw.R.inc(2670);
                    list.add(p);
                }
            }
        } finally {
            __CLR4_4_121m21mkcq4stmw.R.flushNeeded();
        }
    }

    // protected
    // ------------------------------------------------------------------------
    /**
     * Get the "live" list of contained {@link BinaryPredicate} instances.
     * @return List
     */
    protected List<BinaryPredicate<? super L, ? super R>> getBinaryPredicateList() {
        try {
            __CLR4_4_121m21mkcq4stmw.R.inc(2671);
            __CLR4_4_121m21mkcq4stmw.R.inc(2672);
            return list;
        } finally {
            __CLR4_4_121m21mkcq4stmw.R.flushNeeded();
        }
    }

    /**
     * Learn whether another list is equal to this one.
     * @param that BaseBinaryPredicateList to test
     * @return boolean
     */
    protected boolean getBinaryPredicateListEquals(BaseBinaryPredicateList<?, ?> that) {
        try {
            __CLR4_4_121m21mkcq4stmw.R.inc(2673);
            __CLR4_4_121m21mkcq4stmw.R.inc(2674);
            return (null != that && this.list.equals(that.list));
        } finally {
            __CLR4_4_121m21mkcq4stmw.R.flushNeeded();
        }
    }

    /**
     * Get a hashCode for the list.
     * @return int
     */
    protected int getBinaryPredicateListHashCode() {
        try {
            __CLR4_4_121m21mkcq4stmw.R.inc(2675);
            __CLR4_4_121m21mkcq4stmw.R.inc(2676);
            return list.hashCode();
        } finally {
            __CLR4_4_121m21mkcq4stmw.R.flushNeeded();
        }
    }

    /**
     * Get a toString for the list.
     * @return String
     */
    protected String getBinaryPredicateListToString() {
        try {
            __CLR4_4_121m21mkcq4stmw.R.inc(2677);
            __CLR4_4_121m21mkcq4stmw.R.inc(2678);
            return String.valueOf(list);
        } finally {
            __CLR4_4_121m21mkcq4stmw.R.flushNeeded();
        }
    }
}

