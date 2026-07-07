package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends s {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f8718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8719y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public pd.h f8720z;

    public final void r0(boolean z2) {
        long j8 = this.f8718x - (z2 ? 4294967296L : 1L);
        this.f8718x = j8;
        if (j8 <= 0 && this.f8719y) {
            shutdown();
        }
    }

    public abstract Thread s0();

    public abstract void shutdown();

    public final void t0(boolean z2) {
        this.f8718x = (z2 ? 4294967296L : 1L) + this.f8718x;
        if (z2) {
            return;
        }
        this.f8719y = true;
    }

    public abstract long u0();

    public final boolean v0() {
        pd.h hVar = this.f8720z;
        if (hVar == null) {
            return false;
        }
        d0 d0Var = (d0) (hVar.isEmpty() ? null : hVar.removeFirst());
        if (d0Var == null) {
            return false;
        }
        d0Var.run();
        return true;
    }

    public void w0(long j8, l0 l0Var) {
        y.E.B0(j8, l0Var);
    }
}
