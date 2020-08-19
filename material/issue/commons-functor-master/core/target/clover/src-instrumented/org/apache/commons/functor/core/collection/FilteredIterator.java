/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */
/*
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

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.functor.Predicate;
import org.apache.commons.lang3.Validate;

/**
 * Iterator that filters another Iterator by only passing through those elements
 * that are matched by a specified Predicate.
 *
 * @param <T> the {@link Iterator} generic type
 * @version $Revision$ $Date$
 */
public final class FilteredIterator<T> implements Iterator<T> {

    public static class __CLR4_4_11m41m4kcq4stio {

        public static com_atlassian_clover.CoverageRecorder R;

        public static com_atlassian_clover.CloverProfile[] profiles = {};

        @java.lang.SuppressWarnings("unchecked")
        public static <I, T extends I> I lambdaInc(final int i, final T l, final int si) {
            java.lang.reflect.InvocationHandler h = new java.lang.reflect.InvocationHandler() {

                public java.lang.Object invoke(java.lang.Object p, java.lang.reflect.Method m, java.lang.Object[] a) throws Throwable {
                    R.inc(i);
                    R.inc(si);
                    try {
                        return m.invoke(l, a);
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        throw e.getCause() != null ? e.getCause() : new RuntimeException("Clover failed to invoke instrumented lambda", e);
                    }
                }
            };
            return (I) java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(), l.getClass().getInterfaces(), h);
        }

