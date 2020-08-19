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
package org.apache.commons.functor.core.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.functor.BinaryProcedure;

/**
 * A {@link BinaryProcedure BinaryProcedure}
 * that {@link BinaryProcedure#run runs} an ordered
 * sequence of {@link BinaryProcedure BinaryProcedures}.
 * When the sequence is empty, this procedure is does
 * nothing.
 *
 * @param <L> the procedure left argument type.
 * @param <R> the procedure right argument type.
 * @version $Revision$ $Date$
 */
public class BinarySequence<L, R> implements BinaryProcedure<L, R> {public static class __CLR4_4_127c27ckcq4stoh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,2895,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // attributes
    // ------------------------------------------------------------------------
    /**
     * A list where storing all the procedures references.
     */
    private final List<BinaryProcedure<? super L, ? super R>> list =
        new ArrayList<BinaryProcedure<? super L, ? super R>>();

    // constructor
    // ------------------------------------------------------------------------
    /**
     * Create a new BinarySequence.
     */
    public BinarySequence() {
        super();__CLR4_4_127c27ckcq4stoh.R.inc(2857);try{__CLR4_4_127c27ckcq4stoh.R.inc(2856);
    }finally{__CLR4_4_127c27ckcq4stoh.R.flushNeeded();}}

    /**
     * Create a new BinarySequence instance.
     *
     * @param procedures to run sequentially
     */
    public BinarySequence(BinaryProcedure<? super L, ? super R>... procedures) {
        this();__CLR4_4_127c27ckcq4stoh.R.inc(2859);try{__CLR4_4_127c27ckcq4stoh.R.inc(2858);
        __CLR4_4_127c27ckcq4stoh.R.inc(2860);if ((((procedures != null)&&(__CLR4_4_127c27ckcq4stoh.R.iget(2861)!=0|true))||(__CLR4_4_127c27ckcq4stoh.R.iget(2862)==0&false))) {{
            __CLR4_4_127c27ckcq4stoh.R.inc(2863);for (BinaryProcedure<? super L, ? super R> p : procedures) {{
                __CLR4_4_127c27ckcq4stoh.R.inc(2864);then(p);
            }
        }}
    }}finally{__CLR4_4_127c27ckcq4stoh.R.flushNeeded();}}

    /**
     * Create a new BinarySequence instance.
     *
     * @param procedures to run sequentially
     */
    public BinarySequence(Iterable<BinaryProcedure<? super L, ? super R>> procedures) {
        this();__CLR4_4_127c27ckcq4stoh.R.inc(2866);try{__CLR4_4_127c27ckcq4stoh.R.inc(2865);
        __CLR4_4_127c27ckcq4stoh.R.inc(2867);if ((((procedures != null)&&(__CLR4_4_127c27ckcq4stoh.R.iget(2868)!=0|true))||(__CLR4_4_127c27ckcq4stoh.R.iget(2869)==0&false))) {{
            __CLR4_4_127c27ckcq4stoh.R.inc(2870);for (BinaryProcedure<? super L, ? super R> p : procedures) {{
                __CLR4_4_127c27ckcq4stoh.R.inc(2871);then(p);
            }
        }}
    }}finally{__CLR4_4_127c27ckcq4stoh.R.flushNeeded();}}

    /**
     * Fluently add a BinaryProcedure.
     * @param p BinaryProcedure to add
     * @return this
     */
    public final BinarySequence<L, R> then(BinaryProcedure<? super L, ? super R> p) {try{__CLR4_4_127c27ckcq4stoh.R.inc(2872);
        __CLR4_4_127c27ckcq4stoh.R.inc(2873);list.add(p);
        __CLR4_4_127c27ckcq4stoh.R.inc(2874);return this;
    }finally{__CLR4_4_127c27ckcq4stoh.R.flushNeeded();}}

    // predicate interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public final void run(L left, R right) {try{__CLR4_4_127c27ckcq4stoh.R.inc(2875);
        __CLR4_4_127c27ckcq4stoh.R.inc(2876);for (Iterator<BinaryProcedure<? super L, ? super R>> iter = list.iterator(); (((iter.hasNext())&&(__CLR4_4_127c27ckcq4stoh.R.iget(2877)!=0|true))||(__CLR4_4_127c27ckcq4stoh.R.iget(2878)==0&false));) {{
            __CLR4_4_127c27ckcq4stoh.R.inc(2879);iter.next().run(left, right);
        }
    }}finally{__CLR4_4_127c27ckcq4stoh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(Object obj) {try{__CLR4_4_127c27ckcq4stoh.R.inc(2880);
        __CLR4_4_127c27ckcq4stoh.R.inc(2881);if ((((obj == this)&&(__CLR4_4_127c27ckcq4stoh.R.iget(2882)!=0|true))||(__CLR4_4_127c27ckcq4stoh.R.iget(2883)==0&false))) {{
            __CLR4_4_127c27ckcq4stoh.R.inc(2884);return true;
        }
        }__CLR4_4_127c27ckcq4stoh.R.inc(2885);if ((((!(obj instanceof BinarySequence<?, ?>))&&(__CLR4_4_127c27ckcq4stoh.R.iget(2886)!=0|true))||(__CLR4_4_127c27ckcq4stoh.R.iget(2887)==0&false))) {{
            __CLR4_4_127c27ckcq4stoh.R.inc(2888);return false;
        }
        }__CLR4_4_127c27ckcq4stoh.R.inc(2889);BinarySequence<?, ?> that = (BinarySequence<?, ?>) obj;
        __CLR4_4_127c27ckcq4stoh.R.inc(2890);return this.list.equals(that.list);
    }finally{__CLR4_4_127c27ckcq4stoh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_127c27ckcq4stoh.R.inc(2891);
        // by construction, list is never null
        __CLR4_4_127c27ckcq4stoh.R.inc(2892);return "BinarySequence".hashCode() ^ list.hashCode();
    }finally{__CLR4_4_127c27ckcq4stoh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_127c27ckcq4stoh.R.inc(2893);
        __CLR4_4_127c27ckcq4stoh.R.inc(2894);return "BinarySequence<" + list + ">";
    }finally{__CLR4_4_127c27ckcq4stoh.R.flushNeeded();}}

}
