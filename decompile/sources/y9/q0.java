package y9;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class q0 extends AbstractList {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f14605v;

    public q0(List list) {
        list.getClass();
        this.f14605v = list;
    }

    public final int a(int i) {
        int size = this.f14605v.size();
        p4.v.o(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f14605v.add(a(i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f14605v.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f14605v;
        int size = list.size();
        p4.v.l(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new p0(this, this.f14605v.listIterator(a(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f14605v;
        int size = list.size();
        p4.v.l(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        subList(i, i10).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.f14605v;
        int size = list.size();
        p4.v.l(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14605v.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        List list = this.f14605v;
        p4.v.p(i, i10, list.size());
        return p.s(list.subList(a(i10), a(i)));
    }
}
