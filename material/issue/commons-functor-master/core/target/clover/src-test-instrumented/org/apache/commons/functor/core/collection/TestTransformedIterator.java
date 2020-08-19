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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.core.Identity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestTransformedIterator extends BaseFunctorTest {

    static class __CLR4_4_15ss5sskcq4susd {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 7614, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
            __CLR4_4_15ss5sskcq4susd.R.inc(7516);
            __CLR4_4_15ss5sskcq4susd.R.inc(7517);
            List<String> list1 = new ArrayList<String>();
            __CLR4_4_15ss5sskcq4susd.R.inc(7518);
            list1.add("xyzzy");
            __CLR4_4_15ss5sskcq4susd.R.inc(7519);
            return TransformedIterator.transform(list1.iterator(), Identity.instance());
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    // Lifecycle
    // ------------------------------------------------------------------------
    @Before
    public void setUp() throws Exception {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7520);
            __CLR4_4_15ss5sskcq4susd.R.inc(7521);
            list = new ArrayList<Integer>();
            __CLR4_4_15ss5sskcq4susd.R.inc(7522);
            negatives = new ArrayList<Integer>();
            __CLR4_4_15ss5sskcq4susd.R.inc(7523);
            for (int i = 0; (((i < 10) && (__CLR4_4_15ss5sskcq4susd.R.iget(7524) != 0 | true)) || (__CLR4_4_15ss5sskcq4susd.R.iget(7525) == 0 & false)); i++) {
                {
                    __CLR4_4_15ss5sskcq4susd.R.inc(7526);
                    list.add(Integer.valueOf(i));
                    __CLR4_4_15ss5sskcq4susd.R.inc(7527);
                    negatives.add(Integer.valueOf(i * -1));
                }
            }
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @After
    public void tearDown() throws Exception {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7528);
            __CLR4_4_15ss5sskcq4susd.R.inc(7529);
            list = null;
            __CLR4_4_15ss5sskcq4susd.R.inc(7530);
            negatives = null;
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testBasicTransform() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7531);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_126anjd5t7();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testBasicTransform", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7531, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_126anjd5t7() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7531);
            __CLR4_4_15ss5sskcq4susd.R.inc(7532);
            Iterator<Integer> expected = negatives.iterator();
            __CLR4_4_15ss5sskcq4susd.R.inc(7533);
            Iterator<Integer> testing = new TransformedIterator<Integer, Integer>(list.iterator(), negate);
            __CLR4_4_15ss5sskcq4susd.R.inc(7534);
            while ((((expected.hasNext()) && (__CLR4_4_15ss5sskcq4susd.R.iget(7535) != 0 | true)) || (__CLR4_4_15ss5sskcq4susd.R.iget(7536) == 0 & false))) {
                {
                    __CLR4_4_15ss5sskcq4susd.R.inc(7537);
                    assertTrue(testing.hasNext());
                    __CLR4_4_15ss5sskcq4susd.R.inc(7538);
                    assertEquals(expected.next(), testing.next());
                }
            }
            __CLR4_4_15ss5sskcq4susd.R.inc(7539);
            assertTrue(!testing.hasNext());
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test
    public void testEmptyList() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7540);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s6zsw5tg();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testEmptyList", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7540, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s6zsw5tg() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7540);
            __CLR4_4_15ss5sskcq4susd.R.inc(7541);
            Iterator<?> testing = new TransformedIterator<Integer, Integer>(Collections.<Integer>emptyList().iterator(), negate);
            __CLR4_4_15ss5sskcq4susd.R.inc(7542);
            assertTrue(!testing.hasNext());
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test
    public void testNextWithoutHasNext() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7543);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1yf2u5r5tj();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testNextWithoutHasNext", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7543, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1yf2u5r5tj() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7543);
            __CLR4_4_15ss5sskcq4susd.R.inc(7544);
            Iterator<Integer> testing = new TransformedIterator<Integer, Integer>(list.iterator(), negate);
            __CLR4_4_15ss5sskcq4susd.R.inc(7545);
            Iterator<Integer> expected = negatives.iterator();
            __CLR4_4_15ss5sskcq4susd.R.inc(7546);
            while ((((expected.hasNext()) && (__CLR4_4_15ss5sskcq4susd.R.iget(7547) != 0 | true)) || (__CLR4_4_15ss5sskcq4susd.R.iget(7548) == 0 & false))) {
                {
                    __CLR4_4_15ss5sskcq4susd.R.inc(7549);
                    assertEquals(expected.next(), testing.next());
                }
            }
            __CLR4_4_15ss5sskcq4susd.R.inc(7550);
            assertTrue(!(testing.hasNext()));
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testNextAfterEndOfList() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7551);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1kdu7b45tr();
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
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testNextAfterEndOfList", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7551, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1kdu7b45tr() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7551);
            __CLR4_4_15ss5sskcq4susd.R.inc(7552);
            Iterator<Integer> testing = new TransformedIterator<Integer, Integer>(list.iterator(), negate);
            __CLR4_4_15ss5sskcq4susd.R.inc(7553);
            Iterator<Integer> expected = negatives.iterator();
            __CLR4_4_15ss5sskcq4susd.R.inc(7554);
            while ((((expected.hasNext()) && (__CLR4_4_15ss5sskcq4susd.R.iget(7555) != 0 | true)) || (__CLR4_4_15ss5sskcq4susd.R.iget(7556) == 0 & false))) {
                {
                    __CLR4_4_15ss5sskcq4susd.R.inc(7557);
                    assertEquals(expected.next(), testing.next());
                }
            }
            __CLR4_4_15ss5sskcq4susd.R.inc(7558);
            testing.next();
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void testNextOnEmptyList() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7559);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_11u5fce5tz();
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
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testNextOnEmptyList", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7559, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_11u5fce5tz() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7559);
            __CLR4_4_15ss5sskcq4susd.R.inc(7560);
            Iterator<Integer> testing = new TransformedIterator<Integer, Integer>(Collections.<Integer>emptyList().iterator(), negate);
            __CLR4_4_15ss5sskcq4susd.R.inc(7561);
            testing.next();
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveBeforeNext() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7562);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1b6ju0f5u2();
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
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testRemoveBeforeNext", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7562, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1b6ju0f5u2() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7562);
            __CLR4_4_15ss5sskcq4susd.R.inc(7563);
            Iterator<Integer> testing = new TransformedIterator<Integer, Integer>(list.iterator(), negate);
            __CLR4_4_15ss5sskcq4susd.R.inc(7564);
            testing.remove();
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveAfterNext() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7565);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1sfnuo05u5();
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
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testRemoveAfterNext", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7565, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1sfnuo05u5() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7565);
            __CLR4_4_15ss5sskcq4susd.R.inc(7566);
            Iterator<Integer> testing = new TransformedIterator<Integer, Integer>(list.iterator(), negate);
            __CLR4_4_15ss5sskcq4susd.R.inc(7567);
            testing.next();
            __CLR4_4_15ss5sskcq4susd.R.inc(7568);
            testing.remove();
            __CLR4_4_15ss5sskcq4susd.R.inc(7569);
            testing.remove();
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test
    public void testRemoveAll() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7570);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1dd9vci5ua();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testRemoveAll", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7570, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1dd9vci5ua() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7570);
            __CLR4_4_15ss5sskcq4susd.R.inc(7571);
            Iterator<Integer> testing = new TransformedIterator<Integer, Integer>(list.iterator(), negate);
            __CLR4_4_15ss5sskcq4susd.R.inc(7572);
            while ((((testing.hasNext()) && (__CLR4_4_15ss5sskcq4susd.R.iget(7573) != 0 | true)) || (__CLR4_4_15ss5sskcq4susd.R.iget(7574) == 0 & false))) {
                {
                    __CLR4_4_15ss5sskcq4susd.R.inc(7575);
                    testing.next();
                    __CLR4_4_15ss5sskcq4susd.R.inc(7576);
                    testing.remove();
                }
            }
            __CLR4_4_15ss5sskcq4susd.R.inc(7577);
            assertTrue(list.isEmpty());
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test
    public void testRemoveWithoutHasNext() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7578);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_11ujx1e5ui();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testRemoveWithoutHasNext", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7578, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_11ujx1e5ui() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7578);
            __CLR4_4_15ss5sskcq4susd.R.inc(7579);
            Iterator<Integer> testing = new TransformedIterator<Integer, Integer>(list.iterator(), negate);
            __CLR4_4_15ss5sskcq4susd.R.inc(7580);
            for (int i = 0, m = list.size(); (((i < m) && (__CLR4_4_15ss5sskcq4susd.R.iget(7581) != 0 | true)) || (__CLR4_4_15ss5sskcq4susd.R.iget(7582) == 0 & false)); i++) {
                {
                    __CLR4_4_15ss5sskcq4susd.R.inc(7583);
                    testing.next();
                    __CLR4_4_15ss5sskcq4susd.R.inc(7584);
                    testing.remove();
                }
            }
            __CLR4_4_15ss5sskcq4susd.R.inc(7585);
            assertTrue(list.isEmpty());
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test
    public void testTransformWithNullIteratorReturnsNull() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7586);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_13ejg705uq();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testTransformWithNullIteratorReturnsNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7586, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_13ejg705uq() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7586);
            __CLR4_4_15ss5sskcq4susd.R.inc(7587);
            assertNull(TransformedIterator.transform(null, negate));
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test
    public void testTransformWithNullFunctionReturnsIdentity() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7588);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ij0hnb5us();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testTransformWithNullFunctionReturnsIdentity", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7588, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ij0hnb5us() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7588);
            __CLR4_4_15ss5sskcq4susd.R.inc(7589);
            Iterator<Integer> iter = list.iterator();
            __CLR4_4_15ss5sskcq4susd.R.inc(7590);
            assertSame(iter, TransformedIterator.maybeTransform(iter, null));
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test
    public void testTransformWithNullIteratorAndNullFunctionReturnsNull() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7591);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1oo60k05uv();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testTransformWithNullIteratorAndNullFunctionReturnsNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7591, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1oo60k05uv() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7591);
            __CLR4_4_15ss5sskcq4susd.R.inc(7592);
            assertSame(null, TransformedIterator.maybeTransform(null, null));
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test
    public void testTransform() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7593);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1q98ef55ux();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testTransform", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7593, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1q98ef55ux() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7593);
            __CLR4_4_15ss5sskcq4susd.R.inc(7594);
            Iterator<Integer> iter = list.iterator();
            __CLR4_4_15ss5sskcq4susd.R.inc(7595);
            assertNotSame(iter, TransformedIterator.maybeTransform(iter, negate));
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNull() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7596);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1jqp5ui5v0();
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
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testConstructorProhibitsNull", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7596, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1jqp5ui5v0() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7596);
            __CLR4_4_15ss5sskcq4susd.R.inc(7597);
            new TransformedIterator<Integer, Integer>(null, null);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNull2() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7598);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1fi3s3q5v2();
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
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testConstructorProhibitsNull2", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7598, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1fi3s3q5v2() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7598);
            __CLR4_4_15ss5sskcq4susd.R.inc(7599);
            new TransformedIterator<Integer, Integer>(null, negate);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNull3() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7600);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1ir3qw75v4();
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
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testConstructorProhibitsNull3", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7600, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1ir3qw75v4() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7600);
            __CLR4_4_15ss5sskcq4susd.R.inc(7601);
            new TransformedIterator<Integer, Integer>(list.iterator(), null);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    @Test
    public void testEquals() {
        __CLR4_4_15ss5sskcq4susd.R.globalSliceStart(getClass().getName(), 7602);
        int $CLV_p$ = 0;
        java.lang.Throwable $CLV_t$ = null;
        try {
            __CLR4_4_1s4e6085v6();
            $CLV_p$ = 1;
        } catch (java.lang.Throwable $CLV_t2$) {
            if ($CLV_p$ == 0 && $CLV_t$ == null) {
                $CLV_t$ = $CLV_t2$;
            }
            __CLR4_4_15ss5sskcq4susd.R.rethrow($CLV_t2$);
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.globalSliceEnd(getClass().getName(), "org.apache.commons.functor.core.collection.TestTransformedIterator.testEquals", __CLR4_4_1_TEST_NAME_SNIFFER.getTestName(), 7602, $CLV_p$, $CLV_t$);
        }
    }

    private void __CLR4_4_1s4e6085v6() {
        try {
            __CLR4_4_15ss5sskcq4susd.R.inc(7602);
            __CLR4_4_15ss5sskcq4susd.R.inc(7603);
            Iterator<Integer> iter = list.iterator();
            __CLR4_4_15ss5sskcq4susd.R.inc(7604);
            TransformedIterator<Integer, Integer> t = new TransformedIterator<Integer, Integer>(iter, negate);
            __CLR4_4_15ss5sskcq4susd.R.inc(7605);
            Function<Number, Double> negateDouble = new Function<Number, Double>() {

                public Double evaluate(Number obj) {
                    try {
                        __CLR4_4_15ss5sskcq4susd.R.inc(7606);
                        __CLR4_4_15ss5sskcq4susd.R.inc(7607);
                        return Double.valueOf(obj.intValue() * -1);
                    } finally {
                        __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
                    }
                }
            };
            __CLR4_4_15ss5sskcq4susd.R.inc(7608);
            assertEquals(t, new TransformedIterator<Integer, Integer>(iter, negate));
            __CLR4_4_15ss5sskcq4susd.R.inc(7609);
            assertTrue(!t.equals(new TransformedIterator<Integer, Double>(list.iterator(), negateDouble)));
            __CLR4_4_15ss5sskcq4susd.R.inc(7610);
            assertTrue(!t.equals(new TransformedIterator<Float, Integer>(Arrays.asList(0.0f, 0.1f).iterator(), negate)));
            __CLR4_4_15ss5sskcq4susd.R.inc(7611);
            assertTrue(!t.equals(null));
        } finally {
            __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
        }
    }

    // Attributes
    // ------------------------------------------------------------------------
    private List<Integer> list = null;

    private List<Integer> negatives = null;

    private Function<Number, Integer> negate = new Function<Number, Integer>() {

        public Integer evaluate(Number obj) {
            try {
                __CLR4_4_15ss5sskcq4susd.R.inc(7612);
                __CLR4_4_15ss5sskcq4susd.R.inc(7613);
                return Integer.valueOf(obj.intValue() * -1);
            } finally {
                __CLR4_4_15ss5sskcq4susd.R.flushNeeded();
            }
        }
    };
}

