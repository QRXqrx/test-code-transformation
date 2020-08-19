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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Predicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIsNotSame extends BaseFunctorTest {static class __CLR4_4_1524524kcq4sujo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,6586,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_1524524kcq4sujo.R.inc(6556);
        __CLR4_4_1524524kcq4sujo.R.inc(6557);return new IsNotSame<Object, Object>();
    }finally{__CLR4_4_1524524kcq4sujo.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testTest() throws Exception {__CLR4_4_1524524kcq4sujo.R.globalSliceStart(getClass().getName(),6558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj526();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1524524kcq4sujo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1524524kcq4sujo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestIsNotSame.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj526() throws Exception{try{__CLR4_4_1524524kcq4sujo.R.inc(6558);
        __CLR4_4_1524524kcq4sujo.R.inc(6559);IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        __CLR4_4_1524524kcq4sujo.R.inc(6560);assertFalse("For symmetry, two nulls should be same", p.test(null, null));
        __CLR4_4_1524524kcq4sujo.R.inc(6561);assertFalse(p.test("foo", "foo"));
        __CLR4_4_1524524kcq4sujo.R.inc(6562);assertTrue(p.test(null, "foo"));
        __CLR4_4_1524524kcq4sujo.R.inc(6563);assertTrue(p.test("foo", null));
        __CLR4_4_1524524kcq4sujo.R.inc(6564);assertTrue(p.test(new Integer(3), Integer.valueOf(3)));
        __CLR4_4_1524524kcq4sujo.R.inc(6565);assertTrue(p.test(null, Integer.valueOf(3)));
        __CLR4_4_1524524kcq4sujo.R.inc(6566);assertTrue(p.test(Integer.valueOf(3), null));

        __CLR4_4_1524524kcq4sujo.R.inc(6567);assertTrue(p.test(Integer.valueOf(3), Integer.valueOf(4)));
        __CLR4_4_1524524kcq4sujo.R.inc(6568);assertTrue(p.test(Integer.valueOf(4), Integer.valueOf(3)));
        __CLR4_4_1524524kcq4sujo.R.inc(6569);assertTrue(p.test("3", Integer.valueOf(3)));
        __CLR4_4_1524524kcq4sujo.R.inc(6570);assertTrue(p.test(Integer.valueOf(3), "3"));
    }finally{__CLR4_4_1524524kcq4sujo.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_1524524kcq4sujo.R.globalSliceStart(getClass().getName(),6571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60852j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1524524kcq4sujo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1524524kcq4sujo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestIsNotSame.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60852j() throws Exception{try{__CLR4_4_1524524kcq4sujo.R.inc(6571);
        __CLR4_4_1524524kcq4sujo.R.inc(6572);BinaryPredicate<Object, Object> f = new IsNotSame<Object, Object>();
        __CLR4_4_1524524kcq4sujo.R.inc(6573);assertEquals(f, f);

        __CLR4_4_1524524kcq4sujo.R.inc(6574);assertObjectsAreEqual(f, new IsNotSame<Object, Object>());
        __CLR4_4_1524524kcq4sujo.R.inc(6575);assertObjectsAreEqual(f, IsNotSame.instance());
        __CLR4_4_1524524kcq4sujo.R.inc(6576);assertObjectsAreNotEqual(f, Constant.truePredicate());
    }finally{__CLR4_4_1524524kcq4sujo.R.flushNeeded();}}

    @Test
    public void testConstant() throws Exception {__CLR4_4_1524524kcq4sujo.R.globalSliceStart(getClass().getName(),6577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1159o9v52p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1524524kcq4sujo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1524524kcq4sujo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestIsNotSame.testConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1159o9v52p() throws Exception{try{__CLR4_4_1524524kcq4sujo.R.inc(6577);
        __CLR4_4_1524524kcq4sujo.R.inc(6578);assertEquals(IsNotSame.instance(), IsNotSame.instance());
        __CLR4_4_1524524kcq4sujo.R.inc(6579);assertNotSame(IsNotSame.instance(), IsNotSame.instance());
        __CLR4_4_1524524kcq4sujo.R.inc(6580);assertSame(IsNotSame.INSTANCE, IsNotSame.INSTANCE);
    }finally{__CLR4_4_1524524kcq4sujo.R.flushNeeded();}}

    @Test
    public void testAsPredicate() {__CLR4_4_1524524kcq4sujo.R.globalSliceStart(getClass().getName(),6581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loyemy52t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1524524kcq4sujo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1524524kcq4sujo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestIsNotSame.testAsPredicate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loyemy52t(){try{__CLR4_4_1524524kcq4sujo.R.inc(6581);
        __CLR4_4_1524524kcq4sujo.R.inc(6582);Integer one = Integer.valueOf(1);
        __CLR4_4_1524524kcq4sujo.R.inc(6583);Predicate<Integer> isNotSame = IsNotSame.as(one);
        __CLR4_4_1524524kcq4sujo.R.inc(6584);assertTrue(isNotSame.test(Integer.valueOf(2)));
        __CLR4_4_1524524kcq4sujo.R.inc(6585);assertFalse(isNotSame.test(one));
    }finally{__CLR4_4_1524524kcq4sujo.R.flushNeeded();}}
}
