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
package org.apache.commons.functor.core.collection;

import java.lang.reflect.Array;
import java.util.Collection;

import org.apache.commons.functor.Function;
import org.apache.commons.lang3.Validate;

/**
 * Returns the size of the specified Collection, or the length
 * of the specified array or String.
 *
 * @param <A> the function argument type.
 * @version $Revision$ $Date$
 */
public final class Size<A> implements Function<A, Integer> {public static class __CLR4_4_11qb1qbkcq4stjk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,2273,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A static {@code Size} instance reference.
     */
    private static final Size<Object> INSTANCE = new Size<Object>();

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new Size.
     */
    public Size() {try{__CLR4_4_11qb1qbkcq4stjk.R.inc(2243); }finally{__CLR4_4_11qb1qbkcq4stjk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public Integer evaluate(Object obj) {try{__CLR4_4_11qb1qbkcq4stjk.R.inc(2244);
        __CLR4_4_11qb1qbkcq4stjk.R.inc(2245);Validate.notNull(obj, "Argument must not be null");
        __CLR4_4_11qb1qbkcq4stjk.R.inc(2246);if ((((obj instanceof Collection<?>)&&(__CLR4_4_11qb1qbkcq4stjk.R.iget(2247)!=0|true))||(__CLR4_4_11qb1qbkcq4stjk.R.iget(2248)==0&false))) {{
            __CLR4_4_11qb1qbkcq4stjk.R.inc(2249);return evaluate((Collection<?>) obj);
        }
        }__CLR4_4_11qb1qbkcq4stjk.R.inc(2250);if ((((obj instanceof String)&&(__CLR4_4_11qb1qbkcq4stjk.R.iget(2251)!=0|true))||(__CLR4_4_11qb1qbkcq4stjk.R.iget(2252)==0&false))) {{
            __CLR4_4_11qb1qbkcq4stjk.R.inc(2253);return evaluate((String) obj);
        }
        }__CLR4_4_11qb1qbkcq4stjk.R.inc(2254);if ((((obj.getClass().isArray())&&(__CLR4_4_11qb1qbkcq4stjk.R.iget(2255)!=0|true))||(__CLR4_4_11qb1qbkcq4stjk.R.iget(2256)==0&false))) {{
            __CLR4_4_11qb1qbkcq4stjk.R.inc(2257);return evaluateArray(obj);
        }
        }__CLR4_4_11qb1qbkcq4stjk.R.inc(2258);throw new IllegalArgumentException("Expected Collection, String or Array, found " + obj);
    }finally{__CLR4_4_11qb1qbkcq4stjk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object that) {try{__CLR4_4_11qb1qbkcq4stjk.R.inc(2259);
        __CLR4_4_11qb1qbkcq4stjk.R.inc(2260);return that instanceof Size<?>;
    }finally{__CLR4_4_11qb1qbkcq4stjk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_11qb1qbkcq4stjk.R.inc(2261);
        __CLR4_4_11qb1qbkcq4stjk.R.inc(2262);return "Size".hashCode();
    }finally{__CLR4_4_11qb1qbkcq4stjk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_11qb1qbkcq4stjk.R.inc(2263);
        __CLR4_4_11qb1qbkcq4stjk.R.inc(2264);return "Size()";
    }finally{__CLR4_4_11qb1qbkcq4stjk.R.flushNeeded();}}

    /**
     * Get a Size instance.
     * @return Size
     */
    public static Size<Object> instance() {try{__CLR4_4_11qb1qbkcq4stjk.R.inc(2265);
        __CLR4_4_11qb1qbkcq4stjk.R.inc(2266);return INSTANCE;
    }finally{__CLR4_4_11qb1qbkcq4stjk.R.flushNeeded();}}

    /**
     * Evaluate a Collection.
     * @param col to evaluate
     * @return Integer
     */
    private Integer evaluate(Collection<?> col) {try{__CLR4_4_11qb1qbkcq4stjk.R.inc(2267);
        __CLR4_4_11qb1qbkcq4stjk.R.inc(2268);return Integer.valueOf(col.size());
    }finally{__CLR4_4_11qb1qbkcq4stjk.R.flushNeeded();}}

    /**
     * Evaluate a String.
     * @param str to evaluate
     * @return Integer
     */
    private Integer evaluate(String str) {try{__CLR4_4_11qb1qbkcq4stjk.R.inc(2269);
        __CLR4_4_11qb1qbkcq4stjk.R.inc(2270);return Integer.valueOf(str.length());
    }finally{__CLR4_4_11qb1qbkcq4stjk.R.flushNeeded();}}

    /**
     * Evaluate an array.
     * @param array to evaluate
     * @return Integer
     */
    private Integer evaluateArray(Object array) {try{__CLR4_4_11qb1qbkcq4stjk.R.inc(2271);
        __CLR4_4_11qb1qbkcq4stjk.R.inc(2272);return Integer.valueOf(Array.getLength(array));
    }finally{__CLR4_4_11qb1qbkcq4stjk.R.flushNeeded();}}

}
