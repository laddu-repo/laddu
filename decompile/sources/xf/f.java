package xf;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements uf.g {

    /* renamed from: b, reason: collision with root package name */
    public static final f f14730b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final String f14731c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f14732a;

    public f() {
        uf.g elementDesc = m.f14740a.d();
        kotlin.jvm.internal.k.e(elementDesc, "elementDesc");
        this.f14732a = new wf.b(elementDesc, 1);
    }

    @Override // uf.g
    public final String a() {
        return f14731c;
    }

    @Override // uf.g
    public final boolean c() {
        this.f14732a.getClass();
        return false;
    }

    @Override // uf.g
    public final int d(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        return this.f14732a.d(name);
    }

    @Override // uf.g
    public final int e() {
        this.f14732a.getClass();
        return 1;
    }

    @Override // uf.g
    public final String f(int i6) {
        this.f14732a.getClass();
        return String.valueOf(i6);
    }

    @Override // uf.g
    public final List g(int i6) {
        this.f14732a.g(i6);
        return ie.r.f6846x;
    }

    @Override // uf.g
    public final List getAnnotations() {
        this.f14732a.getClass();
        return ie.r.f6846x;
    }

    @Override // uf.g
    public final a8.a getKind() {
        this.f14732a.getClass();
        return uf.j.f13137g;
    }

    @Override // uf.g
    public final uf.g h(int i6) {
        return this.f14732a.h(i6);
    }

    @Override // uf.g
    public final boolean i(int i6) {
        this.f14732a.i(i6);
        return false;
    }

    @Override // uf.g
    public final boolean isInline() {
        this.f14732a.getClass();
        return false;
    }
}
