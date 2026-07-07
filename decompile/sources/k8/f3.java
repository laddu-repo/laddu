package k8;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.j7;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends h0 {
    public c3 A;
    public final ConcurrentHashMap B;
    public j7 C;
    public volatile boolean D;
    public volatile c3 E;
    public c3 F;
    public boolean G;
    public final Object H;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile c3 f7538y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile c3 f7539z;

    public f3(p1 p1Var) {
        super(p1Var);
        this.H = new Object();
        this.B = new ConcurrentHashMap();
    }

    @Override // k8.h0
    public final boolean G() {
        return false;
    }

    public final c3 H(boolean z2) {
        E();
        D();
        if (!z2) {
            return this.A;
        }
        c3 c3Var = this.A;
        return c3Var != null ? c3Var : this.F;
    }

    public final String I(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        p1 p1Var = (p1) this.f2053w;
        int length2 = str2.length();
        p1Var.f7695y.getClass();
        if (length2 <= 500) {
            return str2;
        }
        p1Var.f7695y.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(k8.c3 r20, k8.c3 r21, long r22, boolean r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.f3.J(k8.c3, k8.c3, long, boolean, android.os.Bundle):void");
    }

    public final void K(j7 j7Var, Bundle bundle) {
        Bundle bundle2;
        if (!((p1) this.f2053w).f7695y.S() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.B.put(Integer.valueOf(j7Var.f2791v), new c3(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void L(String str, c3 c3Var, boolean z2) {
        c3 c3Var2;
        c3 c3Var3 = this.f7538y == null ? this.f7539z : this.f7538y;
        if (c3Var.f7428b == null) {
            c3Var2 = new c3(c3Var.f7427a, str != null ? I(str) : null, c3Var.f7429c, c3Var.f7431e, c3Var.f, c3Var.f7432g);
        } else {
            c3Var2 = c3Var;
        }
        this.f7539z = this.f7538y;
        this.f7538y = c3Var2;
        p1 p1Var = (p1) this.f2053w;
        p1Var.F.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        n1 n1Var = p1Var.B;
        p1.l(n1Var);
        n1Var.M(new d3(this, c3Var2, c3Var3, jElapsedRealtime, z2));
    }

    public final void M(c3 c3Var, boolean z2, long j8) {
        p1 p1Var = (p1) this.f2053w;
        y yVar = p1Var.I;
        p1.i(yVar);
        p1Var.F.getClass();
        yVar.G(SystemClock.elapsedRealtime());
        boolean z10 = c3Var != null && c3Var.f7430d;
        x3 x3Var = p1Var.C;
        p1.k(x3Var);
        if (!x3Var.B.a(j8, z10, z2) || c3Var == null) {
            return;
        }
        c3Var.f7430d = false;
    }

    public final c3 N(j7 j7Var) {
        t7.y.g(j7Var);
        Integer numValueOf = Integer.valueOf(j7Var.f2791v);
        ConcurrentHashMap concurrentHashMap = this.B;
        c3 c3Var = (c3) concurrentHashMap.get(numValueOf);
        if (c3Var == null) {
            String strI = I(j7Var.f2792w);
            t4 t4Var = ((p1) this.f2053w).D;
            p1.j(t4Var);
            c3 c3Var2 = new c3(t4Var.C0(), null, strI);
            concurrentHashMap.put(numValueOf, c3Var2);
            c3Var = c3Var2;
        }
        return this.E != null ? this.E : c3Var;
    }
}
