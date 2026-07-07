package com.google.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p4 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f3019a;

    public p4(Unsafe unsafe) {
        this.f3019a = unsafe;
    }

    public final int a(Class cls) {
        return this.f3019a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f3019a.arrayIndexScale(cls);
    }

    public abstract void c(long j, byte[] bArr, long j10, long j11);

    public abstract void d(byte[] bArr, long j, long j10, long j11);

    public abstract boolean e(long j, Object obj);

    public abstract byte f(long j);

    public abstract byte g(long j, Object obj);

    public abstract double h(long j, Object obj);

    public abstract float i(long j, Object obj);

    public final int j(long j, Object obj) {
        return this.f3019a.getInt(obj, j);
    }

    public abstract long k(long j);

    public final long l(long j, Object obj) {
        return this.f3019a.getLong(obj, j);
    }

    public final Object m(long j, Object obj) {
        return this.f3019a.getObject(obj, j);
    }

    public final long n(java.lang.reflect.Field field) {
        return this.f3019a.objectFieldOffset(field);
    }

    public abstract void o(Object obj, long j, boolean z10);

    public abstract void p(long j, byte b10);

    public abstract void q(Object obj, long j, byte b10);

    public abstract void r(Object obj, long j, double d10);

    public abstract void s(Object obj, long j, float f3);

    public final void t(long j, Object obj, int i6) {
        this.f3019a.putInt(obj, j, i6);
    }

    public final void u(Object obj, long j, long j10) {
        this.f3019a.putLong(obj, j, j10);
    }

    public final void v(long j, Object obj, Object obj2) {
        this.f3019a.putObject(obj, j, obj2);
    }

    public boolean w() {
        Unsafe unsafe = this.f3019a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
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
            q4.a(th);
            return false;
        }
    }

    public abstract boolean x();
}
