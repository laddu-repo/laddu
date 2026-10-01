package bg;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public o0 f1742a;

    public t(o0 delegate) {
        kotlin.jvm.internal.k.e(delegate, "delegate");
        this.f1742a = delegate;
    }

    @Override // bg.o0
    public final void awaitSignal(Condition condition) {
        kotlin.jvm.internal.k.e(condition, "condition");
        this.f1742a.awaitSignal(condition);
    }

    @Override // bg.o0
    public final o0 clearDeadline() {
        return this.f1742a.clearDeadline();
    }

    @Override // bg.o0
    public final o0 clearTimeout() {
        return this.f1742a.clearTimeout();
    }

    @Override // bg.o0
    public final long deadlineNanoTime() {
        return this.f1742a.deadlineNanoTime();
    }

    @Override // bg.o0
    public final boolean hasDeadline() {
        return this.f1742a.hasDeadline();
    }

    @Override // bg.o0
    public final void throwIfReached() {
        this.f1742a.throwIfReached();
    }

    @Override // bg.o0
    public final o0 timeout(long j, TimeUnit unit) {
        kotlin.jvm.internal.k.e(unit, "unit");
        return this.f1742a.timeout(j, unit);
    }

    @Override // bg.o0
    public final long timeoutNanos() {
        return this.f1742a.timeoutNanos();
    }

    @Override // bg.o0
    public final void waitUntilNotified(Object monitor) {
        kotlin.jvm.internal.k.e(monitor, "monitor");
        this.f1742a.waitUntilNotified(monitor);
    }

    @Override // bg.o0
    public final o0 deadlineNanoTime(long j) {
        return this.f1742a.deadlineNanoTime(j);
    }
}
