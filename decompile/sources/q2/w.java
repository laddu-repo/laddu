package q2;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f10981h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final Object f10982f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10983g;

    public w(r1.d1 d1Var, Object obj, Object obj2) {
        super(d1Var);
        this.f10982f = obj;
        this.f10983g = obj2;
    }

    @Override // q2.s, r1.d1
    public final int b(Object obj) {
        Object obj2;
        if (f10981h.equals(obj) && (obj2 = this.f10983g) != null) {
            obj = obj2;
        }
        return this.f10943e.b(obj);
    }

    @Override // q2.s, r1.d1
    public final r1.a1 f(int i6, r1.a1 a1Var, boolean z10) {
        this.f10943e.f(i6, a1Var, z10);
        if (Objects.equals(a1Var.f11296b, this.f10983g) && z10) {
            a1Var.f11296b = f10981h;
        }
        return a1Var;
    }

    @Override // q2.s, r1.d1
    public final Object l(int i6) {
        Object l10 = this.f10943e.l(i6);
        if (Objects.equals(l10, this.f10983g)) {
            return f10981h;
        }
        return l10;
    }

    @Override // q2.s, r1.d1
    public final r1.c1 m(int i6, r1.c1 c1Var, long j) {
        this.f10943e.m(i6, c1Var, j);
        if (Objects.equals(c1Var.f11327a, this.f10982f)) {
            c1Var.f11327a = r1.c1.f11318q;
        }
        return c1Var;
    }
}
