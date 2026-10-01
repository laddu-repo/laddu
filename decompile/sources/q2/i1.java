package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i1 implements z0 {

    /* renamed from: x, reason: collision with root package name */
    public final z0 f10891x;

    /* renamed from: y, reason: collision with root package name */
    public final long f10892y;

    public i1(z0 z0Var, long j) {
        this.f10891x = z0Var;
        this.f10892y = j;
    }

    @Override // q2.z0
    public final void b() {
        this.f10891x.b();
    }

    @Override // q2.z0
    public final boolean isReady() {
        return this.f10891x.isReady();
    }

    @Override // q2.z0
    public final int j(long j) {
        return this.f10891x.j(j - this.f10892y);
    }

    @Override // q2.z0
    public final int n(j4.b0 b0Var, y1.h hVar, int i6) {
        int n10 = this.f10891x.n(b0Var, hVar, i6);
        if (n10 == -4) {
            hVar.B += this.f10892y;
        }
        return n10;
    }
}
