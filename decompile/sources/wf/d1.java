package wf;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d1 implements uf.g, j {

    /* renamed from: a, reason: collision with root package name */
    public final uf.g f14310a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14311b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f14312c;

    public d1(uf.g original) {
        kotlin.jvm.internal.k.e(original, "original");
        this.f14310a = original;
        this.f14311b = original.a() + '?';
        this.f14312c = u0.b(original);
    }

    @Override // uf.g
    public final String a() {
        return this.f14311b;
    }

    @Override // wf.j
    public final Set b() {
        return this.f14312c;
    }

    @Override // uf.g
    public final boolean c() {
        return true;
    }

    @Override // uf.g
    public final int d(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        return this.f14310a.d(name);
    }

    @Override // uf.g
    public final int e() {
        return this.f14310a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        if (kotlin.jvm.internal.k.a(this.f14310a, ((d1) obj).f14310a)) {
            return true;
        }
        return false;
    }

    @Override // uf.g
    public final String f(int i6) {
        return this.f14310a.f(i6);
    }

    @Override // uf.g
    public final List g(int i6) {
        return this.f14310a.g(i6);
    }

    @Override // uf.g
    public final List getAnnotations() {
        return this.f14310a.getAnnotations();
    }

    @Override // uf.g
    public final a8.a getKind() {
        return this.f14310a.getKind();
    }

    @Override // uf.g
    public final uf.g h(int i6) {
        return this.f14310a.h(i6);
    }

    public final int hashCode() {
        return this.f14310a.hashCode() * 31;
    }

    @Override // uf.g
    public final boolean i(int i6) {
        return this.f14310a.i(i6);
    }

    @Override // uf.g
    public final boolean isInline() {
        return this.f14310a.isInline();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14310a);
        sb2.append('?');
        return sb2.toString();
    }
}
