package db;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 extends q1 implements ListIterator {

    /* renamed from: x, reason: collision with root package name */
    public final int f4002x;

    /* renamed from: y, reason: collision with root package name */
    public int f4003y;

    /* renamed from: z, reason: collision with root package name */
    public final k0 f4004z;

    public i0(k0 k0Var, int i6) {
        int size = k0Var.size();
        jb.b.g(i6, size);
        this.f4002x = size;
        this.f4003y = i6;
        this.f4004z = k0Var;
    }

    public final Object a(int i6) {
        return this.f4004z.get(i6);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f4003y < this.f4002x) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f4003y > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i6 = this.f4003y;
            this.f4003y = i6 + 1;
            return a(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4003y;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i6 = this.f4003y - 1;
            this.f4003y = i6;
            return a(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4003y - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
