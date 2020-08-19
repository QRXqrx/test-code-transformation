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
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.util.CollectionTransformer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Loop Generator class.
 */
@SuppressWarnings("unchecked")
public class TestLoopGenerator {static class __CLR4_4_189w89wkcq4svoa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10812,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private LoopGenerator<Integer> simpleGenerator = null;

    // Lifecycle
    // ------------------------------------------------------------------------

    @Before
    public void setUp() throws Exception {try{__CLR4_4_189w89wkcq4svoa.R.inc(10724);
        __CLR4_4_189w89wkcq4svoa.R.inc(10725);simpleGenerator = new LoopGenerator<Integer>() {
            public void run(Procedure<? super Integer> proc) {try{__CLR4_4_189w89wkcq4svoa.R.inc(10726);
                __CLR4_4_189w89wkcq4svoa.R.inc(10727);for (int i = 0; (((i < 5)&&(__CLR4_4_189w89wkcq4svoa.R.iget(10728)!=0|true))||(__CLR4_4_189w89wkcq4svoa.R.iget(10729)==0&false)); i++) {{
                    __CLR4_4_189w89wkcq4svoa.R.inc(10730);proc.run(Integer.valueOf(i));
                    __CLR4_4_189w89wkcq4svoa.R.inc(10731);if ((((isStopped())&&(__CLR4_4_189w89wkcq4svoa.R.iget(10732)!=0|true))||(__CLR4_4_189w89wkcq4svoa.R.iget(10733)==0&false))) {{
                        __CLR4_4_189w89wkcq4svoa.R.inc(10734);break;
                    }
                }}
            }}finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}
        };

        __CLR4_4_189w89wkcq4svoa.R.inc(10735);list = new ArrayList<Integer>();
        __CLR4_4_189w89wkcq4svoa.R.inc(10736);evens = new ArrayList<Integer>();
        __CLR4_4_189w89wkcq4svoa.R.inc(10737);doubled = new ArrayList<Integer>();
        __CLR4_4_189w89wkcq4svoa.R.inc(10738);listWithDuplicates = new ArrayList<Integer>();
        __CLR4_4_189w89wkcq4svoa.R.inc(10739);sum = 0;
        __CLR4_4_189w89wkcq4svoa.R.inc(10740);for (int i = 0; (((i < 10)&&(__CLR4_4_189w89wkcq4svoa.R.iget(10741)!=0|true))||(__CLR4_4_189w89wkcq4svoa.R.iget(10742)==0&false)); i++) {{
            __CLR4_4_189w89wkcq4svoa.R.inc(10743);list.add(Integer.valueOf(i));
            __CLR4_4_189w89wkcq4svoa.R.inc(10744);doubled.add(Integer.valueOf(i * 2));
            __CLR4_4_189w89wkcq4svoa.R.inc(10745);listWithDuplicates.add(Integer.valueOf(i));
            __CLR4_4_189w89wkcq4svoa.R.inc(10746);listWithDuplicates.add(Integer.valueOf(i));
            __CLR4_4_189w89wkcq4svoa.R.inc(10747);sum += i;
            __CLR4_4_189w89wkcq4svoa.R.inc(10748);if ((((i % 2 == 0)&&(__CLR4_4_189w89wkcq4svoa.R.iget(10749)!=0|true))||(__CLR4_4_189w89wkcq4svoa.R.iget(10750)==0&false))) {{
                __CLR4_4_189w89wkcq4svoa.R.inc(10751);evens.add(Integer.valueOf(i));
            }
        }}
    }}finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_189w89wkcq4svoa.R.inc(10752);
        __CLR4_4_189w89wkcq4svoa.R.inc(10753);simpleGenerator = null;
        __CLR4_4_189w89wkcq4svoa.R.inc(10754);list = null;
        __CLR4_4_189w89wkcq4svoa.R.inc(10755);evens = null;
        __CLR4_4_189w89wkcq4svoa.R.inc(10756);listWithDuplicates = null;
        __CLR4_4_189w89wkcq4svoa.R.inc(10757);sum = 0;
    }finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testSimpleGenerator() {__CLR4_4_189w89wkcq4svoa.R.globalSliceStart(getClass().getName(),10758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8s2ie8au();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189w89wkcq4svoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_189w89wkcq4svoa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestLoopGenerator.testSimpleGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8s2ie8au(){try{__CLR4_4_189w89wkcq4svoa.R.inc(10758);
        __CLR4_4_189w89wkcq4svoa.R.inc(10759);final StringBuilder result = new StringBuilder();
        __CLR4_4_189w89wkcq4svoa.R.inc(10760);simpleGenerator.run(new Procedure<Integer>() {
            public void run(Integer obj) {try{__CLR4_4_189w89wkcq4svoa.R.inc(10761);
                __CLR4_4_189w89wkcq4svoa.R.inc(10762);result.append(obj);
            }finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}
        });

        __CLR4_4_189w89wkcq4svoa.R.inc(10763);assertEquals("01234", result.toString());
    }finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}

    @Test
    public void testStop() {__CLR4_4_189w89wkcq4svoa.R.globalSliceStart(getClass().getName(),10764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mkgnt18b0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189w89wkcq4svoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_189w89wkcq4svoa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestLoopGenerator.testStop",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mkgnt18b0(){try{__CLR4_4_189w89wkcq4svoa.R.inc(10764);
        __CLR4_4_189w89wkcq4svoa.R.inc(10765);final StringBuilder result = new StringBuilder();
        __CLR4_4_189w89wkcq4svoa.R.inc(10766);simpleGenerator.run(new Procedure<Integer>() {
            int i = 0;

            public void run(Integer obj) {try{__CLR4_4_189w89wkcq4svoa.R.inc(10767);
                __CLR4_4_189w89wkcq4svoa.R.inc(10768);result.append(obj);
                __CLR4_4_189w89wkcq4svoa.R.inc(10769);if ((((i++ > 1)&&(__CLR4_4_189w89wkcq4svoa.R.iget(10770)!=0|true))||(__CLR4_4_189w89wkcq4svoa.R.iget(10771)==0&false))) {{
                    __CLR4_4_189w89wkcq4svoa.R.inc(10772);simpleGenerator.stop();
                }
            }}finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}
        });

        __CLR4_4_189w89wkcq4svoa.R.inc(10773);assertEquals("012", result.toString());
    }finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}

    @Test
    public void testWrappingGenerator() {__CLR4_4_189w89wkcq4svoa.R.globalSliceStart(getClass().getName(),10774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drsr708ba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189w89wkcq4svoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_189w89wkcq4svoa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestLoopGenerator.testWrappingGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drsr708ba(){try{__CLR4_4_189w89wkcq4svoa.R.inc(10774);
        __CLR4_4_189w89wkcq4svoa.R.inc(10775);final StringBuilder result = new StringBuilder();
        __CLR4_4_189w89wkcq4svoa.R.inc(10776);final LoopGenerator<Integer> gen = new LoopGenerator<Integer>(simpleGenerator) {
            public void run(final Procedure<? super Integer> proc) {try{__CLR4_4_189w89wkcq4svoa.R.inc(10777);
                __CLR4_4_189w89wkcq4svoa.R.inc(10778);LoopGenerator<Integer> wrapped = (LoopGenerator<Integer>) getWrappedGenerator();
                __CLR4_4_189w89wkcq4svoa.R.inc(10779);assertSame(simpleGenerator, wrapped);
                __CLR4_4_189w89wkcq4svoa.R.inc(10780);wrapped.run(new Procedure<Integer>() {
                    public void run(Integer obj) {try{__CLR4_4_189w89wkcq4svoa.R.inc(10781);
                        __CLR4_4_189w89wkcq4svoa.R.inc(10782);proc.run(Integer.valueOf(obj.intValue() + 1));
                    }finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}
                });
            }finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}
        };

        __CLR4_4_189w89wkcq4svoa.R.inc(10783);gen.run(new Procedure<Integer>() {
            public void run(Integer obj) {try{__CLR4_4_189w89wkcq4svoa.R.inc(10784);
                __CLR4_4_189w89wkcq4svoa.R.inc(10785);result.append(obj);
            }finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}
        });

        __CLR4_4_189w89wkcq4svoa.R.inc(10786);assertEquals("12345", result.toString());

        // try to stop the wrapped generator
        __CLR4_4_189w89wkcq4svoa.R.inc(10787);final StringBuilder result2 = new StringBuilder();
        __CLR4_4_189w89wkcq4svoa.R.inc(10788);gen.run(new Procedure<Integer>() {
            int i = 0;

            public void run(Integer obj) {try{__CLR4_4_189w89wkcq4svoa.R.inc(10789);
                __CLR4_4_189w89wkcq4svoa.R.inc(10790);result2.append(obj);
                __CLR4_4_189w89wkcq4svoa.R.inc(10791);if ((((i++ > 1)&&(__CLR4_4_189w89wkcq4svoa.R.iget(10792)!=0|true))||(__CLR4_4_189w89wkcq4svoa.R.iget(10793)==0&false))) {{
                    __CLR4_4_189w89wkcq4svoa.R.inc(10794);gen.stop();
                }
            }}finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}
        });

        __CLR4_4_189w89wkcq4svoa.R.inc(10795);assertEquals("123", result2.toString());
    }finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testTo() {__CLR4_4_189w89wkcq4svoa.R.globalSliceStart(getClass().getName(),10796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138dfvw8bw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_189w89wkcq4svoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_189w89wkcq4svoa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.loop.TestLoopGenerator.testTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138dfvw8bw(){try{__CLR4_4_189w89wkcq4svoa.R.inc(10796);
        __CLR4_4_189w89wkcq4svoa.R.inc(10797);Collection<Integer> col = simpleGenerator.to(CollectionTransformer.<Integer> toCollection());
        __CLR4_4_189w89wkcq4svoa.R.inc(10798);assertEquals("[0, 1, 2, 3, 4]", col.toString());

        __CLR4_4_189w89wkcq4svoa.R.inc(10799);Collection<Integer> fillThis = new LinkedList<Integer>();
        __CLR4_4_189w89wkcq4svoa.R.inc(10800);col = simpleGenerator.to(new CollectionTransformer<Integer, Collection<Integer>>(fillThis));
        __CLR4_4_189w89wkcq4svoa.R.inc(10801);assertSame(fillThis, col);
        __CLR4_4_189w89wkcq4svoa.R.inc(10802);assertEquals("[0, 1, 2, 3, 4]", col.toString());

        __CLR4_4_189w89wkcq4svoa.R.inc(10803);col = (Collection<Integer>) simpleGenerator.toCollection();
        __CLR4_4_189w89wkcq4svoa.R.inc(10804);assertEquals("[0, 1, 2, 3, 4]", col.toString());
        __CLR4_4_189w89wkcq4svoa.R.inc(10805);assertEquals("[0, 1, 2, 3, 4]", col.toString());

        __CLR4_4_189w89wkcq4svoa.R.inc(10806);fillThis = new LinkedList<Integer>();
        __CLR4_4_189w89wkcq4svoa.R.inc(10807);col = (Collection<Integer>) simpleGenerator.to(fillThis);
        __CLR4_4_189w89wkcq4svoa.R.inc(10808);assertSame(fillThis, col);
        __CLR4_4_189w89wkcq4svoa.R.inc(10809);assertEquals("[0, 1, 2, 3, 4]", col.toString());
    }finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}

    // Attributes
    // ------------------------------------------------------------------------
    private List<Integer> list = null;
    private List<Integer> doubled = null;
    private List<Integer> evens = null;
    private List<Integer> listWithDuplicates = null;
    @SuppressWarnings("unused")
    private int sum = 0;

    // Classes
    // ------------------------------------------------------------------------

    static class Summer implements Procedure<Number> {
        public void run(Number that) {try{__CLR4_4_189w89wkcq4svoa.R.inc(10810);
            __CLR4_4_189w89wkcq4svoa.R.inc(10811);sum += (that).intValue();
        }finally{__CLR4_4_189w89wkcq4svoa.R.flushNeeded();}}

        public int sum = 0;
    }
}
