package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements n {
    public static final Executor B = AsyncTask.SERIAL_EXECUTOR;
    public final q A = new q(0, this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f2430v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f2431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q7.h f2432x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f2433y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f2434z;

    public s(Context context, q7.h hVar, m mVar) {
        this.f2430v = context.getApplicationContext();
        this.f2432x = hVar;
        this.f2431w = mVar;
    }

    @Override // com.bumptech.glide.manager.n
    public final void a() {
        B.execute(new r(this, 1));
    }

    @Override // com.bumptech.glide.manager.n
    public final boolean b() {
        B.execute(new r(this, 0));
        return true;
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f2432x.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e7) {
            if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                return true;
            }
            Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e7);
            return true;
        }
    }
}
