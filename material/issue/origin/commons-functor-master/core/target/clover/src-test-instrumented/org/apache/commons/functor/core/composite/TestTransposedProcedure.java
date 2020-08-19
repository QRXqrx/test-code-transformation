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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryProcedure;
import org.apache.commons.functor.core.NoOp;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestTransposedProcedure extends BaseFunctorTest {static class __CLR4_4_173q73qkcq4sv4t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,9233,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_173q73qkcq4sv4t.R.inc(9206);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9207);return new TransposedProcedure<Object, Object>(NoOp.INSTANCE);
    }finally{__CLR4_4_173q73qkcq4sv4t.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testEvaluate() throws Exception {__CLR4_4_173q73qkcq4sv4t.R.globalSliceStart(getClass().getName(),9208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czkatq73s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_173q73qkcq4sv4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_173q73qkcq4sv4t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestTransposedProcedure.testEvaluate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czkatq73s() throws Exception{try{__CLR4_4_173q73qkcq4sv4t.R.inc(9208);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9209);LeftNotNullCounter counter = new LeftNotNullCounter();
        __CLR4_4_173q73qkcq4sv4t.R.inc(9210);BinaryProcedure<Object, Object> p = new TransposedProcedure<Object, Object>(counter);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9211);assertEquals(0,counter.count);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9212);p.run(null,"not null");
        __CLR4_4_173q73qkcq4sv4t.R.inc(9213);assertEquals(1,counter.count);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9214);p.run("not null",null);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9215);assertEquals(1,counter.count);
    }finally{__CLR4_4_173q73qkcq4sv4t.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_173q73qkcq4sv4t.R.globalSliceStart(getClass().getName(),9216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e608740();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_173q73qkcq4sv4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_173q73qkcq4sv4t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestTransposedProcedure.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e608740() throws Exception{try{__CLR4_4_173q73qkcq4sv4t.R.inc(9216);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9217);BinaryProcedure<Object, Object> p = new TransposedProcedure<Object, Object>(NoOp.INSTANCE);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9218);assertEquals(p,p);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9219);assertObjectsAreEqual(p,new TransposedProcedure<Object, Object>(NoOp.INSTANCE));
        __CLR4_4_173q73qkcq4sv4t.R.inc(9220);assertObjectsAreEqual(p,TransposedProcedure.transpose(NoOp.INSTANCE));
        __CLR4_4_173q73qkcq4sv4t.R.inc(9221);assertObjectsAreNotEqual(p,new TransposedProcedure<Object, Object>(new TransposedProcedure<Object, Object>(NoOp.INSTANCE)));
        __CLR4_4_173q73qkcq4sv4t.R.inc(9222);assertObjectsAreNotEqual(p,NoOp.INSTANCE);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9223);assertTrue(!p.equals((TransposedProcedure<?, ?>)null));
    }finally{__CLR4_4_173q73qkcq4sv4t.R.flushNeeded();}}

    @Test
    public void testTransposeNull() throws Exception {__CLR4_4_173q73qkcq4sv4t.R.globalSliceStart(getClass().getName(),9224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1aidn748();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_173q73qkcq4sv4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_173q73qkcq4sv4t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestTransposedProcedure.testTransposeNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1aidn748() throws Exception{try{__CLR4_4_173q73qkcq4sv4t.R.inc(9224);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9225);assertNull(TransposedProcedure.transpose(null));
    }finally{__CLR4_4_173q73qkcq4sv4t.R.flushNeeded();}}

    @Test
    public void testTranspose() throws Exception {__CLR4_4_173q73qkcq4sv4t.R.globalSliceStart(getClass().getName(),9226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gtyr274a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_173q73qkcq4sv4t.R.rethrow($CLV_t2$);}finally{__CLR4_4_173q73qkcq4sv4t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestTransposedProcedure.testTranspose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gtyr274a() throws Exception{try{__CLR4_4_173q73qkcq4sv4t.R.inc(9226);
        __CLR4_4_173q73qkcq4sv4t.R.inc(9227);assertNotNull(TransposedProcedure.transpose(NoOp.INSTANCE));
    }finally{__CLR4_4_173q73qkcq4sv4t.R.flushNeeded();}}

    // Classes
    // ------------------------------------------------------------------------

    static class LeftNotNullCounter implements BinaryProcedure<Object, Object> {
        public void run(Object a, Object b) {try{__CLR4_4_173q73qkcq4sv4t.R.inc(9228);
            __CLR4_4_173q73qkcq4sv4t.R.inc(9229);if ((((null != a)&&(__CLR4_4_173q73qkcq4sv4t.R.iget(9230)!=0|true))||(__CLR4_4_173q73qkcq4sv4t.R.iget(9231)==0&false))) {{
                __CLR4_4_173q73qkcq4sv4t.R.inc(9232);count++;
            }
        }}finally{__CLR4_4_173q73qkcq4sv4t.R.flushNeeded();}}
        public int count = 0;
    }

}
