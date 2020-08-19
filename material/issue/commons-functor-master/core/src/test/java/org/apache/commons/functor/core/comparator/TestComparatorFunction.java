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
package org.apache.commons.functor.core.comparator;

import static org.junit.Assert.assertTrue;
import java.util.Collections;
import org.apache.commons.functor.BaseFunctorTest;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestComparatorFunction extends BaseFunctorTest {

    // Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return ComparatorFunction.INSTANCE;
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);
    }

    @Test
    public void testEvaluate_1() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);
    }

    @Test
    public void testEvaluate_2() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);
    }

    @Test
    public void testEvaluate_3() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);
    }

    @Test
    public void testEvaluate_4() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);
    }

    @Test
    public void testEvaluate_5() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);
    }

    @Test
    public void testEvaluate_6() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);
    }

    @Test
    public void testEvaluate_7() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);
    }

    @Test
    public void testEvaluate_8() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);
    }

    @Test
    public void testEvaluate_9() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);
    }

    @Test
    public void testEvaluate_10() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);
    }

    @Test
    public void testEvaluate_11() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);
    }

    @Test
    public void testEvaluate_12() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);
    }

    @Test
    public void testEvaluate_13() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);
    }

    @Test
    public void testEvaluate_14() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);
    }

    @Test
    public void testEvaluate_15() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);
    }

    @Test
    public void testEvaluate_16() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(1))).intValue() < 0);
    }

    @Test
    public void testEvaluate_17() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(0))).intValue() < 0);
    }

    @Test
    public void testEvaluate_18() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(0))).intValue() < 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(-1))).intValue() == 0);
    }

    @Test
    public void testEvaluate_19() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(0))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(-1))).intValue() == 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);
    }

    @Test
    public void testEvaluate_20() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(0))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(-1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);
    }

    @Test
    public void testEvaluate_21() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(0))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(-1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(1))).intValue() < 0);
    }

    @Test
    public void testEvaluate_22() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(0))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(-1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(0))).intValue() < 0);
    }

    @Test
    public void testEvaluate_23() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(0))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(-1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(0))).intValue() < 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(-1))).intValue() < 0);
    }

    @Test
    public void testEvaluate_24() {
        ComparatorFunction<Integer> f = ComparatorFunction.<Integer>instance();
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(0))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(0))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(-1))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(0), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(0))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(-1))).intValue() == 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(-1), Integer.valueOf(Integer.MIN_VALUE))).intValue() > 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(Integer.MAX_VALUE))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(1))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(0))).intValue() < 0);[NONE Params]*/
        ;
        /*[Transform from] assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(-1))).intValue() < 0);[NONE Params]*/
        ;
        assertTrue((f.evaluate(Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(Integer.MIN_VALUE))).intValue() == 0);
    }

    @Test
    public void testEquals() {
        ComparatorFunction<Comparable<?>> f = ComparatorFunction.instance();
        assertObjectsAreEqual(f, f);
        assertObjectsAreEqual(f, new ComparatorFunction<Integer>(ComparableComparator.<Integer>instance()));
        assertObjectsAreNotEqual(f, new ComparatorFunction<Boolean>(Collections.reverseOrder()));
        assertTrue(!f.equals(null));
    }
}

