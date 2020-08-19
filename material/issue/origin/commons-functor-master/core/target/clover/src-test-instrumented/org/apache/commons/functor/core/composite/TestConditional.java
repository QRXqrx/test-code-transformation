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

import static org.junit.Assert.assertNotNull;

import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.Identity;
import org.apache.commons.functor.core.IsEqual;
import org.apache.commons.functor.core.IsNull;
import org.apache.commons.functor.core.NoOp;
import org.apache.commons.functor.core.comparator.IsGreaterThan;
import org.apache.commons.functor.core.comparator.Max;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestConditional {static class __CLR4_4_16gs6gskcq4suzz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,8395,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testNullaryMethods() {__CLR4_4_16gs6gskcq4suzz.R.globalSliceStart(getClass().getName(),8380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulgqve6gs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16gs6gskcq4suzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_16gs6gskcq4suzz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestConditional.testNullaryMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulgqve6gs(){try{__CLR4_4_16gs6gskcq4suzz.R.inc(8380);
        __CLR4_4_16gs6gskcq4suzz.R.inc(8381);assertNotNull(Conditional.procedure(new NullaryNot(Constant.TRUE),new NullarySequence()));
        __CLR4_4_16gs6gskcq4suzz.R.inc(8382);assertNotNull(Conditional.procedure(new NullaryNot(Constant.TRUE),new NullarySequence(),new NullarySequence()));
        __CLR4_4_16gs6gskcq4suzz.R.inc(8383);assertNotNull(Conditional.function(new NullaryNot(Constant.TRUE),Constant.FALSE,Constant.FALSE));
        __CLR4_4_16gs6gskcq4suzz.R.inc(8384);assertNotNull(Conditional.predicate((NullaryPredicate)Constant.truePredicate(),Constant.truePredicate(),Constant.truePredicate()));
    }finally{__CLR4_4_16gs6gskcq4suzz.R.flushNeeded();}}

    @Test
    public void testUnaryMethods() {__CLR4_4_16gs6gskcq4suzz.R.globalSliceStart(getClass().getName(),8385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z3rzms6gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16gs6gskcq4suzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_16gs6gskcq4suzz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestConditional.testUnaryMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z3rzms6gx(){try{__CLR4_4_16gs6gskcq4suzz.R.inc(8385);
    	__CLR4_4_16gs6gskcq4suzz.R.inc(8386);assertNotNull(Conditional.procedure(IsNull.instance(),NoOp.instance()));
    	__CLR4_4_16gs6gskcq4suzz.R.inc(8387);assertNotNull(Conditional.procedure(IsNull.instance(),NoOp.instance(),NoOp.instance()));
    	__CLR4_4_16gs6gskcq4suzz.R.inc(8388);assertNotNull(Conditional.function(IsNull.instance(),Identity.instance(),Identity.instance()));
    	__CLR4_4_16gs6gskcq4suzz.R.inc(8389);assertNotNull(Conditional.predicate(IsNull.instance(),Constant.truePredicate(),Constant.truePredicate()));
    }finally{__CLR4_4_16gs6gskcq4suzz.R.flushNeeded();}}

    @Test
    public void testBinaryMethods() {__CLR4_4_16gs6gskcq4suzz.R.globalSliceStart(getClass().getName(),8390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5owii6h2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16gs6gskcq4suzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_16gs6gskcq4suzz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestConditional.testBinaryMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5owii6h2(){try{__CLR4_4_16gs6gskcq4suzz.R.inc(8390);
        __CLR4_4_16gs6gskcq4suzz.R.inc(8391);assertNotNull(Conditional.procedure(IsGreaterThan.instance(),NoOp.instance(),NoOp.instance()));
        __CLR4_4_16gs6gskcq4suzz.R.inc(8392);assertNotNull(Conditional.function(IsGreaterThan.instance(),Max.instance(),Max.instance()));
        __CLR4_4_16gs6gskcq4suzz.R.inc(8393);assertNotNull(Conditional.predicate(IsGreaterThan.instance(),Constant.truePredicate(),Constant.truePredicate()));
        __CLR4_4_16gs6gskcq4suzz.R.inc(8394);assertNotNull(Conditional.procedure(new IsEqual<Object, Object>(),NoOp.INSTANCE));
    }finally{__CLR4_4_16gs6gskcq4suzz.R.flushNeeded();}}
}
