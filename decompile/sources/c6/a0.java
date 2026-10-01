package c6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements b0, w6.b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final hd.a f2142z = w6.d.a(20, new t7.k(7));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w6.e f2143v = new w6.e();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b0 f2144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2146y;

    public final synchronized void a() {
        this.f2143v.a();
        if (!this.f2145x) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f2145x = false;
        if (this.f2146y) {
            e();
        }
    }

    @Override // c6.b0
    public final int b() {
        return this.f2144w.b();
    }

    @Override // w6.b
    public final w6.e c() {
        return this.f2143v;
    }

    @Override // c6.b0
    public final Class d() {
        return this.f2144w.d();
    }

    @Override // c6.b0
    public final synchronized void e() {
        this.f2143v.a();
        this.f2146y = true;
        if (!this.f2145x) {
            this.f2144w.e();
            this.f2144w = null;
            f2142z.e(this);
        }
    }

    @Override // c6.b0
    public final Object get() {
        return this.f2144w.get();
    }
}
