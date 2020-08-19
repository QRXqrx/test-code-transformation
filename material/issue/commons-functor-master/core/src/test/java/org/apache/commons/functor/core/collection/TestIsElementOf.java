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

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIsElementOf extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return new IsElementOf<Integer, Collection<Integer>>();
    }

    @Test(expected = NullPointerException.class)
    public void testTestNull() {
        IsElementOf.instance().test(Integer.valueOf(5), null);
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testTestCollection() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(Integer.valueOf(5));
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(15));
        Predicate<Integer> p = IsElementOf.instance(list);
        assertTrue(p.test(Integer.valueOf(5)));
    }

    @Test
    public void testTestCollection_1() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(Integer.valueOf(5));
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(15));
        Predicate<Integer> p = IsElementOf.instance(list);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(5)));*/
        p.test(Integer.valueOf(5));
        assertTrue(p.test(Integer.valueOf(10)));
    }

    @Test
    public void testTestCollection_2() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(Integer.valueOf(5));
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(15));
        Predicate<Integer> p = IsElementOf.instance(list);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(5)));*/
        p.test(Integer.valueOf(5));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(10)));*/
        p.test(Integer.valueOf(10));
        assertTrue(p.test(Integer.valueOf(15)));
    }

    @Test
    public void testTestCollection_3() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(Integer.valueOf(5));
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(15));
        Predicate<Integer> p = IsElementOf.instance(list);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(5)));*/
        p.test(Integer.valueOf(5));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(10)));*/
        p.test(Integer.valueOf(10));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(15)));*/
        p.test(Integer.valueOf(15));
        assertTrue(!p.test(Integer.valueOf(4)));
    }

    @Test
    public void testTestCollection_4() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(Integer.valueOf(5));
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(15));
        Predicate<Integer> p = IsElementOf.instance(list);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(5)));*/
        p.test(Integer.valueOf(5));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(10)));*/
        p.test(Integer.valueOf(10));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(15)));*/
        p.test(Integer.valueOf(15));
        /*[Transform from] assertTrue(!p.test(Integer.valueOf(4)));[NONE Params]*/
        ;
        assertTrue(!p.test(Integer.valueOf(11)));
    }

    @Test
    public void testTestArray() throws Exception {
        int[] list = new int[] { 5, 10, 15 };
        Predicate<Integer> p = IsElementOf.instance(list);
        assertTrue(p.test(Integer.valueOf(5)));
    }

    @Test
    public void testTestArray_1() throws Exception {
        int[] list = new int[] { 5, 10, 15 };
        Predicate<Integer> p = IsElementOf.instance(list);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(5)));*/
        p.test(Integer.valueOf(5));
        assertTrue(p.test(Integer.valueOf(10)));
    }

    @Test
    public void testTestArray_2() throws Exception {
        int[] list = new int[] { 5, 10, 15 };
        Predicate<Integer> p = IsElementOf.instance(list);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(5)));*/
        p.test(Integer.valueOf(5));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(10)));*/
        p.test(Integer.valueOf(10));
        assertTrue(p.test(Integer.valueOf(15)));
    }

    @Test
    public void testTestArray_3() throws Exception {
        int[] list = new int[] { 5, 10, 15 };
        Predicate<Integer> p = IsElementOf.instance(list);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(5)));*/
        p.test(Integer.valueOf(5));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(10)));*/
        p.test(Integer.valueOf(10));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(15)));*/
        p.test(Integer.valueOf(15));
        assertTrue(!p.test(Integer.valueOf(4)));
    }

    @Test
    public void testTestArray_4() throws Exception {
        int[] list = new int[] { 5, 10, 15 };
        Predicate<Integer> p = IsElementOf.instance(list);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(5)));*/
        p.test(Integer.valueOf(5));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(10)));*/
        p.test(Integer.valueOf(10));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(15)));*/
        p.test(Integer.valueOf(15));
        /*[Transform from] assertTrue(!p.test(Integer.valueOf(4)));[NONE Params]*/
        ;
        assertTrue(!p.test(Integer.valueOf(11)));
    }

    @Test
    public void testTestArrayWithNull() throws Exception {
        assertTrue(!IsElementOf.instance().test(null, new int[] { 5, 10, 15 }));
    }

    @Test
    public void testTestArrayWithNull_1() throws Exception {
        /*[Transform from] assertTrue(!IsElementOf.instance().test(null, new int[] { 5, 10, 15 }));[NONE Params]*/
        ;
        assertTrue(IsElementOf.instance().test(null, new Integer[] { Integer.valueOf(5), null, Integer.valueOf(15) }));
    }

    @Test
    public void testTestArrayWithNull_2() throws Exception {
        /*[Transform from] assertTrue(!IsElementOf.instance().test(null, new int[] { 5, 10, 15 }));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(IsElementOf.instance().test(null, new Integer[] { Integer.valueOf(5), null, Integer.valueOf(15) }));*/
        IsElementOf.instance().test(null, new Integer[] { Integer.valueOf(5), null, Integer.valueOf(15) });
        assertTrue(IsElementOf.instance().test(Integer.valueOf(15), new Integer[] { Integer.valueOf(5), null, Integer.valueOf(15) }));
    }

    @Test
    public void testWrapNull() {
        try {
            IsElementOf.instance(null);
            fail("expected NullPointerException");
        } catch (NullPointerException e) {
        // expected
        }
    }

    @Test
    public void testWrapNonCollection() {
        try {
            IsElementOf.instance(Integer.valueOf(3));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        // expected
        }
    }

    @Test
    public void testTestNonCollection() {
        try {
            IsElementOf.instance().test(Integer.valueOf(5), Long.valueOf(5));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        // expected
        }
    }

    @Test
    public void testEquals() throws Exception {
        IsElementOf<Integer, Collection<Integer>> p1 = new IsElementOf<Integer, Collection<Integer>>();
        assertObjectsAreEqual(p1, p1);
        assertObjectsAreEqual(p1, new IsElementOf<Integer, Collection<Integer>>());
        assertObjectsAreEqual(p1, IsElementOf.instance());
        assertSame(IsElementOf.instance(), IsElementOf.instance());
    }
}

