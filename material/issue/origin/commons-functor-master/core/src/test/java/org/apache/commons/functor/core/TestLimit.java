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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.Predicate;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestLimit extends BaseFunctorTest {


    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {
        return new Limit(3);
    }

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testZero() throws Exception {
        NullaryPredicate p = new Limit(0);
        assertTrue(! p.test());
        assertTrue(! p.test());
        assertTrue(! p.test());
    }

    @Test
    public void testBadArgs() throws Exception {
        try {
            new Limit(-1);
            fail("Expected IllegalArgumentException");
        } catch(IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testTestNullary() throws Exception {
        NullaryPredicate p = new Limit(3);
        assertTrue(p.test());
        assertTrue(p.test());
        assertTrue(p.test());
        assertTrue(! p.test());
    }

    @Test
    public void testTestUnary() throws Exception {
        Predicate<Object> p = new Limit(3);
        assertTrue(p.test(null));
        assertTrue(p.test(null));
        assertTrue(p.test(null));
        assertTrue(! p.test(null));
    }

    @Test
    public void testTestBinary() throws Exception {
        BinaryPredicate<Object, Object> p = new Limit(3);
        assertTrue(p.test(null,null));
        assertTrue(p.test(null,null));
        assertTrue(p.test(null,null));
        assertTrue(! p.test(null,null));
    }

    @Test
    public void testEquals() {
        Limit limit = new Limit(1);
        assertObjectsAreEqual(new Limit(1), limit);
        assertObjectsAreNotEqual(new Limit(2), limit);
        assertTrue(!limit.equals(null));
    }

    @Test
    public void testLimits() {
        Limit limit = new Limit(1);
        assertEquals(Limit.of(1), limit);
        
        assertObjectsAreEqual(Limit.of(1), limit);
        assertObjectsAreNotEqual(Limit.of(3), limit);
    }
}
