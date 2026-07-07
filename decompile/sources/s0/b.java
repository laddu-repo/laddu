package s0;

import android.graphics.Rect;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f11959a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f11960b;

    public b(Rect rect, Rect rect2) {
        this.f11959a = rect;
        this.f11960b = rect2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.f11959a.equals(this.f11959a) && bVar.f11960b.equals(this.f11960b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11959a.hashCode() ^ this.f11960b.hashCode();
    }

    public final String toString() {
        return "Pair{" + this.f11959a + " " + this.f11960b + "}";
    }
}
