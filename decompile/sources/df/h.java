package df;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f4134a;

    /* renamed from: b, reason: collision with root package name */
    public final af.c f4135b;

    public h(String str, af.c cVar) {
        this.f4134a = str;
        this.f4135b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.k.a(this.f4134a, hVar.f4134a) && kotlin.jvm.internal.k.a(this.f4135b, hVar.f4135b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4135b.hashCode() + (this.f4134a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f4134a + ", range=" + this.f4135b + ')';
    }
}
