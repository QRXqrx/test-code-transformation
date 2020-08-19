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

package org.apache.commons.functor.range;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests for endpoint.
 *
 * @since 1.0
 * @version $Revision: $ $Date: $
 */
public class TestEndpoint {static class __CLR4_4_18y98y9kcq4svsj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,11629,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Endpoint<Integer> openEndpoint = new Endpoint<Integer>(1, BoundType.OPEN);
    private final Endpoint<Integer> closedEndpoint = new Endpoint<Integer>(2, BoundType.CLOSED);

    @Test
    public void testValue() {__CLR4_4_18y98y9kcq4svsj.R.globalSliceStart(getClass().getName(),11601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzkbqe8y9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18y98y9kcq4svsj.R.rethrow($CLV_t2$);}finally{__CLR4_4_18y98y9kcq4svsj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestEndpoint.testValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzkbqe8y9(){try{__CLR4_4_18y98y9kcq4svsj.R.inc(11601);
        __CLR4_4_18y98y9kcq4svsj.R.inc(11602);assertEquals(Integer.valueOf(1), openEndpoint.getValue());
        __CLR4_4_18y98y9kcq4svsj.R.inc(11603);assertEquals(Integer.valueOf(2), closedEndpoint.getValue());
    }finally{__CLR4_4_18y98y9kcq4svsj.R.flushNeeded();}}

    @Test
    public void testBoundType() {__CLR4_4_18y98y9kcq4svsj.R.globalSliceStart(getClass().getName(),11604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112a9kd8yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18y98y9kcq4svsj.R.rethrow($CLV_t2$);}finally{__CLR4_4_18y98y9kcq4svsj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestEndpoint.testBoundType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112a9kd8yc(){try{__CLR4_4_18y98y9kcq4svsj.R.inc(11604);
        __CLR4_4_18y98y9kcq4svsj.R.inc(11605);assertEquals(BoundType.OPEN, openEndpoint.getBoundType());
        __CLR4_4_18y98y9kcq4svsj.R.inc(11606);assertEquals(BoundType.CLOSED, closedEndpoint.getBoundType());
    }finally{__CLR4_4_18y98y9kcq4svsj.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_18y98y9kcq4svsj.R.globalSliceStart(getClass().getName(),11607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid8yf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18y98y9kcq4svsj.R.rethrow($CLV_t2$);}finally{__CLR4_4_18y98y9kcq4svsj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestEndpoint.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid8yf(){try{__CLR4_4_18y98y9kcq4svsj.R.inc(11607);
        __CLR4_4_18y98y9kcq4svsj.R.inc(11608);assertEquals("Endpoint<1, OPEN>", openEndpoint.toString());
        __CLR4_4_18y98y9kcq4svsj.R.inc(11609);assertEquals("Endpoint<2, CLOSED>", closedEndpoint.toString());
        __CLR4_4_18y98y9kcq4svsj.R.inc(11610);assertEquals("(1", openEndpoint.toLeftString());
        __CLR4_4_18y98y9kcq4svsj.R.inc(11611);assertEquals("[2", closedEndpoint.toLeftString());
        __CLR4_4_18y98y9kcq4svsj.R.inc(11612);assertEquals("1)", openEndpoint.toRightString());
        __CLR4_4_18y98y9kcq4svsj.R.inc(11613);assertEquals("2]", closedEndpoint.toRightString());
    }finally{__CLR4_4_18y98y9kcq4svsj.R.flushNeeded();}}

    @Test
    public void testEquals()
        throws Exception {__CLR4_4_18y98y9kcq4svsj.R.globalSliceStart(getClass().getName(),11614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6088ym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18y98y9kcq4svsj.R.rethrow($CLV_t2$);}finally{__CLR4_4_18y98y9kcq4svsj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.range.TestEndpoint.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),11614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6088ym() throws Exception{try{__CLR4_4_18y98y9kcq4svsj.R.inc(11614);
        // equals basic properties
        __CLR4_4_18y98y9kcq4svsj.R.inc(11615);Endpoint<Integer> endpoint = new Endpoint<Integer>(1, BoundType.OPEN);
        __CLR4_4_18y98y9kcq4svsj.R.inc(11616);assertEquals("equals must be reflexive", endpoint, endpoint);
        __CLR4_4_18y98y9kcq4svsj.R.inc(11617);assertEquals("hashCode must be reflexive", endpoint.hashCode(),
                     endpoint.hashCode());
        __CLR4_4_18y98y9kcq4svsj.R.inc(11618);assertTrue(!endpoint.equals(null)); // should be able to compare to null

        __CLR4_4_18y98y9kcq4svsj.R.inc(11619);Object endpoint2 = new Endpoint<Integer>(1, BoundType.OPEN);
        __CLR4_4_18y98y9kcq4svsj.R.inc(11620);if ((((endpoint.equals(endpoint2))&&(__CLR4_4_18y98y9kcq4svsj.R.iget(11621)!=0|true))||(__CLR4_4_18y98y9kcq4svsj.R.iget(11622)==0&false))) {{
            __CLR4_4_18y98y9kcq4svsj.R.inc(11623);assertEquals("equals implies hash equals", endpoint.hashCode(),
                         endpoint2.hashCode());
            __CLR4_4_18y98y9kcq4svsj.R.inc(11624);assertEquals("equals must be symmetric", endpoint2, endpoint);
        } }else {{
            __CLR4_4_18y98y9kcq4svsj.R.inc(11625);assertTrue("equals must be symmetric", !endpoint2.equals(endpoint));
        }

        }__CLR4_4_18y98y9kcq4svsj.R.inc(11626);Object differentEndpoint = new Endpoint<Integer>(1, BoundType.CLOSED);
        __CLR4_4_18y98y9kcq4svsj.R.inc(11627);assertTrue(!differentEndpoint.equals(endpoint));
        __CLR4_4_18y98y9kcq4svsj.R.inc(11628);assertTrue(differentEndpoint.hashCode() != endpoint.hashCode());
    }finally{__CLR4_4_18y98y9kcq4svsj.R.flushNeeded();}}

}
