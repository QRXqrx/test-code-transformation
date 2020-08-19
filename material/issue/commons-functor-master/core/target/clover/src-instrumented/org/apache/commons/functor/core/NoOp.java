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
package org.apache.commons.functor.core;

import org.apache.commons.functor.BinaryProcedure;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.functor.Procedure;

/**
 * A procedure that does nothing at all.
 * <p>
 * Note that this class implements {@link Procedure},
 * {@link Procedure}, and {@link BinaryProcedure}.
 * </p>
 * @version $Revision$ $Date$
 */
public final class NoOp implements NullaryProcedure, Procedure<Object>, BinaryProcedure<Object, Object> {

    public static class __CLR4_4_119w19wkcq4stek {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 1668, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    // static attributes
    // ------------------------------------------------------------------------
    /**
     * Basic NoOp instance.
     */
    public static final NoOp INSTANCE = new NoOp();

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new NoOp.
     */
    public NoOp() {
        try {
            __CLR4_4_119w19wkcq4stek.R.inc(1652);
        } finally {
            __CLR4_4_119w19wkcq4stek.R.flushNeeded();
        }
    }

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public void run() {
        try {
            __CLR4_4_119w19wkcq4stek.R.inc(1653);
        } finally {
            __CLR4_4_119w19wkcq4stek.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void run(Object obj) {
        try {
            __CLR4_4_119w19wkcq4stek.R.inc(1654);
        } finally {
            __CLR4_4_119w19wkcq4stek.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void run(Object left, Object right) {
        try {
            __CLR4_4_119w19wkcq4stek.R.inc(1655);
        } finally {
            __CLR4_4_119w19wkcq4stek.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object that) {
        try {
            __CLR4_4_119w19wkcq4stek.R.inc(1656);
            __CLR4_4_119w19wkcq4stek.R.inc(1657);
            return (that instanceof NoOp);
        } finally {
            __CLR4_4_119w19wkcq4stek.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_119w19wkcq4stek.R.inc(1658);
            __CLR4_4_119w19wkcq4stek.R.inc(1659);
            return "NoOp".hashCode();
        } finally {
            __CLR4_4_119w19wkcq4stek.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_119w19wkcq4stek.R.inc(1660);
            __CLR4_4_119w19wkcq4stek.R.inc(1661);
            return "NoOp";
        } finally {
            __CLR4_4_119w19wkcq4stek.R.flushNeeded();
        }
    }

    // static methods
    // ------------------------------------------------------------------------
    /**
     * Get a NoOp instance.
     * @return NoOp
     */
    public static NoOp instance() {
        try {
            __CLR4_4_119w19wkcq4stek.R.inc(1662);
            __CLR4_4_119w19wkcq4stek.R.inc(1663);
            return INSTANCE;
        } finally {
            __CLR4_4_119w19wkcq4stek.R.flushNeeded();
        }
    }

    /**
     * Get a typed NoOp {@link Procedure}.
     * @param <A> type
     * @return <code>Procedure&lt;A&gt;</code>
     */
    @SuppressWarnings("unchecked")
    public static <A> Procedure<A> unaryInstance() {
        try {
            __CLR4_4_119w19wkcq4stek.R.inc(1664);
            __CLR4_4_119w19wkcq4stek.R.inc(1665);
            return (Procedure<A>) INSTANCE;
        } finally {
            __CLR4_4_119w19wkcq4stek.R.flushNeeded();
        }
    }

    /**
     * Get a typed NoOp {@link BinaryProcedure}.
     * @param <L> left type
     * @param <R> right type
     * @return <code>BinaryProcedure&lt;L, R&gt;</code>
     */
    @SuppressWarnings("unchecked")
    public static <L, R> BinaryProcedure<L, R> binaryInstance() {
        try {
            __CLR4_4_119w19wkcq4stek.R.inc(1666);
            __CLR4_4_119w19wkcq4stek.R.inc(1667);
            return (BinaryProcedure<L, R>) INSTANCE;
        } finally {
            __CLR4_4_119w19wkcq4stek.R.flushNeeded();
        }
    }
}

