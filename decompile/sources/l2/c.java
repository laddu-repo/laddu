package l2;

import android.os.HandlerThread;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements x9.m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f8060v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8061w;

    public /* synthetic */ c(int i, int i10) {
        this.f8060v = i10;
        this.f8061w = i;
    }

    @Override // x9.m
    public final Object get() {
        switch (this.f8060v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new HandlerThread(d.f(this.f8061w, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(d.f(this.f8061w, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
