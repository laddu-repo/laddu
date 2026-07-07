package db;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w extends a1 implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final d2.a f4057x;

    public w(d2.a aVar) {
        this.f4057x = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f4057x.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f4057x.equals(((w) obj).f4057x);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4057x.hashCode();
    }

    public final String toString() {
        return this.f4057x.toString();
    }
}
