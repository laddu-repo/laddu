package uf;

import ie.r;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f13111a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.e f13112b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13113c;

    public b(h hVar, kotlin.jvm.internal.e eVar) {
        this.f13111a = hVar;
        this.f13112b = eVar;
        this.f13113c = hVar.f13124a + '<' + eVar.c() + '>';
    }

    @Override // uf.g
    public final String a() {
        return this.f13113c;
    }

    @Override // uf.g
    public final boolean c() {
        return false;
    }

    @Override // uf.g
    public final int d(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        return this.f13111a.d(name);
    }

    @Override // uf.g
    public final int e() {
        return this.f13111a.f13126c;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj instanceof b) {
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        if (bVar != null && this.f13111a.equals(bVar.f13111a) && bVar.f13112b.equals(this.f13112b)) {
            return true;
        }
        return false;
    }

    @Override // uf.g
    public final String f(int i6) {
        return this.f13111a.f13128e[i6];
    }

    @Override // uf.g
    public final List g(int i6) {
        return this.f13111a.f13130g[i6];
    }

    @Override // uf.g
    public final List getAnnotations() {
        return r.f6846x;
    }

    @Override // uf.g
    public final a8.a getKind() {
        return this.f13111a.f13125b;
    }

    @Override // uf.g
    public final g h(int i6) {
        return this.f13111a.f13129f[i6];
    }

    public final int hashCode() {
        return this.f13113c.hashCode() + (this.f13112b.hashCode() * 31);
    }

    @Override // uf.g
    public final boolean i(int i6) {
        return this.f13111a.f13131h[i6];
    }

    @Override // uf.g
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f13112b + ", original: " + this.f13111a + ')';
    }
}
