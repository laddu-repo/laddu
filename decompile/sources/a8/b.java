package a8;

import a2.a2;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.x3;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qb.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {
    public static void a(StringBuilder sb2, Object obj, ve.l lVar) {
        boolean z10;
        if (lVar != null) {
            sb2.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof CharSequence;
        }
        if (z10) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(jf.v r4, ve.a r5, ne.c r6) {
        /*
            boolean r0 = r6 instanceof jf.t
            if (r0 == 0) goto L13
            r0 = r6
            jf.t r0 = (jf.t) r0
            int r1 = r0.f7480z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7480z = r1
            goto L18
        L13:
            jf.t r0 = new jf.t
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7479y
            int r1 = r0.f7480z
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            kotlin.jvm.internal.l r4 = r0.f7478x
            r5 = r4
            ve.a r5 = (ve.a) r5
            he.a.f(r6)     // Catch: java.lang.Throwable -> L2a
            goto L6a
        L2a:
            r4 = move-exception
            goto L70
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            he.a.f(r6)
            le.h r6 = r0.getContext()
            gf.i1 r1 = gf.i1.f5682x
            le.f r6 = r6.get(r1)
            if (r6 != r4) goto L74
            r6 = r5
            kotlin.jvm.internal.l r6 = (kotlin.jvm.internal.l) r6     // Catch: java.lang.Throwable -> L2a
            r0.f7478x = r6     // Catch: java.lang.Throwable -> L2a
            r0.f7480z = r2     // Catch: java.lang.Throwable -> L2a
            gf.k r6 = new gf.k     // Catch: java.lang.Throwable -> L2a
            le.c r0 = a8.c.i(r0)     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L2a
            r6.s()     // Catch: java.lang.Throwable -> L2a
            b1.r r0 = new b1.r     // Catch: java.lang.Throwable -> L2a
            r1 = 2
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L2a
            jf.u r4 = (jf.u) r4     // Catch: java.lang.Throwable -> L2a
            r4.c0(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L2a
            me.a r6 = me.a.f8833x
            if (r4 != r6) goto L6a
            return r6
        L6a:
            r5.invoke()
            he.y r4 = he.y.f6101a
            return r4
        L70:
            r5.invoke()
            throw r4
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.b.b(jf.v, ve.a, ne.c):java.lang.Object");
    }

    public static boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            jb.g.c();
            jb.g c10 = jb.g.c();
            c10.a();
            Context context = c10.f7331a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static void d(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i6 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            qb.b bVar = (qb.b) obj;
            qb.f fVar = new qb.f(bVar);
            for (p pVar : bVar.f11154b) {
                if (bVar.f11157e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qb.g gVar = new qb.g(pVar, !z11);
                if (!hashMap.containsKey(gVar)) {
                    hashMap.put(gVar, new HashSet());
                }
                Set set = (Set) hashMap.get(gVar);
                if (!set.isEmpty() && z11) {
                    throw new IllegalArgumentException("Multiple components provide " + pVar + ".");
                }
                set.add(fVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (qb.f fVar2 : (Set) it.next()) {
                for (qb.h hVar : fVar2.f11163a.f11155c) {
                    if (hVar.f11170c == 0) {
                        p pVar2 = hVar.f11168a;
                        if (hVar.f11169b == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Set<qb.f> set2 = (Set) hashMap.get(new qb.g(pVar2, z10));
                        if (set2 != null) {
                            for (qb.f fVar3 : set2) {
                                fVar2.f11164b.add(fVar3);
                                fVar3.f11165c.add(fVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            qb.f fVar4 = (qb.f) it3.next();
            if (fVar4.f11165c.isEmpty()) {
                hashSet2.add(fVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            qb.f fVar5 = (qb.f) hashSet2.iterator().next();
            hashSet2.remove(fVar5);
            i6++;
            Iterator it4 = fVar5.f11164b.iterator();
            while (it4.hasNext()) {
                qb.f fVar6 = (qb.f) it4.next();
                fVar6.f11165c.remove(fVar5);
                if (fVar6.f11165c.isEmpty()) {
                    hashSet2.add(fVar6);
                }
            }
        }
        if (i6 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            qb.f fVar7 = (qb.f) it5.next();
            if (!fVar7.f11165c.isEmpty() && !fVar7.f11164b.isEmpty()) {
                arrayList2.add(fVar7.f11163a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final int e(Bitmap bitmap) {
        int i6;
        Bitmap.Config config;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 == Bitmap.Config.ALPHA_8) {
                    i6 = 1;
                } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                    i6 = 2;
                } else {
                    if (Build.VERSION.SDK_INT >= 26) {
                        config = Bitmap.Config.RGBA_F16;
                        if (config2 == config) {
                            i6 = 8;
                        }
                    }
                    i6 = 4;
                }
                return height * i6;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final tg.a f(ComponentCallbacks componentCallbacks) {
        kotlin.jvm.internal.k.e(componentCallbacks, "<this>");
        b4.h hVar = ig.a.f6854b;
        if (hVar != null) {
            return ((rg.b) hVar.B).f11958d;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static final boolean g(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.b.h(android.content.Intent):void");
    }

    public static void i(String str, Bundle bundle) {
        String str2;
        try {
            jb.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            if (a2.K(bundle)) {
                str2 = "display";
            } else {
                str2 = JsonStorageKeyNames.DATA_KEY;
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            nb.b bVar = (nb.b) jb.g.c().b(nb.b.class);
            if (bVar != null) {
                ((nb.c) bVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void j(v3.d dVar, int i6, u1.g gVar) {
        long e10 = dVar.e(i6);
        List p10 = dVar.p(e10);
        if (!p10.isEmpty()) {
            if (i6 != dVar.s() - 1) {
                long e11 = dVar.e(i6 + 1) - dVar.e(i6);
                if (e11 > 0) {
                    gVar.accept(new v3.a(e10, e11, p10));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static int k(double d10) {
        if (!Double.isNaN(d10)) {
            if (d10 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d10 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static int l(float f3) {
        if (!Float.isNaN(f3)) {
            return Math.round(f3);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static void m(Window window, boolean z10) {
        int i6;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            m0.a.e(window, z10);
            return;
        }
        if (i10 >= 30) {
            m0.a.d(window, z10);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z10) {
            i6 = systemUiVisibility & (-1793);
        } else {
            i6 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i6);
    }

    public static boolean n(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(extras.getString("google.c.a.e"));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(v3.d r12, v3.l r13, u1.g r14) {
        /*
            long r0 = r13.f13283a
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Le
            r5 = 0
            goto L27
        Le:
            int r5 = r12.c(r0)
            r6 = -1
            if (r5 != r6) goto L19
            int r5 = r12.s()
        L19:
            if (r5 <= 0) goto L27
            int r6 = r5 + (-1)
            long r6 = r12.e(r6)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L27
            int r5 = r5 + (-1)
        L27:
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L51
            int r3 = r12.s()
            if (r5 >= r3) goto L51
            java.util.List r11 = r12.p(r0)
            long r3 = r12.e(r5)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.f13283a
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 >= 0) goto L51
            v3.a r6 = new v3.a
            long r9 = r3 - r7
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
            r3 = 1
            goto L52
        L51:
            r3 = 0
        L52:
            r4 = r5
        L53:
            int r6 = r12.s()
            if (r4 >= r6) goto L5f
            j(r12, r4, r14)
            int r4 = r4 + 1
            goto L53
        L5f:
            boolean r13 = r13.f13284b
            if (r13 == 0) goto L87
            if (r3 == 0) goto L67
            int r5 = r5 + (-1)
        L67:
            if (r2 >= r5) goto L6f
            j(r12, r2, r14)
            int r2 = r2 + 1
            goto L67
        L6f:
            if (r3 == 0) goto L87
            v3.a r6 = new v3.a
            java.util.List r11 = r12.p(r0)
            long r7 = r12.e(r5)
            long r12 = r12.e(r5)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.b.o(v3.d, v3.l, u1.g):void");
    }

    public static n p(Object obj) {
        if (obj == null) {
            return n.f2353b;
        }
        if (obj instanceof String) {
            return new q((String) obj);
        }
        if (obj instanceof Double) {
            return new com.google.android.gms.internal.measurement.g((Double) obj);
        }
        if (obj instanceof Long) {
            return new com.google.android.gms.internal.measurement.g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new com.google.android.gms.internal.measurement.g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new com.google.android.gms.internal.measurement.e((Boolean) obj);
        }
        if (obj instanceof Map) {
            com.google.android.gms.internal.measurement.k kVar = new com.google.android.gms.internal.measurement.k();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                n p10 = p(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    kVar.c((String) obj2, p10);
                }
            }
            return kVar;
        }
        if (obj instanceof List) {
            com.google.android.gms.internal.measurement.d dVar = new com.google.android.gms.internal.measurement.d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dVar.o(dVar.m(), p(it.next()));
            }
            return dVar;
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    public static n q(x3 x3Var) {
        if (x3Var == null) {
            return n.f2352a;
        }
        int x10 = x3Var.x() - 1;
        if (x10 != 1) {
            if (x10 != 2) {
                if (x10 != 3) {
                    if (x10 == 4) {
                        List p10 = x3Var.p();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = p10.iterator();
                        while (it.hasNext()) {
                            arrayList.add(q((x3) it.next()));
                        }
                        return new o(x3Var.q(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                if (x3Var.t()) {
                    return new com.google.android.gms.internal.measurement.e(Boolean.valueOf(x3Var.u()));
                }
                return new com.google.android.gms.internal.measurement.e(null);
            }
            if (x3Var.v()) {
                return new com.google.android.gms.internal.measurement.g(Double.valueOf(x3Var.w()));
            }
            return new com.google.android.gms.internal.measurement.g(null);
        }
        if (x3Var.r()) {
            return new q(x3Var.s());
        }
        return n.f2359h;
    }
}
