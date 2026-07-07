package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f415c;

    public /* synthetic */ j1(int i, long j8, long j9, long j10) {
        if (1 != (i & 1)) {
            af.k.a(i, 1, h1.f388a.d());
            throw null;
        }
        this.f413a = j8;
        this.f414b = (i & 2) == 0 ? ((long) 1000) * j8 : j9;
        if ((i & 4) == 0) {
            this.f415c = j8 / ((long) 1000);
        } else {
            this.f415c = j10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && this.f413a == ((j1) obj).f413a;
    }

    public final int hashCode() {
        long j8 = this.f413a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.f413a + ')';
    }

    public j1(long j8) {
        this.f413a = j8;
        long j9 = 1000;
        this.f414b = j8 * j9;
        this.f415c = j8 / j9;
    }
}
