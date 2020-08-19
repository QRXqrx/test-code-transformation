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

/**
 * @version $Revision$ $Date$
 */
public class TestFixedSizeMap extends TestCase {static class __CLR4_4_181d81dkcq4svlu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10469,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TestFixedSizeMap(String testName) {
        super(testName);__CLR4_4_181d81dkcq4svlu.R.inc(10418);try{__CLR4_4_181d81dkcq4svlu.R.inc(10417);
    }finally{__CLR4_4_181d81dkcq4svlu.R.flushNeeded();}}

    public static Test suite() {try{__CLR4_4_181d81dkcq4svlu.R.inc(10419);
        __CLR4_4_181d81dkcq4svlu.R.inc(10420);return new TestSuite(TestFixedSizeMap.class);
    }finally{__CLR4_4_181d81dkcq4svlu.R.flushNeeded();}}

    private Map<Object, Object> baseMap = null;
    private Map<Object, Object> fixedMap = null;

    @Override
    public void setUp() throws Exception {try{__CLR4_4_181d81dkcq4svlu.R.inc(10421);
        __CLR4_4_181d81dkcq4svlu.R.inc(10422);super.setUp();
        __CLR4_4_181d81dkcq4svlu.R.inc(10423);baseMap = new HashMap<Object, Object>();
        __CLR4_4_181d81dkcq4svlu.R.inc(10424);baseMap.put(Integer.valueOf(1), "one");
        __CLR4_4_181d81dkcq4svlu.R.inc(10425);baseMap.put(Integer.valueOf(2), "two");
        __CLR4_4_181d81dkcq4svlu.R.inc(10426);baseMap.put(Integer.valueOf(3), "three");
        __CLR4_4_181d81dkcq4svlu.R.inc(10427);baseMap.put(Integer.valueOf(4), "four");
        __CLR4_4_181d81dkcq4svlu.R.inc(10428);baseMap.put(Integer.valueOf(5), "five");

        __CLR4_4_181d81dkcq4svlu.R.inc(10429);fixedMap = new FixedSizeMap<Object, Object>(baseMap);
    }finally{__CLR4_4_181d81dkcq4svlu.R.flushNeeded();}}

    @Override
    public void tearDown() throws Exception {try{__CLR4_4_181d81dkcq4svlu.R.inc(10430);
        __CLR4_4_181d81dkcq4svlu.R.inc(10431);super.tearDown();
        __CLR4_4_181d81dkcq4svlu.R.inc(10432);baseMap = null;
        __CLR4_4_181d81dkcq4svlu.R.inc(10433);fixedMap = null;
    }finally{__CLR4_4_181d81dkcq4svlu.R.flushNeeded();}}

    // tests

