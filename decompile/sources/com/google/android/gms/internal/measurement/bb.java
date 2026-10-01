package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class bb extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f2509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ da.b1 f2511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6 f2512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Executor f2513e;

    public bb(AtomicBoolean atomicBoolean, Context context, da.b1 b1Var, p6 p6Var, Executor executor) {
        this.f2509a = atomicBoolean;
        this.f2510b = context;
        this.f2511c = b1Var;
        this.f2512d = p6Var;
        this.f2513e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f2509a.compareAndSet(false, true)) {
            try {
                this.f2510b.unregisterReceiver(this);
            } catch (IllegalArgumentException e7) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e7);
            }
            da.b1 b1Var = this.f2511c;
            p6 p6Var = this.f2512d;
            Executor executor = this.f2513e;
            da.d1 d1Var = new da.d1();
            d1Var.D = new da.c1(d1Var, p6Var);
            executor.execute(d1Var);
            b1Var.o(d1Var);
        }
    }
}
