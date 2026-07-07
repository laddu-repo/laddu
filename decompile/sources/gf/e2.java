package gf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e2 implements g1 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5662z = AtomicIntegerFieldUpdater.newUpdater(e2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final Thread f5663x = Thread.currentThread();

    /* renamed from: y, reason: collision with root package name */
    public q0 f5664y;

    public e2(j1 j1Var) {
    }

    public static void c(int i6) {
        throw new IllegalStateException(("Illegal state " + i6).toString());
    }

    @Override // gf.g1
    public final void a(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = f5662z;
            i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 != 0) {
                if (i6 != 1 && i6 != 2 && i6 != 3) {
                    c(i6);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 2));
        this.f5663x.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void b() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5662z;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 != 0) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        c(i6);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i6, 1)) {
                q0 q0Var = this.f5664y;
                if (q0Var != null) {
                    q0Var.d();
                    return;
                }
                return;
            }
        }
    }
}
