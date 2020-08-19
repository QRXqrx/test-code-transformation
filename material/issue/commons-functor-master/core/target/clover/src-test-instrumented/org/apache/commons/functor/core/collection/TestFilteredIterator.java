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
package org.apache.commons.functor.core.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.Constant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestFilteredIterator extends BaseFunctorTest {

    static class __CLR4_4_15lp5lpkcq4suqs {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 7392, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
    public Object makeFunctor() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7261);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7262);
            List<String> list = new ArrayList<String>();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7263);
            list.add("xyzzy");
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7264);
            return FilteredIterator.filter(list.iterator(), Constant.truePredicate());
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Before
    public void setUp() throws Exception {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7265);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7266);
            list = new ArrayList<Integer>();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7267);
            evens = new ArrayList<Integer>();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7268);
            for (int i = 0; (((i < 10) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7269) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7270) == 0 & false)); i++) {
                {
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7271);
                    list.add(Integer.valueOf(i));
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7272);
                    if ((((i % 2 == 0) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7273) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7274) == 0 & false))) {
                        {
                            __CLR4_4_15lp5lpkcq4suqs.R.inc(7275);
                            evens.add(Integer.valueOf(i));
                        }
                    }
                }
            }
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @After
    public void tearDown() throws Exception {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7276);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7277);
            list = null;
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7278);
            evens = null;
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testSomePass() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7279);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1gi5vsu5m7();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testSomePass", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7279, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1gi5vsu5m7() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7279);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7280);
            Iterator<Integer> expected = evens.iterator();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7281);
            Iterator<Integer> testing = new FilteredIterator<Integer>(list.iterator(), isEven);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7282);
            while ((((expected.hasNext()) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7283) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7284) == 0 & false))) {
                {
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7285);
                    assertTrue(testing.hasNext());
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7286);
                    assertEquals(expected.next(), testing.next());
                }
            }
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7287);
            assertTrue(!testing.hasNext());
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testAllPass() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7288);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1lu2lw95mg();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testAllPass", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7288, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1lu2lw95mg() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7288);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7289);
            Iterator<Integer> expected = list.iterator();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7290);
            Iterator<Integer> testing = new FilteredIterator<Integer>(list.iterator(), Constant.truePredicate());
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7291);
            while ((((expected.hasNext()) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7292) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7293) == 0 & false))) {
                {
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7294);
                    assertTrue(testing.hasNext());
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7295);
                    assertEquals(expected.next(), testing.next());
                }
            }
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7296);
            assertTrue(!testing.hasNext());
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testAllPass2() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7297);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1567vmh5mp();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testAllPass2", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7297, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1567vmh5mp() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7297);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7298);
            Iterator<Integer> expected = list.iterator();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7299);
            Iterator<Integer> testing = new FilteredIterator<Integer>(list.iterator(), Constant.truePredicate());
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7300);
            while ((((expected.hasNext()) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7301) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7302) == 0 & false))) {
                {
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7303);
                    assertTrue(testing.hasNext());
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7304);
                    assertEquals(expected.next(), testing.next());
                }
            }
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7305);
            assertTrue(!testing.hasNext());
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testEmptyList() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7306);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s6zsw5my();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testEmptyList", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7306, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s6zsw5my() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7306);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7307);
            Iterator<Integer> testing = new FilteredIterator<Integer>(new ArrayList<Integer>().iterator(), isEven);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7308);
            assertTrue(!testing.hasNext());
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testNonePass() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7309);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1wg4dmq5n1();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testNonePass", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7309, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1wg4dmq5n1() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7309);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7310);
            Iterator<Integer> testing = new FilteredIterator<Integer>(new ArrayList<Integer>().iterator(), Constant.falsePredicate());
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7311);
            assertTrue(!testing.hasNext());
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testNextWithoutHasNext() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7312);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1yf2u5r5n4();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testNextWithoutHasNext", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7312, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1yf2u5r5n4() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7312);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7313);
            Iterator<Integer> testing = new FilteredIterator<Integer>(list.iterator(), isEven);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7314);
            Iterator<Integer> expected = evens.iterator();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7315);
            while ((((expected.hasNext()) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7316) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7317) == 0 & false))) {
                {
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7318);
                    assertEquals(expected.next(), testing.next());
                }
            }
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7319);
            assertTrue(!(testing.hasNext()));
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testNextAfterEndOfList() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7320);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1kdu7b45nc();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 78, 101, 120, 116, 65, 102, 116, 101, 114, 69, 110, 100, 79, 102, 76, 105, 115, 116, 58, 32, 91, 78, 111, 83, 117, 99, 104, 69, 108, 101, 109, 101, 110, 116, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_t2$ instanceof NoSuchElementException) {
                $CLV_p$ = 1;
                $CLV_t$ = null;
            } else {
                $CLV_p$ = 0;
                $CLV_t$ = $CLV_t2$;
            }
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testNextAfterEndOfList", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7320, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1kdu7b45nc() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7320);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7321);
            Iterator<Integer> testing = new FilteredIterator<Integer>(list.iterator(), isEven);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7322);
            Iterator<Integer> expected = evens.iterator();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7323);
            while ((((expected.hasNext()) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7324) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7325) == 0 & false))) {
                {
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7326);
                    assertEquals(expected.next(), testing.next());
                }
            }
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7327);
            testing.next();
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testNextOnEmptyList() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7328);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_11u5fce5nk();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 78, 101, 120, 116, 79, 110, 69, 109, 112, 116, 121, 76, 105, 115, 116, 58, 32, 91, 78, 111, 83, 117, 99, 104, 69, 108, 101, 109, 101, 110, 116, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_t2$ instanceof NoSuchElementException) {
                $CLV_p$ = 1;
                $CLV_t$ = null;
            } else {
                $CLV_p$ = 0;
                $CLV_t$ = $CLV_t2$;
            }
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testNextOnEmptyList", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7328, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_11u5fce5nk() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7328);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7329);
            Iterator<Integer> testing = new FilteredIterator<Integer>(new ArrayList<Integer>().iterator(), isEven);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7330);
            testing.next();
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveBeforeNext() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7331);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1b6ju0f5nn();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 82, 101, 109, 111, 118, 101, 66, 101, 102, 111, 114, 101, 78, 101, 120, 116, 58, 32, 91, 73, 108, 108, 101, 103, 97, 108, 83, 116, 97, 116, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_t2$ instanceof IllegalStateException) {
                $CLV_p$ = 1;
                $CLV_t$ = null;
            } else {
                $CLV_p$ = 0;
                $CLV_t$ = $CLV_t2$;
            }
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testRemoveBeforeNext", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7331, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1b6ju0f5nn() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7331);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7332);
            Iterator<Integer> testing = new FilteredIterator<Integer>(list.iterator(), isEven);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7333);
            testing.remove();
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveAfterNext() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7334);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1sfnuo05nq();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 82, 101, 109, 111, 118, 101, 65, 102, 116, 101, 114, 78, 101, 120, 116, 58, 32, 91, 73, 108, 108, 101, 103, 97, 108, 83, 116, 97, 116, 101, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_t2$ instanceof IllegalStateException) {
                $CLV_p$ = 1;
                $CLV_t$ = null;
            } else {
                $CLV_p$ = 0;
                $CLV_t$ = $CLV_t2$;
            }
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testRemoveAfterNext", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7334, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1sfnuo05nq() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7334);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7335);
            Iterator<Integer> testing = new FilteredIterator<Integer>(list.iterator(), isEven);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7336);
            testing.next();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7337);
            testing.remove();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7338);
            testing.remove();
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testRemoveSome() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7339);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1nbeeoh5nv();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testRemoveSome", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7339, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1nbeeoh5nv() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7339);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7340);
            Iterator<Integer> testing = new FilteredIterator<Integer>(list.iterator(), isEven);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7341);
            while ((((testing.hasNext()) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7342) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7343) == 0 & false))) {
                {
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7344);
                    testing.next();
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7345);
                    testing.remove();
                }
            }
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7346);
            for (Iterator<Integer> iter = list.iterator(); (((iter.hasNext()) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7347) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7348) == 0 & false)); ) {
                {
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7349);
                    assertTrue(!isEven.test(iter.next()));
                }
            }
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testRemoveAll() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7350);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1dd9vci5o6();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testRemoveAll", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7350, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1dd9vci5o6() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7350);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7351);
            Iterator<Integer> testing = new FilteredIterator<Integer>(list.iterator(), Constant.truePredicate());
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7352);
            while ((((testing.hasNext()) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7353) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7354) == 0 & false))) {
                {
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7355);
                    testing.next();
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7356);
                    testing.remove();
                }
            }
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7357);
            assertTrue(list.isEmpty());
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testRemoveWithoutHasNext() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7358);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_11ujx1e5oe();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testRemoveWithoutHasNext", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7358, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_11ujx1e5oe() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7358);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7359);
            Iterator<Integer> testing = new FilteredIterator<Integer>(list.iterator(), Constant.truePredicate());
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7360);
            for (int i = 0, m = list.size(); (((i < m) && (__CLR4_4_15lp5lpkcq4suqs.R.iget(7361) != 0 | true)) || (__CLR4_4_15lp5lpkcq4suqs.R.iget(7362) == 0 & false)); i++) {
                {
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7363);
                    testing.next();
                    __CLR4_4_15lp5lpkcq4suqs.R.inc(7364);
                    testing.remove();
                }
            }
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7365);
            assertTrue(list.isEmpty());
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testFilterWithNullIteratorReturnsNull() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7366);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1rye8l05om();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testFilterWithNullIteratorReturnsNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7366, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1rye8l05om() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7366);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7367);
            assertNull(FilteredIterator.filter(null, Constant.truePredicate()));
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testFilterWithNullPredicateReturnsIdentity() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7368);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1gzh4bc5oo();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testFilterWithNullPredicateReturnsIdentity", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7368, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1gzh4bc5oo() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7368);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7369);
            Iterator<Integer> iter = list.iterator();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7370);
            assertSame(iter, FilteredIterator.filter(iter, null));
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNull() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7371);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1jqp5ui5or();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 67, 111, 110, 115, 116, 114, 117, 99, 116, 111, 114, 80, 114, 111, 104, 105, 98, 105, 116, 115, 78, 117, 108, 108, 58, 32, 91, 78, 117, 108, 108, 80, 111, 105, 110, 116, 101, 114, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_t2$ instanceof NullPointerException) {
                $CLV_p$ = 1;
                $CLV_t$ = null;
            } else {
                $CLV_p$ = 0;
                $CLV_t$ = $CLV_t2$;
            }
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testConstructorProhibitsNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7371, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1jqp5ui5or() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7371);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7372);
            new FilteredIterator<Integer>(null, null);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNull2() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7373);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1fi3s3q5ot();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 67, 111, 110, 115, 116, 114, 117, 99, 116, 111, 114, 80, 114, 111, 104, 105, 98, 105, 116, 115, 78, 117, 108, 108, 50, 58, 32, 91, 78, 117, 108, 108, 80, 111, 105, 110, 116, 101, 114, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_t2$ instanceof NullPointerException) {
                $CLV_p$ = 1;
                $CLV_t$ = null;
            } else {
                $CLV_p$ = 0;
                $CLV_t$ = $CLV_t2$;
            }
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testConstructorProhibitsNull2", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7373, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1fi3s3q5ot() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7373);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7374);
            new FilteredIterator<Integer>(null, Constant.truePredicate());
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNull3() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7375);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ir3qw75ov();
            $CLV_p$ = 0;
            $CLV_t$ = new java.lang.RuntimeException(new String(new char[] { 69, 120, 112, 101, 99, 116, 101, 100, 32, 111, 110, 101, 32, 111, 102, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 115, 32, 116, 111, 32, 98, 101, 32, 116, 104, 114, 111, 119, 110, 32, 102, 114, 111, 109, 32, 116, 101, 115, 116, 32, 109, 101, 116, 104, 111, 100, 32, 116, 101, 115, 116, 67, 111, 110, 115, 116, 114, 117, 99, 116, 111, 114, 80, 114, 111, 104, 105, 98, 105, 116, 115, 78, 117, 108, 108, 51, 58, 32, 91, 78, 117, 108, 108, 80, 111, 105, 110, 116, 101, 114, 69, 120, 99, 101, 112, 116, 105, 111, 110, 93 }));
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_t2$ instanceof NullPointerException) {
                $CLV_p$ = 1;
                $CLV_t$ = null;
            } else {
                $CLV_p$ = 0;
                $CLV_t$ = $CLV_t2$;
            }
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testConstructorProhibitsNull3", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7375, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ir3qw75ov() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7375);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7376);
            new FilteredIterator<Integer>(list.iterator(), null);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() {
        __CLR4_4_15lp5lpkcq4suqs.R.globalSliceStart(getClass().getName(), 7377);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6085ox();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15lp5lpkcq4suqs.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestFilteredIterator.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7377, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6085ox() {
        try {
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7377);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7378);
            Iterator<Integer> iter = list.iterator();
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7379);
            FilteredIterator<Integer> t = new FilteredIterator<Integer>(iter, isEven);
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7380);
            Predicate<Integer> isOdd = new Predicate<Integer>() {

                public boolean test(Integer obj) {
                    try {
                        __CLR4_4_15lp5lpkcq4suqs.R.inc(7381);
                        __CLR4_4_15lp5lpkcq4suqs.R.inc(7382);
                        return obj.intValue() % 2 != 0;
                    } finally {
                        __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
                    }
                }
            };
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7383);
            Predicate<Float> isOddFloat = new Predicate<Float>() {

                public boolean test(Float obj) {
                    try {
                        __CLR4_4_15lp5lpkcq4suqs.R.inc(7384);
                        __CLR4_4_15lp5lpkcq4suqs.R.inc(7385);
                        return obj.intValue() % 2 != 0;
                    } finally {
                        __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
                    }
                }
            };
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7386);
            assertEquals(t, new FilteredIterator<Integer>(iter, isEven));
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7387);
            assertTrue(!t.equals(new FilteredIterator<Integer>(list.iterator(), isOdd)));
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7388);
            assertTrue(!t.equals(new FilteredIterator<Float>(Arrays.asList(0.0f, 0.1f).iterator(), isOddFloat)));
            __CLR4_4_15lp5lpkcq4suqs.R.inc(7389);
            assertTrue(!t.equals(null));
        } finally {
            __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
        }
    }

    // Attributes
    // ------------------------------------------------------------------------
    private List<Integer> list = null;

    private List<Integer> evens = null;

    private Predicate<Integer> isEven = new Predicate<Integer>() {

        public boolean test(Integer obj) {
            try {
                __CLR4_4_15lp5lpkcq4suqs.R.inc(7390);
                __CLR4_4_15lp5lpkcq4suqs.R.inc(7391);
                return obj.intValue() % 2 == 0;
            } finally {
                __CLR4_4_15lp5lpkcq4suqs.R.flushNeeded();
            }
        }
    };
}

