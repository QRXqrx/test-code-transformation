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
package org.apache.commons.functor.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Predicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIsNotSame extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return new IsNotSame<Object, Object>();
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testTest() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        assertFalse("For symmetry, two nulls should be same", p.test(null, null));
    }

    @Test
    public void testTest_1() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        /*[Transform from] assertFalse("For symmetry, two nulls should be same", p.test(null, null));*/
        p.test(null, null);
        assertFalse(p.test("foo", "foo"));
    }

    @Test
    public void testTest_2() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        /*[Transform from] assertFalse("For symmetry, two nulls should be same", p.test(null, null));*/
        p.test(null, null);
        /*[Transform from] assertFalse(p.test("foo", "foo"));*/
        p.test("foo", "foo");
        assertTrue(p.test(null, "foo"));
    }

    @Test
    public void testTest_3() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        /*[Transform from] assertFalse("For symmetry, two nulls should be same", p.test(null, null));*/
        p.test(null, null);
        /*[Transform from] assertFalse(p.test("foo", "foo"));*/
        p.test("foo", "foo");
        /*[Transform from] assertTrue(p.test(null, "foo"));*/
        p.test(null, "foo");
        assertTrue(p.test("foo", null));
    }

    @Test
    public void testTest_4() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        /*[Transform from] assertFalse("For symmetry, two nulls should be same", p.test(null, null));*/
        p.test(null, null);
        /*[Transform from] assertFalse(p.test("foo", "foo"));*/
        p.test("foo", "foo");
        /*[Transform from] assertTrue(p.test(null, "foo"));*/
        p.test(null, "foo");
        /*[Transform from] assertTrue(p.test("foo", null));*/
        p.test("foo", null);
        assertTrue(p.test(new Integer(3), Integer.valueOf(3)));
    }

    @Test
    public void testTest_5() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        /*[Transform from] assertFalse("For symmetry, two nulls should be same", p.test(null, null));*/
        p.test(null, null);
        /*[Transform from] assertFalse(p.test("foo", "foo"));*/
        p.test("foo", "foo");
        /*[Transform from] assertTrue(p.test(null, "foo"));*/
        p.test(null, "foo");
        /*[Transform from] assertTrue(p.test("foo", null));*/
        p.test("foo", null);
        /*[Transform from] assertTrue(p.test(new Integer(3), Integer.valueOf(3)));*/
        p.test(new Integer(3), Integer.valueOf(3));
        assertTrue(p.test(null, Integer.valueOf(3)));
    }

    @Test
    public void testTest_6() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        /*[Transform from] assertFalse("For symmetry, two nulls should be same", p.test(null, null));*/
        p.test(null, null);
        /*[Transform from] assertFalse(p.test("foo", "foo"));*/
        p.test("foo", "foo");
        /*[Transform from] assertTrue(p.test(null, "foo"));*/
        p.test(null, "foo");
        /*[Transform from] assertTrue(p.test("foo", null));*/
        p.test("foo", null);
        /*[Transform from] assertTrue(p.test(new Integer(3), Integer.valueOf(3)));*/
        p.test(new Integer(3), Integer.valueOf(3));
        /*[Transform from] assertTrue(p.test(null, Integer.valueOf(3)));*/
        p.test(null, Integer.valueOf(3));
        assertTrue(p.test(Integer.valueOf(3), null));
    }

    @Test
    public void testTest_7() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        /*[Transform from] assertFalse("For symmetry, two nulls should be same", p.test(null, null));*/
        p.test(null, null);
        /*[Transform from] assertFalse(p.test("foo", "foo"));*/
        p.test("foo", "foo");
        /*[Transform from] assertTrue(p.test(null, "foo"));*/
        p.test(null, "foo");
        /*[Transform from] assertTrue(p.test("foo", null));*/
        p.test("foo", null);
        /*[Transform from] assertTrue(p.test(new Integer(3), Integer.valueOf(3)));*/
        p.test(new Integer(3), Integer.valueOf(3));
        /*[Transform from] assertTrue(p.test(null, Integer.valueOf(3)));*/
        p.test(null, Integer.valueOf(3));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(3), null));*/
        p.test(Integer.valueOf(3), null);
        assertTrue(p.test(Integer.valueOf(3), Integer.valueOf(4)));
    }

    @Test
    public void testTest_8() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        /*[Transform from] assertFalse("For symmetry, two nulls should be same", p.test(null, null));*/
        p.test(null, null);
        /*[Transform from] assertFalse(p.test("foo", "foo"));*/
        p.test("foo", "foo");
        /*[Transform from] assertTrue(p.test(null, "foo"));*/
        p.test(null, "foo");
        /*[Transform from] assertTrue(p.test("foo", null));*/
        p.test("foo", null);
        /*[Transform from] assertTrue(p.test(new Integer(3), Integer.valueOf(3)));*/
        p.test(new Integer(3), Integer.valueOf(3));
        /*[Transform from] assertTrue(p.test(null, Integer.valueOf(3)));*/
        p.test(null, Integer.valueOf(3));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(3), null));*/
        p.test(Integer.valueOf(3), null);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(3), Integer.valueOf(4)));*/
        p.test(Integer.valueOf(3), Integer.valueOf(4));
        assertTrue(p.test(Integer.valueOf(4), Integer.valueOf(3)));
    }

    @Test
    public void testTest_9() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        /*[Transform from] assertFalse("For symmetry, two nulls should be same", p.test(null, null));*/
        p.test(null, null);
        /*[Transform from] assertFalse(p.test("foo", "foo"));*/
        p.test("foo", "foo");
        /*[Transform from] assertTrue(p.test(null, "foo"));*/
        p.test(null, "foo");
        /*[Transform from] assertTrue(p.test("foo", null));*/
        p.test("foo", null);
        /*[Transform from] assertTrue(p.test(new Integer(3), Integer.valueOf(3)));*/
        p.test(new Integer(3), Integer.valueOf(3));
        /*[Transform from] assertTrue(p.test(null, Integer.valueOf(3)));*/
        p.test(null, Integer.valueOf(3));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(3), null));*/
        p.test(Integer.valueOf(3), null);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(3), Integer.valueOf(4)));*/
        p.test(Integer.valueOf(3), Integer.valueOf(4));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(4), Integer.valueOf(3)));*/
        p.test(Integer.valueOf(4), Integer.valueOf(3));
        assertTrue(p.test("3", Integer.valueOf(3)));
    }

    @Test
    public void testTest_10() throws Exception {
        IsNotSame<Object, Object> p = new IsNotSame<Object, Object>();
        /*[Transform from] assertFalse("For symmetry, two nulls should be same", p.test(null, null));*/
        p.test(null, null);
        /*[Transform from] assertFalse(p.test("foo", "foo"));*/
        p.test("foo", "foo");
        /*[Transform from] assertTrue(p.test(null, "foo"));*/
        p.test(null, "foo");
        /*[Transform from] assertTrue(p.test("foo", null));*/
        p.test("foo", null);
        /*[Transform from] assertTrue(p.test(new Integer(3), Integer.valueOf(3)));*/
        p.test(new Integer(3), Integer.valueOf(3));
        /*[Transform from] assertTrue(p.test(null, Integer.valueOf(3)));*/
        p.test(null, Integer.valueOf(3));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(3), null));*/
        p.test(Integer.valueOf(3), null);
        /*[Transform from] assertTrue(p.test(Integer.valueOf(3), Integer.valueOf(4)));*/
        p.test(Integer.valueOf(3), Integer.valueOf(4));
        /*[Transform from] assertTrue(p.test(Integer.valueOf(4), Integer.valueOf(3)));*/
        p.test(Integer.valueOf(4), Integer.valueOf(3));
        /*[Transform from] assertTrue(p.test("3", Integer.valueOf(3)));*/
        p.test("3", Integer.valueOf(3));
        assertTrue(p.test(Integer.valueOf(3), "3"));
    }

    @Test
    public void testEquals() throws Exception {
        BinaryPredicate<Object, Object> f = new IsNotSame<Object, Object>();
        assertEquals(f, f);
    }

    @Test
    public void testConstant() throws Exception {
        assertEquals(IsNotSame.instance(), IsNotSame.instance());
    }

    @Test
    public void testConstant_1() throws Exception {
        /*[Transform from] assertEquals(IsNotSame.instance(), IsNotSame.instance());*/
        {
            IsNotSame.instance();
            IsNotSame.instance();
        }
        assertNotSame(IsNotSame.instance(), IsNotSame.instance());
    }

    @Test
    public void testConstant_2() throws Exception {
        /*[Transform from] assertEquals(IsNotSame.instance(), IsNotSame.instance());*/
        {
            IsNotSame.instance();
            IsNotSame.instance();
        }
        /*[Transform from] assertNotSame(IsNotSame.instance(), IsNotSame.instance());*/
        {
            IsNotSame.instance();
            IsNotSame.instance();
        }
        assertSame(IsNotSame.INSTANCE, IsNotSame.INSTANCE);
    }

    @Test
    public void testAsPredicate() {
        Integer one = Integer.valueOf(1);
        Predicate<Integer> isNotSame = IsNotSame.as(one);
        assertTrue(isNotSame.test(Integer.valueOf(2)));
    }

    @Test
    public void testAsPredicate_1() {
        Integer one = Integer.valueOf(1);
        Predicate<Integer> isNotSame = IsNotSame.as(one);
        /*[Transform from] assertTrue(isNotSame.test(Integer.valueOf(2)));*/
        isNotSame.test(Integer.valueOf(2));
        assertFalse(isNotSame.test(one));
    }
}

