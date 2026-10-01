package qb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p f11166a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11167b;

    public g(p pVar, boolean z10) {
        this.f11166a = pVar;
        this.f11167b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.f11166a.equals(this.f11166a) && gVar.f11167b == this.f11167b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f11166a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f11167b).hashCode();
    }
}
