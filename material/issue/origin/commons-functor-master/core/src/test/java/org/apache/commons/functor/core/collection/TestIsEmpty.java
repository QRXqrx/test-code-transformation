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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIsEmpty extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {
        return new IsEmpty<Object>();
    }

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testTest() throws Exception {
        assertTrue(IsEmpty.instance().test(Collections.EMPTY_LIST));
        assertTrue(IsEmpty.instance().test(Collections.EMPTY_SET));
        {
            List<String> list = new ArrayList<String>();
            assertTrue(IsEmpty.instance().test(list));
            list.add("Xyzzy");
            assertTrue(!IsEmpty.instance().test(list));
        }
        {
            Set<String> set = new HashSet<String>();
            assertTrue(IsEmpty.instance().test(set));
            set.add("Xyzzy");
            assertTrue(!IsEmpty.instance().test(set));
        }
    }

    @Test(expected = NullPointerException.class)
    public void testTestNull() throws Exception {
        IsEmpty.instance().test(null);
    }

    @Test
    public void testTestNonCollection() throws Exception {
        try {
            IsEmpty.instance().test(Integer.valueOf(3));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testTestArray() throws Exception {
        assertTrue(!IsEmpty.instance().test(new int[10]));
        assertTrue(!IsEmpty.instance().test(new Object[10]));
        assertTrue(IsEmpty.instance().test(new int[0]));
        assertTrue(IsEmpty.instance().test(new Object[0]));
    }

    @Test
    public void testTestString() throws Exception {
        assertTrue(!IsEmpty.instance().test("xyzzy"));
        assertTrue(IsEmpty.instance().test(""));
    }

    @Test
    public void testTestMap() throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        assertTrue(IsEmpty.instance().test(map));
        map.put("x", "y");
        assertTrue(!IsEmpty.instance().test(map));
    }

    @Test
    public void testEquals() throws Exception {
        Predicate<String> p = new IsEmpty<String>();
        assertEquals(p, p);
        assertObjectsAreEqual(p, new IsEmpty<Long>());
        assertObjectsAreEqual(p, IsEmpty.instance());
        assertObjectsAreNotEqual(p, new Constant<Boolean>(Boolean.TRUE));
    }

}