        static {
            com_atlassian_clover.CoverageRecorder _R = null;
            try {
                com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();
                if (2019101123313948L != com_atlassian_clover.CloverVersionInfo.getBuildStamp()) {
                    com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");
                    com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime=" + com_atlassian_clover.CloverVersionInfo.getReleaseNum() + "#" + com_atlassian_clover.CloverVersionInfo.getBuildStamp());
                }
                R = com_atlassian_clover.Clover.getNullRecorder();
                _R = com_atlassian_clover.Clover.getNullRecorder();
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 2157, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
            } catch (java.lang.SecurityException e) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. (" + e.getClass() + ":" + e.getMessage() + ")");
            } catch (java.lang.NoClassDefFoundError e) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? (" + e.getClass() + ":" + e.getMessage() + ")");
            } catch (java.lang.Throwable t) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. (" + t.getClass() + ":" + t.getMessage() + ")");
            }
            R = _R;
        }
    }

    public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER = com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // attributes
    // ------------------------------------------------------------------------
    /**
     * The predicate used to test this Iterator elements.
     */
    private final Predicate<? super T> predicate;

    /**
     * The wrapped iterator.
     */
    private final Iterator<? extends T> iterator;

    /**
     * Reference to next element has to be returned by this iterator.
     */
    private T next = null;

    /**
     * Flag to mark this iterator has more elements or not.
     */
    private boolean nextSet = false;

    /**
     * Flag to mark current iterator element can be removed.
     */
    private boolean canRemove = false;

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new FilteredIterator.
     * @param iterator to filter
     * @param predicate to apply
     */
    public FilteredIterator(Iterator<? extends T> iterator, Predicate<? super T> predicate) {
        try {
            __CLR4_4_11m41m4kcq4stio.R.inc(2092);
            __CLR4_4_11m41m4kcq4stio.R.inc(2093);
            this.iterator = Validate.notNull(iterator, "Iterator argument was null");
            __CLR4_4_11m41m4kcq4stio.R.inc(2094);
            this.predicate = Validate.notNull(predicate, "filtering Predicate argument was null");
        } finally {
            __CLR4_4_11m41m4kcq4stio.R.flushNeeded();
        }
    }

    // iterator methods
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     * @see java.util.Iterator#hasNext()
     */
    public boolean hasNext() {
        try {
            __CLR4_4_11m41m4kcq4stio.R.inc(2095);
            __CLR4_4_11m41m4kcq4stio.R.inc(2096);
            return nextSet || setNext();
        } finally {
            __CLR4_4_11m41m4kcq4stio.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     * @see java.util.Iterator#next()
     */
    public T next() {
        try {
            __CLR4_4_11m41m4kcq4stio.R.inc(2097);
            __CLR4_4_11m41m4kcq4stio.R.inc(2098);
            if ((((hasNext()) && (__CLR4_4_11m41m4kcq4stio.R.iget(2099) != 0 | true)) || (__CLR4_4_11m41m4kcq4stio.R.iget(2100) == 0 & false))) {
                {
                    __CLR4_4_11m41m4kcq4stio.R.inc(2101);
                    return returnNext();
                }
            }
            __CLR4_4_11m41m4kcq4stio.R.inc(2102);
            throw new NoSuchElementException();
        } finally {
            __CLR4_4_11m41m4kcq4stio.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     * @see java.util.Iterator#remove()
     */
    public void remove() {
        try {
            __CLR4_4_11m41m4kcq4stio.R.inc(2103);
            __CLR4_4_11m41m4kcq4stio.R.inc(2104);
            if ((((canRemove) && (__CLR4_4_11m41m4kcq4stio.R.iget(2105) != 0 | true)) || (__CLR4_4_11m41m4kcq4stio.R.iget(2106) == 0 & false))) {
                {
                    __CLR4_4_11m41m4kcq4stio.R.inc(2107);
                    canRemove = false;
                    __CLR4_4_11m41m4kcq4stio.R.inc(2108);
                    iterator.remove();
                }
            } else {
                {
                    __CLR4_4_11m41m4kcq4stio.R.inc(2109);
                    throw new IllegalStateException();
                }
            }
        } finally {
            __CLR4_4_11m41m4kcq4stio.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        try {
            __CLR4_4_11m41m4kcq4stio.R.inc(2110);
            __CLR4_4_11m41m4kcq4stio.R.inc(2111);
            if ((((obj == this) && (__CLR4_4_11m41m4kcq4stio.R.iget(2112) != 0 | true)) || (__CLR4_4_11m41m4kcq4stio.R.iget(2113) == 0 & false))) {
                {
                    __CLR4_4_11m41m4kcq4stio.R.inc(2114);
                    return true;
                }
            }
            __CLR4_4_11m41m4kcq4stio.R.inc(2115);
            if ((((!(obj instanceof FilteredIterator<?>)) && (__CLR4_4_11m41m4kcq4stio.R.iget(2116) != 0 | true)) || (__CLR4_4_11m41m4kcq4stio.R.iget(2117) == 0 & false))) {
                {
                    __CLR4_4_11m41m4kcq4stio.R.inc(2118);
                    return false;
                }
            }
            __CLR4_4_11m41m4kcq4stio.R.inc(2119);
            FilteredIterator<?> that = (FilteredIterator<?>) obj;
            __CLR4_4_11m41m4kcq4stio.R.inc(2120);
            return predicate.equals(that.predicate) && iterator.equals(that.iterator);
        } finally {
            __CLR4_4_11m41m4kcq4stio.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        try {
            __CLR4_4_11m41m4kcq4stio.R.inc(2121);
            __CLR4_4_11m41m4kcq4stio.R.inc(2122);
            int hash = "FilteredIterator".hashCode();
            __CLR4_4_11m41m4kcq4stio.R.inc(2123);
            hash <<= 2;
            __CLR4_4_11m41m4kcq4stio.R.inc(2124);
            hash ^= predicate.hashCode();
            __CLR4_4_11m41m4kcq4stio.R.inc(2125);
            hash <<= 2;
            __CLR4_4_11m41m4kcq4stio.R.inc(2126);
            hash ^= iterator.hashCode();
            __CLR4_4_11m41m4kcq4stio.R.inc(2127);
            return hash;
        } finally {
            __CLR4_4_11m41m4kcq4stio.R.flushNeeded();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        try {
            __CLR4_4_11m41m4kcq4stio.R.inc(2128);
            __CLR4_4_11m41m4kcq4stio.R.inc(2129);
            return "FilteredIterator<" + iterator + "," + predicate + ">";
        } finally {
            __CLR4_4_11m41m4kcq4stio.R.flushNeeded();
        }
    }

    // static methods
    // ------------------------------------------------------------------------
    /**
     * Get a filtered Iterator instance applying <code>pred</code> to <code>iter</code>.
     * @param <T> the input iterator generic type
     * @param iter to filter
     * @param pred to apply
     * @return Iterator
     */
    @SuppressWarnings("unchecked")
    public static <T> Iterator<T> filter(Iterator<? extends T> iter, Predicate<? super T> pred) {
        try {
            __CLR4_4_11m41m4kcq4stio.R.inc(2130);
            __CLR4_4_11m41m4kcq4stio.R.inc(2131);
            return (((null == pred) && (__CLR4_4_11m41m4kcq4stio.R.iget(2132) != 0 | true)) || (__CLR4_4_11m41m4kcq4stio.R.iget(2133) == 0 & false)) ? (Iterator<T>) iter : ((((null == iter) && (__CLR4_4_11m41m4kcq4stio.R.iget(2134) != 0 | true)) || (__CLR4_4_11m41m4kcq4stio.R.iget(2135) == 0 & false)) ? null : new FilteredIterator<T>(iter, pred));
        } finally {
            __CLR4_4_11m41m4kcq4stio.R.flushNeeded();
        }
    }

    // private
    // ------------------------------------------------------------------------
    /**
     * Set next element.
     * @return whether the current iterator position is valid
     */
    private boolean setNext() {
        try {
            __CLR4_4_11m41m4kcq4stio.R.inc(2136);
            __CLR4_4_11m41m4kcq4stio.R.inc(2137);
            while ((((iterator.hasNext()) && (__CLR4_4_11m41m4kcq4stio.R.iget(2138) != 0 | true)) || (__CLR4_4_11m41m4kcq4stio.R.iget(2139) == 0 & false))) {
                {
                    __CLR4_4_11m41m4kcq4stio.R.inc(2140);
                    canRemove = false;
                    __CLR4_4_11m41m4kcq4stio.R.inc(2141);
                    T obj = iterator.next();
                    __CLR4_4_11m41m4kcq4stio.R.inc(2142);
                    if ((((predicate.test(obj)) && (__CLR4_4_11m41m4kcq4stio.R.iget(2143) != 0 | true)) || (__CLR4_4_11m41m4kcq4stio.R.iget(2144) == 0 & false))) {
                        {
                            __CLR4_4_11m41m4kcq4stio.R.inc(2145);
                            nextSet = true;
                            __CLR4_4_11m41m4kcq4stio.R.inc(2146);
                            next = obj;
                            __CLR4_4_11m41m4kcq4stio.R.inc(2147);
                            return true;
                        }
                    }
                }
            }
            __CLR4_4_11m41m4kcq4stio.R.inc(2148);
            next = null;
            __CLR4_4_11m41m4kcq4stio.R.inc(2149);
            nextSet = false;
            __CLR4_4_11m41m4kcq4stio.R.inc(2150);
            return false;
        } finally {
            __CLR4_4_11m41m4kcq4stio.R.flushNeeded();
        }
    }

    /**
     * Get the next element.
     * @return next element.
     */
    private T returnNext() {
        try {
            __CLR4_4_11m41m4kcq4stio.R.inc(2151);
            __CLR4_4_11m41m4kcq4stio.R.inc(2152);
            T temp = next;
            __CLR4_4_11m41m4kcq4stio.R.inc(2153);
            canRemove = true;
            __CLR4_4_11m41m4kcq4stio.R.inc(2154);
            next = null;
            __CLR4_4_11m41m4kcq4stio.R.inc(2155);
            nextSet = false;
            __CLR4_4_11m41m4kcq4stio.R.inc(2156);
            return temp;
        } finally {
            __CLR4_4_11m41m4kcq4stio.R.flushNeeded();
        }
    }
}

