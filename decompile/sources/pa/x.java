package pa;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends e {

    /* renamed from: o, reason: collision with root package name */
    public int f10741o;

    /* renamed from: p, reason: collision with root package name */
    public int f10742p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10743q;

    /* renamed from: r, reason: collision with root package name */
    public int f10744r;
    public Integer s;

    /* renamed from: t, reason: collision with root package name */
    public int f10745t;

    /* renamed from: u, reason: collision with root package name */
    public float f10746u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10747v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10748w;

    @Override // pa.e
    public final boolean c() {
        if (super.c() && e() == a()) {
            return true;
        }
        return false;
    }

    @Override // pa.e
    public final void d() {
        super.d();
        if (this.f10744r >= 0) {
            if (this.f10741o == 0) {
                if ((a() <= 0 && (!this.f10748w || e() <= 0)) || this.f10641i != 0) {
                    if (this.f10637e.length < 3) {
                        throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                    }
                    return;
                }
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            return;
        }
        throw new IllegalArgumentException("Stop indicator size must be >= 0.");
    }

    public final int e() {
        if (!this.f10748w) {
            return a();
        }
        if (this.f10747v) {
            return (int) (this.f10633a * this.f10746u);
        }
        return this.f10745t;
    }
}
