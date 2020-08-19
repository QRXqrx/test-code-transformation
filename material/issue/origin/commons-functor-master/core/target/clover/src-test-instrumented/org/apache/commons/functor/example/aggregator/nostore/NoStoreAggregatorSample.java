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

package org.apache.commons.functor.example.aggregator.nostore;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.functor.aggregator.AbstractNoStoreAggregator;
import org.apache.commons.functor.aggregator.AbstractTimedAggregator;
import org.apache.commons.functor.aggregator.TimedAggregatorListener;
import org.apache.commons.functor.aggregator.functions.IntegerCountAggregatorBinaryFunction;
import org.apache.commons.functor.aggregator.functions.IntegerMaxAggregatorBinaryFunction;
import org.apache.commons.functor.aggregator.functions.IntegerSumAggregatorBinaryFunction;
import org.junit.Test;

/**
 * Examples of using a {@link AbstractNoStoreAggregator}.
 */
public class NoStoreAggregatorSample {public static class __CLR4_4_17gq7gqkcq4sv8s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,9721,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Shows how to use a simple <i>nostore</i> aggregator to just count number
     * of times data is added.
     */
    @Test
    public void countItems() {try{__CLR4_4_17gq7gqkcq4sv8s.R.inc(9674);
        // no timer used
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9675);AbstractNoStoreAggregator<Integer> counter = new AbstractNoStoreAggregator<Integer>(
                new IntegerCountAggregatorBinaryFunction()) {
            @Override
            protected Integer initialValue() {try{__CLR4_4_17gq7gqkcq4sv8s.R.inc(9676);
                __CLR4_4_17gq7gqkcq4sv8s.R.inc(9677);return 0;
            }finally{__CLR4_4_17gq7gqkcq4sv8s.R.flushNeeded();}}
        };
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9678);counter.add(100);
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9679);int eval = counter.evaluate();
        // result of evaluate() is 1 as we only added 1 item
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9680);assertEquals(eval, 1);
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9681);counter.add(1);
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9682);counter.add(2);
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9683);eval = counter.evaluate();
        // result is now 3 as we added 2 more items
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9684);assertEquals(eval, 3);

        // since there is no timer, we need to reset the data manually
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9685);counter.reset();
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9686);eval = counter.evaluate();
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9687);assertEquals(eval, 0);
    }finally{__CLR4_4_17gq7gqkcq4sv8s.R.flushNeeded();}}

    /**
     * Shows how to sum up all the items passed in and "flush" them regularly on
     * a timer. When the flushing occurs, we print the evaluation to console.
     */
    @Test
    public void sumItems() throws Exception {try{__CLR4_4_17gq7gqkcq4sv8s.R.inc(9688);
        // prepare the listener
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9689);TimedAggregatorListener<Integer> listener = new TimedAggregatorListener<Integer>() {
            public void onTimer(AbstractTimedAggregator<Integer> aggregator, Integer evaluation) {try{__CLR4_4_17gq7gqkcq4sv8s.R.inc(9690);
                __CLR4_4_17gq7gqkcq4sv8s.R.inc(9691);System.out.println("Current sum is :" + evaluation);
            }finally{__CLR4_4_17gq7gqkcq4sv8s.R.flushNeeded();}}
        };
        // flush data regularly every 1/2 second
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9692);AbstractNoStoreAggregator<Integer> sum = new AbstractNoStoreAggregator<Integer>(
                new IntegerSumAggregatorBinaryFunction(), 500) {
            @Override
            protected Integer initialValue() {try{__CLR4_4_17gq7gqkcq4sv8s.R.inc(9693);
                __CLR4_4_17gq7gqkcq4sv8s.R.inc(9694);return 0;
            }finally{__CLR4_4_17gq7gqkcq4sv8s.R.flushNeeded();}}
        };
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9695);sum.addTimerListener(listener);

        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9696);long startTime = System.currentTimeMillis();
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9697);long stopAfter = 5000; // 5 seconds
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9698);int maxInt = 100;
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9699);Random rnd = new Random();
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9700);while ((((System.currentTimeMillis() - startTime <= stopAfter)&&(__CLR4_4_17gq7gqkcq4sv8s.R.iget(9701)!=0|true))||(__CLR4_4_17gq7gqkcq4sv8s.R.iget(9702)==0&false))) {{
            __CLR4_4_17gq7gqkcq4sv8s.R.inc(9703);sum.add(rnd.nextInt(maxInt));
            __CLR4_4_17gq7gqkcq4sv8s.R.inc(9704);TimeUnit.MILLISECONDS.sleep(rnd.nextInt(maxInt));
        }
        }__CLR4_4_17gq7gqkcq4sv8s.R.inc(9705);sum.stop();
    }finally{__CLR4_4_17gq7gqkcq4sv8s.R.flushNeeded();}}

    /**
     * Calculate the maximum value of a series of numbers.
     */
    @Test
    public void maxValue() throws Exception {try{__CLR4_4_17gq7gqkcq4sv8s.R.inc(9706);
        // no timer
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9707);AbstractNoStoreAggregator<Integer> sum = new AbstractNoStoreAggregator<Integer>(
                new IntegerMaxAggregatorBinaryFunction()) {
            @Override
            protected Integer initialValue() {try{__CLR4_4_17gq7gqkcq4sv8s.R.inc(9708);
                __CLR4_4_17gq7gqkcq4sv8s.R.inc(9709);return 0;
            }finally{__CLR4_4_17gq7gqkcq4sv8s.R.flushNeeded();}}
        };

        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9710);long startTime = System.currentTimeMillis();
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9711);long stopAfter = 5000; // 5 seconds
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9712);int maxInt = 100;
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9713);Random rnd = new Random();
        __CLR4_4_17gq7gqkcq4sv8s.R.inc(9714);while ((((System.currentTimeMillis() - startTime <= stopAfter)&&(__CLR4_4_17gq7gqkcq4sv8s.R.iget(9715)!=0|true))||(__CLR4_4_17gq7gqkcq4sv8s.R.iget(9716)==0&false))) {{
            __CLR4_4_17gq7gqkcq4sv8s.R.inc(9717);sum.add(rnd.nextInt());
            __CLR4_4_17gq7gqkcq4sv8s.R.inc(9718);System.out.println( "Max so far is " + sum.evaluate());
            __CLR4_4_17gq7gqkcq4sv8s.R.inc(9719);TimeUnit.MILLISECONDS.sleep(rnd.nextInt(maxInt));
        }
        }__CLR4_4_17gq7gqkcq4sv8s.R.inc(9720);sum.stop();
    }finally{__CLR4_4_17gq7gqkcq4sv8s.R.flushNeeded();}}
}
