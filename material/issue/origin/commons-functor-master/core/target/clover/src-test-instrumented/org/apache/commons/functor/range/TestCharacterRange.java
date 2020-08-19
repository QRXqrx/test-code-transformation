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
 * @version $Revision: $ $Date: $
 */
public class TestCharacterRange extends BaseFunctorTest {static class __CLR4_4_18hb8hbkcq4svqq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,11289,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // A base range with all chars between a and m
    private final List<Character> fullRange = Collections.unmodifiableList(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'));

    // Attributes
    // ------------------------------------------------------------------------

    private CharacterRange ascCharRange = null;
    private CharacterRange descCharRange = null;
    private Collection<Character> expectedAsc = null;
    private Collection<Character> expectedDesc = null;
    
    // Test set up
    // ------------------------------------------------------------------------
    @Before
    public void setUp() {try{__CLR4_4_18hb8hbkcq4svqq.R.inc(10991);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(10992);ascCharRange = Ranges.characterRange('b', 'k');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(10993);descCharRange = Ranges.characterRange('k', 'b');
    	__CLR4_4_18hb8hbkcq4svqq.R.inc(10994);expectedAsc = Arrays.asList('b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k');
    	__CLR4_4_18hb8hbkcq4svqq.R.inc(10995);expectedDesc = Arrays.asList('k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b');
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}
    
    @After
    public void tearDown() {try{__CLR4_4_18hb8hbkcq4svqq.R.inc(10996);
    	__CLR4_4_18hb8hbkcq4svqq.R.inc(10997);ascCharRange = null;
    	__CLR4_4_18hb8hbkcq4svqq.R.inc(10998);descCharRange = null;
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}
    
    @Override
    protected Object makeFunctor()
        throws Exception {try{__CLR4_4_18hb8hbkcq4svqq.R.inc(10999);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11000);return Ranges.characterRange('b', 'k');
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    // Generator tests
    // ---------------------------------------------------------------

    @Test
    public void testStepChecking() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iejfb58hl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testStepChecking",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iejfb58hl(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11001);
        {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11002);Ranges.characterRange('b', 'b', 0); // step of 0 is ok when range is
                                             // empty
        }
        {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11003);Ranges.characterRange('b', 'b', 1); // positive step is ok when range
                                             // is empty
        }
        {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11004);Ranges.characterRange('b', 'b', -1); // negative step is ok when range
                                              // is empty
        }
        {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11005);Ranges.characterRange('a', 'b', 10); // big steps are ok
        }
        {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11006);Ranges.characterRange('b', 'a', -10); // big steps are ok
        }
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11007);try {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11008);Ranges.characterRange('a', 'b', 0);
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11009);fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11010);try {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11011);Ranges.characterRange('a', 'b', -1);
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11012);fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11013);try {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11014);Ranges.characterRange('b', 'a', 1);
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11015);fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testObjectConstructor() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17io3rk8i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testObjectConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17io3rk8i0(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11016);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11017);CharacterRange range = Ranges.characterRange(Character.valueOf('a'),
                                                     Character.valueOf('e'));
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11018);assertEquals("[a, b, c, d, e]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11019);range = Ranges.characterRange(Character.valueOf('a'), Character.valueOf('e'),
                                      Integer.valueOf(1));
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11020);assertEquals("[a, b, c, d, e]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testReverseStep() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wsfo2r8i5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testReverseStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wsfo2r8i5(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11021);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11022);CharacterRange range = Ranges.characterRange('k', 'a', -2);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11023);assertEquals("[k, i, g, e, c, a]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testStep() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zeikn98i8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zeikn98i8(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11024);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11025);CharacterRange range = Ranges.characterRange('a', 'k', 2);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11026);assertEquals("[a, c, e, g, i, k]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testForwardRange() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ml8d9t8ib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testForwardRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ml8d9t8ib(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11027);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11028);CharacterRange range = Ranges.characterRange('a', 'e');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11029);assertEquals("[a, b, c, d, e]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testReverseRange() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekuvjg8ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testReverseRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekuvjg8ie(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11030);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11031);CharacterRange range = Ranges.characterRange('e', 'a');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11032);assertEquals("[e, d, c, b, a]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    // @Test
    // public void testEdgeCase() {
    // CharacterRange range = Ranges.characterRange(Character.MAX_VALUE-3,
    // Character.MAX_VALUE);
    // assertEquals("[2147483644, 2147483645, 2147483646]",
    // IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    // assertEquals("[2147483644, 2147483645, 2147483646]",
    // IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    // }

    @Test
    public void testBoundaries() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lisq698ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testBoundaries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lisq698ih(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11033);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11034);CharacterRange range = Ranges.characterRange('b', 'l');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11035);assertEquals(new Endpoint<Comparable<?>>('b', BoundType.CLOSED),
                     range.getLeftEndpoint());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11036);assertEquals(new Endpoint<Comparable<?>>('l', BoundType.CLOSED),
                     range.getRightEndpoint());
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testClosedClosedAscending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r33r578il();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testClosedClosedAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r33r578il(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11037);
        // [b, l], 3 = b, e, h, k
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11038);CharacterRange range =  Ranges.characterRange('b', BoundType.CLOSED, 'l', BoundType.CLOSED, 3);
        // [b, l], 3 = b, e, h, k
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11039);List<Character> expected = Arrays.asList('b', 'e', 'h', 'k');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11040);Collection<Character> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11041);assertEquals(expected, elements);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testOpenClosedAscending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1amzjbd8iq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testOpenClosedAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1amzjbd8iq(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11042);
        // (b, l], 3 = e, h, k
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11043);CharacterRange range =  Ranges.characterRange('b', BoundType.OPEN, 'l', BoundType.CLOSED, 3);
        // (b, l], 3 = e, h, k
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11044);List<Character> expected = Arrays.asList('e', 'h', 'k');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11045);Collection<Character> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11046);assertEquals(expected, elements);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testClosedOpenAscending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b8ensn8iv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testClosedOpenAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b8ensn8iv(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11047);
        // [b, l), 3 = b, e, h, k
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11048);CharacterRange range =  Ranges.characterRange('b', BoundType.CLOSED, 'l', BoundType.OPEN, 3);
        // [b, l), 3 = b, e, h, k
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11049);List<Character> expected = Arrays.asList('b', 'e', 'h', 'k');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11050);Collection<Character> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11051);assertEquals(expected, elements);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testOpenOpenAscending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xn9st58j0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testOpenOpenAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xn9st58j0(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11052);
        // (b, l), 3 = e, h, k
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11053);CharacterRange range =  Ranges.characterRange('b', BoundType.OPEN, 'l', BoundType.OPEN, 3);
        // (b, l), 3 = e, h, k
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11054);List<Character> expected = Arrays.asList('e', 'h', 'k');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11055);Collection<Character> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11056);assertEquals(expected, elements);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testSingleStepAscending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dbhev8j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testSingleStepAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dbhev8j5(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11057);
        // (d, h], 1 = e, f, g, h
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11058);CharacterRange range =  Ranges.characterRange('d', BoundType.OPEN, 'h', BoundType.CLOSED, 1);
        // (d, h], 1 = e, f, g, h
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11059);List<Character> expected = Arrays.asList('e', 'f', 'g', 'h');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11060);Collection<Character> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11061);assertEquals(expected, elements);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testClosedClosedDescending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o63c5l8ja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testClosedClosedDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o63c5l8ja(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11062);
        // [l, b], -3 = l, i, f, c
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11063);CharacterRange range = Ranges.characterRange('l', BoundType.CLOSED, 'b',
                                                  BoundType.CLOSED, -3);
        // [l, b], -3 = l, i, f, c
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11064);List<Character> expected = Arrays.asList('l', 'i', 'f', 'c');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11065);Collection<Character> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11066);assertEquals(expected, elements);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testOpenClosedDescending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y76cyh8jf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testOpenClosedDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y76cyh8jf(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11067);
        // (l, b], -3 = i, f, c
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11068);CharacterRange range = Ranges.characterRange('l', BoundType.OPEN, 'b',
                                                  BoundType.CLOSED, -3);
        // (l, b], -3 = i, f, c
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11069);List<Character> expected = Arrays.asList('i', 'f', 'c');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11070);Collection<Character> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11071);assertEquals(expected, elements);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testClosedOpenDescending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14k19pj8jk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testClosedOpenDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14k19pj8jk(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11072);
        // [l, b), -3 = l, i, f, c
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11073);CharacterRange range = Ranges.characterRange('l', BoundType.CLOSED, 'b',
                                                  BoundType.OPEN, -3);
        // [l, b), -3 = l, i, f, c
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11074);List<Character> expected = Arrays.asList('l', 'i', 'f', 'c');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11075);Collection<Character> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11076);assertEquals(expected, elements);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testOpenOpenDescending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ay9ym38jp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testOpenOpenDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ay9ym38jp(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11077);
        // (l, b), -3 = i, f, c
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11078);CharacterRange range = Ranges.characterRange('l', BoundType.OPEN, 'b',
                                                  BoundType.OPEN, -3);
        // (l, b), -3 = i, f, c
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11079);List<Character> expected = Arrays.asList('i', 'f', 'c');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11080);Collection<Character> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11081);assertEquals(expected, elements);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testSingleStepDescending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13wkry38ju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testSingleStepDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13wkry38ju(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11082);
        // [h, d), -1 = h, g, f
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11083);CharacterRange range = Ranges.characterRange('h', BoundType.CLOSED, 'e',
                                                  BoundType.OPEN, -1);
        // [h, d), -1 = h, g, f
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11084);List<Character> expected = Arrays.asList('h', 'g', 'f');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11085);Collection<Character> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11086);assertEquals(expected, elements);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testAscending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4vjtf8jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4vjtf8jz(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11087);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11088);final List<Character> list = new ArrayList<Character>();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11089);for (char c : ascCharRange) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11090);list.add(c);
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11091);assertTrue(expectedAsc.containsAll(list));
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testDescending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19pdr8x8k4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19pdr8x8k4(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11092);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11093);final List<Character> list = new ArrayList<Character>();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11094);for (char c : ascCharRange) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11095);list.add(c);
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11096);assertTrue(expectedDesc.containsAll(list));
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testToCollection() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ett1qq8k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testToCollection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ett1qq8k9(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11097);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11098);Collection<Character> ascCol = IteratorToGeneratorAdapter.adapt(ascCharRange).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11099);assertEquals("Different collections", expectedAsc, ascCol);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11100);Collection<Character> descCol = IteratorToGeneratorAdapter.adapt(descCharRange).toCollection();
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11101);assertEquals("Different collections", expectedDesc, descCol);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testTransformedGenerator() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mse9r8ke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testTransformedGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mse9r8ke(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11102);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11103);int expected = 10;
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11104);List<Character> list = IteratorToGeneratorAdapter.adapt(ascCharRange)
            .to(new Function<Generator<? extends Character>, List<Character>>() {

                public List<Character> evaluate(Generator<? extends Character> obj) {try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11105);
                    __CLR4_4_18hb8hbkcq4svqq.R.inc(11106);List<Character> chars = new ArrayList<Character>();
                    __CLR4_4_18hb8hbkcq4svqq.R.inc(11107);for (Object element : obj.toCollection()) {{
                        __CLR4_4_18hb8hbkcq4svqq.R.inc(11108);chars.add((Character) element);
                    }
                    }__CLR4_4_18hb8hbkcq4svqq.R.inc(11109);return chars;
                }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}
            });
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11110);assertEquals(expected, list.size());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11111);expected = 10;
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11112);list = IteratorToGeneratorAdapter.adapt(descCharRange)
            .to(new Function<Generator<? extends Character>, List<Character>>() {

                public List<Character> evaluate(Generator<? extends Character> obj) {try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11113);
                    __CLR4_4_18hb8hbkcq4svqq.R.inc(11114);List<Character> chars = new ArrayList<Character>();
                    __CLR4_4_18hb8hbkcq4svqq.R.inc(11115);for (Object element : obj.toCollection()) {{
                        __CLR4_4_18hb8hbkcq4svqq.R.inc(11116);chars.add((Character) element);
                    }
                    }__CLR4_4_18hb8hbkcq4svqq.R.inc(11117);return chars;
                }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}
            });
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11118);assertEquals(expected, list.size());
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    // Range tests
    // ---------------------------------------------------------------

    @Test
    public void testEmptyRanges() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlg7c8kv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testEmptyRanges",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlg7c8kv(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11119);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11120);CharacterRange empty1 = Ranges.characterRange('a', BoundType.OPEN, 'b',
                                                   BoundType.OPEN, 2);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11121);assertTrue("The range was expected to be empty.", empty1.isEmpty());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11122);CharacterRange empty2 = Ranges.characterRange('c', BoundType.OPEN, 'a',
                                                   BoundType.OPEN, -2);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11123);assertTrue("The range was expected to be empty.", empty2.isEmpty());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11124);CharacterRange empty3 = Ranges.characterRange('a', BoundType.OPEN, 'b',
                                                   BoundType.CLOSED, 2);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11125);assertTrue("The range was expected to be empty.", empty3.isEmpty());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11126);CharacterRange empty4 = Ranges.characterRange('a', BoundType.OPEN, 'a',
                                                   BoundType.OPEN, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11127);assertTrue("The range was expected to be empty.", empty4.isEmpty());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11128);CharacterRange empty5 = Ranges.characterRange('b', BoundType.CLOSED, 'b',
                                                   BoundType.OPEN, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11129);assertTrue("The range was expected to be empty.", empty5.isEmpty());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11130);CharacterRange empty6 = Ranges.characterRange('d', BoundType.OPEN, 'c',
                                                   BoundType.CLOSED, -2);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11131);assertTrue("The range was expected to be empty.", empty6.isEmpty());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11132);CharacterRange notEmpty1 = Ranges.characterRange('a', BoundType.CLOSED,
                                                      'a', BoundType.CLOSED, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11133);assertFalse("The range was not expected to be empty.",
                    notEmpty1.isEmpty());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11134);CharacterRange notEmpty2 = Ranges.characterRange('a', BoundType.OPEN, 'b',
                                                      BoundType.CLOSED, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11135);assertFalse("The range was not expected to be empty.",
                    notEmpty2.isEmpty());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11136);CharacterRange notEmpty3 = Ranges.characterRange('b', BoundType.OPEN, 'a',
                                                      BoundType.CLOSED, -1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11137);assertFalse("The range was not expected to be empty.",
                    notEmpty3.isEmpty());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11138);CharacterRange notEmpty4 = Ranges.characterRange('b', BoundType.CLOSED,
                                                      'a', BoundType.OPEN, -1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11139);assertFalse("The range was not expected to be empty.",
                    notEmpty4.isEmpty());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11140);CharacterRange notEmpty5 = Ranges.characterRange('a', BoundType.CLOSED,
                                                      'b', BoundType.OPEN, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11141);assertFalse("The range was not expected to be empty.",
                    notEmpty5.isEmpty());
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testClosedClosedAscendingContains() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16x8bm48li();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testClosedClosedAscendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16x8bm48li(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11142);
        // [b, l], 3 = 'b', 'e', 'h', 'k'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11143);CharacterRange range = Ranges.characterRange('b', BoundType.CLOSED, 'l',
                                                  BoundType.CLOSED, 3);
        // [b, l], 3 = 'b', 'e', 'h', 'k'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11144);List<Character> arr = Arrays.asList('b', 'e', 'h', 'k');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11145);for (Character element : arr) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11146);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11147);List<Character> elementsNotPresent = new ArrayList<Character>(fullRange);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11148);elementsNotPresent.removeAll(arr);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11149);for (Character element : elementsNotPresent) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11150);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testOpenClosedAscendingContains() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198ttxy8lr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testOpenClosedAscendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198ttxy8lr(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11151);
        // (b, l], 3 = 'e', 'h', 'k'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11152);CharacterRange range = Ranges.characterRange('b', BoundType.OPEN, 'l',
                                                  BoundType.CLOSED, 3);
        // (b, l], 3 = 'e', 'h', 'k'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11153);List<Character> arr = Arrays.asList('e', 'h', 'k');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11154);for (Character element : arr) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11155);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11156);List<Character> elementsNotPresent = new ArrayList<Character>(fullRange);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11157);elementsNotPresent.removeAll(arr);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11158);for (Character element : elementsNotPresent) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11159);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testClosedOpenAscendingContains() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grodw68m0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testClosedOpenAscendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grodw68m0(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11160);
        // [b, l), 3 = 'b', 'e', 'h', 'k'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11161);CharacterRange range = Ranges.characterRange('b', BoundType.CLOSED, 'l',
                                                  BoundType.OPEN, 3);
        // [b, l), 3 = 'b', 'e', 'h', 'k'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11162);List<Character> arr = Arrays.asList('b', 'e', 'h', 'k');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11163);for (Character element : arr) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11164);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11165);List<Character> elementsNotPresent = new ArrayList<Character>(fullRange);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11166);elementsNotPresent.removeAll(arr);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11167);for (Character element : elementsNotPresent) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11168);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testOpenOpenAscendingContains() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156iut48m9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testOpenOpenAscendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156iut48m9(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11169);
        // (b, l), 3 = 'e', 'h', 'k'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11170);CharacterRange range = Ranges.characterRange('b', BoundType.OPEN, 'l',
                                                  BoundType.OPEN, 3);
        // (b, l), 3 = 'e', 'h', 'k'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11171);List<Character> arr = Arrays.asList('e', 'h', 'k');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11172);for (Character element : arr) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11173);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11174);List<Character> elementsNotPresent = new ArrayList<Character>(fullRange);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11175);elementsNotPresent.removeAll(arr);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11176);for (Character element : elementsNotPresent) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11177);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testContainsSingleStepAscending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9vwbe8mi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testContainsSingleStepAscending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9vwbe8mi(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11178);
        // (b, l], 1 = 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11179);CharacterRange ascendingRange = Ranges.characterRange('b', BoundType.OPEN,
                                                           'l',
                                                           BoundType.CLOSED, 1);
        // (b, l], 1 = 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11180);List<Character> arr = Arrays.asList('c', 'd', 'e', 'f', 'g', 'h', 'i',
                                            'j', 'k', 'l');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11181);for (Character element : arr) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11182);assertTrue("Expected element [" + element +
                               "] is missing in range [" + ascendingRange + "]",
                       ascendingRange.contains(element));
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11183);List<Character> elementsNotPresent = new ArrayList<Character>(fullRange);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11184);elementsNotPresent.removeAll(arr);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11185);for (Character element : elementsNotPresent) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11186);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + ascendingRange +
                                "]",
                        ascendingRange.contains(element));
        }
    }}finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testClosedClosedDescendingContains() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rfbu088mr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testClosedClosedDescendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rfbu088mr(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11187);
        // [l, b], -3 = 'l', 'i', 'f', 'c'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11188);CharacterRange range = Ranges.characterRange('l', BoundType.CLOSED, 'b',
                                                  BoundType.CLOSED, -3);
        // [l, b], -3 = 'l', 'i', 'f', 'c'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11189);List<Character> arr = Arrays.asList('l', 'i', 'f', 'c');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11190);for (Character element : arr) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11191);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11192);List<Character> elementsNotPresent = new ArrayList<Character>(fullRange);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11193);elementsNotPresent.removeAll(arr);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11194);for (Character element : elementsNotPresent) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11195);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testOpenClosedDescendingContains() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfe8g68n0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testOpenClosedDescendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfe8g68n0(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11196);
        // (l, b], -3 = 'i', 'f', 'c'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11197);CharacterRange range = Ranges.characterRange('l', BoundType.OPEN, 'b',
                                                  BoundType.CLOSED, -3);
        // (l, b], -3 = 'i', 'f', 'c'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11198);List<Character> arr = Arrays.asList('i', 'f', 'c');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11199);for (Character element : arr) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11200);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11201);List<Character> elementsNotPresent = new ArrayList<Character>(fullRange);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11202);elementsNotPresent.removeAll(arr);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11203);for (Character element : elementsNotPresent) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11204);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testClosedOpenDescendingContains() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgqsze8n9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testClosedOpenDescendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgqsze8n9(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11205);
        // [l, b), -3 = 'l', 'i', 'f', 'c'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11206);CharacterRange range = Ranges.characterRange('l', BoundType.CLOSED, 'b',
                                                  BoundType.OPEN, -3);
        // [l, b), -3 = 'l', 'i', 'f', 'c'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11207);List<Character> arr = Arrays.asList('l', 'i', 'f', 'c');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11208);for (Character element : arr) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11209);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11210);List<Character> elementsNotPresent = new ArrayList<Character>(fullRange);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11211);elementsNotPresent.removeAll(arr);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11212);for (Character element : elementsNotPresent) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11213);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testOpenOpenDescendingContains() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nixyqk8ni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testOpenOpenDescendingContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nixyqk8ni(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11214);
        // (l, b), -3 = 'i', 'f', 'c'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11215);CharacterRange range = Ranges.characterRange('l', BoundType.OPEN, 'b',
                                                  BoundType.OPEN, -3);
        // (l, b), -3 = 'i', 'f', 'c'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11216);List<Character> arr = Arrays.asList('i', 'f', 'c');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11217);for (Character element : arr) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11218);assertTrue("Expected element [" + element +
                               "] is missing in range [" + range + "]",
                       range.contains(element));
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11219);List<Character> elementsNotPresent = new ArrayList<Character>(fullRange);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11220);elementsNotPresent.removeAll(arr);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11221);for (Character element : elementsNotPresent) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11222);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + range + "]",
                        range.contains(element));
        }
    }}finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testContainsSingleStepDescending() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p64e588nr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testContainsSingleStepDescending",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p64e588nr(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11223);
        // [l, b), -1 = 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11224);CharacterRange descendingRange = Ranges.characterRange('l',
                                                            BoundType.CLOSED,
                                                            'b',
                                                            BoundType.OPEN, -1);
        // [l, b), -1 = 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c'
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11225);List<Character> arr = Arrays.asList('l', 'k', 'j', 'i', 'h', 'g', 'f',
                                            'e', 'd', 'c');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11226);for (Character element : arr) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11227);assertTrue("Expected element [" + element +
                               "] is missing in range [" + descendingRange +
                               "]",
                       descendingRange.contains(element));
        }
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11228);List<Character> elementsNotPresent = new ArrayList<Character>(fullRange);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11229);elementsNotPresent.removeAll(arr);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11230);for (Character element : elementsNotPresent) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11231);assertFalse("Unexpected element [" + element +
                                "] is present in range [" + descendingRange +
                                "]",
                        descendingRange.contains(element));
        }
    }}finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testContainsNullOrEmpty() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnnvh58o0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testContainsNullOrEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnnvh58o0(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11232);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11233);CharacterRange range = Ranges.characterRange('a', BoundType.OPEN, 'r',
                                                  BoundType.CLOSED, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11234);assertFalse(range.contains(null));
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    @Test
    public void testContainsAll() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uiiq8n8o3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testContainsAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uiiq8n8o3(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11235);
        // (c, g], 1 = d, e, f, g
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11236);CharacterRange range = Ranges.characterRange('c', BoundType.OPEN, 'g',
                                                  BoundType.CLOSED, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11237);List<Character> list = Arrays.asList('d', 'e', 'f', 'g');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11238);assertTrue("Range [" + range +
                   "] was expected to contain all elements from list [" + list +
                   "]", range.containsAll(list));
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11239);List<Character> listWithExtraElements = Arrays.asList('a', 'd', 'e',
                                                              'f', 'g', 'z');
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11240);assertFalse("Range [" + range + "] has more elements than expected",
                    range.containsAll(listWithExtraElements));
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11241);assertFalse(range.containsAll(null));
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11242);assertFalse(range.containsAll(Collections.EMPTY_LIST));
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testEquals()
        throws Exception {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6088ob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6088ob() throws Exception{try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11243);
        // equals basic properties
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11244);CharacterRange range = Ranges.characterRange('a', BoundType.CLOSED, 'e',
                                                  BoundType.OPEN, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11245);assertEquals("equals must be reflexive", range, range);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11246);assertEquals("hashCode must be reflexive", range.hashCode(),
                     range.hashCode());
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11247);assertTrue(!range.equals(null)); // should be able to compare to null

        __CLR4_4_18hb8hbkcq4svqq.R.inc(11248);Object range2 = Ranges.characterRange('a', BoundType.CLOSED, 'e',
                                           BoundType.OPEN, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11249);if ((((range.equals(range2))&&(__CLR4_4_18hb8hbkcq4svqq.R.iget(11250)!=0|true))||(__CLR4_4_18hb8hbkcq4svqq.R.iget(11251)==0&false))) {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11252);assertEquals("equals implies hash equals", range.hashCode(),
                         range2.hashCode());
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11253);assertEquals("equals must be symmetric", range2, range);
        } }else {{
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11254);assertTrue("equals must be symmetric", !range2.equals(range));
        }

        // Changing attributes
        }__CLR4_4_18hb8hbkcq4svqq.R.inc(11255);Object range3 = Ranges.characterRange('c', BoundType.CLOSED, 'e',
                                           BoundType.OPEN, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11256);assertFalse("Invalid equals after changing attributes",
                    range.equals(range3));

        __CLR4_4_18hb8hbkcq4svqq.R.inc(11257);Object range4 = Ranges.characterRange('a', BoundType.OPEN, 'e',
                                           BoundType.OPEN, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11258);assertFalse("Invalid equals after changing attributes",
                    range.equals(range4));

        __CLR4_4_18hb8hbkcq4svqq.R.inc(11259);Object range5 = Ranges.characterRange('a', BoundType.CLOSED, 'r',
                                           BoundType.OPEN, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11260);assertFalse("Invalid equals after changing attributes",
                    range.equals(range5));

        __CLR4_4_18hb8hbkcq4svqq.R.inc(11261);Object range6 = Ranges.characterRange('a', BoundType.CLOSED, 'e',
                                           BoundType.CLOSED, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11262);assertFalse("Invalid equals after changing attributes",
                    range.equals(range6));

        __CLR4_4_18hb8hbkcq4svqq.R.inc(11263);Object range7 = Ranges.characterRange('a', BoundType.CLOSED, 'e',
                                           BoundType.OPEN, 2);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11264);assertFalse("Invalid equals after changing attributes",
                    range.equals(range7));

        // Using different constructors
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11265);Endpoint<Character> leftEndpoint = new Endpoint<Character>(
                                                                   'a',
                                                                   BoundType.CLOSED);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11266);Endpoint<Character> rightEndpoint = new Endpoint<Character>(
                                                                    'e',
                                                                    BoundType.OPEN);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11267);CharacterRange range8 = Ranges.characterRange(leftEndpoint, rightEndpoint,
                                                   1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11268);assertEquals("Invalid equals using different constructor", range,
                     range8);
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid8p1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid8p1(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11269);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11270);CharacterRange range = Ranges.characterRange('a', BoundType.OPEN, 'b',
                                                  BoundType.CLOSED, 1);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11271);assertEquals("Wrong string value", "CharacterRange<(a, b], 1>",
                     range.toString());
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testConstructorUsingSameEndpoint() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6pvy68p4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testConstructorUsingSameEndpoint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6pvy68p4(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11272);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11273);Endpoint<Character> uniqueEndpoint = new Endpoint<Character>(
                                                                     'a',
                                                                     BoundType.CLOSED);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11274);try {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11275);Ranges.characterRange(uniqueEndpoint, uniqueEndpoint, 1);
        } catch (IllegalArgumentException e) {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11276);fail("Not expected to get here");
        }
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testInvalidRange() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fiycn38p9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testInvalidRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fiycn38p9(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11277);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11278);try {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11279);Ranges.characterRange('a', BoundType.OPEN, 'z', BoundType.CLOSED, -100);
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11280);fail("Not expected to get here");
        } catch (IllegalArgumentException e) {
            // Do nothing
        }
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11281);Endpoint<Character> leftEndpoint = new Endpoint<Character>(
                                                                   'a',
                                                                   BoundType.CLOSED);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11282);Endpoint<Character> rightEndpoint = new Endpoint<Character>(
                                                                    'z',
                                                                    BoundType.OPEN);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11283);try {
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11284);Ranges.characterRange(leftEndpoint, rightEndpoint, -100);
            __CLR4_4_18hb8hbkcq4svqq.R.inc(11285);fail("Not expected to get here");
        } catch (IllegalArgumentException e) {
            // Do nothing
        }
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

    @Test
    public void testDefaultStep() {__CLR4_4_18hb8hbkcq4svqq.R.globalSliceStart(getClass().getName(),11286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i27fky8pi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18hb8hbkcq4svqq.R.rethrow($CLV_t2$);}finally{__CLR4_4_18hb8hbkcq4svqq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestCharacterRange.testDefaultStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i27fky8pi(){try{__CLR4_4_18hb8hbkcq4svqq.R.inc(11286);
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11287);assertEquals("Invalid default step", Integer.valueOf(-1),
                     CharacterRange.DEFAULT_STEP.evaluate('c', 'a'));
        __CLR4_4_18hb8hbkcq4svqq.R.inc(11288);assertEquals("Invalid default step", Integer.valueOf(1),
                     CharacterRange.DEFAULT_STEP.evaluate('a', 'c'));
    }finally{__CLR4_4_18hb8hbkcq4svqq.R.flushNeeded();}}

}
