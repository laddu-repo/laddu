package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class pc extends n4 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2988x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc(int i, String str) {
        super(str);
        this.f2988x = i;
    }

    @Override // com.google.android.gms.internal.measurement.n4
    public final z5 h(z7 z7Var, List list) {
        switch (this.f2988x) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return z5.f3274a;
            case 1:
            case 2:
                return this;
            case 3:
                return new m3(Double.valueOf(0.0d));
            default:
                return z5.f3274a;
        }
    }
}
