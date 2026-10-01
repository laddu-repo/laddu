package he;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements Collection, we.a {

    /* renamed from: x, reason: collision with root package name */
    public final int[] f6095x;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        int i6 = ((r) obj).f6094x;
        int[] iArr = this.f6095x;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (i6 == iArr[i10]) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        boolean z10;
        kotlin.jvm.internal.k.e(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (obj instanceof r) {
                    int i6 = ((r) obj).f6094x;
                    int[] iArr = this.f6095x;
                    int length = iArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            if (i6 == iArr[i10]) {
                                break;
                            }
                            i10++;
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    if (i10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (!kotlin.jvm.internal.k.a(this.f6095x, ((s) obj).f6095x)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f6095x);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f6095x.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new p(this.f6095x, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f6095x.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.l(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f6095x) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.k.e(array, "array");
        return kotlin.jvm.internal.k.m(this, array);
    }
}
