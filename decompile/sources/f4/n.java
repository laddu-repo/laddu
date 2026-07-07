package f4;

import a2.t0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f4852l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final d0 f4853a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.t f4854b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f4855c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final l f4856d;

    /* renamed from: e, reason: collision with root package name */
    public final t0 f4857e;

    /* renamed from: f, reason: collision with root package name */
    public m f4858f;

    /* renamed from: g, reason: collision with root package name */
    public long f4859g;

    /* renamed from: h, reason: collision with root package name */
    public String f4860h;

    /* renamed from: i, reason: collision with root package name */
    public y2.f0 f4861i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f4862k;

    /* JADX WARN: Type inference failed for: r3v3, types: [f4.l, java.lang.Object] */
    public n(d0 d0Var) {
        this.f4853a = d0Var;
        ?? obj = new Object();
        obj.f4843e = new byte[128];
        this.f4856d = obj;
        this.f4862k = -9223372036854775807L;
        this.f4857e = new t0(178);
        this.f4854b = new u1.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    @Override // f4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(u1.t r20) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.n.a(u1.t):void");
    }

    @Override // f4.i
    public final void c() {
        v1.o.a(this.f4855c);
        l lVar = this.f4856d;
        lVar.f4839a = false;
        lVar.f4841c = 0;
        lVar.f4840b = 0;
        m mVar = this.f4858f;
        if (mVar != null) {
            mVar.f4845b = false;
            mVar.f4846c = false;
            mVar.f4847d = false;
            mVar.f4848e = -1;
        }
        t0 t0Var = this.f4857e;
        if (t0Var != null) {
            t0Var.g();
        }
        this.f4859g = 0L;
        this.f4862k = -9223372036854775807L;
    }

    @Override // f4.i
    public final void d(boolean z10) {
        u1.c.h(this.f4858f);
        if (z10) {
            this.f4858f.b(0, this.f4859g, this.j);
            m mVar = this.f4858f;
            mVar.f4845b = false;
            mVar.f4846c = false;
            mVar.f4847d = false;
            mVar.f4848e = -1;
        }
    }

    @Override // f4.i
    public final void e(int i6, long j) {
        this.f4862k = j;
    }

    @Override // f4.i
    public final void f(y2.q qVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f4860h = h0Var.f4815e;
        h0Var.b();
        y2.f0 A = qVar.A(h0Var.f4814d, 2);
        this.f4861i = A;
        this.f4858f = new m(A);
        this.f4853a.b(qVar, h0Var);
    }
}
