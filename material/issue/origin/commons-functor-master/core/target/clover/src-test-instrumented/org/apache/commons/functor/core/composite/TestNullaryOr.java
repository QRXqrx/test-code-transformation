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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestNullaryOr extends BaseFunctorTest {static class __CLR4_4_16qn6qnkcq4sv2j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,8823,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_16qn6qnkcq4sv2j.R.inc(8735);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8736);return new NullaryOr(Constant.FALSE, Constant.TRUE);
    }finally{__CLR4_4_16qn6qnkcq4sv2j.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testConstructors() {__CLR4_4_16qn6qnkcq4sv2j.R.globalSliceStart(getClass().getName(),8737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwxahe6qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16qn6qnkcq4sv2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_16qn6qnkcq4sv2j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullaryOr.testConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwxahe6qp(){try{__CLR4_4_16qn6qnkcq4sv2j.R.inc(8737);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8738);NullaryOr or = new NullaryOr(Constant.FALSE);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8739);assertEquals(Boolean.FALSE, or.test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8740);NullaryOr or2 = new NullaryOr((Iterable<NullaryPredicate>)Arrays.asList((NullaryPredicate)Constant.truePredicate()));
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8741);assertEquals(Boolean.TRUE, or2.test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8742);NullaryOr or3 = new NullaryOr((NullaryPredicate)null);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8743);assertEquals(Boolean.FALSE, or3.test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8744);NullaryOr or4 = new NullaryOr((Iterable<NullaryPredicate>)null);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8745);assertEquals(Boolean.FALSE, or4.test());
    }finally{__CLR4_4_16qn6qnkcq4sv2j.R.flushNeeded();}}

    @Test
    public void testTrue() throws Exception {__CLR4_4_16qn6qnkcq4sv2j.R.globalSliceStart(getClass().getName(),8746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cy4y9l6qy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16qn6qnkcq4sv2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_16qn6qnkcq4sv2j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullaryOr.testTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cy4y9l6qy() throws Exception{try{__CLR4_4_16qn6qnkcq4sv2j.R.inc(8746);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8747);assertTrue((new NullaryOr(Constant.TRUE)).test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8748);assertTrue((new NullaryOr(Constant.FALSE, Constant.TRUE)).test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8749);assertTrue((new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test());

        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8750);NullaryOr p = new NullaryOr(Constant.TRUE);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8751);assertTrue(p.test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8752);for (int i=0;(((i<10)&&(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8753)!=0|true))||(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8754)==0&false));i++) {{
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8755);p.or(Constant.of(i%2==0));
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8756);assertTrue(p.test());
        }

        }__CLR4_4_16qn6qnkcq4sv2j.R.inc(8757);NullaryOr q = new NullaryOr(Constant.TRUE);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8758);assertTrue(q.test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8759);for (int i=0;(((i<10)&&(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8760)!=0|true))||(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8761)==0&false));i++) {{
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8762);q.or(Constant.of(i%2==0));
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8763);assertTrue(q.test());
        }

        }__CLR4_4_16qn6qnkcq4sv2j.R.inc(8764);NullaryOr r = new NullaryOr(p,q);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8765);assertTrue(r.test());
    }finally{__CLR4_4_16qn6qnkcq4sv2j.R.flushNeeded();}}

    @Test
    public void testFalse() throws Exception {__CLR4_4_16qn6qnkcq4sv2j.R.globalSliceStart(getClass().getName(),8766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5vdwo6ri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16qn6qnkcq4sv2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_16qn6qnkcq4sv2j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullaryOr.testFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5vdwo6ri() throws Exception{try{__CLR4_4_16qn6qnkcq4sv2j.R.inc(8766);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8767);assertFalse(new NullaryOr().test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8768);assertFalse(new NullaryOr(Constant.FALSE).test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8769);assertFalse(new NullaryOr(Constant.FALSE,Constant.FALSE).test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8770);assertFalse(new NullaryOr(Constant.FALSE,Constant.FALSE,Constant.FALSE).test());

        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8771);NullaryOr p = new NullaryOr(Constant.FALSE);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8772);assertFalse(p.test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8773);for (int i=0;(((i<10)&&(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8774)!=0|true))||(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8775)==0&false));i++) {{
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8776);p.or(Constant.FALSE);
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8777);assertFalse(p.test());
        }

        }__CLR4_4_16qn6qnkcq4sv2j.R.inc(8778);NullaryOr q = new NullaryOr(Constant.FALSE);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8779);assertFalse(q.test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8780);for (int i=0;(((i<10)&&(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8781)!=0|true))||(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8782)==0&false));i++) {{
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8783);q.or(Constant.FALSE);
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8784);assertFalse(q.test());
        }

        }__CLR4_4_16qn6qnkcq4sv2j.R.inc(8785);NullaryOr r = new NullaryOr(p,q);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8786);assertTrue(!r.test());
    }finally{__CLR4_4_16qn6qnkcq4sv2j.R.flushNeeded();}}

    @Test
    public void testDuplicateAdd() throws Exception {__CLR4_4_16qn6qnkcq4sv2j.R.globalSliceStart(getClass().getName(),8787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18atuof6s3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16qn6qnkcq4sv2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_16qn6qnkcq4sv2j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullaryOr.testDuplicateAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18atuof6s3() throws Exception{try{__CLR4_4_16qn6qnkcq4sv2j.R.inc(8787);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8788);NullaryPredicate p = Constant.TRUE;
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8789);NullaryOr q = new NullaryOr(p,p);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8790);assertTrue(q.test());
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8791);for (int i=0;(((i<10)&&(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8792)!=0|true))||(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8793)==0&false));i++) {{
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8794);q.or(p);
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8795);assertTrue(q.test());
        }
    }}finally{__CLR4_4_16qn6qnkcq4sv2j.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_16qn6qnkcq4sv2j.R.globalSliceStart(getClass().getName(),8796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6086sc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16qn6qnkcq4sv2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_16qn6qnkcq4sv2j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestNullaryOr.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6086sc() throws Exception{try{__CLR4_4_16qn6qnkcq4sv2j.R.inc(8796);
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8797);NullaryOr p = new NullaryOr();
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8798);assertEquals(p,p);

        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8799);NullaryOr q = new NullaryOr();
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8800);assertObjectsAreEqual(p,q);

        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8801);NullaryAnd r = new NullaryAnd();
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8802);assertObjectsAreNotEqual(p,r);

        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8803);for (int i=0;(((i<3)&&(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8804)!=0|true))||(__CLR4_4_16qn6qnkcq4sv2j.R.iget(8805)==0&false));i++) {{
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8806);p.or(Constant.TRUE);
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8807);assertObjectsAreNotEqual(p,q);
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8808);q.or(Constant.TRUE);
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8809);assertObjectsAreEqual(p,q);
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8810);r.and(Constant.TRUE);
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8811);assertObjectsAreNotEqual(p,r);

            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8812);p.or(new NullaryOr(Constant.TRUE,Constant.FALSE));
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8813);assertObjectsAreNotEqual(p,q);
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8814);q.or(new NullaryOr(Constant.TRUE,Constant.FALSE));
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8815);assertObjectsAreEqual(p,q);
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8816);r.and(new NullaryOr(Constant.TRUE,Constant.FALSE));
            __CLR4_4_16qn6qnkcq4sv2j.R.inc(8817);assertObjectsAreNotEqual(p,r);
        }

        }__CLR4_4_16qn6qnkcq4sv2j.R.inc(8818);assertObjectsAreNotEqual(p,Constant.TRUE);

        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8819);assertObjectsAreNotEqual(p,new NullaryOr((Iterable<NullaryPredicate>)null));
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8820);assertObjectsAreNotEqual(p,new NullaryOr((NullaryPredicate[])null));
        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8821);assertObjectsAreNotEqual(p,new NullaryOr((NullaryPredicate)null));

        __CLR4_4_16qn6qnkcq4sv2j.R.inc(8822);assertTrue(!p.equals(null));
    }finally{__CLR4_4_16qn6qnkcq4sv2j.R.flushNeeded();}}

}
