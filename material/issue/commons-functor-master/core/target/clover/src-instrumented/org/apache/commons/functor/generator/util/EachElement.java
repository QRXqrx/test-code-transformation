/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.functor.generator.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.functor.generator.Generator;
import org.apache.commons.functor.generator.loop.IteratorToGeneratorAdapter;

/**
 * Generator factory for each element of a "collection".
 *
 * @since 1.0
 * @version $Revision$ $Date$
 */
public final class EachElement {

    public static class __CLR4_4_135i35ikcq4stxs {

        public static com_atlassian_clover.CoverageRecorder R;

        public static com_atlassian_clover.CloverProfile[] profiles = {};

        @java.lang.SuppressWarnings("unchecked")
        public static <I, T extends I> I lambdaInc(final int i, final T l, final int si) {
            java.lang.reflect.InvocationHandler h = new java.lang.reflect.InvocationHandler() {

                public java.lang.Object invoke(java.lang.Object p, java.lang.reflect.Method m, java.lang.Object[] a) throws Throwable {
                    R.inc(i);
                    R.inc(si);
                    try {
                        return m.invoke(l, a);
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        throw e.getCause() != null ? e.getCause() : new RuntimeException("Clover failed to invoke instrumented lambda", e);
                    }
                }
            };
            return (I) java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(), l.getClass().getInterfaces(), h);
        }

        static {
            com_atlassian_clover.CoverageRecorder _R = null;
            try {
                com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();
                if (2019101123313948L != com_atlassian_clover.CloverVersionInfo.getBuildStamp()) {
                    com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");
                    com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime=" + com_atlassian_clover.CloverVersionInfo.getReleaseNum() + "#" + com_atlassian_clover.CloverVersionInfo.getBuildStamp());
                }
                R = com_atlassian_clover.Clover.getNullRecorder();
                _R = com_atlassian_clover.Clover.getNullRecorder();
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 4103, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
            } catch (java.lang.SecurityException e) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. (" + e.getClass() + ":" + e.getMessage() + ")");
            } catch (java.lang.NoClassDefFoundError e) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? (" + e.getClass() + ":" + e.getMessage() + ")");
            } catch (java.lang.Throwable t) {
                java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. (" + t.getClass() + ":" + t.getMessage() + ")");
            }
            R = _R;
        }
    }

    public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER = com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Hidden constructor as this only is a helper class with static methods.
     */
    private EachElement() {
        try {
            __CLR4_4_135i35ikcq4stxs.R.inc(4086);
        } finally {
            __CLR4_4_135i35ikcq4stxs.R.flushNeeded();
        }
    }

    /**
     * Get a Generator for each element of an Iterable.
     * @param <E> the type of elements held in the input iterable.
     * @param iterable to iterate
     * @return Generator<E>
     */
    public static <E> Generator<E> from(Iterable<? extends E> iterable) {
        try {
            __CLR4_4_135i35ikcq4stxs.R.inc(4087);
            __CLR4_4_135i35ikcq4stxs.R.inc(4088);
            return (((iterable == null) && (__CLR4_4_135i35ikcq4stxs.R.iget(4089) != 0 | true)) || (__CLR4_4_135i35ikcq4stxs.R.iget(4090) == 0 & false)) ? null : EachElement.from(iterable.iterator());
        } finally {
            __CLR4_4_135i35ikcq4stxs.R.flushNeeded();
        }
    }

    /**
     * Get a Generator for each entry of a Map.
     * @param <K> the type of keys maintained by the input map.
     * @param <V> the type of mapped values in the input map.
     * @param map to iterate
     * @return Generator
     */
    @SuppressWarnings("unchecked")
    public static <K, V> Generator<Map.Entry<K, V>> from(Map<? extends K, ? extends V> map) {
        try {
            __CLR4_4_135i35ikcq4stxs.R.inc(4091);
            __CLR4_4_135i35ikcq4stxs.R.inc(4092);
            return (((map == null) && (__CLR4_4_135i35ikcq4stxs.R.iget(4093) != 0 | true)) || (__CLR4_4_135i35ikcq4stxs.R.iget(4094) == 0 & false)) ? null : EachElement.from(((Map<K, V>) map).entrySet().iterator());
        } finally {
            __CLR4_4_135i35ikcq4stxs.R.flushNeeded();
        }
    }

    /**
     * Get a Generator for each element of an Object[].
     * @param <E> the type of elements held in the input array.
     * @param array to iterate
     * @return Generator
     */
    public static <E> Generator<E> from(E... array) {
        try {
            __CLR4_4_135i35ikcq4stxs.R.inc(4095);
            __CLR4_4_135i35ikcq4stxs.R.inc(4096);
            return (((array == null) && (__CLR4_4_135i35ikcq4stxs.R.iget(4097) != 0 | true)) || (__CLR4_4_135i35ikcq4stxs.R.iget(4098) == 0 & false)) ? null : EachElement.from(Arrays.asList(array).iterator());
        } finally {
            __CLR4_4_135i35ikcq4stxs.R.flushNeeded();
        }
    }

    /**
     * Get a Generator for each element of an Iterator.
     * @param <E> the type of elements held in the input iterator.
     * @param iter to iterate
     * @return Generator
     */
    public static <E> Generator<E> from(Iterator<? extends E> iter) {
        try {
            __CLR4_4_135i35ikcq4stxs.R.inc(4099);
            __CLR4_4_135i35ikcq4stxs.R.inc(4100);
            return (((iter == null) && (__CLR4_4_135i35ikcq4stxs.R.iget(4101) != 0 | true)) || (__CLR4_4_135i35ikcq4stxs.R.iget(4102) == 0 & false)) ? null : new IteratorToGeneratorAdapter<E>(iter);
        } finally {
            __CLR4_4_135i35ikcq4stxs.R.flushNeeded();
        }
    }
}

