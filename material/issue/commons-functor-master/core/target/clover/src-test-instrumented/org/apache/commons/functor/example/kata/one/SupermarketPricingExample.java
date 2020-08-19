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
package org.apache.commons.functor.example.kata.one;

import static org.junit.Assert.assertEquals;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.adapter.BinaryFunctionFunction;
import org.apache.commons.functor.core.Identity;
import org.apache.commons.functor.core.comparator.IsGreaterThan;
import org.apache.commons.functor.core.composite.Composite;
import org.apache.commons.functor.core.composite.ConditionalFunction;
import org.apache.commons.functor.core.composite.CompositeBinaryFunction;
import org.junit.Test;

/**
 * Dave Thomas's Kata One asks us to think about how one might implement pricing rules:
 *
 * "Some things in supermarkets have simple prices: this can of beans costs $0.65. Other things have more complex
 * prices. For example:
 *
 * o three for a dollar (so what?s the price if I buy 4, or 5?)
 *
 * o $1.99/pound (so what does 4 ounces cost?)
 *
 * o buy two, get one free (so does the third item have a price?)"
 *
 * Functors provide one approach to this sort of problem, and in this example we'll demonstrate some simple cases.
 *
 * See http://pragprog.com/pragdave/Practices/Kata/KataOne.rdoc,v for more information on this Kata.
 *
 * @version $Revision$ $Date$
 */
public class SupermarketPricingExample {

    public static class __CLR4_4_17ld7ldkcq4svbg {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 9947, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * ...but our pricing rule is starting to get ugly, and we haven't even considered things something like
     * "buy 3, get 2 free", etc.
     * 
     * Perhaps a special Function instance is in order:
     */
    class BuyNGetMFree implements Function<Number, Number> {

