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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.functor.Function;

/**
 * Implementation of an aggregator which stores the data series in an
 * <code>ArrayList</code>.
 *
 * @param <T>
 *            Type of object stored in the data series.
 */
public class ArrayListBackedAggregator<T> extends AbstractListBackedAggregator<T> {public static class __CLR4_4_1wmwmkcq4st9b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,1184,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Similar to {@link #ArrayListBackedAggregator(Function, long)
     * ArrayListBackedAggregator(aggregationFunction, 0L)}.
     *
     * @param aggregationFunction
     *            Aggregation function to use in {@link #evaluate()}. Throws
     *            <code>NullPointerException</code> if this is <code>null</code>
     */
    public ArrayListBackedAggregator(Function<List<T>, T> aggregationFunction) {
        this(aggregationFunction, 0L);__CLR4_4_1wmwmkcq4st9b.R.inc(1175);try{__CLR4_4_1wmwmkcq4st9b.R.inc(1174);
    }finally{__CLR4_4_1wmwmkcq4st9b.R.flushNeeded();}}

    /**
     * Similar to
     * {@link #ArrayListBackedAggregator(Function, long, boolean)
     * ArrayListBackedAggregator(aggregationFunction,interval,false)}.
     *
     * @param aggregationFunction
     *            Aggregation function to use in {@link #evaluate()}. Throws
     *            <code>NullPointerException</code> if this is <code>null</code>
     * @param interval
     *            interval in miliseconds to reset this aggregator
     */
    public ArrayListBackedAggregator(Function<List<T>, T> aggregationFunction, long interval) {
        this(aggregationFunction, interval, false);__CLR4_4_1wmwmkcq4st9b.R.inc(1177);try{__CLR4_4_1wmwmkcq4st9b.R.inc(1176);
    }finally{__CLR4_4_1wmwmkcq4st9b.R.flushNeeded();}}

    /**
     * Initializes an aggregator with the given function, interval and decides
     * whether to use the shared timer or own timer.
     *
     * @param aggregationFunction
     *            Aggregation function to use in {@link #evaluate()}. Throws
     *            <code>NullPointerException</code> if this is <code>null</code>
     * @param interval
     *            interval in miliseconds to reset this aggregator
     * @param useSharedTimer
     *            if set to true, it shares a timer across instances as per
     *            {@link AbstractTimedAggregator#AbstractTimedAggregator(long,boolean)}
     *            , otherwise this instance will use its private timer
     */
    public ArrayListBackedAggregator(Function<List<T>, T> aggregationFunction, long interval,
            boolean useSharedTimer) {
        super(aggregationFunction, interval, useSharedTimer);__CLR4_4_1wmwmkcq4st9b.R.inc(1179);try{__CLR4_4_1wmwmkcq4st9b.R.inc(1178);
    }finally{__CLR4_4_1wmwmkcq4st9b.R.flushNeeded();}}

    /**
     * Creates an instance of <code>ArrayList</code> and returns it.
     *
     * @return newly created <code>ArrayList</code> (with default initial
     *         capacity as per JDK).
     */
    @Override
    protected List<T> createList() {try{__CLR4_4_1wmwmkcq4st9b.R.inc(1180);
        __CLR4_4_1wmwmkcq4st9b.R.inc(1181);return new ArrayList<T>();
    }finally{__CLR4_4_1wmwmkcq4st9b.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_1wmwmkcq4st9b.R.inc(1182);
        __CLR4_4_1wmwmkcq4st9b.R.inc(1183);return ArrayListBackedAggregator.class.getName();
    }finally{__CLR4_4_1wmwmkcq4st9b.R.flushNeeded();}}
}
