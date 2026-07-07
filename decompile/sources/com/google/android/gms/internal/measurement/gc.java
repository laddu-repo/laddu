package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc implements da.b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ gc f2662b = new gc(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ gc f2663c = new gc(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2664a;

    public /* synthetic */ gc(int i) {
        this.f2664a = i;
    }

    @Override // da.b0
    public final ListenableFuture apply(Object obj) {
        switch (this.f2664a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                r7.d dVar = (r7.d) obj;
                throw new fc(dVar.f11342v.f2459v, dVar.getMessage(), dVar);
            case 1:
                throw null;
            default:
                return da.o0.d("");
        }
    }
}
