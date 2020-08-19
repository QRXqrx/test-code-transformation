/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0f
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0f
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.functor.range;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for float range.
 * 
 * @since 1.0
 * @version $Revision: $ $Date: $
 */
public class TestFloatRange extends BaseFunctorTest {static class __CLR4_4_18z18z1kcq4svtv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,11942,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // A base range with all longs between -6 and 6
    private final List<Float> fullRange = Collections.unmodifiableList(Arrays
        .asList(-6.0f, -5.0f, -4.0f, -3.0f, -2.0f, -1.0f, 0.0f, 1.0f, 2.0f,
                3.0f, 4.0f, 5.0f, 6.0f));

    // Attributes
    // ------------------------------------------------------------------------
    private FloatRange ascFloatRange = null;
    private FloatRange descFloatRange = null;
    private Collection<Float> expectedAsc = null;
    private Collection<Float> expectedDesc = null;

    // Test set up
    // ------------------------------------------------------------------------
    @Before
    public void setUp() {try{__CLR4_4_18z18z1kcq4svtv.R.inc(11629);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11630);ascFloatRange = Ranges.floatRange(0.0f, 10.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11631);descFloatRange = Ranges.floatRange(10.0f, 0.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11632);expectedAsc = Arrays.asList(0.0f, 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f,
                                    7.0f, 8.0f, 9.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11633);expectedDesc = Arrays.asList(10.0f, 9.0f, 8.0f, 7.0f, 6.0f, 5.0f, 4.0f,
                                     3.0f, 2.0f, 1.0f);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_4_18z18z1kcq4svtv.R.inc(11634);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11635);ascFloatRange = null;
        __CLR4_4_18z18z1kcq4svtv.R.inc(11636);descFloatRange = null;
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Override
    protected Object makeFunctor()
        throws Exception {try{__CLR4_4_18z18z1kcq4svtv.R.inc(11637);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11638);return Ranges.floatRange(10, 20);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    // Generator tests
    // ---------------------------------------------------------------

    @Test
    public void testGenerateListExample() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5ey48zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testGenerateListExample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5ey48zb(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11639);
        // generates a collection of Floats from 0 (inclusive) to 10 (exclusive)
        {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11640);List<? super Float> list = (List<? super Float>) (
                IteratorToGeneratorAdapter.adapt(Ranges.floatRange(0, 10))
                    .to(new ArrayList<Float>()));
            __CLR4_4_18z18z1kcq4svtv.R.inc(11641);for (int i = 0; (((i < 10)&&(__CLR4_4_18z18z1kcq4svtv.R.iget(11642)!=0|true))||(__CLR4_4_18z18z1kcq4svtv.R.iget(11643)==0&false)); i++) {{
                __CLR4_4_18z18z1kcq4svtv.R.inc(11644);assertEquals(Float.valueOf(i), list.get(i));
            }
        }}

