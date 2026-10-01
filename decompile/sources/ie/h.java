package ie;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends e {
    public static final Object[] A = new Object[0];

    /* renamed from: x, reason: collision with root package name */
    public int f6842x;

    /* renamed from: y, reason: collision with root package name */
    public Object[] f6843y;

    /* renamed from: z, reason: collision with root package name */
    public int f6844z;

    public h() {
        this.f6843y = A;
    }

    @Override // ie.e
    public final int a() {
        return this.f6844z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i10;
        int i11 = this.f6844z;
        if (i6 < 0 || i6 > i11) {
            throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i11));
        }
        if (i6 == i11) {
            addLast(obj);
            return;
        }
        if (i6 == 0) {
            addFirst(obj);
            return;
        }
        l();
        d(this.f6844z + 1);
        int k8 = k(this.f6842x + i6);
        int i12 = this.f6844z;
        if (i6 < ((i12 + 1) >> 1)) {
            if (k8 == 0) {
                Object[] objArr = this.f6843y;
                kotlin.jvm.internal.k.e(objArr, "<this>");
                k8 = objArr.length;
            }
            int i13 = k8 - 1;
            int i14 = this.f6842x;
            if (i14 == 0) {
                Object[] objArr2 = this.f6843y;
                kotlin.jvm.internal.k.e(objArr2, "<this>");
                i10 = objArr2.length - 1;
            } else {
                i10 = i14 - 1;
            }
            int i15 = this.f6842x;
            if (i13 >= i15) {
                Object[] objArr3 = this.f6843y;
                objArr3[i10] = objArr3[i15];
                i.d0(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f6843y;
                i.d0(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f6843y;
                objArr5[objArr5.length - 1] = objArr5[0];
                i.d0(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f6843y[i13] = obj;
            this.f6842x = i10;
        } else {
            int k9 = k(i12 + this.f6842x);
            if (k8 < k9) {
                Object[] objArr6 = this.f6843y;
                i.d0(k8 + 1, k8, k9, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f6843y;
                i.d0(1, 0, k9, objArr7, objArr7);
                Object[] objArr8 = this.f6843y;
                objArr8[0] = objArr8[objArr8.length - 1];
                i.d0(k8 + 1, k8, objArr8.length - 1, objArr8, objArr8);
            }
            this.f6843y[k8] = obj;
        }
        this.f6844z++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection elements) {
        kotlin.jvm.internal.k.e(elements, "elements");
        int i10 = this.f6844z;
        if (i6 >= 0 && i6 <= i10) {
            if (elements.isEmpty()) {
                return false;
            }
            if (i6 == this.f6844z) {
                return addAll(elements);
            }
            l();
            d(elements.size() + this.f6844z);
            int k8 = k(this.f6844z + this.f6842x);
            int k9 = k(this.f6842x + i6);
            int size = elements.size();
            if (i6 < ((this.f6844z + 1) >> 1)) {
                int i11 = this.f6842x;
                int i12 = i11 - size;
                if (k9 < i11) {
                    Object[] objArr = this.f6843y;
                    i.d0(i12, i11, objArr.length, objArr, objArr);
                    if (size >= k9) {
                        Object[] objArr2 = this.f6843y;
                        i.d0(objArr2.length - size, 0, k9, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f6843y;
                        i.d0(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f6843y;
                        i.d0(0, size, k9, objArr4, objArr4);
                    }
                } else if (i12 >= 0) {
                    Object[] objArr5 = this.f6843y;
                    i.d0(i12, i11, k9, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f6843y;
                    i12 += objArr6.length;
                    int i13 = k9 - i11;
                    int length = objArr6.length - i12;
                    if (length >= i13) {
                        i.d0(i12, i11, k9, objArr6, objArr6);
                    } else {
                        i.d0(i12, i11, i11 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f6843y;
                        i.d0(0, this.f6842x + length, k9, objArr7, objArr7);
                    }
                }
                this.f6842x = i12;
                c(h(k9 - size), elements);
                return true;
            }
            int i14 = k9 + size;
            if (k9 < k8) {
                int i15 = size + k8;
                Object[] objArr8 = this.f6843y;
                if (i15 <= objArr8.length) {
                    i.d0(i14, k9, k8, objArr8, objArr8);
                } else if (i14 >= objArr8.length) {
                    i.d0(i14 - objArr8.length, k9, k8, objArr8, objArr8);
                } else {
                    int length2 = k8 - (i15 - objArr8.length);
                    i.d0(0, length2, k8, objArr8, objArr8);
                    Object[] objArr9 = this.f6843y;
                    i.d0(i14, k9, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f6843y;
                i.d0(size, 0, k8, objArr10, objArr10);
                Object[] objArr11 = this.f6843y;
                if (i14 >= objArr11.length) {
                    i.d0(i14 - objArr11.length, k9, objArr11.length, objArr11, objArr11);
                } else {
                    i.d0(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f6843y;
                    i.d0(i14, k9, objArr12.length - size, objArr12, objArr12);
                }
            }
            c(k9, elements);
            return true;
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    public final void addFirst(Object obj) {
        l();
        d(this.f6844z + 1);
        int i6 = this.f6842x;
        if (i6 == 0) {
            Object[] objArr = this.f6843y;
            kotlin.jvm.internal.k.e(objArr, "<this>");
            i6 = objArr.length;
        }
        int i10 = i6 - 1;
        this.f6842x = i10;
        this.f6843y[i10] = obj;
        this.f6844z++;
    }

    public final void addLast(Object obj) {
        l();
        d(a() + 1);
        this.f6843y[k(a() + this.f6842x)] = obj;
        this.f6844z = a() + 1;
    }

    @Override // ie.e
    public final Object b(int i6) {
        int i10 = this.f6844z;
        if (i6 >= 0 && i6 < i10) {
            if (i6 == k.s(this)) {
                return removeLast();
            }
            if (i6 == 0) {
                return removeFirst();
            }
            l();
            int k8 = k(this.f6842x + i6);
            Object[] objArr = this.f6843y;
            Object obj = objArr[k8];
            if (i6 < (this.f6844z >> 1)) {
                int i11 = this.f6842x;
                if (k8 >= i11) {
                    i.d0(i11 + 1, i11, k8, objArr, objArr);
                } else {
                    i.d0(1, 0, k8, objArr, objArr);
                    Object[] objArr2 = this.f6843y;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i12 = this.f6842x;
                    i.d0(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f6843y;
                int i13 = this.f6842x;
                objArr3[i13] = null;
                this.f6842x = f(i13);
            } else {
                int k9 = k(k.s(this) + this.f6842x);
                if (k8 <= k9) {
                    Object[] objArr4 = this.f6843y;
                    i.d0(k8, k8 + 1, k9 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f6843y;
                    i.d0(k8, k8 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f6843y;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    i.d0(0, 1, k9 + 1, objArr6, objArr6);
                }
                this.f6843y[k9] = null;
            }
            this.f6844z--;
            return obj;
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    public final void c(int i6, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f6843y.length;
        while (i6 < length && it.hasNext()) {
            this.f6843y[i6] = it.next();
            i6++;
        }
        int i10 = this.f6842x;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f6843y[i11] = it.next();
        }
        this.f6844z = collection.size() + this.f6844z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            l();
            j(this.f6842x, k(a() + this.f6842x));
        }
        this.f6842x = 0;
        this.f6844z = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i6) {
        if (i6 >= 0) {
            Object[] objArr = this.f6843y;
            if (i6 <= objArr.length) {
                return;
            }
            if (objArr == A) {
                if (i6 < 10) {
                    i6 = 10;
                }
                this.f6843y = new Object[i6];
                return;
            }
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i6 < 0) {
                i10 = i6;
            }
            if (i10 - 2147483639 > 0) {
                if (i6 > 2147483639) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i10];
            i.d0(0, this.f6842x, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f6843y;
            int length2 = objArr3.length;
            int i11 = this.f6842x;
            i.d0(length2 - i11, 0, i11, objArr3, objArr2);
            this.f6842x = 0;
            this.f6843y = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.f6843y[this.f6842x];
    }

    public final int f(int i6) {
        kotlin.jvm.internal.k.e(this.f6843y, "<this>");
        if (i6 == r0.length - 1) {
            return 0;
        }
        return i6 + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f6843y[this.f6842x];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.f6843y[k(k.s(this) + this.f6842x)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        int a10 = a();
        if (i6 >= 0 && i6 < a10) {
            return this.f6843y[k(this.f6842x + i6)];
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, a10));
    }

    public final int h(int i6) {
        if (i6 < 0) {
            return i6 + this.f6843y.length;
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i6;
        int k8 = k(a() + this.f6842x);
        int i10 = this.f6842x;
        if (i10 < k8) {
            while (i10 < k8) {
                if (kotlin.jvm.internal.k.a(obj, this.f6843y[i10])) {
                    i6 = this.f6842x;
                } else {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 >= k8) {
            int length = this.f6843y.length;
            while (true) {
                if (i10 < length) {
                    if (kotlin.jvm.internal.k.a(obj, this.f6843y[i10])) {
                        i6 = this.f6842x;
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < k8; i11++) {
                        if (kotlin.jvm.internal.k.a(obj, this.f6843y[i11])) {
                            i10 = i11 + this.f6843y.length;
                            i6 = this.f6842x;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    public final void j(int i6, int i10) {
        if (i6 < i10) {
            i.i0(this.f6843y, null, i6, i10);
            return;
        }
        Object[] objArr = this.f6843y;
        i.i0(objArr, null, i6, objArr.length);
        i.i0(this.f6843y, null, 0, i10);
    }

    public final int k(int i6) {
        Object[] objArr = this.f6843y;
        if (i6 >= objArr.length) {
            return i6 - objArr.length;
        }
        return i6;
    }

    public final void l() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f6843y[k(k.s(this) + this.f6842x)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i6;
        int k8 = k(this.f6844z + this.f6842x);
        int i10 = this.f6842x;
        if (i10 < k8) {
            length = k8 - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.k.a(obj, this.f6843y[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i6 = this.f6842x;
                return length - i6;
            }
            return -1;
        }
        if (i10 > k8) {
            int i11 = k8 - 1;
            while (true) {
                if (-1 < i11) {
                    if (kotlin.jvm.internal.k.a(obj, this.f6843y[i11])) {
                        length = i11 + this.f6843y.length;
                        i6 = this.f6842x;
                        break;
                    }
                    i11--;
                } else {
                    Object[] objArr = this.f6843y;
                    kotlin.jvm.internal.k.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f6842x;
                    if (i12 <= length) {
                        while (!kotlin.jvm.internal.k.a(obj, this.f6843y[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i6 = this.f6842x;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int k8;
        kotlin.jvm.internal.k.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f6843y.length != 0) {
            int k9 = k(a() + this.f6842x);
            int i6 = this.f6842x;
            if (i6 < k9) {
                k8 = i6;
                while (i6 < k9) {
                    Object obj = this.f6843y[i6];
                    if (!elements.contains(obj)) {
                        this.f6843y[k8] = obj;
                        k8++;
                    } else {
                        z10 = true;
                    }
                    i6++;
                }
                i.i0(this.f6843y, null, k8, k9);
            } else {
                int length = this.f6843y.length;
                int i10 = i6;
                boolean z11 = false;
                while (i6 < length) {
                    Object[] objArr = this.f6843y;
                    Object obj2 = objArr[i6];
                    objArr[i6] = null;
                    if (!elements.contains(obj2)) {
                        this.f6843y[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i6++;
                }
                k8 = k(i10);
                for (int i11 = 0; i11 < k9; i11++) {
                    Object[] objArr2 = this.f6843y;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (!elements.contains(obj3)) {
                        this.f6843y[k8] = obj3;
                        k8 = f(k8);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                l();
                this.f6844z = h(k8 - this.f6842x);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            l();
            Object[] objArr = this.f6843y;
            int i6 = this.f6842x;
            Object obj = objArr[i6];
            objArr[i6] = null;
            this.f6842x = f(i6);
            this.f6844z = a() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            l();
            int k8 = k(k.s(this) + this.f6842x);
            Object[] objArr = this.f6843y;
            Object obj = objArr[k8];
            objArr[k8] = null;
            this.f6844z = a() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i10) {
        a8.e.j(i6, i10, this.f6844z);
        int i11 = i10 - i6;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f6844z) {
            clear();
            return;
        }
        if (i11 == 1) {
            b(i6);
            return;
        }
        l();
        if (i6 < this.f6844z - i10) {
            int k8 = k(this.f6842x + (i6 - 1));
            int k9 = k(this.f6842x + (i10 - 1));
            while (i6 > 0) {
                int i12 = k8 + 1;
                int min = Math.min(i6, Math.min(i12, k9 + 1));
                Object[] objArr = this.f6843y;
                int i13 = k9 - min;
                int i14 = k8 - min;
                i.d0(i13 + 1, i14 + 1, i12, objArr, objArr);
                k8 = h(i14);
                k9 = h(i13);
                i6 -= min;
            }
            int k10 = k(this.f6842x + i11);
            j(this.f6842x, k10);
            this.f6842x = k10;
        } else {
            int k11 = k(this.f6842x + i10);
            int k12 = k(this.f6842x + i6);
            int i15 = this.f6844z;
            while (true) {
                i15 -= i10;
                if (i15 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f6843y;
                i10 = Math.min(i15, Math.min(objArr2.length - k11, objArr2.length - k12));
                Object[] objArr3 = this.f6843y;
                int i16 = k11 + i10;
                i.d0(k12, k11, i16, objArr3, objArr3);
                k11 = k(i16);
                k12 = k(k12 + i10);
            }
            int k13 = k(this.f6844z + this.f6842x);
            j(h(k13 - i11), k13);
        }
        this.f6844z -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int k8;
        kotlin.jvm.internal.k.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f6843y.length != 0) {
            int k9 = k(a() + this.f6842x);
            int i6 = this.f6842x;
            if (i6 < k9) {
                k8 = i6;
                while (i6 < k9) {
                    Object obj = this.f6843y[i6];
                    if (elements.contains(obj)) {
                        this.f6843y[k8] = obj;
                        k8++;
                    } else {
                        z10 = true;
                    }
                    i6++;
                }
                i.i0(this.f6843y, null, k8, k9);
            } else {
                int length = this.f6843y.length;
                int i10 = i6;
                boolean z11 = false;
                while (i6 < length) {
                    Object[] objArr = this.f6843y;
                    Object obj2 = objArr[i6];
                    objArr[i6] = null;
                    if (elements.contains(obj2)) {
                        this.f6843y[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i6++;
                }
                k8 = k(i10);
                for (int i11 = 0; i11 < k9; i11++) {
                    Object[] objArr2 = this.f6843y;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f6843y[k8] = obj3;
                        k8 = f(k8);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                l();
                this.f6844z = h(k8 - this.f6842x);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        int a10 = a();
        if (i6 >= 0 && i6 < a10) {
            int k8 = k(this.f6842x + i6);
            Object[] objArr = this.f6843y;
            Object obj2 = objArr[k8];
            objArr[k8] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, a10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public h(int i6) {
        Object[] objArr;
        if (i6 == 0) {
            objArr = A;
        } else if (i6 > 0) {
            objArr = new Object[i6];
        } else {
            throw new IllegalArgumentException(h8.c.i(i6, "Illegal Capacity: "));
        }
        this.f6843y = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.k.e(array, "array");
        int length = array.length;
        int i6 = this.f6844z;
        if (length < i6) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i6);
            kotlin.jvm.internal.k.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int k8 = k(this.f6844z + this.f6842x);
        int i10 = this.f6842x;
        if (i10 < k8) {
            i.e0(i10, k8, 2, this.f6843y, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f6843y;
            i.d0(0, this.f6842x, objArr.length, objArr, array);
            Object[] objArr2 = this.f6843y;
            i.d0(objArr2.length - this.f6842x, 0, k8, objArr2, array);
        }
        int i11 = this.f6844z;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    public h(df.i iVar) {
        Object[] m9 = kotlin.jvm.internal.k.m(iVar, new Object[0]);
        this.f6843y = m9;
        this.f6844z = m9.length;
        if (m9.length == 0) {
            this.f6843y = A;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.k.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        l();
        d(elements.size() + a());
        c(k(a() + this.f6842x), elements);
        return true;
    }
}
