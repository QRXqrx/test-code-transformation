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
package org.apache.commons.functor.core.algorithm;

import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.lang3.Validate;

/**
 * Tail recursion for {@link NullaryFunction functions}. If the {@link NullaryFunction}
 * returns another function of type <code>functionType</code>, that function
 * is executed. Functions are executed until a non function value or a
 * function of a type other than that expected is returned.
 */
public class RecursiveEvaluation implements NullaryFunction<Object> {

    public static class __CLR4_4_11i21i2kcq4stgz {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 1985, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * The initial recursive NullaryFunction type.
     */
    private final Class<?> functionType;

    /**
     * The initial, potentially recursive NullaryFunction.
     */
    private NullaryFunction<?> function;

    /**
     * Create a new RecursiveEvaluation. Recursion will continue while the
     * returned value is of the same runtime class as <code>function</code>.
     * @param function initial, potentially recursive NullaryFunction
     */
    public RecursiveEvaluation(NullaryFunction<?> function) {
        this(function, getClass(function));
        __CLR4_4_11i21i2kcq4stgz.R.inc(1947);
        try {
            __CLR4_4_11i21i2kcq4stgz.R.inc(1946);
        } finally {
            __CLR4_4_11i21i2kcq4stgz.R.flushNeeded();
        }
    }

    /**
     * Create a new RecursiveEvaluation.
     * @param function initial, potentially recursive NullaryFunction
     * @param functionType as long as result is an instance, keep processing.
     */
    public RecursiveEvaluation(NullaryFunction<?> function, Class<?> functionType) {
        try {
            __CLR4_4_11i21i2kcq4stgz.R.inc(1948);
            __CLR4_4_11i21i2kcq4stgz.R.inc(1949);
            Validate.notNull(function, "NullaryFunction argument was null");
            __CLR4_4_11i21i2kcq4stgz.R.inc(1950);
            if ((((!NullaryFunction.class.isAssignableFrom(functionType)) && (__CLR4_4_11i21i2kcq4stgz.R.iget(1951) != 0 | true)) || (__CLR4_4_11i21i2kcq4stgz.R.iget(1952) == 0 & false))) {
                {
                    __CLR4_4_11i21i2kcq4stgz.R.inc(1953);
                    throw new IllegalArgumentException(NullaryFunction.class + " is not assignable from " + functionType);
                }
            }
            __CLR4_4_11i21i2kcq4stgz.R.inc(1954);
            this.function = function;
            __CLR4_4_11i21i2kcq4stgz.R.inc(1955);
            this.functionType = Validate.notNull(functionType, "FunctionType argument was null");
        } finally {
            __CLR4_4_11i21i2kcq4stgz.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    public final Object evaluate() {
        try {
            __CLR4_4_11i21i2kcq4stgz.R.inc(1956);
            __CLR4_4_11i21i2kcq4stgz.R.inc(1957);
            Object result = null;
            // if the function returns another function, execute it. stop executing
            // when the result is not of the expected type.
            __CLR4_4_11i21i2kcq4stgz.R.inc(1958);
            while (true) {
                {
                    __CLR4_4_11i21i2kcq4stgz.R.inc(1959);
                    result = function.evaluate();
                    __CLR4_4_11i21i2kcq4stgz.R.inc(1960);
                    if ((((functionType.isInstance(result)) && (__CLR4_4_11i21i2kcq4stgz.R.iget(1961) != 0 | true)) || (__CLR4_4_11i21i2kcq4stgz.R.iget(1962) == 0 & false))) {
                        {
                            __CLR4_4_11i21i2kcq4stgz.R.inc(1963);
                            function = (NullaryFunction<?>) result;
                            __CLR4_4_11i21i2kcq4stgz.R.inc(1964);
                            continue;
                        }
                    } else {
                        {
                            __CLR4_4_11i21i2kcq4stgz.R.inc(1965);
                            break;
                        }
                    }
                }
            }
            __CLR4_4_11i21i2kcq4stgz.R.inc(1966);
            return result;
        } finally {
            __CLR4_4_11i21i2kcq4stgz.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(Object obj) {
        try {
            __CLR4_4_11i21i2kcq4stgz.R.inc(1967);
            __CLR4_4_11i21i2kcq4stgz.R.inc(1968);
            if ((((obj == this) && (__CLR4_4_11i21i2kcq4stgz.R.iget(1969) != 0 | true)) || (__CLR4_4_11i21i2kcq4stgz.R.iget(1970) == 0 & false))) {
                {
                    __CLR4_4_11i21i2kcq4stgz.R.inc(1971);
                    return true;
                }
            }
            __CLR4_4_11i21i2kcq4stgz.R.inc(1972);
            if ((((!(obj instanceof RecursiveEvaluation)) && (__CLR4_4_11i21i2kcq4stgz.R.iget(1973) != 0 | true)) || (__CLR4_4_11i21i2kcq4stgz.R.iget(1974) == 0 & false))) {
                {
                    __CLR4_4_11i21i2kcq4stgz.R.inc(1975);
                    return false;
                }
            }
            __CLR4_4_11i21i2kcq4stgz.R.inc(1976);
            return ((RecursiveEvaluation) obj).function.equals(function);
        } finally {
            __CLR4_4_11i21i2kcq4stgz.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_11i21i2kcq4stgz.R.inc(1977);
            __CLR4_4_11i21i2kcq4stgz.R.inc(1978);
            return "RecursiveEvaluation".hashCode() << 2 ^ function.hashCode();
        } finally {
            __CLR4_4_11i21i2kcq4stgz.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_11i21i2kcq4stgz.R.inc(1979);
            __CLR4_4_11i21i2kcq4stgz.R.inc(1980);
            return "RecursiveEvaluation<" + functionType + "," + function + ">";
        } finally {
            __CLR4_4_11i21i2kcq4stgz.R.flushNeeded();
        }
    }

    /**
     * Get the class of the specified object, or <code>null</code> if <code>o</code> is <code>null</code>.
     * @param f Object to check
     * @return Class found
     */
    private static Class<?> getClass(NullaryFunction<?> f) {
        try {
            __CLR4_4_11i21i2kcq4stgz.R.inc(1981);
            __CLR4_4_11i21i2kcq4stgz.R.inc(1982);
            return (((f == null) && (__CLR4_4_11i21i2kcq4stgz.R.iget(1983) != 0 | true)) || (__CLR4_4_11i21i2kcq4stgz.R.iget(1984) == 0 & false)) ? null : f.getClass();
        } finally {
            __CLR4_4_11i21i2kcq4stgz.R.flushNeeded();
        }
    }
}

