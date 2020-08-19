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

    /*
     * ...but our pricing rule is starting to get ugly, and we haven't even considered things something like
     * "buy 3, get 2 free", etc.
     * 
     * Perhaps a special Function instance is in order:
     */
    class BuyNGetMFree implements Function<Number, Number> {

        public BuyNGetMFree(int n, int m, int costPerUnit) {
            this.n = n;
            this.m = m;
            this.costPerUnit = costPerUnit;
        }

        public Number evaluate(Number num) {
            int quantity = num.intValue();
            int cost = 0;
            while (quantity >= n) {
                // buy n
                cost += n * costPerUnit;
                quantity -= n;
                // get m (or fewer) free
                quantity -= Math.min(quantity, m);
            }
            // buy less than n
            cost += quantity * costPerUnit;
            return Integer.valueOf(cost);
        }

        private int n, m, costPerUnit;
    }

    // tests
    // ----------------------------------------------------------
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
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new ConditionalFunction<Integer, Number>(IsGreaterThan.instance(Integer.valueOf(3)), Multiply.by(25), Multiply.by(33))));
        assertEquals(new Money(0 * 33), banana.getPrice(0));
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
    public void testFourForADollar_A_1() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new ConditionalFunction<Integer, Number>(IsGreaterThan.instance(Integer.valueOf(3)), Multiply.by(25), Multiply.by(33))));
        /*[Transform from] assertEquals(new Money(0 * 33), banana.getPrice(0));*/
        banana.getPrice(0);
        assertEquals(new Money(1 * 33), banana.getPrice(1));
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
    public void testFourForADollar_A_2() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new ConditionalFunction<Integer, Number>(IsGreaterThan.instance(Integer.valueOf(3)), Multiply.by(25), Multiply.by(33))));
        /*[Transform from] assertEquals(new Money(0 * 33), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33), banana.getPrice(1));*/
        banana.getPrice(1);
        assertEquals(new Money(2 * 33), banana.getPrice(2));
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
    public void testFourForADollar_A_3() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new ConditionalFunction<Integer, Number>(IsGreaterThan.instance(Integer.valueOf(3)), Multiply.by(25), Multiply.by(33))));
        /*[Transform from] assertEquals(new Money(0 * 33), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33), banana.getPrice(2));*/
        banana.getPrice(2);
        assertEquals(new Money(3 * 33), banana.getPrice(3));
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
    public void testFourForADollar_A_4() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new ConditionalFunction<Integer, Number>(IsGreaterThan.instance(Integer.valueOf(3)), Multiply.by(25), Multiply.by(33))));
        /*[Transform from] assertEquals(new Money(0 * 33), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33), banana.getPrice(2));*/
        banana.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 33), banana.getPrice(3));*/
        banana.getPrice(3);
        assertEquals(new Money(4 * 25), banana.getPrice(4));
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
    public void testFourForADollar_A_5() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new ConditionalFunction<Integer, Number>(IsGreaterThan.instance(Integer.valueOf(3)), Multiply.by(25), Multiply.by(33))));
        /*[Transform from] assertEquals(new Money(0 * 33), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33), banana.getPrice(2));*/
        banana.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 33), banana.getPrice(3));*/
        banana.getPrice(3);
        /*[Transform from] assertEquals(new Money(4 * 25), banana.getPrice(4));*/
        banana.getPrice(4);
        assertEquals(new Money(5 * 25), banana.getPrice(5));
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
    public void testFourForADollar_A_6() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new ConditionalFunction<Integer, Number>(IsGreaterThan.instance(Integer.valueOf(3)), Multiply.by(25), Multiply.by(33))));
        /*[Transform from] assertEquals(new Money(0 * 33), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33), banana.getPrice(2));*/
        banana.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 33), banana.getPrice(3));*/
        banana.getPrice(3);
        /*[Transform from] assertEquals(new Money(4 * 25), banana.getPrice(4));*/
        banana.getPrice(4);
        /*[Transform from] assertEquals(new Money(5 * 25), banana.getPrice(5));*/
        banana.getPrice(5);
        assertEquals(new Money(6 * 25), banana.getPrice(6));
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
    public void testFourForADollar_A_7() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new ConditionalFunction<Integer, Number>(IsGreaterThan.instance(Integer.valueOf(3)), Multiply.by(25), Multiply.by(33))));
        /*[Transform from] assertEquals(new Money(0 * 33), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33), banana.getPrice(2));*/
        banana.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 33), banana.getPrice(3));*/
        banana.getPrice(3);
        /*[Transform from] assertEquals(new Money(4 * 25), banana.getPrice(4));*/
        banana.getPrice(4);
        /*[Transform from] assertEquals(new Money(5 * 25), banana.getPrice(5));*/
        banana.getPrice(5);
        /*[Transform from] assertEquals(new Money(6 * 25), banana.getPrice(6));*/
        banana.getPrice(6);
        assertEquals(new Money(7 * 25), banana.getPrice(7));
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
    public void testFourForADollar_A_8() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new ConditionalFunction<Integer, Number>(IsGreaterThan.instance(Integer.valueOf(3)), Multiply.by(25), Multiply.by(33))));
        /*[Transform from] assertEquals(new Money(0 * 33), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33), banana.getPrice(2));*/
        banana.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 33), banana.getPrice(3));*/
        banana.getPrice(3);
        /*[Transform from] assertEquals(new Money(4 * 25), banana.getPrice(4));*/
        banana.getPrice(4);
        /*[Transform from] assertEquals(new Money(5 * 25), banana.getPrice(5));*/
        banana.getPrice(5);
        /*[Transform from] assertEquals(new Money(6 * 25), banana.getPrice(6));*/
        banana.getPrice(6);
        /*[Transform from] assertEquals(new Money(7 * 25), banana.getPrice(7));*/
        banana.getPrice(7);
        assertEquals(new Money(8 * 25), banana.getPrice(8));
    }

    @Test
    public void testFourForADollar_B() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new BinaryFunctionFunction<Integer, Number>(new CompositeBinaryFunction<Integer, Integer, Number>(Add.instance(), Composite.function(Multiply.by(100), Divide.by(4)), Composite.function(Multiply.by(33), Mod.by(4))))));
        assertEquals(new Money(0 * 33 + 0 * 25), banana.getPrice(0));
    }

    @Test
    public void testFourForADollar_B_1() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new BinaryFunctionFunction<Integer, Number>(new CompositeBinaryFunction<Integer, Integer, Number>(Add.instance(), Composite.function(Multiply.by(100), Divide.by(4)), Composite.function(Multiply.by(33), Mod.by(4))))));
        /*[Transform from] assertEquals(new Money(0 * 33 + 0 * 25), banana.getPrice(0));*/
        banana.getPrice(0);
        assertEquals(new Money(1 * 33 + 0 * 25), banana.getPrice(1));
    }

    @Test
    public void testFourForADollar_B_2() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new BinaryFunctionFunction<Integer, Number>(new CompositeBinaryFunction<Integer, Integer, Number>(Add.instance(), Composite.function(Multiply.by(100), Divide.by(4)), Composite.function(Multiply.by(33), Mod.by(4))))));
        /*[Transform from] assertEquals(new Money(0 * 33 + 0 * 25), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33 + 0 * 25), banana.getPrice(1));*/
        banana.getPrice(1);
        assertEquals(new Money(2 * 33 + 0 * 25), banana.getPrice(2));
    }

    @Test
    public void testFourForADollar_B_3() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new BinaryFunctionFunction<Integer, Number>(new CompositeBinaryFunction<Integer, Integer, Number>(Add.instance(), Composite.function(Multiply.by(100), Divide.by(4)), Composite.function(Multiply.by(33), Mod.by(4))))));
        /*[Transform from] assertEquals(new Money(0 * 33 + 0 * 25), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33 + 0 * 25), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33 + 0 * 25), banana.getPrice(2));*/
        banana.getPrice(2);
        assertEquals(new Money(3 * 33 + 0 * 25), banana.getPrice(3));
    }

    @Test
    public void testFourForADollar_B_4() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new BinaryFunctionFunction<Integer, Number>(new CompositeBinaryFunction<Integer, Integer, Number>(Add.instance(), Composite.function(Multiply.by(100), Divide.by(4)), Composite.function(Multiply.by(33), Mod.by(4))))));
        /*[Transform from] assertEquals(new Money(0 * 33 + 0 * 25), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33 + 0 * 25), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33 + 0 * 25), banana.getPrice(2));*/
        banana.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 33 + 0 * 25), banana.getPrice(3));*/
        banana.getPrice(3);
        assertEquals(new Money(0 * 33 + 4 * 25), banana.getPrice(4));
    }

    @Test
    public void testFourForADollar_B_5() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new BinaryFunctionFunction<Integer, Number>(new CompositeBinaryFunction<Integer, Integer, Number>(Add.instance(), Composite.function(Multiply.by(100), Divide.by(4)), Composite.function(Multiply.by(33), Mod.by(4))))));
        /*[Transform from] assertEquals(new Money(0 * 33 + 0 * 25), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33 + 0 * 25), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33 + 0 * 25), banana.getPrice(2));*/
        banana.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 33 + 0 * 25), banana.getPrice(3));*/
        banana.getPrice(3);
        /*[Transform from] assertEquals(new Money(0 * 33 + 4 * 25), banana.getPrice(4));*/
        banana.getPrice(4);
        assertEquals(new Money(1 * 33 + 4 * 25), banana.getPrice(5));
    }

    @Test
    public void testFourForADollar_B_6() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new BinaryFunctionFunction<Integer, Number>(new CompositeBinaryFunction<Integer, Integer, Number>(Add.instance(), Composite.function(Multiply.by(100), Divide.by(4)), Composite.function(Multiply.by(33), Mod.by(4))))));
        /*[Transform from] assertEquals(new Money(0 * 33 + 0 * 25), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33 + 0 * 25), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33 + 0 * 25), banana.getPrice(2));*/
        banana.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 33 + 0 * 25), banana.getPrice(3));*/
        banana.getPrice(3);
        /*[Transform from] assertEquals(new Money(0 * 33 + 4 * 25), banana.getPrice(4));*/
        banana.getPrice(4);
        /*[Transform from] assertEquals(new Money(1 * 33 + 4 * 25), banana.getPrice(5));*/
        banana.getPrice(5);
        assertEquals(new Money(2 * 33 + 4 * 25), banana.getPrice(6));
    }

    @Test
    public void testFourForADollar_B_7() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new BinaryFunctionFunction<Integer, Number>(new CompositeBinaryFunction<Integer, Integer, Number>(Add.instance(), Composite.function(Multiply.by(100), Divide.by(4)), Composite.function(Multiply.by(33), Mod.by(4))))));
        /*[Transform from] assertEquals(new Money(0 * 33 + 0 * 25), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33 + 0 * 25), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33 + 0 * 25), banana.getPrice(2));*/
        banana.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 33 + 0 * 25), banana.getPrice(3));*/
        banana.getPrice(3);
        /*[Transform from] assertEquals(new Money(0 * 33 + 4 * 25), banana.getPrice(4));*/
        banana.getPrice(4);
        /*[Transform from] assertEquals(new Money(1 * 33 + 4 * 25), banana.getPrice(5));*/
        banana.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 33 + 4 * 25), banana.getPrice(6));*/
        banana.getPrice(6);
        assertEquals(new Money(3 * 33 + 4 * 25), banana.getPrice(7));
    }

    @Test
    public void testFourForADollar_B_8() throws Exception {
        Product banana = new Product("Banana", "SKU-0002", ToMoney.from(new BinaryFunctionFunction<Integer, Number>(new CompositeBinaryFunction<Integer, Integer, Number>(Add.instance(), Composite.function(Multiply.by(100), Divide.by(4)), Composite.function(Multiply.by(33), Mod.by(4))))));
        /*[Transform from] assertEquals(new Money(0 * 33 + 0 * 25), banana.getPrice(0));*/
        banana.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 33 + 0 * 25), banana.getPrice(1));*/
        banana.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 33 + 0 * 25), banana.getPrice(2));*/
        banana.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 33 + 0 * 25), banana.getPrice(3));*/
        banana.getPrice(3);
        /*[Transform from] assertEquals(new Money(0 * 33 + 4 * 25), banana.getPrice(4));*/
        banana.getPrice(4);
        /*[Transform from] assertEquals(new Money(1 * 33 + 4 * 25), banana.getPrice(5));*/
        banana.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 33 + 4 * 25), banana.getPrice(6));*/
        banana.getPrice(6);
        /*[Transform from] assertEquals(new Money(3 * 33 + 4 * 25), banana.getPrice(7));*/
        banana.getPrice(7);
        assertEquals(new Money(0 * 33 + 8 * 25), banana.getPrice(8));
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
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        assertEquals(new Money(0 * 40), apple.getPrice(0));
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1_1() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        assertEquals(new Money(1 * 40), apple.getPrice(1));
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1_2() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        assertEquals(new Money(2 * 40), apple.getPrice(2));
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1_3() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        assertEquals(new Money(2 * 40), apple.getPrice(3));
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1_4() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        assertEquals(new Money(3 * 40), apple.getPrice(4));
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1_5() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        assertEquals(new Money(4 * 40), apple.getPrice(5));
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1_6() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        assertEquals(new Money(4 * 40), apple.getPrice(6));
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1_7() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        assertEquals(new Money(5 * 40), apple.getPrice(7));
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1_8() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(5 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        assertEquals(new Money(6 * 40), apple.getPrice(8));
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1_9() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(5 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        assertEquals(new Money(6 * 40), apple.getPrice(9));
    }

    /*
     * Another interesting pricing rule is something like "buy 2, get 1 free".
     * 
     * This may be implemented using a formula like: costPerUnit * (quantity - quantity / 2)
     * 
     * For example...
     */
    @Test
    public void testBuyTwoGetOneFree_1_10() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(Composite.function(Multiply.by(40), BinaryFunctionFunction.adapt(new CompositeBinaryFunction<Number, Number, Number>(Subtract.instance(), new Identity<Number>(), Divide.by(3))))));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(5 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(9));*/
        apple.getPrice(9);
        assertEquals(new Money(7 * 40), apple.getPrice(10));
    }

    @Test
    public void testBuyTwoGetOneFree_2() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        assertEquals(new Money(0 * 40), apple.getPrice(0));
    }

    @Test
    public void testBuyTwoGetOneFree_2_1() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        assertEquals(new Money(1 * 40), apple.getPrice(1));
    }

    @Test
    public void testBuyTwoGetOneFree_2_2() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        assertEquals(new Money(2 * 40), apple.getPrice(2));
    }

    @Test
    public void testBuyTwoGetOneFree_2_3() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        assertEquals(new Money(2 * 40), apple.getPrice(3));
    }

    @Test
    public void testBuyTwoGetOneFree_2_4() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        assertEquals(new Money(3 * 40), apple.getPrice(4));
    }

    @Test
    public void testBuyTwoGetOneFree_2_5() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        assertEquals(new Money(4 * 40), apple.getPrice(5));
    }

    @Test
    public void testBuyTwoGetOneFree_2_6() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        assertEquals(new Money(4 * 40), apple.getPrice(6));
    }

    @Test
    public void testBuyTwoGetOneFree_2_7() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        assertEquals(new Money(5 * 40), apple.getPrice(7));
    }

    @Test
    public void testBuyTwoGetOneFree_2_8() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(5 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        assertEquals(new Money(6 * 40), apple.getPrice(8));
    }

    @Test
    public void testBuyTwoGetOneFree_2_9() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(5 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        assertEquals(new Money(6 * 40), apple.getPrice(9));
    }

    @Test
    public void testBuyTwoGetOneFree_2_10() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 1, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(5 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(9));*/
        apple.getPrice(9);
        assertEquals(new Money(7 * 40), apple.getPrice(10));
    }

    @Test
    public void testBuyThreeGetTwoFree() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        assertEquals(new Money(0 * 40), apple.getPrice(0));
    }

    @Test
    public void testBuyThreeGetTwoFree_1() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        assertEquals(new Money(1 * 40), apple.getPrice(1));
    }

    @Test
    public void testBuyThreeGetTwoFree_2() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        assertEquals(new Money(2 * 40), apple.getPrice(2));
    }

    @Test
    public void testBuyThreeGetTwoFree_3() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        assertEquals(new Money(3 * 40), apple.getPrice(3));
    }

    @Test
    public void testBuyThreeGetTwoFree_4() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        assertEquals(new Money(3 * 40), apple.getPrice(4));
    }

    @Test
    public void testBuyThreeGetTwoFree_5() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        assertEquals(new Money(3 * 40), apple.getPrice(5));
    }

    @Test
    public void testBuyThreeGetTwoFree_6() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        assertEquals(new Money(4 * 40), apple.getPrice(6));
    }

    @Test
    public void testBuyThreeGetTwoFree_7() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        assertEquals(new Money(5 * 40), apple.getPrice(7));
    }

    @Test
    public void testBuyThreeGetTwoFree_8() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(5 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        assertEquals(new Money(6 * 40), apple.getPrice(8));
    }

    @Test
    public void testBuyThreeGetTwoFree_9() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(5 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        assertEquals(new Money(6 * 40), apple.getPrice(9));
    }

    @Test
    public void testBuyThreeGetTwoFree_10() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(5 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(9));*/
        apple.getPrice(9);
        assertEquals(new Money(6 * 40), apple.getPrice(10));
    }

    @Test
    public void testBuyThreeGetTwoFree_11() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(3, 2, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(5 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(9));*/
        apple.getPrice(9);
        /*[Transform from] assertEquals(new Money(6 * 40), apple.getPrice(10));*/
        apple.getPrice(10);
        assertEquals(new Money(7 * 40), apple.getPrice(11));
    }

    @Test
    public void testBuyTwoGetFiveFree() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        assertEquals(new Money(0 * 40), apple.getPrice(0));
    }

    @Test
    public void testBuyTwoGetFiveFree_1() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        assertEquals(new Money(1 * 40), apple.getPrice(1));
    }

    @Test
    public void testBuyTwoGetFiveFree_2() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        assertEquals(new Money(2 * 40), apple.getPrice(2));
    }

    @Test
    public void testBuyTwoGetFiveFree_3() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        assertEquals(new Money(2 * 40), apple.getPrice(3));
    }

    @Test
    public void testBuyTwoGetFiveFree_4() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        assertEquals(new Money(2 * 40), apple.getPrice(4));
    }

    @Test
    public void testBuyTwoGetFiveFree_5() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        assertEquals(new Money(2 * 40), apple.getPrice(5));
    }

    @Test
    public void testBuyTwoGetFiveFree_6() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        assertEquals(new Money(2 * 40), apple.getPrice(6));
    }

    @Test
    public void testBuyTwoGetFiveFree_7() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        assertEquals(new Money(2 * 40), apple.getPrice(7));
    }

    @Test
    public void testBuyTwoGetFiveFree_8() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        assertEquals(new Money(3 * 40), apple.getPrice(8));
    }

    @Test
    public void testBuyTwoGetFiveFree_9() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        assertEquals(new Money(4 * 40), apple.getPrice(9));
    }

    @Test
    public void testBuyTwoGetFiveFree_10() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(9));*/
        apple.getPrice(9);
        assertEquals(new Money(4 * 40), apple.getPrice(10));
    }

    @Test
    public void testBuyTwoGetFiveFree_11() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(9));*/
        apple.getPrice(9);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(10));*/
        apple.getPrice(10);
        assertEquals(new Money(4 * 40), apple.getPrice(11));
    }

    @Test
    public void testBuyTwoGetFiveFree_12() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(9));*/
        apple.getPrice(9);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(10));*/
        apple.getPrice(10);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(11));*/
        apple.getPrice(11);
        assertEquals(new Money(4 * 40), apple.getPrice(12));
    }

    @Test
    public void testBuyTwoGetFiveFree_13() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(9));*/
        apple.getPrice(9);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(10));*/
        apple.getPrice(10);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(11));*/
        apple.getPrice(11);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(12));*/
        apple.getPrice(12);
        assertEquals(new Money(4 * 40), apple.getPrice(13));
    }

    @Test
    public void testBuyTwoGetFiveFree_14() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(9));*/
        apple.getPrice(9);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(10));*/
        apple.getPrice(10);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(11));*/
        apple.getPrice(11);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(12));*/
        apple.getPrice(12);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(13));*/
        apple.getPrice(13);
        assertEquals(new Money(4 * 40), apple.getPrice(14));
    }

    @Test
    public void testBuyTwoGetFiveFree_15() throws Exception {
        Product apple = new Product("Apple", "SKU-0003", ToMoney.from(new BuyNGetMFree(2, 5, 40)));
        /*[Transform from] assertEquals(new Money(0 * 40), apple.getPrice(0));*/
        apple.getPrice(0);
        /*[Transform from] assertEquals(new Money(1 * 40), apple.getPrice(1));*/
        apple.getPrice(1);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(2));*/
        apple.getPrice(2);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(3));*/
        apple.getPrice(3);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(4));*/
        apple.getPrice(4);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(5));*/
        apple.getPrice(5);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(6));*/
        apple.getPrice(6);
        /*[Transform from] assertEquals(new Money(2 * 40), apple.getPrice(7));*/
        apple.getPrice(7);
        /*[Transform from] assertEquals(new Money(3 * 40), apple.getPrice(8));*/
        apple.getPrice(8);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(9));*/
        apple.getPrice(9);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(10));*/
        apple.getPrice(10);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(11));*/
        apple.getPrice(11);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(12));*/
        apple.getPrice(12);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(13));*/
        apple.getPrice(13);
        /*[Transform from] assertEquals(new Money(4 * 40), apple.getPrice(14));*/
        apple.getPrice(14);
        assertEquals(new Money(5 * 40), apple.getPrice(15));
    }
}

