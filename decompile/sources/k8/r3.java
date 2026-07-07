package k8;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends h4 {
    public final c2.v1 A;
    public final c2.v1 B;
    public final c2.v1 C;
    public final c2.v1 D;
    public final c2.v1 E;
    public final c2.v1 F;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashMap f7736z;

    public r3(n4 n4Var) {
        super(n4Var);
        this.f7736z = new HashMap();
        d1 d1Var = ((p1) this.f2053w).f7696z;
        p1.j(d1Var);
        this.A = new c2.v1(d1Var, "last_delete_stale", 0L);
        d1 d1Var2 = ((p1) this.f2053w).f7696z;
        p1.j(d1Var2);
        this.B = new c2.v1(d1Var2, "last_delete_stale_batch", 0L);
        d1 d1Var3 = ((p1) this.f2053w).f7696z;
        p1.j(d1Var3);
        this.C = new c2.v1(d1Var3, "backoff", 0L);
        d1 d1Var4 = ((p1) this.f2053w).f7696z;
        p1.j(d1Var4);
        this.D = new c2.v1(d1Var4, "last_upload", 0L);
        d1 d1Var5 = ((p1) this.f2053w).f7696z;
        p1.j(d1Var5);
        this.E = new c2.v1(d1Var5, "last_upload_attempt", 0L);
        d1 d1Var6 = ((p1) this.f2053w).f7696z;
        p1.j(d1Var6);
        this.F = new c2.v1(d1Var6, "midnight_offset", 0L);
    }

    public final Pair H(v4 v4Var, d2 d2Var) {
        String str = v4Var.f7805v;
        t7.y.d(str);
        return (d2Var.i(c2.f7422w) && v4Var.I) ? I(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair I(String str) {
        q3 q3Var;
        l7.a aVarA;
        D();
        p1 p1Var = (p1) this.f2053w;
        x7.a aVar = p1Var.F;
        g gVar = p1Var.f7695y;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f7736z;
        q3 q3Var2 = (q3) map.get(str);
        if (q3Var2 != null && jElapsedRealtime < q3Var2.f7719c) {
            return new Pair(q3Var2.f7717a, Boolean.valueOf(q3Var2.f7718b));
        }
        long jL = gVar.L(str, f0.f7482b) + jElapsedRealtime;
        try {
            try {
                aVarA = l7.b.a(p1Var.f7692v);
            } catch (PackageManager.NameNotFoundException unused) {
                if (q3Var2 != null && jElapsedRealtime < q3Var2.f7719c + gVar.L(str, f0.f7485c)) {
                    return new Pair(q3Var2.f7717a, Boolean.valueOf(q3Var2.f7718b));
                }
                aVarA = null;
            }
        } catch (Exception e7) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.I.b(e7, "Unable to get advertising id");
            q3Var = new q3(jL, "", false);
        }
        if (aVarA == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = aVarA.f8301c;
        q3Var = str2 != null ? new q3(jL, str2, aVarA.f8300b) : new q3(jL, "", aVarA.f8300b);
        map.put(str, q3Var);
        return new Pair(q3Var.f7717a, Boolean.valueOf(q3Var.f7718b));
    }

    public final String J(v4 v4Var, d2 d2Var) {
        String str = v4Var.f7805v;
        t7.y.d(str);
        if (!d2Var.i(c2.f7422w) || !v4Var.I) {
            return "";
        }
        D();
        String str2 = (String) I(str).first;
        MessageDigest messageDigestW = t4.W();
        if (messageDigestW == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestW.digest(str2.getBytes())));
    }

    @Override // k8.h4
    public final void G() {
    }
}
