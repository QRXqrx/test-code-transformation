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
package org.apache.commons.functor.range;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for double range.
 *
 * @since 1.0
 * @version $Revision: $ $Date: $
 */
public class TestDoubleRange extends BaseFunctorTest {

    static class __CLR4_4_18pl8plkcq4svs9 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 11601, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    // A base range with all longs between -6 and 6
    private final List<Double> fullRange = Collections.unmodifiableList(Arrays.asList(-6.0, -5.0, -4.0, -3.0, -2.0, -1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0));

    // Attributes
    // ------------------------------------------------------------------------
    private DoubleRange ascDoubleRange = null;

    private DoubleRange descDoubleRange = null;

    private Collection<Double> expectedAsc = null;

    private Collection<Double> expectedDesc = null;

    // Test set up
    // ------------------------------------------------------------------------
    @Before
    public void setUp() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11289);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11290);
            ascDoubleRange = Ranges.doubleRange(0.0d, 10.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11291);
            descDoubleRange = Ranges.doubleRange(10.0d, 0.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11292);
            expectedAsc = Arrays.asList(0.0d, 1.0d, 2.0d, 3.0d, 4.0d, 5.0d, 6.0d, 7.0d, 8.0d, 9.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11293);
            expectedDesc = Arrays.asList(10.0d, 9.0d, 8.0d, 7.0d, 6.0d, 5.0d, 4.0d, 3.0d, 2.0d, 1.0d);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @After
    public void tearDown() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11294);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11295);
            ascDoubleRange = null;
            __CLR4_4_18pl8plkcq4svs9.R.inc(11296);
            descDoubleRange = null;
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Override
    protected Object makeFunctor() throws Exception {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11297);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11298);
            return Ranges.doubleRange(10, 20);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    // Generator tests
    // ---------------------------------------------------------------
    @Test
    public void testGenerateListExample() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11299);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1q5ey48pv();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testGenerateListExample", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11299, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1q5ey48pv() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11299);
            // generates a collection of Doubles from 0 (inclusive) to 10
            // (exclusive)
            {
                __CLR4_4_18pl8plkcq4svs9.R.inc(11300);
                List<? super Double> list = (List<? super Double>) (IteratorToGeneratorAdapter.adapt(Ranges.doubleRange(0, 10)).to(new ArrayList<Double>()));
                __CLR4_4_18pl8plkcq4svs9.R.inc(11301);
                for (int i = 0; (((i < 10) && (__CLR4_4_18pl8plkcq4svs9.R.iget(11302) != 0 | true)) || (__CLR4_4_18pl8plkcq4svs9.R.iget(11303) == 0 & false)); i++) {
                    {
                        __CLR4_4_18pl8plkcq4svs9.R.inc(11304);
                        assertEquals(Double.valueOf(i), list.get(i));
                    }
                }
            }
            // generates a collection of Doubles from 10 (inclusive) to 0
            // (exclusive)
            {
                __CLR4_4_18pl8plkcq4svs9.R.inc(11305);
                List<? super Double> list = (List<? super Double>) (IteratorToGeneratorAdapter.adapt(Ranges.doubleRange(10, 0)).to(new ArrayList<Double>()));
                __CLR4_4_18pl8plkcq4svs9.R.inc(11306);
                for (int i = 10; (((i > 0) && (__CLR4_4_18pl8plkcq4svs9.R.iget(11307) != 0 | true)) || (__CLR4_4_18pl8plkcq4svs9.R.iget(11308) == 0 & false)); i--) {
                    {
                        __CLR4_4_18pl8plkcq4svs9.R.inc(11309);
                        assertEquals(Double.valueOf(i), list.get(10 - i));
                    }
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testStepChecking() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11310);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1iejfb58q6();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testStepChecking", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11310, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1iejfb58q6() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11310);
            {
                // step of 0 is ok when range is empty
                __CLR4_4_18pl8plkcq4svs9.R.inc(11311);
                // step of 0 is ok when range is empty
                Ranges.doubleRange(2, 2, 0);
            }
            {
                // positive step is ok when range is
                __CLR4_4_18pl8plkcq4svs9.R.inc(11312);
                // positive step is ok when range is
                Ranges.doubleRange(2, 2, 1);
            // empty
            }
            {
                // negative step is ok when range is
                __CLR4_4_18pl8plkcq4svs9.R.inc(11313);
                // negative step is ok when range is
                Ranges.doubleRange(2, 2, -1);
            // empty
            }
            {
                // big steps are ok
                __CLR4_4_18pl8plkcq4svs9.R.inc(11314);
                // big steps are ok
                Ranges.doubleRange(0, 1, 10);
            }
            {
                // big steps are ok
                __CLR4_4_18pl8plkcq4svs9.R.inc(11315);
                // big steps are ok
                Ranges.doubleRange(1, 0, -10);
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11316);
            try {
                __CLR4_4_18pl8plkcq4svs9.R.inc(11317);
                Ranges.doubleRange(0, 1, 0);
                __CLR4_4_18pl8plkcq4svs9.R.inc(11318);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11319);
            try {
                __CLR4_4_18pl8plkcq4svs9.R.inc(11320);
                Ranges.doubleRange(0, 1, -1);
                __CLR4_4_18pl8plkcq4svs9.R.inc(11321);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11322);
            try {
                __CLR4_4_18pl8plkcq4svs9.R.inc(11323);
                Ranges.doubleRange(0, -1, 1);
                __CLR4_4_18pl8plkcq4svs9.R.inc(11324);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testObjectConstructor() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11325);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_17io3rk8ql();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testObjectConstructor", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11325, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_17io3rk8ql() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11325);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11326);
            DoubleRange range = Ranges.doubleRange(Double.valueOf(0), Double.valueOf(5));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11327);
            assertEquals("[0.0, 1.0, 2.0, 3.0, 4.0]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11328);
            range = Ranges.doubleRange(Double.valueOf(0), Double.valueOf(5), Double.valueOf(1));
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testReverseStep() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11329);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1wsfo2r8qp();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testReverseStep", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11329, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1wsfo2r8qp() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11329);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11330);
            DoubleRange range = Ranges.doubleRange(10, 0, -2);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11331);
            assertEquals("[10.0, 8.0, 6.0, 4.0, 2.0]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testStep() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11332);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1zeikn98qs();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testStep", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11332, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1zeikn98qs() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11332);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11333);
            DoubleRange range = Ranges.doubleRange(0, 10, 2);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11334);
            assertEquals("[0.0, 2.0, 4.0, 6.0, 8.0]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testForwardRange() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11335);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ml8d9t8qv();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testForwardRange", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11335, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ml8d9t8qv() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11335);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11336);
            DoubleRange range = Ranges.doubleRange(0, 5);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11337);
            assertEquals("[0.0, 1.0, 2.0, 3.0, 4.0]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testReverseRange() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11338);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ekuvjg8qy();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testReverseRange", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11338, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ekuvjg8qy() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11338);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11339);
            DoubleRange range = Ranges.doubleRange(5, 0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11340);
            assertEquals("[5.0, 4.0, 3.0, 2.0, 1.0]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    // @Test
    // public void testEdgeCase() {
    // DoubleRange range = Ranges.doubleRange(Double.MAX_VALUE - 3.0d,
    // Double.MAX_VALUE);
    // assertEquals("[9223372036854775804, 9223372036854775805, 9223372036854775806]",
    // IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    // assertEquals("[9223372036854775804, 9223372036854775805, 9223372036854775806]",
    // IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    // }
    @Test
    public void testBoundaries() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11341);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1lisq698r1();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testBoundaries", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11341, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1lisq698r1() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11341);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11342);
            DoubleRange range = Ranges.doubleRange(0.0d, 10.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11343);
            assertEquals(new Endpoint<Comparable<?>>(0.0d, BoundType.CLOSED), range.getLeftEndpoint());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11344);
            assertEquals(new Endpoint<Comparable<?>>(10.0d, BoundType.OPEN), range.getRightEndpoint());
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedAscending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11345);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1r33r578r5();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testClosedClosedAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11345, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1r33r578r5() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11345);
            // [-5.0d, 5.0d], 3.0d = -5.0d, -2.0d, 1.0d, 4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11346);
            DoubleRange range = Ranges.doubleRange(-5.0d, BoundType.CLOSED, 5.0d, BoundType.CLOSED, 3.0d);
            // [-5.0d, 5.0d], 3.0d = -5.0d, -2.0d, 1.0d, 4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11347);
            List<Double> expected = Arrays.asList(-5.0d, -2.0d, 1.0d, 4.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11348);
            Collection<Double> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11349);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedAscending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11350);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1amzjbd8ra();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testOpenClosedAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11350, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1amzjbd8ra() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11350);
            // (-5.0d, 5.0d], 3.0d = -2.0d, 1.0d, 4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11351);
            DoubleRange range = Ranges.doubleRange(-5.0d, BoundType.OPEN, 5.0d, BoundType.CLOSED, 3.0d);
            // (-5.0d, 5.0d], 3.0d = -2.0d, 1.0d, 4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11352);
            List<Double> expected = Arrays.asList(-2.0d, 1.0d, 4.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11353);
            Collection<Double> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11354);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenAscending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11355);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1b8ensn8rf();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testClosedOpenAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11355, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1b8ensn8rf() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11355);
            // [-5.0d, 5.0d), 3.0d = -5.0d, -2.0d, 1.0d, 4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11356);
            DoubleRange range = Ranges.doubleRange(-5.0d, BoundType.CLOSED, 5.0d, BoundType.OPEN, 3.0d);
            // (-5.0d, 5.0d], 3.0d = -5.0d, -2.0d, 1.0d, 4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11357);
            List<Double> expected = Arrays.asList(-5.0d, -2.0d, 1.0d, 4.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11358);
            Collection<Double> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11359);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenAscending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11360);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1xn9st58rk();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testOpenOpenAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11360, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1xn9st58rk() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11360);
            // (-5.0d, 5.0d), 3.0d = -2.0d, 1.0d, 4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11361);
            DoubleRange range = Ranges.doubleRange(-5.0d, BoundType.OPEN, 5.0d, BoundType.OPEN, 3.0d);
            // (-5.0d, 5.0d), 3.0d = -2.0d, 1.0d, 4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11362);
            List<Double> expected = Arrays.asList(-2.0d, 1.0d, 4.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11363);
            Collection<Double> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11364);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testSingleStepAscending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11365);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_17dbhev8rp();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testSingleStepAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11365, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_17dbhev8rp() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11365);
            // (-2.0d, 2.0d], 1.0d = -1.0d, 0.0d, 1.0d, 2.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11366);
            DoubleRange range = Ranges.doubleRange(-2.0d, BoundType.OPEN, 2.0d, BoundType.CLOSED, 1.0d);
            // (-2.0d, 2.0d], 1.0d = -1.0d, 0.0d, 1.0d, 2.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11367);
            List<Double> expected = Arrays.asList(-1.0d, 0.0d, 1.0d, 2.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11368);
            Collection<Double> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11369);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedDescending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11370);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1o63c5l8ru();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testClosedClosedDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11370, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1o63c5l8ru() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11370);
            // [5.0d, -5.0d], -3.0d = 5.0d, 2.0d, -1.0d, -4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11371);
            DoubleRange range = Ranges.doubleRange(5.0d, BoundType.CLOSED, -5.0d, BoundType.CLOSED, -3.0d);
            // [5.0d, -5.0d], -3.0d = 5.0d, 2.0d, -1.0d, -4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11372);
            List<Double> expected = Arrays.asList(5.0d, 2.0d, -1.0d, -4.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11373);
            Collection<Double> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11374);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedDescending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11375);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1y76cyh8rz();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testOpenClosedDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11375, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1y76cyh8rz() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11375);
            // (5.0d, -5.0d], -3.0d = 2.0d, -1.0d, -4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11376);
            DoubleRange range = Ranges.doubleRange(5.0d, BoundType.OPEN, -5.0d, BoundType.CLOSED, -3.0d);
            // (5.0d, -5.0d], -3.0d = 2.0d, -1.0d, -4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11377);
            List<Double> expected = Arrays.asList(2.0d, -1.0d, -4.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11378);
            Collection<Double> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11379);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenDescending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11380);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_14k19pj8s4();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testClosedOpenDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11380, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_14k19pj8s4() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11380);
            // [5.0d, -5.0d), -3.0d = 5.0d, 2.0d, -1.0d, -4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11381);
            DoubleRange range = Ranges.doubleRange(5.0d, BoundType.CLOSED, -5.0d, BoundType.OPEN, -3.0d);
            // [5.0d, -5.0d), -3.0d = 5.0d, 2.0d, -1.0d, -4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11382);
            List<Double> expected = Arrays.asList(5.0d, 2.0d, -1.0d, -4.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11383);
            Collection<Double> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11384);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenDescending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11385);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ay9ym38s9();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testOpenOpenDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11385, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ay9ym38s9() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11385);
            // (5.0d, -5.0d), -3.0d = 2.0d, -1.0d, -4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11386);
            DoubleRange range = Ranges.doubleRange(5.0d, BoundType.OPEN, -5.0d, BoundType.OPEN, -3.0d);
            // (5.0d, -5.0d), -3.0d = 2.0d, -1.0d, -4.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11387);
            List<Double> expected = Arrays.asList(2.0d, -1.0d, -4.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11388);
            Collection<Double> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11389);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testSingleStepDescending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11390);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_13wkry38se();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testSingleStepDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11390, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_13wkry38se() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11390);
            // [2.0d, -2.0d), -1.0d = 2.0d, 1.0d, 0.0d, -1.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11391);
            DoubleRange range = Ranges.doubleRange(2.0d, BoundType.CLOSED, -2.0d, BoundType.OPEN, -1.0d);
            // [2.0d, -2.0d), -1.0d = 2.0d, 1.0d, 0.0d, -1.0d
            __CLR4_4_18pl8plkcq4svs9.R.inc(11392);
            List<Double> expected = Arrays.asList(2.0d, 1.0d, 0.0d, -1.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11393);
            Collection<Double> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11394);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testAscending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11395);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1w4vjtf8sj();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11395, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1w4vjtf8sj() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11395);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11396);
            final List<Double> list = new ArrayList<Double>();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11397);
            for (double d : ascDoubleRange) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11398);
                    list.add(d);
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11399);
            assertTrue(expectedAsc.containsAll(list));
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testDescending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11400);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_19pdr8x8so();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11400, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_19pdr8x8so() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11400);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11401);
            final List<Double> list = new ArrayList<Double>();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11402);
            for (double d : descDoubleRange) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11403);
                    list.add(d);
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11404);
            assertTrue(expectedDesc.containsAll(list));
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testToCollection() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11405);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ett1qq8st();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testToCollection", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11405, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ett1qq8st() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11405);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11406);
            Collection<Double> ascCol = IteratorToGeneratorAdapter.adapt(ascDoubleRange).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11407);
            assertEquals("Different collections", expectedAsc, ascCol);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11408);
            Collection<Double> descCol = IteratorToGeneratorAdapter.adapt(descDoubleRange).toCollection();
            __CLR4_4_18pl8plkcq4svs9.R.inc(11409);
            assertEquals("Different collections", expectedDesc, descCol);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testTransformedGenerator() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11410);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_11mse9r8sy();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testTransformedGenerator", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11410, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_11mse9r8sy() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11410);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11411);
            double expected = 45.0d;
            __CLR4_4_18pl8plkcq4svs9.R.inc(11412);
            double total = IteratorToGeneratorAdapter.adapt(ascDoubleRange).to(new Function<Generator<? extends Double>, Double>() {

                public Double evaluate(Generator<? extends Double> obj) {
                    try {
                        __CLR4_4_18pl8plkcq4svs9.R.inc(11413);
                        __CLR4_4_18pl8plkcq4svs9.R.inc(11414);
                        double total = 0.0d;
                        __CLR4_4_18pl8plkcq4svs9.R.inc(11415);
                        for (Object element : obj.toCollection()) {
                            {
                                __CLR4_4_18pl8plkcq4svs9.R.inc(11416);
                                total += (Double) element;
                            }
                        }
                        __CLR4_4_18pl8plkcq4svs9.R.inc(11417);
                        return total;
                    } finally {
                        __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
                    }
                }
            });
            __CLR4_4_18pl8plkcq4svs9.R.inc(11418);
            assertTrue(expected == total);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11419);
            expected = 55.0d;
            __CLR4_4_18pl8plkcq4svs9.R.inc(11420);
            total = IteratorToGeneratorAdapter.adapt(descDoubleRange).to(new Function<Generator<? extends Double>, Double>() {

                public Double evaluate(Generator<? extends Double> obj) {
                    try {
                        __CLR4_4_18pl8plkcq4svs9.R.inc(11421);
                        __CLR4_4_18pl8plkcq4svs9.R.inc(11422);
                        double total = 0.0d;
                        __CLR4_4_18pl8plkcq4svs9.R.inc(11423);
                        for (Object element : obj.toCollection()) {
                            {
                                __CLR4_4_18pl8plkcq4svs9.R.inc(11424);
                                total += (Double) element;
                            }
                        }
                        __CLR4_4_18pl8plkcq4svs9.R.inc(11425);
                        return total;
                    } finally {
                        __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
                    }
                }
            });
            __CLR4_4_18pl8plkcq4svs9.R.inc(11426);
            assertTrue(expected == total);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    // Range tests
    // ---------------------------------------------------------------
    @Test
    public void testEmptyRanges() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11427);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1dlg7c8tf();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testEmptyRanges", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11427, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1dlg7c8tf() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11427);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11428);
            DoubleRange empty1 = Ranges.doubleRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11429);
            assertTrue("The range was expected to be empty.", empty1.isEmpty());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11430);
            DoubleRange empty2 = Ranges.doubleRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11431);
            assertTrue("The range was expected to be empty.", empty2.isEmpty());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11432);
            DoubleRange empty3 = Ranges.doubleRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11433);
            assertTrue("The range was expected to be empty.", empty3.isEmpty());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11434);
            DoubleRange empty4 = Ranges.doubleRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11435);
            assertTrue("The range was expected to be empty.", empty4.isEmpty());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11436);
            DoubleRange empty5 = Ranges.doubleRange(-3, BoundType.CLOSED, -3, BoundType.OPEN, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11437);
            assertTrue("The range was expected to be empty.", empty5.isEmpty());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11438);
            DoubleRange empty6 = Ranges.doubleRange(1, BoundType.OPEN, 0, BoundType.CLOSED, -2);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11439);
            assertTrue("The range was expected to be empty.", empty6.isEmpty());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11440);
            DoubleRange notEmpty1 = Ranges.doubleRange(-3, BoundType.CLOSED, -3, BoundType.CLOSED, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11441);
            assertFalse("The range was not expected to be empty.", notEmpty1.isEmpty());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11442);
            DoubleRange notEmpty2 = Ranges.doubleRange(-3, BoundType.OPEN, -2, BoundType.CLOSED, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11443);
            assertFalse("The range was not expected to be empty.", notEmpty2.isEmpty());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11444);
            DoubleRange notEmpty3 = Ranges.doubleRange(2, BoundType.OPEN, 1, BoundType.CLOSED, -1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11445);
            assertFalse("The range was not expected to be empty.", notEmpty3.isEmpty());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11446);
            DoubleRange notEmpty4 = Ranges.doubleRange(2, BoundType.CLOSED, 1, BoundType.OPEN, -1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11447);
            assertFalse("The range was not expected to be empty.", notEmpty4.isEmpty());
            __CLR4_4_18pl8plkcq4svs9.R.inc(11448);
            DoubleRange notEmpty5 = Ranges.doubleRange(1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11449);
            assertFalse("The range was not expected to be empty.", notEmpty5.isEmpty());
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedAscendingContains() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11450);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_16x8bm48u2();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testClosedClosedAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11450, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_16x8bm48u2() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11450);
            // [-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11451);
            DoubleRange range = Ranges.doubleRange(-5, BoundType.CLOSED, 5, BoundType.CLOSED, 3);
            // [-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11452);
            List<Double> arr = Arrays.asList(-5.0, -2.0, 1.0, 4.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11453);
            for (Double element : arr) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11454);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11455);
            List<Double> elementsNotPresent = new ArrayList<Double>(fullRange);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11456);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11457);
            for (Double element : elementsNotPresent) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11458);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedAscendingContains() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11459);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_198ttxy8ub();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testOpenClosedAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11459, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_198ttxy8ub() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11459);
            // (-5, 5], 3 = -2, 1, 4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11460);
            DoubleRange range = Ranges.doubleRange(-5, BoundType.OPEN, 5, BoundType.CLOSED, 3);
            // (-5, 5], 3 = -2, 1, 4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11461);
            List<Double> arr = Arrays.asList(-2.0, 1.0, 4.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11462);
            for (Double element : arr) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11463);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11464);
            List<Double> elementsNotPresent = new ArrayList<Double>(fullRange);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11465);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11466);
            for (Double element : elementsNotPresent) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11467);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenAscendingContains() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11468);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1grodw68uk();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testClosedOpenAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11468, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1grodw68uk() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11468);
            // [-5, 5), 3 = -5, -2, 1, 4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11469);
            DoubleRange range = Ranges.doubleRange(-5, BoundType.CLOSED, 5, BoundType.OPEN, 3);
            // (-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11470);
            List<Double> arr = Arrays.asList(-5.0, -2.0, 1.0, 4.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11471);
            for (Double element : arr) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11472);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11473);
            List<Double> elementsNotPresent = new ArrayList<Double>(fullRange);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11474);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11475);
            for (Double element : elementsNotPresent) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11476);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenAscendingContains() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11477);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_156iut48ut();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testOpenOpenAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11477, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_156iut48ut() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11477);
            // (-5, 5), 3 = -2, 1, 4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11478);
            DoubleRange range = Ranges.doubleRange(-5, BoundType.OPEN, 5, BoundType.OPEN, 3);
            // (-5, 5), 3 = -2, 1, 4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11479);
            List<Double> arr = Arrays.asList(-2.0, 1.0, 4.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11480);
            for (Double element : arr) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11481);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11482);
            List<Double> elementsNotPresent = new ArrayList<Double>(fullRange);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11483);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11484);
            for (Double element : elementsNotPresent) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11485);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testContainsSingleStepAscending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11486);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1a9vwbe8v2();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testContainsSingleStepAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11486, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1a9vwbe8v2() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11486);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_18pl8plkcq4svs9.R.inc(11487);
            DoubleRange ascendingRange = Ranges.doubleRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_18pl8plkcq4svs9.R.inc(11488);
            List<Double> arr = Arrays.asList(-1.0, 0.0, 1.0, 2.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11489);
            for (Double element : arr) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11490);
                    assertTrue("Expected element [" + element + "] is missing in range [" + ascendingRange + "]", ascendingRange.contains(element));
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11491);
            List<Double> elementsNotPresent = new ArrayList<Double>(fullRange);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11492);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11493);
            for (Double element : elementsNotPresent) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11494);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + ascendingRange + "]", ascendingRange.contains(element));
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedDescendingContains() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11495);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1rfbu088vb();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testClosedClosedDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11495, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1rfbu088vb() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11495);
            // [5, -5], -3 = 5, 2, -1, -4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11496);
            DoubleRange range = Ranges.doubleRange(5, BoundType.CLOSED, -5, BoundType.CLOSED, -3);
            // [5, -5], -3 = 5, 2, -1, -4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11497);
            List<Double> arr = Arrays.asList(5.0, 2.0, -1.0, -4.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11498);
            for (Double element : arr) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11499);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11500);
            List<Double> elementsNotPresent = new ArrayList<Double>(fullRange);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11501);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11502);
            for (Double element : elementsNotPresent) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11503);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedDescendingContains() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11504);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1vfe8g68vk();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testOpenClosedDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11504, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1vfe8g68vk() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11504);
            // (5, -5], -3 = 2, -1, -4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11505);
            DoubleRange range = Ranges.doubleRange(5, BoundType.OPEN, -5, BoundType.CLOSED, -3);
            // (5, -5], -3 = 2, -1, -4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11506);
            List<Double> arr = Arrays.asList(2.0, -1.0, -4.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11507);
            for (Double element : arr) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11508);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11509);
            List<Double> elementsNotPresent = new ArrayList<Double>(fullRange);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11510);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11511);
            for (Double element : elementsNotPresent) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11512);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenDescendingContains() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11513);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1jgqsze8vt();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testClosedOpenDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11513, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1jgqsze8vt() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11513);
            // [5, -5), -3 = 5, 2, -1, -4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11514);
            DoubleRange range = Ranges.doubleRange(5, BoundType.CLOSED, -5, BoundType.OPEN, -3);
            // [5, -5), -3 = 5, 2, -1, -4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11515);
            List<Double> arr = Arrays.asList(5.0, 2.0, -1.0, -4.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11516);
            for (Double element : arr) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11517);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11518);
            List<Double> elementsNotPresent = new ArrayList<Double>(fullRange);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11519);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11520);
            for (Double element : elementsNotPresent) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11521);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenDescendingContains() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11522);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1nixyqk8w2();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testOpenOpenDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11522, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1nixyqk8w2() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11522);
            // (5, -5), -3 = 2, -1, -4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11523);
            DoubleRange range = Ranges.doubleRange(5, BoundType.OPEN, -5, BoundType.OPEN, -3);
            // (5, -5), -3 = 2, -1, -4
            __CLR4_4_18pl8plkcq4svs9.R.inc(11524);
            List<Double> arr = Arrays.asList(2.0, -1.0, -4.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11525);
            for (Double element : arr) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11526);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11527);
            List<Double> elementsNotPresent = new ArrayList<Double>(fullRange);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11528);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11529);
            for (Double element : elementsNotPresent) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11530);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testContainsSingleStepDescending() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11531);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1p64e588wb();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testContainsSingleStepDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11531, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1p64e588wb() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11531);
            // [2, -2), -1 = 2, 1, 0, -1
            __CLR4_4_18pl8plkcq4svs9.R.inc(11532);
            DoubleRange descendingRange = Ranges.doubleRange(2, BoundType.CLOSED, -2, BoundType.OPEN, -1);
            // [2, -2), -1 = 2, 1, 0, -1
            __CLR4_4_18pl8plkcq4svs9.R.inc(11533);
            List<Double> arr = Arrays.asList(2.0, 1.0, 0.0, -1.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11534);
            for (Double element : arr) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11535);
                    assertTrue("Expected element [" + element + "] is missing in range [" + descendingRange + "]", descendingRange.contains(element));
                }
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11536);
            List<Double> elementsNotPresent = new ArrayList<Double>(fullRange);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11537);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11538);
            for (Double element : elementsNotPresent) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11539);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + descendingRange + "]", descendingRange.contains(element));
                }
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testContainsNullOrEmpty() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11540);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1qnnvh58wk();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testContainsNullOrEmpty", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11540, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1qnnvh58wk() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11540);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11541);
            DoubleRange range = Ranges.doubleRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11542);
            assertFalse(range.contains(null));
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testContainsAll() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11543);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1uiiq8n8wn();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testContainsAll", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11543, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1uiiq8n8wn() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11543);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_18pl8plkcq4svs9.R.inc(11544);
            DoubleRange range = Ranges.doubleRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11545);
            List<Double> list = Arrays.asList(-1.0, 0.0, 1.0, 2.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11546);
            assertTrue("Range [" + range + "] was expected to contain all elements from list [" + list + "]", range.containsAll(list));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11547);
            List<Double> listWithExtraElements = Arrays.asList(2.0, -1.0, 0.0, 1.0, 2.0, 3.0);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11548);
            assertFalse("Range [" + range + "] has more elements than expected", range.containsAll(listWithExtraElements));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11549);
            assertFalse(range.containsAll(null));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11550);
            assertFalse(range.containsAll(Collections.EMPTY_LIST));
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11551);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6088wv();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11551, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6088wv() throws Exception {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11551);
            // equals basic properties
            __CLR4_4_18pl8plkcq4svs9.R.inc(11552);
            DoubleRange range = Ranges.doubleRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11553);
            assertEquals("equals must be reflexive", range, range);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11554);
            assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());
            // should be able to compare to null
            __CLR4_4_18pl8plkcq4svs9.R.inc(11555);
            // should be able to compare to null
            assertTrue(!range.equals(null));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11556);
            Object range2 = Ranges.doubleRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11557);
            if ((((range.equals(range2)) && (__CLR4_4_18pl8plkcq4svs9.R.iget(11558) != 0 | true)) || (__CLR4_4_18pl8plkcq4svs9.R.iget(11559) == 0 & false))) {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11560);
                    assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11561);
                    assertEquals("equals must be symmetric", range2, range);
                }
            } else {
                {
                    __CLR4_4_18pl8plkcq4svs9.R.inc(11562);
                    assertTrue("equals must be symmetric", !range2.equals(range));
                }
            // Changing attributes
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11563);
            Object range3 = Ranges.doubleRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11564);
            assertFalse("Invalid equals after changing attributes", range.equals(range3));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11565);
            Object range4 = Ranges.doubleRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11566);
            assertFalse("Invalid equals after changing attributes", range.equals(range4));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11567);
            Object range5 = Ranges.doubleRange(-2, BoundType.CLOSED, 1, BoundType.OPEN, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11568);
            assertFalse("Invalid equals after changing attributes", range.equals(range5));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11569);
            Object range6 = Ranges.doubleRange(-2, BoundType.CLOSED, 2, BoundType.CLOSED, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11570);
            assertFalse("Invalid equals after changing attributes", range.equals(range6));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11571);
            Object range7 = Ranges.doubleRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 2);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11572);
            assertFalse("Invalid equals after changing attributes", range.equals(range7));
            // Using different constructors
            __CLR4_4_18pl8plkcq4svs9.R.inc(11573);
            DoubleRange range8 = Ranges.doubleRange(Long.valueOf(-2), Long.valueOf(2), Long.valueOf(1));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11574);
            assertEquals("Invalid equals using different constructor", range, range8);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11575);
            DoubleRange range9 = Ranges.doubleRange(Long.valueOf(-2), Long.valueOf(2));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11576);
            assertEquals("Invalid equals using different constructor", range, range9);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11577);
            Endpoint<Double> leftEndpoint = new Endpoint<Double>(-2.0d, BoundType.CLOSED);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11578);
            Endpoint<Double> rightEndpoint = new Endpoint<Double>(2.0d, BoundType.OPEN);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11579);
            DoubleRange range10 = Ranges.doubleRange(leftEndpoint, rightEndpoint, 1.0d);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11580);
            assertEquals("Invalid equals using different constructor", range, range10);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testToString() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11581);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1hrxdid8xp();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testToString", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11581, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1hrxdid8xp() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11581);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11582);
            DoubleRange range = Ranges.doubleRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11583);
            assertEquals("Wrong string value", "DoubleRange<(-2.0, 2.0], 1.0>", range.toString());
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testConstructorUsingSameEndpoint() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11584);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1e6pvy68xs();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testConstructorUsingSameEndpoint", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11584, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1e6pvy68xs() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11584);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11585);
            Endpoint<Double> uniqueEndpoint = new Endpoint<Double>(10.0d, BoundType.CLOSED);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11586);
            try {
                __CLR4_4_18pl8plkcq4svs9.R.inc(11587);
                Ranges.doubleRange(uniqueEndpoint, uniqueEndpoint, 1.0d);
            } catch (IllegalArgumentException e) {
                __CLR4_4_18pl8plkcq4svs9.R.inc(11588);
                fail("Not expected to get here");
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testInvalidRange() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11589);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1fiycn38xx();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testInvalidRange", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11589, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1fiycn38xx() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11589);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11590);
            try {
                __CLR4_4_18pl8plkcq4svs9.R.inc(11591);
                Ranges.doubleRange(10.0d, BoundType.OPEN, -5.0d, BoundType.CLOSED, 10.0d);
                __CLR4_4_18pl8plkcq4svs9.R.inc(11592);
                fail("Not expected to get here");
            } catch (IllegalArgumentException e) {
            // Do nothing
            }
            __CLR4_4_18pl8plkcq4svs9.R.inc(11593);
            Endpoint<Double> leftEndpoint = new Endpoint<Double>(10.0d, BoundType.CLOSED);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11594);
            Endpoint<Double> rightEndpoint = new Endpoint<Double>(-5.0d, BoundType.OPEN);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11595);
            try {
                __CLR4_4_18pl8plkcq4svs9.R.inc(11596);
                Ranges.doubleRange(leftEndpoint, rightEndpoint, 1.0f);
                __CLR4_4_18pl8plkcq4svs9.R.inc(11597);
                fail("Not expected to get here");
            } catch (IllegalArgumentException e) {
            // Do nothing
            }
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }

    @Test
    public void testDefaultStep() {
        __CLR4_4_18pl8plkcq4svs9.R.globalSliceStart(getClass().getName(), 11598);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1i27fky8y6();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_18pl8plkcq4svs9.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestDoubleRange.testDefaultStep", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11598, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1i27fky8y6() {
        try {
            __CLR4_4_18pl8plkcq4svs9.R.inc(11598);
            __CLR4_4_18pl8plkcq4svs9.R.inc(11599);
            assertEquals("Invalid default step", Double.valueOf(-1.0d), DoubleRange.DEFAULT_STEP.evaluate(10.0d, 1.0d));
            __CLR4_4_18pl8plkcq4svs9.R.inc(11600);
            assertEquals("Invalid default step", Double.valueOf(1.0d), DoubleRange.DEFAULT_STEP.evaluate(1.0d, 10.0d));
        } finally {
            __CLR4_4_18pl8plkcq4svs9.R.flushNeeded();
        }
    }
}

