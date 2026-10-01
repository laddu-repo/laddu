package ie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p extends o {
    public static Object A(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object B(List list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(k.s(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static void z(Iterable elements, Collection collection) {
        kotlin.jvm.internal.k.e(collection, "<this>");
        kotlin.jvm.internal.k.e(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
