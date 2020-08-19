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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestCompositePredicate extends BaseFunctorTest {static class __CLR4_4_16f06f0kcq4suzo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,8352,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_16f06f0kcq4suzo.R.inc(8316);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8317);return Composite.predicate(Constant.TRUE);
    }finally{__CLR4_4_16f06f0kcq4suzo.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testTest() throws Exception {__CLR4_4_16f06f0kcq4suzo.R.globalSliceStart(getClass().getName(),8318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj6f2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f06f0kcq4suzo.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f06f0kcq4suzo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestCompositePredicate.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj6f2() throws Exception{try{__CLR4_4_16f06f0kcq4suzo.R.inc(8318);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8319);assertTrue(Composite.predicate(Constant.TRUE).test(null));
        __CLR4_4_16f06f0kcq4suzo.R.inc(8320);assertTrue(Composite.predicate(Constant.TRUE, Constant.of(3)).test("xyzzy"));
        __CLR4_4_16f06f0kcq4suzo.R.inc(8321);assertFalse(Composite.predicate(Constant.FALSE, Constant.of(4)).test("xyzzy"));
    }finally{__CLR4_4_16f06f0kcq4suzo.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testNullNotAllowed() throws Exception {__CLR4_4_16f06f0kcq4suzo.R.globalSliceStart(getClass().getName(),8322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jzb0uj6f6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,78,111,116,65,108,108,111,119,101,100,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f06f0kcq4suzo.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f06f0kcq4suzo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestCompositePredicate.testNullNotAllowed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jzb0uj6f6() throws Exception{try{__CLR4_4_16f06f0kcq4suzo.R.inc(8322);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8323);new CompositePredicate<Object>(null);
    }finally{__CLR4_4_16f06f0kcq4suzo.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testNullNotAllowed2() throws Exception {__CLR4_4_16f06f0kcq4suzo.R.globalSliceStart(getClass().getName(),8324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d51v96f8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,78,111,116,65,108,108,111,119,101,100,50,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f06f0kcq4suzo.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f06f0kcq4suzo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestCompositePredicate.testNullNotAllowed2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d51v96f8() throws Exception{try{__CLR4_4_16f06f0kcq4suzo.R.inc(8324);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8325);Composite.function(Constant.TRUE, null);
    }finally{__CLR4_4_16f06f0kcq4suzo.R.flushNeeded();}}

    @Test
    public void testOf() throws Exception {__CLR4_4_16f06f0kcq4suzo.R.globalSliceStart(getClass().getName(),8326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w0oi7k6fa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f06f0kcq4suzo.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f06f0kcq4suzo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestCompositePredicate.testOf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w0oi7k6fa() throws Exception{try{__CLR4_4_16f06f0kcq4suzo.R.inc(8326);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8327);CompositePredicate<Object> f = new CompositePredicate<Object>(Constant.TRUE);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8328);assertTrue(f.test(null));
        __CLR4_4_16f06f0kcq4suzo.R.inc(8329);for (int i=0;(((i<10)&&(__CLR4_4_16f06f0kcq4suzo.R.iget(8330)!=0|true))||(__CLR4_4_16f06f0kcq4suzo.R.iget(8331)==0&false));i++) {{
            __CLR4_4_16f06f0kcq4suzo.R.inc(8332);f = f.of(Constant.FALSE);
            __CLR4_4_16f06f0kcq4suzo.R.inc(8333);assertTrue(f.test(null));
        }
    }}finally{__CLR4_4_16f06f0kcq4suzo.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_16f06f0kcq4suzo.R.globalSliceStart(getClass().getName(),8334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6086fi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f06f0kcq4suzo.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f06f0kcq4suzo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestCompositePredicate.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6086fi() throws Exception{try{__CLR4_4_16f06f0kcq4suzo.R.inc(8334);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8335);CompositePredicate<Object> f = new CompositePredicate<Object>(Constant.TRUE);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8336);assertEquals(f,f);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8337);CompositePredicate<Object> g = new CompositePredicate<Object>(Constant.TRUE);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8338);assertObjectsAreEqual(f,g);

        __CLR4_4_16f06f0kcq4suzo.R.inc(8339);for (int i=0;(((i<3)&&(__CLR4_4_16f06f0kcq4suzo.R.iget(8340)!=0|true))||(__CLR4_4_16f06f0kcq4suzo.R.iget(8341)==0&false));i++) {{
            __CLR4_4_16f06f0kcq4suzo.R.inc(8342);f = f.of(Constant.of("x"));
            __CLR4_4_16f06f0kcq4suzo.R.inc(8343);assertObjectsAreNotEqual(f,g);
            __CLR4_4_16f06f0kcq4suzo.R.inc(8344);g = g.of(Constant.of("x"));
            __CLR4_4_16f06f0kcq4suzo.R.inc(8345);assertObjectsAreEqual(f,g);
            __CLR4_4_16f06f0kcq4suzo.R.inc(8346);f = f.of(Constant.of("y")).of(Constant.of("z"));
            __CLR4_4_16f06f0kcq4suzo.R.inc(8347);assertObjectsAreNotEqual(f,g);
            __CLR4_4_16f06f0kcq4suzo.R.inc(8348);g = g.of(Constant.of("y")).of(Constant.of("z"));
            __CLR4_4_16f06f0kcq4suzo.R.inc(8349);assertObjectsAreEqual(f,g);
        }

        }__CLR4_4_16f06f0kcq4suzo.R.inc(8350);assertObjectsAreNotEqual(f,Constant.FALSE);
        __CLR4_4_16f06f0kcq4suzo.R.inc(8351);assertTrue(!f.equals(null));
    }finally{__CLR4_4_16f06f0kcq4suzo.R.flushNeeded();}}

}
