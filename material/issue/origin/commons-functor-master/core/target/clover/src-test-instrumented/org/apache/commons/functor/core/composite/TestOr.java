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
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
@SuppressWarnings("unchecked")
public class TestOr extends BaseFunctorTest {static class __CLR4_4_16v06v0kcq4sv3a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,8971,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_16v06v0kcq4sv3a.R.inc(8892);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8893);return new Or<Object>(Constant.FALSE,Constant.TRUE);
    }finally{__CLR4_4_16v06v0kcq4sv3a.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testTrue() throws Exception {__CLR4_4_16v06v0kcq4sv3a.R.globalSliceStart(getClass().getName(),8894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cy4y9l6v2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16v06v0kcq4sv3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16v06v0kcq4sv3a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestOr.testTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cy4y9l6v2() throws Exception{try{__CLR4_4_16v06v0kcq4sv3a.R.inc(8894);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8895);assertTrue((new Or<Object>(Constant.TRUE)).test("xyzzy"));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8896);assertTrue((new Or<Object>(Constant.FALSE,Constant.TRUE)).test("xyzzy"));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8897);assertTrue((new Or<Object>(Constant.FALSE,Constant.FALSE,Constant.TRUE)).test("xyzzy"));

        __CLR4_4_16v06v0kcq4sv3a.R.inc(8898);Or<Object> p = new Or<Object>(Constant.TRUE);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8899);assertTrue(p.test("xyzzy"));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8900);for (int i=0;(((i<10)&&(__CLR4_4_16v06v0kcq4sv3a.R.iget(8901)!=0|true))||(__CLR4_4_16v06v0kcq4sv3a.R.iget(8902)==0&false));i++) {{
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8903);p.or(Constant.of(i%2==0));
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8904);assertTrue(p.test("xyzzy"));
        }

        }__CLR4_4_16v06v0kcq4sv3a.R.inc(8905);Or<Object> q = new Or<Object>(Constant.TRUE);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8906);assertTrue(q.test("xyzzy"));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8907);for (int i=0;(((i<10)&&(__CLR4_4_16v06v0kcq4sv3a.R.iget(8908)!=0|true))||(__CLR4_4_16v06v0kcq4sv3a.R.iget(8909)==0&false));i++) {{
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8910);q.or(Constant.of(i%2==0));
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8911);assertTrue(q.test("xyzzy"));
        }

        }__CLR4_4_16v06v0kcq4sv3a.R.inc(8912);Or<Object> r = new Or<Object>(p,q);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8913);assertTrue(r.test("xyzzy"));
    }finally{__CLR4_4_16v06v0kcq4sv3a.R.flushNeeded();}}

    @Test
    public void testFalse() throws Exception {__CLR4_4_16v06v0kcq4sv3a.R.globalSliceStart(getClass().getName(),8914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5vdwo6vm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16v06v0kcq4sv3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16v06v0kcq4sv3a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestOr.testFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5vdwo6vm() throws Exception{try{__CLR4_4_16v06v0kcq4sv3a.R.inc(8914);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8915);assertTrue(!(new Or<Object>()).test("xyzzy"));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8916);assertTrue(!(new Or<Object>(Constant.FALSE)).test("xyzzy"));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8917);assertTrue(!(new Or<Object>(Constant.FALSE,Constant.FALSE)).test("xyzzy"));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8918);assertTrue(!(new Or<Object>(Constant.FALSE,Constant.FALSE,Constant.FALSE)).test("xyzzy"));

        __CLR4_4_16v06v0kcq4sv3a.R.inc(8919);Or<Object> p = new Or<Object>(Constant.FALSE);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8920);assertTrue(!p.test("xyzzy"));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8921);for (int i=0;(((i<10)&&(__CLR4_4_16v06v0kcq4sv3a.R.iget(8922)!=0|true))||(__CLR4_4_16v06v0kcq4sv3a.R.iget(8923)==0&false));i++) {{
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8924);p.or(Constant.FALSE);
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8925);assertTrue(!p.test("xyzzy"));
        }

        }__CLR4_4_16v06v0kcq4sv3a.R.inc(8926);Or<Object> q = new Or<Object>(Constant.FALSE);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8927);assertTrue(!q.test("xyzzy"));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8928);for (int i=0;(((i<10)&&(__CLR4_4_16v06v0kcq4sv3a.R.iget(8929)!=0|true))||(__CLR4_4_16v06v0kcq4sv3a.R.iget(8930)==0&false));i++) {{
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8931);q.or(Constant.FALSE);
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8932);assertTrue(!q.test("xyzzy"));
        }

        }__CLR4_4_16v06v0kcq4sv3a.R.inc(8933);Or<Object> r = new Or<Object>(p,q);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8934);assertTrue(!r.test("xyzzy"));
    }finally{__CLR4_4_16v06v0kcq4sv3a.R.flushNeeded();}}

    @Test
    public void testDuplicateAdd() throws Exception {__CLR4_4_16v06v0kcq4sv3a.R.globalSliceStart(getClass().getName(),8935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18atuof6w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16v06v0kcq4sv3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16v06v0kcq4sv3a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestOr.testDuplicateAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18atuof6w7() throws Exception{try{__CLR4_4_16v06v0kcq4sv3a.R.inc(8935);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8936);Predicate<Object> p = Constant.TRUE;
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8937);Or<Object> q = new Or<Object>(p,p);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8938);assertTrue(q.test("xyzzy"));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8939);for (int i=0;(((i<10)&&(__CLR4_4_16v06v0kcq4sv3a.R.iget(8940)!=0|true))||(__CLR4_4_16v06v0kcq4sv3a.R.iget(8941)==0&false));i++) {{
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8942);q.or(p);
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8943);assertTrue(q.test("xyzzy"));
        }
    }}finally{__CLR4_4_16v06v0kcq4sv3a.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_16v06v0kcq4sv3a.R.globalSliceStart(getClass().getName(),8944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6086wg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16v06v0kcq4sv3a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16v06v0kcq4sv3a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestOr.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6086wg() throws Exception{try{__CLR4_4_16v06v0kcq4sv3a.R.inc(8944);
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8945);Or<Object> p = new Or<Object>();
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8946);assertEquals(p,p);

        __CLR4_4_16v06v0kcq4sv3a.R.inc(8947);Or<Object> q = new Or<Object>();
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8948);assertObjectsAreEqual(p,q);

        __CLR4_4_16v06v0kcq4sv3a.R.inc(8949);And<Object> r = new And<Object>();
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8950);assertObjectsAreNotEqual(p,r);

        __CLR4_4_16v06v0kcq4sv3a.R.inc(8951);for (int i=0;(((i<3)&&(__CLR4_4_16v06v0kcq4sv3a.R.iget(8952)!=0|true))||(__CLR4_4_16v06v0kcq4sv3a.R.iget(8953)==0&false));i++) {{
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8954);p.or(Constant.truePredicate());
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8955);assertObjectsAreNotEqual(p,q);
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8956);q.or(Constant.truePredicate());
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8957);assertObjectsAreEqual(p,q);
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8958);r.and(Constant.truePredicate());
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8959);assertObjectsAreNotEqual(p,r);

            __CLR4_4_16v06v0kcq4sv3a.R.inc(8960);p.or(new Or<Object>(Constant.truePredicate(),Constant.falsePredicate()));
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8961);assertObjectsAreNotEqual(p,q);
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8962);q.or(new Or<Object>(Constant.truePredicate(),Constant.falsePredicate()));
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8963);assertObjectsAreEqual(p,q);
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8964);r.and(new Or<Object>(Constant.truePredicate(),Constant.falsePredicate()));
            __CLR4_4_16v06v0kcq4sv3a.R.inc(8965);assertObjectsAreNotEqual(p,r);
        }

        }__CLR4_4_16v06v0kcq4sv3a.R.inc(8966);assertObjectsAreNotEqual(p,Constant.truePredicate());
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8967);Or<Object> s = new Or<Object>();
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8968);s.or(Constant.truePredicate());
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8969);s.or(new Or<Object>(Constant.truePredicate(),Constant.falsePredicate()));
        __CLR4_4_16v06v0kcq4sv3a.R.inc(8970);assertObjectsAreEqual(s, new Or<Object>(s.getPredicateList()));
    }finally{__CLR4_4_16v06v0kcq4sv3a.R.flushNeeded();}}

}
