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
package org.apache.commons.functor.range;

import java.util.Iterator;

import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.lang3.Validate;

/**
 * A range of longs.
 *
 * @since 1.0
 * @version $Revision: 1385335 $ $Date: 2012-09-16 15:08:31 -0300 (Sun, 16 Sep 2012) $
 */
public final class LongRange extends NumericRange<Long> {public static class __CLR4_4_13fs3fskcq4su0a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,4509,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // attributes
    //---------------------------------------------------------------

    /**
     * Calculate default step.
     */
    public static final BinaryFunction<Long, Long, Long> DEFAULT_STEP = new BinaryFunction<Long, Long, Long>() {

        public Long evaluate(Long left, Long right) {try{__CLR4_4_13fs3fskcq4su0a.R.inc(4456);
            __CLR4_4_13fs3fskcq4su0a.R.inc(4457);return (((left > right )&&(__CLR4_4_13fs3fskcq4su0a.R.iget(4458)!=0|true))||(__CLR4_4_13fs3fskcq4su0a.R.iget(4459)==0&false))? -1L : 1L;
        }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}
    };

    // constructors
    // ---------------------------------------------------------------
    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param to end
     */
    public LongRange(Number from, Number to) {
        this(from.longValue(), to.longValue());__CLR4_4_13fs3fskcq4su0a.R.inc(4461);try{__CLR4_4_13fs3fskcq4su0a.R.inc(4460);
    }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     */
    public LongRange(Number from, Number to, Number step) {
        this(from.longValue(), to.longValue(), step.longValue());__CLR4_4_13fs3fskcq4su0a.R.inc(4463);try{__CLR4_4_13fs3fskcq4su0a.R.inc(4462);
    }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param to end
     */
    public LongRange(long from, long to) {
        this(from, to, DEFAULT_STEP.evaluate(from, to).longValue());__CLR4_4_13fs3fskcq4su0a.R.inc(4465);try{__CLR4_4_13fs3fskcq4su0a.R.inc(4464);
    }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     */
    public LongRange(long from, long to, long step) {
        this(from, DEFAULT_LEFT_BOUND_TYPE, to, DEFAULT_RIGHT_BOUND_TYPE, step);__CLR4_4_13fs3fskcq4su0a.R.inc(4467);try{__CLR4_4_13fs3fskcq4su0a.R.inc(4466);
    }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param to end
     * @throws NullPointerException if either {@link Endpoint} is {@code null}
     */
    public LongRange(Endpoint<Long> from, Endpoint<Long> to) {
        this(from, to, DEFAULT_STEP.evaluate(from.getValue(), to.getValue()));__CLR4_4_13fs3fskcq4su0a.R.inc(4469);try{__CLR4_4_13fs3fskcq4su0a.R.inc(4468);
    }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @throws NullPointerException if either {@link Endpoint} is {@code null}
     */
    public LongRange(Endpoint<Long> from, Endpoint<Long> to, int step) {
        this(from, to, (long) step);__CLR4_4_13fs3fskcq4su0a.R.inc(4471);try{__CLR4_4_13fs3fskcq4su0a.R.inc(4470);
    }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @throws NullPointerException if either {@link BoundType} is {@code null}
     */
    public LongRange(long from, BoundType leftBoundType, long to, BoundType rightBoundType) {
        this(from, leftBoundType, to, rightBoundType, DEFAULT_STEP.evaluate(from, to));__CLR4_4_13fs3fskcq4su0a.R.inc(4473);try{__CLR4_4_13fs3fskcq4su0a.R.inc(4472);
    }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @throws NullPointerException if either {@link Endpoint} is {@code null}
     */
    public LongRange(Endpoint<Long> from, Endpoint<Long> to, long step) {
        super(from, to, Long.valueOf(step), new BinaryFunction<Long, Long, Long>() {

            public Long evaluate(Long left, Long right) {try{__CLR4_4_13fs3fskcq4su0a.R.inc(4475);
                __CLR4_4_13fs3fskcq4su0a.R.inc(4476);return Long.valueOf(left.longValue() + right.longValue());
            }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}
        });__CLR4_4_13fs3fskcq4su0a.R.inc(4477);try{__CLR4_4_13fs3fskcq4su0a.R.inc(4474);

        __CLR4_4_13fs3fskcq4su0a.R.inc(4478);final long f = from.getValue();
        __CLR4_4_13fs3fskcq4su0a.R.inc(4479);final long t = to.getValue();

        __CLR4_4_13fs3fskcq4su0a.R.inc(4480);Validate.isTrue(f == t || Long.signum(step) == Long.signum(t - f),
            "Will never reach '%s' from '%s' using step %s", t, f, step);
    }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @param step increment
     * @throws NullPointerException if either {@link BoundType} is {@code null}
     */
    public LongRange(long from, BoundType leftBoundType, long to,
                     BoundType rightBoundType, long step) {
        this(new Endpoint<Long>(from, leftBoundType), new Endpoint<Long>(to, rightBoundType), step);__CLR4_4_13fs3fskcq4su0a.R.inc(4482);try{__CLR4_4_13fs3fskcq4su0a.R.inc(4481);
    }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

    // iterable
    // ---------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected Iterator<Long> createIterator() {try{__CLR4_4_13fs3fskcq4su0a.R.inc(4483);
        __CLR4_4_13fs3fskcq4su0a.R.inc(4484);return new Iterator<Long>() {
            private long currentValue;

            {try{__CLR4_4_13fs3fskcq4su0a.R.inc(4485);
                __CLR4_4_13fs3fskcq4su0a.R.inc(4486);currentValue = leftEndpoint.getValue();

                __CLR4_4_13fs3fskcq4su0a.R.inc(4487);if ((((leftEndpoint.getBoundType() == BoundType.OPEN)&&(__CLR4_4_13fs3fskcq4su0a.R.iget(4488)!=0|true))||(__CLR4_4_13fs3fskcq4su0a.R.iget(4489)==0&false))) {{
                    __CLR4_4_13fs3fskcq4su0a.R.inc(4490);this.currentValue += step;
                }
            }}finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

            public void remove() {try{__CLR4_4_13fs3fskcq4su0a.R.inc(4491);
                __CLR4_4_13fs3fskcq4su0a.R.inc(4492);throw new UnsupportedOperationException();
            }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

            public Long next() {try{__CLR4_4_13fs3fskcq4su0a.R.inc(4493);
                __CLR4_4_13fs3fskcq4su0a.R.inc(4494);final long step = getStep();
                __CLR4_4_13fs3fskcq4su0a.R.inc(4495);final long r = currentValue;
                __CLR4_4_13fs3fskcq4su0a.R.inc(4496);currentValue += step;
                __CLR4_4_13fs3fskcq4su0a.R.inc(4497);return Long.valueOf(r);
            }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

            public boolean hasNext() {try{__CLR4_4_13fs3fskcq4su0a.R.inc(4498);
                __CLR4_4_13fs3fskcq4su0a.R.inc(4499);final int cmp = Long.valueOf(currentValue).compareTo(rightEndpoint.getValue());

                __CLR4_4_13fs3fskcq4su0a.R.inc(4500);if ((((cmp == 0)&&(__CLR4_4_13fs3fskcq4su0a.R.iget(4501)!=0|true))||(__CLR4_4_13fs3fskcq4su0a.R.iget(4502)==0&false))) {{
                    __CLR4_4_13fs3fskcq4su0a.R.inc(4503);return rightEndpoint.getBoundType() == BoundType.CLOSED;
                }
                }__CLR4_4_13fs3fskcq4su0a.R.inc(4504);if ((((step > 0L)&&(__CLR4_4_13fs3fskcq4su0a.R.iget(4505)!=0|true))||(__CLR4_4_13fs3fskcq4su0a.R.iget(4506)==0&false))) {{
                    __CLR4_4_13fs3fskcq4su0a.R.inc(4507);return cmp < 0;
                }
                }__CLR4_4_13fs3fskcq4su0a.R.inc(4508);return cmp > 0;
            }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}
        };
    }finally{__CLR4_4_13fs3fskcq4su0a.R.flushNeeded();}}

}
