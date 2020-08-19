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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.collection.IsEmpty;
import org.apache.commons.functor.core.comparator.IsGreaterThanOrEqual;
import org.apache.commons.functor.core.comparator.IsLessThan;
import org.apache.commons.functor.core.composite.ConditionalFunction;
import org.apache.commons.functor.generator.FilteredGenerator;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;
import org.junit.Test;

/*
 * ----------------------------------------------------------------------------
 * INTRODUCTION:
 * ----------------------------------------------------------------------------
 */

/*
 * Here's an example of the Quicksort sorting algorithm, implemented using
 * Commons Functor.
 *
 * See http://commons.apache.org/sandbox/functor/examples.html
 * for additional examples.
 */

/**
 * An example of implementing the quicksort sorting algorithm
 * using commons-functor.
 * <p>
 * See the extensive in line comments for details.
 *
 * @version $Revision$ $Date$
 */
@SuppressWarnings("unchecked")
public class QuicksortExample {

/*
 * ----------------------------------------------------------------------------
 * UNIT TESTS:
 * ----------------------------------------------------------------------------
 */

/*
 * In "test first" style, let's start with the some functional descriptions
 * of what'd we'd like our Quicksort to do, expressed as unit tests.
 *
 * In our tests, we'll use a "quicksort" method which takes a List and
 * returns a (new) sorted List.  We'll define that method a bit later.
 *
 *
 * First, let's get some trivial cases out of the way.
 *
 * Sorting an empty List should produce an empty list:
 */

    @Test
    public void testSortEmpty() {
        List<Object> empty = Collections.EMPTY_LIST;
        List<?> result = quicksort(empty);
        assertTrue("Sorting an empty list should produce an empty list.", result.isEmpty());
    }

/*
 * Similarly, sorting a List composed of a single element
 * should produce an equivalent list:
 */

    @Test
    public void testSortSingleElementList() {
        List<Object> list = new ArrayList<Object>();
        list.add("element");

        List<?> sorted = quicksort(list);

        assertTrue(
            "The quicksort() method should return a distinct list.",
            list != sorted);

        assertEquals(
            "Sorting a single-element list should produce an equivalent list",
            list,
            sorted);
    }

/*
 * Finally, sorting a List composed of multiple copies
 * of a single value should produce an equivalent list:
 */

    @Test
    public void testSortSingleValueList() {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < 10; i++) {
            list.add("element");
        }
        List<?> sorted = quicksort(list);

        assertTrue(
            "The quicksort() method should return a distinct list.",
            list != sorted);

        assertEquals(list, sorted);
    }

/*
 * So far so good.
 *
 * Next, let's take some slightly more complicated cases.
 *
 * Sorting an already sorted list:
 */
    @Test
    public void testSortSorted() {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.valueOf(i));
        }

        List<?> sorted = quicksort(list);

        assertTrue(
            "The quicksort() method should return a distinct list.",
            list != sorted);

        assertEquals(
            "Sorting an already sorted list should produce an equivalent list",
            list,
            sorted);
    }

/*
 * Sorting a reverse-order list (finally, a test case that requires something
 * more than an identity function):
 */
    @Test
    public void testSortReversed() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> tosort = new ArrayList<Object>();
        for (int i = 0; i < 10; i++) {
            /*
             * The "expected" list contains the integers in order.
             */
            expected.add(Integer.valueOf(i));
            /*
             * The "tosort" list contains the integers in reverse order.
             */
            tosort.add(Integer.valueOf(9 - i));
        }

        assertEquals(expected, quicksort(tosort));
    }

/*
 * Just for fun, let's add some randomness to the tests, first by shuffling:
 */
    @Test
    public void testSortShuffled() {
        List<Object> expected = new ArrayList<Object>();
        for (int i = 0; i < 10; i++) {
            expected.add(Integer.valueOf(i));
        }
        List<Object> tosort = new ArrayList<Object>(expected);
        Collections.shuffle(tosort);

        assertEquals(expected, quicksort(tosort));
    }

/*
 * and then using random values:
 */
    @Test
    public void testSortRandom() {
        Random random = new Random();
        /*
         * populate a list with random integers
         */
        List<Integer> tosort = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            tosort.add(Integer.valueOf(random.nextInt(10)));
        }
        /*
         * and use java.util.Collections.sort to
         * give us a sorted version to compare to
         */
        List<Integer> expected = new ArrayList<Integer>(tosort);
        Collections.sort(expected);

        assertEquals(expected, quicksort(tosort));
    }

