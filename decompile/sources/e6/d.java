package e6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4363a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4364b;

    public d(String str, int i6) {
        this.f4363a = str;
        this.f4364b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f4364b != dVar.f4364b) {
            return false;
        }
        return this.f4363a.equals(dVar.f4363a);
    }

    public final int hashCode() {
        return (this.f4363a.hashCode() * 31) + this.f4364b;
    }
}
