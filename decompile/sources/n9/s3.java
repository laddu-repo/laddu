package n9;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.t4;
import com.google.android.gms.internal.measurement.u4;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class s3 {

    /* renamed from: a, reason: collision with root package name */
    public static final db.c1 f9480a = db.k0.q("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
        } catch (ClassCastException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public static final boolean b(t4 t4Var, db.h1 h1Var, db.n0 n0Var, db.o1 o1Var, char[] cArr, int i6, int i10, int i11, String str, String str2, String str3, boolean z10, boolean z11) {
        r3 r3Var;
        char c10;
        int c11 = c(t4Var);
        if (c11 > 0 && (i10 != 1 || i6 != 1)) {
            cArr[c11] = '2';
        }
        if (g(t4Var, n0Var) == u4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            if (t4Var == t4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i11 == 1 && o1Var.A.equals(str)) {
                if (c11 > 0 && cArr[c11] != '2') {
                    cArr[c11] = '1';
                }
                return true;
            }
            if (h1Var.containsKey(t4Var) && (r3Var = (r3) h1Var.get(t4Var)) != null) {
                int ordinal = r3Var.ordinal();
                u4 u4Var = u4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    u4 u4Var2 = u4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (g(t4Var, n0Var) == u4Var2) {
                                    return e(t4Var, cArr, str2, z10);
                                }
                                return f(t4Var, cArr, str3, z11);
                            }
                        } else {
                            if (g(t4Var, n0Var) == u4Var) {
                                return f(t4Var, cArr, str3, z11);
                            }
                            return e(t4Var, cArr, str2, z10);
                        }
                    } else if (g(t4Var, n0Var) != u4Var2) {
                        return f(t4Var, cArr, str3, z11);
                    }
                } else if (g(t4Var, n0Var) != u4Var) {
                    return e(t4Var, cArr, str2, z10);
                }
                c10 = '8';
            }
            c10 = '0';
        }
        if (c11 > 0 && cArr[c11] != '2') {
            cArr[c11] = c10;
            return false;
        }
        return false;
    }

    public static final int c(t4 t4Var) {
        if (t4Var == t4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (t4Var == t4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (t4Var == t4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        if (t4Var == t4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE) {
            return 4;
        }
        return -1;
    }

    public static final String d(t4 t4Var, String str, String str2) {
        String str3;
        String str4 = "0";
        if (TextUtils.isEmpty(str) || str.length() < t4Var.b()) {
            str3 = "0";
        } else {
            str3 = String.valueOf(str.charAt(t4Var.b() - 1));
        }
        if (!TextUtils.isEmpty(str2) && str2.length() >= t4Var.b()) {
            str4 = String.valueOf(str2.charAt(t4Var.b() - 1));
        }
        return String.valueOf(str3).concat(String.valueOf(str4));
    }

    public static final boolean e(t4 t4Var, char[] cArr, String str, boolean z10) {
        char c10;
        int c11 = c(t4Var);
        boolean z11 = false;
        if (!z10) {
            c10 = '4';
        } else if (str.length() < t4Var.b()) {
            c10 = '0';
        } else {
            char charAt = str.charAt(t4Var.b() - 1);
            char c12 = '1';
            if (charAt == '1') {
                z11 = true;
            }
            if (c11 > 0 && cArr[c11] != '2') {
                if (charAt != '1') {
                    c12 = '6';
                }
                cArr[c11] = c12;
            }
            return z11;
        }
        if (c11 > 0 && cArr[c11] != '2') {
            cArr[c11] = c10;
        }
        return false;
    }

    public static final boolean f(t4 t4Var, char[] cArr, String str, boolean z10) {
        char c10;
        int c11 = c(t4Var);
        boolean z11 = false;
        if (!z10) {
            c10 = '5';
        } else if (str.length() < t4Var.b()) {
            c10 = '0';
        } else {
            char charAt = str.charAt(t4Var.b() - 1);
            char c12 = '1';
            if (charAt == '1') {
                z11 = true;
            }
            if (c11 > 0 && cArr[c11] != '2') {
                if (charAt != '1') {
                    c12 = '7';
                }
                cArr[c11] = c12;
            }
            return z11;
        }
        if (c11 > 0 && cArr[c11] != '2') {
            cArr[c11] = c10;
        }
        return false;
    }

    public static final u4 g(t4 t4Var, db.n0 n0Var) {
        Object obj = n0Var.get(t4Var);
        if (obj == null) {
            obj = u4.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (u4) obj;
    }
}
