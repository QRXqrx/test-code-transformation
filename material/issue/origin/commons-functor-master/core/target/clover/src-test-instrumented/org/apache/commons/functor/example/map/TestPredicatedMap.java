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
package org.apache.commons.functor.example.map;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.commons.functor.core.IsInstance;


/**
 * @version $Revision$ $Date$
 */
public class TestPredicatedMap extends TestCase {static class __CLR4_4_1846846kcq4svm8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10549,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TestPredicatedMap(String testName) {
        super(testName);__CLR4_4_1846846kcq4svm8.R.inc(10519);try{__CLR4_4_1846846kcq4svm8.R.inc(10518);
    }finally{__CLR4_4_1846846kcq4svm8.R.flushNeeded();}}

    public static Test suite() {try{__CLR4_4_1846846kcq4svm8.R.inc(10520);
        __CLR4_4_1846846kcq4svm8.R.inc(10521);return new TestSuite(TestPredicatedMap.class);
    }finally{__CLR4_4_1846846kcq4svm8.R.flushNeeded();}}

    private Map<Object, Object> baseMap = null;
    private Map<Object, Object> predicatedMap = null;
    @Override
    public void setUp() throws Exception {try{__CLR4_4_1846846kcq4svm8.R.inc(10522);
        __CLR4_4_1846846kcq4svm8.R.inc(10523);super.setUp();
        __CLR4_4_1846846kcq4svm8.R.inc(10524);baseMap = new HashMap<Object, Object>();
        __CLR4_4_1846846kcq4svm8.R.inc(10525);predicatedMap = new PredicatedMap<Object, Object>(baseMap,IsInstance.of(String.class),IsInstance.of(Integer.class));
    }finally{__CLR4_4_1846846kcq4svm8.R.flushNeeded();}}

    @Override
    public void tearDown() throws Exception {try{__CLR4_4_1846846kcq4svm8.R.inc(10526);
        __CLR4_4_1846846kcq4svm8.R.inc(10527);super.tearDown();
        __CLR4_4_1846846kcq4svm8.R.inc(10528);baseMap = null;
        __CLR4_4_1846846kcq4svm8.R.inc(10529);predicatedMap = null;
    }finally{__CLR4_4_1846846kcq4svm8.R.flushNeeded();}}

    // tests

    public void testCanPutMatchingPair() {__CLR4_4_1846846kcq4svm8.R.globalSliceStart(getClass().getName(),10530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1djp0sx84i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1846846kcq4svm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1846846kcq4svm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.map.TestPredicatedMap.testCanPutMatchingPair",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1djp0sx84i(){try{__CLR4_4_1846846kcq4svm8.R.inc(10530);
        __CLR4_4_1846846kcq4svm8.R.inc(10531);predicatedMap.put("xyzzy", Integer.valueOf(17));
    }finally{__CLR4_4_1846846kcq4svm8.R.flushNeeded();}}
    public void testCantPutInvalidValue() {__CLR4_4_1846846kcq4svm8.R.globalSliceStart(getClass().getName(),10532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpvaxm84k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1846846kcq4svm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1846846kcq4svm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.map.TestPredicatedMap.testCantPutInvalidValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpvaxm84k(){try{__CLR4_4_1846846kcq4svm8.R.inc(10532);
        __CLR4_4_1846846kcq4svm8.R.inc(10533);try {
            __CLR4_4_1846846kcq4svm8.R.inc(10534);predicatedMap.put("xyzzy", "xyzzy");
            __CLR4_4_1846846kcq4svm8.R.inc(10535);fail("Expected IllegalArgumentException");
        } catch(IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_1846846kcq4svm8.R.flushNeeded();}}

    public void testCantPutInvalidKey() {__CLR4_4_1846846kcq4svm8.R.globalSliceStart(getClass().getName(),10536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iximko84o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1846846kcq4svm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1846846kcq4svm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.map.TestPredicatedMap.testCantPutInvalidKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iximko84o(){try{__CLR4_4_1846846kcq4svm8.R.inc(10536);
        __CLR4_4_1846846kcq4svm8.R.inc(10537);try {
            __CLR4_4_1846846kcq4svm8.R.inc(10538);predicatedMap.put(Long.valueOf(1), Integer.valueOf(3));
            __CLR4_4_1846846kcq4svm8.R.inc(10539);fail("Expected IllegalArgumentException");
        } catch(IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_1846846kcq4svm8.R.flushNeeded();}}

    public void testOnlyValidPairsAreAddedInPutAll() {__CLR4_4_1846846kcq4svm8.R.globalSliceStart(getClass().getName(),10540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bnqpph84s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1846846kcq4svm8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1846846kcq4svm8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.map.TestPredicatedMap.testOnlyValidPairsAreAddedInPutAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bnqpph84s(){try{__CLR4_4_1846846kcq4svm8.R.inc(10540);
        __CLR4_4_1846846kcq4svm8.R.inc(10541);HashMap<Object, Object> map = new HashMap<Object, Object>();
        __CLR4_4_1846846kcq4svm8.R.inc(10542);map.put("one", Integer.valueOf(17));
        __CLR4_4_1846846kcq4svm8.R.inc(10543);map.put("two", "rejected");
        __CLR4_4_1846846kcq4svm8.R.inc(10544);map.put(Integer.valueOf(17), "xyzzy");
        __CLR4_4_1846846kcq4svm8.R.inc(10545);map.put(Integer.valueOf(7), Integer.valueOf(3));

        __CLR4_4_1846846kcq4svm8.R.inc(10546);predicatedMap.putAll(map);
        __CLR4_4_1846846kcq4svm8.R.inc(10547);assertEquals(Integer.valueOf(17), predicatedMap.get("one"));
        __CLR4_4_1846846kcq4svm8.R.inc(10548);assertFalse(predicatedMap.containsKey("two"));
    }finally{__CLR4_4_1846846kcq4svm8.R.flushNeeded();}}
}
