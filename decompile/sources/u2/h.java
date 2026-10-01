package u2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f12860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12861b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12862c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12863d;

    public h(int i6, int i10, int i11, int i12) {
        this.f12860a = i6;
        this.f12861b = i10;
        this.f12862c = i11;
        this.f12863d = i12;
    }

    public final boolean a(int i6) {
        if (i6 == 1) {
            if (this.f12860a - this.f12861b <= 1) {
                return false;
            }
        } else if (this.f12862c - this.f12863d <= 1) {
            return false;
        }
        return true;
    }
}