    public void testCantPutNewPair() {__CLR4_4_181d81dkcq4svlu.R.globalSliceStart(getClass().getName(),10434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fmzzc81u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_181d81dkcq4svlu.R.rethrow($CLV_t2$);}finally{__CLR4_4_181d81dkcq4svlu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.map.TestFixedSizeMap.testCantPutNewPair",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fmzzc81u(){try{__CLR4_4_181d81dkcq4svlu.R.inc(10434);
        __CLR4_4_181d81dkcq4svlu.R.inc(10435);try {
            __CLR4_4_181d81dkcq4svlu.R.inc(10436);fixedMap.put("xyzzy", "xyzzy");
            __CLR4_4_181d81dkcq4svlu.R.inc(10437);fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_181d81dkcq4svlu.R.flushNeeded();}}

    public void testCantPutNewPairViaPutAll() {__CLR4_4_181d81dkcq4svlu.R.globalSliceStart(getClass().getName(),10438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1efw90m81y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_181d81dkcq4svlu.R.rethrow($CLV_t2$);}finally{__CLR4_4_181d81dkcq4svlu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.map.TestFixedSizeMap.testCantPutNewPairViaPutAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1efw90m81y(){try{__CLR4_4_181d81dkcq4svlu.R.inc(10438);
        __CLR4_4_181d81dkcq4svlu.R.inc(10439);Map<Object, Object> map = new HashMap<Object, Object>();
        __CLR4_4_181d81dkcq4svlu.R.inc(10440);map.put(Integer.valueOf(1), "uno");
        __CLR4_4_181d81dkcq4svlu.R.inc(10441);map.put("xyzzy", "xyzzy");
        __CLR4_4_181d81dkcq4svlu.R.inc(10442);map.put(Integer.valueOf(2), "dos");

        __CLR4_4_181d81dkcq4svlu.R.inc(10443);try {
            __CLR4_4_181d81dkcq4svlu.R.inc(10444);fixedMap.putAll(map);
            __CLR4_4_181d81dkcq4svlu.R.inc(10445);fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        __CLR4_4_181d81dkcq4svlu.R.inc(10446);assertEquals("one", fixedMap.get(Integer.valueOf(1)));
        __CLR4_4_181d81dkcq4svlu.R.inc(10447);assertEquals("two", fixedMap.get(Integer.valueOf(2)));
    }finally{__CLR4_4_181d81dkcq4svlu.R.flushNeeded();}}

    public void testCantClear() {__CLR4_4_181d81dkcq4svlu.R.globalSliceStart(getClass().getName(),10448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s3ee4e828();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_181d81dkcq4svlu.R.rethrow($CLV_t2$);}finally{__CLR4_4_181d81dkcq4svlu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.map.TestFixedSizeMap.testCantClear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s3ee4e828(){try{__CLR4_4_181d81dkcq4svlu.R.inc(10448);
        __CLR4_4_181d81dkcq4svlu.R.inc(10449);try {
            __CLR4_4_181d81dkcq4svlu.R.inc(10450);fixedMap.clear();
            __CLR4_4_181d81dkcq4svlu.R.inc(10451);fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }finally{__CLR4_4_181d81dkcq4svlu.R.flushNeeded();}}

    public void testCantRemove() {__CLR4_4_181d81dkcq4svlu.R.globalSliceStart(getClass().getName(),10452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ksy9r82c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_181d81dkcq4svlu.R.rethrow($CLV_t2$);}finally{__CLR4_4_181d81dkcq4svlu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.map.TestFixedSizeMap.testCantRemove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ksy9r82c(){try{__CLR4_4_181d81dkcq4svlu.R.inc(10452);
        __CLR4_4_181d81dkcq4svlu.R.inc(10453);try {
            __CLR4_4_181d81dkcq4svlu.R.inc(10454);fixedMap.remove(Integer.valueOf(1));
            __CLR4_4_181d81dkcq4svlu.R.inc(10455);fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }finally{__CLR4_4_181d81dkcq4svlu.R.flushNeeded();}}

    public void testCanAssociateNewValueWithOldKey() {__CLR4_4_181d81dkcq4svlu.R.globalSliceStart(getClass().getName(),10456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgdic682g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_181d81dkcq4svlu.R.rethrow($CLV_t2$);}finally{__CLR4_4_181d81dkcq4svlu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.map.TestFixedSizeMap.testCanAssociateNewValueWithOldKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgdic682g(){try{__CLR4_4_181d81dkcq4svlu.R.inc(10456);
        __CLR4_4_181d81dkcq4svlu.R.inc(10457);fixedMap.put(Integer.valueOf(1), "uno");
        __CLR4_4_181d81dkcq4svlu.R.inc(10458);assertEquals("uno", fixedMap.get(Integer.valueOf(1)));
        __CLR4_4_181d81dkcq4svlu.R.inc(10459);assertEquals("two", fixedMap.get(Integer.valueOf(2)));
        __CLR4_4_181d81dkcq4svlu.R.inc(10460);assertEquals("three", fixedMap.get(Integer.valueOf(3)));
    }finally{__CLR4_4_181d81dkcq4svlu.R.flushNeeded();}}

    public void testCanAssociateNewValueWithOldKeyViaPutAll() {__CLR4_4_181d81dkcq4svlu.R.globalSliceStart(getClass().getName(),10461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pvpki082l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_181d81dkcq4svlu.R.rethrow($CLV_t2$);}finally{__CLR4_4_181d81dkcq4svlu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.map.TestFixedSizeMap.testCanAssociateNewValueWithOldKeyViaPutAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pvpki082l(){try{__CLR4_4_181d81dkcq4svlu.R.inc(10461);
        __CLR4_4_181d81dkcq4svlu.R.inc(10462);Map<Object, Object> map = new HashMap<Object, Object>();
        __CLR4_4_181d81dkcq4svlu.R.inc(10463);map.put(Integer.valueOf(1), "uno");
        __CLR4_4_181d81dkcq4svlu.R.inc(10464);map.put(Integer.valueOf(2), "dos");

        __CLR4_4_181d81dkcq4svlu.R.inc(10465);fixedMap.putAll(map);

        __CLR4_4_181d81dkcq4svlu.R.inc(10466);assertEquals("uno", fixedMap.get(Integer.valueOf(1)));
        __CLR4_4_181d81dkcq4svlu.R.inc(10467);assertEquals("dos", fixedMap.get(Integer.valueOf(2)));
        __CLR4_4_181d81dkcq4svlu.R.inc(10468);assertEquals("three", fixedMap.get(Integer.valueOf(3)));
    }finally{__CLR4_4_181d81dkcq4svlu.R.flushNeeded();}}

}
