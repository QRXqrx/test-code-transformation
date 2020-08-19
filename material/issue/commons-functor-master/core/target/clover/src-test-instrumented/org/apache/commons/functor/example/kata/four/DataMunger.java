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
package org.apache.commons.functor.example.kata.four;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.adapter.BinaryFunctionFunction;
import org.apache.commons.functor.core.IsNull;
import org.apache.commons.functor.core.LeftIdentity;
import org.apache.commons.functor.core.RightIdentity;
import org.apache.commons.functor.core.algorithm.FoldLeft;
import org.apache.commons.functor.core.comparator.IsLessThan;
import org.apache.commons.functor.core.composite.Composite;
import org.apache.commons.functor.core.composite.Conditional;
import org.apache.commons.functor.core.composite.ConditionalBinaryFunction;
import org.apache.commons.functor.example.kata.one.Subtract;
import org.apache.commons.functor.example.lines.Lines;
import org.apache.commons.functor.generator.FilteredGenerator;

/**
 * The real workhorse of this Kata excercise.
 *
 * DataMunger wires together various functors and exposes them
 * as static utility methhods.
 * @version $Revision$ $Date$
 */
public class DataMunger {

    public static class __CLR4_4_17i57i5kcq4sv95 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 9733, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * See {@link #process(Reader,int,int,int)}
     */
    public static final Object process(final InputStream file, final int selected, final int col1, final int col2) {
        try {
            __CLR4_4_17i57i5kcq4sv95.R.inc(9725);
            __CLR4_4_17i57i5kcq4sv95.R.inc(9726);
            return process(new InputStreamReader(file), selected, col1, col2);
        } finally {
            __CLR4_4_17i57i5kcq4sv95.R.flushNeeded();
        }
    }

    /**
     * Processes each line of the given Reader, returning the <i>selected</i> column for the
     * line where the absolute difference between the integer value of <i>col1</i> and <i>col2</i>
     * is least.  Note that lines that don't begin with an Integer are ignored.
     */
    public static final Object process(final Reader file, final int selected, final int col1, final int col2) {
        try {
            __CLR4_4_17i57i5kcq4sv95.R.inc(9727);
            __CLR4_4_17i57i5kcq4sv95.R.inc(9728);
            return NthColumn.instance(selected).evaluate(new FoldLeft<String>(lesserSpread(col1, col2)).evaluate(new FilteredGenerator<String>(Lines.from(file), Composite.predicate(IsInteger.instance(), NthColumn.instance(0)))));
        } finally {
            __CLR4_4_17i57i5kcq4sv95.R.flushNeeded();
        }
    }

    /**
     * A BinaryFunction that will calculate the absolute
     * difference between col1 and col2 in the given
     * String arguments, and return the argument
     * whose difference is smallest.
     */
    private static final BinaryFunction<String, String, String> lesserSpread(final int col1, final int col2) {
        try {
            __CLR4_4_17i57i5kcq4sv95.R.inc(9729);
            __CLR4_4_17i57i5kcq4sv95.R.inc(9730);
            return new ConditionalBinaryFunction<String, String, String>(// if left is null
            IsNull.<String>left(), // return right
            RightIdentity.<String, String>function(), // else return the parameter with the least spread
            Conditional.function(// if left is less than right
            Composite.predicate(IsLessThan.instance(), absSpread(col1, col2), absSpread(col1, col2)), // return left
            LeftIdentity.<String, String>function(), // else return right
            RightIdentity.<String, String>function()));
        } finally {
            __CLR4_4_17i57i5kcq4sv95.R.flushNeeded();
        }
    }

    /**
     * A Function that returns the absolute value of the difference
     * between the Integers stored in the <i>col1</i> and <i>col2</i>th
     * whitespace delimited columns of the input line (a String).
     */
    private static Function<String, Integer> absSpread(final int col1, final int col2) {
        try {
            __CLR4_4_17i57i5kcq4sv95.R.inc(9731);
            __CLR4_4_17i57i5kcq4sv95.R.inc(9732);
            return Composite.function(Abs.instance(), new BinaryFunctionFunction<String, Number>(Composite.function(Subtract.instance(), Composite.function(ToInteger.instance(), NthColumn.instance(col1)), Composite.function(ToInteger.instance(), NthColumn.instance(col2)))));
        } finally {
            __CLR4_4_17i57i5kcq4sv95.R.flushNeeded();
        }
    }
}

