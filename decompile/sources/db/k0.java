package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class k0 extends f0 implements List, RandomAccess {

    /* renamed from: y, reason: collision with root package name */
    public static final i0 f4008y = new i0(c1.B, 0);

    public static c1 h(int i6, Object[] objArr) {
        if (i6 == 0) {
            return c1.B;
        }
        return new c1(i6, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [db.e0, db.h0] */
    public static h0 j() {
        return new e0(4);
    }

    public static k0 k(Collection collection) {
        if (collection instanceof f0) {
            k0 a10 = ((f0) collection).a();
            if (a10.f()) {
                Object[] array = a10.toArray(f0.f3998x);
                return h(array.length, array);
            }
            return a10;
        }
        Object[] array2 = collection.toArray();
        r.c(array2.length, array2);
        return h(array2.length, array2);
    }

    public static c1 l(Object[] objArr) {
        if (objArr.length == 0) {
            return c1.B;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        r.c(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static c1 n(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        r.c(5, objArr);
        return h(5, objArr);
    }

    public static c1 o(Object obj) {
        Object[] objArr = {obj};
        r.c(1, objArr);
        return h(1, objArr);
    }

    public static c1 p(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        r.c(2, objArr);
        return h(2, objArr);
    }

    public static c1 q(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        boolean z10;
        if (objArr.length <= 2147483635) {
            z10 = true;
        } else {
            z10 = false;
        }
        jb.b.d("the total number of elements must fit in an int", z10);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        r.c(length, objArr2);
        return h(length, objArr2);
    }

    public static c1 r(Comparator comparator, List list) {
        comparator.getClass();
        if (!r4.a.w(list)) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        r.c(array.length, array);
        Arrays.sort(array, comparator);
        return h(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i6, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // db.f0
    public int b(int i6, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i6 + i10] = get(i10);
        }
        return i6 + size;
    }

    @Override // db.f0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i6 = 0; i6 < size; i6++) {
                            if (e9.f.c(get(i6), list.get(i6))) {
                            }
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && e9.f.c(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // db.f0
    /* renamed from: g */
    public final q1 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i6 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i6 = ~(~(get(i10).hashCode() + (i6 * 31)));
        }
        return i6;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (obj.equals(get(i6))) {
                return i6;
            }
        }
        return -1;
    }

    @Override // db.f0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final i0 listIterator(int i6) {
        jb.b.g(i6, size());
        if (isEmpty()) {
            return f4008y;
        }
        return new i0(this, i6);
    }

    @Override // java.util.List
    public final Object remove(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public k0 subList(int i6, int i10) {
        jb.b.h(i6, i10, size());
        int i11 = i10 - i6;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return c1.B;
        }
        return new j0(this, i6, i11);
    }

    @Override // java.util.List
    public final Object set(int i6, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // db.f0
    public final k0 a() {
        return this;
    }
}
