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
package org.apache.commons.functor.generator.loop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.functor.generator.loop.WhileGenerate;
import org.apache.commons.functor.range.IntegerRange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the While Generate class.
 * @version $Revision: 1508677 $ $Date: 2013-07-30 19:48:02 -0300 (Tue, 30 Jul 2013) $
 */
public class TestWhileGenerate {

    @Before
    public void setUp() throws Exception {
        wrappedGenerator = IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10));
        whileGenerate = new WhileGenerate<Integer>(isLessThanFive, wrappedGenerator);
    }

    @After
    public void tearDown() {
        wrappedGenerator = null;
        isLessThanFive = null;
        whileGenerate = null;
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullPredicate() {
        new WhileGenerate<Integer>(null, whileGenerate);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullWrappedGenerator() {
        new WhileGenerate<Integer>(isLessThanFive, null);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullPredicateOrNullWrappedGenerator() {
        new WhileGenerate<Integer>(null, null);
    }

    // Attributes
    // ------------------------------------------------------------------------
    private static final Integer FIVE = Integer.valueOf(5);

    private Generator<Integer> wrappedGenerator = null;

    private Predicate<Integer> isLessThanFive = new Predicate<Integer>() {

        public boolean test(Integer obj) {
            return obj < FIVE;
        }
    };

    private Generator<Integer> whileGenerate = null;

    @Test
    public void testEquals() {
        Generator<Integer> anotherGenerate = new WhileGenerate<Integer>(isLessThanFive, IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)));
        assertEquals(whileGenerate, whileGenerate);
    }

    @Test
    public void testEquals_1() {
        Generator<Integer> anotherGenerate = new WhileGenerate<Integer>(isLessThanFive, IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)));
        /*[Transform from] assertEquals(whileGenerate, whileGenerate);[NONE Params]*/
        ;
        assertEquals(whileGenerate, anotherGenerate);
    }

    @Test
    public void testEquals_2() {
        Generator<Integer> anotherGenerate = new WhileGenerate<Integer>(isLessThanFive, IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)));
        /*[Transform from] assertEquals(whileGenerate, whileGenerate);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(whileGenerate, anotherGenerate);[NONE Params]*/
        ;
        assertTrue(!whileGenerate.equals((WhileGenerate<Integer>) null));
    }

    @Test
    public void testEquals_3() {
        Generator<Integer> anotherGenerate = new WhileGenerate<Integer>(isLessThanFive, IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)));
        /*[Transform from] assertEquals(whileGenerate, whileGenerate);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(whileGenerate, anotherGenerate);[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!whileGenerate.equals((WhileGenerate<Integer>) null));[NONE Params]*/
        ;
        Generator<Integer> aGenerateWithADifferentPredicate = new WhileGenerate<Integer>(new Predicate<Integer>() {

            public boolean test(Integer obj) {
                return obj < FIVE;
            }
        }, IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)));
        assertTrue(!whileGenerate.equals(aGenerateWithADifferentPredicate));
    }

    @Test
    public void testEquals_4() {
        Generator<Integer> anotherGenerate = new WhileGenerate<Integer>(isLessThanFive, IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)));
        /*[Transform from] assertEquals(whileGenerate, whileGenerate);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(whileGenerate, anotherGenerate);[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!whileGenerate.equals((WhileGenerate<Integer>) null));[NONE Params]*/
        ;
        Generator<Integer> aGenerateWithADifferentPredicate = new WhileGenerate<Integer>(new Predicate<Integer>() {

            public boolean test(Integer obj) {
                return obj < FIVE;
            }
        }, IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)));
        /*[Transform from] assertTrue(!whileGenerate.equals(aGenerateWithADifferentPredicate));[NONE Params]*/
        ;
        Generator<Integer> aGenerateWithADifferentWrapped = new WhileGenerate<Integer>(isLessThanFive, IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 11)));
        assertTrue(!whileGenerate.equals(aGenerateWithADifferentWrapped));
    }

    @Test
    public void testHashcode() {
        assertEquals(whileGenerate.hashCode(), whileGenerate.hashCode());
    }

    @Test
    public void testHashcode_1() {
        /*[Transform from] assertEquals(whileGenerate.hashCode(), whileGenerate.hashCode());*/
        {
            whileGenerate.hashCode();
            whileGenerate.hashCode();
        }
        assertEquals(whileGenerate.hashCode(), new WhileGenerate<Integer>(isLessThanFive, wrappedGenerator).hashCode());
    }

    @Test
    public void testGenerate() {
        final List<Integer> numbersMinorThanFive = new ArrayList<Integer>();
        whileGenerate.run(new Procedure<Integer>() {

            public void run(Integer obj) {
                numbersMinorThanFive.add(obj);
            }
        });
        assertEquals(4, numbersMinorThanFive.size());
    }

    @Test
    public void testGenerate_1() {
        final List<Integer> numbersMinorThanFive = new ArrayList<Integer>();
        whileGenerate.run(new Procedure<Integer>() {

            public void run(Integer obj) {
                numbersMinorThanFive.add(obj);
            }
        });
        /*[Transform from] assertEquals(4, numbersMinorThanFive.size());*/
        numbersMinorThanFive.size();
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, numbersMinorThanFive);
    }
}

