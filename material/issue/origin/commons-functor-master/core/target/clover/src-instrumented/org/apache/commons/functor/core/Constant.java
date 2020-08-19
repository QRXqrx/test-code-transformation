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
package org.apache.commons.functor.core;

import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.Predicate;

/**
 * {@link #evaluate Evaluates} to constant value.
 * <p>
 * {@link #test Tests} to a constant value, assuming
 * a boolean of Boolean value is supplied.
 * </p>
 * @param <T> the returned value type.
 * @version $Revision$ $Date$
 */
public final class Constant<T> implements NullaryFunction<T>, Function<Object, T>, BinaryFunction<Object, Object, T>,
        NullaryPredicate, Predicate<Object>, BinaryPredicate<Object, Object> {public static class __CLR4_4_114g14gkcq4stcc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,1502,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // static attributes
    // ------------------------------------------------------------------------
    /**
     * Constant for <code>true</code>.
     */
    public static final Constant<Boolean> TRUE = of(Boolean.TRUE);

    /**
     * Constant for <code>false</code>.
     */
    public static final Constant<Boolean> FALSE = of(Boolean.FALSE);

    // attributes
    // ------------------------------------------------------------------------
    /**
     * The constant value.
     */
    private final T value;

    // constructor
    // ------------------------------------------------------------------------

    /**
     * Create a new Constant.
     * @param value Object
     */
    public Constant(T value) {try{__CLR4_4_114g14gkcq4stcc.R.inc(1456);
        __CLR4_4_114g14gkcq4stcc.R.inc(1457);this.value = value;
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    // function interface
    // ------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public T evaluate() {try{__CLR4_4_114g14gkcq4stcc.R.inc(1458);
        __CLR4_4_114g14gkcq4stcc.R.inc(1459);return value;
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public T evaluate(Object obj) {try{__CLR4_4_114g14gkcq4stcc.R.inc(1460);
        __CLR4_4_114g14gkcq4stcc.R.inc(1461);return evaluate();
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public T evaluate(Object left, Object right) {try{__CLR4_4_114g14gkcq4stcc.R.inc(1462);
        __CLR4_4_114g14gkcq4stcc.R.inc(1463);return evaluate();
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public boolean test() {try{__CLR4_4_114g14gkcq4stcc.R.inc(1464);
        __CLR4_4_114g14gkcq4stcc.R.inc(1465);return ((Boolean) evaluate()).booleanValue();
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public boolean test(Object obj) {try{__CLR4_4_114g14gkcq4stcc.R.inc(1466);
        __CLR4_4_114g14gkcq4stcc.R.inc(1467);return test();
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public boolean test(Object left, Object right) {try{__CLR4_4_114g14gkcq4stcc.R.inc(1468);
        __CLR4_4_114g14gkcq4stcc.R.inc(1469);return test();
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_114g14gkcq4stcc.R.inc(1470);
        __CLR4_4_114g14gkcq4stcc.R.inc(1471);if ((((obj == this)&&(__CLR4_4_114g14gkcq4stcc.R.iget(1472)!=0|true))||(__CLR4_4_114g14gkcq4stcc.R.iget(1473)==0&false))) {{
            __CLR4_4_114g14gkcq4stcc.R.inc(1474);return true;
        }
        }__CLR4_4_114g14gkcq4stcc.R.inc(1475);if ((((!(obj instanceof Constant<?>))&&(__CLR4_4_114g14gkcq4stcc.R.iget(1476)!=0|true))||(__CLR4_4_114g14gkcq4stcc.R.iget(1477)==0&false))) {{
            __CLR4_4_114g14gkcq4stcc.R.inc(1478);return false;
        }
        }__CLR4_4_114g14gkcq4stcc.R.inc(1479);Constant<?> that = (Constant<?>) obj;
        __CLR4_4_114g14gkcq4stcc.R.inc(1480);return (((null == this.value )&&(__CLR4_4_114g14gkcq4stcc.R.iget(1481)!=0|true))||(__CLR4_4_114g14gkcq4stcc.R.iget(1482)==0&false))? null == that.value : this.value.equals(that.value);
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_114g14gkcq4stcc.R.inc(1483);
        __CLR4_4_114g14gkcq4stcc.R.inc(1484);int hash = "Constant".hashCode();
        __CLR4_4_114g14gkcq4stcc.R.inc(1485);if ((((null != value)&&(__CLR4_4_114g14gkcq4stcc.R.iget(1486)!=0|true))||(__CLR4_4_114g14gkcq4stcc.R.iget(1487)==0&false))) {{
            __CLR4_4_114g14gkcq4stcc.R.inc(1488);hash ^= value.hashCode();
        }
        }__CLR4_4_114g14gkcq4stcc.R.inc(1489);return hash;
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_114g14gkcq4stcc.R.inc(1490);
        __CLR4_4_114g14gkcq4stcc.R.inc(1491);return "Constant<" + String.valueOf(value) + ">";
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    // static methods
    // ------------------------------------------------------------------------

    /**
     * Get a <code>Constant</code> that always
     * returns <code>true</code>.
     * @return a <code>Constant</code> that always
     *         returns <code>true</code>
     */
    public static Constant<Boolean> truePredicate() {try{__CLR4_4_114g14gkcq4stcc.R.inc(1492);
        __CLR4_4_114g14gkcq4stcc.R.inc(1493);return TRUE;
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * Get a <code>Constant</code> that always
     * returns <code>false</code>.
     * @return a <code>Constant</code> that always
     *         returns <code>false</code>
     */
    public static Constant<Boolean> falsePredicate() {try{__CLR4_4_114g14gkcq4stcc.R.inc(1494);
        __CLR4_4_114g14gkcq4stcc.R.inc(1495);return FALSE;
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * Get a <code>Constant</code> that always
     * returns <i>value</i>.
     * @param value the constant value
     * @return a <code>Constant</code> that always
     *         returns <i>value</i>
     */
    public static Constant<Boolean> predicate(boolean value) {try{__CLR4_4_114g14gkcq4stcc.R.inc(1496);
        __CLR4_4_114g14gkcq4stcc.R.inc(1497);return (((value )&&(__CLR4_4_114g14gkcq4stcc.R.iget(1498)!=0|true))||(__CLR4_4_114g14gkcq4stcc.R.iget(1499)==0&false))? TRUE : FALSE;
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

    /**
     * Get a Constant instance for the specified value.
     * @param <T> the constant value
     * @param value T
     * @return Constant<T>
     */
    public static <T> Constant<T> of(T value) {try{__CLR4_4_114g14gkcq4stcc.R.inc(1500);
        __CLR4_4_114g14gkcq4stcc.R.inc(1501);return new Constant<T>(value);
    }finally{__CLR4_4_114g14gkcq4stcc.R.flushNeeded();}}

}
