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
 * @version $Revision: 1515264 $ $Date: 2013-08-18 23:51:41 -0300 (Sun, 18 Aug 2013) $
 */
public class TestIntegerRange extends BaseFunctorTest {

    static class __CLR4_4_197q97qkcq4svv6 {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 12258, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    // Attributes
    // ------------------------------------------------------------------------
    private IntegerRange ascIntRange = null;

    private IntegerRange descIntRange = null;

    private Collection<Integer> expectedAsc = null;

    private Collection<Integer> expectedDesc = null;

    // Test set up
    // ------------------------------------------------------------------------
    @Before
    public void setUp() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11942);
            __CLR4_4_197q97qkcq4svv6.R.inc(11943);
            ascIntRange = Ranges.integerRange(0, 10);
            __CLR4_4_197q97qkcq4svv6.R.inc(11944);
            descIntRange = Ranges.integerRange(10, 0);
            __CLR4_4_197q97qkcq4svv6.R.inc(11945);
            expectedAsc = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
            __CLR4_4_197q97qkcq4svv6.R.inc(11946);
            expectedDesc = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @After
    public void tearDown() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11947);
            __CLR4_4_197q97qkcq4svv6.R.inc(11948);
            ascIntRange = null;
            __CLR4_4_197q97qkcq4svv6.R.inc(11949);
            descIntRange = null;
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Override
    protected Object makeFunctor() throws Exception {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11950);
            __CLR4_4_197q97qkcq4svv6.R.inc(11951);
            return Ranges.integerRange(10, 20);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    // Generator tests
    // ------------------------------------------------------------------------
    @Test
    public void testGenerateListExample() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 11952);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1q5ey4980();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testGenerateListExample", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11952, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1q5ey4980() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11952);
            // generates a collection of Integers from 0 (inclusive) to 10 (exclusive)
            {
                __CLR4_4_197q97qkcq4svv6.R.inc(11953);
                List<? super Integer> list = (List<? super Integer>) (IteratorToGeneratorAdapter.adapt(Ranges.integerRange(0, 10)).to(new ArrayList<Integer>()));
                __CLR4_4_197q97qkcq4svv6.R.inc(11954);
                for (int i = 0; (((i < 10) && (__CLR4_4_197q97qkcq4svv6.R.iget(11955) != 0 | true)) || (__CLR4_4_197q97qkcq4svv6.R.iget(11956) == 0 & false)); i++) {
                    {
                        __CLR4_4_197q97qkcq4svv6.R.inc(11957);
                        assertEquals(Integer.valueOf(i), list.get(i));
                    }
                }
            }
            // generates a collection of Integers from 10 (inclusive) to 0 (exclusive)
            {
                __CLR4_4_197q97qkcq4svv6.R.inc(11958);
                List<? super Integer> list = (List<? super Integer>) (IteratorToGeneratorAdapter.adapt(Ranges.integerRange(10, 0)).to(new ArrayList<Integer>()));
                __CLR4_4_197q97qkcq4svv6.R.inc(11959);
                for (int i = 10; (((i > 0) && (__CLR4_4_197q97qkcq4svv6.R.iget(11960) != 0 | true)) || (__CLR4_4_197q97qkcq4svv6.R.iget(11961) == 0 & false)); i--) {
                    {
                        __CLR4_4_197q97qkcq4svv6.R.inc(11962);
                        assertEquals(Integer.valueOf(i), list.get(10 - i));
                    }
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testStepChecking() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 11963);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1iejfb598b();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testStepChecking", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11963, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1iejfb598b() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11963);
            {
                // step of 0 is ok when range is empty
                __CLR4_4_197q97qkcq4svv6.R.inc(11964);
                // step of 0 is ok when range is empty
                Ranges.integerRange(2, 2, 0);
            }
            {
                // positive step is ok when range is empty
                __CLR4_4_197q97qkcq4svv6.R.inc(11965);
                // positive step is ok when range is empty
                Ranges.integerRange(2, 2, 1);
            }
            {
                // negative step is ok when range is empty
                __CLR4_4_197q97qkcq4svv6.R.inc(11966);
                // negative step is ok when range is empty
                Ranges.integerRange(2, 2, -1);
            }
            {
                // big steps are ok
                __CLR4_4_197q97qkcq4svv6.R.inc(11967);
                // big steps are ok
                Ranges.integerRange(0, 1, 10);
            }
            {
                // big steps are ok
                __CLR4_4_197q97qkcq4svv6.R.inc(11968);
                // big steps are ok
                Ranges.integerRange(1, 0, -10);
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(11969);
            try {
                __CLR4_4_197q97qkcq4svv6.R.inc(11970);
                Ranges.integerRange(0, 1, 0);
                __CLR4_4_197q97qkcq4svv6.R.inc(11971);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(11972);
            try {
                __CLR4_4_197q97qkcq4svv6.R.inc(11973);
                Ranges.integerRange(0, 1, -1);
                __CLR4_4_197q97qkcq4svv6.R.inc(11974);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(11975);
            try {
                __CLR4_4_197q97qkcq4svv6.R.inc(11976);
                Ranges.integerRange(0, -1, 1);
                __CLR4_4_197q97qkcq4svv6.R.inc(11977);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            // expected
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testObjectConstructor() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 11978);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_17io3rk98q();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testObjectConstructor", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11978, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_17io3rk98q() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11978);
            __CLR4_4_197q97qkcq4svv6.R.inc(11979);
            IntegerRange range = Ranges.integerRange(Integer.valueOf(0), Integer.valueOf(5));
            __CLR4_4_197q97qkcq4svv6.R.inc(11980);
            assertEquals("[0, 1, 2, 3, 4]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
            __CLR4_4_197q97qkcq4svv6.R.inc(11981);
            range = Ranges.integerRange(Integer.valueOf(0), Integer.valueOf(5), Integer.valueOf(1));
            __CLR4_4_197q97qkcq4svv6.R.inc(11982);
            assertEquals("[0, 1, 2, 3, 4]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testReverseStep() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 11983);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1wsfo2r98v();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testReverseStep", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11983, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1wsfo2r98v() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11983);
            __CLR4_4_197q97qkcq4svv6.R.inc(11984);
            IntegerRange range = Ranges.integerRange(10, 0, -2);
            __CLR4_4_197q97qkcq4svv6.R.inc(11985);
            assertEquals("[10, 8, 6, 4, 2]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testStep() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 11986);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1zeikn998y();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testStep", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11986, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1zeikn998y() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11986);
            __CLR4_4_197q97qkcq4svv6.R.inc(11987);
            IntegerRange range = Ranges.integerRange(0, 10, 2);
            __CLR4_4_197q97qkcq4svv6.R.inc(11988);
            assertEquals("[0, 2, 4, 6, 8]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testForwardRange() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 11989);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ml8d9t991();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testForwardRange", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11989, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ml8d9t991() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11989);
            __CLR4_4_197q97qkcq4svv6.R.inc(11990);
            IntegerRange range = Ranges.integerRange(0, 5);
            __CLR4_4_197q97qkcq4svv6.R.inc(11991);
            assertEquals("[0, 1, 2, 3, 4]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testReverseRange() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 11992);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ekuvjg994();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testReverseRange", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11992, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ekuvjg994() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11992);
            __CLR4_4_197q97qkcq4svv6.R.inc(11993);
            IntegerRange range = Ranges.integerRange(5, 0);
            __CLR4_4_197q97qkcq4svv6.R.inc(11994);
            assertEquals("[5, 4, 3, 2, 1]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testEdgeCase() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 11995);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1657tqy997();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testEdgeCase", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11995, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1657tqy997() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11995);
            __CLR4_4_197q97qkcq4svv6.R.inc(11996);
            IntegerRange range = Ranges.integerRange(Integer.MAX_VALUE - 3, Integer.MAX_VALUE);
            __CLR4_4_197q97qkcq4svv6.R.inc(11997);
            assertEquals("[2147483644, 2147483645, 2147483646]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testBoundaries() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 11998);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1lisq6999a();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testBoundaries", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 11998, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1lisq6999a() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(11998);
            __CLR4_4_197q97qkcq4svv6.R.inc(11999);
            IntegerRange range = Ranges.integerRange(0, 10);
            __CLR4_4_197q97qkcq4svv6.R.inc(12000);
            assertEquals(new Endpoint<Comparable<?>>(0, BoundType.CLOSED), range.getLeftEndpoint());
            __CLR4_4_197q97qkcq4svv6.R.inc(12001);
            assertEquals(new Endpoint<Comparable<?>>(10, BoundType.OPEN), range.getRightEndpoint());
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedAscending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12002);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1r33r5799e();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testClosedClosedAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12002, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1r33r5799e() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12002);
            // [-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12003);
            IntegerRange range = Ranges.integerRange(-5, BoundType.CLOSED, 5, BoundType.CLOSED, 3);
            // [-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12004);
            List<Integer> expected = Arrays.asList(-5, -2, 1, 4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12005);
            Collection<Integer> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12006);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedAscending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12007);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1amzjbd99j();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testOpenClosedAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12007, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1amzjbd99j() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12007);
            // (-5, 5], 3 = -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12008);
            IntegerRange range = Ranges.integerRange(-5, BoundType.OPEN, 5, BoundType.CLOSED, 3);
            // (-5, 5], 3 = -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12009);
            List<Integer> expected = Arrays.asList(-2, 1, 4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12010);
            Collection<Integer> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12011);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenAscending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12012);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1b8ensn99o();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testClosedOpenAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12012, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1b8ensn99o() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12012);
            // [-5, 5), 3 = -5, -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12013);
            IntegerRange range = Ranges.integerRange(-5, BoundType.CLOSED, 5, BoundType.OPEN, 3);
            // (-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12014);
            List<Integer> expected = Arrays.asList(-5, -2, 1, 4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12015);
            Collection<Integer> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12016);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenAscending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12017);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1xn9st599t();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testOpenOpenAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12017, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1xn9st599t() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12017);
            // (-5, 5), 3 = -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12018);
            IntegerRange range = Ranges.integerRange(-5, BoundType.OPEN, 5, BoundType.OPEN, 3);
            // (-5, 5), 3 = -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12019);
            List<Integer> expected = Arrays.asList(-2, 1, 4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12020);
            Collection<Integer> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12021);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testSingleStepAscending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12022);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_17dbhev99y();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testSingleStepAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12022, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_17dbhev99y() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12022);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_197q97qkcq4svv6.R.inc(12023);
            IntegerRange range = Ranges.integerRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_197q97qkcq4svv6.R.inc(12024);
            List<Integer> expected = Arrays.asList(-1, 0, 1, 2);
            __CLR4_4_197q97qkcq4svv6.R.inc(12025);
            Collection<Integer> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12026);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedDescending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12027);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1o63c5l9a3();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testClosedClosedDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12027, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1o63c5l9a3() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12027);
            // [5, -5], -3 = 5, 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12028);
            IntegerRange range = Ranges.integerRange(5, BoundType.CLOSED, -5, BoundType.CLOSED, -3);
            // [5, -5], -3 = 5, 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12029);
            List<Integer> expected = Arrays.asList(5, 2, -1, -4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12030);
            Collection<Integer> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12031);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedDescending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12032);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1y76cyh9a8();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testOpenClosedDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12032, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1y76cyh9a8() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12032);
            // (5, -5], -3 = 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12033);
            IntegerRange range = Ranges.integerRange(5, BoundType.OPEN, -5, BoundType.CLOSED, -3);
            // (5, -5], -3 = 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12034);
            List<Integer> expected = Arrays.asList(2, -1, -4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12035);
            Collection<Integer> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12036);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenDescending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12037);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_14k19pj9ad();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testClosedOpenDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12037, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_14k19pj9ad() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12037);
            // [5, -5), -3 = 5, 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12038);
            IntegerRange range = Ranges.integerRange(5, BoundType.CLOSED, -5, BoundType.OPEN, -3);
            // [5, -5), -3 = 5, 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12039);
            List<Integer> expected = Arrays.asList(5, 2, -1, -4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12040);
            Collection<Integer> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12041);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenDescending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12042);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ay9ym39ai();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testOpenOpenDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12042, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ay9ym39ai() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12042);
            // (5, -5), -3 = 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12043);
            IntegerRange range = Ranges.integerRange(5, BoundType.OPEN, -5, BoundType.OPEN, -3);
            // (5, -5), -3 = 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12044);
            List<Integer> expected = Arrays.asList(2, -1, -4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12045);
            Collection<Integer> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12046);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testSingleStepDescending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12047);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_13wkry39an();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testSingleStepDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12047, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_13wkry39an() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12047);
            // [2, -2), -1 = 2, 1, 0, -1
            __CLR4_4_197q97qkcq4svv6.R.inc(12048);
            IntegerRange range = Ranges.integerRange(2, BoundType.CLOSED, -2, BoundType.OPEN, -1);
            // [2, -2), -1 = 2, 1, 0, -1
            __CLR4_4_197q97qkcq4svv6.R.inc(12049);
            List<Integer> expected = Arrays.asList(2, 1, 0, -1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12050);
            Collection<Integer> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12051);
            assertEquals(expected, elements);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testAscending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12052);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1w4vjtf9as();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12052, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1w4vjtf9as() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12052);
            __CLR4_4_197q97qkcq4svv6.R.inc(12053);
            final List<Integer> list = new ArrayList<Integer>();
            __CLR4_4_197q97qkcq4svv6.R.inc(12054);
            for (int i : ascIntRange) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12055);
                    list.add(i);
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12056);
            assertTrue(expectedAsc.containsAll(list));
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testDescending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12057);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_19pdr8x9ax();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12057, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_19pdr8x9ax() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12057);
            __CLR4_4_197q97qkcq4svv6.R.inc(12058);
            final List<Integer> list = new ArrayList<Integer>();
            __CLR4_4_197q97qkcq4svv6.R.inc(12059);
            for (int i : descIntRange) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12060);
                    list.add(i);
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12061);
            assertTrue(expectedDesc.containsAll(list));
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testToCollection() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12062);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ett1qq9b2();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testToCollection", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12062, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ett1qq9b2() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12062);
            __CLR4_4_197q97qkcq4svv6.R.inc(12063);
            Collection<Integer> ascCol = IteratorToGeneratorAdapter.adapt(ascIntRange).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12064);
            assertEquals("Different collections", expectedAsc, ascCol);
            __CLR4_4_197q97qkcq4svv6.R.inc(12065);
            Collection<Integer> descCol = IteratorToGeneratorAdapter.adapt(descIntRange).toCollection();
            __CLR4_4_197q97qkcq4svv6.R.inc(12066);
            assertEquals("Different collections", expectedDesc, descCol);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testTransformedGenerator() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12067);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_11mse9r9b7();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testTransformedGenerator", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12067, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_11mse9r9b7() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12067);
            __CLR4_4_197q97qkcq4svv6.R.inc(12068);
            int expected = 45;
            __CLR4_4_197q97qkcq4svv6.R.inc(12069);
            int total = IteratorToGeneratorAdapter.adapt(ascIntRange).to(new Function<Generator<? extends Integer>, Integer>() {

                public Integer evaluate(Generator<? extends Integer> obj) {
                    try {
                        __CLR4_4_197q97qkcq4svv6.R.inc(12070);
                        __CLR4_4_197q97qkcq4svv6.R.inc(12071);
                        int total = 0;
                        __CLR4_4_197q97qkcq4svv6.R.inc(12072);
                        for (Object element : obj.toCollection()) {
                            {
                                __CLR4_4_197q97qkcq4svv6.R.inc(12073);
                                total += (Integer) element;
                            }
                        }
                        __CLR4_4_197q97qkcq4svv6.R.inc(12074);
                        return total;
                    } finally {
                        __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
                    }
                }
            });
            __CLR4_4_197q97qkcq4svv6.R.inc(12075);
            assertEquals(expected, total);
            __CLR4_4_197q97qkcq4svv6.R.inc(12076);
            expected = 55;
            __CLR4_4_197q97qkcq4svv6.R.inc(12077);
            total = IteratorToGeneratorAdapter.adapt(descIntRange).to(new Function<Generator<? extends Integer>, Integer>() {

                public Integer evaluate(Generator<? extends Integer> obj) {
                    try {
                        __CLR4_4_197q97qkcq4svv6.R.inc(12078);
                        __CLR4_4_197q97qkcq4svv6.R.inc(12079);
                        int total = 0;
                        __CLR4_4_197q97qkcq4svv6.R.inc(12080);
                        for (Object element : obj.toCollection()) {
                            {
                                __CLR4_4_197q97qkcq4svv6.R.inc(12081);
                                total += (Integer) element;
                            }
                        }
                        __CLR4_4_197q97qkcq4svv6.R.inc(12082);
                        return total;
                    } finally {
                        __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
                    }
                }
            });
            __CLR4_4_197q97qkcq4svv6.R.inc(12083);
            assertEquals(expected, total);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    // Range tests
    // ---------------------------------------------------------------
    // A base range with all integers between -6 and 6
    private final List<Integer> fullRange = Collections.unmodifiableList(Arrays.asList(-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6));

    @Test
    public void testEmptyRanges() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12084);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1dlg7c9bo();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testEmptyRanges", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12084, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1dlg7c9bo() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12084);
            __CLR4_4_197q97qkcq4svv6.R.inc(12085);
            IntegerRange empty1 = Ranges.integerRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
            __CLR4_4_197q97qkcq4svv6.R.inc(12086);
            assertTrue("The range was expected to be empty.", empty1.isEmpty());
            __CLR4_4_197q97qkcq4svv6.R.inc(12087);
            IntegerRange empty2 = Ranges.integerRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
            __CLR4_4_197q97qkcq4svv6.R.inc(12088);
            assertTrue("The range was expected to be empty.", empty2.isEmpty());
            __CLR4_4_197q97qkcq4svv6.R.inc(12089);
            IntegerRange empty3 = Ranges.integerRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
            __CLR4_4_197q97qkcq4svv6.R.inc(12090);
            assertTrue("The range was expected to be empty.", empty3.isEmpty());
            __CLR4_4_197q97qkcq4svv6.R.inc(12091);
            IntegerRange empty4 = Ranges.integerRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12092);
            assertTrue("The range was expected to be empty.", empty4.isEmpty());
            __CLR4_4_197q97qkcq4svv6.R.inc(12093);
            IntegerRange empty5 = Ranges.integerRange(-3, BoundType.CLOSED, -3, BoundType.OPEN, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12094);
            assertTrue("The range was expected to be empty.", empty5.isEmpty());
            __CLR4_4_197q97qkcq4svv6.R.inc(12095);
            IntegerRange empty6 = Ranges.integerRange(1, BoundType.OPEN, 0, BoundType.CLOSED, -2);
            __CLR4_4_197q97qkcq4svv6.R.inc(12096);
            assertTrue("The range was expected to be empty.", empty6.isEmpty());
            __CLR4_4_197q97qkcq4svv6.R.inc(12097);
            IntegerRange notEmpty1 = Ranges.integerRange(-3, BoundType.CLOSED, -3, BoundType.CLOSED, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12098);
            assertFalse("The range was not expected to be empty.", notEmpty1.isEmpty());
            __CLR4_4_197q97qkcq4svv6.R.inc(12099);
            IntegerRange notEmpty2 = Ranges.integerRange(-3, BoundType.OPEN, -2, BoundType.CLOSED, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12100);
            assertFalse("The range was not expected to be empty.", notEmpty2.isEmpty());
            __CLR4_4_197q97qkcq4svv6.R.inc(12101);
            IntegerRange notEmpty3 = Ranges.integerRange(2, BoundType.OPEN, 1, BoundType.CLOSED, -1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12102);
            assertFalse("The range was not expected to be empty.", notEmpty3.isEmpty());
            __CLR4_4_197q97qkcq4svv6.R.inc(12103);
            IntegerRange notEmpty4 = Ranges.integerRange(2, BoundType.CLOSED, 1, BoundType.OPEN, -1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12104);
            assertFalse("The range was not expected to be empty.", notEmpty4.isEmpty());
            __CLR4_4_197q97qkcq4svv6.R.inc(12105);
            IntegerRange notEmpty5 = Ranges.integerRange(1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12106);
            assertFalse("The range was not expected to be empty.", notEmpty5.isEmpty());
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedAscendingContains() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12107);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_16x8bm49cb();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testClosedClosedAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12107, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_16x8bm49cb() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12107);
            // [-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12108);
            IntegerRange range = Ranges.integerRange(-5, BoundType.CLOSED, 5, BoundType.CLOSED, 3);
            // [-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12109);
            List<Integer> arr = Arrays.asList(-5, -2, 1, 4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12110);
            for (Integer element : arr) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12111);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12112);
            List<Integer> elementsNotPresent = new ArrayList<Integer>(fullRange);
            __CLR4_4_197q97qkcq4svv6.R.inc(12113);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_197q97qkcq4svv6.R.inc(12114);
            for (Integer element : elementsNotPresent) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12115);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedAscendingContains() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12116);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_198ttxy9ck();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testOpenClosedAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12116, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_198ttxy9ck() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12116);
            // (-5, 5], 3 = -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12117);
            IntegerRange range = Ranges.integerRange(-5, BoundType.OPEN, 5, BoundType.CLOSED, 3);
            // (-5, 5], 3 = -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12118);
            List<Integer> arr = Arrays.asList(-2, 1, 4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12119);
            for (Integer element : arr) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12120);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12121);
            List<Integer> elementsNotPresent = new ArrayList<Integer>(fullRange);
            __CLR4_4_197q97qkcq4svv6.R.inc(12122);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_197q97qkcq4svv6.R.inc(12123);
            for (Integer element : elementsNotPresent) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12124);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenAscendingContains() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12125);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1grodw69ct();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testClosedOpenAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12125, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1grodw69ct() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12125);
            // [-5, 5), 3 = -5, -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12126);
            IntegerRange range = Ranges.integerRange(-5, BoundType.CLOSED, 5, BoundType.OPEN, 3);
            // (-5, 5], 3 = -5, -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12127);
            List<Integer> arr = Arrays.asList(-5, -2, 1, 4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12128);
            for (Integer element : arr) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12129);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12130);
            List<Integer> elementsNotPresent = new ArrayList<Integer>(fullRange);
            __CLR4_4_197q97qkcq4svv6.R.inc(12131);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_197q97qkcq4svv6.R.inc(12132);
            for (Integer element : elementsNotPresent) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12133);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenAscendingContains() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12134);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_156iut49d2();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testOpenOpenAscendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12134, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_156iut49d2() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12134);
            // (-5, 5), 3 = -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12135);
            IntegerRange range = Ranges.integerRange(-5, BoundType.OPEN, 5, BoundType.OPEN, 3);
            // (-5, 5), 3 = -2, 1, 4
            __CLR4_4_197q97qkcq4svv6.R.inc(12136);
            List<Integer> arr = Arrays.asList(-2, 1, 4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12137);
            for (Integer element : arr) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12138);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12139);
            List<Integer> elementsNotPresent = new ArrayList<Integer>(fullRange);
            __CLR4_4_197q97qkcq4svv6.R.inc(12140);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_197q97qkcq4svv6.R.inc(12141);
            for (Integer element : elementsNotPresent) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12142);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testContainsSingleStepAscending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12143);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1a9vwbe9db();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testContainsSingleStepAscending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12143, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1a9vwbe9db() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12143);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_197q97qkcq4svv6.R.inc(12144);
            IntegerRange ascendingRange = Ranges.integerRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_197q97qkcq4svv6.R.inc(12145);
            List<Integer> arr = Arrays.asList(-1, 0, 1, 2);
            __CLR4_4_197q97qkcq4svv6.R.inc(12146);
            for (Integer element : arr) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12147);
                    assertTrue("Expected element [" + element + "] is missing in range [" + ascendingRange + "]", ascendingRange.contains(element));
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12148);
            List<Integer> elementsNotPresent = new ArrayList<Integer>(fullRange);
            __CLR4_4_197q97qkcq4svv6.R.inc(12149);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_197q97qkcq4svv6.R.inc(12150);
            for (Integer element : elementsNotPresent) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12151);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + ascendingRange + "]", ascendingRange.contains(element));
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testClosedClosedDescendingContains() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12152);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1rfbu089dk();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testClosedClosedDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12152, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1rfbu089dk() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12152);
            // [5, -5], -3 = 5, 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12153);
            IntegerRange range = Ranges.integerRange(5, BoundType.CLOSED, -5, BoundType.CLOSED, -3);
            // [5, -5], -3 = 5, 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12154);
            List<Integer> arr = Arrays.asList(5, 2, -1, -4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12155);
            for (Integer element : arr) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12156);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12157);
            List<Integer> elementsNotPresent = new ArrayList<Integer>(fullRange);
            __CLR4_4_197q97qkcq4svv6.R.inc(12158);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_197q97qkcq4svv6.R.inc(12159);
            for (Integer element : elementsNotPresent) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12160);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testOpenClosedDescendingContains() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12161);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1vfe8g69dt();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testOpenClosedDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12161, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1vfe8g69dt() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12161);
            // (5, -5], -3 = 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12162);
            IntegerRange range = Ranges.integerRange(5, BoundType.OPEN, -5, BoundType.CLOSED, -3);
            // (5, -5], -3 = 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12163);
            List<Integer> arr = Arrays.asList(2, -1, -4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12164);
            for (Integer element : arr) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12165);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12166);
            List<Integer> elementsNotPresent = new ArrayList<Integer>(fullRange);
            __CLR4_4_197q97qkcq4svv6.R.inc(12167);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_197q97qkcq4svv6.R.inc(12168);
            for (Integer element : elementsNotPresent) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12169);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testClosedOpenDescendingContains() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12170);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1jgqsze9e2();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testClosedOpenDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12170, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1jgqsze9e2() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12170);
            // [5, -5), -3 = 5, 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12171);
            IntegerRange range = Ranges.integerRange(5, BoundType.CLOSED, -5, BoundType.OPEN, -3);
            // [5, -5), -3 = 5, 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12172);
            List<Integer> arr = Arrays.asList(5, 2, -1, -4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12173);
            for (Integer element : arr) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12174);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12175);
            List<Integer> elementsNotPresent = new ArrayList<Integer>(fullRange);
            __CLR4_4_197q97qkcq4svv6.R.inc(12176);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_197q97qkcq4svv6.R.inc(12177);
            for (Integer element : elementsNotPresent) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12178);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testOpenOpenDescendingContains() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12179);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1nixyqk9eb();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testOpenOpenDescendingContains", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12179, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1nixyqk9eb() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12179);
            // (5, -5), -3 = 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12180);
            IntegerRange range = Ranges.integerRange(5, BoundType.OPEN, -5, BoundType.OPEN, -3);
            // (5, -5), -3 = 2, -1, -4
            __CLR4_4_197q97qkcq4svv6.R.inc(12181);
            List<Integer> arr = Arrays.asList(2, -1, -4);
            __CLR4_4_197q97qkcq4svv6.R.inc(12182);
            for (Integer element : arr) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12183);
                    assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12184);
            List<Integer> elementsNotPresent = new ArrayList<Integer>(fullRange);
            __CLR4_4_197q97qkcq4svv6.R.inc(12185);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_197q97qkcq4svv6.R.inc(12186);
            for (Integer element : elementsNotPresent) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12187);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testContainsSingleStepDescending() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12188);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1p64e589ek();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testContainsSingleStepDescending", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12188, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1p64e589ek() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12188);
            // [2, -2), -1 = 2, 1, 0, -1
            __CLR4_4_197q97qkcq4svv6.R.inc(12189);
            IntegerRange descendingRange = Ranges.integerRange(2, BoundType.CLOSED, -2, BoundType.OPEN, -1);
            // [2, -2), -1 = 2, 1, 0, -1
            __CLR4_4_197q97qkcq4svv6.R.inc(12190);
            List<Integer> arr = Arrays.asList(2, 1, 0, -1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12191);
            for (Integer element : arr) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12192);
                    assertTrue("Expected element [" + element + "] is missing in range [" + descendingRange + "]", descendingRange.contains(element));
                }
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12193);
            List<Integer> elementsNotPresent = new ArrayList<Integer>(fullRange);
            __CLR4_4_197q97qkcq4svv6.R.inc(12194);
            elementsNotPresent.removeAll(arr);
            __CLR4_4_197q97qkcq4svv6.R.inc(12195);
            for (Integer element : elementsNotPresent) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12196);
                    assertFalse("Unexpected element [" + element + "] is present in range [" + descendingRange + "]", descendingRange.contains(element));
                }
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testContainsNullOrEmpty() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12197);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1qnnvh59et();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testContainsNullOrEmpty", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12197, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1qnnvh59et() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12197);
            __CLR4_4_197q97qkcq4svv6.R.inc(12198);
            IntegerRange range = Ranges.integerRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12199);
            assertFalse(range.contains(null));
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testContainsAll() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12200);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1uiiq8n9ew();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testContainsAll", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12200, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1uiiq8n9ew() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12200);
            // (-2, 2], 1 = -1, 0, 1, 2
            __CLR4_4_197q97qkcq4svv6.R.inc(12201);
            IntegerRange range = Ranges.integerRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12202);
            List<Integer> list = Arrays.asList(-1, 0, 1, 2);
            __CLR4_4_197q97qkcq4svv6.R.inc(12203);
            assertTrue("Range [" + range + "] was expected to contain all elements from list [" + list + "]", range.containsAll(list));
            __CLR4_4_197q97qkcq4svv6.R.inc(12204);
            List<Integer> listWithExtraElements = Arrays.asList(2, -1, 0, 1, 2, 3);
            __CLR4_4_197q97qkcq4svv6.R.inc(12205);
            assertFalse("Range [" + range + "] has more elements than expected", range.containsAll(listWithExtraElements));
            __CLR4_4_197q97qkcq4svv6.R.inc(12206);
            assertFalse(range.containsAll(null));
            __CLR4_4_197q97qkcq4svv6.R.inc(12207);
            assertFalse(range.containsAll(Collections.EMPTY_LIST));
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() throws Exception {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12208);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6089f4();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12208, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6089f4() throws Exception {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12208);
            // equals basic properties
            __CLR4_4_197q97qkcq4svv6.R.inc(12209);
            IntegerRange range = Ranges.integerRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12210);
            assertEquals("equals must be reflexive", range, range);
            __CLR4_4_197q97qkcq4svv6.R.inc(12211);
            assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());
            // should be able to compare to null
            __CLR4_4_197q97qkcq4svv6.R.inc(12212);
            // should be able to compare to null
            assertTrue(!range.equals(null));
            __CLR4_4_197q97qkcq4svv6.R.inc(12213);
            Object range2 = Ranges.integerRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12214);
            if ((((range.equals(range2)) && (__CLR4_4_197q97qkcq4svv6.R.iget(12215) != 0 | true)) || (__CLR4_4_197q97qkcq4svv6.R.iget(12216) == 0 & false))) {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12217);
                    assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());
                    __CLR4_4_197q97qkcq4svv6.R.inc(12218);
                    assertEquals("equals must be symmetric", range2, range);
                }
            } else {
                {
                    __CLR4_4_197q97qkcq4svv6.R.inc(12219);
                    assertTrue("equals must be symmetric", !range2.equals(range));
                }
            // Changing attributes
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12220);
            Object range3 = Ranges.integerRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12221);
            assertFalse("Invalid equals after changing attributes", range.equals(range3));
            __CLR4_4_197q97qkcq4svv6.R.inc(12222);
            Object range4 = Ranges.integerRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12223);
            assertFalse("Invalid equals after changing attributes", range.equals(range4));
            __CLR4_4_197q97qkcq4svv6.R.inc(12224);
            Object range5 = Ranges.integerRange(-2, BoundType.CLOSED, 1, BoundType.OPEN, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12225);
            assertFalse("Invalid equals after changing attributes", range.equals(range5));
            __CLR4_4_197q97qkcq4svv6.R.inc(12226);
            Object range6 = Ranges.integerRange(-2, BoundType.CLOSED, 2, BoundType.CLOSED, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12227);
            assertFalse("Invalid equals after changing attributes", range.equals(range6));
            __CLR4_4_197q97qkcq4svv6.R.inc(12228);
            Object range7 = Ranges.integerRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 2);
            __CLR4_4_197q97qkcq4svv6.R.inc(12229);
            assertFalse("Invalid equals after changing attributes", range.equals(range7));
            // Using different constructors
            __CLR4_4_197q97qkcq4svv6.R.inc(12230);
            IntegerRange range8 = Ranges.integerRange(Long.valueOf(-2), Long.valueOf(2), Long.valueOf(1));
            __CLR4_4_197q97qkcq4svv6.R.inc(12231);
            assertEquals("Invalid equals using different constructor", range, range8);
            __CLR4_4_197q97qkcq4svv6.R.inc(12232);
            IntegerRange range9 = Ranges.integerRange(Long.valueOf(-2), Long.valueOf(2));
            __CLR4_4_197q97qkcq4svv6.R.inc(12233);
            assertEquals("Invalid equals using different constructor", range, range9);
            __CLR4_4_197q97qkcq4svv6.R.inc(12234);
            Endpoint<Integer> leftEndpoint = new Endpoint<Integer>(-2, BoundType.CLOSED);
            __CLR4_4_197q97qkcq4svv6.R.inc(12235);
            Endpoint<Integer> rightEndpoint = new Endpoint<Integer>(2, BoundType.OPEN);
            __CLR4_4_197q97qkcq4svv6.R.inc(12236);
            IntegerRange range10 = Ranges.integerRange(leftEndpoint, rightEndpoint, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12237);
            assertEquals("Invalid equals using different constructor", range, range10);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testToString() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12238);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1hrxdid9fy();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testToString", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12238, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1hrxdid9fy() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12238);
            __CLR4_4_197q97qkcq4svv6.R.inc(12239);
            IntegerRange range = Ranges.integerRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
            __CLR4_4_197q97qkcq4svv6.R.inc(12240);
            assertEquals("Wrong string value", "IntegerRange<(-2, 2], 1>", range.toString());
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testConstructorUsingSameEndpoint() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12241);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1e6pvy69g1();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testConstructorUsingSameEndpoint", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12241, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1e6pvy69g1() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12241);
            __CLR4_4_197q97qkcq4svv6.R.inc(12242);
            Endpoint<Integer> uniqueEndpoint = new Endpoint<Integer>(10, BoundType.CLOSED);
            __CLR4_4_197q97qkcq4svv6.R.inc(12243);
            try {
                __CLR4_4_197q97qkcq4svv6.R.inc(12244);
                Ranges.integerRange(uniqueEndpoint, uniqueEndpoint, 1);
            } catch (IllegalArgumentException e) {
                __CLR4_4_197q97qkcq4svv6.R.inc(12245);
                fail("Not expected to get here");
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testInvalidRange() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12246);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1fiycn39g6();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testInvalidRange", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12246, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1fiycn39g6() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12246);
            __CLR4_4_197q97qkcq4svv6.R.inc(12247);
            try {
                __CLR4_4_197q97qkcq4svv6.R.inc(12248);
                Ranges.integerRange(10, BoundType.OPEN, -5, BoundType.CLOSED, 10);
                __CLR4_4_197q97qkcq4svv6.R.inc(12249);
                fail("Not expected to get here");
            } catch (IllegalArgumentException e) {
            // Do nothing
            }
            __CLR4_4_197q97qkcq4svv6.R.inc(12250);
            Endpoint<Integer> leftEndpoint = new Endpoint<Integer>(10, BoundType.CLOSED);
            __CLR4_4_197q97qkcq4svv6.R.inc(12251);
            Endpoint<Integer> rightEndpoint = new Endpoint<Integer>(-5, BoundType.OPEN);
            __CLR4_4_197q97qkcq4svv6.R.inc(12252);
            try {
                __CLR4_4_197q97qkcq4svv6.R.inc(12253);
                Ranges.integerRange(leftEndpoint, rightEndpoint, 1);
                __CLR4_4_197q97qkcq4svv6.R.inc(12254);
                fail("Not expected to get here");
            } catch (IllegalArgumentException e) {
            // Do nothing
            }
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }

    @Test
    public void testDefaultStep() {
        __CLR4_4_197q97qkcq4svv6.R.globalSliceStart(getClass().getName(), 12255);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1i27fky9gf();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_197q97qkcq4svv6.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.range.TestIntegerRange.testDefaultStep", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 12255, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1i27fky9gf() {
        try {
            __CLR4_4_197q97qkcq4svv6.R.inc(12255);
            __CLR4_4_197q97qkcq4svv6.R.inc(12256);
            assertEquals("Invalid default step", Integer.valueOf(-1), IntegerRange.DEFAULT_STEP.evaluate(10, 1));
            __CLR4_4_197q97qkcq4svv6.R.inc(12257);
            assertEquals("Invalid default step", Integer.valueOf(1), IntegerRange.DEFAULT_STEP.evaluate(1, 10));
        } finally {
            __CLR4_4_197q97qkcq4svv6.R.flushNeeded();
        }
    }
}