        public BuyNGetMFree(int n, int m, int costPerUnit) {
            try {
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9887);
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9888);
                this.n = n;
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9889);
                this.m = m;
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9890);
                this.costPerUnit = costPerUnit;
            } finally {
                __CLR4_4_17ld7ldkcq4svbg.R.flushNeeded();
            }
        }

        public Number evaluate(Number num) {
            try {
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9891);
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9892);
                int quantity = num.intValue();
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9893);
                int cost = 0;
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9894);
                while ((((quantity >= n) && (__CLR4_4_17ld7ldkcq4svbg.R.iget(9895) != 0 | true)) || (__CLR4_4_17ld7ldkcq4svbg.R.iget(9896) == 0 & false))) {
                    {
                        // buy n
                        __CLR4_4_17ld7ldkcq4svbg.R.inc(9897);
                        cost += n * costPerUnit;
                        __CLR4_4_17ld7ldkcq4svbg.R.inc(9898);
                        quantity -= n;
                        // get m (or fewer) free
                        __CLR4_4_17ld7ldkcq4svbg.R.inc(9899);
                        quantity -= Math.min(quantity, m);
                    }
                // buy less than n
                }
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9900);
                cost += quantity * costPerUnit;
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9901);
                return Integer.valueOf(cost);
            } finally {
                __CLR4_4_17ld7ldkcq4svbg.R.flushNeeded();
            }
        }

        private int n, m, costPerUnit;
    }

    // tests
    // ----------------------------------------------------------
    /*
     * The simplest form of pricing is simply a constant rate. In Dave's example, a can of beans costs $0.65, and n cans
     * of beans cost n*0.65.
     * 
     * This pricing rule simply multiplies the quantity by a constant, e.g.: ToMoney.from(Multiply.by(65))
     * 
     * This case is so common, we may want to introduce a special Product constructor to wrap up create the functors for
     * us.
     */
    @Test
    public void testConstantPricePerUnit() throws Exception {
        try {
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9841);
            {
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9842);
                Product beans = new Product("Can of Beans", "SKU-0001", ToMoney.from(Multiply.by(65)));
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9843);
                assertEquals(new Money(0 * 65), beans.getPrice(0));
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9844);
                assertEquals(new Money(1 * 65), beans.getPrice(1));
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9845);
                assertEquals(new Money(2 * 65), beans.getPrice(2));
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9846);
                assertEquals(new Money(3 * 65), beans.getPrice(3));
            }
            // or, using the speical constructor:
            {
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9847);
                Product beans = new Product("Can of Beans", "SKU-0001", 65);
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9848);
                assertEquals(new Money(0 * 65), beans.getPrice(0));
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9849);
                assertEquals(new Money(1 * 65), beans.getPrice(1));
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9850);
                assertEquals(new Money(2 * 65), beans.getPrice(2));
                __CLR4_4_17ld7ldkcq4svbg.R.inc(9851);
                assertEquals(new Money(3 * 65), beans.getPrice(3));
            }
        } finally {
            __CLR4_4_17ld7ldkcq4svbg.R.flushNeeded();
        }
    }

    /*
     * A slighly more complicated example is a bulk discount. For example, bananas may be $0.33 cents each, or 4 for a
     * dollar ($1.00).
     * 
     * This rule is underspecified by itself, there are at least two ways to interpret this pricing rule:
     * 
     * a) the cost is $0.33 cents for 3 or fewer, $0.25 for 4 or more
     * 
     * or
     * 
     * b) the cost is $1.00 for every group of 4, $0.33 each for anything left over
     * 
     * although I think in practice, "4 for a dollar" usually means the former and not the latter.
     * 
     * We can implement either:
     */
    @Test
    public void testFourForADollar_A() throws Exception {
        try {
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9852);
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9853);
            Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new ConditionalFunction<Integer, Number>(IsGreaterThan.instance(Integer.valueOf(3)), Multiply.by(25), Multiply.by(33))));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9854);
            assertEquals(new Money(0 * 33), banana.getPrice(0));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9855);
            assertEquals(new Money(1 * 33), banana.getPrice(1));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9856);
            assertEquals(new Money(2 * 33), banana.getPrice(2));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9857);
            assertEquals(new Money(3 * 33), banana.getPrice(3));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9858);
            assertEquals(new Money(4 * 25), banana.getPrice(4));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9859);
            assertEquals(new Money(5 * 25), banana.getPrice(5));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9860);
            assertEquals(new Money(6 * 25), banana.getPrice(6));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9861);
            assertEquals(new Money(7 * 25), banana.getPrice(7));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9862);
            assertEquals(new Money(8 * 25), banana.getPrice(8));
        } finally {
            __CLR4_4_17ld7ldkcq4svbg.R.flushNeeded();
        }
    }

    @Test
    public void testFourForADollar_B() throws Exception {
        try {
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9863);
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9864);
            Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new BinaryFunctionFunction<Integer, Number>(new CompositeBinaryFunction<Integer, Integer, Number>(Add.instance(), Composite.function(Multiply.by(100), Divide.by(4)), Composite.function(Multiply.by(33), Mod.by(4))))));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9865);
            assertEquals(new Money(0 * 33 + 0 * 25), banana.getPrice(0));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9866);
            assertEquals(new Money(1 * 33 + 0 * 25), banana.getPrice(1));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9867);
            assertEquals(new Money(2 * 33 + 0 * 25), banana.getPrice(2));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9868);
            assertEquals(new Money(3 * 33 + 0 * 25), banana.getPrice(3));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9869);
            assertEquals(new Money(0 * 33 + 4 * 25), banana.getPrice(4));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9870);
            assertEquals(new Money(1 * 33 + 4 * 25), banana.getPrice(5));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9871);
            assertEquals(new Money(2 * 33 + 4 * 25), banana.getPrice(6));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9872);
            assertEquals(new Money(3 * 33 + 4 * 25), banana.getPrice(7));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9873);
            assertEquals(new Money(0 * 33 + 8 * 25), banana.getPrice(8));
        } finally {
            __CLR4_4_17ld7ldkcq4svbg.R.flushNeeded();
        }
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1() throws Exception {
        try {
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9874);
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9875);
            Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9876);
            assertEquals(new Money(0 * 40), apple.getPrice(0));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9877);
            assertEquals(new Money(1 * 40), apple.getPrice(1));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9878);
            assertEquals(new Money(2 * 40), apple.getPrice(2));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9879);
            assertEquals(new Money(2 * 40), apple.getPrice(3));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9880);
            assertEquals(new Money(3 * 40), apple.getPrice(4));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9881);
            assertEquals(new Money(4 * 40), apple.getPrice(5));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9882);
            assertEquals(new Money(4 * 40), apple.getPrice(6));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9883);
            assertEquals(new Money(5 * 40), apple.getPrice(7));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9884);
            assertEquals(new Money(6 * 40), apple.getPrice(8));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9885);
            assertEquals(new Money(6 * 40), apple.getPrice(9));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9886);
            assertEquals(new Money(7 * 40), apple.getPrice(10));
        } finally {
            __CLR4_4_17ld7ldkcq4svbg.R.flushNeeded();
        }
    }

    @Test
    public void testBuyTwoGetOneFree_2() throws Exception {
        try {
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9902);
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9903);
            Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9904);
            assertEquals(new Money(0 * 40), apple.getPrice(0));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9905);
            assertEquals(new Money(1 * 40), apple.getPrice(1));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9906);
            assertEquals(new Money(2 * 40), apple.getPrice(2));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9907);
            assertEquals(new Money(2 * 40), apple.getPrice(3));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9908);
            assertEquals(new Money(3 * 40), apple.getPrice(4));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9909);
            assertEquals(new Money(4 * 40), apple.getPrice(5));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9910);
            assertEquals(new Money(4 * 40), apple.getPrice(6));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9911);
            assertEquals(new Money(5 * 40), apple.getPrice(7));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9912);
            assertEquals(new Money(6 * 40), apple.getPrice(8));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9913);
            assertEquals(new Money(6 * 40), apple.getPrice(9));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9914);
            assertEquals(new Money(7 * 40), apple.getPrice(10));
        } finally {
            __CLR4_4_17ld7ldkcq4svbg.R.flushNeeded();
        }
    }

    @Test
    public void testBuyThreeGetTwoFree() throws Exception {
        try {
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9915);
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9916);
            Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9917);
            assertEquals(new Money(0 * 40), apple.getPrice(0));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9918);
            assertEquals(new Money(1 * 40), apple.getPrice(1));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9919);
            assertEquals(new Money(2 * 40), apple.getPrice(2));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9920);
            assertEquals(new Money(3 * 40), apple.getPrice(3));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9921);
            assertEquals(new Money(3 * 40), apple.getPrice(4));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9922);
            assertEquals(new Money(3 * 40), apple.getPrice(5));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9923);
            assertEquals(new Money(4 * 40), apple.getPrice(6));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9924);
            assertEquals(new Money(5 * 40), apple.getPrice(7));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9925);
            assertEquals(new Money(6 * 40), apple.getPrice(8));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9926);
            assertEquals(new Money(6 * 40), apple.getPrice(9));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9927);
            assertEquals(new Money(6 * 40), apple.getPrice(10));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9928);
            assertEquals(new Money(7 * 40), apple.getPrice(11));
        } finally {
            __CLR4_4_17ld7ldkcq4svbg.R.flushNeeded();
        }
    }

    @Test
    public void testBuyTwoGetFiveFree() throws Exception {
        try {
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9929);
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9930);
            Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9931);
            assertEquals(new Money(0 * 40), apple.getPrice(0));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9932);
            assertEquals(new Money(1 * 40), apple.getPrice(1));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9933);
            assertEquals(new Money(2 * 40), apple.getPrice(2));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9934);
            assertEquals(new Money(2 * 40), apple.getPrice(3));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9935);
            assertEquals(new Money(2 * 40), apple.getPrice(4));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9936);
            assertEquals(new Money(2 * 40), apple.getPrice(5));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9937);
            assertEquals(new Money(2 * 40), apple.getPrice(6));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9938);
            assertEquals(new Money(2 * 40), apple.getPrice(7));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9939);
            assertEquals(new Money(3 * 40), apple.getPrice(8));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9940);
            assertEquals(new Money(4 * 40), apple.getPrice(9));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9941);
            assertEquals(new Money(4 * 40), apple.getPrice(10));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9942);
            assertEquals(new Money(4 * 40), apple.getPrice(11));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9943);
            assertEquals(new Money(4 * 40), apple.getPrice(12));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9944);
            assertEquals(new Money(4 * 40), apple.getPrice(13));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9945);
            assertEquals(new Money(4 * 40), apple.getPrice(14));
            __CLR4_4_17ld7ldkcq4svbg.R.inc(9946);
            assertEquals(new Money(5 * 40), apple.getPrice(15));
        } finally {
            __CLR4_4_17ld7ldkcq4svbg.R.flushNeeded();
        }
    }
}

