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

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.Predicate;
import org.apache.commons.lang3.Validate;

/**
 * A predicate that returns <code>true</code>
 * the first <i>n</i> times it is invoked, and
 * <code>false</code> thereafter.
 *
 * @since 1.0
 * @version $Revision$ $Date$
 */
public final class Limit implements NullaryPredicate, Predicate<Object>, BinaryPredicate<Object, Object> {public static class __CLR4_4_118y18ykcq4stee{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,1652,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // instance variables
    //---------------------------------------------------------------
    /**
     * The max number of times the predicate can be invoked.
     */
    private final int max;
    /**
     * The current number of times the predicate has been invoked.
     */
    private final AtomicInteger state = new AtomicInteger();

    /**
     * Create a new Limit.
     * @param count limit
     */
    public Limit(int count) {try{__CLR4_4_118y18ykcq4stee.R.inc(1618);
        __CLR4_4_118y18ykcq4stee.R.inc(1619);Validate.isTrue(count >= 0, "Argument must be a non-negative integer.");
        __CLR4_4_118y18ykcq4stee.R.inc(1620);this.max = count;
    }finally{__CLR4_4_118y18ykcq4stee.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public boolean test() {try{__CLR4_4_118y18ykcq4stee.R.inc(1621);
        // stop incrementing when we've hit max, so we don't loop around
        __CLR4_4_118y18ykcq4stee.R.inc(1622);if ((((state.get() < max)&&(__CLR4_4_118y18ykcq4stee.R.iget(1623)!=0|true))||(__CLR4_4_118y18ykcq4stee.R.iget(1624)==0&false))) {{
            __CLR4_4_118y18ykcq4stee.R.inc(1625);state.incrementAndGet();
            __CLR4_4_118y18ykcq4stee.R.inc(1626);return true;
        }
        }__CLR4_4_118y18ykcq4stee.R.inc(1627);return false;
    }finally{__CLR4_4_118y18ykcq4stee.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public boolean test(Object obj) {try{__CLR4_4_118y18ykcq4stee.R.inc(1628);
        __CLR4_4_118y18ykcq4stee.R.inc(1629);return test();
    }finally{__CLR4_4_118y18ykcq4stee.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public boolean test(Object a, Object b) {try{__CLR4_4_118y18ykcq4stee.R.inc(1630);
        __CLR4_4_118y18ykcq4stee.R.inc(1631);return test();
    }finally{__CLR4_4_118y18ykcq4stee.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_118y18ykcq4stee.R.inc(1632);
        __CLR4_4_118y18ykcq4stee.R.inc(1633);if ((((obj == this)&&(__CLR4_4_118y18ykcq4stee.R.iget(1634)!=0|true))||(__CLR4_4_118y18ykcq4stee.R.iget(1635)==0&false))) {{
            __CLR4_4_118y18ykcq4stee.R.inc(1636);return true;
        }
        }__CLR4_4_118y18ykcq4stee.R.inc(1637);if ((((!(obj instanceof Limit))&&(__CLR4_4_118y18ykcq4stee.R.iget(1638)!=0|true))||(__CLR4_4_118y18ykcq4stee.R.iget(1639)==0&false))) {{
            __CLR4_4_118y18ykcq4stee.R.inc(1640);return false;
        }
        }__CLR4_4_118y18ykcq4stee.R.inc(1641);Limit other = (Limit) obj;
        __CLR4_4_118y18ykcq4stee.R.inc(1642);return other.max == max;
    }finally{__CLR4_4_118y18ykcq4stee.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_118y18ykcq4stee.R.inc(1643);
        __CLR4_4_118y18ykcq4stee.R.inc(1644);int result = "Limit".hashCode();
        __CLR4_4_118y18ykcq4stee.R.inc(1645);result <<= 2;
        __CLR4_4_118y18ykcq4stee.R.inc(1646);result ^= max;
        __CLR4_4_118y18ykcq4stee.R.inc(1647);return result;
    }finally{__CLR4_4_118y18ykcq4stee.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_118y18ykcq4stee.R.inc(1648);
        __CLR4_4_118y18ykcq4stee.R.inc(1649);return "Limit<" + max + ">";
    }finally{__CLR4_4_118y18ykcq4stee.R.flushNeeded();}}

    //default == equals/hashCode due to statefulness

    // static methods
    // ------------------------------------------------------------------------

    /**
     * Get a Limit instance for the specified value.
     * @param count limit
     * @return Limit
     */
    public static Limit of(int count) {try{__CLR4_4_118y18ykcq4stee.R.inc(1650);
        __CLR4_4_118y18ykcq4stee.R.inc(1651);return new Limit(count);
    }finally{__CLR4_4_118y18ykcq4stee.R.flushNeeded();}}

}
