package v5;

import gf.m1;
import hb.x;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements x {

    /* renamed from: x, reason: collision with root package name */
    public final g6.j f13326x = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [g6.j, java.lang.Object] */
    public j(m1 m1Var) {
        m1Var.y(new b1.r(this, 5));
    }

    @Override // hb.x
    public final void a(Runnable runnable, Executor executor) {
        this.f13326x.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f13326x.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f13326x.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f13326x.f5476x instanceof g6.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f13326x.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f13326x.get(j, timeUnit);
    }
}
