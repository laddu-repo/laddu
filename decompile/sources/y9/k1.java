package y9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends j1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f14568v).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f14568v.iterator();
        it.getClass();
        x9.i iVar = this.f14569w;
        iVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (iVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new k1(((SortedSet) this.f14568v).headSet(obj), this.f14569w);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f14568v;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f14569w.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new k1(((SortedSet) this.f14568v).subSet(obj, obj2), this.f14569w);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new k1(((SortedSet) this.f14568v).tailSet(obj), this.f14569w);
    }
}
