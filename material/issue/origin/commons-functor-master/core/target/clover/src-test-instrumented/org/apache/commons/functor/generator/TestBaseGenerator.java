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
package org.apache.commons.functor.generator;

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
 * Tests the Base Generator class.
 */
@SuppressWarnings("unchecked")
public class TestBaseGenerator {static class __CLR4_4_1851851kcq4svmh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10601,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Generator<Integer> simpleGenerator = null;

    // Lifecycle
    // ------------------------------------------------------------------------

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1851851kcq4svmh.R.inc(10549);
        __CLR4_4_1851851kcq4svmh.R.inc(10550);simpleGenerator = new BaseGenerator<Integer>() {
            public void run(Procedure<? super Integer> proc) {try{__CLR4_4_1851851kcq4svmh.R.inc(10551);
                __CLR4_4_1851851kcq4svmh.R.inc(10552);for (int i = 0; (((i < 5)&&(__CLR4_4_1851851kcq4svmh.R.iget(10553)!=0|true))||(__CLR4_4_1851851kcq4svmh.R.iget(10554)==0&false)); i++) {{
                    __CLR4_4_1851851kcq4svmh.R.inc(10555);proc.run(Integer.valueOf(i));
                }
            }}finally{__CLR4_4_1851851kcq4svmh.R.flushNeeded();}}
        };

        __CLR4_4_1851851kcq4svmh.R.inc(10556);list = new ArrayList<Integer>();
        __CLR4_4_1851851kcq4svmh.R.inc(10557);evens = new ArrayList<Integer>();
        __CLR4_4_1851851kcq4svmh.R.inc(10558);doubled = new ArrayList<Integer>();
        __CLR4_4_1851851kcq4svmh.R.inc(10559);listWithDuplicates = new ArrayList<Integer>();
        __CLR4_4_1851851kcq4svmh.R.inc(10560);sum = 0;
        __CLR4_4_1851851kcq4svmh.R.inc(10561);for (int i = 0; (((i < 10)&&(__CLR4_4_1851851kcq4svmh.R.iget(10562)!=0|true))||(__CLR4_4_1851851kcq4svmh.R.iget(10563)==0&false)); i++) {{
            __CLR4_4_1851851kcq4svmh.R.inc(10564);list.add(Integer.valueOf(i));
            __CLR4_4_1851851kcq4svmh.R.inc(10565);doubled.add(Integer.valueOf(i * 2));
            __CLR4_4_1851851kcq4svmh.R.inc(10566);listWithDuplicates.add(Integer.valueOf(i));
            __CLR4_4_1851851kcq4svmh.R.inc(10567);listWithDuplicates.add(Integer.valueOf(i));
            __CLR4_4_1851851kcq4svmh.R.inc(10568);sum += i;
            __CLR4_4_1851851kcq4svmh.R.inc(10569);if ((((i % 2 == 0)&&(__CLR4_4_1851851kcq4svmh.R.iget(10570)!=0|true))||(__CLR4_4_1851851kcq4svmh.R.iget(10571)==0&false))) {{
                __CLR4_4_1851851kcq4svmh.R.inc(10572);evens.add(Integer.valueOf(i));
            }
        }}
    }}finally{__CLR4_4_1851851kcq4svmh.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1851851kcq4svmh.R.inc(10573);
        __CLR4_4_1851851kcq4svmh.R.inc(10574);simpleGenerator = null;
        __CLR4_4_1851851kcq4svmh.R.inc(10575);list = null;
        __CLR4_4_1851851kcq4svmh.R.inc(10576);evens = null;
        __CLR4_4_1851851kcq4svmh.R.inc(10577);listWithDuplicates = null;
        __CLR4_4_1851851kcq4svmh.R.inc(10578);sum = 0;
    }finally{__CLR4_4_1851851kcq4svmh.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testSimpleGenerator() {__CLR4_4_1851851kcq4svmh.R.globalSliceStart(getClass().getName(),10579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8s2ie85v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1851851kcq4svmh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1851851kcq4svmh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.TestBaseGenerator.testSimpleGenerator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8s2ie85v(){try{__CLR4_4_1851851kcq4svmh.R.inc(10579);
        __CLR4_4_1851851kcq4svmh.R.inc(10580);final StringBuilder result = new StringBuilder();
        __CLR4_4_1851851kcq4svmh.R.inc(10581);simpleGenerator.run(new Procedure<Integer>() {
            public void run(Integer obj) {try{__CLR4_4_1851851kcq4svmh.R.inc(10582);
                __CLR4_4_1851851kcq4svmh.R.inc(10583);result.append(obj);
            }finally{__CLR4_4_1851851kcq4svmh.R.flushNeeded();}}
        });

        __CLR4_4_1851851kcq4svmh.R.inc(10584);assertEquals("01234", result.toString());
    }finally{__CLR4_4_1851851kcq4svmh.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testTo() {__CLR4_4_1851851kcq4svmh.R.globalSliceStart(getClass().getName(),10585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138dfvw861();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1851851kcq4svmh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1851851kcq4svmh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.TestBaseGenerator.testTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138dfvw861(){try{__CLR4_4_1851851kcq4svmh.R.inc(10585);
        __CLR4_4_1851851kcq4svmh.R.inc(10586);Collection<Integer> col = simpleGenerator.to(CollectionTransformer.<Integer> toCollection());
        __CLR4_4_1851851kcq4svmh.R.inc(10587);assertEquals("[0, 1, 2, 3, 4]", col.toString());

        __CLR4_4_1851851kcq4svmh.R.inc(10588);Collection<Integer> fillThis = new LinkedList<Integer>();
        __CLR4_4_1851851kcq4svmh.R.inc(10589);col = simpleGenerator.to(new CollectionTransformer<Integer, Collection<Integer>>(fillThis));
        __CLR4_4_1851851kcq4svmh.R.inc(10590);assertSame(fillThis, col);
        __CLR4_4_1851851kcq4svmh.R.inc(10591);assertEquals("[0, 1, 2, 3, 4]", col.toString());

        __CLR4_4_1851851kcq4svmh.R.inc(10592);col = (Collection<Integer>) simpleGenerator.toCollection();
        __CLR4_4_1851851kcq4svmh.R.inc(10593);assertEquals("[0, 1, 2, 3, 4]", col.toString());
        __CLR4_4_1851851kcq4svmh.R.inc(10594);assertEquals("[0, 1, 2, 3, 4]", col.toString());

        __CLR4_4_1851851kcq4svmh.R.inc(10595);fillThis = new LinkedList<Integer>();
        __CLR4_4_1851851kcq4svmh.R.inc(10596);col = (Collection<Integer>) simpleGenerator.to(fillThis);
        __CLR4_4_1851851kcq4svmh.R.inc(10597);assertSame(fillThis, col);
        __CLR4_4_1851851kcq4svmh.R.inc(10598);assertEquals("[0, 1, 2, 3, 4]", col.toString());
    }finally{__CLR4_4_1851851kcq4svmh.R.flushNeeded();}}

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
        public void run(Number that) {try{__CLR4_4_1851851kcq4svmh.R.inc(10599);
            __CLR4_4_1851851kcq4svmh.R.inc(10600);sum += (that).intValue();
        }finally{__CLR4_4_1851851kcq4svmh.R.flushNeeded();}}

        public int sum = 0;
    }
}
