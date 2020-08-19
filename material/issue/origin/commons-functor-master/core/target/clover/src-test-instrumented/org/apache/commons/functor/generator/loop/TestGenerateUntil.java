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

import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.functor.generator.loop.GenerateUntil;
import org.apache.commons.functor.range.IntegerRange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Generate Until class.
 * @version $Revision: 1508677 $ $Date: 2013-07-30 19:48:02 -0300 (Tue, 30 Jul 2013) $
 */
public class TestGenerateUntil
{static class __CLR4_4_187i87ikcq4svn4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10667,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Before
    public void setUp() throws Exception {try{__CLR4_4_187i87ikcq4svn4.R.inc(10638);
        __CLR4_4_187i87ikcq4svn4.R.inc(10639);wrappedGenerator = IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10));
        __CLR4_4_187i87ikcq4svn4.R.inc(10640);generateUntil = new GenerateUntil<Integer>(wrappedGenerator, isMoreThanFive);
    }finally{__CLR4_4_187i87ikcq4svn4.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_4_187i87ikcq4svn4.R.inc(10641);
        __CLR4_4_187i87ikcq4svn4.R.inc(10642);wrappedGenerator = null;
        __CLR4_4_187i87ikcq4svn4.R.inc(10643);isMoreThanFive = null;
        __CLR4_4_187i87ikcq4svn4.R.inc(10644);generateUntil = null;
    }finally{__CLR4_4_187i87ikcq4svn4.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test(expected=NullPointerException.class)
    public void testConstructorProhibitsNullWrappedPredicate() {__CLR4_4_187i87ikcq4svn4.R.globalSliceStart(getClass().getName(),10645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hij4ic87p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,80,114,111,104,105,98,105,116,115,78,117,108,108,87,114,97,112,112,101,100,80,114,101,100,105,99,97,116,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_187i87ikcq4svn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_187i87ikcq4svn4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestGenerateUntil.testConstructorProhibitsNullWrappedPredicate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hij4ic87p(){try{__CLR4_4_187i87ikcq4svn4.R.inc(10645);
        __CLR4_4_187i87ikcq4svn4.R.inc(10646);new GenerateUntil<Integer>(generateUntil, null);
    }finally{__CLR4_4_187i87ikcq4svn4.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorProhibitsNullGenerator() {__CLR4_4_187i87ikcq4svn4.R.globalSliceStart(getClass().getName(),10647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19nhwtj87r();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,80,114,111,104,105,98,105,116,115,78,117,108,108,71,101,110,101,114,97,116,111,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_187i87ikcq4svn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_187i87ikcq4svn4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestGenerateUntil.testConstructorProhibitsNullGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19nhwtj87r(){try{__CLR4_4_187i87ikcq4svn4.R.inc(10647);
        __CLR4_4_187i87ikcq4svn4.R.inc(10648);new GenerateUntil<Integer>(null, isMoreThanFive);
    }finally{__CLR4_4_187i87ikcq4svn4.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorProhibitsNullGeneratorOrNullWrappedPredicate() {__CLR4_4_187i87ikcq4svn4.R.globalSliceStart(getClass().getName(),10649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r5imfx87t();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,80,114,111,104,105,98,105,116,115,78,117,108,108,71,101,110,101,114,97,116,111,114,79,114,78,117,108,108,87,114,97,112,112,101,100,80,114,101,100,105,99,97,116,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_187i87ikcq4svn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_187i87ikcq4svn4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestGenerateUntil.testConstructorProhibitsNullGeneratorOrNullWrappedPredicate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r5imfx87t(){try{__CLR4_4_187i87ikcq4svn4.R.inc(10649);
        __CLR4_4_187i87ikcq4svn4.R.inc(10650);new GenerateUntil<Integer>(null, null);
    }finally{__CLR4_4_187i87ikcq4svn4.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_187i87ikcq4svn4.R.globalSliceStart(getClass().getName(),10651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60887v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_187i87ikcq4svn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_187i87ikcq4svn4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestGenerateUntil.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60887v(){try{__CLR4_4_187i87ikcq4svn4.R.inc(10651);
        __CLR4_4_187i87ikcq4svn4.R.inc(10652);Generator<Integer> anotherGenerate = new GenerateUntil<Integer>(
                IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isMoreThanFive);
        __CLR4_4_187i87ikcq4svn4.R.inc(10653);assertEquals(generateUntil, generateUntil);
        __CLR4_4_187i87ikcq4svn4.R.inc(10654);assertEquals(generateUntil, anotherGenerate);
        __CLR4_4_187i87ikcq4svn4.R.inc(10655);assertTrue(!generateUntil.equals((GenerateUntil<Integer>)null));

		__CLR4_4_187i87ikcq4svn4.R.inc(10656);Generator<Integer> aGenerateWithADifferentPredicate = new GenerateUntil<Integer>(
		        IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)),
				new Predicate<Integer>() {
				public boolean test(Integer obj) {try{__CLR4_4_187i87ikcq4svn4.R.inc(10657);
					__CLR4_4_187i87ikcq4svn4.R.inc(10658);return obj > FIVE;
				}finally{__CLR4_4_187i87ikcq4svn4.R.flushNeeded();}}
			});
        __CLR4_4_187i87ikcq4svn4.R.inc(10659);assertTrue(!generateUntil.equals(aGenerateWithADifferentPredicate));

        __CLR4_4_187i87ikcq4svn4.R.inc(10660);Generator<Integer> aGenerateWithADifferentWrapped = new GenerateUntil<Integer>(
                IteratorToGeneratorAdapter.adapt(new IntegerRange(1,2)), isMoreThanFive);
        __CLR4_4_187i87ikcq4svn4.R.inc(10661);assertTrue(!generateUntil.equals(aGenerateWithADifferentWrapped));
    }finally{__CLR4_4_187i87ikcq4svn4.R.flushNeeded();}}

    @Test
    public void testHashcode() {__CLR4_4_187i87ikcq4svn4.R.globalSliceStart(getClass().getName(),10662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h790lw886();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_187i87ikcq4svn4.R.rethrow($CLV_t2$);}finally{__CLR4_4_187i87ikcq4svn4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestGenerateUntil.testHashcode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h790lw886(){try{__CLR4_4_187i87ikcq4svn4.R.inc(10662);
        __CLR4_4_187i87ikcq4svn4.R.inc(10663);assertEquals(generateUntil.hashCode(), generateUntil.hashCode());
        __CLR4_4_187i87ikcq4svn4.R.inc(10664);assertEquals(generateUntil.hashCode(), new GenerateUntil<Integer>(wrappedGenerator, isMoreThanFive).hashCode());
    }finally{__CLR4_4_187i87ikcq4svn4.R.flushNeeded();}}

    // Attributes
    // ------------------------------------------------------------------------
    private static final Integer FIVE = Integer.valueOf(5);

    private Generator<Integer> wrappedGenerator = null;
    private Predicate<Integer> isMoreThanFive = new Predicate<Integer>() {
        public boolean test( Integer obj ) {try{__CLR4_4_187i87ikcq4svn4.R.inc(10665);
            __CLR4_4_187i87ikcq4svn4.R.inc(10666);return obj > FIVE;
        }finally{__CLR4_4_187i87ikcq4svn4.R.flushNeeded();}}
    };
    private Generator<Integer> generateUntil = null;
}
