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
import org.apache.commons.functor.Predicate;

/**
 * Abstract base class for {@link Predicate Predicates}
 * composed of a list of {@link Predicate Predicates}.
 * @param <A> the predicate argument type.
 * @version $Revision$ $Date$
 */
abstract class BasePredicateList<A> implements Predicate<A> {

    public static class __CLR4_4_1238238kcq4stna {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 2737, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * A list where storing the adapted predicates.
     */
    private final List<Predicate<? super A>> list = new ArrayList<Predicate<? super A>>();

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new BasePredicateList.
     */
    protected BasePredicateList() {
        super();
        __CLR4_4_1238238kcq4stna.R.inc(2709);
        try {
            __CLR4_4_1238238kcq4stna.R.inc(2708);
        } finally {
            __CLR4_4_1238238kcq4stna.R.flushNeeded();
        }
    }

    /**
     * Create a new BasePredicateList instance.
     *
     * @param predicates to add
     */
    protected BasePredicateList(Predicate<? super A>... predicates) {
        this();
        __CLR4_4_1238238kcq4stna.R.inc(2711);
        try {
            __CLR4_4_1238238kcq4stna.R.inc(2710);
            __CLR4_4_1238238kcq4stna.R.inc(2712);
            if ((((predicates != null) && (__CLR4_4_1238238kcq4stna.R.iget(2713) != 0 | true)) || (__CLR4_4_1238238kcq4stna.R.iget(2714) == 0 & false))) {
                {
                    __CLR4_4_1238238kcq4stna.R.inc(2715);
                    for (Predicate<? super A> p : predicates) {
                        {
                            __CLR4_4_1238238kcq4stna.R.inc(2716);
                            addPredicate(p);
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_1238238kcq4stna.R.flushNeeded();
        }
    }

    /**
     * Create a new BasePredicateList instance.
     *
     * @param predicates to add
     */
    protected BasePredicateList(Iterable<Predicate<? super A>> predicates) {
        this();
        __CLR4_4_1238238kcq4stna.R.inc(2718);
        try {
            __CLR4_4_1238238kcq4stna.R.inc(2717);
            __CLR4_4_1238238kcq4stna.R.inc(2719);
            if ((((predicates != null) && (__CLR4_4_1238238kcq4stna.R.iget(2720) != 0 | true)) || (__CLR4_4_1238238kcq4stna.R.iget(2721) == 0 & false))) {
                {
                    __CLR4_4_1238238kcq4stna.R.inc(2722);
                    for (Predicate<? super A> p : predicates) {
                        {
                            __CLR4_4_1238238kcq4stna.R.inc(2723);
                            addPredicate(p);
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_1238238kcq4stna.R.flushNeeded();
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
     * Add a Predicate to the list.
     * @param p Predicate to add
     */
    protected void addPredicate(Predicate<? super A> p) {
        try {
            __CLR4_4_1238238kcq4stna.R.inc(2724);
            __CLR4_4_1238238kcq4stna.R.inc(2725);
            if ((((p != null) && (__CLR4_4_1238238kcq4stna.R.iget(2726) != 0 | true)) || (__CLR4_4_1238238kcq4stna.R.iget(2727) == 0 & false))) {
                {
                    __CLR4_4_1238238kcq4stna.R.inc(2728);
                    list.add(p);
                }
            }
        } finally {
            __CLR4_4_1238238kcq4stna.R.flushNeeded();
        }
    }

    // protected
    // ------------------------------------------------------------------------
    /**
     * Get the "live" list of contained {@link Predicate}s.
     * @return List
     */
    protected List<Predicate<? super A>> getPredicateList() {
        try {
            __CLR4_4_1238238kcq4stna.R.inc(2729);
            __CLR4_4_1238238kcq4stna.R.inc(2730);
            return list;
        } finally {
            __CLR4_4_1238238kcq4stna.R.flushNeeded();
        }
    }

    /**
     * Learn whether another BasePredicateList has content equal to this.
     * @param that the BasePredicateList to test
     * @return boolean
     */
    protected boolean getPredicateListEquals(BasePredicateList<?> that) {
        try {
            __CLR4_4_1238238kcq4stna.R.inc(2731);
            __CLR4_4_1238238kcq4stna.R.inc(2732);
            return (null != that && this.list.equals(that.list));
        } finally {
            __CLR4_4_1238238kcq4stna.R.flushNeeded();
        }
    }

    /**
     * Get a hashCode for the list.
     * @return int
     */
    protected int getPredicateListHashCode() {
        try {
            __CLR4_4_1238238kcq4stna.R.inc(2733);
            __CLR4_4_1238238kcq4stna.R.inc(2734);
            return list.hashCode();
        } finally {
            __CLR4_4_1238238kcq4stna.R.flushNeeded();
        }
    }

    /**
     * Get a toString for the list.
     * @return String
     */
    protected String getPredicateListToString() {
        try {
            __CLR4_4_1238238kcq4stna.R.inc(2735);
            __CLR4_4_1238238kcq4stna.R.inc(2736);
            return String.valueOf(list);
        } finally {
            __CLR4_4_1238238kcq4stna.R.flushNeeded();
        }
    }
}

