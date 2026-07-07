package p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10345a;

    /* renamed from: b, reason: collision with root package name */
    public int f10346b;

    /* renamed from: c, reason: collision with root package name */
    public int f10347c;

    /* renamed from: d, reason: collision with root package name */
    public int f10348d;

    /* renamed from: e, reason: collision with root package name */
    public int f10349e;

    /* renamed from: f, reason: collision with root package name */
    public int f10350f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10351g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10352h;

    public final void a(int i6, int i10) {
        this.f10347c = i6;
        this.f10348d = i10;
        this.f10352h = true;
        if (this.f10351g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f10345a = i10;
            }
            if (i6 != Integer.MIN_VALUE) {
                this.f10346b = i6;
                return;
            }
            return;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f10345a = i6;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f10346b = i10;
        }
    }
}
