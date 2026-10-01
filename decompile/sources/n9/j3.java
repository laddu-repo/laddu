package n9;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j3 extends z3 {
    public final HashMap B;
    public final a2.d2 C;
    public final a2.d2 D;
    public final a2.d2 E;
    public final a2.d2 F;
    public final a2.d2 G;
    public final a2.d2 H;

    public j3(e4 e4Var) {
        super(e4Var);
        this.B = new HashMap();
        c1 c1Var = ((n1) this.f4301y).B;
        n1.e(c1Var);
        this.C = new a2.d2(c1Var, "last_delete_stale", 0L);
        c1 c1Var2 = ((n1) this.f4301y).B;
        n1.e(c1Var2);
        this.D = new a2.d2(c1Var2, "last_delete_stale_batch", 0L);
        c1 c1Var3 = ((n1) this.f4301y).B;
        n1.e(c1Var3);
        this.E = new a2.d2(c1Var3, "backoff", 0L);
        c1 c1Var4 = ((n1) this.f4301y).B;
        n1.e(c1Var4);
        this.F = new a2.d2(c1Var4, "last_upload", 0L);
        c1 c1Var5 = ((n1) this.f4301y).B;
        n1.e(c1Var5);
        this.G = new a2.d2(c1Var5, "last_upload_attempt", 0L);
        c1 c1Var6 = ((n1) this.f4301y).B;
        n1.e(c1Var6);
        this.H = new a2.d2(c1Var6, "midnight_offset", 0L);
    }

    public final Pair h1(String str) {
        i3 i3Var;
        r8.a aVar;
        d1();
        n1 n1Var = (n1) this.f4301y;
        a9.a aVar2 = n1Var.H;
        g gVar = n1Var.A;
        aVar2.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.B;
        i3 i3Var2 = (i3) hashMap.get(str);
        if (i3Var2 != null && elapsedRealtime < i3Var2.f9353c) {
            return new Pair(i3Var2.f9351a, Boolean.valueOf(i3Var2.f9352b));
        }
        long k12 = gVar.k1(str, e0.f9229b) + elapsedRealtime;
        try {
            try {
                aVar = r8.b.a(n1Var.f9413x);
            } catch (PackageManager.NameNotFoundException unused) {
                if (i3Var2 != null && elapsedRealtime < i3Var2.f9353c + gVar.k1(str, e0.f9232c)) {
                    return new Pair(i3Var2.f9351a, Boolean.valueOf(i3Var2.f9352b));
                }
                aVar = null;
            }
        } catch (Exception e10) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.K.b(e10, "Unable to get advertising id");
            i3Var = new i3(k12, HttpUrl.FRAGMENT_ENCODE_SET, false);
        }
        if (aVar == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = aVar.f11870b;
        if (str2 != null) {
            i3Var = new i3(k12, str2, aVar.f11871c);
        } else {
            i3Var = new i3(k12, HttpUrl.FRAGMENT_ENCODE_SET, aVar.f11871c);
        }
        hashMap.put(str, i3Var);
        return new Pair(i3Var.f9351a, Boolean.valueOf(i3Var.f9352b));
    }

    public final String i1(String str, boolean z10) {
        String str2;
        d1();
        if (z10) {
            str2 = (String) h1(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest u12 = j4.u1();
        if (u12 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, u12.digest(str2.getBytes())));
    }

    @Override // n9.z3
    public final void g1() {
    }
}
