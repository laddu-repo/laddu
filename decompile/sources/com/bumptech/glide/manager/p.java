package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.media3.decoder.DecoderInputBuffer;
import e2.w;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2425b;

    public /* synthetic */ p(int i, Object obj) {
        this.f2424a = i;
        this.f2425b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f2424a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                v6.m.f().post(new o(this, true, 0));
                break;
            default:
                de.i.e(network, "network");
                w.a((w) this.f2425b);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f2424a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                v6.m.f().post(new o(this, false, 0));
                break;
            default:
                de.i.e(network, "network");
                w.a((w) this.f2425b);
                break;
        }
    }
}
