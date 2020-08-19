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
import org.apache.commons.functor.generator.loop.GenerateWhile;
import org.apache.commons.functor.range.IntegerRange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Generate While class.
 * @version $Revision: 1508677 $ $Date: 2013-07-30 19:48:02 -0300 (Tue, 30 Jul 2013) $
 */
public class TestGenerateWhile
{static class __CLR4_4_188b88bkcq4svnm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10696,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Before
    public void setUp() throws Exception {try{__CLR4_4_188b88bkcq4svnm.R.inc(10667);
        __CLR4_4_188b88bkcq4svnm.R.inc(10668);wrappedGenerator = IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10));
        __CLR4_4_188b88bkcq4svnm.R.inc(10669);generateWhile = new GenerateWhile<Integer>(wrappedGenerator, isLessThanFive);
    }finally{__CLR4_4_188b88bkcq4svnm.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_4_188b88bkcq4svnm.R.inc(10670);
        __CLR4_4_188b88bkcq4svnm.R.inc(10671);wrappedGenerator = null;
        __CLR4_4_188b88bkcq4svnm.R.inc(10672);isLessThanFive = null;
        __CLR4_4_188b88bkcq4svnm.R.inc(10673);generateWhile = null;
    }finally{__CLR4_4_188b88bkcq4svnm.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test(expected=NullPointerException.class)
    public void testConstructorProhibitsNullPredicate() {__CLR4_4_188b88bkcq4svnm.R.globalSliceStart(getClass().getName(),10674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkb9rp88i();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,80,114,111,104,105,98,105,116,115,78,117,108,108,80,114,101,100,105,99,97,116,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_188b88bkcq4svnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_188b88bkcq4svnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestGenerateWhile.testConstructorProhibitsNullPredicate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkb9rp88i(){try{__CLR4_4_188b88bkcq4svnm.R.inc(10674);
            __CLR4_4_188b88bkcq4svnm.R.inc(10675);new GenerateWhile<Integer>(generateWhile, null);
    }finally{__CLR4_4_188b88bkcq4svnm.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorProhibitsNullWrappedGenerator() {__CLR4_4_188b88bkcq4svnm.R.globalSliceStart(getClass().getName(),10676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npa22w88k();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,80,114,111,104,105,98,105,116,115,78,117,108,108,87,114,97,112,112,101,100,71,101,110,101,114,97,116,111,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_188b88bkcq4svnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_188b88bkcq4svnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestGenerateWhile.testConstructorProhibitsNullWrappedGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npa22w88k(){try{__CLR4_4_188b88bkcq4svnm.R.inc(10676);
            __CLR4_4_188b88bkcq4svnm.R.inc(10677);new GenerateWhile<Integer>(null, isLessThanFive);
    }finally{__CLR4_4_188b88bkcq4svnm.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorProhibitsNullPredicateOrNullWrappedGenerator() {__CLR4_4_188b88bkcq4svnm.R.globalSliceStart(getClass().getName(),10678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0gowt88m();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,80,114,111,104,105,98,105,116,115,78,117,108,108,80,114,101,100,105,99,97,116,101,79,114,78,117,108,108,87,114,97,112,112,101,100,71,101,110,101,114,97,116,111,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_188b88bkcq4svnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_188b88bkcq4svnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestGenerateWhile.testConstructorProhibitsNullPredicateOrNullWrappedGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0gowt88m(){try{__CLR4_4_188b88bkcq4svnm.R.inc(10678);
            __CLR4_4_188b88bkcq4svnm.R.inc(10679);new GenerateWhile<Integer>(null, null);
    }finally{__CLR4_4_188b88bkcq4svnm.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_188b88bkcq4svnm.R.globalSliceStart(getClass().getName(),10680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60888o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_188b88bkcq4svnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_188b88bkcq4svnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestGenerateWhile.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60888o(){try{__CLR4_4_188b88bkcq4svnm.R.inc(10680);
        __CLR4_4_188b88bkcq4svnm.R.inc(10681);Generator<Integer> anotherGenerate = new GenerateWhile<Integer>(
                IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isLessThanFive);
        __CLR4_4_188b88bkcq4svnm.R.inc(10682);assertEquals(generateWhile, generateWhile);
        __CLR4_4_188b88bkcq4svnm.R.inc(10683);assertEquals(generateWhile, anotherGenerate);
        __CLR4_4_188b88bkcq4svnm.R.inc(10684);assertTrue(!generateWhile.equals((GenerateWhile<Integer>)null));

		__CLR4_4_188b88bkcq4svnm.R.inc(10685);Generator<Integer> aGenerateWithADifferentPredicate = new GenerateWhile<Integer>(
            IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), new Predicate<Integer>() {
                public boolean test(Integer obj) {try{__CLR4_4_188b88bkcq4svnm.R.inc(10686);
                    __CLR4_4_188b88bkcq4svnm.R.inc(10687);return obj < FIVE;
    			}finally{__CLR4_4_188b88bkcq4svnm.R.flushNeeded();}}
			});

        __CLR4_4_188b88bkcq4svnm.R.inc(10688);assertTrue(!generateWhile.equals(aGenerateWithADifferentPredicate));

        __CLR4_4_188b88bkcq4svnm.R.inc(10689);Generator<Integer> aGenerateWithADifferentWrapped = new GenerateWhile<Integer>(
                IteratorToGeneratorAdapter.adapt(new IntegerRange(1,11)), isLessThanFive);
        __CLR4_4_188b88bkcq4svnm.R.inc(10690);assertTrue(!generateWhile.equals(aGenerateWithADifferentWrapped));
    }finally{__CLR4_4_188b88bkcq4svnm.R.flushNeeded();}}

    @Test
    public void testHashcode() {__CLR4_4_188b88bkcq4svnm.R.globalSliceStart(getClass().getName(),10691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h790lw88z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_188b88bkcq4svnm.R.rethrow($CLV_t2$);}finally{__CLR4_4_188b88bkcq4svnm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestGenerateWhile.testHashcode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h790lw88z(){try{__CLR4_4_188b88bkcq4svnm.R.inc(10691);
        __CLR4_4_188b88bkcq4svnm.R.inc(10692);assertEquals(generateWhile.hashCode(), generateWhile.hashCode());
        __CLR4_4_188b88bkcq4svnm.R.inc(10693);assertEquals(generateWhile.hashCode(), new GenerateWhile<Integer>(wrappedGenerator, isLessThanFive).hashCode());
    }finally{__CLR4_4_188b88bkcq4svnm.R.flushNeeded();}}

    // Attributes
    // ------------------------------------------------------------------------
    private static final Integer FIVE = Integer.valueOf(5);

    private Generator<Integer> wrappedGenerator = null;
    private Predicate<Integer> isLessThanFive = new Predicate<Integer>()
    {
        public boolean test( Integer obj ) {try{__CLR4_4_188b88bkcq4svnm.R.inc(10694);
            __CLR4_4_188b88bkcq4svnm.R.inc(10695);return obj < FIVE;
        }finally{__CLR4_4_188b88bkcq4svnm.R.flushNeeded();}}
    };
    private Generator<Integer> generateWhile = null;

}
