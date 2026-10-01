package bg;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class g extends o0 {
    private static final c Companion = new Object();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static g head;
    private static final ReentrantLock lock;
    private g next;
    private int state;
    private long timeoutAt;

    /* JADX WARN: Type inference failed for: r0v0, types: [bg.c, java.lang.Object] */
    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.k.d(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long access$remainingNanos(g gVar, long j) {
        return gVar.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // bg.o0
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                c.b(Companion, this);
                this.state = 3;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 0) {
                this.state = 1;
                c.a(Companion, this, timeoutNanos, hasDeadline);
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i6 = this.state;
            boolean z10 = false;
            this.state = 0;
            if (i6 == 1) {
                c.b(Companion, this);
                return false;
            }
            if (i6 == 2) {
                z10 = true;
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final j0 sink(j0 sink) {
        kotlin.jvm.internal.k.e(sink, "sink");
        return new e(0, this, sink);
    }

    public final l0 source(l0 source) {
        kotlin.jvm.internal.k.e(source, "source");
        return new f(this, source);
    }

    public final <T> T withTimeout(ve.a block) {
        kotlin.jvm.internal.k.e(block, "block");
        enter();
        try {
            T t10 = (T) block.invoke();
            if (!exit()) {
                return t10;
            }
            throw access$newTimeoutException(null);
        } catch (IOException e10) {
            if (!exit()) {
                throw e10;
            }
            throw access$newTimeoutException(e10);
        } finally {
            exit();
        }
    }

    public void timedOut() {
    }
}
