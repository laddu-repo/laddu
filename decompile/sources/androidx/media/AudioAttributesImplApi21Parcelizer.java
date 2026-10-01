package androidx.media;

import android.media.AudioAttributes;
import q5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1002a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f1002a, 1);
        audioAttributesImplApi21.f1003b = aVar.f(audioAttributesImplApi21.f1003b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi21.f1002a, 1);
        aVar.j(audioAttributesImplApi21.f1003b, 2);
    }
}
