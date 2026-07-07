package z6;

import b2.k;
import m6.h;
import v6.l;
import v6.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public final int f15221b;

    public a(int i6) {
        this.f15221b = i6;
        if (i6 > 0) {
        } else {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // z6.d
    public final e a(x6.a aVar, l lVar) {
        if (!(lVar instanceof s)) {
            return new c(aVar, lVar);
        }
        if (((s) lVar).f13426c == h.f8661x) {
            return new c(aVar, lVar);
        }
        return new k(aVar, lVar, this.f15221b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.f15221b == ((a) obj).f15221b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f15221b * 31) + 1237;
    }
}
