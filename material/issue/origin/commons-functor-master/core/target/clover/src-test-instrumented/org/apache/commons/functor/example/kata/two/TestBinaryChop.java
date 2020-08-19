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
package org.apache.commons.functor.example.kata.two;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.functor.NullaryFunction;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.functor.core.algorithm.RecursiveEvaluation;
import org.apache.commons.functor.core.algorithm.UntilDo;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;
import org.apache.commons.functor.range.IntegerRange;
import org.junit.Test;

/**
 * Examples of binary search implementations.
 *
 * A binary search algorithm is the same strategy used in
 * that number guessing game, where one player picks a number
 * between 1 and 100, and the second player tries to guess it.
 * Each time the second player guesses a number, the first player
 * tells whether the chosen number is higher, lower or equal to
 * the guess.
 *
 * An effective strategy for this sort of game is always guess
 * the midpoint between what you know to be the lowest and
 * highest possible number.  This will find the number in
 * log2(N) guesses (when N = 100, this is at most 7 guesses).
 *
 * For example, suppose the first player (secretly) picks the
 * number 63.  The guessing goes like this:
 *
 * P1> I'm thinking of a number between 1 and 100.
 * P2> Is it 50?
 * P1> Higher.
 * P2> 75?
 * P1> Lower.
 * P2> 62?
 * P1> Higher.
 * P2> 68?
 * P1> Lower.
 * P2> 65?
 * P1> Lower.
 * P2> 63?
 * P1> That's it.
 *
 * Dave Thomas's Kata Two asks us to implement a binary search algorithm
 * in several ways.  Here we'll use this as an opportunity to
 * consider some common approaches and explore
 * some functor based approaches as well.
 *
 * See http://pragprog.com/pragdave/Practices/Kata/KataTwo.rdoc,v
 * for more information on this Kata.
 *
 * @version $Revision$ $Date$
 */
