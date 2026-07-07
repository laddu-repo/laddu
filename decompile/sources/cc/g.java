package cc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f2038a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.h f2039b;

    public g(k kVar, s9.h hVar) {
        this.f2038a = kVar;
        this.f2039b = hVar;
    }

    @Override // cc.j
    public final boolean a(dc.b bVar) {
        if (bVar.f4074b == 4 && !this.f2038a.a(bVar)) {
            String str = bVar.f4075c;
            if (str != null) {
                this.f2039b.a(new a(str, bVar.f4077e, bVar.f4078f));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }

    @Override // cc.j
    public final boolean b(Exception exc) {
        this.f2039b.b(exc);
        return true;
    }
}
