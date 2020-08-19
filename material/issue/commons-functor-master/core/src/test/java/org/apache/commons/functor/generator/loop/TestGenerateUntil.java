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
import org.apache.commons.functor.generator.loop.GenerateUntil;
import org.apache.commons.functor.range.IntegerRange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Generate Until class.
 * @version $Revision: 1508677 $ $Date: 2013-07-30 19:48:02 -0300 (Tue, 30 Jul 2013) $
 */
public class TestGenerateUntil {

    @Before
    public void setUp() throws Exception {
        wrappedGenerator = IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10));
        generateUntil = new GenerateUntil<Integer>(wrappedGenerator, isMoreThanFive);
    }

    @After
    public void tearDown() {
        wrappedGenerator = null;
        isMoreThanFive = null;
        generateUntil = null;
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullWrappedPredicate() {
        new GenerateUntil<Integer>(generateUntil, null);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullGenerator() {
        new GenerateUntil<Integer>(null, isMoreThanFive);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorProhibitsNullGeneratorOrNullWrappedPredicate() {
        new GenerateUntil<Integer>(null, null);
    }

    // Attributes
    // ------------------------------------------------------------------------
    private static final Integer FIVE = Integer.valueOf(5);

    private Generator<Integer> wrappedGenerator = null;

    private Predicate<Integer> isMoreThanFive = new Predicate<Integer>() {

        public boolean test(Integer obj) {
            return obj > FIVE;
        }
    };

    private Generator<Integer> generateUntil = null;

    @Test
    public void testEquals() {
        Generator<Integer> anotherGenerate = new GenerateUntil<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isMoreThanFive);
        assertEquals(generateUntil, generateUntil);
    }

    @Test
    public void testEquals_1() {
        Generator<Integer> anotherGenerate = new GenerateUntil<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isMoreThanFive);
        /*[Transform from] assertEquals(generateUntil, generateUntil);[NONE Params]*/
        ;
        assertEquals(generateUntil, anotherGenerate);
    }

    @Test
    public void testEquals_2() {
        Generator<Integer> anotherGenerate = new GenerateUntil<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isMoreThanFive);
        /*[Transform from] assertEquals(generateUntil, generateUntil);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(generateUntil, anotherGenerate);[NONE Params]*/
        ;
        assertTrue(!generateUntil.equals((GenerateUntil<Integer>) null));
    }

    @Test
    public void testEquals_3() {
        Generator<Integer> anotherGenerate = new GenerateUntil<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isMoreThanFive);
        /*[Transform from] assertEquals(generateUntil, generateUntil);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(generateUntil, anotherGenerate);[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!generateUntil.equals((GenerateUntil<Integer>) null));[NONE Params]*/
        ;
        Generator<Integer> aGenerateWithADifferentPredicate = new GenerateUntil<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), new Predicate<Integer>() {

            public boolean test(Integer obj) {
                return obj > FIVE;
            }
        });
        assertTrue(!generateUntil.equals(aGenerateWithADifferentPredicate));
    }

    @Test
    public void testEquals_4() {
        Generator<Integer> anotherGenerate = new GenerateUntil<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), isMoreThanFive);
        /*[Transform from] assertEquals(generateUntil, generateUntil);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(generateUntil, anotherGenerate);[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!generateUntil.equals((GenerateUntil<Integer>) null));[NONE Params]*/
        ;
        Generator<Integer> aGenerateWithADifferentPredicate = new GenerateUntil<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 10)), new Predicate<Integer>() {

            public boolean test(Integer obj) {
                return obj > FIVE;
            }
        });
        /*[Transform from] assertTrue(!generateUntil.equals(aGenerateWithADifferentPredicate));[NONE Params]*/
        ;
        Generator<Integer> aGenerateWithADifferentWrapped = new GenerateUntil<Integer>(IteratorToGeneratorAdapter.adapt(new IntegerRange(1, 2)), isMoreThanFive);
        assertTrue(!generateUntil.equals(aGenerateWithADifferentWrapped));
    }

    @Test
    public void testHashcode() {
        assertEquals(generateUntil.hashCode(), generateUntil.hashCode());
    }

    @Test
    public void testHashcode_1() {
        /*[Transform from] assertEquals(generateUntil.hashCode(), generateUntil.hashCode());*/
        {
            generateUntil.hashCode();
            generateUntil.hashCode();
        }
        assertEquals(generateUntil.hashCode(), new GenerateUntil<Integer>(wrappedGenerator, isMoreThanFive).hashCode());
    }
}

