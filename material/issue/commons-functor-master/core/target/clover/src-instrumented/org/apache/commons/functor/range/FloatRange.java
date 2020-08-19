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
 * A generator for a range of float.
 *
 * @since 1.0
 * @version $Revision$ $Date$
 */
public class FloatRange extends NumericRange<Float> {

    public static class __CLR4_4_13cy3cykcq4stzn {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 4405, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
    // ---------------------------------------------------------------
    /**
     * Calculate default step.
     */
    public static final BinaryFunction<Float, Float, Float> DEFAULT_STEP = new BinaryFunction<Float, Float, Float>() {

        public Float evaluate(Float left, Float right) {
            try {
                __CLR4_4_13cy3cykcq4stzn.R.inc(4354);
                __CLR4_4_13cy3cykcq4stzn.R.inc(4355);
                return (((left > right) && (__CLR4_4_13cy3cykcq4stzn.R.iget(4356) != 0 | true)) || (__CLR4_4_13cy3cykcq4stzn.R.iget(4357) == 0 & false)) ? -1.0f : 1.0f;
            } finally {
                __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
            }
        }
    };

    // constructors
    // ---------------------------------------------------------------
    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param to end
     */
    public FloatRange(Number from, Number to) {
        this(from.floatValue(), to.floatValue());
        __CLR4_4_13cy3cykcq4stzn.R.inc(4359);
        try {
            __CLR4_4_13cy3cykcq4stzn.R.inc(4358);
        } finally {
            __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
        }
    }

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     */
    public FloatRange(Number from, Number to, Number step) {
        this(from.floatValue(), to.floatValue(), step.floatValue());
        __CLR4_4_13cy3cykcq4stzn.R.inc(4361);
        try {
            __CLR4_4_13cy3cykcq4stzn.R.inc(4360);
        } finally {
            __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
        }
    }

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param to end
     */
    public FloatRange(float from, float to) {
        this(from, to, DEFAULT_STEP.evaluate(from, to).floatValue());
        __CLR4_4_13cy3cykcq4stzn.R.inc(4363);
        try {
            __CLR4_4_13cy3cykcq4stzn.R.inc(4362);
        } finally {
            __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
        }
    }

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     */
    public FloatRange(float from, float to, float step) {
        this(from, DEFAULT_LEFT_BOUND_TYPE, to, DEFAULT_RIGHT_BOUND_TYPE, step);
        __CLR4_4_13cy3cykcq4stzn.R.inc(4365);
        try {
            __CLR4_4_13cy3cykcq4stzn.R.inc(4364);
        } finally {
            __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
        }
    }

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param to end
     * @throws NullPointerException if either {@link Endpoint} is {@code null}
     */
    public FloatRange(Endpoint<Float> from, Endpoint<Float> to) {
        this(from, to, DEFAULT_STEP.evaluate(from.getValue(), to.getValue()));
        __CLR4_4_13cy3cykcq4stzn.R.inc(4367);
        try {
            __CLR4_4_13cy3cykcq4stzn.R.inc(4366);
        } finally {
            __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
        }
    }

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @throws NullPointerException if either {@link Endpoint} is {@code null}
     */
    public FloatRange(Endpoint<Float> from, Endpoint<Float> to, float step) {
        super(from, to, Float.valueOf(step), new BinaryFunction<Float, Float, Float>() {

            public Float evaluate(Float left, Float right) {
                try {
                    __CLR4_4_13cy3cykcq4stzn.R.inc(4369);
                    __CLR4_4_13cy3cykcq4stzn.R.inc(4370);
                    return Float.valueOf(left.floatValue() + right.floatValue());
                } finally {
                    __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
                }
            }
        });
        __CLR4_4_13cy3cykcq4stzn.R.inc(4371);
        try {
            __CLR4_4_13cy3cykcq4stzn.R.inc(4368);
            __CLR4_4_13cy3cykcq4stzn.R.inc(4372);
            final float f = from.getValue();
            __CLR4_4_13cy3cykcq4stzn.R.inc(4373);
            final float t = to.getValue();
            __CLR4_4_13cy3cykcq4stzn.R.inc(4374);
            Validate.isTrue(f == t || Math.signum(step) == Math.signum(t - f), "Will never reach '%s' from '%s' using step %s", t, f, step);
        } finally {
            __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
        }
    }

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @throws NullPointerException if either bound type is {@code null}
     */
    public FloatRange(float from, BoundType leftBoundType, float to, BoundType rightBoundType) {
        this(from, leftBoundType, to, rightBoundType, DEFAULT_STEP.evaluate(from, to));
        __CLR4_4_13cy3cykcq4stzn.R.inc(4376);
        try {
            __CLR4_4_13cy3cykcq4stzn.R.inc(4375);
        } finally {
            __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
        }
    }

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @param step increment
     * @throws NullPointerException if either bound type is {@code null}
     */
    public FloatRange(float from, BoundType leftBoundType, float to, BoundType rightBoundType, float step) {
        this(new Endpoint<Float>(from, leftBoundType), new Endpoint<Float>(to, rightBoundType), step);
        __CLR4_4_13cy3cykcq4stzn.R.inc(4378);
        try {
            __CLR4_4_13cy3cykcq4stzn.R.inc(4377);
        } finally {
            __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    protected Iterator<Float> createIterator() {
        try {
            __CLR4_4_13cy3cykcq4stzn.R.inc(4379);
            __CLR4_4_13cy3cykcq4stzn.R.inc(4380);
            return new Iterator<Float>() {

                private float currentValue;

                {
                    try {
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4381);
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4382);
                        currentValue = leftEndpoint.getValue();
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4383);
                        if ((((leftEndpoint.getBoundType() == BoundType.OPEN) && (__CLR4_4_13cy3cykcq4stzn.R.iget(4384) != 0 | true)) || (__CLR4_4_13cy3cykcq4stzn.R.iget(4385) == 0 & false))) {
                            {
                                __CLR4_4_13cy3cykcq4stzn.R.inc(4386);
                                this.currentValue += step;
                            }
                        }
                    } finally {
                        __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
                    }
                }

                public void remove() {
                    try {
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4387);
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4388);
                        throw new UnsupportedOperationException();
                    } finally {
                        __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
                    }
                }

