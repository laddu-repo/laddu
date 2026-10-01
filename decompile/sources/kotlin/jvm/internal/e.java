package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements bf.d, d {

    /* renamed from: y, reason: collision with root package name */
    public static final Map f8047y;

    /* renamed from: x, reason: collision with root package name */
    public final Class f8048x;

    static {
        int i6 = 0;
        List t10 = ie.k.t(ve.a.class, ve.l.class, ve.p.class, ve.q.class, i5.a.class, nd.c.class, ve.r.class, ve.s.class, ve.t.class, ve.u.class, ve.b.class, ve.c.class, ve.d.class, ve.e.class, ve.f.class, ve.g.class, ve.h.class, ve.i.class, ve.j.class, ve.k.class, ve.m.class, ve.n.class, ve.o.class);
        ArrayList arrayList = new ArrayList(ie.l.x(t10, 10));
        for (Object obj : t10) {
            int i10 = i6 + 1;
            if (i6 >= 0) {
                arrayList.add(new he.i((Class) obj, Integer.valueOf(i6)));
                i6 = i10;
            } else {
                ie.k.w();
                throw null;
            }
        }
        f8047y = ie.w.C(arrayList);
    }

    public e(Class jClass) {
        k.e(jClass, "jClass");
        this.f8048x = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f8048x;
    }

    public final String b() {
        String f3;
        Class jClass = this.f8048x;
        k.e(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (jClass.isArray()) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (f3 = k.f(componentType.getName())) != null) {
                str = f3.concat("Array");
            }
            if (str == null) {
                return "kotlin.Array";
            }
            return str;
        }
        String f10 = k.f(jClass.getName());
        if (f10 == null) {
            return jClass.getCanonicalName();
        }
        return f10;
    }

    public final String c() {
        String i6;
        Class jClass = this.f8048x;
        k.e(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (jClass.isLocalClass()) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return df.m.e0(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return df.m.e0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            return df.m.d0('$', simpleName, simpleName);
        }
        if (jClass.isArray()) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (i6 = k.i(componentType.getName())) != null) {
                str = i6.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        }
        String i10 = k.i(jClass.getName());
        if (i10 == null) {
            return jClass.getSimpleName();
        }
        return i10;
    }

    public final boolean d(Object obj) {
        Class jClass = this.f8048x;
        k.e(jClass, "jClass");
        Map map = f8047y;
        k.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return z.d(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = cf.m.s(x.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && cf.m.s(this).equals(cf.m.s((bf.d) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return cf.m.s(this).hashCode();
    }

    public final String toString() {
        return this.f8048x.toString() + " (Kotlin reflection is not available)";
    }
}
