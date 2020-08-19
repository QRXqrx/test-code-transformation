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

import org.apache.commons.lang3.Validate;

/**
 * Represent an endpoint of a range. This can be the left endpoint or the right
 * endpoint. It is also called left limit or right limit, and can be open
 * (exclusive, unbounded) or closed (inclusive, bounded).
 *
 * @param <T> type of the value held by this endpoint
 * @since 1.0
 * @version $Revision$ $Date$
 */
public class Endpoint<T extends Comparable<?>> {public static class __CLR4_4_13bw3bwkcq4stzc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,4354,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The endpoint value.
     */
    private final T value;

    /**
     * The endpoint bound type.
     */
    private final BoundType boundType;

    /**
     * Create an endpoint.
     *
     * @param value value
     * @param boundType bound type
     */
    public Endpoint(T value, BoundType boundType) {try{__CLR4_4_13bw3bwkcq4stzc.R.inc(4316);
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4317);this.value = value;
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4318);this.boundType = Validate.notNull(boundType, "bound type must not be null");
    }finally{__CLR4_4_13bw3bwkcq4stzc.R.flushNeeded();}}

    /**
     * @return Object
     */
    public T getValue() {try{__CLR4_4_13bw3bwkcq4stzc.R.inc(4319);
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4320);return value;
    }finally{__CLR4_4_13bw3bwkcq4stzc.R.flushNeeded();}}

    /**
     * @return BoundType
     */
    public BoundType getBoundType() {try{__CLR4_4_13bw3bwkcq4stzc.R.inc(4321);
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4322);return boundType;
    }finally{__CLR4_4_13bw3bwkcq4stzc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_13bw3bwkcq4stzc.R.inc(4323);
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4324);String boundType = (((this.boundType == BoundType.OPEN )&&(__CLR4_4_13bw3bwkcq4stzc.R.iget(4325)!=0|true))||(__CLR4_4_13bw3bwkcq4stzc.R.iget(4326)==0&false))? "OPEN" : "CLOSED";
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4327);return "Endpoint<" + this.value + ", " + boundType + ">";
    }finally{__CLR4_4_13bw3bwkcq4stzc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_13bw3bwkcq4stzc.R.inc(4328);
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4329);if ((((obj == this)&&(__CLR4_4_13bw3bwkcq4stzc.R.iget(4330)!=0|true))||(__CLR4_4_13bw3bwkcq4stzc.R.iget(4331)==0&false))) {{
            __CLR4_4_13bw3bwkcq4stzc.R.inc(4332);return true;
        }
        }__CLR4_4_13bw3bwkcq4stzc.R.inc(4333);if ((((!(obj instanceof Endpoint))&&(__CLR4_4_13bw3bwkcq4stzc.R.iget(4334)!=0|true))||(__CLR4_4_13bw3bwkcq4stzc.R.iget(4335)==0&false))) {{
            __CLR4_4_13bw3bwkcq4stzc.R.inc(4336);return false;
        }
        }__CLR4_4_13bw3bwkcq4stzc.R.inc(4337);Endpoint<?> that = (Endpoint<?>) obj;
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4338);return this.boundType == that.boundType
                && this.value.equals(that.value);
    }finally{__CLR4_4_13bw3bwkcq4stzc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_13bw3bwkcq4stzc.R.inc(4339);
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4340);int hash = "Endpoint".hashCode();
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4341);hash <<= 2;
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4342);hash ^= this.value.toString().hashCode();
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4343);hash <<= 2;
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4344);hash ^= Boolean.valueOf(this.boundType == BoundType.OPEN).hashCode();
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4345);return hash;
    }finally{__CLR4_4_13bw3bwkcq4stzc.R.flushNeeded();}}

    /**
     * Print the left endpoint and bound type.
     *
     * @return String
     */
    public String toLeftString() {try{__CLR4_4_13bw3bwkcq4stzc.R.inc(4346);
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4347);return ((((this.boundType == BoundType.OPEN )&&(__CLR4_4_13bw3bwkcq4stzc.R.iget(4348)!=0|true))||(__CLR4_4_13bw3bwkcq4stzc.R.iget(4349)==0&false))? "(" : "[") + this.value;
    }finally{__CLR4_4_13bw3bwkcq4stzc.R.flushNeeded();}}

    /**
     * Print the right endpoint and bound type.
     *
     * @return String
     */
    public String toRightString() {try{__CLR4_4_13bw3bwkcq4stzc.R.inc(4350);
        __CLR4_4_13bw3bwkcq4stzc.R.inc(4351);return this.value + ((((this.boundType == BoundType.OPEN )&&(__CLR4_4_13bw3bwkcq4stzc.R.iget(4352)!=0|true))||(__CLR4_4_13bw3bwkcq4stzc.R.iget(4353)==0&false))? ")" : "]");
    }finally{__CLR4_4_13bw3bwkcq4stzc.R.flushNeeded();}}

}
