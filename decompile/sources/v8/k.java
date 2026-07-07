package v8;

import java.util.Arrays;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final a f13463a;

    /* renamed from: b, reason: collision with root package name */
    public final t8.d f13464b;

    public /* synthetic */ k(a aVar, t8.d dVar) {
        this.f13463a = aVar;
        this.f13464b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (x.j(this.f13463a, kVar.f13463a) && x.j(this.f13464b, kVar.f13464b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13463a, this.f13464b});
    }

    public final String toString() {
        s8.l lVar = new s8.l(this);
        lVar.a(this.f13463a, "key");
        lVar.a(this.f13464b, "feature");
        return lVar.toString();
    }
}
