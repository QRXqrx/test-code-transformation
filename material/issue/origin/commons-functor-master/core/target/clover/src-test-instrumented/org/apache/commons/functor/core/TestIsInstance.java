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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Predicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIsInstance extends BaseFunctorTest {static class __CLR4_4_1503503kcq4suj0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,6514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_1503503kcq4suj0.R.inc(6483);
        __CLR4_4_1503503kcq4suj0.R.inc(6484);return IsInstance.of(String.class);
    }finally{__CLR4_4_1503503kcq4suj0.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testTest() throws Exception {__CLR4_4_1503503kcq4suj0.R.globalSliceStart(getClass().getName(),6485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj505();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1503503kcq4suj0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1503503kcq4suj0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestIsInstance.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj505() throws Exception{try{__CLR4_4_1503503kcq4suj0.R.inc(6485);
        __CLR4_4_1503503kcq4suj0.R.inc(6486);BinaryPredicate<Object, Class<?>> p = IsInstance.INSTANCE;
        __CLR4_4_1503503kcq4suj0.R.inc(6487);assertFalse(p.test(null, Number.class));
        __CLR4_4_1503503kcq4suj0.R.inc(6488);assertFalse(p.test("foo", Number.class));
        __CLR4_4_1503503kcq4suj0.R.inc(6489);assertTrue(p.test(3, Number.class));
        __CLR4_4_1503503kcq4suj0.R.inc(6490);assertTrue(p.test(3L, Number.class));
    }finally{__CLR4_4_1503503kcq4suj0.R.flushNeeded();}}

    @Test
    public void testBoundTest() throws Exception {__CLR4_4_1503503kcq4suj0.R.globalSliceStart(getClass().getName(),6491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vffvln50b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1503503kcq4suj0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1503503kcq4suj0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestIsInstance.testBoundTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vffvln50b() throws Exception{try{__CLR4_4_1503503kcq4suj0.R.inc(6491);
        __CLR4_4_1503503kcq4suj0.R.inc(6492);Predicate<Object> p = IsInstance.of(Number.class);
        __CLR4_4_1503503kcq4suj0.R.inc(6493);assertFalse(p.test(null));
        __CLR4_4_1503503kcq4suj0.R.inc(6494);assertFalse(p.test("foo"));
        __CLR4_4_1503503kcq4suj0.R.inc(6495);assertTrue(p.test(3));
        __CLR4_4_1503503kcq4suj0.R.inc(6496);assertTrue(p.test(3L));
    }finally{__CLR4_4_1503503kcq4suj0.R.flushNeeded();}}

    @Test
    public void testInstanceOfNull() throws Exception {__CLR4_4_1503503kcq4suj0.R.globalSliceStart(getClass().getName(),6497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11pfxo450h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1503503kcq4suj0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1503503kcq4suj0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestIsInstance.testInstanceOfNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11pfxo450h() throws Exception{try{__CLR4_4_1503503kcq4suj0.R.inc(6497);
        __CLR4_4_1503503kcq4suj0.R.inc(6498);BinaryPredicate<Object, Class<?>> p = new IsInstance<Object>();
        __CLR4_4_1503503kcq4suj0.R.inc(6499);try {
            __CLR4_4_1503503kcq4suj0.R.inc(6500);p.test("foo", null);
            __CLR4_4_1503503kcq4suj0.R.inc(6501);fail("Expected NullPointerException");
        } catch(NullPointerException e) {
            // expected
        }
    }finally{__CLR4_4_1503503kcq4suj0.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_1503503kcq4suj0.R.globalSliceStart(getClass().getName(),6502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60850m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1503503kcq4suj0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1503503kcq4suj0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestIsInstance.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60850m() throws Exception{try{__CLR4_4_1503503kcq4suj0.R.inc(6502);
        __CLR4_4_1503503kcq4suj0.R.inc(6503);BinaryPredicate<Object, Class<?>> p = IsInstance.INSTANCE;
        __CLR4_4_1503503kcq4suj0.R.inc(6504);assertEquals(p, p);
        __CLR4_4_1503503kcq4suj0.R.inc(6505);assertObjectsAreEqual(p, IsInstance.instance());
        __CLR4_4_1503503kcq4suj0.R.inc(6506);assertObjectsAreNotEqual(p,Constant.truePredicate());
    }finally{__CLR4_4_1503503kcq4suj0.R.flushNeeded();}}

    @Test
    public void testBoundEquals() throws Exception {__CLR4_4_1503503kcq4suj0.R.globalSliceStart(getClass().getName(),6507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ly0dny50r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1503503kcq4suj0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1503503kcq4suj0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestIsInstance.testBoundEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ly0dny50r() throws Exception{try{__CLR4_4_1503503kcq4suj0.R.inc(6507);
        __CLR4_4_1503503kcq4suj0.R.inc(6508);Predicate<Object> p = IsInstance.of(Object.class);
        __CLR4_4_1503503kcq4suj0.R.inc(6509);assertEquals(p,p);
        __CLR4_4_1503503kcq4suj0.R.inc(6510);assertObjectsAreEqual(p,IsInstance.of(Object.class));
        __CLR4_4_1503503kcq4suj0.R.inc(6511);assertObjectsAreNotEqual(p,Constant.truePredicate());
        __CLR4_4_1503503kcq4suj0.R.inc(6512);assertObjectsAreNotEqual(p,IsInstance.of(null));
        __CLR4_4_1503503kcq4suj0.R.inc(6513);assertObjectsAreNotEqual(p,IsInstance.of(String.class));
    }finally{__CLR4_4_1503503kcq4suj0.R.flushNeeded();}}
}
