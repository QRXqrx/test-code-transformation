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
import org.apache.commons.functor.Procedure;
import org.apache.commons.lang3.Validate;

/**
 * Adapts a
 * {@link Procedure Procedure}
 * to the
 * {@link BinaryProcedure BinaryProcedure} interface
 * by ignoring the second binary argument.
 *
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @version $Revision$ $Date$
 */
public final class IgnoreRightProcedure<L, R> implements BinaryProcedure<L, R> {public static class __CLR4_4_1fzfzkcq4st3y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,600,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The {@link Procedure Procedure} I'm wrapping. */
    private final Procedure<? super L> procedure;

    /**
     * Create a new IgnoreRightProcedure.
     * @param procedure Procedure to adapt
     */
    public IgnoreRightProcedure(Procedure<? super L> procedure) {try{__CLR4_4_1fzfzkcq4st3y.R.inc(575);
        __CLR4_4_1fzfzkcq4st3y.R.inc(576);this.procedure = Validate.notNull(procedure, "Procedure argument was null");
    }finally{__CLR4_4_1fzfzkcq4st3y.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public void run(L left, R right) {try{__CLR4_4_1fzfzkcq4st3y.R.inc(577);
        __CLR4_4_1fzfzkcq4st3y.R.inc(578);procedure.run(left);
    }finally{__CLR4_4_1fzfzkcq4st3y.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1fzfzkcq4st3y.R.inc(579);
        __CLR4_4_1fzfzkcq4st3y.R.inc(580);if ((((obj == this)&&(__CLR4_4_1fzfzkcq4st3y.R.iget(581)!=0|true))||(__CLR4_4_1fzfzkcq4st3y.R.iget(582)==0&false))) {{
            __CLR4_4_1fzfzkcq4st3y.R.inc(583);return true;
        }
        }__CLR4_4_1fzfzkcq4st3y.R.inc(584);if ((((!(obj instanceof IgnoreRightProcedure<?, ?>))&&(__CLR4_4_1fzfzkcq4st3y.R.iget(585)!=0|true))||(__CLR4_4_1fzfzkcq4st3y.R.iget(586)==0&false))) {{
            __CLR4_4_1fzfzkcq4st3y.R.inc(587);return false;
        }
        }__CLR4_4_1fzfzkcq4st3y.R.inc(588);IgnoreRightProcedure<?, ?> that = (IgnoreRightProcedure<?, ?>) obj;
        __CLR4_4_1fzfzkcq4st3y.R.inc(589);return this.procedure.equals(that.procedure);
    }finally{__CLR4_4_1fzfzkcq4st3y.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_1fzfzkcq4st3y.R.inc(590);
        __CLR4_4_1fzfzkcq4st3y.R.inc(591);int hash = "IgnoreRightProcedure".hashCode();
        __CLR4_4_1fzfzkcq4st3y.R.inc(592);hash ^= procedure.hashCode();
        __CLR4_4_1fzfzkcq4st3y.R.inc(593);return hash;
    }finally{__CLR4_4_1fzfzkcq4st3y.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_1fzfzkcq4st3y.R.inc(594);
        __CLR4_4_1fzfzkcq4st3y.R.inc(595);return "IgnoreRightProcedure<" + procedure + ">";
    }finally{__CLR4_4_1fzfzkcq4st3y.R.flushNeeded();}}

    /**
     * Adapt a Procedure to the BinaryProcedure interface.
     * @param <L> left type
     * @param <R> right type
     * @param procedure Procedure to adapt
     * @return IgnoreRightProcedure
     */
    public static <L, R> IgnoreRightProcedure<L, R> adapt(Procedure<? super L> procedure) {try{__CLR4_4_1fzfzkcq4st3y.R.inc(596);
        __CLR4_4_1fzfzkcq4st3y.R.inc(597);return (((null == procedure )&&(__CLR4_4_1fzfzkcq4st3y.R.iget(598)!=0|true))||(__CLR4_4_1fzfzkcq4st3y.R.iget(599)==0&false))? null : new IgnoreRightProcedure<L, R>(procedure);
    }finally{__CLR4_4_1fzfzkcq4st3y.R.flushNeeded();}}

}
