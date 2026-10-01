package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2705a;

    public /* synthetic */ hi(int i) {
        this.f2705a = i;
    }

    public final void a(sh shVar, Object obj, ei eiVar) {
        switch (this.f2705a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                break;
            default:
                if (shVar.f3095d && ((f0) f0.f2625w.get()).f2626v > 20) {
                    eiVar.a(obj, shVar.f3092a);
                } else {
                    shVar.b(obj, eiVar);
                }
                break;
        }
    }

    private final void b(sh shVar, Object obj, ei eiVar) {
    }
}
