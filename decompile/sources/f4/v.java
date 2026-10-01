package f4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v implements i {

    /* renamed from: e, reason: collision with root package name */
    public String f4971e;

    /* renamed from: f, reason: collision with root package name */
    public y2.f0 f4972f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4975i;

    /* renamed from: k, reason: collision with root package name */
    public int f4976k;

    /* renamed from: l, reason: collision with root package name */
    public int f4977l;

    /* renamed from: n, reason: collision with root package name */
    public int f4979n;

    /* renamed from: o, reason: collision with root package name */
    public int f4980o;
    public int s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4985u;

    /* renamed from: d, reason: collision with root package name */
    public int f4970d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final u1.t f4967a = new u1.t(2, new byte[15]);

    /* renamed from: b, reason: collision with root package name */
    public final u1.s f4968b = new u1.s();

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f4969c = new u1.t();

    /* renamed from: p, reason: collision with root package name */
    public final w f4981p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public int f4982q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f4983r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f4984t = -1;
    public boolean j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4978m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f4973g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f4974h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:212:0x0290. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x048b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0472 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0425  */
    @Override // f4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(u1.t r25) {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.v.a(u1.t):void");
    }

    @Override // f4.i
    public final void c() {
        this.f4970d = 0;
        this.f4977l = 0;
        this.f4967a.H(2);
        this.f4979n = 0;
        this.f4980o = 0;
        this.f4982q = -2147483647;
        this.f4983r = -1;
        this.s = 0;
        this.f4984t = -1L;
        this.f4985u = false;
        this.f4975i = false;
        this.f4978m = true;
        this.j = true;
        this.f4973g = -9.223372036854776E18d;
        this.f4974h = -9.223372036854776E18d;
    }

    @Override // f4.i
    public final void e(int i6, long j) {
        this.f4976k = i6;
        if (!this.j && (this.f4980o != 0 || !this.f4978m)) {
            this.f4975i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f4975i) {
                this.f4974h = j;
            } else {
                this.f4973g = j;
            }
        }
    }

    @Override // f4.i
    public final void f(y2.q qVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f4971e = h0Var.f4815e;
        h0Var.b();
        this.f4972f = qVar.A(h0Var.f4814d, 1);
    }

    @Override // f4.i
    public final void d(boolean z10) {
    }
}
