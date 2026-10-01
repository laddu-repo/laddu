package v;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Set {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f13144x;

    public b(e eVar) {
        this.f13144x = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f13144x.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13144x.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f13144x.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        e eVar = this.f13144x;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (eVar.f13174z == set.size()) {
                        if (eVar.j(set)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        e eVar = this.f13144x;
        int i6 = 0;
        for (int i10 = eVar.f13174z - 1; i10 >= 0; i10--) {
            Object f3 = eVar.f(i10);
            if (f3 == null) {
                hashCode = 0;
            } else {
                hashCode = f3.hashCode();
            }
            i6 += hashCode;
        }
        return i6;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f13144x.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f13144x, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f13144x;
        int d10 = eVar.d(obj);
        if (d10 >= 0) {
            eVar.g(d10);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f13144x.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f13144x;
        int i6 = eVar.f13174z;
        for (int i10 = i6 - 1; i10 >= 0; i10--) {
            if (!collection.contains(eVar.f(i10))) {
                eVar.g(i10);
            }
        }
        if (i6 != eVar.f13174z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f13144x.f13174z;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f13144x;
        int i6 = eVar.f13174z;
        Object[] objArr = new Object[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            objArr[i10] = eVar.f(i10);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f13144x;
        int i6 = eVar.f13174z;
        if (objArr.length < i6) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i6);
        }
        for (int i10 = 0; i10 < i6; i10++) {
            objArr[i10] = eVar.f(i10);
        }
        if (objArr.length > i6) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
