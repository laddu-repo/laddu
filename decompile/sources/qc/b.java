package qc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f11191a;

    /* renamed from: b, reason: collision with root package name */
    public String f11192b;

    /* renamed from: c, reason: collision with root package name */
    public String f11193c;

    /* renamed from: d, reason: collision with root package name */
    public String f11194d;

    /* renamed from: e, reason: collision with root package name */
    public long f11195e;

    /* renamed from: f, reason: collision with root package name */
    public byte f11196f;

    public final c a() {
        if (this.f11196f == 1 && this.f11191a != null && this.f11192b != null && this.f11193c != null && this.f11194d != null) {
            return new c(this.f11191a, this.f11192b, this.f11193c, this.f11194d, this.f11195e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f11191a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f11192b == null) {
            sb2.append(" variantId");
        }
        if (this.f11193c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f11194d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f11196f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
    }
}
