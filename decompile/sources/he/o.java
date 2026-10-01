package he;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final byte f6089x;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.k.g(this.f6089x & 255, ((o) obj).f6089x & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (this.f6089x != ((o) obj).f6089x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6089x;
    }

    public final String toString() {
        return String.valueOf(this.f6089x & 255);
    }
}
