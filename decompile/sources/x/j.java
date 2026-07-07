package x;

import hb.x;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements x {

    /* renamed from: x, reason: collision with root package name */
    public final WeakReference f14452x;

    /* renamed from: y, reason: collision with root package name */
    public final i f14453y = new i(this);

    public j(h hVar) {
        this.f14452x = new WeakReference(hVar);
    }

    @Override // hb.x
    public final void a(Runnable runnable, Executor executor) {
        this.f14453y.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        h hVar = (h) this.f14452x.get();
        boolean cancel = this.f14453y.cancel(z10);
        if (cancel && hVar != null) {
            hVar.f14448a = null;
            hVar.f14449b = null;
            hVar.f14450c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14453y.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14453y.f14445x instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14453y.isDone();
    }

    public final String toString() {
        return this.f14453y.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f14453y.get(j, timeUnit);
    }
}
