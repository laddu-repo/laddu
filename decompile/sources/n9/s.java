package n9;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f9459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9460b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9461c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9462d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9463e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9464f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9465g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f9466h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f9467i;
    public final Long j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f9468k;

    public s(String str, String str2, long j, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        boolean z10;
        boolean z11;
        boolean z12;
        w8.x.d(str);
        w8.x.d(str2);
        if (j >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w8.x.b(z10);
        if (j10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        w8.x.b(z11);
        if (j11 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        w8.x.b(z12);
        w8.x.b(j13 >= 0);
        this.f9459a = str;
        this.f9460b = str2;
        this.f9461c = j;
        this.f9462d = j10;
        this.f9463e = j11;
        this.f9464f = j12;
        this.f9465g = j13;
        this.f9466h = l10;
        this.f9467i = l11;
        this.j = l12;
        this.f9468k = bool;
    }

    public final s a(long j) {
        return new s(this.f9459a, this.f9460b, this.f9461c, this.f9462d, this.f9463e, j, this.f9465g, this.f9466h, this.f9467i, this.j, this.f9468k);
    }

    public final s b(Long l10, Long l11, Boolean bool) {
        return new s(this.f9459a, this.f9460b, this.f9461c, this.f9462d, this.f9463e, this.f9464f, this.f9465g, this.f9466h, l10, l11, bool);
    }
}
