package j1;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v.l f6920b = new v.l(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f6921a;

    public i0(p0 p0Var) {
        this.f6921a = p0Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        v.l lVar = f6920b;
        v.l lVar2 = (v.l) lVar.get(classLoader);
        if (lVar2 == null) {
            lVar2 = new v.l(0);
            lVar.put(classLoader, lVar2);
        }
        Class cls = (Class) lVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            lVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new RuntimeException(h8.c.m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(h8.c.m("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public final y a(String str) {
        try {
            return (y) c(this.f6921a.f6963w.B.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(h8.c.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(h8.c.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(h8.c.m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(h8.c.m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
