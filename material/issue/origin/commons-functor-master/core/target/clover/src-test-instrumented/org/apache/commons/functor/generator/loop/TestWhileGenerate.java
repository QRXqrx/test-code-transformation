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
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.functor.generator.loop.WhileGenerate;
import org.apache.commons.functor.range.IntegerRange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the While Generate class.
 * @version $Revision: 1508677 $ $Date: 2013-07-30 19:48:02 -0300 (Tue, 30 Jul 2013) $
 */
public class TestWhileGenerate {static class __CLR4_4_18ee8eekcq4svp6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10923,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Before
    public void setUp() throws Exception {try{__CLR4_4_18ee8eekcq4svp6.R.inc(10886);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10887);wrappedGenerator = IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10));
        __CLR4_4_18ee8eekcq4svp6.R.inc(10888);whileGenerate = new WhileGenerate<Integer>(isLessThanFive, wrappedGenerator);
    }finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_4_18ee8eekcq4svp6.R.inc(10889);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10890);wrappedGenerator = null;
        __CLR4_4_18ee8eekcq4svp6.R.inc(10891);isLessThanFive = null;
        __CLR4_4_18ee8eekcq4svp6.R.inc(10892);whileGenerate = null;
    }finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test(expected=NullPointerException.class)
    public void testConstructorProhibitsNullPredicate() {__CLR4_4_18ee8eekcq4svp6.R.globalSliceStart(getClass().getName(),10893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkb9rp8el();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,80,114,111,104,105,98,105,116,115,78,117,108,108,80,114,101,100,105,99,97,116,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ee8eekcq4svp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ee8eekcq4svp6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestWhileGenerate.testConstructorProhibitsNullPredicate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkb9rp8el(){try{__CLR4_4_18ee8eekcq4svp6.R.inc(10893);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10894);new WhileGenerate<Integer>(null, whileGenerate);
    }finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorProhibitsNullWrappedGenerator() {__CLR4_4_18ee8eekcq4svp6.R.globalSliceStart(getClass().getName(),10895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npa22w8en();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,80,114,111,104,105,98,105,116,115,78,117,108,108,87,114,97,112,112,101,100,71,101,110,101,114,97,116,111,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ee8eekcq4svp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ee8eekcq4svp6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestWhileGenerate.testConstructorProhibitsNullWrappedGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npa22w8en(){try{__CLR4_4_18ee8eekcq4svp6.R.inc(10895);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10896);new WhileGenerate<Integer>(isLessThanFive, null);
    }finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorProhibitsNullPredicateOrNullWrappedGenerator() {__CLR4_4_18ee8eekcq4svp6.R.globalSliceStart(getClass().getName(),10897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0gowt8ep();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,80,114,111,104,105,98,105,116,115,78,117,108,108,80,114,101,100,105,99,97,116,101,79,114,78,117,108,108,87,114,97,112,112,101,100,71,101,110,101,114,97,116,111,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ee8eekcq4svp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ee8eekcq4svp6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestWhileGenerate.testConstructorProhibitsNullPredicateOrNullWrappedGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0gowt8ep(){try{__CLR4_4_18ee8eekcq4svp6.R.inc(10897);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10898);new WhileGenerate<Integer>(null, null);
    }finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_18ee8eekcq4svp6.R.globalSliceStart(getClass().getName(),10899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6088er();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ee8eekcq4svp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ee8eekcq4svp6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestWhileGenerate.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6088er(){try{__CLR4_4_18ee8eekcq4svp6.R.inc(10899);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10900);Generator<Integer> anotherGenerate = new WhileGenerate<Integer>(
                isLessThanFive, IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)));
        __CLR4_4_18ee8eekcq4svp6.R.inc(10901);assertEquals(whileGenerate, whileGenerate);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10902);assertEquals(whileGenerate, anotherGenerate);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10903);assertTrue(!whileGenerate.equals((WhileGenerate<Integer>)null));

		__CLR4_4_18ee8eekcq4svp6.R.inc(10904);Generator<Integer> aGenerateWithADifferentPredicate = new WhileGenerate<Integer>(
			new Predicate<Integer>() {
				public boolean test(Integer obj) {try{__CLR4_4_18ee8eekcq4svp6.R.inc(10905);
					__CLR4_4_18ee8eekcq4svp6.R.inc(10906);return obj < FIVE;
				}finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}
			}, IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)));
        __CLR4_4_18ee8eekcq4svp6.R.inc(10907);assertTrue(!whileGenerate.equals(aGenerateWithADifferentPredicate));

        __CLR4_4_18ee8eekcq4svp6.R.inc(10908);Generator<Integer> aGenerateWithADifferentWrapped = new WhileGenerate<Integer>(
                isLessThanFive, IteratorToGeneratorAdapter.adapt(new IntegerRange(1,11)));
        __CLR4_4_18ee8eekcq4svp6.R.inc(10909);assertTrue(!whileGenerate.equals(aGenerateWithADifferentWrapped));
    }finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}

    @Test
    public void testHashcode() {__CLR4_4_18ee8eekcq4svp6.R.globalSliceStart(getClass().getName(),10910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h790lw8f2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ee8eekcq4svp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ee8eekcq4svp6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestWhileGenerate.testHashcode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h790lw8f2(){try{__CLR4_4_18ee8eekcq4svp6.R.inc(10910);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10911);assertEquals(whileGenerate.hashCode(), whileGenerate.hashCode());
        __CLR4_4_18ee8eekcq4svp6.R.inc(10912);assertEquals(whileGenerate.hashCode(), new WhileGenerate<Integer>(isLessThanFive, wrappedGenerator).hashCode());
    }finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}

    @Test
    public void testGenerate() {__CLR4_4_18ee8eekcq4svp6.R.globalSliceStart(getClass().getName(),10913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8ovhu8f5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ee8eekcq4svp6.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ee8eekcq4svp6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestWhileGenerate.testGenerate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8ovhu8f5(){try{__CLR4_4_18ee8eekcq4svp6.R.inc(10913);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10914);final List<Integer> numbersMinorThanFive = new ArrayList<Integer>();
        __CLR4_4_18ee8eekcq4svp6.R.inc(10915);whileGenerate.run(new Procedure<Integer>() {
            public void run( Integer obj ) {try{__CLR4_4_18ee8eekcq4svp6.R.inc(10916);
                __CLR4_4_18ee8eekcq4svp6.R.inc(10917);numbersMinorThanFive.add(obj);
            }finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}
        });
        __CLR4_4_18ee8eekcq4svp6.R.inc(10918);assertEquals(4, numbersMinorThanFive.size());

        __CLR4_4_18ee8eekcq4svp6.R.inc(10919);List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        __CLR4_4_18ee8eekcq4svp6.R.inc(10920);assertEquals(expected, numbersMinorThanFive);
    }finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}

    // Attributes
    // ------------------------------------------------------------------------
	private static final Integer FIVE = Integer.valueOf(5);

    private Generator<Integer> wrappedGenerator = null;
    private Predicate<Integer> isLessThanFive = new Predicate<Integer>() {
        public boolean test( Integer obj ) {try{__CLR4_4_18ee8eekcq4svp6.R.inc(10921);
            __CLR4_4_18ee8eekcq4svp6.R.inc(10922);return obj < FIVE;
        }finally{__CLR4_4_18ee8eekcq4svp6.R.flushNeeded();}}
    };
    private Generator<Integer> whileGenerate = null;
}
