package t6;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f12614a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12615b;

    public b(Bitmap bitmap, Map map) {
        this.f12614a = bitmap;
        this.f12615b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (k.a(this.f12614a, bVar.f12614a) && k.a(this.f12615b, bVar.f12615b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12615b.hashCode() + (this.f12614a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f12614a + ", extras=" + this.f12615b + ')';
    }
}
