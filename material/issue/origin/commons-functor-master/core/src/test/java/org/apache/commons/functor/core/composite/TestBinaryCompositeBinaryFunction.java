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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.LeftIdentity;
import org.apache.commons.functor.core.RightIdentity;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestBinaryCompositeBinaryFunction extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {
        return new BinaryCompositeBinaryFunction<Object, Object, Object>(
            RightIdentity.FUNCTION,
            Constant.of("left"),
            RightIdentity.FUNCTION);
    }

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testEvaluateRaw() throws Exception {
        BinaryFunction<Object, Object, Object> f = new BinaryCompositeBinaryFunction<Object, Object, Object>(
                RightIdentity.FUNCTION,
                Constant.of("K"),
                RightIdentity.FUNCTION);
        assertEquals("right",f.evaluate("left","right"));
        assertNull("right",f.evaluate("left",null));
        assertEquals("right",f.evaluate(null,"right"));
    }

    @Test
    public void testEvaluate() throws Exception {
        BinaryFunction<String, String, String> f = new BinaryCompositeBinaryFunction<String, String, String>(
                RightIdentity.<String, String>function(),
                Constant.of("K"),
                RightIdentity.<String, String>function());
        assertEquals("right",f.evaluate("left","right"));
        assertNull("right",f.evaluate("left",null));
        assertEquals("right",f.evaluate(null,"right"));
    }

    @Test
    public void testEvaluateObject() throws Exception {
        BinaryFunction<Object, Object, Object> f = new BinaryCompositeBinaryFunction<Object, Object, Object>(
                RightIdentity.FUNCTION,
                Constant.of("K"),
                RightIdentity.FUNCTION);
        assertEquals("right",f.evaluate("left","right"));
        assertNull("right",f.evaluate("left",null));
        assertEquals("right",f.evaluate(null,"right"));
    }

    @Test
    public void testEquals() throws Exception {
        BinaryFunction<Object, Object, Object> f = new BinaryCompositeBinaryFunction<Object, Object, Object>(
            LeftIdentity.FUNCTION,
            Constant.of("left"),
            Constant.of("right"));
        assertEquals(f,f);
        assertObjectsAreEqual(f,new BinaryCompositeBinaryFunction<Object, Object, Object>(
                LeftIdentity.FUNCTION,
                Constant.of("left"),
            Constant.of("right")));
        assertObjectsAreNotEqual(f,new BinaryCompositeBinaryFunction<Object, Object, Object>(
            RightIdentity.FUNCTION,
            Constant.of("left"),
            Constant.of("right")));
        assertObjectsAreNotEqual(f,new BinaryCompositeBinaryFunction<Object, Object, Object>(
            RightIdentity.FUNCTION,
            RightIdentity.FUNCTION,
            Constant.of("right")));
        assertObjectsAreNotEqual(f,new BinaryCompositeBinaryFunction<Object, Object, Object>(
            LeftIdentity.FUNCTION,
            Constant.of("left"),
            RightIdentity.FUNCTION));
        assertObjectsAreNotEqual(f,new BinaryCompositeBinaryFunction<Object, Object, Object>(
            LeftIdentity.FUNCTION,
            Constant.of("rigth"),
            Constant.of("right")));
        assertTrue(!f.equals(null));
        assertTrue(!f.equals((BinaryCompositeBinaryFunction<?,?,?>)null));
    }

}
