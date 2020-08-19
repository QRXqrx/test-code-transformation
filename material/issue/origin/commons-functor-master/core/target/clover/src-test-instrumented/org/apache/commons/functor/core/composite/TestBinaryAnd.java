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

import java.util.Arrays;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
@SuppressWarnings("unchecked")
public class TestBinaryAnd extends BaseFunctorTest {static class __CLR4_4_1657657kcq4sux5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,8040,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_1657657kcq4sux5.R.inc(7963);
        __CLR4_4_1657657kcq4sux5.R.inc(7964);return new BinaryAnd<Object, Object>(Constant.TRUE, Constant.TRUE);
    }finally{__CLR4_4_1657657kcq4sux5.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testTrue() throws Exception {__CLR4_4_1657657kcq4sux5.R.globalSliceStart(getClass().getName(),7965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cy4y9l659();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1657657kcq4sux5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1657657kcq4sux5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestBinaryAnd.testTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cy4y9l659() throws Exception{try{__CLR4_4_1657657kcq4sux5.R.inc(7965);
        __CLR4_4_1657657kcq4sux5.R.inc(7966);assertTrue((new BinaryAnd<String, Integer>()).test("xyzzy",3));
        __CLR4_4_1657657kcq4sux5.R.inc(7967);assertTrue((new BinaryAnd<String, Integer>(Constant.TRUE)).test("xyzzy",3));
        __CLR4_4_1657657kcq4sux5.R.inc(7968);assertTrue((new BinaryAnd<String, Integer>(Constant.TRUE,Constant.TRUE)).test("xyzzy",3));
        __CLR4_4_1657657kcq4sux5.R.inc(7969);assertTrue((new BinaryAnd<String, Integer>(Constant.TRUE,Constant.TRUE,Constant.TRUE)).test("xyzzy",3));

        __CLR4_4_1657657kcq4sux5.R.inc(7970);BinaryAnd<String, Integer> p = new BinaryAnd<String, Integer>(Constant.TRUE);
        __CLR4_4_1657657kcq4sux5.R.inc(7971);assertTrue(p.test("xyzzy",3));
        __CLR4_4_1657657kcq4sux5.R.inc(7972);for (int i=0;(((i<10)&&(__CLR4_4_1657657kcq4sux5.R.iget(7973)!=0|true))||(__CLR4_4_1657657kcq4sux5.R.iget(7974)==0&false));i++) {{
            __CLR4_4_1657657kcq4sux5.R.inc(7975);p.and(Constant.TRUE);
            __CLR4_4_1657657kcq4sux5.R.inc(7976);assertTrue(p.test("xyzzy",3));
        }

        }__CLR4_4_1657657kcq4sux5.R.inc(7977);BinaryAnd<String, Integer> q = new BinaryAnd<String, Integer>(Constant.TRUE);
        __CLR4_4_1657657kcq4sux5.R.inc(7978);assertTrue(q.test("xyzzy",3));
        __CLR4_4_1657657kcq4sux5.R.inc(7979);for (int i=0;(((i<10)&&(__CLR4_4_1657657kcq4sux5.R.iget(7980)!=0|true))||(__CLR4_4_1657657kcq4sux5.R.iget(7981)==0&false));i++) {{
            __CLR4_4_1657657kcq4sux5.R.inc(7982);q.and(Constant.TRUE);
            __CLR4_4_1657657kcq4sux5.R.inc(7983);assertTrue(q.test("xyzzy",3));
        }

        }__CLR4_4_1657657kcq4sux5.R.inc(7984);BinaryAnd<String, Integer> r = new BinaryAnd<String, Integer>(p,q);
        __CLR4_4_1657657kcq4sux5.R.inc(7985);assertTrue(r.test("xyzzy",3));
    }finally{__CLR4_4_1657657kcq4sux5.R.flushNeeded();}}

    @Test
    public void testFalse() throws Exception {__CLR4_4_1657657kcq4sux5.R.globalSliceStart(getClass().getName(),7986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5vdwo65u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1657657kcq4sux5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1657657kcq4sux5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestBinaryAnd.testFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5vdwo65u() throws Exception{try{__CLR4_4_1657657kcq4sux5.R.inc(7986);
        __CLR4_4_1657657kcq4sux5.R.inc(7987);assertTrue(!(new BinaryAnd<String, Integer>(Constant.FALSE)).test("xyzzy",3));
        __CLR4_4_1657657kcq4sux5.R.inc(7988);assertTrue(!(new BinaryAnd<String, Integer>(Constant.TRUE,Constant.FALSE)).test("xyzzy",3));
        __CLR4_4_1657657kcq4sux5.R.inc(7989);assertTrue(!(new BinaryAnd<String, Integer>(Constant.TRUE,Constant.TRUE,Constant.FALSE)).test("xyzzy",3));

        __CLR4_4_1657657kcq4sux5.R.inc(7990);BinaryAnd<String, Integer> p = new BinaryAnd<String, Integer>(Constant.FALSE);
        __CLR4_4_1657657kcq4sux5.R.inc(7991);assertTrue(!p.test("xyzzy",3));
        __CLR4_4_1657657kcq4sux5.R.inc(7992);for (int i=0;(((i<10)&&(__CLR4_4_1657657kcq4sux5.R.iget(7993)!=0|true))||(__CLR4_4_1657657kcq4sux5.R.iget(7994)==0&false));i++) {{
            __CLR4_4_1657657kcq4sux5.R.inc(7995);p.and(Constant.FALSE);
            __CLR4_4_1657657kcq4sux5.R.inc(7996);assertTrue(!p.test("xyzzy",3));
        }

        }__CLR4_4_1657657kcq4sux5.R.inc(7997);BinaryAnd<String, Integer> q = new BinaryAnd<String, Integer>(Constant.TRUE);
        __CLR4_4_1657657kcq4sux5.R.inc(7998);assertTrue(q.test("xyzzy",3));
        __CLR4_4_1657657kcq4sux5.R.inc(7999);for (int i=0;(((i<10)&&(__CLR4_4_1657657kcq4sux5.R.iget(8000)!=0|true))||(__CLR4_4_1657657kcq4sux5.R.iget(8001)==0&false));i++) {{
            __CLR4_4_1657657kcq4sux5.R.inc(8002);q.and(Constant.TRUE);
            __CLR4_4_1657657kcq4sux5.R.inc(8003);assertTrue(q.test("xyzzy",3));
        }

        }__CLR4_4_1657657kcq4sux5.R.inc(8004);BinaryAnd<String, Integer> r = new BinaryAnd<String, Integer>(p,q);
        __CLR4_4_1657657kcq4sux5.R.inc(8005);assertTrue(!r.test("xyzzy",3));
    }finally{__CLR4_4_1657657kcq4sux5.R.flushNeeded();}}

    @Test
    public void testDuplicateAdd() throws Exception {__CLR4_4_1657657kcq4sux5.R.globalSliceStart(getClass().getName(),8006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18atuof66e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1657657kcq4sux5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1657657kcq4sux5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestBinaryAnd.testDuplicateAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18atuof66e() throws Exception{try{__CLR4_4_1657657kcq4sux5.R.inc(8006);
        __CLR4_4_1657657kcq4sux5.R.inc(8007);BinaryPredicate<Object, Object> p = Constant.TRUE;
        __CLR4_4_1657657kcq4sux5.R.inc(8008);BinaryAnd<String, Integer> q = new BinaryAnd<String, Integer>(p,p);
        __CLR4_4_1657657kcq4sux5.R.inc(8009);assertTrue(q.test("xyzzy",3));
        __CLR4_4_1657657kcq4sux5.R.inc(8010);for (int i=0;(((i<10)&&(__CLR4_4_1657657kcq4sux5.R.iget(8011)!=0|true))||(__CLR4_4_1657657kcq4sux5.R.iget(8012)==0&false));i++) {{
            __CLR4_4_1657657kcq4sux5.R.inc(8013);q.and(p);
            __CLR4_4_1657657kcq4sux5.R.inc(8014);assertTrue(q.test("xyzzy",3));
        }
    }}finally{__CLR4_4_1657657kcq4sux5.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    @Test
    public void testEquals() throws Exception {__CLR4_4_1657657kcq4sux5.R.globalSliceStart(getClass().getName(),8015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e60866n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1657657kcq4sux5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1657657kcq4sux5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestBinaryAnd.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e60866n() throws Exception{try{__CLR4_4_1657657kcq4sux5.R.inc(8015);
        __CLR4_4_1657657kcq4sux5.R.inc(8016);BinaryAnd<Object, Object> p = new BinaryAnd<Object, Object>();
        __CLR4_4_1657657kcq4sux5.R.inc(8017);assertEquals(p,p);
        __CLR4_4_1657657kcq4sux5.R.inc(8018);BinaryAnd<Object, Object> q = new BinaryAnd<Object, Object>();
        __CLR4_4_1657657kcq4sux5.R.inc(8019);assertObjectsAreEqual(p,q);
        __CLR4_4_1657657kcq4sux5.R.inc(8020);BinaryOr<Object, Object> r = new BinaryOr<Object, Object>();
        __CLR4_4_1657657kcq4sux5.R.inc(8021);assertObjectsAreNotEqual(p,r);

        __CLR4_4_1657657kcq4sux5.R.inc(8022);for (int i=0;(((i<3)&&(__CLR4_4_1657657kcq4sux5.R.iget(8023)!=0|true))||(__CLR4_4_1657657kcq4sux5.R.iget(8024)==0&false));i++) {{
            __CLR4_4_1657657kcq4sux5.R.inc(8025);p.and(Constant.truePredicate());
            __CLR4_4_1657657kcq4sux5.R.inc(8026);assertObjectsAreNotEqual(p,q);
            __CLR4_4_1657657kcq4sux5.R.inc(8027);q.and(Constant.truePredicate());
            __CLR4_4_1657657kcq4sux5.R.inc(8028);assertObjectsAreEqual(p,q);
            __CLR4_4_1657657kcq4sux5.R.inc(8029);p.and(new BinaryAnd<Object, Object>(Constant.truePredicate(),Constant.falsePredicate()));
            __CLR4_4_1657657kcq4sux5.R.inc(8030);assertObjectsAreNotEqual(p,q);
            __CLR4_4_1657657kcq4sux5.R.inc(8031);q.and(new BinaryAnd<Object, Object>(Constant.truePredicate(),Constant.falsePredicate()));
            __CLR4_4_1657657kcq4sux5.R.inc(8032);assertObjectsAreEqual(p,q);
        }

        }__CLR4_4_1657657kcq4sux5.R.inc(8033);assertObjectsAreNotEqual(p,Constant.truePredicate());
        __CLR4_4_1657657kcq4sux5.R.inc(8034);Iterable<BinaryPredicate<Object, Object>> iterable = Arrays.<BinaryPredicate<Object, Object>>asList(
           (BinaryPredicate<Object, Object>)Constant.truePredicate());
        __CLR4_4_1657657kcq4sux5.R.inc(8035);assertObjectsAreNotEqual(p,new BinaryAnd(iterable));
        __CLR4_4_1657657kcq4sux5.R.inc(8036);assertObjectsAreNotEqual(p,new BinaryAnd((Iterable<BinaryPredicate<Object, Object>>)null));
        __CLR4_4_1657657kcq4sux5.R.inc(8037);assertObjectsAreNotEqual(p,new BinaryAnd((BinaryPredicate<Object, Object>[])null));
        __CLR4_4_1657657kcq4sux5.R.inc(8038);assertObjectsAreNotEqual(p,new BinaryAnd((BinaryPredicate<Object, Object>)null));
        __CLR4_4_1657657kcq4sux5.R.inc(8039);assertTrue(!p.equals(null));
    }finally{__CLR4_4_1657657kcq4sux5.R.flushNeeded();}}

}
