package d4;

import c2.o0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f4181l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f4182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1.t f4183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f4184c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f4185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f4186e;
    public m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4188h;
    public w2.g0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4190k;

    public n(d0 d0Var) {
        this.f4182a = d0Var;
        l lVar = new l();
        lVar.f4173e = new byte[128];
        this.f4185d = lVar;
        this.f4190k = -9223372036854775807L;
        this.f4186e = new o0(178);
        this.f4183b = new w1.t();
    }

    @Override // d4.i
    public final void a() {
        x1.o.a(this.f4184c);
        l lVar = this.f4185d;
        lVar.f4169a = false;
        lVar.f4171c = 0;
        lVar.f4170b = 0;
        m mVar = this.f;
        if (mVar != null) {
            mVar.f4175b = false;
            mVar.f4176c = false;
            mVar.f4177d = false;
            mVar.f4178e = -1;
        }
        o0 o0Var = this.f4186e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f4187g = 0L;
        this.f4190k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236  */
    @Override // d4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w1.t r20) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.n.b(w1.t):void");
    }

    @Override // d4.i
    public final void c(boolean z2) {
        w1.a.k(this.f);
        if (z2) {
            this.f.b(0, this.f4187g, this.f4189j);
            m mVar = this.f;
            mVar.f4175b = false;
            mVar.f4176c = false;
            mVar.f4177d = false;
            mVar.f4178e = -1;
        }
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        this.f4190k = j8;
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f4188h = g0Var.f4141e;
        g0Var.b();
        w2.g0 g0VarR = qVar.r(g0Var.f4140d, 2);
        this.i = g0VarR;
        this.f = new m(g0VarR);
        this.f4182a.b(qVar, g0Var);
    }
}
