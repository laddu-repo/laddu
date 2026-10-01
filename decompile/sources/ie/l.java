package ie;

import java.util.Collection;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l extends k {
    public static int x(Iterable iterable, int i6) {
        kotlin.jvm.internal.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i6;
    }
}
