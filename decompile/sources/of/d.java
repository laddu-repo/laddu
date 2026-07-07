package of;

import gf.y;
import gf.z0;
import java.util.concurrent.Executor;
import mf.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends z0 implements Executor {

    /* renamed from: y, reason: collision with root package name */
    public static final d f10174y = new y();

    /* renamed from: z, reason: collision with root package name */
    public static final y f10175z;

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.y, of.d] */
    static {
        l lVar = l.f10190y;
        int i6 = w.f8879a;
        if (64 >= i6) {
            i6 = 64;
        }
        f10175z = lVar.i0(mf.a.k("kotlinx.coroutines.io.parallelism", i6, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f0(le.i.f8353x, runnable);
    }

    @Override // gf.y
    public final void f0(le.h hVar, Runnable runnable) {
        f10175z.f0(hVar, runnable);
    }

    @Override // gf.y
    public final void g0(le.h hVar, Runnable runnable) {
        f10175z.g0(hVar, runnable);
    }

    @Override // gf.y
    public final y i0(int i6) {
        return l.f10190y.i0(1);
    }

    @Override // gf.y
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // gf.z0
    public final Executor j0() {
        return this;
    }
}
