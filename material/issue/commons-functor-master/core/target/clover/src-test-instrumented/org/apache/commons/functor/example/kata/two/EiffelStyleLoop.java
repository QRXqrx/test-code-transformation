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
package org.apache.commons.functor.example.kata.two;

import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.NoOp;

/**
 * Supports an Eiffel style loop construct.
 * <pre>
 * new EiffelStyleLoop()
 *   .from(new NullaryProcedure() { public void run() {} }) // init code
 *   .invariant(new NullaryPredicate() { public boolean test() {} }) // invariants
 *   .variant(new NullaryProcedure() { public Object evaluate() {} }) // diminishing comparable value
 *   // or
 *   // .variant(new NullaryPredicate() { public boolean test() {} }) // more invariants
 *   .until(new NullaryPredicate() { public boolean test() {} }) // terminating condition
 *   .loop(new NullaryProcedure() { public void run() {} }) // the acutal loop
 *   .run();
 * </pre>
 *
 * Note that <tt>new EiffelStyleLoop().run()</tt> executes just fine.
 * You only need to set the parts of the loop you want to use.
 *
 * @version $Revision$ $Date$
 */
public class EiffelStyleLoop implements NullaryProcedure {

    public static class __CLR4_4_17ow7owkcq4svby {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 10008, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    public EiffelStyleLoop from(NullaryProcedure procedure) {
        try {
            __CLR4_4_17ow7owkcq4svby.R.inc(9968);
            __CLR4_4_17ow7owkcq4svby.R.inc(9969);
            from = procedure;
            __CLR4_4_17ow7owkcq4svby.R.inc(9970);
            return this;
        } finally {
            __CLR4_4_17ow7owkcq4svby.R.flushNeeded();
        }
    }

    public EiffelStyleLoop invariant(NullaryPredicate predicate) {
        try {
            __CLR4_4_17ow7owkcq4svby.R.inc(9971);
            __CLR4_4_17ow7owkcq4svby.R.inc(9972);
            invariant = predicate;
            __CLR4_4_17ow7owkcq4svby.R.inc(9973);
            return this;
        } finally {
            __CLR4_4_17ow7owkcq4svby.R.flushNeeded();
        }
    }

    public EiffelStyleLoop variant(NullaryPredicate predicate) {
        try {
            __CLR4_4_17ow7owkcq4svby.R.inc(9974);
            __CLR4_4_17ow7owkcq4svby.R.inc(9975);
            variant = predicate;
            __CLR4_4_17ow7owkcq4svby.R.inc(9976);
            return this;
        } finally {
            __CLR4_4_17ow7owkcq4svby.R.flushNeeded();
        }
    }

    @SuppressWarnings("unchecked")
    public EiffelStyleLoop variant(final NullaryFunction<Object> function) {
        try {
            __CLR4_4_17ow7owkcq4svby.R.inc(9977);
            __CLR4_4_17ow7owkcq4svby.R.inc(9978);
            return variant(new NullaryPredicate() {

                public boolean test() {
                    try {
                        __CLR4_4_17ow7owkcq4svby.R.inc(9979);
                        __CLR4_4_17ow7owkcq4svby.R.inc(9980);
                        boolean result = true;
                        __CLR4_4_17ow7owkcq4svby.R.inc(9981);
                        Comparable<Object> next = (Comparable<Object>) (function.evaluate());
                        __CLR4_4_17ow7owkcq4svby.R.inc(9982);
                        if ((((null != last) && (__CLR4_4_17ow7owkcq4svby.R.iget(9983) != 0 | true)) || (__CLR4_4_17ow7owkcq4svby.R.iget(9984) == 0 & false))) {
                            {
                                __CLR4_4_17ow7owkcq4svby.R.inc(9985);
                                result = last.compareTo(next) > 0;
                            }
                        }
                        __CLR4_4_17ow7owkcq4svby.R.inc(9986);
                        last = next;
                        __CLR4_4_17ow7owkcq4svby.R.inc(9987);
                        return result;
                    } finally {
                        __CLR4_4_17ow7owkcq4svby.R.flushNeeded();
                    }
                }

                private Comparable<Object> last = null;
            });
        } finally {
            __CLR4_4_17ow7owkcq4svby.R.flushNeeded();
        }
    }

    public EiffelStyleLoop until(NullaryPredicate predicate) {
        try {
            __CLR4_4_17ow7owkcq4svby.R.inc(9988);
            __CLR4_4_17ow7owkcq4svby.R.inc(9989);
            until = predicate;
            __CLR4_4_17ow7owkcq4svby.R.inc(9990);
            return this;
        } finally {
            __CLR4_4_17ow7owkcq4svby.R.flushNeeded();
        }
    }

    public EiffelStyleLoop loop(NullaryProcedure procedure) {
        try {
            __CLR4_4_17ow7owkcq4svby.R.inc(9991);
            __CLR4_4_17ow7owkcq4svby.R.inc(9992);
            loop = procedure;
            __CLR4_4_17ow7owkcq4svby.R.inc(9993);
            return this;
        } finally {
            __CLR4_4_17ow7owkcq4svby.R.flushNeeded();
        }
    }

    public void run() {
        try {
            __CLR4_4_17ow7owkcq4svby.R.inc(9994);
            __CLR4_4_17ow7owkcq4svby.R.inc(9995);
            from.run();
            __CLR4_4_17ow7owkcq4svby.R.inc(9996);
            assertTrue(invariant.test());
            __CLR4_4_17ow7owkcq4svby.R.inc(9997);
            while ((((!until.test()) && (__CLR4_4_17ow7owkcq4svby.R.iget(9998) != 0 | true)) || (__CLR4_4_17ow7owkcq4svby.R.iget(9999) == 0 & false))) {
                {
                    __CLR4_4_17ow7owkcq4svby.R.inc(10000);
                    loop.run();
                    __CLR4_4_17ow7owkcq4svby.R.inc(10001);
                    assertTrue(variant.test());
                    __CLR4_4_17ow7owkcq4svby.R.inc(10002);
                    assertTrue(invariant.test());
                }
            // Note that:
            // assertTrue(until.test());
            // holds here, but isn't necessary since that's
            // the only way we could get out of the loop
            // Also note that:
            // assertTrue(invariant.test());
            // holds here, but was the last thing called
            // before until.test()
            }
        } finally {
            __CLR4_4_17ow7owkcq4svby.R.flushNeeded();
        }
    }

    private void assertTrue(boolean value) {
        try {
            __CLR4_4_17ow7owkcq4svby.R.inc(10003);
            __CLR4_4_17ow7owkcq4svby.R.inc(10004);
            if ((((!value) && (__CLR4_4_17ow7owkcq4svby.R.iget(10005) != 0 | true)) || (__CLR4_4_17ow7owkcq4svby.R.iget(10006) == 0 & false))) {
                {
                    __CLR4_4_17ow7owkcq4svby.R.inc(10007);
                    throw new IllegalStateException("Assertion failed");
                }
            }
        } finally {
            __CLR4_4_17ow7owkcq4svby.R.flushNeeded();
        }
    }

    private NullaryProcedure from = NoOp.instance();

    private NullaryPredicate invariant = Constant.truePredicate();

    private NullaryPredicate variant = Constant.truePredicate();

    private NullaryPredicate until = Constant.falsePredicate();

    private NullaryProcedure loop = NoOp.instance();
}

