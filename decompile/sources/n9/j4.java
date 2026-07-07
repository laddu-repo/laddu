package n9;

import android.content.ComponentName;
import android.content.Context;
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
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j4 extends u1 {
    public static final String[] G = {"firebase_", "google_", "ga_"};
    public static final String[] H = {"_err"};
    public SecureRandom A;
    public final AtomicLong B;
    public int C;
    public s4.a D;
    public Boolean E;
    public Integer F;

    public j4(n1 n1Var) {
        super(n1Var);
        this.F = null;
        this.B = new AtomicLong(0L);
    }

    public static boolean A1(String str) {
        String str2 = (String) e0.f9270s0.a(null);
        if (!str2.equals("*") && !Arrays.asList(str2.split(",")).contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean C1(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static boolean D1(String str, String[] strArr) {
        w8.x.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] I1(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList T1(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", eVar.f9223x);
            bundle.putString("origin", eVar.f9224y);
            bundle.putLong("creation_timestamp", eVar.A);
            bundle.putString(MediationMetaData.KEY_NAME, eVar.f9225z.f9332y);
            Object a10 = eVar.f9225z.a();
            w8.x.g(a10);
            a2.c(bundle, a10);
            bundle.putBoolean("active", eVar.B);
            String str = eVar.C;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            v vVar = eVar.D;
            if (vVar != null) {
                bundle.putString("timed_out_event_name", vVar.f9500x);
                u uVar = vVar.f9501y;
                if (uVar != null) {
                    bundle.putBundle("timed_out_event_params", uVar.d());
                }
            }
            bundle.putLong("trigger_timeout", eVar.E);
            v vVar2 = eVar.F;
            if (vVar2 != null) {
                bundle.putString("triggered_event_name", vVar2.f9500x);
                u uVar2 = vVar2.f9501y;
                if (uVar2 != null) {
                    bundle.putBundle("triggered_event_params", uVar2.d());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.f9225z.f9333z);
            bundle.putLong("time_to_live", eVar.G);
            v vVar3 = eVar.H;
            if (vVar3 != null) {
                bundle.putString("expired_event_name", vVar3.f9500x);
                u uVar3 = vVar3.f9501y;
                if (uVar3 != null) {
                    bundle.putBundle("expired_event_params", uVar3.d());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean U1(Context context) {
        ActivityInfo receiverInfo;
        w8.x.g(context);
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

    public static void V1(u2 u2Var, Bundle bundle, boolean z10) {
        if (bundle != null && u2Var != null) {
            if (bundle.containsKey("_sc") && !z10) {
                z10 = false;
            } else {
                String str = u2Var.f9494a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = u2Var.f9495b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", u2Var.f9496c);
                return;
            }
        }
        if (bundle != null && u2Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean X1(int i6, Bundle bundle) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i6);
            return true;
        }
        return false;
    }

    public static boolean c2(String str) {
        w8.x.d(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static String i1(String str, boolean z10, int i6) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) > i6) {
                if (z10) {
                    return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i6))).concat("...");
                }
            } else {
                return str;
            }
        }
        return null;
    }

    public static boolean m2(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static void t1(i4 i4Var, String str, int i6, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        X1(i6, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i6 == 6 || i6 == 7 || i6 == 2) {
            bundle.putLong("_el", i10);
        }
        i4Var.c(str, "_err", bundle);
    }

    public static MessageDigest u1() {
        MessageDigest messageDigest;
        for (int i6 = 0; i6 < 2; i6++) {
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

    public static long v1(byte[] bArr) {
        w8.x.g(bArr);
        int length = bArr.length;
        if (length > 0) {
            int i6 = 0;
            long j = 0;
            for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
                j += (bArr[i10] & 255) << i6;
                i6 += 8;
            }
            return j;
        }
        throw new IllegalStateException();
    }

    public static boolean w1(Context context) {
        w8.x.g(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return x1(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return x1(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean x1(Context context, String str) {
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

    public final boolean B1(String str) {
        d1();
        n1 n1Var = (n1) this.f4301y;
        if (c9.c.a(n1Var.f9413x).f1989a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        u0 u0Var = n1Var.C;
        n1.g(u0Var);
        u0Var.K.b(str, "Permission not granted");
        return false;
    }

    public final boolean E1(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((n1) this.f4301y).A.h1("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle F1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object k12 = k1(bundle.get(str), str);
                if (k12 == null) {
                    n1 n1Var = (n1) this.f4301y;
                    u0 u0Var = n1Var.C;
                    n1.g(u0Var);
                    u0Var.I.b(n1Var.G.b(str), "Param value can't be null");
                } else {
                    s1(bundle2, str, k12);
                }
            }
        }
        return bundle2;
    }

    public final v G1(String str, Bundle bundle, String str2, long j, boolean z10) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i2(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle l12 = l1(str, bundle2, Collections.singletonList("_o"), true);
            if (z10) {
                l12 = F1(l12);
            }
            w8.x.g(l12);
            return new v(str, new u(l12), str2, j);
        }
        n1 n1Var = (n1) this.f4301y;
        u0 u0Var = n1Var.C;
        n1.g(u0Var);
        u0Var.D.b(n1Var.G.c(str), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    public final boolean H1(Context context, String str) {
        Signature[] signatureArr;
        n1 n1Var = (n1) this.f4301y;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b10 = c9.c.a(context).b(64, str);
            if (b10 != null && (signatureArr = b10.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.b(e10, "Package name not found");
            return true;
        } catch (CertificateException e11) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.D.b(e11, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean J1(int i6) {
        Boolean bool = ((n1) this.f4301y).j().C;
        if (K1() < i6 / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT) {
            if (bool == null || bool.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int K1() {
        if (this.F == null) {
            n1 n1Var = (n1) this.f4301y;
            t8.f fVar = t8.f.f12640b;
            Context context = n1Var.f9413x;
            fVar.getClass();
            AtomicBoolean atomicBoolean = t8.i.f12641a;
            int i6 = 0;
            try {
                i6 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.F = Integer.valueOf(i6 / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
        }
        return this.F.intValue();
    }

    public final void L1(Bundle bundle, long j) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.G.b(Long.valueOf(j10), "Params already contained engagement");
        } else {
            j10 = 0;
        }
        bundle.putLong("_et", j + j10);
    }

    public final void M1(String str, com.google.android.gms.internal.measurement.n0 n0Var) {
        Bundle bundle = new Bundle();
        bundle.putString(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, str);
        try {
            n0Var.w(bundle);
        } catch (RemoteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.G.b(e10, "Error returning string value to wrapper");
        }
    }

    public final void N1(com.google.android.gms.internal.measurement.n0 n0Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, j);
        try {
            n0Var.w(bundle);
        } catch (RemoteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.G.b(e10, "Error returning long value to wrapper");
        }
    }

    public final void O1(com.google.android.gms.internal.measurement.n0 n0Var, int i6) {
        Bundle bundle = new Bundle();
        bundle.putInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, i6);
        try {
            n0Var.w(bundle);
        } catch (RemoteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.G.b(e10, "Error returning int value to wrapper");
        }
    }

    public final void P1(com.google.android.gms.internal.measurement.n0 n0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, bArr);
        try {
            n0Var.w(bundle);
        } catch (RemoteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.G.b(e10, "Error returning byte array to wrapper");
        }
    }

    public final void Q1(com.google.android.gms.internal.measurement.n0 n0Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, z10);
        try {
            n0Var.w(bundle);
        } catch (RemoteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.G.b(e10, "Error returning boolean value to wrapper");
        }
    }

    public final void R1(com.google.android.gms.internal.measurement.n0 n0Var, Bundle bundle) {
        try {
            n0Var.w(bundle);
        } catch (RemoteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.G.b(e10, "Error returning bundle value to wrapper");
        }
    }

    public final void S1(com.google.android.gms.internal.measurement.n0 n0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, arrayList);
        try {
            n0Var.w(bundle);
        } catch (RemoteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.G.b(e10, "Error returning bundle list to wrapper");
        }
    }

    public final String W1() {
        byte[] bArr = new byte[16];
        b2().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object Y1(int i6, Object obj, boolean z10, boolean z11) {
        long j;
        if (obj != null) {
            if (!(obj instanceof Long)) {
                if (obj instanceof Double) {
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
                    if (true != ((Boolean) obj).booleanValue()) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                    return Long.valueOf(j);
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (z11) {
                        if ((obj instanceof Bundle[]) || (obj instanceof Parcelable[])) {
                            ArrayList arrayList = new ArrayList();
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (parcelable instanceof Bundle) {
                                    Bundle F1 = F1((Bundle) parcelable);
                                    if (!F1.isEmpty()) {
                                        arrayList.add(F1);
                                    }
                                }
                            }
                            return arrayList.toArray(new Bundle[arrayList.size()]);
                        }
                        return null;
                    }
                    return null;
                }
                return i1(obj.toString(), z10, i6);
            }
            return obj;
        }
        return null;
    }

    public final int Z1(String str) {
        n1 n1Var = (n1) this.f4301y;
        if ("_ldl".equals(str)) {
            n1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            n1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            n1Var.getClass();
            return 100;
        }
        n1Var.getClass();
        return 36;
    }

    public final long a2() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.B;
        if (atomicLong.get() == 0) {
            synchronized (atomicLong) {
                long nanoTime = System.nanoTime();
                ((n1) this.f4301y).H.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i6 = this.C + 1;
                this.C = i6;
                j = nextLong + i6;
            }
            return j;
        }
        AtomicLong atomicLong2 = this.B;
        synchronized (atomicLong2) {
            atomicLong2.compareAndSet(-1L, 1L);
            andIncrement = atomicLong2.getAndIncrement();
        }
        return andIncrement;
    }

    public final SecureRandom b2() {
        d1();
        if (this.A == null) {
            this.A = new SecureRandom();
        }
        return this.A;
    }

    public final Bundle d2(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            for (String str11 : uri.getQueryParameterNames()) {
                if (str11.startsWith("gad_")) {
                    String queryParameter10 = uri.getQueryParameter(str11);
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString(str11, queryParameter10);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.G.b(e10, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    @Override // n9.u1
    public final boolean e1() {
        return true;
    }

    public final boolean e2(String str, String str2) {
        n1 n1Var = (n1) this.f4301y;
        if (str2 == null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.F.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.F.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            u0 u0Var3 = n1Var.C;
            n1.g(u0Var3);
            u0Var3.F.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                u0 u0Var4 = n1Var.C;
                n1.g(u0Var4);
                u0Var4.F.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean f2(String str, String str2) {
        n1 n1Var = (n1) this.f4301y;
        if (str2 == null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.F.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.F.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt == 95) {
                codePointAt = 95;
            } else {
                u0 u0Var3 = n1Var.C;
                n1.g(u0Var3);
                u0Var3.F.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                u0 u0Var4 = n1Var.C;
                n1.g(u0Var4);
                u0Var4.F.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean g2(String str, String[] strArr, String[] strArr2, String str2) {
        n1 n1Var = (n1) this.f4301y;
        if (str2 == null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.F.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i6 = 0; i6 < 3; i6++) {
            if (str2.startsWith(G[i6])) {
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                u0Var2.F.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr != null && D1(str2, strArr)) {
            if (strArr2 == null || !D1(str2, strArr2)) {
                u0 u0Var3 = n1Var.C;
                n1.g(u0Var3);
                u0Var3.F.c(str, str2, "Name is reserved. Type, name");
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean h1(String str) {
        n1 n1Var = (n1) this.f4301y;
        if (!TextUtils.isEmpty(str)) {
            w8.x.g(str);
            if (!str.matches("^1:\\d+:android:[a-f0-9]+$")) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.F.b(u0.l1(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                return false;
            }
            return true;
        }
        u0 u0Var2 = n1Var.C;
        n1.g(u0Var2);
        u0Var2.F.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        return false;
    }

    public final boolean h2(int i6, String str, String str2) {
        n1 n1Var = (n1) this.f4301y;
        if (str2 == null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.F.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i6) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.F.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i6), str2);
            return false;
        }
        return true;
    }

    public final int i2(String str) {
        if (!f2("event", str)) {
            return 2;
        }
        if (!g2("event", a2.f9157a, a2.f9158b, str)) {
            return 13;
        }
        ((n1) this.f4301y).getClass();
        if (!h2(40, "event", str)) {
            return 2;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j1(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.j4.j1(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int j2(String str) {
        if (!f2("user property", str)) {
            return 6;
        }
        if (!g2("user property", a2.f9165i, null, str)) {
            return 15;
        }
        ((n1) this.f4301y).getClass();
        if (!h2(24, "user property", str)) {
            return 6;
        }
        return 0;
    }

    public final Object k1(Object obj, String str) {
        n1 n1Var = (n1) this.f4301y;
        boolean equals = "_ev".equals(str);
        int i6 = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        if (equals) {
            n1Var.A.getClass();
            return Y1(Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, 256), obj, true, true);
        }
        if (C1(str)) {
            n1Var.A.getClass();
            i6 = Math.max(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, 256);
        } else {
            n1Var.A.getClass();
        }
        return Y1(i6, obj, false, true);
    }

    public final int k2(String str) {
        if (!e2("event param", str)) {
            return 3;
        }
        if (!g2("event param", null, null, str)) {
            return 14;
        }
        ((n1) this.f4301y).getClass();
        if (!h2(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final Bundle l1(String str, Bundle bundle, List list, boolean z10) {
        int i6;
        int i10;
        String str2;
        String str3;
        String str4;
        List list2 = list;
        boolean D1 = D1(str, a2.f9160d);
        String str5 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        n1 n1Var = (n1) this.f4301y;
        g gVar = n1Var.A;
        p0 p0Var = n1Var.G;
        j4 j4Var = ((n1) gVar.f4301y).F;
        n1.e(j4Var);
        if (j4Var.J1(201500000)) {
            i6 = 100;
        } else {
            i6 = 25;
        }
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z11 = false;
        while (it.hasNext()) {
            String str6 = (String) it.next();
            if (list2 != null && list2.contains(str6)) {
                i10 = 0;
            } else {
                if (!z10) {
                    i10 = k2(str6);
                } else {
                    i10 = 0;
                }
                if (i10 == 0) {
                    i10 = l2(str6);
                }
            }
            if (i10 != 0) {
                if (i10 == 3) {
                    str2 = str6;
                } else {
                    str2 = str5;
                }
                p1(bundle2, i10, str6, str2);
                bundle2.remove(str6);
            } else {
                int j12 = j1(str, str6, bundle.get(str6), bundle2, list2, z10, D1);
                if (j12 == 17) {
                    p1(bundle2, 17, str6, Boolean.FALSE);
                } else if (j12 != 0 && !"_ev".equals(str6)) {
                    if (j12 == 21) {
                        str4 = str;
                    } else {
                        str4 = str6;
                    }
                    p1(bundle2, j12, str4, bundle.get(str6));
                    bundle2.remove(str6);
                }
                if (c2(str6)) {
                    i11++;
                    if (i11 > i6) {
                        if (n1Var.A.n1(str5, e0.f9245g1) && z11) {
                            str3 = str5;
                        } else {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 37);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i6);
                            sb2.append(" params");
                            String sb3 = sb2.toString();
                            u0 u0Var = n1Var.C;
                            n1.g(u0Var);
                            str3 = str5;
                            u0Var.F.c(p0Var.a(str), p0Var.e(bundle), sb3);
                        }
                        X1(5, bundle2);
                        bundle2.remove(str6);
                        z11 = true;
                        list2 = list;
                        str5 = str3;
                    } else {
                        list2 = list;
                    }
                }
            }
            str3 = str5;
            list2 = list;
            str5 = str3;
        }
        return bundle2;
    }

    public final int l2(String str) {
        if (!f2("event param", str)) {
            return 3;
        }
        if (!g2("event param", null, null, str)) {
            return 14;
        }
        ((n1) this.f4301y).getClass();
        if (!h2(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final void m1(v0 v0Var, int i6) {
        Bundle bundle = (Bundle) v0Var.f9507e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (c2(str) && (i10 = i10 + 1) > i6) {
                n1 n1Var = (n1) this.f4301y;
                g gVar = n1Var.A;
                p0 p0Var = n1Var.G;
                if (!gVar.n1(null, e0.f9245g1) || !z10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i6);
                    sb2.append(" params");
                    String sb3 = sb2.toString();
                    u0 u0Var = n1Var.C;
                    n1.g(u0Var);
                    u0Var.F.c(p0Var.a((String) v0Var.f9505c), p0Var.e(bundle), sb3);
                    X1(5, bundle);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    public final void n1(Parcelable[] parcelableArr, int i6) {
        w8.x.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            boolean z10 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (c2(str) && !D1(str, a2.f9164h) && (i10 = i10 + 1) > i6) {
                    n1 n1Var = (n1) this.f4301y;
                    g gVar = n1Var.A;
                    p0 p0Var = n1Var.G;
                    if (!gVar.n1(null, e0.f9245g1) || !z10) {
                        u0 u0Var = n1Var.C;
                        n1.g(u0Var);
                        s0 s0Var = u0Var.F;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i6);
                        sb2.append(" item-scoped custom parameters");
                        s0Var.c(p0Var.b(str), p0Var.e(bundle), sb2.toString());
                    }
                    X1(28, bundle);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    public final boolean n2(String str, String str2, int i6, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) > i6) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.I.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
            return false;
        }
        return true;
    }

    public final void o1(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    j4 j4Var = ((n1) this.f4301y).F;
                    n1.e(j4Var);
                    j4Var.s1(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void o2(String str, String str2, Bundle bundle, List list, boolean z10) {
        int i6;
        int i10;
        String str3;
        int j12;
        List list2 = list;
        if (bundle != null) {
            n1 n1Var = (n1) this.f4301y;
            g gVar = n1Var.A;
            u0 u0Var = n1Var.C;
            p0 p0Var = n1Var.G;
            j4 j4Var = ((n1) gVar.f4301y).F;
            n1.e(j4Var);
            if (true != j4Var.J1(231100000)) {
                i6 = 0;
            } else {
                i6 = 35;
            }
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i11 = 0;
            boolean z11 = false;
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (list2 != null && list2.contains(str4)) {
                    i10 = 0;
                } else {
                    if (!z10) {
                        i10 = k2(str4);
                    } else {
                        i10 = 0;
                    }
                    if (i10 == 0) {
                        i10 = l2(str4);
                    }
                }
                String str5 = null;
                if (i10 != 0) {
                    if (i10 == 3) {
                        str5 = str4;
                    }
                    p1(bundle, i10, str4, str5);
                    bundle.remove(str4);
                } else {
                    if (m2(bundle.get(str4))) {
                        n1.g(u0Var);
                        u0Var.I.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                        j12 = 22;
                        str3 = null;
                    } else {
                        str3 = null;
                        j12 = j1(str, str4, bundle.get(str4), bundle, list2, z10, false);
                    }
                    if (j12 != 0 && !"_ev".equals(str4)) {
                        p1(bundle, j12, str4, bundle.get(str4));
                        bundle.remove(str4);
                    } else if (c2(str4) && !D1(str4, a2.f9164h)) {
                        int i12 = i11 + 1;
                        if (!J1(231100000)) {
                            n1.g(u0Var);
                            u0Var.F.c(p0Var.a(str), p0Var.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                            X1(23, bundle);
                            bundle.remove(str4);
                        } else if (i12 > i6) {
                            if (!n1Var.A.n1(str3, e0.f9245g1) || !z11) {
                                n1.g(u0Var);
                                s0 s0Var = u0Var.F;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 55);
                                sb2.append("Item can't contain more than ");
                                sb2.append(i6);
                                sb2.append(" item-scoped custom params");
                                s0Var.c(p0Var.a(str), p0Var.e(bundle), sb2.toString());
                            }
                            X1(28, bundle);
                            bundle.remove(str4);
                            list2 = list;
                            i11 = i12;
                            z11 = true;
                        }
                        list2 = list;
                        i11 = i12;
                    }
                }
                list2 = list;
            }
        }
    }

    public final void p1(Bundle bundle, int i6, String str, Object obj) {
        if (X1(i6, bundle)) {
            ((n1) this.f4301y).getClass();
            bundle.putString("_ev", i1(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int q1(Object obj, String str) {
        boolean n22;
        if ("_ldl".equals(str)) {
            n22 = n2("user property referrer", str, Z1(str), obj);
        } else {
            n22 = n2("user property", str, Z1(str), obj);
        }
        if (n22) {
            return 0;
        }
        return 7;
    }

    public final Object r1(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return Y1(Z1(str), obj, true, false);
        }
        return Y1(Z1(str), obj, false, false);
    }

    public final void s1(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
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
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                n1 n1Var = (n1) this.f4301y;
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.I.c(n1Var.G.b(str), str2, "Not putting event parameter. Invalid value type. name, type");
            }
        }
    }

    public final s4.a y1() {
        int i6;
        int i10;
        int a10;
        t4.d dVar;
        Object obj;
        Object systemService;
        if (this.D == null) {
            Context context = ((n1) this.f4301y).f9413x;
            kotlin.jvm.internal.k.e(context, "context");
            StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
            int i11 = Build.VERSION.SDK_INT;
            q4.b bVar = q4.b.f11087a;
            int i12 = 0;
            if (i11 >= 33) {
                i6 = bVar.a();
            } else {
                i6 = 0;
            }
            sb2.append(i6);
            Log.d("MeasurementManager", sb2.toString());
            if (i11 >= 33) {
                i10 = bVar.a();
            } else {
                i10 = 0;
            }
            s4.a aVar = null;
            if (i10 >= 5) {
                systemService = context.getSystemService((Class<Object>) t4.b.c());
                kotlin.jvm.internal.k.d(systemService, "context.getSystemService…ementManager::class.java)");
                dVar = new t4.d(t4.b.b(systemService));
            } else {
                q4.a aVar2 = q4.a.f11086a;
                if (i11 != 31 && i11 != 32) {
                    a10 = 0;
                } else {
                    a10 = aVar2.a();
                }
                if (a10 >= 9) {
                    try {
                        obj = new b1.r(context, 4).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 == 31 || i13 == 32) {
                            i12 = aVar2.a();
                        }
                        sb3.append(i12);
                        Log.d("MeasurementManager", sb3.toString());
                        obj = null;
                    }
                    dVar = (t4.d) obj;
                } else {
                    dVar = null;
                }
            }
            if (dVar != null) {
                aVar = new s4.a(dVar);
            }
            this.D = aVar;
        }
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long z1() {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.j4.z1():long");
    }
}
