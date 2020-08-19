/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0f
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0f
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
 * Tests for float range.
 *
 * @since 1.0
 * @version $Revision: $ $Date: $
 */
public class TestFloatRange extends BaseFunctorTest {

    // A base range with all longs between -6 and 6
    private final List<Float> fullRange = Collections.unmodifiableList(Arrays.asList(-6.0f, -5.0f, -4.0f, -3.0f, -2.0f, -1.0f, 0.0f, 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f));

    // Attributes
    // ------------------------------------------------------------------------
    private FloatRange ascFloatRange = null;

    private FloatRange descFloatRange = null;

    private Collection<Float> expectedAsc = null;

    private Collection<Float> expectedDesc = null;

    // Test set up
    // ------------------------------------------------------------------------
    @Before
    public void setUp() {
        ascFloatRange = Ranges.floatRange(0.0f, 10.0f);
        descFloatRange = Ranges.floatRange(10.0f, 0.0f);
        expectedAsc = Arrays.asList(0.0f, 1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f);
        expectedDesc = Arrays.asList(10.0f, 9.0f, 8.0f, 7.0f, 6.0f, 5.0f, 4.0f, 3.0f, 2.0f, 1.0f);
    }

    @After
    public void tearDown() {
        ascFloatRange = null;
        descFloatRange = null;
    }

    @Override
    protected Object makeFunctor() throws Exception {
        return Ranges.floatRange(10, 20);
    }

