package n9;

import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p3 extends g0 {
    public com.google.android.gms.internal.measurement.h0 A;
    public boolean B;
    public final a2.a2 C;
    public final o3 D;
    public final j1.f0 E;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, n9.o3] */
    public p3(n1 n1Var) {
        super(n1Var);
        this.B = true;
        this.C = new a2.a2(this, 18);
        ?? obj = new Object();
        obj.A = this;
        n1 n1Var2 = (n1) this.f4301y;
        obj.f9423z = new n3(obj, n1Var2, 0);
        n1Var2.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        obj.f9421x = elapsedRealtime;
        obj.f9422y = elapsedRealtime;
        this.D = obj;
        this.E = new j1.f0(this);
    }

    @Override // n9.g0
    public final boolean g1() {
        return false;
    }

    public final void h1() {
        d1();
        if (this.A == null) {
            this.A = new com.google.android.gms.internal.measurement.h0(Looper.getMainLooper(), 0);
        }
    }
}
