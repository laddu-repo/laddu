package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f2568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f2569b;

    static {
        f2569b = !(Build.VERSION.SDK_INT >= 24);
    }

    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT < 24 || c(context);
    }

    public static da.k b(Context context, Callable callable, Executor executor) {
        p6 p6Var = new p6(9, callable);
        if (a(context)) {
            da.d1 d1Var = new da.d1();
            d1Var.D = new da.c1(d1Var, p6Var);
            executor.execute(d1Var);
            return d1Var;
        }
        da.b1 b1Var = new da.b1();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        bb bbVar = new bb(atomicBoolean, context, b1Var, p6Var, executor);
        context.registerReceiver(bbVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!a(context) || !atomicBoolean.compareAndSet(false, true)) {
            b1Var.f(new cb(b1Var, atomicBoolean, context, bbVar, 0), da.f0.f4407v);
            return b1Var;
        }
        try {
            context.unregisterReceiver(bbVar);
        } catch (IllegalArgumentException e7) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e7);
        }
        da.d1 d1Var2 = new da.d1();
        d1Var2.D = new da.c1(d1Var2, p6Var);
        executor.execute(d1Var2);
        b1Var.o(d1Var2);
        return b1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.content.Context r7) {
        /*
            boolean r0 = com.google.android.gms.internal.measurement.db.f2569b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<com.google.android.gms.internal.measurement.db> r0 = com.google.android.gms.internal.measurement.db.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.measurement.db.f2569b     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L54
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L4a
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.db.f2568a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.db.f2568a = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.db.f2568a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L2b
            r5 = r1
            goto L4e
        L2b:
            boolean r6 = a2.c.B(r3)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r6 != 0) goto L3b
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r7 != 0) goto L4a
        L3b:
            r5 = r1
            goto L4a
        L3d:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.db.f2568a = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L4a:
            if (r5 == 0) goto L4e
            com.google.android.gms.internal.measurement.db.f2568a = r4     // Catch: java.lang.Throwable -> Lf
        L4e:
            if (r5 == 0) goto L52
            com.google.android.gms.internal.measurement.db.f2569b = r1     // Catch: java.lang.Throwable -> Lf
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.db.c(android.content.Context):boolean");
    }
}
