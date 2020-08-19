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
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.core.Constant;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
@SuppressWarnings("unchecked")
public class TestOr extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return new Or<Object>(Constant.FALSE, Constant.TRUE);
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testTrue() throws Exception {
        assertTrue((new Or<Object>(Constant.TRUE)).test("xyzzy"));
    }

    @Test
    public void testTrue_1() throws Exception {
        /*[Transform from] assertTrue((new Or<Object>(Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.TRUE)).test("xyzzy");
        assertTrue((new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy"));
    }

    @Test
    public void testTrue_2() throws Exception {
        /*[Transform from] assertTrue((new Or<Object>(Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy");
        assertTrue((new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy"));
    }

    @Test
    public void testTrue_3() throws Exception {
        /*[Transform from] assertTrue((new Or<Object>(Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy");
        Or<Object> p = new Or<Object>(Constant.TRUE);
        assertTrue(p.test("xyzzy"));
    }

    @Test
    public void testTrue_4() throws Exception {
        /*[Transform from] assertTrue((new Or<Object>(Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy");
        Or<Object> p = new Or<Object>(Constant.TRUE);
        /*[Transform from] assertTrue(p.test("xyzzy"));*/
        p.test("xyzzy");
        for (int i = 0; i < 10; i++) {
            p.or(Constant.of(i % 2 == 0));
            assertTrue(p.test("xyzzy"));
        }
    }

    @Test
    public void testTrue_5() throws Exception {
        /*[Transform from] assertTrue((new Or<Object>(Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy");
        Or<Object> p = new Or<Object>(Constant.TRUE);
        /*[Transform from] assertTrue(p.test("xyzzy"));*/
        p.test("xyzzy");
        for (int i = 0; i < 10; i++) {
            p.or(Constant.of(i % 2 == 0));
            /*[Transform from] assertTrue(p.test("xyzzy"));*/
            p.test("xyzzy");
        }
        Or<Object> q = new Or<Object>(Constant.TRUE);
        assertTrue(q.test("xyzzy"));
    }

    @Test
    public void testTrue_6() throws Exception {
        /*[Transform from] assertTrue((new Or<Object>(Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy");
        Or<Object> p = new Or<Object>(Constant.TRUE);
        /*[Transform from] assertTrue(p.test("xyzzy"));*/
        p.test("xyzzy");
        for (int i = 0; i < 10; i++) {
            p.or(Constant.of(i % 2 == 0));
            /*[Transform from] assertTrue(p.test("xyzzy"));*/
            p.test("xyzzy");
        }
        Or<Object> q = new Or<Object>(Constant.TRUE);
        /*[Transform from] assertTrue(q.test("xyzzy"));*/
        q.test("xyzzy");
        for (int i = 0; i < 10; i++) {
            q.or(Constant.of(i % 2 == 0));
            assertTrue(q.test("xyzzy"));
        }
    }

    @Test
    public void testTrue_7() throws Exception {
        /*[Transform from] assertTrue((new Or<Object>(Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.TRUE)).test("xyzzy");
        /*[Transform from] assertTrue((new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy"));*/
        (new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.TRUE)).test("xyzzy");
        Or<Object> p = new Or<Object>(Constant.TRUE);
        /*[Transform from] assertTrue(p.test("xyzzy"));*/
        p.test("xyzzy");
        for (int i = 0; i < 10; i++) {
            p.or(Constant.of(i % 2 == 0));
            /*[Transform from] assertTrue(p.test("xyzzy"));*/
            p.test("xyzzy");
        }
        Or<Object> q = new Or<Object>(Constant.TRUE);
        /*[Transform from] assertTrue(q.test("xyzzy"));*/
        q.test("xyzzy");
        for (int i = 0; i < 10; i++) {
            q.or(Constant.of(i % 2 == 0));
            /*[Transform from] assertTrue(q.test("xyzzy"));*/
            q.test("xyzzy");
        }
        Or<Object> r = new Or<Object>(p, q);
        assertTrue(r.test("xyzzy"));
    }

    @Test
    public void testFalse() throws Exception {
        assertTrue(!(new Or<Object>()).test("xyzzy"));
    }

    @Test
    public void testFalse_1() throws Exception {
        /*[Transform from] assertTrue(!(new Or<Object>()).test("xyzzy"));[NONE Params]*/
        ;
        assertTrue(!(new Or<Object>(Constant.FALSE)).test("xyzzy"));
    }

    @Test
    public void testFalse_2() throws Exception {
        /*[Transform from] assertTrue(!(new Or<Object>()).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE)).test("xyzzy"));
    }

    @Test
    public void testFalse_3() throws Exception {
        /*[Transform from] assertTrue(!(new Or<Object>()).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.FALSE)).test("xyzzy"));
    }

    @Test
    public void testFalse_4() throws Exception {
        /*[Transform from] assertTrue(!(new Or<Object>()).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        Or<Object> p = new Or<Object>(Constant.FALSE);
        assertTrue(!p.test("xyzzy"));
    }

    @Test
    public void testFalse_5() throws Exception {
        /*[Transform from] assertTrue(!(new Or<Object>()).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        Or<Object> p = new Or<Object>(Constant.FALSE);
        /*[Transform from] assertTrue(!p.test("xyzzy"));[NONE Params]*/
        ;
        for (int i = 0; i < 10; i++) {
            p.or(Constant.FALSE);
            assertTrue(!p.test("xyzzy"));
        }
    }

    @Test
    public void testFalse_6() throws Exception {
        /*[Transform from] assertTrue(!(new Or<Object>()).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        Or<Object> p = new Or<Object>(Constant.FALSE);
        /*[Transform from] assertTrue(!p.test("xyzzy"));[NONE Params]*/
        ;
        for (int i = 0; i < 10; i++) {
            p.or(Constant.FALSE);
            /*[Transform from] assertTrue(!p.test("xyzzy"));[NONE Params]*/
            ;
        }
        Or<Object> q = new Or<Object>(Constant.FALSE);
        assertTrue(!q.test("xyzzy"));
    }

    @Test
    public void testFalse_7() throws Exception {
        /*[Transform from] assertTrue(!(new Or<Object>()).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        Or<Object> p = new Or<Object>(Constant.FALSE);
        /*[Transform from] assertTrue(!p.test("xyzzy"));[NONE Params]*/
        ;
        for (int i = 0; i < 10; i++) {
            p.or(Constant.FALSE);
            /*[Transform from] assertTrue(!p.test("xyzzy"));[NONE Params]*/
            ;
        }
        Or<Object> q = new Or<Object>(Constant.FALSE);
        /*[Transform from] assertTrue(!q.test("xyzzy"));[NONE Params]*/
        ;
        for (int i = 0; i < 10; i++) {
            q.or(Constant.FALSE);
            assertTrue(!q.test("xyzzy"));
        }
    }

    @Test
    public void testFalse_8() throws Exception {
        /*[Transform from] assertTrue(!(new Or<Object>()).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!(new Or<Object>(Constant.FALSE, Constant.FALSE, Constant.FALSE)).test("xyzzy"));[NONE Params]*/
        ;
        Or<Object> p = new Or<Object>(Constant.FALSE);
        /*[Transform from] assertTrue(!p.test("xyzzy"));[NONE Params]*/
        ;
        for (int i = 0; i < 10; i++) {
            p.or(Constant.FALSE);
            /*[Transform from] assertTrue(!p.test("xyzzy"));[NONE Params]*/
            ;
        }
        Or<Object> q = new Or<Object>(Constant.FALSE);
        /*[Transform from] assertTrue(!q.test("xyzzy"));[NONE Params]*/
        ;
        for (int i = 0; i < 10; i++) {
            q.or(Constant.FALSE);
            /*[Transform from] assertTrue(!q.test("xyzzy"));[NONE Params]*/
            ;
        }
        Or<Object> r = new Or<Object>(p, q);
        assertTrue(!r.test("xyzzy"));
    }

    @Test
    public void testDuplicateAdd() throws Exception {
        Predicate<Object> p = Constant.TRUE;
        Or<Object> q = new Or<Object>(p, p);
        assertTrue(q.test("xyzzy"));
    }

    @Test
    public void testDuplicateAdd_1() throws Exception {
        Predicate<Object> p = Constant.TRUE;
        Or<Object> q = new Or<Object>(p, p);
        /*[Transform from] assertTrue(q.test("xyzzy"));*/
        q.test("xyzzy");
        for (int i = 0; i < 10; i++) {
            q.or(p);
            assertTrue(q.test("xyzzy"));
        }
    }

    @Test
    public void testEquals() throws Exception {
        Or<Object> p = new Or<Object>();
        assertEquals(p, p);
    }
}

