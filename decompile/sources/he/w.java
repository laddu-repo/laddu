package he;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final short f6099x;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.k.g(this.f6099x & 65535, ((w) obj).f6099x & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            if (this.f6099x != ((w) obj).f6099x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6099x;
    }

    public final String toString() {
        return String.valueOf(this.f6099x & 65535);
    }
}
