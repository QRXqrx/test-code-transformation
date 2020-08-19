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
import org.apache.commons.functor.Function;
import org.apache.commons.lang3.Validate;

/**
 * A {@link BinaryFunction BinaryFunction} composed of
 * one binary function, <i>f</i>, and two
 * functions, <i>g</i> and <i>h</i>,
 * evaluating the ordered parameters <i>x</i>, <i>y</i>
 * to <code><i>f</i>(<i>g</i>(<i>x</i>),<i>h</i>(<i>y</i>))</code>.
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @param <T> the returned value type.
 * @version $Revision: 1345136 $ $Date: 2012-06-01 09:47:06 -0300 (Fri, 01 Jun 2012) $
 */
public class CompositeBinaryFunction<L, R, T> implements BinaryFunction<L, R, T> {public static class __CLR4_4_128y28ykcq4stp1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,2946,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Base hash integer used to shift hash. */
    private static final int HASH_SHIFT = 4;

    /**
     *
     *
     * @param <G> the adapted function left argument type.
     * @param <H> the adapted function right argument type.
     * @param <L> the left argument type.
     * @param <R> the right argument type.
     * @param <T> the returned value type.
     */
    private static class Helper<G, H, L, R, T> implements BinaryFunction<L, R, T> {
        /**
         * The adapted function to receive <code>(output(g), output(h))</code>.
         */
        private BinaryFunction<? super G, ? super H, ? extends T> f;
        /**
         * The adapted left function.
         */
        private Function<? super L, ? extends G> g;
        /**
         * The adapted right function.
         */
        private Function<? super R, ? extends H> h;

        /**
         * Create a new Helper.
         * @param f BinaryFunction to receive <code>(output(g), output(h))</code>
         * @param g left Function
         * @param h right Function
         */
        public Helper(BinaryFunction<? super G, ? super H, ? extends T> f, Function<? super L, ? extends G> g,
                Function<? super R, ? extends H> h) {try{__CLR4_4_128y28ykcq4stp1.R.inc(2914);
            __CLR4_4_128y28ykcq4stp1.R.inc(2915);this.f = f;
            __CLR4_4_128y28ykcq4stp1.R.inc(2916);this.g = g;
            __CLR4_4_128y28ykcq4stp1.R.inc(2917);this.h = h;
        }finally{__CLR4_4_128y28ykcq4stp1.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public T evaluate(L left, R right) {try{__CLR4_4_128y28ykcq4stp1.R.inc(2918);
            __CLR4_4_128y28ykcq4stp1.R.inc(2919);return f.evaluate(g.evaluate(left), h.evaluate(right));
        }finally{__CLR4_4_128y28ykcq4stp1.R.flushNeeded();}}
    }

    /**
     * The adapted helper.
     */
    private final Helper<?, ?, L, R, T> helper;

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new CompositeBinaryFunction.
     *
     * @param <G> the adapted function left argument type.
     * @param <H> the adapted function right argument type.
     * @param f BinaryFunction to receive <code>(output(g), output(h))</code>
     * @param g left Function
     * @param h right Function
     */
    public <G, H> CompositeBinaryFunction(BinaryFunction<? super G, ? super H, ? extends T> f,
            Function<? super L, ? extends G> g, Function<? super R, ? extends H> h) {try{__CLR4_4_128y28ykcq4stp1.R.inc(2920);
        __CLR4_4_128y28ykcq4stp1.R.inc(2921);this.helper = new Helper<G, H, L, R, T>(
                Validate.notNull(f, "BinaryFunction must not be null"),
                Validate.notNull(g, "left Function must not be null"),
                Validate.notNull(h, "right Function must not be null")
        );
    }finally{__CLR4_4_128y28ykcq4stp1.R.flushNeeded();}}

    // function interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public T evaluate(L left, R right) {try{__CLR4_4_128y28ykcq4stp1.R.inc(2922);
        __CLR4_4_128y28ykcq4stp1.R.inc(2923);return helper.evaluate(left, right);
    }finally{__CLR4_4_128y28ykcq4stp1.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_128y28ykcq4stp1.R.inc(2924);
        __CLR4_4_128y28ykcq4stp1.R.inc(2925);if ((((obj == this)&&(__CLR4_4_128y28ykcq4stp1.R.iget(2926)!=0|true))||(__CLR4_4_128y28ykcq4stp1.R.iget(2927)==0&false))) {{
            __CLR4_4_128y28ykcq4stp1.R.inc(2928);return true;
        }
        }__CLR4_4_128y28ykcq4stp1.R.inc(2929);if ((((!(obj instanceof CompositeBinaryFunction<?, ?, ?>))&&(__CLR4_4_128y28ykcq4stp1.R.iget(2930)!=0|true))||(__CLR4_4_128y28ykcq4stp1.R.iget(2931)==0&false))) {{
            __CLR4_4_128y28ykcq4stp1.R.inc(2932);return false;
        }
        }__CLR4_4_128y28ykcq4stp1.R.inc(2933);CompositeBinaryFunction<?, ?, ?> that = (CompositeBinaryFunction<?, ?, ?>) obj;
        __CLR4_4_128y28ykcq4stp1.R.inc(2934);return this.helper.f.equals(that.helper.f)
                && this.helper.g.equals(that.helper.g)
                && this.helper.h.equals(that.helper.h);
    }finally{__CLR4_4_128y28ykcq4stp1.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_128y28ykcq4stp1.R.inc(2935);
        __CLR4_4_128y28ykcq4stp1.R.inc(2936);int hash = "CompositeBinaryFunction".hashCode();
        __CLR4_4_128y28ykcq4stp1.R.inc(2937);hash <<= HASH_SHIFT;
        __CLR4_4_128y28ykcq4stp1.R.inc(2938);hash ^= helper.f.hashCode();
        __CLR4_4_128y28ykcq4stp1.R.inc(2939);hash <<= HASH_SHIFT;
        __CLR4_4_128y28ykcq4stp1.R.inc(2940);hash ^= helper.g.hashCode();
        __CLR4_4_128y28ykcq4stp1.R.inc(2941);hash <<= HASH_SHIFT;
        __CLR4_4_128y28ykcq4stp1.R.inc(2942);hash ^= helper.h.hashCode();
        __CLR4_4_128y28ykcq4stp1.R.inc(2943);return hash;
    }finally{__CLR4_4_128y28ykcq4stp1.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_128y28ykcq4stp1.R.inc(2944);
        __CLR4_4_128y28ykcq4stp1.R.inc(2945);return "CompositeBinaryFunction<" + helper.f + ";" + helper.g + ";" + helper.h + ">";
    }finally{__CLR4_4_128y28ykcq4stp1.R.flushNeeded();}}

}
