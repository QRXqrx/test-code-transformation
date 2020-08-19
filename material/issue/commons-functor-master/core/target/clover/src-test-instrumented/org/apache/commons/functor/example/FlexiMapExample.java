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
package org.apache.commons.functor.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.BinaryProcedure;
import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.adapter.IgnoreLeftFunction;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.Identity;
import org.apache.commons.functor.core.IsInstance;
import org.apache.commons.functor.core.IsNull;
import org.apache.commons.functor.core.RightIdentity;
import org.apache.commons.functor.core.composite.Conditional;
import org.junit.Test;

/*
 * ----------------------------------------------------------------------------
 * INTRODUCTION:
 * ----------------------------------------------------------------------------
 */
/*
 * In this example, we'll demonstrate how we can use "pluggable" functors
 * to create specialized Map implementations via composition.
 *
 * All our specializations will use the same basic Map implementation.
 * Once it is built, we'll only need to define the specialized behaviors.
 */
/**
 * @version $Revision$ $Date$
 */
public class FlexiMapExample {

    public static class __CLR4_4_175m75mkcq4sv5p {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 9439, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    /*
     * ---------------------------------------------------------------------------- THE GENERIC MAP IMPLEMENTATION:
     * ----------------------------------------------------------------------------
     */
    /*
     * How can one Map implementation support all these behaviors? Using functors and composition, of course.
     * 
     * In order to keep our example small, we'll just consider the primary Map.put and Map.get methods here, although
     * the remaining Map methods could be handled similiarly.
     */
    static class FlexiMap implements Map<Object, Object> {

