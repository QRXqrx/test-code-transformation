/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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
public class QuicksortExample {public static class __CLR4_4_17a77a7kcq4sv88{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,9609,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    public void testSortEmpty() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9439);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9440);List<Object> empty = Collections.EMPTY_LIST;
        __CLR4_4_17a77a7kcq4sv88.R.inc(9441);List<?> result = quicksort(empty);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9442);assertTrue("Sorting an empty list should produce an empty list.", result.isEmpty());
    }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

/*
 * Similarly, sorting a List composed of a single element
 * should produce an equivalent list:
 */

    @Test
    public void testSortSingleElementList() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9443);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9444);List<Object> list = new ArrayList<Object>();
        __CLR4_4_17a77a7kcq4sv88.R.inc(9445);list.add("element");

        __CLR4_4_17a77a7kcq4sv88.R.inc(9446);List<?> sorted = quicksort(list);

        __CLR4_4_17a77a7kcq4sv88.R.inc(9447);assertTrue(
            "The quicksort() method should return a distinct list.",
            list != sorted);

        __CLR4_4_17a77a7kcq4sv88.R.inc(9448);assertEquals(
            "Sorting a single-element list should produce an equivalent list",
            list,
            sorted);
    }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

/*
 * Finally, sorting a List composed of multiple copies
 * of a single value should produce an equivalent list:
 */

    @Test
    public void testSortSingleValueList() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9449);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9450);List<Object> list = new ArrayList<Object>();
        __CLR4_4_17a77a7kcq4sv88.R.inc(9451);for (int i = 0; (((i < 10)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9452)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9453)==0&false)); i++) {{
            __CLR4_4_17a77a7kcq4sv88.R.inc(9454);list.add("element");
        }
        }__CLR4_4_17a77a7kcq4sv88.R.inc(9455);List<?> sorted = quicksort(list);

        __CLR4_4_17a77a7kcq4sv88.R.inc(9456);assertTrue(
            "The quicksort() method should return a distinct list.",
            list != sorted);

        __CLR4_4_17a77a7kcq4sv88.R.inc(9457);assertEquals(list, sorted);
    }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

/*
 * So far so good.
 *
 * Next, let's take some slightly more complicated cases.
 *
 * Sorting an already sorted list:
 */
    @Test
    public void testSortSorted() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9458);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9459);List<Object> list = new ArrayList<Object>();
        __CLR4_4_17a77a7kcq4sv88.R.inc(9460);for (int i = 0; (((i < 10)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9461)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9462)==0&false)); i++) {{
            __CLR4_4_17a77a7kcq4sv88.R.inc(9463);list.add(Integer.valueOf(i));
        }

        }__CLR4_4_17a77a7kcq4sv88.R.inc(9464);List<?> sorted = quicksort(list);

        __CLR4_4_17a77a7kcq4sv88.R.inc(9465);assertTrue(
            "The quicksort() method should return a distinct list.",
            list != sorted);

        __CLR4_4_17a77a7kcq4sv88.R.inc(9466);assertEquals(
            "Sorting an already sorted list should produce an equivalent list",
            list,
            sorted);
    }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

/*
 * Sorting a reverse-order list (finally, a test case that requires something
 * more than an identity function):
 */
    @Test
    public void testSortReversed() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9467);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9468);List<Object> expected = new ArrayList<Object>();
        __CLR4_4_17a77a7kcq4sv88.R.inc(9469);List<Object> tosort = new ArrayList<Object>();
        __CLR4_4_17a77a7kcq4sv88.R.inc(9470);for (int i = 0; (((i < 10)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9471)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9472)==0&false)); i++) {{
            /*
             * The "expected" list contains the integers in order.
             */
            __CLR4_4_17a77a7kcq4sv88.R.inc(9473);expected.add(Integer.valueOf(i));
            /*
             * The "tosort" list contains the integers in reverse order.
             */
            __CLR4_4_17a77a7kcq4sv88.R.inc(9474);tosort.add(Integer.valueOf(9 - i));
        }

        }__CLR4_4_17a77a7kcq4sv88.R.inc(9475);assertEquals(expected, quicksort(tosort));
    }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

/*
 * Just for fun, let's add some randomness to the tests, first by shuffling:
 */
    @Test
    public void testSortShuffled() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9476);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9477);List<Object> expected = new ArrayList<Object>();
        __CLR4_4_17a77a7kcq4sv88.R.inc(9478);for (int i = 0; (((i < 10)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9479)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9480)==0&false)); i++) {{
            __CLR4_4_17a77a7kcq4sv88.R.inc(9481);expected.add(Integer.valueOf(i));
        }
        }__CLR4_4_17a77a7kcq4sv88.R.inc(9482);List<Object> tosort = new ArrayList<Object>(expected);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9483);Collections.shuffle(tosort);

        __CLR4_4_17a77a7kcq4sv88.R.inc(9484);assertEquals(expected, quicksort(tosort));
    }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

