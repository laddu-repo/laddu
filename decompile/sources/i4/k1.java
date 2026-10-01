package i4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k1 extends r1.d1 {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f6444k = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final r1.e0 f6445e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6446f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6447g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6448h;

    /* renamed from: i, reason: collision with root package name */
    public final r1.z f6449i;
    public final long j;

    public k1(l1 l1Var) {
        boolean z10;
        r1.z zVar;
        this.f6445e = l1Var.p();
        this.f6446f = l1Var.b0();
        this.f6447g = l1Var.u0();
        if (!l1Var.y0().p() && l1Var.y0().m(l1Var.m0(), new r1.c1(), 0L).f11336k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6448h = z10;
        if (l1Var.S0()) {
            zVar = r1.z.f11763f;
        } else {
            zVar = null;
        }
        this.f6449i = zVar;
        this.j = u1.a0.Q(l1Var.v());
    }

    @Override // r1.d1
    public final int b(Object obj) {
        if (f6444k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // r1.d1
    public final r1.a1 f(int i6, r1.a1 a1Var, boolean z10) {
        a1Var.getClass();
        r1.b bVar = r1.b.f11302c;
        Object obj = f6444k;
        a1Var.h(obj, obj, 0, this.j, 0L, bVar, false);
        a1Var.f11300f = this.f6448h;
        return a1Var;
    }

    @Override // r1.d1
    public final int h() {
        return 1;
    }

    @Override // r1.d1
    public final Object l(int i6) {
        return f6444k;
    }

    @Override // r1.d1
    public final r1.c1 m(int i6, r1.c1 c1Var, long j) {
        c1Var.b(f6444k, this.f6445e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f6446f, this.f6447g, this.f6449i, 0L, this.j, 0, 0, 0L);
        c1Var.f11336k = this.f6448h;
        return c1Var;
    }

    @Override // r1.d1
    public final int o() {
        return 1;
    }
}
