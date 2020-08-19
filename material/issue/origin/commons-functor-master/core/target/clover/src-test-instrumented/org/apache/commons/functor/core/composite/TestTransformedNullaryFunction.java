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
package org.apache.commons.functor.core.composite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.Function;
import org.junit.Test;

/**
 * Tests for TransformedNullaryFunction.
 * 
 * @version $Revision: $ $Date: $
 */
public class TestTransformedNullaryFunction extends BaseFunctorTest {static class __CLR4_4_1711711kcq4sv45{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,9139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class One implements NullaryFunction<Integer> {
        public Integer evaluate() {try{__CLR4_4_1711711kcq4sv45.R.inc(9109);
            __CLR4_4_1711711kcq4sv45.R.inc(9110);return Integer.valueOf(1);
        }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_4_1711711kcq4sv45.R.inc(9111);
            __CLR4_4_1711711kcq4sv45.R.inc(9112);return obj == this || obj != null && obj instanceof One;
        }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1711711kcq4sv45.R.inc(9113);
            __CLR4_4_1711711kcq4sv45.R.inc(9114);return "One".hashCode();
        }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}
    };

    private static class AddOne implements Function<Integer, Integer> {
        public Integer evaluate(Integer obj) {try{__CLR4_4_1711711kcq4sv45.R.inc(9115);
            __CLR4_4_1711711kcq4sv45.R.inc(9116);return obj + 1;
        }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_4_1711711kcq4sv45.R.inc(9117);
            __CLR4_4_1711711kcq4sv45.R.inc(9118);return obj == this || obj != null && obj instanceof AddOne;
        }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_1711711kcq4sv45.R.inc(9119);
            __CLR4_4_1711711kcq4sv45.R.inc(9120);return "AddOne".hashCode();
        }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}
    };

    private One one = new One();
    private AddOne addOne = new AddOne();

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_1711711kcq4sv45.R.inc(9121);
        __CLR4_4_1711711kcq4sv45.R.inc(9122);return new TransformedNullaryFunction<Integer>(one, addOne);
    }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}

    @Test
    public void testRun() {__CLR4_4_1711711kcq4sv45.R.globalSliceStart(getClass().getName(),9123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzvxa871f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1711711kcq4sv45.R.rethrow($CLV_t2$);}finally{__CLR4_4_1711711kcq4sv45.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestTransformedNullaryFunction.testRun",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzvxa871f(){try{__CLR4_4_1711711kcq4sv45.R.inc(9123);
        __CLR4_4_1711711kcq4sv45.R.inc(9124);TransformedNullaryFunction<Integer> p = new TransformedNullaryFunction<Integer>(one, addOne);
        __CLR4_4_1711711kcq4sv45.R.inc(9125);assertEquals(Integer.valueOf(2), p.evaluate());
    }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_1711711kcq4sv45.R.globalSliceStart(getClass().getName(),9126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60871i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1711711kcq4sv45.R.rethrow($CLV_t2$);}finally{__CLR4_4_1711711kcq4sv45.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestTransformedNullaryFunction.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60871i(){try{__CLR4_4_1711711kcq4sv45.R.inc(9126);
        __CLR4_4_1711711kcq4sv45.R.inc(9127);TransformedNullaryFunction<Integer> t = new TransformedNullaryFunction<Integer>(one, addOne);
        __CLR4_4_1711711kcq4sv45.R.inc(9128);NullaryFunction<Integer> f = new NullaryFunction<Integer>() {
            public Integer evaluate() {try{__CLR4_4_1711711kcq4sv45.R.inc(9129);
                __CLR4_4_1711711kcq4sv45.R.inc(9130);return Integer.valueOf(2);
            }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}
        };
        __CLR4_4_1711711kcq4sv45.R.inc(9131);Function<Integer, Integer> p = new Function<Integer, Integer>() {
            public Integer evaluate(Integer obj) {try{__CLR4_4_1711711kcq4sv45.R.inc(9132);
                __CLR4_4_1711711kcq4sv45.R.inc(9133);return obj + 2;
            }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}
        };
        __CLR4_4_1711711kcq4sv45.R.inc(9134);assertEquals(t, t);
        __CLR4_4_1711711kcq4sv45.R.inc(9135);assertObjectsAreEqual(t, new TransformedNullaryFunction<Integer>(one, addOne));
        __CLR4_4_1711711kcq4sv45.R.inc(9136);assertObjectsAreNotEqual(t, new TransformedNullaryFunction<Integer>(f, addOne));
        __CLR4_4_1711711kcq4sv45.R.inc(9137);assertObjectsAreNotEqual(t, new TransformedNullaryFunction<Integer>(one, p));
        __CLR4_4_1711711kcq4sv45.R.inc(9138);assertTrue(!t.equals(null));
    }finally{__CLR4_4_1711711kcq4sv45.R.flushNeeded();}}

}
