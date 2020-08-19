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
import org.apache.commons.functor.aggregator.functions.IntegerPercentileAggregatorFunction;
import org.junit.Test;

/**
 * Unit test for {@link IntegerPercentileAggregatorFunction}.
 */
public class IntPercentileAggregatorFunctionTest extends BaseFunctorTest {static class __CLR4_4_14sr4srkcq4suhz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,6318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final double DELTA    = 0.01; // make room for some poor
                                                 // floating point support

    private static final double DEF_PERC = 90;  // by default use the 90th
                                                 // percentile

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_14sr4srkcq4suhz.R.inc(6219);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6220);return new IntegerPercentileAggregatorFunction(DEF_PERC);
    }finally{__CLR4_4_14sr4srkcq4suhz.R.flushNeeded();}}

    @Test
    public void testCreate() throws Exception {__CLR4_4_14sr4srkcq4suhz.R.globalSliceStart(getClass().getName(),6221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nf4c54st();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sr4srkcq4suhz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sr4srkcq4suhz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.IntPercentileAggregatorFunctionTest.testCreate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nf4c54st() throws Exception{try{__CLR4_4_14sr4srkcq4suhz.R.inc(6221);
        // default
        __CLR4_4_14sr4srkcq4suhz.R.inc(6222);IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        __CLR4_4_14sr4srkcq4suhz.R.inc(6223);assertTrue(fct.isUseCopy());
        __CLR4_4_14sr4srkcq4suhz.R.inc(6224);assertEquals(fct.getPercentile(), DEF_PERC, DELTA);

        // different percentage
        __CLR4_4_14sr4srkcq4suhz.R.inc(6225);double perc = 50.0;
        __CLR4_4_14sr4srkcq4suhz.R.inc(6226);fct = new IntegerPercentileAggregatorFunction(perc);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6227);assertTrue(fct.isUseCopy());
        __CLR4_4_14sr4srkcq4suhz.R.inc(6228);assertEquals(fct.getPercentile(), perc, DELTA);

        // use copy
        __CLR4_4_14sr4srkcq4suhz.R.inc(6229);fct = new IntegerPercentileAggregatorFunction(perc, false);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6230);assertFalse(fct.isUseCopy());
        __CLR4_4_14sr4srkcq4suhz.R.inc(6231);assertEquals(fct.getPercentile(), perc, DELTA);

        // test illegal exc
        __CLR4_4_14sr4srkcq4suhz.R.inc(6232);boolean exc = false;
        __CLR4_4_14sr4srkcq4suhz.R.inc(6233);fct = null;
        __CLR4_4_14sr4srkcq4suhz.R.inc(6234);try {
            __CLR4_4_14sr4srkcq4suhz.R.inc(6235);fct = new IntegerPercentileAggregatorFunction(-100);
        } catch (IllegalArgumentException e) {
            __CLR4_4_14sr4srkcq4suhz.R.inc(6236);exc = true;
        }
        __CLR4_4_14sr4srkcq4suhz.R.inc(6237);assertTrue(exc);

        __CLR4_4_14sr4srkcq4suhz.R.inc(6238);fct = null;
        __CLR4_4_14sr4srkcq4suhz.R.inc(6239);exc = false;
        __CLR4_4_14sr4srkcq4suhz.R.inc(6240);try {
            __CLR4_4_14sr4srkcq4suhz.R.inc(6241);fct = new IntegerPercentileAggregatorFunction(101);
        } catch (IllegalArgumentException e) {
            __CLR4_4_14sr4srkcq4suhz.R.inc(6242);exc = true;
        }
        __CLR4_4_14sr4srkcq4suhz.R.inc(6243);assertTrue(exc);
    }finally{__CLR4_4_14sr4srkcq4suhz.R.flushNeeded();}}

    @Test
    public void testComputeRank() throws Exception {__CLR4_4_14sr4srkcq4suhz.R.globalSliceStart(getClass().getName(),6244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ys5y604tg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sr4srkcq4suhz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sr4srkcq4suhz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.IntPercentileAggregatorFunctionTest.testComputeRank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ys5y604tg() throws Exception{try{__CLR4_4_14sr4srkcq4suhz.R.inc(6244);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6245);List<Integer> data = new ArrayList<Integer>();
        __CLR4_4_14sr4srkcq4suhz.R.inc(6246);data.add(0);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6247);data.add(1);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6248);data.add(2);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6249);data.add(3);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6250);data.add(4);
        // size of list is 5 now

        // first item
        __CLR4_4_14sr4srkcq4suhz.R.inc(6251);IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6252);int rank = fct.computeRank(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6253);assertEquals(rank, 0);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6254);assertEquals(data.get(rank).intValue(), 0);
        // last item
        __CLR4_4_14sr4srkcq4suhz.R.inc(6255);fct = new IntegerPercentileAggregatorFunction(100.0);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6256);rank = fct.computeRank(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6257);assertEquals(rank, data.size() - 1);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6258);assertEquals(data.get(rank).intValue(), 4);

        // middle one
        __CLR4_4_14sr4srkcq4suhz.R.inc(6259);fct = new IntegerPercentileAggregatorFunction(50.0);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6260);rank = fct.computeRank(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6261);assertEquals(rank, 2);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6262);assertEquals(data.get(rank).intValue(), 2);

        // 40% = 2nd item
        __CLR4_4_14sr4srkcq4suhz.R.inc(6263);fct = new IntegerPercentileAggregatorFunction(40.0);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6264);rank = fct.computeRank(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6265);assertEquals(rank, 1);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6266);assertEquals(data.get(rank).intValue(), 1);

        // 80% = 4th item
        __CLR4_4_14sr4srkcq4suhz.R.inc(6267);fct = new IntegerPercentileAggregatorFunction(80.0);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6268);rank = fct.computeRank(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6269);assertEquals(rank, 3);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6270);assertEquals(data.get(rank).intValue(), 3);

        // in between (e.g. 70%) means 3rd item
        __CLR4_4_14sr4srkcq4suhz.R.inc(6271);fct = new IntegerPercentileAggregatorFunction(70.0);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6272);rank = fct.computeRank(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6273);assertEquals(rank, 2);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6274);assertEquals(data.get(rank).intValue(), 2);

        // but 75% means 4th item
        __CLR4_4_14sr4srkcq4suhz.R.inc(6275);fct = new IntegerPercentileAggregatorFunction(75.0);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6276);rank = fct.computeRank(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6277);assertEquals(rank, 3);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6278);assertEquals(data.get(rank).intValue(), 3);
    }finally{__CLR4_4_14sr4srkcq4suhz.R.flushNeeded();}}

    @Test
    public void testEvaluateNullEmpty() throws Exception {__CLR4_4_14sr4srkcq4suhz.R.globalSliceStart(getClass().getName(),6279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqc7364uf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sr4srkcq4suhz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sr4srkcq4suhz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.IntPercentileAggregatorFunctionTest.testEvaluateNullEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqc7364uf() throws Exception{try{__CLR4_4_14sr4srkcq4suhz.R.inc(6279);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6280);IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        __CLR4_4_14sr4srkcq4suhz.R.inc(6281);List<Integer> data = null;
        __CLR4_4_14sr4srkcq4suhz.R.inc(6282);Integer d = fct.evaluate(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6283);assertNull(d);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6284);data = new ArrayList<Integer>();
        __CLR4_4_14sr4srkcq4suhz.R.inc(6285);d = fct.evaluate(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6286);assertNull(d);
    }finally{__CLR4_4_14sr4srkcq4suhz.R.flushNeeded();}}

    @Test
    public void testEvaluateNoCopy() throws Exception {__CLR4_4_14sr4srkcq4suhz.R.globalSliceStart(getClass().getName(),6287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jsy7ko4un();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14sr4srkcq4suhz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14sr4srkcq4suhz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.IntPercentileAggregatorFunctionTest.testEvaluateNoCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jsy7ko4un() throws Exception{try{__CLR4_4_14sr4srkcq4suhz.R.inc(6287);
        // using a copy
        __CLR4_4_14sr4srkcq4suhz.R.inc(6288);IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        __CLR4_4_14sr4srkcq4suhz.R.inc(6289);List<Integer> data = new ArrayList<Integer>();
        __CLR4_4_14sr4srkcq4suhz.R.inc(6290);data.add(4);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6291);data.add(3);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6292);data.add(2);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6293);data.add(1);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6294);data.add(0);
        // size of list is 5 now

        __CLR4_4_14sr4srkcq4suhz.R.inc(6295);Integer d = fct.evaluate(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6296);assertEquals(d.intValue(), 3);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6297);assertEquals(data.get(0).intValue(), 4);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6298);assertEquals(data.get(1).intValue(), 3);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6299);assertEquals(data.get(2).intValue(), 2);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6300);assertEquals(data.get(3).intValue(), 1);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6301);assertEquals(data.get(4).intValue(), 0);

        // using a copy (explicitly)
        __CLR4_4_14sr4srkcq4suhz.R.inc(6302);fct = new IntegerPercentileAggregatorFunction(DEF_PERC, true);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6303);d = fct.evaluate(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6304);assertEquals(d.intValue(), 3);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6305);assertEquals(data.get(0).intValue(), 4);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6306);assertEquals(data.get(1).intValue(), 3);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6307);assertEquals(data.get(2).intValue(), 2);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6308);assertEquals(data.get(3).intValue(), 1);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6309);assertEquals(data.get(4).intValue(), 0);

        // operate on the list directly
        __CLR4_4_14sr4srkcq4suhz.R.inc(6310);fct = new IntegerPercentileAggregatorFunction(DEF_PERC, false);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6311);d = fct.evaluate(data);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6312);assertEquals(d.intValue(), 3);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6313);assertEquals(data.get(4).intValue(), 4);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6314);assertEquals(data.get(3).intValue(), 3);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6315);assertEquals(data.get(2).intValue(), 2);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6316);assertEquals(data.get(1).intValue(), 1);
        __CLR4_4_14sr4srkcq4suhz.R.inc(6317);assertEquals(data.get(0).intValue(), 0);
    }finally{__CLR4_4_14sr4srkcq4suhz.R.flushNeeded();}}
}
