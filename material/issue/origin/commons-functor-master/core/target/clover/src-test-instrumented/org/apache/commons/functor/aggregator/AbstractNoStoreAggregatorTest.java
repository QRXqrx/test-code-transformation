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
package org.apache.commons.functor.aggregator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.aggregator.AbstractNoStoreAggregator;
import org.junit.Test;

/**
 * Unit test for {@link AbstractNoStoreAggregator}. TODO: revisit after the
 * class hierarchy change
 */
public class AbstractNoStoreAggregatorTest extends BaseFunctorTest {static class __CLR4_4_149w49wkcq4sue2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,5615,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String INITIAL = "abc";

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_149w49wkcq4sue2.R.inc(5540);
        // return new TestListBackedAggregator<Object>();
        __CLR4_4_149w49wkcq4sue2.R.inc(5541);return new TestNoStoreAggregator<Object>(new String(INITIAL));
    }finally{__CLR4_4_149w49wkcq4sue2.R.flushNeeded();}}

    /**
     * Ensure data is initialised in constructor.
     */
    @Test
    public void testInitialised() throws Exception {__CLR4_4_149w49wkcq4sue2.R.globalSliceStart(getClass().getName(),5542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ma3p1a49y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149w49wkcq4sue2.R.rethrow($CLV_t2$);}finally{__CLR4_4_149w49wkcq4sue2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.AbstractNoStoreAggregatorTest.testInitialised",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ma3p1a49y() throws Exception{try{__CLR4_4_149w49wkcq4sue2.R.inc(5542);
        __CLR4_4_149w49wkcq4sue2.R.inc(5543);@SuppressWarnings("unchecked")
        TestNoStoreAggregator<Object> fct = (TestNoStoreAggregator<Object>) makeFunctor();
        __CLR4_4_149w49wkcq4sue2.R.inc(5544);assertNotNull(fct.getResult());
        __CLR4_4_149w49wkcq4sue2.R.inc(5545);TestBinaryFunction<Object> agg = (TestBinaryFunction<Object>) fct.getAggregationFunction();
        __CLR4_4_149w49wkcq4sue2.R.inc(5546);assertEquals(fct.callsInitialValue, 1);
        __CLR4_4_149w49wkcq4sue2.R.inc(5547);assertEquals(agg.calls, 0);
    }finally{__CLR4_4_149w49wkcq4sue2.R.flushNeeded();}}

    @Test
    public void testAdd() throws Exception {__CLR4_4_149w49wkcq4sue2.R.globalSliceStart(getClass().getName(),5548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e4a4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149w49wkcq4sue2.R.rethrow($CLV_t2$);}finally{__CLR4_4_149w49wkcq4sue2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.AbstractNoStoreAggregatorTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e4a4() throws Exception{try{__CLR4_4_149w49wkcq4sue2.R.inc(5548);
        __CLR4_4_149w49wkcq4sue2.R.inc(5549);@SuppressWarnings("unchecked")
        TestNoStoreAggregator<Object> fct = (TestNoStoreAggregator<Object>) makeFunctor();
        __CLR4_4_149w49wkcq4sue2.R.inc(5550);TestBinaryFunction<Object> agg = (TestBinaryFunction<Object>) fct.getAggregationFunction();
        __CLR4_4_149w49wkcq4sue2.R.inc(5551);int calls = 31; // nearly 10 pies :)
        __CLR4_4_149w49wkcq4sue2.R.inc(5552);for (int i = 1; (((i <= calls)&&(__CLR4_4_149w49wkcq4sue2.R.iget(5553)!=0|true))||(__CLR4_4_149w49wkcq4sue2.R.iget(5554)==0&false)); i++) {{
            __CLR4_4_149w49wkcq4sue2.R.inc(5555);fct.add(new Object());
            __CLR4_4_149w49wkcq4sue2.R.inc(5556);assertEquals(INITIAL, fct.getResult());
            __CLR4_4_149w49wkcq4sue2.R.inc(5557);assertEquals(fct.callsInitialValue, 1);
            __CLR4_4_149w49wkcq4sue2.R.inc(5558);assertEquals(agg.calls, i);
        }

        // now throw the exception and make sure we still count ok
        }__CLR4_4_149w49wkcq4sue2.R.inc(5559);fct.resetUsage();
        __CLR4_4_149w49wkcq4sue2.R.inc(5560);agg.exception = true;
        __CLR4_4_149w49wkcq4sue2.R.inc(5561);boolean exc = false;
        __CLR4_4_149w49wkcq4sue2.R.inc(5562);for (int i = 1; (((i <= calls)&&(__CLR4_4_149w49wkcq4sue2.R.iget(5563)!=0|true))||(__CLR4_4_149w49wkcq4sue2.R.iget(5564)==0&false)); i++) {{
            __CLR4_4_149w49wkcq4sue2.R.inc(5565);exc = false;
            __CLR4_4_149w49wkcq4sue2.R.inc(5566);try {
                __CLR4_4_149w49wkcq4sue2.R.inc(5567);fct.add(new Object());
            } catch (Exception e) {
                __CLR4_4_149w49wkcq4sue2.R.inc(5568);exc = true;
            }
            __CLR4_4_149w49wkcq4sue2.R.inc(5569);assertTrue(exc); // make sure we have actually thrown it!
            __CLR4_4_149w49wkcq4sue2.R.inc(5570);assertEquals(INITIAL, fct.getResult());
            __CLR4_4_149w49wkcq4sue2.R.inc(5571);assertEquals(agg.calls, i);
            __CLR4_4_149w49wkcq4sue2.R.inc(5572);assertEquals(fct.callsInitialValue, 0);
        }
    }}finally{__CLR4_4_149w49wkcq4sue2.R.flushNeeded();}}

    /**
     * Ensures beforeReset/afterReset is called correctly.
     */
    @Test
    public void testReset() throws Exception {__CLR4_4_149w49wkcq4sue2.R.globalSliceStart(getClass().getName(),5573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jq2kc4at();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149w49wkcq4sue2.R.rethrow($CLV_t2$);}finally{__CLR4_4_149w49wkcq4sue2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.AbstractNoStoreAggregatorTest.testReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jq2kc4at() throws Exception{try{__CLR4_4_149w49wkcq4sue2.R.inc(5573);
        __CLR4_4_149w49wkcq4sue2.R.inc(5574);@SuppressWarnings("unchecked")
        TestNoStoreAggregator<Object> fct = (TestNoStoreAggregator<Object>) makeFunctor();
        __CLR4_4_149w49wkcq4sue2.R.inc(5575);int calls = 31; // nearly 10 pies :)
        __CLR4_4_149w49wkcq4sue2.R.inc(5576);for (int i = 1; (((i <= calls)&&(__CLR4_4_149w49wkcq4sue2.R.iget(5577)!=0|true))||(__CLR4_4_149w49wkcq4sue2.R.iget(5578)==0&false)); i++) {{
            __CLR4_4_149w49wkcq4sue2.R.inc(5579);fct.reset();
            __CLR4_4_149w49wkcq4sue2.R.inc(5580);assertEquals(INITIAL, fct.getResult());
            __CLR4_4_149w49wkcq4sue2.R.inc(5581);assertEquals(fct.callsInitialValue, i + 1);
        }
    }}finally{__CLR4_4_149w49wkcq4sue2.R.flushNeeded();}}

    /**
     * Ensures beforeEvaluate/afterEvauate is called correctly.
     */
    @Test
    public void testEvaluate() throws Exception {__CLR4_4_149w49wkcq4sue2.R.globalSliceStart(getClass().getName(),5582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czkatq4b2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149w49wkcq4sue2.R.rethrow($CLV_t2$);}finally{__CLR4_4_149w49wkcq4sue2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.AbstractNoStoreAggregatorTest.testEvaluate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czkatq4b2() throws Exception{try{__CLR4_4_149w49wkcq4sue2.R.inc(5582);
        __CLR4_4_149w49wkcq4sue2.R.inc(5583);@SuppressWarnings("unchecked")
        TestNoStoreAggregator<Object> fct = (TestNoStoreAggregator<Object>) makeFunctor();
        __CLR4_4_149w49wkcq4sue2.R.inc(5584);TestBinaryFunction<Object> agg = (TestBinaryFunction<Object>) fct.getAggregationFunction();
        __CLR4_4_149w49wkcq4sue2.R.inc(5585);int calls = 31; // nearly 10 pies :)
        // test first without throwing an exception
        __CLR4_4_149w49wkcq4sue2.R.inc(5586);for (int i = 1; (((i <= calls)&&(__CLR4_4_149w49wkcq4sue2.R.iget(5587)!=0|true))||(__CLR4_4_149w49wkcq4sue2.R.iget(5588)==0&false)); i++) {{
            __CLR4_4_149w49wkcq4sue2.R.inc(5589);Object o = fct.evaluate();
            __CLR4_4_149w49wkcq4sue2.R.inc(5590);assertSame(o, fct.getResult());
            __CLR4_4_149w49wkcq4sue2.R.inc(5591);assertEquals(INITIAL, fct.getResult());
            __CLR4_4_149w49wkcq4sue2.R.inc(5592);assertEquals(agg.calls, 0);
            __CLR4_4_149w49wkcq4sue2.R.inc(5593);assertEquals(fct.callsInitialValue, 1);
        }
    }}finally{__CLR4_4_149w49wkcq4sue2.R.flushNeeded();}}

    @Test
    public void testDataSize() {__CLR4_4_149w49wkcq4sue2.R.globalSliceStart(getClass().getName(),5594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1cgrg4be();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149w49wkcq4sue2.R.rethrow($CLV_t2$);}finally{__CLR4_4_149w49wkcq4sue2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.AbstractNoStoreAggregatorTest.testDataSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1cgrg4be(){try{__CLR4_4_149w49wkcq4sue2.R.inc(5594);
        __CLR4_4_149w49wkcq4sue2.R.inc(5595);assertEquals(0, new TestNoStoreAggregator<Object>(new Object()).retrieveDataSize());
    }finally{__CLR4_4_149w49wkcq4sue2.R.flushNeeded();}}

    /**
     * Dummy binary function which always returns the first parameter.
     */
    class TestBinaryFunction<T> implements BinaryFunction<T, T, T> {
        int     calls     = 0;
        boolean exception = false; // when set to true, evaluate will throw an
                                   // exception

        public T evaluate(T left, T right) {try{__CLR4_4_149w49wkcq4sue2.R.inc(5596);
            __CLR4_4_149w49wkcq4sue2.R.inc(5597);calls++;
            __CLR4_4_149w49wkcq4sue2.R.inc(5598);if ((((exception)&&(__CLR4_4_149w49wkcq4sue2.R.iget(5599)!=0|true))||(__CLR4_4_149w49wkcq4sue2.R.iget(5600)==0&false)))
                {__CLR4_4_149w49wkcq4sue2.R.inc(5601);throw new RuntimeException();
            }__CLR4_4_149w49wkcq4sue2.R.inc(5602);return left;
        }finally{__CLR4_4_149w49wkcq4sue2.R.flushNeeded();}}
    }

    /**
     * Dummy aggregator which counts calls to before/after functions.
     */
    class TestNoStoreAggregator<T> extends AbstractNoStoreAggregator<T> {
        int callsInitialValue;

        T   initial;

        public TestNoStoreAggregator(T initial) {
            super(new TestBinaryFunction<T>());__CLR4_4_149w49wkcq4sue2.R.inc(5604);try{__CLR4_4_149w49wkcq4sue2.R.inc(5603);
            __CLR4_4_149w49wkcq4sue2.R.inc(5605);this.initial = initial;
            __CLR4_4_149w49wkcq4sue2.R.inc(5606);resetUsage();
            __CLR4_4_149w49wkcq4sue2.R.inc(5607);this.setResult(initialValue());
        }finally{__CLR4_4_149w49wkcq4sue2.R.flushNeeded();}}

        /**
         * Convenience method to reset all counters to zero (rather than
         * creating a new instance of this)
         */
        public void resetUsage() {try{__CLR4_4_149w49wkcq4sue2.R.inc(5608);
            __CLR4_4_149w49wkcq4sue2.R.inc(5609);callsInitialValue = 0;
            __CLR4_4_149w49wkcq4sue2.R.inc(5610);TestBinaryFunction<T> fct = (TestBinaryFunction<T>) getAggregationFunction();
            __CLR4_4_149w49wkcq4sue2.R.inc(5611);fct.calls = 0;
        }finally{__CLR4_4_149w49wkcq4sue2.R.flushNeeded();}}

        @Override
        protected T initialValue() {try{__CLR4_4_149w49wkcq4sue2.R.inc(5612);
            __CLR4_4_149w49wkcq4sue2.R.inc(5613);callsInitialValue++;
            __CLR4_4_149w49wkcq4sue2.R.inc(5614);return initial;
        }finally{__CLR4_4_149w49wkcq4sue2.R.flushNeeded();}}
    }
}
