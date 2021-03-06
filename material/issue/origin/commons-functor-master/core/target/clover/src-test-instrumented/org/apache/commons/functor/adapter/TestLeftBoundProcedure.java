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
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.core.NoOp;
import org.apache.commons.functor.core.RightIdentity;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestLeftBoundProcedure extends BaseFunctorTest {static class __CLR4_4_13zt3ztkcq4sub5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,5198,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_13zt3ztkcq4sub5.R.inc(5177);
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5178);return new LeftBoundProcedure<Object>(NoOp.INSTANCE,"xyzzy");
    }finally{__CLR4_4_13zt3ztkcq4sub5.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testRun() throws Exception {__CLR4_4_13zt3ztkcq4sub5.R.globalSliceStart(getClass().getName(),5179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzvxa83zv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13zt3ztkcq4sub5.R.rethrow($CLV_t2$);}finally{__CLR4_4_13zt3ztkcq4sub5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestLeftBoundProcedure.testRun",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzvxa83zv() throws Exception{try{__CLR4_4_13zt3ztkcq4sub5.R.inc(5179);
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5180);Procedure<Object> p = new LeftBoundProcedure<Object>(
                new BinaryFunctionBinaryProcedure<Object, Object>(RightIdentity.FUNCTION), "foo");
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5181);p.run(Boolean.TRUE);
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5182);p.run(Boolean.FALSE);
    }finally{__CLR4_4_13zt3ztkcq4sub5.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_13zt3ztkcq4sub5.R.globalSliceStart(getClass().getName(),5183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6083zz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13zt3ztkcq4sub5.R.rethrow($CLV_t2$);}finally{__CLR4_4_13zt3ztkcq4sub5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestLeftBoundProcedure.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6083zz() throws Exception{try{__CLR4_4_13zt3ztkcq4sub5.R.inc(5183);
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5184);Procedure<Object> f = new LeftBoundProcedure<Object>(NoOp.INSTANCE, "xyzzy");
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5185);assertEquals(f, f);
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5186);assertObjectsAreEqual(f, new LeftBoundProcedure<Object>(NoOp.INSTANCE, "xyzzy"));
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5187);assertObjectsAreNotEqual(f, new NoOp());
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5188);assertObjectsAreNotEqual(f, new LeftBoundProcedure<Object>(
                new BinaryFunctionBinaryProcedure<Object, Object>(RightIdentity.FUNCTION), "xyzzy"));
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5189);assertObjectsAreNotEqual(f, new LeftBoundProcedure<Object>(NoOp.INSTANCE, "foo"));
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5190);assertObjectsAreNotEqual(f, new LeftBoundProcedure<Object>(NoOp.INSTANCE, null));
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5191);assertObjectsAreEqual(new LeftBoundProcedure<Object>(NoOp.INSTANCE, null), new LeftBoundProcedure<Object>(NoOp.INSTANCE, null));
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5192);assertTrue(!f.equals(null));
    }finally{__CLR4_4_13zt3ztkcq4sub5.R.flushNeeded();}}

    @Test
    public void testAdaptNull() throws Exception {__CLR4_4_13zt3ztkcq4sub5.R.globalSliceStart(getClass().getName(),5193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t45fwe409();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13zt3ztkcq4sub5.R.rethrow($CLV_t2$);}finally{__CLR4_4_13zt3ztkcq4sub5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestLeftBoundProcedure.testAdaptNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t45fwe409() throws Exception{try{__CLR4_4_13zt3ztkcq4sub5.R.inc(5193);
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5194);assertNull(LeftBoundProcedure.bind(null,"xyzzy"));
    }finally{__CLR4_4_13zt3ztkcq4sub5.R.flushNeeded();}}

    @Test
    public void testAdapt() throws Exception {__CLR4_4_13zt3ztkcq4sub5.R.globalSliceStart(getClass().getName(),5195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11awe8940b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13zt3ztkcq4sub5.R.rethrow($CLV_t2$);}finally{__CLR4_4_13zt3ztkcq4sub5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestLeftBoundProcedure.testAdapt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11awe8940b() throws Exception{try{__CLR4_4_13zt3ztkcq4sub5.R.inc(5195);
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5196);assertNotNull(LeftBoundProcedure.bind(new NoOp(),"xyzzy"));
        __CLR4_4_13zt3ztkcq4sub5.R.inc(5197);assertNotNull(LeftBoundProcedure.bind(new NoOp(),null));
    }finally{__CLR4_4_13zt3ztkcq4sub5.R.flushNeeded();}}
}
