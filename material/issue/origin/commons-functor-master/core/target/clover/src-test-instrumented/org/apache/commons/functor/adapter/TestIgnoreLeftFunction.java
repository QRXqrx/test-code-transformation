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
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.Identity;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIgnoreLeftFunction extends BaseFunctorTest {static class __CLR4_4_13vk3vkkcq4su91{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,5044,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_13vk3vkkcq4su91.R.inc(5024);
        __CLR4_4_13vk3vkkcq4su91.R.inc(5025);return new IgnoreLeftFunction<Object, Object, Object>(Constant.of("xyzzy"));
    }finally{__CLR4_4_13vk3vkkcq4su91.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testEvaluate() throws Exception {__CLR4_4_13vk3vkkcq4su91.R.globalSliceStart(getClass().getName(),5026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czkatq3vm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vk3vkkcq4su91.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vk3vkkcq4su91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestIgnoreLeftFunction.testEvaluate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czkatq3vm() throws Exception{try{__CLR4_4_13vk3vkkcq4su91.R.inc(5026);
        __CLR4_4_13vk3vkkcq4su91.R.inc(5027);BinaryFunction<String, String, String> f = new IgnoreLeftFunction<String, String, String>(new Identity<String>());
        __CLR4_4_13vk3vkkcq4su91.R.inc(5028);assertNull(f.evaluate(null,null));
        __CLR4_4_13vk3vkkcq4su91.R.inc(5029);assertNull(f.evaluate("xyzzy",null));
        __CLR4_4_13vk3vkkcq4su91.R.inc(5030);assertEquals("xyzzy",f.evaluate(null,"xyzzy"));
        __CLR4_4_13vk3vkkcq4su91.R.inc(5031);assertEquals("xyzzy",f.evaluate("abc","xyzzy"));
    }finally{__CLR4_4_13vk3vkkcq4su91.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_13vk3vkkcq4su91.R.globalSliceStart(getClass().getName(),5032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6083vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vk3vkkcq4su91.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vk3vkkcq4su91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestIgnoreLeftFunction.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6083vs() throws Exception{try{__CLR4_4_13vk3vkkcq4su91.R.inc(5032);
        __CLR4_4_13vk3vkkcq4su91.R.inc(5033);BinaryFunction<Object, Object, String> f = new IgnoreLeftFunction<Object, Object, String>(Constant.of("xyzzy"));
        __CLR4_4_13vk3vkkcq4su91.R.inc(5034);assertEquals(f,f);
        __CLR4_4_13vk3vkkcq4su91.R.inc(5035);assertObjectsAreEqual(f,new IgnoreLeftFunction<Object, Object, String>(Constant.of("xyzzy")));
        __CLR4_4_13vk3vkkcq4su91.R.inc(5036);assertObjectsAreNotEqual(f,Constant.of("x"));
        __CLR4_4_13vk3vkkcq4su91.R.inc(5037);assertObjectsAreNotEqual(f,new IgnoreLeftFunction<Object, Object, String>(Constant.<String>of(null)));
        __CLR4_4_13vk3vkkcq4su91.R.inc(5038);assertObjectsAreNotEqual(f,Constant.of(null));
        __CLR4_4_13vk3vkkcq4su91.R.inc(5039);assertTrue(!f.equals(null));
    }finally{__CLR4_4_13vk3vkkcq4su91.R.flushNeeded();}}

    @Test
    public void testAdaptNull() throws Exception {__CLR4_4_13vk3vkkcq4su91.R.globalSliceStart(getClass().getName(),5040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t45fwe3w0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vk3vkkcq4su91.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vk3vkkcq4su91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestIgnoreLeftFunction.testAdaptNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t45fwe3w0() throws Exception{try{__CLR4_4_13vk3vkkcq4su91.R.inc(5040);
        __CLR4_4_13vk3vkkcq4su91.R.inc(5041);assertNull(IgnoreLeftFunction.adapt(null));
    }finally{__CLR4_4_13vk3vkkcq4su91.R.flushNeeded();}}

    @Test
    public void testAdapt() throws Exception {__CLR4_4_13vk3vkkcq4su91.R.globalSliceStart(getClass().getName(),5042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11awe893w2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vk3vkkcq4su91.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vk3vkkcq4su91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestIgnoreLeftFunction.testAdapt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11awe893w2() throws Exception{try{__CLR4_4_13vk3vkkcq4su91.R.inc(5042);
        __CLR4_4_13vk3vkkcq4su91.R.inc(5043);assertNotNull(IgnoreLeftFunction.adapt(Constant.of("xyzzy")));
    }finally{__CLR4_4_13vk3vkkcq4su91.R.flushNeeded();}}
}
