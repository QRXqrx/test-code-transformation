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
package org.apache.commons.functor.core.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestSize extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return new Size<Object>();
    }

    @Test(expected = NullPointerException.class)
    public void testEvaluateNull() throws Exception {
        Size.instance().evaluate(null);
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() throws Exception {
        assertEquals(Integer.valueOf(0), Size.instance().evaluate(Collections.EMPTY_LIST));
    }

    @Test
    public void testEvaluate_1() throws Exception {
        /*[Transform from] assertEquals(Integer.valueOf(0), Size.instance().evaluate(Collections.EMPTY_LIST));*/
        {
            Integer.valueOf(0);
            Size.instance().evaluate(Collections.EMPTY_LIST);
        }
        assertEquals(Integer.valueOf(0), Size.instance().evaluate(Collections.EMPTY_SET));
    }

    @Test
    public void testEvaluateNonCollection() throws Exception {
        try {
            Size.instance().evaluate(Integer.valueOf(3));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        // expected
        }
    }

    @Test
    public void testEvaluateArray() throws Exception {
        assertEquals(Integer.valueOf(10), Size.instance().evaluate(new int[10]));
    }

    @Test
    public void testEvaluateArray_1() throws Exception {
        /*[Transform from] assertEquals(Integer.valueOf(10), Size.instance().evaluate(new int[10]));*/
        {
            Integer.valueOf(10);
            Size.instance().evaluate(new int[10]);
        }
        assertEquals(Integer.valueOf(7), Size.instance().evaluate(new String[7]));
    }

    @Test
    public void testEvaluateString() throws Exception {
        assertEquals(Integer.valueOf("xyzzy".length()), Size.instance().evaluate("xyzzy"));
    }

    @Test
    public void testEquals() throws Exception {
        Function<Object, Integer> f = new Size<Object>();
        assertEquals(f, f);
    }

    @Test
    public void testEquals_1() throws Exception {
        Function<Object, Integer> f = new Size<Object>();
        /*[Transform from] assertEquals(f, f);[NONE Params]*/
        ;
        assertObjectsAreEqual(f, new Size<Object>());
        assertObjectsAreEqual(f, Size.instance());
        assertSame(Size.instance(), Size.instance());
    }

    @Test
    public void testEquals_2() throws Exception {
        Function<Object, Integer> f = new Size<Object>();
        /*[Transform from] assertEquals(f, f);[NONE Params]*/
        ;
        assertObjectsAreEqual(f, new Size<Object>());
        assertObjectsAreEqual(f, Size.instance());
        /*[Transform from] assertSame(Size.instance(), Size.instance());*/
        {
            Size.instance();
            Size.instance();
        }
        assertObjectsAreNotEqual(f, new Constant<Object>(null));
        assertTrue(!f.equals((Size<?>) null));
    }
}

