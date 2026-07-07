package k8;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.t6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x3 extends h0 {
    public final g2 A;
    public final w3 B;
    public final sc.b C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public t6 f7841y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7842z;

    public x3(p1 p1Var) {
        super(p1Var);
        this.f7842z = true;
        this.A = new g2(1, this);
        w3 w3Var = new w3();
        w3Var.f7823y = this;
        p1 p1Var2 = (p1) this.f2053w;
        w3Var.f7822x = new v3(w3Var, p1Var2, 0);
        p1Var2.F.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        w3Var.f7820v = jElapsedRealtime;
        w3Var.f7821w = jElapsedRealtime;
        this.B = w3Var;
        this.C = new sc.b(24, this);
    }

    @Override // k8.h0
    public final boolean G() {
        return false;
    }

    public final void H() {
        D();
        if (this.f7841y == null) {
            this.f7841y = new t6(Looper.getMainLooper(), 0);
        }
    }
}
