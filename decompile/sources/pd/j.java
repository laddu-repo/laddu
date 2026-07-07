package pd;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends n {
    public static void D(Iterable iterable, AbstractCollection abstractCollection) {
        de.i.e(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static Object E(List list) {
        de.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object F(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void G(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ce.l lVar) {
        de.i.e(iterable, "<this>");
        sb2.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb2.append(charSequence);
            }
            com.bumptech.glide.e.b(sb2, obj, lVar);
        }
        sb2.append(charSequence3);
    }

    public static String I(Iterable iterable, String str, String str2, String str3, ce.l lVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            lVar = null;
        }
        de.i.e(iterable, "<this>");
        de.i.e(str5, "prefix");
        StringBuilder sb2 = new StringBuilder();
        G(iterable, sb2, str4, str5, str6, "...", lVar);
        return sb2.toString();
    }

    public static Object J(List list) {
        de.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(k.A(list));
    }

    public static Object K(List list) {
        de.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(k.A(list));
    }

    public static List L(AbstractList abstractList) {
        de.i.e(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return O(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        de.i.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return i.W(array);
    }

    public static List M(Iterable iterable, Comparator comparator) {
        de.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listQ = Q(iterable);
            if (((ArrayList) listQ).size() > 1) {
                Collections.sort(listQ, comparator);
            }
            return listQ;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return O(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        de.i.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return i.W(array);
    }

    public static final void N(Iterable iterable, AbstractCollection abstractCollection) {
        de.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List O(Iterable iterable) {
        de.i.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        p pVar = p.f10551v;
        if (!z2) {
            List listQ = Q(iterable);
            ArrayList arrayList = (ArrayList) listQ;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? listQ : fa.b.s(arrayList.get(0)) : pVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return pVar;
        }
        if (size2 != 1) {
            return P(collection);
        }
        return fa.b.s(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList P(Collection collection) {
        de.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List Q(Iterable iterable) {
        de.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return P((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        N(iterable, arrayList);
        return arrayList;
    }

    public static Set R(Iterable iterable) {
        de.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(s.R(collection.size()));
                    N(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                de.i.d(setSingleton, "singleton(...)");
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            N(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                de.i.d(setSingleton2, "singleton(...)");
                return setSingleton2;
            }
        }
        return r.f10553v;
    }
}
