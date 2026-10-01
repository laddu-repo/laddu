package n9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends e3.e {
    public String A;
    public f B;
    public Boolean C;

    /* renamed from: z, reason: collision with root package name */
    public Boolean f9321z;

    public final boolean e1(String str) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(this.B.c0(str, "gaia_collection_enabled"));
    }

    public final boolean f1(String str) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(this.B.c0(str, "measurement.event_sampling_enabled"));
    }

    public final boolean g1() {
        if (this.f9321z == null) {
            Boolean p12 = p1("app_measurement_lite");
            this.f9321z = p12;
            if (p12 == null) {
                this.f9321z = Boolean.FALSE;
            }
        }
        if (!this.f9321z.booleanValue() && ((n1) this.f4301y).f9414y) {
            return false;
        }
        return true;
    }

    public final String h1(String str) {
        n1 n1Var = (n1) this.f4301y;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, HttpUrl.FRAGMENT_ENCODE_SET);
            w8.x.g(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.b(e10, "Could not find SystemProperties class");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (IllegalAccessException e11) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.D.b(e11, "Could not access SystemProperties.get()");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (NoSuchMethodException e12) {
            u0 u0Var3 = n1Var.C;
            n1.g(u0Var3);
            u0Var3.D.b(e12, "Could not find SystemProperties.get() method");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (InvocationTargetException e13) {
            u0 u0Var4 = n1Var.C;
            n1.g(u0Var4);
            u0Var4.D.b(e13, "SystemProperties.get() threw an exception");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public final void i1() {
        ((n1) this.f4301y).getClass();
    }

    public final String j1(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return (String) d0Var.a(null);
        }
        return (String) d0Var.a(this.B.c0(str, d0Var.f9209a));
    }

    public final long k1(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) d0Var.a(null)).longValue();
        }
        String c02 = this.B.c0(str, d0Var.f9209a);
        if (TextUtils.isEmpty(c02)) {
            return ((Long) d0Var.a(null)).longValue();
        }
        try {
            return ((Long) d0Var.a(Long.valueOf(Long.parseLong(c02)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) d0Var.a(null)).longValue();
        }
    }

    public final int l1(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) d0Var.a(null)).intValue();
        }
        String c02 = this.B.c0(str, d0Var.f9209a);
        if (TextUtils.isEmpty(c02)) {
            return ((Integer) d0Var.a(null)).intValue();
        }
        try {
            return ((Integer) d0Var.a(Integer.valueOf(Integer.parseInt(c02)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) d0Var.a(null)).intValue();
        }
    }

    public final double m1(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) d0Var.a(null)).doubleValue();
        }
        String c02 = this.B.c0(str, d0Var.f9209a);
        if (TextUtils.isEmpty(c02)) {
            return ((Double) d0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) d0Var.a(Double.valueOf(Double.parseDouble(c02)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) d0Var.a(null)).doubleValue();
        }
    }

    public final boolean n1(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) d0Var.a(null)).booleanValue();
        }
        String c02 = this.B.c0(str, d0Var.f9209a);
        if (TextUtils.isEmpty(c02)) {
            return ((Boolean) d0Var.a(null)).booleanValue();
        }
        return ((Boolean) d0Var.a(Boolean.valueOf(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(c02)))).booleanValue();
    }

    public final Bundle o1() {
        n1 n1Var = (n1) this.f4301y;
        try {
            Context context = n1Var.f9413x;
            Context context2 = n1Var.f9413x;
            u0 u0Var = n1Var.C;
            if (context.getPackageManager() == null) {
                n1.g(u0Var);
                u0Var.D.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a10 = c9.c.a(context2).a(128, context2.getPackageName());
            if (a10 == null) {
                n1.g(u0Var);
                u0Var.D.a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a10.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.D.b(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean p1(String str) {
        w8.x.d(str);
        Bundle o12 = o1();
        if (o12 == null) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.D.a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!o12.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(o12.getBoolean(str));
    }

    public final boolean q1() {
        ((n1) this.f4301y).getClass();
        Boolean p12 = p1("firebase_analytics_collection_deactivated");
        if (p12 != null && p12.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean r1() {
        Boolean p12 = p1("google_analytics_automatic_screen_reporting_enabled");
        if (p12 != null && !p12.booleanValue()) {
            return false;
        }
        return true;
    }

    public final w1 s1(String str, boolean z10) {
        Object obj;
        w8.x.d(str);
        n1 n1Var = (n1) this.f4301y;
        Bundle o12 = o1();
        if (o12 == null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = o12.get(str);
        }
        w1 w1Var = w1.UNINITIALIZED;
        if (obj == null) {
            return w1Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return w1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return w1.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return w1.POLICY;
        }
        u0 u0Var2 = n1Var.C;
        n1.g(u0Var2);
        u0Var2.G.b(str, "Invalid manifest metadata for");
        return w1Var;
    }
}
