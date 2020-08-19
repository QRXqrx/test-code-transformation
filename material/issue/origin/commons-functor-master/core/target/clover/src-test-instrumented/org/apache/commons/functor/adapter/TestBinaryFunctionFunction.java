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

import static org.junit.Assert.*;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.IsNotSame;
import org.apache.commons.functor.core.IsSame;
import org.junit.Test;

/**
 * @version $Revision: 1345136 $ $Date: 2012-06-01 09:47:06 -0300 (Fri, 01 Jun 2012) $
 */
public class TestBinaryFunctionFunction extends BaseFunctorTest {static class __CLR4_4_13oc3ockcq4su6m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,4782,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_13oc3ockcq4su6m.R.inc(4764);
        __CLR4_4_13oc3ockcq4su6m.R.inc(4765);return new BinaryFunctionFunction<Object, Object>(BinaryPredicateBinaryFunction.adapt(IsSame.INSTANCE));
    }finally{__CLR4_4_13oc3ockcq4su6m.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testTestWhenTrue() throws Exception {__CLR4_4_13oc3ockcq4su6m.R.globalSliceStart(getClass().getName(),4766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14pr8x93oe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oc3ockcq4su6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oc3ockcq4su6m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestBinaryFunctionFunction.testTestWhenTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14pr8x93oe() throws Exception{try{__CLR4_4_13oc3ockcq4su6m.R.inc(4766);
        __CLR4_4_13oc3ockcq4su6m.R.inc(4767);Function<Object, Boolean> f = new BinaryFunctionFunction<Object, Boolean>(BinaryPredicateBinaryFunction.adapt(IsSame.INSTANCE));
        __CLR4_4_13oc3ockcq4su6m.R.inc(4768);assertEquals(Boolean.TRUE, f.evaluate(null));
    }finally{__CLR4_4_13oc3ockcq4su6m.R.flushNeeded();}}

    @Test
    public void testTestWhenFalse() throws Exception {__CLR4_4_13oc3ockcq4su6m.R.globalSliceStart(getClass().getName(),4769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyl9sc3oh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oc3ockcq4su6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oc3ockcq4su6m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestBinaryFunctionFunction.testTestWhenFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyl9sc3oh() throws Exception{try{__CLR4_4_13oc3ockcq4su6m.R.inc(4769);
        __CLR4_4_13oc3ockcq4su6m.R.inc(4770);Function<Object, Boolean> f = new BinaryFunctionFunction<Object, Boolean>(BinaryPredicateBinaryFunction.adapt(IsNotSame.INSTANCE));
        __CLR4_4_13oc3ockcq4su6m.R.inc(4771);assertEquals(Boolean.FALSE, f.evaluate(null));
    }finally{__CLR4_4_13oc3ockcq4su6m.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_13oc3ockcq4su6m.R.globalSliceStart(getClass().getName(),4772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6083ok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oc3ockcq4su6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oc3ockcq4su6m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestBinaryFunctionFunction.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6083ok() throws Exception{try{__CLR4_4_13oc3ockcq4su6m.R.inc(4772);
        __CLR4_4_13oc3ockcq4su6m.R.inc(4773);Function<Object, Boolean> f = new BinaryFunctionFunction<Object, Boolean>(BinaryPredicateBinaryFunction.adapt(IsSame.INSTANCE));
        __CLR4_4_13oc3ockcq4su6m.R.inc(4774);assertEquals(f, f);
        __CLR4_4_13oc3ockcq4su6m.R.inc(4775);assertObjectsAreEqual(f, new BinaryFunctionFunction<Object, Boolean>(BinaryPredicateBinaryFunction.adapt(IsSame.INSTANCE)));
        __CLR4_4_13oc3ockcq4su6m.R.inc(4776);assertObjectsAreNotEqual(f, Constant.truePredicate());
        __CLR4_4_13oc3ockcq4su6m.R.inc(4777);assertObjectsAreNotEqual(f, new BinaryFunctionFunction<Object, Boolean>(BinaryPredicateBinaryFunction.adapt(IsNotSame.INSTANCE)));
    }finally{__CLR4_4_13oc3ockcq4su6m.R.flushNeeded();}}

    @Test
    public void testAdaptNull() throws Exception {__CLR4_4_13oc3ockcq4su6m.R.globalSliceStart(getClass().getName(),4778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t45fwe3oq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oc3ockcq4su6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oc3ockcq4su6m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestBinaryFunctionFunction.testAdaptNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t45fwe3oq() throws Exception{try{__CLR4_4_13oc3ockcq4su6m.R.inc(4778);
        __CLR4_4_13oc3ockcq4su6m.R.inc(4779);assertNull(BinaryFunctionFunction.adapt(null));
    }finally{__CLR4_4_13oc3ockcq4su6m.R.flushNeeded();}}

    @Test
    public void testAdapt() throws Exception {__CLR4_4_13oc3ockcq4su6m.R.globalSliceStart(getClass().getName(),4780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11awe893os();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oc3ockcq4su6m.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oc3ockcq4su6m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestBinaryFunctionFunction.testAdapt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11awe893os() throws Exception{try{__CLR4_4_13oc3ockcq4su6m.R.inc(4780);
        __CLR4_4_13oc3ockcq4su6m.R.inc(4781);assertNotNull(BinaryFunctionFunction.adapt(Constant.TRUE));
    }finally{__CLR4_4_13oc3ockcq4su6m.R.flushNeeded();}}
}
