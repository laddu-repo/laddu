package cf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class l extends m {
    public static j K(Iterator it) {
        kotlin.jvm.internal.k.e(it, "<this>");
        return new a(new o(it, 0));
    }

    public static g L(j jVar, ve.l predicate) {
        kotlin.jvm.internal.k.e(predicate, "predicate");
        return new g(jVar, true, predicate);
    }

    public static j M(ve.l lVar, Object obj) {
        if (obj == null) {
            return e.f2054a;
        }
        return new i(0, new androidx.lifecycle.i(obj, 2), lVar);
    }

    public static String N(j jVar, String str) {
        kotlin.jvm.internal.k.e(jVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        int i6 = 0;
        for (Object obj : jVar) {
            i6++;
            if (i6 > 1) {
                sb2.append((CharSequence) str);
            }
            a8.b.a(sb2, obj, null);
        }
        sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
        return sb2.toString();
    }

    public static Object O(j jVar) {
        Iterator it = jVar.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static List P(j jVar) {
        Iterator it = jVar.iterator();
        if (!it.hasNext()) {
            return ie.r.f6846x;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a8.g.m(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
