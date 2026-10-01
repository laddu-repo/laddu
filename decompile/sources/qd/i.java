package qd;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i extends pd.f implements Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final i f11010w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f11011v;

    static {
        f fVar = f.I;
        f11010w = new i(f.I);
    }

    public i(f fVar) {
        de.i.e(fVar, "backing");
        this.f11011v = fVar;
    }

    @Override // pd.f
    public final int a() {
        return this.f11011v.D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f11011v.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        de.i.e(collection, "elements");
        this.f11011v.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f11011v.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f11011v.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f11011v.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f11011v;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f11011v;
        fVar.c();
        int iH = fVar.h(obj);
        if (iH < 0) {
            return false;
        }
        fVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        de.i.e(collection, "elements");
        this.f11011v.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        de.i.e(collection, "elements");
        this.f11011v.c();
        return super.retainAll(collection);
    }

    public i() {
        this(new f());
    }
}
