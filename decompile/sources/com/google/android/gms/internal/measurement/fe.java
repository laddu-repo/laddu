package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class fe implements he {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f2643d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9.m f2644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rb f2646c;

    public fe(x9.m mVar) {
        rb rbVar = rb.f3050x;
        this.f2644a = mVar;
        this.f2645b = Math.max(5, 10);
        this.f2646c = rbVar;
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final void a() {
        synchronized (fe.class) {
            try {
                if (!f2643d) {
                    zd zdVar = new zd(3, this);
                    long j8 = this.f2645b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    da.v0 v0Var = (da.v0) this.f2644a.get();
                    ee eeVar = new ee(this, zdVar, v0Var, j8);
                    da.z0 z0Var = (da.z0) v0Var;
                    z0Var.getClass();
                    da.d1 d1Var = new da.d1(Executors.callable(eeVar, null));
                    da.x0 x0Var = new da.x0(d1Var, z0Var.f4465w.schedule(d1Var, j8, timeUnit));
                    x0Var.f(new zd(1, x0Var), da.f0.f4407v);
                    f2643d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
