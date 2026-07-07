package v;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {
    public final /* synthetic */ e A;

    /* renamed from: x, reason: collision with root package name */
    public int f13145x;

    /* renamed from: y, reason: collision with root package name */
    public int f13146y = -1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13147z;

    public c(e eVar) {
        this.A = eVar;
        this.f13145x = eVar.f13174z - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f13147z) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i6 = this.f13146y;
                e eVar = this.A;
                if (kotlin.jvm.internal.k.a(key, eVar.f(i6)) && kotlin.jvm.internal.k.a(entry.getValue(), eVar.i(this.f13146y))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f13147z) {
            return this.A.f(this.f13146y);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f13147z) {
            return this.A.i(this.f13146y);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f13146y < this.f13145x) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f13147z) {
            int i6 = this.f13146y;
            e eVar = this.A;
            Object f3 = eVar.f(i6);
            Object i10 = eVar.i(this.f13146y);
            int i11 = 0;
            if (f3 == null) {
                hashCode = 0;
            } else {
                hashCode = f3.hashCode();
            }
            if (i10 != null) {
                i11 = i10.hashCode();
            }
            return hashCode ^ i11;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f13146y++;
            this.f13147z = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f13147z) {
            this.A.g(this.f13146y);
            this.f13146y--;
            this.f13145x--;
            this.f13147z = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f13147z) {
            return this.A.h(this.f13146y, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
