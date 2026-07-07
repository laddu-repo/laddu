package f8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f5125a;

    public j(h hVar) {
        this.f5125a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                Object obj2 = p.f5142x;
                if (obj2.equals(obj2)) {
                    if (this.f5125a.equals(((j) qVar).f5125a)) {
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
        return ((p.f5142x.hashCode() ^ 1000003) * 1000003) ^ this.f5125a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f5142x + ", androidClientInfo=" + this.f5125a + "}";
    }
}
