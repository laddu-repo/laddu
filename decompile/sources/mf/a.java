package mf;

import gf.d2;
import gf.f0;
import gf.i1;
import gf.j1;
import gf.j2;
import gf.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final h5.a f8842a = new h5.a("NO_DECISION", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final h5.a f8843b = new h5.a("CLOSED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final h5.a f8844c = new h5.a("UNDEFINED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final h5.a f8845d = new h5.a("REUSABLE_CLAIMED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final h5.a f8846e = new h5.a("CONDITION_FALSE", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final h5.a f8847f = new h5.a("NO_THREAD_ELEMENTS", 1);

    public static final void a(int i6) {
        if (i6 >= 1) {
        } else {
            throw new IllegalArgumentException(h8.c.i(i6, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(u uVar, long j, ve.p pVar) {
        while (true) {
            if (uVar.f8877z >= j && !uVar.d()) {
                return uVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f8856x;
            Object obj = atomicReferenceFieldUpdater.get(uVar);
            h5.a aVar = f8843b;
            if (obj == aVar) {
                return aVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.invoke(Long.valueOf(uVar.f8877z + 1), uVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                    if (atomicReferenceFieldUpdater.get(uVar) != null) {
                        break;
                    }
                }
                if (uVar.d()) {
                    uVar.e();
                }
            }
            uVar = uVar2;
        }
    }

    public static final u c(Object obj) {
        if (obj != f8843b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(le.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f8859a.iterator();
        while (it.hasNext()) {
            try {
                ((gf.a0) it.next()).handleException(hVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    he.a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            he.a.a(th, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        if (obj == f8843b) {
            return true;
        }
        return false;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(le.h hVar, Object obj) {
        if (obj != f8847f) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                y[] yVarArr = b0Var.f8853c;
                int length = yVarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i6 = length - 1;
                    y yVar = yVarArr[length];
                    kotlin.jvm.internal.k.b(yVar);
                    yVar.a(b0Var.f8852b[length]);
                    if (i6 >= 0) {
                        length = i6;
                    } else {
                        return;
                    }
                }
            } else {
                Object fold = hVar.fold(null, x.f8881z);
                kotlin.jvm.internal.k.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((y) fold).a(obj);
            }
        }
    }

    public static final void h(Object obj, le.c cVar) {
        Object tVar;
        j2 j2Var;
        if (cVar instanceof h) {
            h hVar = (h) cVar;
            gf.y yVar = hVar.A;
            ne.c cVar2 = hVar.B;
            Throwable a10 = he.k.a(obj);
            if (a10 == null) {
                tVar = obj;
            } else {
                tVar = new gf.t(a10, false);
            }
            cVar2.getContext();
            if (yVar.h0()) {
                hVar.C = tVar;
                hVar.f5687z = 1;
                yVar.f0(cVar2.getContext(), hVar);
                return;
            }
            y0 a11 = d2.a();
            if (a11.f5727y >= 4294967296L) {
                hVar.C = tVar;
                hVar.f5687z = 1;
                a11.k0(hVar);
                return;
            }
            a11.m0(true);
            try {
                j1 j1Var = (j1) cVar2.getContext().get(i1.f5682x);
                if (j1Var != null && !j1Var.isActive()) {
                    CancellationException m9 = j1Var.m();
                    hVar.c(tVar, m9);
                    hVar.resumeWith(he.a.b(m9));
                } else {
                    Object obj2 = hVar.D;
                    le.h context = cVar2.getContext();
                    Object m10 = m(context, obj2);
                    if (m10 != f8847f) {
                        j2Var = f0.I(cVar2, context, m10);
                    } else {
                        j2Var = null;
                    }
                    try {
                        cVar2.resumeWith(obj);
                    } finally {
                        if (j2Var == null || j2Var.Z()) {
                            g(context, m10);
                        }
                    }
                }
                do {
                } while (a11.o0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        cVar.resumeWith(obj);
    }

    public static final long j(String str, long j, long j10, long j11) {
        String str2;
        int i6 = w.f8879a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long x10 = df.t.x(str2);
        if (x10 != null) {
            long longValue = x10.longValue();
            if (j10 <= longValue && longValue <= j11) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int k(String str, int i6, int i10) {
        int i11;
        if ((i10 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = 2097150;
        }
        return (int) j(str, i6, 1, i11);
    }

    public static final Object l(le.h hVar) {
        Object fold = hVar.fold(0, x.f8880y);
        kotlin.jvm.internal.k.b(fold);
        return fold;
    }

    public static final Object m(le.h hVar, Object obj) {
        if (obj == null) {
            obj = l(hVar);
        }
        if (obj == 0) {
            return f8847f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new b0(((Number) obj).intValue(), hVar), x.A);
        }
        return ((y) obj).b(hVar);
    }
}
