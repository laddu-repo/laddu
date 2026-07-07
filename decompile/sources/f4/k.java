package f4;

import a2.t0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f4821r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f4822a;

    /* renamed from: b, reason: collision with root package name */
    public y2.f0 f4823b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f4824c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4825d;

    /* renamed from: e, reason: collision with root package name */
    public final u1.t f4826e;

    /* renamed from: f, reason: collision with root package name */
    public final t0 f4827f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f4828g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    public final j f4829h;

    /* renamed from: i, reason: collision with root package name */
    public long f4830i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4831k;

    /* renamed from: l, reason: collision with root package name */
    public long f4832l;

    /* renamed from: m, reason: collision with root package name */
    public long f4833m;

    /* renamed from: n, reason: collision with root package name */
    public long f4834n;

    /* renamed from: o, reason: collision with root package name */
    public long f4835o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4836p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4837q;

    /* JADX WARN: Type inference failed for: r3v3, types: [f4.j, java.lang.Object] */
    public k(d0 d0Var, String str) {
        this.f4824c = d0Var;
        this.f4825d = str;
        ?? obj = new Object();
        obj.f4820d = new byte[128];
        this.f4829h = obj;
        if (d0Var != null) {
            this.f4827f = new t0(178);
            this.f4826e = new u1.t();
        } else {
            this.f4827f = null;
            this.f4826e = null;
        }
        this.f4833m = -9223372036854775807L;
        this.f4835o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e6  */
    @Override // f4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(u1.t r23) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.k.a(u1.t):void");
    }

    @Override // f4.i
    public final void c() {
        v1.o.a(this.f4828g);
        j jVar = this.f4829h;
        jVar.f4817a = false;
        jVar.f4818b = 0;
        jVar.f4819c = 0;
        t0 t0Var = this.f4827f;
        if (t0Var != null) {
            t0Var.g();
        }
        this.f4830i = 0L;
        this.j = false;
        this.f4833m = -9223372036854775807L;
        this.f4835o = -9223372036854775807L;
    }

    @Override // f4.i
    public final void d(boolean z10) {
        u1.c.h(this.f4823b);
        if (z10) {
            boolean z11 = this.f4836p;
            this.f4823b.c(this.f4835o, z11 ? 1 : 0, (int) (this.f4830i - this.f4834n), 0, null);
        }
    }

    @Override // f4.i
    public final void e(int i6, long j) {
        this.f4833m = j;
    }

    @Override // f4.i
    public final void f(y2.q qVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f4822a = h0Var.f4815e;
        h0Var.b();
        this.f4823b = qVar.A(h0Var.f4814d, 2);
        d0 d0Var = this.f4824c;
        if (d0Var != null) {
            d0Var.b(qVar, h0Var);
        }
    }
}
