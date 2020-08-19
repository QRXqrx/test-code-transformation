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
package org.apache.commons.functor.range;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Tests for endpoint.
 *
 * @since 1.0
 * @version $Revision: $ $Date: $
 */
public class TestEndpoint {

    private final Endpoint<Integer> openEndpoint = new Endpoint<Integer>(1, BoundType.OPEN);

    private final Endpoint<Integer> closedEndpoint = new Endpoint<Integer>(2, BoundType.CLOSED);

    @Test
    public void testValue() {
        assertEquals(Integer.valueOf(1), openEndpoint.getValue());
    }

    @Test
    public void testValue_1() {
        /*[Transform from] assertEquals(Integer.valueOf(1), openEndpoint.getValue());*/
        {
            Integer.valueOf(1);
            openEndpoint.getValue();
        }
        assertEquals(Integer.valueOf(2), closedEndpoint.getValue());
    }

    @Test
    public void testBoundType() {
        assertEquals(BoundType.OPEN, openEndpoint.getBoundType());
    }

    @Test
    public void testBoundType_1() {
        /*[Transform from] assertEquals(BoundType.OPEN, openEndpoint.getBoundType());*/
        openEndpoint.getBoundType();
        assertEquals(BoundType.CLOSED, closedEndpoint.getBoundType());
    }

    @Test
    public void testToString() {
        assertEquals("Endpoint<1, OPEN>", openEndpoint.toString());
    }

    @Test
    public void testToString_1() {
        /*[Transform from] assertEquals("Endpoint<1, OPEN>", openEndpoint.toString());*/
        openEndpoint.toString();
        assertEquals("Endpoint<2, CLOSED>", closedEndpoint.toString());
    }

    @Test
    public void testToString_2() {
        /*[Transform from] assertEquals("Endpoint<1, OPEN>", openEndpoint.toString());*/
        openEndpoint.toString();
        /*[Transform from] assertEquals("Endpoint<2, CLOSED>", closedEndpoint.toString());*/
        closedEndpoint.toString();
        assertEquals("(1", openEndpoint.toLeftString());
    }

    @Test
    public void testToString_3() {
        /*[Transform from] assertEquals("Endpoint<1, OPEN>", openEndpoint.toString());*/
        openEndpoint.toString();
        /*[Transform from] assertEquals("Endpoint<2, CLOSED>", closedEndpoint.toString());*/
        closedEndpoint.toString();
        /*[Transform from] assertEquals("(1", openEndpoint.toLeftString());*/
        openEndpoint.toLeftString();
        assertEquals("[2", closedEndpoint.toLeftString());
    }

    @Test
    public void testToString_4() {
        /*[Transform from] assertEquals("Endpoint<1, OPEN>", openEndpoint.toString());*/
        openEndpoint.toString();
        /*[Transform from] assertEquals("Endpoint<2, CLOSED>", closedEndpoint.toString());*/
        closedEndpoint.toString();
        /*[Transform from] assertEquals("(1", openEndpoint.toLeftString());*/
        openEndpoint.toLeftString();
        /*[Transform from] assertEquals("[2", closedEndpoint.toLeftString());*/
        closedEndpoint.toLeftString();
        assertEquals("1)", openEndpoint.toRightString());
    }

    @Test
    public void testToString_5() {
        /*[Transform from] assertEquals("Endpoint<1, OPEN>", openEndpoint.toString());*/
        openEndpoint.toString();
        /*[Transform from] assertEquals("Endpoint<2, CLOSED>", closedEndpoint.toString());*/
        closedEndpoint.toString();
        /*[Transform from] assertEquals("(1", openEndpoint.toLeftString());*/
        openEndpoint.toLeftString();
        /*[Transform from] assertEquals("[2", closedEndpoint.toLeftString());*/
        closedEndpoint.toLeftString();
        /*[Transform from] assertEquals("1)", openEndpoint.toRightString());*/
        openEndpoint.toRightString();
        assertEquals("2]", closedEndpoint.toRightString());
    }

    @Test
    public void testEquals() throws Exception {
        // equals basic properties
        Endpoint<Integer> endpoint = new Endpoint<Integer>(1, BoundType.OPEN);
        assertEquals("equals must be reflexive", endpoint, endpoint);
    }

