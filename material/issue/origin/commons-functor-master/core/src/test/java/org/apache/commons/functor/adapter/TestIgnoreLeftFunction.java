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
package org.apache.commons.functor.adapter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.functor.BaseFunctorTest;
import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.Identity;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestIgnoreLeftFunction extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {
        return new IgnoreLeftFunction<Object, Object, Object>(Constant.of("xyzzy"));
    }

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testEvaluate() throws Exception {
        BinaryFunction<String, String, String> f = new IgnoreLeftFunction<String, String, String>(new Identity<String>());
        assertNull(f.evaluate(null,null));
        assertNull(f.evaluate("xyzzy",null));
        assertEquals("xyzzy",f.evaluate(null,"xyzzy"));
        assertEquals("xyzzy",f.evaluate("abc","xyzzy"));
    }

    @Test
    public void testEquals() throws Exception {
        BinaryFunction<Object, Object, String> f = new IgnoreLeftFunction<Object, Object, String>(Constant.of("xyzzy"));
        assertEquals(f,f);
        assertObjectsAreEqual(f,new IgnoreLeftFunction<Object, Object, String>(Constant.of("xyzzy")));
        assertObjectsAreNotEqual(f,Constant.of("x"));
        assertObjectsAreNotEqual(f,new IgnoreLeftFunction<Object, Object, String>(Constant.<String>of(null)));
        assertObjectsAreNotEqual(f,Constant.of(null));
        assertTrue(!f.equals(null));
    }

    @Test
    public void testAdaptNull() throws Exception {
        assertNull(IgnoreLeftFunction.adapt(null));
    }

    @Test
    public void testAdapt() throws Exception {
        assertNotNull(IgnoreLeftFunction.adapt(Constant.of("xyzzy")));
    }
}
