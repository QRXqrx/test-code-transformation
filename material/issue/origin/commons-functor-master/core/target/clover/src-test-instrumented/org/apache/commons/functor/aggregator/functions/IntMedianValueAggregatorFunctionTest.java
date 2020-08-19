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
package org.apache.commons.functor.aggregator.functions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.aggregator.functions.IntegerMedianValueAggregatorFunction;
import org.junit.Test;

/**
 * Unit test for {@link IntegerMedianValueAggregatorFunction}.
 */
public class IntMedianValueAggregatorFunctionTest extends BaseFunctorTest {static class __CLR4_4_14qs4qskcq4suhm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,6219,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_14qs4qskcq4suhm.R.inc(6148);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6149);return new IntegerMedianValueAggregatorFunction();
    }finally{__CLR4_4_14qs4qskcq4suhm.R.flushNeeded();}}

    @Test
    public void testEmptyList() throws Exception {__CLR4_4_14qs4qskcq4suhm.R.globalSliceStart(getClass().getName(),6150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6zsw4qu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qs4qskcq4suhm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qs4qskcq4suhm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.IntMedianValueAggregatorFunctionTest.testEmptyList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6zsw4qu() throws Exception{try{__CLR4_4_14qs4qskcq4suhm.R.inc(6150);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6151);IntegerMedianValueAggregatorFunction fct = (IntegerMedianValueAggregatorFunction) makeFunctor();
        __CLR4_4_14qs4qskcq4suhm.R.inc(6152);assertTrue(fct.isUseCopy());
        __CLR4_4_14qs4qskcq4suhm.R.inc(6153);List<Integer> lst = null;
        __CLR4_4_14qs4qskcq4suhm.R.inc(6154);Integer res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6155);assertNull(res);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6156);lst = new ArrayList<Integer>();
        __CLR4_4_14qs4qskcq4suhm.R.inc(6157);res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6158);assertNull(res);
    }finally{__CLR4_4_14qs4qskcq4suhm.R.flushNeeded();}}

    /**
     * Ensure we compute the median correctly and also we don't affect the
     * original list.
     */
    @Test
    public void testMedianCopy() throws Exception {__CLR4_4_14qs4qskcq4suhm.R.globalSliceStart(getClass().getName(),6159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qnzt44r3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qs4qskcq4suhm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qs4qskcq4suhm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.IntMedianValueAggregatorFunctionTest.testMedianCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qnzt44r3() throws Exception{try{__CLR4_4_14qs4qskcq4suhm.R.inc(6159);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6160);IntegerMedianValueAggregatorFunction fct = new IntegerMedianValueAggregatorFunction(true);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6161);assertTrue(fct.isUseCopy());
        __CLR4_4_14qs4qskcq4suhm.R.inc(6162);checkMedianCopy(fct);
        // this is also the default behaviour so ensure that is the case
        __CLR4_4_14qs4qskcq4suhm.R.inc(6163);fct = (IntegerMedianValueAggregatorFunction) makeFunctor();
        __CLR4_4_14qs4qskcq4suhm.R.inc(6164);checkMedianCopy(fct);
    }finally{__CLR4_4_14qs4qskcq4suhm.R.flushNeeded();}}

    /**
     * Called by {@link #testMedianCopy()} internally.
     */
    void checkMedianCopy(IntegerMedianValueAggregatorFunction fct) throws Exception {try{__CLR4_4_14qs4qskcq4suhm.R.inc(6165);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6166);List<Integer> lst = new ArrayList<Integer>();
        __CLR4_4_14qs4qskcq4suhm.R.inc(6167);lst.add(10);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6168);int res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6169);assertEquals(res, 10);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6170);assertListEqualsArray(lst, new int[] { 10 });
        __CLR4_4_14qs4qskcq4suhm.R.inc(6171);lst.add(1000);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6172);res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6173);assertEquals(res, 505);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6174);assertListEqualsArray(lst, new int[] { 10, 1000 });
        __CLR4_4_14qs4qskcq4suhm.R.inc(6175);lst.add(30);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6176);res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6177);assertEquals(res, 30);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6178);assertListEqualsArray(lst, new int[] { 10, 1000, 30 });
        __CLR4_4_14qs4qskcq4suhm.R.inc(6179);lst.add(100);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6180);res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6181);assertEquals(res, 65);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6182);assertListEqualsArray(lst, new int[] { 10, 1000, 30, 100 });
        __CLR4_4_14qs4qskcq4suhm.R.inc(6183);lst.add(20);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6184);res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6185);assertEquals(res, 30);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6186);assertListEqualsArray(lst, new int[] { 10, 1000, 30, 100, 20 });
    }finally{__CLR4_4_14qs4qskcq4suhm.R.flushNeeded();}}

    /**
     * Ensure we compute the median correctly and also we sort the original
     * list.
     */
    @Test
    public void testMedianNotCopy() throws Exception {__CLR4_4_14qs4qskcq4suhm.R.globalSliceStart(getClass().getName(),6187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvo7cd4rv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14qs4qskcq4suhm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14qs4qskcq4suhm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.IntMedianValueAggregatorFunctionTest.testMedianNotCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvo7cd4rv() throws Exception{try{__CLR4_4_14qs4qskcq4suhm.R.inc(6187);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6188);IntegerMedianValueAggregatorFunction fct = new IntegerMedianValueAggregatorFunction(false);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6189);assertFalse(fct.isUseCopy());
        __CLR4_4_14qs4qskcq4suhm.R.inc(6190);List<Integer> lst = new ArrayList<Integer>();
        __CLR4_4_14qs4qskcq4suhm.R.inc(6191);lst.add(10);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6192);int res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6193);assertEquals(res, 10);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6194);assertListEqualsArray(lst, new int[] { 10 });
        __CLR4_4_14qs4qskcq4suhm.R.inc(6195);lst.add(1000);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6196);res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6197);assertEquals(res, 505);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6198);assertListEqualsArray(lst, new int[] { 10, 1000 });
        __CLR4_4_14qs4qskcq4suhm.R.inc(6199);lst.add(30);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6200);res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6201);assertEquals(res, 30);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6202);assertListEqualsArray(lst, new int[] { 10, 30, 1000 });
        __CLR4_4_14qs4qskcq4suhm.R.inc(6203);lst.add(100);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6204);res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6205);assertEquals(res, 65);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6206);assertListEqualsArray(lst, new int[] { 10, 30, 100, 1000 });
        __CLR4_4_14qs4qskcq4suhm.R.inc(6207);lst.add(20);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6208);res = fct.evaluate(lst);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6209);assertEquals(res, 30);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6210);assertListEqualsArray(lst, new int[] { 10, 20, 30, 100, 1000 });
    }finally{__CLR4_4_14qs4qskcq4suhm.R.flushNeeded();}}

    /**
     * Utility function to check the elements of a list are in a given order.
     * Simply build an inline array and pass it in the <code>arr</code>
     * parameter.
     */
    void assertListEqualsArray(List<Integer> list, int arr[]) throws Exception {try{__CLR4_4_14qs4qskcq4suhm.R.inc(6211);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6212);assertNotNull(list);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6213);assertNotNull(arr);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6214);assertEquals(list.size(), arr.length);
        __CLR4_4_14qs4qskcq4suhm.R.inc(6215);for (int i = 0; (((i < arr.length)&&(__CLR4_4_14qs4qskcq4suhm.R.iget(6216)!=0|true))||(__CLR4_4_14qs4qskcq4suhm.R.iget(6217)==0&false)); i++)
            {__CLR4_4_14qs4qskcq4suhm.R.inc(6218);assertEquals(list.get(i).intValue(), arr[i]);
    }}finally{__CLR4_4_14qs4qskcq4suhm.R.flushNeeded();}}
}
