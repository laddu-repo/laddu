package je;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends ie.e implements RandomAccess, Serializable {
    public final b A;
    public final c B;

    /* renamed from: x, reason: collision with root package name */
    public Object[] f7419x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7420y;

    /* renamed from: z, reason: collision with root package name */
    public int f7421z;

    public b(Object[] backing, int i6, int i10, b bVar, c root) {
        int i11;
        k.e(backing, "backing");
        k.e(root, "root");
        this.f7419x = backing;
        this.f7420y = i6;
        this.f7421z = i10;
        this.A = bVar;
        this.B = root;
        i11 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i11;
    }

    @Override // ie.e
    public final int a() {
        f();
        return this.f7421z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f7420y + this.f7421z, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        k.e(elements, "elements");
        g();
        f();
        int size = elements.size();
        d(this.f7420y + this.f7421z, elements, size);
        return size > 0;
    }

    @Override // ie.e
    public final Object b(int i6) {
        g();
        f();
        int i10 = this.f7421z;
        if (i6 >= 0 && i6 < i10) {
            return h(this.f7420y + i6);
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        j(this.f7420y, this.f7421z);
    }

    public final void d(int i6, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        c cVar = this.B;
        b bVar = this.A;
        if (bVar != null) {
            bVar.d(i6, collection, i10);
        } else {
            c cVar2 = c.A;
            cVar.d(i6, collection, i10);
        }
        this.f7419x = cVar.f7422x;
        this.f7421z += i10;
    }

    public final void e(int i6, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.B;
        b bVar = this.A;
        if (bVar != null) {
            bVar.e(i6, obj);
        } else {
            c cVar2 = c.A;
            cVar.e(i6, obj);
        }
        this.f7419x = cVar.f7422x;
        this.f7421z++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f7419x;
                int i6 = this.f7421z;
                if (i6 == list.size()) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        if (k.a(objArr[this.f7420y + i10], list.get(i10))) {
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
        int i6;
        i6 = ((AbstractList) this.B).modCount;
        if (i6 == ((AbstractList) this).modCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (!this.B.f7424z) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        f();
        int i10 = this.f7421z;
        if (i6 >= 0 && i6 < i10) {
            return this.f7419x[this.f7420y + i6];
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    public final Object h(int i6) {
        Object h4;
        ((AbstractList) this).modCount++;
        b bVar = this.A;
        if (bVar != null) {
            h4 = bVar.h(i6);
        } else {
            c cVar = c.A;
            h4 = this.B.h(i6);
        }
        this.f7421z--;
        return h4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6;
        f();
        Object[] objArr = this.f7419x;
        int i10 = this.f7421z;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[this.f7420y + i12];
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
        f();
        for (int i6 = 0; i6 < this.f7421z; i6++) {
            if (k.a(this.f7419x[this.f7420y + i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        if (this.f7421z == 0) {
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
        b bVar = this.A;
        if (bVar != null) {
            bVar.j(i6, i10);
        } else {
            c cVar = c.A;
            this.B.j(i6, i10);
        }
        this.f7421z -= i10;
    }

    public final int k(int i6, int i10, Collection collection, boolean z10) {
        int k8;
        b bVar = this.A;
        if (bVar != null) {
            k8 = bVar.k(i6, i10, collection, z10);
        } else {
            c cVar = c.A;
            k8 = this.B.k(i6, i10, collection, z10);
        }
        if (k8 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f7421z -= k8;
        return k8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i6 = this.f7421z - 1; i6 >= 0; i6--) {
            if (k.a(this.f7419x[this.f7420y + i6], obj)) {
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
        g();
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
        g();
        f();
        if (k(this.f7420y, this.f7421z, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        k.e(elements, "elements");
        g();
        f();
        if (k(this.f7420y, this.f7421z, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        g();
        f();
        int i10 = this.f7421z;
        if (i6 >= 0 && i6 < i10) {
            Object[] objArr = this.f7419x;
            int i11 = this.f7420y;
            Object obj2 = objArr[i11 + i6];
            objArr[i11 + i6] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i6, int i10) {
        a8.e.j(i6, i10, this.f7421z);
        return new b(this.f7419x, this.f7420y + i6, i10 - i6, this, this.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        k.e(array, "array");
        f();
        int length = array.length;
        int i6 = this.f7421z;
        int i10 = this.f7420y;
        if (length < i6) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f7419x, i10, i6 + i10, array.getClass());
            k.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        ie.i.d0(0, i10, i6 + i10, this.f7419x, array);
        int i11 = this.f7421z;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return s1.c.a(this.f7419x, this.f7420y, this.f7421z, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        f();
        int i10 = this.f7421z;
        if (i6 >= 0 && i6 <= i10) {
            return new a(this, i6);
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        g();
        f();
        int i10 = this.f7421z;
        if (i6 >= 0 && i6 <= i10) {
            e(this.f7420y + i6, obj);
            return;
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection elements) {
        k.e(elements, "elements");
        g();
        f();
        int i10 = this.f7421z;
        if (i6 >= 0 && i6 <= i10) {
            int size = elements.size();
            d(this.f7420y + i6, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f7419x;
        int i6 = this.f7421z;
        int i10 = this.f7420y;
        return ie.i.h0(objArr, i10, i6 + i10);
    }
}
