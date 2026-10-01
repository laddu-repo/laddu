package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class y0 extends y {
    public static final /* synthetic */ int B = 0;
    public ie.h A;

    /* renamed from: y, reason: collision with root package name */
    public long f5727y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5728z;

    @Override // gf.y
    public final y i0(int i6) {
        mf.a.a(1);
        return this;
    }

    public final void j0(boolean z10) {
        long j;
        long j10 = this.f5727y;
        if (z10) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j11 = j10 - j;
        this.f5727y = j11;
        if (j11 <= 0 && this.f5728z) {
            shutdown();
        }
    }

    public final void k0(m0 m0Var) {
        ie.h hVar = this.A;
        if (hVar == null) {
            hVar = new ie.h();
            this.A = hVar;
        }
        hVar.addLast(m0Var);
    }

    public abstract Thread l0();

    public final void m0(boolean z10) {
        long j;
        long j10 = this.f5727y;
        if (z10) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.f5727y = j + j10;
        if (!z10) {
            this.f5728z = true;
        }
    }

    public abstract long n0();

    public final boolean o0() {
        Object removeFirst;
        ie.h hVar = this.A;
        if (hVar != null) {
            if (hVar.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = hVar.removeFirst();
            }
            m0 m0Var = (m0) removeFirst;
            if (m0Var == null) {
                return false;
            }
            m0Var.run();
            return true;
        }
        return false;
    }

    public void p0(long j, v0 v0Var) {
        g0.F.t0(j, v0Var);
    }

    public abstract void shutdown();
}
