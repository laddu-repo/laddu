package gf;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p0 implements q0 {

    /* renamed from: x, reason: collision with root package name */
    public final ScheduledFuture f5695x;

    public p0(ScheduledFuture scheduledFuture) {
        this.f5695x = scheduledFuture;
    }

    @Override // gf.q0
    public final void d() {
        this.f5695x.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f5695x + ']';
    }
}
