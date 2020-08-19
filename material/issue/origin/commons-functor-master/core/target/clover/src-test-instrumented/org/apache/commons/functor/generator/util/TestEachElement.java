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
package org.apache.commons.functor.generator.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.core.Limit;
import org.apache.commons.functor.core.Offset;
import org.apache.commons.functor.generator.loop.GenerateUntil;
import org.apache.commons.functor.generator.loop.GenerateWhile;
import org.apache.commons.functor.generator.loop.UntilGenerate;
import org.apache.commons.functor.generator.loop.WhileGenerate;
import org.junit.Before;
import org.junit.Test;

/**
 */
public class TestEachElement extends BaseFunctorTest {static class __CLR4_4_18ff8ffkcq4svph{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10991,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private List<Integer> list = null;
    private Map<String, String> map = null;
    private Object[] array = null;

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_18ff8ffkcq4svph.R.inc(10923);
        __CLR4_4_18ff8ffkcq4svph.R.inc(10924);return EachElement.from(new ArrayList<Object>());
    }finally{__CLR4_4_18ff8ffkcq4svph.R.flushNeeded();}}

    // Lifecycle
    // ------------------------------------------------------------------------

    @Before
    public void setUp() throws Exception {try{__CLR4_4_18ff8ffkcq4svph.R.inc(10925);
        __CLR4_4_18ff8ffkcq4svph.R.inc(10926);list = new ArrayList<Integer>();
        __CLR4_4_18ff8ffkcq4svph.R.inc(10927);list.add(Integer.valueOf(0));
        __CLR4_4_18ff8ffkcq4svph.R.inc(10928);list.add(Integer.valueOf(1));
        __CLR4_4_18ff8ffkcq4svph.R.inc(10929);list.add(Integer.valueOf(2));
        __CLR4_4_18ff8ffkcq4svph.R.inc(10930);list.add(Integer.valueOf(3));
        __CLR4_4_18ff8ffkcq4svph.R.inc(10931);list.add(Integer.valueOf(4));

        __CLR4_4_18ff8ffkcq4svph.R.inc(10932);map = new HashMap<String, String>();
        __CLR4_4_18ff8ffkcq4svph.R.inc(10933);map.put("1", "1-1");
        __CLR4_4_18ff8ffkcq4svph.R.inc(10934);map.put("2", "2-1");
        __CLR4_4_18ff8ffkcq4svph.R.inc(10935);map.put("3", "3-1");
        __CLR4_4_18ff8ffkcq4svph.R.inc(10936);map.put("4", "4-1");
        __CLR4_4_18ff8ffkcq4svph.R.inc(10937);map.put("5", "5-1");

        __CLR4_4_18ff8ffkcq4svph.R.inc(10938);array = new String[5];
        __CLR4_4_18ff8ffkcq4svph.R.inc(10939);array[0] = "1";
        __CLR4_4_18ff8ffkcq4svph.R.inc(10940);array[1] = "2";
        __CLR4_4_18ff8ffkcq4svph.R.inc(10941);array[2] = "3";
        __CLR4_4_18ff8ffkcq4svph.R.inc(10942);array[3] = "4";
        __CLR4_4_18ff8ffkcq4svph.R.inc(10943);array[4] = "5";
    }finally{__CLR4_4_18ff8ffkcq4svph.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testFromNull() {__CLR4_4_18ff8ffkcq4svph.R.globalSliceStart(getClass().getName(),10944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e7bx28g0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ff8ffkcq4svph.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ff8ffkcq4svph.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.util.TestEachElement.testFromNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e7bx28g0(){try{__CLR4_4_18ff8ffkcq4svph.R.inc(10944);
        __CLR4_4_18ff8ffkcq4svph.R.inc(10945);assertNull(EachElement.from((Collection<?>) null));
        __CLR4_4_18ff8ffkcq4svph.R.inc(10946);assertNull(EachElement.from((Map<?, ?>) null));
        __CLR4_4_18ff8ffkcq4svph.R.inc(10947);assertNull(EachElement.from((Iterator<?>) null));
        __CLR4_4_18ff8ffkcq4svph.R.inc(10948);assertNull(EachElement.from((Object[]) null));
    }finally{__CLR4_4_18ff8ffkcq4svph.R.flushNeeded();}}


    @Test
    public void testWithList() {__CLR4_4_18ff8ffkcq4svph.R.globalSliceStart(getClass().getName(),10949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8ihj78g5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ff8ffkcq4svph.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ff8ffkcq4svph.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.util.TestEachElement.testWithList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8ihj78g5(){try{__CLR4_4_18ff8ffkcq4svph.R.inc(10949);
        __CLR4_4_18ff8ffkcq4svph.R.inc(10950);Collection<?> col = EachElement.from(list).toCollection();
        __CLR4_4_18ff8ffkcq4svph.R.inc(10951);assertEquals("[0, 1, 2, 3, 4]", col.toString());
    }finally{__CLR4_4_18ff8ffkcq4svph.R.flushNeeded();}}

    @Test
    @SuppressWarnings("unchecked")
    public void testWithMap() {__CLR4_4_18ff8ffkcq4svph.R.globalSliceStart(getClass().getName(),10952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18w6t118g8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ff8ffkcq4svph.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ff8ffkcq4svph.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.util.TestEachElement.testWithMap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18w6t118g8(){try{__CLR4_4_18ff8ffkcq4svph.R.inc(10952);
        __CLR4_4_18ff8ffkcq4svph.R.inc(10953);List<?> col = (List<?>) EachElement.from(map).toCollection();
        __CLR4_4_18ff8ffkcq4svph.R.inc(10954);int i = 0;
        __CLR4_4_18ff8ffkcq4svph.R.inc(10955);for (;(((i<col.size())&&(__CLR4_4_18ff8ffkcq4svph.R.iget(10956)!=0|true))||(__CLR4_4_18ff8ffkcq4svph.R.iget(10957)==0&false));i++) {{
            __CLR4_4_18ff8ffkcq4svph.R.inc(10958);Map.Entry<String, String> entry = (Map.Entry<String, String>) col.get(i);
            __CLR4_4_18ff8ffkcq4svph.R.inc(10959);if ((((entry.getKey().equals("1"))&&(__CLR4_4_18ff8ffkcq4svph.R.iget(10960)!=0|true))||(__CLR4_4_18ff8ffkcq4svph.R.iget(10961)==0&false))) {{
                __CLR4_4_18ff8ffkcq4svph.R.inc(10962);assertEquals("1-1", entry.getValue());
            } }else {__CLR4_4_18ff8ffkcq4svph.R.inc(10963);if ((((entry.getKey().equals("2"))&&(__CLR4_4_18ff8ffkcq4svph.R.iget(10964)!=0|true))||(__CLR4_4_18ff8ffkcq4svph.R.iget(10965)==0&false))) {{
                __CLR4_4_18ff8ffkcq4svph.R.inc(10966);assertEquals("2-1", entry.getValue());
            } }else {__CLR4_4_18ff8ffkcq4svph.R.inc(10967);if ((((entry.getKey().equals("3"))&&(__CLR4_4_18ff8ffkcq4svph.R.iget(10968)!=0|true))||(__CLR4_4_18ff8ffkcq4svph.R.iget(10969)==0&false))) {{
                __CLR4_4_18ff8ffkcq4svph.R.inc(10970);assertEquals("3-1", entry.getValue());
            } }else {__CLR4_4_18ff8ffkcq4svph.R.inc(10971);if ((((entry.getKey().equals("4"))&&(__CLR4_4_18ff8ffkcq4svph.R.iget(10972)!=0|true))||(__CLR4_4_18ff8ffkcq4svph.R.iget(10973)==0&false))) {{
                __CLR4_4_18ff8ffkcq4svph.R.inc(10974);assertEquals("4-1", entry.getValue());
            } }else {__CLR4_4_18ff8ffkcq4svph.R.inc(10975);if ((((entry.getKey().equals("5"))&&(__CLR4_4_18ff8ffkcq4svph.R.iget(10976)!=0|true))||(__CLR4_4_18ff8ffkcq4svph.R.iget(10977)==0&false))) {{
                __CLR4_4_18ff8ffkcq4svph.R.inc(10978);assertEquals("5-1", entry.getValue());
            }
        }}}}}}

        }__CLR4_4_18ff8ffkcq4svph.R.inc(10979);assertEquals(5, i);
    }finally{__CLR4_4_18ff8ffkcq4svph.R.flushNeeded();}}

    @Test
    public void testWithArray() {__CLR4_4_18ff8ffkcq4svph.R.globalSliceStart(getClass().getName(),10980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w67sig8h0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ff8ffkcq4svph.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ff8ffkcq4svph.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.util.TestEachElement.testWithArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w67sig8h0(){try{__CLR4_4_18ff8ffkcq4svph.R.inc(10980);
        __CLR4_4_18ff8ffkcq4svph.R.inc(10981);Collection<?> col = EachElement.from(array).toCollection();
        __CLR4_4_18ff8ffkcq4svph.R.inc(10982);assertEquals("[1, 2, 3, 4, 5]", col.toString());
    }finally{__CLR4_4_18ff8ffkcq4svph.R.flushNeeded();}}

    @Test
    public void testWithStop() {__CLR4_4_18ff8ffkcq4svph.R.globalSliceStart(getClass().getName(),10983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11kaxy78h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ff8ffkcq4svph.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ff8ffkcq4svph.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.util.TestEachElement.testWithStop",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11kaxy78h3(){try{__CLR4_4_18ff8ffkcq4svph.R.inc(10983);
        __CLR4_4_18ff8ffkcq4svph.R.inc(10984);assertEquals("[0, 1, 2]", new UntilGenerate<Integer>(new Offset(3), EachElement.from(list)).toCollection().toString());
        __CLR4_4_18ff8ffkcq4svph.R.inc(10985);assertEquals("[0, 1, 2, 3]", new GenerateUntil<Integer>(EachElement.from(list), new Offset(3)).toCollection().toString());
        __CLR4_4_18ff8ffkcq4svph.R.inc(10986);assertEquals("[0, 1, 2]", new WhileGenerate<Integer>(new Limit(3), EachElement.from(list)).toCollection().toString());
        __CLR4_4_18ff8ffkcq4svph.R.inc(10987);assertEquals("[0, 1, 2, 3]", new GenerateWhile<Integer>(EachElement.from(list), new Limit(3)).toCollection().toString());
    }finally{__CLR4_4_18ff8ffkcq4svph.R.flushNeeded();}}

    @Test
    public void testWithIterator() {__CLR4_4_18ff8ffkcq4svph.R.globalSliceStart(getClass().getName(),10988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eb3cz78h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18ff8ffkcq4svph.R.rethrow($CLV_t2$);}finally{__CLR4_4_18ff8ffkcq4svph.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.generator.util.TestEachElement.testWithIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eb3cz78h8(){try{__CLR4_4_18ff8ffkcq4svph.R.inc(10988);
        __CLR4_4_18ff8ffkcq4svph.R.inc(10989);Collection<?> col = EachElement.from(list.iterator()).toCollection();
        __CLR4_4_18ff8ffkcq4svph.R.inc(10990);assertEquals("[0, 1, 2, 3, 4]", col.toString());
    }finally{__CLR4_4_18ff8ffkcq4svph.R.flushNeeded();}}

}