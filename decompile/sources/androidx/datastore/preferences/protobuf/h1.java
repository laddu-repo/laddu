package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f782e;
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f783g;

    static {
        Unsafe unsafeI = i();
        f778a = unsafeI;
        f779b = c.f748a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        g1 f1Var = null;
        if (unsafeI != null) {
            if (!c.a()) {
                f1Var = new f1(unsafeI);
            } else if (zH) {
                f1Var = new e1(unsafeI, 1);
            } else if (zH2) {
                f1Var = new e1(unsafeI, 0);
            }
        }
        f780c = f1Var;
        f781d = f1Var == null ? false : f1Var.r();
        f782e = f1Var == null ? false : f1Var.q();
        f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && f1Var != null) {
            f1Var.i(fieldG);
        }
        f783g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(h1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j8, Object obj) {
        return ((byte) ((f780c.f((-4) & j8, obj) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j8, Object obj) {
        return ((byte) ((f780c.f((-4) & j8, obj) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f778a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int e(Class cls) {
        if (f782e) {
            return f780c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f782e) {
            f780c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f779b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new d1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j8, byte b9) {
        f780c.k(bArr, f + j8, b9);
    }

    public static void k(Object obj, long j8, byte b9) {
        long j9 = (-4) & j8;
        int iF = f780c.f(j9, obj);
        int i = ((~((int) j8)) & 3) << 3;
        m(j9, obj, ((255 & b9) << i) | (iF & (~(255 << i))));
    }

    public static void l(Object obj, long j8, byte b9) {
        long j9 = (-4) & j8;
        int i = (((int) j8) & 3) << 3;
        m(j9, obj, ((255 & b9) << i) | (f780c.f(j9, obj) & (~(255 << i))));
    }

    public static void m(long j8, Object obj, int i) {
        f780c.n(j8, obj, i);
    }

    public static void n(Object obj, long j8, long j9) {
        f780c.o(obj, j8, j9);
    }

    public static void o(Object obj, long j8, Object obj2) {
        f780c.p(obj, j8, obj2);
    }
}
