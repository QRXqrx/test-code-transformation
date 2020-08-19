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

import org.apache.commons.functor.Function;
import org.apache.commons.functor.Procedure;
import org.apache.commons.lang3.Validate;

/**
 * Adapts a {@link Function Function}
 * to the {@link Procedure Procedure}
 * interface by ignoring the value returned
 * by the function.
 *
 * @param <A> the argument type.
 * @version $Revision$ $Date$
 */
public final class FunctionProcedure<A> implements Procedure<A> {public static class __CLR4_4_1btbtkcq4st2g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,450,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The {@link Function Function} I'm wrapping. */
    private final Function<? super A, ?> function;

    /**
     * Create an {@link Procedure Procedure} wrapping
     * the given {@link Function Function}.
     * @param function the {@link Function Function} to wrap
     */
    public FunctionProcedure(Function<? super A, ?> function) {try{__CLR4_4_1btbtkcq4st2g.R.inc(425);
        __CLR4_4_1btbtkcq4st2g.R.inc(426);this.function = Validate.notNull(function, "Function argument was null");
    }finally{__CLR4_4_1btbtkcq4st2g.R.flushNeeded();}}

    /**
     * {@link Function#evaluate Evaluate} my function, but
     * ignore its returned value.
     * {@inheritDoc}
     */
    public void run(A obj) {try{__CLR4_4_1btbtkcq4st2g.R.inc(427);
        __CLR4_4_1btbtkcq4st2g.R.inc(428);function.evaluate(obj);
    }finally{__CLR4_4_1btbtkcq4st2g.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1btbtkcq4st2g.R.inc(429);
        __CLR4_4_1btbtkcq4st2g.R.inc(430);if ((((obj == this)&&(__CLR4_4_1btbtkcq4st2g.R.iget(431)!=0|true))||(__CLR4_4_1btbtkcq4st2g.R.iget(432)==0&false))) {{
            __CLR4_4_1btbtkcq4st2g.R.inc(433);return true;
        }
        }__CLR4_4_1btbtkcq4st2g.R.inc(434);if ((((!(obj instanceof FunctionProcedure<?>))&&(__CLR4_4_1btbtkcq4st2g.R.iget(435)!=0|true))||(__CLR4_4_1btbtkcq4st2g.R.iget(436)==0&false))) {{
            __CLR4_4_1btbtkcq4st2g.R.inc(437);return false;
        }
        }__CLR4_4_1btbtkcq4st2g.R.inc(438);FunctionProcedure<?> that = (FunctionProcedure<?>) obj;
        __CLR4_4_1btbtkcq4st2g.R.inc(439);return this.function.equals(that.function);
    }finally{__CLR4_4_1btbtkcq4st2g.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_1btbtkcq4st2g.R.inc(440);
        __CLR4_4_1btbtkcq4st2g.R.inc(441);int hash = "FunctionProcedure".hashCode();
        __CLR4_4_1btbtkcq4st2g.R.inc(442);hash ^= function.hashCode();
        __CLR4_4_1btbtkcq4st2g.R.inc(443);return hash;
    }finally{__CLR4_4_1btbtkcq4st2g.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_1btbtkcq4st2g.R.inc(444);
        __CLR4_4_1btbtkcq4st2g.R.inc(445);return "FunctionProcedure<" + function + ">";
    }finally{__CLR4_4_1btbtkcq4st2g.R.flushNeeded();}}

    /**
     * Adapt the given, possibly-<code>null</code>,
     * {@link Function Function} to the
     * {@link Procedure Procedure} interface.
     * When the given <code>Function</code> is <code>null</code>,
     * returns <code>null</code>.
     *
     * @param <A> the argument type.
     * @param function the possibly-<code>null</code>
     *        {@link Function Function} to adapt
     * @return a {@link Procedure Procedure} wrapping the given
     *         {@link Function Function}, or <code>null</code>
     *         if the given <code>Function</code> is <code>null</code>
     */
    public static <A> FunctionProcedure<A> adapt(Function<? super A, ?> function) {try{__CLR4_4_1btbtkcq4st2g.R.inc(446);
        __CLR4_4_1btbtkcq4st2g.R.inc(447);return (((null == function )&&(__CLR4_4_1btbtkcq4st2g.R.iget(448)!=0|true))||(__CLR4_4_1btbtkcq4st2g.R.iget(449)==0&false))? null : new FunctionProcedure<A>(function);
    }finally{__CLR4_4_1btbtkcq4st2g.R.flushNeeded();}}

}
