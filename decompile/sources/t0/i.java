package t0;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f12363a;

    public i(DisplayCutout displayCutout) {
        this.f12363a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return Objects.equals(this.f12363a, ((i) obj).f12363a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f12363a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f12363a + "}";
    }
}
