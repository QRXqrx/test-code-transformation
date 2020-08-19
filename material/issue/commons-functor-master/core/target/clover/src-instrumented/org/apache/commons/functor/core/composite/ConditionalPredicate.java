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
import org.apache.commons.lang3.Validate;

/**
 * A {@link Predicate Predicate}
 * similiar to Java's "ternary"
 * or "conditional" operator (<code>&#x3F; &#x3A;</code>).
 * Given three {@link Predicate predicate}
 * <i>p</i>, <i>q</i>, <i>r</i>,
 * {@link #test tests}
 * to
 * <code>p.test(x) ? q.test(x) : r.test(x)</code>.
 * @param <A> the predicate argument type.
 * @version $Revision$ $Date$
 */
public final class ConditionalPredicate<A> implements Predicate<A> {

    public static class __CLR4_4_12k92k9kcq4stsf {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3351, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Base hash integer used to shift hash.
     */
    private static final int HASH_SHIFT = 4;

    // attributes
    // ------------------------------------------------------------------------
    /**
     * the condition to be evaluated.
     */
    private final Predicate<? super A> ifPred;

    /**
     * the predicate executed if the condition is satisfied.
     */
    private final Predicate<? super A> thenPred;

    /**
     * the predicate executed if the condition is not satisfied.
     */
    private final Predicate<? super A> elsePred;

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new ConditionalPredicate.
     * @param ifPred if
     * @param thenPred then
     * @param elsePred else
     */
    public ConditionalPredicate(Predicate<? super A> ifPred, Predicate<? super A> thenPred, Predicate<? super A> elsePred) {
        try {
            __CLR4_4_12k92k9kcq4stsf.R.inc(3321);
            __CLR4_4_12k92k9kcq4stsf.R.inc(3322);
            this.ifPred = Validate.notNull(ifPred, "'if' Predicate argument was null");
            __CLR4_4_12k92k9kcq4stsf.R.inc(3323);
            this.thenPred = Validate.notNull(thenPred, "'then' Predicate argument was null");
            __CLR4_4_12k92k9kcq4stsf.R.inc(3324);
            this.elsePred = Validate.notNull(elsePred, "'else' Predicate argument was null");
        } finally {
            __CLR4_4_12k92k9kcq4stsf.R.flushNeeded();
        }
    }

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public boolean test(A obj) {
        try {
            __CLR4_4_12k92k9kcq4stsf.R.inc(3325);
            __CLR4_4_12k92k9kcq4stsf.R.inc(3326);
            return (((ifPred.test(obj)) && (__CLR4_4_12k92k9kcq4stsf.R.iget(3327) != 0 | true)) || (__CLR4_4_12k92k9kcq4stsf.R.iget(3328) == 0 & false)) ? thenPred.test(obj) : elsePred.test(obj);
        } finally {
            __CLR4_4_12k92k9kcq4stsf.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_12k92k9kcq4stsf.R.inc(3329);
            __CLR4_4_12k92k9kcq4stsf.R.inc(3330);
            if ((((obj == this) && (__CLR4_4_12k92k9kcq4stsf.R.iget(3331) != 0 | true)) || (__CLR4_4_12k92k9kcq4stsf.R.iget(3332) == 0 & false))) {
                {
                    __CLR4_4_12k92k9kcq4stsf.R.inc(3333);
                    return true;
                }
            }
            __CLR4_4_12k92k9kcq4stsf.R.inc(3334);
            if ((((!(obj instanceof ConditionalPredicate<?>)) && (__CLR4_4_12k92k9kcq4stsf.R.iget(3335) != 0 | true)) || (__CLR4_4_12k92k9kcq4stsf.R.iget(3336) == 0 & false))) {
                {
                    __CLR4_4_12k92k9kcq4stsf.R.inc(3337);
                    return false;
                }
            }
            __CLR4_4_12k92k9kcq4stsf.R.inc(3338);
            ConditionalPredicate<?> that = (ConditionalPredicate<?>) obj;
            __CLR4_4_12k92k9kcq4stsf.R.inc(3339);
            return this.ifPred.equals(that.ifPred) && this.thenPred.equals(that.thenPred) && this.elsePred.equals(that.elsePred);
        } finally {
            __CLR4_4_12k92k9kcq4stsf.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_12k92k9kcq4stsf.R.inc(3340);
            __CLR4_4_12k92k9kcq4stsf.R.inc(3341);
            int hash = "ConditionalPredicate".hashCode();
            __CLR4_4_12k92k9kcq4stsf.R.inc(3342);
            hash <<= HASH_SHIFT;
            __CLR4_4_12k92k9kcq4stsf.R.inc(3343);
            hash ^= ifPred.hashCode();
            __CLR4_4_12k92k9kcq4stsf.R.inc(3344);
            hash <<= HASH_SHIFT;
            __CLR4_4_12k92k9kcq4stsf.R.inc(3345);
            hash ^= thenPred.hashCode();
            __CLR4_4_12k92k9kcq4stsf.R.inc(3346);
            hash <<= HASH_SHIFT;
            __CLR4_4_12k92k9kcq4stsf.R.inc(3347);
            hash ^= elsePred.hashCode();
            __CLR4_4_12k92k9kcq4stsf.R.inc(3348);
            return hash;
        } finally {
            __CLR4_4_12k92k9kcq4stsf.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_12k92k9kcq4stsf.R.inc(3349);
            __CLR4_4_12k92k9kcq4stsf.R.inc(3350);
            return "ConditionalPredicate<" + ifPred + "?" + thenPred + ":" + elsePred + ">";
        } finally {
            __CLR4_4_12k92k9kcq4stsf.R.flushNeeded();
        }
    }
}

