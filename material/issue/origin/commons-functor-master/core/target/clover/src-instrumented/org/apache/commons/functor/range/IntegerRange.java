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
 * A range of integers.
 *
 * @since 1.0
 * @version $Revision: 1385335 $ $Date: 2012-09-16 15:08:31 -0300 (Sun, 16 Sep 2012) $
 */
public class IntegerRange extends NumericRange<Integer> {public static class __CLR4_4_13ed3edkcq4stzz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,4456,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // attributes
    // ---------------------------------------------------------------

    /**
     * Calculate default step.
     */
    public static final BinaryFunction<Integer, Integer, Integer> DEFAULT_STEP =
        new BinaryFunction<Integer, Integer, Integer>() {

            public Integer evaluate(Integer left, Integer right) {try{__CLR4_4_13ed3edkcq4stzz.R.inc(4405);
                __CLR4_4_13ed3edkcq4stzz.R.inc(4406);return (((left > right )&&(__CLR4_4_13ed3edkcq4stzz.R.iget(4407)!=0|true))||(__CLR4_4_13ed3edkcq4stzz.R.iget(4408)==0&false))? -1 : 1;
            }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}
        };

    // constructors
    // ---------------------------------------------------------------
    /**
     * Create a new IntegerRange.
     *
     * @param from
     *            start
     * @param to
     *            end
     */
    public IntegerRange(Number from, Number to) {
        this(from.intValue(), to.intValue());__CLR4_4_13ed3edkcq4stzz.R.inc(4410);try{__CLR4_4_13ed3edkcq4stzz.R.inc(4409);
    }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from
     *            start
     * @param to
     *            end
     * @param step
     *            increment
     */
    public IntegerRange(Number from, Number to, Number step) {
        this(from.intValue(), to.intValue(), step.intValue());__CLR4_4_13ed3edkcq4stzz.R.inc(4412);try{__CLR4_4_13ed3edkcq4stzz.R.inc(4411);
    }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from
     *            start
     * @param to
     *            end
     */
    public IntegerRange(int from, int to) {
        this(from, to, DEFAULT_STEP.evaluate(from, to).intValue());__CLR4_4_13ed3edkcq4stzz.R.inc(4414);try{__CLR4_4_13ed3edkcq4stzz.R.inc(4413);
    }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from
     *            start
     * @param to
     *            end
     * @param step
     *            increment
     */
    public IntegerRange(int from, int to, int step) {
        this(from, DEFAULT_LEFT_BOUND_TYPE, to, DEFAULT_RIGHT_BOUND_TYPE, step);__CLR4_4_13ed3edkcq4stzz.R.inc(4416);try{__CLR4_4_13ed3edkcq4stzz.R.inc(4415);
    }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from
     *            start
     * @param to
     *            end
     * @throws NullPointerException
     *             if either {@link Endpoint} is {@code null}
     */
    public IntegerRange(Endpoint<Integer> from, Endpoint<Integer> to) {
        this(from, to, DEFAULT_STEP.evaluate(from.getValue(), to.getValue()));__CLR4_4_13ed3edkcq4stzz.R.inc(4418);try{__CLR4_4_13ed3edkcq4stzz.R.inc(4417);
    }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from
     *            start
     * @param leftBoundType
     *            type of left bound
     * @param to
     *            end
     * @param rightBoundType
     *            type of right bound
     * @throws NullPointerException
     *             if either {@link BoundType} is {@code null}
     */
    public IntegerRange(int from, BoundType leftBoundType, int to, BoundType rightBoundType) {
        this(from, leftBoundType, to, rightBoundType, DEFAULT_STEP.evaluate(from, to));__CLR4_4_13ed3edkcq4stzz.R.inc(4420);try{__CLR4_4_13ed3edkcq4stzz.R.inc(4419);
    }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from
     *            start
     * @param to
     *            end
     * @param step
     *            increment
     * @throws NullPointerException
     *             if either {@link Endpoint} is {@code null}
     */
    public IntegerRange(Endpoint<Integer> from, Endpoint<Integer> to, int step) {
        super(from, to, Integer.valueOf(step), new BinaryFunction<Integer, Integer, Integer>() {

            public Integer evaluate(Integer left, Integer right) {try{__CLR4_4_13ed3edkcq4stzz.R.inc(4422);
                __CLR4_4_13ed3edkcq4stzz.R.inc(4423);return Integer.valueOf(left.intValue() + right.intValue());
            }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}
        });__CLR4_4_13ed3edkcq4stzz.R.inc(4424);try{__CLR4_4_13ed3edkcq4stzz.R.inc(4421);

        __CLR4_4_13ed3edkcq4stzz.R.inc(4425);final int f = from.getValue();
        __CLR4_4_13ed3edkcq4stzz.R.inc(4426);final int t = to.getValue();

        __CLR4_4_13ed3edkcq4stzz.R.inc(4427);Validate.isTrue(f == t || Integer.signum(step) == Integer.signum(t - f),
            "Will never reach '%s' from '%s' using step %s", t, f, step);
    }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from
     *            start
     * @param leftBoundType
     *            type of left bound
     * @param to
     *            end
     * @param rightBoundType
     *            type of right bound
     * @param step
     *            increment
     * @throws NullPointerException
     *             if either {@link BoundType} is {@code null}
     */
    public IntegerRange(int from, BoundType leftBoundType, int to, BoundType rightBoundType, int step) {
        this(new Endpoint<Integer>(from, leftBoundType), new Endpoint<Integer>(to, rightBoundType), step);__CLR4_4_13ed3edkcq4stzz.R.inc(4429);try{__CLR4_4_13ed3edkcq4stzz.R.inc(4428);
    }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    protected Iterator<Integer> createIterator() {try{__CLR4_4_13ed3edkcq4stzz.R.inc(4430);
        __CLR4_4_13ed3edkcq4stzz.R.inc(4431);return new Iterator<Integer>() {
            private int currentValue;

            {try{__CLR4_4_13ed3edkcq4stzz.R.inc(4432);
                __CLR4_4_13ed3edkcq4stzz.R.inc(4433);currentValue = leftEndpoint.getValue();

                __CLR4_4_13ed3edkcq4stzz.R.inc(4434);if ((((leftEndpoint.getBoundType() == BoundType.OPEN)&&(__CLR4_4_13ed3edkcq4stzz.R.iget(4435)!=0|true))||(__CLR4_4_13ed3edkcq4stzz.R.iget(4436)==0&false))) {{
                    __CLR4_4_13ed3edkcq4stzz.R.inc(4437);this.currentValue += step;
                }
            }}finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

            public void remove() {try{__CLR4_4_13ed3edkcq4stzz.R.inc(4438);
                __CLR4_4_13ed3edkcq4stzz.R.inc(4439);throw new UnsupportedOperationException();
            }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

            public Integer next() {try{__CLR4_4_13ed3edkcq4stzz.R.inc(4440);
                __CLR4_4_13ed3edkcq4stzz.R.inc(4441);final int step = getStep();
                __CLR4_4_13ed3edkcq4stzz.R.inc(4442);final int r = currentValue;
                __CLR4_4_13ed3edkcq4stzz.R.inc(4443);currentValue += step;
                __CLR4_4_13ed3edkcq4stzz.R.inc(4444);return Integer.valueOf(r);
            }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

            public boolean hasNext() {try{__CLR4_4_13ed3edkcq4stzz.R.inc(4445);
                __CLR4_4_13ed3edkcq4stzz.R.inc(4446);final int cmp = Integer.valueOf(currentValue).compareTo(rightEndpoint.getValue());

                __CLR4_4_13ed3edkcq4stzz.R.inc(4447);if ((((cmp == 0)&&(__CLR4_4_13ed3edkcq4stzz.R.iget(4448)!=0|true))||(__CLR4_4_13ed3edkcq4stzz.R.iget(4449)==0&false))) {{
                    __CLR4_4_13ed3edkcq4stzz.R.inc(4450);return rightEndpoint.getBoundType() == BoundType.CLOSED;
                }
                }__CLR4_4_13ed3edkcq4stzz.R.inc(4451);if ((((step > 0)&&(__CLR4_4_13ed3edkcq4stzz.R.iget(4452)!=0|true))||(__CLR4_4_13ed3edkcq4stzz.R.iget(4453)==0&false))) {{
                    __CLR4_4_13ed3edkcq4stzz.R.inc(4454);return cmp < 0;
                }
                }__CLR4_4_13ed3edkcq4stzz.R.inc(4455);return cmp > 0;
            }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}
        };
    }finally{__CLR4_4_13ed3edkcq4stzz.R.flushNeeded();}}

}
