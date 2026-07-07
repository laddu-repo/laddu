package gf;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w1 extends le.a implements j1 {

    /* renamed from: x, reason: collision with root package name */
    public static final w1 f5722x = new le.a(i1.f5682x);

    @Override // gf.j1
    public final n Q(t1 t1Var) {
        return x1.f5725x;
    }

    @Override // gf.j1
    public final q0 b0(boolean z10, boolean z11, n1 n1Var) {
        return x1.f5725x;
    }

    @Override // gf.j1
    public final j1 getParent() {
        return null;
    }

    @Override // gf.j1
    public final boolean isActive() {
        return true;
    }

    @Override // gf.j1
    public final boolean isCancelled() {
        return false;
    }

    @Override // gf.j1
    public final Object l(lf.i iVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // gf.j1
    public final CancellationException m() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // gf.j1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // gf.j1
    public final q0 y(ve.l lVar) {
        return x1.f5725x;
    }

    @Override // gf.j1
    public final void d(CancellationException cancellationException) {
    }
}
