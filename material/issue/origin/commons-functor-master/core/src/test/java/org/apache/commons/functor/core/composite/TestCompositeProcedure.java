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
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.Identity;
import org.apache.commons.functor.core.NoOp;
import org.junit.Test;

/**
 * @version $Revision: 1365329 $ $Date: 2012-07-24 19:34:23 -0300 (Tue, 24 Jul 2012) $
 */
public class TestCompositeProcedure extends BaseFunctorTest {

    // Functor Testing Framework
    // ------------------------------------------------------------------------

    @Override
    protected Object makeFunctor() {
        return Composite.procedure(NoOp.instance(), Constant.TRUE);
    }

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testRun() throws Exception {
        Composite.procedure(NoOp.instance(), Identity.instance()).run(null);
    }

    @Test(expected=NullPointerException.class)
    public void testNulProcedureNotAllowed() throws Exception {
        new CompositeProcedure<Object>(null);
    }

    @Test(expected=NullPointerException.class)
    public void testNullProcedureNotAllowed2() throws Exception {
        new CompositeProcedure<Object>(NoOp.instance()).of(null);
    }

    @Test
    public void testOf() throws Exception {
        Composite.procedure(NoOp.instance()).of(Identity.instance()).run(null);
    }

    @Test
    public void testEquals() throws Exception {
        CompositeProcedure<Object> f = Composite.procedure(NoOp.instance());
        assertEquals(f,f);
        CompositeProcedure<Object> g = Composite.procedure(NoOp.instance());
        assertObjectsAreEqual(f,g);

        for (int i=0;i<3;i++) {
            f = f.of(Constant.of("x"));
            assertObjectsAreNotEqual(f,g);
            g = g.of(Constant.of("x"));
            assertObjectsAreEqual(f,g);
            f = f.of(Constant.of("y")).of(Constant.of("z"));
            assertObjectsAreNotEqual(f,g);
            g = g.of(Constant.of("y")).of(Constant.of("z"));
            assertObjectsAreEqual(f,g);
        }

        assertObjectsAreNotEqual(f,Constant.FALSE);
        assertTrue(!f.equals(null));
    }

}
