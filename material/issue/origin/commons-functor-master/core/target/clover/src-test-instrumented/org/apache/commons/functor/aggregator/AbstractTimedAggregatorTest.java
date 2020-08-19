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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.aggregator.AbstractTimedAggregator;
import org.apache.commons.functor.aggregator.TimedAggregatorListener;
import org.junit.Test;

public class AbstractTimedAggregatorTest extends BaseFunctorTest {static class __CLR4_4_14bz4bzkcq4suee{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,5678,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default timer interval used in the tests. */
    private static final long DEFAULT_INTERVAL = 500L; // 0.5 second

    /** Sleep extra msecs past the interval. */
    private static final long SLEEP            = 10L;

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_14bz4bzkcq4suee.R.inc(5615);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5616);return new SimpleStoreTimedAggregator();
    }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

    @Test
    public void testCreateNoTimer() throws Exception {__CLR4_4_14bz4bzkcq4suee.R.globalSliceStart(getClass().getName(),5617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ys32b4c1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bz4bzkcq4suee.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bz4bzkcq4suee.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.AbstractTimedAggregatorTest.testCreateNoTimer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ys32b4c1() throws Exception{try{__CLR4_4_14bz4bzkcq4suee.R.inc(5617);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5618);SimpleStoreTimedAggregator agg = (SimpleStoreTimedAggregator) makeFunctor();
        __CLR4_4_14bz4bzkcq4suee.R.inc(5619);assertEquals(agg.getInterval(), 0L);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5620);assertFalse(agg.isTimerEnabled());
        __CLR4_4_14bz4bzkcq4suee.R.inc(5621);assertFalse(agg.isSharedTimer());
        __CLR4_4_14bz4bzkcq4suee.R.inc(5622);assertNull(agg.getTimerListeners());
        __CLR4_4_14bz4bzkcq4suee.R.inc(5623);assertFalse(agg.removeTimerListener(null)); // shouldn't NPE here
                                                    // because the listeners
                                                    // list is null!
        __CLR4_4_14bz4bzkcq4suee.R.inc(5624);agg.stop(); // shouldn't trigger any exceptions, even though there's no
                    // timer
    }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

    private void standardTimerTesting(SimpleStoreTimedAggregator agg, long interval) throws Exception {try{__CLR4_4_14bz4bzkcq4suee.R.inc(5625);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5626);final AtomicInteger count = new AtomicInteger();
        __CLR4_4_14bz4bzkcq4suee.R.inc(5627);TimedAggregatorListener<Integer> timedListener = new TimedAggregatorListener<Integer>() {
            public void onTimer(AbstractTimedAggregator<Integer> aggregator, Integer evaluation) {try{__CLR4_4_14bz4bzkcq4suee.R.inc(5628);
                __CLR4_4_14bz4bzkcq4suee.R.inc(5629);count.incrementAndGet();
            }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}
        };

        __CLR4_4_14bz4bzkcq4suee.R.inc(5630);assertEquals(agg.getInterval(), interval);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5631);assertEquals(agg.getTimerListeners().size(), 0);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5632);agg.addTimerListener(timedListener);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5633);List<TimedAggregatorListener<Integer>> timerListeners = agg.getTimerListeners();
        __CLR4_4_14bz4bzkcq4suee.R.inc(5634);assertTrue(timerListeners.contains(timedListener));
        __CLR4_4_14bz4bzkcq4suee.R.inc(5635);TimeUnit.MILLISECONDS.sleep(interval + SLEEP);
        // timer should have kicked in by now
        __CLR4_4_14bz4bzkcq4suee.R.inc(5636);assertTrue(count.intValue() > 0);

        __CLR4_4_14bz4bzkcq4suee.R.inc(5637);TimedAggregatorListener<Integer> wrongListener = new TimedAggregatorListener<Integer>() {
            public void onTimer(AbstractTimedAggregator<Integer> aggregator, Integer evaluation) {try{__CLR4_4_14bz4bzkcq4suee.R.inc(5638);
                // do nothing in here
            }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}
        };
        __CLR4_4_14bz4bzkcq4suee.R.inc(5639);assertFalse(agg.removeTimerListener(wrongListener));
        __CLR4_4_14bz4bzkcq4suee.R.inc(5640);assertEquals(agg.getTimerListeners().size(), 1);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5641);assertTrue(agg.removeTimerListener(timedListener));
        __CLR4_4_14bz4bzkcq4suee.R.inc(5642);int saveValue = count.get();
        __CLR4_4_14bz4bzkcq4suee.R.inc(5643);assertEquals(agg.getTimerListeners().size(), 0);
        // give enough time for the timer to kick in again
        __CLR4_4_14bz4bzkcq4suee.R.inc(5644);TimeUnit.MILLISECONDS.sleep(interval + SLEEP);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5645);assertEquals(saveValue, count.get());
    }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

    @Test
    public void testCreateIntervalParam() throws Exception {__CLR4_4_14bz4bzkcq4suee.R.globalSliceStart(getClass().getName(),5646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgm4sf4cu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bz4bzkcq4suee.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bz4bzkcq4suee.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.AbstractTimedAggregatorTest.testCreateIntervalParam",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgm4sf4cu() throws Exception{try{__CLR4_4_14bz4bzkcq4suee.R.inc(5646);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5647);SimpleStoreTimedAggregator agg = new SimpleStoreTimedAggregator(DEFAULT_INTERVAL);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5648);assertTrue(agg.isTimerEnabled());
        __CLR4_4_14bz4bzkcq4suee.R.inc(5649);assertFalse(agg.isSharedTimer());
        __CLR4_4_14bz4bzkcq4suee.R.inc(5650);standardTimerTesting(agg, DEFAULT_INTERVAL);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5651);agg.stop();
    }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

    @Test
    public void testCreateNotSharedTimer() throws Exception {__CLR4_4_14bz4bzkcq4suee.R.globalSliceStart(getClass().getName(),5652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7ag5a4d0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bz4bzkcq4suee.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bz4bzkcq4suee.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.AbstractTimedAggregatorTest.testCreateNotSharedTimer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7ag5a4d0() throws Exception{try{__CLR4_4_14bz4bzkcq4suee.R.inc(5652);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5653);SimpleStoreTimedAggregator agg = new SimpleStoreTimedAggregator(DEFAULT_INTERVAL, false);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5654);assertTrue(agg.isTimerEnabled());
        __CLR4_4_14bz4bzkcq4suee.R.inc(5655);assertFalse(agg.isSharedTimer());
        __CLR4_4_14bz4bzkcq4suee.R.inc(5656);standardTimerTesting(agg, DEFAULT_INTERVAL);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5657);agg.stop();
    }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

    @Test
    public void testCreateSharedTimer() throws Exception {__CLR4_4_14bz4bzkcq4suee.R.globalSliceStart(getClass().getName(),5658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0xd7r4d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bz4bzkcq4suee.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bz4bzkcq4suee.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.AbstractTimedAggregatorTest.testCreateSharedTimer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0xd7r4d6() throws Exception{try{__CLR4_4_14bz4bzkcq4suee.R.inc(5658);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5659);SimpleStoreTimedAggregator agg = new SimpleStoreTimedAggregator(DEFAULT_INTERVAL, true);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5660);assertTrue(agg.isTimerEnabled());
        __CLR4_4_14bz4bzkcq4suee.R.inc(5661);assertTrue(agg.isSharedTimer());
        __CLR4_4_14bz4bzkcq4suee.R.inc(5662);standardTimerTesting(agg, DEFAULT_INTERVAL);
        __CLR4_4_14bz4bzkcq4suee.R.inc(5663);agg.stop();
    }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

    /**
     * Simple timed aggregator which just stores the latest object and returns
     * it when evaluating the result.
     *
     * @author Liviu Tudor http://about.me/liviutudor
     */
    class SimpleStoreTimedAggregator extends AbstractTimedAggregator<Integer> {
        private Integer object;

        public SimpleStoreTimedAggregator() {
            super();__CLR4_4_14bz4bzkcq4suee.R.inc(5665);try{__CLR4_4_14bz4bzkcq4suee.R.inc(5664);
        }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

        public SimpleStoreTimedAggregator(long interval) {
            super(interval);__CLR4_4_14bz4bzkcq4suee.R.inc(5667);try{__CLR4_4_14bz4bzkcq4suee.R.inc(5666);
        }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

        public SimpleStoreTimedAggregator(long interval, boolean useSharedTimer) {
            super(interval, useSharedTimer);__CLR4_4_14bz4bzkcq4suee.R.inc(5669);try{__CLR4_4_14bz4bzkcq4suee.R.inc(5668);
        }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

        @Override
        protected void doAdd(Integer data) {try{__CLR4_4_14bz4bzkcq4suee.R.inc(5670);
            __CLR4_4_14bz4bzkcq4suee.R.inc(5671);this.object = data;
        }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

        @Override
        protected Integer doEvaluate() {try{__CLR4_4_14bz4bzkcq4suee.R.inc(5672);
            __CLR4_4_14bz4bzkcq4suee.R.inc(5673);return object;
        }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

        @Override
        protected int retrieveDataSize() {try{__CLR4_4_14bz4bzkcq4suee.R.inc(5674);
            __CLR4_4_14bz4bzkcq4suee.R.inc(5675);return 1;
        }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}

        @Override
        protected void doReset() {try{__CLR4_4_14bz4bzkcq4suee.R.inc(5676);
            __CLR4_4_14bz4bzkcq4suee.R.inc(5677);object = Integer.valueOf(0);
        }finally{__CLR4_4_14bz4bzkcq4suee.R.flushNeeded();}}
    }
}
