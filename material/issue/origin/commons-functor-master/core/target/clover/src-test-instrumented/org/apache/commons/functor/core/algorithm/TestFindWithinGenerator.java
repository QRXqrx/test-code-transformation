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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.adapter.LeftBoundPredicate;
import org.apache.commons.functor.core.IsEqual;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;
import org.junit.Test;

/**
 * Tests {@link FindWithinGenerator} algorithm.
 */
public class TestFindWithinGenerator extends BaseFunctorTest {static class __CLR4_4_15ac5ackcq4sumy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,6892,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected Object makeFunctor() throws Exception {try{__CLR4_4_15ac5ackcq4sumy.R.inc(6852);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6853);return new FindWithinGenerator<Object>();
    }finally{__CLR4_4_15ac5ackcq4sumy.R.flushNeeded();}}

    @Test
    public void testObjectEqualsWithIfNone() throws Exception {__CLR4_4_15ac5ackcq4sumy.R.globalSliceStart(getClass().getName(),6854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1shpslq5ae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ac5ackcq4sumy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ac5ackcq4sumy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestFindWithinGenerator.testObjectEqualsWithIfNone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1shpslq5ae() throws Exception{try{__CLR4_4_15ac5ackcq4sumy.R.inc(6854);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6855);Object obj = new FindWithinGenerator<Object>(1);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6856);assertEquals("equals must be reflexive", obj, obj);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6857);assertEquals("hashCode must be reflexive", obj.hashCode(), obj.hashCode());
        __CLR4_4_15ac5ackcq4sumy.R.inc(6858);assertTrue(!obj.equals(null)); // should be able to compare to null

        __CLR4_4_15ac5ackcq4sumy.R.inc(6859);Object obj2 = new FindWithinGenerator<Object>(1);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6860);if ((((obj.equals(obj2))&&(__CLR4_4_15ac5ackcq4sumy.R.iget(6861)!=0|true))||(__CLR4_4_15ac5ackcq4sumy.R.iget(6862)==0&false))) {{
            __CLR4_4_15ac5ackcq4sumy.R.inc(6863);assertEquals("equals implies hash equals", obj.hashCode(), obj2.hashCode());
            __CLR4_4_15ac5ackcq4sumy.R.inc(6864);assertEquals("equals must be symmetric", obj2, obj);
        } }else {{
            __CLR4_4_15ac5ackcq4sumy.R.inc(6865);assertTrue("equals must be symmetric", !obj2.equals(obj));
        }
    }}finally{__CLR4_4_15ac5ackcq4sumy.R.flushNeeded();}}

    @Test
    public void testObjectEqualsWithNullDefault() throws Exception {__CLR4_4_15ac5ackcq4sumy.R.globalSliceStart(getClass().getName(),6866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oqv74l5aq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ac5ackcq4sumy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ac5ackcq4sumy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestFindWithinGenerator.testObjectEqualsWithNullDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oqv74l5aq() throws Exception{try{__CLR4_4_15ac5ackcq4sumy.R.inc(6866);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6867);Object obj = new FindWithinGenerator<Object>(null);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6868);assertEquals("equals must be reflexive", obj, obj);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6869);assertEquals("hashCode must be reflexive", obj.hashCode(), obj.hashCode());
        __CLR4_4_15ac5ackcq4sumy.R.inc(6870);assertTrue(!obj.equals(null)); // should be able to compare to null

        __CLR4_4_15ac5ackcq4sumy.R.inc(6871);Object obj2 = new FindWithinGenerator<Object>(null);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6872);if ((((obj.equals(obj2))&&(__CLR4_4_15ac5ackcq4sumy.R.iget(6873)!=0|true))||(__CLR4_4_15ac5ackcq4sumy.R.iget(6874)==0&false))) {{
            __CLR4_4_15ac5ackcq4sumy.R.inc(6875);assertEquals("equals implies hash equals", obj.hashCode(), obj2.hashCode());
            __CLR4_4_15ac5ackcq4sumy.R.inc(6876);assertEquals("equals must be symmetric", obj2, obj);
        } }else {{
            __CLR4_4_15ac5ackcq4sumy.R.inc(6877);assertTrue("equals must be symmetric", !obj2.equals(obj));
        }
    }}finally{__CLR4_4_15ac5ackcq4sumy.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_15ac5ackcq4sumy.R.globalSliceStart(getClass().getName(),6878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6085b2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ac5ackcq4sumy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ac5ackcq4sumy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestFindWithinGenerator.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6085b2(){try{__CLR4_4_15ac5ackcq4sumy.R.inc(6878);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6879);FindWithinGenerator<Object> f = new FindWithinGenerator<Object>();
        __CLR4_4_15ac5ackcq4sumy.R.inc(6880);assertEquals(f, f);

        __CLR4_4_15ac5ackcq4sumy.R.inc(6881);assertObjectsAreEqual(f, new FindWithinGenerator<Object>());
        __CLR4_4_15ac5ackcq4sumy.R.inc(6882);assertObjectsAreEqual(new FindWithinGenerator<Object>(Double.valueOf(0)), new FindWithinGenerator<Object>(
            Double.valueOf(0)));
        __CLR4_4_15ac5ackcq4sumy.R.inc(6883);assertObjectsAreNotEqual(f, new FindWithinGenerator<Object>(Integer.valueOf(0)));
    }finally{__CLR4_4_15ac5ackcq4sumy.R.flushNeeded();}}

    @Test(expected = NoSuchElementException.class)
    public void testDetect() {__CLR4_4_15ac5ackcq4sumy.R.globalSliceStart(getClass().getName(),6884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz1wuc5b8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,101,116,101,99,116,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ac5ackcq4sumy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ac5ackcq4sumy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestFindWithinGenerator.testDetect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz1wuc5b8(){try{__CLR4_4_15ac5ackcq4sumy.R.inc(6884);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6885);assertEquals(Integer.valueOf(3), new FindWithinGenerator<Integer>().evaluate(
            IteratorToGeneratorAdapter.adapt(numbers.iterator()), equalsThree));
        __CLR4_4_15ac5ackcq4sumy.R.inc(6886);new FindWithinGenerator<Integer>().evaluate(IteratorToGeneratorAdapter.adapt(numbers.iterator()),
            equalsTwentyThree);
    }finally{__CLR4_4_15ac5ackcq4sumy.R.flushNeeded();}}

    @Test
    public void testDetectIfNone() {__CLR4_4_15ac5ackcq4sumy.R.globalSliceStart(getClass().getName(),6887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jzcwy75bb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ac5ackcq4sumy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ac5ackcq4sumy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestFindWithinGenerator.testDetectIfNone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jzcwy75bb(){try{__CLR4_4_15ac5ackcq4sumy.R.inc(6887);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6888);assertEquals(
            Integer.valueOf(3),
            new FindWithinGenerator<Integer>(Integer.valueOf(3)).evaluate(
                IteratorToGeneratorAdapter.adapt(numbers.iterator()), equalsThree));
        __CLR4_4_15ac5ackcq4sumy.R.inc(6889);assertEquals("Xyzzy", new FindWithinGenerator<String>("Xyzzy").evaluate(
            IteratorToGeneratorAdapter.adapt(strings.iterator()), equalsXyZ));
    }finally{__CLR4_4_15ac5ackcq4sumy.R.flushNeeded();}}

    @Test
    public void testInstance() {__CLR4_4_15ac5ackcq4sumy.R.globalSliceStart(getClass().getName(),6890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pkcjhq5be();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ac5ackcq4sumy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ac5ackcq4sumy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.algorithm.TestFindWithinGenerator.testInstance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pkcjhq5be(){try{__CLR4_4_15ac5ackcq4sumy.R.inc(6890);
        __CLR4_4_15ac5ackcq4sumy.R.inc(6891);assertNotNull("FindWithinGenerator instance must not be null", FindWithinGenerator.instance());
    }finally{__CLR4_4_15ac5ackcq4sumy.R.flushNeeded();}}

    // Attributes
    // ------------------------------------------------------------------------

    private List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    private List<String> strings = Arrays.asList("Zyx", "xxyZ");
    private Predicate<Integer> equalsThree = LeftBoundPredicate.bind(IsEqual.instance(), Integer.valueOf(3));
    private Predicate<Integer> equalsTwentyThree = LeftBoundPredicate.bind(IsEqual.instance(), Integer.valueOf(23));
    private Predicate<String> equalsXyZ = LeftBoundPredicate.bind(IsEqual.instance(), "xyZ");

}
