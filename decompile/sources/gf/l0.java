package gf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 extends mf.t {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // mf.t, gf.t1
    public final void n(Object obj) {
        o(obj);
    }

    @Override // mf.t, gf.t1
    public final void o(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = B;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 != 0) {
                if (i6 == 1) {
                    mf.a.h(f0.z(obj), a8.c.i(this.A));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
