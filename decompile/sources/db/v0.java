package db;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v0 extends AbstractSequentialList implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final List f4055x;

    /* renamed from: y, reason: collision with root package name */
    public final cb.e f4056y;

    public v0(List list, cb.e eVar) {
        list.getClass();
        this.f4055x = list;
        this.f4056y = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4055x.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        return new t0(this, this.f4055x.listIterator(i6), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        this.f4055x.subList(i6, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4055x.size();
    }
}
