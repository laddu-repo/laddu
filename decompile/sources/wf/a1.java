package wf;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 implements uf.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f14295a;

    /* renamed from: b, reason: collision with root package name */
    public final uf.f f14296b;

    public a1(String str, uf.f kind) {
        kotlin.jvm.internal.k.e(kind, "kind");
        this.f14295a = str;
        this.f14296b = kind;
    }

    @Override // uf.g
    public final String a() {
        return this.f14295a;
    }

    public final void b() {
        throw new IllegalStateException(r4.a.o(new StringBuilder("Primitive descriptor "), this.f14295a, " does not have elements"));
    }

    @Override // uf.g
    public final boolean c() {
        return false;
    }

    @Override // uf.g
    public final int d(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        b();
        throw null;
    }

    @Override // uf.g
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (kotlin.jvm.internal.k.a(this.f14295a, a1Var.f14295a) && kotlin.jvm.internal.k.a(this.f14296b, a1Var.f14296b)) {
            return true;
        }
        return false;
    }

    @Override // uf.g
    public final String f(int i6) {
        b();
        throw null;
    }

    @Override // uf.g
    public final List g(int i6) {
        b();
        throw null;
    }

    @Override // uf.g
    public final List getAnnotations() {
        return ie.r.f6846x;
    }

    @Override // uf.g
    public final a8.a getKind() {
        return this.f14296b;
    }

    @Override // uf.g
    public final uf.g h(int i6) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.f14296b.hashCode() * 31) + this.f14295a.hashCode();
    }

    @Override // uf.g
    public final boolean i(int i6) {
        b();
        throw null;
    }

    @Override // uf.g
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return r4.a.n(new StringBuilder("PrimitiveDescriptor("), this.f14295a, ')');
    }
}