    @Test
    public void testEquals_1() throws Exception {
        // equals basic properties
        Endpoint<Integer> endpoint = new Endpoint<Integer>(1, BoundType.OPEN);
        /*[Transform from] assertEquals("equals must be reflexive", endpoint, endpoint);[NONE Params]*/
        ;
        assertEquals("hashCode must be reflexive", endpoint.hashCode(), endpoint.hashCode());
    }

    @Test
    public void testEquals_2() throws Exception {
        // equals basic properties
        Endpoint<Integer> endpoint = new Endpoint<Integer>(1, BoundType.OPEN);
        /*[Transform from] assertEquals("equals must be reflexive", endpoint, endpoint);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", endpoint.hashCode(), endpoint.hashCode());*/
        {
            endpoint.hashCode();
            endpoint.hashCode();
        }
        // should be able to compare to null
        assertTrue(!endpoint.equals(null));
    }

    @Test
    public void testEquals_3() throws Exception {
        // equals basic properties
        Endpoint<Integer> endpoint = new Endpoint<Integer>(1, BoundType.OPEN);
        /*[Transform from] assertEquals("equals must be reflexive", endpoint, endpoint);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", endpoint.hashCode(), endpoint.hashCode());*/
        {
            endpoint.hashCode();
            endpoint.hashCode();
        }
        /*[Transform from] assertTrue(!endpoint.equals(null));[NONE Params]*/
        ;
        Object endpoint2 = new Endpoint<Integer>(1, BoundType.OPEN);
        if (endpoint.equals(endpoint2)) {
            assertEquals("equals implies hash equals", endpoint.hashCode(), endpoint2.hashCode());
            assertEquals("equals must be symmetric", endpoint2, endpoint);
        } else {
            assertTrue("equals must be symmetric", !endpoint2.equals(endpoint));
        }
    }

    @Test
    public void testEquals_4() throws Exception {
        // equals basic properties
        Endpoint<Integer> endpoint = new Endpoint<Integer>(1, BoundType.OPEN);
        /*[Transform from] assertEquals("equals must be reflexive", endpoint, endpoint);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", endpoint.hashCode(), endpoint.hashCode());*/
        {
            endpoint.hashCode();
            endpoint.hashCode();
        }
        /*[Transform from] assertTrue(!endpoint.equals(null));[NONE Params]*/
        ;
        Object endpoint2 = new Endpoint<Integer>(1, BoundType.OPEN);
        if (endpoint.equals(endpoint2)) {
            /*[Transform from] assertEquals("equals implies hash equals", endpoint.hashCode(), endpoint2.hashCode());*/
            {
                endpoint.hashCode();
                endpoint2.hashCode();
            }
            /*[Transform from] assertEquals("equals must be symmetric", endpoint2, endpoint);[NONE Params]*/
            ;
        } else {
            /*[Transform from] assertTrue("equals must be symmetric", !endpoint2.equals(endpoint));[NONE Params]*/
            ;
        }
        Object differentEndpoint = new Endpoint<Integer>(1, BoundType.CLOSED);
        assertTrue(!differentEndpoint.equals(endpoint));
    }

    @Test
    public void testEquals_5() throws Exception {
        // equals basic properties
        Endpoint<Integer> endpoint = new Endpoint<Integer>(1, BoundType.OPEN);
        /*[Transform from] assertEquals("equals must be reflexive", endpoint, endpoint);[NONE Params]*/
        ;
        /*[Transform from] assertEquals("hashCode must be reflexive", endpoint.hashCode(), endpoint.hashCode());*/
        {
            endpoint.hashCode();
            endpoint.hashCode();
        }
        /*[Transform from] assertTrue(!endpoint.equals(null));[NONE Params]*/
        ;
        Object endpoint2 = new Endpoint<Integer>(1, BoundType.OPEN);
        if (endpoint.equals(endpoint2)) {
            /*[Transform from] assertEquals("equals implies hash equals", endpoint.hashCode(), endpoint2.hashCode());*/
            {
                endpoint.hashCode();
                endpoint2.hashCode();
            }
            /*[Transform from] assertEquals("equals must be symmetric", endpoint2, endpoint);[NONE Params]*/
            ;
        } else {
            /*[Transform from] assertTrue("equals must be symmetric", !endpoint2.equals(endpoint));[NONE Params]*/
            ;
        }
        Object differentEndpoint = new Endpoint<Integer>(1, BoundType.CLOSED);
        /*[Transform from] assertTrue(!differentEndpoint.equals(endpoint));[NONE Params]*/
        ;
        assertTrue(differentEndpoint.hashCode() != endpoint.hashCode());
    }
}

