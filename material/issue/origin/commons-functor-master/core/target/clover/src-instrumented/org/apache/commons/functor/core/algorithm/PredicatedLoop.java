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

import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.NullaryProcedure;

/**
 * Base class for predicated procedure algorithms.
 *
 * @version $Revision$ $Date$
 */
abstract class PredicatedLoop implements NullaryProcedure {public static class __CLR4_4_11hb1hbkcq4stgr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,1946,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The procedure body to execute.
     */
    private final NullaryProcedure body;
    /**
     * The test wether to keep going.
     */
    private final NullaryPredicate test;

    /**
     * Create a new PredicatedLoop.
     * @param body to execute
     * @param test whether to keep going
     */
    protected PredicatedLoop(NullaryProcedure body, NullaryPredicate test) {try{__CLR4_4_11hb1hbkcq4stgr.R.inc(1919);
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1920);this.body = body;
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1921);this.test = test;
    }finally{__CLR4_4_11hb1hbkcq4stgr.R.flushNeeded();}}

    /**
     * Get the body of this loop.
     * @return NullaryProcedure
     */
    protected NullaryProcedure getBody() {try{__CLR4_4_11hb1hbkcq4stgr.R.inc(1922);
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1923);return body;
    }finally{__CLR4_4_11hb1hbkcq4stgr.R.flushNeeded();}}

    /**
     * Get the test for this loop.
     * @return NullaryPredicate
     */
    protected NullaryPredicate getTest() {try{__CLR4_4_11hb1hbkcq4stgr.R.inc(1924);
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1925);return test;
    }finally{__CLR4_4_11hb1hbkcq4stgr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_11hb1hbkcq4stgr.R.inc(1926);
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1927);if ((((obj == this)&&(__CLR4_4_11hb1hbkcq4stgr.R.iget(1928)!=0|true))||(__CLR4_4_11hb1hbkcq4stgr.R.iget(1929)==0&false))) {{
            __CLR4_4_11hb1hbkcq4stgr.R.inc(1930);return true;
        }
        }__CLR4_4_11hb1hbkcq4stgr.R.inc(1931);if ((((obj == null || !obj.getClass().equals(getClass()))&&(__CLR4_4_11hb1hbkcq4stgr.R.iget(1932)!=0|true))||(__CLR4_4_11hb1hbkcq4stgr.R.iget(1933)==0&false))) {{
            __CLR4_4_11hb1hbkcq4stgr.R.inc(1934);return false;
        }
        }__CLR4_4_11hb1hbkcq4stgr.R.inc(1935);PredicatedLoop other = (PredicatedLoop) obj;
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1936);return other.body.equals(body) && other.test.equals(test);
    }finally{__CLR4_4_11hb1hbkcq4stgr.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_11hb1hbkcq4stgr.R.inc(1937);
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1938);String classname = getClass().getName();
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1939);int dot = classname.lastIndexOf('.');
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1940);int result = classname.substring(dot + 1).hashCode();
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1941);result <<= 2;
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1942);result ^= body.hashCode();
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1943);result <<= 2;
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1944);result ^= test.hashCode();
        __CLR4_4_11hb1hbkcq4stgr.R.inc(1945);return result;
    }finally{__CLR4_4_11hb1hbkcq4stgr.R.flushNeeded();}}
}
