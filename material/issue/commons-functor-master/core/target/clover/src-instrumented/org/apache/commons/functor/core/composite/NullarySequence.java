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
import java.util.Iterator;
import java.util.List;
import org.apache.commons.functor.NullaryProcedure;

/**
 * A {@link NullaryProcedure NullaryProcedure}
 * that {@link NullaryProcedure#run runs} an ordered
 * sequence of {@link NullaryProcedure NullaryProcedures}.
 * When the sequence is empty, this procedure is does
 * nothing.
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class NullarySequence implements NullaryProcedure {

    public static class __CLR4_4_12pe2pekcq4sttn {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3548, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * The data structure where storing procedures sequence.
     */
    private List<NullaryProcedure> list = new ArrayList<NullaryProcedure>();

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new NullarySequence.
     */
    public NullarySequence() {
        super();
        __CLR4_4_12pe2pekcq4sttn.R.inc(3507);
        try {
            __CLR4_4_12pe2pekcq4sttn.R.inc(3506);
        } finally {
            __CLR4_4_12pe2pekcq4sttn.R.flushNeeded();
        }
    }

    /**
     * Create a new NullarySequence instance.
     *
     * @param procedures to run sequentially
     */
    public NullarySequence(NullaryProcedure... procedures) {
        this();
        __CLR4_4_12pe2pekcq4sttn.R.inc(3509);
        try {
            __CLR4_4_12pe2pekcq4sttn.R.inc(3508);
            __CLR4_4_12pe2pekcq4sttn.R.inc(3510);
            if ((((procedures != null) && (__CLR4_4_12pe2pekcq4sttn.R.iget(3511) != 0 | true)) || (__CLR4_4_12pe2pekcq4sttn.R.iget(3512) == 0 & false))) {
                {
                    __CLR4_4_12pe2pekcq4sttn.R.inc(3513);
                    for (NullaryProcedure p : procedures) {
                        {
                            __CLR4_4_12pe2pekcq4sttn.R.inc(3514);
                            then(p);
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_12pe2pekcq4sttn.R.flushNeeded();
        }
    }

    /**
     * Create a new NullarySequence instance.
     *
     * @param procedures to run sequentially
     */
    public NullarySequence(Iterable<NullaryProcedure> procedures) {
        this();
        __CLR4_4_12pe2pekcq4sttn.R.inc(3516);
        try {
            __CLR4_4_12pe2pekcq4sttn.R.inc(3515);
            __CLR4_4_12pe2pekcq4sttn.R.inc(3517);
            if ((((procedures != null) && (__CLR4_4_12pe2pekcq4sttn.R.iget(3518) != 0 | true)) || (__CLR4_4_12pe2pekcq4sttn.R.iget(3519) == 0 & false))) {
                {
                    __CLR4_4_12pe2pekcq4sttn.R.inc(3520);
                    for (NullaryProcedure p : procedures) {
                        {
                            __CLR4_4_12pe2pekcq4sttn.R.inc(3521);
                            then(p);
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_12pe2pekcq4sttn.R.flushNeeded();
        }
    }

    // modifiers
    // ------------------------------------------------------------------------
    /**
     * Fluently add a NullaryProcedure.
     * @param p NullaryProcedure to add
     * @return this
     */
    public final NullarySequence then(NullaryProcedure p) {
        try {
            __CLR4_4_12pe2pekcq4sttn.R.inc(3522);
            __CLR4_4_12pe2pekcq4sttn.R.inc(3523);
            if ((((p != null) && (__CLR4_4_12pe2pekcq4sttn.R.iget(3524) != 0 | true)) || (__CLR4_4_12pe2pekcq4sttn.R.iget(3525) == 0 & false))) {
                {
                    __CLR4_4_12pe2pekcq4sttn.R.inc(3526);
                    list.add(p);
                }
            }
            __CLR4_4_12pe2pekcq4sttn.R.inc(3527);
            return this;
        } finally {
            __CLR4_4_12pe2pekcq4sttn.R.flushNeeded();
        }
    }

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public final void run() {
        try {
            __CLR4_4_12pe2pekcq4sttn.R.inc(3528);
            __CLR4_4_12pe2pekcq4sttn.R.inc(3529);
            for (Iterator<NullaryProcedure> iter = list.iterator(); (((iter.hasNext()) && (__CLR4_4_12pe2pekcq4sttn.R.iget(3530) != 0 | true)) || (__CLR4_4_12pe2pekcq4sttn.R.iget(3531) == 0 & false)); ) {
                {
                    __CLR4_4_12pe2pekcq4sttn.R.inc(3532);
                    iter.next().run();
                }
            }
        } finally {
            __CLR4_4_12pe2pekcq4sttn.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(Object obj) {
        try {
            __CLR4_4_12pe2pekcq4sttn.R.inc(3533);
            __CLR4_4_12pe2pekcq4sttn.R.inc(3534);
            if ((((this == obj) && (__CLR4_4_12pe2pekcq4sttn.R.iget(3535) != 0 | true)) || (__CLR4_4_12pe2pekcq4sttn.R.iget(3536) == 0 & false))) {
                {
                    __CLR4_4_12pe2pekcq4sttn.R.inc(3537);
                    return true;
                }
            }
            __CLR4_4_12pe2pekcq4sttn.R.inc(3538);
            if ((((!(obj instanceof NullarySequence)) && (__CLR4_4_12pe2pekcq4sttn.R.iget(3539) != 0 | true)) || (__CLR4_4_12pe2pekcq4sttn.R.iget(3540) == 0 & false))) {
                {
                    __CLR4_4_12pe2pekcq4sttn.R.inc(3541);
                    return false;
                }
            }
            __CLR4_4_12pe2pekcq4sttn.R.inc(3542);
            NullarySequence that = (NullarySequence) obj;
            __CLR4_4_12pe2pekcq4sttn.R.inc(3543);
            return this.list.equals(that.list);
        } finally {
            __CLR4_4_12pe2pekcq4sttn.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_12pe2pekcq4sttn.R.inc(3544);
            // by construction, list is never null
            __CLR4_4_12pe2pekcq4sttn.R.inc(3545);
            return "NullarySequence".hashCode() ^ list.hashCode();
        } finally {
            __CLR4_4_12pe2pekcq4sttn.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_12pe2pekcq4sttn.R.inc(3546);
            __CLR4_4_12pe2pekcq4sttn.R.inc(3547);
            return "NullarySequence<" + list + ">";
        } finally {
            __CLR4_4_12pe2pekcq4sttn.R.flushNeeded();
        }
    }
}

