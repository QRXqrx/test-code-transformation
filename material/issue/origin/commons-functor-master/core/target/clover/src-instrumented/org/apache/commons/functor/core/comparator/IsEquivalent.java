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
 * <code>true</code> iff the left argument is equal to the
 * right argument under the specified {@link Comparator}.
 * When no (or a <code>null</code> <code>Comparator</code> is specified,
 * a {@link Comparable Comparable} <code>Comparator</code> is used.
 *
 * @see org.apache.commons.functor.core.IsEqual
 * @param <T> the binary predicate input types
 * @version $Revision$ $Date$
 */
public final class IsEquivalent<T> implements BinaryPredicate<T, T> {public static class __CLR4_4_11t71t7kcq4stkh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,2374,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Basic IsEquivalent instance.
     */
    public static final IsEquivalent<Comparable<?>> INSTANCE = IsEquivalent.<Comparable<?>> instance();

    /**
     * The wrapped comparator.
     */
    private final Comparator<? super T> comparator;

    /**
     * Create a new IsEquivalent.
     */
    @SuppressWarnings("unchecked")
    public IsEquivalent() {
        this((Comparator<? super T>) ComparableComparator.INSTANCE);__CLR4_4_11t71t7kcq4stkh.R.inc(2348);try{__CLR4_4_11t71t7kcq4stkh.R.inc(2347);
    }finally{__CLR4_4_11t71t7kcq4stkh.R.flushNeeded();}}

    /**
     * Construct an <code>IsEquivalent</code> {@link BinaryPredicate predicate}
     * for the given {@link Comparator Comparator}.
     *
     * @param comparator the {@link Comparator Comparator}, when <code>null</code>,
     *        a <code>Comparator</code> for {@link Comparable Comparable}s will
     *        be used.
     */
    public IsEquivalent(Comparator<? super T> comparator) {try{__CLR4_4_11t71t7kcq4stkh.R.inc(2349);
        __CLR4_4_11t71t7kcq4stkh.R.inc(2350);this.comparator = Validate.notNull(comparator, "Comparator argument must not be null");
    }finally{__CLR4_4_11t71t7kcq4stkh.R.flushNeeded();}}

    /**
     * Return <code>true</code> iff the <i>left</i> parameter is
     * equal to the <i>right</i> parameter under my current
     * {@link Comparator Comparator}.
     * {@inheritDoc}
     */
    public boolean test(T left, T right) {try{__CLR4_4_11t71t7kcq4stkh.R.inc(2351);
        __CLR4_4_11t71t7kcq4stkh.R.inc(2352);return comparator.compare(left, right) == 0;
    }finally{__CLR4_4_11t71t7kcq4stkh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_11t71t7kcq4stkh.R.inc(2353);
        __CLR4_4_11t71t7kcq4stkh.R.inc(2354);if ((((obj == this)&&(__CLR4_4_11t71t7kcq4stkh.R.iget(2355)!=0|true))||(__CLR4_4_11t71t7kcq4stkh.R.iget(2356)==0&false))) {{
            __CLR4_4_11t71t7kcq4stkh.R.inc(2357);return true;
        }
        }__CLR4_4_11t71t7kcq4stkh.R.inc(2358);if ((((!(obj instanceof IsEquivalent<?>))&&(__CLR4_4_11t71t7kcq4stkh.R.iget(2359)!=0|true))||(__CLR4_4_11t71t7kcq4stkh.R.iget(2360)==0&false))) {{
            __CLR4_4_11t71t7kcq4stkh.R.inc(2361);return false;
        }
        }__CLR4_4_11t71t7kcq4stkh.R.inc(2362);IsEquivalent<?> that = (IsEquivalent<?>) obj;
        __CLR4_4_11t71t7kcq4stkh.R.inc(2363);return this.comparator.equals(that.comparator);
    }finally{__CLR4_4_11t71t7kcq4stkh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_11t71t7kcq4stkh.R.inc(2364);
        __CLR4_4_11t71t7kcq4stkh.R.inc(2365);int hash = "IsEquivalent".hashCode();
        // by construction, comparator is never null
        __CLR4_4_11t71t7kcq4stkh.R.inc(2366);hash ^= comparator.hashCode();
        __CLR4_4_11t71t7kcq4stkh.R.inc(2367);return hash;
    }finally{__CLR4_4_11t71t7kcq4stkh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_11t71t7kcq4stkh.R.inc(2368);
        __CLR4_4_11t71t7kcq4stkh.R.inc(2369);return "IsEquivalent<" + comparator + ">";
    }finally{__CLR4_4_11t71t7kcq4stkh.R.flushNeeded();}}

    /**
     * Get a basic IsEquivalent instance.
     *
     * @param <T> the binary predicate input types
     * @return IsEquivalent<T>
     */
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<?>> IsEquivalent<T> instance() {try{__CLR4_4_11t71t7kcq4stkh.R.inc(2370);
        __CLR4_4_11t71t7kcq4stkh.R.inc(2371);return new IsEquivalent<T>((Comparator<? super T>) ComparableComparator.INSTANCE);
    }finally{__CLR4_4_11t71t7kcq4stkh.R.flushNeeded();}}

    /**
     * Get an IsEquivalent instance that always compares to <code>arg</code>.
     *
     * @param <T> the predicate input type
     * @param right argument
     * @return Predicate
     */
    public static <T extends Comparable<?>> Predicate<T> instance(T right) {try{__CLR4_4_11t71t7kcq4stkh.R.inc(2372);
        __CLR4_4_11t71t7kcq4stkh.R.inc(2373);return RightBoundPredicate.bind(instance(), right);
    }finally{__CLR4_4_11t71t7kcq4stkh.R.flushNeeded();}}

}