/*
 * and then using random values:
 */
    @Test
    public void testSortRandom() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9485);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9486);Random random = new Random();
        /*
         * populate a list with random integers
         */
        __CLR4_4_17a77a7kcq4sv88.R.inc(9487);List<Integer> tosort = new ArrayList<Integer>();
        __CLR4_4_17a77a7kcq4sv88.R.inc(9488);for (int i = 0; (((i < 10)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9489)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9490)==0&false)); i++) {{
            __CLR4_4_17a77a7kcq4sv88.R.inc(9491);tosort.add(Integer.valueOf(random.nextInt(10)));
        }
        /*
         * and use java.util.Collections.sort to
         * give us a sorted version to compare to
         */
        }__CLR4_4_17a77a7kcq4sv88.R.inc(9492);List<Integer> expected = new ArrayList<Integer>(tosort);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9493);Collections.sort(expected);

        __CLR4_4_17a77a7kcq4sv88.R.inc(9494);assertEquals(expected, quicksort(tosort));
    }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

/*
 * Finally, while this quicksort implementation is intended to
 * illustrate the use of Commons Functor, not for performance,
 * let's output some timings just to demonstrate that the
 * performance is adequate.
 */

    private static final int SIZE = 1000;
    private static final int COUNT = 100;

    @Test
    public void testTimings() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9495);
        /*
         * We'll need the total elapsed time:
         */
        __CLR4_4_17a77a7kcq4sv88.R.inc(9496);@SuppressWarnings("unused")
        long elapsed = 0L;

        /*
         * and a source for random integers:
         */
        __CLR4_4_17a77a7kcq4sv88.R.inc(9497);Random random = new Random();

        /*
         * Repeat this COUNT times:
         */
        __CLR4_4_17a77a7kcq4sv88.R.inc(9498);for (int i = 0; (((i < COUNT)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9499)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9500)==0&false)); i++) {{
            /*
             * Create a List of size SIZE, and
             * populate it with random integers:
             */
            __CLR4_4_17a77a7kcq4sv88.R.inc(9501);List<Object> tosort = new ArrayList<Object>(SIZE);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9502);for (int j = 0; (((j < SIZE)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9503)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9504)==0&false)); j++) {{
                __CLR4_4_17a77a7kcq4sv88.R.inc(9505);tosort.add(Integer.valueOf(random.nextInt(SIZE)));
            }

            /*
             * Start the timer.
             */
            }__CLR4_4_17a77a7kcq4sv88.R.inc(9506);long start = System.currentTimeMillis();

            /*
             * Sort the list.
             * (We'll ignore the returned value here.)
             */
            __CLR4_4_17a77a7kcq4sv88.R.inc(9507);quicksort(tosort);

            /*
             * Stop the timer.
             */
            __CLR4_4_17a77a7kcq4sv88.R.inc(9508);long stop = System.currentTimeMillis();

            /*
             * Add the elapsed time to our total.
             */
            __CLR4_4_17a77a7kcq4sv88.R.inc(9509);elapsed += stop - start;
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
    }}finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}


/*
 * THE QUICKSORT ALGORITHM:
 * ----------------------------------------------------------------------------
 */

/*
 * Our quicksort method will invoke a Function named
 * quicksort:
 */

    public List<?> quicksort(List<?> list) {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9510);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9511);return (List<?>)(quicksort.evaluate(list));
    }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

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
            public Object evaluate(List<?> list) {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9512);
                /* Create a list to contain the results. */
                __CLR4_4_17a77a7kcq4sv88.R.inc(9513);List<Object> result = new ArrayList<Object>(list.size());
                /*
                 * Recursively apply quicksort the the elements in the
                 * tail less than the head, adding the result to the
                 * sorted list we're generating.
                 */
                __CLR4_4_17a77a7kcq4sv88.R.inc(9514);result.addAll(
                    (List<?>) quicksort.evaluate(
                        lesserTail.evaluate(
                            head.evaluate(list),
                            tail.evaluate(list))));
                /*
                 * Add the head to the sorted list we're generating.
                 */
                __CLR4_4_17a77a7kcq4sv88.R.inc(9515);result.add(head.evaluate(list));
                /*
                 * Recursively apply quicksort the the elements in the
                 * tail greater than the head, adding the result to the
                 * sorted list we're generating.
                 */
                __CLR4_4_17a77a7kcq4sv88.R.inc(9516);result.addAll(
                    (List<?>) quicksort.evaluate(
                        greaterTail.evaluate(
                            head.evaluate(list),
                            tail.evaluate(list))));
                /*
                 * And return the generated list.
                 */
                __CLR4_4_17a77a7kcq4sv88.R.inc(9517);return result;
            }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}
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

        public Object evaluate(Object obj) {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9518);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9519);if ((((obj instanceof List)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9520)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9521)==0&false))) {{
                __CLR4_4_17a77a7kcq4sv88.R.inc(9522);return evaluate((List<?>) obj);
            } }else {__CLR4_4_17a77a7kcq4sv88.R.inc(9523);if ((((null == obj)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9524)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9525)==0&false))) {{
                __CLR4_4_17a77a7kcq4sv88.R.inc(9526);throw new NullPointerException("The argument must not be null.");
            } }else {{
                __CLR4_4_17a77a7kcq4sv88.R.inc(9527);throw new ClassCastException(
                    "The argument must be a List, found " +
                    obj.getClass().getName());
            }
        }}}finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}
    }

