package cf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Iterator, we.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2048x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f2049y;

    /* renamed from: z, reason: collision with root package name */
    public final Iterator f2050z;

    public b(Iterator iterator) {
        kotlin.jvm.internal.k.e(iterator, "iterator");
        this.f2050z = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2048x) {
            case 0:
                break;
            case 1:
                if (this.f2049y > 0 && this.f2050z.hasNext()) {
                    return true;
                }
                return false;
            default:
                return this.f2050z.hasNext();
        }
        while (true) {
            int i6 = this.f2049y;
            it = this.f2050z;
            if (i6 > 0 && it.hasNext()) {
                it.next();
                this.f2049y--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2048x) {
            case 0:
                break;
            case 1:
                int i6 = this.f2049y;
                if (i6 != 0) {
                    this.f2049y = i6 - 1;
                    return this.f2050z.next();
                }
                throw new NoSuchElementException();
            default:
                int i10 = this.f2049y;
                this.f2049y = i10 + 1;
                if (i10 >= 0) {
                    return new ie.u(i10, this.f2050z.next());
                }
                ie.k.w();
                throw null;
        }
        while (true) {
            int i11 = this.f2049y;
            it = this.f2050z;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f2049y--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2048x) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar, byte b10) {
        this.f2049y = cVar.f2053c;
        this.f2050z = cVar.f2052b.iterator();
    }

    public b(c cVar) {
        this.f2050z = cVar.f2052b.iterator();
        this.f2049y = cVar.f2053c;
    }
}
