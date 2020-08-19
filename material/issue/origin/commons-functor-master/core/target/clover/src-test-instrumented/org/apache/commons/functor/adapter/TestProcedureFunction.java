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
import org.apache.commons.functor.Function;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.NoOp;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestProcedureFunction extends BaseFunctorTest {static class __CLR4_4_1443443kcq4sucj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,5349,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_1443443kcq4sucj.R.inc(5331);
        __CLR4_4_1443443kcq4sucj.R.inc(5332);return new ProcedureFunction<Object, Object>(NoOp.INSTANCE);
    }finally{__CLR4_4_1443443kcq4sucj.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testEvaluate() throws Exception {__CLR4_4_1443443kcq4sucj.R.globalSliceStart(getClass().getName(),5333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czkatq445();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1443443kcq4sucj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1443443kcq4sucj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestProcedureFunction.testEvaluate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czkatq445() throws Exception{try{__CLR4_4_1443443kcq4sucj.R.inc(5333);
        __CLR4_4_1443443kcq4sucj.R.inc(5334);Function<Object, Object> f = new ProcedureFunction<Object, Object>(NoOp.INSTANCE);
        __CLR4_4_1443443kcq4sucj.R.inc(5335);assertNull(f.evaluate(null));
    }finally{__CLR4_4_1443443kcq4sucj.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_1443443kcq4sucj.R.globalSliceStart(getClass().getName(),5336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e608448();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1443443kcq4sucj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1443443kcq4sucj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestProcedureFunction.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e608448() throws Exception{try{__CLR4_4_1443443kcq4sucj.R.inc(5336);
        __CLR4_4_1443443kcq4sucj.R.inc(5337);Function<Object, Object> f = new ProcedureFunction<Object, Object>(NoOp.INSTANCE);
        __CLR4_4_1443443kcq4sucj.R.inc(5338);assertEquals(f,f);
        __CLR4_4_1443443kcq4sucj.R.inc(5339);assertObjectsAreEqual(f,new ProcedureFunction<Object, Object>(NoOp.INSTANCE));
        __CLR4_4_1443443kcq4sucj.R.inc(5340);assertObjectsAreNotEqual(f,Constant.of("x"));
        __CLR4_4_1443443kcq4sucj.R.inc(5341);assertObjectsAreNotEqual(f, new ProcedureFunction<Object, Object>(new Procedure<Object>() {
            public void run(Object a) {try{__CLR4_4_1443443kcq4sucj.R.inc(5342);
            }finally{__CLR4_4_1443443kcq4sucj.R.flushNeeded();}}
        }));
        __CLR4_4_1443443kcq4sucj.R.inc(5343);assertObjectsAreNotEqual(f,Constant.of(null));
        __CLR4_4_1443443kcq4sucj.R.inc(5344);assertTrue(!f.equals(null));
    }finally{__CLR4_4_1443443kcq4sucj.R.flushNeeded();}}

    @Test
    public void testAdaptNull() throws Exception {__CLR4_4_1443443kcq4sucj.R.globalSliceStart(getClass().getName(),5345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t45fwe44h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1443443kcq4sucj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1443443kcq4sucj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestProcedureFunction.testAdaptNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t45fwe44h() throws Exception{try{__CLR4_4_1443443kcq4sucj.R.inc(5345);
        __CLR4_4_1443443kcq4sucj.R.inc(5346);assertNull(ProcedureFunction.adapt(null));
    }finally{__CLR4_4_1443443kcq4sucj.R.flushNeeded();}}

    @Test
    public void testAdapt() throws Exception {__CLR4_4_1443443kcq4sucj.R.globalSliceStart(getClass().getName(),5347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11awe8944j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1443443kcq4sucj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1443443kcq4sucj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.adapter.TestProcedureFunction.testAdapt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11awe8944j() throws Exception{try{__CLR4_4_1443443kcq4sucj.R.inc(5347);
        __CLR4_4_1443443kcq4sucj.R.inc(5348);assertNotNull(ProcedureFunction.adapt(new NoOp()));
    }finally{__CLR4_4_1443443kcq4sucj.R.flushNeeded();}}
}
