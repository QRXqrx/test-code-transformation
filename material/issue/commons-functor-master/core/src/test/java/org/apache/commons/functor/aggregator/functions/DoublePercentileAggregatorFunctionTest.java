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
import org.apache.commons.functor.aggregator.functions.DoublePercentileAggregatorFunction;
import org.junit.Test;

/**
 * Unit test for {@link DoublePercentileAggregatorFunction}.
 */
public class DoublePercentileAggregatorFunctionTest extends BaseFunctorTest {

    // make room for some poor
    private static final double DELTA = 0.01;

    // floating point precision
    // by default use the 90th
    private static final double DEF_PERC = 90;

    // percentile
    @Override
    protected Object makeFunctor() throws Exception {
        return new DoublePercentileAggregatorFunction(DEF_PERC);
    }

    @Test
    public void testCreate() throws Exception {
        // default
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        assertTrue(fct.isUseCopy());
    }

    @Test
    public void testCreate_1() throws Exception {
        // default
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        assertEquals(fct.getPercentile(), DEF_PERC, DELTA);
    }

    @Test
    public void testCreate_2() throws Exception {
        // default
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), DEF_PERC, DELTA);*/
        fct.getPercentile();
        // different percentage
        double perc = 50.0;
        fct = new DoublePercentileAggregatorFunction(perc);
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        assertEquals(fct.getPercentile(), perc, DELTA);
    }

    @Test
    public void testCreate_3() throws Exception {
        // default
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), DEF_PERC, DELTA);*/
        fct.getPercentile();
        // different percentage
        double perc = 50.0;
        fct = new DoublePercentileAggregatorFunction(perc);
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), perc, DELTA);*/
        fct.getPercentile();
        // use copy
        fct = new DoublePercentileAggregatorFunction(perc, false);
        assertFalse(fct.isUseCopy());
    }

    @Test
    public void testCreate_4() throws Exception {
        // default
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), DEF_PERC, DELTA);*/
        fct.getPercentile();
        // different percentage
        double perc = 50.0;
        fct = new DoublePercentileAggregatorFunction(perc);
        /*[Transform from] assertTrue(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), perc, DELTA);*/
        fct.getPercentile();
        // use copy
        fct = new DoublePercentileAggregatorFunction(perc, false);
        /*[Transform from] assertFalse(fct.isUseCopy());*/
        fct.isUseCopy();
        /*[Transform from] assertEquals(fct.getPercentile(), perc, DELTA);*/
        fct.getPercentile();
        // test illegal exc
        boolean exc = false;
        fct = null;
        try {
            fct = new DoublePercentileAggregatorFunction(-100);
        } catch (IllegalArgumentException e) {
            exc = true;
        }
        assertTrue(exc);
    }

    @Test
    public void testComputeRank() throws Exception {
        List<Double> data = new ArrayList<Double>();
        data.add(0.0);
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        // first item
        DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        assertEquals(rank, 0);
    }

    @Test
    public void testComputeRank_1() throws Exception {
        List<Double> data = new ArrayList<Double>();
        data.add(0.0);
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        // first item
        DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        assertEquals(data.get(rank).doubleValue(), 0.0, DELTA);
    }

    @Test
    public void testComputeRank_2() throws Exception {
        List<Double> data = new ArrayList<Double>();
        data.add(0.0);
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        // first item
        DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 0.0, DELTA);*/
        data.get(rank).doubleValue();
        // last item
        fct = new DoublePercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        assertEquals(rank, data.size() - 1);
    }

    @Test
    public void testComputeRank_3() throws Exception {
        List<Double> data = new ArrayList<Double>();
        data.add(0.0);
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        // first item
        DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 0.0, DELTA);*/
        data.get(rank).doubleValue();
        // last item
        fct = new DoublePercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        assertEquals(data.get(rank).doubleValue(), 4.0, DELTA);
    }

    @Test
    public void testComputeRank_4() throws Exception {
        List<Double> data = new ArrayList<Double>();
        data.add(0.0);
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        // first item
        DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 0.0, DELTA);*/
        data.get(rank).doubleValue();
        // last item
        fct = new DoublePercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 4.0, DELTA);*/
        data.get(rank).doubleValue();
        // middle one
        fct = new DoublePercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        assertEquals(rank, 2);
    }

    @Test
    public void testComputeRank_5() throws Exception {
        List<Double> data = new ArrayList<Double>();
        data.add(0.0);
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        // first item
        DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 0.0, DELTA);*/
        data.get(rank).doubleValue();
        // last item
        fct = new DoublePercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 4.0, DELTA);*/
        data.get(rank).doubleValue();
        // middle one
        fct = new DoublePercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 2);[NONE Params]*/
        ;
        assertEquals(data.get(rank).doubleValue(), 2.0, DELTA);
    }

    @Test
    public void testComputeRank_6() throws Exception {
        List<Double> data = new ArrayList<Double>();
        data.add(0.0);
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        // first item
        DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 0.0, DELTA);*/
        data.get(rank).doubleValue();
        // last item
        fct = new DoublePercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 4.0, DELTA);*/
        data.get(rank).doubleValue();
        // middle one
        fct = new DoublePercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 2);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 2.0, DELTA);*/
        data.get(rank).doubleValue();
        // 40% = 2nd item
        fct = new DoublePercentileAggregatorFunction(40.0);
        rank = fct.computeRank(data);
        assertEquals(rank, 1);
    }

    @Test
    public void testComputeRank_7() throws Exception {
        List<Double> data = new ArrayList<Double>();
        data.add(0.0);
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        // first item
        DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 0.0, DELTA);*/
        data.get(rank).doubleValue();
        // last item
        fct = new DoublePercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 4.0, DELTA);*/
        data.get(rank).doubleValue();
        // middle one
        fct = new DoublePercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 2);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 2.0, DELTA);*/
        data.get(rank).doubleValue();
        // 40% = 2nd item
        fct = new DoublePercentileAggregatorFunction(40.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 1);[NONE Params]*/
        ;
        assertEquals(data.get(rank).doubleValue(), 1.0, DELTA);
    }

    @Test
    public void testComputeRank_8() throws Exception {
        List<Double> data = new ArrayList<Double>();
        data.add(0.0);
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        // first item
        DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 0.0, DELTA);*/
        data.get(rank).doubleValue();
        // last item
        fct = new DoublePercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 4.0, DELTA);*/
        data.get(rank).doubleValue();
        // middle one
        fct = new DoublePercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 2);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 2.0, DELTA);*/
        data.get(rank).doubleValue();
        // 40% = 2nd item
        fct = new DoublePercentileAggregatorFunction(40.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 1.0, DELTA);*/
        data.get(rank).doubleValue();
        // 80% = 4th item
        fct = new DoublePercentileAggregatorFunction(80.0);
        rank = fct.computeRank(data);
        assertEquals(rank, 3);
    }

    @Test
    public void testComputeRank_9() throws Exception {
        List<Double> data = new ArrayList<Double>();
        data.add(0.0);
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        // first item
        DoublePercentileAggregatorFunction fct = new DoublePercentileAggregatorFunction(0.0);
        int rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 0);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 0.0, DELTA);*/
        data.get(rank).doubleValue();
        // last item
        fct = new DoublePercentileAggregatorFunction(100.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, data.size() - 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 4.0, DELTA);*/
        data.get(rank).doubleValue();
        // middle one
        fct = new DoublePercentileAggregatorFunction(50.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 2);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 2.0, DELTA);*/
        data.get(rank).doubleValue();
        // 40% = 2nd item
        fct = new DoublePercentileAggregatorFunction(40.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 1);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(rank).doubleValue(), 1.0, DELTA);*/
        data.get(rank).doubleValue();
        // 80% = 4th item
        fct = new DoublePercentileAggregatorFunction(80.0);
        rank = fct.computeRank(data);
        /*[Transform from] assertEquals(rank, 3);[NONE Params]*/
        ;
        assertEquals(data.get(rank).doubleValue(), 3.0, DELTA);
    }

    @Test
    public void testEvaluateNullEmpty() throws Exception {
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = null;
        Double d = fct.evaluate(data);
        assertNull(d);
    }

    @Test
    public void testEvaluateNoCopy() throws Exception {
        // using a copy
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = new ArrayList<Double>();
        data.add(4.0);
        data.add(3.0);
        data.add(2.0);
        data.add(1.0);
        data.add(0.0);
        Double d = fct.evaluate(data);
        assertEquals(d, 3.0, DELTA);
    }

    @Test
    public void testEvaluateNoCopy_1() throws Exception {
        // using a copy
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = new ArrayList<Double>();
        data.add(4.0);
        data.add(3.0);
        data.add(2.0);
        data.add(1.0);
        data.add(0.0);
        Double d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        assertEquals(data.get(0), 4.0, DELTA);
    }

    @Test
    public void testEvaluateNoCopy_2() throws Exception {
        // using a copy
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = new ArrayList<Double>();
        data.add(4.0);
        data.add(3.0);
        data.add(2.0);
        data.add(1.0);
        data.add(0.0);
        Double d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        assertEquals(data.get(1), 3.0, DELTA);
    }

    @Test
    public void testEvaluateNoCopy_3() throws Exception {
        // using a copy
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = new ArrayList<Double>();
        data.add(4.0);
        data.add(3.0);
        data.add(2.0);
        data.add(1.0);
        data.add(0.0);
        Double d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        assertEquals(data.get(2), 2.0, DELTA);
    }

    @Test
    public void testEvaluateNoCopy_4() throws Exception {
        // using a copy
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = new ArrayList<Double>();
        data.add(4.0);
        data.add(3.0);
        data.add(2.0);
        data.add(1.0);
        data.add(0.0);
        Double d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        assertEquals(data.get(3), 1.0, DELTA);
    }

    @Test
    public void testEvaluateNoCopy_5() throws Exception {
        // using a copy
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = new ArrayList<Double>();
        data.add(4.0);
        data.add(3.0);
        data.add(2.0);
        data.add(1.0);
        data.add(0.0);
        Double d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        /*[Transform from] assertEquals(data.get(3), 1.0, DELTA);*/
        data.get(3);
        assertEquals(data.get(4), 0.0, DELTA);
    }

    @Test
    public void testEvaluateNoCopy_6() throws Exception {
        // using a copy
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = new ArrayList<Double>();
        data.add(4.0);
        data.add(3.0);
        data.add(2.0);
        data.add(1.0);
        data.add(0.0);
        Double d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        /*[Transform from] assertEquals(data.get(3), 1.0, DELTA);*/
        data.get(3);
        /*[Transform from] assertEquals(data.get(4), 0.0, DELTA);*/
        data.get(4);
        // using a copy (explicitly)
        fct = new DoublePercentileAggregatorFunction(DEF_PERC, true);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        /*[Transform from] assertEquals(data.get(3), 1.0, DELTA);*/
        data.get(3);
        /*[Transform from] assertEquals(data.get(4), 0.0, DELTA);*/
        data.get(4);
        // operate on the list directly
        fct = new DoublePercentileAggregatorFunction(DEF_PERC, false);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        assertEquals(data.get(4), 4.0, DELTA);
    }

    @Test
    public void testEvaluateNoCopy_7() throws Exception {
        // using a copy
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = new ArrayList<Double>();
        data.add(4.0);
        data.add(3.0);
        data.add(2.0);
        data.add(1.0);
        data.add(0.0);
        Double d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        /*[Transform from] assertEquals(data.get(3), 1.0, DELTA);*/
        data.get(3);
        /*[Transform from] assertEquals(data.get(4), 0.0, DELTA);*/
        data.get(4);
        // using a copy (explicitly)
        fct = new DoublePercentileAggregatorFunction(DEF_PERC, true);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        /*[Transform from] assertEquals(data.get(3), 1.0, DELTA);*/
        data.get(3);
        /*[Transform from] assertEquals(data.get(4), 0.0, DELTA);*/
        data.get(4);
        // operate on the list directly
        fct = new DoublePercentileAggregatorFunction(DEF_PERC, false);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(4), 4.0, DELTA);*/
        data.get(4);
        assertEquals(data.get(3), 3.0, DELTA);
    }

    @Test
    public void testEvaluateNoCopy_8() throws Exception {
        // using a copy
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = new ArrayList<Double>();
        data.add(4.0);
        data.add(3.0);
        data.add(2.0);
        data.add(1.0);
        data.add(0.0);
        Double d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        /*[Transform from] assertEquals(data.get(3), 1.0, DELTA);*/
        data.get(3);
        /*[Transform from] assertEquals(data.get(4), 0.0, DELTA);*/
        data.get(4);
        // using a copy (explicitly)
        fct = new DoublePercentileAggregatorFunction(DEF_PERC, true);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        /*[Transform from] assertEquals(data.get(3), 1.0, DELTA);*/
        data.get(3);
        /*[Transform from] assertEquals(data.get(4), 0.0, DELTA);*/
        data.get(4);
        // operate on the list directly
        fct = new DoublePercentileAggregatorFunction(DEF_PERC, false);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(4), 4.0, DELTA);*/
        data.get(4);
        /*[Transform from] assertEquals(data.get(3), 3.0, DELTA);*/
        data.get(3);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        assertEquals(data.get(1), 1.0, DELTA);
    }

    @Test
    public void testEvaluateNoCopy_9() throws Exception {
        // using a copy
        DoublePercentileAggregatorFunction fct = (DoublePercentileAggregatorFunction) makeFunctor();
        List<Double> data = new ArrayList<Double>();
        data.add(4.0);
        data.add(3.0);
        data.add(2.0);
        data.add(1.0);
        data.add(0.0);
        Double d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        /*[Transform from] assertEquals(data.get(3), 1.0, DELTA);*/
        data.get(3);
        /*[Transform from] assertEquals(data.get(4), 0.0, DELTA);*/
        data.get(4);
        // using a copy (explicitly)
        fct = new DoublePercentileAggregatorFunction(DEF_PERC, true);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(0), 4.0, DELTA);*/
        data.get(0);
        /*[Transform from] assertEquals(data.get(1), 3.0, DELTA);*/
        data.get(1);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        /*[Transform from] assertEquals(data.get(3), 1.0, DELTA);*/
        data.get(3);
        /*[Transform from] assertEquals(data.get(4), 0.0, DELTA);*/
        data.get(4);
        // operate on the list directly
        fct = new DoublePercentileAggregatorFunction(DEF_PERC, false);
        d = fct.evaluate(data);
        /*[Transform from] assertEquals(d, 3.0, DELTA);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(data.get(4), 4.0, DELTA);*/
        data.get(4);
        /*[Transform from] assertEquals(data.get(3), 3.0, DELTA);*/
        data.get(3);
        /*[Transform from] assertEquals(data.get(2), 2.0, DELTA);*/
        data.get(2);
        /*[Transform from] assertEquals(data.get(1), 1.0, DELTA);*/
        data.get(1);
        assertEquals(data.get(0), 0.0, DELTA);
    }
}

