package y9;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends p1 implements ListIterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14530v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f0 f14532x;

    public c0(f0 f0Var, int i) {
        int size = f0Var.size();
        p4.v.o(i, size);
        this.f14530v = size;
        this.f14531w = i;
        this.f14532x = f0Var;
    }

    public final Object a(int i) {
        return this.f14532x.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f14531w < this.f14530v;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14531w > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f14531w;
        this.f14531w = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14531w;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f14531w - 1;
        this.f14531w = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14531w - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
