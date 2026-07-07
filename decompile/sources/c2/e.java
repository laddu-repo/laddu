package c2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f1791a;

    public e(h hVar) {
        this.f1791a = hVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        h hVar = this.f1791a;
        hVar.a(d.c(hVar.f1803a, hVar.f1811i, hVar.f1810h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (u1.a0.l(audioDeviceInfoArr, this.f1791a.f1810h)) {
            this.f1791a.f1810h = null;
        }
        h hVar = this.f1791a;
        hVar.a(d.c(hVar.f1803a, hVar.f1811i, hVar.f1810h));
    }
}
