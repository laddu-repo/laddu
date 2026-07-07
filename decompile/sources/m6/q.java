package m6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends bg.s {

    /* renamed from: y, reason: collision with root package name */
    public static final bg.n f8676y;

    /* renamed from: x, reason: collision with root package name */
    public final bg.k f8677x;

    static {
        bg.n nVar = bg.n.A;
        f8676y = w8.l.t("0021F904");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, bg.k] */
    public q(bg.m mVar) {
        super(mVar);
        this.f8677x = new Object();
    }

    public final boolean d(long j) {
        bg.k kVar = this.f8677x;
        long j10 = kVar.f1726y;
        if (j10 >= j) {
            return true;
        }
        long j11 = j - j10;
        if (super.read(kVar, j11) == j11) {
            return true;
        }
        return false;
    }

    @Override // bg.s, bg.l0
    public final long read(bg.k kVar, long j) {
        long j10;
        long j11;
        d(j);
        bg.k kVar2 = this.f8677x;
        long j12 = 0;
        if (kVar2.f1726y == 0) {
            if (j == 0) {
                return 0L;
            }
            return -1L;
        }
        long j13 = 0;
        while (true) {
            long j14 = -1;
            while (true) {
                bg.n nVar = f8676y;
                j14 = this.f8677x.K(nVar.f1728x[0], j14 + 1, Long.MAX_VALUE);
                if (j14 != -1) {
                    j10 = j12;
                    if (d(nVar.f1728x.length) && kVar2.I(j14, nVar)) {
                        break;
                    }
                    j12 = j10;
                } else {
                    j10 = j12;
                    break;
                }
            }
            if (j14 == -1) {
                break;
            }
            long read = kVar2.read(kVar, j14 + 4);
            if (read < j10) {
                read = j10;
            }
            j13 += read;
            if (d(5L) && kVar2.y(4L) == 0) {
                if (((kVar2.y(1L) & 255) | ((kVar2.y(2L) & 255) << 8)) < 2) {
                    kVar.l0(kVar2.y(j10));
                    kVar.l0(10);
                    kVar.l0(0);
                    kVar2.skip(3L);
                }
            }
            j12 = 0;
        }
        if (j13 < j) {
            long read2 = kVar2.read(kVar, j - j13);
            j11 = 0;
            if (read2 < 0) {
                read2 = 0;
            }
            j13 += read2;
        } else {
            j11 = 0;
        }
        if (j13 == j11) {
            return -1L;
        }
        return j13;
    }
}
