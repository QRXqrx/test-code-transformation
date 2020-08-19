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

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.algorithm.RetainMatching;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests {@link RetainMatching} algorithm.
 */
public class TestRetainMatching extends BaseFunctorTest {static class __CLR4_4_15fo5fokcq4suov{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,7067,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Lifecycle
    // ------------------------------------------------------------------------

    @Before
    public void setUp() throws Exception {try{__CLR4_4_15fo5fokcq4suov.R.inc(7044);
        __CLR4_4_15fo5fokcq4suov.R.inc(7045);list = new ArrayList<Integer>();
        __CLR4_4_15fo5fokcq4suov.R.inc(7046);odds = new ArrayList<Integer>();
        __CLR4_4_15fo5fokcq4suov.R.inc(7047);for (int i = 0; (((i < 10)&&(__CLR4_4_15fo5fokcq4suov.R.iget(7048)!=0|true))||(__CLR4_4_15fo5fokcq4suov.R.iget(7049)==0&false)); i++) {{
            __CLR4_4_15fo5fokcq4suov.R.inc(7050);list.add(Integer.valueOf(i));
            __CLR4_4_15fo5fokcq4suov.R.inc(7051);if ((((i % 2 != 0)&&(__CLR4_4_15fo5fokcq4suov.R.iget(7052)!=0|true))||(__CLR4_4_15fo5fokcq4suov.R.iget(7053)==0&false))) {{
                __CLR4_4_15fo5fokcq4suov.R.inc(7054);odds.add(Integer.valueOf(i));
            }
        }}
    }}finally{__CLR4_4_15fo5fokcq4suov.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_15fo5fokcq4suov.R.inc(7055);
        __CLR4_4_15fo5fokcq4suov.R.inc(7056);list = null;
        __CLR4_4_15fo5fokcq4suov.R.inc(7057);odds = null;
    }finally{__CLR4_4_15fo5fokcq4suov.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_15fo5fokcq4suov.R.inc(7058);
        __CLR4_4_15fo5fokcq4suov.R.inc(7059);return RetainMatching.instance();
    }finally{__CLR4_4_15fo5fokcq4suov.R.flushNeeded();}}

    @Test
    public void testRemove() {__CLR4_4_15fo5fokcq4suov.R.globalSliceStart(getClass().getName(),7060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ej1cn15g4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15fo5fokcq4suov.R.rethrow($CLV_t2$);}finally{__CLR4_4_15fo5fokcq4suov.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestRetainMatching.testRemove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ej1cn15g4(){try{__CLR4_4_15fo5fokcq4suov.R.inc(7060);
        __CLR4_4_15fo5fokcq4suov.R.inc(7061);new RetainMatching<Integer>().run(list.iterator(), isOdd);
        __CLR4_4_15fo5fokcq4suov.R.inc(7062);assertEquals(odds, list);
    }finally{__CLR4_4_15fo5fokcq4suov.R.flushNeeded();}}

    // Attributes
    // ------------------------------------------------------------------------
    private List<Integer> list = null;
    private List<Integer> odds = null;
    private Predicate<Integer> isOdd = new Predicate<Integer>() {
        public boolean test(Integer obj) {try{__CLR4_4_15fo5fokcq4suov.R.inc(7063);
            __CLR4_4_15fo5fokcq4suov.R.inc(7064);return obj % 2 != 0;
        }finally{__CLR4_4_15fo5fokcq4suov.R.flushNeeded();}}
    };

    // Classes
    // ------------------------------------------------------------------------

    static class Doubler implements Function<Integer, Integer> {
        public Integer evaluate(Integer obj) {try{__CLR4_4_15fo5fokcq4suov.R.inc(7065);
            __CLR4_4_15fo5fokcq4suov.R.inc(7066);return Integer.valueOf(2 * obj);
        }finally{__CLR4_4_15fo5fokcq4suov.R.flushNeeded();}}
    }

}
