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
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.functor.generator.loop.GenerateWhile;
import org.apache.commons.functor.range.IntegerRange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Generate While class.
 * @version $Revision: 1508677 $ $Date: 2013-07-30 19:48:02 -0300 (Tue, 30 Jul 2013) $
 */
public class TestGenerateWhile {

    @Before
    public void setUp() throws Exception {
        wrappedGenerator = IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10));
        generateWhile = new GenerateWhile<Integer>(wrappedGenerator, isLessThanFive);
    }

    @After
    public void tearDown() {
        wrappedGenerator = null;
        isLessThanFive = null;
        generateWhile = null;
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullPredicate() {
        new GenerateWhile<Integer>(generateWhile, null);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullWrappedGenerator() {
        new GenerateWhile<Integer>(null, isLessThanFive);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullPredicateOrNullWrappedGenerator() {
        new GenerateWhile<Integer>(null, null);
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

    private Generator<Integer> generateWhile = null;

    @Test
    public void testEquals() {
        Generator<Integer> anotherGenerate = new GenerateWhile<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isLessThanFive);
        assertEquals(generateWhile, generateWhile);
    }

    @Test
    public void testEquals_1() {
        Generator<Integer> anotherGenerate = new GenerateWhile<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isLessThanFive);
        /*[Transform from] assertEquals(generateWhile, generateWhile);[NONE Params]*/
        ;
        assertEquals(generateWhile, anotherGenerate);
    }

    @Test
    public void testEquals_2() {
        Generator<Integer> anotherGenerate = new GenerateWhile<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isLessThanFive);
        /*[Transform from] assertEquals(generateWhile, generateWhile);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(generateWhile, anotherGenerate);[NONE Params]*/
        ;
        assertTrue(!generateWhile.equals((GenerateWhile<Integer>) null));
    }

    @Test
    public void testEquals_3() {
        Generator<Integer> anotherGenerate = new GenerateWhile<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isLessThanFive);
        /*[Transform from] assertEquals(generateWhile, generateWhile);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(generateWhile, anotherGenerate);[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!generateWhile.equals((GenerateWhile<Integer>) null));[NONE Params]*/
        ;
        Generator<Integer> aGenerateWithADifferentPredicate = new GenerateWhile<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), new Predicate<Integer>() {

            public boolean test(Integer obj) {
                return obj < FIVE;
            }
        });
        assertTrue(!generateWhile.equals(aGenerateWithADifferentPredicate));
    }

    @Test
    public void testEquals_4() {
        Generator<Integer> anotherGenerate = new GenerateWhile<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isLessThanFive);
        /*[Transform from] assertEquals(generateWhile, generateWhile);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(generateWhile, anotherGenerate);[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!generateWhile.equals((GenerateWhile<Integer>) null));[NONE Params]*/
        ;
        Generator<Integer> aGenerateWithADifferentPredicate = new GenerateWhile<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), new Predicate<Integer>() {

            public boolean test(Integer obj) {
                return obj < FIVE;
            }
        });
        /*[Transform from] assertTrue(!generateWhile.equals(aGenerateWithADifferentPredicate));[NONE Params]*/
        ;
        Generator<Integer> aGenerateWithADifferentWrapped = new GenerateWhile<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 11)), isLessThanFive);
        assertTrue(!generateWhile.equals(aGenerateWithADifferentWrapped));
    }

    @Test
    public void testHashcode() {
        assertEquals(generateWhile.hashCode(), generateWhile.hashCode());
    }

    @Test
    public void testHashcode_1() {
        /*[Transform from] assertEquals(generateWhile.hashCode(), generateWhile.hashCode());*/
        {
            generateWhile.hashCode();
            generateWhile.hashCode();
        }
        assertEquals(generateWhile.hashCode(), new GenerateWhile<Integer>(wrappedGenerator, isLessThanFive).hashCode());
    }
}

