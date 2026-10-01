package k8;

import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7671v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f7672w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u2 f7673x;

    public /* synthetic */ o2(u2 u2Var, AtomicReference atomicReference, int i, boolean z2) {
        this.f7671v = i;
        this.f7673x = u2Var;
        this.f7672w = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f7672w;
        synchronized (atomicReference) {
            try {
                try {
                    p1 p1Var = (p1) this.f7673x.f2053w;
                    atomicReference.set(p1Var.f7695y.K(p1Var.q().J(), f0.f7486c0));
                } finally {
                    this.f7672w.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        AtomicReference atomicReference = this.f7672w;
        synchronized (atomicReference) {
            try {
                try {
                    p1 p1Var = (p1) this.f7673x.f2053w;
                    atomicReference.set(Long.valueOf(p1Var.f7695y.L(p1Var.q().J(), f0.f7488d0)));
                } finally {
                    this.f7672w.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        AtomicReference atomicReference = this.f7672w;
        synchronized (atomicReference) {
            try {
                try {
                    p1 p1Var = (p1) this.f7673x.f2053w;
                    atomicReference.set(Integer.valueOf(p1Var.f7695y.M(p1Var.q().J(), f0.f7491e0)));
                } finally {
                    this.f7672w.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        AtomicReference atomicReference = this.f7672w;
        synchronized (atomicReference) {
            try {
                try {
                    p1 p1Var = (p1) this.f7673x.f2053w;
                    atomicReference.set(Double.valueOf(p1Var.f7695y.N(p1Var.q().J(), f0.f7492f0)));
                } finally {
                    this.f7672w.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7671v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                AtomicReference atomicReference = this.f7672w;
                synchronized (atomicReference) {
                    try {
                        try {
                            p1 p1Var = (p1) this.f7673x.f2053w;
                            atomicReference.set(Boolean.valueOf(p1Var.f7695y.O(p1Var.q().J(), f0.f7483b0)));
                        } finally {
                            this.f7672w.notify();
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
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                d();
                return;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                u2 u2Var = this.f7673x;
                d1 d1Var = ((p1) u2Var.f2053w).f7696z;
                p1.j(d1Var);
                Bundle bundleI = d1Var.J.I();
                p3 p3VarO = ((p1) u2Var.f2053w).o();
                AtomicReference atomicReference2 = this.f7672w;
                p3VarO.D();
                p3VarO.E();
                p3VarO.R(new w1(p3VarO, atomicReference2, p3VarO.T(false), bundleI, 6));
                return;
            default:
                p3 p3VarO2 = ((p1) this.f7673x.f2053w).o();
                f4 f4VarA = f4.a(b3.f7406z);
                AtomicReference atomicReference3 = this.f7672w;
                p3VarO2.D();
                p3VarO2.E();
                p3VarO2.R(new w1(p3VarO2, atomicReference3, p3VarO2.T(false), f4VarA));
                return;
        }
    }

    public o2(u2 u2Var, AtomicReference atomicReference, int i) {
        this.f7671v = i;
        switch (i) {
            case 1:
                this.f7672w = atomicReference;
                Objects.requireNonNull(u2Var);
                this.f7673x = u2Var;
                break;
            case 2:
                this.f7672w = atomicReference;
                Objects.requireNonNull(u2Var);
                this.f7673x = u2Var;
                break;
            case 3:
                this.f7672w = atomicReference;
                Objects.requireNonNull(u2Var);
                this.f7673x = u2Var;
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                this.f7672w = atomicReference;
                Objects.requireNonNull(u2Var);
                this.f7673x = u2Var;
                break;
            default:
                this.f7672w = atomicReference;
                Objects.requireNonNull(u2Var);
                this.f7673x = u2Var;
                break;
        }
    }
}
