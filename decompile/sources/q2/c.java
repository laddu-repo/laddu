package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements z0 {

    /* renamed from: x, reason: collision with root package name */
    public final z0 f10831x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10832y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ d f10833z;

    public c(d dVar, z0 z0Var) {
        this.f10833z = dVar;
        this.f10831x = z0Var;
    }

    @Override // q2.z0
    public final void b() {
        this.f10831x.b();
    }

    @Override // q2.z0
    public final boolean isReady() {
        if (!this.f10833z.b() && this.f10831x.isReady()) {
            return true;
        }
        return false;
    }

    @Override // q2.z0
    public final int j(long j) {
        if (this.f10833z.b()) {
            return -3;
        }
        return this.f10831x.j(j);
    }

    @Override // q2.z0
    public final int n(j4.b0 b0Var, y1.h hVar, int i6) {
        d dVar = this.f10833z;
        if (dVar.b()) {
            return -3;
        }
        if (this.f10832y) {
            hVar.setFlags(4);
            return -4;
        }
        long r10 = dVar.r();
        int n10 = this.f10831x.n(b0Var, hVar, i6);
        if (n10 == -5) {
            r1.q qVar = (r1.q) b0Var.f7159y;
            qVar.getClass();
            int i10 = qVar.J;
            int i11 = qVar.I;
            if (i11 == 0 && i10 == 0) {
                return -5;
            }
            if (dVar.B != 0) {
                i11 = 0;
            }
            if (dVar.C != Long.MIN_VALUE) {
                i10 = 0;
            }
            r1.p a10 = qVar.a();
            a10.H = i11;
            a10.I = i10;
            b0Var.f7159y = new r1.q(a10);
            return -5;
        }
        long j = dVar.C;
        if (j != Long.MIN_VALUE && ((n10 == -4 && hVar.B >= j) || (n10 == -3 && r10 == Long.MIN_VALUE && !hVar.A))) {
            hVar.clear();
            hVar.setFlags(4);
            this.f10832y = true;
            return -4;
        }
        return n10;
    }
}
