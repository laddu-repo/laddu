package lc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8323a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8324b;

    public a(String str, String str2) {
        this.f8323a = str;
        if (str2 != null) {
            this.f8324b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f8323a.equals(aVar.f8323a) && this.f8324b.equals(aVar.f8324b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8323a.hashCode() ^ 1000003) * 1000003) ^ this.f8324b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f8323a);
        sb2.append(", version=");
        return r4.a.o(sb2, this.f8324b, "}");
    }
}
