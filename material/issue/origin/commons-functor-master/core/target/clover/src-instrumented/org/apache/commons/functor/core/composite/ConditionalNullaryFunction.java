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

import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.lang3.Validate;

/**
 * A {@link NullaryFunction NullaryFunction}
 * similiar to Java's "ternary"
 * or "conditional" operator (<code>&#x3F; &#x3A;</code>).
 * Given a {@link NullaryPredicate predicate}
 * <i>p</i> and {@link NullaryFunction functions}
 * <i>f</i> and <i>g</i>, {@link #evaluate evaluates}
 * to
 * <code>p.test() ? f.evaluate() : g.evaluate()</code>.
 * @param <T> the returned value type.
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public final class ConditionalNullaryFunction<T> implements NullaryFunction<T> {public static class __CLR4_4_12hl2hlkcq4strs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,3257,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Base hash integer used to shift hash. */
    private static final int HASH_SHIFT = 4;
    // attributes
    // ------------------------------------------------------------------------
    /**
     * the condition to be evaluated.
     */
    private final NullaryPredicate ifPred;
    /**
     * the function executed if the condition is satisfied.
     */
    private final NullaryFunction<? extends T> thenFunc;
    /**
     * the function executed if the condition is not satisfied.
     */
    private final NullaryFunction<? extends T> elseFunc;

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new ConditionalNullaryFunction.
     * @param ifPred if
     * @param thenFunc then
     * @param elseFunc else
     */
    public ConditionalNullaryFunction(NullaryPredicate ifPred, NullaryFunction<? extends T> thenFunc,
            NullaryFunction<? extends T> elseFunc) {try{__CLR4_4_12hl2hlkcq4strs.R.inc(3225);
        __CLR4_4_12hl2hlkcq4strs.R.inc(3226);this.ifPred = Validate.notNull(ifPred, "NullaryPredicate argument was null");
        __CLR4_4_12hl2hlkcq4strs.R.inc(3227);this.thenFunc = Validate.notNull(thenFunc, "'then' NullaryFunction argument was null");
        __CLR4_4_12hl2hlkcq4strs.R.inc(3228);this.elseFunc = Validate.notNull(elseFunc, "'else' NullaryFunction argument was null");
    }finally{__CLR4_4_12hl2hlkcq4strs.R.flushNeeded();}}

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public T evaluate() {try{__CLR4_4_12hl2hlkcq4strs.R.inc(3229);
        __CLR4_4_12hl2hlkcq4strs.R.inc(3230);if ((((ifPred.test())&&(__CLR4_4_12hl2hlkcq4strs.R.iget(3231)!=0|true))||(__CLR4_4_12hl2hlkcq4strs.R.iget(3232)==0&false))) {{
            __CLR4_4_12hl2hlkcq4strs.R.inc(3233);return thenFunc.evaluate();
        } }else {{
            __CLR4_4_12hl2hlkcq4strs.R.inc(3234);return elseFunc.evaluate();
        }
    }}finally{__CLR4_4_12hl2hlkcq4strs.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_12hl2hlkcq4strs.R.inc(3235);
        __CLR4_4_12hl2hlkcq4strs.R.inc(3236);if ((((obj == this)&&(__CLR4_4_12hl2hlkcq4strs.R.iget(3237)!=0|true))||(__CLR4_4_12hl2hlkcq4strs.R.iget(3238)==0&false))) {{
            __CLR4_4_12hl2hlkcq4strs.R.inc(3239);return true;
        }
        }__CLR4_4_12hl2hlkcq4strs.R.inc(3240);if ((((!(obj instanceof ConditionalNullaryFunction<?>))&&(__CLR4_4_12hl2hlkcq4strs.R.iget(3241)!=0|true))||(__CLR4_4_12hl2hlkcq4strs.R.iget(3242)==0&false))) {{
            __CLR4_4_12hl2hlkcq4strs.R.inc(3243);return false;
        }
        }__CLR4_4_12hl2hlkcq4strs.R.inc(3244);ConditionalNullaryFunction<?> that = (ConditionalNullaryFunction<?>) obj;
        __CLR4_4_12hl2hlkcq4strs.R.inc(3245);return this.ifPred.equals(that.ifPred)
                && this.thenFunc.equals(that.thenFunc)
                && this.elseFunc.equals(that.elseFunc);
    }finally{__CLR4_4_12hl2hlkcq4strs.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_12hl2hlkcq4strs.R.inc(3246);
        __CLR4_4_12hl2hlkcq4strs.R.inc(3247);int hash = "ConditionalNullaryFunction".hashCode();
        __CLR4_4_12hl2hlkcq4strs.R.inc(3248);hash <<= HASH_SHIFT;
        __CLR4_4_12hl2hlkcq4strs.R.inc(3249);hash ^= ifPred.hashCode();
        __CLR4_4_12hl2hlkcq4strs.R.inc(3250);hash <<= HASH_SHIFT;
        __CLR4_4_12hl2hlkcq4strs.R.inc(3251);hash ^= thenFunc.hashCode();
        __CLR4_4_12hl2hlkcq4strs.R.inc(3252);hash <<= HASH_SHIFT;
        __CLR4_4_12hl2hlkcq4strs.R.inc(3253);hash ^= elseFunc.hashCode();
        __CLR4_4_12hl2hlkcq4strs.R.inc(3254);return hash;
    }finally{__CLR4_4_12hl2hlkcq4strs.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_12hl2hlkcq4strs.R.inc(3255);
        __CLR4_4_12hl2hlkcq4strs.R.inc(3256);return "ConditionalNullaryFunction<" + ifPred + "?" + thenFunc + ":" + elseFunc + ">";
    }finally{__CLR4_4_12hl2hlkcq4strs.R.flushNeeded();}}

}
