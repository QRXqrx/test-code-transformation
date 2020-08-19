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
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.lang3.Validate;

/**
 * Abstract base class for {@link WhileDoNullaryProcedure} and {@link DoWhileNullaryProcedure}
 * used to implement loop procedures.
 * <p>
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public abstract class AbstractLoopNullaryProcedure implements NullaryProcedure {

    public static class __CLR4_4_11zz1zzkcq4stmi {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 2619, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    /**
     * The condition has to be verified that while true,
     * forces the action repetition.
     */
    private final NullaryPredicate condition;

    /**
     * The action to be repeated until the condition is true.
     */
    private final NullaryProcedure action;

    /**
     * Create a new AbstractLoopNullaryProcedure.
     * @param condition while true, repeat
     * @param action loop body
     */
    protected AbstractLoopNullaryProcedure(NullaryPredicate condition, NullaryProcedure action) {
        try {
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2591);
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2592);
            this.condition = Validate.notNull(condition, "NullaryProcedure argument must not be null");
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2593);
            this.action = Validate.notNull(action, "NullaryProcedure argument must not be null");
        } finally {
            __CLR4_4_11zz1zzkcq4stmi.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(Object object) {
        try {
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2594);
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2595);
            if ((((object == this) && (__CLR4_4_11zz1zzkcq4stmi.R.iget(2596) != 0 | true)) || (__CLR4_4_11zz1zzkcq4stmi.R.iget(2597) == 0 & false))) {
                {
                    __CLR4_4_11zz1zzkcq4stmi.R.inc(2598);
                    return true;
                }
            }
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2599);
            if ((((!(object instanceof AbstractLoopNullaryProcedure)) && (__CLR4_4_11zz1zzkcq4stmi.R.iget(2600) != 0 | true)) || (__CLR4_4_11zz1zzkcq4stmi.R.iget(2601) == 0 & false))) {
                {
                    __CLR4_4_11zz1zzkcq4stmi.R.inc(2602);
                    return false;
                }
            }
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2603);
            AbstractLoopNullaryProcedure that = (AbstractLoopNullaryProcedure) object;
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2604);
            return (getCondition().equals(that.getCondition()) && (getAction().equals(that.getAction())));
        } finally {
            __CLR4_4_11zz1zzkcq4stmi.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2605);
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2606);
            return hashCode("AbstractLoopNullaryProcedure".hashCode());
        } finally {
            __CLR4_4_11zz1zzkcq4stmi.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2607);
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2608);
            return getClass().getName() + "<" + getCondition() + "," + getAction() + ">";
        } finally {
            __CLR4_4_11zz1zzkcq4stmi.R.flushNeeded();
        }
    }

    /**
     * Create a hashCode by manipulating an input hashCode and factoring in instance state.
     * @param hash incoming hashCode
     * @return int
     */
    protected int hashCode(int hash) {
        try {
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2609);
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2610);
            hash <<= HASH_SHIFT;
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2611);
            hash ^= getAction().hashCode();
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2612);
            hash <<= HASH_SHIFT;
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2613);
            hash ^= getCondition().hashCode();
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2614);
            return hash;
        } finally {
            __CLR4_4_11zz1zzkcq4stmi.R.flushNeeded();
        }
    }

    /**
     * Get the condition.
     * @return NullaryPredicate
     */
    protected final NullaryPredicate getCondition() {
        try {
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2615);
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2616);
            return condition;
        } finally {
            __CLR4_4_11zz1zzkcq4stmi.R.flushNeeded();
        }
    }

    /**
     * Get the action.
     * @return NullaryProcedure
     */
    protected final NullaryProcedure getAction() {
        try {
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2617);
            __CLR4_4_11zz1zzkcq4stmi.R.inc(2618);
            return action;
        } finally {
            __CLR4_4_11zz1zzkcq4stmi.R.flushNeeded();
        }
    }
}

