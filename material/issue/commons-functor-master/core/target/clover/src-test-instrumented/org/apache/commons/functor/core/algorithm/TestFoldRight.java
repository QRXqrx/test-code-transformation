/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */
/*
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;
import org.junit.Test;

/**
 * Tests {@link FoldRight} algorithm.
 */
public class TestFoldRight extends BaseFunctorTest {

    static class __CLR4_4_15bz5bzkcq4sunl {

        public static com_atlassian_clover.CoverageRecorder R;

        public static com_atlassian_clover.CloverProfile[] profiles = {};

        @java.lang.SuppressWarnings("unchecked")
        public static <I, T extends I> I lambdaInc(final int i, final T l, final int si) {
            java.lang.reflect.InvocationHandler h = new java.lang.reflect.InvocationHandler() {

                public java.lang.Object invoke(java.lang.Object p, java.lang.reflect.Method m, java.lang.Object[] a) throws Throwable {
                    R.inc(i);
                    R.inc(si);
                    try {
                        return m.invoke(l, a);
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        throw e.getCause() != null ? e.getCause() : new RuntimeException("Clover failed to invoke instrumented lambda", e);
                    }
                }
            };
            return (I) java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(), l.getClass().getInterfaces(), h);
        }

        static {
            com_atlassian_clover.CoverageRecorder _R = null;
            try {
                com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();
                if (2019101123313948L != com_atlassian_clover.CloverVersionInfo.getBuildStamp()) {
                    com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");
                    com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime=" + com_atlassian_clover.CloverVersionInfo.getReleaseNum() + "#" + com_atlassian_clover.CloverVersionInfo.getBuildStamp());
                }
                R = com_atlassian_clover.Clover.getNullRecorder();
                _R = com_atlassian_clover.Clover.getNullRecorder();
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 6936, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
            } catch (java.lang.SecurityException e) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. (" + e.getClass() + ":" + e.getMessage() + ")");
            } catch (java.lang.NoClassDefFoundError e) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? (" + e.getClass() + ":" + e.getMessage() + ")");
            } catch (java.lang.Throwable t) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. (" + t.getClass() + ":" + t.getMessage() + ")");
            }
            R = _R;
        }
    }

    public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER = com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected Object makeFunctor() throws Exception {
        try {
            __CLR4_4_15bz5bzkcq4sunl.R.inc(6911);
            __CLR4_4_15bz5bzkcq4sunl.R.inc(6912);
            return new FoldRight<Object>(new StringConcatenator());
        } finally {
            __CLR4_4_15bz5bzkcq4sunl.R.flushNeeded();
        }
    }

    @Test
    public void testFoldRight() {
        __CLR4_4_15bz5bzkcq4sunl.R.globalSliceStart(getClass().getName(), 6913);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1tugfqo5c1();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15bz5bzkcq4sunl.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15bz5bzkcq4sunl.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.algorithm.TestFoldRight.testFoldRight", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 6913, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1tugfqo5c1() {
        try {
            __CLR4_4_15bz5bzkcq4sunl.R.inc(6913);
            __CLR4_4_15bz5bzkcq4sunl.R.inc(6914);
            FoldRight<Object> foldRight = new FoldRight<Object>(new BinaryFunction<Object, Object, Object>() {

                public Object evaluate(Object left, Object right) {
                    try {
                        __CLR4_4_15bz5bzkcq4sunl.R.inc(6915);
                        __CLR4_4_15bz5bzkcq4sunl.R.inc(6916);
                        StringBuilder buf = (((left instanceof StringBuilder) && (__CLR4_4_15bz5bzkcq4sunl.R.iget(6917) != 0 | true)) || (__CLR4_4_15bz5bzkcq4sunl.R.iget(6918) == 0 & false)) ? (StringBuilder) left : new StringBuilder().append(left);
                        __CLR4_4_15bz5bzkcq4sunl.R.inc(6919);
                        return buf.append(right);
                    } finally {
                        __CLR4_4_15bz5bzkcq4sunl.R.flushNeeded();
                    }
                }
            });
            __CLR4_4_15bz5bzkcq4sunl.R.inc(6920);
            assertEquals("0123456789", foldRight.evaluate(IteratorToGeneratorAdapter.adapt(list.iterator())).toString());
            __CLR4_4_15bz5bzkcq4sunl.R.inc(6921);
            assertEquals("0123456789x", foldRight.evaluate(IteratorToGeneratorAdapter.adapt(list.iterator()), "x").toString());
            __CLR4_4_15bz5bzkcq4sunl.R.inc(6922);
            assertEquals("x", foldRight.evaluate(IteratorToGeneratorAdapter.adapt(new ArrayList<Object>().iterator()), "x").toString());
        } finally {
            __CLR4_4_15bz5bzkcq4sunl.R.flushNeeded();
        }
    }

    // Attributes
    // ------------------------------------------------------------------------
    private List<Object> list = Arrays.<Object>asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

    // Classes
    // ------------------------------------------------------------------------
    static class StringConcatenator implements BinaryFunction<Object, Object, Object> {

        public Object evaluate(Object left, Object right) {
            try {
                __CLR4_4_15bz5bzkcq4sunl.R.inc(6923);
                __CLR4_4_15bz5bzkcq4sunl.R.inc(6924);
                StringBuilder buf = (((left instanceof StringBuilder) && (__CLR4_4_15bz5bzkcq4sunl.R.iget(6925) != 0 | true)) || (__CLR4_4_15bz5bzkcq4sunl.R.iget(6926) == 0 & false)) ? (StringBuilder) left : new StringBuilder().append(left);
                __CLR4_4_15bz5bzkcq4sunl.R.inc(6927);
                return buf.append(right);
            } finally {
                __CLR4_4_15bz5bzkcq4sunl.R.flushNeeded();
            }
        }

        @Override
        public boolean equals(Object obj) {
            try {
                __CLR4_4_15bz5bzkcq4sunl.R.inc(6928);
                __CLR4_4_15bz5bzkcq4sunl.R.inc(6929);
                if ((((this == obj) && (__CLR4_4_15bz5bzkcq4sunl.R.iget(6930) != 0 | true)) || (__CLR4_4_15bz5bzkcq4sunl.R.iget(6931) == 0 & false))) {
                    {
                        __CLR4_4_15bz5bzkcq4sunl.R.inc(6932);
                        return true;
                    }
                }
                __CLR4_4_15bz5bzkcq4sunl.R.inc(6933);
                return obj != null && obj instanceof StringConcatenator;
            } finally {
                __CLR4_4_15bz5bzkcq4sunl.R.flushNeeded();
            }
        }

        @Override
        public int hashCode() {
            try {
                __CLR4_4_15bz5bzkcq4sunl.R.inc(6934);
                __CLR4_4_15bz5bzkcq4sunl.R.inc(6935);
                return "StringConcatenator".hashCode();
            } finally {
                __CLR4_4_15bz5bzkcq4sunl.R.flushNeeded();
            }
        }
    }
}

