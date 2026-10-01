package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import hb.s;
import m1.a;
import n9.e4;
import n9.k3;
import n9.n1;
import n9.p2;
import n9.t1;
import n9.u0;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements k3 {

    /* renamed from: x, reason: collision with root package name */
    public r f2556x;

    @Override // n9.k3
    public final boolean a(int i6) {
        return stopSelfResult(i6);
    }

    @Override // n9.k3
    public final void b(Intent intent) {
        SparseArray sparseArray = a.f8411a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f8411a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n9.k3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final r d() {
        if (this.f2556x == null) {
            this.f2556x = new r(this, 18);
        }
        return this.f2556x;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        r d10 = d();
        d10.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new t1(e4.x((Service) d10.f12916y));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f12916y).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f12916y).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i10) {
        r d10 = d();
        if (intent == null) {
            d10.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) d10.f12916y;
        u0 u0Var = n1.m(service, null, null).C;
        n1.g(u0Var);
        String action = intent.getAction();
        u0Var.L.c(Integer.valueOf(i10), action, "Local AppMeasurementService called. startId, action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            p2 p2Var = new p2(d10, i10, u0Var, intent);
            e4 x10 = e4.x(service);
            x10.D().m1(new s(d10, x10, p2Var));
            return 2;
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
