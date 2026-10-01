package e2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f4608a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f4609b = new e0();

    public AudioTrack a(j jVar, t1.c cVar, int i, Context context) {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = jVar.f4651b;
        int i12 = jVar.f4652c;
        int i13 = jVar.f4650a;
        int i14 = w1.b0.f13686a;
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(jVar.f4653d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) cVar.a().f7546w).setAudioFormat(new AudioFormat.Builder().setSampleRate(i11).setChannelMask(i12).setEncoding(i13).build()).setTransferMode(1).setBufferSizeInBytes(jVar.f).setSessionId(i);
        if (i10 >= 29) {
            sessionId.setOffloadedPlayback(jVar.f4654e);
        }
        if (i10 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }
}
