/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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

import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.Procedure;

/**
 * Utility/fluent methods for creating composite functors.
 * @version $Revision$ $Date$
 */
public final class Composite {public static class __CLR4_4_128f28fkcq4stoq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,2914,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Hidden constructor as this only is a helper class with static methods.
     */
    private Composite() {try{__CLR4_4_128f28fkcq4stoq.R.inc(2895);
    }finally{__CLR4_4_128f28fkcq4stoq.R.flushNeeded();}}

    /**
     * Create a composite Procedure.
     * @param <A> the procedure argument type.
     * @param procedure Procedure to execute against output of <code>f</code>
     * @return CompositeProcedure<A>
     */
    public static <A> CompositeProcedure<A> procedure(Procedure<? super A> procedure) {try{__CLR4_4_128f28fkcq4stoq.R.inc(2896);
        __CLR4_4_128f28fkcq4stoq.R.inc(2897);return new CompositeProcedure<A>(procedure);
    }finally{__CLR4_4_128f28fkcq4stoq.R.flushNeeded();}}

    /**
     * Create a composite Procedure.
     * @param <A> the function argument type.
     * @param <T> the the procedure argument type and function returned value type.
     * @param procedure Procedure to execute against output of <code>f</code>
     * @param function Function to apply
     * @return CompositeProcedure<A>
     */
    public static <A, T> CompositeProcedure<A> procedure(Procedure<? super T> procedure,
            Function<? super A, ? extends T> function) {try{__CLR4_4_128f28fkcq4stoq.R.inc(2898);
        __CLR4_4_128f28fkcq4stoq.R.inc(2899);return new CompositeProcedure<T>(procedure).of(function);
    }finally{__CLR4_4_128f28fkcq4stoq.R.flushNeeded();}}

    /**
     * Create a composite Predicate.
     * @param <A> the predicate argument type.
     * @param pred Predicate to test the output of <code>f</code>
     * @return CompositePredicate<A>
     */
    public static <A> CompositePredicate<A> predicate(Predicate<? super A> pred) {try{__CLR4_4_128f28fkcq4stoq.R.inc(2900);
        __CLR4_4_128f28fkcq4stoq.R.inc(2901);return new CompositePredicate<A>(pred);
    }finally{__CLR4_4_128f28fkcq4stoq.R.flushNeeded();}}

    /**
     * Create a composite Predicate.
     * @param <A> the function argument type.
     * @param <T> the predicate argument type and the function returned value type.
     * @param predicate Predicate to test the output of <code>f</code>
     * @param function Function to apply
     * @return CompositePredicate<A>
     */
    public static <A, T> CompositePredicate<A> predicate(Predicate<? super T> predicate,
            Function<? super A, ? extends T> function) {try{__CLR4_4_128f28fkcq4stoq.R.inc(2902);
        __CLR4_4_128f28fkcq4stoq.R.inc(2903);return new CompositePredicate<T>(predicate).of(function);
    }finally{__CLR4_4_128f28fkcq4stoq.R.flushNeeded();}}

    /**
     * Create a composite BinaryPredicate.
     * @param <L> the output predicate left argument type.
     * @param <R> the output predicate right argument type.
     * @param <G> the input functions left argument type.
     * @param <H> the input functions right argument type.
     * @param p BinaryPredicate to test <i>output(</i><code>f</code><i>), output(</i><code>g</code><i>)</i>
     * @param g left Function
     * @param h right Function
     * @return BinaryPredicate
     */
    public static <L, R, G, H> CompositeBinaryPredicate<L, R> predicate(
            BinaryPredicate<? super G, ? super H> p, Function<? super L, ? extends G> g,
            Function<? super R, ? extends H> h) {try{__CLR4_4_128f28fkcq4stoq.R.inc(2904);
        __CLR4_4_128f28fkcq4stoq.R.inc(2905);return new CompositeBinaryPredicate<L, R>(p, g, h);
    }finally{__CLR4_4_128f28fkcq4stoq.R.flushNeeded();}}

