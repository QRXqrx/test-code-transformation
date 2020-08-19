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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.aggregator.functions.DoublePercentileAggregatorFunction;
import org.junit.Test;

/**
 * Unit test for {@link DoublePercentileAggregatorFunction}.
 */
public class DoublePercentileAggregatorFunctionTest extends BaseFunctorTest {static class __CLR4_4_14j44j4kcq4sug8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,5971,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final double DELTA    = 0.01; // make room for some poor
                                                 // floating point precision
    private static final double DEF_PERC = 90;  // by default use the 90th
                                                 // percentile

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_14j44j4kcq4sug8.R.inc(5872);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5873);return new DoublePercentileAggregatorFunction(DEF_PERC);
    }finally{__CLR4_4_14j44j4kcq4sug8.R.flushNeeded();}}

    @Test
    public void testCreate() throws Exception {__CLR4_4_14j44j4kcq4sug8.R.globalSliceStart(getClass().getName(),5874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nf4c54j6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14j44j4kcq4sug8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14j44j4kcq4sug8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.DoublePercentileAggregatorFunctionTest.testCreate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nf4c54j6() throws Exception{try{__CLR4_4_14j44j4kcq4sug8.R.inc(5874);
        // default
        __CLR4_4_14j44j4kcq4sug8.R.inc(5875);DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        __CLR4_4_14j44j4kcq4sug8.R.inc(5876);assertTrue(fct.isUseCopy());
        __CLR4_4_14j44j4kcq4sug8.R.inc(5877);assertEquals(fct.getPercentile(), DEF_PERC, DELTA);

        // different percentage
        __CLR4_4_14j44j4kcq4sug8.R.inc(5878);double perc = 50.0;
        __CLR4_4_14j44j4kcq4sug8.R.inc(5879);fct = new DoublePercentileAggregatorFunction(perc);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5880);assertTrue(fct.isUseCopy());
        __CLR4_4_14j44j4kcq4sug8.R.inc(5881);assertEquals(fct.getPercentile(), perc, DELTA);

        // use copy
        __CLR4_4_14j44j4kcq4sug8.R.inc(5882);fct = new DoublePercentileAggregatorFunction(perc, false);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5883);assertFalse(fct.isUseCopy());
        __CLR4_4_14j44j4kcq4sug8.R.inc(5884);assertEquals(fct.getPercentile(), perc, DELTA);

        // test illegal exc
        __CLR4_4_14j44j4kcq4sug8.R.inc(5885);boolean exc = false;
        __CLR4_4_14j44j4kcq4sug8.R.inc(5886);fct = null;
        __CLR4_4_14j44j4kcq4sug8.R.inc(5887);try {
            __CLR4_4_14j44j4kcq4sug8.R.inc(5888);fct = new DoublePercentileAggregatorFunction(-100);
        } catch (IllegalArgumentException e) {
            __CLR4_4_14j44j4kcq4sug8.R.inc(5889);exc = true;
        }
        __CLR4_4_14j44j4kcq4sug8.R.inc(5890);assertTrue(exc);

        __CLR4_4_14j44j4kcq4sug8.R.inc(5891);fct = null;
        __CLR4_4_14j44j4kcq4sug8.R.inc(5892);exc = false;
        __CLR4_4_14j44j4kcq4sug8.R.inc(5893);try {
            __CLR4_4_14j44j4kcq4sug8.R.inc(5894);fct = new DoublePercentileAggregatorFunction(101);
        } catch (IllegalArgumentException e) {
            __CLR4_4_14j44j4kcq4sug8.R.inc(5895);exc = true;
        }
        __CLR4_4_14j44j4kcq4sug8.R.inc(5896);assertTrue(exc);
    }finally{__CLR4_4_14j44j4kcq4sug8.R.flushNeeded();}}

    @Test
    public void testComputeRank() throws Exception {__CLR4_4_14j44j4kcq4sug8.R.globalSliceStart(getClass().getName(),5897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ys5y604jt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14j44j4kcq4sug8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14j44j4kcq4sug8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.DoublePercentileAggregatorFunctionTest.testComputeRank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ys5y604jt() throws Exception{try{__CLR4_4_14j44j4kcq4sug8.R.inc(5897);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5898);List<Double> data = new ArrayList<Double>();
        __CLR4_4_14j44j4kcq4sug8.R.inc(5899);data.add(0.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5900);data.add(1.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5901);data.add(2.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5902);data.add(3.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5903);data.add(4.0);
        // size of list is 5 now

        // first item
        __CLR4_4_14j44j4kcq4sug8.R.inc(5904);DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5905);int rank = fct.computeRank(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5906);assertEquals(rank, 0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5907);assertEquals(data.get(rank).doubleValue(), 0.0, DELTA);
        // last item
        __CLR4_4_14j44j4kcq4sug8.R.inc(5908);fct = new DoublePercentileAggregatorFunction(100.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5909);rank = fct.computeRank(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5910);assertEquals(rank, data.size() - 1);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5911);assertEquals(data.get(rank).doubleValue(), 4.0, DELTA);

        // middle one
        __CLR4_4_14j44j4kcq4sug8.R.inc(5912);fct = new DoublePercentileAggregatorFunction(50.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5913);rank = fct.computeRank(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5914);assertEquals(rank, 2);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5915);assertEquals(data.get(rank).doubleValue(), 2.0, DELTA);

        // 40% = 2nd item
        __CLR4_4_14j44j4kcq4sug8.R.inc(5916);fct = new DoublePercentileAggregatorFunction(40.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5917);rank = fct.computeRank(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5918);assertEquals(rank, 1);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5919);assertEquals(data.get(rank).doubleValue(), 1.0, DELTA);

        // 80% = 4th item
        __CLR4_4_14j44j4kcq4sug8.R.inc(5920);fct = new DoublePercentileAggregatorFunction(80.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5921);rank = fct.computeRank(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5922);assertEquals(rank, 3);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5923);assertEquals(data.get(rank).doubleValue(), 3.0, DELTA);

        // in between (e.g. 70%) means 3rd item
        __CLR4_4_14j44j4kcq4sug8.R.inc(5924);fct = new DoublePercentileAggregatorFunction(70.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5925);rank = fct.computeRank(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5926);assertEquals(rank, 2);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5927);assertEquals(data.get(rank).doubleValue(), 2.0, DELTA);

        // but 75% means 4th item
        __CLR4_4_14j44j4kcq4sug8.R.inc(5928);fct = new DoublePercentileAggregatorFunction(75.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5929);rank = fct.computeRank(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5930);assertEquals(rank, 3);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5931);assertEquals(data.get(rank).doubleValue(), 3.0, DELTA);
    }finally{__CLR4_4_14j44j4kcq4sug8.R.flushNeeded();}}

    @Test
    public void testEvaluateNullEmpty() throws Exception {__CLR4_4_14j44j4kcq4sug8.R.globalSliceStart(getClass().getName(),5932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqc7364ks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14j44j4kcq4sug8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14j44j4kcq4sug8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.DoublePercentileAggregatorFunctionTest.testEvaluateNullEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqc7364ks() throws Exception{try{__CLR4_4_14j44j4kcq4sug8.R.inc(5932);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5933);DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        __CLR4_4_14j44j4kcq4sug8.R.inc(5934);List<Double> data = null;
        __CLR4_4_14j44j4kcq4sug8.R.inc(5935);Double d = fct.evaluate(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5936);assertNull(d);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5937);data = new ArrayList<Double>();
        __CLR4_4_14j44j4kcq4sug8.R.inc(5938);d = fct.evaluate(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5939);assertNull(d);
    }finally{__CLR4_4_14j44j4kcq4sug8.R.flushNeeded();}}

    @Test
    public void testEvaluateNoCopy() throws Exception {__CLR4_4_14j44j4kcq4sug8.R.globalSliceStart(getClass().getName(),5940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jsy7ko4l0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14j44j4kcq4sug8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14j44j4kcq4sug8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.DoublePercentileAggregatorFunctionTest.testEvaluateNoCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jsy7ko4l0() throws Exception{try{__CLR4_4_14j44j4kcq4sug8.R.inc(5940);
        // using a copy
        __CLR4_4_14j44j4kcq4sug8.R.inc(5941);DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        __CLR4_4_14j44j4kcq4sug8.R.inc(5942);List<Double> data = new ArrayList<Double>();
        __CLR4_4_14j44j4kcq4sug8.R.inc(5943);data.add(4.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5944);data.add(3.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5945);data.add(2.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5946);data.add(1.0);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5947);data.add(0.0);
        // size of list is 5 now

        __CLR4_4_14j44j4kcq4sug8.R.inc(5948);Double d = fct.evaluate(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5949);assertEquals(d, 3.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5950);assertEquals(data.get(0), 4.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5951);assertEquals(data.get(1), 3.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5952);assertEquals(data.get(2), 2.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5953);assertEquals(data.get(3), 1.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5954);assertEquals(data.get(4), 0.0, DELTA);

        // using a copy (explicitly)
        __CLR4_4_14j44j4kcq4sug8.R.inc(5955);fct = new DoublePercentileAggregatorFunction(DEF_PERC, true);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5956);d = fct.evaluate(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5957);assertEquals(d, 3.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5958);assertEquals(data.get(0), 4.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5959);assertEquals(data.get(1), 3.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5960);assertEquals(data.get(2), 2.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5961);assertEquals(data.get(3), 1.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5962);assertEquals(data.get(4), 0.0, DELTA);

        // operate on the list directly
        __CLR4_4_14j44j4kcq4sug8.R.inc(5963);fct = new DoublePercentileAggregatorFunction(DEF_PERC, false);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5964);d = fct.evaluate(data);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5965);assertEquals(d, 3.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5966);assertEquals(data.get(4), 4.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5967);assertEquals(data.get(3), 3.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5968);assertEquals(data.get(2), 2.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5969);assertEquals(data.get(1), 1.0, DELTA);
        __CLR4_4_14j44j4kcq4sug8.R.inc(5970);assertEquals(data.get(0), 0.0, DELTA);
    }finally{__CLR4_4_14j44j4kcq4sug8.R.flushNeeded();}}
}
