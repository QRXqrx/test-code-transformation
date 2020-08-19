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
package org.apache.commons.functor.core.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestSize extends BaseFunctorTest {static class __CLR4_4_15ro5rokcq4suru{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,7516,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_15ro5rokcq4suru.R.inc(7476);
        __CLR4_4_15ro5rokcq4suru.R.inc(7477);return new Size<Object>();
    }finally{__CLR4_4_15ro5rokcq4suru.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testEvaluate() throws Exception {__CLR4_4_15ro5rokcq4suru.R.globalSliceStart(getClass().getName(),7478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czkatq5rq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rokcq4suru.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rokcq4suru.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestSize.testEvaluate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czkatq5rq() throws Exception{try{__CLR4_4_15ro5rokcq4suru.R.inc(7478);
        __CLR4_4_15ro5rokcq4suru.R.inc(7479);assertEquals(Integer.valueOf(0), Size.instance().evaluate(Collections.EMPTY_LIST));
        __CLR4_4_15ro5rokcq4suru.R.inc(7480);assertEquals(Integer.valueOf(0), Size.instance().evaluate(Collections.EMPTY_SET));
        {
            __CLR4_4_15ro5rokcq4suru.R.inc(7481);List<Integer> list = new ArrayList<Integer>();
            __CLR4_4_15ro5rokcq4suru.R.inc(7482);assertEquals(Integer.valueOf(0), Size.instance().evaluate(list));
            __CLR4_4_15ro5rokcq4suru.R.inc(7483);for (int i = 0; (((i < 2)&&(__CLR4_4_15ro5rokcq4suru.R.iget(7484)!=0|true))||(__CLR4_4_15ro5rokcq4suru.R.iget(7485)==0&false)); i++) {{
                __CLR4_4_15ro5rokcq4suru.R.inc(7486);assertEquals(Integer.valueOf(i), Size.instance().evaluate(list));
                __CLR4_4_15ro5rokcq4suru.R.inc(7487);list.add(Integer.valueOf(i));
                __CLR4_4_15ro5rokcq4suru.R.inc(7488);assertEquals(Integer.valueOf(i + 1), Size.instance().evaluate(list));
            }
        }}
        {
            __CLR4_4_15ro5rokcq4suru.R.inc(7489);Set<Integer> set = new HashSet<Integer>();
            __CLR4_4_15ro5rokcq4suru.R.inc(7490);assertEquals(Integer.valueOf(0), Size.instance().evaluate(set));
            __CLR4_4_15ro5rokcq4suru.R.inc(7491);for (int i = 0; (((i < 2)&&(__CLR4_4_15ro5rokcq4suru.R.iget(7492)!=0|true))||(__CLR4_4_15ro5rokcq4suru.R.iget(7493)==0&false)); i++) {{
                __CLR4_4_15ro5rokcq4suru.R.inc(7494);assertEquals(Integer.valueOf(i), Size.instance().evaluate(set));
                __CLR4_4_15ro5rokcq4suru.R.inc(7495);set.add(Integer.valueOf(i));
                __CLR4_4_15ro5rokcq4suru.R.inc(7496);assertEquals(Integer.valueOf(i + 1), Size.instance().evaluate(set));
            }
        }}
    }finally{__CLR4_4_15ro5rokcq4suru.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testEvaluateNull() throws Exception {__CLR4_4_15ro5rokcq4suru.R.globalSliceStart(getClass().getName(),7497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o321yx5s9();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,118,97,108,117,97,116,101,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rokcq4suru.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rokcq4suru.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestSize.testEvaluateNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o321yx5s9() throws Exception{try{__CLR4_4_15ro5rokcq4suru.R.inc(7497);
        __CLR4_4_15ro5rokcq4suru.R.inc(7498);Size.instance().evaluate(null);
    }finally{__CLR4_4_15ro5rokcq4suru.R.flushNeeded();}}

    @Test
    public void testEvaluateNonCollection() throws Exception {__CLR4_4_15ro5rokcq4suru.R.globalSliceStart(getClass().getName(),7499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ple87b5sb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rokcq4suru.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rokcq4suru.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestSize.testEvaluateNonCollection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ple87b5sb() throws Exception{try{__CLR4_4_15ro5rokcq4suru.R.inc(7499);
        __CLR4_4_15ro5rokcq4suru.R.inc(7500);try {
            __CLR4_4_15ro5rokcq4suru.R.inc(7501);Size.instance().evaluate(Integer.valueOf(3));
            __CLR4_4_15ro5rokcq4suru.R.inc(7502);fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_15ro5rokcq4suru.R.flushNeeded();}}

    @Test
    public void testEvaluateArray() throws Exception {__CLR4_4_15ro5rokcq4suru.R.globalSliceStart(getClass().getName(),7503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1banf5sf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rokcq4suru.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rokcq4suru.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestSize.testEvaluateArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1banf5sf() throws Exception{try{__CLR4_4_15ro5rokcq4suru.R.inc(7503);
        __CLR4_4_15ro5rokcq4suru.R.inc(7504);assertEquals(Integer.valueOf(10), Size.instance().evaluate(new int[10]));
        __CLR4_4_15ro5rokcq4suru.R.inc(7505);assertEquals(Integer.valueOf(7), Size.instance().evaluate(new String[7]));
    }finally{__CLR4_4_15ro5rokcq4suru.R.flushNeeded();}}

    @Test
    public void testEvaluateString() throws Exception {__CLR4_4_15ro5rokcq4suru.R.globalSliceStart(getClass().getName(),7506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k9u2o35si();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rokcq4suru.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rokcq4suru.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestSize.testEvaluateString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k9u2o35si() throws Exception{try{__CLR4_4_15ro5rokcq4suru.R.inc(7506);
        __CLR4_4_15ro5rokcq4suru.R.inc(7507);assertEquals(Integer.valueOf("xyzzy".length()), Size.instance().evaluate("xyzzy"));
    }finally{__CLR4_4_15ro5rokcq4suru.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_15ro5rokcq4suru.R.globalSliceStart(getClass().getName(),7508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6085sk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rokcq4suru.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rokcq4suru.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.collection.TestSize.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6085sk() throws Exception{try{__CLR4_4_15ro5rokcq4suru.R.inc(7508);
        __CLR4_4_15ro5rokcq4suru.R.inc(7509);Function<Object, Integer> f = new Size<Object>();
        __CLR4_4_15ro5rokcq4suru.R.inc(7510);assertEquals(f, f);
        __CLR4_4_15ro5rokcq4suru.R.inc(7511);assertObjectsAreEqual(f, new Size<Object>());
        __CLR4_4_15ro5rokcq4suru.R.inc(7512);assertObjectsAreEqual(f, Size.instance());
        __CLR4_4_15ro5rokcq4suru.R.inc(7513);assertSame(Size.instance(), Size.instance());
        __CLR4_4_15ro5rokcq4suru.R.inc(7514);assertObjectsAreNotEqual(f, new Constant<Object>(null));
        __CLR4_4_15ro5rokcq4suru.R.inc(7515);assertTrue(!f.equals((Size<?>) null));
    }finally{__CLR4_4_15ro5rokcq4suru.R.flushNeeded();}}

}
