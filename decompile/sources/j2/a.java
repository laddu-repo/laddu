package j2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ LoudnessCodecController a(int i6, k kVar) {
        return LoudnessCodecController.create(i6, hb.q.f6029x, kVar);
    }

    public static /* bridge */ /* synthetic */ void b(LoudnessCodecController loudnessCodecController) {
        loudnessCodecController.close();
    }

    public static /* bridge */ /* synthetic */ void c(LoudnessCodecController loudnessCodecController, MediaCodec mediaCodec) {
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public static /* bridge */ /* synthetic */ void d(MediaCodec mediaCodec) {
        mediaCodec.detachOutputSurface();
    }

    public static /* bridge */ /* synthetic */ boolean e(LoudnessCodecController loudnessCodecController, MediaCodec mediaCodec) {
        return loudnessCodecController.addMediaCodec(mediaCodec);
    }
}
