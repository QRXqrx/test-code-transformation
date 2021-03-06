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
import org.apache.commons.functor.Function;
import org.junit.Test;


/**
 * Tests for TransformedBinaryFunction.
 * @version $Revision: $ $Date: $
 */
public class TestTransformedBinaryFunction extends BaseFunctorTest {static class __CLR4_4_16za6zakcq4sv3s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,9076,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class Sum implements BinaryFunction<Integer, Integer, Integer> {
        public Integer evaluate(Integer left, Integer right) {try{__CLR4_4_16za6zakcq4sv3s.R.inc(9046);
            __CLR4_4_16za6zakcq4sv3s.R.inc(9047);return left+right;
        }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_16za6zakcq4sv3s.R.inc(9048);
            __CLR4_4_16za6zakcq4sv3s.R.inc(9049);return obj == this || obj != null && obj instanceof Sum;
        }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}
        @Override
        public int hashCode() {try{__CLR4_4_16za6zakcq4sv3s.R.inc(9050);
            __CLR4_4_16za6zakcq4sv3s.R.inc(9051);return "Sum".hashCode();
        }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}
    }

    private static class AddOne implements Function<Integer, Integer> {
        public Integer evaluate(Integer obj) {try{__CLR4_4_16za6zakcq4sv3s.R.inc(9052);
            __CLR4_4_16za6zakcq4sv3s.R.inc(9053);return obj + 1;
        }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_16za6zakcq4sv3s.R.inc(9054);
            __CLR4_4_16za6zakcq4sv3s.R.inc(9055);return obj == this || obj != null && obj instanceof AddOne;
        }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}
        @Override
        public int hashCode() {try{__CLR4_4_16za6zakcq4sv3s.R.inc(9056);
            __CLR4_4_16za6zakcq4sv3s.R.inc(9057);return "AddOne".hashCode();
        }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}
    }

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_16za6zakcq4sv3s.R.inc(9058);
        __CLR4_4_16za6zakcq4sv3s.R.inc(9059);return new TransformedBinaryFunction<Integer, Integer, Integer>(new Sum(), new AddOne());
    }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}

    @Test
    public void testRun() {__CLR4_4_16za6zakcq4sv3s.R.globalSliceStart(getClass().getName(),9060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzvxa86zo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16za6zakcq4sv3s.R.rethrow($CLV_t2$);}finally{__CLR4_4_16za6zakcq4sv3s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestTransformedBinaryFunction.testRun",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzvxa86zo(){try{__CLR4_4_16za6zakcq4sv3s.R.inc(9060);
        __CLR4_4_16za6zakcq4sv3s.R.inc(9061);TransformedBinaryFunction<Integer, Integer, Integer> transform = new TransformedBinaryFunction<Integer, Integer, Integer>(new Sum(), new AddOne());
        __CLR4_4_16za6zakcq4sv3s.R.inc(9062);assertEquals(Integer.valueOf(4), transform.evaluate(1, 2));
    }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_16za6zakcq4sv3s.R.globalSliceStart(getClass().getName(),9063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6086zr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16za6zakcq4sv3s.R.rethrow($CLV_t2$);}finally{__CLR4_4_16za6zakcq4sv3s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestTransformedBinaryFunction.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),9063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6086zr(){try{__CLR4_4_16za6zakcq4sv3s.R.inc(9063);
        __CLR4_4_16za6zakcq4sv3s.R.inc(9064);TransformedBinaryFunction<Integer, Integer, Integer> t = new TransformedBinaryFunction<Integer, Integer, Integer>(new Sum(), new AddOne());
        __CLR4_4_16za6zakcq4sv3s.R.inc(9065);BinaryFunction<Integer, Integer, Integer> f = new BinaryFunction<Integer, Integer, Integer>() {
            public Integer evaluate(Integer left, Integer right) {try{__CLR4_4_16za6zakcq4sv3s.R.inc(9066);
                __CLR4_4_16za6zakcq4sv3s.R.inc(9067);return left-right;
            }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}
        };
        __CLR4_4_16za6zakcq4sv3s.R.inc(9068);Function<Integer, Integer> p = new Function<Integer, Integer>() {
            public Integer evaluate(Integer obj) {try{__CLR4_4_16za6zakcq4sv3s.R.inc(9069);
                __CLR4_4_16za6zakcq4sv3s.R.inc(9070);return obj-1;
            }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}
        };
        __CLR4_4_16za6zakcq4sv3s.R.inc(9071);assertEquals(t,t);
        __CLR4_4_16za6zakcq4sv3s.R.inc(9072);assertObjectsAreEqual(t,new TransformedBinaryFunction<Integer, Integer, Integer>(new Sum(), new AddOne()));
        __CLR4_4_16za6zakcq4sv3s.R.inc(9073);assertObjectsAreNotEqual(t,new TransformedBinaryFunction<Integer, Integer, Integer>(f, new AddOne()));
        __CLR4_4_16za6zakcq4sv3s.R.inc(9074);assertObjectsAreNotEqual(t,new TransformedBinaryFunction<Integer, Integer, Integer>(new Sum(), p));
        __CLR4_4_16za6zakcq4sv3s.R.inc(9075);assertTrue(!t.equals(null));
    }finally{__CLR4_4_16za6zakcq4sv3s.R.flushNeeded();}}

}
