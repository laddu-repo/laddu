package db;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m1 extends l1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f4014x).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f4014x.iterator();
        it.getClass();
        cb.h hVar = this.f4015y;
        hVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (hVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, db.l1] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new l1(((SortedSet) this.f4014x).headSet(obj), this.f4015y);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f4014x;
        while (true) {
            Object last = sortedSet.last();
            if (this.f4015y.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, db.l1] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new l1(((SortedSet) this.f4014x).subSet(obj, obj2), this.f4015y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, db.l1] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new l1(((SortedSet) this.f4014x).tailSet(obj), this.f4015y);
    }
}
