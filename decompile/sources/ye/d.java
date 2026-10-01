package ye;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: x, reason: collision with root package name */
    public static final a f15057x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ye.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        ?? r02;
        Integer num = re.a.f11951a;
        if (num != null && num.intValue() < 34) {
            r02 = new b();
        } else {
            r02 = new Object();
        }
        f15057x = r02;
    }

    public abstract int a(int i6);

    public abstract int b();

    public abstract long c();

    public long d(long j, long j10) {
        long c10;
        long j11;
        long j12;
        int b10;
        if (j10 > j) {
            long j13 = j10 - j;
            if (j13 > 0) {
                if (((-j13) & j13) == j13) {
                    int i6 = (int) j13;
                    int i10 = (int) (j13 >>> 32);
                    if (i6 != 0) {
                        b10 = a(31 - Integer.numberOfLeadingZeros(i6));
                    } else if (i10 == 1) {
                        b10 = b();
                    } else {
                        j12 = (a(31 - Integer.numberOfLeadingZeros(i10)) << 32) + (b() & 4294967295L);
                        return j + j12;
                    }
                    j12 = b10 & 4294967295L;
                    return j + j12;
                }
                do {
                    c10 = c() >>> 1;
                    j11 = c10 % j13;
                } while ((j13 - 1) + (c10 - j11) < 0);
                j12 = j11;
                return j + j12;
            }
            while (true) {
                long c11 = c();
                if (j <= c11 && c11 < j10) {
                    return c11;
                }
            }
        } else {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j) + ", " + Long.valueOf(j10) + ").").toString());
        }
    }
}
