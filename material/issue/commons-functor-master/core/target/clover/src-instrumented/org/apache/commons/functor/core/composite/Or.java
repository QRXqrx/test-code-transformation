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
 * at least one of its children test <code>true</code>.
 * Note that by this definition, the "or" of
 * an empty collection of predicates tests <code>false</code>.
 * @param <A> the predicate argument type.
 * @version $Revision$ $Date$
 */
public final class Or<A> extends BasePredicateList<A> {

    public static class __CLR4_4_12qk2qkkcq4sttt {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3579, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Create a new Or.
     */
    public Or() {
        super();
        __CLR4_4_12qk2qkkcq4sttt.R.inc(3549);
        try {
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3548);
        } finally {
            __CLR4_4_12qk2qkkcq4sttt.R.flushNeeded();
        }
    }

    /**
     * Create a new Or instance.
     *
     * @param predicates the predicates to put in or.
     */
    public Or(Iterable<Predicate<? super A>> predicates) {
        super(predicates);
        __CLR4_4_12qk2qkkcq4sttt.R.inc(3551);
        try {
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3550);
        } finally {
            __CLR4_4_12qk2qkkcq4sttt.R.flushNeeded();
        }
    }

    /**
     * Create a new Or instance.
     *
     * @param predicates the predicates to put in or.
     */
    public Or(Predicate<? super A>... predicates) {
        super(predicates);
        __CLR4_4_12qk2qkkcq4sttt.R.inc(3553);
        try {
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3552);
        } finally {
            __CLR4_4_12qk2qkkcq4sttt.R.flushNeeded();
        }
    }

    // modifiers
    // ------------------------------------------------------------------------
    /**
     * Fluently add a Predicate.
     * @param p Predicate to add
     * @return this
     */
    public Or<A> or(Predicate<? super A> p) {
        try {
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3554);
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3555);
            super.addPredicate(p);
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3556);
            return this;
        } finally {
            __CLR4_4_12qk2qkkcq4sttt.R.flushNeeded();
        }
    }

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public boolean test(A a) {
        try {
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3557);
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3558);
            for (Predicate<? super A> p : getPredicateList()) {
                {
                    __CLR4_4_12qk2qkkcq4sttt.R.inc(3559);
                    if ((((p.test(a)) && (__CLR4_4_12qk2qkkcq4sttt.R.iget(3560) != 0 | true)) || (__CLR4_4_12qk2qkkcq4sttt.R.iget(3561) == 0 & false))) {
                        {
                            __CLR4_4_12qk2qkkcq4sttt.R.inc(3562);
                            return true;
                        }
                    }
                }
            }
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3563);
            return false;
        } finally {
            __CLR4_4_12qk2qkkcq4sttt.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3564);
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3565);
            if ((((obj == this) && (__CLR4_4_12qk2qkkcq4sttt.R.iget(3566) != 0 | true)) || (__CLR4_4_12qk2qkkcq4sttt.R.iget(3567) == 0 & false))) {
                {
                    __CLR4_4_12qk2qkkcq4sttt.R.inc(3568);
                    return true;
                }
            }
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3569);
            if ((((!(obj instanceof Or<?>)) && (__CLR4_4_12qk2qkkcq4sttt.R.iget(3570) != 0 | true)) || (__CLR4_4_12qk2qkkcq4sttt.R.iget(3571) == 0 & false))) {
                {
                    __CLR4_4_12qk2qkkcq4sttt.R.inc(3572);
                    return false;
                }
            }
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3573);
            Or<?> that = (Or<?>) obj;
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3574);
            return getPredicateListEquals(that);
        } finally {
            __CLR4_4_12qk2qkkcq4sttt.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3575);
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3576);
            return "Or".hashCode() ^ getPredicateListHashCode();
        } finally {
            __CLR4_4_12qk2qkkcq4sttt.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3577);
            __CLR4_4_12qk2qkkcq4sttt.R.inc(3578);
            return "Or<" + getPredicateListToString() + ">";
        } finally {
            __CLR4_4_12qk2qkkcq4sttt.R.flushNeeded();
        }
    }
}

