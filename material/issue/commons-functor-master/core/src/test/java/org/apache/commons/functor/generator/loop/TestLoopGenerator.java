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
package org.apache.commons.functor.generator.loop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.util.CollectionTransformer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the Loop Generator class.
 */
@SuppressWarnings("unchecked")
public class TestLoopGenerator {

    private LoopGenerator<Integer> simpleGenerator = null;

    // Lifecycle
    // ------------------------------------------------------------------------
    @Before
    public void setUp() throws Exception {
        simpleGenerator = new LoopGenerator<Integer>() {

            public void run(Procedure<? super Integer> proc) {
                for (int i = 0; i < 5; i++) {
                    proc.run(Integer.valueOf(i));
                    if (isStopped()) {
                        break;
                    }
                }
            }
        };
        list = new ArrayList<Integer>();
        evens = new ArrayList<Integer>();
        doubled = new ArrayList<Integer>();
        listWithDuplicates = new ArrayList<Integer>();
        sum = 0;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.valueOf(i));
            doubled.add(Integer.valueOf(i * 2));
            listWithDuplicates.add(Integer.valueOf(i));
            listWithDuplicates.add(Integer.valueOf(i));
            sum += i;
            if (i % 2 == 0) {
                evens.add(Integer.valueOf(i));
            }
        }
    }

    @After
    public void tearDown() throws Exception {
        simpleGenerator = null;
        list = null;
        evens = null;
        listWithDuplicates = null;
        sum = 0;
    }

    // Attributes
    // ------------------------------------------------------------------------
    private List<Integer> list = null;

    private List<Integer> doubled = null;

    private List<Integer> evens = null;

    private List<Integer> listWithDuplicates = null;

    @SuppressWarnings("unused")
    private int sum = 0;

    // Classes
    // ------------------------------------------------------------------------
    static class Summer implements Procedure<Number> {

        public void run(Number that) {
            sum += (that).intValue();
        }

        public int sum = 0;
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testSimpleGenerator() {
        final StringBuilder result = new StringBuilder();
        simpleGenerator.run(new Procedure<Integer>() {

            public void run(Integer obj) {
                result.append(obj);
            }
        });
        assertEquals("01234", result.toString());
    }

    @Test
    public void testStop() {
        final StringBuilder result = new StringBuilder();
        simpleGenerator.run(new Procedure<Integer>() {

            int i = 0;

            public void run(Integer obj) {
                result.append(obj);
                if (i++ > 1) {
                    simpleGenerator.stop();
                }
            }
        });
        assertEquals("012", result.toString());
    }

    @Test
    public void testWrappingGenerator() {
        final StringBuilder result = new StringBuilder();
        final LoopGenerator<Integer> gen = new LoopGenerator<Integer>(simpleGenerator) {

            public void run(final Procedure<? super Integer> proc) {
                LoopGenerator<Integer> wrapped = (LoopGenerator<Integer>) getWrappedGenerator();
                assertSame(simpleGenerator, wrapped);
                wrapped.run(new Procedure<Integer>() {

                    public void run(Integer obj) {
                        proc.run(Integer.valueOf(obj.intValue() + 1));
                    }
                });
            }
        };
    }

    @Test
    public void testWrappingGenerator_1() {
        final StringBuilder result = new StringBuilder();
        final LoopGenerator<Integer> gen = new LoopGenerator<Integer>(simpleGenerator) {

            public void run(final Procedure<? super Integer> proc) {
                LoopGenerator<Integer> wrapped = (LoopGenerator<Integer>) getWrappedGenerator();
                /*[Transform from] assertSame(simpleGenerator, wrapped);[NONE Params]*/
                ;
                wrapped.run(new Procedure<Integer>() {

                    public void run(Integer obj) {
                        proc.run(Integer.valueOf(obj.intValue() + 1));
                    }
                });
            }
        };
        gen.run(new Procedure<Integer>() {

            public void run(Integer obj) {
                result.append(obj);
            }
        });
        assertEquals("12345", result.toString());
    }

    @Test
    public void testWrappingGenerator_2() {
        final StringBuilder result = new StringBuilder();
        final LoopGenerator<Integer> gen = new LoopGenerator<Integer>(simpleGenerator) {

            public void run(final Procedure<? super Integer> proc) {
                LoopGenerator<Integer> wrapped = (LoopGenerator<Integer>) getWrappedGenerator();
                /*[Transform from] assertSame(simpleGenerator, wrapped);[NONE Params]*/
                ;
                wrapped.run(new Procedure<Integer>() {

                    public void run(Integer obj) {
                        proc.run(Integer.valueOf(obj.intValue() + 1));
                    }
                });
            }
        };
        gen.run(new Procedure<Integer>() {

            public void run(Integer obj) {
                result.append(obj);
            }
        });
        /*[Transform from] assertEquals("12345", result.toString());*/
        result.toString();
        // try to stop the wrapped generator
        final StringBuilder result2 = new StringBuilder();
        gen.run(new Procedure<Integer>() {

            int i = 0;

            public void run(Integer obj) {
                result2.append(obj);
                if (i++ > 1) {
                    gen.stop();
                }
            }
        });
        assertEquals("123", result2.toString());
    }

    // Tests
    // ------------------------------------------------------------------------
    @Test
    public void testTo() {
        Collection<Integer> col = simpleGenerator.to(CollectionTransformer.<Integer>toCollection());
        assertEquals("[0, 1, 2, 3, 4]", col.toString());
    }

    @Test
    public void testTo_1() {
        Collection<Integer> col = simpleGenerator.to(CollectionTransformer.<Integer>toCollection());
        /*[Transform from] assertEquals("[0, 1, 2, 3, 4]", col.toString());*/
        col.toString();
        Collection<Integer> fillThis = new LinkedList<Integer>();
        col = simpleGenerator.to(new CollectionTransformer<Integer, Collection<Integer>>(fillThis));
        assertSame(fillThis, col);
    }
}

