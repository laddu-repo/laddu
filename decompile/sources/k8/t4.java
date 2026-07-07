package k8;

import android.adservices.measurement.MeasurementManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.z6;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t4 extends y1 {
    public static final String[] E = {"firebase_", "google_", "ga_"};
    public static final String[] F = {"_err"};
    public int A;
    public k4.a B;
    public Boolean C;
    public Integer D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SecureRandom f7776y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicLong f7777z;

    public t4(p1 p1Var) {
        super(p1Var);
        this.D = null;
        this.f7777z = new AtomicLong(0L);
    }

    public static void A0(c3 c3Var, Bundle bundle, boolean z2) {
        if (bundle != null && c3Var != null) {
            if (!bundle.containsKey("_sc") || z2) {
                String str = c3Var.f7427a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c3Var.f7428b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c3Var.f7429c);
                return;
            }
            z2 = false;
        }
        if (bundle != null && c3Var == null && z2) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean E0(String str) {
        t7.y.d(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean G0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String K(String str, boolean z2, int i) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z2) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
        }
        return null;
    }

    public static boolean Q0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void V(s4 s4Var, String str, int i, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        c0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i10);
        }
        s4Var.b(str, "_err", bundle);
    }

    public static MessageDigest W() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long X(byte[] bArr) {
        t7.y.g(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i = 0;
        long j8 = 0;
        for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
            j8 += (((long) bArr[i10]) & 255) << i;
            i += 8;
        }
        return j8;
    }

    public static boolean Y(Context context) {
        t7.y.g(context);
        return Build.VERSION.SDK_INT >= 24 ? Z(context, "com.google.android.gms.measurement.AppMeasurementJobService") : Z(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean Z(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static final boolean c0(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean f0(String str, String[] strArr) {
        t7.y.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean i0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] n0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList y0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", eVar.f7448v);
            bundle.putString("origin", eVar.f7449w);
            bundle.putLong("creation_timestamp", eVar.f7451y);
            bundle.putString("name", eVar.f7450x.f7721w);
            Object objA = eVar.f7450x.a();
            t7.y.g(objA);
            e2.c(bundle, objA);
            bundle.putBoolean("active", eVar.f7452z);
            String str = eVar.A;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            v vVar = eVar.B;
            if (vVar != null) {
                bundle.putString("timed_out_event_name", vVar.f7791v);
                u uVar = vVar.f7792w;
                if (uVar != null) {
                    bundle.putBundle("timed_out_event_params", uVar.d());
                }
            }
            bundle.putLong("trigger_timeout", eVar.C);
            v vVar2 = eVar.D;
            if (vVar2 != null) {
                bundle.putString("triggered_event_name", vVar2.f7791v);
                u uVar2 = vVar2.f7792w;
                if (uVar2 != null) {
                    bundle.putBundle("triggered_event_params", uVar2.d());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.f7450x.f7722x);
            bundle.putLong("time_to_live", eVar.E);
            v vVar3 = eVar.F;
            if (vVar3 != null) {
                bundle.putString("expired_event_name", vVar3.f7791v);
                u uVar3 = vVar3.f7792w;
                if (uVar3 != null) {
                    bundle.putBundle("expired_event_params", uVar3.d());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean z0(Context context) {
        ActivityInfo receiverInfo;
        t7.y.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final String B0() {
        byte[] bArr = new byte[16];
        D0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long C0() {
        long andIncrement;
        long j8;
        AtomicLong atomicLong = this.f7777z;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f7777z;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((p1) this.f2053w).F.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.A + 1;
            this.A = i;
            j8 = jNextLong + ((long) i);
        }
        return j8;
    }

    public final SecureRandom D0() {
        D();
        if (this.f7776y == null) {
            this.f7776y = new SecureRandom();
        }
        return this.f7776y;
    }

    @Override // k8.y1
    public final boolean E() {
        return true;
    }

    public final Bundle F0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        p1 p1Var = (p1) this.f2053w;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("gbraid");
                    queryParameter6 = uri.getQueryParameter("utm_id");
                    queryParameter7 = uri.getQueryParameter("dclid");
                    queryParameter8 = uri.getQueryParameter("srsltid");
                    queryParameter9 = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("campaign", queryParameter);
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("source", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("medium", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("gclid", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gbraid", queryParameter5);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("campaign_id", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("dclid", queryParameter7);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("srsltid", queryParameter8);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("sfmc_id", queryParameter9);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (p1Var.f7695y.O(null, f0.f7484b1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        p1Var.f7695y.getClass();
                        int iMax = Math.max(500, 256);
                        if (string.length() > iMax) {
                            string = K(string, true, iMax - 3);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e7) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.E.b(e7, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean H(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.G.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final boolean H0(String str, String str2) {
        p1 p1Var = (p1) this.f2053w;
        if (str2 == null) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.D.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.D.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            v0 v0Var3 = p1Var.A;
            p1.l(v0Var3);
            v0Var3.D.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                v0 v0Var4 = p1Var.A;
                p1.l(v0Var4);
                v0Var4.D.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final void I(String str, String str2, Bundle bundle, List list, boolean z2) {
        int iO0;
        int iL;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        p1 p1Var = (p1) this.f2053w;
        g gVar = p1Var.f7695y;
        v0 v0Var = p1Var.A;
        q0 q0Var = p1Var.E;
        t4 t4Var = ((p1) gVar.f2053w).D;
        p1.j(t4Var);
        int i = true != t4Var.o0(231100000) ? 0 : 35;
        int i10 = 0;
        boolean z10 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                iO0 = !z2 ? O0(str3) : 0;
                if (iO0 == 0) {
                    iO0 = P0(str3);
                }
            } else {
                iO0 = 0;
            }
            if (iO0 != 0) {
                R(bundle, iO0, str3, iO0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (Q0(bundle.get(str3))) {
                    p1.l(v0Var);
                    v0Var.G.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iL = 22;
                } else {
                    iL = L(str, str3, bundle.get(str3), bundle, list2, z2, false);
                }
                if (iL != 0 && !"_ev".equals(str3)) {
                    R(bundle, iL, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (E0(str3) && !f0(str3, e2.f7468k)) {
                    i10++;
                    if (!o0(231100000)) {
                        p1.l(v0Var);
                        v0Var.D.c(q0Var.a(str), q0Var.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        c0(23, bundle);
                        bundle.remove(str3);
                    } else if (i10 > i) {
                        if (!z10) {
                            p1.l(v0Var);
                            t0 t0Var = v0Var.D;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i);
                            sb2.append(" item-scoped custom params");
                            t0Var.c(q0Var.a(str), q0Var.e(bundle), sb2.toString());
                        }
                        c0(28, bundle);
                        bundle.remove(str3);
                        list2 = list;
                        z10 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean I0(String str, String str2) {
        p1 p1Var = (p1) this.f2053w;
        if (str2 == null) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.D.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.D.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                v0 v0Var3 = p1Var.A;
                p1.l(v0Var3);
                v0Var3.D.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                v0 v0Var4 = p1Var.A;
                p1.l(v0Var4);
                v0Var4.D.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean J(String str) {
        p1 p1Var = (p1) this.f2053w;
        if (TextUtils.isEmpty(str)) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.D.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        t7.y.g(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        v0 v0Var2 = p1Var.A;
        p1.l(v0Var2);
        v0Var2.D.b(v0.L(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean J0(String str, String[] strArr, String[] strArr2, String str2) {
        p1 p1Var = (p1) this.f2053w;
        if (str2 == null) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.D.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(E[i])) {
                v0 v0Var2 = p1Var.A;
                p1.l(v0Var2);
                v0Var2.D.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !f0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && f0(str2, strArr2)) {
            return true;
        }
        v0 v0Var3 = p1Var.A;
        p1.l(v0Var3);
        v0Var3.D.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean K0(int i, String str, String str2) {
        p1 p1Var = (p1) this.f2053w;
        if (str2 == null) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.D.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        v0 v0Var2 = p1Var.A;
        p1.l(v0Var2);
        v0Var2.D.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int L(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t4.L(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int L0(String str) {
        if (!I0("event", str)) {
            return 2;
        }
        if (J0("event", e2.f7460a, ((p1) this.f2053w).f7695y.O(null, f0.f7496g1) ? e2.f7462c : e2.f7461b, str)) {
            return !K0(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    public final Object M(Object obj, String str) {
        p1 p1Var = (p1) this.f2053w;
        int iMax = 500;
        if ("_ev".equals(str)) {
            p1Var.f7695y.getClass();
            return d0(Math.max(500, 256), obj, true, true);
        }
        if (i0(str)) {
            p1Var.f7695y.getClass();
            iMax = Math.max(500, 256);
        } else {
            p1Var.f7695y.getClass();
        }
        return d0(iMax, obj, false, true);
    }

    public final boolean M0(String str) {
        return ((p1) this.f2053w).f7695y.O(null, f0.f7496g1) ? f0(str, e2.f7464e) : f0(str, e2.f7463d);
    }

    public final Bundle N(String str, Bundle bundle, List list, boolean z2) {
        int iO0;
        List list2 = list;
        boolean zF0 = f0(str, e2.f7465g);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        p1 p1Var = (p1) this.f2053w;
        g gVar = p1Var.f7695y;
        q0 q0Var = p1Var.E;
        t4 t4Var = ((p1) gVar.f2053w).D;
        p1.j(t4Var);
        int i = t4Var.o0(201500000) ? 100 : 25;
        int i10 = 0;
        boolean z10 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str2)) {
                iO0 = !z2 ? O0(str2) : 0;
                if (iO0 == 0) {
                    iO0 = P0(str2);
                }
            } else {
                iO0 = 0;
            }
            if (iO0 != 0) {
                R(bundle2, iO0, str2, iO0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iL = L(str, str2, bundle.get(str2), bundle2, list2, z2, zF0);
                if (iL == 17) {
                    R(bundle2, 17, str2, Boolean.FALSE);
                } else if (iL != 0 && !"_ev".equals(str2)) {
                    R(bundle2, iL, iL == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (E0(str2)) {
                    i10++;
                    if (i10 > i) {
                        if (!z10) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 37);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i);
                            sb2.append(" params");
                            String string = sb2.toString();
                            v0 v0Var = p1Var.A;
                            p1.l(v0Var);
                            v0Var.D.c(q0Var.a(str), q0Var.e(bundle), string);
                        }
                        c0(5, bundle2);
                        bundle2.remove(str2);
                        z10 = true;
                    }
                }
                list2 = list;
            }
            list2 = list;
        }
        return bundle2;
    }

    public final int N0(String str) {
        if (!I0("user property", str)) {
            return 6;
        }
        if (!J0("user property", e2.f7469l, null, str)) {
            return 15;
        }
        ((p1) this.f2053w).getClass();
        return !K0(24, "user property", str) ? 6 : 0;
    }

    public final void O(w0 w0Var, int i) {
        Bundle bundle = w0Var.f7814e;
        int i10 = 0;
        boolean z2 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (E0(str) && (i10 = i10 + 1) > i) {
                if (!z2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i);
                    sb2.append(" params");
                    String string = sb2.toString();
                    p1 p1Var = (p1) this.f2053w;
                    v0 v0Var = p1Var.A;
                    q0 q0Var = p1Var.E;
                    p1.l(v0Var);
                    v0Var.D.c(q0Var.a(w0Var.f7810a), q0Var.e(bundle), string);
                    c0(5, bundle);
                }
                bundle.remove(str);
                z2 = true;
            }
        }
    }

    public final int O0(String str) {
        if (!H0("event param", str)) {
            return 3;
        }
        if (!J0("event param", null, null, str)) {
            return 14;
        }
        ((p1) this.f2053w).getClass();
        return !K0(40, "event param", str) ? 3 : 0;
    }

    public final void P(Parcelable[] parcelableArr, int i) {
        t7.y.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i10 = 0;
            boolean z2 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (E0(str) && !f0(str, e2.f7468k) && (i10 = i10 + 1) > i) {
                    if (!z2) {
                        p1 p1Var = (p1) this.f2053w;
                        v0 v0Var = p1Var.A;
                        q0 q0Var = p1Var.E;
                        p1.l(v0Var);
                        t0 t0Var = v0Var.D;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i);
                        sb2.append(" item-scoped custom parameters");
                        t0Var.c(q0Var.b(str), q0Var.e(bundle), sb2.toString());
                    }
                    c0(28, bundle);
                    bundle.remove(str);
                    z2 = true;
                }
            }
        }
    }

    public final int P0(String str) {
        if (!I0("event param", str)) {
            return 3;
        }
        if (!J0("event param", null, null, str)) {
            return 14;
        }
        ((p1) this.f2053w).getClass();
        return !K0(40, "event param", str) ? 3 : 0;
    }

    public final void Q(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                t4 t4Var = ((p1) this.f2053w).D;
                p1.j(t4Var);
                t4Var.U(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void R(Bundle bundle, int i, String str, Object obj) {
        if (c0(i, bundle)) {
            ((p1) this.f2053w).getClass();
            bundle.putString("_ev", K(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int S(Object obj, String str) {
        return "_ldl".equals(str) ? H("user property referrer", str, e0(str), obj) : H("user property", str, e0(str), obj) ? 0 : 7;
    }

    public final Object T(Object obj, String str) {
        return "_ldl".equals(str) ? d0(e0(str), obj, true, false) : d0(e0(str), obj, false, false);
    }

    public final void U(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            p1 p1Var = (p1) this.f2053w;
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.G.c(p1Var.E.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final k4.a a0() {
        l4.c cVar;
        if (this.B == null) {
            Context context = ((p1) this.f2053w).f7692v;
            de.i.e(context, "context");
            StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
            int i = Build.VERSION.SDK_INT;
            i4.b bVar = i4.b.f6469a;
            sb2.append(i >= 33 ? bVar.a() : 0);
            Log.d("MeasurementManager", sb2.toString());
            if ((i >= 33 ? bVar.a() : 0) >= 5) {
                Object systemService = context.getSystemService((Class<Object>) l4.b.d());
                de.i.d(systemService, "context.getSystemService…ementManager::class.java)");
                cVar = new l4.c(l4.b.c(systemService));
            } else {
                i4.a aVar = i4.a.f6468a;
                if (((i == 31 || i == 32) ? aVar.a() : 0) >= 9) {
                    try {
                        MeasurementManager measurementManager = MeasurementManager.get(context);
                        de.i.d(measurementManager, "get(context)");
                        cVar = new l4.c(measurementManager);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i10 = Build.VERSION.SDK_INT;
                        sb3.append((i10 == 31 || i10 == 32) ? aVar.a() : 0);
                        Log.d("MeasurementManager", sb3.toString());
                        cVar = null;
                    }
                } else {
                    cVar = null;
                }
            }
            this.B = cVar != null ? new k4.a(cVar) : null;
        }
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b0() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t4.b0():long");
    }

    public final Object d0(int i, Object obj, boolean z2, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return K(obj.toString(), z2, i);
        }
        if (!z10) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleK0 = k0((Bundle) parcelable);
                if (!bundleK0.isEmpty()) {
                    arrayList.add(bundleK0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int e0(String str) {
        p1 p1Var = (p1) this.f2053w;
        if ("_ldl".equals(str)) {
            p1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            p1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            p1Var.getClass();
            return 100;
        }
        p1Var.getClass();
        return 36;
    }

    public final boolean h0(String str) {
        D();
        p1 p1Var = (p1) this.f2053w;
        if (z7.c.a(p1Var.f7692v).f926a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        v0 v0Var = p1Var.A;
        p1.l(v0Var);
        v0Var.I.b(str, "Permission not granted");
        return false;
    }

    public final boolean j0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((p1) this.f2053w).f7695y.H("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle k0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM = M(bundle.get(str), str);
                if (objM == null) {
                    p1 p1Var = (p1) this.f2053w;
                    v0 v0Var = p1Var.A;
                    p1.l(v0Var);
                    v0Var.G.b(p1Var.E.b(str), "Param value can't be null");
                } else {
                    U(bundle2, str, objM);
                }
            }
        }
        return bundle2;
    }

    public final v l0(String str, Bundle bundle, String str2, long j8, long j9, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (L0(str) != 0) {
            p1 p1Var = (p1) this.f2053w;
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.b(p1Var.E.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleN = N(str, bundle2, Collections.singletonList("_o"), true);
        if (z2) {
            bundleN = k0(bundleN);
        }
        t7.y.g(bundleN);
        return new v(str, new u(bundleN), str2, j8, j9);
    }

    public final boolean m0(Context context, String str) {
        Signature[] signatureArr;
        p1 p1Var = (p1) this.f2053w;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoC = z7.c.a(context).c(64, str);
            if (packageInfoC == null || (signatureArr = packageInfoC.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e7) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.b(e7, "Package name not found");
            return true;
        } catch (CertificateException e10) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.B.b(e10, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean o0(int i) {
        Boolean bool = ((p1) this.f2053w).o().A;
        if (p0() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int p0() {
        if (this.D == null) {
            p1 p1Var = (p1) this.f2053w;
            q7.f fVar = q7.f.f10909b;
            Context context = p1Var.f7692v;
            fVar.getClass();
            int i = q7.g.f10914e;
            int i10 = 0;
            try {
                i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.D = Integer.valueOf(i10 / 1000);
        }
        return this.D.intValue();
    }

    public final void q0(Bundle bundle, long j8) {
        long j9 = bundle.getLong("_et");
        if (j9 != 0) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.E.b(Long.valueOf(j9), "Params already contained engagement");
        } else {
            j9 = 0;
        }
        bundle.putLong("_et", j8 + j9);
    }

    public final void r0(String str, z6 z6Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            z6Var.q(bundle);
        } catch (RemoteException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.E.b(e7, "Error returning string value to wrapper");
        }
    }

    public final void s0(z6 z6Var, long j8) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j8);
        try {
            z6Var.q(bundle);
        } catch (RemoteException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.E.b(e7, "Error returning long value to wrapper");
        }
    }

    public final void t0(z6 z6Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            z6Var.q(bundle);
        } catch (RemoteException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.E.b(e7, "Error returning int value to wrapper");
        }
    }

    public final void u0(z6 z6Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            z6Var.q(bundle);
        } catch (RemoteException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.E.b(e7, "Error returning byte array to wrapper");
        }
    }

    public final void v0(z6 z6Var, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z2);
        try {
            z6Var.q(bundle);
        } catch (RemoteException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.E.b(e7, "Error returning boolean value to wrapper");
        }
    }

    public final void w0(z6 z6Var, Bundle bundle) {
        try {
            z6Var.q(bundle);
        } catch (RemoteException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.E.b(e7, "Error returning bundle value to wrapper");
        }
    }

    public final void x0(z6 z6Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            z6Var.q(bundle);
        } catch (RemoteException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.E.b(e7, "Error returning bundle list to wrapper");
        }
    }
}
