package mf;

import gf.h0;
import gf.k0;
import gf.q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends gf.y implements k0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final /* synthetic */ k0 A;
    public final l B;
    public final Object C;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: y, reason: collision with root package name */
    public final gf.y f8861y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8862z;

    /* JADX WARN: Multi-variable type inference failed */
    public i(gf.y yVar, int i6) {
        k0 k0Var;
        this.f8861y = yVar;
        this.f8862z = i6;
        if (yVar instanceof k0) {
            k0Var = (k0) yVar;
        } else {
            k0Var = null;
        }
        this.A = k0Var == null ? h0.f5678a : k0Var;
        this.B = new l();
        this.C = new Object();
    }

    @Override // gf.k0
    public final void K(long j, gf.k kVar) {
        this.A.K(j, kVar);
    }

    @Override // gf.k0
    public final q0 S(long j, Runnable runnable, le.h hVar) {
        return this.A.S(j, runnable, hVar);
    }

    @Override // gf.y
    public final void f0(le.h hVar, Runnable runnable) {
        Runnable j02;
        this.B.a(runnable);
        if (D.get(this) < this.f8862z && k0() && (j02 = j0()) != null) {
            this.f8861y.f0(this, new hb.s(this, j02, 10, false));
        }
    }

    @Override // gf.y
    public final void g0(le.h hVar, Runnable runnable) {
        Runnable j02;
        this.B.a(runnable);
        if (D.get(this) < this.f8862z && k0() && (j02 = j0()) != null) {
            this.f8861y.g0(this, new hb.s(this, j02, 10, false));
        }
    }

    @Override // gf.y
    public final gf.y i0(int i6) {
        a.a(1);
        if (1 >= this.f8862z) {
            return this;
        }
        return super.i0(1);
    }

    public final Runnable j0() {
        while (true) {
            Runnable runnable = (Runnable) this.B.d();
            if (runnable == null) {
                synchronized (this.C) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.B.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    public final boolean k0() {
        synchronized (this.C) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
            if (atomicIntegerFieldUpdater.get(this) >= this.f8862z) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
