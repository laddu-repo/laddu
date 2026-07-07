package l1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8033b;

    public e(long j8, long j9) {
        if (j9 == 0) {
            this.f8032a = 0L;
            this.f8033b = 1L;
        } else {
            this.f8032a = j8;
            this.f8033b = j9;
        }
    }

    public final String toString() {
        return this.f8032a + "/" + this.f8033b;
    }
}
