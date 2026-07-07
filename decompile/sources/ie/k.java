package ie;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class k extends a8.g {
    public static int s(List list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        return list.size() - 1;
    }

    public static List t(Object... elements) {
        kotlin.jvm.internal.k.e(elements, "elements");
        if (elements.length > 0) {
            return i.X(elements);
        }
        return r.f6846x;
    }

    public static ArrayList u(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new g(objArr, true));
    }

    public static final List v(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return a8.g.m(list.get(0));
        }
        return r.f6846x;
    }

    public static void w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
