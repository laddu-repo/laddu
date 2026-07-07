package androidx.media3.decoder.av1;

import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import j2.u;
import java.nio.ByteBuffer;
import u1.a0;
import y1.f;
import y1.h;
import y1.j;
import y1.k;
import z1.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Gav1Decoder extends k {

    /* renamed from: o, reason: collision with root package name */
    public final long f1010o;

    /* renamed from: p, reason: collision with root package name */
    public volatile int f1011p;

    public Gav1Decoder(int i6, int i10, int i11) {
        super(new h[i6], new VideoDecoderOutputBuffer[i10]);
        if (a.f15114a.a()) {
            int gav1GetThreads = gav1GetThreads();
            long gav1Init = gav1Init(gav1GetThreads <= 0 ? Runtime.getRuntime().availableProcessors() : gav1GetThreads);
            this.f1010o = gav1Init;
            if (gav1Init != 0 && gav1CheckError(gav1Init) != 0) {
                p(i11);
                return;
            } else {
                throw new Exception("Failed to initialize decoder. Error: " + gav1GetErrorMessage(gav1Init));
            }
        }
        throw new Exception("Failed to load decoder native library.");
    }

    private native int gav1CheckError(long j);

    private native void gav1Close(long j);

    private native int gav1Decode(long j, ByteBuffer byteBuffer, int i6);

    private native String gav1GetErrorMessage(long j);

    private native int gav1GetFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z10);

    private native int gav1GetThreads();

    private native long gav1Init(int i6);

    private native void gav1ReleaseFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native int gav1RenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    @Override // y1.k, y1.e
    public final void a() {
        super.a();
        gav1Close(this.f1010o);
    }

    @Override // y1.k
    public final h g() {
        return new h(2, 0);
    }

    @Override // y1.e
    public final String getName() {
        return "libgav1";
    }

    @Override // y1.k
    public final j h() {
        return new VideoDecoderOutputBuffer(new u(this, 17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y1.f, java.lang.Exception] */
    @Override // y1.k
    public final f i(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [y1.f, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v3, types: [y1.f, java.lang.Exception] */
    @Override // y1.k
    public final f j(h hVar, j jVar, boolean z10) {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) jVar;
        ByteBuffer byteBuffer = hVar.f14812z;
        String str = a0.f12750a;
        if (gav1Decode(this.f1010o, byteBuffer, byteBuffer.limit()) == 0) {
            return new Exception("gav1Decode error: " + gav1GetErrorMessage(this.f1010o));
        }
        boolean m9 = m(hVar.B);
        boolean z11 = !m9;
        if (m9) {
            videoDecoderOutputBuffer.init(hVar.B, this.f1011p, null);
        }
        int gav1GetFrame = gav1GetFrame(this.f1010o, videoDecoderOutputBuffer, z11);
        if (gav1GetFrame == 0) {
            return new Exception("gav1GetFrame error: " + gav1GetErrorMessage(this.f1010o));
        }
        if (gav1GetFrame == 2) {
            videoDecoderOutputBuffer.shouldBeSkipped = true;
        }
        if (m9) {
            videoDecoderOutputBuffer.format = hVar.f14810x;
        }
        return null;
    }

    public final void q(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (videoDecoderOutputBuffer.mode == 1 && !videoDecoderOutputBuffer.shouldBeSkipped) {
            gav1ReleaseFrame(this.f1010o, videoDecoderOutputBuffer);
        }
        o(videoDecoderOutputBuffer);
    }

    public final void r(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        if (videoDecoderOutputBuffer.mode == 1) {
            long j = this.f1010o;
            if (gav1RenderFrame(j, surface, videoDecoderOutputBuffer) != 0) {
                return;
            }
            throw new Exception("Buffer render error: " + gav1GetErrorMessage(j));
        }
        throw new Exception("Invalid output mode.");
    }
}
