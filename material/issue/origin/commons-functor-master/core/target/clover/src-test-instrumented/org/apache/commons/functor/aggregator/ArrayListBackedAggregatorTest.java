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
package org.apache.commons.functor.aggregator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.aggregator.ArrayListBackedAggregator;
import org.junit.Test;

/**
 * Unit test for {@link ArrayListBackedAggregator}. TODO: Some multi-threaded
 * testing
 */
public class ArrayListBackedAggregatorTest extends BaseFunctorTest {static class __CLR4_4_14dq4dqkcq4sueo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,5701,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_14dq4dqkcq4sueo.R.inc(5678);
        __CLR4_4_14dq4dqkcq4sueo.R.inc(5679);return new ArrayListBackedAggregator<Object>(new SelectFirstFunction<Object>());
    }finally{__CLR4_4_14dq4dqkcq4sueo.R.flushNeeded();}}

    @Test
    public void testCreateList() throws Exception {__CLR4_4_14dq4dqkcq4sueo.R.globalSliceStart(getClass().getName(),5680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1acnj9p4ds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dq4dqkcq4sueo.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dq4dqkcq4sueo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.aggregator.ArrayListBackedAggregatorTest.testCreateList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1acnj9p4ds() throws Exception{try{__CLR4_4_14dq4dqkcq4sueo.R.inc(5680);
        __CLR4_4_14dq4dqkcq4sueo.R.inc(5681);@SuppressWarnings("unchecked")
        ArrayListBackedAggregator<Object> fct = (ArrayListBackedAggregator<Object>) makeFunctor();
        __CLR4_4_14dq4dqkcq4sueo.R.inc(5682);assertNotNull(fct.getSeries());
        __CLR4_4_14dq4dqkcq4sueo.R.inc(5683);assertTrue(fct.getSeries() instanceof ArrayList);
        __CLR4_4_14dq4dqkcq4sueo.R.inc(5684);assertEquals(fct.getSeries().size(), 0);
        // NOTE: would be good to be able to check the ArrayList capacity!
        __CLR4_4_14dq4dqkcq4sueo.R.inc(5685);int initialSize = 31; // nearly 10 pies
        __CLR4_4_14dq4dqkcq4sueo.R.inc(5686);fct = new ArrayListBackedAggregator<Object>(new SelectFirstFunction<Object>(), initialSize);
        __CLR4_4_14dq4dqkcq4sueo.R.inc(5687);assertNotNull(fct.getSeries());
        __CLR4_4_14dq4dqkcq4sueo.R.inc(5688);assertTrue(fct.getSeries() instanceof ArrayList);
        __CLR4_4_14dq4dqkcq4sueo.R.inc(5689);assertEquals(fct.getSeries().size(), 0);
    }finally{__CLR4_4_14dq4dqkcq4sueo.R.flushNeeded();}}

    /**
     * Dummy Function which counts the number of calls to
     * {@link #evaluate(List)} and always selects the first item in the given
     * list or null if list is null or empty.
     */
    class SelectFirstFunction<T> implements Function<List<T>, T> {
        int     calls     = 0;
        boolean exception = false; // when set to true, evaluate will throw an
                                   // exception

        public T evaluate(List<T> obj) {try{__CLR4_4_14dq4dqkcq4sueo.R.inc(5690);
            __CLR4_4_14dq4dqkcq4sueo.R.inc(5691);calls++;
            __CLR4_4_14dq4dqkcq4sueo.R.inc(5692);if ((((exception)&&(__CLR4_4_14dq4dqkcq4sueo.R.iget(5693)!=0|true))||(__CLR4_4_14dq4dqkcq4sueo.R.iget(5694)==0&false)))
                {__CLR4_4_14dq4dqkcq4sueo.R.inc(5695);throw new RuntimeException();
            }__CLR4_4_14dq4dqkcq4sueo.R.inc(5696);if ((((obj == null || obj.size() == 0)&&(__CLR4_4_14dq4dqkcq4sueo.R.iget(5697)!=0|true))||(__CLR4_4_14dq4dqkcq4sueo.R.iget(5698)==0&false)))
                {__CLR4_4_14dq4dqkcq4sueo.R.inc(5699);return null;
            }__CLR4_4_14dq4dqkcq4sueo.R.inc(5700);return obj.get(0);
        }finally{__CLR4_4_14dq4dqkcq4sueo.R.flushNeeded();}}
    }
}
