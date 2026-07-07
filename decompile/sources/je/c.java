package je;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends ie.e implements RandomAccess, Serializable {
    public static final c A;

    /* renamed from: x, reason: collision with root package name */
    public Object[] f7422x;

    /* renamed from: y, reason: collision with root package name */
    public int f7423y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7424z;

    static {
        c cVar = new c(0);
        cVar.f7424z = true;
        A = cVar;
    }

    public c(int i6) {
        if (i6 >= 0) {
            this.f7422x = new Object[i6];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // ie.e
    public final int a() {
        return this.f7423y;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i6 = this.f7423y;
        ((AbstractList) this).modCount++;
        g(i6, 1);
        this.f7422x[i6] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        k.e(elements, "elements");
        f();
        int size = elements.size();
        d(this.f7423y, elements, size);
        return size > 0;
    }

    @Override // ie.e
    public final Object b(int i6) {
        f();
        int i10 = this.f7423y;
        if (i6 >= 0 && i6 < i10) {
            return h(i6);
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        j(0, this.f7423y);
    }

    public final void d(int i6, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        g(i6, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f7422x[i6 + i11] = it.next();
        }
    }

    public final void e(int i6, Object obj) {
        ((AbstractList) this).modCount++;
        g(i6, 1);
        this.f7422x[i6] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f7422x;
                int i6 = this.f7423y;
                if (i6 == list.size()) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        if (k.a(objArr[i10], list.get(i10))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void f() {
        if (!this.f7424z) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i6, int i10) {
        int i11 = this.f7423y + i10;
        if (i11 >= 0) {
            Object[] objArr = this.f7422x;
            if (i11 > objArr.length) {
                int length = objArr.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                if (i12 - 2147483639 > 0) {
                    if (i11 > 2147483639) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr, i12);
                k.d(copyOf, "copyOf(...)");
                this.f7422x = copyOf;
            }
            Object[] objArr2 = this.f7422x;
            ie.i.d0(i6 + i10, i6, this.f7423y, objArr2, objArr2);
            this.f7423y += i10;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        int i10 = this.f7423y;
        if (i6 >= 0 && i6 < i10) {
            return this.f7422x[i6];
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    public final Object h(int i6) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f7422x;
        Object obj = objArr[i6];
        ie.i.d0(i6, i6 + 1, this.f7423y, objArr, objArr);
        Object[] objArr2 = this.f7422x;
        int i10 = this.f7423y - 1;
        k.e(objArr2, "<this>");
        objArr2[i10] = null;
        this.f7423y--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6;
        Object[] objArr = this.f7422x;
        int i10 = this.f7423y;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            int i13 = i11 * 31;
            if (obj != null) {
                i6 = obj.hashCode();
            } else {
                i6 = 0;
            }
            i11 = i13 + i6;
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i6 = 0; i6 < this.f7423y; i6++) {
            if (k.a(this.f7422x[i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f7423y == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i6, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f7422x;
        ie.i.d0(i6, i6 + i10, this.f7423y, objArr, objArr);
        Object[] objArr2 = this.f7422x;
        int i11 = this.f7423y;
        s1.c.u(objArr2, i11 - i10, i11);
        this.f7423y -= i10;
    }

    public final int k(int i6, int i10, Collection collection, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i6 + i11;
            if (collection.contains(this.f7422x[i13]) == z10) {
                Object[] objArr = this.f7422x;
                i11++;
                objArr[i12 + i6] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f7422x;
        ie.i.d0(i6 + i12, i10 + i6, this.f7423y, objArr2, objArr2);
        Object[] objArr3 = this.f7422x;
        int i15 = this.f7423y;
        s1.c.u(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f7423y -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i6 = this.f7423y - 1; i6 >= 0; i6--) {
            if (k.a(this.f7422x[i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        k.e(elements, "elements");
        f();
        if (k(0, this.f7423y, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        k.e(elements, "elements");
        f();
        if (k(0, this.f7423y, elements, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        f();
        int i10 = this.f7423y;
        if (i6 >= 0 && i6 < i10) {
            Object[] objArr = this.f7422x;
            Object obj2 = objArr[i6];
            objArr[i6] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i6, int i10) {
        a8.e.j(i6, i10, this.f7423y);
        return new b(this.f7422x, i6, i10 - i6, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        k.e(array, "array");
        int length = array.length;
        int i6 = this.f7423y;
        if (length < i6) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f7422x, 0, i6, array.getClass());
            k.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        ie.i.d0(0, 0, i6, this.f7422x, array);
        int i10 = this.f7423y;
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return s1.c.a(this.f7422x, 0, this.f7423y, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        int i10 = this.f7423y;
        if (i6 >= 0 && i6 <= i10) {
            return new a(this, i6);
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection elements) {
        k.e(elements, "elements");
        f();
        int i10 = this.f7423y;
        if (i6 >= 0 && i6 <= i10) {
            int size = elements.size();
            d(i6, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        f();
        int i10 = this.f7423y;
        if (i6 >= 0 && i6 <= i10) {
            ((AbstractList) this).modCount++;
            g(i6, 1);
            this.f7422x[i6] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ie.i.h0(this.f7422x, 0, this.f7423y);
    }
}
