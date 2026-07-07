package db;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class l1 extends AbstractCollection implements Set {

    /* renamed from: x, reason: collision with root package name */
    public final Set f4014x;

    /* renamed from: y, reason: collision with root package name */
    public final cb.h f4015y;

    public l1(Set set, cb.h hVar) {
        this.f4014x = set;
        this.f4015y = hVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f4015y.apply(obj)) {
            return this.f4014x.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f4015y.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f4014x.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f4014x;
        boolean z10 = set instanceof RandomAccess;
        cb.h hVar = this.f4015y;
        if (z10 && (set instanceof List)) {
            List list = (List) set;
            hVar.getClass();
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (!hVar.apply(obj)) {
                    if (i10 > i6) {
                        try {
                            list.set(i6, obj);
                        } catch (IllegalArgumentException unused) {
                            r.r(list, hVar, i6, i10);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            r.r(list, hVar, i6, i10);
                            return;
                        }
                    }
                    i6++;
                }
            }
            list.subList(i6, list.size()).clear();
            return;
        }
        Iterator it = set.iterator();
        hVar.getClass();
        while (it.hasNext()) {
            if (hVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z10;
        Set set = this.f4014x;
        set.getClass();
        try {
            z10 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.f4015y.apply(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return r.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return r.m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f4014x.iterator();
        cb.h hVar = this.f4015y;
        jb.b.f(hVar, "predicate");
        boolean z10 = false;
        int i6 = 0;
        while (true) {
            if (it.hasNext()) {
                if (hVar.apply(it.next())) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 != -1) {
            z10 = true;
        }
        return true ^ z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f4014x.iterator();
        it.getClass();
        cb.h hVar = this.f4015y;
        hVar.getClass();
        return new q0(it, hVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f4014x.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f4014x.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f4015y.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f4014x.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f4015y.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f4014x.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (this.f4015y.apply(it.next())) {
                i6++;
            }
        }
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            q0 q0Var = (q0) it;
            if (q0Var.hasNext()) {
                arrayList.add(q0Var.next());
            } else {
                return arrayList.toArray();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            q0 q0Var = (q0) it;
            if (q0Var.hasNext()) {
                arrayList.add(q0Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
