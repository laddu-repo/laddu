package l2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.j f8059b;

    public /* synthetic */ b(l lVar, u2.j jVar, int i) {
        this.f8058a = i;
        this.f8059b = jVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j8, long j9) {
        switch (this.f8058a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                u2.j jVar = this.f8059b;
                Handler handler = jVar.f12729v;
                if (Build.VERSION.SDK_INT >= 30) {
                    jVar.a(j8);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j8 >> 32), (int) j8));
                }
                break;
            default:
                u2.j jVar2 = this.f8059b;
                Handler handler2 = jVar2.f12729v;
                if (Build.VERSION.SDK_INT >= 30) {
                    jVar2.a(j8);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j8 >> 32), (int) j8));
                }
                break;
        }
    }
}
