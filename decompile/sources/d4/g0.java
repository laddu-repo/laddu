package d4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4141e;

    public g0(int i, int i10) {
        this(Integer.MIN_VALUE, i, i10);
    }

    public final void a() {
        int i = this.f4140d;
        this.f4140d = i == Integer.MIN_VALUE ? this.f4138b : i + this.f4139c;
        this.f4141e = this.f4137a + this.f4140d;
    }

    public final void b() {
        if (this.f4140d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public g0(int i, int i10, int i11) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f4137a = str;
        this.f4138b = i10;
        this.f4139c = i11;
        this.f4140d = Integer.MIN_VALUE;
        this.f4141e = "";
    }
}
