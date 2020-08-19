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
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.aggregator.functions.DoubleMeanValueAggregatorFunction;
import org.junit.Test;

/**
 * Unit test for {@link DoubleMeanValueAggregatorFunction}.
 */
public class DoubleMeanValueAggregatorFunctionTest extends BaseFunctorTest {static class __CLR4_4_14g44g4kcq4sufa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,5801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_14g44g4kcq4sufa.R.inc(5764);
        __CLR4_4_14g44g4kcq4sufa.R.inc(5765);return new DoubleMeanValueAggregatorFunction();
    }finally{__CLR4_4_14g44g4kcq4sufa.R.flushNeeded();}}

    @Test
    public void testEmptyList() throws Exception {__CLR4_4_14g44g4kcq4sufa.R.globalSliceStart(getClass().getName(),5766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6zsw4g6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g44g4kcq4sufa.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g44g4kcq4sufa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.DoubleMeanValueAggregatorFunctionTest.testEmptyList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6zsw4g6() throws Exception{try{__CLR4_4_14g44g4kcq4sufa.R.inc(5766);
        __CLR4_4_14g44g4kcq4sufa.R.inc(5767);DoubleMeanValueAggregatorFunction fct = (DoubleMeanValueAggregatorFunction)makeFunctor();
        __CLR4_4_14g44g4kcq4sufa.R.inc(5768);List<Double> lst = null;
        __CLR4_4_14g44g4kcq4sufa.R.inc(5769);Double res = fct.evaluate(lst);
        __CLR4_4_14g44g4kcq4sufa.R.inc(5770);assertNull( res );
        __CLR4_4_14g44g4kcq4sufa.R.inc(5771);lst = new ArrayList<Double>();
        __CLR4_4_14g44g4kcq4sufa.R.inc(5772);res = fct.evaluate(lst);
        __CLR4_4_14g44g4kcq4sufa.R.inc(5773);assertNull( res );
    }finally{__CLR4_4_14g44g4kcq4sufa.R.flushNeeded();}}

    @Test
    public void testMean() throws Exception {__CLR4_4_14g44g4kcq4sufa.R.globalSliceStart(getClass().getName(),5774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g14ffm4ge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g44g4kcq4sufa.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g44g4kcq4sufa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.functions.DoubleMeanValueAggregatorFunctionTest.testMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g14ffm4ge() throws Exception{try{__CLR4_4_14g44g4kcq4sufa.R.inc(5774);
        __CLR4_4_14g44g4kcq4sufa.R.inc(5775);DoubleMeanValueAggregatorFunction fct = (DoubleMeanValueAggregatorFunction)makeFunctor();
        __CLR4_4_14g44g4kcq4sufa.R.inc(5776);List<Double> lst = new ArrayList<Double>();
        __CLR4_4_14g44g4kcq4sufa.R.inc(5777);lst.add( 0.0 );
        __CLR4_4_14g44g4kcq4sufa.R.inc(5778);double res = fct.evaluate(lst);
        __CLR4_4_14g44g4kcq4sufa.R.inc(5779);assertEquals(res, 0.0, 0.01);
        __CLR4_4_14g44g4kcq4sufa.R.inc(5780);lst.add( 1.0 );
        __CLR4_4_14g44g4kcq4sufa.R.inc(5781);res = fct.evaluate( lst );
        __CLR4_4_14g44g4kcq4sufa.R.inc(5782);assertEquals( res, 0.5, 0.01 );
        __CLR4_4_14g44g4kcq4sufa.R.inc(5783);lst.add( 2.0 );
        __CLR4_4_14g44g4kcq4sufa.R.inc(5784);res = fct.evaluate( lst );
        __CLR4_4_14g44g4kcq4sufa.R.inc(5785);assertEquals( res, 1.0, 0.01 );
        //finally carry out a random mean computation
        __CLR4_4_14g44g4kcq4sufa.R.inc(5786);int calls = 31;
        __CLR4_4_14g44g4kcq4sufa.R.inc(5787);double total;
        __CLR4_4_14g44g4kcq4sufa.R.inc(5788);for( int i = 2; (((i <= calls)&&(__CLR4_4_14g44g4kcq4sufa.R.iget(5789)!=0|true))||(__CLR4_4_14g44g4kcq4sufa.R.iget(5790)==0&false)); i++ ) {{
            __CLR4_4_14g44g4kcq4sufa.R.inc(5791);lst.clear();
            __CLR4_4_14g44g4kcq4sufa.R.inc(5792);total = 0.0;
            __CLR4_4_14g44g4kcq4sufa.R.inc(5793);for( int j = 1; (((j <= i)&&(__CLR4_4_14g44g4kcq4sufa.R.iget(5794)!=0|true))||(__CLR4_4_14g44g4kcq4sufa.R.iget(5795)==0&false)); j++ ) {{
                __CLR4_4_14g44g4kcq4sufa.R.inc(5796);lst.add( (double)j );
                __CLR4_4_14g44g4kcq4sufa.R.inc(5797);total += j;
            }
            }__CLR4_4_14g44g4kcq4sufa.R.inc(5798);total /= i;
            __CLR4_4_14g44g4kcq4sufa.R.inc(5799);res = fct.evaluate( lst );
            __CLR4_4_14g44g4kcq4sufa.R.inc(5800);assertEquals( res, total, 0.01 );
        }
    }}finally{__CLR4_4_14g44g4kcq4sufa.R.flushNeeded();}}
}
