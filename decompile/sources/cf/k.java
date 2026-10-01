package cf;

import he.y;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements Iterator, le.c, we.a {
    public le.c A;

    /* renamed from: x, reason: collision with root package name */
    public int f2067x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2068y;

    /* renamed from: z, reason: collision with root package name */
    public Iterator f2069z;

    public final RuntimeException b() {
        int i6 = this.f2067x;
        if (i6 != 4) {
            if (i6 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f2067x);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // le.c
    public final le.h getContext() {
        return le.i.f8353x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i6 = this.f2067x;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2 || i6 == 3) {
                        return true;
                    }
                    if (i6 == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.f2069z;
                kotlin.jvm.internal.k.b(it);
                if (it.hasNext()) {
                    this.f2067x = 2;
                    return true;
                }
                this.f2069z = null;
            }
            this.f2067x = 5;
            le.c cVar = this.A;
            kotlin.jvm.internal.k.b(cVar);
            this.A = null;
            cVar.resumeWith(y.f6101a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i6 = this.f2067x;
        if (i6 != 0 && i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    this.f2067x = 0;
                    Object obj = this.f2068y;
                    this.f2068y = null;
                    return obj;
                }
                throw b();
            }
            this.f2067x = 1;
            Iterator it = this.f2069z;
            kotlin.jvm.internal.k.b(it);
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // le.c
    public final void resumeWith(Object obj) {
        he.a.f(obj);
        this.f2067x = 4;
    }
}