        /*
         * Our FlexiMap will accept two BinaryFunctions, one that's used to transform objects being put into the Map,
         * and one that's used to transforms objects being retrieved from the map.
         */
        public FlexiMap(BinaryFunction<Object, Object, Object> putfn, BinaryFunction<Object, Object, Object> getfn) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9351);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9352);
                onPut = (((null == putfn) && (__CLR4_4_175m75mkcq4sv5p.R.iget(9353) != 0 | true)) || (__CLR4_4_175m75mkcq4sv5p.R.iget(9354) == 0 & false)) ? RightIdentity.function() : putfn;
                __CLR4_4_175m75mkcq4sv5p.R.inc(9355);
                onGet = (((null == getfn) && (__CLR4_4_175m75mkcq4sv5p.R.iget(9356) != 0 | true)) || (__CLR4_4_175m75mkcq4sv5p.R.iget(9357) == 0 & false)) ? RightIdentity.function() : getfn;
                __CLR4_4_175m75mkcq4sv5p.R.inc(9358);
                proxiedMap = new HashMap<Object, Object>();
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        /*
         * The arguments to our "onGet" function will be the key and the value associated with that key in the
         * underlying Map. We'll return whatever the function returns.
         */
        public Object get(Object key) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9359);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9360);
                return onGet.evaluate(key, proxiedMap.get(key));
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        /*
         * The arguments to our "onPut" function will be the value previously associated with that key (if any), as well
         * as the new value being associated with that key.
         * 
         * Since put returns the previously associated value, we'll invoke onGet here as well.
         */
        public Object put(Object key, Object value) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9361);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9362);
                Object oldvalue = proxiedMap.get(key);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9363);
                proxiedMap.put(key, onPut.evaluate(oldvalue, value));
                __CLR4_4_175m75mkcq4sv5p.R.inc(9364);
                return onGet.evaluate(key, oldvalue);
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        /*
         * We'll skip the remaining Map methods for now.
         */
        public void clear() {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9365);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9366);
                throw new UnsupportedOperationException("Left as an exercise for the reader.");
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public boolean containsKey(Object key) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9367);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9368);
                throw new UnsupportedOperationException("Left as an exercise for the reader.");
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public boolean containsValue(Object value) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9369);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9370);
                throw new UnsupportedOperationException("Left as an exercise for the reader.");
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public Set<Map.Entry<Object, Object>> entrySet() {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9371);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9372);
                throw new UnsupportedOperationException("Left as an exercise for the reader.");
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public boolean isEmpty() {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9373);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9374);
                throw new UnsupportedOperationException("Left as an exercise for the reader.");
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public Set<Object> keySet() {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9375);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9376);
                throw new UnsupportedOperationException("Left as an exercise for the reader.");
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public void putAll(Map<?, ?> t) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9377);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9378);
                throw new UnsupportedOperationException("Left as an exercise for the reader.");
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public Object remove(Object key) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9379);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9380);
                throw new UnsupportedOperationException("Left as an exercise for the reader.");
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public int size() {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9381);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9382);
                throw new UnsupportedOperationException("Left as an exercise for the reader.");
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public Collection<Object> values() {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9383);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9384);
                throw new UnsupportedOperationException("Left as an exercise for the reader.");
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        private BinaryFunction<Object, Object, Object> onPut = null;

        private BinaryFunction<Object, Object, Object> onGet = null;

        private Map<Object, Object> proxiedMap = null;
    }

    /*
     * ---------------------------------------------------------------------------- MAP SPECIALIZATIONS:
     * ----------------------------------------------------------------------------
     */
    /*
     * For the "basic" Map, we'll simply create a HashMap. Note that using a RightIdentity for onPut and onGet would
     * yield the same behavior.
     */
    private Map<Object, Object> makeBasicMap() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9385);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9386);
            return new HashMap<Object, Object>();
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * To prohibit null values, we'll only need to provide an onPut function.
     */
    private Map<Object, Object> makeNullForbiddenMap() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9387);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9388);
            return new FlexiMap(/*
         * We simply ignore the left-hand argument,
         */
            IgnoreLeftFunction.adapt(/*
         * and for the right-hand,
         */
            Conditional.function(/*
         * we'll test for null,
         */
            IsNull.instance(), /*
         * throwing a NullPointerException when the value is null,
         */
            throwNPE, /*
         * and passing through all non-null values.
         */
            Identity.instance())), null);
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * To provide a default for null values, we'll only need to provide an onGet function, simliar to the onPut method
     * used above.
     */
    private Map<Object, Object> makeDefaultValueForNullMap(Object defaultValue) {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9389);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9390);
            return new FlexiMap(null, /*
         * We ignore the left-hand argument,
         */
            IgnoreLeftFunction.adapt(/*
         * and for the right-hand,
         */
            Conditional.function(/*
         * we'll test for null,
         */
            IsNull.instance(), /*
         * returning our default when the value is otherwise null,
         */
            new Constant<Object>(defaultValue), /*
         * and passing through all non-null values.
         */
            Identity.instance())));
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * To constrain the value types, we'll provide an onPut function,
     */
    private Map<Object, Object> makeTypeConstrainedMap(Class<?> clazz) {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9391);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9392);
            return new FlexiMap(/*
         * ignore the left-hand argument,
         */
            IgnoreLeftFunction.adapt(Conditional.function(/*
         * we'll test the type of the right-hand argument,
         */
            IsInstance.of(clazz), /*
         * and either pass the given value through,
         */
            Identity.instance(), /*
         * or throw a ClassCastException.
         */
            throwCCE)), null);
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * The MultiMap is a bit more interesting, since we'll need to consider both the old and new values during onPut:
     */
    private Map<Object, Object> makeMultiMap() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9393);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9394);
            return new FlexiMap(new BinaryFunction<Object, Object, Object>() {

                @SuppressWarnings("unchecked")
                public Object evaluate(Object oldval, Object newval) {
                    try {
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9395);
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9396);
                        List<Object> list = null;
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9397);
                        if ((((null == oldval) && (__CLR4_4_175m75mkcq4sv5p.R.iget(9398) != 0 | true)) || (__CLR4_4_175m75mkcq4sv5p.R.iget(9399) == 0 & false))) {
                            {
                                __CLR4_4_175m75mkcq4sv5p.R.inc(9400);
                                list = new ArrayList<Object>();
                            }
                        } else {
                            {
                                __CLR4_4_175m75mkcq4sv5p.R.inc(9401);
                                list = (List<Object>) oldval;
                            }
                        }
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9402);
                        list.add(newval);
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9403);
                        return list;
                    } finally {
                        __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
                    }
                }
            }, null);
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * The StringConcatMap is more interesting still.
     */
    private Map<Object, Object> makeStringConcatMap() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9404);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9405);
            return new FlexiMap(/*
         * The onPut function looks similiar to the MultiMap method:
         */
            new BinaryFunction<Object, Object, Object>() {

                public Object evaluate(Object oldval, Object newval) {
                    try {
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9406);
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9407);
                        StringBuilder buf = null;
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9408);
                        if ((((null == oldval) && (__CLR4_4_175m75mkcq4sv5p.R.iget(9409) != 0 | true)) || (__CLR4_4_175m75mkcq4sv5p.R.iget(9410) == 0 & false))) {
                            {
                                __CLR4_4_175m75mkcq4sv5p.R.inc(9411);
                                buf = new StringBuilder();
                            }
                        } else {
                            {
                                __CLR4_4_175m75mkcq4sv5p.R.inc(9412);
                                buf = (StringBuilder) oldval;
                                __CLR4_4_175m75mkcq4sv5p.R.inc(9413);
                                buf.append(", ");
                            }
                        }
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9414);
                        buf.append(newval);
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9415);
                        return buf;
                    } finally {
                        __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
                    }
                }
            }, /*
         * but we'll also need an onGet functor to convert the StringBuilder to a String:
         */
            new BinaryFunction<Object, Object, Object>() {

                public Object evaluate(Object key, Object val) {
                    try {
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9416);
                        __CLR4_4_175m75mkcq4sv5p.R.inc(9417);
                        if ((((null == val) && (__CLR4_4_175m75mkcq4sv5p.R.iget(9418) != 0 | true)) || (__CLR4_4_175m75mkcq4sv5p.R.iget(9419) == 0 & false))) {
                            {
                                __CLR4_4_175m75mkcq4sv5p.R.inc(9420);
                                return null;
                            }
                        } else {
                            {
                                __CLR4_4_175m75mkcq4sv5p.R.inc(9421);
                                return ((StringBuilder) val).toString();
                            }
                        }
                    } finally {
                        __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
                    }
                }
            });
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * (This "UniversalFunctor" type provides a functor that takes the same action regardless of the number of
     * parameters. We used it above to throw Exceptions when needed.)
     */
    private abstract class UniversalFunctor implements NullaryProcedure, Procedure<Object>, BinaryProcedure<Object, Object>, NullaryFunction<Object>, Function<Object, Object>, BinaryFunction<Object, Object, Object> {

        public abstract void run();

        public void run(Object obj) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9422);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9423);
                run();
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public void run(Object left, Object right) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9424);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9425);
                run();
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public Object evaluate() {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9426);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9427);
                run();
                __CLR4_4_175m75mkcq4sv5p.R.inc(9428);
                return null;
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public Object evaluate(Object obj) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9429);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9430);
                run();
                __CLR4_4_175m75mkcq4sv5p.R.inc(9431);
                return null;
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }

        public Object evaluate(Object left, Object right) {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9432);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9433);
                run();
                __CLR4_4_175m75mkcq4sv5p.R.inc(9434);
                return null;
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }
    }

    private UniversalFunctor throwNPE = new UniversalFunctor() {

        @Override
        public void run() {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9435);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9436);
                throw new NullPointerException();
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }
    };

    private UniversalFunctor throwCCE = new UniversalFunctor() {

        @Override
        public void run() {
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9437);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9438);
                throw new ClassCastException();
            } finally {
                __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
            }
        }
    };

    /*
     * ---------------------------------------------------------------------------- UNIT TESTS:
     * ----------------------------------------------------------------------------
     */
    /*
     * In a "test first" style, let's first specify the Map behaviour we'd like to implement via unit tests.
     */
    /*
     * First, let's review the basic Map functionality.
     */
    /*
     * The basic Map interface lets one associate keys and values:
     */
    @Test
    public void testBasicMap() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9274);
            /* (We'll define these make*Map functions below.) */
            __CLR4_4_175m75mkcq4sv5p.R.inc(9275);
            Map<Object, Object> map = makeBasicMap();
            __CLR4_4_175m75mkcq4sv5p.R.inc(9276);
            Object key = "key";
            __CLR4_4_175m75mkcq4sv5p.R.inc(9277);
            Object value = Integer.valueOf(3);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9278);
            map.put(key, value);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9279);
            assertEquals(value, map.get(key));
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * If there is no value associated with a key, the basic Map will return null for that key:
     */
    @Test
    public void testBasicMapReturnsNullForMissingKey() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9280);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9281);
            Map<Object, Object> map = makeBasicMap();
            __CLR4_4_175m75mkcq4sv5p.R.inc(9282);
            assertNull(map.get("key"));
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * One can also explicitly store a null value for some key:
     */
    @Test
    public void testBasicMapAllowsNull() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9283);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9284);
            Map<Object, Object> map = makeBasicMap();
            __CLR4_4_175m75mkcq4sv5p.R.inc(9285);
            Object key = "key";
            __CLR4_4_175m75mkcq4sv5p.R.inc(9286);
            Object value = null;
            __CLR4_4_175m75mkcq4sv5p.R.inc(9287);
            map.put(key, value);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9288);
            assertNull(map.get(key));
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * The basic Map deals with Objects--it can store keys and values of multiple or differing types:
     */
    @Test
    public void testBasicMapAllowsMultipleTypes() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9289);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9290);
            Map<Object, Object> map = makeBasicMap();
            __CLR4_4_175m75mkcq4sv5p.R.inc(9291);
            map.put("key-1", "value-1");
            __CLR4_4_175m75mkcq4sv5p.R.inc(9292);
            map.put(Integer.valueOf(2), "value-2");
            __CLR4_4_175m75mkcq4sv5p.R.inc(9293);
            map.put("key-3", Integer.valueOf(3));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9294);
            map.put(Integer.valueOf(4), Integer.valueOf(4));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9295);
            assertEquals("value-1", map.get("key-1"));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9296);
            assertEquals("value-2", map.get(Integer.valueOf(2)));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9297);
            assertEquals(Integer.valueOf(3), map.get("key-3"));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9298);
            assertEquals(Integer.valueOf(4), map.get(Integer.valueOf(4)));
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * Finally, note that putting a second value for a given key will overwrite the first value--the basic Map only
     * stores the most recently put value for each key:
     */
    @Test
    public void testBasicMapStoresOnlyOneValuePerKey() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9299);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9300);
            Map<Object, Object> map = makeBasicMap();
            __CLR4_4_175m75mkcq4sv5p.R.inc(9301);
            assertNull(map.put("key", "value-1"));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9302);
            assertEquals("value-1", map.get("key"));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9303);
            assertEquals("value-1", map.put("key", "value-2"));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9304);
            assertEquals("value-2", map.get("key"));
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * Now let's look at some specializations of the Map behavior.
     */
    /*
     * One common specialization is to forbid null values, like our old friend Hashtable:
     */
    @Test
    public void testForbidNull() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9305);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9306);
            Map<Object, Object> map = makeNullForbiddenMap();
            __CLR4_4_175m75mkcq4sv5p.R.inc(9307);
            map.put("key", "value");
            __CLR4_4_175m75mkcq4sv5p.R.inc(9308);
            map.put("key2", Integer.valueOf(2));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9309);
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9310);
                map.put("key3", null);
                __CLR4_4_175m75mkcq4sv5p.R.inc(9311);
                fail("Expected NullPointerException");
            } catch (NullPointerException e) {
            // expected
            }
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * Alternatively, we may want to provide a default value to return when null is associated with some key. (This
     * might be useful, for example, when the Map contains a counter--when there's no count yet, we'll want to treat it
     * as zero.):
     */
    @Test
    public void testNullDefaultsToZero() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9312);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9313);
            Map<Object, Object> map = makeDefaultValueForNullMap(Integer.valueOf(0));
            /*
         * We expect 0 when no value has been associated with "key".
         */
            __CLR4_4_175m75mkcq4sv5p.R.inc(9314);
            assertEquals(Integer.valueOf(0), map.get("key"));
            /*
         * We also expect 0 when a null value has been associated with "key".
         */
            __CLR4_4_175m75mkcq4sv5p.R.inc(9315);
            map.put("key", null);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9316);
            assertEquals(Integer.valueOf(0), map.get("key"));
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * Another common specialization is to constrain the type of values that may be stored in the Map:
     */
    @Test
    public void testIntegerValuesOnly() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9317);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9318);
            Map<Object, Object> map = makeTypeConstrainedMap(Integer.class);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9319);
            map.put("key", Integer.valueOf(2));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9320);
            assertEquals(Integer.valueOf(2), map.get("key"));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9321);
            try {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9322);
                map.put("key2", "value");
                __CLR4_4_175m75mkcq4sv5p.R.inc(9323);
                fail("Expected ClassCastException");
            } catch (ClassCastException e) {
            // expected
            }
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * A more interesting specialization is that used by the Apache Commons Collections MultiMap class, which allows one
     * to associate multiple values with each key. The put function still accepts a single value, but the get function
     * will return a Collection of values. Associating multiple values with a key adds to that collection, rather than
     * overwriting the previous value:
     */
    @SuppressWarnings("unchecked")
    @Test
    public void testMultiMap() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9324);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9325);
            Map<Object, Object> map = makeMultiMap();
            __CLR4_4_175m75mkcq4sv5p.R.inc(9326);
            map.put("key", "value 1");
            {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9327);
                Collection<Object> result = (Collection<Object>) (map.get("key"));
                __CLR4_4_175m75mkcq4sv5p.R.inc(9328);
                assertEquals(1, result.size());
                __CLR4_4_175m75mkcq4sv5p.R.inc(9329);
                assertEquals("value 1", result.iterator().next());
            }
            __CLR4_4_175m75mkcq4sv5p.R.inc(9330);
            map.put("key", "value 2");
            {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9331);
                Collection<Object> result = (Collection<Object>) (map.get("key"));
                __CLR4_4_175m75mkcq4sv5p.R.inc(9332);
                assertEquals(2, result.size());
                __CLR4_4_175m75mkcq4sv5p.R.inc(9333);
                Iterator<Object> iter = result.iterator();
                __CLR4_4_175m75mkcq4sv5p.R.inc(9334);
                assertEquals("value 1", iter.next());
                __CLR4_4_175m75mkcq4sv5p.R.inc(9335);
                assertEquals("value 2", iter.next());
            }
            __CLR4_4_175m75mkcq4sv5p.R.inc(9336);
            map.put("key", "value 3");
            {
                __CLR4_4_175m75mkcq4sv5p.R.inc(9337);
                Collection<Object> result = (Collection<Object>) (map.get("key"));
                __CLR4_4_175m75mkcq4sv5p.R.inc(9338);
                assertEquals(3, result.size());
                __CLR4_4_175m75mkcq4sv5p.R.inc(9339);
                Iterator<Object> iter = result.iterator();
                __CLR4_4_175m75mkcq4sv5p.R.inc(9340);
                assertEquals("value 1", iter.next());
                __CLR4_4_175m75mkcq4sv5p.R.inc(9341);
                assertEquals("value 2", iter.next());
                __CLR4_4_175m75mkcq4sv5p.R.inc(9342);
                assertEquals("value 3", iter.next());
            }
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }

    /*
     * Here's another variation on the MultiMap theme. Rather than adding elements to a Collection, let's concatenate
     * String values together, delimited by commas. (Such a Map might be used by the Commons Collection's
     * ExtendedProperties type.):
     */
    @Test
    public void testStringConcatMap() {
        try {
            __CLR4_4_175m75mkcq4sv5p.R.inc(9343);
            __CLR4_4_175m75mkcq4sv5p.R.inc(9344);
            Map<Object, Object> map = makeStringConcatMap();
            __CLR4_4_175m75mkcq4sv5p.R.inc(9345);
            map.put("key", "value 1");
            __CLR4_4_175m75mkcq4sv5p.R.inc(9346);
            assertEquals("value 1", map.get("key"));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9347);
            map.put("key", "value 2");
            __CLR4_4_175m75mkcq4sv5p.R.inc(9348);
            assertEquals("value 1, value 2", map.get("key"));
            __CLR4_4_175m75mkcq4sv5p.R.inc(9349);
            map.put("key", "value 3");
            __CLR4_4_175m75mkcq4sv5p.R.inc(9350);
            assertEquals("value 1, value 2, value 3", map.get("key"));
        } finally {
            __CLR4_4_175m75mkcq4sv5p.R.flushNeeded();
        }
    }
}

