package y9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f14613v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x9.f f14614w;

    public s0(List list, x9.f fVar) {
        list.getClass();
        this.f14613v = list;
        this.f14614w = fVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f14614w.apply(this.f14613v.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f14613v.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new r0(this, this.f14613v.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f14614w.apply(this.f14613v.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        this.f14613v.subList(i, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14613v.size();
    }
}
