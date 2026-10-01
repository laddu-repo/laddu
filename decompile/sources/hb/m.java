package hb;

import com.google.android.gms.internal.measurement.k4;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends k4 {
    public static final Unsafe A;
    public static final long B;
    public static final long C;
    public static final long D;
    public static final long E;
    public static final long F;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
            }
            try {
                C = unsafe.objectFieldOffset(o.class.getDeclaredField("z"));
                B = unsafe.objectFieldOffset(o.class.getDeclaredField("y"));
                D = unsafe.objectFieldOffset(o.class.getDeclaredField("x"));
                E = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
                F = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
                A = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        } catch (PrivilegedActionException e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean c(o oVar, c cVar, c cVar2) {
        return j.a(A, oVar, B, cVar, cVar2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean d(o oVar, Object obj, Object obj2) {
        return k.a(A, oVar, D, obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean e(o oVar, n nVar, n nVar2) {
        return i.a(A, oVar, C, nVar, nVar2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final c g(o oVar) {
        c cVar;
        c cVar2 = c.f6013d;
        do {
            cVar = oVar.f6027y;
            if (cVar2 == cVar) {
                break;
            }
        } while (!c(oVar, cVar, cVar2));
        return cVar;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final n h(o oVar) {
        n nVar;
        n nVar2 = n.f6023c;
        do {
            nVar = oVar.f6028z;
            if (nVar2 == nVar) {
                break;
            }
        } while (!e(oVar, nVar, nVar2));
        return nVar;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void o(n nVar, n nVar2) {
        A.putObject(nVar, F, nVar2);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void p(n nVar, Thread thread) {
        A.putObject(nVar, E, thread);
    }
}
