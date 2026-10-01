package he;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final int f6094x;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.k.g(this.f6094x ^ Integer.MIN_VALUE, ((r) obj).f6094x ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (this.f6094x != ((r) obj).f6094x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6094x;
    }

    public final String toString() {
        return String.valueOf(this.f6094x & 4294967295L);
    }
}
