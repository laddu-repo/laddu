package e6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f4369a;

    /* renamed from: b, reason: collision with root package name */
    public int f4370b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f4370b != hVar.f4370b) {
                return false;
            }
            return this.f4369a.equals(hVar.f4369a);
        }
        return false;
    }

    public final int hashCode() {
        return y.e.c(this.f4370b) + (this.f4369a.hashCode() * 31);
    }
}
