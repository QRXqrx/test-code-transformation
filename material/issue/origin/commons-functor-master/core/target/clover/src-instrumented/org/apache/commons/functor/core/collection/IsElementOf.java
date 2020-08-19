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

import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.adapter.RightBoundPredicate;
import org.apache.commons.lang3.Validate;

/**
 * A {@link BinaryPredicate} that checks to see if the
 * specified object is an element of the specified
 * Collection.
 *
 * @param <L> the left argument type.
 * @param <R> the right argument type.
 * @since 1.0
 * @version $Revision$ $Date$
 */
public final class IsElementOf<L, R> implements BinaryPredicate<L, R> {public static class __CLR4_4_11nx1nxkcq4stj0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,2207,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // static members
    //---------------------------------------------------------------

    /**
     * A static {@link IsElementOf} instance reference.
     */
    private static final IsElementOf<Object, Object> INSTANCE = new IsElementOf<Object, Object>();

    // constructors
    //---------------------------------------------------------------
    /**
     * Create a new IsElementOf.
     */
    public IsElementOf() {try{__CLR4_4_11nx1nxkcq4stj0.R.inc(2157);
    }finally{__CLR4_4_11nx1nxkcq4stj0.R.flushNeeded();}}

    // instance methods
    //---------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public boolean test(L obj, R col) {try{__CLR4_4_11nx1nxkcq4stj0.R.inc(2158);
        __CLR4_4_11nx1nxkcq4stj0.R.inc(2159);Validate.notNull(col, "Right side argument must not be null.");
        __CLR4_4_11nx1nxkcq4stj0.R.inc(2160);if ((((col instanceof Collection<?>)&&(__CLR4_4_11nx1nxkcq4stj0.R.iget(2161)!=0|true))||(__CLR4_4_11nx1nxkcq4stj0.R.iget(2162)==0&false))) {{
            __CLR4_4_11nx1nxkcq4stj0.R.inc(2163);return testCollection(obj, (Collection<?>) col);
        }
        }__CLR4_4_11nx1nxkcq4stj0.R.inc(2164);if ((((col.getClass().isArray())&&(__CLR4_4_11nx1nxkcq4stj0.R.iget(2165)!=0|true))||(__CLR4_4_11nx1nxkcq4stj0.R.iget(2166)==0&false))) {{
            __CLR4_4_11nx1nxkcq4stj0.R.inc(2167);return testArray(obj, col);
        }
        }__CLR4_4_11nx1nxkcq4stj0.R.inc(2168);throw new IllegalArgumentException("Expected Collection or Array, found " + col.getClass());
    }finally{__CLR4_4_11nx1nxkcq4stj0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_11nx1nxkcq4stj0.R.inc(2169);
        __CLR4_4_11nx1nxkcq4stj0.R.inc(2170);return (obj instanceof IsElementOf<?, ?>);
    }finally{__CLR4_4_11nx1nxkcq4stj0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_11nx1nxkcq4stj0.R.inc(2171);
        __CLR4_4_11nx1nxkcq4stj0.R.inc(2172);return "IsElementOf".hashCode();
    }finally{__CLR4_4_11nx1nxkcq4stj0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_11nx1nxkcq4stj0.R.inc(2173);
        __CLR4_4_11nx1nxkcq4stj0.R.inc(2174);return "IsElementOf";
    }finally{__CLR4_4_11nx1nxkcq4stj0.R.flushNeeded();}}

    /**
     * Test a collection.
     * @param obj to find
     * @param col to search
     * @return boolean
     */
    private boolean testCollection(Object obj, Collection<?> col) {try{__CLR4_4_11nx1nxkcq4stj0.R.inc(2175);
        __CLR4_4_11nx1nxkcq4stj0.R.inc(2176);return col.contains(obj);
    }finally{__CLR4_4_11nx1nxkcq4stj0.R.flushNeeded();}}

    /**
     * Test an array.
     * @param obj to find
     * @param array to search
     * @return boolean
     */
    private boolean testArray(Object obj, Object array) {try{__CLR4_4_11nx1nxkcq4stj0.R.inc(2177);
        __CLR4_4_11nx1nxkcq4stj0.R.inc(2178);for (int i = 0, m = Array.getLength(array); (((i < m)&&(__CLR4_4_11nx1nxkcq4stj0.R.iget(2179)!=0|true))||(__CLR4_4_11nx1nxkcq4stj0.R.iget(2180)==0&false)); i++) {{
            __CLR4_4_11nx1nxkcq4stj0.R.inc(2181);Object value = Array.get(array, i);
            __CLR4_4_11nx1nxkcq4stj0.R.inc(2182);if ((((obj == value)&&(__CLR4_4_11nx1nxkcq4stj0.R.iget(2183)!=0|true))||(__CLR4_4_11nx1nxkcq4stj0.R.iget(2184)==0&false))) {{
                __CLR4_4_11nx1nxkcq4stj0.R.inc(2185);return true;
            }
            }__CLR4_4_11nx1nxkcq4stj0.R.inc(2186);if ((((obj != null && obj.equals(value))&&(__CLR4_4_11nx1nxkcq4stj0.R.iget(2187)!=0|true))||(__CLR4_4_11nx1nxkcq4stj0.R.iget(2188)==0&false))) {{
                __CLR4_4_11nx1nxkcq4stj0.R.inc(2189);return true;
            }
        }}
        }__CLR4_4_11nx1nxkcq4stj0.R.inc(2190);return false;
    }finally{__CLR4_4_11nx1nxkcq4stj0.R.flushNeeded();}}

    // static methods
    //---------------------------------------------------------------
    /**
     * Get an IsElementOf instance.
     * @return IsElementOf
     */
    public static IsElementOf<Object, Object> instance() {try{__CLR4_4_11nx1nxkcq4stj0.R.inc(2191);
        __CLR4_4_11nx1nxkcq4stj0.R.inc(2192);return INSTANCE;
    }finally{__CLR4_4_11nx1nxkcq4stj0.R.flushNeeded();}}

    /**
     * Get an IsElementOf(collection|array) Predicate.
     *
     * @param <A> the Predicate argument generic type
     * @param obj collection/array to search
     * @return Predicate
     */
    public static <A> Predicate<A> instance(Object obj) {try{__CLR4_4_11nx1nxkcq4stj0.R.inc(2193);
        __CLR4_4_11nx1nxkcq4stj0.R.inc(2194);if ((((null == obj)&&(__CLR4_4_11nx1nxkcq4stj0.R.iget(2195)!=0|true))||(__CLR4_4_11nx1nxkcq4stj0.R.iget(2196)==0&false))) {{
            __CLR4_4_11nx1nxkcq4stj0.R.inc(2197);throw new NullPointerException("Argument must not be null");
        } }else {__CLR4_4_11nx1nxkcq4stj0.R.inc(2198);if ((((obj instanceof Collection<?>)&&(__CLR4_4_11nx1nxkcq4stj0.R.iget(2199)!=0|true))||(__CLR4_4_11nx1nxkcq4stj0.R.iget(2200)==0&false))) {{
            __CLR4_4_11nx1nxkcq4stj0.R.inc(2201);return new RightBoundPredicate<A>(new IsElementOf<A, Object>(), obj);
        } }else {__CLR4_4_11nx1nxkcq4stj0.R.inc(2202);if ((((obj.getClass().isArray())&&(__CLR4_4_11nx1nxkcq4stj0.R.iget(2203)!=0|true))||(__CLR4_4_11nx1nxkcq4stj0.R.iget(2204)==0&false))) {{
            __CLR4_4_11nx1nxkcq4stj0.R.inc(2205);return new RightBoundPredicate<A>(new IsElementOf<A, Object>(), obj);
        } }else {{
            __CLR4_4_11nx1nxkcq4stj0.R.inc(2206);throw new IllegalArgumentException("Expected Collection or Array, found " + obj.getClass());
        }
    }}}}finally{__CLR4_4_11nx1nxkcq4stj0.R.flushNeeded();}}

}
