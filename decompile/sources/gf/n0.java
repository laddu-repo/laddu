package gf;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n0 implements Executor {

    /* renamed from: x, reason: collision with root package name */
    public final y f5691x;

    public n0(y yVar) {
        this.f5691x = yVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y yVar = this.f5691x;
        if (yVar.h0()) {
            yVar.f0(le.i.f8353x, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f5691x.toString();
    }
}
