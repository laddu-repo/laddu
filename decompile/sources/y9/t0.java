package y9;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f14620v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x9.f f14621w;

    public t0(List list, x9.f fVar) {
        list.getClass();
        this.f14620v = list;
        this.f14621w = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f14620v.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new r0(this, this.f14620v.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        this.f14620v.subList(i, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14620v.size();
    }
}
