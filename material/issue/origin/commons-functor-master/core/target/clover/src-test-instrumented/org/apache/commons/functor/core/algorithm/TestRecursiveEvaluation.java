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
import static org.junit.Assert.fail;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.NullaryFunction;
import org.junit.Test;

/**
 * Tests {@link RecursiveEvaluation} algorithm.
 */
public class TestRecursiveEvaluation extends BaseFunctorTest {static class __CLR4_4_15dj5djkcq4suof{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,7021,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_15dj5djkcq4suof.R.inc(6967);
        __CLR4_4_15dj5djkcq4suof.R.inc(6968);return new RecursiveEvaluation(new RecFunc(0, false));
    }finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}

    @Test
    public void testRecurse() {__CLR4_4_15dj5djkcq4suof.R.globalSliceStart(getClass().getName(),6969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylk6445dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15dj5djkcq4suof.R.rethrow($CLV_t2$);}finally{__CLR4_4_15dj5djkcq4suof.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestRecursiveEvaluation.testRecurse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylk6445dl(){try{__CLR4_4_15dj5djkcq4suof.R.inc(6969);
        __CLR4_4_15dj5djkcq4suof.R.inc(6970);assertEquals(Integer.valueOf(5), new RecursiveEvaluation(new RecFunc(0, false)).evaluate());

        // this version will return a function. since it is not the same type
        // as RecFunc recursion will end.
        __CLR4_4_15dj5djkcq4suof.R.inc(6971);@SuppressWarnings({ "unchecked", "rawtypes" })
        NullaryFunction<Object> func = (NullaryFunction) new RecursiveEvaluation(new RecFunc(0, true)).evaluate();
        __CLR4_4_15dj5djkcq4suof.R.inc(6972);assertEquals(Integer.valueOf(5), func.evaluate());
    }finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}
    
    @Test
    public void testConstructors() {__CLR4_4_15dj5djkcq4suof.R.globalSliceStart(getClass().getName(),6973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwxahe5dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15dj5djkcq4suof.R.rethrow($CLV_t2$);}finally{__CLR4_4_15dj5djkcq4suof.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestRecursiveEvaluation.testConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwxahe5dp(){try{__CLR4_4_15dj5djkcq4suof.R.inc(6973);
        __CLR4_4_15dj5djkcq4suof.R.inc(6974);try {
            __CLR4_4_15dj5djkcq4suof.R.inc(6975);new RecursiveEvaluation(new RecFunc(0, false), java.lang.Integer.class);
            __CLR4_4_15dj5djkcq4suof.R.inc(6976);fail("Not supposed to get here.");
        } catch(IllegalArgumentException e) {}
        __CLR4_4_15dj5djkcq4suof.R.inc(6977);try {
            __CLR4_4_15dj5djkcq4suof.R.inc(6978);new RecursiveEvaluation(null);
            __CLR4_4_15dj5djkcq4suof.R.inc(6979);fail("Not supposed to get here.");
        } catch(NullPointerException e) {}
    }finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}

    // Classes
    // ------------------------------------------------------------------------
    
    /** Recursive function for test. */
    static class RecFunc implements NullaryFunction<Object> {

        int times = 0; 
        boolean returnFunc = false;

        public RecFunc(int times, boolean returnFunc) {try{__CLR4_4_15dj5djkcq4suof.R.inc(6980);
            __CLR4_4_15dj5djkcq4suof.R.inc(6981);this.times = times;
            __CLR4_4_15dj5djkcq4suof.R.inc(6982);this.returnFunc = returnFunc;
        }finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}

        public Object evaluate() {try{__CLR4_4_15dj5djkcq4suof.R.inc(6983);
            __CLR4_4_15dj5djkcq4suof.R.inc(6984);if ((((times < 5)&&(__CLR4_4_15dj5djkcq4suof.R.iget(6985)!=0|true))||(__CLR4_4_15dj5djkcq4suof.R.iget(6986)==0&false))) {{
                __CLR4_4_15dj5djkcq4suof.R.inc(6987);return new RecFunc(++times, returnFunc);
            } }else {{
                __CLR4_4_15dj5djkcq4suof.R.inc(6988);if ((((returnFunc)&&(__CLR4_4_15dj5djkcq4suof.R.iget(6989)!=0|true))||(__CLR4_4_15dj5djkcq4suof.R.iget(6990)==0&false))) {{
                    __CLR4_4_15dj5djkcq4suof.R.inc(6991);return new InnerNullaryFunction(times);
                } }else {{
                    __CLR4_4_15dj5djkcq4suof.R.inc(6992);return Integer.valueOf(times);
                }
            }}
        }}finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}
        
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_15dj5djkcq4suof.R.inc(6993);
            __CLR4_4_15dj5djkcq4suof.R.inc(6994);if((((this == obj)&&(__CLR4_4_15dj5djkcq4suof.R.iget(6995)!=0|true))||(__CLR4_4_15dj5djkcq4suof.R.iget(6996)==0&false))) {{
                __CLR4_4_15dj5djkcq4suof.R.inc(6997);return true;
            }
            }__CLR4_4_15dj5djkcq4suof.R.inc(6998);if((((obj == null || obj.getClass() != this.getClass())&&(__CLR4_4_15dj5djkcq4suof.R.iget(6999)!=0|true))||(__CLR4_4_15dj5djkcq4suof.R.iget(7000)==0&false))) {{
                __CLR4_4_15dj5djkcq4suof.R.inc(7001);return false;
            }
            }__CLR4_4_15dj5djkcq4suof.R.inc(7002);return this.times == ((RecFunc)obj).times && this.returnFunc == ((RecFunc)obj).returnFunc;
        }finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}
        
        @Override
        public int hashCode() {try{__CLR4_4_15dj5djkcq4suof.R.inc(7003);
            __CLR4_4_15dj5djkcq4suof.R.inc(7004);return "RecFunc".hashCode() << 2 ^ times;
        }finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}
    }
    
    /** Inner function called from recursive function */
    static class InnerNullaryFunction implements NullaryFunction<Object> {
        
        private int times;
        
        public InnerNullaryFunction(int times) {try{__CLR4_4_15dj5djkcq4suof.R.inc(7005);
            __CLR4_4_15dj5djkcq4suof.R.inc(7006);this.times = times;
        }finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}
        
        public Object evaluate() {try{__CLR4_4_15dj5djkcq4suof.R.inc(7007);
            __CLR4_4_15dj5djkcq4suof.R.inc(7008);return Integer.valueOf(times);
        }finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}
        
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_15dj5djkcq4suof.R.inc(7009);
            __CLR4_4_15dj5djkcq4suof.R.inc(7010);if((((this == obj)&&(__CLR4_4_15dj5djkcq4suof.R.iget(7011)!=0|true))||(__CLR4_4_15dj5djkcq4suof.R.iget(7012)==0&false))) {{
                __CLR4_4_15dj5djkcq4suof.R.inc(7013);return true;
            }
            }__CLR4_4_15dj5djkcq4suof.R.inc(7014);if((((obj == null || ! (obj instanceof InnerNullaryFunction))&&(__CLR4_4_15dj5djkcq4suof.R.iget(7015)!=0|true))||(__CLR4_4_15dj5djkcq4suof.R.iget(7016)==0&false))) {{
                __CLR4_4_15dj5djkcq4suof.R.inc(7017);return false;
            }
            }__CLR4_4_15dj5djkcq4suof.R.inc(7018);return this.times == ((InnerNullaryFunction)obj).times;
        }finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}
        
        @Override
        public int hashCode() {try{__CLR4_4_15dj5djkcq4suof.R.inc(7019);
            __CLR4_4_15dj5djkcq4suof.R.inc(7020);return "InnerNullaryFunction".hashCode() << 2 ^ times;
        }finally{__CLR4_4_15dj5djkcq4suof.R.flushNeeded();}}
    };

}
