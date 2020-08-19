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
package org.apache.commons.functor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.functor.core.Identity;
import org.apache.commons.functor.core.composite.Not;
import org.apache.commons.functor.generator.FilteredGenerator;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;
import org.apache.commons.functor.generator.loop.LoopGenerator;
import org.apache.commons.functor.generator.loop.TransformedGenerator;
import org.apache.commons.functor.range.IntegerRange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestAlgorithms {static class __CLR4_4_13l03l0kcq4su60{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,4722,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Lifecycle
    // ------------------------------------------------------------------------

    @Before
    public void setUp() throws Exception {try{__CLR4_4_13l03l0kcq4su60.R.inc(4644);
        __CLR4_4_13l03l0kcq4su60.R.inc(4645);list = new ArrayList<Integer>();
        __CLR4_4_13l03l0kcq4su60.R.inc(4646);evens = new ArrayList<Integer>();
        __CLR4_4_13l03l0kcq4su60.R.inc(4647);doubled = new ArrayList<Integer>();
        __CLR4_4_13l03l0kcq4su60.R.inc(4648);listWithDuplicates = new ArrayList<Integer>();
        __CLR4_4_13l03l0kcq4su60.R.inc(4649);sum = 0;
        __CLR4_4_13l03l0kcq4su60.R.inc(4650);for (int i = 0; (((i < 10)&&(__CLR4_4_13l03l0kcq4su60.R.iget(4651)!=0|true))||(__CLR4_4_13l03l0kcq4su60.R.iget(4652)==0&false)); i++) {{
            __CLR4_4_13l03l0kcq4su60.R.inc(4653);list.add(Integer.valueOf(i));
            __CLR4_4_13l03l0kcq4su60.R.inc(4654);doubled.add(Integer.valueOf(i * 2));
            __CLR4_4_13l03l0kcq4su60.R.inc(4655);listWithDuplicates.add(Integer.valueOf(i));
            __CLR4_4_13l03l0kcq4su60.R.inc(4656);listWithDuplicates.add(Integer.valueOf(i));
            __CLR4_4_13l03l0kcq4su60.R.inc(4657);sum += i;
            __CLR4_4_13l03l0kcq4su60.R.inc(4658);if ((((i % 2 == 0)&&(__CLR4_4_13l03l0kcq4su60.R.iget(4659)!=0|true))||(__CLR4_4_13l03l0kcq4su60.R.iget(4660)==0&false))) {{
                __CLR4_4_13l03l0kcq4su60.R.inc(4661);evens.add(Integer.valueOf(i));
            }
        }}
    }}finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_13l03l0kcq4su60.R.inc(4662);
        __CLR4_4_13l03l0kcq4su60.R.inc(4663);list = null;
        __CLR4_4_13l03l0kcq4su60.R.inc(4664);evens = null;
        __CLR4_4_13l03l0kcq4su60.R.inc(4665);listWithDuplicates = null;
        __CLR4_4_13l03l0kcq4su60.R.inc(4666);sum = 0;
    }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testRun() {__CLR4_4_13l03l0kcq4su60.R.globalSliceStart(getClass().getName(),4667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzvxa83ln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13l03l0kcq4su60.R.rethrow($CLV_t2$);}finally{__CLR4_4_13l03l0kcq4su60.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.TestAlgorithms.testRun",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzvxa83ln(){try{__CLR4_4_13l03l0kcq4su60.R.inc(4667);
        __CLR4_4_13l03l0kcq4su60.R.inc(4668);Summer summer = new Summer();
        __CLR4_4_13l03l0kcq4su60.R.inc(4669);IteratorToGeneratorAdapter.adapt(list.iterator()).run(summer);
        __CLR4_4_13l03l0kcq4su60.R.inc(4670);assertEquals(sum, summer.sum);
    }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    @Test
    public void testSelect1() {__CLR4_4_13l03l0kcq4su60.R.globalSliceStart(getClass().getName(),4671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fcbl63lr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13l03l0kcq4su60.R.rethrow($CLV_t2$);}finally{__CLR4_4_13l03l0kcq4su60.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.TestAlgorithms.testSelect1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fcbl63lr(){try{__CLR4_4_13l03l0kcq4su60.R.inc(4671);
        __CLR4_4_13l03l0kcq4su60.R.inc(4672);Collection<Integer> result =
            new FilteredGenerator<Integer>(IteratorToGeneratorAdapter.adapt(list.iterator()), isEven).toCollection();
        __CLR4_4_13l03l0kcq4su60.R.inc(4673);assertNotNull(result);
        __CLR4_4_13l03l0kcq4su60.R.inc(4674);assertEquals(evens, result);
    }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    @Test
    public void testSelect2() {__CLR4_4_13l03l0kcq4su60.R.globalSliceStart(getClass().getName(),4675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ocadn3lv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13l03l0kcq4su60.R.rethrow($CLV_t2$);}finally{__CLR4_4_13l03l0kcq4su60.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.TestAlgorithms.testSelect2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ocadn3lv(){try{__CLR4_4_13l03l0kcq4su60.R.inc(4675);
        __CLR4_4_13l03l0kcq4su60.R.inc(4676);List<Integer> result = new ArrayList<Integer>();
        __CLR4_4_13l03l0kcq4su60.R.inc(4677);assertSame(result,
            new FilteredGenerator<Integer>(IteratorToGeneratorAdapter.adapt(list.iterator()), isEven).to(result));
        __CLR4_4_13l03l0kcq4su60.R.inc(4678);assertEquals(evens, result);
    }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    @Test
    public void testReject1() {__CLR4_4_13l03l0kcq4su60.R.globalSliceStart(getClass().getName(),4679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqly613lz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13l03l0kcq4su60.R.rethrow($CLV_t2$);}finally{__CLR4_4_13l03l0kcq4su60.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.TestAlgorithms.testReject1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqly613lz(){try{__CLR4_4_13l03l0kcq4su60.R.inc(4679);
        __CLR4_4_13l03l0kcq4su60.R.inc(4680);Collection<Integer> result =
            new FilteredGenerator<Integer>(IteratorToGeneratorAdapter.adapt(list.iterator()), new Not<Integer>(isOdd))
                .toCollection();
        __CLR4_4_13l03l0kcq4su60.R.inc(4681);assertNotNull(result);
        __CLR4_4_13l03l0kcq4su60.R.inc(4682);assertEquals(evens, result);
    }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    @Test
    public void testReject2() {__CLR4_4_13l03l0kcq4su60.R.globalSliceStart(getClass().getName(),4683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hhlzdk3m3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13l03l0kcq4su60.R.rethrow($CLV_t2$);}finally{__CLR4_4_13l03l0kcq4su60.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.TestAlgorithms.testReject2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hhlzdk3m3(){try{__CLR4_4_13l03l0kcq4su60.R.inc(4683);
        __CLR4_4_13l03l0kcq4su60.R.inc(4684);List<Object> result = new ArrayList<Object>();
        __CLR4_4_13l03l0kcq4su60.R.inc(4685);assertSame(result, new FilteredGenerator<Integer>(IteratorToGeneratorAdapter.adapt(list.iterator()),
            new Not<Integer>(isOdd)).to(result));
        __CLR4_4_13l03l0kcq4su60.R.inc(4686);assertEquals(evens, result);
    }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    @Test
    public void testApplyToGenerator() {__CLR4_4_13l03l0kcq4su60.R.globalSliceStart(getClass().getName(),4687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0lfib3m7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13l03l0kcq4su60.R.rethrow($CLV_t2$);}finally{__CLR4_4_13l03l0kcq4su60.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.TestAlgorithms.testApplyToGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0lfib3m7(){try{__CLR4_4_13l03l0kcq4su60.R.inc(4687);
        __CLR4_4_13l03l0kcq4su60.R.inc(4688);LoopGenerator<Integer> gen = IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 5));
        __CLR4_4_13l03l0kcq4su60.R.inc(4689);Summer summer = new Summer();

        __CLR4_4_13l03l0kcq4su60.R.inc(4690);new TransformedGenerator<Integer, Integer>(gen, new Doubler()).run(summer);

        __CLR4_4_13l03l0kcq4su60.R.inc(4691);assertEquals(2 * (1 + 2 + 3 + 4), summer.sum);
    }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    @Test
    public void testApply() {__CLR4_4_13l03l0kcq4su60.R.globalSliceStart(getClass().getName(),4692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16osqwt3mc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13l03l0kcq4su60.R.rethrow($CLV_t2$);}finally{__CLR4_4_13l03l0kcq4su60.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.TestAlgorithms.testApply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16osqwt3mc(){try{__CLR4_4_13l03l0kcq4su60.R.inc(4692);
        __CLR4_4_13l03l0kcq4su60.R.inc(4693);Collection<Integer> result =
            new TransformedGenerator<Integer, Integer>(IteratorToGeneratorAdapter.adapt(list.iterator()), new Doubler())
                .toCollection();
        __CLR4_4_13l03l0kcq4su60.R.inc(4694);assertNotNull(result);
        __CLR4_4_13l03l0kcq4su60.R.inc(4695);assertEquals(doubled, result);
    }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    @Test
    public void testApply2() {__CLR4_4_13l03l0kcq4su60.R.globalSliceStart(getClass().getName(),4696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mi2toj3mg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13l03l0kcq4su60.R.rethrow($CLV_t2$);}finally{__CLR4_4_13l03l0kcq4su60.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.TestAlgorithms.testApply2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mi2toj3mg(){try{__CLR4_4_13l03l0kcq4su60.R.inc(4696);
        __CLR4_4_13l03l0kcq4su60.R.inc(4697);Set<Integer> set = new HashSet<Integer>();
        __CLR4_4_13l03l0kcq4su60.R.inc(4698);assertSame(set, new TransformedGenerator<Integer, Integer>(IteratorToGeneratorAdapter.adapt(list.iterator()),
            Identity.<Integer> instance()).to(set));
        __CLR4_4_13l03l0kcq4su60.R.inc(4699);assertEquals(list.size(), set.size());
        __CLR4_4_13l03l0kcq4su60.R.inc(4700);for (Iterator<Integer> iter = list.iterator(); (((iter.hasNext())&&(__CLR4_4_13l03l0kcq4su60.R.iget(4701)!=0|true))||(__CLR4_4_13l03l0kcq4su60.R.iget(4702)==0&false));) {{
            __CLR4_4_13l03l0kcq4su60.R.inc(4703);assertTrue(set.contains(iter.next()));
        }
    }}finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    @Test
    public void testApply3() {__CLR4_4_13l03l0kcq4su60.R.globalSliceStart(getClass().getName(),4704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j92uw23mo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13l03l0kcq4su60.R.rethrow($CLV_t2$);}finally{__CLR4_4_13l03l0kcq4su60.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.TestAlgorithms.testApply3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j92uw23mo(){try{__CLR4_4_13l03l0kcq4su60.R.inc(4704);
        __CLR4_4_13l03l0kcq4su60.R.inc(4705);Set<Object> set = new HashSet<Object>();
        __CLR4_4_13l03l0kcq4su60.R.inc(4706);assertSame(set,
            new TransformedGenerator<Object, Object>(IteratorToGeneratorAdapter.adapt(listWithDuplicates.iterator()),
                Identity.instance()).to(set));
        __CLR4_4_13l03l0kcq4su60.R.inc(4707);assertTrue(listWithDuplicates.size() > set.size());
        __CLR4_4_13l03l0kcq4su60.R.inc(4708);for (Iterator<Integer> iter = listWithDuplicates.iterator(); (((iter.hasNext())&&(__CLR4_4_13l03l0kcq4su60.R.iget(4709)!=0|true))||(__CLR4_4_13l03l0kcq4su60.R.iget(4710)==0&false));) {{
            __CLR4_4_13l03l0kcq4su60.R.inc(4711);assertTrue(set.contains(iter.next()));
        }
    }}finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

    // Attributes
    // ------------------------------------------------------------------------
    private List<Integer> list = null;
    private List<Integer> doubled = null;
    private List<Integer> evens = null;
    private List<Integer> listWithDuplicates = null;
    private int sum = 0;
    private Predicate<Integer> isEven = new Predicate<Integer>() {
        public boolean test(Integer obj) {try{__CLR4_4_13l03l0kcq4su60.R.inc(4712);
            __CLR4_4_13l03l0kcq4su60.R.inc(4713);return obj.intValue() % 2 == 0;
        }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}
    };
    private Predicate<Integer> isOdd = new Predicate<Integer>() {
        public boolean test(Integer obj) {try{__CLR4_4_13l03l0kcq4su60.R.inc(4714);
            __CLR4_4_13l03l0kcq4su60.R.inc(4715);return obj.intValue() % 2 != 0;
        }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}
    };

    // Classes
    // ------------------------------------------------------------------------

    static class Counter implements NullaryProcedure {
        public void run() {try{__CLR4_4_13l03l0kcq4su60.R.inc(4716);
            __CLR4_4_13l03l0kcq4su60.R.inc(4717);count++;
        }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

        public int count = 0;
    }

    static class Summer implements Procedure<Integer> {
        public void run(Integer that) {try{__CLR4_4_13l03l0kcq4su60.R.inc(4718);
            __CLR4_4_13l03l0kcq4su60.R.inc(4719);sum += that.intValue();
        }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}

        public int sum = 0;
    }

    static class Doubler implements Function<Integer, Integer> {
        public Integer evaluate(Integer obj) {try{__CLR4_4_13l03l0kcq4su60.R.inc(4720);
            __CLR4_4_13l03l0kcq4su60.R.inc(4721);return Integer.valueOf(2 * obj.intValue());
        }finally{__CLR4_4_13l03l0kcq4su60.R.flushNeeded();}}
    }
}
