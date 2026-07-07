package h0;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i6) {
        return builder.setContentType(i6);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i6) {
        return builder.setUsage(i6);
    }
}
