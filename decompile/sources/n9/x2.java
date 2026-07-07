package n9;

import android.os.Bundle;
import android.os.SystemClock;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x2 extends g0 {
    public volatile u2 A;
    public volatile u2 B;
    public u2 C;
    public final ConcurrentHashMap D;
    public com.google.android.gms.internal.measurement.x0 E;
    public volatile boolean F;
    public volatile u2 G;
    public u2 H;
    public boolean I;
    public final Object J;

    public x2(n1 n1Var) {
        super(n1Var);
        this.J = new Object();
        this.D = new ConcurrentHashMap();
    }

    @Override // n9.g0
    public final boolean g1() {
        return false;
    }

    public final void h1(u2 u2Var, boolean z10, long j) {
        boolean z11;
        n1 n1Var = (n1) this.f4301y;
        b0 b0Var = n1Var.K;
        n1.d(b0Var);
        n1Var.H.getClass();
        b0Var.g1(SystemClock.elapsedRealtime());
        if (u2Var != null && u2Var.f9497d) {
            z11 = true;
        } else {
            z11 = false;
        }
        p3 p3Var = n1Var.E;
        n1.f(p3Var);
        if (p3Var.D.a(z11, z10, j) && u2Var != null) {
            u2Var.f9497d = false;
        }
    }

    public final u2 i1(com.google.android.gms.internal.measurement.x0 x0Var) {
        w8.x.g(x0Var);
        Integer valueOf = Integer.valueOf(x0Var.f2517x);
        ConcurrentHashMap concurrentHashMap = this.D;
        u2 u2Var = (u2) concurrentHashMap.get(valueOf);
        if (u2Var == null) {
            String k12 = k1(x0Var.f2518y);
            j4 j4Var = ((n1) this.f4301y).F;
            n1.e(j4Var);
            u2 u2Var2 = new u2(null, k12, j4Var.a2());
            concurrentHashMap.put(valueOf, u2Var2);
            u2Var = u2Var2;
        }
        if (this.G != null) {
            return this.G;
        }
        return u2Var;
    }

    public final u2 j1(boolean z10) {
        e1();
        d1();
        if (!z10) {
            return this.C;
        }
        u2 u2Var = this.C;
        if (u2Var != null) {
            return u2Var;
        }
        return this.H;
    }

    public final String k1(String str) {
        String str2;
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        n1 n1Var = (n1) this.f4301y;
        int length2 = str2.length();
        n1Var.A.getClass();
        if (length2 > 500) {
            n1Var.A.getClass();
            return str2.substring(0, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        }
        return str2;
    }

    public final void l1(com.google.android.gms.internal.measurement.x0 x0Var, Bundle bundle) {
        Bundle bundle2;
        if (((n1) this.f4301y).A.r1() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.D.put(Integer.valueOf(x0Var.f2517x), new u2(bundle2.getString(MediationMetaData.KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    public final void m1(String str, u2 u2Var, boolean z10) {
        u2 u2Var2;
        u2 u2Var3;
        String str2;
        if (this.A == null) {
            u2Var2 = this.B;
        } else {
            u2Var2 = this.A;
        }
        u2 u2Var4 = u2Var2;
        if (u2Var.f9495b == null) {
            if (str != null) {
                str2 = k1(str);
            } else {
                str2 = null;
            }
            u2Var3 = new u2(u2Var.f9494a, str2, u2Var.f9496c, u2Var.f9498e, u2Var.f9499f);
        } else {
            u2Var3 = u2Var;
        }
        this.B = this.A;
        this.A = u2Var3;
        n1 n1Var = (n1) this.f4301y;
        n1Var.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        l1Var.m1(new v2(this, u2Var3, u2Var4, elapsedRealtime, z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n1(n9.u2 r18, n9.u2 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.x2.n1(n9.u2, n9.u2, long, boolean, android.os.Bundle):void");
    }
}
