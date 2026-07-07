package e6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4361a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f4362b;

    public c(String str, long j) {
        this.f4361a = str;
        this.f4362b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Long l10 = cVar.f4362b;
        if (!this.f4361a.equals(cVar.f4361a)) {
            return false;
        }
        Long l11 = this.f4362b;
        if (l11 != null) {
            return l11.equals(l10);
        }
        if (l10 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f4361a.hashCode() * 31;
        Long l10 = this.f4362b;
        if (l10 != null) {
            i6 = l10.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }
}
