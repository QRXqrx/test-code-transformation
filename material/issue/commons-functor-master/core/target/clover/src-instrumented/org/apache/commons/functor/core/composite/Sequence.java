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
import org.apache.commons.functor.Procedure;

/**
 * A {@link Procedure Procedure}
 * that {@link Procedure#run runs} an ordered
 * sequence of {@link Procedure Procedures}.
 * When the sequence is empty, this procedure is does
 * nothing.
 * @param <A> the argument type.
 * @version $Revision$ $Date$
 */
public class Sequence<A> implements Procedure<A> {

    public static class __CLR4_4_12rf2rfkcq4sttz {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3621, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * The data structure to store the procedure sequence.
     */
    private final List<Procedure<? super A>> list = new ArrayList<Procedure<? super A>>();

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new Sequence.
     */
    public Sequence() {
        super();
        __CLR4_4_12rf2rfkcq4sttz.R.inc(3580);
        try {
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3579);
        } finally {
            __CLR4_4_12rf2rfkcq4sttz.R.flushNeeded();
        }
    }

    /**
     * Create a new Sequence instance.
     *
     * @param procedures to run sequentially
     */
    public Sequence(Procedure<? super A>... procedures) {
        this();
        __CLR4_4_12rf2rfkcq4sttz.R.inc(3582);
        try {
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3581);
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3583);
            if ((((procedures != null) && (__CLR4_4_12rf2rfkcq4sttz.R.iget(3584) != 0 | true)) || (__CLR4_4_12rf2rfkcq4sttz.R.iget(3585) == 0 & false))) {
                {
                    __CLR4_4_12rf2rfkcq4sttz.R.inc(3586);
                    for (Procedure<? super A> p : procedures) {
                        {
                            __CLR4_4_12rf2rfkcq4sttz.R.inc(3587);
                            then(p);
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_12rf2rfkcq4sttz.R.flushNeeded();
        }
    }

    /**
     * Create a new Sequence instance.
     *
     * @param procedures to run sequentially
     */
    public Sequence(Iterable<Procedure<? super A>> procedures) {
        this();
        __CLR4_4_12rf2rfkcq4sttz.R.inc(3589);
        try {
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3588);
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3590);
            if ((((procedures != null) && (__CLR4_4_12rf2rfkcq4sttz.R.iget(3591) != 0 | true)) || (__CLR4_4_12rf2rfkcq4sttz.R.iget(3592) == 0 & false))) {
                {
                    __CLR4_4_12rf2rfkcq4sttz.R.inc(3593);
                    for (Procedure<? super A> p : procedures) {
                        {
                            __CLR4_4_12rf2rfkcq4sttz.R.inc(3594);
                            then(p);
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_12rf2rfkcq4sttz.R.flushNeeded();
        }
    }

    // modifiers
    // ------------------------------------------------------------------------
    /**
     * Fluently add a Procedure to the sequence.
     * @param p Procedure to add
     * @return this
     */
    public Sequence<A> then(Procedure<? super A> p) {
        try {
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3595);
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3596);
            if ((((p != null) && (__CLR4_4_12rf2rfkcq4sttz.R.iget(3597) != 0 | true)) || (__CLR4_4_12rf2rfkcq4sttz.R.iget(3598) == 0 & false))) {
                {
                    __CLR4_4_12rf2rfkcq4sttz.R.inc(3599);
                    list.add(p);
                }
            }
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3600);
            return this;
        } finally {
            __CLR4_4_12rf2rfkcq4sttz.R.flushNeeded();
        }
    }

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public void run(A obj) {
        try {
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3601);
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3602);
            for (Iterator<Procedure<? super A>> iter = list.iterator(); (((iter.hasNext()) && (__CLR4_4_12rf2rfkcq4sttz.R.iget(3603) != 0 | true)) || (__CLR4_4_12rf2rfkcq4sttz.R.iget(3604) == 0 & false)); ) {
                {
                    __CLR4_4_12rf2rfkcq4sttz.R.inc(3605);
                    iter.next().run(obj);
                }
            }
        } finally {
            __CLR4_4_12rf2rfkcq4sttz.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3606);
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3607);
            if ((((obj == this) && (__CLR4_4_12rf2rfkcq4sttz.R.iget(3608) != 0 | true)) || (__CLR4_4_12rf2rfkcq4sttz.R.iget(3609) == 0 & false))) {
                {
                    __CLR4_4_12rf2rfkcq4sttz.R.inc(3610);
                    return true;
                }
            }
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3611);
            if ((((!(obj instanceof Sequence<?>)) && (__CLR4_4_12rf2rfkcq4sttz.R.iget(3612) != 0 | true)) || (__CLR4_4_12rf2rfkcq4sttz.R.iget(3613) == 0 & false))) {
                {
                    __CLR4_4_12rf2rfkcq4sttz.R.inc(3614);
                    return false;
                }
            }
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3615);
            Sequence<?> that = (Sequence<?>) obj;
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3616);
            return this.list.equals(that.list);
        } finally {
            __CLR4_4_12rf2rfkcq4sttz.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3617);
            // by construction, list is never null
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3618);
            return "Sequence".hashCode() ^ list.hashCode();
        } finally {
            __CLR4_4_12rf2rfkcq4sttz.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3619);
            __CLR4_4_12rf2rfkcq4sttz.R.inc(3620);
            return "Sequence<" + list + ">";
        } finally {
            __CLR4_4_12rf2rfkcq4sttz.R.flushNeeded();
        }
    }
}