/*
 * Finally, while this quicksort implementation is intended to
 * illustrate the use of Commons Functor, not for performance,
 * let's output some timings just to demonstrate that the
 * performance is adequate.
 */

    private static final int SIZE = 1000;
    private static final int COUNT = 100;

    @Test
    public void testTimings() {
        /*
         * We'll need the total elapsed time:
         */
        @SuppressWarnings("unused")
        long elapsed = 0L;

        /*
         * and a source for random integers:
         */
        Random random = new Random();

        /*
         * Repeat this COUNT times:
         */
        for (int i = 0; i < COUNT; i++) {
            /*
             * Create a List of size SIZE, and
             * populate it with random integers:
             */
            List<Object> tosort = new ArrayList<Object>(SIZE);
            for (int j = 0; j < SIZE; j++) {
                tosort.add(Integer.valueOf(random.nextInt(SIZE)));
            }

            /*
             * Start the timer.
             */
            long start = System.currentTimeMillis();

            /*
             * Sort the list.
             * (We'll ignore the returned value here.)
             */
            quicksort(tosort);

            /*
             * Stop the timer.
             */
            long stop = System.currentTimeMillis();

            /*
             * Add the elapsed time to our total.
             */
            elapsed += stop - start;
        }

        /*
         * Whew, that was a lot of processing.  Now figure out
         * how long it took on average (per list)
         * and print a simply summary:
         */

        /*
        double avgmillis = ((double) elapsed) / ((double) COUNT);

        System.out.println();
        System.out.println(
            "Quicksort Example: Sorted "
                + COUNT
                + " lists of "
                + SIZE
                + " elements in "
                + elapsed
                + " millis ("
                + avgmillis
                + " millis, or "
                + (avgmillis / 1000D)
                + " seconds on average).");
        System.out.println();
        */
    }


/*
 * THE QUICKSORT ALGORITHM:
 * ----------------------------------------------------------------------------
 */

/*
 * Our quicksort method will invoke a Function named
 * quicksort:
 */

    public List<?> quicksort(List<?> list) {
        return (List<?>)(quicksort.evaluate(list));
    }

/*
 * The quicksort sorting algorithm can be summarized as follows:
 *
 * Given a list of elements to be sorted:
 *
 * A) If the list is empty, consider it already sorted.
 *
 * B) If the list is non-empty, we can sort it by first splitting it into
 *   three lists:
 *     1) one list containing only the first element in the list (the "head")
 *     2) one (possibly empty) list containing every element in the remaining
 *        list that is less than the head
 *     3) one (possibly empty) list containing every element in the remaining
 *        list that is greater than or equal to the head
 *    applying the quicksort algorithm recursively to the second and third lists,
 *    and joining the results back together as (2) + (1) + (3).
 */

/*
 * Using a functional style (or at least a semi-functional style), it's easy
 * to transalate this description directly into code:
 */

    private Function<Object, Object> quicksort = new ConditionalFunction<Object, Object>(
        /* if the list is empty... */
        IsEmpty.instance(),
        /* ...then return an empty list... */
        new Constant<Object>(Collections.EMPTY_LIST),
        /* ...else, apply the following function... */
        new ListFunction() {
            @Override
            public Object evaluate(List<?> list) {
                /* Create a list to contain the results. */
                List<Object> result = new ArrayList<Object>(list.size());
                /*
                 * Recursively apply quicksort the the elements in the
                 * tail less than the head, adding the result to the
                 * sorted list we're generating.
                 */
                result.addAll(
                    (List<?>) quicksort.evaluate(
                        lesserTail.evaluate(
                            head.evaluate(list),
                            tail.evaluate(list))));
                /*
                 * Add the head to the sorted list we're generating.
                 */
                result.add(head.evaluate(list));
                /*
                 * Recursively apply quicksort the the elements in the
                 * tail greater than the head, adding the result to the
                 * sorted list we're generating.
                 */
                result.addAll(
                    (List<?>) quicksort.evaluate(
                        greaterTail.evaluate(
                            head.evaluate(list),
                            tail.evaluate(list))));
                /*
                 * And return the generated list.
                 */
                return result;
            }
    });

/*
 * Now let's look at the building blocks we need to flesh out that
 * function.
 *
 * First, let's save ourselves some casting and error handling by
 * definining some functor sub-types.
 *
 * Let ListFunction be a Function that operates on Lists:
 */

    public abstract class ListFunction implements Function<Object, Object> {
        public abstract Object evaluate(List<?> list);

        public Object evaluate(Object obj) {
            if (obj instanceof List) {
                return evaluate((List<?>) obj);
            } else if (null == obj) {
                throw new NullPointerException("The argument must not be null.");
            } else {
                throw new ClassCastException(
                    "The argument must be a List, found " +
                    obj.getClass().getName());
            }
        }
    }

