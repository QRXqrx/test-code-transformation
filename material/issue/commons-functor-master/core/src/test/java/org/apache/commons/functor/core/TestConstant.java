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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.functor.BaseFunctorTest;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestConstant extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return new Constant<Object>("K");
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() throws Exception {
        Constant<Object> f = new Constant<Object>("xyzzy");
        assertEquals("xyzzy", f.evaluate());
    }

    @Test
    public void testEvaluate_1() throws Exception {
        Constant<Object> f = new Constant<Object>("xyzzy");
        /*[Transform from] assertEquals("xyzzy", f.evaluate());*/
        f.evaluate();
        assertEquals("xyzzy", f.evaluate(null));
    }

    @Test
    public void testEvaluate_2() throws Exception {
        Constant<Object> f = new Constant<Object>("xyzzy");
        /*[Transform from] assertEquals("xyzzy", f.evaluate());*/
        f.evaluate();
        /*[Transform from] assertEquals("xyzzy", f.evaluate(null));*/
        f.evaluate(null);
        assertEquals("xyzzy", f.evaluate(null, null));
    }

    @Test
    public void testEvaluate_3() throws Exception {
        Constant<Object> f = new Constant<Object>("xyzzy");
        /*[Transform from] assertEquals("xyzzy", f.evaluate());*/
        f.evaluate();
        /*[Transform from] assertEquals("xyzzy", f.evaluate(null));*/
        f.evaluate(null);
        /*[Transform from] assertEquals("xyzzy", f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertEquals("xyzzy", f.evaluate());*/
        f.evaluate();
        assertEquals("xyzzy", f.evaluate("foo"));
    }

    @Test
    public void testEvaluate_4() throws Exception {
        Constant<Object> f = new Constant<Object>("xyzzy");
        /*[Transform from] assertEquals("xyzzy", f.evaluate());*/
        f.evaluate();
        /*[Transform from] assertEquals("xyzzy", f.evaluate(null));*/
        f.evaluate(null);
        /*[Transform from] assertEquals("xyzzy", f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertEquals("xyzzy", f.evaluate());*/
        f.evaluate();
        /*[Transform from] assertEquals("xyzzy", f.evaluate("foo"));*/
        f.evaluate("foo");
        assertEquals("xyzzy", f.evaluate("foo", Integer.valueOf(2)));
    }

    @Test
    public void testEvaluateConstantNull() throws Exception {
        Constant<Object> f = new Constant<Object>(null);
        assertNull(f.evaluate());
    }

    @Test
    public void testEvaluateConstantNull_1() throws Exception {
        Constant<Object> f = new Constant<Object>(null);
        /*[Transform from] assertNull(f.evaluate());*/
        f.evaluate();
        assertNull(f.evaluate(null));
    }

    @Test
    public void testEvaluateConstantNull_2() throws Exception {
        Constant<Object> f = new Constant<Object>(null);
        /*[Transform from] assertNull(f.evaluate());*/
        f.evaluate();
        /*[Transform from] assertNull(f.evaluate(null));*/
        f.evaluate(null);
        assertNull(f.evaluate(null, null));
    }

    @Test
    public void testEvaluateConstantNull_3() throws Exception {
        Constant<Object> f = new Constant<Object>(null);
        /*[Transform from] assertNull(f.evaluate());*/
        f.evaluate();
        /*[Transform from] assertNull(f.evaluate(null));*/
        f.evaluate(null);
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertNull(f.evaluate());*/
        f.evaluate();
        assertNull(f.evaluate("foo"));
    }

    @Test
    public void testEvaluateConstantNull_4() throws Exception {
        Constant<Object> f = new Constant<Object>(null);
        /*[Transform from] assertNull(f.evaluate());*/
        f.evaluate();
        /*[Transform from] assertNull(f.evaluate(null));*/
        f.evaluate(null);
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertNull(f.evaluate());*/
        f.evaluate();
        /*[Transform from] assertNull(f.evaluate("foo"));*/
        f.evaluate("foo");
        assertNull(f.evaluate("foo", Integer.valueOf(2)));
    }

    @Test
    public void testConstantTrue() throws Exception {
        Constant<Object> truePred = new Constant<Object>(Boolean.TRUE);
        assertTrue(truePred.test());
    }

    @Test
    public void testConstantTrue_1() throws Exception {
        Constant<Object> truePred = new Constant<Object>(Boolean.TRUE);
        /*[Transform from] assertTrue(truePred.test());*/
        truePred.test();
        assertTrue(truePred.test(null));
    }

    @Test
    public void testConstantTrue_2() throws Exception {
        Constant<Object> truePred = new Constant<Object>(Boolean.TRUE);
        /*[Transform from] assertTrue(truePred.test());*/
        truePred.test();
        /*[Transform from] assertTrue(truePred.test(null));*/
        truePred.test(null);
        assertTrue(truePred.test(null, null));
    }

    @Test
    public void testConstantTrue_3() throws Exception {
        Constant<Object> truePred = new Constant<Object>(Boolean.TRUE);
        /*[Transform from] assertTrue(truePred.test());*/
        truePred.test();
        /*[Transform from] assertTrue(truePred.test(null));*/
        truePred.test(null);
        /*[Transform from] assertTrue(truePred.test(null, null));*/
        truePred.test(null, null);
        /*[Transform from] assertTrue(truePred.test());*/
        truePred.test();
        assertTrue(truePred.test("foo"));
    }

    @Test
    public void testConstantTrue_4() throws Exception {
        Constant<Object> truePred = new Constant<Object>(Boolean.TRUE);
        /*[Transform from] assertTrue(truePred.test());*/
        truePred.test();
        /*[Transform from] assertTrue(truePred.test(null));*/
        truePred.test(null);
        /*[Transform from] assertTrue(truePred.test(null, null));*/
        truePred.test(null, null);
        /*[Transform from] assertTrue(truePred.test());*/
        truePred.test();
        /*[Transform from] assertTrue(truePred.test("foo"));*/
        truePred.test("foo");
        assertTrue(truePred.test("foo", Integer.valueOf(2)));
    }

    @Test
    public void testConstantFalse() throws Exception {
        Constant<Object> falsePred = new Constant<Object>(Boolean.FALSE);
        assertTrue(!falsePred.test());
    }

    @Test
    public void testConstantFalse_1() throws Exception {
        Constant<Object> falsePred = new Constant<Object>(Boolean.FALSE);
        /*[Transform from] assertTrue(!falsePred.test());[NONE Params]*/
        ;
        assertTrue(!falsePred.test(null));
    }

    @Test
    public void testConstantFalse_2() throws Exception {
        Constant<Object> falsePred = new Constant<Object>(Boolean.FALSE);
        /*[Transform from] assertTrue(!falsePred.test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!falsePred.test(null));[NONE Params]*/
        ;
        assertTrue(!falsePred.test(null, null));
    }

    @Test
    public void testConstantFalse_3() throws Exception {
        Constant<Object> falsePred = new Constant<Object>(Boolean.FALSE);
        /*[Transform from] assertTrue(!falsePred.test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!falsePred.test(null));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!falsePred.test(null, null));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!falsePred.test());[NONE Params]*/
        ;
        assertTrue(!falsePred.test("foo"));
    }

    @Test
    public void testConstantFalse_4() throws Exception {
        Constant<Object> falsePred = new Constant<Object>(Boolean.FALSE);
        /*[Transform from] assertTrue(!falsePred.test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!falsePred.test(null));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!falsePred.test(null, null));[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!falsePred.test());[NONE Params]*/
        ;
        /*[Transform from] assertTrue(!falsePred.test("foo"));[NONE Params]*/
        ;
        assertTrue(!falsePred.test("foo", Integer.valueOf(2)));
    }

    @Test
    public void testEquals() throws Exception {
        Constant<Object> f = new Constant<Object>("xyzzy");
        assertEquals(f, f);
    }

    @Test
    public void testEquals_1() throws Exception {
        Constant<Object> f = new Constant<Object>("xyzzy");
        /*[Transform from] assertEquals(f, f);[NONE Params]*/
        ;
        assertObjectsAreEqual(f, new Constant<Object>("xyzzy"));
        assertObjectsAreNotEqual(f, new Constant<Object>("abcde"));
        assertObjectsAreNotEqual(f, new Constant<Object>(null));
        assertObjectsAreEqual(new Constant<Object>(null), new Constant<Object>(null));
        assertTrue(!f.equals(null));
    }

    @Test
    public void testConstants() throws Exception {
        assertEquals(Constant.predicate(true), Constant.TRUE);
    }

    @Test
    public void testConstants_1() throws Exception {
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        assertEquals(Constant.truePredicate(), Constant.TRUE);
    }

    @Test
    public void testConstants_2() throws Exception {
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertEquals(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        assertSame(Constant.truePredicate(), Constant.TRUE);
    }

    @Test
    public void testConstants_3() throws Exception {
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertEquals(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        /*[Transform from] assertSame(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        assertSame(Constant.predicate(true), Constant.TRUE);
    }

    @Test
    public void testConstants_4() throws Exception {
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertEquals(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        /*[Transform from] assertSame(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertSame(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        assertEquals(Constant.falsePredicate(), Constant.FALSE);
    }

    @Test
    public void testConstants_5() throws Exception {
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertEquals(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        /*[Transform from] assertSame(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertSame(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertEquals(Constant.falsePredicate(), Constant.FALSE);*/
        Constant.falsePredicate();
        assertSame(Constant.falsePredicate(), Constant.FALSE);
    }

    @Test
    public void testConstants_6() throws Exception {
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertEquals(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        /*[Transform from] assertSame(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertSame(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertEquals(Constant.falsePredicate(), Constant.FALSE);*/
        Constant.falsePredicate();
        /*[Transform from] assertSame(Constant.falsePredicate(), Constant.FALSE);*/
        Constant.falsePredicate();
        assertEquals(Constant.predicate(false), Constant.FALSE);
    }

    @Test
    public void testConstants_7() throws Exception {
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertEquals(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        /*[Transform from] assertSame(Constant.truePredicate(), Constant.TRUE);*/
        Constant.truePredicate();
        /*[Transform from] assertEquals(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertSame(Constant.predicate(true), Constant.TRUE);*/
        Constant.predicate(true);
        /*[Transform from] assertEquals(Constant.falsePredicate(), Constant.FALSE);*/
        Constant.falsePredicate();
        /*[Transform from] assertSame(Constant.falsePredicate(), Constant.FALSE);*/
        Constant.falsePredicate();
        /*[Transform from] assertEquals(Constant.predicate(false), Constant.FALSE);*/
        Constant.predicate(false);
        assertSame(Constant.predicate(false), Constant.FALSE);
    }
}

