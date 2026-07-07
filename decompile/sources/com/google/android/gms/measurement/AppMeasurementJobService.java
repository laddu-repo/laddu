package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.y0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import d6.b;
import hb.s;
import java.util.Objects;
import n9.e4;
import n9.k3;
import n9.u0;
import u5.r;
import w8.l;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements k3 {

    /* renamed from: x, reason: collision with root package name */
    public r f2554x;

    @Override // n9.k3
    public final boolean a(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // n9.k3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final r d() {
        if (this.f2554x == null) {
            this.f2554x = new r(this, 18);
        }
        return this.f2554x;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        r d10 = d();
        Service service = (Service) d10.f12916y;
        String string = jobParameters.getExtras().getString(HandleInvocationsFromAdViewer.KEY_ACTION);
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            x.g(string);
            e4 x10 = e4.x(service);
            u0 r10 = x10.r();
            l lVar = x10.I.f9415z;
            r10.L.b(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            x10.D().m1(new s(d10, x10, new b(10, d10, r10, jobParameters2, false)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            x.g(string);
            l1 e10 = l1.e(service, null);
            s sVar = new s(25, d10, jobParameters2);
            e10.getClass();
            e10.c(new y0(e10, sVar, 2));
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // n9.k3
    public final void b(Intent intent) {
    }
}
