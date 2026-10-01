package v;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements Collection, Set, we.b {

    /* renamed from: x, reason: collision with root package name */
    public int[] f13149x = w.a.f13508a;

    /* renamed from: y, reason: collision with root package name */
    public Object[] f13150y = w.a.f13510c;

    /* renamed from: z, reason: collision with root package name */
    public int f13151z;

    public f(int i6) {
        if (i6 > 0) {
            j.b(this, i6);
        }
    }

    public final Object a(int i6) {
        int i10 = this.f13151z;
        Object[] objArr = this.f13150y;
        Object obj = objArr[i6];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f13149x;
        int i12 = 8;
        if (iArr.length > 8 && i10 < iArr.length / 3) {
            if (i10 > 8) {
                i12 = i10 + (i10 >> 1);
            }
            int[] iArr2 = new int[i12];
            this.f13149x = iArr2;
            this.f13150y = new Object[i12];
            if (i6 > 0) {
                ie.i.f0(i6, 6, iArr, iArr2);
                ie.i.e0(0, i6, 6, objArr, this.f13150y);
            }
            if (i6 < i11) {
                int i13 = i6 + 1;
                ie.i.c0(i6, i13, i10, iArr, this.f13149x);
                ie.i.d0(i6, i13, i10, objArr, this.f13150y);
            }
        } else {
            if (i6 < i11) {
                int i14 = i6 + 1;
                ie.i.c0(i6, i14, i10, iArr, iArr);
                Object[] objArr2 = this.f13150y;
                ie.i.d0(i6, i14, i10, objArr2, objArr2);
            }
            this.f13150y[i11] = null;
        }
        if (i10 == this.f13151z) {
            this.f13151z = i11;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i6;
        int c10;
        int i10 = this.f13151z;
        if (obj == null) {
            c10 = j.c(this, null, 0);
            i6 = 0;
        } else {
            int hashCode = obj.hashCode();
            i6 = hashCode;
            c10 = j.c(this, obj, hashCode);
        }
        if (c10 >= 0) {
            return false;
        }
        int i11 = ~c10;
        int[] iArr = this.f13149x;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f13150y;
            int[] iArr2 = new int[i12];
            this.f13149x = iArr2;
            this.f13150y = new Object[i12];
            if (i10 == this.f13151z) {
                if (iArr2.length != 0) {
                    ie.i.f0(iArr.length, 6, iArr, iArr2);
                    ie.i.e0(0, objArr.length, 6, objArr, this.f13150y);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f13149x;
            int i13 = i11 + 1;
            ie.i.c0(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f13150y;
            ie.i.d0(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.f13151z;
        if (i10 == i14) {
            int[] iArr4 = this.f13149x;
            if (i11 < iArr4.length) {
                iArr4[i11] = i6;
                this.f13150y[i11] = obj;
                this.f13151z = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.k.e(elements, "elements");
        int size = elements.size() + this.f13151z;
        int i6 = this.f13151z;
        int[] iArr = this.f13149x;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f13150y;
            int[] iArr2 = new int[size];
            this.f13149x = iArr2;
            this.f13150y = new Object[size];
            if (i6 > 0) {
                ie.i.f0(i6, 6, iArr, iArr2);
                ie.i.e0(0, this.f13151z, 6, objArr, this.f13150y);
            }
        }
        if (this.f13151z == i6) {
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                z10 |= add(it.next());
            }
            return z10;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f13151z != 0) {
            this.f13149x = w.a.f13508a;
            this.f13150y = w.a.f13510c;
            this.f13151z = 0;
        }
        if (this.f13151z == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int c10;
        if (obj == null) {
            c10 = j.c(this, null, 0);
        } else {
            c10 = j.c(this, obj, obj.hashCode());
        }
        if (c10 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.k.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f13151z != ((Set) obj).size()) {
            return false;
        }
        try {
            int i6 = this.f13151z;
            for (int i10 = 0; i10 < i6; i10++) {
                if (!((Set) obj).contains(this.f13150y[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f13149x;
        int i6 = this.f13151z;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f13151z <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c10;
        if (obj == null) {
            c10 = j.c(this, null, 0);
        } else {
            c10 = j.c(this, obj, obj.hashCode());
        }
        if (c10 < 0) {
            return false;
        }
        a(c10);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.k.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.k.e(elements, "elements");
        boolean z10 = false;
        for (int i6 = this.f13151z - 1; -1 < i6; i6--) {
            if (!ie.j.D(elements, this.f13150y[i6])) {
                a(i6);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f13151z;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ie.i.h0(this.f13150y, 0, this.f13151z);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13151z * 14);
        sb2.append('{');
        int i6 = this.f13151z;
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f13150y[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.k.e(array, "array");
        int i6 = this.f13151z;
        if (array.length < i6) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i6);
        } else if (array.length > i6) {
            array[i6] = null;
        }
        ie.i.d0(0, 0, this.f13151z, this.f13150y, array);
        return array;
    }
}
