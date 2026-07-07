package c2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f1856d = new Object().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1857a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1858b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1859c;

    public j(i iVar) {
        this.f1857a = iVar.f1813a;
        this.f1858b = iVar.f1814b;
        this.f1859c = iVar.f1815c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j.class == obj.getClass()) {
                j jVar = (j) obj;
                if (this.f1857a == jVar.f1857a && this.f1858b == jVar.f1858b && this.f1859c == jVar.f1859c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f1857a ? 1 : 0) << 2) + ((this.f1858b ? 1 : 0) << 1) + (this.f1859c ? 1 : 0);
    }
}
