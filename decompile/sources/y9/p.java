package y9;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14596v = 2;

    public static int a(int i) {
        if (i < 3) {
            d(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void b(int i, Object[] objArr) {
        for (int i10 = 0; i10 < i; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(d0.d.h(i10, "at index "));
            }
        }
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void d(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static Object e(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(d0.d.h(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static boolean h(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean i(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static j1 j(Set set, x9.i iVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof j1)) {
                return new k1(set2, iVar);
            }
            j1 j1Var = (j1) set2;
            x9.i iVar2 = j1Var.f14569w;
            iVar2.getClass();
            return new k1((SortedSet) j1Var.f14568v, new x9.j(Arrays.asList(iVar2, iVar)));
        }
        if (!(set instanceof j1)) {
            set.getClass();
            return new j1(set, iVar);
        }
        j1 j1Var2 = (j1) set;
        x9.i iVar3 = j1Var2.f14569w;
        iVar3.getClass();
        return new j1(j1Var2.f14568v, new x9.j(Arrays.asList(iVar3, iVar)));
    }

    public static Object k(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static boolean m(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = x0.f14630w;
            }
        } else {
            if (!(collection instanceof n1)) {
                return false;
            }
            objComparator = ((k0) ((n1) collection)).f14571y;
        }
        return comparator.equals(objComparator);
    }

    public static int n(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static i1 o(Set set, i0 i0Var) {
        p4.v.n(set, "set1");
        p4.v.n(i0Var, "set2");
        return new i1(set, i0Var);
    }

    public static int p(int i, int i10, int i11) {
        return (i & (~i11)) | (i10 & i11);
    }

    public static ArrayList q(Object... objArr) {
        int length = objArr.length;
        d(length, "arraySize");
        ArrayList arrayList = new ArrayList(z7.b.J(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int r(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int iV = v(obj);
        int i12 = iV & i;
        int iW = w(i12, obj3);
        if (iW != 0) {
            int i13 = ~i;
            int i14 = iV & i13;
            int i15 = -1;
            while (true) {
                i10 = iW - 1;
                i11 = iArr[i10];
                if ((i11 & i13) == i14 && Objects.equals(obj, objArr[i10]) && (objArr2 == null || Objects.equals(obj2, objArr2[i10]))) {
                    break;
                }
                int i16 = i11 & i;
                if (i16 == 0) {
                    break;
                }
                i15 = i10;
                iW = i16;
            }
            int i17 = i11 & i;
            if (i15 == -1) {
                x(i12, i17, obj3);
                return i10;
            }
            iArr[i15] = p(iArr[i15], i17, i);
            return i10;
        }
        return -1;
    }

    public static List s(List list) {
        return list instanceof f0 ? ((f0) list).t() : list instanceof q0 ? ((q0) list).f14605v : list instanceof RandomAccess ? new o0(list) : new q0(list);
    }

    public static void t(List list, x9.i iVar, int i, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (iVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i; i11--) {
            list.remove(i11);
        }
    }

    public static int u(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int v(Object obj) {
        return u(obj == null ? 0 : obj.hashCode());
    }

    public static int w(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void x(int i, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i10;
        } else {
            ((int[]) obj)[i] = i10;
        }
    }

    public static AbstractList y(List list, x9.f fVar) {
        return d0.d.s(list) ? new s0(list, fVar) : new t0(list, fVar);
    }

    public abstract Object g();

    public String toString() {
        switch (this.f14596v) {
            case 2:
                return g().toString();
            default:
                return super.toString();
        }
    }
}
