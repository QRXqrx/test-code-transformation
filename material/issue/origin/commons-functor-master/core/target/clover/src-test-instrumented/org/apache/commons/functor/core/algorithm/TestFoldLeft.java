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
import java.util.Arrays;
import java.util.List;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;
import org.junit.Test;

/**
 * Tests {@link FoldLeft} algorithm.
 */
public class TestFoldLeft extends BaseFunctorTest {static class __CLR4_4_15bg5bgkcq4sun6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,6911,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_15bg5bgkcq4sun6.R.inc(6892);
        __CLR4_4_15bg5bgkcq4sun6.R.inc(6893);return new FoldLeft<Integer>(new Sum());
    }finally{__CLR4_4_15bg5bgkcq4sun6.R.flushNeeded();}}
    
    @Test
    public void testFoldLeft() {__CLR4_4_15bg5bgkcq4sun6.R.globalSliceStart(getClass().getName(),6894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fz1e3j5bi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15bg5bgkcq4sun6.R.rethrow($CLV_t2$);}finally{__CLR4_4_15bg5bgkcq4sun6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestFoldLeft.testFoldLeft",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fz1e3j5bi(){try{__CLR4_4_15bg5bgkcq4sun6.R.inc(6894);
        __CLR4_4_15bg5bgkcq4sun6.R.inc(6895);FoldLeft<Integer> foldLeft = new FoldLeft<Integer>(new BinaryFunction<Integer, Integer, Integer>() {
            public Integer evaluate(Integer a, Integer b) {try{__CLR4_4_15bg5bgkcq4sun6.R.inc(6896);
                __CLR4_4_15bg5bgkcq4sun6.R.inc(6897);return Integer.valueOf(a + b);
            }finally{__CLR4_4_15bg5bgkcq4sun6.R.flushNeeded();}}
        });
        __CLR4_4_15bg5bgkcq4sun6.R.inc(6898);assertEquals(Integer.valueOf(sum), foldLeft.evaluate(IteratorToGeneratorAdapter.adapt(list.iterator())));
        __CLR4_4_15bg5bgkcq4sun6.R.inc(6899);assertEquals(Integer.valueOf(sum), foldLeft.evaluate(IteratorToGeneratorAdapter.adapt(list.iterator()), Integer.valueOf(0)));
        __CLR4_4_15bg5bgkcq4sun6.R.inc(6900);assertEquals(Integer.valueOf(0), foldLeft.evaluate(IteratorToGeneratorAdapter.adapt(new ArrayList<Integer>(0).iterator()), Integer.valueOf(0)), Integer.valueOf(0));
    }finally{__CLR4_4_15bg5bgkcq4sun6.R.flushNeeded();}}

    // Attributes
    // ------------------------------------------------------------------------
    private List<Integer> list = Arrays.asList(0,1,2);
    private int sum = 3;

    // Classes
    // ------------------------------------------------------------------------
    
    static class Sum implements BinaryFunction<Integer, Integer, Integer> {
        
        public Integer evaluate(Integer a, Integer b) {try{__CLR4_4_15bg5bgkcq4sun6.R.inc(6901);
            __CLR4_4_15bg5bgkcq4sun6.R.inc(6902);return Integer.valueOf(a + b);
        }finally{__CLR4_4_15bg5bgkcq4sun6.R.flushNeeded();}}
        
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_15bg5bgkcq4sun6.R.inc(6903);
            __CLR4_4_15bg5bgkcq4sun6.R.inc(6904);if((((this == obj)&&(__CLR4_4_15bg5bgkcq4sun6.R.iget(6905)!=0|true))||(__CLR4_4_15bg5bgkcq4sun6.R.iget(6906)==0&false))) {{
                __CLR4_4_15bg5bgkcq4sun6.R.inc(6907);return true;
            }
            }__CLR4_4_15bg5bgkcq4sun6.R.inc(6908);return obj != null && obj.getClass().equals(this.getClass());
        }finally{__CLR4_4_15bg5bgkcq4sun6.R.flushNeeded();}}
        
        @Override
        public int hashCode() {try{__CLR4_4_15bg5bgkcq4sun6.R.inc(6909);
            __CLR4_4_15bg5bgkcq4sun6.R.inc(6910);return "Sum".hashCode();
        }finally{__CLR4_4_15bg5bgkcq4sun6.R.flushNeeded();}}
    }
    
}
