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

import static org.junit.Assert.assertNotNull;

import org.apache.commons.functor.core.Identity;
import org.apache.commons.functor.core.LeftIdentity;
import org.apache.commons.functor.core.NoOp;
import org.apache.commons.functor.core.comparator.IsGreaterThan;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestComposite {

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testUnaryMethods() {
        assertNotNull(Composite.procedure(NoOp.instance()));
        assertNotNull(Composite.procedure(NoOp.instance(),Identity.instance()));
        assertNotNull(Composite.predicate(Identity.instance()));
        assertNotNull(Composite.predicate(Identity.instance(),Identity.instance()));
        assertNotNull(Composite.function(Identity.instance()));
        assertNotNull(Composite.function(Identity.instance(),Identity.instance()));
    }

    @Test
    public void testBinaryMethods() {
        assertNotNull(Composite.function(LeftIdentity.function(),LeftIdentity.function(),LeftIdentity.function()));
        assertNotNull(Composite.predicate(IsGreaterThan.instance(),new Identity<Comparable<?>>(),new Identity<Comparable<?>>()));
        assertNotNull(Composite.function(LeftIdentity.function(),Identity.instance(),Identity.instance()));
    }
}
