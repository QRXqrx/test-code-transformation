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
package org.apache.commons.functor.range;

import java.util.Iterator;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.lang3.Validate;

/**
 * A generator for a range of doubles.
 *
 * @since 1.0
 * @version $Revision$ $Date$
 */
public class DoubleRange extends NumericRange<Double> {

    public static class __CLR4_4_13ah3ahkcq4stz3 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 4316, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Calculate default step.
     */
    public static final BinaryFunction<Double, Double, Double> DEFAULT_STEP = new BinaryFunction<Double, Double, Double>() {

        public Double evaluate(Double left, Double right) {
            try {
                __CLR4_4_13ah3ahkcq4stz3.R.inc(4265);
                __CLR4_4_13ah3ahkcq4stz3.R.inc(4266);
                return (((left > right) && (__CLR4_4_13ah3ahkcq4stz3.R.iget(4267) != 0 | true)) || (__CLR4_4_13ah3ahkcq4stz3.R.iget(4268) == 0 & false)) ? -1.0d : 1.0d;
            } finally {
                __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
            }
        }
    };

    // constructors
    // ---------------------------------------------------------------
    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param to end
     */
    public DoubleRange(Number from, Number to) {
        this(from.doubleValue(), to.doubleValue());
        __CLR4_4_13ah3ahkcq4stz3.R.inc(4270);
        try {
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4269);
        } finally {
            __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
        }
    }

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     */
    public DoubleRange(Number from, Number to, Number step) {
        this(from.doubleValue(), to.doubleValue(), step.doubleValue());
        __CLR4_4_13ah3ahkcq4stz3.R.inc(4272);
        try {
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4271);
        } finally {
            __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
        }
    }

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param to end
     */
    public DoubleRange(double from, double to) {
        this(from, to, DEFAULT_STEP.evaluate(from, to).intValue());
        __CLR4_4_13ah3ahkcq4stz3.R.inc(4274);
        try {
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4273);
        } finally {
            __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
        }
    }

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     */
    public DoubleRange(double from, double to, double step) {
        this(from, DEFAULT_LEFT_BOUND_TYPE, to, DEFAULT_RIGHT_BOUND_TYPE, step);
        __CLR4_4_13ah3ahkcq4stz3.R.inc(4276);
        try {
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4275);
        } finally {
            __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
        }
    }

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param to end
     * @throws NullPointerException if either {@link Endpoint} is {@code null}
     */
    public DoubleRange(Endpoint<Double> from, Endpoint<Double> to) {
        this(from, to, DEFAULT_STEP.evaluate(from.getValue(), to.getValue()));
        __CLR4_4_13ah3ahkcq4stz3.R.inc(4278);
        try {
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4277);
        } finally {
            __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
        }
    }

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @throws NullPointerException if either bound type is {@code null}
     */
    public DoubleRange(double from, BoundType leftBoundType, double to, BoundType rightBoundType) {
        this(from, leftBoundType, to, rightBoundType, DEFAULT_STEP.evaluate(from, to));
        __CLR4_4_13ah3ahkcq4stz3.R.inc(4280);
        try {
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4279);
        } finally {
            __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
        }
    }

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @throws NullPointerException if either {@link Endpoint} is {@code null}
     */
    public DoubleRange(Endpoint<Double> from, Endpoint<Double> to, double step) {
        super(from, to, Double.valueOf(step), new BinaryFunction<Double, Double, Double>() {

            public Double evaluate(Double left, Double right) {
                try {
                    __CLR4_4_13ah3ahkcq4stz3.R.inc(4282);
                    __CLR4_4_13ah3ahkcq4stz3.R.inc(4283);
                    return Double.valueOf(left.doubleValue() + right.doubleValue());
                } finally {
                    __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
                }
            }
        });
        __CLR4_4_13ah3ahkcq4stz3.R.inc(4284);
        try {
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4281);
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4285);
            final double f = from.getValue();
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4286);
            final double t = to.getValue();
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4287);
            Validate.isTrue(f == t || Math.signum(step) == Math.signum(t - f), "Will never reach '%s' from '%s' using step %s", t, f, step);
        } finally {
            __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
        }
    }

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @param step increment
     * @throws NullPointerException if either bound type is {@code null}
     */
    public DoubleRange(double from, BoundType leftBoundType, double to, BoundType rightBoundType, double step) {
        this(new Endpoint<Double>(from, leftBoundType), new Endpoint<Double>(to, rightBoundType), step);
        __CLR4_4_13ah3ahkcq4stz3.R.inc(4289);
        try {
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4288);
        } finally {
            __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    protected Iterator<Double> createIterator() {
        try {
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4290);
            __CLR4_4_13ah3ahkcq4stz3.R.inc(4291);
            return new Iterator<Double>() {

                private double currentValue;

                {
                    try {
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4292);
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4293);
                        currentValue = leftEndpoint.getValue();
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4294);
                        if ((((leftEndpoint.getBoundType() == BoundType.OPEN) && (__CLR4_4_13ah3ahkcq4stz3.R.iget(4295) != 0 | true)) || (__CLR4_4_13ah3ahkcq4stz3.R.iget(4296) == 0 & false))) {
                            {
                                __CLR4_4_13ah3ahkcq4stz3.R.inc(4297);
                                this.currentValue += step;
                            }
                        }
                    } finally {
                        __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
                    }
                }

                public void remove() {
                    try {
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4298);
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4299);
                        throw new UnsupportedOperationException();
                    } finally {
                        __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
                    }
                }

                public Double next() {
                    try {
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4300);
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4301);
                        final double step = getStep();
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4302);
                        final double r = currentValue;
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4303);
                        currentValue += step;
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4304);
                        return Double.valueOf(r);
                    } finally {
                        __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
                    }
                }

                public boolean hasNext() {
                    try {
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4305);
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4306);
                        final int cmp = Double.compare(currentValue, rightEndpoint.getValue());
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4307);
                        if ((((cmp == 0) && (__CLR4_4_13ah3ahkcq4stz3.R.iget(4308) != 0 | true)) || (__CLR4_4_13ah3ahkcq4stz3.R.iget(4309) == 0 & false))) {
                            {
                                __CLR4_4_13ah3ahkcq4stz3.R.inc(4310);
                                return rightEndpoint.getBoundType() == BoundType.CLOSED;
                            }
                        }
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4311);
                        if ((((step > 0d) && (__CLR4_4_13ah3ahkcq4stz3.R.iget(4312) != 0 | true)) || (__CLR4_4_13ah3ahkcq4stz3.R.iget(4313) == 0 & false))) {
                            {
                                __CLR4_4_13ah3ahkcq4stz3.R.inc(4314);
                                return cmp < 0;
                            }
                        }
                        __CLR4_4_13ah3ahkcq4stz3.R.inc(4315);
                        return cmp > 0;
                    } finally {
                        __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
                    }
                }
            };
        } finally {
            __CLR4_4_13ah3ahkcq4stz3.R.flushNeeded();
        }
    }
}

