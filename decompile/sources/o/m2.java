package o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9225e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9227h;

    public final void a(int i, int i10) {
        this.f9223c = i;
        this.f9224d = i10;
        this.f9227h = true;
        if (this.f9226g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f9221a = i10;
            }
            if (i != Integer.MIN_VALUE) {
                this.f9222b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f9221a = i;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f9222b = i10;
        }
    }
}
