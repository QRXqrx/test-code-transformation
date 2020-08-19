/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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

package org.apache.commons.functor.generator.loop;

import java.util.Iterator;

import org.apache.commons.functor.Procedure;
import org.apache.commons.lang3.Validate;

/**
 * Adapts an {@link Iterator} to the {@link LoopGenerator} interface.
 *
 * @param <E> the type of elements held in this generator.
 * @since 1.0
 * @version $Revision: 1508677 $ $Date: 2013-07-30 19:48:02 -0300 (Tue, 30 Jul 2013) $
 */
public final class IteratorToGeneratorAdapter<E> extends LoopGenerator<E> {public static class __CLR4_4_130r30rkcq4stwp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,3977,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Helper iterator; enforces that iterators from equal owners are considered equal.
     * 
     * @param <E> the type of elements in this iterator.
     */
    private static class EqualityIterator<E> implements Iterator<E> {
        /**
         * Iterable that owns this iterator.
         */
        final Iterable<? extends E> owner;

        /**
         * Wrapped iterator.
         */
        final Iterator<? extends E> wrapped;

        /**
         * Create a new EqualityIterator.
         * @param owner iterable that owns this iterator
         */
        EqualityIterator(Iterable<? extends E> owner) {
            super();__CLR4_4_130r30rkcq4stwp.R.inc(3916);try{__CLR4_4_130r30rkcq4stwp.R.inc(3915);
            __CLR4_4_130r30rkcq4stwp.R.inc(3917);this.owner = Validate.notNull(owner);
            __CLR4_4_130r30rkcq4stwp.R.inc(3918);this.wrapped = owner.iterator();
        }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public boolean hasNext() {try{__CLR4_4_130r30rkcq4stwp.R.inc(3919);
            __CLR4_4_130r30rkcq4stwp.R.inc(3920);return wrapped.hasNext();
        }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public E next() {try{__CLR4_4_130r30rkcq4stwp.R.inc(3921);
            __CLR4_4_130r30rkcq4stwp.R.inc(3922);return wrapped.next();
        }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public void remove() {try{__CLR4_4_130r30rkcq4stwp.R.inc(3923);
            __CLR4_4_130r30rkcq4stwp.R.inc(3924);wrapped.remove();
        }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_130r30rkcq4stwp.R.inc(3925);
            __CLR4_4_130r30rkcq4stwp.R.inc(3926);if ((((obj == this)&&(__CLR4_4_130r30rkcq4stwp.R.iget(3927)!=0|true))||(__CLR4_4_130r30rkcq4stwp.R.iget(3928)==0&false))) {{
                __CLR4_4_130r30rkcq4stwp.R.inc(3929);return true;
            }
            }__CLR4_4_130r30rkcq4stwp.R.inc(3930);if ((((!(obj instanceof EqualityIterator))&&(__CLR4_4_130r30rkcq4stwp.R.iget(3931)!=0|true))||(__CLR4_4_130r30rkcq4stwp.R.iget(3932)==0&false))) {{
                __CLR4_4_130r30rkcq4stwp.R.inc(3933);return false;
            }
            }__CLR4_4_130r30rkcq4stwp.R.inc(3934);return ((EqualityIterator<?>) obj).owner.equals(owner);
        }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {try{__CLR4_4_130r30rkcq4stwp.R.inc(3935);
            __CLR4_4_130r30rkcq4stwp.R.inc(3936);int hash = "IteratorToGeneratorAdapter$EqualityIterator".hashCode();
            __CLR4_4_130r30rkcq4stwp.R.inc(3937);hash <<= 2;
            __CLR4_4_130r30rkcq4stwp.R.inc(3938);hash ^= owner.hashCode();
            __CLR4_4_130r30rkcq4stwp.R.inc(3939);return hash;
        }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}
    }

    // instance variables
    //-----------------------------------------------------

    /**
     * The adapted iterator.
     */
    private final Iterator<? extends E> iter;

    // constructors
    //-----------------------------------------------------
    /**
     * Create a new IteratorToGeneratorAdapter.
     * @param iter Iterator to adapt
     */
    public IteratorToGeneratorAdapter(Iterator<? extends E> iter) {try{__CLR4_4_130r30rkcq4stwp.R.inc(3940);
        __CLR4_4_130r30rkcq4stwp.R.inc(3941);this.iter = Validate.notNull(iter, "Iterator argument was null");
    }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

    // instance methods
    //-----------------------------------------------------
    /**
     * {@inheritDoc}
     */
    public void run(Procedure<? super E> proc) {try{__CLR4_4_130r30rkcq4stwp.R.inc(3942);
        __CLR4_4_130r30rkcq4stwp.R.inc(3943);while ((((iter.hasNext())&&(__CLR4_4_130r30rkcq4stwp.R.iget(3944)!=0|true))||(__CLR4_4_130r30rkcq4stwp.R.iget(3945)==0&false))) {{
            __CLR4_4_130r30rkcq4stwp.R.inc(3946);proc.run(iter.next());
            __CLR4_4_130r30rkcq4stwp.R.inc(3947);if ((((isStopped())&&(__CLR4_4_130r30rkcq4stwp.R.iget(3948)!=0|true))||(__CLR4_4_130r30rkcq4stwp.R.iget(3949)==0&false))) {{
                __CLR4_4_130r30rkcq4stwp.R.inc(3950);break;
            }
        }}
    }}finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_130r30rkcq4stwp.R.inc(3951);
        __CLR4_4_130r30rkcq4stwp.R.inc(3952);if ((((obj == this)&&(__CLR4_4_130r30rkcq4stwp.R.iget(3953)!=0|true))||(__CLR4_4_130r30rkcq4stwp.R.iget(3954)==0&false))) {{
            __CLR4_4_130r30rkcq4stwp.R.inc(3955);return true;
        }
        }__CLR4_4_130r30rkcq4stwp.R.inc(3956);if ((((!(obj instanceof IteratorToGeneratorAdapter<?>))&&(__CLR4_4_130r30rkcq4stwp.R.iget(3957)!=0|true))||(__CLR4_4_130r30rkcq4stwp.R.iget(3958)==0&false))) {{
            __CLR4_4_130r30rkcq4stwp.R.inc(3959);return false;
        }
        }__CLR4_4_130r30rkcq4stwp.R.inc(3960);IteratorToGeneratorAdapter<?> that = (IteratorToGeneratorAdapter<?>) obj;
        __CLR4_4_130r30rkcq4stwp.R.inc(3961);return this.iter.equals(that.iter);
    }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {try{__CLR4_4_130r30rkcq4stwp.R.inc(3962);
        __CLR4_4_130r30rkcq4stwp.R.inc(3963);int hash = "IteratorToGeneratorAdapater".hashCode();
        __CLR4_4_130r30rkcq4stwp.R.inc(3964);hash <<= 2;
        __CLR4_4_130r30rkcq4stwp.R.inc(3965);hash ^= iter.hashCode();
        __CLR4_4_130r30rkcq4stwp.R.inc(3966);return hash;
    }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {try{__CLR4_4_130r30rkcq4stwp.R.inc(3967);
        __CLR4_4_130r30rkcq4stwp.R.inc(3968);return "IteratorToGeneratorAdapter<" + iter + ">";
    }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

    // static methods
    //-----------------------------------------------------
    /**
     * Adapt an Iterator to the Generator interface.
     *
     * @param <E> the type of elements held in this generator.
     * @param iter to adapt
     * @return IteratorToGeneratorAdapter
     */
    public static <E> IteratorToGeneratorAdapter<E> adapt(Iterator<? extends E> iter) {try{__CLR4_4_130r30rkcq4stwp.R.inc(3969);
        __CLR4_4_130r30rkcq4stwp.R.inc(3970);return (((null == iter )&&(__CLR4_4_130r30rkcq4stwp.R.iget(3971)!=0|true))||(__CLR4_4_130r30rkcq4stwp.R.iget(3972)==0&false))? null : new IteratorToGeneratorAdapter<E>(iter);
    }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}

    /**
     * Adapt an Iterable to the Generator interface.
     *
     * @param <E> the type of elements held in this generator.
     * @param iterable to adapt
     * @return IteratorToGeneratorAdapter
     */
    public static <E> IteratorToGeneratorAdapter<E> adapt(Iterable<? extends E> iterable) {try{__CLR4_4_130r30rkcq4stwp.R.inc(3973);
        __CLR4_4_130r30rkcq4stwp.R.inc(3974);return (((null == iterable )&&(__CLR4_4_130r30rkcq4stwp.R.iget(3975)!=0|true))||(__CLR4_4_130r30rkcq4stwp.R.iget(3976)==0&false))? null : new IteratorToGeneratorAdapter<E>(new EqualityIterator<E>(iterable));
    }finally{__CLR4_4_130r30rkcq4stwp.R.flushNeeded();}}
}
