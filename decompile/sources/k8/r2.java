package k8;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.ee;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.y7;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f7735w;

    public r2(u2 u2Var) {
        this.f7734v = 0;
        this.f7735w = u2Var;
    }

    public void a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f7735w;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e7) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e7);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    ja.b bVar = (ja.b) fa.g.c().b(ja.b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (bVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        ja.c cVar = (ja.c) bVar;
                        if (ka.a.a("fcm") && ka.a.c("fcm", "_ln")) {
                            y7 y7Var = cVar.f7002a.f3300a;
                            y7Var.c(new k7(y7Var, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        cVar.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            android.support.v4.media.session.b.B("_no", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:22:0x0048, B:25:0x004f, B:30:0x0061, B:35:0x006e, B:15:0x002d, B:17:0x0034, B:19:0x0040), top: B:44:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(com.google.android.gms.internal.measurement.j7 r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f7735w
            r1 = r0
            k8.u2 r1 = (k8.u2) r1
            java.lang.Object r0 = r1.f2053w     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            k8.p1 r0 = (k8.p1) r0     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            k8.v0 r2 = r0.A     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            k8.p1.l(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            k8.t0 r2 = r2.J     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "onActivityCreated"
            r2.a(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            android.content.Intent r2 = r9.f2793x     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L7d
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 == 0) goto L2d
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r4 != 0) goto L26
            goto L2d
        L26:
            r5 = r3
            goto L46
        L28:
            r0 = move-exception
            goto L9f
        L2b:
            r0 = move-exception
            goto L8a
        L2d:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r4 = 0
            if (r3 == 0) goto L45
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r5 != 0) goto L45
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L26
        L45:
            r5 = r4
        L46:
            if (r5 == 0) goto L7d
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L4f
            goto L7d
        L4f:
            k8.t4 r3 = r0.D     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            k8.p1.j(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r2 = k8.t4.G0(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L5e
            java.lang.String r2 = "gs"
        L5c:
            r6 = r2
            goto L61
        L5e:
            java.lang.String r2 = "auto"
            goto L5c
        L61:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r10 != 0) goto L6c
            r2 = 1
        L6a:
            r4 = r2
            goto L6e
        L6c:
            r2 = 0
            goto L6a
        L6e:
            k8.n1 r0 = r0.B     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            k8.p1.l(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            k8.l2 r2 = new k8.l2     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r0.M(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L9a
        L7d:
            java.lang.Object r0 = r1.f2053w
            k8.p1 r0 = (k8.p1) r0
        L81:
            k8.f3 r0 = r0.G
            k8.p1.k(r0)
            r0.K(r9, r10)
            return
        L8a:
            java.lang.Object r2 = r1.f2053w     // Catch: java.lang.Throwable -> L28
            k8.p1 r2 = (k8.p1) r2     // Catch: java.lang.Throwable -> L28
            k8.v0 r2 = r2.A     // Catch: java.lang.Throwable -> L28
            k8.p1.l(r2)     // Catch: java.lang.Throwable -> L28
            k8.t0 r2 = r2.B     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.b(r0, r3)     // Catch: java.lang.Throwable -> L28
        L9a:
            java.lang.Object r0 = r1.f2053w
            k8.p1 r0 = (k8.p1) r0
            goto L81
        L9f:
            java.lang.Object r1 = r1.f2053w
            k8.p1 r1 = (k8.p1) r1
            k8.f3 r1 = r1.G
            k8.p1.k(r1)
            r1.K(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.r2.j(com.google.android.gms.internal.measurement.j7, android.os.Bundle):void");
    }

    public void k(j7 j7Var) {
        f3 f3Var = ((p1) ((u2) this.f7735w).f2053w).G;
        p1.k(f3Var);
        synchronized (f3Var.H) {
            try {
                if (Objects.equals(f3Var.C, j7Var)) {
                    f3Var.C = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((p1) f3Var.f2053w).f7695y.S()) {
            f3Var.B.remove(Integer.valueOf(j7Var.f2791v));
        }
    }

    public void l(j7 j7Var) {
        p1 p1Var = (p1) ((u2) this.f7735w).f2053w;
        f3 f3Var = p1Var.G;
        p1.k(f3Var);
        synchronized (f3Var.H) {
            f3Var.G = false;
            f3Var.D = true;
        }
        p1 p1Var2 = (p1) f3Var.f2053w;
        p1Var2.F.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (p1Var2.f7695y.S()) {
            c3 c3VarN = f3Var.N(j7Var);
            f3Var.f7539z = f3Var.f7538y;
            f3Var.f7538y = null;
            n1 n1Var = p1Var2.B;
            p1.l(n1Var);
            n1Var.M(new ee(f3Var, c3VarN, jElapsedRealtime));
        } else {
            f3Var.f7538y = null;
            n1 n1Var2 = p1Var2.B;
            p1.l(n1Var2);
            n1Var2.M(new x(f3Var, jElapsedRealtime));
        }
        x3 x3Var = p1Var.C;
        p1.k(x3Var);
        p1 p1Var3 = (p1) x3Var.f2053w;
        p1Var3.F.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        n1 n1Var3 = p1Var3.B;
        p1.l(n1Var3);
        n1Var3.M(new t3(x3Var, jElapsedRealtime2, 1));
    }

    public void m(j7 j7Var) {
        p1 p1Var = (p1) ((u2) this.f7735w).f2053w;
        x3 x3Var = p1Var.C;
        p1.k(x3Var);
        p1 p1Var2 = (p1) x3Var.f2053w;
        p1Var2.F.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        n1 n1Var = p1Var2.B;
        p1.l(n1Var);
        n1Var.M(new t3(x3Var, jElapsedRealtime, 0));
        f3 f3Var = p1Var.G;
        p1.k(f3Var);
        Object obj = f3Var.H;
        synchronized (obj) {
            try {
                f3Var.G = true;
                if (!Objects.equals(j7Var, f3Var.C)) {
                    synchronized (obj) {
                        f3Var.C = j7Var;
                        f3Var.D = false;
                        p1 p1Var3 = (p1) f3Var.f2053w;
                        if (p1Var3.f7695y.S()) {
                            f3Var.E = null;
                            n1 n1Var2 = p1Var3.B;
                            p1.l(n1Var2);
                            n1Var2.M(new e3(f3Var, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p1 p1Var4 = (p1) f3Var.f2053w;
        if (!p1Var4.f7695y.S()) {
            f3Var.f7538y = f3Var.E;
            n1 n1Var3 = p1Var4.B;
            p1.l(n1Var3);
            n1Var3.M(new e3(f3Var, 0));
            return;
        }
        f3Var.L(j7Var.f2792w, f3Var.N(j7Var), false);
        y yVar = ((p1) f3Var.f2053w).I;
        p1.i(yVar);
        p1 p1Var5 = (p1) yVar.f2053w;
        p1Var5.F.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        n1 n1Var4 = p1Var5.B;
        p1.l(n1Var4);
        n1Var4.M(new x(yVar, jElapsedRealtime2));
    }

    public void n(j7 j7Var, Bundle bundle) {
        c3 c3Var;
        f3 f3Var = ((p1) ((u2) this.f7735w).f2053w).G;
        p1.k(f3Var);
        if (!((p1) f3Var.f2053w).f7695y.S() || bundle == null || (c3Var = (c3) f3Var.B.get(Integer.valueOf(j7Var.f2791v))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c3Var.f7429c);
        bundle2.putString("name", c3Var.f7427a);
        bundle2.putString("referrer_name", c3Var.f7428b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f7734v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                j(j7.a(activity), bundle);
                break;
            default:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new o2.i0(5, this, intent));
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f7734v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                k(j7.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f7734v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                l(j7.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f7734v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                m(j7.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f7734v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                n(j7.a(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.f7734v;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.f7734v;
    }

    public r2() {
        this.f7734v = 1;
        this.f7735w = new ArrayDeque(10);
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
