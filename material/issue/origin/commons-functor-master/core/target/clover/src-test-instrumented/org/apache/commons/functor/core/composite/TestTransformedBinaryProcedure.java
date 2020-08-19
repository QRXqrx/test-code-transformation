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
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.Procedure;
import org.junit.Test;


/**
 * Tests for TransformedBinaryProcedure.
 * @version $Revision: $ $Date: $
 */
public class TestTransformedBinaryProcedure extends BaseFunctorTest {static class __CLR4_4_1704704kcq4sv3y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,9109,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class Sum implements BinaryFunction<Integer, Integer, Integer> {
        public Integer evaluate(Integer left, Integer right) {try{__CLR4_4_1704704kcq4sv3y.R.inc(9076);
            __CLR4_4_1704704kcq4sv3y.R.inc(9077);return left+right;
        }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_1704704kcq4sv3y.R.inc(9078);
            __CLR4_4_1704704kcq4sv3y.R.inc(9079);return obj == this || obj != null && obj instanceof Sum;
        }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}
        @Override
        public int hashCode() {try{__CLR4_4_1704704kcq4sv3y.R.inc(9080);
            __CLR4_4_1704704kcq4sv3y.R.inc(9081);return "Sum".hashCode();
        }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}
    }

    private static class Total implements Procedure<Integer> {
        private int total = 0;
        public void run(Integer obj) {try{__CLR4_4_1704704kcq4sv3y.R.inc(9082);
            __CLR4_4_1704704kcq4sv3y.R.inc(9083);total += obj;
        }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}
        public Integer getTotal() {try{__CLR4_4_1704704kcq4sv3y.R.inc(9084);
            __CLR4_4_1704704kcq4sv3y.R.inc(9085);return total;
        }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_1704704kcq4sv3y.R.inc(9086);
            __CLR4_4_1704704kcq4sv3y.R.inc(9087);return obj == this || obj != null && obj instanceof Total;
        }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}
        @Override
        public int hashCode() {try{__CLR4_4_1704704kcq4sv3y.R.inc(9088);
            __CLR4_4_1704704kcq4sv3y.R.inc(9089);return "Total".hashCode();
        }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}
    }

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_1704704kcq4sv3y.R.inc(9090);
        __CLR4_4_1704704kcq4sv3y.R.inc(9091);return new TransformedBinaryProcedure<Integer, Integer>(new Sum(), new Total());
    }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}

    @Test
    public void testRun() {__CLR4_4_1704704kcq4sv3y.R.globalSliceStart(getClass().getName(),9092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzvxa870k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1704704kcq4sv3y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1704704kcq4sv3y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestTransformedBinaryProcedure.testRun",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzvxa870k(){try{__CLR4_4_1704704kcq4sv3y.R.inc(9092);
        __CLR4_4_1704704kcq4sv3y.R.inc(9093);Total t = new Total();
        __CLR4_4_1704704kcq4sv3y.R.inc(9094);TransformedBinaryProcedure<Integer, Integer> transform = new TransformedBinaryProcedure<Integer, Integer>(new Sum(), t);
        __CLR4_4_1704704kcq4sv3y.R.inc(9095);transform.run(1, 2);
        __CLR4_4_1704704kcq4sv3y.R.inc(9096);assertEquals(Integer.valueOf(3), t.getTotal());
    }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_1704704kcq4sv3y.R.globalSliceStart(getClass().getName(),9097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60870p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1704704kcq4sv3y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1704704kcq4sv3y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestTransformedBinaryProcedure.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60870p(){try{__CLR4_4_1704704kcq4sv3y.R.inc(9097);
        __CLR4_4_1704704kcq4sv3y.R.inc(9098);TransformedBinaryProcedure<Integer, Integer> t = new TransformedBinaryProcedure<Integer, Integer>(new Sum(), new Total());
        __CLR4_4_1704704kcq4sv3y.R.inc(9099);BinaryFunction<Integer, Integer, Integer> f = new BinaryFunction<Integer, Integer, Integer>() {
            public Integer evaluate(Integer left, Integer right) {try{__CLR4_4_1704704kcq4sv3y.R.inc(9100);
                __CLR4_4_1704704kcq4sv3y.R.inc(9101);return left-right;
            }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}
        };
        __CLR4_4_1704704kcq4sv3y.R.inc(9102);Procedure<Integer> p = new Procedure<Integer>() {
            public void run(Integer obj) {try{__CLR4_4_1704704kcq4sv3y.R.inc(9103);
                // Do nothing
            }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}
        };
        __CLR4_4_1704704kcq4sv3y.R.inc(9104);assertEquals(t,t);
        __CLR4_4_1704704kcq4sv3y.R.inc(9105);assertObjectsAreEqual(t,new TransformedBinaryProcedure<Integer, Integer>(new Sum(), new Total()));
        __CLR4_4_1704704kcq4sv3y.R.inc(9106);assertObjectsAreNotEqual(t,new TransformedBinaryProcedure<Integer, Integer>(f, new Total()));
        __CLR4_4_1704704kcq4sv3y.R.inc(9107);assertObjectsAreNotEqual(t,new TransformedBinaryProcedure<Integer, Integer>(new Sum(), p));
        __CLR4_4_1704704kcq4sv3y.R.inc(9108);assertTrue(!t.equals(null));
    }finally{__CLR4_4_1704704kcq4sv3y.R.flushNeeded();}}

}
