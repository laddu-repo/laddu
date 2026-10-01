package s1;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f11966a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f11967b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f11968c;

    /* renamed from: d, reason: collision with root package name */
    public final r1.d f11969d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11970e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11971f;

    public b(int i6, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, r1.d dVar, boolean z10) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest build;
        this.f11966a = i6;
        this.f11968c = handler;
        this.f11969d = dVar;
        this.f11970e = z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            this.f11967b = new a(onAudioFocusChangeListener, handler);
        } else {
            this.f11967b = onAudioFocusChangeListener;
        }
        if (i10 >= 26) {
            audioAttributes = m6.b.h(i6).setAudioAttributes((AudioAttributes) dVar.b().f11625a);
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z10);
            onAudioFocusChangeListener2 = willPauseWhenDucked.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
            build = onAudioFocusChangeListener2.build();
            this.f11971f = build;
            return;
        }
        this.f11971f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11966a == bVar.f11966a && this.f11970e == bVar.f11970e && Objects.equals(this.f11967b, bVar.f11967b) && Objects.equals(this.f11968c, bVar.f11968c) && Objects.equals(this.f11969d, bVar.f11969d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11966a), this.f11967b, this.f11968c, this.f11969d, Boolean.valueOf(this.f11970e));
    }
}
