package q2;

import java.io.IOException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q0 implements z0 {

    /* renamed from: x, reason: collision with root package name */
    public final int f10939x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s0 f10940y;

    public q0(s0 s0Var, int i6) {
        this.f10940y = s0Var;
        this.f10939x = i6;
    }

    @Override // q2.z0
    public final void b() {
        int i6 = this.f10939x;
        s0 s0Var = this.f10940y;
        s0Var.R[i6].z();
        u2.o oVar = s0Var.J;
        int f3 = s0Var.A.f(s0Var.f10946b0);
        IOException iOException = oVar.f12870z;
        if (iOException == null) {
            u2.k kVar = oVar.f12869y;
            if (kVar != null) {
                if (f3 == Integer.MIN_VALUE) {
                    f3 = kVar.f12865x;
                }
                IOException iOException2 = kVar.B;
                if (iOException2 != null && kVar.C > f3) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // q2.z0
    public final boolean isReady() {
        s0 s0Var = this.f10940y;
        if (!s0Var.G() && s0Var.R[this.f10939x].x(s0Var.f10956l0)) {
            return true;
        }
        return false;
    }

    @Override // q2.z0
    public final int j(long j) {
        s0 s0Var = this.f10940y;
        if (s0Var.G()) {
            return 0;
        }
        int i6 = this.f10939x;
        s0Var.x(i6);
        y0 y0Var = s0Var.R[i6];
        int v10 = y0Var.v(s0Var.f10956l0, j);
        y0Var.I(v10);
        if (v10 == 0) {
            s0Var.y(i6);
        }
        return v10;
    }

    @Override // q2.z0
    public final int n(j4.b0 b0Var, y1.h hVar, int i6) {
        s0 s0Var = this.f10940y;
        if (s0Var.G()) {
            return -3;
        }
        int i10 = this.f10939x;
        s0Var.x(i10);
        int C = s0Var.R[i10].C(b0Var, hVar, i6, s0Var.f10956l0);
        if (C == -3) {
            s0Var.y(i10);
        }
        return C;
    }
}
