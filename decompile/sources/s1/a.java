package s1;

import a2.o0;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f11964a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f11965b;

    public a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f11965b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = a0.f12750a;
        this.f11964a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i6) {
        a0.U(this.f11964a, new o0(i6, 4, this));
    }
}
