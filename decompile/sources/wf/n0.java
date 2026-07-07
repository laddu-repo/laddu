package wf;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n0 implements Map.Entry, we.a {

    /* renamed from: x, reason: collision with root package name */
    public final Object f14362x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f14363y;

    public n0(Object obj, Object obj2) {
        this.f14362x = obj;
        this.f14363y = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (kotlin.jvm.internal.k.a(this.f14362x, n0Var.f14362x) && kotlin.jvm.internal.k.a(this.f14363y, n0Var.f14363y)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14362x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14363y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        Object obj = this.f14362x;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f14363y;
        if (obj2 != null) {
            i6 = obj2.hashCode();
        }
        return i10 + i6;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f14362x + ", value=" + this.f14363y + ')';
    }
}
