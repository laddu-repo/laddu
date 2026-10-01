package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f275a;

    /* renamed from: b, reason: collision with root package name */
    public final long f276b;

    /* renamed from: c, reason: collision with root package name */
    public long f277c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f278d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f280f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f281g = -9223372036854775807L;
    public float j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    public float f283i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    public float f284k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public long f285l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f279e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f282h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f286m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public long f287n = -9223372036854775807L;

    public j(long j, long j10) {
        this.f275a = j;
        this.f276b = j10;
    }

    public final void a() {
        long j;
        long j10 = this.f277c;
        if (j10 != -9223372036854775807L) {
            j = this.f278d;
            if (j == -9223372036854775807L) {
                long j11 = this.f280f;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j = this.f281g;
                if (j == -9223372036854775807L || j10 <= j) {
                    j = j10;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f279e == j) {
            return;
        }
        this.f279e = j;
        this.f282h = j;
        this.f286m = -9223372036854775807L;
        this.f287n = -9223372036854775807L;
        this.f285l = -9223372036854775807L;
    }
}
