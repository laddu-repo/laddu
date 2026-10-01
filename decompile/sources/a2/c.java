package a2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.j5;
import com.google.firebase.messaging.FirebaseMessaging;
import com.playfy.tv.activities.PlayerActivity;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements f2.y, y2.q {
    public final Object A;

    /* renamed from: x, reason: collision with root package name */
    public boolean f170x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f171y;

    /* renamed from: z, reason: collision with root package name */
    public Object f172z;

    public c(n9.c1 c1Var, String str) {
        this.A = c1Var;
        w8.x.d(str);
        this.f171y = str;
    }

    public static void b(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f3 = fArr2[10];
        float f10 = fArr2[8];
        float sqrt = (float) Math.sqrt((f10 * f10) + (f3 * f3));
        float f11 = fArr2[10] / sqrt;
        fArr[0] = f11;
        float f12 = fArr2[8];
        fArr[2] = f12 / sqrt;
        fArr[8] = (-f12) / sqrt;
        fArr[10] = f11;
    }

    @Override // y2.q
    public y2.f0 A(int i6, int i10) {
        SparseArray sparseArray = (SparseArray) this.A;
        y2.q qVar = (y2.q) this.f171y;
        if (i10 != 3) {
            this.f170x = true;
            return qVar.A(i6, i10);
        }
        v3.n nVar = (v3.n) sparseArray.get(i6);
        if (nVar != null) {
            return nVar;
        }
        v3.n nVar2 = new v3.n(qVar.A(i6, i10), (v3.k) this.f172z);
        sparseArray.put(i6, nVar2);
        return nVar2;
    }

    public void a(boolean z10) {
        n6.e eVar = (n6.e) this.A;
        synchronized (eVar) {
            try {
                if (!this.f170x) {
                    if (kotlin.jvm.internal.k.a(((n6.a) this.f171y).f9068g, this)) {
                        n6.e.d(eVar, this, z10);
                    }
                    this.f170x = true;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public bg.c0 c(int i6) {
        bg.c0 c0Var;
        n6.e eVar = (n6.e) this.A;
        synchronized (eVar) {
            if (!this.f170x) {
                ((boolean[]) this.f172z)[i6] = true;
                Object obj = ((n6.a) this.f171y).f9065d.get(i6);
                n6.c cVar = eVar.M;
                bg.c0 c0Var2 = (bg.c0) obj;
                if (!cVar.f(c0Var2)) {
                    a7.f.a(cVar.k(c0Var2));
                }
                c0Var = (bg.c0) obj;
            } else {
                throw new IllegalStateException("editor is closed");
            }
        }
        return c0Var;
    }

    @Override // f2.y
    public byte[] d(UUID uuid, f2.r rVar) {
        String str;
        String str2 = rVar.f4681b;
        if (this.f170x || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f172z;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = r1.g.f11403e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (r1.g.f11401c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put(CommonGatewayClient.HEADER_CONTENT_TYPE, str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.A)) {
                hashMap.putAll((HashMap) this.A);
            }
            return j5.h(((d0.g) this.f171y).c(), str2, rVar.f4680a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        u1.c.i(uri, "The uri must be set.");
        throw new f2.z(new w1.l(uri, 1, null, map, 0L, -1L, null, 0), uri, db.h1.D, 0L, new IllegalStateException("No license URL"));
    }

    public synchronized void e() {
        try {
            if (this.f170x) {
                return;
            }
            Boolean j = j();
            this.f172z = j;
            if (j == null) {
                i4.u0 u0Var = new i4.u0(13);
                qb.j jVar = (qb.j) ((yb.c) this.f171y);
                jVar.a(jVar.f11173c, u0Var);
            }
            this.f170x = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean f() {
        boolean h4;
        try {
            e();
            Boolean bool = (Boolean) this.f172z;
            if (bool != null) {
                h4 = bool.booleanValue();
            } else {
                h4 = ((FirebaseMessaging) this.A).f2842a.h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return h4;
    }

    public boolean g(int[] tableIds) {
        kotlin.jvm.internal.k.e(tableIds, "tableIds");
        ReentrantLock reentrantLock = (ReentrantLock) this.f171y;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i6 : tableIds) {
                long[] jArr = (long[]) this.f172z;
                long j = jArr[i6];
                jArr[i6] = 1 + j;
                if (j == 0) {
                    z10 = true;
                    this.f170x = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // f2.y
    public byte[] h(f2.s sVar) {
        return j5.h(((d0.g) this.f171y).c(), sVar.f4683b + "&signedRequest=" + u1.a0.o(sVar.f4682a), null, Collections.EMPTY_MAP);
    }

    public boolean i(int[] tableIds) {
        kotlin.jvm.internal.k.e(tableIds, "tableIds");
        ReentrantLock reentrantLock = (ReentrantLock) this.f171y;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i6 : tableIds) {
                long[] jArr = (long[]) this.f172z;
                long j = jArr[i6];
                jArr[i6] = j - 1;
                if (j == 1) {
                    z10 = true;
                    this.f170x = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public Boolean j() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        jb.g gVar = ((FirebaseMessaging) this.A).f2842a;
        gVar.a();
        Context context = gVar.f7331a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void k() {
        u1.x xVar = (u1.x) this.A;
        if (!this.f170x) {
            return;
        }
        xVar.c(new a(this, 0));
        this.f170x = false;
    }

    public String l() {
        if (!this.f170x) {
            this.f170x = true;
            n9.c1 c1Var = (n9.c1) this.A;
            this.f172z = c1Var.h1().getString((String) this.f171y, null);
        }
        return (String) this.f172z;
    }

    public void m(String str) {
        SharedPreferences.Editor edit = ((n9.c1) this.A).h1().edit();
        edit.putString((String) this.f171y, str);
        edit.apply();
        this.f172z = str;
    }

    @Override // y2.q
    public void n(y2.z zVar) {
        ((y2.q) this.f171y).n(zVar);
    }

    @Override // y2.q
    public void t() {
        SparseArray sparseArray = (SparseArray) this.A;
        ((y2.q) this.f171y).t();
        if (this.f170x) {
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                ((v3.n) sparseArray.valueAt(i6)).f13293i = true;
            }
        }
    }

    public c() {
        this.f171y = new float[16];
        this.f172z = new float[16];
        this.A = new s3.c();
    }

    public c(y2.q qVar, v3.k kVar) {
        this.f171y = qVar;
        this.f172z = kVar;
        this.A = new SparseArray();
    }

    public c(PlayerActivity playerActivity, Looper looper, Looper looper2, k0 k0Var, u1.v vVar) {
        this.f171y = playerActivity.getApplicationContext();
        this.A = vVar.a(looper, null);
        this.f172z = new b(this, vVar.a(looper2, null), k0Var);
    }

    public c(String str, boolean z10, d0.g gVar) {
        u1.c.b((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f171y = gVar;
        this.f172z = str;
        this.f170x = z10;
        this.A = new HashMap();
    }

    public c(Context context, String str, ca.e callback, boolean z10) {
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(callback, "callback");
        this.f171y = context;
        this.f172z = str;
        this.A = callback;
        this.f170x = z10;
    }

    public c(int i6) {
        this.f171y = new ReentrantLock();
        this.f172z = new long[i6];
        this.A = new boolean[i6];
    }

    public c(n6.e eVar, n6.a aVar) {
        this.A = eVar;
        this.f171y = aVar;
        this.f172z = new boolean[2];
    }

    public c(FirebaseMessaging firebaseMessaging, yb.c cVar) {
        this.A = firebaseMessaging;
        this.f171y = cVar;
    }

    public c(Context context, t2.q qVar, Boolean bool) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager l10 = context == null ? null : s1.c.l(context);
        if (l10 != null && (bool == null || !bool.booleanValue())) {
            spatializer = l10.getSpatializer();
            this.f171y = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.f170x = immersiveAudioLevel != 0;
            t2.l lVar = new t2.l(qVar);
            this.A = lVar;
            Looper myLooper = Looper.myLooper();
            u1.c.h(myLooper);
            Handler handler = new Handler(myLooper);
            this.f172z = handler;
            spatializer.addOnSpatializerStateChangedListener(new c2.g0(handler, 0), lVar);
            return;
        }
        this.f171y = null;
        this.f170x = false;
        this.f172z = null;
        this.A = null;
    }
}
