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

import org.apache.commons.functor.NullaryPredicate;
import org.apache.commons.functor.core.Constant;
import org.apache.commons.functor.core.Identity;
import org.apache.commons.functor.core.IsEqual;
import org.apache.commons.functor.core.IsNull;
import org.apache.commons.functor.core.NoOp;
import org.apache.commons.functor.core.comparator.IsGreaterThan;
import org.apache.commons.functor.core.comparator.Max;
import org.junit.Test;

/**
 * @version $Revision$ $Date$
 */
public class TestConditional {

    // Tests
    // ------------------------------------------------------------------------

    @Test
    public void testNullaryMethods() {
        assertNotNull(Conditional.procedure(new NullaryNot(Constant.TRUE),new NullarySequence()));
        assertNotNull(Conditional.procedure(new NullaryNot(Constant.TRUE),new NullarySequence(),new NullarySequence()));
        assertNotNull(Conditional.function(new NullaryNot(Constant.TRUE),Constant.FALSE,Constant.FALSE));
        assertNotNull(Conditional.predicate((NullaryPredicate)Constant.truePredicate(),Constant.truePredicate(),Constant.truePredicate()));
    }

    @Test
    public void testUnaryMethods() {
    	assertNotNull(Conditional.procedure(IsNull.instance(),NoOp.instance()));
    	assertNotNull(Conditional.procedure(IsNull.instance(),NoOp.instance(),NoOp.instance()));
    	assertNotNull(Conditional.function(IsNull.instance(),Identity.instance(),Identity.instance()));
    	assertNotNull(Conditional.predicate(IsNull.instance(),Constant.truePredicate(),Constant.truePredicate()));
    }

    @Test
    public void testBinaryMethods() {
        assertNotNull(Conditional.procedure(IsGreaterThan.instance(),NoOp.instance(),NoOp.instance()));
        assertNotNull(Conditional.function(IsGreaterThan.instance(),Max.instance(),Max.instance()));
        assertNotNull(Conditional.predicate(IsGreaterThan.instance(),Constant.truePredicate(),Constant.truePredicate()));
        assertNotNull(Conditional.procedure(new IsEqual<Object, Object>(),NoOp.INSTANCE));
    }
}
