package androidx.media;

import android.media.AudioAttributes;
import q5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f1002a = (AudioAttributes) aVar.g(audioAttributesImplApi26.f1002a, 1);
        audioAttributesImplApi26.f1003b = aVar.f(audioAttributesImplApi26.f1003b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi26.f1002a, 1);
        aVar.j(audioAttributesImplApi26.f1003b, 2);
    }
}
