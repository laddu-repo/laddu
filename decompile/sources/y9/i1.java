package y9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends AbstractSet {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Set f14564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f14565w;

    public i1(Set set, Set set2) {
        this.f14564v = set;
        this.f14565w = set2;
    }

    public final int a() {
        Set set = this.f14564v;
        int iA = set instanceof i1 ? ((i1) set).a() : set.size();
        Set set2 = this.f14565w;
        return Math.min(iA, set2 instanceof i1 ? ((i1) set2).a() : set2.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14564v.contains(obj) && this.f14565w.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f14564v.containsAll(collection) && this.f14565w.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z2 = set instanceof i1;
                int iA = z2 ? ((i1) set).a() : set.size();
                if (iA >= 0) {
                    int size = z2 ? 0 : set.size();
                    if (a() >= size) {
                        l0 l0Var = new l0(this.f14564v, this.f14565w);
                        int i = 0;
                        while (true) {
                            if (l0Var.hasNext()) {
                                try {
                                    if (!set.contains(l0Var.next())) {
                                        break;
                                    }
                                    i++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            } else if (i != iA) {
                                if (i >= size) {
                                    Iterator it = set.iterator();
                                    int i10 = 0;
                                    while (it.hasNext()) {
                                        it.next();
                                        i10++;
                                        if (i10 > i) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f14565w, this.f14564v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new l0(this.f14564v, this.f14565w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f14564v.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f14565w.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
