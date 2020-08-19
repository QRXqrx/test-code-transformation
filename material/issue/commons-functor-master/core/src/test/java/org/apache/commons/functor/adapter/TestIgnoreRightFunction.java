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
public class TestIgnoreRightFunction extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------
    @Override
    protected Object makeFunctor() {
        return new IgnoreRightFunction<Object, Object, Object>(Constant.of("xyzzy"));
    }

    @Test
    public void testAdapt() throws Exception {
        assertNotNull(IgnoreRightFunction.adapt(Constant.of("xyzzy")));
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testEvaluate() throws Exception {
        BinaryFunction<String, String, String> f = new IgnoreRightFunction<String, String, String>(new Identity<String>());
        assertNull(f.evaluate(null, null));
    }

    @Test
    public void testEvaluate_1() throws Exception {
        BinaryFunction<String, String, String> f = new IgnoreRightFunction<String, String, String>(new Identity<String>());
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        assertNull(f.evaluate(null, "xyzzy"));
    }

    @Test
    public void testEvaluate_2() throws Exception {
        BinaryFunction<String, String, String> f = new IgnoreRightFunction<String, String, String>(new Identity<String>());
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertNull(f.evaluate(null, "xyzzy"));*/
        f.evaluate(null, "xyzzy");
        assertEquals("xyzzy", f.evaluate("xyzzy", null));
    }

    @Test
    public void testEvaluate_3() throws Exception {
        BinaryFunction<String, String, String> f = new IgnoreRightFunction<String, String, String>(new Identity<String>());
        /*[Transform from] assertNull(f.evaluate(null, null));*/
        f.evaluate(null, null);
        /*[Transform from] assertNull(f.evaluate(null, "xyzzy"));*/
        f.evaluate(null, "xyzzy");
        /*[Transform from] assertEquals("xyzzy", f.evaluate("xyzzy", null));*/
        f.evaluate("xyzzy", null);
        assertEquals("xyzzy", f.evaluate("xyzzy", "abc"));
    }

    @Test
    public void testEquals() throws Exception {
        BinaryFunction<String, String, String> f = new IgnoreRightFunction<String, String, String>(Constant.of("xyzzy"));
        assertEquals(f, f);
    }

    @Test
    public void testEquals_1() throws Exception {
        BinaryFunction<String, String, String> f = new IgnoreRightFunction<String, String, String>(Constant.of("xyzzy"));
        /*[Transform from] assertEquals(f, f);[NONE Params]*/
        ;
        assertObjectsAreEqual(f, new IgnoreRightFunction<String, String, String>(Constant.of("xyzzy")));
        assertObjectsAreNotEqual(f, Constant.of("x"));
        assertObjectsAreNotEqual(f, new IgnoreRightFunction<String, String, String>(Constant.<String>of(null)));
        assertObjectsAreNotEqual(f, Constant.of(null));
        assertObjectsAreEqual(new IgnoreRightFunction<String, String, String>(Constant.<String>of(null)), new IgnoreRightFunction<String, String, String>(Constant.<String>of(null)));
        assertTrue(!f.equals(null));
    }

    @Test
    public void testAdaptNull() throws Exception {
        assertNull(IgnoreRightFunction.adapt(null));
    }
}

