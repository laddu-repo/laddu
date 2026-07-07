package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class y6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f2532a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f2533b;

    /* renamed from: c, reason: collision with root package name */
    public static final x6 f2534c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2535d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2536e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2537f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2538g;

    /* JADX WARN: Removed duplicated region for block: B:20:0x015b  */
    static {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.y6.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f2536e) {
            f2534c.f2522a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i6 = x4.f2520a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }

    public static void c(Object obj, long j, byte b10) {
        Unsafe unsafe = f2534c.f2522a;
        long j10 = (-4) & j;
        int i6 = unsafe.getInt(obj, j10);
        int i10 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i10) | (i6 & (~(255 << i10))));
    }

    public static void d(Object obj, long j, byte b10) {
        Unsafe unsafe = f2534c.f2522a;
        long j10 = (-4) & j;
        int i6 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i6) | (unsafe.getInt(obj, j10) & (~(255 << i6))));
    }

    public static Object e(Class cls) {
        try {
            return f2532a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int f(long j, Object obj) {
        return f2534c.f2522a.getInt(obj, j);
    }

    public static void g(long j, Object obj, int i6) {
        f2534c.f2522a.putInt(obj, j, i6);
    }

    public static long h(long j, Object obj) {
        return f2534c.f2522a.getLong(obj, j);
    }

    public static void i(Object obj, long j, long j10) {
        f2534c.f2522a.putLong(obj, j, j10);
    }

    public static Object j(long j, Object obj) {
        return f2534c.f2522a.getObject(obj, j);
    }

    public static void k(long j, Object obj, Object obj2) {
        f2534c.f2522a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean m(Class cls) {
        int i6 = x4.f2520a;
        try {
            Class cls2 = f2533b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean n(long j, Object obj) {
        if (((byte) ((f2534c.f2522a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean o(long j, Object obj) {
        if (((byte) ((f2534c.f2522a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static int p(Class cls) {
        if (f2536e) {
            return f2534c.f2522a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
