package de;

import ce.t;
import ce.u;
import ce.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ie.b, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f4510b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4511a;

    static {
        int i = 0;
        List listW = pd.i.W(new Class[]{ce.a.class, ce.l.class, ce.p.class, ce.q.class, x4.a.class, ce.r.class, ce.s.class, t.class, u.class, v.class, ce.b.class, ce.c.class, ce.d.class, ce.e.class, ce.f.class, ce.g.class, ce.h.class, ce.i.class, ce.j.class, ce.k.class, ce.m.class, ce.n.class, ce.o.class});
        ArrayList arrayList = new ArrayList(pd.l.C(listW, 10));
        for (Object obj : listW) {
            int i10 = i + 1;
            if (i < 0) {
                pd.k.B();
                throw null;
            }
            arrayList.add(new od.f((Class) obj, Integer.valueOf(i)));
            i = i10;
        }
        f4510b = pd.s.S(arrayList);
    }

    public f(Class cls) {
        i.e(cls, "jClass");
        this.f4511a = cls;
    }

    @Override // de.e
    public final Class a() {
        return this.f4511a;
    }

    public final String b() {
        String strB;
        Class cls = this.f4511a;
        i.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strB2 = s.b(cls.getName());
            return strB2 == null ? cls.getCanonicalName() : strB2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strB = s.b(componentType.getName())) != null) {
            strConcat = strB.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strD;
        Class cls = this.f4511a;
        i.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strD2 = s.d(cls.getName());
                return strD2 == null ? cls.getSimpleName() : strD2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strD = s.d(componentType.getName())) != null) {
                strConcat = strD.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ke.h.R(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return ke.h.R(simpleName, enclosingConstructor.getName() + '$', simpleName);
        }
        int I = ke.h.I(simpleName, '$', 0, 6);
        if (I == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(I + 1, simpleName.length());
        i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean d(Object obj) {
        Class clsU = this.f4511a;
        i.e(clsU, "jClass");
        Map map = f4510b;
        i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsU);
        if (num != null) {
            return s.c(num.intValue(), obj);
        }
        if (clsU.isPrimitive()) {
            clsU = qf.g.u(q.a(clsU));
        }
        return clsU.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && qf.g.u(this).equals(qf.g.u((ie.b) obj));
    }

    public final int hashCode() {
        return qf.g.u(this).hashCode();
    }

    public final String toString() {
        return this.f4511a.toString() + " (Kotlin reflection is not available)";
    }
}
