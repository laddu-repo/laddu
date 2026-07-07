package da;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends qf.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Unsafe f4436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f4437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f4438e;
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f4439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f4440h;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new q());
            }
            try {
                f4438e = unsafe.objectFieldOffset(t.class.getDeclaredField("x"));
                f4437d = unsafe.objectFieldOffset(t.class.getDeclaredField("w"));
                f = unsafe.objectFieldOffset(t.class.getDeclaredField("v"));
                f4439g = unsafe.objectFieldOffset(s.class.getDeclaredField("a"));
                f4440h = unsafe.objectFieldOffset(s.class.getDeclaredField("b"));
                f4436c = unsafe;
            } catch (NoSuchFieldException e7) {
                throw new RuntimeException(e7);
            }
        } catch (PrivilegedActionException e10) {
            throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
        }
    }

    public static /* synthetic */ Unsafe H() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // qf.g
    public final void C(s sVar, s sVar2) {
        f4436c.putObject(sVar, f4440h, sVar2);
    }

    @Override // qf.g
    public final void D(s sVar, Thread thread) {
        f4436c.putObject(sVar, f4439g, thread);
    }

    @Override // qf.g
    public final boolean f(k kVar, h hVar, h hVar2) {
        return n.a(f4436c, kVar, f4437d, hVar, hVar2);
    }

    @Override // qf.g
    public final boolean g(t tVar, Object obj, Object obj2) {
        return o.a(f4436c, tVar, f, obj, obj2);
    }

    @Override // qf.g
    public final boolean h(t tVar, s sVar, s sVar2) {
        return p.a(f4436c, tVar, f4438e, sVar, sVar2);
    }

    @Override // qf.g
    public final h r(k kVar) {
        h hVar;
        h hVar2 = h.f4416d;
        do {
            hVar = kVar.f4451w;
            if (hVar2 == hVar) {
                break;
            }
        } while (!f(kVar, hVar, hVar2));
        return hVar;
    }

    @Override // qf.g
    public final s s(k kVar) {
        s sVar;
        s sVar2 = s.f4444c;
        do {
            sVar = kVar.f4452x;
            if (sVar2 == sVar) {
                break;
            }
        } while (!h(kVar, sVar, sVar2));
        return sVar;
    }
}
