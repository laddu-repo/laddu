package d4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4294e;
    public w2.g0 f;
    public boolean i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4299l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4302o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4306s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4308u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4293d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.t f4290a = new w1.t(2, new byte[15]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3.f f4291b = new u3.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f4292c = new w1.t();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f4303p = new w();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4304q = -2147483647;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4305r = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f4307t = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4297j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4300m = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f4295g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f4296h = -9.223372036854776E18d;

    @Override // d4.i
    public final void a() {
        this.f4293d = 0;
        this.f4299l = 0;
        this.f4290a.G(2);
        this.f4301n = 0;
        this.f4302o = 0;
        this.f4304q = -2147483647;
        this.f4305r = -1;
        this.f4306s = 0;
        this.f4307t = -1L;
        this.f4308u = false;
        this.i = false;
        this.f4300m = true;
        this.f4297j = true;
        this.f4295g = -9.223372036854776E18d;
        this.f4296h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0420  */
    @Override // d4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w1.t r25) throws t1.g0 {
        /*
            Method dump skipped, instruction units count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.v.b(w1.t):void");
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        this.f4298k = i;
        if (!this.f4297j && (this.f4302o != 0 || !this.f4300m)) {
            this.i = true;
        }
        if (j8 != -9223372036854775807L) {
            if (this.i) {
                this.f4296h = j8;
            } else {
                this.f4295g = j8;
            }
        }
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f4294e = g0Var.f4141e;
        g0Var.b();
        this.f = qVar.r(g0Var.f4140d, 1);
    }

    @Override // d4.i
    public final void c(boolean z2) {
    }
}