                public Float next() {
                    try {
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4389);
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4390);
                        final float step = getStep();
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4391);
                        final float r = currentValue;
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4392);
                        currentValue += step;
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4393);
                        return Float.valueOf(r);
                    } finally {
                        __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
                    }
                }

                public boolean hasNext() {
                    try {
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4394);
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4395);
                        final int cmp = Float.compare(currentValue, rightEndpoint.getValue());
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4396);
                        if ((((cmp == 0) && (__CLR4_4_13cy3cykcq4stzn.R.iget(4397) != 0 | true)) || (__CLR4_4_13cy3cykcq4stzn.R.iget(4398) == 0 & false))) {
                            {
                                __CLR4_4_13cy3cykcq4stzn.R.inc(4399);
                                return rightEndpoint.getBoundType() == BoundType.CLOSED;
                            }
                        }
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4400);
                        if ((((step > 0f) && (__CLR4_4_13cy3cykcq4stzn.R.iget(4401) != 0 | true)) || (__CLR4_4_13cy3cykcq4stzn.R.iget(4402) == 0 & false))) {
                            {
                                __CLR4_4_13cy3cykcq4stzn.R.inc(4403);
                                return cmp < 0;
                            }
                        }
                        __CLR4_4_13cy3cykcq4stzn.R.inc(4404);
                        return cmp > 0;
                    } finally {
                        __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
                    }
                }
            };
        } finally {
            __CLR4_4_13cy3cykcq4stzn.R.flushNeeded();
        }
    }
}

