package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f1002a;

    /* renamed from: b, reason: collision with root package name */
    public int f1003b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f1002a.equals(((AudioAttributesImplApi21) obj).f1002a);
    }

    public final int hashCode() {
        return this.f1002a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1002a;
    }
}
