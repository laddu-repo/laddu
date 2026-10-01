package y9;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class j1 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Set f14568v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x9.i f14569w;

    public j1(Set set, x9.i iVar) {
        this.f14568v = set;
        this.f14569w = iVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        p4.v.j(this.f14569w.apply(obj));
        return this.f14568v.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p4.v.j(this.f14569w.apply(it.next()));
        }
        return this.f14568v.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f14568v;
        boolean z2 = set instanceof RandomAccess;
        x9.i iVar = this.f14569w;
        if (!z2 || !(set instanceof List)) {
            Iterator it = set.iterator();
            iVar.getClass();
            while (it.hasNext()) {
                if (iVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        iVar.getClass();
        int i = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            if (!iVar.apply(obj)) {
                if (i10 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        p.t(list, iVar, i, i10);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        p.t(list, iVar, i, i10);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f14568v;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f14569w.apply(obj);
        }
        return false;
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
        return p.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return p.n(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f14568v.iterator();
        x9.i iVar = this.f14569w;
        p4.v.n(iVar, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (iVar.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f14568v.iterator();
        it.getClass();
        x9.i iVar = this.f14569w;
        iVar.getClass();
        return new l0(it, iVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f14568v.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f14568v.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f14569w.apply(next) && collection.contains(next)) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f14568v.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f14569w.apply(next) && !collection.contains(next)) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f14568v.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f14569w.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            l0 l0Var = (l0) it;
            if (!l0Var.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(l0Var.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            l0 l0Var = (l0) it;
            if (l0Var.hasNext()) {
                arrayList.add(l0Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
