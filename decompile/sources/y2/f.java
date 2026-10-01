package y2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f14893a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14894b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14895c;

    /* renamed from: d, reason: collision with root package name */
    public long f14896d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f14897e;

    /* renamed from: f, reason: collision with root package name */
    public long f14898f;

    /* renamed from: g, reason: collision with root package name */
    public long f14899g;

    /* renamed from: h, reason: collision with root package name */
    public long f14900h;

    public f(long j, long j10, long j11, long j12, long j13, long j14) {
        this.f14893a = j;
        this.f14894b = j10;
        this.f14897e = j11;
        this.f14898f = j12;
        this.f14899g = j13;
        this.f14895c = j14;
        this.f14900h = a(j10, 0L, j11, j12, j13, j14);
    }

    public static long a(long j, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 < j13 && j10 + 1 < j11) {
            long j15 = ((float) (j - j10)) * (((float) (j13 - j12)) / ((float) (j11 - j10)));
            return u1.a0.j(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
        }
        return j12;
    }
}
