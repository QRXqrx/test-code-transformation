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
public class TestBinaryOr extends BaseFunctorTest {static class __CLR4_4_168n68nkcq4suy5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,8168,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {try{__CLR4_4_168n68nkcq4suy5.R.inc(8087);
        __CLR4_4_168n68nkcq4suy5.R.inc(8088);return new BinaryOr<Object, Object>(Constant.FALSE, Constant.TRUE);
    }finally{__CLR4_4_168n68nkcq4suy5.R.flushNeeded();}}

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testTrue() throws Exception {__CLR4_4_168n68nkcq4suy5.R.globalSliceStart(getClass().getName(),8089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cy4y9l68p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nkcq4suy5.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nkcq4suy5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestBinaryOr.testTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cy4y9l68p() throws Exception{try{__CLR4_4_168n68nkcq4suy5.R.inc(8089);
        __CLR4_4_168n68nkcq4suy5.R.inc(8090);assertTrue((new BinaryOr<Object, Object>(Constant.TRUE)).test("xyzzy", Integer.valueOf(3)));
        __CLR4_4_168n68nkcq4suy5.R.inc(8091);assertTrue((new BinaryOr<Object, Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy", Integer.valueOf(3)));
        __CLR4_4_168n68nkcq4suy5.R.inc(8092);assertTrue((new BinaryOr<Object, Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy",
            Integer.valueOf(3)));

        __CLR4_4_168n68nkcq4suy5.R.inc(8093);BinaryOr<Object, Object> p = new BinaryOr<Object, Object>(Constant.TRUE);
        __CLR4_4_168n68nkcq4suy5.R.inc(8094);assertTrue(p.test("xyzzy", Integer.valueOf(3)));
        __CLR4_4_168n68nkcq4suy5.R.inc(8095);for (int i = 0; (((i < 10)&&(__CLR4_4_168n68nkcq4suy5.R.iget(8096)!=0|true))||(__CLR4_4_168n68nkcq4suy5.R.iget(8097)==0&false)); i++) {{
            __CLR4_4_168n68nkcq4suy5.R.inc(8098);p.or(Constant.of(i % 2 == 0));
            __CLR4_4_168n68nkcq4suy5.R.inc(8099);assertTrue(p.test("xyzzy", Integer.valueOf(3)));
        }

        }__CLR4_4_168n68nkcq4suy5.R.inc(8100);BinaryOr<Object, Object> q = new BinaryOr<Object, Object>(Constant.TRUE);
        __CLR4_4_168n68nkcq4suy5.R.inc(8101);assertTrue(q.test("xyzzy", Integer.valueOf(3)));
        __CLR4_4_168n68nkcq4suy5.R.inc(8102);for (int i = 0; (((i < 10)&&(__CLR4_4_168n68nkcq4suy5.R.iget(8103)!=0|true))||(__CLR4_4_168n68nkcq4suy5.R.iget(8104)==0&false)); i++) {{
            __CLR4_4_168n68nkcq4suy5.R.inc(8105);q.or(Constant.of(i % 2 == 0));
            __CLR4_4_168n68nkcq4suy5.R.inc(8106);assertTrue(q.test("xyzzy", Integer.valueOf(3)));
        }

        }__CLR4_4_168n68nkcq4suy5.R.inc(8107);BinaryOr<Object, Object> r = new BinaryOr<Object, Object>(p, q);
        __CLR4_4_168n68nkcq4suy5.R.inc(8108);assertTrue(r.test("xyzzy", Integer.valueOf(3)));
    }finally{__CLR4_4_168n68nkcq4suy5.R.flushNeeded();}}

    @Test
    public void testFalse() throws Exception {__CLR4_4_168n68nkcq4suy5.R.globalSliceStart(getClass().getName(),8109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5vdwo699();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nkcq4suy5.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nkcq4suy5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestBinaryOr.testFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5vdwo699() throws Exception{try{__CLR4_4_168n68nkcq4suy5.R.inc(8109);
        __CLR4_4_168n68nkcq4suy5.R.inc(8110);assertTrue(!(new BinaryOr<Object, Object>()).test("xyzzy", Integer.valueOf(3)));
        __CLR4_4_168n68nkcq4suy5.R.inc(8111);assertTrue(!(new BinaryOr<Object, Object>(Constant.FALSE)).test("xyzzy", Integer.valueOf(3)));
        __CLR4_4_168n68nkcq4suy5.R.inc(8112);assertTrue(!(new BinaryOr<Object, Object>(Constant.FALSE, Constant.FALSE)).test("xyzzy", Integer.valueOf(3)));
        __CLR4_4_168n68nkcq4suy5.R.inc(8113);assertTrue(!(new BinaryOr<Object, Object>(Constant.FALSE, Constant.FALSE, Constant.FALSE)).test("xyzzy",
            Integer.valueOf(3)));

        __CLR4_4_168n68nkcq4suy5.R.inc(8114);BinaryOr<Object, Object> p = new BinaryOr<Object, Object>(Constant.FALSE);
        __CLR4_4_168n68nkcq4suy5.R.inc(8115);assertTrue(!p.test("xyzzy", Integer.valueOf(3)));
        __CLR4_4_168n68nkcq4suy5.R.inc(8116);for (int i = 0; (((i < 10)&&(__CLR4_4_168n68nkcq4suy5.R.iget(8117)!=0|true))||(__CLR4_4_168n68nkcq4suy5.R.iget(8118)==0&false)); i++) {{
            __CLR4_4_168n68nkcq4suy5.R.inc(8119);p.or(Constant.FALSE);
            __CLR4_4_168n68nkcq4suy5.R.inc(8120);assertTrue(!p.test("xyzzy", Integer.valueOf(3)));
        }

        }__CLR4_4_168n68nkcq4suy5.R.inc(8121);BinaryOr<Object, Object> q = new BinaryOr<Object, Object>(Constant.FALSE);
        __CLR4_4_168n68nkcq4suy5.R.inc(8122);assertTrue(!q.test("xyzzy", Integer.valueOf(3)));
        __CLR4_4_168n68nkcq4suy5.R.inc(8123);for (int i = 0; (((i < 10)&&(__CLR4_4_168n68nkcq4suy5.R.iget(8124)!=0|true))||(__CLR4_4_168n68nkcq4suy5.R.iget(8125)==0&false)); i++) {{
            __CLR4_4_168n68nkcq4suy5.R.inc(8126);q.or(Constant.FALSE);
            __CLR4_4_168n68nkcq4suy5.R.inc(8127);assertTrue(!q.test("xyzzy", Integer.valueOf(3)));
        }

        }__CLR4_4_168n68nkcq4suy5.R.inc(8128);BinaryOr<Object, Object> r = new BinaryOr<Object, Object>(p, q);
        __CLR4_4_168n68nkcq4suy5.R.inc(8129);assertTrue(!r.test("xyzzy", Integer.valueOf(3)));
    }finally{__CLR4_4_168n68nkcq4suy5.R.flushNeeded();}}

    @Test
    public void testDuplicateAdd() throws Exception {__CLR4_4_168n68nkcq4suy5.R.globalSliceStart(getClass().getName(),8130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18atuof69u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nkcq4suy5.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nkcq4suy5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestBinaryOr.testDuplicateAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18atuof69u() throws Exception{try{__CLR4_4_168n68nkcq4suy5.R.inc(8130);
        __CLR4_4_168n68nkcq4suy5.R.inc(8131);BinaryPredicate<Object, Object> p = Constant.TRUE;
        __CLR4_4_168n68nkcq4suy5.R.inc(8132);BinaryOr<Object, Object> q = new BinaryOr<Object, Object>(p, p);
        __CLR4_4_168n68nkcq4suy5.R.inc(8133);assertTrue(q.test("xyzzy", Integer.valueOf(3)));
        __CLR4_4_168n68nkcq4suy5.R.inc(8134);for (int i = 0; (((i < 10)&&(__CLR4_4_168n68nkcq4suy5.R.iget(8135)!=0|true))||(__CLR4_4_168n68nkcq4suy5.R.iget(8136)==0&false)); i++) {{
            __CLR4_4_168n68nkcq4suy5.R.inc(8137);q.or(p);
            __CLR4_4_168n68nkcq4suy5.R.inc(8138);assertTrue(q.test("xyzzy", Integer.valueOf(3)));
        }
    }}finally{__CLR4_4_168n68nkcq4suy5.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    @Test
    public void testEquals() throws Exception {__CLR4_4_168n68nkcq4suy5.R.globalSliceStart(getClass().getName(),8139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6086a3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nkcq4suy5.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nkcq4suy5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.core.composite.TestBinaryOr.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6086a3() throws Exception{try{__CLR4_4_168n68nkcq4suy5.R.inc(8139);
        __CLR4_4_168n68nkcq4suy5.R.inc(8140);BinaryOr<Object, Object> p = new BinaryOr<Object, Object>();
        __CLR4_4_168n68nkcq4suy5.R.inc(8141);assertEquals(p, p);

        __CLR4_4_168n68nkcq4suy5.R.inc(8142);BinaryOr<Object, Object> q = new BinaryOr<Object, Object>();
        __CLR4_4_168n68nkcq4suy5.R.inc(8143);assertObjectsAreEqual(p, q);

        __CLR4_4_168n68nkcq4suy5.R.inc(8144);BinaryAnd<Object, Object> r = new BinaryAnd<Object, Object>();
        __CLR4_4_168n68nkcq4suy5.R.inc(8145);assertObjectsAreNotEqual(p, r);

        __CLR4_4_168n68nkcq4suy5.R.inc(8146);for (int i = 0; (((i < 3)&&(__CLR4_4_168n68nkcq4suy5.R.iget(8147)!=0|true))||(__CLR4_4_168n68nkcq4suy5.R.iget(8148)==0&false)); i++) {{
            __CLR4_4_168n68nkcq4suy5.R.inc(8149);p.or(Constant.TRUE);
            __CLR4_4_168n68nkcq4suy5.R.inc(8150);assertObjectsAreNotEqual(p, q);
            __CLR4_4_168n68nkcq4suy5.R.inc(8151);q.or(Constant.TRUE);
            __CLR4_4_168n68nkcq4suy5.R.inc(8152);assertObjectsAreEqual(p, q);
            __CLR4_4_168n68nkcq4suy5.R.inc(8153);r.and(Constant.TRUE);
            __CLR4_4_168n68nkcq4suy5.R.inc(8154);assertObjectsAreNotEqual(p, r);

            __CLR4_4_168n68nkcq4suy5.R.inc(8155);p.or(new BinaryOr<Object, Object>(Constant.truePredicate(), Constant.FALSE));
            __CLR4_4_168n68nkcq4suy5.R.inc(8156);assertObjectsAreNotEqual(p, q);
            __CLR4_4_168n68nkcq4suy5.R.inc(8157);q.or(new BinaryOr<Object, Object>(Constant.truePredicate(), Constant.FALSE));
            __CLR4_4_168n68nkcq4suy5.R.inc(8158);assertObjectsAreEqual(p, q);
            __CLR4_4_168n68nkcq4suy5.R.inc(8159);r.and(new BinaryOr<Object, Object>(Constant.truePredicate(), Constant.FALSE));
            __CLR4_4_168n68nkcq4suy5.R.inc(8160);assertObjectsAreNotEqual(p, r);
        }

        }__CLR4_4_168n68nkcq4suy5.R.inc(8161);assertObjectsAreNotEqual(p, Constant.TRUE);
        __CLR4_4_168n68nkcq4suy5.R.inc(8162);Iterable<BinaryPredicate<Object, Object>> iterable =
            Arrays.<BinaryPredicate<Object, Object>> asList((BinaryPredicate<Object, Object>) Constant.truePredicate());
        __CLR4_4_168n68nkcq4suy5.R.inc(8163);assertObjectsAreNotEqual(p, new BinaryOr(iterable));
        __CLR4_4_168n68nkcq4suy5.R.inc(8164);assertObjectsAreNotEqual(p, new BinaryOr((Iterable<BinaryPredicate<Object, Object>>) null));
        __CLR4_4_168n68nkcq4suy5.R.inc(8165);assertObjectsAreNotEqual(p, new BinaryOr((BinaryPredicate<Object, Object>[]) null));
        __CLR4_4_168n68nkcq4suy5.R.inc(8166);assertObjectsAreNotEqual(p, new BinaryOr((BinaryPredicate<Object, Object>) null));
        __CLR4_4_168n68nkcq4suy5.R.inc(8167);assertTrue(!p.equals(null));
    }finally{__CLR4_4_168n68nkcq4suy5.R.flushNeeded();}}

}
