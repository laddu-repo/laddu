package ic;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: i, reason: collision with root package name */
    public static final long f6807i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6808a;

    /* renamed from: b, reason: collision with root package name */
    public final o f6809b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.d f6810c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f6811d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6813f;

    /* renamed from: h, reason: collision with root package name */
    public final x f6815h;

    /* renamed from: e, reason: collision with root package name */
    public final v.e f6812e = new v.l(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f6814g = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [v.l, v.e] */
    public z(FirebaseMessaging firebaseMessaging, o oVar, x xVar, androidx.lifecycle.d dVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f6811d = firebaseMessaging;
        this.f6809b = oVar;
        this.f6815h = xVar;
        this.f6810c = dVar;
        this.f6808a = context;
        this.f6813f = scheduledThreadPoolExecutor;
    }

    public static void b(s9.n nVar) {
        try {
            dg.b.b(nVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e11);
            }
            throw ((IOException) cause);
        }
    }

    public static boolean e() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void a(w wVar, s9.h hVar) {
        ArrayDeque arrayDeque;
        synchronized (this.f6812e) {
            try {
                String str = wVar.f6797c;
                if (this.f6812e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) this.f6812e.get(str);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f6812e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        String a10 = this.f6811d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        androidx.lifecycle.d dVar = this.f6810c;
        b(dVar.f(dVar.m(a10, "/topics/" + str, bundle)));
    }

    public final void d(String str) {
        String a10 = this.f6811d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        androidx.lifecycle.d dVar = this.f6810c;
        b(dVar.f(dVar.m(a10, "/topics/" + str, bundle)));
    }

    public final void f(w wVar) {
        synchronized (this.f6812e) {
            try {
                String str = wVar.f6797c;
                if (!this.f6812e.containsKey(str)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.f6812e.get(str);
                s9.h hVar = (s9.h) arrayDeque.poll();
                if (hVar != null) {
                    hVar.a(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f6812e.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void g(boolean z10) {
        this.f6814g = z10;
    }

    public final void h() {
        boolean z10;
        if (this.f6815h.a() != null) {
            synchronized (this) {
                z10 = this.f6814g;
            }
            if (!z10) {
                j(0L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089 A[Catch: IOException -> 0x005d, TRY_LEAVE, TryCatch #1 {IOException -> 0x005d, blocks: (B:8:0x0028, B:13:0x0083, B:15:0x0089, B:19:0x0039, B:21:0x0041, B:23:0x004a, B:26:0x005f, B:28:0x0067, B:30:0x0070), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.z.i():boolean");
    }

    public final void j(long j10) {
        this.f6813f.schedule(new b0(this, this.f6808a, this.f6809b, Math.min(Math.max(30L, 2 * j10), f6807i)), j10, TimeUnit.SECONDS);
        g(true);
    }
}
