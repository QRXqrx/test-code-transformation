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
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestNullaryAnd extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return new NullaryAnd(Constant.TRUE, Constant.TRUE);
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testTrue() throws Exception {
        assertTrue((new NullaryAnd()).test());
    }

    @Test
    public void testTrue_1() throws Exception {
        /*[Transform from] assertTrue((new NullaryAnd()).test());*/
        (new NullaryAnd()).test();
        assertTrue((new NullaryAnd(Constant.TRUE)).test());
    }

    @Test
    public void testTrue_2() throws Exception {
        /*[Transform from] assertTrue((new NullaryAnd()).test());*/
        (new NullaryAnd()).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE)).test();
        assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE)).test());
    }

    @Test
    public void testTrue_3() throws Exception {
        /*[Transform from] assertTrue((new NullaryAnd()).test());*/
        (new NullaryAnd()).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE)).test();
        assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test());
    }

    @Test
    public void testTrue_4() throws Exception {
        /*[Transform from] assertTrue((new NullaryAnd()).test());*/
        (new NullaryAnd()).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test();
        NullaryAnd p = new NullaryAnd(Constant.TRUE);
        assertTrue(p.test());
    }

    @Test
    public void testTrue_5() throws Exception {
        /*[Transform from] assertTrue((new NullaryAnd()).test());*/
        (new NullaryAnd()).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test();
        NullaryAnd p = new NullaryAnd(Constant.TRUE);
        /*[Transform from] assertTrue(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.and(Constant.TRUE);
            assertTrue(p.test());
        }
    }

    @Test
    public void testTrue_6() throws Exception {
        /*[Transform from] assertTrue((new NullaryAnd()).test());*/
        (new NullaryAnd()).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test();
        NullaryAnd p = new NullaryAnd(Constant.TRUE);
        /*[Transform from] assertTrue(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.and(Constant.TRUE);
            /*[Transform from] assertTrue(p.test());*/
            p.test();
        }
        NullaryAnd q = new NullaryAnd(Constant.TRUE);
        assertTrue(q.test());
    }

    @Test
    public void testTrue_7() throws Exception {
        /*[Transform from] assertTrue((new NullaryAnd()).test());*/
        (new NullaryAnd()).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test();
        NullaryAnd p = new NullaryAnd(Constant.TRUE);
        /*[Transform from] assertTrue(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.and(Constant.TRUE);
            /*[Transform from] assertTrue(p.test());*/
            p.test();
        }
        NullaryAnd q = new NullaryAnd(Constant.TRUE);
        /*[Transform from] assertTrue(q.test());*/
        q.test();
        for (int i = 0; i < 10; i++) {
            q.and(Constant.TRUE);
            assertTrue(q.test());
        }
    }

    @Test
    public void testTrue_8() throws Exception {
        /*[Transform from] assertTrue((new NullaryAnd()).test());*/
        (new NullaryAnd()).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE)).test();
        /*[Transform from] assertTrue((new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test());*/
        (new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.TRUE)).test();
        NullaryAnd p = new NullaryAnd(Constant.TRUE);
        /*[Transform from] assertTrue(p.test());*/
        p.test();
        for (int i = 0; i < 10; i++) {
            p.and(Constant.TRUE);
            /*[Transform from] assertTrue(p.test());*/
            p.test();
        }
        NullaryAnd q = new NullaryAnd(Constant.TRUE);
        /*[Transform from] assertTrue(q.test());*/
        q.test();
        for (int i = 0; i < 10; i++) {
            q.and(Constant.TRUE);
            /*[Transform from] assertTrue(q.test());*/
            q.test();
        }
        NullaryAnd r = new NullaryAnd(p, q);
        assertTrue(r.test());
    }

    @Test
    public void testFalse() throws Exception {
        assertTrue(!(new NullaryAnd(Constant.FALSE)).test());
    }

    @Test
    public void testFalse_1() throws Exception {
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.FALSE)).test());[NONE Params]*/
        ;
        assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.FALSE)).test());
    }

    @Test
    public void testFalse_2() throws Exception {
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.FALSE)).test());
    }

    @Test
    public void testFalse_3() throws Exception {
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        NullaryAnd p = new NullaryAnd(Constant.FALSE);
        assertTrue(!p.test());
    }

    @Test
    public void testFalse_4() throws Exception {
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        NullaryAnd p = new NullaryAnd(Constant.FALSE);
        /*[Transform from] assertTrue(!p.test());[NONE Params]*/
        ;
        for (int i = 0; i < 10; i++) {
            p.and(Constant.FALSE);
            assertTrue(!p.test());
        }
    }

    @Test
    public void testFalse_5() throws Exception {
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        NullaryAnd p = new NullaryAnd(Constant.FALSE);
        /*[Transform from] assertTrue(!p.test());[NONE Params]*/
        ;
        for (int i = 0; i < 10; i++) {
            p.and(Constant.FALSE);
            /*[Transform from] assertTrue(!p.test());[NONE Params]*/
            ;
        }
        NullaryAnd q = new NullaryAnd(Constant.TRUE);
        assertTrue(q.test());
    }

    @Test
    public void testFalse_6() throws Exception {
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        NullaryAnd p = new NullaryAnd(Constant.FALSE);
        /*[Transform from] assertTrue(!p.test());[NONE Params]*/
        ;
        for (int i = 0; i < 10; i++) {
            p.and(Constant.FALSE);
            /*[Transform from] assertTrue(!p.test());[NONE Params]*/
            ;
        }
        NullaryAnd q = new NullaryAnd(Constant.TRUE);
        /*[Transform from] assertTrue(q.test());*/
        q.test();
        for (int i = 0; i < 10; i++) {
            q.and(Constant.TRUE);
            assertTrue(q.test());
        }
    }

    @Test
    public void testFalse_7() throws Exception {
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new NullaryAnd(Constant.TRUE, Constant.TRUE, Constant.FALSE)).test());[NONE Params]*/
        ;
        NullaryAnd p = new NullaryAnd(Constant.FALSE);
        /*[Transform from] assertTrue(!p.test());[NONE Params]*/
        ;
        for (int i = 0; i < 10; i++) {
            p.and(Constant.FALSE);
            /*[Transform from] assertTrue(!p.test());[NONE Params]*/
            ;
        }
        NullaryAnd q = new NullaryAnd(Constant.TRUE);
        /*[Transform from] assertTrue(q.test());*/
        q.test();
        for (int i = 0; i < 10; i++) {
            q.and(Constant.TRUE);
            /*[Transform from] assertTrue(q.test());*/
            q.test();
        }
        NullaryAnd r = new NullaryAnd(p, q);
        assertTrue(!r.test());
    }

    @Test
    public void testDuplicateAdd() throws Exception {
        NullaryPredicate p = Constant.TRUE;
        NullaryAnd q = new NullaryAnd(p, p);
        assertTrue(q.test());
    }

    @Test
    public void testDuplicateAdd_1() throws Exception {
        NullaryPredicate p = Constant.TRUE;
        NullaryAnd q = new NullaryAnd(p, p);
        /*[Transform from] assertTrue(q.test());*/
        q.test();
        for (int i = 0; i < 10; i++) {
            q.and(p);
            assertTrue(q.test());
        }
    }

    @Test
    public void testEquals() throws Exception {
        NullaryAnd p = new NullaryAnd();
        assertEquals(p, p);
    }

    @Test
    public void testEquals_1() throws Exception {
        NullaryAnd p = new NullaryAnd();
        /*[Transform from] assertEquals(p, p);[NONE Params]*/
        ;
        NullaryAnd q = new NullaryAnd();
        assertObjectsAreEqual(p, q);
        for (int i = 0; i < 3; i++) {
            p.and(Constant.TRUE);
            assertObjectsAreNotEqual(p, q);
            q.and(Constant.truePredicate());
            assertObjectsAreEqual(p, q);
            p.and(new NullaryAnd(Constant.TRUE, Constant.FALSE));
            assertObjectsAreNotEqual(p, q);
            q.and(new NullaryAnd(Constant.TRUE, Constant.FALSE));
            assertObjectsAreEqual(p, q);
        }
        assertObjectsAreNotEqual(p, Constant.TRUE);
        Iterable<NullaryPredicate> iterable = Arrays.<NullaryPredicate>asList(Constant.TRUE, new NullaryAnd(Constant.TRUE, Constant.FALSE), Constant.TRUE, new NullaryAnd(Constant.TRUE, Constant.FALSE), Constant.TRUE, new NullaryAnd(Constant.TRUE, Constant.FALSE));
        assertObjectsAreEqual(p, new NullaryAnd(iterable));
        assertObjectsAreNotEqual(p, new NullaryAnd((Iterable<NullaryPredicate>) null));
        assertObjectsAreNotEqual(p, new NullaryAnd((NullaryPredicate[]) null));
        assertObjectsAreNotEqual(p, new NullaryAnd((NullaryPredicate) null));
        assertTrue(!p.equals(null));
    }
}

