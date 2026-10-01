package com.google.android.gms.internal.measurement;

import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f2801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f2802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f2803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b8.j f2804d;

    static {
        y9.i0.j(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f2801a = new AtomicReference(y9.f1.E);
        f2802b = new f1(15);
        f2803c = new WeakHashMap();
        f2804d = new b8.j(2);
        new ArrayDeque();
        new ArrayDeque();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.yg a(com.google.android.gms.internal.measurement.xg r6, com.google.android.gms.internal.measurement.yg r7) {
        /*
            r6.getClass()
            com.google.android.gms.internal.measurement.yg r0 = r6.f3233b
            if (r0 != r7) goto L9
            goto L7f
        L9:
            if (r0 != 0) goto L48
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L16
            boolean r1 = androidx.lifecycle.e0.t()
            goto L46
        L16:
            com.google.android.gms.internal.measurement.re r1 = com.google.android.gms.internal.measurement.se.f3090a
            r1.getClass()
            com.google.android.gms.internal.measurement.f1 r1 = com.google.android.gms.internal.measurement.jg.f2802b
            r1.getClass()
            java.lang.String r1 = "false"
            java.lang.reflect.Method r2 = com.google.android.gms.internal.measurement.te.f3116a     // Catch: java.lang.Exception -> L38
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L38
            java.lang.String r4 = "tiktok_systrace"
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L38
            r4 = 1
            r3[r4] = r1     // Catch: java.lang.Exception -> L38
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L38
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L38
            r1 = r2
            goto L40
        L38:
            r2 = move-exception
            java.lang.String r3 = "SystemProperties"
            java.lang.String r4 = "get error"
            android.util.Log.e(r3, r4, r2)
        L40:
            java.lang.String r2 = "true"
            boolean r1 = r1.equals(r2)
        L46:
            r6.f3232a = r1
        L48:
            boolean r1 = r6.f3232a
            if (r1 == 0) goto L7a
            if (r0 == 0) goto L75
            if (r7 == 0) goto L72
            r1 = r0
            com.google.android.gms.internal.measurement.dg r1 = (com.google.android.gms.internal.measurement.dg) r1
            com.google.android.gms.internal.measurement.dg r1 = r1.f2579v
            if (r1 != r7) goto L61
            boolean r1 = com.google.android.gms.internal.measurement.h.l(r0)
            if (r1 != 0) goto L61
            android.os.Trace.endSection()
            goto L7a
        L61:
            r1 = r7
            com.google.android.gms.internal.measurement.dg r1 = (com.google.android.gms.internal.measurement.dg) r1
            com.google.android.gms.internal.measurement.dg r1 = r1.f2579v
            if (r0 != r1) goto L72
            boolean r1 = com.google.android.gms.internal.measurement.h.l(r7)
            if (r1 != 0) goto L72
            com.google.android.gms.internal.measurement.h.n(r7)
            goto L7a
        L72:
            com.google.android.gms.internal.measurement.h.j(r0)
        L75:
            if (r7 == 0) goto L7a
            com.google.android.gms.internal.measurement.h.g(r7)
        L7a:
            if (r0 == r7) goto L7f
            r6.f3233b = r7
            return r0
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.jg.a(com.google.android.gms.internal.measurement.xg, com.google.android.gms.internal.measurement.yg):com.google.android.gms.internal.measurement.yg");
    }

    public static xg b() {
        return (xg) f2804d.get();
    }
}
