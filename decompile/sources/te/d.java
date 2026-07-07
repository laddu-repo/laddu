package te;

import java.util.concurrent.Executor;
import me.p0;
import me.s;
import re.u;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p0 implements Executor {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f12561x = new d();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f12562y;

    static {
        l lVar = l.f12574x;
        int i = u.f11404a;
        if (64 >= i) {
            i = 64;
        }
        f12562y = lVar.q0(re.a.j(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o0(sd.i.f11797v, runnable);
    }

    @Override // me.s
    public final void o0(sd.h hVar, Runnable runnable) {
        f12562y.o0(hVar, runnable);
    }

    @Override // me.s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
