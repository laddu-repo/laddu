package androidx.fragment.app;

import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements u4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1026b;

    public /* synthetic */ h0(int i, Object obj) {
        this.f1025a = i;
        this.f1026b = obj;
    }

    @Override // u4.c
    public final Bundle a() {
        switch (this.f1025a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((q0) this.f1026b).W();
            default:
                return androidx.lifecycle.h0.a((androidx.lifecycle.h0) this.f1026b);
        }
    }
}
