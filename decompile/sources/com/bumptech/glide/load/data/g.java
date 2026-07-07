package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2383a;

    public /* synthetic */ g(int i) {
        this.f2383a = i;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f2383a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final f b(Object obj) {
        switch (this.f2383a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new h(obj);
            case 1:
                return new h((ParcelFileDescriptor) obj);
            default:
                return new s5.d((ByteBuffer) obj);
        }
    }
}
