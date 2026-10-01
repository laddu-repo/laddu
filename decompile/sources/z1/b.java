package z1;

import a2.i;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.av1.Gav1Decoder;
import com.unity3d.services.core.device.MimeTypes;
import r1.q;
import u1.a0;
import w2.e0;
import y1.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class b extends w2.a {

    /* renamed from: y0, reason: collision with root package name */
    public static final int f15115y0 = ((a0.f(720, 64) * a0.f(1280, 64)) * 6144) / 2;

    /* renamed from: v0, reason: collision with root package name */
    public final int f15116v0;

    /* renamed from: w0, reason: collision with root package name */
    public final int f15117w0;

    /* renamed from: x0, reason: collision with root package name */
    public Gav1Decoder f15118x0;

    public b(long j, Handler handler, e0 e0Var, int i6) {
        super(j, handler, e0Var, i6);
        this.f15116v0 = 4;
        this.f15117w0 = 4;
    }

    @Override // a2.g
    public final int A(q qVar) {
        if (MimeTypes.VIDEO_AV1.equalsIgnoreCase(qVar.f11670n) && a.f15114a.a()) {
            if (qVar.O != 0) {
                return r4.a.d(2, 0, 0, 0);
            }
            return 148;
        }
        return r4.a.d(0, 0, 0, 0);
    }

    @Override // w2.a
    public final i C(String str, q qVar, q qVar2) {
        return new i(str, qVar, qVar2, 3, 0);
    }

    @Override // w2.a
    public final e D(q qVar) {
        Trace.beginSection("createGav1Decoder");
        int i6 = qVar.f11671o;
        if (i6 == -1) {
            i6 = f15115y0;
        }
        Gav1Decoder gav1Decoder = new Gav1Decoder(this.f15116v0, this.f15117w0, i6);
        this.f15118x0 = gav1Decoder;
        Trace.endSection();
        return gav1Decoder;
    }

    @Override // w2.a
    public final void L(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        Gav1Decoder gav1Decoder = this.f15118x0;
        if (gav1Decoder != null) {
            gav1Decoder.r(videoDecoderOutputBuffer, surface);
            videoDecoderOutputBuffer.release();
            return;
        }
        throw new Exception("Failed to render output buffer to surface: decoder is not initialized.");
    }

    @Override // w2.a
    public final void M(int i6) {
        Gav1Decoder gav1Decoder = this.f15118x0;
        if (gav1Decoder != null) {
            gav1Decoder.f1011p = i6;
        }
    }

    @Override // a2.g
    public final String j() {
        return "Libgav1VideoRenderer";
    }
}
