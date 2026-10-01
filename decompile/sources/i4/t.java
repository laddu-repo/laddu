package i4;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final db.k0 f6555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6556b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6557c;

    public t(List list, int i6, long j) {
        this.f6555a = db.k0.k(list);
        this.f6556b = i6;
        this.f6557c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f6555a.equals(tVar.f6555a) && this.f6556b == tVar.f6556b && this.f6557c == tVar.f6557c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a8.g.k(this.f6557c) + (((this.f6555a.hashCode() * 31) + this.f6556b) * 31);
    }
}
