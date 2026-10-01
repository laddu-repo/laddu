package com.bumptech.glide.manager;

import android.content.IntentFilter;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2428v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f2429w;

    public /* synthetic */ r(s sVar, int i) {
        this.f2428v = i;
        this.f2429w = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2428v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                s sVar = this.f2429w;
                sVar.f2433y = sVar.c();
                try {
                    s sVar2 = this.f2429w;
                    sVar2.f2430v.registerReceiver(sVar2.A, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f2429w.f2434z = true;
                } catch (SecurityException e7) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e7);
                    }
                    this.f2429w.f2434z = false;
                    return;
                }
                break;
            case 1:
                if (this.f2429w.f2434z) {
                    this.f2429w.f2434z = false;
                    s sVar3 = this.f2429w;
                    sVar3.f2430v.unregisterReceiver(sVar3.A);
                    break;
                }
                break;
            default:
                boolean z2 = this.f2429w.f2433y;
                s sVar4 = this.f2429w;
                sVar4.f2433y = sVar4.c();
                if (z2 != this.f2429w.f2433y) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f2429w.f2433y);
                    }
                    s sVar5 = this.f2429w;
                    v6.m.f().post(new o(sVar5, sVar5.f2433y, 1));
                }
                break;
        }
    }
}
