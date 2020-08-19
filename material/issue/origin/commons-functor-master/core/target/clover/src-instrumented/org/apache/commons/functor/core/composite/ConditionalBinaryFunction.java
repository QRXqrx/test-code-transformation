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
import org.apache.commons.lang3.Validate;

/**
 * A {@link BinaryFunction BinaryFunction}
 * similiar to Java's "ternary"
 * or "conditional" operator (<code>&#x3F; &#x3A;</code>).
 * Given a {@link BinaryPredicate predicate}
 * <i>p</i> and {@link BinaryFunction functions}
 * <i>f</i> and <i>g</i>, {@link #evaluate evaluates}
 * to
 * <code>p.test(x,y) ? f.evaluate(x,y) : g.evaluate(x,y)</code>.
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @param <T> the output function returned value type.
 * @version $Revision$ $Date$
 */
public final class ConditionalBinaryFunction<L, R, T> implements BinaryFunction<L, R, T> {public static class __CLR4_4_12e12e1kcq4stqn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,3129,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Base hash integer used to shift hash. */
    private static final int HASH_SHIFT = 4;
    // attributes
    // ------------------------------------------------------------------------
    /**
     * the condition to be evaluated.
     */
    private final BinaryPredicate<? super L, ? super R> ifPred;
    /**
     * the function executed if the condition is satisfied.
     */
    private final BinaryFunction<? super L, ? super R, ? extends T> thenFunc;
    /**
     * the function executed if the condition is not satisfied.
     */
    private final BinaryFunction<? super L, ? super R, ? extends T> elseFunc;

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new ConditionalBinaryFunction.
     * @param ifPred if
     * @param thenFunc then
     * @param elseFunc else
     */
    public ConditionalBinaryFunction(BinaryPredicate<? super L, ? super R> ifPred,
            BinaryFunction<? super L, ? super R, ? extends T> thenFunc,
            BinaryFunction<? super L, ? super R, ? extends T> elseFunc) {try{__CLR4_4_12e12e1kcq4stqn.R.inc(3097);
        __CLR4_4_12e12e1kcq4stqn.R.inc(3098);this.ifPred = Validate.notNull(ifPred, "BinaryPredicate argument was null");
        __CLR4_4_12e12e1kcq4stqn.R.inc(3099);this.thenFunc = Validate.notNull(thenFunc, "'then' BinaryFunction argument was null");
        __CLR4_4_12e12e1kcq4stqn.R.inc(3100);this.elseFunc = Validate.notNull(elseFunc, "'else' BinaryFunction argument was null");
    }finally{__CLR4_4_12e12e1kcq4stqn.R.flushNeeded();}}

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public T evaluate(L left, R right) {try{__CLR4_4_12e12e1kcq4stqn.R.inc(3101);
        __CLR4_4_12e12e1kcq4stqn.R.inc(3102);if ((((ifPred.test(left, right))&&(__CLR4_4_12e12e1kcq4stqn.R.iget(3103)!=0|true))||(__CLR4_4_12e12e1kcq4stqn.R.iget(3104)==0&false))) {{
            __CLR4_4_12e12e1kcq4stqn.R.inc(3105);return thenFunc.evaluate(left, right);
        } }else {{
            __CLR4_4_12e12e1kcq4stqn.R.inc(3106);return elseFunc.evaluate(left, right);
        }
    }}finally{__CLR4_4_12e12e1kcq4stqn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_12e12e1kcq4stqn.R.inc(3107);
        __CLR4_4_12e12e1kcq4stqn.R.inc(3108);if ((((obj == this)&&(__CLR4_4_12e12e1kcq4stqn.R.iget(3109)!=0|true))||(__CLR4_4_12e12e1kcq4stqn.R.iget(3110)==0&false))) {{
            __CLR4_4_12e12e1kcq4stqn.R.inc(3111);return true;
        }
        }__CLR4_4_12e12e1kcq4stqn.R.inc(3112);if ((((!(obj instanceof ConditionalBinaryFunction<?, ?, ?>))&&(__CLR4_4_12e12e1kcq4stqn.R.iget(3113)!=0|true))||(__CLR4_4_12e12e1kcq4stqn.R.iget(3114)==0&false))) {{
            __CLR4_4_12e12e1kcq4stqn.R.inc(3115);return false;
        }
        }__CLR4_4_12e12e1kcq4stqn.R.inc(3116);ConditionalBinaryFunction<?, ?, ?> that = (ConditionalBinaryFunction<?, ?, ?>) obj;
        __CLR4_4_12e12e1kcq4stqn.R.inc(3117);return this.ifPred.equals(that.ifPred)
                && this.thenFunc.equals(that.thenFunc)
                && this.elseFunc.equals(that.elseFunc);
    }finally{__CLR4_4_12e12e1kcq4stqn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_12e12e1kcq4stqn.R.inc(3118);
        __CLR4_4_12e12e1kcq4stqn.R.inc(3119);int hash = "ConditionalBinaryFunction".hashCode();
        __CLR4_4_12e12e1kcq4stqn.R.inc(3120);hash <<= HASH_SHIFT;
        __CLR4_4_12e12e1kcq4stqn.R.inc(3121);hash ^= ifPred.hashCode();
        __CLR4_4_12e12e1kcq4stqn.R.inc(3122);hash <<= HASH_SHIFT;
        __CLR4_4_12e12e1kcq4stqn.R.inc(3123);hash ^= thenFunc.hashCode();
        __CLR4_4_12e12e1kcq4stqn.R.inc(3124);hash <<= HASH_SHIFT;
        __CLR4_4_12e12e1kcq4stqn.R.inc(3125);hash ^= elseFunc.hashCode();
        __CLR4_4_12e12e1kcq4stqn.R.inc(3126);return hash;
    }finally{__CLR4_4_12e12e1kcq4stqn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_12e12e1kcq4stqn.R.inc(3127);
        __CLR4_4_12e12e1kcq4stqn.R.inc(3128);return "ConditionalBinaryFunction<" + ifPred + "?" + thenFunc + ":" + elseFunc + ">";
    }finally{__CLR4_4_12e12e1kcq4stqn.R.flushNeeded();}}

}
