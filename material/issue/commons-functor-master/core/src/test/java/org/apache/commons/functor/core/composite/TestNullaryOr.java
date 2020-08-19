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
package org.apache.commons.functor.core.composite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestNullaryOr extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return new NullaryOr(Constant.FALSE, Constant.TRUE);
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testConstructors() {
        NullaryOr or = new NullaryOr(Constant.FALSE);
        assertEquals(Boolean.FALSE, or.test());
    }

    @Test
    public void testConstructors_1() {
        NullaryOr or = new NullaryOr(Constant.FALSE);
        /*[Transform from] assertEquals(Boolean.FALSE, or.test());*/
        or.test();
        NullaryOr or2 = new NullaryOr((Iterable<NullaryPredicate>) Arrays.asList((NullaryPredicate) Constant.truePredicate()));
        assertEquals(Boolean.TRUE, or2.test());
    }

    @Test
    public void testConstructors_2() {
        NullaryOr or = new NullaryOr(Constant.FALSE);
        /*[Transform from] assertEquals(Boolean.FALSE, or.test());*/
        or.test();
        NullaryOr or2 = new NullaryOr((Iterable<NullaryPredicate>) Arrays.asList((NullaryPredicate) Constant.truePredicate()));
        /*[Transform from] assertEquals(Boolean.TRUE, or2.test());*/
        or2.test();
        NullaryOr or3 = new NullaryOr((NullaryPredicate) null);
        assertEquals(Boolean.FALSE, or3.test());
    }

    @Test
    public void testConstructors_3() {
        NullaryOr or = new NullaryOr(Constant.FALSE);
        /*[Transform from] assertEquals(Boolean.FALSE, or.test());*/
        or.test();
        NullaryOr or2 = new NullaryOr((Iterable<NullaryPredicate>) Arrays.asList((NullaryPredicate) Constant.truePredicate()));
        /*[Transform from] assertEquals(Boolean.TRUE, or2.test());*/
        or2.test();
        NullaryOr or3 = new NullaryOr((NullaryPredicate) null);
        /*[Transform from] assertEquals(Boolean.FALSE, or3.test());*/
        or3.test();
        NullaryOr or4 = new NullaryOr((Iterable<NullaryPredicate>) null);
        assertEquals(Boolean.FALSE, or4.test());
    }

    @Test
    public void testTrue() throws Exception {
        assertTrue((new NullaryOr(Constant.TRUE)).test());
    }

    @Test
    public void testTrue_1() throws Exception {
        /*[Transform from] assertTrue((new NullaryOr(Constant.TRUE)).test());*/
        (new NullaryOr(Constant.TRUE)).test();
        assertTrue((new NullaryOr(Constant.FALSE, Constant.TRUE)).test());
    }

    @Test
    public void testTrue_2() throws Exception {
        /*[Transform from] assertTrue((new NullaryOr(Constant.TRUE)).test());*/
        (new NullaryOr(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.TRUE)).test();
        assertTrue((new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test());
    }

    @Test
    public void testTrue_3() throws Exception {
        /*[Transform from] assertTrue((new NullaryOr(Constant.TRUE)).test());*/
        (new NullaryOr(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test();
        NullaryOr p = new NullaryOr(Constant.TRUE);
        assertTrue(p.test());
    }

    @Test
    public void testTrue_4() throws Exception {
        /*[Transform from] assertTrue((new NullaryOr(Constant.TRUE)).test());*/
        (new NullaryOr(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test();
        NullaryOr p = new NullaryOr(Constant.TRUE);
        /*[Transform from] assertTrue(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.or(Constant.of(i % 2 == 0));
            assertTrue(p.test());
        }
    }

    @Test
    public void testTrue_5() throws Exception {
        /*[Transform from] assertTrue((new NullaryOr(Constant.TRUE)).test());*/
        (new NullaryOr(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test();
        NullaryOr p = new NullaryOr(Constant.TRUE);
        /*[Transform from] assertTrue(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.or(Constant.of(i % 2 == 0));
            /*[Transform from] assertTrue(p.test());*/
            p.test();
        }
        NullaryOr q = new NullaryOr(Constant.TRUE);
        assertTrue(q.test());
    }

    @Test
    public void testTrue_6() throws Exception {
        /*[Transform from] assertTrue((new NullaryOr(Constant.TRUE)).test());*/
        (new NullaryOr(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test();
        NullaryOr p = new NullaryOr(Constant.TRUE);
        /*[Transform from] assertTrue(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.or(Constant.of(i % 2 == 0));
            /*[Transform from] assertTrue(p.test());*/
            p.test();
        }
        NullaryOr q = new NullaryOr(Constant.TRUE);
        /*[Transform from] assertTrue(q.test());*/
        q.test();
        for (int i = 0; i < 10; i++) {
            q.or(Constant.of(i % 2 == 0));
            assertTrue(q.test());
        }
    }

    @Test
    public void testTrue_7() throws Exception {
        /*[Transform from] assertTrue((new NullaryOr(Constant.TRUE)).test());*/
        (new NullaryOr(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test());*/
        (new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test();
        NullaryOr p = new NullaryOr(Constant.TRUE);
        /*[Transform from] assertTrue(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.or(Constant.of(i % 2 == 0));
            /*[Transform from] assertTrue(p.test());*/
            p.test();
        }
        NullaryOr q = new NullaryOr(Constant.TRUE);
        /*[Transform from] assertTrue(q.test());*/
        q.test();
        for (int i = 0; i < 10; i++) {
            q.or(Constant.of(i % 2 == 0));
            /*[Transform from] assertTrue(q.test());*/
            q.test();
        }
        NullaryOr r = new NullaryOr(p, q);
        assertTrue(r.test());
    }

    @Test
    public void testFalse() throws Exception {
        assertFalse(new NullaryOr().test());
    }

    @Test
    public void testFalse_1() throws Exception {
        /*[Transform from] assertFalse(new NullaryOr().test());*/
        new NullaryOr().test();
        assertFalse(new NullaryOr(Constant.FALSE).test());
    }

    @Test
    public void testFalse_2() throws Exception {
        /*[Transform from] assertFalse(new NullaryOr().test());*/
        new NullaryOr().test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE).test();
        assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE).test());
    }

    @Test
    public void testFalse_3() throws Exception {
        /*[Transform from] assertFalse(new NullaryOr().test());*/
        new NullaryOr().test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE).test();
        assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test());
    }

    @Test
    public void testFalse_4() throws Exception {
        /*[Transform from] assertFalse(new NullaryOr().test());*/
        new NullaryOr().test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test();
        NullaryOr p = new NullaryOr(Constant.FALSE);
        assertFalse(p.test());
    }

    @Test
    public void testFalse_5() throws Exception {
        /*[Transform from] assertFalse(new NullaryOr().test());*/
        new NullaryOr().test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test();
        NullaryOr p = new NullaryOr(Constant.FALSE);
        /*[Transform from] assertFalse(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.or(Constant.FALSE);
            assertFalse(p.test());
        }
    }

    @Test
    public void testFalse_6() throws Exception {
        /*[Transform from] assertFalse(new NullaryOr().test());*/
        new NullaryOr().test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test();
        NullaryOr p = new NullaryOr(Constant.FALSE);
        /*[Transform from] assertFalse(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.or(Constant.FALSE);
            /*[Transform from] assertFalse(p.test());*/
            p.test();
        }
        NullaryOr q = new NullaryOr(Constant.FALSE);
        assertFalse(q.test());
    }

    @Test
    public void testFalse_7() throws Exception {
        /*[Transform from] assertFalse(new NullaryOr().test());*/
        new NullaryOr().test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test();
        NullaryOr p = new NullaryOr(Constant.FALSE);
        /*[Transform from] assertFalse(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.or(Constant.FALSE);
            /*[Transform from] assertFalse(p.test());*/
            p.test();
        }
        NullaryOr q = new NullaryOr(Constant.FALSE);
        /*[Transform from] assertFalse(q.test());*/
        q.test();
        for (int i = 0; i < 10; i++) {
            q.or(Constant.FALSE);
            assertFalse(q.test());
        }
    }

    @Test
    public void testFalse_8() throws Exception {
        /*[Transform from] assertFalse(new NullaryOr().test());*/
        new NullaryOr().test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE).test();
        /*[Transform from] assertFalse(new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test());*/
        new NullaryOr(Constant.FALSE, Constant.FALSE, Constant.FALSE).test();
        NullaryOr p = new NullaryOr(Constant.FALSE);
        /*[Transform from] assertFalse(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.or(Constant.FALSE);
            /*[Transform from] assertFalse(p.test());*/
            p.test();
        }
        NullaryOr q = new NullaryOr(Constant.FALSE);
        /*[Transform from] assertFalse(q.test());*/
        q.test();
        for (int i = 0; i < 10; i++) {
            q.or(Constant.FALSE);
            /*[Transform from] assertFalse(q.test());*/
            q.test();
        }
        NullaryOr r = new NullaryOr(p, q);
        assertTrue(!r.test());
    }

    @Test
    public void testDuplicateAdd() throws Exception {
        NullaryPredicate p = Constant.TRUE;
        NullaryOr q = new NullaryOr(p, p);
        assertTrue(q.test());
    }

    @Test
    public void testDuplicateAdd_1() throws Exception {
        NullaryPredicate p = Constant.TRUE;
        NullaryOr q = new NullaryOr(p, p);
        /*[Transform from] assertTrue(q.test());*/
        q.test();
        for (int i = 0; i < 10; i++) {
            q.or(p);
            assertTrue(q.test());
        }
    }

    @Test
    public void testEquals() throws Exception {
        NullaryOr p = new NullaryOr();
        assertEquals(p, p);
    }

    @Test
    public void testEquals_1() throws Exception {
        NullaryOr p = new NullaryOr();
        /*[Transform from] assertEquals(p, p);[NONE Params]*/
        ;
        NullaryOr q = new NullaryOr();
        assertObjectsAreEqual(p, q);
        NullaryAnd r = new NullaryAnd();
        assertObjectsAreNotEqual(p, r);
        for (int i = 0; i < 3; i++) {
            p.or(Constant.TRUE);
            assertObjectsAreNotEqual(p, q);
            q.or(Constant.TRUE);
            assertObjectsAreEqual(p, q);
            r.and(Constant.TRUE);
            assertObjectsAreNotEqual(p, r);
            p.or(new NullaryOr(Constant.TRUE, Constant.FALSE));
            assertObjectsAreNotEqual(p, q);
            q.or(new NullaryOr(Constant.TRUE, Constant.FALSE));
            assertObjectsAreEqual(p, q);
            r.and(new NullaryOr(Constant.TRUE, Constant.FALSE));
            assertObjectsAreNotEqual(p, r);
        }
        assertObjectsAreNotEqual(p, Constant.TRUE);
        assertObjectsAreNotEqual(p, new NullaryOr((Iterable<NullaryPredicate>) null));
        assertObjectsAreNotEqual(p, new NullaryOr((NullaryPredicate[]) null));
        assertObjectsAreNotEqual(p, new NullaryOr((NullaryPredicate) null));
        assertTrue(!p.equals(null));
    }
}

