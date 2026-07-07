package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z0 extends lf.d {

    /* renamed from: a, reason: collision with root package name */
    public long f8042a;

    /* renamed from: b, reason: collision with root package name */
    public gf.k f8043b;

    @Override // lf.d
    public final boolean a(lf.b bVar) {
        x0 x0Var = (x0) bVar;
        if (this.f8042a >= 0) {
            return false;
        }
        long j = x0Var.F;
        if (j < x0Var.G) {
            x0Var.G = j;
        }
        this.f8042a = j;
        return true;
    }

    @Override // lf.d
    public final le.c[] b(lf.b bVar) {
        long j = this.f8042a;
        this.f8042a = -1L;
        this.f8043b = null;
        return ((x0) bVar).u(j);
    }
}
