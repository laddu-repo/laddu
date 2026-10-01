package k8;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y9.z0 f7383a = y9.f0.s("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(com.google.android.gms.internal.measurement.h0 h0Var, y9.e1 e1Var, y9.e1 e1Var2, y9.m1 m1Var, char[] cArr, int i, int i10, int i11, String str, String str2, String str3, boolean z2, boolean z10) {
        z3 z3Var;
        char c10;
        int iC = c(h0Var);
        if (iC > 0 && (i10 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(h0Var, e1Var2) == com.google.android.gms.internal.measurement.i0.f2707w) {
            c10 = '3';
        } else {
            if (h0Var == com.google.android.gms.internal.measurement.h0.f2674w && i11 == 1 && m1Var.f14587y.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (e1Var.containsKey(h0Var) && (z3Var = (z3) e1Var.get(h0Var)) != null) {
                int iOrdinal = z3Var.ordinal();
                com.google.android.gms.internal.measurement.i0 i0Var = com.google.android.gms.internal.measurement.i0.f2709y;
                if (iOrdinal != 0) {
                    com.google.android.gms.internal.measurement.i0 i0Var2 = com.google.android.gms.internal.measurement.i0.f2708x;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(h0Var, e1Var2) == i0Var ? f(h0Var, cArr, str3, z10) : e(h0Var, cArr, str2, z2);
                        }
                        if (iOrdinal == 3) {
                            return g(h0Var, e1Var2) == i0Var2 ? e(h0Var, cArr, str2, z2) : f(h0Var, cArr, str3, z10);
                        }
                        c10 = '0';
                    } else if (g(h0Var, e1Var2) != i0Var2) {
                        return f(h0Var, cArr, str3, z10);
                    }
                } else if (g(h0Var, e1Var2) != i0Var) {
                    return e(h0Var, cArr, str2, z2);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c10;
        return false;
    }

    public static final int c(com.google.android.gms.internal.measurement.h0 h0Var) {
        if (h0Var == com.google.android.gms.internal.measurement.h0.f2674w) {
            return 1;
        }
        if (h0Var == com.google.android.gms.internal.measurement.h0.f2676y) {
            return 2;
        }
        if (h0Var == com.google.android.gms.internal.measurement.h0.f2677z) {
            return 3;
        }
        return h0Var == com.google.android.gms.internal.measurement.h0.A ? 4 : -1;
    }

    public static final String d(com.google.android.gms.internal.measurement.h0 h0Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < h0Var.a()) ? "0" : String.valueOf(str.charAt(h0Var.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= h0Var.a()) {
            strValueOf = String.valueOf(str2.charAt(h0Var.a() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(com.google.android.gms.internal.measurement.h0 h0Var, char[] cArr, String str, boolean z2) {
        char c10;
        int iC = c(h0Var);
        if (!z2) {
            c10 = '4';
        } else {
            if (str.length() >= h0Var.a()) {
                char cCharAt = str.charAt(h0Var.a() - 1);
                boolean z10 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z10;
            }
            c10 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c10;
        }
        return false;
    }

    public static final boolean f(com.google.android.gms.internal.measurement.h0 h0Var, char[] cArr, String str, boolean z2) {
        char c10;
        int iC = c(h0Var);
        if (!z2) {
            c10 = '5';
        } else {
            if (str.length() >= h0Var.a()) {
                char cCharAt = str.charAt(h0Var.a() - 1);
                boolean z10 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z10;
            }
            c10 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c10;
        }
        return false;
    }

    public static final com.google.android.gms.internal.measurement.i0 g(com.google.android.gms.internal.measurement.h0 h0Var, y9.e1 e1Var) {
        Object obj = e1Var.get(h0Var);
        if (obj == null) {
            obj = com.google.android.gms.internal.measurement.i0.f2710z;
        }
        return (com.google.android.gms.internal.measurement.i0) obj;
    }
}
