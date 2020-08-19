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
import org.apache.commons.functor.core.algorithm.RemoveMatching;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests {@link RemoveMatching} algorithm.
 */
public class TestRemoveMatching extends BaseFunctorTest {static class __CLR4_4_15f15f1kcq4suop{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,7044,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Lifecycle
    // ------------------------------------------------------------------------

    @Before
    public void setUp() throws Exception {try{__CLR4_4_15f15f1kcq4suop.R.inc(7021);
        __CLR4_4_15f15f1kcq4suop.R.inc(7022);list = new ArrayList<Integer>();
        __CLR4_4_15f15f1kcq4suop.R.inc(7023);evens = new ArrayList<Integer>();
        __CLR4_4_15f15f1kcq4suop.R.inc(7024);for (int i = 0; (((i < 10)&&(__CLR4_4_15f15f1kcq4suop.R.iget(7025)!=0|true))||(__CLR4_4_15f15f1kcq4suop.R.iget(7026)==0&false)); i++) {{
            __CLR4_4_15f15f1kcq4suop.R.inc(7027);list.add(Integer.valueOf(i));
            __CLR4_4_15f15f1kcq4suop.R.inc(7028);if ((((i % 2 == 0)&&(__CLR4_4_15f15f1kcq4suop.R.iget(7029)!=0|true))||(__CLR4_4_15f15f1kcq4suop.R.iget(7030)==0&false))) {{
                __CLR4_4_15f15f1kcq4suop.R.inc(7031);evens.add(Integer.valueOf(i));
            }
        }}
    }}finally{__CLR4_4_15f15f1kcq4suop.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_15f15f1kcq4suop.R.inc(7032);
        __CLR4_4_15f15f1kcq4suop.R.inc(7033);list = null;
        __CLR4_4_15f15f1kcq4suop.R.inc(7034);evens = null;
    }finally{__CLR4_4_15f15f1kcq4suop.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_15f15f1kcq4suop.R.inc(7035);
        __CLR4_4_15f15f1kcq4suop.R.inc(7036);return RemoveMatching.instance();
    }finally{__CLR4_4_15f15f1kcq4suop.R.flushNeeded();}}

    @Test
    public void testRemove() {__CLR4_4_15f15f1kcq4suop.R.globalSliceStart(getClass().getName(),7037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ej1cn15fh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15f15f1kcq4suop.R.rethrow($CLV_t2$);}finally{__CLR4_4_15f15f1kcq4suop.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestRemoveMatching.testRemove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ej1cn15fh(){try{__CLR4_4_15f15f1kcq4suop.R.inc(7037);
        __CLR4_4_15f15f1kcq4suop.R.inc(7038);new RemoveMatching<Integer>().run(list.iterator(), isOdd);
        __CLR4_4_15f15f1kcq4suop.R.inc(7039);assertEquals(evens, list);
    }finally{__CLR4_4_15f15f1kcq4suop.R.flushNeeded();}}

    // Attributes
    // ------------------------------------------------------------------------
    private List<Integer> list = null;
    private List<Integer> evens = null;
    private Predicate<Integer> isOdd = new Predicate<Integer>() {
        public boolean test(Integer obj) {try{__CLR4_4_15f15f1kcq4suop.R.inc(7040);
            __CLR4_4_15f15f1kcq4suop.R.inc(7041);return obj % 2 != 0;
        }finally{__CLR4_4_15f15f1kcq4suop.R.flushNeeded();}}
    };

    // Classes
    // ------------------------------------------------------------------------

    static class Doubler implements Function<Integer, Integer> {
        public Integer evaluate(Integer obj) {try{__CLR4_4_15f15f1kcq4suop.R.inc(7042);
            __CLR4_4_15f15f1kcq4suop.R.inc(7043);return Integer.valueOf(2 * obj);
        }finally{__CLR4_4_15f15f1kcq4suop.R.flushNeeded();}}
    }

}
