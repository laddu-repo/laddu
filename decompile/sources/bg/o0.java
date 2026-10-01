package bg;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class o0 {
    public static final n0 Companion = new Object();
    public static final o0 NONE = new Object();
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public void awaitSignal(Condition condition) {
        kotlin.jvm.internal.k.e(condition, "condition");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (timeoutNanos > 0) {
                Object obj = this.cancelMark;
                if (condition.awaitNanos(timeoutNanos) > 0 || this.cancelMark != obj) {
                    return;
                } else {
                    throw new InterruptedIOException("timeout");
                }
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    public o0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public o0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final o0 deadline(long j, TimeUnit unit) {
        kotlin.jvm.internal.k.e(unit, "unit");
        if (j > 0) {
            return deadlineNanoTime(unit.toNanos(j) + System.nanoTime());
        }
        throw new IllegalArgumentException(r4.a.j("duration <= 0: ", j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(o0 other, ve.a block) {
        kotlin.jvm.internal.k.e(other, "other");
        kotlin.jvm.internal.k.e(block, "block");
        long timeoutNanos = timeoutNanos();
        n0 n0Var = Companion;
        long timeoutNanos2 = other.timeoutNanos();
        long timeoutNanos3 = timeoutNanos();
        n0Var.getClass();
        if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
            timeoutNanos2 = timeoutNanos3;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(timeoutNanos2, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (other.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
            }
            try {
                T t10 = (T) block.invoke();
                timeout(timeoutNanos, timeUnit);
                if (other.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                return t10;
            } catch (Throwable th) {
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (other.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                throw th;
            }
        }
        if (other.hasDeadline()) {
            deadlineNanoTime(other.deadlineNanoTime());
        }
        try {
            T t11 = (T) block.invoke();
            timeout(timeoutNanos, timeUnit);
            if (other.hasDeadline()) {
                clearDeadline();
            }
            return t11;
        } catch (Throwable th2) {
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (other.hasDeadline()) {
                clearDeadline();
            }
            throw th2;
        }
    }

    public void throwIfReached() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public o0 timeout(long j, TimeUnit unit) {
        kotlin.jvm.internal.k.e(unit, "unit");
        if (j >= 0) {
            this.timeoutNanos = unit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(r4.a.j("timeout < 0: ", j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public void waitUntilNotified(Object monitor) {
        kotlin.jvm.internal.k.e(monitor, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                Object obj = this.cancelMark;
                long j = timeoutNanos / 1000000;
                Long.signum(j);
                monitor.wait(j, (int) (timeoutNanos - (1000000 * j)));
                if (System.nanoTime() - nanoTime < timeoutNanos || this.cancelMark != obj) {
                    return;
                } else {
                    throw new InterruptedIOException("timeout");
                }
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public o0 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
