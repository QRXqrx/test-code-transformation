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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.BinaryPredicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestLeftIdentity extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return LeftIdentity.FUNCTION;
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testJavabeanConstructor() {
        // Public constructor for JavaBean
        assertNotNull(new LeftIdentity());
    }

    @Test
    public void testEvaluate() throws Exception {
        BinaryFunction<Object, Object, Object> f = LeftIdentity.FUNCTION;
        assertNull(f.evaluate(null, null));
    }

    @Test
    public void testEvaluate_1() throws Exception {
        BinaryFunction<Object, Object, Object> f = LeftIdentity.FUNCTION;
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        assertNull(f.evaluate(null, "xyzzy"));
    }

    @Test
    public void testEvaluate_2() throws Exception {
        BinaryFunction<Object, Object, Object> f = LeftIdentity.FUNCTION;
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertNull(f.evaluate(null, "xyzzy"));*/
        f.evaluate(null, "xyzzy");
        assertEquals("xyzzy", f.evaluate("xyzzy", "abcdefg"));
    }

    @Test
    public void testEvaluate_3() throws Exception {
        BinaryFunction<Object, Object, Object> f = LeftIdentity.FUNCTION;
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertNull(f.evaluate(null, "xyzzy"));*/
        f.evaluate(null, "xyzzy");
        /*[Transform from] assertEquals("xyzzy", f.evaluate("xyzzy", "abcdefg"));*/
        f.evaluate("xyzzy", "abcdefg");
        assertEquals("xyzzy", f.evaluate("xyzzy", null));
    }

    @Test
    public void testEvaluate_4() throws Exception {
        BinaryFunction<Object, Object, Object> f = LeftIdentity.FUNCTION;
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertNull(f.evaluate(null, "xyzzy"));*/
        f.evaluate(null, "xyzzy");
        /*[Transform from] assertEquals("xyzzy", f.evaluate("xyzzy", "abcdefg"));*/
        f.evaluate("xyzzy", "abcdefg");
        /*[Transform from] assertEquals("xyzzy", f.evaluate("xyzzy", null));*/
        f.evaluate("xyzzy", null);
        assertEquals(Integer.valueOf(3), f.evaluate(Integer.valueOf(3), null));
    }

    @Test
    public void testEvaluate_5() throws Exception {
        BinaryFunction<Object, Object, Object> f = LeftIdentity.FUNCTION;
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertNull(f.evaluate(null, "xyzzy"));*/
        f.evaluate(null, "xyzzy");
        /*[Transform from] assertEquals("xyzzy", f.evaluate("xyzzy", "abcdefg"));*/
        f.evaluate("xyzzy", "abcdefg");
        /*[Transform from] assertEquals("xyzzy", f.evaluate("xyzzy", null));*/
        f.evaluate("xyzzy", null);
        /*[Transform from] assertEquals(Integer.valueOf(3), f.evaluate(Integer.valueOf(3), null));*/
        {
            Integer.valueOf(3);
            f.evaluate(Integer.valueOf(3), null);
        }
        Object obj = Long.valueOf(12345L);
        assertSame(obj, f.evaluate(obj, null));
    }

    @Test
    public void testEvaluate_6() throws Exception {
        BinaryFunction<Object, Object, Object> f = LeftIdentity.FUNCTION;
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertNull(f.evaluate(null, "xyzzy"));*/
        f.evaluate(null, "xyzzy");
        /*[Transform from] assertEquals("xyzzy", f.evaluate("xyzzy", "abcdefg"));*/
        f.evaluate("xyzzy", "abcdefg");
        /*[Transform from] assertEquals("xyzzy", f.evaluate("xyzzy", null));*/
        f.evaluate("xyzzy", null);
        /*[Transform from] assertEquals(Integer.valueOf(3), f.evaluate(Integer.valueOf(3), null));*/
        {
            Integer.valueOf(3);
            f.evaluate(Integer.valueOf(3), null);
        }
        Object obj = Long.valueOf(12345L);
        /*[Transform from] assertSame(obj, f.evaluate(obj, null));*/
        f.evaluate(obj, null);
        assertSame(obj, f.evaluate(obj, obj));
    }

    @Test(expected = NullPointerException.class)
    public void testTest() throws Exception {
        BinaryPredicate<Boolean, Object> p = LeftIdentity.PREDICATE;
        assertTrue(p.test(Boolean.TRUE, null));
    }

    @Test(expected = NullPointerException.class)
    public void testTest_1() throws Exception {
        BinaryPredicate<Boolean, Object> p = LeftIdentity.PREDICATE;
        /*[Transform from] assertTrue(p.test(Boolean.TRUE, null));*/
        p.test(Boolean.TRUE, null);
        assertTrue(!p.test(Boolean.FALSE, null));
    }

    @Test
    public void testEquals() throws Exception {
        BinaryFunction<Object, Object, Object> f = LeftIdentity.<Object, Object>function();
        assertEquals(f, f);
    }

    @Test
    public void testConstant() throws Exception {
        assertEquals(LeftIdentity.function(), LeftIdentity.function());
    }
}

