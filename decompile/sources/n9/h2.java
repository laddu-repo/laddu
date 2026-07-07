package n9;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h2 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9337x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9338y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m2 f9339z;

    public /* synthetic */ h2(m2 m2Var, AtomicReference atomicReference, int i6, boolean z10) {
        this.f9337x = i6;
        this.f9339z = m2Var;
        this.f9338y = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f9338y;
        synchronized (atomicReference) {
            try {
                try {
                    n1 n1Var = (n1) this.f9339z.f4301y;
                    atomicReference.set(n1Var.A.j1(n1Var.l().j1(), e0.f9233c0));
                } finally {
                    this.f9338y.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        AtomicReference atomicReference = this.f9338y;
        synchronized (atomicReference) {
            try {
                try {
                    n1 n1Var = (n1) this.f9339z.f4301y;
                    atomicReference.set(Long.valueOf(n1Var.A.k1(n1Var.l().j1(), e0.f9235d0)));
                } finally {
                    this.f9338y.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        AtomicReference atomicReference = this.f9338y;
        synchronized (atomicReference) {
            try {
                try {
                    n1 n1Var = (n1) this.f9339z.f4301y;
                    atomicReference.set(Integer.valueOf(n1Var.A.l1(n1Var.l().j1(), e0.f9238e0)));
                } finally {
                    this.f9338y.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        AtomicReference atomicReference = this.f9338y;
        synchronized (atomicReference) {
            try {
                try {
                    n1 n1Var = (n1) this.f9339z.f4301y;
                    atomicReference.set(Double.valueOf(n1Var.A.m1(n1Var.l().j1(), e0.f9241f0)));
                } finally {
                    this.f9338y.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9337x) {
            case 0:
                AtomicReference atomicReference = this.f9338y;
                synchronized (atomicReference) {
                    try {
                        try {
                            n1 n1Var = (n1) this.f9339z.f4301y;
                            atomicReference.set(Boolean.valueOf(n1Var.A.n1(n1Var.l().j1(), e0.f9230b0)));
                        } finally {
                            this.f9338y.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            case 3:
                c();
                return;
            case 4:
                d();
                return;
            case 5:
                m2 m2Var = this.f9339z;
                c1 c1Var = ((n1) m2Var.f4301y).B;
                n1.e(c1Var);
                Bundle C = c1Var.L.C();
                h3 j = ((n1) m2Var.f4301y).j();
                AtomicReference atomicReference2 = this.f9338y;
                j.d1();
                j.e1();
                j.r1(new f6.p(j, atomicReference2, j.t1(false), C, 7, false));
                return;
            default:
                h3 j10 = ((n1) this.f9339z.f4301y).j();
                x3 a10 = x3.a(t2.SGTM_CLIENT);
                AtomicReference atomicReference3 = this.f9338y;
                j10.d1();
                j10.e1();
                j10.r1(new f6.p(j10, atomicReference3, j10.t1(false), a10, 8, false));
                return;
        }
    }

    public h2(m2 m2Var, AtomicReference atomicReference, int i6) {
        this.f9337x = i6;
        switch (i6) {
            case 1:
                this.f9338y = atomicReference;
                Objects.requireNonNull(m2Var);
                this.f9339z = m2Var;
                return;
            case 2:
                this.f9338y = atomicReference;
                Objects.requireNonNull(m2Var);
                this.f9339z = m2Var;
                return;
            case 3:
                this.f9338y = atomicReference;
                Objects.requireNonNull(m2Var);
                this.f9339z = m2Var;
                return;
            case 4:
                this.f9338y = atomicReference;
                Objects.requireNonNull(m2Var);
                this.f9339z = m2Var;
                return;
            default:
                this.f9338y = atomicReference;
                Objects.requireNonNull(m2Var);
                this.f9339z = m2Var;
                return;
        }
    }
}
