package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends s {

    /* renamed from: f, reason: collision with root package name */
    public final long f10871f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10872g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10873h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10874i;

    public f(r1.d1 d1Var, long j, long j10, boolean z10) {
        super(d1Var);
        long max;
        long j11;
        if (j10 != Long.MIN_VALUE && j10 < j) {
            throw new g(2, j, j10);
        }
        boolean z11 = false;
        if (d1Var.h() == 1) {
            r1.c1 m9 = d1Var.m(0, new r1.c1(), 0L);
            long max2 = Math.max(0L, j);
            if (!z10 && !m9.f11336k && max2 != 0 && !m9.f11334h) {
                throw new g(1);
            }
            if (j10 == Long.MIN_VALUE) {
                max = m9.f11338m;
            } else {
                max = Math.max(0L, j10);
            }
            long j12 = m9.f11338m;
            if (j12 != -9223372036854775807L) {
                max = max > j12 ? j12 : max;
                if (max2 > max) {
                    max2 = max;
                }
            }
            this.f10871f = max2;
            this.f10872g = max;
            if (max == -9223372036854775807L) {
                j11 = -9223372036854775807L;
            } else {
                j11 = max - max2;
            }
            this.f10873h = j11;
            if (m9.f11335i && (max == -9223372036854775807L || (j12 != -9223372036854775807L && max == j12))) {
                z11 = true;
            }
            this.f10874i = z11;
            return;
        }
        throw new g(0);
    }

    @Override // q2.s, r1.d1
    public final r1.a1 f(int i6, r1.a1 a1Var, boolean z10) {
        this.f10943e.f(0, a1Var, z10);
        long j = a1Var.f11299e - this.f10871f;
        long j10 = this.f10873h;
        long j11 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            j11 = j10 - j;
        }
        a1Var.h(a1Var.f11295a, a1Var.f11296b, 0, j11, j, r1.b.f11302c, false);
        return a1Var;
    }

    @Override // q2.s, r1.d1
    public final r1.c1 m(int i6, r1.c1 c1Var, long j) {
        this.f10943e.m(0, c1Var, 0L);
        long j10 = c1Var.f11341p;
        long j11 = this.f10871f;
        c1Var.f11341p = j10 + j11;
        c1Var.f11338m = this.f10873h;
        c1Var.f11335i = this.f10874i;
        long j12 = c1Var.f11337l;
        if (j12 != -9223372036854775807L) {
            long max = Math.max(j12, j11);
            c1Var.f11337l = max;
            long j13 = this.f10872g;
            if (j13 != -9223372036854775807L) {
                max = Math.min(max, j13);
            }
            c1Var.f11337l = max - j11;
        }
        long e02 = u1.a0.e0(j11);
        long j14 = c1Var.f11331e;
        if (j14 != -9223372036854775807L) {
            c1Var.f11331e = j14 + e02;
        }
        long j15 = c1Var.f11332f;
        if (j15 != -9223372036854775807L) {
            c1Var.f11332f = j15 + e02;
        }
        return c1Var;
    }
}
