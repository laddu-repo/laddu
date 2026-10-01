package h0;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f5768a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f5769b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f5770c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f5771d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f5772e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f5773f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f5774g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(2:2|3)|4|(2:5|6)|7|(2:8|9)|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            h0.e.f5774g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            h0.e.f5768a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            h0.e.f5769b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r0 = r1
        L32:
            h0.e.f5770c = r0
            java.lang.Class r0 = h0.e.f5768a
            r3 = 3
            r4 = 2
            r5 = 0
            java.lang.Class r6 = java.lang.Boolean.TYPE
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            java.lang.String r8 = "performStopActivity"
            if (r0 != 0) goto L43
        L41:
            r0 = r1
            goto L57
        L43:
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L55
            r9[r5] = r7     // Catch: java.lang.Throwable -> L55
            r9[r2] = r6     // Catch: java.lang.Throwable -> L55
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r4] = r10     // Catch: java.lang.Throwable -> L55
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> L55
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            goto L41
        L57:
            h0.e.f5771d = r0
            java.lang.Class r0 = h0.e.f5768a
            if (r0 != 0) goto L5f
        L5d:
            r0 = r1
            goto L6f
        L5f:
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L6d
            r9[r5] = r7     // Catch: java.lang.Throwable -> L6d
            r9[r2] = r6     // Catch: java.lang.Throwable -> L6d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> L6d
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            goto L5d
        L6f:
            h0.e.f5772e = r0
            java.lang.Class r0 = h0.e.f5768a
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r8 == r9) goto L7d
            r9 = 27
            if (r8 != r9) goto Lac
        L7d:
            if (r0 != 0) goto L80
            goto Lac
        L80:
            java.lang.String r8 = "requestRelaunchActivity"
            r9 = 9
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> Lac
            r9[r5] = r7     // Catch: java.lang.Throwable -> Lac
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r9[r2] = r5     // Catch: java.lang.Throwable -> Lac
            r9[r4] = r5     // Catch: java.lang.Throwable -> Lac
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lac
            r9[r3] = r4     // Catch: java.lang.Throwable -> Lac
            r3 = 4
            r9[r3] = r6     // Catch: java.lang.Throwable -> Lac
            java.lang.Class<android.content.res.Configuration> r3 = android.content.res.Configuration.class
            r4 = 5
            r9[r4] = r3     // Catch: java.lang.Throwable -> Lac
            r4 = 6
            r9[r4] = r3     // Catch: java.lang.Throwable -> Lac
            r3 = 7
            r9[r3] = r6     // Catch: java.lang.Throwable -> Lac
            r3 = 8
            r9[r3] = r6     // Catch: java.lang.Throwable -> Lac
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> Lac
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lac
            r1 = r0
        Lac:
            h0.e.f5773f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.e.<clinit>():void");
    }
}
