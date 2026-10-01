package n9;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.t4;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.u4;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m2 extends g0 {
    public ic.i A;
    public j1.f0 B;
    public final CopyOnWriteArraySet C;
    public boolean D;
    public final AtomicReference E;
    public final Object F;
    public boolean G;
    public int H;
    public d2 I;
    public d2 J;
    public PriorityQueue K;
    public boolean L;
    public z1 M;
    public final AtomicLong N;
    public long O;
    public final u5.r P;
    public boolean Q;
    public d2 R;
    public l2 S;
    public d2 T;
    public final lc.c U;

    public m2(n1 n1Var) {
        super(n1Var);
        this.C = new CopyOnWriteArraySet();
        this.F = new Object();
        this.G = false;
        this.H = 1;
        this.Q = true;
        this.U = new lc.c(this);
        this.E = new AtomicReference();
        this.M = z1.f9569c;
        this.O = -1L;
        this.N = new AtomicLong(0L);
        this.P = new u5.r(n1Var, 19);
    }

    public final PriorityQueue A1() {
        Comparator comparing;
        if (this.K == null) {
            k2 k2Var = k2.f9373a;
            comparing = Comparator.comparing(k2.f9373a, cg.h.f2120y);
            this.K = j2.e.q(comparing);
        }
        return this.K;
    }

    public final void B1() {
        t3 t3Var;
        d1();
        this.L = false;
        if (!A1().isEmpty() && !this.G && (t3Var = (t3) A1().poll()) != null) {
            n1 n1Var = (n1) this.f4301y;
            j4 j4Var = n1Var.F;
            n1.e(j4Var);
            s4.a y12 = j4Var.y1();
            if (y12 != null) {
                this.G = true;
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                s0 s0Var = u0Var.L;
                String str = t3Var.f9489x;
                s0Var.b(str, "Registering trigger URI");
                hb.x e10 = y12.e(Uri.parse(str));
                if (e10 == null) {
                    this.G = false;
                    A1().add(t3Var);
                } else {
                    e10.a(new hb.s(0, e10, new j1.f0(this, t3Var, 16, false)), new g8.p(this, 2));
                }
            }
        }
    }

    @Override // n9.g0
    public final boolean g1() {
        return false;
    }

    public final void h1(z1 z1Var) {
        boolean z10;
        Boolean bool;
        d1();
        if ((z1Var.i(y1.ANALYTICS_STORAGE) && z1Var.i(y1.AD_STORAGE)) || ((n1) this.f4301y).j().m1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1 n1Var = (n1) this.f4301y;
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        l1Var.d1();
        if (z10 != n1Var.W) {
            l1 l1Var2 = n1Var.D;
            n1.g(l1Var2);
            l1Var2.d1();
            n1Var.W = z10;
            c1 c1Var = ((n1) this.f4301y).B;
            n1.e(c1Var);
            c1Var.d1();
            if (c1Var.h1().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(c1Var.h1().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z10 || bool == null || bool.booleanValue()) {
                t1(Boolean.valueOf(z10), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i1(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.m2.i1(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void j1() {
        u0 u0Var;
        String str;
        int i6;
        int i10;
        int i11;
        int i12;
        q3 q3Var;
        q3 q3Var2;
        m2 m2Var;
        String str2;
        String str3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        u4 u4Var;
        boolean z10;
        boolean z11;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int b10;
        int b11;
        int b12;
        int b13;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        db.n0 c10;
        u4 u4Var2;
        d1();
        n1 n1Var = (n1) this.f4301y;
        u0 u0Var2 = n1Var.C;
        a9.a aVar = n1Var.H;
        n1.g(u0Var2);
        u0Var2.K.a("Handle tcf update.");
        c1 c1Var = n1Var.B;
        n1.e(c1Var);
        SharedPreferences i19 = c1Var.i1();
        HashMap hashMap = new HashMap();
        d0 d0Var = e0.f9228a1;
        if (((Boolean) d0Var.a(null)).booleanValue()) {
            db.c1 c1Var2 = s3.f9480a;
            t4 t4Var = t4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            u0Var = u0Var2;
            r3 r3Var = r3.f9456x;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(t4Var, r3Var);
            t4 t4Var2 = t4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            r3 r3Var2 = r3.f9457y;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(t4Var2, r3Var2);
            t4 t4Var3 = t4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(t4Var3, r3Var);
            t4 t4Var4 = t4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(t4Var4, r3Var);
            t4 t4Var5 = t4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List asList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(t4Var5, r3Var2), new AbstractMap.SimpleImmutableEntry(t4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, r3Var2), new AbstractMap.SimpleImmutableEntry(t4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, r3Var2));
            if (r4.a.w(asList)) {
                i13 = asList.size();
            } else {
                i13 = 4;
            }
            b2.k kVar = new b2.k(i13);
            kVar.x(asList);
            db.h1 h1Var = (db.h1) kVar.c();
            int i20 = db.p0.f4027z;
            db.o1 o1Var = new db.o1("CH");
            char[] cArr = new char[5];
            boolean contains = i19.contains(AndroidTcfDataSource.TCF_TCSTRING_KEY);
            try {
                i14 = i19.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i14 = -1;
            }
            try {
                i15 = i19.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused2) {
                i15 = -1;
            }
            try {
                i16 = i19.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused3) {
                i16 = -1;
            }
            int i21 = i15;
            try {
                i17 = i19.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused4) {
                i17 = -1;
            }
            try {
                i18 = i19.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused5) {
                i18 = -1;
            }
            String a10 = s3.a(i19, "IABTCF_PublisherCC");
            int i22 = i14;
            b2.k kVar2 = new b2.k(4);
            db.q1 it = h1Var.keySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                db.q1 q1Var = it;
                u4Var = u4.PURPOSE_RESTRICTION_UNDEFINED;
                if (!hasNext) {
                    break;
                }
                t4 t4Var6 = (t4) q1Var.next();
                char[] cArr2 = cArr;
                int b14 = t4Var6.b();
                String str4 = a10;
                int i23 = i17;
                StringBuilder sb2 = new StringBuilder(String.valueOf(b14).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(b14);
                String a11 = s3.a(i19, sb2.toString());
                if (!TextUtils.isEmpty(a11) && a11.length() >= 755) {
                    int digit = Character.digit(a11.charAt(754), 10);
                    u4Var2 = u4.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    if (digit >= 0 && digit <= u4.values().length && digit != 0) {
                        if (digit != 1) {
                            if (digit == 2) {
                                u4Var = u4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                            }
                        } else {
                            u4Var = u4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                        }
                    }
                    kVar2.u(t4Var6, u4Var2);
                    it = q1Var;
                    cArr = cArr2;
                    i17 = i23;
                    a10 = str4;
                }
                u4Var2 = u4Var;
                kVar2.u(t4Var6, u4Var2);
                it = q1Var;
                cArr = cArr2;
                i17 = i23;
                a10 = str4;
            }
            int i24 = i17;
            String str5 = a10;
            char[] cArr3 = cArr;
            db.n0 c11 = kVar2.c();
            String a12 = s3.a(i19, "IABTCF_PurposeConsents");
            String a13 = s3.a(i19, "IABTCF_VendorConsents");
            if (!TextUtils.isEmpty(a13) && a13.length() >= 755 && a13.charAt(754) == '1') {
                z10 = true;
            } else {
                z10 = false;
            }
            String a14 = s3.a(i19, "IABTCF_PurposeLegitimateInterests");
            String a15 = s3.a(i19, "IABTCF_VendorLegitimateInterests");
            if (!TextUtils.isEmpty(a15) && a15.length() >= 755 && a15.charAt(754) == '1') {
                z11 = true;
            } else {
                z11 = false;
            }
            cArr3[0] = '2';
            if (((Boolean) e0.f9231b1.a(null)).booleanValue() && !contains) {
                c10 = db.h1.D;
            } else {
                u4 u4Var3 = (u4) c11.get(t4Var);
                u4 u4Var4 = (u4) c11.get(t4Var3);
                u4 u4Var5 = (u4) c11.get(t4Var4);
                u4 u4Var6 = (u4) c11.get(t4Var5);
                b2.k kVar3 = new b2.k(4);
                kVar3.u("Version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                if (true != z10) {
                    obj = "0";
                } else {
                    obj = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                boolean z12 = z10;
                kVar3.u("VendorConsent", obj);
                if (true != z11) {
                    obj2 = "0";
                } else {
                    obj2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                boolean z13 = z11;
                kVar3.u("VendorLegitimateInterest", obj2);
                if (i16 != 1) {
                    obj3 = "0";
                } else {
                    obj3 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                kVar3.u("gdprApplies", obj3);
                if (i18 != 1) {
                    obj4 = "0";
                } else {
                    obj4 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                kVar3.u("EnableAdvertiserConsentMode", obj4);
                kVar3.u("PolicyVersion", String.valueOf(i21));
                kVar3.u("CmpSdkID", String.valueOf(i22));
                if (i24 != 1) {
                    obj5 = "0";
                } else {
                    obj5 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                kVar3.u("PurposeOneTreatment", obj5);
                kVar3.u("PublisherCC", str5);
                if (u4Var3 != null) {
                    b10 = u4Var3.b();
                } else {
                    b10 = u4Var.b();
                }
                kVar3.u("PublisherRestrictions1", String.valueOf(b10));
                if (u4Var4 != null) {
                    b11 = u4Var4.b();
                } else {
                    b11 = u4Var.b();
                }
                kVar3.u("PublisherRestrictions3", String.valueOf(b11));
                if (u4Var5 != null) {
                    b12 = u4Var5.b();
                } else {
                    b12 = u4Var.b();
                }
                kVar3.u("PublisherRestrictions4", String.valueOf(b12));
                if (u4Var6 != null) {
                    b13 = u4Var6.b();
                } else {
                    b13 = u4Var.b();
                }
                kVar3.u("PublisherRestrictions7", String.valueOf(b13));
                String d10 = s3.d(t4Var, a12, a14);
                String d11 = s3.d(t4Var3, a12, a14);
                String d12 = s3.d(t4Var4, a12, a14);
                String d13 = s3.d(t4Var5, a12, a14);
                int i25 = i18;
                db.r.d("Purpose1", d10);
                db.r.d("Purpose3", d11);
                db.r.d("Purpose4", d12);
                db.r.d("Purpose7", d13);
                b2.k v10 = kVar3.v(db.h1.g(4, new Object[]{"Purpose1", d10, "Purpose3", d11, "Purpose4", d12, "Purpose7", d13}, null));
                int i26 = i16;
                if (true != s3.b(t4Var, h1Var, c11, o1Var, cArr3, i25, i26, i24, str5, a12, a14, z12, z13)) {
                    obj6 = "0";
                } else {
                    obj6 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                if (true != s3.b(t4Var3, h1Var, c11, o1Var, cArr3, i25, i26, i24, str5, a12, a14, z12, z13)) {
                    obj7 = "0";
                } else {
                    obj7 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                if (true != s3.b(t4Var4, h1Var, c11, o1Var, cArr3, i25, i26, i24, str5, a12, a14, z12, z13)) {
                    obj8 = "0";
                } else {
                    obj8 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                if (true != s3.b(t4Var5, h1Var, c11, o1Var, cArr3, i25, i26, i24, str5, a12, a14, z12, z13)) {
                    obj9 = "0";
                } else {
                    obj9 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                c10 = v10.v(db.h1.g(5, new Object[]{"AuthorizePurpose1", obj6, "AuthorizePurpose3", obj7, "AuthorizePurpose4", obj8, "AuthorizePurpose7", obj9, "PurposeDiagnostics", new String(cArr3)}, null)).c();
            }
            q3Var = new q3(c10);
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            u0Var = u0Var2;
            String a16 = s3.a(i19, "IABTCF_VendorConsents");
            str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (!str.equals(a16) && a16.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(a16.charAt(754)));
            }
            try {
                i6 = i19.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i6 = -1;
            }
            if (i6 != -1) {
                hashMap.put("gdprApplies", String.valueOf(i6));
            }
            try {
                i10 = i19.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i10 = -1;
            }
            if (i10 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(i10));
            }
            try {
                i11 = i19.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i11 = -1;
            }
            if (i11 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(i11));
            }
            String a17 = s3.a(i19, "IABTCF_PurposeConsents");
            if (!str.equals(a17)) {
                hashMap.put("PurposeConsents", a17);
            }
            try {
                i12 = i19.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i12 = -1;
            }
            if (i12 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(i12));
            }
            q3Var = new q3(hashMap);
        }
        n1.g(u0Var);
        u0 u0Var3 = u0Var;
        s0 s0Var = u0Var3.L;
        s0Var.b(q3Var, "Tcf preferences read");
        if (n1Var.A.n1(null, d0Var)) {
            c1Var.d1();
            String string = c1Var.h1().getString("stored_tcf_param", str);
            HashMap hashMap2 = new HashMap();
            if (TextUtils.isEmpty(string)) {
                q3Var2 = new q3(hashMap2);
            } else {
                for (String str6 : string.split(";")) {
                    String[] split = str6.split("=");
                    if (split.length >= 2 && s3.f9480a.contains(split[0])) {
                        hashMap2.put(split[0], split[1]);
                    }
                }
                q3Var2 = new q3(hashMap2);
            }
            if (c1Var.l1(q3Var)) {
                Bundle b15 = q3Var.b();
                n1.g(u0Var3);
                s0Var.b(b15, "Consent generated from Tcf");
                if (b15 != Bundle.EMPTY) {
                    aVar.getClass();
                    m2Var = this;
                    m2Var.w1(b15, -30, System.currentTimeMillis());
                } else {
                    m2Var = this;
                }
                Bundle bundle = new Bundle();
                HashMap hashMap3 = q3Var2.f9447a;
                if (hashMap3.isEmpty() || ((String) hashMap3.get("Version")) != null) {
                    str2 = "0";
                } else {
                    str2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                Bundle b16 = q3Var.b();
                Bundle b17 = q3Var2.b();
                if (b16.size() == b17.size() && Objects.equals(b16.getString("ad_storage"), b17.getString("ad_storage")) && Objects.equals(b16.getString("ad_personalization"), b17.getString("ad_personalization")) && Objects.equals(b16.getString("ad_user_data"), b17.getString("ad_user_data"))) {
                    str3 = "0";
                } else {
                    str3 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
                bundle.putString("_tcfm", str2.concat(str3));
                String str7 = (String) q3Var.f9447a.get("PurposeDiagnostics");
                if (TextUtils.isEmpty(str7)) {
                    str7 = "200000";
                }
                bundle.putString("_tcfd2", str7);
                bundle.putString("_tcfd", q3Var.c());
                m2Var.k1("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        if (c1Var.l1(q3Var)) {
            Bundle b18 = q3Var.b();
            n1.g(u0Var3);
            s0Var.b(b18, "Consent generated from Tcf");
            if (b18 != Bundle.EMPTY) {
                aVar.getClass();
                w1(b18, -30, System.currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfd", q3Var.c());
            k1("auto", "_tcf", bundle2);
        }
    }

    public final void k1(String str, String str2, Bundle bundle) {
        d1();
        ((n1) this.f4301y).H.getClass();
        l1(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void l1(long j, Bundle bundle, String str, String str2) {
        boolean z10;
        d1();
        if (this.B == null || j4.C1(str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        m1(str, str2, j, bundle, true, z10, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0525 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1(java.lang.String r30, java.lang.String r31, long r32, android.os.Bundle r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.m2.m1(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    public final void n1(String str, String str2, Object obj, boolean z10, long j) {
        int i6;
        String str3;
        n1 n1Var = (n1) this.f4301y;
        int i10 = 0;
        if (z10) {
            j4 j4Var = n1Var.F;
            n1.e(j4Var);
            i6 = j4Var.j2(str2);
        } else {
            j4 j4Var2 = n1Var.F;
            n1.e(j4Var2);
            if (j4Var2.e2("user property", str2)) {
                if (!j4Var2.g2("user property", a2.f9165i, null, str2)) {
                    i6 = 15;
                } else {
                    ((n1) j4Var2.f4301y).getClass();
                    if (j4Var2.h2(24, "user property", str2)) {
                        i6 = 0;
                    }
                }
            }
            i6 = 6;
        }
        lc.c cVar = this.U;
        if (i6 != 0) {
            n1.e(n1Var.F);
            String i12 = j4.i1(str2, true, 24);
            if (str2 != null) {
                i10 = str2.length();
            }
            n1.e(n1Var.F);
            j4.t1(cVar, null, i6, "_ev", i12, i10);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            j4 j4Var3 = n1Var.F;
            n1.e(j4Var3);
            int q12 = j4Var3.q1(obj, str2);
            if (q12 != 0) {
                n1.e(j4Var3);
                String i13 = j4.i1(str2, true, 24);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i10 = obj.toString().length();
                }
                n1.e(n1Var.F);
                j4.t1(cVar, null, q12, "_ev", i13, i10);
                return;
            }
            n1.e(j4Var3);
            Object r12 = j4Var3.r1(obj, str2);
            if (r12 != null) {
                l1 l1Var = n1Var.D;
                n1.g(l1Var);
                l1Var.m1(new q1(this, str3, str2, r12, j, 1));
                return;
            }
            return;
        }
        l1 l1Var2 = n1Var.D;
        n1.g(l1Var2);
        l1Var2.m1(new q1(this, str3, str2, null, j, 1));
    }

    public final void o1(long j, Object obj, String str, String str2) {
        String str3;
        boolean k12;
        long j10;
        Object obj2 = obj;
        n1 n1Var = (n1) this.f4301y;
        w8.x.d(str);
        w8.x.d(str2);
        d1();
        e1();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    String lowerCase = str5.toLowerCase(Locale.ENGLISH);
                    String str6 = "false";
                    if (true != "false".equals(lowerCase)) {
                        j10 = 0;
                    } else {
                        j10 = 1;
                    }
                    obj2 = Long.valueOf(j10);
                    c1 c1Var = n1Var.B;
                    n1.e(c1Var);
                    a2.c cVar = c1Var.K;
                    if (j10 == 1) {
                        str6 = "true";
                    }
                    cVar.m(str6);
                    u0 u0Var = n1Var.C;
                    n1.g(u0Var);
                    u0Var.L.c("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                c1 c1Var2 = n1Var.B;
                n1.e(c1Var2);
                c1Var2.K.m("unset");
            } else {
                str4 = str2;
            }
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.L.c("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!n1Var.a()) {
            u0 u0Var3 = n1Var.C;
            n1.g(u0Var3);
            u0Var3.L.a("User property not set since app measurement is disabled");
            return;
        }
        if (!n1Var.c()) {
            return;
        }
        g4 g4Var = new g4(j, obj3, str3, str);
        h3 j11 = n1Var.j();
        j11.d1();
        j11.e1();
        j11.p1();
        o0 i6 = ((n1) j11.f4301y).i();
        i6.getClass();
        Parcel obtain = Parcel.obtain();
        kd.g0.b(g4Var, obtain);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            u0 u0Var4 = ((n1) i6.f4301y).C;
            n1.g(u0Var4);
            u0Var4.E.a("User property too long for local database. Sending directly to service");
            k12 = false;
        } else {
            k12 = i6.k1(1, marshall);
        }
        j11.r1(new b3(j11, j11.t1(true), k12, g4Var, 0));
    }

    public final void p1() {
        d1();
        e1();
        n1 n1Var = (n1) this.f4301y;
        if (n1Var.c()) {
            g gVar = n1Var.A;
            ((n1) gVar.f4301y).getClass();
            Boolean p12 = gVar.p1("google_analytics_deferred_deep_link_enabled");
            if (p12 != null && p12.booleanValue()) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.K.a("Deferred Deep Link feature enabled.");
                l1 l1Var = n1Var.D;
                n1.g(l1Var);
                l1Var.m1(new c2(this, 2));
            }
            h3 j = n1Var.j();
            j.d1();
            j.e1();
            l4 t12 = j.t1(true);
            j.p1();
            n1 n1Var2 = (n1) j.f4301y;
            n1Var2.A.n1(null, e0.f9236d1);
            n1Var2.i().k1(3, new byte[0]);
            j.r1(new c3(j, t12, 1));
            this.Q = false;
            c1 c1Var = n1Var.B;
            n1.e(c1Var);
            c1Var.d1();
            String string = c1Var.h1().getString("previous_os_version", null);
            ((n1) c1Var.f4301y).k().f1();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = c1Var.h1().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                n1Var.k().f1();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    k1("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void q1(Bundle bundle, long j) {
        n1 n1Var = (n1) this.f4301y;
        w8.x.g(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.G.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        a2.e(bundle2, "app_id", String.class, null);
        a2.e(bundle2, "origin", String.class, null);
        a2.e(bundle2, MediationMetaData.KEY_NAME, String.class, null);
        a2.e(bundle2, "value", Object.class, null);
        a2.e(bundle2, "trigger_event_name", String.class, null);
        a2.e(bundle2, "trigger_timeout", Long.class, 0L);
        a2.e(bundle2, "timed_out_event_name", String.class, null);
        a2.e(bundle2, "timed_out_event_params", Bundle.class, null);
        a2.e(bundle2, "triggered_event_name", String.class, null);
        a2.e(bundle2, "triggered_event_params", Bundle.class, null);
        a2.e(bundle2, "time_to_live", Long.class, 0L);
        a2.e(bundle2, "expired_event_name", String.class, null);
        a2.e(bundle2, "expired_event_params", Bundle.class, null);
        w8.x.d(bundle2.getString(MediationMetaData.KEY_NAME));
        w8.x.d(bundle2.getString("origin"));
        w8.x.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(MediationMetaData.KEY_NAME);
        Object obj = bundle2.get("value");
        j4 j4Var = n1Var.F;
        p0 p0Var = n1Var.G;
        u0 u0Var2 = n1Var.C;
        n1.e(j4Var);
        if (j4Var.j2(string) == 0) {
            n1.e(j4Var);
            if (j4Var.q1(obj, string) == 0) {
                Object r12 = j4Var.r1(obj, string);
                if (r12 == null) {
                    n1.g(u0Var2);
                    u0Var2.D.c(p0Var.c(string), obj, "Unable to normalize conditional user property value");
                    return;
                }
                a2.c(bundle2, r12);
                long j10 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j10 > 15552000000L || j10 < 1)) {
                    n1.g(u0Var2);
                    u0Var2.D.c(p0Var.c(string), Long.valueOf(j10), "Invalid conditional user property timeout");
                    return;
                }
                long j11 = bundle2.getLong("time_to_live");
                if (j11 <= 15552000000L && j11 >= 1) {
                    l1 l1Var = n1Var.D;
                    n1.g(l1Var);
                    l1Var.m1(new i2(this, bundle2, 0));
                    return;
                } else {
                    n1.g(u0Var2);
                    u0Var2.D.c(p0Var.c(string), Long.valueOf(j11), "Invalid conditional user property time to live");
                    return;
                }
            }
            n1.g(u0Var2);
            u0Var2.D.c(p0Var.c(string), obj, "Invalid conditional user property value");
            return;
        }
        n1.g(u0Var2);
        u0Var2.D.b(p0Var.c(string), "Invalid conditional user property name");
    }

    public final void r1(String str, String str2, Bundle bundle) {
        n1 n1Var = (n1) this.f4301y;
        n1Var.H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        w8.x.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        l1Var.m1(new i2(this, bundle2, 1));
    }

    public final void s1(z1 z1Var, long j, boolean z10) {
        int i6 = z1Var.f9571b;
        d1();
        e1();
        n1 n1Var = (n1) this.f4301y;
        c1 c1Var = n1Var.B;
        u0 u0Var = n1Var.C;
        n1.e(c1Var);
        z1 k12 = c1Var.k1();
        if (j <= this.O && z1.l(k12.f9571b, i6)) {
            n1.g(u0Var);
            u0Var.J.b(z1Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        c1 c1Var2 = n1Var.B;
        n1.e(c1Var2);
        c1Var2.d1();
        if (z1.l(i6, c1Var2.h1().getInt("consent_source", 100))) {
            SharedPreferences.Editor edit = c1Var2.h1().edit();
            edit.putString("consent_settings", z1Var.g());
            edit.putInt("consent_source", i6);
            edit.apply();
            n1.g(u0Var);
            u0Var.L.b(z1Var, "Setting storage consent(FE)");
            this.O = j;
            if (n1Var.j().n1()) {
                h3 j10 = n1Var.j();
                j10.d1();
                j10.e1();
                j10.r1(new f3(j10, 2));
            } else {
                h3 j11 = n1Var.j();
                j11.d1();
                j11.e1();
                if (j11.m1()) {
                    j11.r1(new c3(j11, j11.t1(false)));
                }
            }
            if (z10) {
                n1Var.j().h1(new AtomicReference());
                return;
            }
            return;
        }
        n1.g(u0Var);
        u0Var.J.b(Integer.valueOf(i6), "Lower precedence consent source ignored, proposed source");
    }

    public final void t1(Boolean bool, boolean z10) {
        d1();
        e1();
        n1 n1Var = (n1) this.f4301y;
        u0 u0Var = n1Var.C;
        n1.g(u0Var);
        u0Var.K.b(bool, "Setting app measurement enabled (FE)");
        c1 c1Var = n1Var.B;
        n1.e(c1Var);
        c1Var.d1();
        SharedPreferences.Editor edit = c1Var.h1().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z10) {
            c1Var.d1();
            SharedPreferences.Editor edit2 = c1Var.h1().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        l1Var.d1();
        if (!n1Var.W && (bool == null || bool.booleanValue())) {
            return;
        }
        u1();
    }

    public final void u1() {
        long j;
        d1();
        n1 n1Var = (n1) this.f4301y;
        c1 c1Var = n1Var.B;
        u0 u0Var = n1Var.C;
        a9.a aVar = n1Var.H;
        n1.e(c1Var);
        String l10 = c1Var.K.l();
        if (l10 != null) {
            if ("unset".equals(l10)) {
                aVar.getClass();
                o1(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                if (true != "true".equals(l10)) {
                    j = 0;
                } else {
                    j = 1;
                }
                Long valueOf = Long.valueOf(j);
                aVar.getClass();
                o1(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (n1Var.a() && this.Q) {
            n1.g(u0Var);
            u0Var.K.a("Recording app launch after enabling measurement for the first time (FE)");
            p1();
            p3 p3Var = n1Var.E;
            n1.f(p3Var);
            p3Var.C.T();
            l1 l1Var = n1Var.D;
            n1.g(l1Var);
            l1Var.m1(new c2(this, 1));
            return;
        }
        n1.g(u0Var);
        u0Var.K.a("Updating Scion state (FE)");
        h3 j10 = n1Var.j();
        j10.d1();
        j10.e1();
        j10.r1(new c3(j10, j10.t1(true), 3));
    }

    public final void v1() {
        n1 n1Var = (n1) this.f4301y;
        if ((n1Var.f9413x.getApplicationContext() instanceof Application) && this.A != null) {
            ((Application) n1Var.f9413x.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.A);
        }
    }

    public final void w1(Bundle bundle, int i6, long j) {
        Boolean bool;
        String str;
        w1 w1Var;
        String str2;
        Boolean bool2;
        n1 n1Var = (n1) this.f4301y;
        e1();
        z1 z1Var = z1.f9569c;
        y1[] y1VarArr = x1.STORAGE.f9528x;
        int length = y1VarArr.length;
        int i10 = 0;
        while (true) {
            bool = null;
            if (i10 < length) {
                String str3 = y1VarArr[i10].f9536x;
                if (bundle.containsKey(str3) && (str = bundle.getString(str3)) != null) {
                    if (str.equals("granted")) {
                        bool2 = Boolean.TRUE;
                    } else if (str.equals("denied")) {
                        bool2 = Boolean.FALSE;
                    } else {
                        bool2 = null;
                    }
                    if (bool2 == null) {
                        break;
                    }
                }
                i10++;
            } else {
                str = null;
                break;
            }
        }
        if (str != null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.I.b(str, "Ignoring invalid consent setting");
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.I.a("Valid consent values are 'granted', 'denied'");
        }
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        boolean j12 = l1Var.j1();
        z1 b10 = z1.b(i6, bundle);
        Iterator it = b10.f9570a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            w1Var = w1.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((w1) it.next()) != w1Var) {
                y1(b10, j12);
                break;
            }
        }
        q c10 = q.c(i6, bundle);
        Iterator it2 = c10.f9443e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((w1) it2.next()) != w1Var) {
                x1(c10, j12);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = z1.d(bundle.getString("ad_personalization")).ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    bool = Boolean.TRUE;
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (bool != null) {
            if (i6 == -30) {
                str2 = "tcf";
            } else {
                str2 = "app";
            }
            if (j12) {
                o1(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                n1(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void x1(q qVar, boolean z10) {
        hb.s sVar = new hb.s(this, qVar, 17, false);
        if (z10) {
            d1();
            sVar.run();
        } else {
            l1 l1Var = ((n1) this.f4301y).D;
            n1.g(l1Var);
            l1Var.m1(sVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:75:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final void y1(n9.z1 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.m2.y1(n9.z1, boolean):void");
    }

    public final void z1() {
        t8.a();
        n1 n1Var = (n1) this.f4301y;
        g gVar = n1Var.A;
        l1 l1Var = n1Var.D;
        u0 u0Var = n1Var.C;
        if (gVar.n1(null, e0.R0)) {
            n1.g(l1Var);
            if (!l1Var.j1()) {
                if (!w8.l.w()) {
                    e1();
                    n1.g(u0Var);
                    u0Var.L.a("Getting trigger URIs (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    n1.g(l1Var);
                    l1Var.n1(atomicReference, 10000L, "get trigger URIs", new h2(this, atomicReference, 5, false));
                    List list = (List) atomicReference.get();
                    if (list == null) {
                        n1.g(u0Var);
                        u0Var.F.a("Timed out waiting for get trigger URIs");
                        return;
                    } else {
                        n1.g(l1Var);
                        l1Var.m1(new hb.s(19, this, list));
                        return;
                    }
                }
                n1.g(u0Var);
                u0Var.D.a("Cannot get trigger URIs from main thread");
                return;
            }
            n1.g(u0Var);
            u0Var.D.a("Cannot get trigger URIs from analytics worker thread");
        }
    }
}
