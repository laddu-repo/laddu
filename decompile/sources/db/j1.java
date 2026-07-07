package db;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j1 extends a1 implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final a1 f4007x;

    public j1(a1 a1Var) {
        this.f4007x = a1Var;
    }

    @Override // db.a1
    public final a1 a() {
        return this.f4007x;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f4007x.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            return this.f4007x.equals(((j1) obj).f4007x);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f4007x.hashCode();
    }

    public final String toString() {
        return this.f4007x + ".reverse()";
    }
}
