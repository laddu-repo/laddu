package pd;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object[] f10546y = new Object[0];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f10548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10549x;

    public h() {
        this.f10548w = f10546y;
    }

    @Override // pd.e
    public final int a() {
        return this.f10549x;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i10 = this.f10549x;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(j4.a.k(i, i10, "index: ", ", size: "));
        }
        if (i == i10) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        j();
        d(this.f10549x + 1);
        int i11 = i(this.f10547v + i);
        int i12 = this.f10549x;
        if (i < ((i12 + 1) >> 1)) {
            if (i11 == 0) {
                Object[] objArr = this.f10548w;
                de.i.e(objArr, "<this>");
                i11 = objArr.length;
            }
            int i13 = i11 - 1;
            int i14 = this.f10547v;
            if (i14 == 0) {
                Object[] objArr2 = this.f10548w;
                de.i.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f10547v;
            if (i13 >= i15) {
                Object[] objArr3 = this.f10548w;
                objArr3[length] = objArr3[i15];
                i.Z(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f10548w;
                i.Z(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f10548w;
                objArr5[objArr5.length - 1] = objArr5[0];
                i.Z(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f10548w[i13] = obj;
            this.f10547v = length;
        } else {
            int i16 = i(i12 + this.f10547v);
            if (i11 < i16) {
                Object[] objArr6 = this.f10548w;
                i.Z(i11 + 1, i11, i16, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f10548w;
                i.Z(1, 0, i16, objArr7, objArr7);
                Object[] objArr8 = this.f10548w;
                objArr8[0] = objArr8[objArr8.length - 1];
                i.Z(i11 + 1, i11, objArr8.length - 1, objArr8, objArr8);
            }
            this.f10548w[i11] = obj;
        }
        this.f10549x++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        de.i.e(collection, "elements");
        int i10 = this.f10549x;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(j4.a.k(i, i10, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f10549x) {
            return addAll(collection);
        }
        j();
        d(collection.size() + this.f10549x);
        int i11 = i(this.f10549x + this.f10547v);
        int i12 = i(this.f10547v + i);
        int size = collection.size();
        if (i >= ((this.f10549x + 1) >> 1)) {
            int i13 = i12 + size;
            if (i12 < i11) {
                int i14 = size + i11;
                Object[] objArr = this.f10548w;
                if (i14 <= objArr.length) {
                    i.Z(i13, i12, i11, objArr, objArr);
                } else if (i13 >= objArr.length) {
                    i.Z(i13 - objArr.length, i12, i11, objArr, objArr);
                } else {
                    int length = i11 - (i14 - objArr.length);
                    i.Z(0, length, i11, objArr, objArr);
                    Object[] objArr2 = this.f10548w;
                    i.Z(i13, i12, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f10548w;
                i.Z(size, 0, i11, objArr3, objArr3);
                Object[] objArr4 = this.f10548w;
                if (i13 >= objArr4.length) {
                    i.Z(i13 - objArr4.length, i12, objArr4.length, objArr4, objArr4);
                } else {
                    i.Z(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f10548w;
                    i.Z(i13, i12, objArr5.length - size, objArr5, objArr5);
                }
            }
            c(i12, collection);
            return true;
        }
        int i15 = this.f10547v;
        int length2 = i15 - size;
        if (i12 < i15) {
            Object[] objArr6 = this.f10548w;
            i.Z(length2, i15, objArr6.length, objArr6, objArr6);
            if (size >= i12) {
                Object[] objArr7 = this.f10548w;
                i.Z(objArr7.length - size, 0, i12, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f10548w;
                i.Z(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f10548w;
                i.Z(0, size, i12, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f10548w;
            i.Z(length2, i15, i12, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f10548w;
            length2 += objArr11.length;
            int i16 = i12 - i15;
            int length3 = objArr11.length - length2;
            if (length3 >= i16) {
                i.Z(length2, i15, i12, objArr11, objArr11);
            } else {
                i.Z(length2, i15, i15 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f10548w;
                i.Z(0, this.f10547v + length3, i12, objArr12, objArr12);
            }
        }
        this.f10547v = length2;
        c(f(i12 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        d(this.f10549x + 1);
        int length = this.f10547v;
        if (length == 0) {
            Object[] objArr = this.f10548w;
            de.i.e(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f10547v = i;
        this.f10548w[i] = obj;
        this.f10549x++;
    }

    public final void addLast(Object obj) {
        j();
        d(a() + 1);
        this.f10548w[i(a() + this.f10547v)] = obj;
        this.f10549x = a() + 1;
    }

    @Override // pd.e
    public final Object b(int i) {
        int i10 = this.f10549x;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(j4.a.k(i, i10, "index: ", ", size: "));
        }
        if (i == k.A(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int i11 = i(this.f10547v + i);
        Object[] objArr = this.f10548w;
        Object obj = objArr[i11];
        if (i < (this.f10549x >> 1)) {
            int i12 = this.f10547v;
            if (i11 >= i12) {
                i.Z(i12 + 1, i12, i11, objArr, objArr);
            } else {
                i.Z(1, 0, i11, objArr, objArr);
                Object[] objArr2 = this.f10548w;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f10547v;
                i.Z(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f10548w;
            int i14 = this.f10547v;
            objArr3[i14] = null;
            this.f10547v = e(i14);
        } else {
            int i15 = i(k.A(this) + this.f10547v);
            if (i11 <= i15) {
                Object[] objArr4 = this.f10548w;
                i.Z(i11, i11 + 1, i15 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f10548w;
                i.Z(i11, i11 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f10548w;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.Z(0, 1, i15 + 1, objArr6, objArr6);
            }
            this.f10548w[i15] = null;
        }
        this.f10549x--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f10548w.length;
        while (i < length && it.hasNext()) {
            this.f10548w[i] = it.next();
            i++;
        }
        int i10 = this.f10547v;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f10548w[i11] = it.next();
        }
        this.f10549x = collection.size() + this.f10549x;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            g(this.f10547v, i(a() + this.f10547v));
        }
        this.f10547v = 0;
        this.f10549x = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f10548w;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f10546y) {
            if (i < 10) {
                i = 10;
            }
            this.f10548w = new Object[i];
            return;
        }
        int length = objArr.length;
        int i10 = length + (length >> 1);
        if (i10 - i < 0) {
            i10 = i;
        }
        if (i10 - 2147483639 > 0) {
            i10 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i10];
        i.Z(0, this.f10547v, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f10548w;
        int length2 = objArr3.length;
        int i11 = this.f10547v;
        i.Z(length2 - i11, 0, i11, objArr3, objArr2);
        this.f10547v = 0;
        this.f10548w = objArr2;
    }

    public final int e(int i) {
        de.i.e(this.f10548w, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int f(int i) {
        return i < 0 ? i + this.f10548w.length : i;
    }

    public final void g(int i, int i10) {
        if (i < i10) {
            i.d0(this.f10548w, i, i10);
            return;
        }
        Object[] objArr = this.f10548w;
        i.d0(objArr, i, objArr.length);
        i.d0(this.f10548w, 0, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(j4.a.k(i, iA, "index: ", ", size: "));
        }
        return this.f10548w[i(this.f10547v + i)];
    }

    public final int i(int i) {
        Object[] objArr = this.f10548w;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i10 = i(a() + this.f10547v);
        int length = this.f10547v;
        if (length < i10) {
            while (length < i10) {
                if (de.i.a(obj, this.f10548w[length])) {
                    i = this.f10547v;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < i10) {
            return -1;
        }
        int length2 = this.f10548w.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (de.i.a(obj, this.f10548w[i11])) {
                        length = i11 + this.f10548w.length;
                        i = this.f10547v;
                    }
                }
                return -1;
            }
            if (de.i.a(obj, this.f10548w[length])) {
                i = this.f10547v;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int i10 = i(this.f10549x + this.f10547v);
        int i11 = this.f10547v;
        if (i11 < i10) {
            length = i10 - 1;
            if (i11 <= length) {
                while (!de.i.a(obj, this.f10548w[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i = this.f10547v;
                return length - i;
            }
            return -1;
        }
        if (i11 > i10) {
            int i12 = i10 - 1;
            while (true) {
                if (-1 >= i12) {
                    Object[] objArr = this.f10548w;
                    de.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f10547v;
                    if (i13 <= length) {
                        while (!de.i.a(obj, this.f10548w[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i = this.f10547v;
                    }
                } else {
                    if (de.i.a(obj, this.f10548w[i12])) {
                        length = i12 + this.f10548w.length;
                        i = this.f10547v;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        de.i.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f10548w.length != 0) {
            int i10 = i(this.f10549x + this.f10547v);
            int i11 = this.f10547v;
            if (i11 < i10) {
                i = i11;
                while (i11 < i10) {
                    Object obj = this.f10548w[i11];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f10548w[i] = obj;
                        i++;
                    }
                    i11++;
                }
                i.d0(this.f10548w, i, i10);
            } else {
                int length = this.f10548w.length;
                boolean z10 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f10548w;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (collection.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f10548w[i12] = obj2;
                        i12++;
                    }
                    i11++;
                }
                i = i(i12);
                for (int i13 = 0; i13 < i10; i13++) {
                    Object[] objArr2 = this.f10548w;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (collection.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f10548w[i] = obj3;
                        i = e(i);
                    }
                }
                z2 = z10;
            }
            if (z2) {
                j();
                this.f10549x = f(i - this.f10547v);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f10548w;
        int i = this.f10547v;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f10547v = e(i);
        this.f10549x = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i = i(k.A(this) + this.f10547v);
        Object[] objArr = this.f10548w;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f10549x = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        com.bumptech.glide.e.c(i, i10, this.f10549x);
        int i11 = i10 - i;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f10549x) {
            clear();
            return;
        }
        if (i11 == 1) {
            b(i);
            return;
        }
        j();
        if (i < this.f10549x - i10) {
            int i12 = i(this.f10547v + (i - 1));
            int i13 = i(this.f10547v + (i10 - 1));
            while (i > 0) {
                int i14 = i12 + 1;
                int iMin = Math.min(i, Math.min(i14, i13 + 1));
                Object[] objArr = this.f10548w;
                int i15 = i13 - iMin;
                int i16 = i12 - iMin;
                i.Z(i15 + 1, i16 + 1, i14, objArr, objArr);
                i12 = f(i16);
                i13 = f(i15);
                i -= iMin;
            }
            int i17 = i(this.f10547v + i11);
            g(this.f10547v, i17);
            this.f10547v = i17;
        } else {
            int i18 = i(this.f10547v + i10);
            int i19 = i(this.f10547v + i);
            int i20 = this.f10549x;
            while (true) {
                i20 -= i10;
                if (i20 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f10548w;
                i10 = Math.min(i20, Math.min(objArr2.length - i18, objArr2.length - i19));
                Object[] objArr3 = this.f10548w;
                int i21 = i18 + i10;
                i.Z(i19, i18, i21, objArr3, objArr3);
                i18 = i(i21);
                i19 = i(i19 + i10);
            }
            int i22 = i(this.f10549x + this.f10547v);
            g(f(i22 - i11), i22);
        }
        this.f10549x -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i;
        de.i.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f10548w.length != 0) {
            int i10 = i(this.f10549x + this.f10547v);
            int i11 = this.f10547v;
            if (i11 < i10) {
                i = i11;
                while (i11 < i10) {
                    Object obj = this.f10548w[i11];
                    if (collection.contains(obj)) {
                        this.f10548w[i] = obj;
                        i++;
                    } else {
                        z2 = true;
                    }
                    i11++;
                }
                i.d0(this.f10548w, i, i10);
            } else {
                int length = this.f10548w.length;
                boolean z10 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f10548w;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (collection.contains(obj2)) {
                        this.f10548w[i12] = obj2;
                        i12++;
                    } else {
                        z10 = true;
                    }
                    i11++;
                }
                i = i(i12);
                for (int i13 = 0; i13 < i10; i13++) {
                    Object[] objArr2 = this.f10548w;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (collection.contains(obj3)) {
                        this.f10548w[i] = obj3;
                        i = e(i);
                    } else {
                        z10 = true;
                    }
                }
                z2 = z10;
            }
            if (z2) {
                j();
                this.f10549x = f(i - this.f10547v);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(j4.a.k(i, iA, "index: ", ", size: "));
        }
        int i10 = i(this.f10547v + i);
        Object[] objArr = this.f10548w;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public h(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f10546y;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(d0.d.h(i, "Illegal Capacity: "));
        }
        this.f10548w = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        de.i.e(objArr, "array");
        int length = objArr.length;
        int i = this.f10549x;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            de.i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int i10 = i(this.f10549x + this.f10547v);
        int i11 = this.f10547v;
        if (i11 < i10) {
            i.a0(i11, i10, 2, this.f10548w, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f10548w;
            i.Z(0, this.f10547v, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f10548w;
            i.Z(objArr3.length - this.f10547v, 0, i10, objArr3, objArr);
        }
        int i12 = this.f10549x;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        de.i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        j();
        d(collection.size() + a());
        c(i(a() + this.f10547v), collection);
        return true;
    }
}
