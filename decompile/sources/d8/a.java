package d8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final kc.e f3969a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3970b;

    public a(kc.e eVar, b bVar) {
        this.f3969a = eVar;
        this.f3970b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                b bVar = aVar.f3970b;
                if (this.f3969a.equals(aVar.f3969a)) {
                    Object obj2 = d.f3973x;
                    if (obj2.equals(obj2) && this.f3970b.equals(bVar)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3970b.hashCode() ^ (((((1000003 * 1000003) ^ this.f3969a.hashCode()) * 1000003) ^ d.f3973x.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f3969a + ", priority=" + d.f3973x + ", productData=" + this.f3970b + "}";
    }
}
