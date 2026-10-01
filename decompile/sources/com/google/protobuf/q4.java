package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class q4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f3022a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f3023b;

    /* renamed from: c, reason: collision with root package name */
    public static final p4 f3024c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3025d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f3026e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f3027f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f3028g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f3029h;

    static {
        boolean x10;
        boolean w10;
        long j;
        Unsafe l10 = l();
        f3022a = l10;
        f3023b = c.f2877a;
        boolean h4 = h(Long.TYPE);
        boolean h10 = h(Integer.TYPE);
        p4 p4Var = null;
        if (l10 != null) {
            if (c.a()) {
                if (h4) {
                    p4Var = new n4(l10, 1);
                } else if (h10) {
                    p4Var = new n4(l10, 0);
                }
            } else {
                p4Var = new p4(l10);
            }
        }
        f3024c = p4Var;
        boolean z10 = false;
        if (p4Var == null) {
            x10 = false;
        } else {
            x10 = p4Var.x();
        }
        f3025d = x10;
        if (p4Var == null) {
            w10 = false;
        } else {
            w10 = p4Var.w();
        }
        f3026e = w10;
        f3027f = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        java.lang.reflect.Field f3 = f();
        if (f3 != null && p4Var != null) {
            j = p4Var.n(f3);
        } else {
            j = -1;
        }
        f3028g = j;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
        }
        f3029h = z10;
    }

    public static void a(Throwable th) {
        Logger.getLogger(q4.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static long b(ByteBuffer byteBuffer) {
        return f3024c.l(f3028g, byteBuffer);
    }

    public static Object c(Class cls) {
        try {
            return f3022a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int d(Class cls) {
        if (f3026e) {
            return f3024c.a(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (f3026e) {
            f3024c.b(cls);
        }
    }

    public static java.lang.reflect.Field f() {
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        if (c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static void g(long j, byte[] bArr, long j10, long j11) {
        f3024c.c(j, bArr, j10, j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f3023b;
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

    public static byte i(long j, byte[] bArr) {
        return f3024c.g(f3027f + j, bArr);
    }

    public static byte j(long j, Object obj) {
        return (byte) ((f3024c.j((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte k(long j, Object obj) {
        return (byte) ((f3024c.j((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(long j, byte b10) {
        f3024c.p(j, b10);
    }

    public static void n(byte[] bArr, long j, byte b10) {
        f3024c.q(bArr, f3027f + j, b10);
    }

    public static void o(Object obj, long j, byte b10) {
        long j10 = (-4) & j;
        int j11 = f3024c.j(j10, obj);
        int i6 = ((~((int) j)) & 3) << 3;
        q(j10, obj, ((255 & b10) << i6) | (j11 & (~(255 << i6))));
    }

    public static void p(Object obj, long j, byte b10) {
        long j10 = (-4) & j;
        int i6 = (((int) j) & 3) << 3;
        q(j10, obj, ((255 & b10) << i6) | (f3024c.j(j10, obj) & (~(255 << i6))));
    }

    public static void q(long j, Object obj, int i6) {
        f3024c.t(j, obj, i6);
    }

    public static void r(Object obj, long j, long j10) {
        f3024c.u(obj, j, j10);
    }

    public static void s(long j, Object obj, Object obj2) {
        f3024c.v(j, obj, obj2);
    }
}
