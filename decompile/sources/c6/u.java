package c6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u implements b0 {
    public int A;
    public boolean B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f2238v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f2239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b0 f2240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f2241y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a6.f f2242z;

    public u(b0 b0Var, boolean z2, boolean z10, a6.f fVar, t tVar) {
        v6.f.c(b0Var, "Argument must not be null");
        this.f2240x = b0Var;
        this.f2238v = z2;
        this.f2239w = z10;
        this.f2242z = fVar;
        v6.f.c(tVar, "Argument must not be null");
        this.f2241y = tVar;
    }

    public final synchronized void a() {
        if (this.B) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.A++;
    }

    @Override // c6.b0
    public final int b() {
        return this.f2240x.b();
    }

    public final void c() {
        boolean z2;
        synchronized (this) {
            int i = this.A;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z2 = true;
            int i10 = i - 1;
            this.A = i10;
            if (i10 != 0) {
                z2 = false;
            }
        }
        if (z2) {
            ((m) this.f2241y).f(this.f2242z, this);
        }
    }

    @Override // c6.b0
    public final Class d() {
        return this.f2240x.d();
    }

    @Override // c6.b0
    public final synchronized void e() {
        if (this.A > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.B) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.B = true;
        if (this.f2239w) {
            this.f2240x.e();
        }
    }

    @Override // c6.b0
    public final Object get() {
        return this.f2240x.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f2238v + ", listener=" + this.f2241y + ", key=" + this.f2242z + ", acquired=" + this.A + ", isRecycled=" + this.B + ", resource=" + this.f2240x + '}';
    }
}
