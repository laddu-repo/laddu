package r;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Map.Entry {
    public c A;

    /* renamed from: x, reason: collision with root package name */
    public final Object f11231x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f11232y;

    /* renamed from: z, reason: collision with root package name */
    public c f11233z;

    public c(Object obj, Object obj2) {
        this.f11231x = obj;
        this.f11232y = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11231x.equals(cVar.f11231x) && this.f11232y.equals(cVar.f11232y)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11231x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11232y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f11231x.hashCode() ^ this.f11232y.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f11231x + "=" + this.f11232y;
    }
}
