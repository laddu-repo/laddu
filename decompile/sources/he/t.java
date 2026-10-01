package he;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final long f6096x;

    public /* synthetic */ t(long j) {
        this.f6096x = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((t) obj).f6096x;
        long j10 = this.f6096x ^ Long.MIN_VALUE;
        long j11 = j ^ Long.MIN_VALUE;
        if (j10 < j11) {
            return -1;
        }
        if (j10 == j11) {
            return 0;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            if (this.f6096x != ((t) obj).f6096x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6096x;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return a.g(10, this.f6096x);
    }
}
