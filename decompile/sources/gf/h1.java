package gf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h1 extends l1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_invoked$volatile");
    public final g1 B;
    private volatile /* synthetic */ int _invoked$volatile;

    public h1(g1 g1Var) {
        this.B = g1Var;
    }

    @Override // gf.g1
    public final void a(Throwable th) {
        if (C.compareAndSet(this, 0, 1)) {
            this.B.a(th);
        }
    }
}
