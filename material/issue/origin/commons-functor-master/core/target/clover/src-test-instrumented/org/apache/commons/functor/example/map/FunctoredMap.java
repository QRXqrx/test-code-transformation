/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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
package org.apache.commons.functor.example.map;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.apache.commons.functor.BinaryFunction;
import org.apache.commons.functor.BinaryProcedure;
import org.apache.commons.functor.NullaryProcedure;
import org.apache.commons.functor.Predicate;
import org.apache.commons.functor.Procedure;

/**
 * @version $Revision$ $Date$
 */
@SuppressWarnings("unchecked")
public class FunctoredMap<K, V> implements Map<K, V> {public static class __CLR4_4_17ye7yekcq4svkw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10383,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public FunctoredMap(Map<? super K, ? super V> map) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10310);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10311);this.map = (Map<K, V>)map;
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10312);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10313);return map.hashCode();
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10314);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10315);return map.toString();
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public Collection<V> values() {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10316);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10317);return map.values();
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public Set<K> keySet() {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10318);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10319);return map.keySet();
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public V get(Object key) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10320);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10321);return onget.evaluate(map, (K)key);
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public void clear() {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10322);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10323);onclear.run(map);
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public int size() {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10324);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10325);return map.size();
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public Object put(Object key, Object value) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10326);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10327);return onput.evaluate(map, new Object[] { key, value });
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public void putAll(Map<? extends K, ? extends V> src) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10328);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10329);onputall.run(map, (Map<K, V>)src);
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public Set<Map.Entry<K, V>> entrySet() {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10330);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10331);return map.entrySet();
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public boolean containsKey(Object key) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10332);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10333);return map.containsKey(key);
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public boolean isEmpty() {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10334);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10335);return map.isEmpty();
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public V remove(Object key) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10336);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10337);return onremove.evaluate(map, (K)key);
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10338);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10339);return map.equals(obj);
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    public boolean containsValue(Object value) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10340);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10341);return map.containsValue(value);
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    // protected

    protected void setOnClear(Procedure<Map<K, V>> procedure) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10342);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10343);onclear = procedure;
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    protected void setOnPut(BinaryFunction<Map<K, V>, Object[], V> function) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10344);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10345);onput = function;
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    protected void setOnGet(BinaryFunction<Map<K, V>, K, V> function) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10346);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10347);onget = function;
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    protected void setOnPutAll(BinaryProcedure<Map<K, V>, Map<K, V>> procedure) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10348);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10349);onputall = procedure;
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    protected void setOnRemove(BinaryFunction<Map<K, V>, K, V> function) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10350);
        __CLR4_4_17ye7yekcq4svkw.R.inc(10351);onremove = function;
    }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

    // attributes

    protected BinaryFunction<Map<K, V>, Object[], V> DEFAULT_ON_PUT = new BinaryFunction<Map<K, V>, Object[], V>() {
        public V evaluate(Map<K, V> a, Object[] b) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10352);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10353);Map<K, V> map = a;
            __CLR4_4_17ye7yekcq4svkw.R.inc(10354);K key = (K)Array.get(b,0);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10355);V value = (V)Array.get(b,1);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10356);return map.put(key,value);
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}
    };

    private BinaryFunction<Map<K, V>, Object[], V> onput = DEFAULT_ON_PUT;

    protected BinaryFunction<Map<K, V>, K, V> DEFAULT_ON_GET = new BinaryFunction<Map<K, V>, K, V>() {
        public V evaluate(Map<K, V> map, K key) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10357);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10358);return map.get(key);
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}
    };

    private BinaryFunction<Map<K, V>, K, V> onget = DEFAULT_ON_GET;
    
    protected BinaryProcedure<Map<K, V>, Map<K, V>> DEFAULT_ON_PUT_ALL = new BinaryProcedure<Map<K, V>, Map<K, V>>() {
        public void run(Map<K, V> a, Map<K, V> b) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10359);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10360);Map<K, V> dest = a;
            __CLR4_4_17ye7yekcq4svkw.R.inc(10361);Map<K, V> src = b;
            __CLR4_4_17ye7yekcq4svkw.R.inc(10362);dest.putAll(src);
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}
    };

    private BinaryProcedure<Map<K, V>, Map<K, V>> onputall = DEFAULT_ON_PUT_ALL;

    protected BinaryFunction<Map<K, V>, K, V> DEFAULT_ON_REMOVE = new BinaryFunction<Map<K, V>, K, V>() {
        public V evaluate(Map<K, V> a, K key) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10363);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10364);Map<K, V> map = a;
            __CLR4_4_17ye7yekcq4svkw.R.inc(10365);return map.remove(key);
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}
    };

    private BinaryFunction<Map<K, V>, K, V> onremove = DEFAULT_ON_REMOVE;

    protected Procedure<Map<K, V>> DEFAULT_ON_CLEAR = new Procedure<Map<K, V>>() {
        public void run(Map<K, V> map) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10366);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10367);map.clear();
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}
    };

    private Procedure<Map<K, V>> onclear = DEFAULT_ON_CLEAR;

    private Map<K, V> map = null;

    // inner classes

    protected static class ContainsKey implements Predicate<Object> {
        ContainsKey(Map<?, ?> map) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10368);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10369);this.map = map;
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

        public boolean test(Object obj) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10370);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10371);return map.containsKey(obj);
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

        private Map<?, ?> map = null;
    }

    protected static class Throw<K, V> implements NullaryProcedure, Procedure<Map<K, V>>, BinaryProcedure<K, V> {
        Throw(RuntimeException e) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10372);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10373);this.klass = e.getClass();
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

        public void run() {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10374);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10375);try {
                __CLR4_4_17ye7yekcq4svkw.R.inc(10376);throw (RuntimeException)(klass.newInstance());
            } catch(IllegalAccessException e) {
                __CLR4_4_17ye7yekcq4svkw.R.inc(10377);throw new RuntimeException();
            } catch (InstantiationException e) {
                __CLR4_4_17ye7yekcq4svkw.R.inc(10378);throw new RuntimeException();
            }
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

        public void run(Map<K, V> obj) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10379);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10380);run();
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

        public void run(K a, V b) {try{__CLR4_4_17ye7yekcq4svkw.R.inc(10381);
            __CLR4_4_17ye7yekcq4svkw.R.inc(10382);run();
        }finally{__CLR4_4_17ye7yekcq4svkw.R.flushNeeded();}}

        private Class<?> klass = null;
    }
}
