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
import static org.junit.Assert.assertTrue;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.Identity;
import org.apache.commons.functor.core.NoOp;
import org.junit.Test;

/**
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestCompositeProcedure extends BaseFunctorTest {static class __CLR4_4_16g06g0kcq4suzu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,8380,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_16g06g0kcq4suzu.R.inc(8352);
        __CLR4_4_16g06g0kcq4suzu.R.inc(8353);return Composite.procedure(NoOp.instance(), Constant.TRUE);
    }finally{__CLR4_4_16g06g0kcq4suzu.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testRun() throws Exception {__CLR4_4_16g06g0kcq4suzu.R.globalSliceStart(getClass().getName(),8354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzvxa86g2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16g06g0kcq4suzu.R.rethrow($CLV_t2$);}finally{__CLR4_4_16g06g0kcq4suzu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestCompositeProcedure.testRun",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzvxa86g2() throws Exception{try{__CLR4_4_16g06g0kcq4suzu.R.inc(8354);
        __CLR4_4_16g06g0kcq4suzu.R.inc(8355);Composite.procedure(NoOp.instance(), Identity.instance()).run(null);
    }finally{__CLR4_4_16g06g0kcq4suzu.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testNulProcedureNotAllowed() throws Exception {__CLR4_4_16g06g0kcq4suzu.R.globalSliceStart(getClass().getName(),8356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wuytng6g4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,80,114,111,99,101,100,117,114,101,78,111,116,65,108,108,111,119,101,100,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16g06g0kcq4suzu.R.rethrow($CLV_t2$);}finally{__CLR4_4_16g06g0kcq4suzu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestCompositeProcedure.testNulProcedureNotAllowed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wuytng6g4() throws Exception{try{__CLR4_4_16g06g0kcq4suzu.R.inc(8356);
        __CLR4_4_16g06g0kcq4suzu.R.inc(8357);new CompositeProcedure<Object>(null);
    }finally{__CLR4_4_16g06g0kcq4suzu.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testNullProcedureNotAllowed2() throws Exception {__CLR4_4_16g06g0kcq4suzu.R.globalSliceStart(getClass().getName(),8358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oo1k0m6g6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,80,114,111,99,101,100,117,114,101,78,111,116,65,108,108,111,119,101,100,50,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16g06g0kcq4suzu.R.rethrow($CLV_t2$);}finally{__CLR4_4_16g06g0kcq4suzu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestCompositeProcedure.testNullProcedureNotAllowed2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oo1k0m6g6() throws Exception{try{__CLR4_4_16g06g0kcq4suzu.R.inc(8358);
        __CLR4_4_16g06g0kcq4suzu.R.inc(8359);new CompositeProcedure<Object>(NoOp.instance()).of(null);
    }finally{__CLR4_4_16g06g0kcq4suzu.R.flushNeeded();}}

    @Test
    public void testOf() throws Exception {__CLR4_4_16g06g0kcq4suzu.R.globalSliceStart(getClass().getName(),8360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0oi7k6g8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16g06g0kcq4suzu.R.rethrow($CLV_t2$);}finally{__CLR4_4_16g06g0kcq4suzu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestCompositeProcedure.testOf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0oi7k6g8() throws Exception{try{__CLR4_4_16g06g0kcq4suzu.R.inc(8360);
        __CLR4_4_16g06g0kcq4suzu.R.inc(8361);Composite.procedure(NoOp.instance()).of(Identity.instance()).run(null);
    }finally{__CLR4_4_16g06g0kcq4suzu.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_16g06g0kcq4suzu.R.globalSliceStart(getClass().getName(),8362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6086ga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16g06g0kcq4suzu.R.rethrow($CLV_t2$);}finally{__CLR4_4_16g06g0kcq4suzu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestCompositeProcedure.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6086ga() throws Exception{try{__CLR4_4_16g06g0kcq4suzu.R.inc(8362);
        __CLR4_4_16g06g0kcq4suzu.R.inc(8363);CompositeProcedure<Object> f = Composite.procedure(NoOp.instance());
        __CLR4_4_16g06g0kcq4suzu.R.inc(8364);assertEquals(f,f);
        __CLR4_4_16g06g0kcq4suzu.R.inc(8365);CompositeProcedure<Object> g = Composite.procedure(NoOp.instance());
        __CLR4_4_16g06g0kcq4suzu.R.inc(8366);assertObjectsAreEqual(f,g);

        __CLR4_4_16g06g0kcq4suzu.R.inc(8367);for (int i=0;(((i<3)&&(__CLR4_4_16g06g0kcq4suzu.R.iget(8368)!=0|true))||(__CLR4_4_16g06g0kcq4suzu.R.iget(8369)==0&false));i++) {{
            __CLR4_4_16g06g0kcq4suzu.R.inc(8370);f = f.of(Constant.of("x"));
            __CLR4_4_16g06g0kcq4suzu.R.inc(8371);assertObjectsAreNotEqual(f,g);
            __CLR4_4_16g06g0kcq4suzu.R.inc(8372);g = g.of(Constant.of("x"));
            __CLR4_4_16g06g0kcq4suzu.R.inc(8373);assertObjectsAreEqual(f,g);
            __CLR4_4_16g06g0kcq4suzu.R.inc(8374);f = f.of(Constant.of("y")).of(Constant.of("z"));
            __CLR4_4_16g06g0kcq4suzu.R.inc(8375);assertObjectsAreNotEqual(f,g);
            __CLR4_4_16g06g0kcq4suzu.R.inc(8376);g = g.of(Constant.of("y")).of(Constant.of("z"));
            __CLR4_4_16g06g0kcq4suzu.R.inc(8377);assertObjectsAreEqual(f,g);
        }

        }__CLR4_4_16g06g0kcq4suzu.R.inc(8378);assertObjectsAreNotEqual(f,Constant.FALSE);
        __CLR4_4_16g06g0kcq4suzu.R.inc(8379);assertTrue(!f.equals(null));
    }finally{__CLR4_4_16g06g0kcq4suzu.R.flushNeeded();}}

}
