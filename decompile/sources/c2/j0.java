package c2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f1860a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f1861b = new Object();

    public static AudioAttributes b(r1.d dVar, boolean z10) {
        if (z10) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) dVar.b().f11625a;
    }

    public AudioTrack a(n nVar, r1.d dVar, int i6, Context context) {
        AudioTrack.Builder audioAttributes;
        AudioTrack.Builder audioFormat;
        AudioTrack.Builder transferMode;
        AudioTrack.Builder bufferSizeInBytes;
        AudioTrack.Builder sessionId;
        AudioTrack build;
        boolean z10 = nVar.f1902d;
        int i10 = nVar.f1899a;
        int i11 = nVar.f1901c;
        int i12 = nVar.f1900b;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 23) {
            AudioFormat q9 = u1.a0.q(i12, i11, i10);
            audioAttributes = android.support.v4.media.c.g().setAudioAttributes(b(dVar, z10));
            audioFormat = audioAttributes.setAudioFormat(q9);
            transferMode = audioFormat.setTransferMode(1);
            bufferSizeInBytes = transferMode.setBufferSizeInBytes(nVar.f1904f);
            sessionId = bufferSizeInBytes.setSessionId(i6);
            if (i13 >= 29) {
                sessionId.setOffloadedPlayback(nVar.f1903e);
            }
            if (i13 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            build = sessionId.build();
            return build;
        }
        return new AudioTrack(b(dVar, z10), u1.a0.q(i12, i11, i10), nVar.f1904f, 1, i6);
    }
}
