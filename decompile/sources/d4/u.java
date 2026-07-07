package d4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.t f4278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.y f4279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4282e;
    public w2.g0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4284h = 0;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4289n;

    public u(int i, String str, String str2) {
        w1.t tVar = new w1.t(4);
        this.f4278a = tVar;
        tVar.f13738a[0] = -1;
        this.f4279b = new w2.y();
        this.f4289n = -9223372036854775807L;
        this.f4280c = str;
        this.f4281d = i;
        this.f4282e = str2;
    }

    @Override // d4.i
    public final void a() {
        this.f4284h = 0;
        this.i = 0;
        this.f4286k = false;
        this.f4289n = -9223372036854775807L;
    }

    @Override // d4.i
    public final void b(w1.t tVar) {
        w1.a.k(this.f);
        while (tVar.a() > 0) {
            int i = this.f4284h;
            w1.t tVar2 = this.f4278a;
            if (i == 0) {
                byte[] bArr = tVar.f13738a;
                int i10 = tVar.f13739b;
                int i11 = tVar.f13740c;
                while (true) {
                    if (i10 >= i11) {
                        tVar.J(i11);
                        break;
                    }
                    byte b9 = bArr[i10];
                    boolean z2 = (b9 & 255) == 255;
                    boolean z10 = this.f4286k && (b9 & 224) == 224;
                    this.f4286k = z2;
                    if (z10) {
                        tVar.J(i10 + 1);
                        this.f4286k = false;
                        tVar2.f13738a[1] = bArr[i10];
                        this.i = 2;
                        this.f4284h = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i == 1) {
                int iMin = Math.min(tVar.a(), 4 - this.i);
                tVar.h(tVar2.f13738a, this.i, iMin);
                int i12 = this.i + iMin;
                this.i = i12;
                if (i12 >= 4) {
                    tVar2.J(0);
                    int iJ = tVar2.j();
                    w2.y yVar = this.f4279b;
                    if (yVar.a(iJ)) {
                        this.f4288m = yVar.f13881b;
                        if (!this.f4285j) {
                            this.f4287l = (((long) yVar.f) * 1000000) / ((long) yVar.f13882c);
                            t1.n nVar = new t1.n();
                            nVar.f12026a = this.f4283g;
                            nVar.f12035l = t1.f0.p(this.f4282e);
                            nVar.f12036m = t1.f0.p((String) yVar.f13885g);
                            nVar.f12037n = 4096;
                            nVar.E = yVar.f13883d;
                            nVar.F = yVar.f13882c;
                            nVar.f12029d = this.f4280c;
                            nVar.f = this.f4281d;
                            this.f.c(new t1.o(nVar));
                            this.f4285j = true;
                        }
                        tVar2.J(0);
                        this.f.d(4, tVar2);
                        this.f4284h = 2;
                    } else {
                        this.i = 0;
                        this.f4284h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(tVar.a(), this.f4288m - this.i);
                this.f.d(iMin2, tVar);
                int i13 = this.i + iMin2;
                this.i = i13;
                if (i13 >= this.f4288m) {
                    w1.a.j(this.f4289n != -9223372036854775807L);
                    this.f.a(this.f4289n, 1, this.f4288m, 0, null);
                    this.f4289n += this.f4287l;
                    this.i = 0;
                    this.f4284h = 0;
                }
            }
        }
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        this.f4289n = j8;
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f4283g = g0Var.f4141e;
        g0Var.b();
        this.f = qVar.r(g0Var.f4140d, 1);
    }

    @Override // d4.i
    public final void c(boolean z2) {
    }
}
