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

import org.apache.commons.functor.Function;
import org.apache.commons.lang3.Validate;

/**
 * A {@link Function Function}
 * representing the composition of
 * {@link Function Functions},
 * "chaining" the output of one to the input
 * of another.  For example,
 * <pre>new CompositeFunction(f).of(g)</pre>
 * {@link #evaluate evaluates} to
 * <code>f.evaluate(g.evaluate(obj))</code>, and
 * <pre>new CompositeFunction(f).of(g).of(h)</pre>
 * {@link #evaluate evaluates} to
 * <code>f.evaluate(g.evaluate(h.evaluate(obj)))</code>.
 * <p>
 * When the collection is empty, this function is
 * an identity function.
 * </p>
 * @param <A> the argument type.
 * @param <T> the returned value type.
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class CompositeFunction<A, T> implements Function<A, T> {public static class __CLR4_4_12aq2aqkcq4stpm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,3020,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Base hash integer used to shift hash. */
    private static final int HASH_SHIFT = 4;

    /**
     * Encapsulates a double function evaluation.
     * @param <A> argument type
     * @param <X> intermediate type
     * @param <T> return type
     */
    private static class Helper<X, A, T> implements Function<A, T> {
        /**
         * The last evaluator function.
         */
        private Function<? super X, ? extends T> following;
        /**
         * The first evaluator function.
         */
        private Function<? super A, ? extends X> preceding;

        /**
         * Create a new Helper.
         * @param following Function<X, Y>
         * @param preceding Function<Y, Z>
         */
        public Helper(Function<? super X, ? extends T> following,
                Function<? super A, ? extends X> preceding) {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(2978);
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2979);this.following = Validate.notNull(following, "Function argument must not be null");
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2980);this.preceding = Validate.notNull(preceding, "Function argument must not be null");
        }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public T evaluate(A obj) {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(2981);
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2982);return following.evaluate(preceding.evaluate(obj));
        }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(2983);
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2984);return obj == this || obj instanceof Helper<?, ?, ?> && equals((Helper<?, ?, ?>) obj);
        }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

        /**
         * Checks if input helper is equals to this instance.
         *
         * @param helper the helper to check
         * @return true, if helpers are equals, false otherwise
         */
        private boolean equals(Helper<?, ?, ?> helper) {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(2985);
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2986);return helper.following.equals(following) && helper.preceding.equals(preceding);
        }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(2987);
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2988);int result = "CompositeFunction$Helper".hashCode();
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2989);result <<= 2;
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2990);result ^= following.hashCode();
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2991);result <<= 2;
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2992);result ^= preceding.hashCode();
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2993);return result;
        }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(2994);
            __CLR4_4_12aq2aqkcq4stpm.R.inc(2995);return following.toString() + " of " + preceding.toString();
        }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}
    }

    /**
     * The adapted function.
     */
    private final Function<? super A, ? extends T> function;

    /**
     * Create a new CompositeFunction.
     * @param function Function to call
     */
    public CompositeFunction(Function<? super A, ? extends T> function) {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(2996);
        __CLR4_4_12aq2aqkcq4stpm.R.inc(2997);this.function = Validate.notNull(function, "function must not be null");
    }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

    /**
     * Creates a new {@link CompositeFunction} instance given the input functions.
     *
     * @param <X> the argument type.
     * @param following The first evaluator function.
     * @param preceding The last evaluator function.
     */
    private <X> CompositeFunction(Function<? super X, ? extends T> following,
            Function<? super A, ? extends X> preceding) {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(2998);
        __CLR4_4_12aq2aqkcq4stpm.R.inc(2999);this.function = new Helper<X, A, T>(following, preceding);
    }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public final T evaluate(A obj) {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(3000);
        __CLR4_4_12aq2aqkcq4stpm.R.inc(3001);return function.evaluate(obj);
    }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

    /**
     * Fluently obtain a CompositeFunction that is "this function" applied to the specified preceding function.
     * @param <P> argument type of the resulting function.
     * @param preceding Function
     * @return CompositeFunction<P, T>
     */
    public final <P> CompositeFunction<P, T> of(Function<? super P, ? extends A> preceding) {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(3002);
        __CLR4_4_12aq2aqkcq4stpm.R.inc(3003);Validate.notNull(preceding, "preceding function was null");
        __CLR4_4_12aq2aqkcq4stpm.R.inc(3004);return new CompositeFunction<P, T>(function, preceding);
    }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(Object obj) {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(3005);
        __CLR4_4_12aq2aqkcq4stpm.R.inc(3006);if ((((obj == this)&&(__CLR4_4_12aq2aqkcq4stpm.R.iget(3007)!=0|true))||(__CLR4_4_12aq2aqkcq4stpm.R.iget(3008)==0&false))) {{
            __CLR4_4_12aq2aqkcq4stpm.R.inc(3009);return true;
        }
        }__CLR4_4_12aq2aqkcq4stpm.R.inc(3010);if ((((!(obj instanceof CompositeFunction<?, ?>))&&(__CLR4_4_12aq2aqkcq4stpm.R.iget(3011)!=0|true))||(__CLR4_4_12aq2aqkcq4stpm.R.iget(3012)==0&false))) {{
            __CLR4_4_12aq2aqkcq4stpm.R.inc(3013);return false;
        }
        }__CLR4_4_12aq2aqkcq4stpm.R.inc(3014);CompositeFunction<?, ?> that = (CompositeFunction<?, ?>) obj;
        __CLR4_4_12aq2aqkcq4stpm.R.inc(3015);return this.function.equals(that.function);
    }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(3016);
        // by construction, list is never null
        __CLR4_4_12aq2aqkcq4stpm.R.inc(3017);return ("CompositeFunction".hashCode() << HASH_SHIFT) ^ function.hashCode();
    }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_12aq2aqkcq4stpm.R.inc(3018);
        __CLR4_4_12aq2aqkcq4stpm.R.inc(3019);return "CompositeFunction<" + function + ">";
    }finally{__CLR4_4_12aq2aqkcq4stpm.R.flushNeeded();}}

}
