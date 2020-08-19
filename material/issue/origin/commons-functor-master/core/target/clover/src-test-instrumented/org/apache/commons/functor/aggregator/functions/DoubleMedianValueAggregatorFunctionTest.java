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
import org.apache.commons.functor.aggregator.functions.DoubleMedianValueAggregatorFunction;
import org.junit.Test;

/**
 * Unit test for {@link DoubleMedianValueAggregatorFunction}.
 */
public class DoubleMedianValueAggregatorFunctionTest extends BaseFunctorTest {static class __CLR4_4_14h54h5kcq4sufo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,5872,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final double DELTA = 0.01; // make room for some poor
                                              // floating point precision

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_14h54h5kcq4sufo.R.inc(5801);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5802);return new DoubleMedianValueAggregatorFunction();
    }finally{__CLR4_4_14h54h5kcq4sufo.R.flushNeeded();}}

    @Test
    public void testEmptyList() throws Exception {__CLR4_4_14h54h5kcq4sufo.R.globalSliceStart(getClass().getName(),5803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6zsw4h7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h54h5kcq4sufo.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h54h5kcq4sufo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.DoubleMedianValueAggregatorFunctionTest.testEmptyList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6zsw4h7() throws Exception{try{__CLR4_4_14h54h5kcq4sufo.R.inc(5803);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5804);DoubleMedianValueAggregatorFunction fct = (DoubleMedianValueAggregatorFunction) makeFunctor();
        __CLR4_4_14h54h5kcq4sufo.R.inc(5805);assertTrue(fct.isUseCopy());
        __CLR4_4_14h54h5kcq4sufo.R.inc(5806);List<Double> lst = null;
        __CLR4_4_14h54h5kcq4sufo.R.inc(5807);Double res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5808);assertNull(res);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5809);lst = new ArrayList<Double>();
        __CLR4_4_14h54h5kcq4sufo.R.inc(5810);res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5811);assertNull(res);
    }finally{__CLR4_4_14h54h5kcq4sufo.R.flushNeeded();}}

    /**
     * Ensure we compute the median correctly and also we don't affect the
     * original list.
     */
    @Test
    public void testMedianCopy() throws Exception {__CLR4_4_14h54h5kcq4sufo.R.globalSliceStart(getClass().getName(),5812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qnzt44hg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h54h5kcq4sufo.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h54h5kcq4sufo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.DoubleMedianValueAggregatorFunctionTest.testMedianCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qnzt44hg() throws Exception{try{__CLR4_4_14h54h5kcq4sufo.R.inc(5812);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5813);DoubleMedianValueAggregatorFunction fct = new DoubleMedianValueAggregatorFunction(true);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5814);assertTrue(fct.isUseCopy());
        __CLR4_4_14h54h5kcq4sufo.R.inc(5815);checkMedianCopy(fct);
        // this is also the default behaviour so ensure that is the case
        __CLR4_4_14h54h5kcq4sufo.R.inc(5816);fct = (DoubleMedianValueAggregatorFunction) makeFunctor();
        __CLR4_4_14h54h5kcq4sufo.R.inc(5817);checkMedianCopy(fct);
    }finally{__CLR4_4_14h54h5kcq4sufo.R.flushNeeded();}}

    /**
     * Called by {@link #testMedianCopy()} internally.
     */
    void checkMedianCopy(DoubleMedianValueAggregatorFunction fct) throws Exception {try{__CLR4_4_14h54h5kcq4sufo.R.inc(5818);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5819);List<Double> lst = new ArrayList<Double>();
        __CLR4_4_14h54h5kcq4sufo.R.inc(5820);lst.add(10.0);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5821);double res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5822);assertEquals(res, 10.0, DELTA);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5823);assertListEqualsArray(lst, new double[] { 10.0 });
        __CLR4_4_14h54h5kcq4sufo.R.inc(5824);lst.add(1000.0);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5825);res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5826);assertEquals(res, 505.0, DELTA);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5827);assertListEqualsArray(lst, new double[] { 10.0, 1000.0 });
        __CLR4_4_14h54h5kcq4sufo.R.inc(5828);lst.add(30.0);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5829);res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5830);assertEquals(res, 30.0, DELTA);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5831);assertListEqualsArray(lst, new double[] { 10.0, 1000.0, 30.0 });
        __CLR4_4_14h54h5kcq4sufo.R.inc(5832);lst.add(100.0);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5833);res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5834);assertEquals(res, 65.0, DELTA);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5835);assertListEqualsArray(lst, new double[] { 10.0, 1000.0, 30.0, 100.0 });
        __CLR4_4_14h54h5kcq4sufo.R.inc(5836);lst.add(20.0);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5837);res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5838);assertEquals(res, 30.0, DELTA);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5839);assertListEqualsArray(lst, new double[] { 10.0, 1000.0, 30.0, 100.0, 20.0 });
    }finally{__CLR4_4_14h54h5kcq4sufo.R.flushNeeded();}}

    /**
     * Ensure we compute the median correctly and also we sort the original
     * list.
     */
    @Test
    public void testMedianNotCopy() throws Exception {__CLR4_4_14h54h5kcq4sufo.R.globalSliceStart(getClass().getName(),5840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvo7cd4i8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h54h5kcq4sufo.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h54h5kcq4sufo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.DoubleMedianValueAggregatorFunctionTest.testMedianNotCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvo7cd4i8() throws Exception{try{__CLR4_4_14h54h5kcq4sufo.R.inc(5840);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5841);DoubleMedianValueAggregatorFunction fct = new DoubleMedianValueAggregatorFunction(false);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5842);assertFalse(fct.isUseCopy());
        __CLR4_4_14h54h5kcq4sufo.R.inc(5843);List<Double> lst = new ArrayList<Double>();
        __CLR4_4_14h54h5kcq4sufo.R.inc(5844);lst.add(10.0);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5845);double res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5846);assertEquals(res, 10.0, DELTA);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5847);assertListEqualsArray(lst, new double[] { 10.0 });
        __CLR4_4_14h54h5kcq4sufo.R.inc(5848);lst.add(1000.0);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5849);res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5850);assertEquals(res, 505.0, DELTA);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5851);assertListEqualsArray(lst, new double[] { 10.0, 1000.0 });
        __CLR4_4_14h54h5kcq4sufo.R.inc(5852);lst.add(30.0);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5853);res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5854);assertEquals(res, 30.0, DELTA);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5855);assertListEqualsArray(lst, new double[] { 10.0, 30.0, 1000.0 });
        __CLR4_4_14h54h5kcq4sufo.R.inc(5856);lst.add(100.0);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5857);res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5858);assertEquals(res, 65.0, DELTA);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5859);assertListEqualsArray(lst, new double[] { 10.0, 30.0, 100.0, 1000.0 });
        __CLR4_4_14h54h5kcq4sufo.R.inc(5860);lst.add(20.0);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5861);res = fct.evaluate(lst);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5862);assertEquals(res, 30.0, DELTA);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5863);assertListEqualsArray(lst, new double[] { 10.0, 20.0, 30.0, 100.0, 1000.0 });
    }finally{__CLR4_4_14h54h5kcq4sufo.R.flushNeeded();}}

    /**
     * Utility function to check the elements of a list are in a given order.
     * Simply build an inline array and pass it in the <code>arr</code>
     * parameter.
     */
    void assertListEqualsArray(List<Double> list, double arr[]) throws Exception {try{__CLR4_4_14h54h5kcq4sufo.R.inc(5864);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5865);assertNotNull(list);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5866);assertNotNull(arr);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5867);assertEquals(list.size(), arr.length);
        __CLR4_4_14h54h5kcq4sufo.R.inc(5868);for (int i = 0; (((i < arr.length)&&(__CLR4_4_14h54h5kcq4sufo.R.iget(5869)!=0|true))||(__CLR4_4_14h54h5kcq4sufo.R.iget(5870)==0&false)); i++) {{
            __CLR4_4_14h54h5kcq4sufo.R.inc(5871);assertEquals(list.get(i).doubleValue(), arr[i], DELTA);
        }
    }}finally{__CLR4_4_14h54h5kcq4sufo.R.flushNeeded();}}
}
