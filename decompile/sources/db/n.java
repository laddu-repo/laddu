package db;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends AbstractCollection {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4019x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f4020y;

    public /* synthetic */ n(int i6, Serializable serializable) {
        this.f4019x = i6;
        this.f4020y = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f4019x) {
            case 0:
                ((y0) this.f4020y).c();
                return;
            case 1:
                ((v) this.f4020y).clear();
                return;
            default:
                ((d) this.f4020y).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f4019x) {
            case 0:
                return ((y0) this.f4020y).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((d) this.f4020y).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f4019x) {
            case 2:
                return ((d) this.f4020y).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4019x) {
            case 0:
                return new a((y0) this.f4020y);
            case 1:
                v vVar = (v) this.f4020y;
                Map c10 = vVar.c();
                if (c10 != null) {
                    return c10.values().iterator();
                }
                return new s(vVar, 2);
            default:
                return new p1(((d) this.f4020y).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f4019x) {
            case 2:
                d dVar = (d) this.f4020y;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (e9.f.c(obj, entry.getValue())) {
                            dVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f4019x) {
            case 2:
                d dVar = (d) this.f4020y;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f4019x) {
            case 2:
                d dVar = (d) this.f4020y;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f4019x) {
            case 0:
                return ((y0) this.f4020y).B;
            case 1:
                return ((v) this.f4020y).size();
            default:
                return ((d) this.f4020y).f3991z.size();
        }
    }

    public n(d dVar) {
        this.f4019x = 2;
        this.f4020y = dVar;
    }
}