/*
 * Let ObjectListFunction be a BinaryFunction that operates on
 * an Object, List pair:
 */

    public abstract class ObjectListFunction implements BinaryFunction<Object, Object, Object> {
        public abstract Object evaluate(Object head, List<?> tail);

        public Object evaluate(Object left, Object right) {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9528);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9529);if ((((left != null && right instanceof List)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9530)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9531)==0&false))) {{
                __CLR4_4_17a77a7kcq4sv88.R.inc(9532);return evaluate(left, (List<?>) right);
            } }else {__CLR4_4_17a77a7kcq4sv88.R.inc(9533);if ((((null == left)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9534)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9535)==0&false))) {{
                __CLR4_4_17a77a7kcq4sv88.R.inc(9536);throw new NullPointerException("The left argument must not be null.");
            } }else {__CLR4_4_17a77a7kcq4sv88.R.inc(9537);if ((((null == right)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9538)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9539)==0&false))) {{
                __CLR4_4_17a77a7kcq4sv88.R.inc(9540);throw new NullPointerException("The right argument must not be null.");
            } }else {{
                __CLR4_4_17a77a7kcq4sv88.R.inc(9541);throw new ClassCastException(
                    "The right argument must be a List, found " +
                    right.getClass().getName());
            }
        }}}}finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}
    }

/*
 * Now for the implementations.
 *
 * Given a List, we need to be able to break it into its head:
 */

    private Function<Object, Object> head = new ListFunction() {
        @Override
        public Object evaluate(List<?> list) {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9542);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9543);return list.get(0);
        }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}
    };

/*
 * and its tail:
 */
    private Function<Object, Object> tail = new ListFunction() {
        @Override
        public Object evaluate(List<?> list) {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9544);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9545);return (((list.size() < 2 )&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9546)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9547)==0&false))?
                Collections.EMPTY_LIST :
                list.subList(1, list.size());
        }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}
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
        public Object evaluate(Object head, List<?> tail) {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9548);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9549);return new FilteredGenerator(
                    IteratorToGeneratorAdapter.adapt(tail.iterator()),
                    IsLessThan.instance((Comparable<?>) head)).toCollection();
        }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}
    };

/*
 * We must also be able to find the List of elements in
 * the tail greater than (or equal to) the head. This
 * is similar to the lesserTail approach.
 */
    @SuppressWarnings("rawtypes")
    private BinaryFunction greaterTail = new ObjectListFunction() {
        @Override
        public Object evaluate(Object head, List<?> tail) {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9550);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9551);return new FilteredGenerator(
                    IteratorToGeneratorAdapter.adapt(tail.iterator()),
                 IsGreaterThanOrEqual.instance((Comparable<?>) head)).toCollection();
        }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}
    };

