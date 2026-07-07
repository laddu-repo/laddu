package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e1 implements z0 {

    /* renamed from: x, reason: collision with root package name */
    public int f10868x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10869y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g1 f10870z;

    public e1(g1 g1Var) {
        this.f10870z = g1Var;
    }

    public final void a() {
        if (!this.f10869y) {
            g1 g1Var = this.f10870z;
            g1Var.B.h(r1.k0.i(g1Var.G.f11670n), g1Var.G, 0, null, 0L);
            this.f10869y = true;
        }
    }

    @Override // q2.z0
    public final void b() {
        g1 g1Var = this.f10870z;
        if (!g1Var.H) {
            g1Var.F.b();
        }
    }

    @Override // q2.z0
    public final boolean isReady() {
        return this.f10870z.I;
    }

    @Override // q2.z0
    public final int j(long j) {
        a();
        if (j > 0 && this.f10868x != 2) {
            this.f10868x = 2;
            return 1;
        }
        return 0;
    }

    @Override // q2.z0
    public final int n(j4.b0 b0Var, y1.h hVar, int i6) {
        a();
        g1 g1Var = this.f10870z;
        boolean z10 = g1Var.I;
        if (z10 && g1Var.J == null) {
            this.f10868x = 2;
        }
        int i10 = this.f10868x;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        }
        if ((i6 & 2) == 0 && i10 != 0) {
            if (!z10) {
                return -3;
            }
            g1Var.J.getClass();
            hVar.addFlag(1);
            hVar.B = 0L;
            if ((i6 & 4) == 0) {
                hVar.b(g1Var.K);
                hVar.f14812z.put(g1Var.J, 0, g1Var.K);
            }
            if ((i6 & 1) == 0) {
                this.f10868x = 2;
            }
            return -4;
        }
        b0Var.f7159y = g1Var.G;
        this.f10868x = 1;
        return -5;
    }
}
