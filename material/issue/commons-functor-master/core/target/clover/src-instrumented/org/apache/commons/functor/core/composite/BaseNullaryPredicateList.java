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
import org.apache.commons.functor.NullaryPredicate;

/**
 * Abstract base class for {@link NullaryPredicate NullaryPredicates}
 * composed of a list of {@link NullaryPredicate NullaryPredicates}.
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
abstract class BaseNullaryPredicateList implements NullaryPredicate {

    public static class __CLR4_4_122f22fkcq4stn3 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 2708, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
    private final List<NullaryPredicate> list = new ArrayList<NullaryPredicate>();

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new BaseNullaryPredicateList instance.
     */
    protected BaseNullaryPredicateList() {
        super();
        __CLR4_4_122f22fkcq4stn3.R.inc(2680);
        try {
            __CLR4_4_122f22fkcq4stn3.R.inc(2679);
        } finally {
            __CLR4_4_122f22fkcq4stn3.R.flushNeeded();
        }
    }

    /**
     * Create a new BaseNullaryPredicateList instance.
     *
     * @param predicates to add
     */
    protected BaseNullaryPredicateList(NullaryPredicate... predicates) {
        this();
        __CLR4_4_122f22fkcq4stn3.R.inc(2682);
        try {
            __CLR4_4_122f22fkcq4stn3.R.inc(2681);
            __CLR4_4_122f22fkcq4stn3.R.inc(2683);
            if ((((predicates != null) && (__CLR4_4_122f22fkcq4stn3.R.iget(2684) != 0 | true)) || (__CLR4_4_122f22fkcq4stn3.R.iget(2685) == 0 & false))) {
                {
                    __CLR4_4_122f22fkcq4stn3.R.inc(2686);
                    for (NullaryPredicate p : predicates) {
                        {
                            __CLR4_4_122f22fkcq4stn3.R.inc(2687);
                            addNullaryPredicate(p);
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_122f22fkcq4stn3.R.flushNeeded();
        }
    }

    /**
     * Create a new BaseNullaryPredicateList instance.
     *
     * @param predicates to add
     */
    protected BaseNullaryPredicateList(Iterable<NullaryPredicate> predicates) {
        this();
        __CLR4_4_122f22fkcq4stn3.R.inc(2689);
        try {
            __CLR4_4_122f22fkcq4stn3.R.inc(2688);
            __CLR4_4_122f22fkcq4stn3.R.inc(2690);
            if ((((predicates != null) && (__CLR4_4_122f22fkcq4stn3.R.iget(2691) != 0 | true)) || (__CLR4_4_122f22fkcq4stn3.R.iget(2692) == 0 & false))) {
                {
                    __CLR4_4_122f22fkcq4stn3.R.inc(2693);
                    for (NullaryPredicate p : predicates) {
                        {
                            __CLR4_4_122f22fkcq4stn3.R.inc(2694);
                            addNullaryPredicate(p);
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_122f22fkcq4stn3.R.flushNeeded();
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
     * Add a NullaryPredicate to the list.
     * @param p NullaryPredicate to add
     */
    protected void addNullaryPredicate(NullaryPredicate p) {
        try {
            __CLR4_4_122f22fkcq4stn3.R.inc(2695);
            __CLR4_4_122f22fkcq4stn3.R.inc(2696);
            if ((((p != null) && (__CLR4_4_122f22fkcq4stn3.R.iget(2697) != 0 | true)) || (__CLR4_4_122f22fkcq4stn3.R.iget(2698) == 0 & false))) {
                {
                    __CLR4_4_122f22fkcq4stn3.R.inc(2699);
                    list.add(p);
                }
            }
        } finally {
            __CLR4_4_122f22fkcq4stn3.R.flushNeeded();
        }
    }

    // protected
    // ------------------------------------------------------------------------
    /**
     * Get the "live" list of {@link NullaryPredicate}s.
     * @return List<NullaryPredicate>
     */
    protected List<NullaryPredicate> getNullaryPredicateList() {
        try {
            __CLR4_4_122f22fkcq4stn3.R.inc(2700);
            __CLR4_4_122f22fkcq4stn3.R.inc(2701);
            return list;
        } finally {
            __CLR4_4_122f22fkcq4stn3.R.flushNeeded();
        }
    }

    /**
     * Learn whether the list of another BaseNullaryPredicateList is equal to my list.
     * @param that BaseNullaryPredicateList to test
     * @return boolean
     */
    protected boolean getNullaryPredicateListEquals(BaseNullaryPredicateList that) {
        try {
            __CLR4_4_122f22fkcq4stn3.R.inc(2702);
            __CLR4_4_122f22fkcq4stn3.R.inc(2703);
            return (null != that && this.list.equals(that.list));
        } finally {
            __CLR4_4_122f22fkcq4stn3.R.flushNeeded();
        }
    }

    /**
     * Get a hashCode for my list.
     * @return int
     */
    protected int getNullaryPredicateListHashCode() {
        try {
            __CLR4_4_122f22fkcq4stn3.R.inc(2704);
            __CLR4_4_122f22fkcq4stn3.R.inc(2705);
            return list.hashCode();
        } finally {
            __CLR4_4_122f22fkcq4stn3.R.flushNeeded();
        }
    }

    /**
     * Get a toString for my list.
     * @return String
     */
    protected String getNullaryPredicateListToString() {
        try {
            __CLR4_4_122f22fkcq4stn3.R.inc(2706);
            __CLR4_4_122f22fkcq4stn3.R.inc(2707);
            return String.valueOf(list);
        } finally {
            __CLR4_4_122f22fkcq4stn3.R.flushNeeded();
        }
    }
}