        // generates a collection of Floats from 10 (inclusive) to 0 (exclusive)
        {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11645);List<? super Float> list = (List<? super Float>) (
                IteratorToGeneratorAdapter.adapt(Ranges.floatRange(10, 0))
                    .to(new ArrayList<Float>()));
            __CLR4_4_18z18z1kcq4svtv.R.inc(11646);for (int i = 10; (((i > 0)&&(__CLR4_4_18z18z1kcq4svtv.R.iget(11647)!=0|true))||(__CLR4_4_18z18z1kcq4svtv.R.iget(11648)==0&false)); i--) {{
                __CLR4_4_18z18z1kcq4svtv.R.inc(11649);assertEquals(Float.valueOf(i), list.get(10 - i));
            }
        }}
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testStepChecking() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iejfb58zm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testStepChecking",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iejfb58zm(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11650);
        {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11651);Ranges.floatRange(2, 2, 0); // step of 0 is ok when range is empty
        }
        {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11652);Ranges.floatRange(2, 2, 1); // positive step is ok when range is
                                         // empty
        }
        {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11653);Ranges.floatRange(2, 2, -1); // negative step is ok when range is
                                          // empty
        }
        {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11654);Ranges.floatRange(0, 1, 10); // big steps are ok
        }
        {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11655);Ranges.floatRange(1, 0, -10); // big steps are ok
        }
        __CLR4_4_18z18z1kcq4svtv.R.inc(11656);try {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11657);Ranges.floatRange(0, 1, 0);
            __CLR4_4_18z18z1kcq4svtv.R.inc(11658);fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        __CLR4_4_18z18z1kcq4svtv.R.inc(11659);try {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11660);Ranges.floatRange(0, 1, -1);
            __CLR4_4_18z18z1kcq4svtv.R.inc(11661);fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        __CLR4_4_18z18z1kcq4svtv.R.inc(11662);try {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11663);Ranges.floatRange(0, -1, 1);
            __CLR4_4_18z18z1kcq4svtv.R.inc(11664);fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testObjectConstructor() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17io3rk901();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testObjectConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17io3rk901(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11665);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11666);FloatRange range = Ranges.floatRange(Float.valueOf(0), Float.valueOf(5));
        __CLR4_4_18z18z1kcq4svtv.R.inc(11667);assertEquals("[0.0, 1.0, 2.0, 3.0, 4.0]", IteratorToGeneratorAdapter.adapt(range).toCollection()
            .toString());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11668);range = Ranges.floatRange(Float.valueOf(0), Float.valueOf(5), Float.valueOf(1));
        __CLR4_4_18z18z1kcq4svtv.R.inc(11669);assertEquals("[0.0, 1.0, 2.0, 3.0, 4.0]", IteratorToGeneratorAdapter.adapt(range).toCollection()
            .toString());
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testReverseStep() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wsfo2r906();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testReverseStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wsfo2r906(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11670);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11671);FloatRange range = Ranges.floatRange(10, 0, -2);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11672);assertEquals("[10.0, 8.0, 6.0, 4.0, 2.0]", IteratorToGeneratorAdapter.adapt(range).toCollection()
            .toString());
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testStep() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zeikn9909();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zeikn9909(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11673);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11674);FloatRange range = Ranges.floatRange(0, 10, 2);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11675);assertEquals("[0.0, 2.0, 4.0, 6.0, 8.0]", IteratorToGeneratorAdapter.adapt(range).toCollection()
            .toString());
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testForwardRange() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ml8d9t90c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testForwardRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ml8d9t90c(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11676);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11677);FloatRange range = Ranges.floatRange(0, 5);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11678);assertEquals("[0.0, 1.0, 2.0, 3.0, 4.0]", IteratorToGeneratorAdapter.adapt(range).toCollection()
            .toString());
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testReverseRange() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekuvjg90f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testReverseRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekuvjg90f(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11679);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11680);FloatRange range = Ranges.floatRange(5, 0);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11681);assertEquals("[5.0, 4.0, 3.0, 2.0, 1.0]", IteratorToGeneratorAdapter.adapt(range).toCollection()
            .toString());
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testClosedClosedAscending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r33r5790i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testClosedClosedAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r33r5790i(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11682);
        // [-5.0f, 5.0f], 3.0f = -5.0f, -2.0f, 1.0f, 4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11683);FloatRange range = Ranges.floatRange(-5.0f, BoundType.CLOSED, 5.0f,
                                          BoundType.CLOSED, 3.0f);
        // [-5.0f, 5.0f], 3.0f = -5.0f, -2.0f, 1.0f, 4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11684);List<Float> expected = Arrays.asList(-5.0f, -2.0f, 1.0f, 4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11685);Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11686);assertEquals(expected, elements);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testOpenClosedAscending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1amzjbd90n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testOpenClosedAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1amzjbd90n(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11687);
        // (-5.0f, 5.0f], 3.0f = -2.0f, 1.0f, 4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11688);FloatRange range = Ranges.floatRange(-5.0f, BoundType.OPEN, 5.0f,
                                          BoundType.CLOSED, 3.0f);
        // (-5.0f, 5.0f], 3.0f = -2.0f, 1.0f, 4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11689);List<Float> expected = Arrays.asList(-2.0f, 1.0f, 4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11690);Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11691);assertEquals(expected, elements);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testClosedOpenAscending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b8ensn90s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testClosedOpenAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b8ensn90s(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11692);
        // [-5.0f, 5.0f), 3.0f = -5.0f, -2.0f, 1.0f, 4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11693);FloatRange range = Ranges.floatRange(-5.0f, BoundType.CLOSED, 5.0f,
                                          BoundType.OPEN, 3.0f);
        // (-5.0f, 5.0f], 3.0f = -5.0f, -2.0f, 1.0f, 4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11694);List<Float> expected = Arrays.asList(-5.0f, -2.0f, 1.0f, 4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11695);Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11696);assertEquals(expected, elements);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testOpenOpenAscending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xn9st590x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testOpenOpenAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xn9st590x(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11697);
        // (-5.0f, 5.0f), 3.0f = -2.0f, 1.0f, 4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11698);FloatRange range = Ranges.floatRange(-5.0f, BoundType.OPEN, 5.0f,
                                          BoundType.OPEN, 3.0f);
        // (-5.0f, 5.0f), 3.0f = -2.0f, 1.0f, 4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11699);List<Float> expected = Arrays.asList(-2.0f, 1.0f, 4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11700);Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11701);assertEquals(expected, elements);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testSingleStepAscending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dbhev912();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testSingleStepAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dbhev912(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11702);
        // (-2.0f, 2.0f], 1.0f = -1.0f, 0.0f, 1.0f, 2.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11703);FloatRange range = Ranges.floatRange(-2.0f, BoundType.OPEN, 2.0f,
                                          BoundType.CLOSED, 1.0f);
        // (-2.0f, 2.0f], 1.0f = -1.0f, 0.0f, 1.0f, 2.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11704);List<Float> expected = Arrays.asList(-1.0f, 0.0f, 1.0f, 2.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11705);Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11706);assertEquals(expected, elements);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testClosedClosedDescending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o63c5l917();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testClosedClosedDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o63c5l917(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11707);
        // [5.0f, -5.0f], -3.0f = 5.0f, 2.0f, -1.0f, -4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11708);FloatRange range = Ranges.floatRange(5.0f, BoundType.CLOSED, -5.0f,
                                          BoundType.CLOSED, -3.0f);
        // [5.0f, -5.0f], -3.0f = 5.0f, 2.0f, -1.0f, -4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11709);List<Float> expected = Arrays.asList(5.0f, 2.0f, -1.0f, -4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11710);Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11711);assertEquals(expected, elements);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testOpenClosedDescending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y76cyh91c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testOpenClosedDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y76cyh91c(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11712);
        // (5.0f, -5.0f], -3.0f = 2.0f, -1.0f, -4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11713);FloatRange range = Ranges.floatRange(5.0f, BoundType.OPEN, -5.0f,
                                          BoundType.CLOSED, -3.0f);
        // (5.0f, -5.0f], -3.0f = 2.0f, -1.0f, -4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11714);List<Float> expected = Arrays.asList(2.0f, -1.0f, -4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11715);Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11716);assertEquals(expected, elements);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testClosedOpenDescending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14k19pj91h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testClosedOpenDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14k19pj91h(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11717);
        // [5.0f, -5.0f), -3.0f = 5.0f, 2.0f, -1.0f, -4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11718);FloatRange range = Ranges.floatRange(5.0f, BoundType.CLOSED, -5.0f,
                                          BoundType.OPEN, -3.0f);
        // [5.0f, -5.0f), -3.0f = 5.0f, 2.0f, -1.0f, -4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11719);List<Float> expected = Arrays.asList(5.0f, 2.0f, -1.0f, -4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11720);Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11721);assertEquals(expected, elements);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testOpenOpenDescending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ay9ym391m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testOpenOpenDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ay9ym391m(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11722);
        // (5.0f, -5.0f), -3.0f = 2.0f, -1.0f, -4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11723);FloatRange range = Ranges.floatRange(5.0f, BoundType.OPEN, -5.0f,
                                          BoundType.OPEN, -3.0f);
        // (5.0f, -5.0f), -3.0f = 2.0f, -1.0f, -4.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11724);List<Float> expected = Arrays.asList(2.0f, -1.0f, -4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11725);Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11726);assertEquals(expected, elements);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testSingleStepDescending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13wkry391r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testSingleStepDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13wkry391r(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11727);
        // [2.0f, -2.0f), -1.0f = 2.0f, 1.0f, 0.0f, -1.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11728);FloatRange range = Ranges.floatRange(2.0f, BoundType.CLOSED, -2.0f,
                                          BoundType.OPEN, -1.0f);
        // [2.0f, -2.0f), -1.0f = 2.0f, 1.0f, 0.0f, -1.0f
        __CLR4_4_18z18z1kcq4svtv.R.inc(11729);List<Float> expected = Arrays.asList(2.0f, 1.0f, 0.0f, -1.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11730);Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11731);assertEquals(expected, elements);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testAscending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4vjtf91w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4vjtf91w(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11732);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11733);final List<Float> list = new ArrayList<Float>();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11734);for (float f : ascFloatRange) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11735);list.add(f);
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11736);assertTrue(expectedAsc.containsAll(list));
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testDescending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19pdr8x921();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19pdr8x921(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11737);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11738);final List<Float> list = new ArrayList<Float>();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11739);for (float f : descFloatRange) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11740);list.add(f);
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11741);assertTrue(expectedDesc.containsAll(list));
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testToCollection() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ett1qq926();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testToCollection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ett1qq926(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11742);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11743);Collection<Float> ascCol = IteratorToGeneratorAdapter.adapt(ascFloatRange).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11744);assertEquals("Different collections", expectedAsc, ascCol);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11745);Collection<Float> descCol = IteratorToGeneratorAdapter.adapt(descFloatRange).toCollection();
        __CLR4_4_18z18z1kcq4svtv.R.inc(11746);assertEquals("Different collections", expectedDesc, descCol);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testTransformedGenerator() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mse9r92b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testTransformedGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mse9r92b(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11747);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11748);Float expected = 45.0f;
        __CLR4_4_18z18z1kcq4svtv.R.inc(11749);Float total = IteratorToGeneratorAdapter.adapt(ascFloatRange)
            .to(new Function<Generator<? extends Float>, Float>() {

                public Float evaluate(Generator<? extends Float> obj) {try{__CLR4_4_18z18z1kcq4svtv.R.inc(11750);
                    __CLR4_4_18z18z1kcq4svtv.R.inc(11751);Float total = 0.0f;
                    __CLR4_4_18z18z1kcq4svtv.R.inc(11752);for (Object element : obj.toCollection()) {{
                        __CLR4_4_18z18z1kcq4svtv.R.inc(11753);total += (Float) element;
                    }
                    }__CLR4_4_18z18z1kcq4svtv.R.inc(11754);return total;
                }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}
            });
        __CLR4_4_18z18z1kcq4svtv.R.inc(11755);assertEquals(expected, total);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11756);expected = 55.0f;
        __CLR4_4_18z18z1kcq4svtv.R.inc(11757);total = IteratorToGeneratorAdapter.adapt(descFloatRange)
            .to(new Function<Generator<? extends Float>, Float>() {

                public Float evaluate(Generator<? extends Float> obj) {try{__CLR4_4_18z18z1kcq4svtv.R.inc(11758);
                    __CLR4_4_18z18z1kcq4svtv.R.inc(11759);Float total = 0.0f;
                    __CLR4_4_18z18z1kcq4svtv.R.inc(11760);for (Object element : obj.toCollection()) {{
                        __CLR4_4_18z18z1kcq4svtv.R.inc(11761);total += (Float) element;
                    }
                    }__CLR4_4_18z18z1kcq4svtv.R.inc(11762);return total;
                }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}
            });
        __CLR4_4_18z18z1kcq4svtv.R.inc(11763);assertEquals(expected, total);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    // Range tests
    // ---------------------------------------------------------------
    
    @Test
    public void testEmptyRanges() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlg7c92s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testEmptyRanges",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlg7c92s(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11764);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11765);FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1,
                                           BoundType.OPEN, 2);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11766);assertTrue("The range was expected to be empty.", empty1.isEmpty());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11767);FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0,
                                           BoundType.OPEN, -2);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11768);assertTrue("The range was expected to be empty.", empty2.isEmpty());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11769);FloatRange empty3 = Ranges.floatRange(0, BoundType.OPEN, 1,
                                           BoundType.CLOSED, 2);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11770);assertTrue("The range was expected to be empty.", empty3.isEmpty());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11771);FloatRange empty4 = Ranges.floatRange(-3, BoundType.OPEN, -3,
                                           BoundType.OPEN, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11772);assertTrue("The range was expected to be empty.", empty4.isEmpty());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11773);FloatRange empty5 = Ranges.floatRange(-3, BoundType.CLOSED, -3,
                                           BoundType.OPEN, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11774);assertTrue("The range was expected to be empty.", empty5.isEmpty());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11775);FloatRange empty6 = Ranges.floatRange(1, BoundType.OPEN, 0,
                                           BoundType.CLOSED, -2);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11776);assertTrue("The range was expected to be empty.", empty6.isEmpty());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11777);FloatRange notEmpty1 = Ranges.floatRange(-3, BoundType.CLOSED, -3,
                                              BoundType.CLOSED, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11778);assertFalse("The range was not expected to be empty.",
                    notEmpty1.isEmpty());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11779);FloatRange notEmpty2 = Ranges.floatRange(-3, BoundType.OPEN, -2,
                                              BoundType.CLOSED, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11780);assertFalse("The range was not expected to be empty.",
                    notEmpty2.isEmpty());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11781);FloatRange notEmpty3 = Ranges.floatRange(2, BoundType.OPEN, 1,
                                              BoundType.CLOSED, -1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11782);assertFalse("The range was not expected to be empty.",
                    notEmpty3.isEmpty());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11783);FloatRange notEmpty4 = Ranges.floatRange(2, BoundType.CLOSED, 1,
                                              BoundType.OPEN, -1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11784);assertFalse("The range was not expected to be empty.",
                    notEmpty4.isEmpty());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11785);FloatRange notEmpty5 = Ranges.floatRange(1, BoundType.CLOSED, 2,
                                              BoundType.OPEN, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11786);assertFalse("The range was not expected to be empty.",
                    notEmpty5.isEmpty());
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testBoundaries() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lisq6993f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testBoundaries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lisq6993f(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11787);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11788);FloatRange range = Ranges.floatRange(0.0f, 10.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11789);assertEquals(new Endpoint<Comparable<?>>(0.0f, BoundType.CLOSED),
                     range.getLeftEndpoint());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11790);assertEquals(new Endpoint<Comparable<?>>(10.0f, BoundType.OPEN),
                     range.getRightEndpoint());
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testClosedClosedAscendingContains() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16x8bm493j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testClosedClosedAscendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16x8bm493j(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11791);
        // [-5, 5], 3 = -5, -2, 1, 4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11792);FloatRange range = Ranges.floatRange(-5, BoundType.CLOSED, 5,
                                          BoundType.CLOSED, 3);
        // [-5, 5], 3 = -5, -2, 1, 4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11793);List<Float> arr = Arrays.asList(-5.0f, -2.0f, 1.0f, 4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11794);for (Float element : arr) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11795);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11796);List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11797);elementsNotPresent.removeAll(arr);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11798);for (Float element : elementsNotPresent) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11799);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testOpenClosedAscendingContains() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198ttxy93s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testOpenClosedAscendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198ttxy93s(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11800);
        // (-5, 5], 3 = -2, 1, 4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11801);FloatRange range = Ranges.floatRange(-5, BoundType.OPEN, 5,
                                          BoundType.CLOSED, 3);
        // (-5, 5], 3 = -2, 1, 4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11802);List<Float> arr = Arrays.asList(-2.0f, 1.0f, 4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11803);for (Float element : arr) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11804);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11805);List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11806);elementsNotPresent.removeAll(arr);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11807);for (Float element : elementsNotPresent) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11808);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testClosedOpenAscendingContains() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grodw6941();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testClosedOpenAscendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grodw6941(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11809);
        // [-5, 5), 3 = -5, -2, 1, 4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11810);FloatRange range = Ranges.floatRange(-5, BoundType.CLOSED, 5,
                                          BoundType.OPEN, 3);
        // (-5, 5], 3 = -5, -2, 1, 4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11811);List<Float> arr = Arrays.asList(-5.0f, -2.0f, 1.0f, 4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11812);for (Float element : arr) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11813);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11814);List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11815);elementsNotPresent.removeAll(arr);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11816);for (Float element : elementsNotPresent) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11817);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testOpenOpenAscendingContains() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156iut494a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testOpenOpenAscendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156iut494a(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11818);
        // (-5, 5), 3 = -2, 1, 4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11819);FloatRange range = Ranges.floatRange(-5, BoundType.OPEN, 5,
                                          BoundType.OPEN, 3);
        // (-5, 5), 3 = -2, 1, 4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11820);List<Float> arr = Arrays.asList(-2.0f, 1.0f, 4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11821);for (Float element : arr) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11822);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11823);List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11824);elementsNotPresent.removeAll(arr);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11825);for (Float element : elementsNotPresent) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11826);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testContainsSingleStepAscending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9vwbe94j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testContainsSingleStepAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9vwbe94j(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11827);
        // (-2, 2], 1 = -1, 0, 1, 2
        __CLR4_4_18z18z1kcq4svtv.R.inc(11828);FloatRange ascendingRange = Ranges.floatRange(-2, BoundType.OPEN, 2,
                                                   BoundType.CLOSED, 1);
        // (-2, 2], 1 = -1, 0, 1, 2
        __CLR4_4_18z18z1kcq4svtv.R.inc(11829);List<Float> arr = Arrays.asList(-1.0f, 0.0f, 1.0f, 2.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11830);for (Float element : arr) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11831);assertTrue("Expected element [" + element +
                               "] is missing in range [" + ascendingRange + "]",
                       ascendingRange.contains(element));
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11832);List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11833);elementsNotPresent.removeAll(arr);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11834);for (Float element : elementsNotPresent) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11835);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + ascendingRange +
                                "]",
                        ascendingRange.contains(element));
        }
    }}finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testClosedClosedDescendingContains() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rfbu0894s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testClosedClosedDescendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rfbu0894s(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11836);
        // [5, -5], -3 = 5, 2, -1, -4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11837);FloatRange range = Ranges.floatRange(5, BoundType.CLOSED, -5,
                                          BoundType.CLOSED, -3);
        // [5, -5], -3 = 5, 2, -1, -4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11838);List<Float> arr = Arrays.asList(5.0f, 2.0f, -1.0f, -4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11839);for (Float element : arr) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11840);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11841);List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11842);elementsNotPresent.removeAll(arr);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11843);for (Float element : elementsNotPresent) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11844);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testOpenClosedDescendingContains() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfe8g6951();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testOpenClosedDescendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfe8g6951(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11845);
        // (5, -5], -3 = 2, -1, -4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11846);FloatRange range = Ranges.floatRange(5, BoundType.OPEN, -5,
                                          BoundType.CLOSED, -3);
        // (5, -5], -3 = 2, -1, -4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11847);List<Float> arr = Arrays.asList(2.0f, -1.0f, -4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11848);for (Float element : arr) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11849);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11850);List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11851);elementsNotPresent.removeAll(arr);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11852);for (Float element : elementsNotPresent) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11853);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testClosedOpenDescendingContains() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgqsze95a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testClosedOpenDescendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgqsze95a(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11854);
        // [5, -5), -3 = 5, 2, -1, -4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11855);FloatRange range = Ranges.floatRange(5, BoundType.CLOSED, -5,
                                          BoundType.OPEN, -3);
        // [5, -5), -3 = 5, 2, -1, -4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11856);List<Float> arr = Arrays.asList(5.0f, 2.0f, -1.0f, -4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11857);for (Float element : arr) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11858);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11859);List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11860);elementsNotPresent.removeAll(arr);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11861);for (Float element : elementsNotPresent) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11862);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testOpenOpenDescendingContains() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nixyqk95j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testOpenOpenDescendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nixyqk95j(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11863);
        // (5, -5), -3 = 2, -1, -4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11864);FloatRange range = Ranges.floatRange(5, BoundType.OPEN, -5,
                                          BoundType.OPEN, -3);
        // (5, -5), -3 = 2, -1, -4
        __CLR4_4_18z18z1kcq4svtv.R.inc(11865);List<Float> arr = Arrays.asList(2.0f, -1.0f, -4.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11866);for (Float element : arr) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11867);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11868);List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11869);elementsNotPresent.removeAll(arr);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11870);for (Float element : elementsNotPresent) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11871);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testContainsSingleStepDescending() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p64e5895s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testContainsSingleStepDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p64e5895s(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11872);
        // [2, -2), -1 = 2, 1, 0, -1
        __CLR4_4_18z18z1kcq4svtv.R.inc(11873);FloatRange descendingRange = Ranges.floatRange(2, BoundType.CLOSED, -2,
                                                    BoundType.OPEN, -1);
        // [2, -2), -1 = 2, 1, 0, -1
        __CLR4_4_18z18z1kcq4svtv.R.inc(11874);List<Float> arr = Arrays.asList(2.0f, 1.0f, 0.0f, -1.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11875);for (Float element : arr) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11876);assertTrue("Expected element [" + element +
                               "] is missing in range [" + descendingRange +
                               "]",
                       descendingRange.contains(element));
        }
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11877);List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11878);elementsNotPresent.removeAll(arr);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11879);for (Float element : elementsNotPresent) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11880);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + descendingRange +
                                "]",
                        descendingRange.contains(element));
        }
    }}finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testContainsNullOrEmpty() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnnvh5961();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testContainsNullOrEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnnvh5961(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11881);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11882);FloatRange range = Ranges.floatRange(-2, BoundType.OPEN, 2,
                                          BoundType.CLOSED, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11883);assertFalse(range.contains(null));
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    @Test
    public void testContainsAll() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uiiq8n964();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testContainsAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uiiq8n964(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11884);
        // (-2, 2], 1 = -1, 0, 1, 2
        __CLR4_4_18z18z1kcq4svtv.R.inc(11885);FloatRange range = Ranges.floatRange(-2, BoundType.OPEN, 2,
                                          BoundType.CLOSED, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11886);List<Float> list = Arrays.asList(-1.0f, 0.0f, 1.0f, 2.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11887);assertTrue("Range [" + range +
                   "] was expected to contain all elements from list [" + list +
                   "]", range.containsAll(list));
        __CLR4_4_18z18z1kcq4svtv.R.inc(11888);List<Float> listWithExtraElements = Arrays.asList(2.0f, -1.0f, 0.0f,
                                                          1.0f, 2.0f, 3.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11889);assertFalse("Range [" + range + "] has more elements than expected",
                    range.containsAll(listWithExtraElements));
        __CLR4_4_18z18z1kcq4svtv.R.inc(11890);assertFalse(range.containsAll(null));
        __CLR4_4_18z18z1kcq4svtv.R.inc(11891);assertFalse(range.containsAll(Collections.EMPTY_LIST));
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testEquals()
        throws Exception {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60896c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60896c() throws Exception{try{__CLR4_4_18z18z1kcq4svtv.R.inc(11892);
        // equals basic properties
        __CLR4_4_18z18z1kcq4svtv.R.inc(11893);FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2,
                                          BoundType.OPEN, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11894);assertEquals("equals must be reflexive", range, range);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11895);assertEquals("hashCode must be reflexive", range.hashCode(),
                     range.hashCode());
        __CLR4_4_18z18z1kcq4svtv.R.inc(11896);assertTrue(!range.equals(null)); // should be able to compare to null

        __CLR4_4_18z18z1kcq4svtv.R.inc(11897);Object range2 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN,
                                       1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11898);if ((((range.equals(range2))&&(__CLR4_4_18z18z1kcq4svtv.R.iget(11899)!=0|true))||(__CLR4_4_18z18z1kcq4svtv.R.iget(11900)==0&false))) {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11901);assertEquals("equals implies hash equals", range.hashCode(),
                         range2.hashCode());
            __CLR4_4_18z18z1kcq4svtv.R.inc(11902);assertEquals("equals must be symmetric", range2, range);
        } }else {{
            __CLR4_4_18z18z1kcq4svtv.R.inc(11903);assertTrue("equals must be symmetric", !range2.equals(range));
        }

        // Changing attributes
        }__CLR4_4_18z18z1kcq4svtv.R.inc(11904);Object range3 = Ranges.floatRange(-1, BoundType.CLOSED, 2, BoundType.OPEN,
                                       1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11905);assertFalse("Invalid equals after changing attributes",
                    range.equals(range3));

        __CLR4_4_18z18z1kcq4svtv.R.inc(11906);Object range4 = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11907);assertFalse("Invalid equals after changing attributes",
                    range.equals(range4));

        __CLR4_4_18z18z1kcq4svtv.R.inc(11908);Object range5 = Ranges.floatRange(-2, BoundType.CLOSED, 1, BoundType.OPEN,
                                       1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11909);assertFalse("Invalid equals after changing attributes",
                    range.equals(range5));

        __CLR4_4_18z18z1kcq4svtv.R.inc(11910);Object range6 = Ranges.floatRange(-2, BoundType.CLOSED, 2,
                                       BoundType.CLOSED, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11911);assertFalse("Invalid equals after changing attributes",
                    range.equals(range6));

        __CLR4_4_18z18z1kcq4svtv.R.inc(11912);Object range7 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN,
                                       2);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11913);assertFalse("Invalid equals after changing attributes",
                    range.equals(range7));

        // Using different constructors
        __CLR4_4_18z18z1kcq4svtv.R.inc(11914);FloatRange range8 = Ranges.floatRange(Long.valueOf(-2), Long.valueOf(2),
                                           Long.valueOf(1));
        __CLR4_4_18z18z1kcq4svtv.R.inc(11915);assertEquals("Invalid equals using different constructor", range,
                     range8);

        __CLR4_4_18z18z1kcq4svtv.R.inc(11916);FloatRange range9 = Ranges.floatRange(Long.valueOf(-2), Long.valueOf(2));
        __CLR4_4_18z18z1kcq4svtv.R.inc(11917);assertEquals("Invalid equals using different constructor", range,
                     range9);

        __CLR4_4_18z18z1kcq4svtv.R.inc(11918);Endpoint<Float> leftEndpoint = new Endpoint<Float>(-2.0f,
                                                           BoundType.CLOSED);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11919);Endpoint<Float> rightEndpoint = new Endpoint<Float>(2.0f,
                                                            BoundType.OPEN);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11920);FloatRange range10 = Ranges.floatRange(leftEndpoint, rightEndpoint, 1.0f);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11921);assertEquals("Invalid equals using different constructor", range,
                     range10);
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid976();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid976(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11922);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11923);FloatRange range = Ranges.floatRange(-2, BoundType.OPEN, 2,
                                          BoundType.CLOSED, 1);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11924);assertEquals("Wrong string value", "FloatRange<(-2.0, 2.0], 1.0>",
                     range.toString());
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testConstructorUsingSameEndpoint() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6pvy6979();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testConstructorUsingSameEndpoint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6pvy6979(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11925);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11926);Endpoint<Float> uniqueEndpoint = new Endpoint<Float>(10.0f,
                                                             BoundType.CLOSED);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11927);try {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11928);Ranges.floatRange(uniqueEndpoint, uniqueEndpoint, 1.0f);
        } catch (IllegalArgumentException e) {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11929);fail("Not expected to get here");
        }
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testInvalidRange() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fiycn397e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testInvalidRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fiycn397e(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11930);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11931);try {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11932);Ranges.floatRange(10.0f, BoundType.OPEN, -5.0f, BoundType.CLOSED,
                           10.0f);
            __CLR4_4_18z18z1kcq4svtv.R.inc(11933);fail("Not expected to get here");
        } catch (IllegalArgumentException e) {
            // Do nothing
        }
        __CLR4_4_18z18z1kcq4svtv.R.inc(11934);Endpoint<Float> leftEndpoint = new Endpoint<Float>(10.0f,
                                                           BoundType.CLOSED);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11935);Endpoint<Float> rightEndpoint = new Endpoint<Float>(-5.0f,
                                                            BoundType.OPEN);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11936);try {
            __CLR4_4_18z18z1kcq4svtv.R.inc(11937);Ranges.floatRange(leftEndpoint, rightEndpoint, 1.0f);
            __CLR4_4_18z18z1kcq4svtv.R.inc(11938);fail("Not expected to get here");
        } catch (IllegalArgumentException e) {
            // Do nothing
        }
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

    @Test
    public void testDefaultStep() {__CLR4_4_18z18z1kcq4svtv.R.globalSliceStart(getClass().getName(),11939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i27fky97n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18z18z1kcq4svtv.R.rethrow($CLV_t2$);}finally{__CLR4_4_18z18z1kcq4svtv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestFloatRange.testDefaultStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i27fky97n(){try{__CLR4_4_18z18z1kcq4svtv.R.inc(11939);
        __CLR4_4_18z18z1kcq4svtv.R.inc(11940);assertEquals("Invalid default step", Float.valueOf(-1.0f),
                     FloatRange.DEFAULT_STEP.evaluate(10.0f, 1.0f));
        __CLR4_4_18z18z1kcq4svtv.R.inc(11941);assertEquals("Invalid default step", Float.valueOf(1.0f),
                     FloatRange.DEFAULT_STEP.evaluate(1.0f, 10.0f));
    }finally{__CLR4_4_18z18z1kcq4svtv.R.flushNeeded();}}

}