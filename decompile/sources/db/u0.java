package db;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u0 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final List f4050x;

    /* renamed from: y, reason: collision with root package name */
    public final cb.e f4051y;

    public u0(List list, cb.e eVar) {
        list.getClass();
        this.f4050x = list;
        this.f4051y = eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return this.f4051y.apply(this.f4050x.get(i6));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4050x.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        return new t0(this, this.f4050x.listIterator(i6), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        return this.f4051y.apply(this.f4050x.remove(i6));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        this.f4050x.subList(i6, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4050x.size();
    }
}
