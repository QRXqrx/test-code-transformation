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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.functor.Function;

/**
 * Aggregator function to be used with subclasses of
 * {@link org.apache.commons.functor.aggregator.AbstractListBackedAggregator}
 * which retrieves the <a
 * href="http://en.wikipedia.org/wiki/Percentile">percentile</a> value for a
 * given percentile. The percentile rank/index for a value P can be obtained
 * using formula: <code>n = round((P / 100) * N + 0.5)</code> where N is the
 * number of items in a list.
 */
public class DoublePercentileAggregatorFunction implements Function<List<Double>, Double> {public static class __CLR4_4_1z1z1kcq4stae{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,1293,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** A percentile goes from 0 to 100% and that's it. */
    private static final double MAX_PERCENTAGE = 100.0;
    /**
     * Percentile value to calculate. 0 &lt; percentile &lt;= 100
     */
    private double              percentile;

    /**
     * Flag to indicate whether we are going to operate on a copy of the list
     * given or not. In order to compute the percentile, we need to sort the
     * list first (and then choose the item based on the formula given above).
     * This function offers 2 ways of doing the sorting:
     * <ul>
     * <li>by sorting (modifying) the original list (<code>useCopy=false</code>)
     * </li>
     * <li>by operating on a copy of the original list and leaving the original
     * untouched (<code>useCopy=true</code>)</li>
     * </ul>
     * NOTE: While using a copy ensures the original list is untouched, it does
     * mean we are creating a temporary list for the purpose of this computation
     * so it will have an impact on memory!
     */
    private boolean             useCopy;

    /**
     * Similar to {@link #DoublePercentileAggregatorFunction(double, boolean)
     * DoublePercentilAggregatorFunction(percentile,true)}.
     *
     * @param percentile
     *            Percentile this function will return the value for
     */
    public DoublePercentileAggregatorFunction(double percentile) {
        this(percentile, true);__CLR4_4_1z1z1kcq4stae.R.inc(1262);try{__CLR4_4_1z1z1kcq4stae.R.inc(1261);
    }finally{__CLR4_4_1z1z1kcq4stae.R.flushNeeded();}}

    /**
     * Initializes the function with the given percentile and decides whether
     * the function will modify the original list or not.
     *
     * @param percentile
     *            Percentile this function will return the value for
     * @param useCopy
     *            If set to true, the original list will not be modified and
     *            will contain the data in sorted order, if false, this instance
     *            will operate on a copy of the list
     */
    public DoublePercentileAggregatorFunction(double percentile, boolean useCopy) {try{__CLR4_4_1z1z1kcq4stae.R.inc(1263);
        __CLR4_4_1z1z1kcq4stae.R.inc(1264);if ((((percentile < 0.0 || percentile > MAX_PERCENTAGE)&&(__CLR4_4_1z1z1kcq4stae.R.iget(1265)!=0|true))||(__CLR4_4_1z1z1kcq4stae.R.iget(1266)==0&false))) {{
            __CLR4_4_1z1z1kcq4stae.R.inc(1267);throw new IllegalArgumentException("Invalid value for percentile: " + percentile);
        }
        }__CLR4_4_1z1z1kcq4stae.R.inc(1268);this.percentile = percentile;
        __CLR4_4_1z1z1kcq4stae.R.inc(1269);this.useCopy = useCopy;
    }finally{__CLR4_4_1z1z1kcq4stae.R.flushNeeded();}}

    /**
     * Used internally to compute the rank of the item in the list for the
     * requested percentile. This is invoked internally from
     * {@link #evaluate(List)}.
     *
     * @param data
     *            List containing data. This cannot be <code>null</code> (throws
     *            <code>NullPointerException</code>) or empty (throws
     *            <code>ArrayIndexOutOfBoundsException</code>).
     * @return Index of the item for the requested percentile
     * @see #getPercentile()
     */
    final int computeRank(List<Double> data) {try{__CLR4_4_1z1z1kcq4stae.R.inc(1270);
        __CLR4_4_1z1z1kcq4stae.R.inc(1271);int maxRank = data.size() - 1;
        __CLR4_4_1z1z1kcq4stae.R.inc(1272);int rank = (int) Math.floor((percentile * maxRank) / MAX_PERCENTAGE);
        __CLR4_4_1z1z1kcq4stae.R.inc(1273);return rank;
    }finally{__CLR4_4_1z1z1kcq4stae.R.flushNeeded();}}

    /**
     * Traverses the list and computes the percentile. In doing so, it sorts the
     * list first -- and might or might not use the original list or a copy
     * depending on {@link #isUseCopy()}.
     *
     * @param data
     *            List to compute the percentile for
     * @return percentile of the given list or null if list is <code>null</code>
     *         or empty (zero size).
     */
    public Double evaluate(List<Double> data) {try{__CLR4_4_1z1z1kcq4stae.R.inc(1274);
        __CLR4_4_1z1z1kcq4stae.R.inc(1275);if ((((data == null || data.size() == 0)&&(__CLR4_4_1z1z1kcq4stae.R.iget(1276)!=0|true))||(__CLR4_4_1z1z1kcq4stae.R.iget(1277)==0&false))) {{
            __CLR4_4_1z1z1kcq4stae.R.inc(1278);return null;
        }
        }__CLR4_4_1z1z1kcq4stae.R.inc(1279);List<Double> copy = data;
        __CLR4_4_1z1z1kcq4stae.R.inc(1280);if ((((useCopy)&&(__CLR4_4_1z1z1kcq4stae.R.iget(1281)!=0|true))||(__CLR4_4_1z1z1kcq4stae.R.iget(1282)==0&false))) {{
            __CLR4_4_1z1z1kcq4stae.R.inc(1283);copy = new ArrayList<Double>(data);
        }
        }__CLR4_4_1z1z1kcq4stae.R.inc(1284);Collections.sort(copy);
        __CLR4_4_1z1z1kcq4stae.R.inc(1285);int rank = computeRank(data);
        __CLR4_4_1z1z1kcq4stae.R.inc(1286);return copy.get(rank);
    }finally{__CLR4_4_1z1z1kcq4stae.R.flushNeeded();}}

    /**
     * Getter for {@link #percentile}.
     *
     * @return Retrieves the percentile this instance will return
     */
    public double getPercentile() {try{__CLR4_4_1z1z1kcq4stae.R.inc(1287);
        __CLR4_4_1z1z1kcq4stae.R.inc(1288);return percentile;
    }finally{__CLR4_4_1z1z1kcq4stae.R.flushNeeded();}}

    /**
     * Does this instance modify the passed in list or not?
     *
     * @return If true, this instance will sort the list passed in and then use
     *         it to compute the percentile; if false, it will operate on a copy
     *         of the list
     * @see DoublePercentileAggregatorFunction#DoublePercentileAggregatorFunction(double,
     *      boolean)
     */
    public boolean isUseCopy() {try{__CLR4_4_1z1z1kcq4stae.R.inc(1289);
        __CLR4_4_1z1z1kcq4stae.R.inc(1290);return useCopy;
    }finally{__CLR4_4_1z1z1kcq4stae.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_1z1z1kcq4stae.R.inc(1291);
        __CLR4_4_1z1z1kcq4stae.R.inc(1292);return DoublePercentileAggregatorFunction.class.getName();
    }finally{__CLR4_4_1z1z1kcq4stae.R.flushNeeded();}}
}
