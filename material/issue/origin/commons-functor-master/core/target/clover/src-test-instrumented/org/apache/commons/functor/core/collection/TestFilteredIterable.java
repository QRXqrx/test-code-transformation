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
package org.apache.commons.functor.core.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.IsEqual;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
@SuppressWarnings("unchecked")
public class TestFilteredIterable extends BaseFunctorTest {static class __CLR4_4_15hv5hvkcq4suq5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,7261,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Attributes
    // ------------------------------------------------------------------------
    private List<Integer> list = null;
    private List<Integer> evens = null;

    private Predicate<Integer> isEven = new Predicate<Integer>() {
        public boolean test(Integer obj) {try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7123);
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7124);return obj != null && obj % 2 == 0;
        }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}
    };

    @Override
    public Object makeFunctor() {try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7125);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7126);List<String> list = new ArrayList<String>();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7127);list.add("xyzzy");
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7128);return FilteredIterable.of(list);
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    // Lifecycle
    // ------------------------------------------------------------------------

    @Before
    public void setUp() throws Exception {try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7129);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7130);list = new ArrayList<Integer>();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7131);evens = new ArrayList<Integer>();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7132);for (int i = 0; (((i < 10)&&(__CLR4_4_15hv5hvkcq4suq5.R.iget(7133)!=0|true))||(__CLR4_4_15hv5hvkcq4suq5.R.iget(7134)==0&false)); i++) {{
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7135);list.add(i);
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7136);if ((((i % 2 == 0)&&(__CLR4_4_15hv5hvkcq4suq5.R.iget(7137)!=0|true))||(__CLR4_4_15hv5hvkcq4suq5.R.iget(7138)==0&false))) {{
                __CLR4_4_15hv5hvkcq4suq5.R.inc(7139);evens.add(i);
            }
        }}
    }}finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7140);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7141);list = null;
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7142);evens = null;
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testSomePass() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gi5vsu5if();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testSomePass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gi5vsu5if(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7143);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7144);Iterator<Integer> expected = evens.iterator();

        __CLR4_4_15hv5hvkcq4suq5.R.inc(7145);FilteredIterable<Integer> filter = FilteredIterable.of(list);

        __CLR4_4_15hv5hvkcq4suq5.R.inc(7146);for (Integer i : filter.retain(isEven)) {{
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7147);assertTrue(expected.hasNext());
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7148);assertEquals(expected.next(), i);
        }
        }__CLR4_4_15hv5hvkcq4suq5.R.inc(7149);assertFalse(expected.hasNext());
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7150);assertEquals(filter,filter.retain(isEven));
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testAllPass() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lu2lw95in();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testAllPass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lu2lw95in(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7151);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7152);Iterator<Integer> expected = evens.iterator();

        __CLR4_4_15hv5hvkcq4suq5.R.inc(7153);for (Integer i : FilteredIterable.of(evens)) {{
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7154);assertTrue(expected.hasNext());
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7155);assertEquals(expected.next(), i);
        }
        }__CLR4_4_15hv5hvkcq4suq5.R.inc(7156);assertFalse(expected.hasNext());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testAllPass2() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1567vmh5it();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testAllPass2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1567vmh5it(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7157);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7158);Iterator<Integer> expected = list.iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7159);for (Integer i : FilteredIterable.of(list)) {{
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7160);assertTrue(expected.hasNext());
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7161);assertEquals(expected.next(), i);
        }
        }__CLR4_4_15hv5hvkcq4suq5.R.inc(7162);assertFalse(expected.hasNext());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testEmptyFilteredIterable() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ouoq6t5iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testEmptyFilteredIterable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ouoq6t5iz(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7163);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7164);FilteredIterable<Integer> emptyFilter = FilteredIterable.empty();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7165);assertFalse(emptyFilter.iterator().hasNext());
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7166);assertEquals(emptyFilter,emptyFilter.retain(isEven));
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7167);assertEquals(emptyFilter,emptyFilter.retain(Integer.class));
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7168);assertEquals(emptyFilter,emptyFilter.retain(Integer.class,Number.class));
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testEmptyList() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6zsw5j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testEmptyList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6zsw5j5(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7169);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7170);assertFalse(FilteredIterable.of(Collections.EMPTY_LIST).iterator().hasNext());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testNonePass() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wg4dmq5j7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testNonePass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wg4dmq5j7(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7171);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7172);assertFalse(FilteredIterable.of(list).retain(Constant.falsePredicate()).iterator().hasNext());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testNextWithoutHasNext() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yf2u5r5j9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testNextWithoutHasNext",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yf2u5r5j9(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7173);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7174);Iterator<Integer> testing = FilteredIterable.of(list).retain(isEven).iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7175);Iterator<Integer> expected = evens.iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7176);while ((((expected.hasNext())&&(__CLR4_4_15hv5hvkcq4suq5.R.iget(7177)!=0|true))||(__CLR4_4_15hv5hvkcq4suq5.R.iget(7178)==0&false))) {{
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7179);assertEquals(expected.next(), testing.next());
        }
        }__CLR4_4_15hv5hvkcq4suq5.R.inc(7180);assertFalse(testing.hasNext());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test(expected=NoSuchElementException.class)
    public void testNextAfterEndOfList() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdu7b45jh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,65,102,116,101,114,69,110,100,79,102,76,105,115,116,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testNextAfterEndOfList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdu7b45jh(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7181);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7182);Iterator<Integer> testing = FilteredIterable.of(list).retain(isEven).iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7183);Iterator<Integer> expected = evens.iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7184);while ((((expected.hasNext())&&(__CLR4_4_15hv5hvkcq4suq5.R.iget(7185)!=0|true))||(__CLR4_4_15hv5hvkcq4suq5.R.iget(7186)==0&false))) {{
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7187);assertEquals(expected.next(), testing.next());
        }
        }__CLR4_4_15hv5hvkcq4suq5.R.inc(7188);testing.next();
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test(expected=NoSuchElementException.class)
    public void testNextOnEmptyList() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u5fce5jp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,79,110,69,109,112,116,121,76,105,115,116,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testNextOnEmptyList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u5fce5jp(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7189);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7190);FilteredIterable.empty().iterator().next();
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test(expected=IllegalStateException.class)
    public void testRemoveBeforeNext() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b6ju0f5jr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,66,101,102,111,114,101,78,101,120,116,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRemoveBeforeNext",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b6ju0f5jr(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7191);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7192);Iterator<Integer> testing = FilteredIterable.of(list).retain(isEven).iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7193);testing.remove();
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test(expected=IllegalStateException.class)
    public void testRemoveAfterNext() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfnuo05ju();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,102,116,101,114,78,101,120,116,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRemoveAfterNext",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfnuo05ju(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7194);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7195);Iterator<Integer> testing = FilteredIterable.of(list).retain(isEven).iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7196);testing.next();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7197);testing.remove();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7198);testing.remove();
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testRemoveSome() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbeeoh5jz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRemoveSome",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbeeoh5jz(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7199);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7200);Iterator<Integer> testing = FilteredIterable.of(list).retain(isEven).iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7201);while ((((testing.hasNext())&&(__CLR4_4_15hv5hvkcq4suq5.R.iget(7202)!=0|true))||(__CLR4_4_15hv5hvkcq4suq5.R.iget(7203)==0&false))) {{
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7204);testing.next();
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7205);testing.remove();
        }
        }__CLR4_4_15hv5hvkcq4suq5.R.inc(7206);assertTrue(Collections.disjoint(list, evens));
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testRemoveAll() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dd9vci5k7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRemoveAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dd9vci5k7(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7207);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7208);Iterator<Integer> testing = FilteredIterable.of(list).iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7209);while ((((testing.hasNext())&&(__CLR4_4_15hv5hvkcq4suq5.R.iget(7210)!=0|true))||(__CLR4_4_15hv5hvkcq4suq5.R.iget(7211)==0&false))) {{
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7212);testing.next();
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7213);testing.remove();
        }
        }__CLR4_4_15hv5hvkcq4suq5.R.inc(7214);assertTrue(list.isEmpty());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testRemoveWithoutHasNext() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ujx1e5kf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRemoveWithoutHasNext",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ujx1e5kf(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7215);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7216);Iterator<Integer> testing = FilteredIterable.of(list).iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7217);for (int i = 0, m = list.size(); (((i < m)&&(__CLR4_4_15hv5hvkcq4suq5.R.iget(7218)!=0|true))||(__CLR4_4_15hv5hvkcq4suq5.R.iget(7219)==0&false)); i++) {{
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7220);testing.next();
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7221);testing.remove();
        }
        }__CLR4_4_15hv5hvkcq4suq5.R.inc(7222);assertTrue(list.isEmpty());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testFilterWithNullIteratorReturnsNull() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rye8l05kn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testFilterWithNullIteratorReturnsNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rye8l05kn(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7223);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7224);assertNull(FilteredIterable.of(null));
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testFilterWithFilteredIterableReturnsItself() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1imbtrc5kp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testFilterWithFilteredIterableReturnsItself",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1imbtrc5kp(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7225);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7226);FilteredIterable<Integer> filter = FilteredIterable.of(list);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7227);assertEquals(filter,FilteredIterable.of(filter));
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testRetainOneType() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s24ddc5ks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRetainOneType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s24ddc5ks(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7228);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7229);Iterable<Object> objects = Arrays.asList((Object) "foo", "bar", "baz", 2L, BigInteger.ZERO);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7230);Iterable<String> strings = FilteredIterable.of(objects).retain(String.class);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7231);for (String s : strings) {{
            __CLR4_4_15hv5hvkcq4suq5.R.inc(7232);assertTrue(s instanceof String);
        }
    }}finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testRetainOneType2() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1as8ykw5kx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRetainOneType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1as8ykw5kx(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7233);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7234);Iterable<Object> objects = Arrays.asList((Object) "foo", "bar", "baz", 2L, BigInteger.ZERO);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7235);Iterator<Number> iterator = FilteredIterable.of(objects).retain(Number.class).iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7236);assertEquals(2L, iterator.next());
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7237);assertEquals(BigInteger.ZERO, iterator.next());
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7238);assertFalse(iterator.hasNext());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testRetainMultipleTypes() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14h4k9z5l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRetainMultipleTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14h4k9z5l3(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7239);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7240);Iterable<Object> objects = Arrays.asList((Object) "foo", "bar", "baz", 2L, BigInteger.ZERO);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7241);Iterator<Object> iterator = FilteredIterable.of(objects).retain(Long.class, BigInteger.class).iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7242);assertEquals(2L, iterator.next());
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7243);assertEquals(BigInteger.ZERO, iterator.next());
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7244);assertFalse(iterator.hasNext());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testMultipleLevels() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avsfeg5l9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testMultipleLevels",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avsfeg5l9(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7245);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7246);Iterable<Object> objects = Arrays.asList((Object) "foo", "bar", "baz", 2L, BigInteger.ZERO);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7247);Iterator<String> iterator = FilteredIterable.of(objects).retain(String.class).retain(IsEqual.to("foo"))
                .iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7248);assertEquals("foo", iterator.next());
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7249);assertFalse(iterator.hasNext());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test
    public void testMultipleLevels2() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p0d86g5le();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testMultipleLevels2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p0d86g5le(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7250);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7251);Iterable<Object> objects = Arrays.asList((Object) "foo", "bar", "baz", 2L, BigInteger.ZERO);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7252);Iterator<Long> iterator = FilteredIterable.of(objects).retain(Number.class).retain(Long.class).iterator();
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7253);assertEquals(2L, iterator.next().longValue());
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7254);assertFalse(iterator.hasNext());
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testRetainNullType() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zg2tj55lj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,116,97,105,110,78,117,108,108,84,121,112,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRetainNullType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zg2tj55lj(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7255);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7256);FilteredIterable.of(Collections.singleton("foo")).retain((Class<?>) null);
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testRetainNullTypes() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17kba8y5ll();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,116,97,105,110,78,117,108,108,84,121,112,101,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRetainNullTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17kba8y5ll(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7257);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7258);FilteredIterable.of(Collections.singleton("foo")).retain((Class<?>[]) null);
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testRetainNullPredicate() {__CLR4_4_15hv5hvkcq4suq5.R.globalSliceStart(getClass().getName(),7259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11intuo5ln();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,116,97,105,110,78,117,108,108,80,114,101,100,105,99,97,116,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hv5hvkcq4suq5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hv5hvkcq4suq5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestFilteredIterable.testRetainNullPredicate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11intuo5ln(){try{__CLR4_4_15hv5hvkcq4suq5.R.inc(7259);
        __CLR4_4_15hv5hvkcq4suq5.R.inc(7260);FilteredIterable.of(Collections.singleton("foo")).retain((Predicate<String>) null);
    }finally{__CLR4_4_15hv5hvkcq4suq5.R.flushNeeded();}}
}
