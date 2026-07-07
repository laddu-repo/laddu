package n9;

import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9447a;

    public q3(Map map) {
        HashMap hashMap = new HashMap();
        this.f9447a = hashMap;
        hashMap.putAll(map);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        db.c1 c1Var = s3.f9480a;
        int i6 = c1Var.A;
        for (int i10 = 0; i10 < i6; i10++) {
            String str = (String) c1Var.get(i10);
            HashMap hashMap = this.f9447a;
            if (hashMap.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) hashMap.get(str));
            }
        }
        return sb2.toString();
    }

    public final Bundle b() {
        String str;
        String str2;
        d0 d0Var = e0.f9228a1;
        boolean booleanValue = ((Boolean) d0Var.a(null)).booleanValue();
        HashMap hashMap = this.f9447a;
        if (!booleanValue ? !(!UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("GoogleConsent")) || !UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("gdprApplies")) || !UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("EnableAdvertiserConsentMode"))) : !(!UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("gdprApplies")) || !UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("EnableAdvertiserConsentMode")))) {
            if (((Boolean) d0Var.a(null)).booleanValue()) {
                if (hashMap.get("Version") == null) {
                    return d();
                }
                if (e() >= 0) {
                    Bundle bundle = new Bundle();
                    String str3 = "granted";
                    if (true == Objects.equals(hashMap.get("AuthorizePurpose1"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
                        str = "granted";
                    } else {
                        str = "denied";
                    }
                    bundle.putString("ad_storage", str);
                    if (Objects.equals(hashMap.get("AuthorizePurpose3"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION) && Objects.equals(hashMap.get("AuthorizePurpose4"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
                        str2 = "granted";
                    } else {
                        str2 = "denied";
                    }
                    bundle.putString("ad_personalization", str2);
                    if (e() >= 4) {
                        if (!Objects.equals(hashMap.get("AuthorizePurpose1"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION) || !Objects.equals(hashMap.get("AuthorizePurpose7"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
                            str3 = "denied";
                        }
                        bundle.putString("ad_user_data", str3);
                    }
                    return bundle;
                }
            } else {
                return d();
            }
        }
        return Bundle.EMPTY;
    }

    public final String c() {
        int i6;
        HashMap hashMap = this.f9447a;
        StringBuilder sb2 = new StringBuilder(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        int i10 = -1;
        try {
            String str = (String) hashMap.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i10 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i10 >= 0 && i10 <= 4095) {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
        } else {
            sb2.append("00");
        }
        int e10 = e();
        if (e10 >= 0 && e10 <= 63) {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(e10));
        } else {
            sb2.append("0");
        }
        if (true != UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("gdprApplies"))) {
            i6 = 0;
        } else {
            i6 = 2;
        }
        int i11 = i6 | 4;
        if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            i11 = i6 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11));
        return sb2.toString();
    }

    public final Bundle d() {
        int e10;
        String str;
        String str2;
        HashMap hashMap = this.f9447a;
        if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(hashMap.get("GoogleConsent")) && (e10 = e()) >= 0) {
            String str3 = (String) hashMap.get("PurposeConsents");
            if (!TextUtils.isEmpty(str3)) {
                Bundle bundle = new Bundle();
                String str4 = "denied";
                if (str3.length() > 0) {
                    if (str3.charAt(0) != '1') {
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    bundle.putString("ad_storage", str2);
                }
                if (str3.length() > 3) {
                    if (str3.charAt(2) != '1' || str3.charAt(3) != '1') {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString("ad_personalization", str);
                }
                if (str3.length() > 6 && e10 >= 4) {
                    if (str3.charAt(0) == '1' && str3.charAt(6) == '1') {
                        str4 = "granted";
                    }
                    bundle.putString("ad_user_data", str4);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final int e() {
        try {
            String str = (String) this.f9447a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q3)) {
            return false;
        }
        return a().equalsIgnoreCase(((q3) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
