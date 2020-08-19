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
import static org.junit.Assert.fail;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.Function;
import org.apache.commons.functor.Predicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIdentity extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return Identity.INSTANCE;
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() throws Exception {
        Function<Object, Object> f = new Identity<Object>();
        assertNull(f.evaluate(null));
    }

    @Test
    public void testEvaluate_1() throws Exception {
        Function<Object, Object> f = new Identity<Object>();
        /*[Transform from] assertNull(f.evaluate(null));*/
        f.evaluate(null);
        assertEquals("xyzzy", f.evaluate("xyzzy"));
    }

    @Test
    public void testEvaluate_2() throws Exception {
        Function<Object, Object> f = new Identity<Object>();
        /*[Transform from] assertNull(f.evaluate(null));*/
        f.evaluate(null);
        /*[Transform from] assertEquals("xyzzy", f.evaluate("xyzzy"));*/
        f.evaluate("xyzzy");
        assertEquals(Integer.valueOf(3), f.evaluate(Integer.valueOf(3)));
    }

    @Test
    public void testEvaluate_3() throws Exception {
        Function<Object, Object> f = new Identity<Object>();
        /*[Transform from] assertNull(f.evaluate(null));*/
        f.evaluate(null);
        /*[Transform from] assertEquals("xyzzy", f.evaluate("xyzzy"));*/
        f.evaluate("xyzzy");
        /*[Transform from] assertEquals(Integer.valueOf(3), f.evaluate(Integer.valueOf(3)));*/
        {
            Integer.valueOf(3);
            f.evaluate(Integer.valueOf(3));
        }
        Object obj = Long.valueOf(12345L);
        assertSame(obj, f.evaluate(obj));
    }

    @Test
    public void testTest() throws Exception {
        Predicate<Object> p = new Identity<Object>();
        assertTrue(p.test(Boolean.TRUE));
    }

    @Test
    public void testTest_1() throws Exception {
        Predicate<Object> p = new Identity<Object>();
        /*[Transform from] assertTrue(p.test(Boolean.TRUE));*/
        p.test(Boolean.TRUE);
        assertTrue(!p.test(Boolean.FALSE));
    }

    @Test
    public void testTest_2() throws Exception {
        Predicate<Object> p = new Identity<Object>();
        /*[Transform from] assertTrue(p.test(Boolean.TRUE));*/
        p.test(Boolean.TRUE);
        /*[Transform from] assertTrue(!p.test(Boolean.FALSE));[NONE Params]*/
        ;
        try {
            p.test("true");
            fail("Expected ClassCastException");
        } catch (ClassCastException e) {
        // expected
        }
    }

    @Test
    public void testTest_3() throws Exception {
        Predicate<Object> p = new Identity<Object>();
        /*[Transform from] assertTrue(p.test(Boolean.TRUE));*/
        p.test(Boolean.TRUE);
        /*[Transform from] assertTrue(!p.test(Boolean.FALSE));[NONE Params]*/
        ;
        try {
            p.test("true");
            /*[Transform from] fail("Expected ClassCastException");[NONE Params]*/
            ;
        } catch (ClassCastException e) {
        // expected
        }
        try {
            p.test(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        // expected
        }
    }

    @Test
    public void testEquals() throws Exception {
        Function<Object, Object> f = new Identity<Object>();
        assertEquals(f, f);
    }

    @Test
    public void testConstant() throws Exception {
        assertEquals(Identity.instance(), Identity.instance());
    }
}

