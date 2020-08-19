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

import org.apache.commons.functor.NullaryPredicate;

/**
 * {@link #test Tests} <code>true</code> iff
 * none of its children test <code>false</code>.
 * Note that by this definition, the "and" of
 * an empty collection of predicates tests <code>true</code>.
 * @version $Revision: 1345136 $ $Date: 2012-06-01 09:47:06 -0300 (Fri, 01 Jun 2012) $
 */
public final class NullaryAnd extends BaseNullaryPredicateList {

    public static class __CLR4_4_12mz2mzkcq4stt4 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3450, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Create a new NullaryAnd.
     */
    public NullaryAnd() {
        super();
        __CLR4_4_12mz2mzkcq4stt4.R.inc(3420);
        try {
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3419);
        } finally {
            __CLR4_4_12mz2mzkcq4stt4.R.flushNeeded();
        }
    }

    /**
     * Create a new NullaryAnd instance.
     *
     * @param predicates the predicates to add
     */
    public NullaryAnd(Iterable<NullaryPredicate> predicates) {
        super(predicates);
        __CLR4_4_12mz2mzkcq4stt4.R.inc(3422);
        try {
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3421);
        } finally {
            __CLR4_4_12mz2mzkcq4stt4.R.flushNeeded();
        }
    }

    /**
     * Create a new NullaryAnd instance.
     *
     * @param predicates the predicates to add
     */
    public NullaryAnd(NullaryPredicate... predicates) {
        super(predicates);
        __CLR4_4_12mz2mzkcq4stt4.R.inc(3424);
        try {
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3423);
        } finally {
            __CLR4_4_12mz2mzkcq4stt4.R.flushNeeded();
        }
    }

    // modifiers
    // ------------------------------------------------------------------------
    /**
     * Add a Predicate.
     * @param p Predicate to add
     * @return this
     */
    public NullaryAnd and(NullaryPredicate p) {
        try {
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3425);
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3426);
            super.addNullaryPredicate(p);
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3427);
            return this;
        } finally {
            __CLR4_4_12mz2mzkcq4stt4.R.flushNeeded();
        }
    }

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public boolean test() {
        try {
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3428);
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3429);
            for (NullaryPredicate p : getNullaryPredicateList()) {
                {
                    __CLR4_4_12mz2mzkcq4stt4.R.inc(3430);
                    if ((((!p.test()) && (__CLR4_4_12mz2mzkcq4stt4.R.iget(3431) != 0 | true)) || (__CLR4_4_12mz2mzkcq4stt4.R.iget(3432) == 0 & false))) {
                        {
                            __CLR4_4_12mz2mzkcq4stt4.R.inc(3433);
                            return false;
                        }
                    }
                }
            }
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3434);
            return true;
        } finally {
            __CLR4_4_12mz2mzkcq4stt4.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3435);
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3436);
            if ((((obj == this) && (__CLR4_4_12mz2mzkcq4stt4.R.iget(3437) != 0 | true)) || (__CLR4_4_12mz2mzkcq4stt4.R.iget(3438) == 0 & false))) {
                {
                    __CLR4_4_12mz2mzkcq4stt4.R.inc(3439);
                    return true;
                }
            }
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3440);
            if ((((!(obj instanceof NullaryAnd)) && (__CLR4_4_12mz2mzkcq4stt4.R.iget(3441) != 0 | true)) || (__CLR4_4_12mz2mzkcq4stt4.R.iget(3442) == 0 & false))) {
                {
                    __CLR4_4_12mz2mzkcq4stt4.R.inc(3443);
                    return false;
                }
            }
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3444);
            NullaryAnd that = (NullaryAnd) obj;
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3445);
            return getNullaryPredicateListEquals(that);
        } finally {
            __CLR4_4_12mz2mzkcq4stt4.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3446);
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3447);
            return "And".hashCode() ^ getNullaryPredicateListHashCode();
        } finally {
            __CLR4_4_12mz2mzkcq4stt4.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3448);
            __CLR4_4_12mz2mzkcq4stt4.R.inc(3449);
            return "And<" + getNullaryPredicateListToString() + ">";
        } finally {
            __CLR4_4_12mz2mzkcq4stt4.R.flushNeeded();
        }
    }
}

