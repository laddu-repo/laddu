package k8;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7746e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f7748h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f7749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f7750k;

    public s(String str, String str2, long j8, long j9, long j10, long j11, long j12, Long l10, Long l11, Long l12, Boolean bool) {
        t7.y.d(str);
        t7.y.d(str2);
        t7.y.b(j8 >= 0);
        t7.y.b(j9 >= 0);
        t7.y.b(j10 >= 0);
        t7.y.b(j12 >= 0);
        this.f7742a = str;
        this.f7743b = str2;
        this.f7744c = j8;
        this.f7745d = j9;
        this.f7746e = j10;
        this.f = j11;
        this.f7747g = j12;
        this.f7748h = l10;
        this.i = l11;
        this.f7749j = l12;
        this.f7750k = bool;
    }

    public final s a(long j8) {
        return new s(this.f7742a, this.f7743b, this.f7744c, this.f7745d, this.f7746e, j8, this.f7747g, this.f7748h, this.i, this.f7749j, this.f7750k);
    }

    public final s b(Long l10, Long l11, Boolean bool) {
        return new s(this.f7742a, this.f7743b, this.f7744c, this.f7745d, this.f7746e, this.f, this.f7747g, this.f7748h, l10, l11, bool);
    }
}
