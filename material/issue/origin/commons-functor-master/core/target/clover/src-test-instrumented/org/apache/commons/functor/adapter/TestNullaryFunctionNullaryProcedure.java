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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.NoOp;
import org.junit.Test;

/**
 * @version $Revision: 1365377 $ $Date: 2012-07-24 21:59:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestNullaryFunctionNullaryProcedure extends BaseFunctorTest {static class __CLR4_4_141f41fkcq4subs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,5258,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_141f41fkcq4subs.R.inc(5235);
        __CLR4_4_141f41fkcq4subs.R.inc(5236);return new NullaryFunctionNullaryProcedure(Constant.of("K"));
    }finally{__CLR4_4_141f41fkcq4subs.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testRun() throws Exception {__CLR4_4_141f41fkcq4subs.R.globalSliceStart(getClass().getName(),5237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzvxa841h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141f41fkcq4subs.R.rethrow($CLV_t2$);}finally{__CLR4_4_141f41fkcq4subs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestNullaryFunctionNullaryProcedure.testRun",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzvxa841h() throws Exception{try{__CLR4_4_141f41fkcq4subs.R.inc(5237);
        class EvaluateCounter implements NullaryFunction<Integer> {
            int count = 0;
            public Integer evaluate() {try{__CLR4_4_141f41fkcq4subs.R.inc(5238); __CLR4_4_141f41fkcq4subs.R.inc(5239);return Integer.valueOf(count++); }finally{__CLR4_4_141f41fkcq4subs.R.flushNeeded();}}
        }
        __CLR4_4_141f41fkcq4subs.R.inc(5240);EvaluateCounter counter = new EvaluateCounter();
        __CLR4_4_141f41fkcq4subs.R.inc(5241);NullaryProcedure p = new NullaryFunctionNullaryProcedure(counter);
        __CLR4_4_141f41fkcq4subs.R.inc(5242);assertEquals(0,counter.count);
        __CLR4_4_141f41fkcq4subs.R.inc(5243);p.run();
        __CLR4_4_141f41fkcq4subs.R.inc(5244);assertEquals(1,counter.count);
        __CLR4_4_141f41fkcq4subs.R.inc(5245);p.run();
        __CLR4_4_141f41fkcq4subs.R.inc(5246);assertEquals(2,counter.count);
    }finally{__CLR4_4_141f41fkcq4subs.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_141f41fkcq4subs.R.globalSliceStart(getClass().getName(),5247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60841r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141f41fkcq4subs.R.rethrow($CLV_t2$);}finally{__CLR4_4_141f41fkcq4subs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestNullaryFunctionNullaryProcedure.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60841r() throws Exception{try{__CLR4_4_141f41fkcq4subs.R.inc(5247);
        __CLR4_4_141f41fkcq4subs.R.inc(5248);NullaryProcedure p = new NullaryFunctionNullaryProcedure(Constant.of("K"));
        __CLR4_4_141f41fkcq4subs.R.inc(5249);assertEquals(p,p);
        __CLR4_4_141f41fkcq4subs.R.inc(5250);assertObjectsAreEqual(p,new NullaryFunctionNullaryProcedure(Constant.of("K")));
        __CLR4_4_141f41fkcq4subs.R.inc(5251);assertObjectsAreNotEqual(p,NoOp.INSTANCE);
        __CLR4_4_141f41fkcq4subs.R.inc(5252);assertObjectsAreNotEqual(p,new NullaryFunctionNullaryProcedure(Constant.of("J")));
        __CLR4_4_141f41fkcq4subs.R.inc(5253);assertTrue(!p.equals(null));
    }finally{__CLR4_4_141f41fkcq4subs.R.flushNeeded();}}

    @Test
    public void testAdaptNull() throws Exception {__CLR4_4_141f41fkcq4subs.R.globalSliceStart(getClass().getName(),5254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t45fwe41y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141f41fkcq4subs.R.rethrow($CLV_t2$);}finally{__CLR4_4_141f41fkcq4subs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestNullaryFunctionNullaryProcedure.testAdaptNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t45fwe41y() throws Exception{try{__CLR4_4_141f41fkcq4subs.R.inc(5254);
        __CLR4_4_141f41fkcq4subs.R.inc(5255);assertNull(NullaryFunctionNullaryProcedure.adapt(null));
    }finally{__CLR4_4_141f41fkcq4subs.R.flushNeeded();}}

    @Test
    public void testAdapt() throws Exception {__CLR4_4_141f41fkcq4subs.R.globalSliceStart(getClass().getName(),5256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11awe89420();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141f41fkcq4subs.R.rethrow($CLV_t2$);}finally{__CLR4_4_141f41fkcq4subs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestNullaryFunctionNullaryProcedure.testAdapt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11awe89420() throws Exception{try{__CLR4_4_141f41fkcq4subs.R.inc(5256);
        __CLR4_4_141f41fkcq4subs.R.inc(5257);assertNotNull(NullaryFunctionNullaryProcedure.adapt(Constant.of("K")));
    }finally{__CLR4_4_141f41fkcq4subs.R.flushNeeded();}}
}