/*
 * Let ObjectListFunction be a BinaryFunction that operates on
 * an Object, List pair:
 */

    public abstract class ObjectListFunction implements BinaryFunction<Object, Object, Object> {
        public abstract Object evaluate(Object head, List<?> tail);

        public Object evaluate(Object left, Object right) {
            if (left != null && right instanceof List) {
                return evaluate(left, (List<?>) right);
            } else if (null == left) {
                throw new NullPointerException("The left argument must not be null.");
            } else if (null == right) {
                throw new NullPointerException("The right argument must not be null.");
            } else {
                throw new ClassCastException(
                    "The right argument must be a List, found " +
                    right.getClass().getName());
            }
        }
    }

/*
 * Now for the implementations.
 *
 * Given a List, we need to be able to break it into its head:
 */

    private Function<Object, Object> head = new ListFunction() {
        @Override
        public Object evaluate(List<?> list) {
            return list.get(0);
        }
    };

/*
 * and its tail:
 */
    private Function<Object, Object> tail = new ListFunction() {
        @Override
        public Object evaluate(List<?> list) {
            return list.size() < 2 ?
                Collections.EMPTY_LIST :
                list.subList(1, list.size());
        }
    };

/*
 * Given a List in head/tail form, we should be able to find
 * the list of elements in the tail less than the head.
 * We can simply apply the select algorithm here, using
 * a predicate identifying elements less than the head.
 */
    @SuppressWarnings("rawtypes")
    private BinaryFunction<Object, Object, Object> lesserTail = new ObjectListFunction() {
        @Override
        public Object evaluate(Object head, List<?> tail) {
            return new FilteredGenerator(
                    IteratorToGeneratorAdapter.adapt(tail.iterator()),
                    IsLessThan.instance((Comparable<?>) head)).toCollection();
        }
    };

/*
 * We must also be able to find the List of elements in
 * the tail greater than (or equal to) the head. This
 * is similar to the lesserTail approach.
 */
    @SuppressWarnings("rawtypes")
    private BinaryFunction greaterTail = new ObjectListFunction() {
        @Override
        public Object evaluate(Object head, List<?> tail) {
            return new FilteredGenerator(
                    IteratorToGeneratorAdapter.adapt(tail.iterator()),
                 IsGreaterThanOrEqual.instance((Comparable<?>) head)).toCollection();
        }
    };

/*
 * Note that each of these smaller functors is readily testable
 * in isolation:
 */

    public void testHeadFunction() {
        List<String> list = new ArrayList<String>();
        try {
            head.evaluate(list);
            fail("Expected IndexOutOfBoundsException when evaluating head of an empty list");
        } catch(IndexOutOfBoundsException e) {
            // expected
        }

        list.add("First");
        assertEquals("First",head.evaluate(list));

        list.add("Second");
        assertEquals("First",head.evaluate(list));

    }

    public void testTailFunction() {
        List<String> list = new ArrayList<String>();
        {
            List<String> result = (List<String>)(tail.evaluate(list));
            assertTrue("Tail of an empty list is empty.",result.isEmpty());
        }
        list.add("First");
        {
            List<String> result = (List<String>)(tail.evaluate(list));
            assertTrue("Tail of a one element list is empty.",result.isEmpty());
        }
        list.add("Second");
        {
            List<String> result = (List<String>)(tail.evaluate(list));
            assertEquals("Tail of a two element list has one element.",1,result.size());
            assertEquals("Second",result.get(0));
        }
        list.add("Third");
        {
            List<String> result = (List<String>)(tail.evaluate(list));
            assertEquals("Tail of a three element list has two elements.",2,result.size());
            assertEquals("Second",result.get(0));
            assertEquals("Third",result.get(1));
        }
    }

    public void testLesserTail() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<10;i++) {
            list.add(Integer.valueOf(i));
        }
        for (int i=0;i<10;i++) {
            Integer val = Integer.valueOf(i);
            List<Integer> lesser = (List<Integer>) lesserTail.evaluate(val,list);
            assertEquals(i,lesser.size());
            for (int j=0;j<i;j++) {
                assertEquals(Integer.valueOf(j),lesser.get(j));
            }
        }
    }

    public void testGreaterTail() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<10;i++) {
            list.add(Integer.valueOf(i));
        }
        for (int i=0;i<10;i++) {
            Integer val = Integer.valueOf(i);
            List<Integer> greater = (List<Integer>) greaterTail.evaluate(val,list);
            assertEquals(10-i,greater.size());
            for (int j=i;j<10;j++) {
                assertEquals(Integer.valueOf(j),greater.get(j-i));
            }
        }
    }
}
