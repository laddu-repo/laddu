package hb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final d0 f6018x;

    /* renamed from: y, reason: collision with root package name */
    public final x f6019y;

    public e(d0 d0Var, x xVar) {
        this.f6018x = d0Var;
        this.f6019y = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6018x.f6026x == this) {
            if (o.C.d(this.f6018x, this, o.h(this.f6019y))) {
                o.e(this.f6018x, false);
            }
        }
    }
}
