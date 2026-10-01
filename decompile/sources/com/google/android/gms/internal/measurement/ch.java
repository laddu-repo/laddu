package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ch extends w2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2548b;

    public /* synthetic */ ch(int i) {
        this.f2548b = i;
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final /* synthetic */ Object a() {
        switch (this.f2548b) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new dh();
            case 1:
                return new fh();
            case 2:
                return new vh();
            default:
                return new xh();
        }
    }
}
