package wf;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 implements uf.g {

    /* renamed from: a, reason: collision with root package name */
    public final uf.g f14324a;

    /* renamed from: b, reason: collision with root package name */
    public final uf.g f14325b;

    public g0(uf.g keyDesc, uf.g valueDesc) {
        kotlin.jvm.internal.k.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.k.e(valueDesc, "valueDesc");
        this.f14324a = keyDesc;
        this.f14325b = valueDesc;
    }

    @Override // uf.g
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // uf.g
    public final boolean c() {
        return false;
    }

    @Override // uf.g
    public final int d(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        Integer w10 = df.t.w(name);
        if (w10 != null) {
            return w10.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // uf.g
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (!kotlin.jvm.internal.k.a(this.f14324a, g0Var.f14324a) || !kotlin.jvm.internal.k.a(this.f14325b, g0Var.f14325b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // uf.g
    public final String f(int i6) {
        return String.valueOf(i6);
    }

    @Override // uf.g
    public final List g(int i6) {
        if (i6 >= 0) {
            return ie.r.f6846x;
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // uf.g
    public final List getAnnotations() {
        return ie.r.f6846x;
    }

    @Override // uf.g
    public final a8.a getKind() {
        return uf.j.f13138h;
    }

    @Override // uf.g
    public final uf.g h(int i6) {
        if (i6 >= 0) {
            int i10 = i6 % 2;
            if (i10 != 0) {
                if (i10 == 1) {
                    return this.f14325b;
                }
                throw new IllegalStateException("Unreached");
            }
            return this.f14324a;
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f14325b.hashCode() + ((this.f14324a.hashCode() + 710441009) * 31);
    }

    @Override // uf.g
    public final boolean i(int i6) {
        if (i6 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // uf.g
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f14324a + ", " + this.f14325b + ')';
    }
}
