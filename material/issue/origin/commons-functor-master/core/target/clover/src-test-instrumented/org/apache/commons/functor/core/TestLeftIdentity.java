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
package org.apache.commons.functor.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.BinaryPredicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestLeftIdentity extends BaseFunctorTest {static class __CLR4_4_154c54ckcq4suky{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,6665,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_154c54ckcq4suky.R.inc(6636);
        __CLR4_4_154c54ckcq4suky.R.inc(6637);return LeftIdentity.FUNCTION;
    }finally{__CLR4_4_154c54ckcq4suky.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testJavabeanConstructor() {__CLR4_4_154c54ckcq4suky.R.globalSliceStart(getClass().getName(),6638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eky74z54e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154c54ckcq4suky.R.rethrow($CLV_t2$);}finally{__CLR4_4_154c54ckcq4suky.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLeftIdentity.testJavabeanConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eky74z54e(){try{__CLR4_4_154c54ckcq4suky.R.inc(6638);
        __CLR4_4_154c54ckcq4suky.R.inc(6639);assertNotNull(new LeftIdentity()); // Public constructor for JavaBean
    }finally{__CLR4_4_154c54ckcq4suky.R.flushNeeded();}}

    @Test
    public void testEvaluate() throws Exception {__CLR4_4_154c54ckcq4suky.R.globalSliceStart(getClass().getName(),6640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czkatq54g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154c54ckcq4suky.R.rethrow($CLV_t2$);}finally{__CLR4_4_154c54ckcq4suky.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLeftIdentity.testEvaluate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czkatq54g() throws Exception{try{__CLR4_4_154c54ckcq4suky.R.inc(6640);
        __CLR4_4_154c54ckcq4suky.R.inc(6641);BinaryFunction<Object, Object, Object> f = LeftIdentity.FUNCTION;
        __CLR4_4_154c54ckcq4suky.R.inc(6642);assertNull(f.evaluate(null,null));
        __CLR4_4_154c54ckcq4suky.R.inc(6643);assertNull(f.evaluate(null,"xyzzy"));
        __CLR4_4_154c54ckcq4suky.R.inc(6644);assertEquals("xyzzy",f.evaluate("xyzzy","abcdefg"));
        __CLR4_4_154c54ckcq4suky.R.inc(6645);assertEquals("xyzzy",f.evaluate("xyzzy",null));
        __CLR4_4_154c54ckcq4suky.R.inc(6646);assertEquals(Integer.valueOf(3),f.evaluate(Integer.valueOf(3),null));
        __CLR4_4_154c54ckcq4suky.R.inc(6647);Object obj = Long.valueOf(12345L);
        __CLR4_4_154c54ckcq4suky.R.inc(6648);assertSame(obj,f.evaluate(obj,null));
        __CLR4_4_154c54ckcq4suky.R.inc(6649);assertSame(obj,f.evaluate(obj,obj));
    }finally{__CLR4_4_154c54ckcq4suky.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testTest() throws Exception {__CLR4_4_154c54ckcq4suky.R.globalSliceStart(getClass().getName(),6650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj54q();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,101,115,116,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154c54ckcq4suky.R.rethrow($CLV_t2$);}finally{__CLR4_4_154c54ckcq4suky.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLeftIdentity.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj54q() throws Exception{try{__CLR4_4_154c54ckcq4suky.R.inc(6650);
        __CLR4_4_154c54ckcq4suky.R.inc(6651);BinaryPredicate<Boolean, Object> p = LeftIdentity.PREDICATE;
        __CLR4_4_154c54ckcq4suky.R.inc(6652);assertTrue(p.test(Boolean.TRUE,null));
        __CLR4_4_154c54ckcq4suky.R.inc(6653);assertTrue(!p.test(Boolean.FALSE,null));
        __CLR4_4_154c54ckcq4suky.R.inc(6654);p.test(null, null);
    }finally{__CLR4_4_154c54ckcq4suky.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_154c54ckcq4suky.R.globalSliceStart(getClass().getName(),6655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60854v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154c54ckcq4suky.R.rethrow($CLV_t2$);}finally{__CLR4_4_154c54ckcq4suky.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLeftIdentity.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60854v() throws Exception{try{__CLR4_4_154c54ckcq4suky.R.inc(6655);
        __CLR4_4_154c54ckcq4suky.R.inc(6656);BinaryFunction<Object, Object, Object> f = LeftIdentity.<Object, Object>function();
        __CLR4_4_154c54ckcq4suky.R.inc(6657);assertEquals(f,f);
        __CLR4_4_154c54ckcq4suky.R.inc(6658);assertObjectsAreEqual(f,LeftIdentity.FUNCTION);
        __CLR4_4_154c54ckcq4suky.R.inc(6659);assertObjectsAreEqual(f,LeftIdentity.FUNCTION);
        __CLR4_4_154c54ckcq4suky.R.inc(6660);assertObjectsAreNotEqual(f,RightIdentity.FUNCTION);
        __CLR4_4_154c54ckcq4suky.R.inc(6661);assertObjectsAreNotEqual(f,Constant.of("abcde"));
        __CLR4_4_154c54ckcq4suky.R.inc(6662);assertObjectsAreNotEqual(f,Constant.of(Boolean.TRUE));
    }finally{__CLR4_4_154c54ckcq4suky.R.flushNeeded();}}

    @Test
    public void testConstant() throws Exception {__CLR4_4_154c54ckcq4suky.R.globalSliceStart(getClass().getName(),6663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1159o9v553();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154c54ckcq4suky.R.rethrow($CLV_t2$);}finally{__CLR4_4_154c54ckcq4suky.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLeftIdentity.testConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1159o9v553() throws Exception{try{__CLR4_4_154c54ckcq4suky.R.inc(6663);
        __CLR4_4_154c54ckcq4suky.R.inc(6664);assertEquals(LeftIdentity.function(),LeftIdentity.function());
    }finally{__CLR4_4_154c54ckcq4suky.R.flushNeeded();}}
}
