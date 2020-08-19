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
package org.apache.commons.functor.aggregator;

import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * An aggregator which automatically resets the aggregated data at regular
 * intervals and sends a notification when it is about to do so, so listeners
 * can decide to gather the information before it is being reset (and log it
 * etc). This allows for smaller memory footprints for instance in the case of
 * List-based aggregators, as regularly the list is emptied. Also it allows for
 * the call to <code>evaluate</code> to represent an "aggregated" value over a
 * certain period of time. Note that you can still have a regular aggregator
 * extending this class by specifying an interval less than or equal to zero.
 * The regular flush/reset will be triggered from a timer which will always be
 * started as a daemon thread (so it will stop when there are no more non-daemon
 * threads in the JVM); this class allows 2 types of timers:
 * <ul>
 * <li>(default) per instance <code>Timer</code> -- each instance of this class
 * will create a new <code>Timer</code> and this <code>Timer</code> will have a
 * single <code>TimerTask</code> scheduled, which is the one that resets this
 * <code>Aggregator</code> regularly and sends notifications. This way, when the
 * <code>Aggregator</code> instance is destroyed, the <code>Timer</code> goes as
 * well.</li>
 * <li>shared <code>Timer</code> instance -- this class will create a static
 * instance of <code>Timer</code> which can be shared by other instances of this
 * class. While this is a bit more effective from a memory and thread management
 * point of view, it has the downside that if the <code>TimerTask</code>'s are
 * not managed properly this can create memory leaks. So if you decide to take
 * this route make sure when you are finished with this instance, to always stop
 * the timer at the end.</li>
 * </ul>
 * <p>
 * <b>Synchronization</b>: This class provides a thread safe framework so when
 * {@link #doAdd(Object)}, {@link #reset()} and {@link #evaluate()} is called,
 * access is synchronized via a read-write lock. {@link #evaluate()} is
 * considered a read operation and {@link #doAdd(Object)} and {@link #reset()}
 * are considered write operations.
 * </p>
 *
 * @param <T>
 *            type of data to aggregate
 */
public abstract class AbstractTimedAggregator<T> implements Aggregator<T> {

    public static class __CLR4_4_1txtxkcq4st8y {

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
                _R = com_atlassian_clover.Clover.getRecorder("\u002f\u0072\u006f\u006f\u0074\u002f\u0071\u0072\u0078\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0074\u0065\u0073\u0074\u002d\u0063\u006f\u0064\u0065\u002d\u0074\u0072\u0061\u006e\u0073\u0066\u006f\u0072\u006d\u0061\u0074\u0069\u006f\u006e\u002f\u0065\u0078\u0070\u0065\u0072\u0069\u006d\u0065\u006e\u0074\u002f\u0037\u002f\u006f\u0072\u0069\u0067\u0069\u006e\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u0066\u0075\u006e\u0063\u0074\u006f\u0072\u002d\u006d\u0061\u0073\u0074\u0065\u0072\u002f\u0063\u006f\u0072\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062", 1594984852842L, 8589935092L, 1174, profiles, new java.lang.String[] { "clover.distributed.coverage", null });
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
     * Stores a list to all objects which are listening for time events
     * generated by this object. If there is no timer programmed (e.g.
     * {@link #interval} is set to 0) this list will be <code>null</code>. Under
     * the cover, this will use a <code>CopyOnWriteArrayList</code> since there
     * aren't too many updates expected to this list.
     *
     * @see #interval
     * @see #timer
     * @see TimedAggregatorListener
     */
    private List<TimedAggregatorListener<T>> timerListeners;

    /**
     * As per {@link #timer} javadoc, if the interval specified is zero or less
     * there will be no <code>Timer</code> created/assigned to this instance.
     * This constant is defined to make it easier to read code which creates
     * instances of this class and doesn't assign them a timer.
     */
    public static final long NO_TIMER = 0L;

    /**
     * Name of the shared timer which will run all the TimerTasks resulted from
     * creating instances of this class which are set to used the shared timer.
     * This is useful when looking at thread dumps. For instances which use
     * their own timer task, the name will be
     * <code>TIMER_NAME + hashCode()</code>.
     */
    public static final String TIMER_NAME = "TimedSummarizerMainTimer";

    /**
     * The main shared timer which will execute all the <code>TimerTasks</code>
     * resulted from instances of this class which chose to use the shared
     * timer. Note that this <code>Timer</code> is started as a daemon thread so
     * it will stop when there are no more non-daemon threads.
     *
     * @see #timer
     */
    private static final Timer MAIN_TIMER = new Timer(TIMER_NAME, true);

    /**
     * The timer instance for this instance. Can point to {@link #MAIN_TIMER} if
     * shared timer was chosen in constructor or a newly created instance of
     * <code>Timer</code> which is private to this instance only.
     *
     * @see #MAIN_TIMER
     */
    private Timer timer;

    /**
     * Interval in milliseconds we flush the result of the "summary". This will
     * be used to set up our <code>TimerTask</code> and schedule it with the
     * <code>Timer</code>. Every time the timer kicks in after this interval, it
     * will call {@link #timer()}. If this is set to a value of zero or less, no
     * timer will be created.
     */
    private long interval;

    /**
     * This is the task that is created when a new instance of this class is
     * created. Once created this task will be scheduled with the {@link #timer}
     * . Calling {@link #stop()} cancels this task and also will set it to null
     * (so it can be recycled by the garbage collection), otherwise, until that
     * point this will store a reference to a valid <code>TimerTask</code>
     * instance.
     */
    private TimerTask task;

    /**
     * Lock used internally to synchronize access to {@link #add(Object)},
     * {@link #reset()} and {@link #evaluate()}. Locks for writing when
     * {@link #add(Object)} and {@link #reset()} is called and for reading when
     * {@link #evaluate()} is called.
     *
     * @see #add(Object)
     * @see #evaluate()
     * @see #reset()
     */
    private ReadWriteLock dataLock;

    /**
     * Default constructor -- creates an instance of this aggregator with no
     * <code>Timer</code>. Equivalent to
     * <code>AbstractTimedAggregator(NO_TIMER)</code>.
     *
     * @see #AbstractTimedAggregator(long)
     */
    public AbstractTimedAggregator() {
        this(NO_TIMER);
        __CLR4_4_1txtxkcq4st8y.R.inc(1078);
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1077);
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Creates an aggregator which has a timer at the specified interval
     * (miliseconds) and uses its own timer rather than the shared
     * {@link #MAIN_TIMER}. Equivalent to
     * <code>AbstractTimedAggregator(interval,false)</code>.
     *
     * @param interval
     *            interval in miliseconds to set the timer for.
     * @see #interval
     * @see #timer
     * @see #AbstractTimedAggregator(long, boolean)
     */
    public AbstractTimedAggregator(long interval) {
        this(interval, false);
        __CLR4_4_1txtxkcq4st8y.R.inc(1080);
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1079);
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Creates an aggregator which has a timer at the specified interval and
     * also allows control over using the {@link #MAIN_TIMER shared timer} or
     * its own per-instance timer.
     *
     * @param interval
     *            interval in miliseconds to set the timer for.
     * @param useSharedTimer
     *            if set to <code>true</code>, {@link #timer} will be set to
     *            {@link #TIMER_NAME}, otherwise a new instance of
     *            <code>Timer</code> will be created.
     */
    public AbstractTimedAggregator(long interval, boolean useSharedTimer) {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1081);
            __CLR4_4_1txtxkcq4st8y.R.inc(1082);
            if ((((interval <= NO_TIMER) && (__CLR4_4_1txtxkcq4st8y.R.iget(1083) != 0 | true)) || (__CLR4_4_1txtxkcq4st8y.R.iget(1084) == 0 & false))) {
                {
                    // not using timer
                    __CLR4_4_1txtxkcq4st8y.R.inc(1085);
                    this.interval = NO_TIMER;
                    __CLR4_4_1txtxkcq4st8y.R.inc(1086);
                    this.timer = null;
                    __CLR4_4_1txtxkcq4st8y.R.inc(1087);
                    this.task = null;
                    __CLR4_4_1txtxkcq4st8y.R.inc(1088);
                    this.timerListeners = null;
                }
            } else {
                {
                    // we have been requested to use timers
                    __CLR4_4_1txtxkcq4st8y.R.inc(1089);
                    this.interval = interval;
                    __CLR4_4_1txtxkcq4st8y.R.inc(1090);
                    this.timerListeners = new CopyOnWriteArrayList<TimedAggregatorListener<T>>();
                    __CLR4_4_1txtxkcq4st8y.R.inc(1091);
                    if ((((useSharedTimer) && (__CLR4_4_1txtxkcq4st8y.R.iget(1092) != 0 | true)) || (__CLR4_4_1txtxkcq4st8y.R.iget(1093) == 0 & false))) {
                        {
                            __CLR4_4_1txtxkcq4st8y.R.inc(1094);
                            this.timer = MAIN_TIMER;
                        }
                    } else {
                        {
                            __CLR4_4_1txtxkcq4st8y.R.inc(1095);
                            this.timer = new Timer(TIMER_NAME + hashCode(), true);
                        }
                    // having set up the timer, create the task
                    }
                    __CLR4_4_1txtxkcq4st8y.R.inc(1096);
                    this.task = new TimerTask() {

                        @Override
                        public void run() {
                            try {
                                __CLR4_4_1txtxkcq4st8y.R.inc(1097);
                                __CLR4_4_1txtxkcq4st8y.R.inc(1098);
                                timer();
                            } finally {
                                __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
                            }
                        }
                    };
                    __CLR4_4_1txtxkcq4st8y.R.inc(1099);
                    this.timer.scheduleAtFixedRate(this.task, this.interval, this.interval);
                }
            }
            __CLR4_4_1txtxkcq4st8y.R.inc(1100);
            this.dataLock = new ReentrantReadWriteLock();
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Getter for {@link #interval}.
     *
     * @return Current value of {@link #interval}.
     */
    public final long getInterval() {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1101);
            __CLR4_4_1txtxkcq4st8y.R.inc(1102);
            return interval;
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Adds the data to this aggregator. This function first locks
     * {@link #dataLock} for writing then calls {@link #doAdd(Object)}, which
     * allows subclasses to perform the actual adding to the aggregator and then
     * at the end it unlocks {@link #dataLock}.
     *
     * @param data
     *            Data to be added to the aggregator.
     * @see #doAdd(Object)
     * @see #dataLock
     */
    public final void add(T data) {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1103);
            __CLR4_4_1txtxkcq4st8y.R.inc(1104);
            dataLock.writeLock().lock();
            __CLR4_4_1txtxkcq4st8y.R.inc(1105);
            try {
                __CLR4_4_1txtxkcq4st8y.R.inc(1106);
                doAdd(data);
            } finally {
                __CLR4_4_1txtxkcq4st8y.R.inc(1107);
                dataLock.writeLock().unlock();
            }
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Function provided to allow subclasses to perform the actual adding of the
     * data to the aggregator. This function is wrapped by {@link #add(Object)}
     * so that access to any internal data series (implemented by subclasses)
     * via {@link #add(Object)} or {@link #evaluate()} or {@link #reset()} is
     * prohibited during this call, as a <b>write</b> lock is acquired prior to
     * this function call to ensure this function is the only one which has
     * access to the data.
     *
     * @param data
     *            Data to be aggregated
     * @see #add(Object)
     */
    protected abstract void doAdd(T data);

    /**
     * Aggregates all the data this object has been "fed" via calls to
     * {@link #add(Object)}. Note that this object delegates the call to
     * {@link #doEvaluate()} after it secured read-only access to
     * {@link #dataLock} -- so any data series access can be safely read
     * (however, subclasses should NOT try to modify any data series they might
     * implement at this point!). The lock is released after
     * {@link #doEvaluate()} returns.
     *
     * @return result of aggregating the data, as returned by
     *         {@link #doEvaluate()}
     * @see #doEvaluate()
     */
    public final T evaluate() {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1108);
            __CLR4_4_1txtxkcq4st8y.R.inc(1109);
            dataLock.readLock().lock();
            __CLR4_4_1txtxkcq4st8y.R.inc(1110);
            try {
                __CLR4_4_1txtxkcq4st8y.R.inc(1111);
                return doEvaluate();
            } finally {
                __CLR4_4_1txtxkcq4st8y.R.inc(1112);
                dataLock.readLock().unlock();
            }
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Allows subclasses to perform the actual evaluation of the aggregated
     * result in a thread-safe manner. When this function is called,
     * <b>write</b> access to data (via {@link #add(Object)} and
     * {@link #reset()}) is prohibited until this function finishes. However,
     * please note that other read access (via calls to the same
     * {@link #evaluate()}) is possible.
     *
     * @return Result of evaluating the aggregated data
     */
    protected abstract T doEvaluate();

    /**
     * Resets this aggregator.This function first locks {@link #dataLock} for
     * writing then calls {@link #doReset()}, which allows subclasses to perform
     * the actual resetting of the aggregator and then at the end it unlocks
     * {@link #dataLock}.
     *
     * @see #doReset()
     */
    public final void reset() {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1113);
            __CLR4_4_1txtxkcq4st8y.R.inc(1114);
            dataLock.writeLock().lock();
            __CLR4_4_1txtxkcq4st8y.R.inc(1115);
            try {
                __CLR4_4_1txtxkcq4st8y.R.inc(1116);
                doReset();
            } finally {
                __CLR4_4_1txtxkcq4st8y.R.inc(1117);
                dataLock.writeLock().unlock();
            }
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Function provided to allow subclasses to perform the actual reset of the
     * aggregator. This function is wrapped by {@link #reset()} so that access
     * to data (via {@link #add(Object)} or {@link #evaluate()} or
     * {@link #reset()}) is prohibited during this call, as a <b>write</b> lock
     * is acquired prior to this function call to ensure this function is the
     * only one which has access to the data.
     */
    protected abstract void doReset();

    /**
     * Retrieves the size of the currently-stored data series. This function
     * first locks {@link #dataLock} for reading then calls
     * {@link #retrieveDataSize()}, which allows subclasses to compute the data
     * series size and then at the end it unlocks {@link #dataLock}.
     *
     * @return Size of the current data series, which will be aggregated at the
     *         next call to {@link #evaluate()}
     */
    public final int getDataSize() {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1118);
            __CLR4_4_1txtxkcq4st8y.R.inc(1119);
            dataLock.readLock().lock();
            __CLR4_4_1txtxkcq4st8y.R.inc(1120);
            try {
                __CLR4_4_1txtxkcq4st8y.R.inc(1121);
                return retrieveDataSize();
            } finally {
                __CLR4_4_1txtxkcq4st8y.R.inc(1122);
                dataLock.readLock().unlock();
            }
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Function provided to allow subclasses to retrieve the actual size of the
     * data series. This function is wrapped by {@link #getDataSize()} so that
     * access to data (via {@link #add(Object)} or {@link #reset()}) is
     * prohibited during this call, as a <b>read</b> lock is acquired prior to
     * this function call. (However, calls to {@link #evaluate()} are allowed as
     * that locks for reading too.)
     *
     * @return Size of the current data series. Zero means no data stored.
     */
    protected abstract int retrieveDataSize();

    /**
     * Retrieves <b>an unmodifiable copy</b> of the {@link #timerListeners timer
     * listeners}. Used for testing.
     *
     * @return <code>Collections.unmodifiableList(timerListeners)</code> if
     *         {@link #timerListeners} is <b>not</b> <code>null</code>, or
     *         <code>null</code> otherwise.
     */
    final List<TimedAggregatorListener<T>> getTimerListeners() {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1123);
            __CLR4_4_1txtxkcq4st8y.R.inc(1124);
            if ((((timerListeners == null) && (__CLR4_4_1txtxkcq4st8y.R.iget(1125) != 0 | true)) || (__CLR4_4_1txtxkcq4st8y.R.iget(1126) == 0 & false))) {
                {
                    __CLR4_4_1txtxkcq4st8y.R.inc(1127);
                    return null;
                }
            }
            __CLR4_4_1txtxkcq4st8y.R.inc(1128);
            return Collections.unmodifiableList(timerListeners);
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * If this <code>Aggregator</code> has been started with timer support, it
     * will add the given listener, so it receives
     * {@link TimedAggregatorListener#onTimer(AbstractTimedAggregator,Object)
     * timer events}. If no timer support has been configured for this
     * Aggregator, this call has no effect.
     *
     * @param listener
     *            Listener to be added to received timer events from this
     *            aggregator.
     * @see #timerListeners
     */
    public final void addTimerListener(TimedAggregatorListener<T> listener) {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1129);
            __CLR4_4_1txtxkcq4st8y.R.inc(1130);
            if ((((timerListeners == null) && (__CLR4_4_1txtxkcq4st8y.R.iget(1131) != 0 | true)) || (__CLR4_4_1txtxkcq4st8y.R.iget(1132) == 0 & false))) {
                {
                    __CLR4_4_1txtxkcq4st8y.R.inc(1133);
                    return;
                }
            }
            __CLR4_4_1txtxkcq4st8y.R.inc(1134);
            timerListeners.add(listener);
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Removes a listener from the timer listeners list if previously added. If
     * this Aggregator has been configured with no timer support, this call will
     * always return <code>false</code>.
     *
     * @param listener
     *            Listener to be removed from the list. NullPointerException
     *            thrown if this is null.
     * @return <code>true</code> if this Aggregator has timer support and the
     *         listener passed in was previously added (via
     *         {@link #addTimerListener(TimedAggregatorListener)}) or false if
     *         either the Aggregator has no timer support or it has timer
     *         support but the listener was never registered with this
     *         Aggregator.
     * @see #timerListeners
     */
    public final boolean removeTimerListener(TimedAggregatorListener<T> listener) {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1135);
            __CLR4_4_1txtxkcq4st8y.R.inc(1136);
            if ((((timerListeners == null) && (__CLR4_4_1txtxkcq4st8y.R.iget(1137) != 0 | true)) || (__CLR4_4_1txtxkcq4st8y.R.iget(1138) == 0 & false))) {
                {
                    __CLR4_4_1txtxkcq4st8y.R.inc(1139);
                    return false;
                }
            }
            __CLR4_4_1txtxkcq4st8y.R.inc(1140);
            return timerListeners.remove(listener);
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Computes the current aggregated value (by calling {@link #evaluate()},
     * resets this aggregator then notifies all listeners. Go through all the
     * {@link #timerListeners} and sends
     * {@link TimedAggregatorListener#onTimer(AbstractTimedAggregator,Object)
     * notification messages} to each of them. Does nothing if
     * {@link #timerListeners} is <code>null</code>. Please note that
     * {@link #evaluate()} is called only once at the beginning of this
     * function, and only if there are listeners configured, then this value is
     * passed to every notification. This is in order to ensure all listeners
     * receive the same value -- the value of the evaluation prior to resetting
     * it.
     */
    private void timer() {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1141);
            __CLR4_4_1txtxkcq4st8y.R.inc(1142);
            if ((((timerListeners != null) && (__CLR4_4_1txtxkcq4st8y.R.iget(1143) != 0 | true)) || (__CLR4_4_1txtxkcq4st8y.R.iget(1144) == 0 & false))) {
                {
                    // if we have listeners, notify them
                    // NOTE: shouldn't evaluate() and reset()
                    __CLR4_4_1txtxkcq4st8y.R.inc(1145);
                    // NOTE: shouldn't evaluate() and reset()
                    T aggregated = evaluate();
                    // be done atomically here?
                    __CLR4_4_1txtxkcq4st8y.R.inc(1146);
                    reset();
                    __CLR4_4_1txtxkcq4st8y.R.inc(1147);
                    for (TimedAggregatorListener<T> i : timerListeners) {
                        {
                            __CLR4_4_1txtxkcq4st8y.R.inc(1148);
                            i.onTimer(this, aggregated);
                        }
                    }
                }
            } else {
                {
                    __CLR4_4_1txtxkcq4st8y.R.inc(1149);
                    reset();
                }
            }
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Checks whether this instance has a timer associated with it or not. If
     * there is a timer for this Aggregator, then the {@link #task} member
     * should be set to a non-null value.
     *
     * @return <code>true</code> if {@link #task} is not null,
     *         <code>false</code> otherwise (in which case there is no timer).
     */
    public final boolean isTimerEnabled() {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1150);
            __CLR4_4_1txtxkcq4st8y.R.inc(1151);
            return (task != null);
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Checks whether this instance uses its own timer or {@link #MAIN_TIMER the
     * shared timer} for scheduling {@link #task the timer task}.
     *
     * @return <code>true</code> if <code>timer == MAIN_TIMER</code> or
     *         <code>false</code> otherwise.
     */
    public final boolean isSharedTimer() {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1152);
            __CLR4_4_1txtxkcq4st8y.R.inc(1153);
            return (timer == MAIN_TIMER);
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    /**
     * Cancels the current timer task (if set) -- which means from there on the
     * data will not be reset anymore. Also, if {@link #timer} is not set to
     * {@link #MAIN_TIMER the shared timer} then it will be cancelled as well
     * Also releases all the listeners from the {@link #timerListeners list}.
     */
    public final void stop() {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1154);
            // cancel the task first
            __CLR4_4_1txtxkcq4st8y.R.inc(1155);
            if ((((task != null) && (__CLR4_4_1txtxkcq4st8y.R.iget(1156) != 0 | true)) || (__CLR4_4_1txtxkcq4st8y.R.iget(1157) == 0 & false))) {
                {
                    __CLR4_4_1txtxkcq4st8y.R.inc(1158);
                    task.cancel();
                    __CLR4_4_1txtxkcq4st8y.R.inc(1159);
                    task = null;
                    // remove the reference to this task
                    __CLR4_4_1txtxkcq4st8y.R.inc(1160);
                    // remove the reference to this task
                    timer.purge();
                }
            // then the timer if needed
            }
            __CLR4_4_1txtxkcq4st8y.R.inc(1161);
            if ((((timer != null && timer != MAIN_TIMER) && (__CLR4_4_1txtxkcq4st8y.R.iget(1162) != 0 | true)) || (__CLR4_4_1txtxkcq4st8y.R.iget(1163) == 0 & false))) {
                {
                    __CLR4_4_1txtxkcq4st8y.R.inc(1164);
                    timer.cancel();
                }
            }
            __CLR4_4_1txtxkcq4st8y.R.inc(1165);
            timer = null;
            // finally remove the elements from the listeners list
            __CLR4_4_1txtxkcq4st8y.R.inc(1166);
            if ((((timerListeners != null) && (__CLR4_4_1txtxkcq4st8y.R.iget(1167) != 0 | true)) || (__CLR4_4_1txtxkcq4st8y.R.iget(1168) == 0 & false))) {
                {
                    __CLR4_4_1txtxkcq4st8y.R.inc(1169);
                    timerListeners.clear();
                }
            }
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    @Override
    protected final void finalize() throws Throwable {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1170);
            // if we're going in the garbage, make sure we clean up
            __CLR4_4_1txtxkcq4st8y.R.inc(1171);
            stop();
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }

    @Override
    public String toString() {
        try {
            __CLR4_4_1txtxkcq4st8y.R.inc(1172);
            __CLR4_4_1txtxkcq4st8y.R.inc(1173);
            return AbstractTimedAggregator.class.getName();
        } finally {
            __CLR4_4_1txtxkcq4st8y.R.flushNeeded();
        }
    }
}

