package ef;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements j, Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final long f4584x;

    public static long a(long j) {
        long b10 = i.b();
        c unit = c.NANOSECONDS;
        kotlin.jvm.internal.k.e(unit, "unit");
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return a.i(f.i(j));
        }
        return f.n(b10, j, unit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long n10;
        k other = (k) obj;
        kotlin.jvm.internal.k.e(other, "other");
        long j = other.f4584x;
        int i6 = i.f4583b;
        c unit = c.NANOSECONDS;
        kotlin.jvm.internal.k.e(unit, "unit");
        long j10 = (j - 1) | 1;
        long j11 = this.f4584x;
        if (j10 == Long.MAX_VALUE) {
            if (j11 == j) {
                int i10 = a.A;
                n10 = 0;
            } else {
                n10 = a.i(f.i(j));
            }
        } else if ((1 | (j11 - 1)) == Long.MAX_VALUE) {
            n10 = f.i(j11);
        } else {
            n10 = f.n(j11, j, unit);
        }
        return a.c(n10, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (this.f4584x != ((k) obj).f4584x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4584x;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f4584x + ')';
    }
}
