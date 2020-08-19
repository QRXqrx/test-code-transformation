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
package org.apache.commons.functor.core.comparator;

import java.util.Comparator;

/**
 * A {@link Comparator Comparator} that compares {@link Comparable Comparable}
 * objects.
 * <p>
 * This class was created based on commons-collection's ComparableComparator.
 *
 * @param <E> the comparable type
 * @version $Revision$ $Date$
 */
final class ComparableComparator<E extends Comparable<? super E>> implements Comparator<E> {public static class __CLR4_4_11sa1sakcq4stk3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,2326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Singleton. */
    @SuppressWarnings("rawtypes")
    public static final ComparableComparator<?> INSTANCE = new ComparableComparator();

    /**
     * Create a new ComparableComparator.
     */
    public ComparableComparator() {
        super();__CLR4_4_11sa1sakcq4stk3.R.inc(2315);try{__CLR4_4_11sa1sakcq4stk3.R.inc(2314);
    }finally{__CLR4_4_11sa1sakcq4stk3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public int compare(E o1, E o2) {try{__CLR4_4_11sa1sakcq4stk3.R.inc(2316);
        __CLR4_4_11sa1sakcq4stk3.R.inc(2317);return o1.compareTo(o2);
    }finally{__CLR4_4_11sa1sakcq4stk3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_11sa1sakcq4stk3.R.inc(2318);
        __CLR4_4_11sa1sakcq4stk3.R.inc(2319);return (obj instanceof ComparableComparator);
    }finally{__CLR4_4_11sa1sakcq4stk3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_11sa1sakcq4stk3.R.inc(2320);
        __CLR4_4_11sa1sakcq4stk3.R.inc(2321);return toString().hashCode();
    }finally{__CLR4_4_11sa1sakcq4stk3.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_11sa1sakcq4stk3.R.inc(2322);
        __CLR4_4_11sa1sakcq4stk3.R.inc(2323);return "ComparableComparator";
    }finally{__CLR4_4_11sa1sakcq4stk3.R.flushNeeded();}}

    /**
     * Get a ComparableComparator instance.
     * @param <E> the comparable type
     * @return ComparableComparator
     */
    @SuppressWarnings("unchecked")
    public static <E extends Comparable<? super E>> ComparableComparator<E> instance() {try{__CLR4_4_11sa1sakcq4stk3.R.inc(2324);
        __CLR4_4_11sa1sakcq4stk3.R.inc(2325);return (ComparableComparator<E>) INSTANCE;
    }finally{__CLR4_4_11sa1sakcq4stk3.R.flushNeeded();}}

}
