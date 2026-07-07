package xb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements ub.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14715a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14716b = false;

    /* renamed from: c, reason: collision with root package name */
    public ub.c f14717c;

    /* renamed from: d, reason: collision with root package name */
    public final f f14718d;

    public h(f fVar) {
        this.f14718d = fVar;
    }

    @Override // ub.g
    public final ub.g d(String str) {
        if (!this.f14715a) {
            this.f14715a = true;
            this.f14718d.e(this.f14717c, str, this.f14716b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // ub.g
    public final ub.g e(boolean z10) {
        if (!this.f14715a) {
            this.f14715a = true;
            this.f14718d.d(this.f14717c, z10 ? 1 : 0, this.f14716b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
