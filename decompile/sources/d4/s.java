package d4;

import c2.o0;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f4246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w2.g0 f4248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f4249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4250e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4255l;
    public final boolean[] f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0 f4251g = new o0(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o0 f4252h = new o0(33);
    public final o0 i = new o0(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f4253j = new o0(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f4254k = new o0(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4256m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1.t f4257n = new w1.t();

    public s(d0 d0Var) {
        this.f4246a = d0Var;
    }

    @Override // d4.i
    public final void a() {
        this.f4255l = 0L;
        this.f4256m = -9223372036854775807L;
        x1.o.a(this.f);
        this.f4251g.g();
        this.f4252h.g();
        this.i.g();
        this.f4253j.g();
        this.f4254k.g();
        this.f4246a.f4077d.v(0);
        r rVar = this.f4249d;
        if (rVar != null) {
            rVar.f = false;
            rVar.f4240g = false;
            rVar.f4241h = false;
            rVar.i = false;
            rVar.f4242j = false;
        }
    }

    @Override // d4.i
    public final void b(w1.t tVar) {
        int i;
        w1.a.k(this.f4248c);
        int i10 = w1.b0.f13686a;
        while (tVar.a() > 0) {
            int i11 = tVar.f13739b;
            int i12 = tVar.f13740c;
            byte[] bArr = tVar.f13738a;
            this.f4255l += (long) tVar.a();
            this.f4248c.d(tVar.a(), tVar);
            while (i11 < i12) {
                int iB = x1.o.b(bArr, i11, i12, this.f);
                if (iB == i12) {
                    g(bArr, i11, i12);
                    return;
                }
                int i13 = (bArr[iB + 3] & 126) >> 1;
                if (iB <= 0 || bArr[iB - 1] != 0) {
                    i = 3;
                } else {
                    iB--;
                    i = 4;
                }
                int i14 = iB;
                int i15 = i;
                int i16 = i14 - i11;
                if (i16 > 0) {
                    g(bArr, i11, i14);
                }
                int i17 = i12 - i14;
                long j8 = this.f4255l - ((long) i17);
                f(i17, i16 < 0 ? -i16 : 0, j8, this.f4256m);
                h(i17, i13, j8, this.f4256m);
                i11 = i14 + i15;
            }
        }
    }

    @Override // d4.i
    public final void c(boolean z2) {
        w1.a.k(this.f4248c);
        int i = w1.b0.f13686a;
        if (z2) {
            this.f4246a.f4077d.v(0);
            f(0, 0, this.f4255l, this.f4256m);
            h(0, 48, this.f4255l, this.f4256m);
        }
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        this.f4256m = j8;
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f4247b = g0Var.f4141e;
        g0Var.b();
        w2.g0 g0VarR = qVar.r(g0Var.f4140d, 2);
        this.f4248c = g0VarR;
        this.f4249d = new r(g0VarR);
        this.f4246a.b(qVar, g0Var);
    }

    public final void f(int i, int i10, long j8, long j9) {
        cf.k kVar = this.f4246a.f4077d;
        r rVar = this.f4249d;
        boolean z2 = this.f4250e;
        if (rVar.f4242j && rVar.f4240g) {
            rVar.f4245m = rVar.f4237c;
            rVar.f4242j = false;
        } else if (rVar.f4241h || rVar.f4240g) {
            if (z2 && rVar.i) {
                rVar.a(i + ((int) (j8 - rVar.f4236b)));
            }
            rVar.f4243k = rVar.f4236b;
            rVar.f4244l = rVar.f4239e;
            rVar.f4245m = rVar.f4237c;
            rVar.i = true;
        }
        if (!this.f4250e) {
            o0 o0Var = this.f4251g;
            o0Var.e(i10);
            o0 o0Var2 = this.f4252h;
            o0Var2.e(i10);
            o0 o0Var3 = this.i;
            o0Var3.e(i10);
            if (o0Var.f1873d && o0Var2.f1873d && o0Var3.f1873d) {
                String str = this.f4247b;
                int i11 = o0Var.f1874e;
                byte[] bArr = new byte[o0Var2.f1874e + i11 + o0Var3.f1874e];
                System.arraycopy((byte[]) o0Var.f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) o0Var2.f, 0, bArr, o0Var.f1874e, o0Var2.f1874e);
                System.arraycopy((byte[]) o0Var3.f, 0, bArr, o0Var.f1874e + o0Var2.f1874e, o0Var3.f1874e);
                x1.k kVarH = x1.o.h((byte[]) o0Var2.f, 3, o0Var2.f1874e, null);
                x1.h hVar = kVarH.f14114b;
                String strA = hVar != null ? w1.c.a(hVar.f14101a, hVar.f14102b, hVar.f14103c, hVar.f14104d, hVar.f14105e, hVar.f) : null;
                t1.n nVar = new t1.n();
                nVar.f12026a = str;
                nVar.f12035l = t1.f0.p("video/mp2t");
                nVar.f12036m = t1.f0.p("video/hevc");
                nVar.f12033j = strA;
                nVar.f12043t = kVarH.f14117e;
                nVar.f12044u = kVarH.f;
                nVar.f12045v = kVarH.f14118g;
                nVar.f12046w = kVarH.f14119h;
                nVar.C = new t1.f(kVarH.f14121k, kVarH.f14122l, kVarH.f14123m, null, kVarH.f14115c + 8, kVarH.f14116d + 8);
                nVar.f12049z = kVarH.i;
                nVar.f12038o = kVarH.f14120j;
                nVar.D = kVarH.f14113a + 1;
                nVar.f12039p = Collections.singletonList(bArr);
                t1.o oVar = new t1.o(nVar);
                this.f4248c.c(oVar);
                int i12 = oVar.f12063p;
                p4.v.r(i12 != -1);
                kVar.I(i12);
                this.f4250e = true;
            }
        }
        o0 o0Var4 = this.f4253j;
        boolean zE = o0Var4.e(i10);
        w1.t tVar = this.f4257n;
        if (zE) {
            tVar.H(x1.o.m(o0Var4.f1874e, (byte[]) o0Var4.f), (byte[]) o0Var4.f);
            tVar.K(5);
            kVar.a(j9, tVar);
        }
        o0 o0Var5 = this.f4254k;
        if (o0Var5.e(i10)) {
            tVar.H(x1.o.m(o0Var5.f1874e, (byte[]) o0Var5.f), (byte[]) o0Var5.f);
            tVar.K(5);
            kVar.a(j9, tVar);
        }
    }

    public final void g(byte[] bArr, int i, int i10) {
        r rVar = this.f4249d;
        if (rVar.f) {
            int i11 = rVar.f4238d;
            int i12 = (i + 2) - i11;
            if (i12 < i10) {
                rVar.f4240g = (bArr[i12] & 128) != 0;
                rVar.f = false;
            } else {
                rVar.f4238d = (i10 - i) + i11;
            }
        }
        if (!this.f4250e) {
            this.f4251g.a(bArr, i, i10);
            this.f4252h.a(bArr, i, i10);
            this.i.a(bArr, i, i10);
        }
        this.f4253j.a(bArr, i, i10);
        this.f4254k.a(bArr, i, i10);
    }

    public final void h(int i, int i10, long j8, long j9) {
        r rVar = this.f4249d;
        boolean z2 = this.f4250e;
        rVar.f4240g = false;
        rVar.f4241h = false;
        rVar.f4239e = j9;
        rVar.f4238d = 0;
        rVar.f4236b = j8;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.i && !rVar.f4242j) {
                if (z2) {
                    rVar.a(i);
                }
                rVar.i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.f4241h = !rVar.f4242j;
                rVar.f4242j = true;
            }
        }
        boolean z10 = i10 >= 16 && i10 <= 21;
        rVar.f4237c = z10;
        rVar.f = z10 || i10 <= 9;
        if (!this.f4250e) {
            this.f4251g.h(i10);
            this.f4252h.h(i10);
            this.i.h(i10);
        }
        this.f4253j.h(i10);
        this.f4254k.h(i10);
    }
}
