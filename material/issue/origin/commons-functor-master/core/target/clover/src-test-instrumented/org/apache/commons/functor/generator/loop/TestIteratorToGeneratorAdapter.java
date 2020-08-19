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
package org.apache.commons.functor.generator.loop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Iterator to Generator Adapter class.
 * @version $Revision: 1363514 $ $Date: 2012-07-19 17:13:49 -0300 (Thu, 19 Jul 2012) $
 */
@SuppressWarnings("unchecked")
public class TestIteratorToGeneratorAdapter extends BaseFunctorTest {static class __CLR4_4_1894894kcq4svnv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10724,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public Object makeFunctor() {try{__CLR4_4_1894894kcq4svnv.R.inc(10696);
        __CLR4_4_1894894kcq4svnv.R.inc(10697);List<String> list = new ArrayList<String>();
        __CLR4_4_1894894kcq4svnv.R.inc(10698);list.add("1");
        __CLR4_4_1894894kcq4svnv.R.inc(10699);return new IteratorToGeneratorAdapter<String>(list.iterator());
    }finally{__CLR4_4_1894894kcq4svnv.R.flushNeeded();}}

    // Lifecycle
    // ------------------------------------------------------------------------

    private List<String> list = null;

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1894894kcq4svnv.R.inc(10700);
        __CLR4_4_1894894kcq4svnv.R.inc(10701);list = new ArrayList<String>();
        __CLR4_4_1894894kcq4svnv.R.inc(10702);list.add("1");
        __CLR4_4_1894894kcq4svnv.R.inc(10703);list.add("two");
        __CLR4_4_1894894kcq4svnv.R.inc(10704);list.add("c");
    }finally{__CLR4_4_1894894kcq4svnv.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1894894kcq4svnv.R.inc(10705);
        __CLR4_4_1894894kcq4svnv.R.inc(10706);list = null;
    }finally{__CLR4_4_1894894kcq4svnv.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testAdaptNull() {__CLR4_4_1894894kcq4svnv.R.globalSliceStart(getClass().getName(),10707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t45fwe89f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1894894kcq4svnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1894894kcq4svnv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestIteratorToGeneratorAdapter.testAdaptNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t45fwe89f(){try{__CLR4_4_1894894kcq4svnv.R.inc(10707);
        __CLR4_4_1894894kcq4svnv.R.inc(10708);assertNull(IteratorToGeneratorAdapter.adapt((Iterator<?>) null));
    }finally{__CLR4_4_1894894kcq4svnv.R.flushNeeded();}}

    @Test
    public void testAdaptNonNull() {__CLR4_4_1894894kcq4svnv.R.globalSliceStart(getClass().getName(),10709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qu73md89h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1894894kcq4svnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1894894kcq4svnv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestIteratorToGeneratorAdapter.testAdaptNonNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qu73md89h(){try{__CLR4_4_1894894kcq4svnv.R.inc(10709);
        __CLR4_4_1894894kcq4svnv.R.inc(10710);assertNotNull(IteratorToGeneratorAdapter.adapt(list.iterator()));
    }finally{__CLR4_4_1894894kcq4svnv.R.flushNeeded();}}

    @Test
    public void testGenerate() {__CLR4_4_1894894kcq4svnv.R.globalSliceStart(getClass().getName(),10711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8ovhu89j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1894894kcq4svnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1894894kcq4svnv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestIteratorToGeneratorAdapter.testGenerate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8ovhu89j(){try{__CLR4_4_1894894kcq4svnv.R.inc(10711);
        __CLR4_4_1894894kcq4svnv.R.inc(10712);Iterator<String> iter = list.iterator();
        __CLR4_4_1894894kcq4svnv.R.inc(10713);Generator<String> gen = new IteratorToGeneratorAdapter<String>(iter);
        __CLR4_4_1894894kcq4svnv.R.inc(10714);List<String> list2 = new ArrayList<String>();
        __CLR4_4_1894894kcq4svnv.R.inc(10715);list2.addAll((Collection<String>)gen.toCollection());
        __CLR4_4_1894894kcq4svnv.R.inc(10716);assertEquals(list,list2);
    }finally{__CLR4_4_1894894kcq4svnv.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testConstructNull() {__CLR4_4_1894894kcq4svnv.R.globalSliceStart(getClass().getName(),10717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5zsml89p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1894894kcq4svnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1894894kcq4svnv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestIteratorToGeneratorAdapter.testConstructNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5zsml89p(){try{__CLR4_4_1894894kcq4svnv.R.inc(10717);
        __CLR4_4_1894894kcq4svnv.R.inc(10718);new IteratorToGeneratorAdapter<Object>(null);
    }finally{__CLR4_4_1894894kcq4svnv.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_1894894kcq4svnv.R.globalSliceStart(getClass().getName(),10719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60889r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1894894kcq4svnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1894894kcq4svnv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestIteratorToGeneratorAdapter.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60889r(){try{__CLR4_4_1894894kcq4svnv.R.inc(10719);
        __CLR4_4_1894894kcq4svnv.R.inc(10720);Iterator<String> iter = list.iterator();
        __CLR4_4_1894894kcq4svnv.R.inc(10721);Generator<String> gen = new IteratorToGeneratorAdapter<String>(iter);
        __CLR4_4_1894894kcq4svnv.R.inc(10722);assertObjectsAreEqual(gen,gen);
        __CLR4_4_1894894kcq4svnv.R.inc(10723);assertObjectsAreEqual(gen,new IteratorToGeneratorAdapter<String>(iter));
    }finally{__CLR4_4_1894894kcq4svnv.R.flushNeeded();}}
}