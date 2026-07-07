package s3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f12042a;

    /* renamed from: b, reason: collision with root package name */
    public int f12043b;

    /* renamed from: c, reason: collision with root package name */
    public int f12044c;

    /* renamed from: d, reason: collision with root package name */
    public long f12045d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12046e;

    /* renamed from: f, reason: collision with root package name */
    public final u1.t f12047f;

    /* renamed from: g, reason: collision with root package name */
    public final u1.t f12048g;

    /* renamed from: h, reason: collision with root package name */
    public int f12049h;

    /* renamed from: i, reason: collision with root package name */
    public int f12050i;

    public a(u1.t tVar, u1.t tVar2, boolean z10) {
        this.f12048g = tVar;
        this.f12047f = tVar2;
        this.f12046e = z10;
        tVar2.K(12);
        this.f12042a = tVar2.C();
        tVar.K(12);
        this.f12050i = tVar.C();
        y2.a.e("first_chunk must be 1", tVar.k() == 1);
        this.f12043b = -1;
    }

    public final boolean a() {
        long A;
        int i6;
        int i10 = this.f12043b + 1;
        this.f12043b = i10;
        if (i10 == this.f12042a) {
            return false;
        }
        boolean z10 = this.f12046e;
        u1.t tVar = this.f12047f;
        if (z10) {
            A = tVar.D();
        } else {
            A = tVar.A();
        }
        this.f12045d = A;
        if (this.f12043b == this.f12049h) {
            u1.t tVar2 = this.f12048g;
            this.f12044c = tVar2.C();
            tVar2.L(4);
            int i11 = this.f12050i - 1;
            this.f12050i = i11;
            if (i11 > 0) {
                i6 = tVar2.C() - 1;
            } else {
                i6 = -1;
            }
            this.f12049h = i6;
        }
        return true;
    }
}
