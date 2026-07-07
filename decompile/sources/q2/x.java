package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends r1.d1 {

    /* renamed from: e, reason: collision with root package name */
    public final r1.e0 f10986e;

    public x(r1.e0 e0Var) {
        this.f10986e = e0Var;
    }

    @Override // r1.d1
    public final int b(Object obj) {
        if (obj == w.f10981h) {
            return 0;
        }
        return -1;
    }

    @Override // r1.d1
    public final r1.a1 f(int i6, r1.a1 a1Var, boolean z10) {
        Integer num;
        Object obj = null;
        if (z10) {
            num = 0;
        } else {
            num = null;
        }
        if (z10) {
            obj = w.f10981h;
        }
        a1Var.h(num, obj, 0, -9223372036854775807L, 0L, r1.b.f11302c, true);
        return a1Var;
    }

    @Override // r1.d1
    public final int h() {
        return 1;
    }

    @Override // r1.d1
    public final Object l(int i6) {
        return w.f10981h;
    }

    @Override // r1.d1
    public final r1.c1 m(int i6, r1.c1 c1Var, long j) {
        c1Var.b(r1.c1.f11318q, this.f10986e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        c1Var.f11336k = true;
        return c1Var;
    }

    @Override // r1.d1
    public final int o() {
        return 1;
    }
}
