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

import org.apache.commons.functor.Function;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.adapter.PredicateFunction;
import org.apache.commons.lang3.Validate;

/**
 * A {@link Predicate Predicate}
 * representing the composition of
 * {@link Function Functions},
 * "chaining" the output of one to the input
 * of another.  For example,
 * <pre>new CompositePredicate(p).of(f)</pre>
 * {@link #test tests} to
 * <code>p.test(f.evaluate(obj))</code>, and
 * <pre>new CompositePredicate(p).of(f).of(g)</pre>
 * {@link #test tests} to
 * <code>p.test(f.evaluate(g.evaluate(obj)))</code>.
 * @param <A> the predicate argument type.
 * @version $Revision: 1345136 $ $Date: 2012-06-01 09:47:06 -0300 (Fri, 01 Jun 2012) $
 */
public final class CompositePredicate<A> implements Predicate<A> {

    public static class __CLR4_4_12bw2bwkcq4stpv {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3046, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * The adapted composite function.
     */
    private final CompositeFunction<? super A, Boolean> function;

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new CompositePredicate.
     * @param predicate Predicate against which the composite functions' output will be tested
     */
    public CompositePredicate(Predicate<? super A> predicate) {
        try {
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3020);
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3021);
            this.function = new CompositeFunction<A, Boolean>(new PredicateFunction<A>(Validate.notNull(predicate, "predicate must not be null")));
        } finally {
            __CLR4_4_12bw2bwkcq4stpv.R.flushNeeded();
        }
    }

    /**
     * Create a new CompositePredicate.
     * @param function delegate
     */
    private CompositePredicate(CompositeFunction<? super A, Boolean> function) {
        try {
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3022);
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3023);
            this.function = function;
        } finally {
            __CLR4_4_12bw2bwkcq4stpv.R.flushNeeded();
        }
    }

    // modifiers
    // ------------------------------------------------------------------------
    /**
     * Fluently obtain a CompositePredicate that applies our predicate to the result of the preceding function.
     * @param <P> the input function left argument and output predicate argument types
     * @param preceding Function
     * @return CompositePredicate<P>
     */
    public <P> CompositePredicate<P> of(Function<? super P, ? extends A> preceding) {
        try {
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3024);
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3025);
            return new CompositePredicate<P>(function.of(preceding));
        } finally {
            __CLR4_4_12bw2bwkcq4stpv.R.flushNeeded();
        }
    }

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public boolean test(A obj) {
        try {
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3026);
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3027);
            return function.evaluate(obj).booleanValue();
        } finally {
            __CLR4_4_12bw2bwkcq4stpv.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3028);
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3029);
            if ((((obj == this) && (__CLR4_4_12bw2bwkcq4stpv.R.iget(3030) != 0 | true)) || (__CLR4_4_12bw2bwkcq4stpv.R.iget(3031) == 0 & false))) {
                {
                    __CLR4_4_12bw2bwkcq4stpv.R.inc(3032);
                    return true;
                }
            }
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3033);
            if ((((!(obj instanceof CompositePredicate<?>)) && (__CLR4_4_12bw2bwkcq4stpv.R.iget(3034) != 0 | true)) || (__CLR4_4_12bw2bwkcq4stpv.R.iget(3035) == 0 & false))) {
                {
                    __CLR4_4_12bw2bwkcq4stpv.R.inc(3036);
                    return false;
                }
            }
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3037);
            CompositePredicate<?> that = (CompositePredicate<?>) obj;
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3038);
            return this.function.equals(that.function);
        } finally {
            __CLR4_4_12bw2bwkcq4stpv.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3039);
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3040);
            int hash = "CompositePredicate".hashCode();
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3041);
            hash <<= 2;
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3042);
            hash ^= function.hashCode();
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3043);
            return hash;
        } finally {
            __CLR4_4_12bw2bwkcq4stpv.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3044);
            __CLR4_4_12bw2bwkcq4stpv.R.inc(3045);
            return "CompositeFunction<" + function + ">";
        } finally {
            __CLR4_4_12bw2bwkcq4stpv.R.flushNeeded();
        }
    }
}

