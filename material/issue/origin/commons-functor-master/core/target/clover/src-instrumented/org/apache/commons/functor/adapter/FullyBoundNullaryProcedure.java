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
package org.apache.commons.functor.adapter;

import org.apache.commons.functor.BinaryProcedure;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.lang3.Validate;

/**
 * Adapts a
 * {@link BinaryProcedure BinaryProcedure}
 * to the
 * {@link NullaryProcedure NullaryProcedure} interface
 * using a constant left-side argument.
 *
 * @version $Revision: 1365377 $ $Date: 2012-07-24 21:59:23 -0300 (Tue, 24 Jul 2012) $
 */
public final class FullyBoundNullaryProcedure implements NullaryProcedure {public static class __CLR4_4_19y9ykcq4st1n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,400,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The {@link BinaryProcedure BinaryProcedure} I'm wrapping. */
    private final BinaryProcedure<Object, Object> procedure;
    /** The left parameter to pass to {@code procedure}. */
    private final Object left;
    /** The right parameter to pass to {@code procedure}. */
    private final Object right;

    /**
     * Create a new FullyBoundNullaryProcedure instance.
     * @param <L> left type
     * @param <R> right type
     * @param procedure the procedure to adapt
     * @param left the left argument to use
     * @param right the right argument to use
     */
    @SuppressWarnings("unchecked")
    public <L, R> FullyBoundNullaryProcedure(BinaryProcedure<? super L, ? super R> procedure, L left, R right) {try{__CLR4_4_19y9ykcq4st1n.R.inc(358);
        __CLR4_4_19y9ykcq4st1n.R.inc(359);this.procedure =
            (BinaryProcedure<Object, Object>) Validate.notNull(procedure,
                "BinaryProcedure argument was null");
        __CLR4_4_19y9ykcq4st1n.R.inc(360);this.left = left;
        __CLR4_4_19y9ykcq4st1n.R.inc(361);this.right = right;
    }finally{__CLR4_4_19y9ykcq4st1n.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public void run() {try{__CLR4_4_19y9ykcq4st1n.R.inc(362);
        __CLR4_4_19y9ykcq4st1n.R.inc(363);procedure.run(left, right);
    }finally{__CLR4_4_19y9ykcq4st1n.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_19y9ykcq4st1n.R.inc(364);
        __CLR4_4_19y9ykcq4st1n.R.inc(365);if ((((obj == this)&&(__CLR4_4_19y9ykcq4st1n.R.iget(366)!=0|true))||(__CLR4_4_19y9ykcq4st1n.R.iget(367)==0&false))) {{
            __CLR4_4_19y9ykcq4st1n.R.inc(368);return true;
        }
        }__CLR4_4_19y9ykcq4st1n.R.inc(369);if ((((!(obj instanceof FullyBoundNullaryProcedure))&&(__CLR4_4_19y9ykcq4st1n.R.iget(370)!=0|true))||(__CLR4_4_19y9ykcq4st1n.R.iget(371)==0&false))) {{
            __CLR4_4_19y9ykcq4st1n.R.inc(372);return false;
        }
        }__CLR4_4_19y9ykcq4st1n.R.inc(373);FullyBoundNullaryProcedure that = (FullyBoundNullaryProcedure) obj;
        __CLR4_4_19y9ykcq4st1n.R.inc(374);return procedure.equals(that.procedure)
                && ((((null == left )&&(__CLR4_4_19y9ykcq4st1n.R.iget(375)!=0|true))||(__CLR4_4_19y9ykcq4st1n.R.iget(376)==0&false))? null == that.left : left.equals(that.left))
                && ((((null == right )&&(__CLR4_4_19y9ykcq4st1n.R.iget(377)!=0|true))||(__CLR4_4_19y9ykcq4st1n.R.iget(378)==0&false))? null == that.right : right.equals(that.right));
    }finally{__CLR4_4_19y9ykcq4st1n.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_19y9ykcq4st1n.R.inc(379);
        __CLR4_4_19y9ykcq4st1n.R.inc(380);int hash = "FullyBoundNullaryProcedure".hashCode();
        __CLR4_4_19y9ykcq4st1n.R.inc(381);hash <<= 2;
        __CLR4_4_19y9ykcq4st1n.R.inc(382);hash ^= procedure.hashCode();
        __CLR4_4_19y9ykcq4st1n.R.inc(383);hash <<= 2;
        __CLR4_4_19y9ykcq4st1n.R.inc(384);if ((((null != left)&&(__CLR4_4_19y9ykcq4st1n.R.iget(385)!=0|true))||(__CLR4_4_19y9ykcq4st1n.R.iget(386)==0&false))) {{
            __CLR4_4_19y9ykcq4st1n.R.inc(387);hash ^= left.hashCode();
        }
        }__CLR4_4_19y9ykcq4st1n.R.inc(388);hash <<= 2;
        __CLR4_4_19y9ykcq4st1n.R.inc(389);if ((((null != right)&&(__CLR4_4_19y9ykcq4st1n.R.iget(390)!=0|true))||(__CLR4_4_19y9ykcq4st1n.R.iget(391)==0&false))) {{
            __CLR4_4_19y9ykcq4st1n.R.inc(392);hash ^= right.hashCode();
        }
        }__CLR4_4_19y9ykcq4st1n.R.inc(393);return hash;
    }finally{__CLR4_4_19y9ykcq4st1n.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_19y9ykcq4st1n.R.inc(394);
        __CLR4_4_19y9ykcq4st1n.R.inc(395);return "FullyBoundNullaryProcedure<" + procedure + "(" + left + ", " + right + ")>";
    }finally{__CLR4_4_19y9ykcq4st1n.R.flushNeeded();}}

    /**
     * Adapt a BinaryNullaryProcedure to the NullaryProcedure interface.
     * @param <L> left type
     * @param <R> right type
     * @param procedure to adapt
     * @param left left side argument
     * @param right right side argument
     * @return FullyBoundNullaryProcedure
     */
    public static <L, R> FullyBoundNullaryProcedure bind(
            BinaryProcedure<? super L, ? super R> procedure, L left, R right) {try{__CLR4_4_19y9ykcq4st1n.R.inc(396);
        __CLR4_4_19y9ykcq4st1n.R.inc(397);return (((null == procedure )&&(__CLR4_4_19y9ykcq4st1n.R.iget(398)!=0|true))||(__CLR4_4_19y9ykcq4st1n.R.iget(399)==0&false))? null : new FullyBoundNullaryProcedure(procedure, left, right);
    }finally{__CLR4_4_19y9ykcq4st1n.R.flushNeeded();}}

}
