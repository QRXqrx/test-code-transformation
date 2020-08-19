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
import java.util.Iterator;
import java.util.List;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @version $Revision: 1515264 $ $Date: 2013-08-18 23:51:41 -0300 (Sun, 18 Aug 2013) $
 */
public class TestLongRange extends BaseFunctorTest {

    static class __CLR4_4_19gi9gikcq4svwg {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 12576, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
    private final List<Long> fullRange = Collections.unmodifiableList(Arrays.asList(-6L, -5L, -4L, -3L, -2L, -1L, 0L, 1L, 2L, 3L, 4L, 5L, 6L));

    // Attributes
    // ------------------------------------------------------------------------
    private LongRange ascLongRange = null;

    private LongRange descLongRange = null;

    private Collection<Long> expectedAsc = null;

    private Collection<Long> expectedDesc = null;

    // Test set up
    // ------------------------------------------------------------------------
    @Before
    public void setUp() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12258);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12259);
            ascLongRange = Ranges.longRange(0L, 10L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12260);
            descLongRange = Ranges.longRange(10L, 0L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12261);
            expectedAsc = Arrays.asList(0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12262);
            expectedDesc = Arrays.asList(10L, 9L, 8L, 7L, 6L, 5L, 4L, 3L, 2L, 1L);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @After
    public void tearDown() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12263);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12264);
            ascLongRange = null;
            __CLR4_4_19gi9gikcq4svwg.R.inc(12265);
            descLongRange = null;
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Override
    protected Object makeFunctor() throws Exception {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12266);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12267);
            return Ranges.longRange(10, 20);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    // Generator tests
    // ------------------------------------------------------------------------
    @Test
    public void testGenerateListExample() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12268);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1q5ey49gs();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testGenerateListExample", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12268, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1q5ey49gs() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12268);
            // generates a collection of Integers from 0 (inclusive) to 10 (exclusive)
            {
                __CLR4_4_19gi9gikcq4svwg.R.inc(12269);
                LongRange range = Ranges.longRange(0, 10);
                __CLR4_4_19gi9gikcq4svwg.R.inc(12270);
                Iterator<Long> iter = range.iterator();
                __CLR4_4_19gi9gikcq4svwg.R.inc(12271);
                for (int i = 0; (((i < 10) && (__CLR4_4_19gi9gikcq4svwg.R.iget(12272) != 0 | true)) || (__CLR4_4_19gi9gikcq4svwg.R.iget(12273) == 0 & false)); i++) {
                    {
                        __CLR4_4_19gi9gikcq4svwg.R.inc(12274);
                        assertEquals(Long.valueOf(i), iter.next());
                    }
                }
            }
            // generates a collection of Integers from 10 (inclusive) to 0 (exclusive)
            {
                __CLR4_4_19gi9gikcq4svwg.R.inc(12275);
                LongRange range = Ranges.longRange(10, 0);
                __CLR4_4_19gi9gikcq4svwg.R.inc(12276);
                Iterator<Long> iter = range.iterator();
                __CLR4_4_19gi9gikcq4svwg.R.inc(12277);
                for (int i = 10; (((i > 0) && (__CLR4_4_19gi9gikcq4svwg.R.iget(12278) != 0 | true)) || (__CLR4_4_19gi9gikcq4svwg.R.iget(12279) == 0 & false)); i--) {
                    {
                        __CLR4_4_19gi9gikcq4svwg.R.inc(12280);
                        assertEquals(Long.valueOf(i), iter.next());
                    }
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testStepChecking() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12281);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1iejfb59h5();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testStepChecking", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12281, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1iejfb59h5() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12281);
            {
                // step of 0 is ok when range is empty
                __CLR4_4_19gi9gikcq4svwg.R.inc(12282);
                // step of 0 is ok when range is empty
                Ranges.longRange(2, 2, 0);
            }
            {
                // positive step is ok when range is empty
                __CLR4_4_19gi9gikcq4svwg.R.inc(12283);
                // positive step is ok when range is empty
                Ranges.longRange(2, 2, 1);
            }
            {
                // negative step is ok when range is empty
                __CLR4_4_19gi9gikcq4svwg.R.inc(12284);
                // negative step is ok when range is empty
                Ranges.longRange(2, 2, -1);
            }
            {
                // big steps are ok
                __CLR4_4_19gi9gikcq4svwg.R.inc(12285);
                // big steps are ok
                Ranges.longRange(0, 1, 10);
            }
            {
                // big steps are ok
                __CLR4_4_19gi9gikcq4svwg.R.inc(12286);
                // big steps are ok
                Ranges.longRange(1, 0, -10);
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12287);
            try {
                __CLR4_4_19gi9gikcq4svwg.R.inc(12288);
                Ranges.longRange(0, 1, 0);
                __CLR4_4_19gi9gikcq4svwg.R.inc(12289);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12290);
            try {
                __CLR4_4_19gi9gikcq4svwg.R.inc(12291);
                Ranges.longRange(0, 1, -1);
                __CLR4_4_19gi9gikcq4svwg.R.inc(12292);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12293);
            try {
                __CLR4_4_19gi9gikcq4svwg.R.inc(12294);
                Ranges.longRange(0, -1, 1);
                __CLR4_4_19gi9gikcq4svwg.R.inc(12295);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testObjectConstructor() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12296);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_17io3rk9hk();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testObjectConstructor", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12296, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_17io3rk9hk() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12296);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12297);
            LongRange range = Ranges.longRange(Long.valueOf(0), Long.valueOf(5));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12298);
            assertEquals("[0, 1, 2, 3, 4]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12299);
            range = Ranges.longRange(Integer.valueOf(0), Long.valueOf(5), Long.valueOf(1));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12300);
            assertEquals("[0, 1, 2, 3, 4]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testReverseStep() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12301);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1wsfo2r9hp();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testReverseStep", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12301, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1wsfo2r9hp() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12301);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12302);
            LongRange range = Ranges.longRange(10, 0, -2);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12303);
            assertEquals("[10, 8, 6, 4, 2]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testStep() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12304);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1zeikn99hs();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testStep", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12304, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1zeikn99hs() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12304);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12305);
            LongRange range = Ranges.longRange(0, 10, 2);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12306);
            assertEquals("[0, 2, 4, 6, 8]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testForwardRange() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12307);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ml8d9t9hv();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testForwardRange", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12307, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ml8d9t9hv() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12307);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12308);
            LongRange range = Ranges.longRange(0, 5);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12309);
            assertEquals("[0, 1, 2, 3, 4]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testReverseRange() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12310);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ekuvjg9hy();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testReverseRange", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12310, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ekuvjg9hy() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12310);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12311);
            LongRange range = Ranges.longRange(5, 0);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12312);
            assertEquals("[5, 4, 3, 2, 1]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testEdgeCase() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12313);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1657tqy9i1();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testEdgeCase", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12313, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1657tqy9i1() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12313);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12314);
            LongRange range = Ranges.longRange(Long.MAX_VALUE - 3L, Long.MAX_VALUE);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12315);
            assertEquals("[9223372036854775804, 9223372036854775805, 9223372036854775806]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedAscending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12316);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1r33r579i4();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testClosedClosedAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12316, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1r33r579i4() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12316);
            // [-5L, 5L], 3L = -5L, -2L, 1L, 4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12317);
            LongRange range = Ranges.longRange(-5L, BoundType.CLOSED, 5L, BoundType.CLOSED, 3L);
            // [-5L, 5L], 3L = -5L, -2L, 1L, 4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12318);
            List<Long> expected = Arrays.asList(-5L, -2L, 1L, 4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12319);
            Collection<Long> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12320);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedAscending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12321);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1amzjbd9i9();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testOpenClosedAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12321, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1amzjbd9i9() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12321);
            // (-5L, 5L], 3L = -2L, 1L, 4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12322);
            LongRange range = Ranges.longRange(-5L, BoundType.OPEN, 5L, BoundType.CLOSED, 3L);
            // (-5L, 5L], 3L = -2L, 1L, 4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12323);
            List<Long> expected = Arrays.asList(-2L, 1L, 4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12324);
            Collection<Long> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12325);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenAscending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12326);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1b8ensn9ie();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testClosedOpenAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12326, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1b8ensn9ie() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12326);
            // [-5L, 5L), 3L = -5L, -2L, 1L, 4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12327);
            LongRange range = Ranges.longRange(-5L, BoundType.CLOSED, 5L, BoundType.OPEN, 3L);
            // (-5L, 5L], 3L = -5L, -2L, 1L, 4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12328);
            List<Long> expected = Arrays.asList(-5L, -2L, 1L, 4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12329);
            Collection<Long> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12330);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenAscending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12331);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1xn9st59ij();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testOpenOpenAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12331, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1xn9st59ij() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12331);
            // (-5L, 5L), 3L = -2L, 1L, 4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12332);
            LongRange range = Ranges.longRange(-5L, BoundType.OPEN, 5L, BoundType.OPEN, 3L);
            // (-5L, 5L), 3L = -2L, 1L, 4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12333);
            List<Long> expected = Arrays.asList(-2L, 1L, 4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12334);
            Collection<Long> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12335);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testSingleStepAscending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12336);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_17dbhev9io();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testSingleStepAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12336, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_17dbhev9io() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12336);
            // (-2L, 2L], 1L = -1L, 0L, 1L, 2L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12337);
            LongRange range = Ranges.longRange(-2L, BoundType.OPEN, 2L, BoundType.CLOSED, 1L);
            // (-2L, 2L], 1L = -1L, 0L, 1L, 2L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12338);
            List<Long> expected = Arrays.asList(-1L, 0L, 1L, 2L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12339);
            Collection<Long> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12340);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedDescending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12341);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1o63c5l9it();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testClosedClosedDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12341, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1o63c5l9it() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12341);
            // [5L, -5L], -3L = 5L, 2L, -1L, -4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12342);
            LongRange range = Ranges.longRange(5L, BoundType.CLOSED, -5L, BoundType.CLOSED, -3L);
            // [5L, -5L], -3L = 5L, 2L, -1L, -4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12343);
            List<Long> expected = Arrays.asList(5L, 2L, -1L, -4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12344);
            Collection<Long> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12345);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedDescending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12346);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1y76cyh9iy();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testOpenClosedDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12346, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1y76cyh9iy() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12346);
            // (5L, -5L], -3L = 2L, -1L, -4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12347);
            LongRange range = Ranges.longRange(5L, BoundType.OPEN, -5L, BoundType.CLOSED, -3L);
            // (5L, -5L], -3L = 2L, -1L, -4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12348);
            List<Long> expected = Arrays.asList(2L, -1L, -4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12349);
            Collection<Long> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12350);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenDescending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12351);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_14k19pj9j3();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testClosedOpenDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12351, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_14k19pj9j3() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12351);
            // [5L, -5L), -3L = 5L, 2L, -1L, -4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12352);
            LongRange range = Ranges.longRange(5L, BoundType.CLOSED, -5L, BoundType.OPEN, -3L);
            // [5L, -5L), -3L = 5L, 2L, -1L, -4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12353);
            List<Long> expected = Arrays.asList(5L, 2L, -1L, -4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12354);
            Collection<Long> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12355);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenDescending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12356);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ay9ym39j8();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testOpenOpenDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12356, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ay9ym39j8() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12356);
            // (5L, -5L), -3L = 2L, -1L, -4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12357);
            LongRange range = Ranges.longRange(5L, BoundType.OPEN, -5L, BoundType.OPEN, -3L);
            // (5L, -5L), -3L = 2L, -1L, -4L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12358);
            List<Long> expected = Arrays.asList(2L, -1L, -4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12359);
            Collection<Long> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12360);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testSingleStepDescending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12361);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_13wkry39jd();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testSingleStepDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12361, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_13wkry39jd() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12361);
            // [2L, -2L), -1L = 2L, 1L, 0L, -1L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12362);
            LongRange range = Ranges.longRange(2L, BoundType.CLOSED, -2L, BoundType.OPEN, -1L);
            // [2L, -2L), -1L = 2L, 1L, 0L, -1L
            __CLR4_4_19gi9gikcq4svwg.R.inc(12363);
            List<Long> expected = Arrays.asList(2L, 1L, 0L, -1L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12364);
            Collection<Long> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12365);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testAscending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12366);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1w4vjtf9ji();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12366, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1w4vjtf9ji() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12366);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12367);
            final List<Long> list = new ArrayList<Long>();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12368);
            for (Long l : ascLongRange) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12369);
                    list.add(l);
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12370);
            assertTrue(expectedAsc.containsAll(list));
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testDescending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12371);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_19pdr8x9jn();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12371, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_19pdr8x9jn() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12371);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12372);
            final List<Long> list = new ArrayList<Long>();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12373);
            for (Long l : descLongRange) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12374);
                    list.add(l);
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12375);
            assertTrue(expectedDesc.containsAll(list));
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testToCollection() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12376);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ett1qq9js();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testToCollection", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12376, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ett1qq9js() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12376);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12377);
            Collection<Long> ascCol = IteratorToGeneratorAdapter.adapt(ascLongRange).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12378);
            assertEquals("Different collections", expectedAsc, ascCol);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12379);
            Collection<Long> descCol = IteratorToGeneratorAdapter.adapt(descLongRange).toCollection();
            __CLR4_4_19gi9gikcq4svwg.R.inc(12380);
            assertEquals("Different collections", expectedDesc, descCol);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testTransformedGenerator() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12381);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_11mse9r9jx();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testTransformedGenerator", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12381, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_11mse9r9jx() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12381);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12382);
            long expected = 45L;
            __CLR4_4_19gi9gikcq4svwg.R.inc(12383);
            long total = IteratorToGeneratorAdapter.adapt(ascLongRange).to(new Function<Generator<? extends Long>, Long>() {

                public Long evaluate(Generator<? extends Long> obj) {
                    try {
                        __CLR4_4_19gi9gikcq4svwg.R.inc(12384);
                        __CLR4_4_19gi9gikcq4svwg.R.inc(12385);
                        long total = 0L;
                        __CLR4_4_19gi9gikcq4svwg.R.inc(12386);
                        for (Object element : obj.toCollection()) {
                            {
                                __CLR4_4_19gi9gikcq4svwg.R.inc(12387);
                                total += (Long) element;
                            }
                        }
                        __CLR4_4_19gi9gikcq4svwg.R.inc(12388);
                        return total;
                    } finally {
                        __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
                    }
                }
            });
            __CLR4_4_19gi9gikcq4svwg.R.inc(12389);
            assertEquals(expected, total);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12390);
            expected = 55L;
            __CLR4_4_19gi9gikcq4svwg.R.inc(12391);
            total = IteratorToGeneratorAdapter.adapt(descLongRange).to(new Function<Generator<? extends Long>, Long>() {

                public Long evaluate(Generator<? extends Long> obj) {
                    try {
                        __CLR4_4_19gi9gikcq4svwg.R.inc(12392);
                        __CLR4_4_19gi9gikcq4svwg.R.inc(12393);
                        long total = 0L;
                        __CLR4_4_19gi9gikcq4svwg.R.inc(12394);
                        for (Object element : obj.toCollection()) {
                            {
                                __CLR4_4_19gi9gikcq4svwg.R.inc(12395);
                                total += (Long) element;
                            }
                        }
                        __CLR4_4_19gi9gikcq4svwg.R.inc(12396);
                        return total;
                    } finally {
                        __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
                    }
                }
            });
            __CLR4_4_19gi9gikcq4svwg.R.inc(12397);
            assertEquals(expected, total);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    // Range tests
    // ------------------------------------------------------------------------
    @Test
    public void testEmptyRanges() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12398);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1dlg7c9ke();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testEmptyRanges", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12398, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1dlg7c9ke() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12398);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12399);
            LongRange empty1 = Ranges.longRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12400);
            assertTrue("The range was expected to be empty.", empty1.isEmpty());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12401);
            LongRange empty2 = Ranges.longRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12402);
            assertTrue("The range was expected to be empty.", empty2.isEmpty());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12403);
            LongRange empty3 = Ranges.longRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12404);
            assertTrue("The range was expected to be empty.", empty3.isEmpty());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12405);
            LongRange empty4 = Ranges.longRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12406);
            assertTrue("The range was expected to be empty.", empty4.isEmpty());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12407);
            LongRange empty5 = Ranges.longRange(-3, BoundType.CLOSED, -3, BoundType.OPEN, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12408);
            assertTrue("The range was expected to be empty.", empty5.isEmpty());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12409);
            LongRange empty6 = Ranges.longRange(1, BoundType.OPEN, 0, BoundType.CLOSED, -2);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12410);
            assertTrue("The range was expected to be empty.", empty6.isEmpty());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12411);
            LongRange notEmpty1 = Ranges.longRange(-3, BoundType.CLOSED, -3, BoundType.CLOSED, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12412);
            assertFalse("The range was not expected to be empty.", notEmpty1.isEmpty());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12413);
            LongRange notEmpty2 = Ranges.longRange(-3, BoundType.OPEN, -2, BoundType.CLOSED, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12414);
            assertFalse("The range was not expected to be empty.", notEmpty2.isEmpty());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12415);
            LongRange notEmpty3 = Ranges.longRange(2, BoundType.OPEN, 1, BoundType.CLOSED, -1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12416);
            assertFalse("The range was not expected to be empty.", notEmpty3.isEmpty());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12417);
            LongRange notEmpty4 = Ranges.longRange(2, BoundType.CLOSED, 1, BoundType.OPEN, -1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12418);
            assertFalse("The range was not expected to be empty.", notEmpty4.isEmpty());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12419);
            LongRange notEmpty5 = Ranges.longRange(1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12420);
            assertFalse("The range was not expected to be empty.", notEmpty5.isEmpty());
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testBoundaries() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12421);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1lisq699l1();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testBoundaries", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12421, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1lisq699l1() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12421);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12422);
            LongRange range = Ranges.longRange(0L, 10L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12423);
            assertEquals(new Endpoint<Comparable<?>>(0L, BoundType.CLOSED), range.getLeftEndpoint());
            __CLR4_4_19gi9gikcq4svwg.R.inc(12424);
            assertEquals(new Endpoint<Comparable<?>>(10L, BoundType.OPEN), range.getRightEndpoint());
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedAscendingContains() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12425);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_16x8bm49l5();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testClosedClosedAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12425, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_16x8bm49l5() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12425);
            // [-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12426);
            LongRange range = Ranges.longRange(-5, BoundType.CLOSED, 5, BoundType.CLOSED, 3);
            // [-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12427);
            List<Long> arr = Arrays.asList(-5L, -2L, 1L, 4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12428);
            for (Long element : arr) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12429);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12430);
            List<Long> elementsNotPresent = new ArrayList<Long>(fullRange);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12431);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12432);
            for (Long element : elementsNotPresent) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12433);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedAscendingContains() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12434);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_198ttxy9le();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testOpenClosedAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12434, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_198ttxy9le() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12434);
            // (-5, 5], 3 = -2, 1, 4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12435);
            LongRange range = Ranges.longRange(-5, BoundType.OPEN, 5, BoundType.CLOSED, 3);
            // (-5, 5], 3 = -2, 1, 4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12436);
            List<Long> arr = Arrays.asList(-2L, 1L, 4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12437);
            for (Long element : arr) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12438);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12439);
            List<Long> elementsNotPresent = new ArrayList<Long>(fullRange);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12440);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12441);
            for (Long element : elementsNotPresent) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12442);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenAscendingContains() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12443);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1grodw69ln();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testClosedOpenAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12443, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1grodw69ln() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12443);
            // [-5, 5), 3 = -5, -2, 1, 4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12444);
            LongRange range = Ranges.longRange(-5, BoundType.CLOSED, 5, BoundType.OPEN, 3);
            // (-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12445);
            List<Long> arr = Arrays.asList(-5L, -2L, 1L, 4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12446);
            for (Long element : arr) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12447);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12448);
            List<Long> elementsNotPresent = new ArrayList<Long>(fullRange);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12449);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12450);
            for (Long element : elementsNotPresent) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12451);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenAscendingContains() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12452);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_156iut49lw();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testOpenOpenAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12452, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_156iut49lw() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12452);
            // (-5, 5), 3 = -2, 1, 4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12453);
            LongRange range = Ranges.longRange(-5, BoundType.OPEN, 5, BoundType.OPEN, 3);
            // (-5, 5), 3 = -2, 1, 4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12454);
            List<Long> arr = Arrays.asList(-2L, 1L, 4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12455);
            for (Long element : arr) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12456);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12457);
            List<Long> elementsNotPresent = new ArrayList<Long>(fullRange);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12458);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12459);
            for (Long element : elementsNotPresent) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12460);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testContainsSingleStepAscending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12461);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1a9vwbe9m5();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testContainsSingleStepAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12461, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1a9vwbe9m5() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12461);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_19gi9gikcq4svwg.R.inc(12462);
            LongRange ascendingRange = Ranges.longRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_19gi9gikcq4svwg.R.inc(12463);
            List<Long> arr = Arrays.asList(-1L, 0L, 1L, 2L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12464);
            for (Long element : arr) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12465);
                    assertTrue("Expected element [" + element + "] is missing in range [" + ascendingRange + "]", ascendingRange.contains(element));
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12466);
            List<Long> elementsNotPresent = new ArrayList<Long>(fullRange);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12467);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12468);
            for (Long element : elementsNotPresent) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12469);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + ascendingRange + "]", ascendingRange.contains(element));
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedDescendingContains() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12470);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1rfbu089me();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testClosedClosedDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12470, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1rfbu089me() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12470);
            // [5, -5], -3 = 5, 2, -1, -4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12471);
            LongRange range = Ranges.longRange(5, BoundType.CLOSED, -5, BoundType.CLOSED, -3);
            // [5, -5], -3 = 5, 2, -1, -4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12472);
            List<Long> arr = Arrays.asList(5L, 2L, -1L, -4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12473);
            for (Long element : arr) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12474);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12475);
            List<Long> elementsNotPresent = new ArrayList<Long>(fullRange);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12476);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12477);
            for (Long element : elementsNotPresent) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12478);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedDescendingContains() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12479);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1vfe8g69mn();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testOpenClosedDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12479, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1vfe8g69mn() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12479);
            // (5, -5], -3 = 2, -1, -4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12480);
            LongRange range = Ranges.longRange(5, BoundType.OPEN, -5, BoundType.CLOSED, -3);
            // (5, -5], -3 = 2, -1, -4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12481);
            List<Long> arr = Arrays.asList(2L, -1L, -4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12482);
            for (Long element : arr) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12483);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12484);
            List<Long> elementsNotPresent = new ArrayList<Long>(fullRange);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12485);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12486);
            for (Long element : elementsNotPresent) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12487);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenDescendingContains() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12488);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1jgqsze9mw();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testClosedOpenDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12488, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1jgqsze9mw() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12488);
            // [5, -5), -3 = 5, 2, -1, -4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12489);
            LongRange range = Ranges.longRange(5, BoundType.CLOSED, -5, BoundType.OPEN, -3);
            // [5, -5), -3 = 5, 2, -1, -4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12490);
            List<Long> arr = Arrays.asList(5L, 2L, -1L, -4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12491);
            for (Long element : arr) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12492);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12493);
            List<Long> elementsNotPresent = new ArrayList<Long>(fullRange);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12494);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12495);
            for (Long element : elementsNotPresent) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12496);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenDescendingContains() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12497);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1nixyqk9n5();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testOpenOpenDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12497, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1nixyqk9n5() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12497);
            // (5, -5), -3 = 2, -1, -4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12498);
            LongRange range = Ranges.longRange(5, BoundType.OPEN, -5, BoundType.OPEN, -3);
            // (5, -5), -3 = 2, -1, -4
            __CLR4_4_19gi9gikcq4svwg.R.inc(12499);
            List<Long> arr = Arrays.asList(2L, -1L, -4L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12500);
            for (Long element : arr) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12501);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12502);
            List<Long> elementsNotPresent = new ArrayList<Long>(fullRange);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12503);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12504);
            for (Long element : elementsNotPresent) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12505);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testContainsSingleStepDescending() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12506);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1p64e589ne();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testContainsSingleStepDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12506, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1p64e589ne() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12506);
            // [2, -2), -1 = 2, 1, 0, -1
            __CLR4_4_19gi9gikcq4svwg.R.inc(12507);
            LongRange descendingRange = Ranges.longRange(2, BoundType.CLOSED, -2, BoundType.OPEN, -1);
            // [2, -2), -1 = 2, 1, 0, -1
            __CLR4_4_19gi9gikcq4svwg.R.inc(12508);
            List<Long> arr = Arrays.asList(2L, 1L, 0L, -1L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12509);
            for (Long element : arr) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12510);
                    assertTrue("Expected element [" + element + "] is missing in range [" + descendingRange + "]", descendingRange.contains(element));
                }
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12511);
            List<Long> elementsNotPresent = new ArrayList<Long>(fullRange);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12512);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12513);
            for (Long element : elementsNotPresent) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12514);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + descendingRange + "]", descendingRange.contains(element));
                }
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testContainsNullOrEmpty() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12515);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1qnnvh59nn();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testContainsNullOrEmpty", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12515, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1qnnvh59nn() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12515);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12516);
            LongRange range = Ranges.longRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12517);
            assertFalse(range.contains(null));
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testContainsAll() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12518);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1uiiq8n9nq();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testContainsAll", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12518, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1uiiq8n9nq() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12518);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_19gi9gikcq4svwg.R.inc(12519);
            LongRange range = Ranges.longRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12520);
            List<Long> list = Arrays.asList(-1L, 0L, 1L, 2L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12521);
            assertTrue("Range [" + range + "] was expected to contain all elements from list [" + list + "]", range.containsAll(list));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12522);
            List<Long> listWithExtraElements = Arrays.asList(2L, -1L, 0L, 1L, 2L, 3L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12523);
            assertFalse("Range [" + range + "] has more elements than expected", range.containsAll(listWithExtraElements));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12524);
            assertFalse(range.containsAll(null));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12525);
            assertFalse(range.containsAll(Collections.EMPTY_LIST));
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12526);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6089ny();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12526, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6089ny() throws Exception {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12526);
            // equals basic properties
            __CLR4_4_19gi9gikcq4svwg.R.inc(12527);
            LongRange range = Ranges.longRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12528);
            assertEquals("equals must be reflexive", range, range);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12529);
            assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());
            // should be able to compare to null
            __CLR4_4_19gi9gikcq4svwg.R.inc(12530);
            // should be able to compare to null
            assertTrue(!range.equals(null));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12531);
            Object range2 = Ranges.longRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12532);
            if ((((range.equals(range2)) && (__CLR4_4_19gi9gikcq4svwg.R.iget(12533) != 0 | true)) || (__CLR4_4_19gi9gikcq4svwg.R.iget(12534) == 0 & false))) {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12535);
                    assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12536);
                    assertEquals("equals must be symmetric", range2, range);
                }
            } else {
                {
                    __CLR4_4_19gi9gikcq4svwg.R.inc(12537);
                    assertTrue("equals must be symmetric", !range2.equals(range));
                }
            // Changing attributes
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12538);
            Object range3 = Ranges.longRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12539);
            assertFalse("Invalid equals after changing attributes", range.equals(range3));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12540);
            Object range4 = Ranges.longRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12541);
            assertFalse("Invalid equals after changing attributes", range.equals(range4));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12542);
            Object range5 = Ranges.longRange(-2, BoundType.CLOSED, 1, BoundType.OPEN, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12543);
            assertFalse("Invalid equals after changing attributes", range.equals(range5));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12544);
            Object range6 = Ranges.longRange(-2, BoundType.CLOSED, 2, BoundType.CLOSED, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12545);
            assertFalse("Invalid equals after changing attributes", range.equals(range6));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12546);
            Object range7 = Ranges.longRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 2);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12547);
            assertFalse("Invalid equals after changing attributes", range.equals(range7));
            // Using different constructors
            __CLR4_4_19gi9gikcq4svwg.R.inc(12548);
            LongRange range8 = Ranges.longRange(Integer.valueOf(-2), Integer.valueOf(2), Integer.valueOf(1));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12549);
            assertEquals("Invalid equals using different constructor", range, range8);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12550);
            LongRange range9 = Ranges.longRange(Integer.valueOf(-2), Integer.valueOf(2));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12551);
            assertEquals("Invalid equals using different constructor", range, range9);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12552);
            Endpoint<Long> leftEndpoint = new Endpoint<Long>(-2L, BoundType.CLOSED);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12553);
            Endpoint<Long> rightEndpoint = new Endpoint<Long>(2L, BoundType.OPEN);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12554);
            LongRange range10 = Ranges.longRange(leftEndpoint, rightEndpoint, 1L);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12555);
            assertEquals("Invalid equals using different constructor", range, range10);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testToString() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12556);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1hrxdid9os();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testToString", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12556, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1hrxdid9os() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12556);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12557);
            LongRange range = Ranges.longRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12558);
            assertEquals("Wrong string value", "LongRange<(-2, 2], 1>", range.toString());
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testConstructorUsingSameEndpoint() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12559);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1e6pvy69ov();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testConstructorUsingSameEndpoint", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12559, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1e6pvy69ov() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12559);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12560);
            Endpoint<Long> uniqueEndpoint = new Endpoint<Long>(10L, BoundType.CLOSED);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12561);
            try {
                __CLR4_4_19gi9gikcq4svwg.R.inc(12562);
                Ranges.longRange(uniqueEndpoint, uniqueEndpoint, 1L);
            } catch (IllegalArgumentException e) {
                __CLR4_4_19gi9gikcq4svwg.R.inc(12563);
                fail("Not expected to get here");
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testInvalidRange() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12564);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1fiycn39p0();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testInvalidRange", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12564, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1fiycn39p0() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12564);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12565);
            try {
                __CLR4_4_19gi9gikcq4svwg.R.inc(12566);
                Ranges.longRange(10, BoundType.OPEN, -5, BoundType.CLOSED, 10);
                __CLR4_4_19gi9gikcq4svwg.R.inc(12567);
                fail("Not expected to get here");
            } catch (IllegalArgumentException e) {
            // Do nothing
            }
            __CLR4_4_19gi9gikcq4svwg.R.inc(12568);
            Endpoint<Long> leftEndpoint = new Endpoint<Long>(10L, BoundType.CLOSED);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12569);
            Endpoint<Long> rightEndpoint = new Endpoint<Long>(-5L, BoundType.OPEN);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12570);
            try {
                __CLR4_4_19gi9gikcq4svwg.R.inc(12571);
                Ranges.longRange(leftEndpoint, rightEndpoint, 1L);
                __CLR4_4_19gi9gikcq4svwg.R.inc(12572);
                fail("Not expected to get here");
            } catch (IllegalArgumentException e) {
            // Do nothing
            }
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }

    @Test
    public void testDefaultStep() {
        __CLR4_4_19gi9gikcq4svwg.R.globalSliceStart(getClass().getName(), 12573);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1i27fky9p9();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_19gi9gikcq4svwg.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestLongRange.testDefaultStep", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12573, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1i27fky9p9() {
        try {
            __CLR4_4_19gi9gikcq4svwg.R.inc(12573);
            __CLR4_4_19gi9gikcq4svwg.R.inc(12574);
            assertEquals("Invalid default step", Long.valueOf(-1L), LongRange.DEFAULT_STEP.evaluate(10L, 1L));
            __CLR4_4_19gi9gikcq4svwg.R.inc(12575);
            assertEquals("Invalid default step", Long.valueOf(1L), LongRange.DEFAULT_STEP.evaluate(1L, 10L));
        } finally {
            __CLR4_4_19gi9gikcq4svwg.R.flushNeeded();
        }
    }
}

