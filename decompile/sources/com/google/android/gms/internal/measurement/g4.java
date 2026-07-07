package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: h, reason: collision with root package name */
    public static final v.e f2216h = new v.l(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f2217i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f2218a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f2219b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f2220c;

    /* renamed from: d, reason: collision with root package name */
    public final b4 f2221d;

    /* renamed from: f, reason: collision with root package name */
    public volatile Map f2223f;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2222e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2224g = new ArrayList();

    public g4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f2218a = contentResolver;
        this.f2219b = uri;
        this.f2220c = runnable;
        this.f2221d = new b4(this);
    }

    public static g4 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        g4 g4Var;
        synchronized (g4.class) {
            v.e eVar = f2216h;
            g4Var = (g4) eVar.get(uri);
            if (g4Var == null) {
                try {
                    g4 g4Var2 = new g4(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, g4Var2.f2221d);
                        eVar.put(uri, g4Var2);
                    } catch (SecurityException unused) {
                    }
                    g4Var = g4Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return g4Var;
    }

    public static synchronized void c() {
        synchronized (g4.class) {
            try {
                v.e eVar = f2216h;
                Iterator it = ((v.d) eVar.values()).iterator();
                while (it.hasNext()) {
                    g4 g4Var = (g4) it.next();
                    g4Var.f2218a.unregisterContentObserver(g4Var.f2221d);
                }
                eVar.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map b() {
        /*
            r5 = this;
            java.util.Map r0 = r5.f2223f
            if (r0 != 0) goto L4f
            java.lang.Object r1 = r5.f2222e
            monitor-enter(r1)
            java.util.Map r0 = r5.f2223f     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L4b
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.measurement.a6 r2 = new com.google.android.gms.internal.measurement.a6     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.c()     // Catch: java.lang.SecurityException -> L19 java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30
            goto L24
        L19:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.c()     // Catch: java.lang.Throwable -> L34
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L24:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L26:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            goto L43
        L2a:
            r0 = move-exception
            goto L4d
        L2c:
            r2 = move-exception
            goto L47
        L2e:
            r2 = move-exception
            goto L39
        L30:
            r2 = move-exception
            goto L39
        L32:
            r2 = move-exception
            goto L39
        L34:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            throw r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L39:
            java.lang.String r3 = "ConfigurationContentLdr"
            java.lang.String r4 = "Unable to query ContentProvider, using default values"
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L2c
            java.util.Map r2 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L2c
            goto L26
        L43:
            r5.f2223f = r2     // Catch: java.lang.Throwable -> L2a
            r0 = r2
            goto L4b
        L47:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L2a
        L4b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            goto L4f
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L4f:
            if (r0 == 0) goto L52
            return r0
        L52:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g4.b():java.util.Map");
    }
}
