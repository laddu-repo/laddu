package y9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends a0 implements List, RandomAccess {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c0 f14553w = new c0(z0.f14637z, 0);

    public static z0 i(int i, Object[] objArr) {
        return i == 0 ? z0.f14637z : new z0(i, objArr);
    }

    public static b0 j() {
        return new b0(4);
    }

    public static b0 k(int i) {
        p.d(i, "expectedSize");
        return new b0(i);
    }

    public static f0 l(Iterable iterable) {
        if (iterable instanceof Collection) {
            return m((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return z0.f14637z;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        b0 b0Var = new b0(4);
        b0Var.a(next);
        while (it.hasNext()) {
            b0Var.a(it.next());
        }
        return b0Var.g();
    }

    public static f0 m(Collection collection) {
        if (!(collection instanceof a0)) {
            Object[] array = collection.toArray();
            p.b(array.length, array);
            return i(array.length, array);
        }
        f0 f0VarA = ((a0) collection).a();
        if (!f0VarA.f()) {
            return f0VarA;
        }
        Object[] array2 = f0VarA.toArray(a0.f14521v);
        return i(array2.length, array2);
    }

    public static z0 n(Object[] objArr) {
        if (objArr.length == 0) {
            return z0.f14637z;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        p.b(objArr2.length, objArr2);
        return i(objArr2.length, objArr2);
    }

    public static z0 p(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        p.b(5, objArr);
        return i(5, objArr);
    }

    public static z0 q(Object obj) {
        Object[] objArr = {obj};
        p.b(1, objArr);
        return i(1, objArr);
    }

    public static z0 r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        p.b(2, objArr);
        return i(2, objArr);
    }

    public static z0 s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        p4.v.i("the total number of elements must fit in an int", objArr.length <= 2147483635);
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
        p.b(length, objArr2);
        return i(length, objArr2);
    }

    public static z0 u(Comparator comparator, List list) {
        comparator.getClass();
        if (!d0.d.s(list)) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        p.b(array.length, array);
        Arrays.sort(array, comparator);
        return i(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // y9.a0
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i + i10] = get(i10);
        }
        return i + size;
    }

    @Override // y9.a0, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && Objects.equals(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // y9.a0
    /* JADX INFO: renamed from: g */
    public final p1 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i = ~(~(get(i10).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // y9.a0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
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
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final c0 listIterator(int i) {
        p4.v.o(i, size());
        return isEmpty() ? f14553w : new c0(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public f0 t() {
        return size() <= 1 ? this : new d0(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public f0 subList(int i, int i10) {
        p4.v.p(i, i10, size());
        int i11 = i10 - i;
        return i11 == size() ? this : i11 == 0 ? z0.f14637z : new e0(this, i, i11);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // y9.a0
    public final f0 a() {
        return this;
    }
}
