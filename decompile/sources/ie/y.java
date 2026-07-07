package ie;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class y extends android.support.v4.media.session.b {
    public static LinkedHashSet y(Set set, Object obj) {
        kotlin.jvm.internal.k.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(w.w(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.k.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet z(Set set, Object obj) {
        kotlin.jvm.internal.k.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(w.w(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
