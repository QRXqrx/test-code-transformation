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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.Predicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestLimit extends BaseFunctorTest {static class __CLR4_4_1555555kcq4sul9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,6704,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_1555555kcq4sul9.R.inc(6665);
        __CLR4_4_1555555kcq4sul9.R.inc(6666);return new Limit(3);
    }finally{__CLR4_4_1555555kcq4sul9.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testZero() throws Exception {__CLR4_4_1555555kcq4sul9.R.globalSliceStart(getClass().getName(),6667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqj5i7557();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1555555kcq4sul9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1555555kcq4sul9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLimit.testZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqj5i7557() throws Exception{try{__CLR4_4_1555555kcq4sul9.R.inc(6667);
        __CLR4_4_1555555kcq4sul9.R.inc(6668);NullaryPredicate p = new Limit(0);
        __CLR4_4_1555555kcq4sul9.R.inc(6669);assertTrue(! p.test());
        __CLR4_4_1555555kcq4sul9.R.inc(6670);assertTrue(! p.test());
        __CLR4_4_1555555kcq4sul9.R.inc(6671);assertTrue(! p.test());
    }finally{__CLR4_4_1555555kcq4sul9.R.flushNeeded();}}

    @Test
    public void testBadArgs() throws Exception {__CLR4_4_1555555kcq4sul9.R.globalSliceStart(getClass().getName(),6672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ceflqv55c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1555555kcq4sul9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1555555kcq4sul9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLimit.testBadArgs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ceflqv55c() throws Exception{try{__CLR4_4_1555555kcq4sul9.R.inc(6672);
        __CLR4_4_1555555kcq4sul9.R.inc(6673);try {
            __CLR4_4_1555555kcq4sul9.R.inc(6674);new Limit(-1);
            __CLR4_4_1555555kcq4sul9.R.inc(6675);fail("Expected IllegalArgumentException");
        } catch(IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_1555555kcq4sul9.R.flushNeeded();}}

    @Test
    public void testTestNullary() throws Exception {__CLR4_4_1555555kcq4sul9.R.globalSliceStart(getClass().getName(),6676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ebdqv855g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1555555kcq4sul9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1555555kcq4sul9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLimit.testTestNullary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ebdqv855g() throws Exception{try{__CLR4_4_1555555kcq4sul9.R.inc(6676);
        __CLR4_4_1555555kcq4sul9.R.inc(6677);NullaryPredicate p = new Limit(3);
        __CLR4_4_1555555kcq4sul9.R.inc(6678);assertTrue(p.test());
        __CLR4_4_1555555kcq4sul9.R.inc(6679);assertTrue(p.test());
        __CLR4_4_1555555kcq4sul9.R.inc(6680);assertTrue(p.test());
        __CLR4_4_1555555kcq4sul9.R.inc(6681);assertTrue(! p.test());
    }finally{__CLR4_4_1555555kcq4sul9.R.flushNeeded();}}

    @Test
    public void testTestUnary() throws Exception {__CLR4_4_1555555kcq4sul9.R.globalSliceStart(getClass().getName(),6682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yeuzhu55m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1555555kcq4sul9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1555555kcq4sul9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLimit.testTestUnary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yeuzhu55m() throws Exception{try{__CLR4_4_1555555kcq4sul9.R.inc(6682);
        __CLR4_4_1555555kcq4sul9.R.inc(6683);Predicate<Object> p = new Limit(3);
        __CLR4_4_1555555kcq4sul9.R.inc(6684);assertTrue(p.test(null));
        __CLR4_4_1555555kcq4sul9.R.inc(6685);assertTrue(p.test(null));
        __CLR4_4_1555555kcq4sul9.R.inc(6686);assertTrue(p.test(null));
        __CLR4_4_1555555kcq4sul9.R.inc(6687);assertTrue(! p.test(null));
    }finally{__CLR4_4_1555555kcq4sul9.R.flushNeeded();}}

    @Test
    public void testTestBinary() throws Exception {__CLR4_4_1555555kcq4sul9.R.globalSliceStart(getClass().getName(),6688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tvgumk55s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1555555kcq4sul9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1555555kcq4sul9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLimit.testTestBinary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tvgumk55s() throws Exception{try{__CLR4_4_1555555kcq4sul9.R.inc(6688);
        __CLR4_4_1555555kcq4sul9.R.inc(6689);BinaryPredicate<Object, Object> p = new Limit(3);
        __CLR4_4_1555555kcq4sul9.R.inc(6690);assertTrue(p.test(null,null));
        __CLR4_4_1555555kcq4sul9.R.inc(6691);assertTrue(p.test(null,null));
        __CLR4_4_1555555kcq4sul9.R.inc(6692);assertTrue(p.test(null,null));
        __CLR4_4_1555555kcq4sul9.R.inc(6693);assertTrue(! p.test(null,null));
    }finally{__CLR4_4_1555555kcq4sul9.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_1555555kcq4sul9.R.globalSliceStart(getClass().getName(),6694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60855y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1555555kcq4sul9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1555555kcq4sul9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLimit.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60855y(){try{__CLR4_4_1555555kcq4sul9.R.inc(6694);
        __CLR4_4_1555555kcq4sul9.R.inc(6695);Limit limit = new Limit(1);
        __CLR4_4_1555555kcq4sul9.R.inc(6696);assertObjectsAreEqual(new Limit(1), limit);
        __CLR4_4_1555555kcq4sul9.R.inc(6697);assertObjectsAreNotEqual(new Limit(2), limit);
        __CLR4_4_1555555kcq4sul9.R.inc(6698);assertTrue(!limit.equals(null));
    }finally{__CLR4_4_1555555kcq4sul9.R.flushNeeded();}}

    @Test
    public void testLimits() {__CLR4_4_1555555kcq4sul9.R.globalSliceStart(getClass().getName(),6699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnl1gv563();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1555555kcq4sul9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1555555kcq4sul9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.TestLimit.testLimits",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnl1gv563(){try{__CLR4_4_1555555kcq4sul9.R.inc(6699);
        __CLR4_4_1555555kcq4sul9.R.inc(6700);Limit limit = new Limit(1);
        __CLR4_4_1555555kcq4sul9.R.inc(6701);assertEquals(Limit.of(1), limit);
        
        __CLR4_4_1555555kcq4sul9.R.inc(6702);assertObjectsAreEqual(Limit.of(1), limit);
        __CLR4_4_1555555kcq4sul9.R.inc(6703);assertObjectsAreNotEqual(Limit.of(3), limit);
    }finally{__CLR4_4_1555555kcq4sul9.R.flushNeeded();}}
}
