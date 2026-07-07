package k8;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w3 implements r3.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f7820v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f7821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f7822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f7823y;

    public w3(int i, long j8) {
        w1.a.j(((s2.a) this.f7822x) == null);
        this.f7820v = j8;
        this.f7821w = j8 + ((long) i);
    }

    public boolean a(long j8, boolean z2, boolean z10) {
        x3 x3Var = (x3) this.f7823y;
        x3Var.D();
        x3Var.E();
        p1 p1Var = (p1) x3Var.f2053w;
        boolean zB = p1Var.b();
        v0 v0Var = p1Var.A;
        if (zB) {
            d1 d1Var = p1Var.f7696z;
            p1.j(d1Var);
            c2.v1 v1Var = d1Var.L;
            p1Var.F.getClass();
            v1Var.h(System.currentTimeMillis());
        }
        long j9 = j8 - this.f7820v;
        if (!z2 && j9 < 1000) {
            p1.l(v0Var);
            v0Var.J.b(Long.valueOf(j9), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z10) {
            j9 = j8 - this.f7821w;
            this.f7821w = j8;
        }
        p1.l(v0Var);
        v0Var.J.b(Long.valueOf(j9), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j9);
        boolean z11 = !p1Var.f7695y.S();
        f3 f3Var = p1Var.G;
        p1.k(f3Var);
        t4.A0(f3Var.H(z11), bundle, true);
        if (!z10) {
            u2 u2Var = p1Var.H;
            p1.k(u2Var);
            u2Var.K("auto", "_e", bundle);
        }
        this.f7820v = j8;
        v3 v3Var = (v3) this.f7822x;
        v3Var.c();
        v3Var.b(((Long) f0.f7518q0.a(null)).longValue());
        return true;
    }

    @Override // r3.g
    public w2.a0 d() {
        w1.a.j(this.f7820v != -1);
        return new w2.s((w2.t) this.f7822x, this.f7820v, 0);
    }

    @Override // r3.g
    public long h(w2.p pVar) {
        long j8 = this.f7821w;
        if (j8 < 0) {
            return -1L;
        }
        long j9 = -(j8 + 2);
        this.f7821w = -1L;
        return j9;
    }

    @Override // r3.g
    public void l(long j8) {
        long[] jArr = (long[]) ((ob.d) this.f7823y).f10105w;
        this.f7821w = jArr[w1.b0.e(jArr, j8, true)];
    }

    public w3(String str, byte[] bArr, long j8, long j9) {
        this.f7822x = str;
        this.f7823y = bArr;
        this.f7820v = j8;
        this.f7821w = j9;
    }
}
