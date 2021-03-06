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
package org.apache.commons.functor.generator.loop;

import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.lang3.Validate;

/**
 * Wrap another {@link Generator} such that {@link #run(Procedure)} continues
 * as long as a condition is true (test after).
 *
 * @param <E> the type of elements held in this generator.
 * @version $Revision: 1508677 $ $Date: 2013-07-30 19:48:02 -0300 (Tue, 30 Jul 2013) $
 */
public class GenerateWhile<E> extends LoopGenerator<E> {

    public static class __CLR4_4_12zx2zxkcq4stwg {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 3915, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * The condition has to verified in order to execute the generation.
     */
    private final Predicate<? super E> test;

    /**
     * Create a new GenerateWhile.
     * @param wrapped {@link Generator}
     * @param test {@link Predicate}
     */
    public GenerateWhile(Generator<? extends E> wrapped, Predicate<? super E> test) {
        super(Validate.notNull(wrapped, "Generator argument was null"));
        __CLR4_4_12zx2zxkcq4stwg.R.inc(3886);
        try {
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3885);
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3887);
            this.test = Validate.notNull(test, "Predicate argument was null");
        } finally {
            __CLR4_4_12zx2zxkcq4stwg.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void run(final Procedure<? super E> proc) {
        try {
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3888);
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3889);
            getWrappedGenerator().run(new Procedure<E>() {

                public void run(E obj) {
                    try {
                        __CLR4_4_12zx2zxkcq4stwg.R.inc(3890);
                        __CLR4_4_12zx2zxkcq4stwg.R.inc(3891);
                        proc.run(obj);
                        __CLR4_4_12zx2zxkcq4stwg.R.inc(3892);
                        if ((((!test.test(obj)) && (__CLR4_4_12zx2zxkcq4stwg.R.iget(3893) != 0 | true)) || (__CLR4_4_12zx2zxkcq4stwg.R.iget(3894) == 0 & false))) {
                            {
                                __CLR4_4_12zx2zxkcq4stwg.R.inc(3895);
                                GenerateWhile.this.stop();
                            }
                        }
                    } finally {
                        __CLR4_4_12zx2zxkcq4stwg.R.flushNeeded();
                    }
                }
            });
        } finally {
            __CLR4_4_12zx2zxkcq4stwg.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3896);
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3897);
            if ((((obj == this) && (__CLR4_4_12zx2zxkcq4stwg.R.iget(3898) != 0 | true)) || (__CLR4_4_12zx2zxkcq4stwg.R.iget(3899) == 0 & false))) {
                {
                    __CLR4_4_12zx2zxkcq4stwg.R.inc(3900);
                    return true;
                }
            }
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3901);
            if ((((!(obj instanceof GenerateWhile<?>)) && (__CLR4_4_12zx2zxkcq4stwg.R.iget(3902) != 0 | true)) || (__CLR4_4_12zx2zxkcq4stwg.R.iget(3903) == 0 & false))) {
                {
                    __CLR4_4_12zx2zxkcq4stwg.R.inc(3904);
                    return false;
                }
            }
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3905);
            GenerateWhile<?> other = (GenerateWhile<?>) obj;
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3906);
            return other.getWrappedGenerator().equals(getWrappedGenerator()) && other.test.equals(test);
        } finally {
            __CLR4_4_12zx2zxkcq4stwg.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3907);
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3908);
            int result = "GenerateWhile".hashCode();
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3909);
            result <<= 2;
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3910);
            Generator<?> gen = getWrappedGenerator();
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3911);
            result ^= gen.hashCode();
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3912);
            result <<= 2;
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3913);
            result ^= test.hashCode();
            __CLR4_4_12zx2zxkcq4stwg.R.inc(3914);
            return result;
        } finally {
            __CLR4_4_12zx2zxkcq4stwg.R.flushNeeded();
        }
    }
}

