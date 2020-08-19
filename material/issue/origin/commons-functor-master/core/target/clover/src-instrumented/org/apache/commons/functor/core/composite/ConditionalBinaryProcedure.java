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

import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.BinaryProcedure;
import org.apache.commons.functor.core.NoOp;
import org.apache.commons.lang3.Validate;

/**
 * A {@link BinaryProcedure BinaryProcedure}
 * similiar to Java's "ternary"
 * or "conditional" operator (<code>&#x3F; &#x3A;</code>).
 * Given a {@link BinaryPredicate predicate}
 * <i>p</i> and {@link BinaryProcedure procedures}
 * <i>q</i> and <i>r</i>, {@link #run runs}
 * <code>if (p.test(x,y)) { q.run(x,y); } else { r.run(x,y); }</code>.
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @version $Revision$ $Date$
 */
public final class ConditionalBinaryProcedure<L, R> implements BinaryProcedure<L, R> {public static class __CLR4_4_12fr2frkcq4str8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,3193,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Base hash integer used to shift hash. */
    private static final int HASH_SHIFT = 4;
    // attributes
    // ------------------------------------------------------------------------
    /**
     * the condition to be evaluated.
     */
    private final BinaryPredicate<? super L, ? super R> ifPred;
    /**
     * the predicate executed if the condition is satisfied.
     */
    private final BinaryProcedure<? super L, ? super R> thenProc;
    /**
     * the predicate executed if the condition is not satisfied.
     */
    private final BinaryProcedure<? super L, ? super R> elseProc;

    // constructor
    // ------------------------------------------------------------------------

    /**
     * Create a new ConditionalBinaryProcedure.
     * @param ifPred to evaluate
     * @param thenProc if <code>ifPred</code> yields <code>true</code>
     */
    public ConditionalBinaryProcedure(BinaryPredicate<? super L, ? super R> ifPred,
            BinaryProcedure<? super L, ? super R> thenProc) {
        this(ifPred, thenProc, NoOp.instance());__CLR4_4_12fr2frkcq4str8.R.inc(3160);try{__CLR4_4_12fr2frkcq4str8.R.inc(3159);
    }finally{__CLR4_4_12fr2frkcq4str8.R.flushNeeded();}}

    /**
     * Create a new ConditionalBinaryProcedure.
     * @param ifPred to evaluate
     * @param thenProc if <code>ifPred</code> yields <code>true</code>
     * @param elseProc if <code>ifPred</code> yields <code>false</code>
     */
    public ConditionalBinaryProcedure(BinaryPredicate<? super L, ? super R> ifPred,
            BinaryProcedure<? super L, ? super R> thenProc, BinaryProcedure<? super L, ? super R> elseProc) {try{__CLR4_4_12fr2frkcq4str8.R.inc(3161);
        __CLR4_4_12fr2frkcq4str8.R.inc(3162);this.ifPred = Validate.notNull(ifPred, "BinaryPredicate argument was null");
        __CLR4_4_12fr2frkcq4str8.R.inc(3163);this.thenProc = Validate.notNull(thenProc, "'then' BinaryProcedure argument was null");
        __CLR4_4_12fr2frkcq4str8.R.inc(3164);this.elseProc = Validate.notNull(elseProc, "'else' BinaryProcedure argument was null");
    }finally{__CLR4_4_12fr2frkcq4str8.R.flushNeeded();}}

    // predicate interface
    // ------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void run(L left, R right) {try{__CLR4_4_12fr2frkcq4str8.R.inc(3165);
        __CLR4_4_12fr2frkcq4str8.R.inc(3166);if ((((ifPred.test(left, right))&&(__CLR4_4_12fr2frkcq4str8.R.iget(3167)!=0|true))||(__CLR4_4_12fr2frkcq4str8.R.iget(3168)==0&false))) {{
            __CLR4_4_12fr2frkcq4str8.R.inc(3169);thenProc.run(left, right);
        } }else {{
            __CLR4_4_12fr2frkcq4str8.R.inc(3170);elseProc.run(left, right);
        }
    }}finally{__CLR4_4_12fr2frkcq4str8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_12fr2frkcq4str8.R.inc(3171);
        __CLR4_4_12fr2frkcq4str8.R.inc(3172);if ((((obj == this)&&(__CLR4_4_12fr2frkcq4str8.R.iget(3173)!=0|true))||(__CLR4_4_12fr2frkcq4str8.R.iget(3174)==0&false))) {{
            __CLR4_4_12fr2frkcq4str8.R.inc(3175);return true;
        }
        }__CLR4_4_12fr2frkcq4str8.R.inc(3176);if ((((!(obj instanceof ConditionalBinaryProcedure<?, ?>))&&(__CLR4_4_12fr2frkcq4str8.R.iget(3177)!=0|true))||(__CLR4_4_12fr2frkcq4str8.R.iget(3178)==0&false))) {{
            __CLR4_4_12fr2frkcq4str8.R.inc(3179);return false;
        }
        }__CLR4_4_12fr2frkcq4str8.R.inc(3180);ConditionalBinaryProcedure<?, ?> that = (ConditionalBinaryProcedure<?, ?>) obj;
        __CLR4_4_12fr2frkcq4str8.R.inc(3181);return this.ifPred.equals(that.ifPred)
                && this.thenProc.equals(that.thenProc)
                && this.elseProc.equals(that.elseProc);
    }finally{__CLR4_4_12fr2frkcq4str8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_12fr2frkcq4str8.R.inc(3182);
        __CLR4_4_12fr2frkcq4str8.R.inc(3183);int hash = "ConditionalBinaryProcedure".hashCode();
        __CLR4_4_12fr2frkcq4str8.R.inc(3184);hash <<= HASH_SHIFT;
        __CLR4_4_12fr2frkcq4str8.R.inc(3185);hash ^= ifPred.hashCode();
        __CLR4_4_12fr2frkcq4str8.R.inc(3186);hash <<= HASH_SHIFT;
        __CLR4_4_12fr2frkcq4str8.R.inc(3187);hash ^= thenProc.hashCode();
        __CLR4_4_12fr2frkcq4str8.R.inc(3188);hash <<= HASH_SHIFT;
        __CLR4_4_12fr2frkcq4str8.R.inc(3189);hash ^= elseProc.hashCode();
        __CLR4_4_12fr2frkcq4str8.R.inc(3190);return hash;
    }finally{__CLR4_4_12fr2frkcq4str8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_12fr2frkcq4str8.R.inc(3191);
        __CLR4_4_12fr2frkcq4str8.R.inc(3192);return "ConditionalBinaryProcedure<" + ifPred + "?" + thenProc + ":" + elseProc + ">";
    }finally{__CLR4_4_12fr2frkcq4str8.R.flushNeeded();}}
}