public class TestBinaryChop {static class __CLR4_4_17q07q0kcq4sviz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10199,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * This is Dave's test case, plus
     * a quick check of searching a fairly large
     * list, just to make sure the time and space
     * requirements are reasonable.
     */
    private void chopTest(BinaryChop chopper) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10008);
        __CLR4_4_17q07q0kcq4sviz.R.inc(10009);assertEquals(-1, chopper.find(3, new int[0]));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10010);assertEquals(-1, chopper.find(3, new int[] { 1 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10011);assertEquals(0, chopper.find(1, new int[] { 1 }));

        __CLR4_4_17q07q0kcq4sviz.R.inc(10012);assertEquals(0, chopper.find(1, new int[] { 1, 3, 5 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10013);assertEquals(1, chopper.find(3, new int[] { 1, 3, 5 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10014);assertEquals(2, chopper.find(5, new int[] { 1, 3, 5 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10015);assertEquals(-1, chopper.find(0, new int[] { 1, 3, 5 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10016);assertEquals(-1, chopper.find(2, new int[] { 1, 3, 5 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10017);assertEquals(-1, chopper.find(4, new int[] { 1, 3, 5 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10018);assertEquals(-1, chopper.find(6, new int[] { 1, 3, 5 }));

        __CLR4_4_17q07q0kcq4sviz.R.inc(10019);assertEquals(0, chopper.find(1, new int[] { 1, 3, 5, 7 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10020);assertEquals(1, chopper.find(3, new int[] { 1, 3, 5, 7 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10021);assertEquals(2, chopper.find(5, new int[] { 1, 3, 5, 7 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10022);assertEquals(3, chopper.find(7, new int[] { 1, 3, 5, 7 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10023);assertEquals(-1, chopper.find(0, new int[] { 1, 3, 5, 7 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10024);assertEquals(-1, chopper.find(2, new int[] { 1, 3, 5, 7 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10025);assertEquals(-1, chopper.find(4, new int[] { 1, 3, 5, 7 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10026);assertEquals(-1, chopper.find(6, new int[] { 1, 3, 5, 7 }));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10027);assertEquals(-1, chopper.find(8, new int[] { 1, 3, 5, 7 }));

        __CLR4_4_17q07q0kcq4sviz.R.inc(10028);final List<Integer> largeList =
            IteratorToGeneratorAdapter.adapt(new IntegerRange(0, 100001)).to(new ArrayList<Integer>());

        __CLR4_4_17q07q0kcq4sviz.R.inc(10029);assertEquals(-1, chopper.find(Integer.valueOf(-5), largeList));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10030);assertEquals(100000, chopper.find(Integer.valueOf(100000), largeList));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10031);assertEquals(0, chopper.find(Integer.valueOf(0), largeList));
        __CLR4_4_17q07q0kcq4sviz.R.inc(10032);assertEquals(50000, chopper.find(Integer.valueOf(50000), largeList));

    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

    /**
     * In practice, one would most likely use the
     * binary search method already available in
     * java.util.Collections, but that's not
     * really the point of this exercise.
     */
    @Test
    public void testBuiltIn() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcy3d47qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.testBuiltIn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcy3d47qp(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10033);
        __CLR4_4_17q07q0kcq4sviz.R.inc(10034);chopTest(new BaseBinaryChop() {
            public int find(Integer seeking, List<Integer> list) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10035);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10036);int result = Collections.binarySearch(list,seeking);
                //
                // Collections.binarySearch is a bit smarter than our
                // "find". It returns
                //  (-(insertionPoint) - 1)
                // when the value is not found, rather than
                // simply -1.
                //
                __CLR4_4_17q07q0kcq4sviz.R.inc(10037);return (((result >= 0 )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10038)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10039)==0&false))? result : -1;
            }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
        });
    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

    /**
     * Here's a basic iterative approach.
     *
     * We set the lower or upper bound to the midpoint
     * until there's only one element between the lower
     * and upper bound.  Then the lower bound is where
     * the element would be found if it existed in the
     * list.
     *
     * We add an additional comparision at the end so
     * that we can return -1 if the element is not yet
     * in the list.
     */
    @Test
    public void testIterative() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tn0iji7qw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.testIterative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tn0iji7qw(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10040);
        __CLR4_4_17q07q0kcq4sviz.R.inc(10041);chopTest(new BaseBinaryChop() {
            public int find(Integer seeking, List<Integer> list) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10042);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10043);int high = list.size();
                __CLR4_4_17q07q0kcq4sviz.R.inc(10044);int low = 0;
                __CLR4_4_17q07q0kcq4sviz.R.inc(10045);while ((((high - low > 1)&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10046)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10047)==0&false))) {{
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10048);int mid = (high + low) / 2;
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10049);if ((((greaterThan(list,mid,seeking))&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10050)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10051)==0&false))) {{
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10052);high = mid;
                    } }else {{
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10053);low = mid;
                    }
                }}
                }__CLR4_4_17q07q0kcq4sviz.R.inc(10054);return (((list.isEmpty() )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10055)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10056)==0&false))? -1 : ((((equals(list,low,seeking) )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10057)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10058)==0&false))? low : -1);
            }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
        });
    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

    /*
     * At http://onestepback.org/index.cgi/Tech/Programming/Kata/KataTwoVariation1.rdoc,
     * Jim Weirich discusses Kata Two from the perspective of loop invariants.
     *
     * Loop invariants provide a way of deductive reasoning about loops.
     *
     * Let P, Q. and R be predicates and A and B be
     * procedures.  Note that if:
     *   assert(P.test());
     *   A.run();
     *   assert(Q.test());
     * and
     *   assert(Q.test());
     *   B.run();
     *   assert(R.test());
     * are both valid, then:
     *   assert(P.test());
     *   A.run();
     *   B.run();
     *   assert(R.test());
     * is valid as well.
     *
     * Similiarly, if INV and TERM are predicates and BODY is a procedure,
     * then if:
     *   assert(INV.test());
     *   BODY.run();
     *   assert(INV.test());
     * is valid, then so is:
     *   assert(INV.test());
     *   while(! TERM.test() ) { BODY.run(); }
     *   assert(INV.test());
     *   assert(TERM.test());
     *
     * Here INV is an "loop invariant", a statement that is true for every
     * single iteration through the loop.  TERM is a terminating condition,
     * a statement that is true (by construction) when the loop exits.
     *
     * We can use loop invariants to reason about our iterative binary
     * search loop.  In particular, note that:
     *
     * // assert that the list is empty, or
     * // the result index is between
     * // low (inclusive) and high (exclusive),
     * // or high is 0 (the list is empty)
     * NullaryPredicate INV = new NullaryPredicate() {
     *   public boolean test() {
     *    return high == 0 ||
     *          (low <= result && result < high);
     *   }
     * };
     *
     * is a valid invariant in our binary search, and that:
     *
     * NullaryPredicate TERM = new NullaryPredicate() {
     *   public boolean test() {
     *    return (high - low) <= 1;
     *   }
     * };
     *
     * is a valid terminating condition.
     *
     * The BODY in our case simply moves the endpoints
     * closer together, without violating
     * our invariant:
     *
     * NullaryProcedure BODY = new NullaryProcedure() {
     *   public void run() {
     *     int mid = (high + low) / 2;
     *     if (greaterThan(list,mid,seeking)) {
     *       high = mid;
     *     } else {
     *       low = mid;
     *     }
     *   }
     * };
     *
     * One could assert our invariant before and after
     * the execution of BODY, and the terminating condition
     * at the end of the loop, but we can tell by construction
     * that these assertions will hold.
     *
     * Using the functor framework, we can make these notions
     * explict.  Specifically, the construction above is:
     *
     *   Algorithms.untildo(BODY,TERM);
     *
     * Since we'll want to share state among the TERM and BODY,
     * let's declare a single interface for the TERM NullaryPredicate and
     * the BODY NullaryProcedure.  We'll be calculating a result within
     * the loop, so let's add a NullaryFunction implementation as well,
     * as a way of retrieving that result:
     */
    interface Loop extends NullaryPredicate, NullaryProcedure, NullaryFunction<Object> {
        /** The terminating condition. */
        boolean test();
        /** The loop body. */
        void run();
        /** The result of executing the loop. */
        Object evaluate();
    };

    /*
     * Now we can use the Algorithms.dountil method to
     * execute that loop:
     */
    @Test
    public void testIterativeWithInvariants() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ojcjr97rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.testIterativeWithInvariants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ojcjr97rf(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10059);
        __CLR4_4_17q07q0kcq4sviz.R.inc(10060);chopTest(new BaseBinaryChop() {

            public int find(final Integer seeking, final List<Integer> list) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10061);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10062);Loop loop = new Loop() {
                    int high = list.size();
                    int low = 0;

                    /** Our terminating condition. */
                    public boolean test() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{boolean $CLV_r$=__CLR4_4_1qua6457rj();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);return false;}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.testIterativeWithInvariants.find.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10063,$CLV_p$,$CLV_t$);}}private boolean  __CLR4_4_1qua6457rj(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10063);
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10064);return (high - low) <= 1;
                    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

                    /** Our loop body. */
                    public void run() {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10065);
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10066);int mid = (high + low) / 2;
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10067);if ((((greaterThan(list,mid,seeking))&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10068)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10069)==0&false))) {{
                            __CLR4_4_17q07q0kcq4sviz.R.inc(10070);high = mid;
                        } }else {{
                            __CLR4_4_17q07q0kcq4sviz.R.inc(10071);low = mid;
                        }
                    }}finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

                    /**
                     * A way of returning the result
                     * at the end of the loop.
                     */
                    public Object evaluate() {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10072);
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10073);return Integer.valueOf(
                            (((list.isEmpty() )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10074)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10075)==0&false))?
                            -1 :
                            ((((BaseBinaryChop.equals(list,low,seeking) )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10076)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10077)==0&false))? low : -1));
                    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

                };
                __CLR4_4_17q07q0kcq4sviz.R.inc(10078);new UntilDo(loop, loop).run();
                __CLR4_4_17q07q0kcq4sviz.R.inc(10079);return ((Number) loop.evaluate()).intValue();
            }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
        });
    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

    /*
     * Jim Weirich notes how Eiffel is very explict about loop invariants:
     *
     *   from
     *     low := list.lower
     *     high := list.upper + 1
     *   invariant
     *     lower_limit: -- low <= result (this is just a comment)
     *     upper_limit: -- high < result (this is just a comment)
     *   variant
     *     high - low
     *   until
     *     (high - low) <= 1
     *   loop
     *     mid := (high + low) // 2
     *     if list.at(mid) > seeking then
     *       high := mid
     *     else
     *       low := mid
     *     end
     *   end
     *
     * We can do that too, using EiffelStyleLoop.
     */
    class BinarySearchLoop extends EiffelStyleLoop {
        BinarySearchLoop(Integer aSeeking, List<Integer> aList) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10080);
            __CLR4_4_17q07q0kcq4sviz.R.inc(10081);seeking = aSeeking;
            __CLR4_4_17q07q0kcq4sviz.R.inc(10082);list = aList;

            __CLR4_4_17q07q0kcq4sviz.R.inc(10083);from(new NullaryProcedure() {
                public void run() {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10084);
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10085);low = 0;
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10086);high = list.size();
                }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
            });

            __CLR4_4_17q07q0kcq4sviz.R.inc(10087);invariant(new NullaryPredicate() {
                public boolean test() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{boolean $CLV_r$=__CLR4_4_1qua6457s8();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);return false;}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.BinarySearchLoop.BinarySearchLoop.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10088,$CLV_p$,$CLV_t$);}}private boolean  __CLR4_4_1qua6457s8(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10088);
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10089);return high == 0 || low < high;
                }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
            });

            __CLR4_4_17q07q0kcq4sviz.R.inc(10090);variant(new NullaryFunction<Object>() {
                public Object evaluate() {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10091);
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10092);return Integer.valueOf(high - low);
                }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
            });

            __CLR4_4_17q07q0kcq4sviz.R.inc(10093);until(new NullaryPredicate() {
                public boolean test() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{boolean $CLV_r$=__CLR4_4_1qua6457se();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);return false;}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.BinarySearchLoop.BinarySearchLoop.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10094,$CLV_p$,$CLV_t$);}}private boolean  __CLR4_4_1qua6457se(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10094);
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10095);return high - low <= 1;
                }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
            });

            __CLR4_4_17q07q0kcq4sviz.R.inc(10096);loop(new NullaryProcedure() {
                public void run() {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10097);
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10098);int mid = (high + low) / 2;
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10099);if ((((BaseBinaryChop.greaterThan(list,mid,seeking))&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10100)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10101)==0&false))) {{
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10102);high = mid;
                    } }else {{
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10103);low = mid;
                    }
                }}finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
            });
        }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

        int getResult() {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10104);
            __CLR4_4_17q07q0kcq4sviz.R.inc(10105);return (((list.isEmpty() )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10106)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10107)==0&false))? -1 : (((BaseBinaryChop.equals(list,low,seeking) )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10108)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10109)==0&false))? low : -1;
        }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

        private int high;
        private int low;
        private final Integer seeking;
        private final List<Integer> list;
    }

    @Test
    public void testIterativeWithInvariantsAndAssertions() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ks08it7su();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.testIterativeWithInvariantsAndAssertions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ks08it7su(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10110);
        __CLR4_4_17q07q0kcq4sviz.R.inc(10111);chopTest(new BaseBinaryChop() {
            public int find(Integer seeking, List<Integer> list) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10112);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10113);BinarySearchLoop loop = new BinarySearchLoop(seeking,list);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10114);loop.run();
                __CLR4_4_17q07q0kcq4sviz.R.inc(10115);return loop.getResult();
            }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}});
    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

    /**
     * A recursive version of that implementation uses
     * method parameters to track the upper and
     * lower bounds.
     */
    @Test
    public void testRecursive() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vfg1z7t0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.testRecursive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vfg1z7t0(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10116);
        __CLR4_4_17q07q0kcq4sviz.R.inc(10117);chopTest(new BaseBinaryChop() {
            public int find(Integer seeking, List<Integer> list) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10118);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10119);return find(seeking, list, 0, list.size());
            }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

            private int find(Integer seeking, List<Integer> list, int low, int high) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10120);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10121);if ((((high - low > 1)&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10122)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10123)==0&false))) {{
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10124);int mid = (high + low) / 2;
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10125);if ((((greaterThan(list,mid,seeking))&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10126)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10127)==0&false))) {{
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10128);return find(seeking,list,low,mid);
                    } }else {{
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10129);return find(seeking,list,mid,high);
                    }
                }} }else {{
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10130);return (((list.isEmpty() )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10131)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10132)==0&false))? -1 : ((((equals(list,low,seeking) )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10133)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10134)==0&false))? low : -1);
                }
            }}finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
        });
    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

    /**
     * We can use the Algorithms.recuse method
     * to implement that as tail recursion.
     *
     * Here the anonymous NullaryFunction implemenation
     * holds this itermediate state, rather than
     * the VM's call stack.
     *
     * Arguably this is more like a continuation than
     * tail recursion, since there is a bit of state
     * to be tracked.
     */
    @Test
    public void testTailRecursive() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kf5p497tj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.testTailRecursive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kf5p497tj(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10135);
        __CLR4_4_17q07q0kcq4sviz.R.inc(10136);chopTest(new BaseBinaryChop() {
            public int find(final Integer seeking, final List<Integer> list) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10137);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10138);return ((Number) new RecursiveEvaluation(new NullaryFunction<Object>() {
                    public Object evaluate() {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10139);
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10140);if ((((high - low > 1)&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10141)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10142)==0&false))) {{
                            __CLR4_4_17q07q0kcq4sviz.R.inc(10143);int mid = (high + low) / 2;
                            __CLR4_4_17q07q0kcq4sviz.R.inc(10144);if ((((greaterThan(list,mid,seeking))&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10145)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10146)==0&false))) {{
                                __CLR4_4_17q07q0kcq4sviz.R.inc(10147);high = mid;
                            } }else {{
                                __CLR4_4_17q07q0kcq4sviz.R.inc(10148);low = mid;
                            }
                            }__CLR4_4_17q07q0kcq4sviz.R.inc(10149);return this;
                        } }else {{
                            __CLR4_4_17q07q0kcq4sviz.R.inc(10150);return (((list.isEmpty() )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10151)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10152)==0&false))?
                                BaseBinaryChop.NEGATIVE_ONE :
                                ((((BaseBinaryChop.equals(list,low,seeking) )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10153)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10154)==0&false))?
                                    Integer.valueOf(low) :
                                    BaseBinaryChop.NEGATIVE_ONE);
                        }
                    }}finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
                    int high = list.size();
                    int low = 0;
                }).evaluate()).intValue();
            }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
        });
    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

    /**
     * One fun functional approach is to "slice" up the
     * list as we search,  looking at smaller and
     * smaller slices until we've found the element
     * we're looking for.
     *
     * Note that while any given call to this recursive
     * function may only be looking at a sublist, we
     * need to return the index in the overall list.
     * Hence we'll split out a method so that we can
     * pass the offset in the original list as a
     * parameter.
     *
     * With all of the subList creation, this approach
     * is probably less efficient than either the iterative
     * or the recursive implemenations above.
     */
    @Test
    public void testRecursive2() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7h1mv7u3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.testRecursive2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7h1mv7u3(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10155);
        __CLR4_4_17q07q0kcq4sviz.R.inc(10156);chopTest(new BaseBinaryChop() {
            public int find(Integer seeking, List<Integer> list) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10157);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10158);return find(seeking,list,0);
            }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

            private int find(Integer seeking, List<Integer> list, int offset) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10159);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10160);if ((((list.isEmpty())&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10161)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10162)==0&false))) {{
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10163);return -1;
                } }__CLR4_4_17q07q0kcq4sviz.R.inc(10164);if ((((list.size() == 1)&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10165)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10166)==0&false))) {{
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10167);return ((((equals(list,0,seeking) )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10168)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10169)==0&false))? offset : -1);
                } }else {{
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10170);int mid = list.size() / 2;
                    __CLR4_4_17q07q0kcq4sviz.R.inc(10171);if ((((greaterThan(list,mid,seeking))&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10172)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10173)==0&false))) {{
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10174);return find(seeking,list.subList(0,mid),offset);
                    } }else {{
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10175);return find(seeking,list.subList(mid,list.size()),offset+mid);
                    }
                }}
            }}finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
        });
    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

    /**
     * We can do that using tail recursion as well.
     *
     * Again, the anonymous NullaryFunction implemenation
     * holds the "continuation" state.
     */
    @Test
    public void testTailRecursive2() {__CLR4_4_17q07q0kcq4sviz.R.globalSliceStart(getClass().getName(),10176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0jy8n7uo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17q07q0kcq4sviz.R.rethrow($CLV_t2$);}finally{__CLR4_4_17q07q0kcq4sviz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.kata.two.TestBinaryChop.testTailRecursive2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0jy8n7uo(){try{__CLR4_4_17q07q0kcq4sviz.R.inc(10176);
        __CLR4_4_17q07q0kcq4sviz.R.inc(10177);chopTest(new BaseBinaryChop() {
            public int find(final Integer seeking, final List<Integer> list) {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10178);
                __CLR4_4_17q07q0kcq4sviz.R.inc(10179);return ((Number) new RecursiveEvaluation(new NullaryFunction<Object>() {
                    public Object evaluate() {try{__CLR4_4_17q07q0kcq4sviz.R.inc(10180);
                        __CLR4_4_17q07q0kcq4sviz.R.inc(10181);if ((((sublist.isEmpty())&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10182)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10183)==0&false))) {{
                            __CLR4_4_17q07q0kcq4sviz.R.inc(10184);return BaseBinaryChop.NEGATIVE_ONE;
                        } }__CLR4_4_17q07q0kcq4sviz.R.inc(10185);if ((((sublist.size() == 1)&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10186)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10187)==0&false))) {{
                            __CLR4_4_17q07q0kcq4sviz.R.inc(10188);return ((((BaseBinaryChop.equals(sublist,0,seeking) )&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10189)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10190)==0&false))?
                                Integer.valueOf(offset) :
                                BaseBinaryChop.NEGATIVE_ONE);
                        } }else {{
                            __CLR4_4_17q07q0kcq4sviz.R.inc(10191);int mid = sublist.size() / 2;
                            __CLR4_4_17q07q0kcq4sviz.R.inc(10192);if ((((greaterThan(sublist,mid,seeking))&&(__CLR4_4_17q07q0kcq4sviz.R.iget(10193)!=0|true))||(__CLR4_4_17q07q0kcq4sviz.R.iget(10194)==0&false))) {{
                                __CLR4_4_17q07q0kcq4sviz.R.inc(10195);sublist = sublist.subList(0,mid);
                            } }else {{
                                __CLR4_4_17q07q0kcq4sviz.R.inc(10196);sublist = sublist.subList(mid,sublist.size());
                                __CLR4_4_17q07q0kcq4sviz.R.inc(10197);offset += mid;
                            }
                            }__CLR4_4_17q07q0kcq4sviz.R.inc(10198);return this;
                        }
                    }}finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
                    int offset = 0;
                    List<Integer> sublist = list;
                }).evaluate()).intValue();
            }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}
        });
    }finally{__CLR4_4_17q07q0kcq4sviz.R.flushNeeded();}}

}
