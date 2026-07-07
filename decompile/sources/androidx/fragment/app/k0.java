package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v.i f1042b = new v.i(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f1043a;

    public k0(q0 q0Var) {
        this.f1043a = q0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        v.i iVar = f1042b;
        v.i iVar2 = (v.i) iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new v.i(0);
            iVar.put(classLoader, iVar2);
        }
        Class cls = (Class) iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e7) {
            throw new a5.d(1, d0.d.l("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        } catch (ClassNotFoundException e10) {
            throw new a5.d(1, d0.d.l("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final y a(String str) {
        try {
            return (y) c(this.f1043a.f1085t.f988y.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e7) {
            throw new a5.d(1, d0.d.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (InstantiationException e10) {
            throw new a5.d(1, d0.d.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new a5.d(1, d0.d.l("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new a5.d(1, d0.d.l("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }
}
