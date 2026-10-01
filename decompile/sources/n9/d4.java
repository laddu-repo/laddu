package n9;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final e4 f9220a;

    /* renamed from: b, reason: collision with root package name */
    public int f9221b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f9222c = a();

    public d4(e4 e4Var) {
        this.f9220a = e4Var;
    }

    public final long a() {
        e4 e4Var = this.f9220a;
        w8.x.g(e4Var);
        long longValue = ((Long) e0.f9275v.a(null)).longValue();
        long longValue2 = ((Long) e0.f9277w.a(null)).longValue();
        for (int i6 = 1; i6 < this.f9221b; i6++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        e4Var.D0().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
