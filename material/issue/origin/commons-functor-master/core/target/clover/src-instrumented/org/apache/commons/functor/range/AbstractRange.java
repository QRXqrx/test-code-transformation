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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * Abstract {@link Range}.
 *
 * @param <T> type of element
 * @param <S> type of step
 */
public abstract class AbstractRange<T extends Comparable<T>, S> implements Range<T, S> {public static class __CLR4_4_135z35zkcq4sty4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,4181,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Left limit.
     */
    protected final Endpoint<T> leftEndpoint;

    /**
     * Right limit.
     */
    protected final Endpoint<T> rightEndpoint;

    /**
     * Increment step.
     */
    protected final S step;

    /**
     * Function to implement the taking of a step.
     */
    private final BinaryFunction<T, S, T> nextValue;

    /**
     * Create a new {@link AbstractRange}.
     *
     * @param leftEndpoint left endpoint
     * @param rightEndpoint right endpoint
     * @param step increment step
     * @param nextValue function to implement the taking of a step
     */
    protected AbstractRange(Endpoint<T> leftEndpoint, Endpoint<T> rightEndpoint, S step,
            BinaryFunction<T, S, T> nextValue) {
        super();__CLR4_4_135z35zkcq4sty4.R.inc(4104);try{__CLR4_4_135z35zkcq4sty4.R.inc(4103);
        __CLR4_4_135z35zkcq4sty4.R.inc(4105);this.leftEndpoint = Validate.notNull(leftEndpoint, "Left Endpoint argument must not be null");
        __CLR4_4_135z35zkcq4sty4.R.inc(4106);this.rightEndpoint = Validate.notNull(rightEndpoint, "Right Endpoint argument must not be null");
        __CLR4_4_135z35zkcq4sty4.R.inc(4107);this.step = Validate.notNull(step, "step must not be null");
        __CLR4_4_135z35zkcq4sty4.R.inc(4108);this.nextValue = Validate.notNull(nextValue, "next value function");
    }finally{__CLR4_4_135z35zkcq4sty4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public Endpoint<T> getLeftEndpoint() {try{__CLR4_4_135z35zkcq4sty4.R.inc(4109);
        __CLR4_4_135z35zkcq4sty4.R.inc(4110);return leftEndpoint;
    }finally{__CLR4_4_135z35zkcq4sty4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public Endpoint<T> getRightEndpoint() {try{__CLR4_4_135z35zkcq4sty4.R.inc(4111);
        __CLR4_4_135z35zkcq4sty4.R.inc(4112);return rightEndpoint;
    }finally{__CLR4_4_135z35zkcq4sty4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public S getStep() {try{__CLR4_4_135z35zkcq4sty4.R.inc(4113);
        __CLR4_4_135z35zkcq4sty4.R.inc(4114);return step;
    }finally{__CLR4_4_135z35zkcq4sty4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public boolean containsAll(Collection<T> coll) {try{__CLR4_4_135z35zkcq4sty4.R.inc(4115);
        __CLR4_4_135z35zkcq4sty4.R.inc(4116);if ((((coll == null || coll.isEmpty())&&(__CLR4_4_135z35zkcq4sty4.R.iget(4117)!=0|true))||(__CLR4_4_135z35zkcq4sty4.R.iget(4118)==0&false))) {{
            __CLR4_4_135z35zkcq4sty4.R.inc(4119);return false;
        }
        }__CLR4_4_135z35zkcq4sty4.R.inc(4120);for (T t : coll) {{
            __CLR4_4_135z35zkcq4sty4.R.inc(4121);if ((((!contains(t))&&(__CLR4_4_135z35zkcq4sty4.R.iget(4122)!=0|true))||(__CLR4_4_135z35zkcq4sty4.R.iget(4123)==0&false))) {{
                __CLR4_4_135z35zkcq4sty4.R.inc(4124);return false;
            }
        }}
        }__CLR4_4_135z35zkcq4sty4.R.inc(4125);return true;
    }finally{__CLR4_4_135z35zkcq4sty4.R.flushNeeded();}}

    // iterable
    // ---------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public final Iterator<T> iterator() {try{__CLR4_4_135z35zkcq4sty4.R.inc(4126);
        // empty range -> empty iterator:
        __CLR4_4_135z35zkcq4sty4.R.inc(4127);if ((((isEmpty())&&(__CLR4_4_135z35zkcq4sty4.R.iget(4128)!=0|true))||(__CLR4_4_135z35zkcq4sty4.R.iget(4129)==0&false))) {{
            __CLR4_4_135z35zkcq4sty4.R.inc(4130);return Collections.<T> emptySet().iterator();
        }
        // not empty and same values -> single-value range:
        }__CLR4_4_135z35zkcq4sty4.R.inc(4131);if ((((ObjectUtils.equals(leftEndpoint.getValue(), rightEndpoint.getValue()))&&(__CLR4_4_135z35zkcq4sty4.R.iget(4132)!=0|true))||(__CLR4_4_135z35zkcq4sty4.R.iget(4133)==0&false))) {{
            __CLR4_4_135z35zkcq4sty4.R.inc(4134);return Collections.singleton(leftEndpoint.getValue()).iterator();
        }
        }__CLR4_4_135z35zkcq4sty4.R.inc(4135);return createIterator();
    }finally{__CLR4_4_135z35zkcq4sty4.R.flushNeeded();}}

    /**
     * Create a non-empty iterator.
     *
     * @return Iterator
     */
    protected abstract Iterator<T> createIterator();

    // object methods
    // ---------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_135z35zkcq4sty4.R.inc(4136);
        __CLR4_4_135z35zkcq4sty4.R.inc(4137);final String pattern = "%s<%s, %s, %s>";
        __CLR4_4_135z35zkcq4sty4.R.inc(4138);return String.format(pattern, getClass().getSimpleName(), leftEndpoint.toLeftString(),
            rightEndpoint.toRightString(), step);
    }finally{__CLR4_4_135z35zkcq4sty4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_135z35zkcq4sty4.R.inc(4139);
        __CLR4_4_135z35zkcq4sty4.R.inc(4140);if ((((obj == this)&&(__CLR4_4_135z35zkcq4sty4.R.iget(4141)!=0|true))||(__CLR4_4_135z35zkcq4sty4.R.iget(4142)==0&false))) {{
            __CLR4_4_135z35zkcq4sty4.R.inc(4143);return true;
        }
        }__CLR4_4_135z35zkcq4sty4.R.inc(4144);if ((((!(obj instanceof AbstractRange<?, ?>))&&(__CLR4_4_135z35zkcq4sty4.R.iget(4145)!=0|true))||(__CLR4_4_135z35zkcq4sty4.R.iget(4146)==0&false))) {{
            __CLR4_4_135z35zkcq4sty4.R.inc(4147);return false;
        }
        }__CLR4_4_135z35zkcq4sty4.R.inc(4148);final Range<?, ?> that = (Range<?, ?>) obj;
        __CLR4_4_135z35zkcq4sty4.R.inc(4149);return new EqualsBuilder().append(getLeftEndpoint(), that.getLeftEndpoint())
            .append(getRightEndpoint(), that.getRightEndpoint()).append(getStep(), that.getStep()).build();
    }finally{__CLR4_4_135z35zkcq4sty4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_135z35zkcq4sty4.R.inc(4150);
        __CLR4_4_135z35zkcq4sty4.R.inc(4151);int hash = getClass().getName().hashCode();
        __CLR4_4_135z35zkcq4sty4.R.inc(4152);hash <<= 2;
        __CLR4_4_135z35zkcq4sty4.R.inc(4153);hash ^= this.leftEndpoint.hashCode();
        __CLR4_4_135z35zkcq4sty4.R.inc(4154);hash <<= 2;
        __CLR4_4_135z35zkcq4sty4.R.inc(4155);hash ^= this.rightEndpoint.hashCode();
        __CLR4_4_135z35zkcq4sty4.R.inc(4156);hash <<= 2;
        __CLR4_4_135z35zkcq4sty4.R.inc(4157);hash ^= this.step.hashCode();
        __CLR4_4_135z35zkcq4sty4.R.inc(4158);return hash;
    }finally{__CLR4_4_135z35zkcq4sty4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public final boolean isEmpty() {try{__CLR4_4_135z35zkcq4sty4.R.inc(4159);
        __CLR4_4_135z35zkcq4sty4.R.inc(4160);final T leftValue = leftEndpoint.getValue();
        __CLR4_4_135z35zkcq4sty4.R.inc(4161);final T rightValue = rightEndpoint.getValue();

        __CLR4_4_135z35zkcq4sty4.R.inc(4162);final int cmp = ObjectUtils.compare(leftValue, rightValue);
        __CLR4_4_135z35zkcq4sty4.R.inc(4163);final boolean closedLeft = leftEndpoint.getBoundType() == BoundType.CLOSED;
        __CLR4_4_135z35zkcq4sty4.R.inc(4164);final boolean closedRight = rightEndpoint.getBoundType() == BoundType.CLOSED;

        __CLR4_4_135z35zkcq4sty4.R.inc(4165);if ((((cmp == 0 && !(closedLeft && closedRight))&&(__CLR4_4_135z35zkcq4sty4.R.iget(4166)!=0|true))||(__CLR4_4_135z35zkcq4sty4.R.iget(4167)==0&false))) {{
            __CLR4_4_135z35zkcq4sty4.R.inc(4168);return true;
        }

        }__CLR4_4_135z35zkcq4sty4.R.inc(4169);final T firstValue = (((closedLeft )&&(__CLR4_4_135z35zkcq4sty4.R.iget(4170)!=0|true))||(__CLR4_4_135z35zkcq4sty4.R.iget(4171)==0&false))? leftValue : nextValue.evaluate(leftValue, step);

        __CLR4_4_135z35zkcq4sty4.R.inc(4172);final int cmpFirst = ObjectUtils.compare(firstValue, rightValue);

        __CLR4_4_135z35zkcq4sty4.R.inc(4173);if ((((cmpFirst == 0)&&(__CLR4_4_135z35zkcq4sty4.R.iget(4174)!=0|true))||(__CLR4_4_135z35zkcq4sty4.R.iget(4175)==0&false))) {{
            __CLR4_4_135z35zkcq4sty4.R.inc(4176);return !closedRight;
        }

        }__CLR4_4_135z35zkcq4sty4.R.inc(4177);final boolean ascending = cmp < 0;
        __CLR4_4_135z35zkcq4sty4.R.inc(4178);return (((ascending )&&(__CLR4_4_135z35zkcq4sty4.R.iget(4179)!=0|true))||(__CLR4_4_135z35zkcq4sty4.R.iget(4180)==0&false))? cmpFirst > 0 : cmpFirst < 0;
    }finally{__CLR4_4_135z35zkcq4sty4.R.flushNeeded();}}

}
