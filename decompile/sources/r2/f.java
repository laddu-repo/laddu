package r2;

import j4.b0;
import q2.y0;
import q2.z0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements z0 {
    public boolean A;
    public final /* synthetic */ h B;

    /* renamed from: x, reason: collision with root package name */
    public final h f11788x;

    /* renamed from: y, reason: collision with root package name */
    public final y0 f11789y;

    /* renamed from: z, reason: collision with root package name */
    public final int f11790z;

    public f(h hVar, h hVar2, y0 y0Var, int i6) {
        this.B = hVar;
        this.f11788x = hVar2;
        this.f11789y = y0Var;
        this.f11790z = i6;
    }

    public final void a() {
        if (!this.A) {
            h hVar = this.B;
            b2.k kVar = hVar.D;
            int[] iArr = hVar.f11792y;
            int i6 = this.f11790z;
            kVar.h(iArr[i6], hVar.f11793z[i6], 0, null, hVar.Q);
            this.A = true;
        }
    }

    @Override // q2.z0
    public final boolean isReady() {
        h hVar = this.B;
        if (!hVar.w() && this.f11789y.x(hVar.V)) {
            return true;
        }
        return false;
    }

    @Override // q2.z0
    public final int j(long j) {
        h hVar = this.B;
        if (hVar.w()) {
            return 0;
        }
        boolean z10 = hVar.V;
        y0 y0Var = this.f11789y;
        int v10 = y0Var.v(z10, j);
        a aVar = hVar.S;
        if (aVar != null) {
            v10 = Math.min(v10, aVar.c(this.f11790z + 1) - y0Var.t());
        }
        y0Var.I(v10);
        if (v10 > 0) {
            a();
        }
        return v10;
    }

    @Override // q2.z0
    public final int n(b0 b0Var, y1.h hVar, int i6) {
        h hVar2 = this.B;
        if (!hVar2.w()) {
            a aVar = hVar2.S;
            y0 y0Var = this.f11789y;
            if (aVar != null && aVar.c(this.f11790z + 1) <= y0Var.t()) {
                return -3;
            }
            a();
            return y0Var.C(b0Var, hVar, i6, hVar2.V);
        }
        return -3;
    }

    @Override // q2.z0
    public final void b() {
    }
}
