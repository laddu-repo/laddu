package ie;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class j extends p {
    public static cf.o C(Iterable iterable) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        return new cf.o(iterable, 2);
    }

    public static boolean D(Iterable iterable, Object obj) {
        int i6;
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i6 = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i10 >= 0) {
                        if (kotlin.jvm.internal.k.a(obj, next)) {
                            i6 = i10;
                            break;
                        }
                        i10++;
                    } else {
                        k.w();
                        throw null;
                    }
                } else {
                    i6 = -1;
                    break;
                }
            }
        }
        if (i6 < 0) {
            return false;
        }
        return true;
    }

    public static List E(List list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            return r.f6846x;
        }
        if (size == 1) {
            return a8.g.m(M(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i6 = 1; i6 < size2; i6++) {
                arrayList.add(list.get(i6));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object F(Collection collection) {
        kotlin.jvm.internal.k.e(collection, "<this>");
        if (collection instanceof List) {
            return G((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object G(List list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object H(List list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object I(int i6, List list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        if (i6 >= 0 && i6 < list.size()) {
            return list.get(i6);
        }
        return null;
    }

    public static final void J(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ve.l lVar) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        sb2.append(charSequence2);
        int i6 = 0;
        for (Object obj : iterable) {
            i6++;
            if (i6 > 1) {
                sb2.append(charSequence);
            }
            a8.b.a(sb2, obj, lVar);
        }
        sb2.append(charSequence3);
    }

    public static /* synthetic */ void K(Iterable iterable, StringBuilder sb2, String str, cf.p pVar, int i6) {
        if ((i6 & 64) != 0) {
            pVar = null;
        }
        J(iterable, sb2, str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "...", pVar);
    }

    public static String L(Iterable iterable, String str, String str2, String str3, ve.l lVar, int i6) {
        String prefix;
        String str4;
        if ((i6 & 1) != 0) {
            str = ", ";
        }
        String str5 = str;
        if ((i6 & 2) != 0) {
            prefix = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            prefix = str2;
        }
        if ((i6 & 4) != 0) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str4 = str3;
        }
        if ((i6 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.k.e(iterable, "<this>");
        kotlin.jvm.internal.k.e(prefix, "prefix");
        StringBuilder sb2 = new StringBuilder();
        J(iterable, sb2, str5, prefix, str4, "...", lVar);
        return sb2.toString();
    }

    public static Object M(List list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(k.s(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object N(List list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable O(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList P(Iterable elements, Collection collection) {
        kotlin.jvm.internal.k.e(collection, "<this>");
        kotlin.jvm.internal.k.e(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        p.z(elements, arrayList2);
        return arrayList2;
    }

    public static ArrayList Q(Collection collection, Object obj) {
        kotlin.jvm.internal.k.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List R(Iterable iterable) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return Z(iterable);
        }
        List b02 = b0(iterable);
        Collections.reverse(b02);
        return b02;
    }

    public static List S(Iterable iterable) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Z(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            kotlin.jvm.internal.k.e(comparableArr, "<this>");
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return i.X(array);
        }
        List b02 = b0(iterable);
        o.y(b02);
        return b02;
    }

    public static List T(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Z(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            kotlin.jvm.internal.k.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return i.X(array);
        }
        List b02 = b0(iterable);
        if (((ArrayList) b02).size() > 1) {
            Collections.sort(b02, comparator);
        }
        return b02;
    }

    public static List U(int i6, List list) {
        if (i6 >= 0) {
            if (i6 == 0) {
                return r.f6846x;
            }
            if (i6 >= list.size()) {
                return Z(list);
            }
            if (i6 == 1) {
                return a8.g.m(F(list));
            }
            ArrayList arrayList = new ArrayList(i6);
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i10++;
                if (i10 == i6) {
                    break;
                }
            }
            return k.v(arrayList);
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Requested element count ", " is less than zero.").toString());
    }

    public static boolean[] V(List list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            zArr[i6] = ((Boolean) it.next()).booleanValue();
            i6++;
        }
        return zArr;
    }

    public static byte[] W(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i6 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bArr[i6] = ((Number) obj).byteValue();
            i6++;
        }
        return bArr;
    }

    public static final void X(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] Y(List list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            iArr[i6] = ((Number) it.next()).intValue();
            i6++;
        }
        return iArr;
    }

    public static List Z(Iterable iterable) {
        Object next;
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return a0(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return a8.g.m(next);
            }
            return r.f6846x;
        }
        return k.v(b0(iterable));
    }

    public static ArrayList a0(Collection collection) {
        kotlin.jvm.internal.k.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List b0(Iterable iterable) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return a0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        X(iterable, arrayList);
        return arrayList;
    }

    public static Set c0(Iterable iterable) {
        Object next;
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(w.w(collection.size()));
                    X(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return android.support.v4.media.session.b.r(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            X(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return android.support.v4.media.session.b.r(linkedHashSet2.iterator().next());
            }
        }
        return t.f6848x;
    }
}
