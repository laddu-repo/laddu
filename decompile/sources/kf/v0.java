package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v0 implements gf.q0 {
    public final gf.k A;

    /* renamed from: x, reason: collision with root package name */
    public final x0 f8021x;

    /* renamed from: y, reason: collision with root package name */
    public final long f8022y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f8023z;

    public v0(x0 x0Var, long j, Object obj, gf.k kVar) {
        this.f8021x = x0Var;
        this.f8022y = j;
        this.f8023z = obj;
        this.A = kVar;
    }

    @Override // gf.q0
    public final void d() {
        x0 x0Var = this.f8021x;
        synchronized (x0Var) {
            if (this.f8022y < x0Var.n()) {
                return;
            }
            Object[] objArr = x0Var.E;
            kotlin.jvm.internal.k.b(objArr);
            long j = this.f8022y;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            y0.f(objArr, j, y0.f8036a);
            x0Var.g();
        }
    }
}