/*
 * Note that each of these smaller functors is readily testable
 * in isolation:
 */

    public void testHeadFunction() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9552);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9553);List<String> list = new ArrayList<String>();
        __CLR4_4_17a77a7kcq4sv88.R.inc(9554);try {
            __CLR4_4_17a77a7kcq4sv88.R.inc(9555);head.evaluate(list);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9556);fail("Expected IndexOutOfBoundsException when evaluating head of an empty list");
        } catch(IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_4_17a77a7kcq4sv88.R.inc(9557);list.add("First");
        __CLR4_4_17a77a7kcq4sv88.R.inc(9558);assertEquals("First",head.evaluate(list));

        __CLR4_4_17a77a7kcq4sv88.R.inc(9559);list.add("Second");
        __CLR4_4_17a77a7kcq4sv88.R.inc(9560);assertEquals("First",head.evaluate(list));

    }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

    public void testTailFunction() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9561);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9562);List<String> list = new ArrayList<String>();
        {
            __CLR4_4_17a77a7kcq4sv88.R.inc(9563);List<String> result = (List<String>)(tail.evaluate(list));
            __CLR4_4_17a77a7kcq4sv88.R.inc(9564);assertTrue("Tail of an empty list is empty.",result.isEmpty());
        }
        __CLR4_4_17a77a7kcq4sv88.R.inc(9565);list.add("First");
        {
            __CLR4_4_17a77a7kcq4sv88.R.inc(9566);List<String> result = (List<String>)(tail.evaluate(list));
            __CLR4_4_17a77a7kcq4sv88.R.inc(9567);assertTrue("Tail of a one element list is empty.",result.isEmpty());
        }
        __CLR4_4_17a77a7kcq4sv88.R.inc(9568);list.add("Second");
        {
            __CLR4_4_17a77a7kcq4sv88.R.inc(9569);List<String> result = (List<String>)(tail.evaluate(list));
            __CLR4_4_17a77a7kcq4sv88.R.inc(9570);assertEquals("Tail of a two element list has one element.",1,result.size());
            __CLR4_4_17a77a7kcq4sv88.R.inc(9571);assertEquals("Second",result.get(0));
        }
        __CLR4_4_17a77a7kcq4sv88.R.inc(9572);list.add("Third");
        {
            __CLR4_4_17a77a7kcq4sv88.R.inc(9573);List<String> result = (List<String>)(tail.evaluate(list));
            __CLR4_4_17a77a7kcq4sv88.R.inc(9574);assertEquals("Tail of a three element list has two elements.",2,result.size());
            __CLR4_4_17a77a7kcq4sv88.R.inc(9575);assertEquals("Second",result.get(0));
            __CLR4_4_17a77a7kcq4sv88.R.inc(9576);assertEquals("Third",result.get(1));
        }
    }finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

    public void testLesserTail() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9577);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9578);List<Integer> list = new ArrayList<Integer>();
        __CLR4_4_17a77a7kcq4sv88.R.inc(9579);for (int i=0;(((i<10)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9580)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9581)==0&false));i++) {{
            __CLR4_4_17a77a7kcq4sv88.R.inc(9582);list.add(Integer.valueOf(i));
        }
        }__CLR4_4_17a77a7kcq4sv88.R.inc(9583);for (int i=0;(((i<10)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9584)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9585)==0&false));i++) {{
            __CLR4_4_17a77a7kcq4sv88.R.inc(9586);Integer val = Integer.valueOf(i);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9587);List<Integer> lesser = (List<Integer>) lesserTail.evaluate(val,list);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9588);assertEquals(i,lesser.size());
            __CLR4_4_17a77a7kcq4sv88.R.inc(9589);for (int j=0;(((j<i)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9590)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9591)==0&false));j++) {{
                __CLR4_4_17a77a7kcq4sv88.R.inc(9592);assertEquals(Integer.valueOf(j),lesser.get(j));
            }
        }}
    }}finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}

    public void testGreaterTail() {try{__CLR4_4_17a77a7kcq4sv88.R.inc(9593);
        __CLR4_4_17a77a7kcq4sv88.R.inc(9594);List<Integer> list = new ArrayList<Integer>();
        __CLR4_4_17a77a7kcq4sv88.R.inc(9595);for (int i=0;(((i<10)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9596)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9597)==0&false));i++) {{
            __CLR4_4_17a77a7kcq4sv88.R.inc(9598);list.add(Integer.valueOf(i));
        }
        }__CLR4_4_17a77a7kcq4sv88.R.inc(9599);for (int i=0;(((i<10)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9600)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9601)==0&false));i++) {{
            __CLR4_4_17a77a7kcq4sv88.R.inc(9602);Integer val = Integer.valueOf(i);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9603);List<Integer> greater = (List<Integer>) greaterTail.evaluate(val,list);
            __CLR4_4_17a77a7kcq4sv88.R.inc(9604);assertEquals(10-i,greater.size());
            __CLR4_4_17a77a7kcq4sv88.R.inc(9605);for (int j=i;(((j<10)&&(__CLR4_4_17a77a7kcq4sv88.R.iget(9606)!=0|true))||(__CLR4_4_17a77a7kcq4sv88.R.iget(9607)==0&false));j++) {{
                __CLR4_4_17a77a7kcq4sv88.R.inc(9608);assertEquals(Integer.valueOf(j),greater.get(j-i));
            }
        }}
    }}finally{__CLR4_4_17a77a7kcq4sv88.R.flushNeeded();}}
}
