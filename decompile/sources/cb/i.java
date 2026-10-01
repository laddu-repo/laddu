package cb;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final List f2007x;

    public i(List list) {
        this.f2007x = list;
    }

    @Override // cb.h
    public final boolean apply(Object obj) {
        int i6 = 0;
        while (true) {
            List list = this.f2007x;
            if (i6 < list.size()) {
                if (!((h) list.get(i6)).apply(obj)) {
                    return false;
                }
                i6++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f2007x.equals(((i) obj).f2007x);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2007x.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f2007x) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
