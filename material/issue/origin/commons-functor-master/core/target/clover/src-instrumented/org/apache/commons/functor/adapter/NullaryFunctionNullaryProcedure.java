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

import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.lang3.Validate;

/**
 * Adapts a {@link NullaryFunction NullaryFunction}
 * to the {@link NullaryProcedure NullaryProcedure}
 * interface by ignoring the value returned
 * by the function.
 *
 * @version $Revision: 1365377 $ $Date: 2012-07-24 21:59:23 -0300 (Tue, 24 Jul 2012) $
 */
public final class NullaryFunctionNullaryProcedure implements NullaryProcedure {public static class __CLR4_4_1kwkwkcq4st5f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,777,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The {@link NullaryFunction NullaryFunction} I'm wrapping. */
    private final NullaryFunction<?> function;

    /**
     * Create an {@link NullaryProcedure NullaryProcedure} wrapping
     * the given {@link NullaryFunction NullaryFunction}.
     * @param function the {@link NullaryFunction NullaryFunction} to wrap
     */
    public NullaryFunctionNullaryProcedure(NullaryFunction<?> function) {try{__CLR4_4_1kwkwkcq4st5f.R.inc(752);
        __CLR4_4_1kwkwkcq4st5f.R.inc(753);this.function = Validate.notNull(function, "NullaryFunction argument was null");
    }finally{__CLR4_4_1kwkwkcq4st5f.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * {@link NullaryFunction#evaluate Evaluate} my function,
     * but ignore its returned value.
     */
    public void run() {try{__CLR4_4_1kwkwkcq4st5f.R.inc(754);
        __CLR4_4_1kwkwkcq4st5f.R.inc(755);function.evaluate();
    }finally{__CLR4_4_1kwkwkcq4st5f.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1kwkwkcq4st5f.R.inc(756);
        __CLR4_4_1kwkwkcq4st5f.R.inc(757);if ((((obj == this)&&(__CLR4_4_1kwkwkcq4st5f.R.iget(758)!=0|true))||(__CLR4_4_1kwkwkcq4st5f.R.iget(759)==0&false))) {{
            __CLR4_4_1kwkwkcq4st5f.R.inc(760);return true;
        }
        }__CLR4_4_1kwkwkcq4st5f.R.inc(761);if ((((!(obj instanceof NullaryFunctionNullaryProcedure))&&(__CLR4_4_1kwkwkcq4st5f.R.iget(762)!=0|true))||(__CLR4_4_1kwkwkcq4st5f.R.iget(763)==0&false))) {{
            __CLR4_4_1kwkwkcq4st5f.R.inc(764);return false;
        }
        }__CLR4_4_1kwkwkcq4st5f.R.inc(765);NullaryFunctionNullaryProcedure that = (NullaryFunctionNullaryProcedure) obj;
        __CLR4_4_1kwkwkcq4st5f.R.inc(766);return this.function.equals(that.function);
    }finally{__CLR4_4_1kwkwkcq4st5f.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_1kwkwkcq4st5f.R.inc(767);
        __CLR4_4_1kwkwkcq4st5f.R.inc(768);int hash = "NullaryFunctionNullaryProcedure".hashCode();
        __CLR4_4_1kwkwkcq4st5f.R.inc(769);hash ^= function.hashCode();
        __CLR4_4_1kwkwkcq4st5f.R.inc(770);return hash;
    }finally{__CLR4_4_1kwkwkcq4st5f.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_1kwkwkcq4st5f.R.inc(771);
        __CLR4_4_1kwkwkcq4st5f.R.inc(772);return "NullaryFunctionNullaryProcedure<" + function + ">";
    }finally{__CLR4_4_1kwkwkcq4st5f.R.flushNeeded();}}

    /**
     * Adapt the given, possibly-<code>null</code>,
     * {@link NullaryFunction NullaryFunction} to the
     * {@link NullaryProcedure NullaryProcedure} interface.
     * When the given <code>NullaryFunction</code> is <code>null</code>,
     * returns <code>null</code>.
     *
     * @param function the possibly-<code>null</code>
     *        {@link NullaryFunction NullaryFunction} to adapt
     * @return a {@link NullaryProcedure NullaryProcedure} wrapping the given
     *         {@link NullaryFunction NullaryFunction}, or <code>null</code>
     *         if the given <code>NullaryFunction</code> is <code>null</code>
     */
    public static NullaryFunctionNullaryProcedure adapt(NullaryFunction<?> function) {try{__CLR4_4_1kwkwkcq4st5f.R.inc(773);
        __CLR4_4_1kwkwkcq4st5f.R.inc(774);return (((null == function )&&(__CLR4_4_1kwkwkcq4st5f.R.iget(775)!=0|true))||(__CLR4_4_1kwkwkcq4st5f.R.iget(776)==0&false))? null : new NullaryFunctionNullaryProcedure(function);
    }finally{__CLR4_4_1kwkwkcq4st5f.R.flushNeeded();}}

}
