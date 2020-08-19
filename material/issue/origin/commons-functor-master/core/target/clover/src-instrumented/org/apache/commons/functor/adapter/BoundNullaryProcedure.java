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

import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.functor.Procedure;
import org.apache.commons.lang3.Validate;

/**
 * Adapts a
 * {@link Procedure Procedure}
 * to the
 * {@link NullaryProcedure NullaryProcedure} interface
 * using a constant unary argument.
 *
 * @version $Revision: 1365377 $ $Date: 2012-07-24 21:59:23 -0300 (Tue, 24 Jul 2012) $
 */
public final class BoundNullaryProcedure implements NullaryProcedure {public static class __CLR4_4_16o6okcq4st0l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,274,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The {@link Procedure Procedure} I'm wrapping. */
    private final Procedure<Object> procedure;
    /** The parameter to pass to {@code procedure}. */
    private final Object param;

    /**
     * Create a new BoundNullaryProcedure instance.
     * @param <A> arg type
     * @param procedure the procedure to adapt
     * @param arg the constant argument to use
     */
    @SuppressWarnings("unchecked")
    public <A> BoundNullaryProcedure(Procedure<? super A> procedure, A arg) {try{__CLR4_4_16o6okcq4st0l.R.inc(240);
        __CLR4_4_16o6okcq4st0l.R.inc(241);this.procedure =
            (Procedure<Object>) Validate.notNull(procedure,
                "Procedure argument was null");
        __CLR4_4_16o6okcq4st0l.R.inc(242);this.param = arg;
    }finally{__CLR4_4_16o6okcq4st0l.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public void run() {try{__CLR4_4_16o6okcq4st0l.R.inc(243);
        __CLR4_4_16o6okcq4st0l.R.inc(244);procedure.run(param);
    }finally{__CLR4_4_16o6okcq4st0l.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_16o6okcq4st0l.R.inc(245);
        __CLR4_4_16o6okcq4st0l.R.inc(246);if ((((obj == this)&&(__CLR4_4_16o6okcq4st0l.R.iget(247)!=0|true))||(__CLR4_4_16o6okcq4st0l.R.iget(248)==0&false))) {{
            __CLR4_4_16o6okcq4st0l.R.inc(249);return true;
        }
        }__CLR4_4_16o6okcq4st0l.R.inc(250);if ((((!(obj instanceof BoundNullaryProcedure))&&(__CLR4_4_16o6okcq4st0l.R.iget(251)!=0|true))||(__CLR4_4_16o6okcq4st0l.R.iget(252)==0&false))) {{
            __CLR4_4_16o6okcq4st0l.R.inc(253);return false;
        }
        }__CLR4_4_16o6okcq4st0l.R.inc(254);BoundNullaryProcedure that = (BoundNullaryProcedure) obj;
        __CLR4_4_16o6okcq4st0l.R.inc(255);return procedure.equals(that.procedure)
                && ((((null == param )&&(__CLR4_4_16o6okcq4st0l.R.iget(256)!=0|true))||(__CLR4_4_16o6okcq4st0l.R.iget(257)==0&false))? null == that.param : param.equals(that.param));
    }finally{__CLR4_4_16o6okcq4st0l.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_16o6okcq4st0l.R.inc(258);
        __CLR4_4_16o6okcq4st0l.R.inc(259);int hash = "BoundNullaryProcedure".hashCode();
        __CLR4_4_16o6okcq4st0l.R.inc(260);hash <<= 2;
        __CLR4_4_16o6okcq4st0l.R.inc(261);hash ^= procedure.hashCode();
        __CLR4_4_16o6okcq4st0l.R.inc(262);if ((((null != param)&&(__CLR4_4_16o6okcq4st0l.R.iget(263)!=0|true))||(__CLR4_4_16o6okcq4st0l.R.iget(264)==0&false))) {{
            __CLR4_4_16o6okcq4st0l.R.inc(265);hash <<= 2;
            __CLR4_4_16o6okcq4st0l.R.inc(266);hash ^= param.hashCode();
        }
        }__CLR4_4_16o6okcq4st0l.R.inc(267);return hash;
    }finally{__CLR4_4_16o6okcq4st0l.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_16o6okcq4st0l.R.inc(268);
        __CLR4_4_16o6okcq4st0l.R.inc(269);return "BoundNullaryProcedure<" + procedure + "(" + param + ")>";
    }finally{__CLR4_4_16o6okcq4st0l.R.flushNeeded();}}

    /**
     * Adapt the given, possibly-<code>null</code>,
     * {@link Procedure Procedure} to the
     * {@link NullaryProcedure NullaryProcedure} interface by binding
     * the specified <code>Object</code> as a constant
     * argument.
     * When the given <code>Procedure</code> is <code>null</code>,
     * returns <code>null</code>.
     *
     * @param <A> arg type
     * @param procedure the possibly-<code>null</code>
     *        {@link Procedure Procedure} to adapt
     * @param arg the object to bind as a constant argument
     * @return a <code>BoundNullaryProcedure</code> wrapping the given
     *         {@link Procedure Procedure}, or <code>null</code>
     *         if the given <code>Procedure</code> is <code>null</code>
     */
    public static <A> BoundNullaryProcedure bind(Procedure<? super A> procedure, A arg) {try{__CLR4_4_16o6okcq4st0l.R.inc(270);
        __CLR4_4_16o6okcq4st0l.R.inc(271);return (((null == procedure )&&(__CLR4_4_16o6okcq4st0l.R.iget(272)!=0|true))||(__CLR4_4_16o6okcq4st0l.R.iget(273)==0&false))? null : new BoundNullaryProcedure(procedure, arg);
    }finally{__CLR4_4_16o6okcq4st0l.R.flushNeeded();}}

}
