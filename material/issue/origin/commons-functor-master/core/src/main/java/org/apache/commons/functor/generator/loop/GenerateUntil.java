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

import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.lang3.Validate;

/**
 * Wrap another {@link Generator} such that {@link #run(Procedure)} terminates once
 * a condition has been satisfied (test after).
 *
 * @param <E> the type of elements held in this generator.
 * @version $Revision: 1508677 $ $Date: 2013-07-30 19:48:02 -0300 (Tue, 30 Jul 2013) $
 */
public class GenerateUntil<E> extends LoopGenerator<E> {

    /**
     * The condition has to verified in order to execute the generation.
     */
    private final Predicate<? super E> test;

    /**
     * Create a new GenerateUntil.
     * @param wrapped {@link Generator}
     * @param test {@link Predicate}
     */
    public GenerateUntil(Generator<? extends E> wrapped, Predicate<? super E> test) {
        super(Validate.notNull(wrapped, "Generator argument was null"));
        this.test = Validate.notNull(test, "Predicate argument was null");
    }

    /**
     * {@inheritDoc}
     */
    public void run(final Procedure<? super E> proc) {
        getWrappedGenerator().run(new Procedure<E>() {
            public void run(E obj) {
                proc.run(obj);
                if (test.test(obj)) {
                    GenerateUntil.this.stop();
                }
            }
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenerateUntil<?>)) {
            return false;
        }
        GenerateUntil<?> other = (GenerateUntil<?>) obj;
        return other.getWrappedGenerator().equals(getWrappedGenerator()) && other.test.equals(test);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int result = "GenerateUntil".hashCode();
        result <<= 2;
        Generator<?> gen = getWrappedGenerator();
        result ^= gen.hashCode();
        result <<= 2;
        result ^= test.hashCode();
        return result;
    }
}
