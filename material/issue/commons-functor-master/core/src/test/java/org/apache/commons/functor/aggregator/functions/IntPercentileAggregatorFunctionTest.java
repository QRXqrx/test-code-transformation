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
package org.apache.commons.functor.aggregator.functions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.aggregator.functions.IntegerPercentileAggregatorFunction;
import org.junit.Test;

/**
 * Unit test for {@link IntegerPercentileAggregatorFunction}.
 */
public class IntPercentileAggregatorFunctionTest extends BaseFunctorTest {

    // make room for some poor
    private static final double DELTA = 0.01;

    // floating point support
    // by default use the 90th
    private static final double DEF_PERC = 90;

    // percentile
    @Override
    protected Object makeFunctor() throws Exception {
        return new IntegerPercentileAggregatorFunction(DEF_PERC);
    }

    @Test
    public void testCreate() throws Exception {
        // default
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        assertTrue(fct.isUseCopy());
    }

    @Test
    public void testCreate_1() throws Exception {
        // default
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        assertEquals(fct.getPercentile(), DEF_PERC, DELTA);
    }

    @Test
    public void testCreate_2() throws Exception {
        // default
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), DEF_PERC, DELTA);*/
        fct.getPercentile();
        // different percentage
        double perc = 50.0;
        fct = new IntegerPercentileAggregatorFunction(perc);
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        assertEquals(fct.getPercentile(), perc, DELTA);
    }

    @Test
    public void testCreate_3() throws Exception {
        // default
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), DEF_PERC, DELTA);*/
        fct.getPercentile();
        // different percentage
        double perc = 50.0;
        fct = new IntegerPercentileAggregatorFunction(perc);
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), perc, DELTA);*/
        fct.getPercentile();
        // use copy
        fct = new IntegerPercentileAggregatorFunction(perc, false);
        assertFalse(fct.isUseCopy());
    }

    @Test
    public void testCreate_4() throws Exception {
        // default
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), DEF_PERC, DELTA);*/
        fct.getPercentile();
        // different percentage
        double perc = 50.0;
        fct = new IntegerPercentileAggregatorFunction(perc);
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), perc, DELTA);*/
        fct.getPercentile();
        // use copy
        fct = new IntegerPercentileAggregatorFunction(perc, false);
        /*[Transform from] assertFalse(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), perc, DELTA);*/
        fct.getPercentile();
        // test illegal exc
        boolean exc = false;
        fct = null;
        try {
            fct = new IntegerPercentileAggregatorFunction(-100);
        } catch (IllegalArgumentException e) {
            exc = true;
        }
        assertTrue(exc);
    }

    @Test
    public void testComputeRank() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        // first item
        IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        assertEquals(rank, 0);
    }

    @Test
    public void testComputeRank_1() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        // first item
        IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        assertEquals(data.get(rank).intValue(), 0);
    }

    @Test
    public void testComputeRank_2() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        // first item
        IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 0);*/
        data.get(rank).intValue();
        // last item
        fct = new IntegerPercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        assertEquals(rank, data.size() - 1);
    }

    @Test
    public void testComputeRank_3() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        // first item
        IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 0);*/
        data.get(rank).intValue();
        // last item
        fct = new IntegerPercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        assertEquals(data.get(rank).intValue(), 4);
    }

    @Test
    public void testComputeRank_4() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        // first item
        IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 0);*/
        data.get(rank).intValue();
        // last item
        fct = new IntegerPercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 4);*/
        data.get(rank).intValue();
        // middle one
        fct = new IntegerPercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        assertEquals(rank, 2);
    }

    @Test
    public void testComputeRank_5() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        // first item
        IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 0);*/
        data.get(rank).intValue();
        // last item
        fct = new IntegerPercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 4);*/
        data.get(rank).intValue();
        // middle one
        fct = new IntegerPercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 2);[NONE Params]*/
        ;
        assertEquals(data.get(rank).intValue(), 2);
    }

    @Test
    public void testComputeRank_6() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        // first item
        IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 0);*/
        data.get(rank).intValue();
        // last item
        fct = new IntegerPercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 4);*/
        data.get(rank).intValue();
        // middle one
        fct = new IntegerPercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 2);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 2);*/
        data.get(rank).intValue();
        // 40% = 2nd item
        fct = new IntegerPercentileAggregatorFunction(40.0);
        rank = fct.computeRank(data);
        assertEquals(rank, 1);
    }

    @Test
    public void testComputeRank_7() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        // first item
        IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 0);*/
        data.get(rank).intValue();
        // last item
        fct = new IntegerPercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 4);*/
        data.get(rank).intValue();
        // middle one
        fct = new IntegerPercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 2);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 2);*/
        data.get(rank).intValue();
        // 40% = 2nd item
        fct = new IntegerPercentileAggregatorFunction(40.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 1);[NONE Params]*/
        ;
        assertEquals(data.get(rank).intValue(), 1);
    }

    @Test
    public void testComputeRank_8() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        // first item
        IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 0);*/
        data.get(rank).intValue();
        // last item
        fct = new IntegerPercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 4);*/
        data.get(rank).intValue();
        // middle one
        fct = new IntegerPercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 2);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 2);*/
        data.get(rank).intValue();
        // 40% = 2nd item
        fct = new IntegerPercentileAggregatorFunction(40.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 1);*/
        data.get(rank).intValue();
        // 80% = 4th item
        fct = new IntegerPercentileAggregatorFunction(80.0);
        rank = fct.computeRank(data);
        assertEquals(rank, 3);
    }

    @Test
    public void testComputeRank_9() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        // first item
        IntegerPercentileAggregatorFunction fct = new IntegerPercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 0);*/
        data.get(rank).intValue();
        // last item
        fct = new IntegerPercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 4);*/
        data.get(rank).intValue();
        // middle one
        fct = new IntegerPercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 2);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 2);*/
        data.get(rank).intValue();
        // 40% = 2nd item
        fct = new IntegerPercentileAggregatorFunction(40.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).intValue(), 1);*/
        data.get(rank).intValue();
        // 80% = 4th item
        fct = new IntegerPercentileAggregatorFunction(80.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 3);[NONE Params]*/
        ;
        assertEquals(data.get(rank).intValue(), 3);
    }

    @Test
    public void testEvaluateNullEmpty() throws Exception {
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = null;
        Integer d = fct.evaluate(data);
        assertNull(d);
    }

    @Test
    public void testEvaluateNoCopy() throws Exception {
        // using a copy
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(0);
        Integer d = fct.evaluate(data);
        assertEquals(d.intValue(), 3);
    }

    @Test
    public void testEvaluateNoCopy_1() throws Exception {
        // using a copy
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(0);
        Integer d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        assertEquals(data.get(0).intValue(), 4);
    }

    @Test
    public void testEvaluateNoCopy_2() throws Exception {
        // using a copy
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(0);
        Integer d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        assertEquals(data.get(1).intValue(), 3);
    }

    @Test
    public void testEvaluateNoCopy_3() throws Exception {
        // using a copy
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(0);
        Integer d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        assertEquals(data.get(2).intValue(), 2);
    }

    @Test
    public void testEvaluateNoCopy_4() throws Exception {
        // using a copy
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(0);
        Integer d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        assertEquals(data.get(3).intValue(), 1);
    }

    @Test
    public void testEvaluateNoCopy_5() throws Exception {
        // using a copy
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(0);
        Integer d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 1);*/
        data.get(3).intValue();
        assertEquals(data.get(4).intValue(), 0);
    }

    @Test
    public void testEvaluateNoCopy_6() throws Exception {
        // using a copy
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(0);
        Integer d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 1);*/
        data.get(3).intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 0);*/
        data.get(4).intValue();
        // using a copy (explicitly)
        fct = new IntegerPercentileAggregatorFunction(DEF_PERC, true);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 1);*/
        data.get(3).intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 0);*/
        data.get(4).intValue();
        // operate on the list directly
        fct = new IntegerPercentileAggregatorFunction(DEF_PERC, false);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        assertEquals(data.get(4).intValue(), 4);
    }

    @Test
    public void testEvaluateNoCopy_7() throws Exception {
        // using a copy
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(0);
        Integer d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 1);*/
        data.get(3).intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 0);*/
        data.get(4).intValue();
        // using a copy (explicitly)
        fct = new IntegerPercentileAggregatorFunction(DEF_PERC, true);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 1);*/
        data.get(3).intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 0);*/
        data.get(4).intValue();
        // operate on the list directly
        fct = new IntegerPercentileAggregatorFunction(DEF_PERC, false);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 4);*/
        data.get(4).intValue();
        assertEquals(data.get(3).intValue(), 3);
    }

    @Test
    public void testEvaluateNoCopy_8() throws Exception {
        // using a copy
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(0);
        Integer d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 1);*/
        data.get(3).intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 0);*/
        data.get(4).intValue();
        // using a copy (explicitly)
        fct = new IntegerPercentileAggregatorFunction(DEF_PERC, true);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 1);*/
        data.get(3).intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 0);*/
        data.get(4).intValue();
        // operate on the list directly
        fct = new IntegerPercentileAggregatorFunction(DEF_PERC, false);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 4);*/
        data.get(4).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 3);*/
        data.get(3).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        assertEquals(data.get(1).intValue(), 1);
    }

    @Test
    public void testEvaluateNoCopy_9() throws Exception {
        // using a copy
        IntegerPercentileAggregatorFunction fct = (IntegerPercentileAggregatorFunction) makeFunctor();
        List<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(0);
        Integer d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 1);*/
        data.get(3).intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 0);*/
        data.get(4).intValue();
        // using a copy (explicitly)
        fct = new IntegerPercentileAggregatorFunction(DEF_PERC, true);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(0).intValue(), 4);*/
        data.get(0).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 3);*/
        data.get(1).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 1);*/
        data.get(3).intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 0);*/
        data.get(4).intValue();
        // operate on the list directly
        fct = new IntegerPercentileAggregatorFunction(DEF_PERC, false);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d.intValue(), 3);*/
        d.intValue();
        /*[Transform from] assertEquals(data.get(4).intValue(), 4);*/
        data.get(4).intValue();
        /*[Transform from] assertEquals(data.get(3).intValue(), 3);*/
        data.get(3).intValue();
        /*[Transform from] assertEquals(data.get(2).intValue(), 2);*/
        data.get(2).intValue();
        /*[Transform from] assertEquals(data.get(1).intValue(), 1);*/
        data.get(1).intValue();
        assertEquals(data.get(0).intValue(), 0);
    }
}

