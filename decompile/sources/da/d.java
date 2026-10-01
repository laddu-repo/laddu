package da;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f4398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f4399d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f4401b;

    static {
        if (t.A) {
            f4399d = null;
            f4398c = null;
        } else {
            f4399d = new d(null, false);
            f4398c = new d(null, true);
        }
    }

    public d(Throwable th, boolean z2) {
        this.f4400a = z2;
        this.f4401b = th;
    }
}
