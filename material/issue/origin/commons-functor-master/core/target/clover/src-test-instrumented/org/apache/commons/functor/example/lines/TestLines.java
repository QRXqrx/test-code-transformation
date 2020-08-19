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
package org.apache.commons.functor.example.lines;

import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.commons.functor.adapter.NullaryProcedureProcedure;
import org.apache.commons.functor.core.Offset;
import org.apache.commons.functor.core.algorithm.FoldLeft;
import org.apache.commons.functor.core.collection.Size;
import org.apache.commons.functor.core.composite.And;
import org.apache.commons.functor.core.composite.Not;
import org.apache.commons.functor.generator.FilteredGenerator;
import org.apache.commons.functor.generator.loop.TransformedGenerator;

/**
 * @version $Revision$ $Date$
 */
public class TestLines extends TestCase {static class __CLR4_4_17wr7wrkcq4svk6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1594984854427L,8589935092L,10284,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TestLines(String testName) {
        super(testName);__CLR4_4_17wr7wrkcq4svk6.R.inc(10252);try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10251);
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}

    public static Test suite() {try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10253);
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10254);return new TestSuite(TestLines.class);
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}

    private Reader reader = null;

    @Override
    public void setUp() throws Exception {try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10255);
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10256);super.setUp();
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10257);reader = new StringReader(DOCUMENT);
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}

    @Override
    public void tearDown() throws Exception {try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10258);
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10259);super.tearDown();
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10260);reader = null;
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}

    public void testCountCharacters() throws Exception {__CLR4_4_17wr7wrkcq4svk6.R.globalSliceStart(getClass().getName(),10261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z070s27x1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17wr7wrkcq4svk6.R.rethrow($CLV_t2$);}finally{__CLR4_4_17wr7wrkcq4svk6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.lines.TestLines.testCountCharacters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z070s27x1() throws Exception{try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10261);
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10262);Object result = new FoldLeft<Integer>(Sum.instance()).evaluate(
                new TransformedGenerator<String, Integer>(Lines.from(reader), new Size<String>()));

        __CLR4_4_17wr7wrkcq4svk6.R.inc(10263);assertEquals("Expected 990 characters",Integer.valueOf(990),result);
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}

    public void testCountWords() throws Exception {__CLR4_4_17wr7wrkcq4svk6.R.globalSliceStart(getClass().getName(),10264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1db3tbh7x4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17wr7wrkcq4svk6.R.rethrow($CLV_t2$);}finally{__CLR4_4_17wr7wrkcq4svk6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.lines.TestLines.testCountWords",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1db3tbh7x4() throws Exception{try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10264);
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10265);Object result = new FoldLeft<Integer>(Sum.instance()).evaluate(
                new TransformedGenerator<String, Integer>(Lines.from(reader),WordCount.instance()));

        __CLR4_4_17wr7wrkcq4svk6.R.inc(10266);assertEquals("Expected 157 words",Integer.valueOf(157),result);
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}

    public void testCountLines() throws Exception {__CLR4_4_17wr7wrkcq4svk6.R.globalSliceStart(getClass().getName(),10267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3slg77x7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17wr7wrkcq4svk6.R.rethrow($CLV_t2$);}finally{__CLR4_4_17wr7wrkcq4svk6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.lines.TestLines.testCountLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3slg77x7() throws Exception{try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10267);
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10268);Count count = new Count();
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10269);Lines
            .from(reader)
                .run(NullaryProcedureProcedure.adapt(count));

        __CLR4_4_17wr7wrkcq4svk6.R.inc(10270);assertEquals("Expected 16 lines",16,count.getCount());
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}

    public void testCountWordsExcludingComments() throws Exception {__CLR4_4_17wr7wrkcq4svk6.R.globalSliceStart(getClass().getName(),10271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1mjty7xb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17wr7wrkcq4svk6.R.rethrow($CLV_t2$);}finally{__CLR4_4_17wr7wrkcq4svk6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.lines.TestLines.testCountWordsExcludingComments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1mjty7xb() throws Exception{try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10271);
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10272);Object result = new FoldLeft<Integer>(Sum.instance()).evaluate(new TransformedGenerator<String, Integer>(
                new FilteredGenerator<String>(Lines.from(reader), Not.not(new StartsWith<String>("#"))), WordCount
                        .instance()));

        __CLR4_4_17wr7wrkcq4svk6.R.inc(10273);assertEquals("Expected 90 words",Integer.valueOf(90),result);
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}

    public void testCountCommentLines() throws Exception {__CLR4_4_17wr7wrkcq4svk6.R.globalSliceStart(getClass().getName(),10274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z471z87xe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17wr7wrkcq4svk6.R.rethrow($CLV_t2$);}finally{__CLR4_4_17wr7wrkcq4svk6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.lines.TestLines.testCountCommentLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z471z87xe() throws Exception{try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10274);
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10275);Count count = new Count();
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10276);new FilteredGenerator<String>(Lines.from(reader), new StartsWith<String>("#"))
                    .run(NullaryProcedureProcedure.<String>adapt(count));

        __CLR4_4_17wr7wrkcq4svk6.R.inc(10277);assertEquals("Expected 6 lines",6,count.getCount());
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}

    public void testFindMatchingLines() throws Exception {__CLR4_4_17wr7wrkcq4svk6.R.globalSliceStart(getClass().getName(),10278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121zovy7xi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17wr7wrkcq4svk6.R.rethrow($CLV_t2$);}finally{__CLR4_4_17wr7wrkcq4svk6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.lines.TestLines.testFindMatchingLines",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121zovy7xi() throws Exception{try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10278);
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10279);Collection<String> matches = new FilteredGenerator<String>(Lines.from(reader), new Contains<String>("lo"))
                .toCollection();
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10280);assertEquals("Expected 5 lines",5,matches.size());
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void testFindMatchingFromTail() throws Exception {__CLR4_4_17wr7wrkcq4svk6.R.globalSliceStart(getClass().getName(),10281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16pm71z7xl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17wr7wrkcq4svk6.R.rethrow($CLV_t2$);}finally{__CLR4_4_17wr7wrkcq4svk6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.functor.example.lines.TestLines.testFindMatchingFromTail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),10281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16pm71z7xl() throws Exception{try{__CLR4_4_17wr7wrkcq4svk6.R.inc(10281);
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10282);Collection<String> matches = new FilteredGenerator<String>(Lines.from(reader), new And<String>(new Offset(
                8), new Contains<String>("lo"))).toCollection();
        __CLR4_4_17wr7wrkcq4svk6.R.inc(10283);assertEquals("Expected 2 lines",2,matches.size());
    }finally{__CLR4_4_17wr7wrkcq4svk6.R.flushNeeded();}}


    private static final String DOCUMENT =
        "# Lorem ipsum dolor sit amet, consectetuer adipiscing elit. \n" +
        "# Aliquam erat volutpat. Donec nec eros. Etiam eget tortor eu \n" +
        "tortor rutrum cursus. Pellentesque ornare pretium risus. Nulla \n" +
        "libero pede, blandit nec, rutrum ut, sodales eu, enim. Duis leo. \n" +
        "Nunc non est. Nunc consequat lobortis nisl. Vivamus et tortor in \n" +
        "# nunc euismod elementum. Ut ut dui. Morbi semper, pede eu cursus \n" +
        "# tristique, diam nunc luctus nibh, id tempor justo metus eget lorem.\n" +
        "\n" +
        "Quisque pharetra hendrerit odio. Etiam consequat ante et dui. Etiam \n" +
        "accumsan elit ac augue. Mauris porta pulvinar tellus. Nulla ac enim ac \n"+
        "augue ornare pharetra. Nunc dignissim eros et nibh. Sed justo dolor, \n" +
        "# ullamcorper non, posuere eget, tempus non, ipsum. Praesent at velit. \n" +
        "# Mauris tempor nisl sed tortor. Vestibulum ante ipsum primis in faucibus \n" +
        "orci luctus et ultrices posuere cubilia Curae; Integer mollis malesuada \n" +
        "dolor. Vestibulum cursus, mi in dictum blandit, eros enim convallis wisi, \n" +
        "id ullamcorper metus tortor interdum dui.\n";
}
