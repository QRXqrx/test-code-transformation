/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */
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
package org.apache.commons.functor.example.lines;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import org.apache.commons.functor.Procedure;
import org.apache.commons.functor.generator.loop.LoopGenerator;

/**
 * @version $Revision$ $Date$
 */
public class Lines extends LoopGenerator<String> {

    public static class __CLR4_4_17vj7vjkcq4svje {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984854427L, 8589935092L, 10237, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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

    public static Lines from(Reader reader) {
        try {
            __CLR4_4_17vj7vjkcq4svje.R.inc(10207);
            __CLR4_4_17vj7vjkcq4svje.R.inc(10208);
            return new Lines(reader);
        } finally {
            __CLR4_4_17vj7vjkcq4svje.R.flushNeeded();
        }
    }

    public static Lines from(File file) throws FileNotFoundException {
        try {
            __CLR4_4_17vj7vjkcq4svje.R.inc(10209);
            __CLR4_4_17vj7vjkcq4svje.R.inc(10210);
            return new Lines(new FileReader(file));
        } finally {
            __CLR4_4_17vj7vjkcq4svje.R.flushNeeded();
        }
    }

    public Lines(Reader reader) {
        try {
            __CLR4_4_17vj7vjkcq4svje.R.inc(10211);
            __CLR4_4_17vj7vjkcq4svje.R.inc(10212);
            if ((((reader instanceof BufferedReader) && (__CLR4_4_17vj7vjkcq4svje.R.iget(10213) != 0 | true)) || (__CLR4_4_17vj7vjkcq4svje.R.iget(10214) == 0 & false))) {
                {
                    __CLR4_4_17vj7vjkcq4svje.R.inc(10215);
                    in = (BufferedReader) reader;
                }
            } else {
                {
                    __CLR4_4_17vj7vjkcq4svje.R.inc(10216);
                    in = new BufferedReader(reader);
                }
            }
        } finally {
            __CLR4_4_17vj7vjkcq4svje.R.flushNeeded();
        }
    }

    public void run(Procedure<? super String> proc) {
        try {
            __CLR4_4_17vj7vjkcq4svje.R.inc(10217);
            __CLR4_4_17vj7vjkcq4svje.R.inc(10218);
            try {
                __CLR4_4_17vj7vjkcq4svje.R.inc(10219);
                for (String line = in.readLine(); (((line != null) && (__CLR4_4_17vj7vjkcq4svje.R.iget(10220) != 0 | true)) || (__CLR4_4_17vj7vjkcq4svje.R.iget(10221) == 0 & false)); line = in.readLine()) {
                    {
                        __CLR4_4_17vj7vjkcq4svje.R.inc(10222);
                        proc.run(line);
                    }
                }
            } catch (RuntimeException e) {
                __CLR4_4_17vj7vjkcq4svje.R.inc(10223);
                throw e;
            } catch (Exception e) {
                __CLR4_4_17vj7vjkcq4svje.R.inc(10224);
                throw new TunneledException(e);
            } finally {
                __CLR4_4_17vj7vjkcq4svje.R.inc(10225);
                stop();
            }
        } finally {
            __CLR4_4_17vj7vjkcq4svje.R.flushNeeded();
        }
    }

    @Override
    public void stop() {
        try {
            __CLR4_4_17vj7vjkcq4svje.R.inc(10226);
            __CLR4_4_17vj7vjkcq4svje.R.inc(10227);
            super.stop();
            __CLR4_4_17vj7vjkcq4svje.R.inc(10228);
            try {
                __CLR4_4_17vj7vjkcq4svje.R.inc(10229);
                in.close();
            } catch (RuntimeException e) {
                __CLR4_4_17vj7vjkcq4svje.R.inc(10230);
                throw e;
            } catch (Exception e) {
                __CLR4_4_17vj7vjkcq4svje.R.inc(10231);
                throw new TunneledException(e);
            }
        } finally {
            __CLR4_4_17vj7vjkcq4svje.R.flushNeeded();
        }
    }

    private BufferedReader in = null;

    private class TunneledException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        private Exception exception = null;

        TunneledException(Exception exception) {
            super(exception.toString());
            __CLR4_4_17vj7vjkcq4svje.R.inc(10233);
            try {
                __CLR4_4_17vj7vjkcq4svje.R.inc(10232);
                __CLR4_4_17vj7vjkcq4svje.R.inc(10234);
                this.exception = exception;
            } finally {
                __CLR4_4_17vj7vjkcq4svje.R.flushNeeded();
            }
        }

        // this is an override if compiled against Java >= 1.4, but just another method on 1.3
        /**
         * Get the cause of this TunneledException
         */
        @Override
        public Throwable getCause() {
            try {
                __CLR4_4_17vj7vjkcq4svje.R.inc(10235);
                __CLR4_4_17vj7vjkcq4svje.R.inc(10236);
                return exception;
            } finally {
                __CLR4_4_17vj7vjkcq4svje.R.flushNeeded();
            }
        }
    }
}

