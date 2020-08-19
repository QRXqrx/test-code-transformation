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
 * by ignoring the first binary argument.
 *
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @version $Revision$ $Date$
 */
public final class IgnoreLeftProcedure<L, R> implements BinaryProcedure<L, R> {public static class __CLR4_4_1dwdwkcq4st39{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The {@link Procedure Procedure} I'm wrapping. */
    private final Procedure<? super R> procedure;

    /**
     * Create a new IgnoreLeftProcedure.
     * @param procedure to adapt
     */
    public IgnoreLeftProcedure(Procedure<? super R> procedure) {try{__CLR4_4_1dwdwkcq4st39.R.inc(500);
        __CLR4_4_1dwdwkcq4st39.R.inc(501);this.procedure = Validate.notNull(procedure, "Procedure argument was null");
    }finally{__CLR4_4_1dwdwkcq4st39.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public void run(L left, R right) {try{__CLR4_4_1dwdwkcq4st39.R.inc(502);
        __CLR4_4_1dwdwkcq4st39.R.inc(503);procedure.run(right);
    }finally{__CLR4_4_1dwdwkcq4st39.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1dwdwkcq4st39.R.inc(504);
        __CLR4_4_1dwdwkcq4st39.R.inc(505);if ((((obj == this)&&(__CLR4_4_1dwdwkcq4st39.R.iget(506)!=0|true))||(__CLR4_4_1dwdwkcq4st39.R.iget(507)==0&false))) {{
            __CLR4_4_1dwdwkcq4st39.R.inc(508);return true;
        }
        }__CLR4_4_1dwdwkcq4st39.R.inc(509);if ((((!(obj instanceof IgnoreLeftProcedure<?, ?>))&&(__CLR4_4_1dwdwkcq4st39.R.iget(510)!=0|true))||(__CLR4_4_1dwdwkcq4st39.R.iget(511)==0&false))) {{
            __CLR4_4_1dwdwkcq4st39.R.inc(512);return false;
        }
        }__CLR4_4_1dwdwkcq4st39.R.inc(513);IgnoreLeftProcedure<?, ?> that = (IgnoreLeftProcedure<?, ?>) obj;
        __CLR4_4_1dwdwkcq4st39.R.inc(514);return this.procedure.equals(that.procedure);
    }finally{__CLR4_4_1dwdwkcq4st39.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_1dwdwkcq4st39.R.inc(515);
        __CLR4_4_1dwdwkcq4st39.R.inc(516);int hash = "IgnoreLeftProcedure".hashCode();
        __CLR4_4_1dwdwkcq4st39.R.inc(517);hash ^= procedure.hashCode();
        __CLR4_4_1dwdwkcq4st39.R.inc(518);return hash;
    }finally{__CLR4_4_1dwdwkcq4st39.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_1dwdwkcq4st39.R.inc(519);
        __CLR4_4_1dwdwkcq4st39.R.inc(520);return "IgnoreLeftProcedure<" + procedure + ">";
    }finally{__CLR4_4_1dwdwkcq4st39.R.flushNeeded();}}

    /**
     * Adapt a Procedure to the BinaryProcedure interface.
     * @param <L> left type
     * @param <R> right type
     * @param procedure to adapt
     * @return IgnoreLeftProcedure<L, R>
     */
    public static <L, R> IgnoreLeftProcedure<L, R> adapt(Procedure<? super R> procedure) {try{__CLR4_4_1dwdwkcq4st39.R.inc(521);
        __CLR4_4_1dwdwkcq4st39.R.inc(522);return (((null == procedure )&&(__CLR4_4_1dwdwkcq4st39.R.iget(523)!=0|true))||(__CLR4_4_1dwdwkcq4st39.R.iget(524)==0&false))? null : new IgnoreLeftProcedure<L, R>(procedure);
    }finally{__CLR4_4_1dwdwkcq4st39.R.flushNeeded();}}

}
