package v;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements Collection {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f13148x;

    public d(e eVar) {
        this.f13148x = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f13148x.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f13148x.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f13148x.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f13148x, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f13148x;
        int a10 = eVar.a(obj);
        if (a10 >= 0) {
            eVar.g(a10);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f13148x;
        int i6 = eVar.f13174z;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i6) {
            if (collection.contains(eVar.i(i10))) {
                eVar.g(i10);
                i10--;
                i6--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f13148x;
        int i6 = eVar.f13174z;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i6) {
            if (!collection.contains(eVar.i(i10))) {
                eVar.g(i10);
                i10--;
                i6--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f13148x.f13174z;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f13148x;
        int i6 = eVar.f13174z;
        Object[] objArr = new Object[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            objArr[i10] = eVar.i(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f13148x;
        int i6 = eVar.f13174z;
        if (objArr.length < i6) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i6);
        }
        for (int i10 = 0; i10 < i6; i10++) {
            objArr[i10] = eVar.i(i10);
        }
        if (objArr.length > i6) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
