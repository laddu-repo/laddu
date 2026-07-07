package r2;

import com.google.android.gms.internal.measurement.k4;
import j1.f0;
import q2.y0;
import r1.k0;
import r1.q;
import u1.t;
import w1.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends a {
    public final int L;
    public final long M;
    public final d N;
    public long O;
    public volatile boolean P;
    public boolean Q;

    public j(w1.h hVar, w1.l lVar, q qVar, int i6, Object obj, long j, long j10, long j11, long j12, long j13, int i10, long j14, d dVar) {
        super(hVar, lVar, qVar, i6, obj, j, j10, j11, j12, j13);
        this.L = i10;
        this.M = j14;
        this.N = dVar;
    }

    @Override // r2.l
    public final long a() {
        return this.G + this.L;
    }

    @Override // r2.l
    public final boolean b() {
        return this.Q;
    }

    @Override // u2.l
    public final void h() {
        boolean z10;
        boolean z11;
        long j;
        f0 f0Var = this.J;
        u1.c.h(f0Var);
        if (this.O == 0) {
            long j10 = this.M;
            for (y0 y0Var : (y0[]) f0Var.f6908z) {
                if (y0Var.F != j10) {
                    y0Var.F = j10;
                    y0Var.f11010z = true;
                }
            }
            d dVar = this.N;
            long j11 = this.H;
            long j12 = -9223372036854775807L;
            if (j11 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j11 - this.M;
            }
            long j13 = this.I;
            if (j13 != -9223372036854775807L) {
                j12 = j13 - this.M;
            }
            dVar.a(f0Var, j, j12);
        }
        try {
            w1.l c10 = this.f11786y.c(this.O);
            z zVar = this.F;
            y2.l lVar = new y2.l(zVar, c10.f13546e, zVar.y(c10));
            while (!this.P) {
                try {
                    int i6 = this.N.f11782x.i(lVar, d.G);
                    if (i6 != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1.c.g(z10);
                    if (i6 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        break;
                    }
                } finally {
                    this.O = lVar.A - this.f11786y.f13546e;
                }
            }
            q qVar = this.A;
            String str = qVar.f11669m;
            int i10 = qVar.M;
            int i11 = qVar.N;
            if (k0.m(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                y2.f0 Z = f0Var.Z(4);
                int i12 = i10 * i11;
                long j14 = (this.E - this.D) / i12;
                for (int i13 = 1; i13 < i12; i13++) {
                    Z.a(0, new t());
                    Z.c(i13 * j14, 0, 0, 0, null);
                }
            }
            k4.f(this.F);
            this.Q = !this.P;
        } catch (Throwable th) {
            k4.f(this.F);
            throw th;
        }
    }

    @Override // u2.l
    public final void p() {
        this.P = true;
    }
}
