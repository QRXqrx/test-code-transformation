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
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.loop.LoopGenerator;

/**
 * Return the index of the first Object in a {@link LoopGenerator} matching a
 * {@link Predicate}, or -1 if not found.
 *
 * @param <T> the procedure argument types
 * @version $Revision$ $Date$
 */
public final class IndexOfInGenerator<T>
    implements BinaryFunction<LoopGenerator<? extends T>, Predicate<? super T>, Number> {public static class __CLR4_4_11gp1gpkcq4stgk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,1919,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * A static {@code IndexOfInGenerator} instance reference.
     */
    private static final IndexOfInGenerator<Object> INSTANCE = new IndexOfInGenerator<Object>();

    /**
     * Helper procedure.
     *
     * @param <T> the procedure argument type
     */
    private static class IndexProcedure<T> implements Procedure<T> {
        /**
         * The wrapped generator.
         */
        private final LoopGenerator<? extends T> generator;
        /**
         * The wrapped predicate.
         */
        private final Predicate<? super T> pred;
        /**
         * The number of iterations needed before the wrapped predicate found the target,
         * {@code -1} means the target was not found.
         */
        private long index = -1L;
        /**
         * A local accumulator to increment the number of attempts.
         */
        private long current = 0L;

        /**
         * Create a new IndexProcedure.
         *
         * @param generator The wrapped generator
         * @param pred The wrapped predicate
         */
        IndexProcedure(LoopGenerator<? extends T> generator, Predicate<? super T> pred) {try{__CLR4_4_11gp1gpkcq4stgk.R.inc(1897);
            __CLR4_4_11gp1gpkcq4stgk.R.inc(1898);this.generator = generator;
            __CLR4_4_11gp1gpkcq4stgk.R.inc(1899);this.pred = pred;
        }finally{__CLR4_4_11gp1gpkcq4stgk.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public void run(T obj) {try{__CLR4_4_11gp1gpkcq4stgk.R.inc(1900);
            __CLR4_4_11gp1gpkcq4stgk.R.inc(1901);if ((((index < 0 && pred.test(obj))&&(__CLR4_4_11gp1gpkcq4stgk.R.iget(1902)!=0|true))||(__CLR4_4_11gp1gpkcq4stgk.R.iget(1903)==0&false))) {{
                __CLR4_4_11gp1gpkcq4stgk.R.inc(1904);index = current;
                __CLR4_4_11gp1gpkcq4stgk.R.inc(1905);generator.stop();
            }
            }__CLR4_4_11gp1gpkcq4stgk.R.inc(1906);current++;
        }finally{__CLR4_4_11gp1gpkcq4stgk.R.flushNeeded();}}
    }

    /**
     * {@inheritDoc}
     * @param left LoopGenerator
     * @param right Predicate
     */
    public Number evaluate(LoopGenerator<? extends T> left, Predicate<? super T> right) {try{__CLR4_4_11gp1gpkcq4stgk.R.inc(1907);
        __CLR4_4_11gp1gpkcq4stgk.R.inc(1908);IndexProcedure<T> findProcedure = new IndexProcedure<T>(left, right);
        __CLR4_4_11gp1gpkcq4stgk.R.inc(1909);left.run(findProcedure);
        __CLR4_4_11gp1gpkcq4stgk.R.inc(1910);return Long.valueOf(findProcedure.index);
    }finally{__CLR4_4_11gp1gpkcq4stgk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_11gp1gpkcq4stgk.R.inc(1911);
        __CLR4_4_11gp1gpkcq4stgk.R.inc(1912);return obj == this || obj != null && obj.getClass().equals(getClass());
    }finally{__CLR4_4_11gp1gpkcq4stgk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_11gp1gpkcq4stgk.R.inc(1913);
        __CLR4_4_11gp1gpkcq4stgk.R.inc(1914);return System.identityHashCode(INSTANCE);
    }finally{__CLR4_4_11gp1gpkcq4stgk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_11gp1gpkcq4stgk.R.inc(1915);
        __CLR4_4_11gp1gpkcq4stgk.R.inc(1916);return "IndexOfInGenerator";
    }finally{__CLR4_4_11gp1gpkcq4stgk.R.flushNeeded();}}

    /**
     * Get a static {@link IndexOfInGenerator} instance.
     * @return {@link IndexOfInGenerator}
     */
    public static IndexOfInGenerator<Object> instance() {try{__CLR4_4_11gp1gpkcq4stgk.R.inc(1917);
        __CLR4_4_11gp1gpkcq4stgk.R.inc(1918);return INSTANCE;
    }finally{__CLR4_4_11gp1gpkcq4stgk.R.flushNeeded();}}
}
