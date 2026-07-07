package re;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import me.b0;
import me.h0;
import me.m1;
import me.z;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends me.s implements b0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    public final k A;
    public final Object B;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b0 f11381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final me.s f11382y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f11383z;

    /* JADX WARN: Multi-variable type inference failed */
    public g(me.s sVar, int i) {
        b0 b0Var = sVar instanceof b0 ? (b0) sVar : null;
        this.f11381x = b0Var == null ? z.f8751a : b0Var;
        this.f11382y = sVar;
        this.f11383z = i;
        this.A = new k();
        this.B = new Object();
    }

    @Override // me.b0
    public final void D(long j8, me.h hVar) {
        this.f11381x.D(j8, hVar);
    }

    @Override // me.b0
    public final h0 G(long j8, m1 m1Var, sd.h hVar) {
        return this.f11381x.G(j8, m1Var, hVar);
    }

    @Override // me.s
    public final void o0(sd.h hVar, Runnable runnable) {
        this.A.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C;
        if (atomicIntegerFieldUpdater.get(this) < this.f11383z) {
            synchronized (this.B) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f11383z) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableR0 = r0();
                if (runnableR0 == null) {
                    return;
                }
                this.f11382y.o0(this, new o8.m(6, this, runnableR0));
            }
        }
    }

    public final Runnable r0() {
        while (true) {
            Runnable runnable = (Runnable) this.A.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.B) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.A.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // me.s
    public final String toString() {
        return this.f11382y + ".limitedParallelism(" + this.f11383z + ')';
    }
}
