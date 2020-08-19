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
 * A generator for a range of characters.
 *
 * @since 1.0
 * @version $Revision$ $Date$
 */
public final class CharacterRange extends AbstractRange<Character, Integer> {public static class __CLR4_4_1385385kcq4styp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,4265,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Calculate default step.
     */
    public static final BinaryFunction<Character, Character, Integer> DEFAULT_STEP =
        new BinaryFunction<Character, Character, Integer>() {

            public Integer evaluate(Character left, Character right) {try{__CLR4_4_1385385kcq4styp.R.inc(4181);
                __CLR4_4_1385385kcq4styp.R.inc(4182);return (((left > right )&&(__CLR4_4_1385385kcq4styp.R.iget(4183)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4184)==0&false))? -1 : 1;
            }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}
        };

    // constructors
    // ---------------------------------------------------------------
    /**
     * Create a new CharacterRange.
     *
     * @param from start
     * @param to end
     */
    public CharacterRange(char from, char to) {
        this(from, to, DEFAULT_STEP.evaluate(from, to).intValue());__CLR4_4_1385385kcq4styp.R.inc(4186);try{__CLR4_4_1385385kcq4styp.R.inc(4185);
    }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

    /**
     * Create a new CharacterRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     */
    public CharacterRange(char from, char to, int step) {
        this(from, BoundType.CLOSED, to, BoundType.CLOSED, step);__CLR4_4_1385385kcq4styp.R.inc(4188);try{__CLR4_4_1385385kcq4styp.R.inc(4187);
    }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

    /**
     * Create a new CharacterRange.
     *
     * @param from start
     * @param to end
     * @throws NullPointerException if either {@link Endpoint} is {@code null}
     */
    public CharacterRange(Endpoint<Character> from, Endpoint<Character> to) {
        this(from, to, DEFAULT_STEP.evaluate(from.getValue(), to.getValue()));__CLR4_4_1385385kcq4styp.R.inc(4190);try{__CLR4_4_1385385kcq4styp.R.inc(4189);
    }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

    /**
     * Create a new CharacterRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @throws NullPointerException if either {@link Endpoint} is {@code null}
     */
    public CharacterRange(Endpoint<Character> from, Endpoint<Character> to, int step) {
        super(from, to, Integer.valueOf(step), new BinaryFunction<Character, Integer, Character>() {

            public Character evaluate(Character left, Integer right) {try{__CLR4_4_1385385kcq4styp.R.inc(4192);
                __CLR4_4_1385385kcq4styp.R.inc(4193);return Character.valueOf((char) (left.charValue() + right.intValue()));
            }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}
        });__CLR4_4_1385385kcq4styp.R.inc(4194);try{__CLR4_4_1385385kcq4styp.R.inc(4191);
        __CLR4_4_1385385kcq4styp.R.inc(4195);final char f = from.getValue();
        __CLR4_4_1385385kcq4styp.R.inc(4196);final char t = to.getValue();

        __CLR4_4_1385385kcq4styp.R.inc(4197);Validate.isTrue(f == t || Integer.signum(step) == Integer.signum(t - f),
            "Will never reach '%s' from '%s' using step %s", t, f, step);
    }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

    /**
     * Create a new CharacterRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @throws NullPointerException if either bound type is {@code null}
     */
    public CharacterRange(char from, BoundType leftBoundType, char to, BoundType rightBoundType) {
        this(from, leftBoundType, to, rightBoundType, DEFAULT_STEP.evaluate(from, to));__CLR4_4_1385385kcq4styp.R.inc(4199);try{__CLR4_4_1385385kcq4styp.R.inc(4198);
    }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

    /**
     * Create a new CharacterRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @param step increment
     * @throws NullPointerException if either bound type is {@code null}
     */
    public CharacterRange(char from, BoundType leftBoundType, char to, BoundType rightBoundType, int step) {
        this(new Endpoint<Character>(from, leftBoundType), new Endpoint<Character>(to, rightBoundType), step);__CLR4_4_1385385kcq4styp.R.inc(4201);try{__CLR4_4_1385385kcq4styp.R.inc(4200);
    }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

    // range methods
    // ---------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean contains(Character obj) {try{__CLR4_4_1385385kcq4styp.R.inc(4202);
        __CLR4_4_1385385kcq4styp.R.inc(4203);if ((((obj == null)&&(__CLR4_4_1385385kcq4styp.R.iget(4204)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4205)==0&false))) {{
            __CLR4_4_1385385kcq4styp.R.inc(4206);return Boolean.FALSE;
        }
        }__CLR4_4_1385385kcq4styp.R.inc(4207);char leftValue = this.getLeftEndpoint().getValue().charValue();
        __CLR4_4_1385385kcq4styp.R.inc(4208);char rightValue = this.getRightEndpoint().getValue().charValue();
        __CLR4_4_1385385kcq4styp.R.inc(4209);boolean includeLeft = this.getLeftEndpoint().getBoundType() == BoundType.CLOSED;
        __CLR4_4_1385385kcq4styp.R.inc(4210);boolean includeRight = this.getRightEndpoint().getBoundType() == BoundType.CLOSED;
        __CLR4_4_1385385kcq4styp.R.inc(4211);int step = this.getStep().intValue();
        __CLR4_4_1385385kcq4styp.R.inc(4212);int value = (int) obj.charValue();

        __CLR4_4_1385385kcq4styp.R.inc(4213);int firstValue = 0;
        __CLR4_4_1385385kcq4styp.R.inc(4214);int lastValue = 0;

        __CLR4_4_1385385kcq4styp.R.inc(4215);if ((((step < 0.0)&&(__CLR4_4_1385385kcq4styp.R.iget(4216)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4217)==0&false))) {{
            __CLR4_4_1385385kcq4styp.R.inc(4218);firstValue = (((includeLeft )&&(__CLR4_4_1385385kcq4styp.R.iget(4219)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4220)==0&false))? leftValue : leftValue + step;
            __CLR4_4_1385385kcq4styp.R.inc(4221);lastValue = (((includeRight )&&(__CLR4_4_1385385kcq4styp.R.iget(4222)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4223)==0&false))? rightValue : rightValue + 1;
            __CLR4_4_1385385kcq4styp.R.inc(4224);if ((((value > firstValue || value < lastValue)&&(__CLR4_4_1385385kcq4styp.R.iget(4225)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4226)==0&false))) {{
                __CLR4_4_1385385kcq4styp.R.inc(4227);return Boolean.FALSE;
            }
        }} }else {{
            __CLR4_4_1385385kcq4styp.R.inc(4228);firstValue = (((includeLeft )&&(__CLR4_4_1385385kcq4styp.R.iget(4229)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4230)==0&false))? leftValue : leftValue + step;
            __CLR4_4_1385385kcq4styp.R.inc(4231);lastValue = (((includeRight )&&(__CLR4_4_1385385kcq4styp.R.iget(4232)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4233)==0&false))? rightValue : rightValue - 1;
            __CLR4_4_1385385kcq4styp.R.inc(4234);if ((((value < firstValue || value > lastValue)&&(__CLR4_4_1385385kcq4styp.R.iget(4235)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4236)==0&false))) {{
                __CLR4_4_1385385kcq4styp.R.inc(4237);return Boolean.FALSE;
            }
        }}
        }__CLR4_4_1385385kcq4styp.R.inc(4238);return ((double) (value - firstValue) / step + 1) % 1.0 == 0.0;
    }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    protected Iterator<Character> createIterator() {try{__CLR4_4_1385385kcq4styp.R.inc(4239);
        __CLR4_4_1385385kcq4styp.R.inc(4240);return new Iterator<Character>() {
            private char currentValue;

            {try{__CLR4_4_1385385kcq4styp.R.inc(4241);
                __CLR4_4_1385385kcq4styp.R.inc(4242);currentValue = leftEndpoint.getValue();

                __CLR4_4_1385385kcq4styp.R.inc(4243);if ((((leftEndpoint.getBoundType() == BoundType.OPEN)&&(__CLR4_4_1385385kcq4styp.R.iget(4244)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4245)==0&false))) {{
                    __CLR4_4_1385385kcq4styp.R.inc(4246);this.currentValue += step;
                }
            }}finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

            public void remove() {try{__CLR4_4_1385385kcq4styp.R.inc(4247);
                __CLR4_4_1385385kcq4styp.R.inc(4248);throw new UnsupportedOperationException();
            }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

            public Character next() {try{__CLR4_4_1385385kcq4styp.R.inc(4249);
                __CLR4_4_1385385kcq4styp.R.inc(4250);final int step = getStep();
                __CLR4_4_1385385kcq4styp.R.inc(4251);final char r = currentValue;
                __CLR4_4_1385385kcq4styp.R.inc(4252);currentValue += step;
                __CLR4_4_1385385kcq4styp.R.inc(4253);return Character.valueOf(r);
            }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

            public boolean hasNext() {try{__CLR4_4_1385385kcq4styp.R.inc(4254);
                __CLR4_4_1385385kcq4styp.R.inc(4255);final int cmp = Character.valueOf(currentValue).compareTo(rightEndpoint.getValue());

                __CLR4_4_1385385kcq4styp.R.inc(4256);if ((((cmp == 0)&&(__CLR4_4_1385385kcq4styp.R.iget(4257)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4258)==0&false))) {{
                    __CLR4_4_1385385kcq4styp.R.inc(4259);return rightEndpoint.getBoundType() == BoundType.CLOSED;
                }
                }__CLR4_4_1385385kcq4styp.R.inc(4260);if ((((step > 0)&&(__CLR4_4_1385385kcq4styp.R.iget(4261)!=0|true))||(__CLR4_4_1385385kcq4styp.R.iget(4262)==0&false))) {{
                    __CLR4_4_1385385kcq4styp.R.inc(4263);return cmp < 0;
                }
                }__CLR4_4_1385385kcq4styp.R.inc(4264);return cmp > 0;
            }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1385385kcq4styp.R.flushNeeded();}}

}
