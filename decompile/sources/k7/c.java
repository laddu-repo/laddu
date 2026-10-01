package k7;

import a2.e0;
import android.app.BroadcastOptions;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.Rating;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bf.o;
import com.google.android.gms.internal.measurement.e5;
import com.playfy.tv.activities.FullBannerActivity;
import com.unity3d.services.UnityAdsConstants;
import d2.g;
import db.i0;
import db.v;
import j1.k0;
import j1.p0;
import j1.y;
import j4.l0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kf.h;
import kotlin.jvm.internal.k;
import n9.c1;
import n9.e4;
import n9.i4;
import n9.j4;
import n9.n1;
import n9.o2;
import n9.u0;
import n9.y1;
import o.e;
import o.n;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import p.g2;
import p.i1;
import p.y0;
import t0.q0;
import t0.s;
import t0.t1;
import t0.w1;
import t6.f;
import u1.a0;
import u2.p;
import u5.r;
import v6.j;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class c implements g5.b, b1.b, p, s, j, i1, f.b, h, o2, i4, g2, y0, t0.c, f {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7744x;

    /* renamed from: y, reason: collision with root package name */
    public Object f7745y;

    public /* synthetic */ c(Object obj, int i6) {
        this.f7744x = i6;
        this.f7745y = obj;
    }

    public static String y(String str, b bVar, boolean z10) {
        String str2 = bVar.f7743x;
        if (z10) {
            str2 = ".temp".concat(str2);
        }
        String replaceAll = str.replaceAll("\\W+", HttpUrl.FRAGMENT_ENCODE_SET);
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : digest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b10)));
                }
                replaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return h8.c.m("lottie_cache_", replaceAll, str2);
    }

    public File A() {
        File file = new File(((Context) ((e0) this.f7745y).f212y).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public void B(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = (HashMap) this.f7745y;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    int i6 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = v5.f.f13317b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i6 < zArr.length) {
                            boolArr[i6] = Boolean.valueOf(zArr[i6]);
                            i6++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = v5.f.f13317b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i6 < bArr.length) {
                            bArr2[i6] = Byte.valueOf(bArr[i6]);
                            i6++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = v5.f.f13317b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i6 < iArr.length) {
                            numArr[i6] = Integer.valueOf(iArr[i6]);
                            i6++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = v5.f.f13317b;
                        Long[] lArr = new Long[jArr.length];
                        while (i6 < jArr.length) {
                            lArr[i6] = Long.valueOf(jArr[i6]);
                            i6++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = v5.f.f13317b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i6 < fArr.length) {
                            fArr2[i6] = Float.valueOf(fArr[i6]);
                            i6++;
                        }
                        hashMap2.put(str, fArr2);
                    } else if (cls == double[].class) {
                        double[] dArr = (double[]) value;
                        String str7 = v5.f.f13317b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i6 < dArr.length) {
                            dArr2[i6] = Double.valueOf(dArr[i6]);
                            i6++;
                        }
                        hashMap2.put(str, dArr2);
                    } else {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                    }
                } else {
                    hashMap2.put(str, value);
                }
            }
        }
    }

    public void C(String str, Bitmap bitmap) {
        Integer num = (Integer) j4.p.f7197z.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(h8.c.m("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f7745y).putParcelable(str, bitmap);
    }

    public void D(String str, long j) {
        Integer num = (Integer) j4.p.f7197z.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(h8.c.m("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f7745y).putLong(str, j);
    }

    public void E(String str, l0 l0Var) {
        Rating rating;
        float f3 = l0Var.f7192y;
        int i6 = l0Var.f7191x;
        Integer num = (Integer) j4.p.f7197z.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(h8.c.m("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f7745y;
        if (l0Var.f7193z == null) {
            if (l0Var.b()) {
                boolean z10 = true;
                switch (i6) {
                    case 1:
                        if (i6 != 1 || f3 != 1.0f) {
                            z10 = false;
                        }
                        l0Var.f7193z = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i6 != 2 || f3 != 1.0f) {
                            z10 = false;
                        }
                        l0Var.f7193z = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        l0Var.f7193z = Rating.newStarRating(i6, l0Var.a());
                        break;
                    case 6:
                        if (i6 != 6 || !l0Var.b()) {
                            f3 = -1.0f;
                        }
                        l0Var.f7193z = Rating.newPercentageRating(f3);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            l0Var.f7193z = Rating.newUnratedRating(i6);
        }
        rating = l0Var.f7193z;
        bundle.putParcelable(str, rating);
    }

    public void F(String str, String str2) {
        Integer num = (Integer) j4.p.f7197z.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(h8.c.m("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f7745y).putCharSequence(str, str2);
    }

    public void G(CharSequence charSequence, String str) {
        Integer num = (Integer) j4.p.f7197z.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(h8.c.m("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f7745y).putCharSequence(str, charSequence);
    }

    public File H(String str, InputStream inputStream, b bVar) {
        File file = new File(A(), y(str, bVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    public void I(y1 y1Var, int i6) {
        n9.h hVar;
        if (i6 != -30) {
            if (i6 != -20) {
                if (i6 != -10) {
                    if (i6 != 0) {
                        if (i6 != 30) {
                            hVar = n9.h.UNSET;
                        } else {
                            hVar = n9.h.INITIALIZATION;
                        }
                    }
                } else {
                    hVar = n9.h.MANIFEST;
                }
            }
            hVar = n9.h.API;
        } else {
            hVar = n9.h.TCF;
        }
        ((EnumMap) this.f7745y).put((EnumMap) y1Var, (y1) hVar);
    }

    public void J(y1 y1Var, n9.h hVar) {
        ((EnumMap) this.f7745y).put((EnumMap) y1Var, (y1) hVar);
    }

    @Override // b1.b
    public Object a(b1.a aVar) {
        return ((l) this.f7745y).invoke(aVar);
    }

    @Override // u2.p
    public void b() {
        g gVar = (g) this.f7745y;
        gVar.X.b();
        e5 e5Var = gVar.Z;
        if (e5Var == null) {
        } else {
            throw e5Var;
        }
    }

    @Override // t0.c
    public t0.g build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f7745y).build();
        return new t0.g(new d(build));
    }

    @Override // n9.i4
    public void c(String str, String str2, Bundle bundle) {
        e4 e4Var = (e4) this.f7745y;
        if (TextUtils.isEmpty(str)) {
            n1 n1Var = e4Var.I;
            if (n1Var != null) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.D.b(str2, "AppId not known when logging event");
                return;
            }
            return;
        }
        e4Var.D().m1(new f6.p(this, str, str2, bundle, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.io.Serializable] */
    @Override // kf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kf.i r8, le.c r9) {
        /*
            r7 = this;
            int r0 = r7.f7744x
            switch(r0) {
                case 14: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f7745y
            kf.f1 r0 = (kf.f1) r0
            b1.u r1 = new b1.u
            r2 = 2
            r1.<init>(r8, r2)
            r0.collect(r1, r9)
            me.a r8 = me.a.f8833x
            return r8
        L15:
            boolean r0 = r9 instanceof kf.b0
            if (r0 == 0) goto L28
            r0 = r9
            kf.b0 r0 = (kf.b0) r0
            int r1 = r0.f7923y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L28
            int r1 = r1 - r2
            r0.f7923y = r1
            goto L2d
        L28:
            kf.b0 r0 = new kf.b0
            r0.<init>(r7, r9)
        L2d:
            java.lang.Object r9 = r0.f7922x
            int r1 = r0.f7923y
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 != r2) goto L3e
            java.lang.Object r8 = r0.A
            he.a.f(r9)     // Catch: lf.a -> L3c
            goto L6f
        L3c:
            r9 = move-exception
            goto L6b
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L46:
            he.a.f(r9)
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            kotlin.jvm.internal.u r1 = new kotlin.jvm.internal.u
            r1.<init>()
            java.lang.Object r3 = r7.f7745y     // Catch: lf.a -> L67
            kf.s0 r3 = (kf.s0) r3     // Catch: lf.a -> L67
            kf.z r4 = new kf.z     // Catch: lf.a -> L67
            r5 = 1
            r4.<init>(r1, r8, r9, r5)     // Catch: lf.a -> L67
            r0.A = r9     // Catch: lf.a -> L67
            r0.f7923y = r2     // Catch: lf.a -> L67
            r3.collect(r4, r0)     // Catch: lf.a -> L67
            me.a r8 = me.a.f8833x
            goto L71
        L67:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            java.lang.Object r0 = r9.f8356x
            if (r0 != r8) goto L72
        L6f:
            he.y r8 = he.y.f6101a
        L71:
            return r8
        L72:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.c.collect(kf.i, le.c):java.lang.Object");
    }

    @Override // p.g2
    public void d(o.l lVar, MenuItem menuItem) {
        ((o.f) this.f7745y).C.removeCallbacksAndMessages(lVar);
    }

    @Override // t0.c
    public void e(Uri uri) {
        ((ContentInfo.Builder) this.f7745y).setLinkUri(uri);
    }

    @Override // t6.f
    public t6.b f(t6.a aVar) {
        return null;
    }

    @Override // f.b
    public void g(Object obj) {
        f.a aVar = (f.a) obj;
        p0 p0Var = (p0) this.f7745y;
        k0 k0Var = (k0) p0Var.F.pollFirst();
        if (k0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = k0Var.f6925x;
        int i6 = k0Var.f6926y;
        y j = p0Var.f6945c.j(str);
        if (j == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        j.q(i6, aVar.f4587x, aVar.f4588y);
    }

    @Override // n9.o2
    public void h(int i6, Throwable th, byte[] bArr) {
        int i10;
        u0 u0Var;
        u0 u0Var2;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        n1 n1Var = (n1) this.f7745y;
        u0 u0Var3 = n1Var.C;
        if (i6 != 200 && i6 != 204) {
            i10 = 304;
            if (i6 != 304) {
                i10 = i6;
                n1.g(u0Var3);
                u0Var3.G.c(Integer.valueOf(i10), th, "Network Request for Deferred Deep Link failed. response, exception");
            }
        } else {
            i10 = i6;
        }
        if (th == null) {
            c1 c1Var = n1Var.B;
            n1.e(c1Var);
            c1Var.R.b(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (TextUtils.isEmpty(optString)) {
                        n1.g(u0Var3);
                        u0Var3.K.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String optString2 = jSONObject.optString("gclid", HttpUrl.FRAGMENT_ENCODE_SET);
                    String optString3 = jSONObject.optString("gbraid", HttpUrl.FRAGMENT_ENCODE_SET);
                    String optString4 = jSONObject.optString("gad_source", HttpUrl.FRAGMENT_ENCODE_SET);
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle2 = new Bundle();
                    j4 j4Var = n1Var.F;
                    n1.e(j4Var);
                    n1 n1Var2 = (n1) j4Var.f4301y;
                    if (TextUtils.isEmpty(optString)) {
                        u0Var2 = u0Var3;
                    } else {
                        Context context = n1Var2.f9413x;
                        u0Var2 = u0Var3;
                        try {
                            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(optString3)) {
                                    bundle2.putString("gbraid", optString3);
                                }
                                if (!TextUtils.isEmpty(optString4)) {
                                    bundle2.putString("gad_source", optString4);
                                }
                                bundle2.putString("gclid", optString2);
                                bundle2.putString("_cis", "ddp");
                                n1Var.J.k1("auto", "_cmp", bundle2);
                                if (!TextUtils.isEmpty(optString)) {
                                    try {
                                        SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                        edit.putString("deeplink", optString);
                                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                        if (edit.commit()) {
                                            Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                            Context context2 = n1Var2.f9413x;
                                            if (Build.VERSION.SDK_INT >= 34) {
                                                makeBasic = BroadcastOptions.makeBasic();
                                                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                                bundle = shareIdentityEnabled.toBundle();
                                                context2.sendBroadcast(intent, null, bundle);
                                                return;
                                            }
                                            context2.sendBroadcast(intent);
                                            return;
                                        }
                                        return;
                                    } catch (RuntimeException e10) {
                                        u0 u0Var4 = ((n1) j4Var.f4301y).C;
                                        n1.g(u0Var4);
                                        u0Var4.D.b(e10, "Failed to persist Deferred Deep Link. exception");
                                        return;
                                    }
                                }
                                return;
                            }
                        } catch (JSONException e11) {
                            e = e11;
                            u0Var = u0Var2;
                            n1.g(u0Var);
                            u0Var.D.b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    n1.g(u0Var2);
                    u0Var = u0Var2;
                    try {
                        u0Var.G.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                        return;
                    } catch (JSONException e12) {
                        e = e12;
                        n1.g(u0Var);
                        u0Var.D.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e13) {
                    e = e13;
                    u0Var = u0Var3;
                }
            } else {
                n1.g(u0Var3);
                u0Var3.K.a("Deferred Deep Link response empty.");
                return;
            }
        }
        n1.g(u0Var3);
        u0Var3.G.c(Integer.valueOf(i10), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    @Override // v6.j
    public void i() {
        FullBannerActivity fullBannerActivity = (FullBannerActivity) this.f7745y;
        o[] oVarArr = FullBannerActivity.H;
        fullBannerActivity.T().f3144d.setAlpha(1.0f);
    }

    @Override // t0.c
    public void j(int i6) {
        ((ContentInfo.Builder) this.f7745y).setFlags(i6);
    }

    @Override // g5.b
    public g5.a k(String fileName) {
        k.e(fileName, "fileName");
        return new a5.a(((h5.d) this.f7745y).G());
    }

    @Override // p.g2
    public void n(o.l lVar, n nVar) {
        o.f fVar = (o.f) this.f7745y;
        Handler handler = fVar.C;
        e eVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.E;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                if (lVar == ((e) arrayList.get(i6)).f9763b) {
                    break;
                } else {
                    i6++;
                }
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 == -1) {
            return;
        }
        int i10 = i6 + 1;
        if (i10 < arrayList.size()) {
            eVar = (e) arrayList.get(i10);
        }
        handler.postAtTime(new f6.p(this, eVar, nVar, lVar, 10), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // v6.j
    public void onSuccess() {
        FullBannerActivity fullBannerActivity = (FullBannerActivity) this.f7745y;
        o[] oVarArr = FullBannerActivity.H;
        fullBannerActivity.T().f3144d.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).withEndAction(new a1.e(fullBannerActivity, 3));
    }

    @Override // t6.f
    public void p(t6.a aVar, Bitmap bitmap, Map map) {
        ((j2.y) this.f7745y).u(aVar, bitmap, map, a8.b.e(bitmap));
    }

    @Override // t0.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f7745y).setExtras(bundle);
    }

    public String toString() {
        switch (this.f7744x) {
            case 17:
                StringBuilder sb2 = new StringBuilder(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                for (y1 y1Var : y1.values()) {
                    n9.h hVar = (n9.h) ((EnumMap) this.f7745y).get(y1Var);
                    if (hVar == null) {
                        hVar = n9.h.UNSET;
                    }
                    sb2.append(hVar.f9336x);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(String str, String str2) {
        r rVar = (r) this.f7745y;
        String a10 = m2.o.a(str.trim());
        String trim = str2.trim();
        rVar.getClass();
        db.r.d(a10, trim);
        v vVar = (v) rVar.f12916y;
        if (vVar == null) {
            vVar = v.a();
            rVar.f12916y = vVar;
        }
        db.e0 e0Var = (db.e0) vVar.get(a10);
        if (e0Var == null) {
            i0 i0Var = db.k0.f4008y;
            db.r.e(4, "expectedSize");
            e0Var = new db.e0(4);
            v vVar2 = (v) rVar.f12916y;
            if (vVar2 == null) {
                vVar2 = v.a();
                rVar.f12916y = vVar2;
            }
            vVar2.put(a10, e0Var);
        }
        e0Var.c(trim);
    }

    @Override // t0.s
    public w1 v(View view, w1 w1Var) {
        boolean z10;
        t1 t1Var = w1Var.f12417a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7745y;
        if (!Objects.equals(coordinatorLayout.K, w1Var)) {
            coordinatorLayout.K = w1Var;
            boolean z11 = true;
            if (w1Var.d() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            coordinatorLayout.L = z10;
            if (z10 || coordinatorLayout.getBackground() != null) {
                z11 = false;
            }
            coordinatorLayout.setWillNotDraw(z11);
            if (!t1Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = coordinatorLayout.getChildAt(i6);
                    WeakHashMap weakHashMap = q0.f12397a;
                    if (childAt.getFitsSystemWindows() && ((f0.e) childAt.getLayoutParams()).f4611a != null && t1Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return w1Var;
    }

    public void w(List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            String str = (String) list.get(i6);
            String str2 = a0.f12750a;
            String[] split = str.split(":\\s?", 2);
            if (split.length == 2) {
                u(split[0], split[1]);
            }
        }
    }

    public synchronized void x() {
        ((SharedPreferences) this.f7745y).edit().clear().commit();
    }

    public File z(String str) {
        File file = new File(A(), y(str, b.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(A(), y(str, b.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(A(), y(str, b.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public c(EnumMap enumMap) {
        this.f7744x = 17;
        EnumMap enumMap2 = new EnumMap(y1.class);
        this.f7745y = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public c(int i6) {
        this.f7744x = i6;
        switch (i6) {
            case 10:
                this.f7745y = null;
                return;
            case 13:
                this.f7745y = new Bundle();
                return;
            case 15:
                this.f7745y = new r(4, false);
                return;
            case 17:
                this.f7745y = new EnumMap(y1.class);
                return;
            case 27:
                this.f7745y = new CopyOnWriteArrayList();
                return;
            case 29:
                this.f7745y = new HashMap();
                return;
            default:
                this.f7745y = new Handler();
                return;
        }
    }

    public c(h5.d openHelper) {
        this.f7744x = 1;
        k.e(openHelper, "openHelper");
        this.f7745y = openHelper;
    }

    public c(l produceNewData) {
        this.f7744x = 2;
        k.e(produceNewData, "produceNewData");
        this.f7745y = produceNewData;
    }

    public c(HashSet hashSet, fd.o oVar) {
        this.f7744x = 23;
        this.f7745y = hashSet;
    }

    public c(Context context) {
        boolean isEmpty;
        this.f7744x = 11;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f7745y = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                x();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    @Override // p.y0
    public void o(int i6) {
    }

    @Override // t6.f
    public void q(int i6) {
    }

    @Override // p.y0
    public void s(int i6) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int i6, String str, String str2) {
        this(15);
        this.f7744x = 15;
        u("User-Agent", str);
        u("CSeq", String.valueOf(i6));
        if (str2 != null) {
            u("Session", str2);
        }
    }

    public c(TextView textView) {
        this.f7744x = 8;
        this.f7745y = new g1.g(textView);
    }

    public c(ClipData clipData, int i6) {
        this.f7744x = 25;
        this.f7745y = c2.a.o(clipData, i6);
    }

    @Override // p.y0
    public void t(int i6, float f3) {
    }
}
