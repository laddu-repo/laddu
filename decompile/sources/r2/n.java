package r2;

import com.google.android.gms.internal.measurement.k4;
import j1.f0;
import q2.y0;
import r1.q;
import w1.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends a {
    public final int L;
    public final q M;
    public long N;
    public boolean O;

    public n(w1.h hVar, w1.l lVar, q qVar, int i6, Object obj, long j, long j10, long j11, int i10, q qVar2) {
        super(hVar, lVar, qVar, i6, obj, j, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.L = i10;
        this.M = qVar2;
    }

    @Override // r2.l
    public final boolean b() {
        return this.O;
    }

    @Override // u2.l
    public final void h() {
        z zVar = this.F;
        f0 f0Var = this.J;
        u1.c.h(f0Var);
        for (y0 y0Var : (y0[]) f0Var.f6908z) {
            if (y0Var.F != 0) {
                y0Var.F = 0L;
                y0Var.f11010z = true;
            }
        }
        y2.f0 Z = f0Var.Z(this.L);
        Z.f(this.M);
        try {
            long y9 = zVar.y(this.f11786y.c(this.N));
            if (y9 != -1) {
                y9 += this.N;
            }
            y2.l lVar = new y2.l(this.F, this.N, y9);
            for (int i6 = 0; i6 != -1; i6 = Z.e(lVar, Integer.MAX_VALUE, true)) {
                this.N += i6;
            }
            Z.c(this.D, 1, (int) this.N, 0, null);
            k4.f(zVar);
            this.O = true;
        } catch (Throwable th) {
            k4.f(zVar);
            throw th;
        }
    }

    @Override // u2.l
    public final void p() {
    }
}
