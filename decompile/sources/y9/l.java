package y9;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class l extends AbstractCollection implements List {
    public final /* synthetic */ w0 A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f14573v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Collection f14574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l f14575x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Collection f14576y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ w0 f14577z;

    public l(w0 w0Var, Object obj, List list, l lVar) {
        this.A = w0Var;
        this.f14577z = w0Var;
        this.f14573v = obj;
        this.f14574w = list;
        this.f14575x = lVar;
        this.f14576y = lVar == null ? null : lVar.f14574w;
    }

    public final void a() {
        l lVar = this.f14575x;
        if (lVar != null) {
            lVar.a();
        } else {
            this.f14577z.f14625y.put(this.f14573v, this.f14574w);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.f14574w.isEmpty();
        boolean zAdd = this.f14574w.add(obj);
        if (zAdd) {
            this.f14577z.f14626z++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f14574w.addAll(collection);
        if (zAddAll) {
            this.f14577z.f14626z += this.f14574w.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void b() {
        Collection collection;
        l lVar = this.f14575x;
        if (lVar != null) {
            lVar.b();
            if (lVar.f14574w != this.f14576y) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f14574w.isEmpty() || (collection = (Collection) this.f14577z.f14625y.get(this.f14573v)) == null) {
                return;
            }
            this.f14574w = collection;
        }
    }

    public final void c() {
        l lVar = this.f14575x;
        if (lVar != null) {
            lVar.c();
        } else if (this.f14574w.isEmpty()) {
            this.f14577z.f14625y.remove(this.f14573v);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f14574w.clear();
        this.f14577z.f14626z -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.f14574w.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.f14574w.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f14574w.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.f14574w).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.f14574w.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f14574w).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f14574w).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.f14574w.remove(obj);
        if (zRemove) {
            w0 w0Var = this.f14577z;
            w0Var.f14626z--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f14574w.removeAll(collection);
        if (zRemoveAll) {
            this.f14577z.f14626z += this.f14574w.size() - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f14574w.retainAll(collection);
        if (zRetainAll) {
            this.f14577z.f14626z += this.f14574w.size() - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.f14574w).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.f14574w.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        b();
        List listSubList = ((List) this.f14574w).subList(i, i10);
        l lVar = this.f14575x;
        if (lVar == null) {
            lVar = this;
        }
        boolean z2 = listSubList instanceof RandomAccess;
        w0 w0Var = this.A;
        Object obj = this.f14573v;
        return z2 ? new h(w0Var, obj, listSubList, lVar) : new l(w0Var, obj, listSubList, lVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f14574w.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new k(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = ((List) this.f14574w).remove(i);
        w0 w0Var = this.A;
        w0Var.f14626z--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean zIsEmpty = this.f14574w.isEmpty();
        ((List) this.f14574w).add(i, obj);
        this.A.f14626z++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f14574w).addAll(i, collection);
        if (zAddAll) {
            this.A.f14626z += this.f14574w.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
