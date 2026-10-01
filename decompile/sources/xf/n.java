package xf;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements uf.g {

    /* renamed from: a, reason: collision with root package name */
    public final he.m f14742a;

    public n(ve.a aVar) {
        this.f14742a = he.a.d(aVar);
    }

    @Override // uf.g
    public final String a() {
        return b().a();
    }

    public final uf.g b() {
        return (uf.g) this.f14742a.getValue();
    }

    @Override // uf.g
    public final boolean c() {
        return false;
    }

    @Override // uf.g
    public final int d(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        return b().d(name);
    }

    @Override // uf.g
    public final int e() {
        return b().e();
    }

    @Override // uf.g
    public final String f(int i6) {
        return b().f(i6);
    }

    @Override // uf.g
    public final List g(int i6) {
        return b().g(i6);
    }

    @Override // uf.g
    public final List getAnnotations() {
        return ie.r.f6846x;
    }

    @Override // uf.g
    public final a8.a getKind() {
        return b().getKind();
    }

    @Override // uf.g
    public final uf.g h(int i6) {
        return b().h(i6);
    }

    @Override // uf.g
    public final boolean i(int i6) {
        return b().i(i6);
    }

    @Override // uf.g
    public final boolean isInline() {
        return false;
    }
}
