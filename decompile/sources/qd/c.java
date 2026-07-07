package qd;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends pd.e implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f10994y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object[] f10995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10997x;

    static {
        c cVar = new c(0);
        cVar.f10997x = true;
        f10994y = cVar;
    }

    public c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f10995v = new Object[i];
    }

    @Override // pd.e
    public final int a() {
        return this.f10996w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i = this.f10996w;
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.f10995v[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        de.i.e(collection, "elements");
        f();
        int size = collection.size();
        d(this.f10996w, collection, size);
        return size > 0;
    }

    @Override // pd.e
    public final Object b(int i) {
        f();
        int i10 = this.f10996w;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(j4.a.k(i, i10, "index: ", ", size: "));
        }
        return i(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        j(0, this.f10996w);
    }

    public final void d(int i, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        g(i, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f10995v[i + i11] = it.next();
        }
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.f10995v[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f10995v;
            int i = this.f10996w;
            if (i == list.size()) {
                for (int i10 = 0; i10 < i; i10++) {
                    if (de.i.a(objArr[i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f10997x) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i, int i10) {
        int i11 = this.f10996w + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f10995v;
        if (i11 > objArr.length) {
            int length = objArr.length;
            int i12 = length + (length >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                i12 = i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i12);
            de.i.d(objArrCopyOf, "copyOf(...)");
            this.f10995v = objArrCopyOf;
        }
        Object[] objArr2 = this.f10995v;
        pd.i.Z(i + i10, i, this.f10996w, objArr2, objArr2);
        this.f10996w += i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i10 = this.f10996w;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(j4.a.k(i, i10, "index: ", ", size: "));
        }
        return this.f10995v[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f10995v;
        int i = this.f10996w;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f10995v;
        Object obj = objArr[i];
        pd.i.Z(i, i + 1, this.f10996w, objArr, objArr);
        Object[] objArr2 = this.f10995v;
        int i10 = this.f10996w - 1;
        de.i.e(objArr2, "<this>");
        objArr2[i10] = null;
        this.f10996w--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f10996w; i++) {
            if (de.i.a(this.f10995v[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f10996w == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f10995v;
        pd.i.Z(i, i + i10, this.f10996w, objArr, objArr);
        Object[] objArr2 = this.f10995v;
        int i11 = this.f10996w;
        com.bumptech.glide.c.I(objArr2, i11 - i10, i11);
        this.f10996w -= i10;
    }

    public final int k(int i, int i10, Collection collection, boolean z2) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i + i11;
            if (collection.contains(this.f10995v[i13]) == z2) {
                Object[] objArr = this.f10995v;
                i11++;
                objArr[i12 + i] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f10995v;
        pd.i.Z(i + i12, i10 + i, this.f10996w, objArr2, objArr2);
        Object[] objArr3 = this.f10995v;
        int i15 = this.f10996w;
        com.bumptech.glide.c.I(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f10996w -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f10996w - 1; i >= 0; i--) {
            if (de.i.a(this.f10995v[i], obj)) {
                return i;
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
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        de.i.e(collection, "elements");
        f();
        return k(0, this.f10996w, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        de.i.e(collection, "elements");
        f();
        return k(0, this.f10996w, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        int i10 = this.f10996w;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(j4.a.k(i, i10, "index: ", ", size: "));
        }
        Object[] objArr = this.f10995v;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        com.bumptech.glide.e.c(i, i10, this.f10996w);
        return new b(this.f10995v, i, i10 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        de.i.e(objArr, "array");
        int length = objArr.length;
        int i = this.f10996w;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f10995v, 0, i, objArr.getClass());
            de.i.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        pd.i.Z(0, 0, i, this.f10995v, objArr);
        int i10 = this.f10996w;
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return com.bumptech.glide.c.a(this.f10995v, 0, this.f10996w, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i10 = this.f10996w;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(j4.a.k(i, i10, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        de.i.e(collection, "elements");
        f();
        int i10 = this.f10996w;
        if (i >= 0 && i <= i10) {
            int size = collection.size();
            d(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(j4.a.k(i, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        f();
        int i10 = this.f10996w;
        if (i >= 0 && i <= i10) {
            ((AbstractList) this).modCount++;
            g(i, 1);
            this.f10995v[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(j4.a.k(i, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return pd.i.c0(this.f10995v, 0, this.f10996w);
    }
}
