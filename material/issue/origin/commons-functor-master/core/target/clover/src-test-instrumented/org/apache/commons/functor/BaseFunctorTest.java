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
package org.apache.commons.functor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public abstract class BaseFunctorTest {static class __CLR4_4_13k73k7kcq4su5e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,4644,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Framework
    // ------------------------------------------------------------------------

    protected abstract Object makeFunctor() throws Exception;

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public final void testObjectEquals() throws Exception {__CLR4_4_13k73k7kcq4su5e.R.globalSliceStart(getClass().getName(),4615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ykqnmx3k7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13k73k7kcq4su5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_13k73k7kcq4su5e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.BaseFunctorTest.testObjectEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4615,$CLV_p$,$CLV_t$);}}private final void  __CLR4_4_1ykqnmx3k7() throws Exception{try{__CLR4_4_13k73k7kcq4su5e.R.inc(4615);
        __CLR4_4_13k73k7kcq4su5e.R.inc(4616);Object obj = makeFunctor();
        __CLR4_4_13k73k7kcq4su5e.R.inc(4617);assertEquals("equals must be reflexive", obj, obj);
        __CLR4_4_13k73k7kcq4su5e.R.inc(4618);assertEquals("hashCode must be reflexive", obj.hashCode(), obj.hashCode());
        __CLR4_4_13k73k7kcq4su5e.R.inc(4619);assertTrue(!obj.equals(null)); // should be able to compare to null

        __CLR4_4_13k73k7kcq4su5e.R.inc(4620);Object obj2 = makeFunctor();
        __CLR4_4_13k73k7kcq4su5e.R.inc(4621);if ((((obj.equals(obj2))&&(__CLR4_4_13k73k7kcq4su5e.R.iget(4622)!=0|true))||(__CLR4_4_13k73k7kcq4su5e.R.iget(4623)==0&false))) {{
            __CLR4_4_13k73k7kcq4su5e.R.inc(4624);assertEquals("equals implies hash equals", obj.hashCode(), obj2.hashCode());
            __CLR4_4_13k73k7kcq4su5e.R.inc(4625);assertEquals("equals must be symmetric", obj2, obj);
        } }else {{
            __CLR4_4_13k73k7kcq4su5e.R.inc(4626);assertTrue("equals must be symmetric", !obj2.equals(obj));
        }

        }__CLR4_4_13k73k7kcq4su5e.R.inc(4627);assertTrue("a functor is not equal to an integer", !obj.equals(Integer.valueOf(1)));
    }finally{__CLR4_4_13k73k7kcq4su5e.R.flushNeeded();}}

    @Test
    public void testToStringIsOverridden() throws Exception {__CLR4_4_13k73k7kcq4su5e.R.globalSliceStart(getClass().getName(),4628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpvofx3kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13k73k7kcq4su5e.R.rethrow($CLV_t2$);}finally{__CLR4_4_13k73k7kcq4su5e.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.BaseFunctorTest.testToStringIsOverridden",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpvofx3kk() throws Exception{try{__CLR4_4_13k73k7kcq4su5e.R.inc(4628);
        __CLR4_4_13k73k7kcq4su5e.R.inc(4629);Object obj = makeFunctor();
        __CLR4_4_13k73k7kcq4su5e.R.inc(4630);assertNotNull("toString should never return null", obj.toString());
        __CLR4_4_13k73k7kcq4su5e.R.inc(4631);assertTrue(obj.getClass().getName() + " should override toString(), found \"" + obj.toString() + "\"", !obj
            .toString().equals(objectToString(obj)));
    }finally{__CLR4_4_13k73k7kcq4su5e.R.flushNeeded();}}

    // protected utils
    // ------------------------------------------------------------------------

    public static void assertObjectsAreEqual(Object a, Object b) {try{__CLR4_4_13k73k7kcq4su5e.R.inc(4632);
        __CLR4_4_13k73k7kcq4su5e.R.inc(4633);assertEquals(a, b);
        __CLR4_4_13k73k7kcq4su5e.R.inc(4634);assertEquals(b, a);
        __CLR4_4_13k73k7kcq4su5e.R.inc(4635);assertEquals(a.hashCode(), b.hashCode());
        __CLR4_4_13k73k7kcq4su5e.R.inc(4636);assertEquals(a.toString(), b.toString()); // not strictly required
    }finally{__CLR4_4_13k73k7kcq4su5e.R.flushNeeded();}}

    public static void assertObjectsAreNotEqual(Object a, Object b) {try{__CLR4_4_13k73k7kcq4su5e.R.inc(4637);
        __CLR4_4_13k73k7kcq4su5e.R.inc(4638);assertTrue(!a.equals(b));
        __CLR4_4_13k73k7kcq4su5e.R.inc(4639);assertTrue(!b.equals(a));
        __CLR4_4_13k73k7kcq4su5e.R.inc(4640);assertTrue(a.hashCode() != b.hashCode()); // not strictly required
        __CLR4_4_13k73k7kcq4su5e.R.inc(4641);assertTrue(!a.toString().equals(b.toString())); // not strictly required
    }finally{__CLR4_4_13k73k7kcq4su5e.R.flushNeeded();}}

    // private utils
    // ------------------------------------------------------------------------
    private String objectToString(Object obj) {try{__CLR4_4_13k73k7kcq4su5e.R.inc(4642);
        __CLR4_4_13k73k7kcq4su5e.R.inc(4643);return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
    }finally{__CLR4_4_13k73k7kcq4su5e.R.flushNeeded();}}
}
