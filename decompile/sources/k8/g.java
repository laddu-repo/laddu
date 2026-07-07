package k8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c3.e {
    public Boolean A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f7541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f7542y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f f7543z;

    public final boolean E(String str) {
        p1.j(((p1) this.f2053w).D);
        if (t4.g0((String) f0.f7499h1.a(null), str) || t4.g0((String) f0.f7501i1.a(null), str) || t4.g0((String) f0.f7504j1.a(null), str)) {
            return true;
        }
        return "1".equals(this.f7543z.b(str, "gaia_collection_enabled"));
    }

    public final boolean F(String str) {
        return "1".equals(this.f7543z.b(str, "measurement.event_sampling_enabled"));
    }

    public final boolean G() {
        if (this.f7541x == null) {
            Boolean boolQ = Q("app_measurement_lite");
            this.f7541x = boolQ;
            if (boolQ == null) {
                this.f7541x = Boolean.FALSE;
            }
        }
        return this.f7541x.booleanValue() || !((p1) this.f2053w).f7693w;
    }

    public final String H(String str) {
        p1 p1Var = (p1) this.f2053w;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            t7.y.g(str2);
            return str2;
        } catch (ClassNotFoundException e7) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.b(e7, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e10) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.B.b(e10, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e11) {
            v0 v0Var3 = p1Var.A;
            p1.l(v0Var3);
            v0Var3.B.b(e11, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e12) {
            v0 v0Var4 = p1Var.A;
            p1.l(v0Var4);
            v0Var4.B.b(e12, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int I(String str, boolean z2) {
        return Math.max(z2 ? Math.max(Math.min(M(str, f0.f7498h0), 500), 100) : 500, 256);
    }

    public final void J() {
        ((p1) this.f2053w).getClass();
    }

    public final String K(String str, e0 e0Var) {
        return TextUtils.isEmpty(str) ? (String) e0Var.a(null) : (String) e0Var.a(this.f7543z.b(str, e0Var.f7453a));
    }

    public final long L(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) e0Var.a(null)).longValue();
        }
        String strB = this.f7543z.b(str, e0Var.f7453a);
        if (TextUtils.isEmpty(strB)) {
            return ((Long) e0Var.a(null)).longValue();
        }
        try {
            return ((Long) e0Var.a(Long.valueOf(Long.parseLong(strB)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) e0Var.a(null)).longValue();
        }
    }

    public final int M(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) e0Var.a(null)).intValue();
        }
        String strB = this.f7543z.b(str, e0Var.f7453a);
        if (TextUtils.isEmpty(strB)) {
            return ((Integer) e0Var.a(null)).intValue();
        }
        try {
            return ((Integer) e0Var.a(Integer.valueOf(Integer.parseInt(strB)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) e0Var.a(null)).intValue();
        }
    }

    public final double N(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) e0Var.a(null)).doubleValue();
        }
        String strB = this.f7543z.b(str, e0Var.f7453a);
        if (TextUtils.isEmpty(strB)) {
            return ((Double) e0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) e0Var.a(Double.valueOf(Double.parseDouble(strB)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) e0Var.a(null)).doubleValue();
        }
    }

    public final boolean O(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) e0Var.a(null)).booleanValue();
        }
        String strB = this.f7543z.b(str, e0Var.f7453a);
        return TextUtils.isEmpty(strB) ? ((Boolean) e0Var.a(null)).booleanValue() : ((Boolean) e0Var.a(Boolean.valueOf("1".equals(strB)))).booleanValue();
    }

    public final Bundle P() {
        p1 p1Var = (p1) this.f2053w;
        try {
            Context context = p1Var.f7692v;
            Context context2 = p1Var.f7692v;
            v0 v0Var = p1Var.A;
            if (context.getPackageManager() == null) {
                p1.l(v0Var);
                v0Var.B.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoB = z7.c.a(context2).b(128, context2.getPackageName());
            if (applicationInfoB != null) {
                return applicationInfoB.metaData;
            }
            p1.l(v0Var);
            v0Var.B.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.B.b(e7, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean Q(String str) {
        t7.y.d(str);
        Bundle bundleP = P();
        if (bundleP != null) {
            if (bundleP.containsKey(str)) {
                return Boolean.valueOf(bundleP.getBoolean(str));
            }
            return null;
        }
        v0 v0Var = ((p1) this.f2053w).A;
        p1.l(v0Var);
        v0Var.B.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean R() {
        ((p1) this.f2053w).getClass();
        Boolean boolQ = Q("firebase_analytics_collection_deactivated");
        return boolQ != null && boolQ.booleanValue();
    }

    public final boolean S() {
        Boolean boolQ = Q("google_analytics_automatic_screen_reporting_enabled");
        return boolQ == null || boolQ.booleanValue();
    }

    public final a2 T(String str, boolean z2) {
        Object obj;
        t7.y.d(str);
        p1 p1Var = (p1) this.f2053w;
        Bundle bundleP = P();
        if (bundleP == null) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleP.get(str);
        }
        a2 a2Var = a2.f7373w;
        if (obj == null) {
            return a2Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return a2.f7376z;
        }
        if (Boolean.FALSE.equals(obj)) {
            return a2.f7375y;
        }
        if (z2 && "eu_consent_policy".equals(obj)) {
            return a2.f7374x;
        }
        v0 v0Var2 = p1Var.A;
        p1.l(v0Var2);
        v0Var2.E.b(str, "Invalid manifest metadata for");
        return a2Var;
    }
}
