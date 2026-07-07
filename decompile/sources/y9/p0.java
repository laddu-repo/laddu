package y9;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements ListIterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14597v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ListIterator f14598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q0 f14599x;

    public p0(q0 q0Var, ListIterator listIterator) {
        this.f14598w = listIterator;
        this.f14599x = q0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f14598w;
        listIterator.add(obj);
        listIterator.previous();
        this.f14597v = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14598w.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14598w.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f14598w;
        if (!listIterator.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f14597v = true;
        return listIterator.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14599x.a(this.f14598w.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f14598w;
        if (!listIterator.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14597v = true;
        return listIterator.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        p4.v.q("no calls to next() since the last call to remove()", this.f14597v);
        this.f14598w.remove();
        this.f14597v = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        p4.v.r(this.f14597v);
        this.f14598w.set(obj);
    }
}
