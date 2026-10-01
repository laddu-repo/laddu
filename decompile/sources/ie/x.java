package ie;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x implements ListIterator, we.a {

    /* renamed from: x, reason: collision with root package name */
    public final ListIterator f6851x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.i f6852y;

    public x(df.i iVar, int i6) {
        this.f6852y = iVar;
        List list = (List) iVar.f4137y;
        if (i6 >= 0 && i6 <= iVar.a()) {
            this.f6851x = list.listIterator(iVar.a() - i6);
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Position index ", " must be in range [");
        n10.append(new af.a(0, iVar.a(), 1));
        n10.append("].");
        throw new IndexOutOfBoundsException(n10.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f6851x.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6851x.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f6851x.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return k.s(this.f6852y) - this.f6851x.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f6851x.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return k.s(this.f6852y) - this.f6851x.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
