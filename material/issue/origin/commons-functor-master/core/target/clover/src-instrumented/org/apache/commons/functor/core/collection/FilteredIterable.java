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

import java.util.Collections;
import java.util.Iterator;

import org.apache.commons.functor.Function;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.IsInstance;
import org.apache.commons.functor.core.composite.And;

/**
 * Adds a fluent filtering API to any {@link Iterable}.
 *
 * @version $Revision$ $Date$
 * @param <T> the Iterable generic type
 */
public class FilteredIterable<T> implements Iterable<T> {public static class __CLR4_4_11kd1kdkcq4stic{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,2092,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * A default {@code FilteredIterable} static instance that iterates over an empty collection.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    // type irrelevant for empty instance
    private static final FilteredIterable EMPTY = new FilteredIterable(Collections.EMPTY_LIST) {
        /**
         * {@inheritDoc}
         */
        @Override
        public FilteredIterable retain(Class type) {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2029);
            __CLR4_4_11kd1kdkcq4stic.R.inc(2030);return this;
        }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public FilteredIterable retain(Predicate predicate) {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2031);
            __CLR4_4_11kd1kdkcq4stic.R.inc(2032);return this;
        }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public FilteredIterable retain(Class... ofType) {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2033);
            __CLR4_4_11kd1kdkcq4stic.R.inc(2034);return this;
        }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}
    };

    /**
     * The {@link Iterable} has to be filtered.
     */
    private final Iterable<? extends T> iterable;
    /**
     * The predicate used to test input {@link Iterable} elements.
     */
    private And<T> predicate;

    /**
     * Create a new FilteredIterable.
     * @param iterable wrapped
     */
    protected FilteredIterable(Iterable<? extends T> iterable) {
        super();__CLR4_4_11kd1kdkcq4stic.R.inc(2036);try{__CLR4_4_11kd1kdkcq4stic.R.inc(2035);
        __CLR4_4_11kd1kdkcq4stic.R.inc(2037);this.iterable = iterable;
    }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public Iterator<T> iterator() {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2038);
        __CLR4_4_11kd1kdkcq4stic.R.inc(2039);Predicate<T> predicateReference;
        __CLR4_4_11kd1kdkcq4stic.R.inc(2040);synchronized (this) {
            __CLR4_4_11kd1kdkcq4stic.R.inc(2041);predicateReference = predicate;
        }
        __CLR4_4_11kd1kdkcq4stic.R.inc(2042);return FilteredIterator.filter(iterable.iterator(), predicateReference);
    }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2043);
        __CLR4_4_11kd1kdkcq4stic.R.inc(2044);return "FilteredIterable<" + iterable + ">";
    }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}

    /**
     * Retain only elements matching <code>predicate</code>.
     * @param filter filter predicate, non-<code>null</code>
     * @return <code>this</code>, fluently
     */
    public FilteredIterable<T> retain(Predicate<? super T> filter) {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2045);
        __CLR4_4_11kd1kdkcq4stic.R.inc(2046);if ((((filter == null)&&(__CLR4_4_11kd1kdkcq4stic.R.iget(2047)!=0|true))||(__CLR4_4_11kd1kdkcq4stic.R.iget(2048)==0&false))) {{
            __CLR4_4_11kd1kdkcq4stic.R.inc(2049);throw new NullPointerException("filtering predicate was null");
        }
        }__CLR4_4_11kd1kdkcq4stic.R.inc(2050);synchronized (this) {
            __CLR4_4_11kd1kdkcq4stic.R.inc(2051);if ((((this.predicate == null)&&(__CLR4_4_11kd1kdkcq4stic.R.iget(2052)!=0|true))||(__CLR4_4_11kd1kdkcq4stic.R.iget(2053)==0&false))) {{
                __CLR4_4_11kd1kdkcq4stic.R.inc(2054);this.predicate = new And<T>();
            }
            }__CLR4_4_11kd1kdkcq4stic.R.inc(2055);this.predicate.and(filter);
        }
        __CLR4_4_11kd1kdkcq4stic.R.inc(2056);return this;
    }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}

    /**
     * Retain elements of a given type with type-safety.
     *
     * @param <U> the input Class generic type.
     * @param type filter, non-<code>null</code>
     * @return new FilteredIterable instance that delegates to <code>this</code>
     */
    public <U> FilteredIterable<U> retain(final Class<U> type) {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2057);
        __CLR4_4_11kd1kdkcq4stic.R.inc(2058);if ((((type == null)&&(__CLR4_4_11kd1kdkcq4stic.R.iget(2059)!=0|true))||(__CLR4_4_11kd1kdkcq4stic.R.iget(2060)==0&false))) {{
            __CLR4_4_11kd1kdkcq4stic.R.inc(2061);throw new NullPointerException("filtered type was null");
        }
        }__CLR4_4_11kd1kdkcq4stic.R.inc(2062);return new FilteredIterable<U>(new Iterable<U>() {

            public Iterator<U> iterator() {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2063);
                __CLR4_4_11kd1kdkcq4stic.R.inc(2064);return TransformedIterator.transform(
                        FilteredIterator.filter(FilteredIterable.this.iterator(), IsInstance.of(type)),
                        new Function<T, U>() {

                            @SuppressWarnings("unchecked")
                            // this is okay because of the isinstance check
                            public U evaluate(T obj) {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2065);
                                __CLR4_4_11kd1kdkcq4stic.R.inc(2066);return (U) obj;
                            }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}
                        });
            }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}

        });
    }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}

    /**
     * Retain elements of any of specified types.
     * @param ofType filter, non-<code>null</code>
     * @return <code>this</code>, fluently
     */
    public FilteredIterable<T> retain(final Class<?>... ofType) {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2067);
        __CLR4_4_11kd1kdkcq4stic.R.inc(2068);if ((((ofType == null)&&(__CLR4_4_11kd1kdkcq4stic.R.iget(2069)!=0|true))||(__CLR4_4_11kd1kdkcq4stic.R.iget(2070)==0&false))) {{
            __CLR4_4_11kd1kdkcq4stic.R.inc(2071);throw new NullPointerException("array of filtered types was null");
        }
        }__CLR4_4_11kd1kdkcq4stic.R.inc(2072);return retain(new Predicate<T>() {

            public boolean test(T obj) {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2073);
                __CLR4_4_11kd1kdkcq4stic.R.inc(2074);for (Class<?> type : ofType) {{
                    __CLR4_4_11kd1kdkcq4stic.R.inc(2075);if ((((type.isInstance(obj))&&(__CLR4_4_11kd1kdkcq4stic.R.iget(2076)!=0|true))||(__CLR4_4_11kd1kdkcq4stic.R.iget(2077)==0&false))) {{
                        __CLR4_4_11kd1kdkcq4stic.R.inc(2078);return true;
                    }
                }}
                }__CLR4_4_11kd1kdkcq4stic.R.inc(2079);return false;
            }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}
        });
    }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}

    /**
     * Get a {@link FilteredIterable} of <code>iterable</code>.  If <code>wrapped</code> is <code>null</code>,
     * result will also be <code>null</code>.  A {@link FilteredIterable} argument will be passed back
     * directly; any other argument will be wrapped in a new {@link FilteredIterable} object.
     * @param <T> the input iterable generic type
     * @param iterable wrapped
     * @return FilteredIterable
     */
    public static <T> FilteredIterable<T> of(Iterable<T> iterable) {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2080);
        __CLR4_4_11kd1kdkcq4stic.R.inc(2081);if ((((iterable == null)&&(__CLR4_4_11kd1kdkcq4stic.R.iget(2082)!=0|true))||(__CLR4_4_11kd1kdkcq4stic.R.iget(2083)==0&false))) {{
            __CLR4_4_11kd1kdkcq4stic.R.inc(2084);return null;
        }
        }__CLR4_4_11kd1kdkcq4stic.R.inc(2085);if ((((iterable instanceof FilteredIterable<?>)&&(__CLR4_4_11kd1kdkcq4stic.R.iget(2086)!=0|true))||(__CLR4_4_11kd1kdkcq4stic.R.iget(2087)==0&false))) {{
            __CLR4_4_11kd1kdkcq4stic.R.inc(2088);return (FilteredIterable<T>) iterable;
        }
        }__CLR4_4_11kd1kdkcq4stic.R.inc(2089);return new FilteredIterable<T>(iterable);
    }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}

    /**
     * Get an empty FilteredIterable.
     * @param <T> the expected {@link Iterable} generic type.
     * @return FilteredIterable<T>
     */
    @SuppressWarnings("unchecked")
    public static <T> FilteredIterable<T> empty() {try{__CLR4_4_11kd1kdkcq4stic.R.inc(2090);
        __CLR4_4_11kd1kdkcq4stic.R.inc(2091);return EMPTY;
    }finally{__CLR4_4_11kd1kdkcq4stic.R.flushNeeded();}}
}