    // Generator tests
    // ---------------------------------------------------------------
    @Test
    public void testStepChecking() {
        {
            // step of 0 is ok when range is empty
            Ranges.floatRange(2, 2, 0);
        }
        {
            // positive step is ok when range is
            Ranges.floatRange(2, 2, 1);
        // empty
        }
        {
            // negative step is ok when range is
            Ranges.floatRange(2, 2, -1);
        // empty
        }
        {
            // big steps are ok
            Ranges.floatRange(0, 1, 10);
        }
        {
            // big steps are ok
            Ranges.floatRange(1, 0, -10);
        }
        try {
            Ranges.floatRange(0, 1, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        // expected
        }
    }

    @Test
    public void testStepChecking_1() {
        {
            // step of 0 is ok when range is empty
            Ranges.floatRange(2, 2, 0);
        }
        {
            // positive step is ok when range is
            Ranges.floatRange(2, 2, 1);
        // empty
        }
        {
            // negative step is ok when range is
            Ranges.floatRange(2, 2, -1);
        // empty
        }
        {
            // big steps are ok
            Ranges.floatRange(0, 1, 10);
        }
        {
            // big steps are ok
            Ranges.floatRange(1, 0, -10);
        }
        try {
            Ranges.floatRange(0, 1, 0);
            /*[Transform from] fail("Expected IllegalArgumentException");[NONE Params]*/
            ;
        } catch (IllegalArgumentException e) {
        // expected
        }
        try {
            Ranges.floatRange(0, 1, -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        // expected
        }
    }

    @Test
    public void testStepChecking_2() {
        {
            // step of 0 is ok when range is empty
            Ranges.floatRange(2, 2, 0);
        }
        {
            // positive step is ok when range is
            Ranges.floatRange(2, 2, 1);
        // empty
        }
        {
            // negative step is ok when range is
            Ranges.floatRange(2, 2, -1);
        // empty
        }
        {
            // big steps are ok
            Ranges.floatRange(0, 1, 10);
        }
        {
            // big steps are ok
            Ranges.floatRange(1, 0, -10);
        }
        try {
            Ranges.floatRange(0, 1, 0);
            /*[Transform from] fail("Expected IllegalArgumentException");[NONE Params]*/
            ;
        } catch (IllegalArgumentException e) {
        // expected
        }
        try {
            Ranges.floatRange(0, 1, -1);
            /*[Transform from] fail("Expected IllegalArgumentException");[NONE Params]*/
            ;
        } catch (IllegalArgumentException e) {
        // expected
        }
        try {
            Ranges.floatRange(0, -1, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        // expected
        }
    }

    @Test
    public void testObjectConstructor() {
        FloatRange range = Ranges.floatRange(Float.valueOf(0), Float.valueOf(5));
        assertEquals("[0.0, 1.0, 2.0, 3.0, 4.0]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    }

    @Test
    public void testReverseStep() {
        FloatRange range = Ranges.floatRange(10, 0, -2);
        assertEquals("[10.0, 8.0, 6.0, 4.0, 2.0]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    }

    @Test
    public void testStep() {
        FloatRange range = Ranges.floatRange(0, 10, 2);
        assertEquals("[0.0, 2.0, 4.0, 6.0, 8.0]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    }

    @Test
    public void testForwardRange() {
        FloatRange range = Ranges.floatRange(0, 5);
        assertEquals("[0.0, 1.0, 2.0, 3.0, 4.0]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    }

    @Test
    public void testReverseRange() {
        FloatRange range = Ranges.floatRange(5, 0);
        assertEquals("[5.0, 4.0, 3.0, 2.0, 1.0]", IteratorToGeneratorAdapter.adapt(range).toCollection().toString());
    }

    @Test
    public void testClosedClosedAscending() {
        // [-5.0f, 5.0f], 3.0f = -5.0f, -2.0f, 1.0f, 4.0f
        FloatRange range = Ranges.floatRange(-5.0f, BoundType.CLOSED, 5.0f, BoundType.CLOSED, 3.0f);
        // [-5.0f, 5.0f], 3.0f = -5.0f, -2.0f, 1.0f, 4.0f
        List<Float> expected = Arrays.asList(-5.0f, -2.0f, 1.0f, 4.0f);
        Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        assertEquals(expected, elements);
    }

    @Test
    public void testOpenClosedAscending() {
        // (-5.0f, 5.0f], 3.0f = -2.0f, 1.0f, 4.0f
        FloatRange range = Ranges.floatRange(-5.0f, BoundType.OPEN, 5.0f, BoundType.CLOSED, 3.0f);
        // (-5.0f, 5.0f], 3.0f = -2.0f, 1.0f, 4.0f
        List<Float> expected = Arrays.asList(-2.0f, 1.0f, 4.0f);
        Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        assertEquals(expected, elements);
    }

    @Test
    public void testClosedOpenAscending() {
        // [-5.0f, 5.0f), 3.0f = -5.0f, -2.0f, 1.0f, 4.0f
        FloatRange range = Ranges.floatRange(-5.0f, BoundType.CLOSED, 5.0f, BoundType.OPEN, 3.0f);
        // (-5.0f, 5.0f], 3.0f = -5.0f, -2.0f, 1.0f, 4.0f
        List<Float> expected = Arrays.asList(-5.0f, -2.0f, 1.0f, 4.0f);
        Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        assertEquals(expected, elements);
    }

    @Test
    public void testOpenOpenAscending() {
        // (-5.0f, 5.0f), 3.0f = -2.0f, 1.0f, 4.0f
        FloatRange range = Ranges.floatRange(-5.0f, BoundType.OPEN, 5.0f, BoundType.OPEN, 3.0f);
        // (-5.0f, 5.0f), 3.0f = -2.0f, 1.0f, 4.0f
        List<Float> expected = Arrays.asList(-2.0f, 1.0f, 4.0f);
        Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        assertEquals(expected, elements);
    }

    @Test
    public void testSingleStepAscending() {
        // (-2.0f, 2.0f], 1.0f = -1.0f, 0.0f, 1.0f, 2.0f
        FloatRange range = Ranges.floatRange(-2.0f, BoundType.OPEN, 2.0f, BoundType.CLOSED, 1.0f);
        // (-2.0f, 2.0f], 1.0f = -1.0f, 0.0f, 1.0f, 2.0f
        List<Float> expected = Arrays.asList(-1.0f, 0.0f, 1.0f, 2.0f);
        Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        assertEquals(expected, elements);
    }

    @Test
    public void testClosedClosedDescending() {
        // [5.0f, -5.0f], -3.0f = 5.0f, 2.0f, -1.0f, -4.0f
        FloatRange range = Ranges.floatRange(5.0f, BoundType.CLOSED, -5.0f, BoundType.CLOSED, -3.0f);
        // [5.0f, -5.0f], -3.0f = 5.0f, 2.0f, -1.0f, -4.0f
        List<Float> expected = Arrays.asList(5.0f, 2.0f, -1.0f, -4.0f);
        Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        assertEquals(expected, elements);
    }

    @Test
    public void testOpenClosedDescending() {
        // (5.0f, -5.0f], -3.0f = 2.0f, -1.0f, -4.0f
        FloatRange range = Ranges.floatRange(5.0f, BoundType.OPEN, -5.0f, BoundType.CLOSED, -3.0f);
        // (5.0f, -5.0f], -3.0f = 2.0f, -1.0f, -4.0f
        List<Float> expected = Arrays.asList(2.0f, -1.0f, -4.0f);
        Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        assertEquals(expected, elements);
    }

    @Test
    public void testClosedOpenDescending() {
        // [5.0f, -5.0f), -3.0f = 5.0f, 2.0f, -1.0f, -4.0f
        FloatRange range = Ranges.floatRange(5.0f, BoundType.CLOSED, -5.0f, BoundType.OPEN, -3.0f);
        // [5.0f, -5.0f), -3.0f = 5.0f, 2.0f, -1.0f, -4.0f
        List<Float> expected = Arrays.asList(5.0f, 2.0f, -1.0f, -4.0f);
        Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        assertEquals(expected, elements);
    }

    @Test
    public void testOpenOpenDescending() {
        // (5.0f, -5.0f), -3.0f = 2.0f, -1.0f, -4.0f
        FloatRange range = Ranges.floatRange(5.0f, BoundType.OPEN, -5.0f, BoundType.OPEN, -3.0f);
        // (5.0f, -5.0f), -3.0f = 2.0f, -1.0f, -4.0f
        List<Float> expected = Arrays.asList(2.0f, -1.0f, -4.0f);
        Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        assertEquals(expected, elements);
    }

    @Test
    public void testSingleStepDescending() {
        // [2.0f, -2.0f), -1.0f = 2.0f, 1.0f, 0.0f, -1.0f
        FloatRange range = Ranges.floatRange(2.0f, BoundType.CLOSED, -2.0f, BoundType.OPEN, -1.0f);
        // [2.0f, -2.0f), -1.0f = 2.0f, 1.0f, 0.0f, -1.0f
        List<Float> expected = Arrays.asList(2.0f, 1.0f, 0.0f, -1.0f);
        Collection<Float> elements = IteratorToGeneratorAdapter.adapt(range).toCollection();
        assertEquals(expected, elements);
    }

    @Test
    public void testAscending() {
        final List<Float> list = new ArrayList<Float>();
        for (float f : ascFloatRange) {
            list.add(f);
        }
        assertTrue(expectedAsc.containsAll(list));
    }

    @Test
    public void testDescending() {
        final List<Float> list = new ArrayList<Float>();
        for (float f : descFloatRange) {
            list.add(f);
        }
        assertTrue(expectedDesc.containsAll(list));
    }

    @Test
    public void testToCollection() {
        Collection<Float> ascCol = IteratorToGeneratorAdapter.adapt(ascFloatRange).toCollection();
        assertEquals("Different collections", expectedAsc, ascCol);
    }

    @Test
    public void testToCollection_1() {
        Collection<Float> ascCol = IteratorToGeneratorAdapter.adapt(ascFloatRange).toCollection();
        /*[Transform from] assertEquals("Different collections", expectedAsc, ascCol);[NONE Params]*/
        ;
        Collection<Float> descCol = IteratorToGeneratorAdapter.adapt(descFloatRange).toCollection();
        assertEquals("Different collections", expectedDesc, descCol);
    }

    @Test
    public void testTransformedGenerator() {
        Float expected = 45.0f;
        Float total = IteratorToGeneratorAdapter.adapt(ascFloatRange).to(new Function<Generator<? extends Float>, Float>() {

            public Float evaluate(Generator<? extends Float> obj) {
                Float total = 0.0f;
                for (Object element : obj.toCollection()) {
                    total += (Float) element;
                }
                return total;
            }
        });
        assertEquals(expected, total);
    }

    // Range tests
    // ---------------------------------------------------------------
    @Test
    public void testEmptyRanges() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        assertTrue("The range was expected to be empty.", empty1.isEmpty());
    }

    @Test
    public void testEmptyRanges_1() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty1.isEmpty());*/
        empty1.isEmpty();
        FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
        assertTrue("The range was expected to be empty.", empty2.isEmpty());
    }

    @Test
    public void testEmptyRanges_2() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty1.isEmpty());*/
        empty1.isEmpty();
        FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty2.isEmpty());*/
        empty2.isEmpty();
        FloatRange empty3 = Ranges.floatRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
        assertTrue("The range was expected to be empty.", empty3.isEmpty());
    }

    @Test
    public void testEmptyRanges_3() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty1.isEmpty());*/
        empty1.isEmpty();
        FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty2.isEmpty());*/
        empty2.isEmpty();
        FloatRange empty3 = Ranges.floatRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty3.isEmpty());*/
        empty3.isEmpty();
        FloatRange empty4 = Ranges.floatRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
        assertTrue("The range was expected to be empty.", empty4.isEmpty());
    }

    @Test
    public void testEmptyRanges_4() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty1.isEmpty());*/
        empty1.isEmpty();
        FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty2.isEmpty());*/
        empty2.isEmpty();
        FloatRange empty3 = Ranges.floatRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty3.isEmpty());*/
        empty3.isEmpty();
        FloatRange empty4 = Ranges.floatRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty4.isEmpty());*/
        empty4.isEmpty();
        FloatRange empty5 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.OPEN, 1);
        assertTrue("The range was expected to be empty.", empty5.isEmpty());
    }

    @Test
    public void testEmptyRanges_5() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty1.isEmpty());*/
        empty1.isEmpty();
        FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty2.isEmpty());*/
        empty2.isEmpty();
        FloatRange empty3 = Ranges.floatRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty3.isEmpty());*/
        empty3.isEmpty();
        FloatRange empty4 = Ranges.floatRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty4.isEmpty());*/
        empty4.isEmpty();
        FloatRange empty5 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty5.isEmpty());*/
        empty5.isEmpty();
        FloatRange empty6 = Ranges.floatRange(1, BoundType.OPEN, 0, BoundType.CLOSED, -2);
        assertTrue("The range was expected to be empty.", empty6.isEmpty());
    }

    @Test
    public void testEmptyRanges_6() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty1.isEmpty());*/
        empty1.isEmpty();
        FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty2.isEmpty());*/
        empty2.isEmpty();
        FloatRange empty3 = Ranges.floatRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty3.isEmpty());*/
        empty3.isEmpty();
        FloatRange empty4 = Ranges.floatRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty4.isEmpty());*/
        empty4.isEmpty();
        FloatRange empty5 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty5.isEmpty());*/
        empty5.isEmpty();
        FloatRange empty6 = Ranges.floatRange(1, BoundType.OPEN, 0, BoundType.CLOSED, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty6.isEmpty());*/
        empty6.isEmpty();
        FloatRange notEmpty1 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.CLOSED, 1);
        assertFalse("The range was not expected to be empty.", notEmpty1.isEmpty());
    }

    @Test
    public void testEmptyRanges_7() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty1.isEmpty());*/
        empty1.isEmpty();
        FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty2.isEmpty());*/
        empty2.isEmpty();
        FloatRange empty3 = Ranges.floatRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty3.isEmpty());*/
        empty3.isEmpty();
        FloatRange empty4 = Ranges.floatRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty4.isEmpty());*/
        empty4.isEmpty();
        FloatRange empty5 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty5.isEmpty());*/
        empty5.isEmpty();
        FloatRange empty6 = Ranges.floatRange(1, BoundType.OPEN, 0, BoundType.CLOSED, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty6.isEmpty());*/
        empty6.isEmpty();
        FloatRange notEmpty1 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("The range was not expected to be empty.", notEmpty1.isEmpty());*/
        notEmpty1.isEmpty();
        FloatRange notEmpty2 = Ranges.floatRange(-3, BoundType.OPEN, -2, BoundType.CLOSED, 1);
        assertFalse("The range was not expected to be empty.", notEmpty2.isEmpty());
    }

    @Test
    public void testEmptyRanges_8() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty1.isEmpty());*/
        empty1.isEmpty();
        FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty2.isEmpty());*/
        empty2.isEmpty();
        FloatRange empty3 = Ranges.floatRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty3.isEmpty());*/
        empty3.isEmpty();
        FloatRange empty4 = Ranges.floatRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty4.isEmpty());*/
        empty4.isEmpty();
        FloatRange empty5 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty5.isEmpty());*/
        empty5.isEmpty();
        FloatRange empty6 = Ranges.floatRange(1, BoundType.OPEN, 0, BoundType.CLOSED, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty6.isEmpty());*/
        empty6.isEmpty();
        FloatRange notEmpty1 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("The range was not expected to be empty.", notEmpty1.isEmpty());*/
        notEmpty1.isEmpty();
        FloatRange notEmpty2 = Ranges.floatRange(-3, BoundType.OPEN, -2, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("The range was not expected to be empty.", notEmpty2.isEmpty());*/
        notEmpty2.isEmpty();
        FloatRange notEmpty3 = Ranges.floatRange(2, BoundType.OPEN, 1, BoundType.CLOSED, -1);
        assertFalse("The range was not expected to be empty.", notEmpty3.isEmpty());
    }

    @Test
    public void testEmptyRanges_9() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty1.isEmpty());*/
        empty1.isEmpty();
        FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty2.isEmpty());*/
        empty2.isEmpty();
        FloatRange empty3 = Ranges.floatRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty3.isEmpty());*/
        empty3.isEmpty();
        FloatRange empty4 = Ranges.floatRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty4.isEmpty());*/
        empty4.isEmpty();
        FloatRange empty5 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty5.isEmpty());*/
        empty5.isEmpty();
        FloatRange empty6 = Ranges.floatRange(1, BoundType.OPEN, 0, BoundType.CLOSED, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty6.isEmpty());*/
        empty6.isEmpty();
        FloatRange notEmpty1 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("The range was not expected to be empty.", notEmpty1.isEmpty());*/
        notEmpty1.isEmpty();
        FloatRange notEmpty2 = Ranges.floatRange(-3, BoundType.OPEN, -2, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("The range was not expected to be empty.", notEmpty2.isEmpty());*/
        notEmpty2.isEmpty();
        FloatRange notEmpty3 = Ranges.floatRange(2, BoundType.OPEN, 1, BoundType.CLOSED, -1);
        /*[Transform from] assertFalse("The range was not expected to be empty.", notEmpty3.isEmpty());*/
        notEmpty3.isEmpty();
        FloatRange notEmpty4 = Ranges.floatRange(2, BoundType.CLOSED, 1, BoundType.OPEN, -1);
        assertFalse("The range was not expected to be empty.", notEmpty4.isEmpty());
    }

    @Test
    public void testEmptyRanges_10() {
        FloatRange empty1 = Ranges.floatRange(-2, BoundType.OPEN, -1, BoundType.OPEN, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty1.isEmpty());*/
        empty1.isEmpty();
        FloatRange empty2 = Ranges.floatRange(2, BoundType.OPEN, 0, BoundType.OPEN, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty2.isEmpty());*/
        empty2.isEmpty();
        FloatRange empty3 = Ranges.floatRange(0, BoundType.OPEN, 1, BoundType.CLOSED, 2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty3.isEmpty());*/
        empty3.isEmpty();
        FloatRange empty4 = Ranges.floatRange(-3, BoundType.OPEN, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty4.isEmpty());*/
        empty4.isEmpty();
        FloatRange empty5 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.OPEN, 1);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty5.isEmpty());*/
        empty5.isEmpty();
        FloatRange empty6 = Ranges.floatRange(1, BoundType.OPEN, 0, BoundType.CLOSED, -2);
        /*[Transform from] assertTrue("The range was expected to be empty.", empty6.isEmpty());*/
        empty6.isEmpty();
        FloatRange notEmpty1 = Ranges.floatRange(-3, BoundType.CLOSED, -3, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("The range was not expected to be empty.", notEmpty1.isEmpty());*/
        notEmpty1.isEmpty();
        FloatRange notEmpty2 = Ranges.floatRange(-3, BoundType.OPEN, -2, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("The range was not expected to be empty.", notEmpty2.isEmpty());*/
        notEmpty2.isEmpty();
        FloatRange notEmpty3 = Ranges.floatRange(2, BoundType.OPEN, 1, BoundType.CLOSED, -1);
        /*[Transform from] assertFalse("The range was not expected to be empty.", notEmpty3.isEmpty());*/
        notEmpty3.isEmpty();
        FloatRange notEmpty4 = Ranges.floatRange(2, BoundType.CLOSED, 1, BoundType.OPEN, -1);
        /*[Transform from] assertFalse("The range was not expected to be empty.", notEmpty4.isEmpty());*/
        notEmpty4.isEmpty();
        FloatRange notEmpty5 = Ranges.floatRange(1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        assertFalse("The range was not expected to be empty.", notEmpty5.isEmpty());
    }

    @Test
    public void testBoundaries() {
        FloatRange range = Ranges.floatRange(0.0f, 10.0f);
        assertEquals(new Endpoint<Comparable<?>>(0.0f, BoundType.CLOSED), range.getLeftEndpoint());
    }

    @Test
    public void testBoundaries_1() {
        FloatRange range = Ranges.floatRange(0.0f, 10.0f);
        /*[Transform from] assertEquals(new Endpoint<Comparable<?>>(0.0f, BoundType.CLOSED), range.getLeftEndpoint());*/
        range.getLeftEndpoint();
        assertEquals(new Endpoint<Comparable<?>>(10.0f, BoundType.OPEN), range.getRightEndpoint());
    }

    @Test
    public void testClosedClosedAscendingContains() {
        // [-5, 5], 3 = -5, -2, 1, 4
        FloatRange range = Ranges.floatRange(-5, BoundType.CLOSED, 5, BoundType.CLOSED, 3);
        // [-5, 5], 3 = -5, -2, 1, 4
        List<Float> arr = Arrays.asList(-5.0f, -2.0f, 1.0f, 4.0f);
        for (Float element : arr) {
            assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testClosedClosedAscendingContains_1() {
        // [-5, 5], 3 = -5, -2, 1, 4
        FloatRange range = Ranges.floatRange(-5, BoundType.CLOSED, 5, BoundType.CLOSED, 3);
        // [-5, 5], 3 = -5, -2, 1, 4
        List<Float> arr = Arrays.asList(-5.0f, -2.0f, 1.0f, 4.0f);
        for (Float element : arr) {
            /*[Transform from] assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));*/
            range.contains(element);
        }
        List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        elementsNotPresent.removeAll(arr);
        for (Float element : elementsNotPresent) {
            assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testOpenClosedAscendingContains() {
        // (-5, 5], 3 = -2, 1, 4
        FloatRange range = Ranges.floatRange(-5, BoundType.OPEN, 5, BoundType.CLOSED, 3);
        // (-5, 5], 3 = -2, 1, 4
        List<Float> arr = Arrays.asList(-2.0f, 1.0f, 4.0f);
        for (Float element : arr) {
            assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testOpenClosedAscendingContains_1() {
        // (-5, 5], 3 = -2, 1, 4
        FloatRange range = Ranges.floatRange(-5, BoundType.OPEN, 5, BoundType.CLOSED, 3);
        // (-5, 5], 3 = -2, 1, 4
        List<Float> arr = Arrays.asList(-2.0f, 1.0f, 4.0f);
        for (Float element : arr) {
            /*[Transform from] assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));*/
            range.contains(element);
        }
        List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        elementsNotPresent.removeAll(arr);
        for (Float element : elementsNotPresent) {
            assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testClosedOpenAscendingContains() {
        // [-5, 5), 3 = -5, -2, 1, 4
        FloatRange range = Ranges.floatRange(-5, BoundType.CLOSED, 5, BoundType.OPEN, 3);
        // (-5, 5], 3 = -5, -2, 1, 4
        List<Float> arr = Arrays.asList(-5.0f, -2.0f, 1.0f, 4.0f);
        for (Float element : arr) {
            assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testClosedOpenAscendingContains_1() {
        // [-5, 5), 3 = -5, -2, 1, 4
        FloatRange range = Ranges.floatRange(-5, BoundType.CLOSED, 5, BoundType.OPEN, 3);
        // (-5, 5], 3 = -5, -2, 1, 4
        List<Float> arr = Arrays.asList(-5.0f, -2.0f, 1.0f, 4.0f);
        for (Float element : arr) {
            /*[Transform from] assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));*/
            range.contains(element);
        }
        List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        elementsNotPresent.removeAll(arr);
        for (Float element : elementsNotPresent) {
            assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testOpenOpenAscendingContains() {
        // (-5, 5), 3 = -2, 1, 4
        FloatRange range = Ranges.floatRange(-5, BoundType.OPEN, 5, BoundType.OPEN, 3);
        // (-5, 5), 3 = -2, 1, 4
        List<Float> arr = Arrays.asList(-2.0f, 1.0f, 4.0f);
        for (Float element : arr) {
            assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testOpenOpenAscendingContains_1() {
        // (-5, 5), 3 = -2, 1, 4
        FloatRange range = Ranges.floatRange(-5, BoundType.OPEN, 5, BoundType.OPEN, 3);
        // (-5, 5), 3 = -2, 1, 4
        List<Float> arr = Arrays.asList(-2.0f, 1.0f, 4.0f);
        for (Float element : arr) {
            /*[Transform from] assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));*/
            range.contains(element);
        }
        List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        elementsNotPresent.removeAll(arr);
        for (Float element : elementsNotPresent) {
            assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testContainsSingleStepAscending() {
        // (-2, 2], 1 = -1, 0, 1, 2
        FloatRange ascendingRange = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
        // (-2, 2], 1 = -1, 0, 1, 2
        List<Float> arr = Arrays.asList(-1.0f, 0.0f, 1.0f, 2.0f);
        for (Float element : arr) {
            assertTrue("Expected element [" + element + "] is missing in range [" + ascendingRange + "]", ascendingRange.contains(element));
        }
    }

    @Test
    public void testContainsSingleStepAscending_1() {
        // (-2, 2], 1 = -1, 0, 1, 2
        FloatRange ascendingRange = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
        // (-2, 2], 1 = -1, 0, 1, 2
        List<Float> arr = Arrays.asList(-1.0f, 0.0f, 1.0f, 2.0f);
        for (Float element : arr) {
            /*[Transform from] assertTrue("Expected element [" + element + "] is missing in range [" + ascendingRange + "]", ascendingRange.contains(element));*/
            ascendingRange.contains(element);
        }
        List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        elementsNotPresent.removeAll(arr);
        for (Float element : elementsNotPresent) {
            assertFalse("Unexpected element [" + element + "] is present in range [" + ascendingRange + "]", ascendingRange.contains(element));
        }
    }

    @Test
    public void testClosedClosedDescendingContains() {
        // [5, -5], -3 = 5, 2, -1, -4
        FloatRange range = Ranges.floatRange(5, BoundType.CLOSED, -5, BoundType.CLOSED, -3);
        // [5, -5], -3 = 5, 2, -1, -4
        List<Float> arr = Arrays.asList(5.0f, 2.0f, -1.0f, -4.0f);
        for (Float element : arr) {
            assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testClosedClosedDescendingContains_1() {
        // [5, -5], -3 = 5, 2, -1, -4
        FloatRange range = Ranges.floatRange(5, BoundType.CLOSED, -5, BoundType.CLOSED, -3);
        // [5, -5], -3 = 5, 2, -1, -4
        List<Float> arr = Arrays.asList(5.0f, 2.0f, -1.0f, -4.0f);
        for (Float element : arr) {
            /*[Transform from] assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));*/
            range.contains(element);
        }
        List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        elementsNotPresent.removeAll(arr);
        for (Float element : elementsNotPresent) {
            assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testOpenClosedDescendingContains() {
        // (5, -5], -3 = 2, -1, -4
        FloatRange range = Ranges.floatRange(5, BoundType.OPEN, -5, BoundType.CLOSED, -3);
        // (5, -5], -3 = 2, -1, -4
        List<Float> arr = Arrays.asList(2.0f, -1.0f, -4.0f);
        for (Float element : arr) {
            assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testOpenClosedDescendingContains_1() {
        // (5, -5], -3 = 2, -1, -4
        FloatRange range = Ranges.floatRange(5, BoundType.OPEN, -5, BoundType.CLOSED, -3);
        // (5, -5], -3 = 2, -1, -4
        List<Float> arr = Arrays.asList(2.0f, -1.0f, -4.0f);
        for (Float element : arr) {
            /*[Transform from] assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));*/
            range.contains(element);
        }
        List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        elementsNotPresent.removeAll(arr);
        for (Float element : elementsNotPresent) {
            assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testClosedOpenDescendingContains() {
        // [5, -5), -3 = 5, 2, -1, -4
        FloatRange range = Ranges.floatRange(5, BoundType.CLOSED, -5, BoundType.OPEN, -3);
        // [5, -5), -3 = 5, 2, -1, -4
        List<Float> arr = Arrays.asList(5.0f, 2.0f, -1.0f, -4.0f);
        for (Float element : arr) {
            assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testClosedOpenDescendingContains_1() {
        // [5, -5), -3 = 5, 2, -1, -4
        FloatRange range = Ranges.floatRange(5, BoundType.CLOSED, -5, BoundType.OPEN, -3);
        // [5, -5), -3 = 5, 2, -1, -4
        List<Float> arr = Arrays.asList(5.0f, 2.0f, -1.0f, -4.0f);
        for (Float element : arr) {
            /*[Transform from] assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));*/
            range.contains(element);
        }
        List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        elementsNotPresent.removeAll(arr);
        for (Float element : elementsNotPresent) {
            assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testOpenOpenDescendingContains() {
        // (5, -5), -3 = 2, -1, -4
        FloatRange range = Ranges.floatRange(5, BoundType.OPEN, -5, BoundType.OPEN, -3);
        // (5, -5), -3 = 2, -1, -4
        List<Float> arr = Arrays.asList(2.0f, -1.0f, -4.0f);
        for (Float element : arr) {
            assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testOpenOpenDescendingContains_1() {
        // (5, -5), -3 = 2, -1, -4
        FloatRange range = Ranges.floatRange(5, BoundType.OPEN, -5, BoundType.OPEN, -3);
        // (5, -5), -3 = 2, -1, -4
        List<Float> arr = Arrays.asList(2.0f, -1.0f, -4.0f);
        for (Float element : arr) {
            /*[Transform from] assertTrue("Expected element [" + element + "] is missing in range [" + range + "]", range.contains(element));*/
            range.contains(element);
        }
        List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        elementsNotPresent.removeAll(arr);
        for (Float element : elementsNotPresent) {
            assertFalse("Unexpected element [" + element + "] is present in range [" + range + "]", range.contains(element));
        }
    }

    @Test
    public void testContainsSingleStepDescending() {
        // [2, -2), -1 = 2, 1, 0, -1
        FloatRange descendingRange = Ranges.floatRange(2, BoundType.CLOSED, -2, BoundType.OPEN, -1);
        // [2, -2), -1 = 2, 1, 0, -1
        List<Float> arr = Arrays.asList(2.0f, 1.0f, 0.0f, -1.0f);
        for (Float element : arr) {
            assertTrue("Expected element [" + element + "] is missing in range [" + descendingRange + "]", descendingRange.contains(element));
        }
    }

    @Test
    public void testContainsSingleStepDescending_1() {
        // [2, -2), -1 = 2, 1, 0, -1
        FloatRange descendingRange = Ranges.floatRange(2, BoundType.CLOSED, -2, BoundType.OPEN, -1);
        // [2, -2), -1 = 2, 1, 0, -1
        List<Float> arr = Arrays.asList(2.0f, 1.0f, 0.0f, -1.0f);
        for (Float element : arr) {
            /*[Transform from] assertTrue("Expected element [" + element + "] is missing in range [" + descendingRange + "]", descendingRange.contains(element));*/
            descendingRange.contains(element);
        }
        List<Float> elementsNotPresent = new ArrayList<Float>(fullRange);
        elementsNotPresent.removeAll(arr);
        for (Float element : elementsNotPresent) {
            assertFalse("Unexpected element [" + element + "] is present in range [" + descendingRange + "]", descendingRange.contains(element));
        }
    }

    @Test
    public void testContainsNullOrEmpty() {
        FloatRange range = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
        assertFalse(range.contains(null));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testContainsAll() {
        // (-2, 2], 1 = -1, 0, 1, 2
        FloatRange range = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
        List<Float> list = Arrays.asList(-1.0f, 0.0f, 1.0f, 2.0f);
        assertTrue("Range [" + range + "] was expected to contain all elements from list [" + list + "]", range.containsAll(list));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testContainsAll_1() {
        // (-2, 2], 1 = -1, 0, 1, 2
        FloatRange range = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
        List<Float> list = Arrays.asList(-1.0f, 0.0f, 1.0f, 2.0f);
        /*[Transform from] assertTrue("Range [" + range + "] was expected to contain all elements from list [" + list + "]", range.containsAll(list));*/
        range.containsAll(list);
        List<Float> listWithExtraElements = Arrays.asList(2.0f, -1.0f, 0.0f, 1.0f, 2.0f, 3.0f);
        assertFalse("Range [" + range + "] has more elements than expected", range.containsAll(listWithExtraElements));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testContainsAll_2() {
        // (-2, 2], 1 = -1, 0, 1, 2
        FloatRange range = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
        List<Float> list = Arrays.asList(-1.0f, 0.0f, 1.0f, 2.0f);
        /*[Transform from] assertTrue("Range [" + range + "] was expected to contain all elements from list [" + list + "]", range.containsAll(list));*/
        range.containsAll(list);
        List<Float> listWithExtraElements = Arrays.asList(2.0f, -1.0f, 0.0f, 1.0f, 2.0f, 3.0f);
        /*[Transform from] assertFalse("Range [" + range + "] has more elements than expected", range.containsAll(listWithExtraElements));*/
        range.containsAll(listWithExtraElements);
        assertFalse(range.containsAll(null));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testContainsAll_3() {
        // (-2, 2], 1 = -1, 0, 1, 2
        FloatRange range = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
        List<Float> list = Arrays.asList(-1.0f, 0.0f, 1.0f, 2.0f);
        /*[Transform from] assertTrue("Range [" + range + "] was expected to contain all elements from list [" + list + "]", range.containsAll(list));*/
        range.containsAll(list);
        List<Float> listWithExtraElements = Arrays.asList(2.0f, -1.0f, 0.0f, 1.0f, 2.0f, 3.0f);
        /*[Transform from] assertFalse("Range [" + range + "] has more elements than expected", range.containsAll(listWithExtraElements));*/
        range.containsAll(listWithExtraElements);
        /*[Transform from] assertFalse(range.containsAll(null));*/
        range.containsAll(null);
        assertFalse(range.containsAll(Collections.EMPTY_LIST));
    }

    @Test
    public void testEquals() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        assertEquals("equals must be reflexive", range, range);
    }

    @Test
    public void testEquals_1() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());
    }

    @Test
    public void testEquals_2() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());*/
        {
            range.hashCode();
            range.hashCode();
        }
        // should be able to compare to null
        assertTrue(!range.equals(null));
    }

    @Test
    public void testEquals_3() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());*/
        {
            range.hashCode();
            range.hashCode();
        }
        /*[Transform from] assertTrue(!range.equals(null));[NONE Params]*/
        ;
        Object range2 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        if (range.equals(range2)) {
            assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());
            assertEquals("equals must be symmetric", range2, range);
        } else {
            assertTrue("equals must be symmetric", !range2.equals(range));
        }
    }

    @Test
    public void testEquals_4() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());*/
        {
            range.hashCode();
            range.hashCode();
        }
        /*[Transform from] assertTrue(!range.equals(null));[NONE Params]*/
        ;
        Object range2 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        if (range.equals(range2)) {
            /*[Transform from] assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());*/
            {
                range.hashCode();
                range2.hashCode();
            }
            /*[Transform from] assertEquals("equals must be symmetric", range2, range);[NONE Params]*/
            ;
        } else {
            /*[Transform from] assertTrue("equals must be symmetric", !range2.equals(range));[NONE Params]*/
            ;
        }
        // Changing attributes
        Object range3 = Ranges.floatRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        assertFalse("Invalid equals after changing attributes", range.equals(range3));
    }

    @Test
    public void testEquals_5() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());*/
        {
            range.hashCode();
            range.hashCode();
        }
        /*[Transform from] assertTrue(!range.equals(null));[NONE Params]*/
        ;
        Object range2 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        if (range.equals(range2)) {
            /*[Transform from] assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());*/
            {
                range.hashCode();
                range2.hashCode();
            }
            /*[Transform from] assertEquals("equals must be symmetric", range2, range);[NONE Params]*/
            ;
        } else {
            /*[Transform from] assertTrue("equals must be symmetric", !range2.equals(range));[NONE Params]*/
            ;
        }
        // Changing attributes
        Object range3 = Ranges.floatRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range3));*/
        range.equals(range3);
        Object range4 = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
        assertFalse("Invalid equals after changing attributes", range.equals(range4));
    }

    @Test
    public void testEquals_6() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());*/
        {
            range.hashCode();
            range.hashCode();
        }
        /*[Transform from] assertTrue(!range.equals(null));[NONE Params]*/
        ;
        Object range2 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        if (range.equals(range2)) {
            /*[Transform from] assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());*/
            {
                range.hashCode();
                range2.hashCode();
            }
            /*[Transform from] assertEquals("equals must be symmetric", range2, range);[NONE Params]*/
            ;
        } else {
            /*[Transform from] assertTrue("equals must be symmetric", !range2.equals(range));[NONE Params]*/
            ;
        }
        // Changing attributes
        Object range3 = Ranges.floatRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range3));*/
        range.equals(range3);
        Object range4 = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range4));*/
        range.equals(range4);
        Object range5 = Ranges.floatRange(-2, BoundType.CLOSED, 1, BoundType.OPEN, 1);
        assertFalse("Invalid equals after changing attributes", range.equals(range5));
    }

    @Test
    public void testEquals_7() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());*/
        {
            range.hashCode();
            range.hashCode();
        }
        /*[Transform from] assertTrue(!range.equals(null));[NONE Params]*/
        ;
        Object range2 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        if (range.equals(range2)) {
            /*[Transform from] assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());*/
            {
                range.hashCode();
                range2.hashCode();
            }
            /*[Transform from] assertEquals("equals must be symmetric", range2, range);[NONE Params]*/
            ;
        } else {
            /*[Transform from] assertTrue("equals must be symmetric", !range2.equals(range));[NONE Params]*/
            ;
        }
        // Changing attributes
        Object range3 = Ranges.floatRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range3));*/
        range.equals(range3);
        Object range4 = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range4));*/
        range.equals(range4);
        Object range5 = Ranges.floatRange(-2, BoundType.CLOSED, 1, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range5));*/
        range.equals(range5);
        Object range6 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.CLOSED, 1);
        assertFalse("Invalid equals after changing attributes", range.equals(range6));
    }

    @Test
    public void testEquals_8() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());*/
        {
            range.hashCode();
            range.hashCode();
        }
        /*[Transform from] assertTrue(!range.equals(null));[NONE Params]*/
        ;
        Object range2 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        if (range.equals(range2)) {
            /*[Transform from] assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());*/
            {
                range.hashCode();
                range2.hashCode();
            }
            /*[Transform from] assertEquals("equals must be symmetric", range2, range);[NONE Params]*/
            ;
        } else {
            /*[Transform from] assertTrue("equals must be symmetric", !range2.equals(range));[NONE Params]*/
            ;
        }
        // Changing attributes
        Object range3 = Ranges.floatRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range3));*/
        range.equals(range3);
        Object range4 = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range4));*/
        range.equals(range4);
        Object range5 = Ranges.floatRange(-2, BoundType.CLOSED, 1, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range5));*/
        range.equals(range5);
        Object range6 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range6));*/
        range.equals(range6);
        Object range7 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 2);
        assertFalse("Invalid equals after changing attributes", range.equals(range7));
    }

    @Test
    public void testEquals_9() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());*/
        {
            range.hashCode();
            range.hashCode();
        }
        /*[Transform from] assertTrue(!range.equals(null));[NONE Params]*/
        ;
        Object range2 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        if (range.equals(range2)) {
            /*[Transform from] assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());*/
            {
                range.hashCode();
                range2.hashCode();
            }
            /*[Transform from] assertEquals("equals must be symmetric", range2, range);[NONE Params]*/
            ;
        } else {
            /*[Transform from] assertTrue("equals must be symmetric", !range2.equals(range));[NONE Params]*/
            ;
        }
        // Changing attributes
        Object range3 = Ranges.floatRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range3));*/
        range.equals(range3);
        Object range4 = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range4));*/
        range.equals(range4);
        Object range5 = Ranges.floatRange(-2, BoundType.CLOSED, 1, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range5));*/
        range.equals(range5);
        Object range6 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range6));*/
        range.equals(range6);
        Object range7 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 2);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range7));*/
        range.equals(range7);
        // Using different constructors
        FloatRange range8 = Ranges.floatRange(Long.valueOf(-2), Long.valueOf(2), Long.valueOf(1));
        assertEquals("Invalid equals using different constructor", range, range8);
    }

    @Test
    public void testEquals_10() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());*/
        {
            range.hashCode();
            range.hashCode();
        }
        /*[Transform from] assertTrue(!range.equals(null));[NONE Params]*/
        ;
        Object range2 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        if (range.equals(range2)) {
            /*[Transform from] assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());*/
            {
                range.hashCode();
                range2.hashCode();
            }
            /*[Transform from] assertEquals("equals must be symmetric", range2, range);[NONE Params]*/
            ;
        } else {
            /*[Transform from] assertTrue("equals must be symmetric", !range2.equals(range));[NONE Params]*/
            ;
        }
        // Changing attributes
        Object range3 = Ranges.floatRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range3));*/
        range.equals(range3);
        Object range4 = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range4));*/
        range.equals(range4);
        Object range5 = Ranges.floatRange(-2, BoundType.CLOSED, 1, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range5));*/
        range.equals(range5);
        Object range6 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range6));*/
        range.equals(range6);
        Object range7 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 2);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range7));*/
        range.equals(range7);
        // Using different constructors
        FloatRange range8 = Ranges.floatRange(Long.valueOf(-2), Long.valueOf(2), Long.valueOf(1));
        /*[Transform from] assertEquals("Invalid equals using different constructor", range, range8);[NONE Params]*/
        ;
        FloatRange range9 = Ranges.floatRange(Long.valueOf(-2), Long.valueOf(2));
        assertEquals("Invalid equals using different constructor", range, range9);
    }

    @Test
    public void testEquals_11() throws Exception {
        // equals basic properties
        FloatRange range = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertEquals("equals must be reflexive", range, range);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", range.hashCode(), range.hashCode());*/
        {
            range.hashCode();
            range.hashCode();
        }
        /*[Transform from] assertTrue(!range.equals(null));[NONE Params]*/
        ;
        Object range2 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        if (range.equals(range2)) {
            /*[Transform from] assertEquals("equals implies hash equals", range.hashCode(), range2.hashCode());*/
            {
                range.hashCode();
                range2.hashCode();
            }
            /*[Transform from] assertEquals("equals must be symmetric", range2, range);[NONE Params]*/
            ;
        } else {
            /*[Transform from] assertTrue("equals must be symmetric", !range2.equals(range));[NONE Params]*/
            ;
        }
        // Changing attributes
        Object range3 = Ranges.floatRange(-1, BoundType.CLOSED, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range3));*/
        range.equals(range3);
        Object range4 = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range4));*/
        range.equals(range4);
        Object range5 = Ranges.floatRange(-2, BoundType.CLOSED, 1, BoundType.OPEN, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range5));*/
        range.equals(range5);
        Object range6 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.CLOSED, 1);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range6));*/
        range.equals(range6);
        Object range7 = Ranges.floatRange(-2, BoundType.CLOSED, 2, BoundType.OPEN, 2);
        /*[Transform from] assertFalse("Invalid equals after changing attributes", range.equals(range7));*/
        range.equals(range7);
        // Using different constructors
        FloatRange range8 = Ranges.floatRange(Long.valueOf(-2), Long.valueOf(2), Long.valueOf(1));
        /*[Transform from] assertEquals("Invalid equals using different constructor", range, range8);[NONE Params]*/
        ;
        FloatRange range9 = Ranges.floatRange(Long.valueOf(-2), Long.valueOf(2));
        /*[Transform from] assertEquals("Invalid equals using different constructor", range, range9);[NONE Params]*/
        ;
        Endpoint<Float> leftEndpoint = new Endpoint<Float>(-2.0f, BoundType.CLOSED);
        Endpoint<Float> rightEndpoint = new Endpoint<Float>(2.0f, BoundType.OPEN);
        FloatRange range10 = Ranges.floatRange(leftEndpoint, rightEndpoint, 1.0f);
        assertEquals("Invalid equals using different constructor", range, range10);
    }

    @Test
    public void testToString() {
        FloatRange range = Ranges.floatRange(-2, BoundType.OPEN, 2, BoundType.CLOSED, 1);
        assertEquals("Wrong string value", "FloatRange<(-2.0, 2.0], 1.0>", range.toString());
    }

    @Test
    public void testConstructorUsingSameEndpoint() {
        Endpoint<Float> uniqueEndpoint = new Endpoint<Float>(10.0f, BoundType.CLOSED);
        try {
            Ranges.floatRange(uniqueEndpoint, uniqueEndpoint, 1.0f);
        } catch (IllegalArgumentException e) {
            fail("Not expected to get here");
        }
    }

    @Test
    public void testInvalidRange() {
        try {
            Ranges.floatRange(10.0f, BoundType.OPEN, -5.0f, BoundType.CLOSED, 10.0f);
            fail("Not expected to get here");
        } catch (IllegalArgumentException e) {
        // Do nothing
        }
    }

    @Test
    public void testInvalidRange_1() {
        try {
            Ranges.floatRange(10.0f, BoundType.OPEN, -5.0f, BoundType.CLOSED, 10.0f);
            /*[Transform from] fail("Not expected to get here");[NONE Params]*/
            ;
        } catch (IllegalArgumentException e) {
        // Do nothing
        }
        Endpoint<Float> leftEndpoint = new Endpoint<Float>(10.0f, BoundType.CLOSED);
        Endpoint<Float> rightEndpoint = new Endpoint<Float>(-5.0f, BoundType.OPEN);
        try {
            Ranges.floatRange(leftEndpoint, rightEndpoint, 1.0f);
            fail("Not expected to get here");
        } catch (IllegalArgumentException e) {
        // Do nothing
        }
    }

    @Test
    public void testDefaultStep() {
        assertEquals("Invalid default step", Float.valueOf(-1.0f), FloatRange.DEFAULT_STEP.evaluate(10.0f, 1.0f));
    }

    @Test
    public void testDefaultStep_1() {
        /*[Transform from] assertEquals("Invalid default step", Float.valueOf(-1.0f), FloatRange.DEFAULT_STEP.evaluate(10.0f, 1.0f));*/
        {
            Float.valueOf(-1.0f);
            FloatRange.DEFAULT_STEP.evaluate(10.0f, 1.0f);
        }
        assertEquals("Invalid default step", Float.valueOf(1.0f), FloatRange.DEFAULT_STEP.evaluate(1.0f, 10.0f));
    }
}

