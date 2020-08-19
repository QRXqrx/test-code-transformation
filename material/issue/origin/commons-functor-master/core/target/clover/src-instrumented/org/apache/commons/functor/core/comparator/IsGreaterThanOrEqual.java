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

import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.adapter.RightBoundPredicate;
import org.apache.commons.lang3.Validate;

/**
 * A {@link BinaryPredicate BinaryPredicate} that {@link #test tests}
 * <code>true</code> iff the left argument is greater than or equal
 * to the right argument under the specified {@link Comparator}.
 * When no (or a <code>null</code> <code>Comparator</code> is specified,
 * a {@link Comparable Comparable} <code>Comparator</code> is used.
 *
 * @param <T> the binary predicate input types
 * @version $Revision$ $Date$
 */
public final class IsGreaterThanOrEqual<T> implements BinaryPredicate<T, T> {public static class __CLR4_4_11up1upkcq4stky{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,2428,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Basic IsGreaterThanOrEqual instance.
     */
    public static final IsGreaterThanOrEqual<Comparable<?>> INSTANCE = IsGreaterThanOrEqual
            .<Comparable<?>> instance();

    /**
     * The wrapped comparator.
     */
    private final Comparator<? super T> comparator;

    /**
     * Construct a <code>IsGreaterThanOrEqual</code> {@link BinaryPredicate predicate}
     * for {@link Comparable Comparable}s.
     */
    @SuppressWarnings("unchecked")
    public IsGreaterThanOrEqual() {
        this((Comparator<? super T>) ComparableComparator.INSTANCE);__CLR4_4_11up1upkcq4stky.R.inc(2402);try{__CLR4_4_11up1upkcq4stky.R.inc(2401);
    }finally{__CLR4_4_11up1upkcq4stky.R.flushNeeded();}}

    /**
     * Construct a <code>IsGreaterThanOrEqual</code> {@link BinaryPredicate predicate}
     * for the given {@link Comparator Comparator}.
     *
     * @param comparator the {@link Comparator Comparator}, when <code>null</code>,
     *        a <code>Comparator</code> for {@link Comparable Comparable}s will
     *        be used.
     */
    public IsGreaterThanOrEqual(Comparator<? super T> comparator) {try{__CLR4_4_11up1upkcq4stky.R.inc(2403);
        __CLR4_4_11up1upkcq4stky.R.inc(2404);this.comparator = Validate.notNull(comparator, "Comparator argument must not be null");
    }finally{__CLR4_4_11up1upkcq4stky.R.flushNeeded();}}

    /**
     * Return <code>true</code> iff the <i>left</i> parameter is
     * greater than or equal to the <i>right</i> parameter under my current
     * {@link Comparator Comparator}.
     * {@inheritDoc}
     */
    public boolean test(T left, T right) {try{__CLR4_4_11up1upkcq4stky.R.inc(2405);
        __CLR4_4_11up1upkcq4stky.R.inc(2406);return comparator.compare(left, right) >= 0;
    }finally{__CLR4_4_11up1upkcq4stky.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_11up1upkcq4stky.R.inc(2407);
        __CLR4_4_11up1upkcq4stky.R.inc(2408);if ((((obj == this)&&(__CLR4_4_11up1upkcq4stky.R.iget(2409)!=0|true))||(__CLR4_4_11up1upkcq4stky.R.iget(2410)==0&false))) {{
            __CLR4_4_11up1upkcq4stky.R.inc(2411);return true;
        }
        }__CLR4_4_11up1upkcq4stky.R.inc(2412);if ((((!(obj instanceof IsGreaterThanOrEqual<?>))&&(__CLR4_4_11up1upkcq4stky.R.iget(2413)!=0|true))||(__CLR4_4_11up1upkcq4stky.R.iget(2414)==0&false))) {{
            __CLR4_4_11up1upkcq4stky.R.inc(2415);return false;
        }
        }__CLR4_4_11up1upkcq4stky.R.inc(2416);IsGreaterThanOrEqual<?> that = (IsGreaterThanOrEqual<?>) obj;
        __CLR4_4_11up1upkcq4stky.R.inc(2417);return this.comparator.equals(that.comparator);
    }finally{__CLR4_4_11up1upkcq4stky.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_11up1upkcq4stky.R.inc(2418);
        __CLR4_4_11up1upkcq4stky.R.inc(2419);int hash = "IsGreaterThanOrEqual".hashCode();
        // by construction, comparator is never null
        __CLR4_4_11up1upkcq4stky.R.inc(2420);hash ^= comparator.hashCode();
        __CLR4_4_11up1upkcq4stky.R.inc(2421);return hash;
    }finally{__CLR4_4_11up1upkcq4stky.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_11up1upkcq4stky.R.inc(2422);
        __CLR4_4_11up1upkcq4stky.R.inc(2423);return "IsGreaterThanOrEqual<" + comparator + ">";
    }finally{__CLR4_4_11up1upkcq4stky.R.flushNeeded();}}

    /**
     * Get a typed IsGreaterThanOrEqual instance.
     *
     * @param <T> the binary predicate input types
     * @return IsGreaterThanOrEqual<T>
     */
    public static <T extends Comparable<?>> IsGreaterThanOrEqual<T> instance() {try{__CLR4_4_11up1upkcq4stky.R.inc(2424);
        __CLR4_4_11up1upkcq4stky.R.inc(2425);return new IsGreaterThanOrEqual<T>();
    }finally{__CLR4_4_11up1upkcq4stky.R.flushNeeded();}}

    /**
     * Get an IsGreaterThanOrEqual Predicate.
     *
     * @param <T> the binary predicate input types
     * @param right the right side object of the IsGreaterThanOrEqual comparison
     * @return Predicate
     */
    public static <T extends Comparable<?>> Predicate<T> instance(T right) {try{__CLR4_4_11up1upkcq4stky.R.inc(2426);
        __CLR4_4_11up1upkcq4stky.R.inc(2427);return RightBoundPredicate.bind(new IsGreaterThanOrEqual<T>(), right);
    }finally{__CLR4_4_11up1upkcq4stky.R.flushNeeded();}}

}
