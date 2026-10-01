package ic;

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
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.Objects;
import n9.l3;
import n9.m2;
import n9.n1;
import n9.p3;
import n9.u2;
import n9.w2;
import n9.x2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6758x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f6759y;

    public i(m2 m2Var) {
        this.f6758x = 1;
        this.f6759y = m2Var;
    }

    public void a(Intent intent) {
        boolean equals;
        ArrayDeque arrayDeque = (ArrayDeque) this.f6759y;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (!arrayDeque.contains(string)) {
                        arrayDeque.add(string);
                    } else {
                        return;
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e10);
        }
        if (bundle == null) {
            equals = false;
        } else {
            equals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(bundle.getString("google.c.a.e"));
        }
        if (equals) {
            if (bundle != null) {
                if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(bundle.getString("google.c.a.tc"))) {
                    nb.b bVar = (nb.b) jb.g.c().b(nb.b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (bVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        nb.c cVar = (nb.c) bVar;
                        if (!ob.b.f10042b.contains("fcm") && ob.b.b("fcm", "_ln")) {
                            l1 l1Var = (l1) cVar.f9588a.f12916y;
                            l1Var.c(new y0(l1Var, string2, 0));
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
            a8.b.i("_no", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:12:0x0049, B:15:0x0050, B:17:0x0063, B:19:0x006b, B:24:0x007b, B:27:0x0088, B:35:0x002e, B:37:0x0035, B:39:0x0041), top: B:2:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(com.google.android.gms.internal.measurement.x0 r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f6759y
            r1 = r0
            n9.m2 r1 = (n9.m2) r1
            java.lang.Object r0 = r1.f4301y     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            n9.n1 r0 = (n9.n1) r0     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            n9.u0 r2 = r0.C     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            n9.n1.g(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            n9.s0 r2 = r2.L     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "onActivityCreated"
            r2.a(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            android.content.Intent r2 = r9.f2519z     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L97
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 == 0) goto L2e
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r4 != 0) goto L26
            goto L2e
        L26:
            r5 = r3
            goto L47
        L28:
            r0 = move-exception
            goto Lb9
        L2b:
            r0 = move-exception
            goto La4
        L2e:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r4 = 0
            if (r3 == 0) goto L46
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r5 != 0) goto L46
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L26
        L46:
            r5 = r4
        L47:
            if (r5 == 0) goto L97
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L50
            goto L97
        L50:
            n9.j4 r3 = r0.F     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            n9.n1.e(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L78
            java.lang.String r3 = "https://www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L78
            java.lang.String r3 = "android-app://com.google.appcrawler"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L74
            goto L78
        L74:
            java.lang.String r2 = "auto"
        L76:
            r6 = r2
            goto L7b
        L78:
            java.lang.String r2 = "gs"
            goto L76
        L7b:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r10 != 0) goto L86
            r2 = 1
            r4 = 1
            goto L88
        L86:
            r2 = 0
            r4 = 0
        L88:
            n9.l1 r0 = r0.D     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            n9.n1.g(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            n9.f2 r2 = new n9.f2     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r0.m1(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto Lb4
        L97:
            java.lang.Object r0 = r1.f4301y
            n9.n1 r0 = (n9.n1) r0
        L9b:
            n9.x2 r0 = r0.I
            n9.n1.f(r0)
            r0.l1(r9, r10)
            return
        La4:
            java.lang.Object r2 = r1.f4301y     // Catch: java.lang.Throwable -> L28
            n9.n1 r2 = (n9.n1) r2     // Catch: java.lang.Throwable -> L28
            n9.u0 r2 = r2.C     // Catch: java.lang.Throwable -> L28
            n9.n1.g(r2)     // Catch: java.lang.Throwable -> L28
            n9.s0 r2 = r2.D     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.b(r0, r3)     // Catch: java.lang.Throwable -> L28
        Lb4:
            java.lang.Object r0 = r1.f4301y
            n9.n1 r0 = (n9.n1) r0
            goto L9b
        Lb9:
            java.lang.Object r1 = r1.f4301y
            n9.n1 r1 = (n9.n1) r1
            n9.x2 r1 = r1.I
            n9.n1.f(r1)
            r1.l1(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.i.j(com.google.android.gms.internal.measurement.x0, android.os.Bundle):void");
    }

    public void k(x0 x0Var) {
        x2 x2Var = ((n1) ((m2) this.f6759y).f4301y).I;
        n1.f(x2Var);
        synchronized (x2Var.J) {
            try {
                if (Objects.equals(x2Var.E, x0Var)) {
                    x2Var.E = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!((n1) x2Var.f4301y).A.r1()) {
            return;
        }
        x2Var.D.remove(Integer.valueOf(x0Var.f2517x));
    }

    public void l(x0 x0Var) {
        n1 n1Var = (n1) ((m2) this.f6759y).f4301y;
        x2 x2Var = n1Var.I;
        n1.f(x2Var);
        synchronized (x2Var.J) {
            x2Var.I = false;
            x2Var.F = true;
        }
        n1 n1Var2 = (n1) x2Var.f4301y;
        n1Var2.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!n1Var2.A.r1()) {
            x2Var.A = null;
            n9.l1 l1Var = n1Var2.D;
            n1.g(l1Var);
            l1Var.m1(new n9.x(x2Var, elapsedRealtime));
        } else {
            u2 i12 = x2Var.i1(x0Var);
            x2Var.B = x2Var.A;
            x2Var.A = null;
            n9.l1 l1Var2 = n1Var2.D;
            n1.g(l1Var2);
            l1Var2.m1(new n9.a(x2Var, i12, elapsedRealtime));
        }
        p3 p3Var = n1Var.E;
        n1.f(p3Var);
        n1 n1Var3 = (n1) p3Var.f4301y;
        n1Var3.H.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        n9.l1 l1Var3 = n1Var3.D;
        n1.g(l1Var3);
        l1Var3.m1(new l3(p3Var, elapsedRealtime2, 1));
    }

    public void m(x0 x0Var) {
        n1 n1Var = (n1) ((m2) this.f6759y).f4301y;
        p3 p3Var = n1Var.E;
        n1.f(p3Var);
        n1 n1Var2 = (n1) p3Var.f4301y;
        n1Var2.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        n9.l1 l1Var = n1Var2.D;
        n1.g(l1Var);
        l1Var.m1(new l3(p3Var, elapsedRealtime, 0));
        x2 x2Var = n1Var.I;
        n1.f(x2Var);
        Object obj = x2Var.J;
        synchronized (obj) {
            x2Var.I = true;
            if (!Objects.equals(x0Var, x2Var.E)) {
                synchronized (obj) {
                    x2Var.E = x0Var;
                    x2Var.F = false;
                    n1 n1Var3 = (n1) x2Var.f4301y;
                    if (n1Var3.A.r1()) {
                        x2Var.G = null;
                        n9.l1 l1Var2 = n1Var3.D;
                        n1.g(l1Var2);
                        l1Var2.m1(new w2(x2Var, 1));
                    }
                }
            }
        }
        n1 n1Var4 = (n1) x2Var.f4301y;
        if (!n1Var4.A.r1()) {
            x2Var.A = x2Var.G;
            n9.l1 l1Var3 = n1Var4.D;
            n1.g(l1Var3);
            l1Var3.m1(new w2(x2Var, 0));
            return;
        }
        x2Var.m1(x0Var.f2518y, x2Var.i1(x0Var), false);
        n9.b0 b0Var = ((n1) x2Var.f4301y).K;
        n1.d(b0Var);
        n1 n1Var5 = (n1) b0Var.f4301y;
        n1Var5.H.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        n9.l1 l1Var4 = n1Var5.D;
        n1.g(l1Var4);
        l1Var4.m1(new n9.x(b0Var, elapsedRealtime2));
    }

    public void n(x0 x0Var, Bundle bundle) {
        u2 u2Var;
        x2 x2Var = ((n1) ((m2) this.f6759y).f4301y).I;
        n1.f(x2Var);
        if (((n1) x2Var.f4301y).A.r1() && bundle != null && (u2Var = (u2) x2Var.D.get(Integer.valueOf(x0Var.f2517x))) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", u2Var.f9496c);
            bundle2.putString(MediationMetaData.KEY_NAME, u2Var.f9494a);
            bundle2.putString("referrer_name", u2Var.f9495b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f6758x) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT <= 25) {
                        new Handler(Looper.getMainLooper()).post(new a2.c0(25, this, intent));
                        return;
                    } else {
                        a(intent);
                        return;
                    }
                }
                return;
            default:
                j(x0.a(activity), bundle);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f6758x) {
            case 0:
                return;
            default:
                k(x0.a(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f6758x) {
            case 0:
                return;
            default:
                l(x0.a(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f6758x) {
            case 0:
                return;
            default:
                m(x0.a(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f6758x) {
            case 0:
                return;
            default:
                n(x0.a(activity), bundle);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i6 = this.f6758x;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i6 = this.f6758x;
    }

    public i() {
        this.f6758x = 0;
        this.f6759y = new ArrayDeque(10);
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
