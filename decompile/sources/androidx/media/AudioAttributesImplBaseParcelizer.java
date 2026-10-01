package androidx.media;

import q5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1004a = aVar.f(audioAttributesImplBase.f1004a, 1);
        audioAttributesImplBase.f1005b = aVar.f(audioAttributesImplBase.f1005b, 2);
        audioAttributesImplBase.f1006c = aVar.f(audioAttributesImplBase.f1006c, 3);
        audioAttributesImplBase.f1007d = aVar.f(audioAttributesImplBase.f1007d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f1004a, 1);
        aVar.j(audioAttributesImplBase.f1005b, 2);
        aVar.j(audioAttributesImplBase.f1006c, 3);
        aVar.j(audioAttributesImplBase.f1007d, 4);
    }
}
