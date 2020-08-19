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
package org.apache.commons.functor.core.algorithm;

import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.Generator;

/**
 * Functional left-fold algorithm against the elements of a {@link Generator}.
 * Uses the seed object (if supplied) as the initial left-side argument to the {@link BinaryFunction},
 * then uses the result of that evaluation as the next left-side argument, until the {@link Generator}'s
 * elements have been expended.
 *
 * @param <T> the returned evaluation type.
 * @version $Revision$ $Date$
 */
public class FoldLeft<T> implements Function<Generator<T>, T>, BinaryFunction<Generator<T>, T, T> {public static class __CLR4_4_11dc1dckcq4stfn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,1819,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Helper procedure.
     *
     * @param <T> the returned evaluation type.
     */
    private static class FoldLeftHelper<T> implements Procedure<T> {
        /**
         * The wrapped function.
         */
        private final BinaryFunction<? super T, ? super T, ? extends T> function;
        /**
         * The seed object.
         */
        private T seed;
        /**
         * Flag to check the helper started or not.
         */
        private boolean started;

        /**
         * Create a seedless FoldLeftHelper.
         *
         * @param function The wrapped function
         */
        public FoldLeftHelper(BinaryFunction<? super T, ? super T, ? extends T> function) {
            this(null, function);__CLR4_4_11dc1dckcq4stfn.R.inc(1777);try{__CLR4_4_11dc1dckcq4stfn.R.inc(1776);
        }finally{__CLR4_4_11dc1dckcq4stfn.R.flushNeeded();}}

        /**
         * Create a new FoldLeftHelper.
         *
         * @param seed initial left-side argument
         * @param function The wrapped function
         */
        FoldLeftHelper(T seed, BinaryFunction<? super T, ? super T, ? extends T> function) {try{__CLR4_4_11dc1dckcq4stfn.R.inc(1778);
            __CLR4_4_11dc1dckcq4stfn.R.inc(1779);this.seed = seed;
            __CLR4_4_11dc1dckcq4stfn.R.inc(1780);started = (((seed != null )&&(__CLR4_4_11dc1dckcq4stfn.R.iget(1781)!=0|true))||(__CLR4_4_11dc1dckcq4stfn.R.iget(1782)==0&false))? true : false;
            __CLR4_4_11dc1dckcq4stfn.R.inc(1783);this.function = function;
        }finally{__CLR4_4_11dc1dckcq4stfn.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public void run(T obj) {try{__CLR4_4_11dc1dckcq4stfn.R.inc(1784);
            __CLR4_4_11dc1dckcq4stfn.R.inc(1785);if ((((!started)&&(__CLR4_4_11dc1dckcq4stfn.R.iget(1786)!=0|true))||(__CLR4_4_11dc1dckcq4stfn.R.iget(1787)==0&false))) {{
                __CLR4_4_11dc1dckcq4stfn.R.inc(1788);seed = obj;
                __CLR4_4_11dc1dckcq4stfn.R.inc(1789);started = true;
            } }else {{
                __CLR4_4_11dc1dckcq4stfn.R.inc(1790);seed = function.evaluate(seed, obj);
            }
        }}finally{__CLR4_4_11dc1dckcq4stfn.R.flushNeeded();}}

        /**
         * Get current result.
         * @return Object
         */
        T getResult() {try{__CLR4_4_11dc1dckcq4stfn.R.inc(1791);
            __CLR4_4_11dc1dckcq4stfn.R.inc(1792);return (((started )&&(__CLR4_4_11dc1dckcq4stfn.R.iget(1793)!=0|true))||(__CLR4_4_11dc1dckcq4stfn.R.iget(1794)==0&false))? seed : null;
        }finally{__CLR4_4_11dc1dckcq4stfn.R.flushNeeded();}}

    }

    /**
     * {@link BinaryFunction} to apply to each (seed, next).
     */
    private final BinaryFunction<? super T, ? super T, ? extends T> function;

    /**
     * Create a new FoldLeft.
     * @param func {@link BinaryFunction} to apply to each (seed, next)
     */
    public FoldLeft(BinaryFunction<? super T, ? super T, ? extends T> func) {try{__CLR4_4_11dc1dckcq4stfn.R.inc(1795);
        __CLR4_4_11dc1dckcq4stfn.R.inc(1796);this.function = func;
    }finally{__CLR4_4_11dc1dckcq4stfn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @param obj {@link Generator} to transform
     */
    public final T evaluate(Generator<T> obj) {try{__CLR4_4_11dc1dckcq4stfn.R.inc(1797);
        __CLR4_4_11dc1dckcq4stfn.R.inc(1798);FoldLeftHelper<T> helper = new FoldLeftHelper<T>(function);
        __CLR4_4_11dc1dckcq4stfn.R.inc(1799);obj.run(helper);
        __CLR4_4_11dc1dckcq4stfn.R.inc(1800);return helper.getResult();
    }finally{__CLR4_4_11dc1dckcq4stfn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * @param left {@link Generator} to transform
     * @param right initial left-side seed object
     */
    public final T evaluate(Generator<T> left, T right) {try{__CLR4_4_11dc1dckcq4stfn.R.inc(1801);
        __CLR4_4_11dc1dckcq4stfn.R.inc(1802);FoldLeftHelper<T> helper = new FoldLeftHelper<T>(right, function);
        __CLR4_4_11dc1dckcq4stfn.R.inc(1803);left.run(helper);
        __CLR4_4_11dc1dckcq4stfn.R.inc(1804);return helper.getResult();
    }finally{__CLR4_4_11dc1dckcq4stfn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_11dc1dckcq4stfn.R.inc(1805);
        __CLR4_4_11dc1dckcq4stfn.R.inc(1806);if ((((obj == this)&&(__CLR4_4_11dc1dckcq4stfn.R.iget(1807)!=0|true))||(__CLR4_4_11dc1dckcq4stfn.R.iget(1808)==0&false))) {{
            __CLR4_4_11dc1dckcq4stfn.R.inc(1809);return true;
        }
        }__CLR4_4_11dc1dckcq4stfn.R.inc(1810);if ((((!(obj instanceof FoldLeft<?>))&&(__CLR4_4_11dc1dckcq4stfn.R.iget(1811)!=0|true))||(__CLR4_4_11dc1dckcq4stfn.R.iget(1812)==0&false))) {{
            __CLR4_4_11dc1dckcq4stfn.R.inc(1813);return false;
        }
        }__CLR4_4_11dc1dckcq4stfn.R.inc(1814);return ((FoldLeft<?>) obj).function.equals(function);
    }finally{__CLR4_4_11dc1dckcq4stfn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_11dc1dckcq4stfn.R.inc(1815);
        __CLR4_4_11dc1dckcq4stfn.R.inc(1816);return "FoldLeft".hashCode() << 2 ^ function.hashCode();
    }finally{__CLR4_4_11dc1dckcq4stfn.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_11dc1dckcq4stfn.R.inc(1817);
        __CLR4_4_11dc1dckcq4stfn.R.inc(1818);return "FoldLeft<" + function + ">";
    }finally{__CLR4_4_11dc1dckcq4stfn.R.flushNeeded();}}

}
