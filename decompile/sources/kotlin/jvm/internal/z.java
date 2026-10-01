package kotlin.jvm.internal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class z {
    public static List a(Object obj) {
        if ((obj instanceof we.a) && !(obj instanceof we.c)) {
            f(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            k.h(e10, z.class.getName());
            throw e10;
        }
    }

    public static Map b(LinkedHashMap linkedHashMap) {
        if ((linkedHashMap instanceof we.a) && !(linkedHashMap instanceof we.d)) {
            f(linkedHashMap, "kotlin.collections.MutableMap");
            throw null;
        }
        return linkedHashMap;
    }

    public static void c(int i6, Object obj) {
        if (obj != null && !d(i6, obj)) {
            f(obj, "kotlin.jvm.functions.Function" + i6);
            throw null;
        }
    }

    public static boolean d(int i6, Object obj) {
        int i10;
        if (obj instanceof he.c) {
            if (obj instanceof h) {
                i10 = ((h) obj).getArity();
            } else if (obj instanceof ve.a) {
                i10 = 0;
            } else if (obj instanceof ve.l) {
                i10 = 1;
            } else if (obj instanceof ve.p) {
                i10 = 2;
            } else if (obj instanceof ve.q) {
                i10 = 3;
            } else if (obj instanceof i5.a) {
                i10 = 4;
            } else if (obj instanceof nd.c) {
                i10 = 5;
            } else if (obj instanceof ve.r) {
                i10 = 6;
            } else {
                i10 = -1;
            }
            if (i10 == i6) {
                return true;
            }
        }
        return false;
    }

    public static final he.p e(Object[] array) {
        k.e(array, "array");
        return new he.p(array);
    }

    public static void f(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + str);
        k.h(classCastException, z.class.getName());
        throw classCastException;
    }
}
