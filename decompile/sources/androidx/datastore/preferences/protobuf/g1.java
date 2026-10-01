package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f770a;

    public g1(Unsafe unsafe) {
        this.f770a = unsafe;
    }

    public final int a(Class cls) {
        return this.f770a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f770a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j8, Object obj);

    public abstract double d(long j8, Object obj);

    public abstract float e(long j8, Object obj);

    public final int f(long j8, Object obj) {
        return this.f770a.getInt(obj, j8);
    }

    public final long g(long j8, Object obj) {
        return this.f770a.getLong(obj, j8);
    }

    public final Object h(long j8, Object obj) {
        return this.f770a.getObject(obj, j8);
    }

    public final long i(Field field) {
        return this.f770a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j8, boolean z2);

    public abstract void k(Object obj, long j8, byte b9);

    public abstract void l(Object obj, long j8, double d10);

    public abstract void m(Object obj, long j8, float f);

    public final void n(long j8, Object obj, int i) {
        this.f770a.putInt(obj, j8, i);
    }

    public final void o(Object obj, long j8, long j9) {
        this.f770a.putLong(obj, j8, j9);
    }

    public final void p(Object obj, long j8, Object obj2) {
        this.f770a.putObject(obj, j8, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f770a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            h1.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
