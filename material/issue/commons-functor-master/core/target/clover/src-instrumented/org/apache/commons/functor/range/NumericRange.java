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

import org.apache.commons.functor.BinaryFunction;

/**
 * A base class for numeric ranges. The elements within this range must be a
 * <b>Number</b> and <b>Comparable</b>.
 *
 * @param <T> the type of numbers and step that are both a number and comparable
 * @see org.apache.commons.functor.range.IntegerRange
 * @see org.apache.commons.functor.range.LongRange
 * @see org.apache.commons.functor.range.FloatRange
 * @see org.apache.commons.functor.range.DoubleRange
 * @see org.apache.commons.functor.range.CharacterRange
 * @since 0.1
 * @version $Revision$ $Date$
 */
public abstract class NumericRange<T extends Number & Comparable<T>> extends AbstractRange<T, T> {

    public static class __CLR4_4_13h93h9kcq4su0h {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 4548, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Construct a new {@link NumericRange}.
     * @param leftEndpoint left endpoint
     * @param rightEndpoint right endpoint
     * @param step increment step
     * @param nextValue function to implement the taking of a step
     */
    protected NumericRange(Endpoint<T> leftEndpoint, Endpoint<T> rightEndpoint, T step, BinaryFunction<T, T, T> nextValue) {
        super(leftEndpoint, rightEndpoint, step, nextValue);
        __CLR4_4_13h93h9kcq4su0h.R.inc(4510);
        try {
            __CLR4_4_13h93h9kcq4su0h.R.inc(4509);
        } finally {
            __CLR4_4_13h93h9kcq4su0h.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean contains(T obj) {
        try {
            __CLR4_4_13h93h9kcq4su0h.R.inc(4511);
            __CLR4_4_13h93h9kcq4su0h.R.inc(4512);
            if ((((obj == null) && (__CLR4_4_13h93h9kcq4su0h.R.iget(4513) != 0 | true)) || (__CLR4_4_13h93h9kcq4su0h.R.iget(4514) == 0 & false))) {
                {
                    __CLR4_4_13h93h9kcq4su0h.R.inc(4515);
                    return false;
                }
            }
            __CLR4_4_13h93h9kcq4su0h.R.inc(4516);
            double leftValue = this.getLeftEndpoint().getValue().doubleValue();
            __CLR4_4_13h93h9kcq4su0h.R.inc(4517);
            double rightValue = this.getRightEndpoint().getValue().doubleValue();
            __CLR4_4_13h93h9kcq4su0h.R.inc(4518);
            boolean includeLeft = this.getLeftEndpoint().getBoundType() == BoundType.CLOSED;
            __CLR4_4_13h93h9kcq4su0h.R.inc(4519);
            boolean includeRight = this.getRightEndpoint().getBoundType() == BoundType.CLOSED;
            __CLR4_4_13h93h9kcq4su0h.R.inc(4520);
            double step = this.getStep().doubleValue();
            __CLR4_4_13h93h9kcq4su0h.R.inc(4521);
            double value = obj.doubleValue();
            __CLR4_4_13h93h9kcq4su0h.R.inc(4522);
            double firstValue = 0;
            __CLR4_4_13h93h9kcq4su0h.R.inc(4523);
            double lastValue = 0;
            __CLR4_4_13h93h9kcq4su0h.R.inc(4524);
            if ((((step < 0.0) && (__CLR4_4_13h93h9kcq4su0h.R.iget(4525) != 0 | true)) || (__CLR4_4_13h93h9kcq4su0h.R.iget(4526) == 0 & false))) {
                {
                    __CLR4_4_13h93h9kcq4su0h.R.inc(4527);
                    firstValue = (((includeLeft) && (__CLR4_4_13h93h9kcq4su0h.R.iget(4528) != 0 | true)) || (__CLR4_4_13h93h9kcq4su0h.R.iget(4529) == 0 & false)) ? leftValue : leftValue + step;
                    __CLR4_4_13h93h9kcq4su0h.R.inc(4530);
                    lastValue = (((includeRight) && (__CLR4_4_13h93h9kcq4su0h.R.iget(4531) != 0 | true)) || (__CLR4_4_13h93h9kcq4su0h.R.iget(4532) == 0 & false)) ? rightValue : Math.nextUp(rightValue);
                    __CLR4_4_13h93h9kcq4su0h.R.inc(4533);
                    if ((((value > firstValue || value < lastValue) && (__CLR4_4_13h93h9kcq4su0h.R.iget(4534) != 0 | true)) || (__CLR4_4_13h93h9kcq4su0h.R.iget(4535) == 0 & false))) {
                        {
                            __CLR4_4_13h93h9kcq4su0h.R.inc(4536);
                            return false;
                        }
                    }
                }
            } else {
                {
                    __CLR4_4_13h93h9kcq4su0h.R.inc(4537);
                    firstValue = (((includeLeft) && (__CLR4_4_13h93h9kcq4su0h.R.iget(4538) != 0 | true)) || (__CLR4_4_13h93h9kcq4su0h.R.iget(4539) == 0 & false)) ? leftValue : leftValue + step;
                    __CLR4_4_13h93h9kcq4su0h.R.inc(4540);
                    lastValue = (((includeRight) && (__CLR4_4_13h93h9kcq4su0h.R.iget(4541) != 0 | true)) || (__CLR4_4_13h93h9kcq4su0h.R.iget(4542) == 0 & false)) ? rightValue : rightValue - (rightValue - Math.nextUp(rightValue));
                    __CLR4_4_13h93h9kcq4su0h.R.inc(4543);
                    if ((((value < firstValue || value > lastValue) && (__CLR4_4_13h93h9kcq4su0h.R.iget(4544) != 0 | true)) || (__CLR4_4_13h93h9kcq4su0h.R.iget(4545) == 0 & false))) {
                        {
                            __CLR4_4_13h93h9kcq4su0h.R.inc(4546);
                            return false;
                        }
                    }
                }
            }
            __CLR4_4_13h93h9kcq4su0h.R.inc(4547);
            return ((value - firstValue) / step + 1) % 1.0 == 0.0;
        } finally {
            __CLR4_4_13h93h9kcq4su0h.R.flushNeeded();
        }
    }
}

