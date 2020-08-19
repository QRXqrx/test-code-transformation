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

import org.apache.commons.functor.generator.BaseGenerator;
import org.apache.commons.functor.generator.Generator;

/**
 * Base class for generators that control execution flow, and may need to
 * stop the generation.
 *
 * @param <E> the type of elements held in this generator.
 * @since 1.0
 * @version $Revision$ $Date$
 */
public abstract class LoopGenerator<E> extends BaseGenerator<E> {public static class __CLR4_4_132h32hkcq4stwu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984852842L,8589935092L,3991,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** A generator can wrap another generator. */
    private final Generator<? extends E> wrappedGenerator;

    /** Set to true when the generator is {@link #stop stopped}. */
    private boolean stopped = false;

    /** Create a new generator. */
    public LoopGenerator() {
        this(null);__CLR4_4_132h32hkcq4stwu.R.inc(3978);try{__CLR4_4_132h32hkcq4stwu.R.inc(3977);
    }finally{__CLR4_4_132h32hkcq4stwu.R.flushNeeded();}}

    /**
     * A generator can wrap another generator. When wrapping generators you
     * should use probably this constructor since doing so will cause the
     * {@link #stop} method to stop the wrapped generator as well.
     * @param generator Generator to wrap
     */
    public LoopGenerator(Generator<? extends E> generator) {try{__CLR4_4_132h32hkcq4stwu.R.inc(3979);
        __CLR4_4_132h32hkcq4stwu.R.inc(3980);this.wrappedGenerator = generator;
    }finally{__CLR4_4_132h32hkcq4stwu.R.flushNeeded();}}

    /**
     * Get the generator that is being wrapped.
     * @return Generator
     */
    protected Generator<? extends E> getWrappedGenerator() {try{__CLR4_4_132h32hkcq4stwu.R.inc(3981);
        __CLR4_4_132h32hkcq4stwu.R.inc(3982);return wrappedGenerator;
    }finally{__CLR4_4_132h32hkcq4stwu.R.flushNeeded();}}

    /**
     * Stop the generator. Will stop the wrapped generator if one was set.
     */
    public void stop() {try{__CLR4_4_132h32hkcq4stwu.R.inc(3983);
        __CLR4_4_132h32hkcq4stwu.R.inc(3984);if ((((wrappedGenerator != null && wrappedGenerator instanceof LoopGenerator<?>)&&(__CLR4_4_132h32hkcq4stwu.R.iget(3985)!=0|true))||(__CLR4_4_132h32hkcq4stwu.R.iget(3986)==0&false))) {{
            __CLR4_4_132h32hkcq4stwu.R.inc(3987);((LoopGenerator<?>) wrappedGenerator).stop();
        }
        }__CLR4_4_132h32hkcq4stwu.R.inc(3988);stopped = true;
    }finally{__CLR4_4_132h32hkcq4stwu.R.flushNeeded();}}

    /**
     * Check if the generator is stopped.
     * @return <code>true</code> if the generator is stopped, <code>false</code>
     * otherwise
     */
    public boolean isStopped() {try{__CLR4_4_132h32hkcq4stwu.R.inc(3989);
        __CLR4_4_132h32hkcq4stwu.R.inc(3990);return stopped;
    }finally{__CLR4_4_132h32hkcq4stwu.R.flushNeeded();}}

}
