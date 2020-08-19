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
package org.apache.commons.functor.core.comparator;

import java.util.Comparator;
import org.apache.commons.functor.BinaryPredicate;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.adapter.RightBoundPredicate;
import org.apache.commons.lang3.Validate;

/**
 * A {@link BinaryPredicate BinaryPredicate} that {@link #test tests}
 * <code>true</code> iff the left argument is greater than the
 * right argument under the specified {@link Comparator}.
 * When no (or a <code>null</code> <code>Comparator</code> is specified,
 * a {@link Comparable Comparable} <code>Comparator</code> is used.
 *
 * @param <T> the binary predicate input types
 * @version $Revision$ $Date$
 */
public final class IsGreaterThan<T> implements BinaryPredicate<T, T> {

    /**
     * Basic IsGreaterThan instance.
     */
    public static final IsGreaterThan<Comparable<?>> INSTANCE = IsGreaterThan.<Comparable<?>>instance();

    /**
     * The wrapped comparator.
     */
    private final Comparator<? super T> comparator;

    /**
     * Construct a <code>IsGreaterThan</code> {@link BinaryPredicate predicate}
     * for {@link Comparable Comparable}s.
     */
    @SuppressWarnings("unchecked")
    public IsGreaterThan() {
        this((Comparator<? super T>) ComparableComparator.INSTANCE);
    }

    /**
     * Construct a <code>IsGreaterThan</code> {@link BinaryPredicate predicate}
     * for the given {@link Comparator Comparator}.
     *
     * @param comparator the {@link Comparator Comparator}, when <code>null</code>,
     *        a <code>Comparator</code> for {@link Comparable Comparable}s will
     *        be used.
     */
    public IsGreaterThan(Comparator<? super T> comparator) {
        this.comparator = Validate.notNull(comparator, "Comparator argument must not be null");
    }

    /**
     * Return <code>true</code> iff the <i>left</i> parameter is
     * greater than the <i>right</i> parameter under my current
     * {@link Comparator Comparator}.
     * {@inheritDoc}
     */
    public boolean test(T left, T right) {
        return comparator.compare(left, right) > 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IsGreaterThan<?>)) {
            return false;
        }
        IsGreaterThan<?> that = (IsGreaterThan<?>) obj;
        return this.comparator.equals(that.comparator);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int hash = "IsGreaterThan".hashCode();
        // by construction, comparator is never null
        hash ^= comparator.hashCode();
        return hash;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "IsGreaterThan<" + comparator + ">";
    }

    /**
     * Get a typed IsGreaterThan instance.
     *
     * @param <T> the binary predicate input types
     * @return IsGreaterThan<T>
     */
    public static <T extends Comparable<?>> IsGreaterThan<T> instance() {
        return new IsGreaterThan<T>();
    }

    /**
     * Get an IsGreaterThan Predicate.
     *
     * @param <T> the binary predicate input types
     * @param right the right side object of the IsGreaterThan comparison
     * @return Predicate<T>
     */
    public static <T extends Comparable<?>> Predicate<T> instance(T right) {
        return RightBoundPredicate.bind(new IsGreaterThan<T>(), right);
    }
}

