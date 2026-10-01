package y2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements z {

    /* renamed from: a, reason: collision with root package name */
    public final g f14883a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14884b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14885c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14886d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14887e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14888f;

    public e(g gVar, long j, long j10, long j11, long j12, long j13) {
        this.f14883a = gVar;
        this.f14884b = j;
        this.f14885c = j10;
        this.f14886d = j11;
        this.f14887e = j12;
        this.f14888f = j13;
    }

    @Override // y2.z
    public final boolean g() {
        return true;
    }

    @Override // y2.z
    public final y j(long j) {
        a0 a0Var = new a0(j, f.a(this.f14883a.b(j), 0L, this.f14885c, this.f14886d, this.f14887e, this.f14888f));
        return new y(a0Var, a0Var);
    }

    @Override // y2.z
    public final long m() {
        return this.f14884b;
    }
}
