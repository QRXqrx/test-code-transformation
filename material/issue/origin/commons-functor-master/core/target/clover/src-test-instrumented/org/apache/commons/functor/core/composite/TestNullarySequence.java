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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.functor.core.NoOp;
import org.junit.Test;

/**
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestNullarySequence extends BaseFunctorTest {static class __CLR4_4_16t36t3kcq4sv2y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,8892,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_16t36t3kcq4sv2y.R.inc(8823);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8824);return new NullarySequence(new NoOp(),new NoOp());
    }finally{__CLR4_4_16t36t3kcq4sv2y.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testConstructors() throws Exception {__CLR4_4_16t36t3kcq4sv2y.R.globalSliceStart(getClass().getName(),8825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwxahe6t5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16t36t3kcq4sv2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_16t36t3kcq4sv2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullarySequence.testConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwxahe6t5() throws Exception{try{__CLR4_4_16t36t3kcq4sv2y.R.inc(8825);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8826);NullarySequence seq1 = new NullarySequence((NullaryProcedure)null);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8827);NullarySequence seq2 = new NullarySequence();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8828);assertObjectsAreEqual(seq1, seq2);
        
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8829);RunCounter p1 = new RunCounter();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8830);RunCounter p2 = new RunCounter();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8831);List<NullaryProcedure> iterable = new ArrayList<NullaryProcedure>();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8832);iterable.add(p1);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8833);iterable.add(p2);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8834);NullarySequence seq3 = new NullarySequence(iterable);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8835);NullarySequence seq4 = new NullarySequence(p1, p2);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8836);assertObjectsAreEqual(seq3, seq4);
        
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8837);NullarySequence seq5 = new NullarySequence((Iterable<NullaryProcedure>)null);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8838);NullarySequence seq6 = new NullarySequence((NullaryProcedure[])null);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8839);assertObjectsAreEqual(seq5, seq6);
    }finally{__CLR4_4_16t36t3kcq4sv2y.R.flushNeeded();}}

    @Test
    public void testRunZero() throws Exception {__CLR4_4_16t36t3kcq4sv2y.R.globalSliceStart(getClass().getName(),8840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ho3ny06tk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16t36t3kcq4sv2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_16t36t3kcq4sv2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullarySequence.testRunZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ho3ny06tk() throws Exception{try{__CLR4_4_16t36t3kcq4sv2y.R.inc(8840);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8841);NullarySequence seq = new NullarySequence();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8842);seq.run();
    }finally{__CLR4_4_16t36t3kcq4sv2y.R.flushNeeded();}}

    @Test
    public void testRunOne() throws Exception {__CLR4_4_16t36t3kcq4sv2y.R.globalSliceStart(getClass().getName(),8843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9x4cs6tn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16t36t3kcq4sv2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_16t36t3kcq4sv2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullarySequence.testRunOne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9x4cs6tn() throws Exception{try{__CLR4_4_16t36t3kcq4sv2y.R.inc(8843);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8844);RunCounter counter = new RunCounter();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8845);NullarySequence seq = new NullarySequence(counter);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8846);assertEquals(0,counter.count);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8847);seq.run();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8848);assertEquals(1,counter.count);
    }finally{__CLR4_4_16t36t3kcq4sv2y.R.flushNeeded();}}

    @Test
    public void testRunTwo() throws Exception {__CLR4_4_16t36t3kcq4sv2y.R.globalSliceStart(getClass().getName(),8849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3wzs66tt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16t36t3kcq4sv2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_16t36t3kcq4sv2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullarySequence.testRunTwo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3wzs66tt() throws Exception{try{__CLR4_4_16t36t3kcq4sv2y.R.inc(8849);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8850);RunCounter[] counter = { new RunCounter(), new RunCounter() };
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8851);NullarySequence seq = new NullarySequence(counter[0],counter[1]);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8852);assertEquals(0,counter[0].count);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8853);assertEquals(0,counter[1].count);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8854);seq.run();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8855);assertEquals(1,counter[0].count);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8856);assertEquals(1,counter[1].count);
    }finally{__CLR4_4_16t36t3kcq4sv2y.R.flushNeeded();}}

    @Test
    public void testThen() throws Exception {__CLR4_4_16t36t3kcq4sv2y.R.globalSliceStart(getClass().getName(),8857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bnohca6u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16t36t3kcq4sv2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_16t36t3kcq4sv2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullarySequence.testThen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bnohca6u1() throws Exception{try{__CLR4_4_16t36t3kcq4sv2y.R.inc(8857);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8858);List<RunCounter> list = new ArrayList<RunCounter>();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8859);NullarySequence seq = new NullarySequence();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8860);seq.run();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8861);for (int i=0;(((i<10)&&(__CLR4_4_16t36t3kcq4sv2y.R.iget(8862)!=0|true))||(__CLR4_4_16t36t3kcq4sv2y.R.iget(8863)==0&false));i++) {{
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8864);RunCounter counter = new RunCounter();
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8865);seq.then(counter);
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8866);list.add(counter);
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8867);seq.run();
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8868);for (int j=0;(((j<list.size())&&(__CLR4_4_16t36t3kcq4sv2y.R.iget(8869)!=0|true))||(__CLR4_4_16t36t3kcq4sv2y.R.iget(8870)==0&false));j++) {{
                __CLR4_4_16t36t3kcq4sv2y.R.inc(8871);assertEquals(list.size()-j,(((RunCounter)(list.get(j))).count));
            }
        }}
    }}finally{__CLR4_4_16t36t3kcq4sv2y.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_16t36t3kcq4sv2y.R.globalSliceStart(getClass().getName(),8872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6086ug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16t36t3kcq4sv2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_16t36t3kcq4sv2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullarySequence.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6086ug() throws Exception{try{__CLR4_4_16t36t3kcq4sv2y.R.inc(8872);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8873);NullarySequence p = new NullarySequence();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8874);assertEquals(p,p);
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8875);NullarySequence q = new NullarySequence();
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8876);assertObjectsAreEqual(p,q);

        __CLR4_4_16t36t3kcq4sv2y.R.inc(8877);for (int i=0;(((i<3)&&(__CLR4_4_16t36t3kcq4sv2y.R.iget(8878)!=0|true))||(__CLR4_4_16t36t3kcq4sv2y.R.iget(8879)==0&false));i++) {{
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8880);p.then(new NoOp());
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8881);assertObjectsAreNotEqual(p,q);
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8882);q.then(new NoOp());
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8883);assertObjectsAreEqual(p,q);
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8884);p.then(new NullarySequence(new NoOp(),new NoOp()));
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8885);assertObjectsAreNotEqual(p,q);
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8886);q.then(new NullarySequence(new NoOp(),new NoOp()));
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8887);assertObjectsAreEqual(p,q);
        }

        }__CLR4_4_16t36t3kcq4sv2y.R.inc(8888);assertObjectsAreNotEqual(p,new NoOp());
        __CLR4_4_16t36t3kcq4sv2y.R.inc(8889);assertTrue(!p.equals(null));
    }finally{__CLR4_4_16t36t3kcq4sv2y.R.flushNeeded();}}

    // Classes
    // ------------------------------------------------------------------------

    static class RunCounter implements NullaryProcedure {
        public void run() {try{__CLR4_4_16t36t3kcq4sv2y.R.inc(8890);
            __CLR4_4_16t36t3kcq4sv2y.R.inc(8891);count++;
        }finally{__CLR4_4_16t36t3kcq4sv2y.R.flushNeeded();}}
        public int count = 0;
    }
}
