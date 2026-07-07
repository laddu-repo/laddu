package n9;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o3 implements t3.g {
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public long f9421x;

    /* renamed from: y, reason: collision with root package name */
    public long f9422y;

    /* renamed from: z, reason: collision with root package name */
    public Object f9423z;

    public o3(long j, int i6) {
        u1.c.g(((u2.a) this.f9423z) == null);
        this.f9421x = j;
        this.f9422y = j + i6;
    }

    public boolean a(boolean z10, boolean z11, long j) {
        p3 p3Var = (p3) this.A;
        p3Var.d1();
        p3Var.e1();
        n1 n1Var = (n1) p3Var.f4301y;
        boolean a10 = n1Var.a();
        u0 u0Var = n1Var.C;
        if (a10) {
            c1 c1Var = n1Var.B;
            n1.e(c1Var);
            a2.d2 d2Var = c1Var.N;
            n1Var.H.getClass();
            d2Var.h(System.currentTimeMillis());
        }
        long j10 = j - this.f9421x;
        if (!z10 && j10 < 1000) {
            n1.g(u0Var);
            u0Var.L.b(Long.valueOf(j10), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z11) {
            j10 = j - this.f9422y;
            this.f9422y = j;
        }
        n1.g(u0Var);
        u0Var.L.b(Long.valueOf(j10), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        boolean z12 = !n1Var.A.r1();
        x2 x2Var = n1Var.I;
        n1.f(x2Var);
        j4.V1(x2Var.j1(z12), bundle, true);
        if (!z11) {
            m2 m2Var = n1Var.J;
            n1.f(m2Var);
            m2Var.k1("auto", "_e", bundle);
        }
        this.f9421x = j;
        n3 n3Var = (n3) this.f9423z;
        n3Var.c();
        n3Var.b(((Long) e0.f9269r0.a(null)).longValue());
        return true;
    }

    @Override // t3.g
    public long j(y2.p pVar) {
        long j = this.f9422y;
        if (j < 0) {
            return -1L;
        }
        long j10 = -(j + 2);
        this.f9422y = -1L;
        return j10;
    }

    @Override // t3.g
    public y2.z k() {
        boolean z10;
        if (this.f9421x != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        return new a3.b((y2.s) this.f9423z, this.f9421x, 1);
    }

    @Override // t3.g
    public void q(long j) {
        long[] jArr = (long[]) ((y1.c) this.A).f14799a;
        this.f9422y = jArr[u1.a0.e(jArr, j, true)];
    }

    public o3(String str, byte[] bArr, long j, long j10) {
        this.f9423z = str;
        this.A = bArr;
        this.f9421x = j;
        this.f9422y = j10;
    }
}
