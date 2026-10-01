package y9;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends k0 {
    public static final g1 C;
    public final transient f0 B;

    static {
        c0 c0Var = f0.f14553w;
        C = new g1(z0.f14637z, x0.f14630w);
    }

    public g1(f0 f0Var, Comparator comparator) {
        super(comparator);
        this.B = f0Var;
    }

    @Override // y9.i0, y9.a0
    public final f0 a() {
        return this.B;
    }

    @Override // y9.a0
    public final int b(int i, Object[] objArr) {
        return this.B.b(i, objArr);
    }

    @Override // y9.a0
    public final Object[] c() {
        return this.B.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iQ = q(obj, true);
        f0 f0Var = this.B;
        if (iQ == f0Var.size()) {
            return null;
        }
        return f0Var.get(iQ);
    }

    @Override // y9.a0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.B, obj, this.f14571y) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.f14571y;
        if (!p.m(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        p1 it = iterator();
        Iterator it2 = collection.iterator();
        c0 c0Var = (c0) it;
        if (!c0Var.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = c0Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!c0Var.hasNext()) {
                        return false;
                    }
                    next2 = c0Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // y9.a0
    public final int d() {
        return this.B.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.B.t().listIterator(0);
    }

    @Override // y9.a0
    public final int e() {
        return this.B.e();
    }

    @Override // y9.i0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.B.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f14571y;
        if (!p.m(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            p1 it2 = iterator();
            do {
                c0 c0Var = (c0) it2;
                if (!c0Var.hasNext()) {
                    return true;
                }
                next = c0Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // y9.a0
    public final boolean f() {
        return this.B.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.B.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iP = p(obj, true) - 1;
        if (iP == -1) {
            return null;
        }
        return this.B.get(iP);
    }

    @Override // y9.a0
    /* JADX INFO: renamed from: g */
    public final p1 iterator() {
        return this.B.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iQ = q(obj, false);
        f0 f0Var = this.B;
        if (iQ == f0Var.size()) {
            return null;
        }
        return f0Var.get(iQ);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.B.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iP = p(obj, false) - 1;
        if (iP == -1) {
            return null;
        }
        return this.B.get(iP);
    }

    public final g1 o(int i, int i10) {
        f0 f0Var = this.B;
        if (i == 0 && i10 == f0Var.size()) {
            return this;
        }
        Comparator comparator = this.f14571y;
        return i < i10 ? new g1(f0Var.subList(i, i10), comparator) : k0.m(comparator);
    }

    public final int p(Object obj, boolean z2) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.B, obj, this.f14571y);
        return iBinarySearch >= 0 ? z2 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int q(Object obj, boolean z2) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.B, obj, this.f14571y);
        return iBinarySearch >= 0 ? z2 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.B.size();
    }
}
