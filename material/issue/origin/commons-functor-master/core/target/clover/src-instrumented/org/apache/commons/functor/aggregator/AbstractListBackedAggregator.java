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

import java.util.List;

import org.apache.commons.functor.Function;
import org.apache.commons.lang3.Validate;

/**
 * An aggregator which stores the data series in a List. Every call to
 * {@link #add(Object)} will add an item in the array and there is no limit to
 * how much data we can store. It is down to subclasses to decide which types of
 * List implementation they need to used -- and the abstract factory
 * {@link #createList()} is provided for this.
 * <p>This implementation also allows for various "aggregations" of the list to be
 * used by providing a {@link Function Function<List<T>, T>} in the
 * constructor.</p>
 * <p>
 * <b>Thread safety</b> : Note that due to the fact that
 * {@link AbstractTimedAggregator} provides a threadsafe environment for access
 * to data, the <code>List</code> implementation can be unsynchronized.
 * </p>
 *
 * @param <T>
 *            Type of object stored.
 * @see AbstractTimedAggregator
 */
public abstract class AbstractListBackedAggregator<T> extends AbstractTimedAggregator<T> {public static class __CLR4_4_1snsnkcq4st7v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,1053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Stores the data series we ought to aggregate/evaluate. This list can only
     * be modified via {@link #reset()} and {@link #add(Object)} and will be
     * traversed during {@link #evaluate()}.
     */
    private List<T>                   series;

    /**
     * Used to actually aggregate the data when {@link #evaluate()} is called.
     * This is set in {@link #AbstractListBackedAggregator() the constructor}.
     */
    private Function<List<T>, T> aggregationFunction;

    /**
     * Default constructor. Similar to
     * {@link #AbstractListBackedAggregator(Function, long)
     * AbstractListBackedAggregator(aggregationFunction,0L}.
     *
     * @param aggregationFunction
     *            Aggregation function to use in {@link #evaluate()}. Throws
     *            <code>NullPointerException</code> if this is <code>null</code>
     */
    public AbstractListBackedAggregator(Function<List<T>, T> aggregationFunction) {
        this(aggregationFunction, 0L);__CLR4_4_1snsnkcq4st7v.R.inc(1032);try{__CLR4_4_1snsnkcq4st7v.R.inc(1031);
    }finally{__CLR4_4_1snsnkcq4st7v.R.flushNeeded();}}

    /**
     * Similar to
     * {@link #AbstractListBackedAggregator(Function, long, boolean)
     * AbstractListBackedAggregator(aggregationFunction,interval,false}.
     *
     * @param aggregationFunction
     *            Aggregation function to use in {@link #evaluate()}. Throws
     *            <code>NullPointerException</code> if this is <code>null</code>
     * @param interval
     *            interval in miliseconds to reset this aggregator
     */
    public AbstractListBackedAggregator(Function<List<T>, T> aggregationFunction, long interval) {
        this(aggregationFunction, interval, false);__CLR4_4_1snsnkcq4st7v.R.inc(1034);try{__CLR4_4_1snsnkcq4st7v.R.inc(1033);
    }finally{__CLR4_4_1snsnkcq4st7v.R.flushNeeded();}}

    /**
     * Constructs an aggregator which will use the given function, reset itself
     * at the given interval and will use a shared timer on own private timer.
     *
     * @param aggregationFunction
     *            Aggregation function to use in {@link #evaluate()}. Throws
     *            <code>NullPointerException</code> if this is <code>null</code>
     * @param interval
     *            interval in miliseconds to reset this aggregator
     * @param useSharedTimer
     *            if set to true, it will use a shared timer, as per
     *            {@link AbstractTimedAggregator#AbstractTimedAggregator(long, boolean)}
     *            ; otherwise if it's false it will use its own timer instance
     * @see AbstractTimedAggregator#AbstractTimedAggregator(long, boolean)
     */
    public AbstractListBackedAggregator(Function<List<T>, T> aggregationFunction, long interval,
            boolean useSharedTimer) {
        super(interval, useSharedTimer);__CLR4_4_1snsnkcq4st7v.R.inc(1036);try{__CLR4_4_1snsnkcq4st7v.R.inc(1035);
        __CLR4_4_1snsnkcq4st7v.R.inc(1037);this.aggregationFunction = Validate.notNull(aggregationFunction, "Function argument must not be null");
        __CLR4_4_1snsnkcq4st7v.R.inc(1038);this.series = createList();
    }finally{__CLR4_4_1snsnkcq4st7v.R.flushNeeded();}}

    /**
     * Adds data to the series which will be aggregated. This implementation
     * simply adds the data to the {@link #series} list.
     *
     * @param data
     *            Data to be added to the data series.
     */
    @Override
    public final void doAdd(T data) {try{__CLR4_4_1snsnkcq4st7v.R.inc(1039);
        __CLR4_4_1snsnkcq4st7v.R.inc(1040);series.add(data);
    }finally{__CLR4_4_1snsnkcq4st7v.R.flushNeeded();}}

    /**
     * The actual "beef" of this class: iterate through the list and aggregates
     * all the data and evaluates the result. This is done by calling
     * <code>aggregationFunction.evaluate(series)</code>.
     *
     * @return the result of <code>aggregationFunction.evaluate(series)</code>
     * @see Aggregator#evaluate()
     */
    @Override
    protected final T doEvaluate() {try{__CLR4_4_1snsnkcq4st7v.R.inc(1041);
        __CLR4_4_1snsnkcq4st7v.R.inc(1042);return aggregationFunction.evaluate(series);
    }finally{__CLR4_4_1snsnkcq4st7v.R.flushNeeded();}}

    /**
     * Resets the data series to the empty state.
     */
    @Override
    protected final void doReset() {try{__CLR4_4_1snsnkcq4st7v.R.inc(1043);
        __CLR4_4_1snsnkcq4st7v.R.inc(1044);series.clear();
    }finally{__CLR4_4_1snsnkcq4st7v.R.flushNeeded();}}

    /**
     * Allows subclasses to create the list which will store the {@link #series
     * data series}.
     *
     * @return an instance of <code>List</code> which will be used to store the
     *         data.
     */
    protected abstract List<T> createList();

    /**
     * Getter for {@link #series}.
     *
     * @return Value of {@link #series}
     */
    protected final List<T> getSeries() {try{__CLR4_4_1snsnkcq4st7v.R.inc(1045);
        __CLR4_4_1snsnkcq4st7v.R.inc(1046);return series;
    }finally{__CLR4_4_1snsnkcq4st7v.R.flushNeeded();}}

    /**
     * Simply returns the size of the data series which is the size of the list
     * used internally.
     *
     * @return Size of {@link #series} -- equivalent to
     *         <code>series.size()</code>
     */
    @Override
    protected final int retrieveDataSize() {try{__CLR4_4_1snsnkcq4st7v.R.inc(1047);
        __CLR4_4_1snsnkcq4st7v.R.inc(1048);return series.size();
    }finally{__CLR4_4_1snsnkcq4st7v.R.flushNeeded();}}

    /**
     * Getter for {@link #aggregationFunction}. Provided for testing purposes
     * only.
     *
     * @return Current value of {@link #aggregationFunction}
     */
    final Function<List<T>, T> getAggregationFunction() {try{__CLR4_4_1snsnkcq4st7v.R.inc(1049);
        __CLR4_4_1snsnkcq4st7v.R.inc(1050);return aggregationFunction;
    }finally{__CLR4_4_1snsnkcq4st7v.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_1snsnkcq4st7v.R.inc(1051);
        __CLR4_4_1snsnkcq4st7v.R.inc(1052);return AbstractListBackedAggregator.class.getName();
    }finally{__CLR4_4_1snsnkcq4st7v.R.flushNeeded();}}
}
