package db;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class l extends AbstractCollection implements List {
    public final Collection A;
    public final /* synthetic */ y0 B;
    public final /* synthetic */ y0 C;

    /* renamed from: x, reason: collision with root package name */
    public final Object f4011x;

    /* renamed from: y, reason: collision with root package name */
    public Collection f4012y;

    /* renamed from: z, reason: collision with root package name */
    public final l f4013z;

    public l(y0 y0Var, Object obj, List list, l lVar) {
        Collection collection;
        this.C = y0Var;
        this.B = y0Var;
        this.f4011x = obj;
        this.f4012y = list;
        this.f4013z = lVar;
        if (lVar == null) {
            collection = null;
        } else {
            collection = lVar.f4012y;
        }
        this.A = collection;
    }

    public final void a() {
        l lVar = this.f4013z;
        if (lVar != null) {
            lVar.a();
        } else {
            this.B.A.put(this.f4011x, this.f4012y);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.f4012y.isEmpty();
        boolean add = this.f4012y.add(obj);
        if (add) {
            this.B.B++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f4012y.addAll(collection);
        if (addAll) {
            this.B.B += this.f4012y.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final void b() {
        Collection collection;
        l lVar = this.f4013z;
        if (lVar != null) {
            lVar.b();
            if (lVar.f4012y != this.A) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f4012y.isEmpty() && (collection = (Collection) this.B.A.get(this.f4011x)) != null) {
            this.f4012y = collection;
        }
    }

    public final void c() {
        l lVar = this.f4013z;
        if (lVar != null) {
            lVar.c();
        } else if (this.f4012y.isEmpty()) {
            this.B.A.remove(this.f4011x);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f4012y.clear();
        this.B.B -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.f4012y.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.f4012y.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f4012y.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i6) {
        b();
        return ((List) this.f4012y).get(i6);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.f4012y.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f4012y).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f4012y).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.f4012y.remove(obj);
        if (remove) {
            y0 y0Var = this.B;
            y0Var.B--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f4012y.removeAll(collection);
        if (removeAll) {
            this.B.B += this.f4012y.size() - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f4012y.retainAll(collection);
        if (retainAll) {
            this.B.B += this.f4012y.size() - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i6, Object obj) {
        b();
        return ((List) this.f4012y).set(i6, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.f4012y.size();
    }

    @Override // java.util.List
    public final List subList(int i6, int i10) {
        b();
        List subList = ((List) this.f4012y).subList(i6, i10);
        l lVar = this.f4013z;
        if (lVar == null) {
            lVar = this;
        }
        boolean z10 = subList instanceof RandomAccess;
        y0 y0Var = this.C;
        Object obj = this.f4011x;
        if (z10) {
            return new l(y0Var, obj, subList, lVar);
        }
        return new l(y0Var, obj, subList, lVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f4012y.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i6) {
        b();
        return new k(this, i6);
    }

    @Override // java.util.List
    public final Object remove(int i6) {
        b();
        Object remove = ((List) this.f4012y).remove(i6);
        y0 y0Var = this.C;
        y0Var.B--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i6, Object obj) {
        b();
        boolean isEmpty = this.f4012y.isEmpty();
        ((List) this.f4012y).add(i6, obj);
        this.C.B++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f4012y).addAll(i6, collection);
        if (addAll) {
            this.C.B += this.f4012y.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }
}
