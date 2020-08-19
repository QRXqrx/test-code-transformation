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

/**
 * Range factory.
 *
 * @since 1.0
 * @version $Revision$ $Date$
 */
public final class Ranges {public static class __CLR4_4_13ic3ickcq4su12{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,4615,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Hidden constructor as this only is a helper class with static methods.
     */
    private Ranges() {try{__CLR4_4_13ic3ickcq4su12.R.inc(4548);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    // Integer ranges
    /**
     * Create a new IntegerRange.
     *
     * @param from start
     * @param to end
     * @return IntegerRange
     */
    public static IntegerRange integerRange(Number from, Number to) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4549);
        __CLR4_4_13ic3ickcq4su12.R.inc(4550);return new IntegerRange(from, to);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @return IntegerRange
     */
    public static IntegerRange integerRange(Number from, Number to, Number step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4551);
        __CLR4_4_13ic3ickcq4su12.R.inc(4552);return new IntegerRange(from, to, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from start
     * @param to end
     * @return IntegerRange
     */
    public static IntegerRange integerRange(int from, int to) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4553);
        __CLR4_4_13ic3ickcq4su12.R.inc(4554);return new IntegerRange(from, to);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @return IntegerRange
     */
    public static IntegerRange integerRange(int from, int to, int step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4555);
        __CLR4_4_13ic3ickcq4su12.R.inc(4556);return new IntegerRange(from, to, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @return IntegerRange
     */
    public static IntegerRange integerRange(int from, BoundType leftBoundType,
                                            int to, BoundType rightBoundType) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4557);
        __CLR4_4_13ic3ickcq4su12.R.inc(4558);return new IntegerRange(from, leftBoundType, to, rightBoundType);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @param step increment
     * @return IntegerRange
     */
    public static IntegerRange integerRange(int from, BoundType leftBoundType,
                                            int to, BoundType rightBoundType,
                                            int step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4559);
        __CLR4_4_13ic3ickcq4su12.R.inc(4560);return new IntegerRange(from, leftBoundType, to, rightBoundType, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param leftEndpoint start
     * @param rightEndpoint end
     * @param step increment
     * @return IntegerRange
     */
    public static IntegerRange integerRange(Endpoint<Integer> leftEndpoint,
                                                Endpoint<Integer> rightEndpoint,
                                                int step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4561);
        __CLR4_4_13ic3ickcq4su12.R.inc(4562);return new IntegerRange(leftEndpoint, rightEndpoint, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param to end
     * @return LongRange
     */
    public static LongRange longRange(Number from, Number to) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4563);
        __CLR4_4_13ic3ickcq4su12.R.inc(4564);return new LongRange(from, to);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new IntegerRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @return LongRange
     */
    public static LongRange longRange(Number from, Number to, Number step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4565);
        __CLR4_4_13ic3ickcq4su12.R.inc(4566);return new LongRange(from, to, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    // Long ranges
    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param to end
     * @return LongRange
     */
    public static LongRange longRange(long from, long to) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4567);
        __CLR4_4_13ic3ickcq4su12.R.inc(4568);return new LongRange(from, to);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @return LongRange
     */
    public static LongRange longRange(long from, long to, long step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4569);
        __CLR4_4_13ic3ickcq4su12.R.inc(4570);return new LongRange(from, to, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @return LongRange
     */
    public static LongRange longRange(long from, BoundType leftBoundType,
                                      long to, BoundType rightBoundType) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4571);
        __CLR4_4_13ic3ickcq4su12.R.inc(4572);return new LongRange(from, leftBoundType, to, rightBoundType);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @param step increment
     * @return LongRange
     */
    public static LongRange longRange(long from, BoundType leftBoundType,
                                      long to, BoundType rightBoundType,
                                      long step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4573);
        __CLR4_4_13ic3ickcq4su12.R.inc(4574);return new LongRange(from, leftBoundType, to, rightBoundType, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new LongRange.
     *
     * @param leftEndpoint start
     * @param rightEndpoint end
     * @param step increment
     * @return LongRange
     */
    public static LongRange longRange(Endpoint<Long> leftEndpoint,
                                                Endpoint<Long> rightEndpoint,
                                                long step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4575);
        __CLR4_4_13ic3ickcq4su12.R.inc(4576);return new LongRange(leftEndpoint, rightEndpoint, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    // Float ranges
    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param to end
     * @return FloatRange
     */
    public static FloatRange floatRange(Number from, Number to) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4577);
        __CLR4_4_13ic3ickcq4su12.R.inc(4578);return new FloatRange(from, to);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @return FloatRange
     */
    public static FloatRange floatRange(Number from, Number to, Number step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4579);
        __CLR4_4_13ic3ickcq4su12.R.inc(4580);return new FloatRange(from, to, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param to end
     * @return FloatRange
     */
    public static FloatRange floatRange(float from, float to) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4581);
        __CLR4_4_13ic3ickcq4su12.R.inc(4582);return new FloatRange(from, to);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @return FloatRange
     */
    public static FloatRange floatRange(float from, float to, float step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4583);
        __CLR4_4_13ic3ickcq4su12.R.inc(4584);return new FloatRange(from, to, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @return FloatRange
     */
    public static FloatRange floatRange(float from, BoundType leftBoundType,
                                        float to, BoundType rightBoundType) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4585);
        __CLR4_4_13ic3ickcq4su12.R.inc(4586);return new FloatRange(from, leftBoundType, to, rightBoundType);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new FloatRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @param step increment
     * @return FloatRange
     */
    public static FloatRange floatRange(float from, BoundType leftBoundType,
                                        float to, BoundType rightBoundType,
                                        float step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4587);
        __CLR4_4_13ic3ickcq4su12.R.inc(4588);return new FloatRange(from, leftBoundType, to, rightBoundType, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new FloatRange.
     *
     * @param leftEndpoint start
     * @param rightEndpoint end
     * @param step increment
     * @return FloatRange
     */
    public static FloatRange floatRange(Endpoint<Float> leftEndpoint,
                                                Endpoint<Float> rightEndpoint,
                                                float step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4589);
        __CLR4_4_13ic3ickcq4su12.R.inc(4590);return new FloatRange(leftEndpoint, rightEndpoint, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    // Double ranges
    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param to end
     * @return DoubleRange
     */
    public static DoubleRange doubleRange(Number from, Number to) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4591);
        __CLR4_4_13ic3ickcq4su12.R.inc(4592);return new DoubleRange(from, to);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @return DoubleRange
     */
    public static DoubleRange doubleRange(Number from, Number to, Number step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4593);
        __CLR4_4_13ic3ickcq4su12.R.inc(4594);return new DoubleRange(from, to, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param to end
     * @return DoubleRange
     */
    public static DoubleRange doubleRange(double from, double to) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4595);
        __CLR4_4_13ic3ickcq4su12.R.inc(4596);return new DoubleRange(from, to);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @return DoubleRange
     */
    public static DoubleRange doubleRange(double from, double to, double step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4597);
        __CLR4_4_13ic3ickcq4su12.R.inc(4598);return new DoubleRange(from, to, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @param step increment
     * @return DoubleRange
     */
    public static DoubleRange doubleRange(double from, BoundType leftBoundType,
                                          double to, BoundType rightBoundType,
                                          double step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4599);
        __CLR4_4_13ic3ickcq4su12.R.inc(4600);return new DoubleRange(from, leftBoundType, to, rightBoundType, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new DoubleRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @return DoubleRange
     */
    public static DoubleRange doubleRange(double from, BoundType leftBoundType,
                                          double to, BoundType rightBoundType) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4601);
        __CLR4_4_13ic3ickcq4su12.R.inc(4602);return new DoubleRange(from, leftBoundType, to, rightBoundType);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new DoubleRange.
     *
     * @param leftEndpoint start
     * @param rightEndpoint end
     * @param step increment
     * @return DoubleRange
     */
    public static DoubleRange doubleRange(Endpoint<Double> leftEndpoint,
                                                Endpoint<Double> rightEndpoint,
                                                double step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4603);
        __CLR4_4_13ic3ickcq4su12.R.inc(4604);return new DoubleRange(leftEndpoint, rightEndpoint, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    // Character ranges
    /**
     * Create a new CharacterRange.
     *
     * @param from start
     * @param to end
     * @return CharacterRange
     */
    public static CharacterRange characterRange(char from, char to) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4605);
        __CLR4_4_13ic3ickcq4su12.R.inc(4606);return new CharacterRange(from, to);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new CharacterRange.
     *
     * @param from start
     * @param to end
     * @param step increment
     * @return CharacterRange
     */
    public static CharacterRange characterRange(char from, char to, int step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4607);
        __CLR4_4_13ic3ickcq4su12.R.inc(4608);return new CharacterRange(from, to, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new CharacterRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @return CharacterRange
     */
    public static CharacterRange characterRange(char from,
                                                BoundType leftBoundType,
                                                char to,
                                                BoundType rightBoundType) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4609);
        __CLR4_4_13ic3ickcq4su12.R.inc(4610);return new CharacterRange(from, leftBoundType, to, rightBoundType);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new CharacterRange.
     *
     * @param from start
     * @param leftBoundType type of left bound
     * @param to end
     * @param rightBoundType type of right bound
     * @param step increment
     * @return CharacterRange
     */
    public static CharacterRange characterRange(char from,
                                                BoundType leftBoundType,
                                                char to,
                                                BoundType rightBoundType,
                                                int step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4611);
        __CLR4_4_13ic3ickcq4su12.R.inc(4612);return new CharacterRange(from, leftBoundType, to, rightBoundType, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}

    /**
     * Create a new CharacterRange.
     *
     * @param leftEndpoint start
     * @param rightEndpoint end
     * @param step increment
     * @return CharacterRange
     */
    public static CharacterRange characterRange(Endpoint<Character> leftEndpoint,
                                                Endpoint<Character> rightEndpoint,
                                                int step) {try{__CLR4_4_13ic3ickcq4su12.R.inc(4613);
        __CLR4_4_13ic3ickcq4su12.R.inc(4614);return new CharacterRange(leftEndpoint, rightEndpoint, step);
    }finally{__CLR4_4_13ic3ickcq4su12.R.flushNeeded();}}
}
