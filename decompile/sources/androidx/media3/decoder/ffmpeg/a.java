package androidx.media3.decoder.ffmpeg;

import a2.i;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.util.Objects;
import r1.q;
import w2.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends w2.a {
    public a(long j, Handler handler, e0 e0Var, int i6) {
        super(j, handler, e0Var, i6);
    }

    @Override // a2.g
    public final int A(q qVar) {
        return r4.a.d(0, 0, 0, 0);
    }

    @Override // w2.a
    public final i C(String str, q qVar, q qVar2) {
        int i6;
        int i10;
        boolean equals = Objects.equals(qVar.f11670n, qVar2.f11670n);
        if (equals) {
            i6 = 3;
        } else {
            i6 = 0;
        }
        if (equals) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        return new i(str, qVar, qVar2, i6, i10);
    }

    @Override // w2.a
    public final y1.e D(q qVar) {
        Trace.beginSection("createFfmpegVideoDecoder");
        Trace.endSection();
        return null;
    }

    @Override // a2.g
    public final String j() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // w2.a
    public final void M(int i6) {
    }

    @Override // w2.a
    public final void L(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
    }
}
