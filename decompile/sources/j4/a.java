package j4;

import android.media.AudioAttributes;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final AudioAttributes f7154a;

    public a(AudioAttributes audioAttributes) {
        this.f7154a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f7154a, ((a) obj).f7154a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f7154a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f7154a;
    }
}
