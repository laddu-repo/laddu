package f8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f5140a;

    /* renamed from: b, reason: collision with root package name */
    public final t f5141b;

    public n(u uVar, t tVar) {
        this.f5140a = uVar;
        this.f5141b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f5140a;
            if (uVar != null ? uVar.equals(((n) vVar).f5140a) : ((n) vVar).f5140a == null) {
                t tVar = this.f5141b;
                if (tVar != null ? tVar.equals(((n) vVar).f5141b) : ((n) vVar).f5141b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        u uVar = this.f5140a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f5141b;
        if (tVar != null) {
            i6 = tVar.hashCode();
        }
        return i6 ^ i10;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f5140a + ", mobileSubtype=" + this.f5141b + "}";
    }
}
