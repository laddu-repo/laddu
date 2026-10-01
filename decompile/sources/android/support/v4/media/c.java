package android.support.v4.media;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaDrmResetException;
import android.media.PlaybackParams;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ AudioDeviceInfo f(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* synthetic */ AudioTrack.Builder g() {
        return new AudioTrack.Builder();
    }

    public static /* synthetic */ PlaybackParams m() {
        return new PlaybackParams();
    }

    public static /* bridge */ /* synthetic */ boolean y(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
