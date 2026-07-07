package w2;

import android.content.Context;
import android.opengl.GLSurfaceView;
import androidx.media3.decoder.VideoDecoderOutputBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends GLSurfaceView implements u {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f13703y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final s f13704x;

    public t(Context context) {
        super(context, null);
        s sVar = new s(this);
        this.f13704x = sVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(sVar);
        setRenderMode(0);
    }

    @Override // w2.u
    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        s sVar = this.f13704x;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer) sVar.C.getAndSet(videoDecoderOutputBuffer);
        if (videoDecoderOutputBuffer2 != null) {
            videoDecoderOutputBuffer2.release();
        }
        sVar.f13700x.requestRender();
    }

    @Deprecated
    public u getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
