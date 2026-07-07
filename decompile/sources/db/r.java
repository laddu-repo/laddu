package db;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4035x = 2;

    public static int b(int i6) {
        if (i6 < 3) {
            e(i6, "expectedSize");
            return i6 + 1;
        }
        if (i6 < 1073741824) {
            return (int) Math.ceil(i6 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void c(int i6, Object[] objArr) {
        for (int i10 = 0; i10 < i6; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(h8.c.i(i10, "at index "));
            }
        }
    }

    public static void d(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public static void e(int i6, String str) {
        if (i6 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i6);
    }

    public static Object f(int i6) {
        if (i6 >= 2 && i6 <= 1073741824 && Integer.highestOneBit(i6) == i6) {
            if (i6 <= 256) {
                return new byte[i6];
            }
            if (i6 <= 65536) {
                return new short[i6];
            }
            return new int[i6];
        }
        throw new IllegalArgumentException(h8.c.i(i6, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static boolean h(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean i(Set set, Object obj) {
        if (set != obj) {
            if (obj instanceof Set) {
                Set set2 = (Set) obj;
                try {
                    if (set.size() == set2.size()) {
                        if (set.containsAll(set2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static l1 j(Set set, cb.h hVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (set2 instanceof l1) {
                l1 l1Var = (l1) set2;
                cb.h hVar2 = l1Var.f4015y;
                hVar2.getClass();
                return new l1((SortedSet) l1Var.f4014x, new cb.i(Arrays.asList(hVar2, hVar)));
            }
            return new l1(set2, hVar);
        }
        if (set instanceof l1) {
            l1 l1Var2 = (l1) set;
            cb.h hVar3 = l1Var2.f4015y;
            hVar3.getClass();
            return new l1(l1Var2.f4014x, new cb.i(Arrays.asList(hVar3, hVar)));
        }
        set.getClass();
        return new l1(set, hVar);
    }

    public static Object k(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int m(Set set) {
        int i6;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i6 = obj.hashCode();
            } else {
                i6 = 0;
            }
            i10 = ~(~(i10 + i6));
        }
        return i10;
    }

    public static k1 n(Set set, p0 p0Var) {
        jb.b.f(set, "set1");
        jb.b.f(p0Var, "set2");
        return new k1(set, p0Var);
    }

    public static int o(int i6, int i10, int i11) {
        return (i6 & (~i11)) | (i10 & i11);
    }

    public static ArrayList p(Object... objArr) {
        int length = objArr.length;
        e(length, "arraySize");
        ArrayList arrayList = new ArrayList(a8.f.T(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        v(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = o(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int q(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = t(r9)
            r1 = r0 & r11
            int r2 = u(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            goto L40
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = -1
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = e9.f.c(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = e9.f.c(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            v(r1, r9, r12)
            return r2
        L33:
            r10 = r13[r5]
            int r9 = o(r10, r9, r11)
            r13[r5] = r9
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
        L40:
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: db.r.q(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void r(List list, cb.h hVar, int i6, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (hVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i6; i11--) {
            list.remove(i11);
        }
    }

    public static int s(int i6) {
        return (int) (Integer.rotateLeft((int) (i6 * (-862048943)), 15) * 461845907);
    }

    public static int t(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return s(hashCode);
    }

    public static int u(int i6, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i6] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i6] & 65535;
        }
        return ((int[]) obj)[i6];
    }

    public static void v(int i6, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i6] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i6] = (short) i10;
        } else {
            ((int[]) obj)[i6] = i10;
        }
    }

    public static AbstractList w(List list, cb.e eVar) {
        if (r4.a.w(list)) {
            return new u0(list, eVar);
        }
        return new v0(list, eVar);
    }

    public abstract Object g();

    public String toString() {
        switch (this.f4035x) {
            case 2:
                return g().toString();
            default:
                return super.toString();
        }
    }
}