    /**
     * Create a composite Function.
     * @param <A> the function argument type.
     * @param <T> the function returned value type.
     * @param f Function to apply to the output of <code>g</code>
     * @return Function
     */
    public static <A, T> CompositeFunction<A, T> function(Function<? super A, ? extends T> f) {try{__CLR4_4_128f28fkcq4stoq.R.inc(2906);
        __CLR4_4_128f28fkcq4stoq.R.inc(2907);return new CompositeFunction<A, T>(f);
    }finally{__CLR4_4_128f28fkcq4stoq.R.flushNeeded();}}

    /**
     * Create a composite Function.
     * @param <A> the function argument type.
     * @param <X> the function argument type.
     * @param <T> the function returned value type.
     * @param f Function to apply to the output of <code>g</code>
     * @param g Function to apply first
     * @return Function
     */
    public static <A, X, T> CompositeFunction<A, T> function(Function<? super X, ? extends T> f,
            Function<? super A, ? extends X> g) {try{__CLR4_4_128f28fkcq4stoq.R.inc(2908);
        __CLR4_4_128f28fkcq4stoq.R.inc(2909);return new CompositeFunction<X, T>(f).of(g);
    }finally{__CLR4_4_128f28fkcq4stoq.R.flushNeeded();}}

//    /**
//     * Chain a BinaryFunction to a Function.
//     * @param <L>
//     * @param <R>
//     * @param <X>
//     * @param <T>
//     * @param f Function to apply to the output of <code>g</code>
//     * @param g BinaryFunction to apply first
//     * @return BinaryFunction<L, R, T>
//     */
//    public static <L, R, X, T> BinaryFunction<L, R, T> function(Function<? super X, ? extends T> f,
//             BinaryFunction<? super L,
//             ? super R, ? extends X> g) {
//        return new CompositeFunction<X, T>(f).of(g);
//    }

    /**
     * Create a composite<Function> BinaryFunction.
     * @param <L> the output predicate left argument type.
     * @param <R> the output predicate right argument type.
     * @param <G> the input functions left argument type.
     * @param <H> the input functions right argument type.
     * @param <T> the function returned value type.
     * @param f BinaryFunction to apply to <i>output(</i><code>f</code><i>), output(</i><code>g</code><i>)</i>
     * @param g left Function
     * @param h right Function
     * @return BinaryFunction
     */
    public static <L, R, G, H, T> CompositeBinaryFunction<L, R, T> function(
            BinaryFunction<? super G, ? super H, ? extends T> f, Function<? super L, ? extends G> g,
            Function<? super R, ? extends H> h) {try{__CLR4_4_128f28fkcq4stoq.R.inc(2910);
        __CLR4_4_128f28fkcq4stoq.R.inc(2911);return new CompositeBinaryFunction<L, R, T>(f, g, h);
    }finally{__CLR4_4_128f28fkcq4stoq.R.flushNeeded();}}

    /**
     * Create a composite<BinaryFunction> BinaryFunction.
     * @param <L> the output predicate left argument type.
     * @param <R> the output predicate right argument type.
     * @param <G> the input functions left argument type.
     * @param <H> the input functions right argument type.
     * @param <T> the function returned value type.
     * @param f BinaryFunction to apply to <i>output(</i><code>f</code><i>), output(</i><code>g</code><i>)</i>
     * @param g left BinaryFunction
     * @param h right BinaryFunction
     * @return BinaryFunction
     */
    public static <L, R, G, H, T> BinaryCompositeBinaryFunction<L, R, T> function(
            BinaryFunction<? super G, ? super H, ? extends T> f, BinaryFunction<? super L, ? super R, ? extends G> g,
            BinaryFunction<? super L, ? super R, ? extends H> h) {try{__CLR4_4_128f28fkcq4stoq.R.inc(2912);
        __CLR4_4_128f28fkcq4stoq.R.inc(2913);return new BinaryCompositeBinaryFunction<L, R, T>(f, g, h);
    }finally{__CLR4_4_128f28fkcq4stoq.R.flushNeeded();}}
}
