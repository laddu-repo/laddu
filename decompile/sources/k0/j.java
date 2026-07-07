package k0;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f7566a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f7567b;

    public j(Resources resources, Resources.Theme theme) {
        this.f7566a = resources;
        this.f7567b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f7566a.equals(jVar.f7566a) && Objects.equals(this.f7567b, jVar.f7567b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7566a, this.f7567b);
    }
}
