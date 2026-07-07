package je;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements Map.Entry, we.a {

    /* renamed from: x, reason: collision with root package name */
    public final f f7425x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7426y;

    /* renamed from: z, reason: collision with root package name */
    public final int f7427z;

    public e(f map, int i6) {
        k.e(map, "map");
        this.f7425x = map;
        this.f7426y = i6;
        this.f7427z = map.E;
    }

    public final void a() {
        if (this.f7425x.E == this.f7427z) {
        } else {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (k.a(entry.getKey(), getKey()) && k.a(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f7425x.f7428x[this.f7426y];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f7425x.f7429y;
        k.b(objArr);
        return objArr[this.f7426y];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i6;
        Object key = getKey();
        int i10 = 0;
        if (key != null) {
            i6 = key.hashCode();
        } else {
            i6 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i10 = value.hashCode();
        }
        return i6 ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f7425x;
        fVar.c();
        Object[] objArr = fVar.f7429y;
        if (objArr == null) {
            int length = fVar.f7428x.length;
            if (length >= 0) {
                objArr = new Object[length];
                fVar.f7429y = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
        }
        int i6 = this.f7426y;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
