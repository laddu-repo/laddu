package gf;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a */
    public static final h5.a f5665a = new h5.a("RESUME_TOKEN", 1);

    /* renamed from: b */
    public static final h5.a f5666b = new h5.a("REMOVED_TASK", 1);

    /* renamed from: c */
    public static final h5.a f5667c = new h5.a("CLOSED_EMPTY", 1);

    /* renamed from: d */
    public static final h5.a f5668d = new h5.a("COMPLETING_ALREADY", 1);

    /* renamed from: e */
    public static final h5.a f5669e = new h5.a("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: f */
    public static final h5.a f5670f = new h5.a("COMPLETING_RETRY", 1);

    /* renamed from: g */
    public static final h5.a f5671g = new h5.a("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: h */
    public static final h5.a f5672h = new h5.a("SEALED", 1);

    /* renamed from: i */
    public static final s0 f5673i = new s0(false);
    public static final s0 j = new s0(true);

    public static final void A(k kVar, le.c cVar, boolean z10) {
        Object g10;
        j2 j2Var;
        Object obj = k.D.get(kVar);
        Throwable f3 = kVar.f(obj);
        if (f3 != null) {
            g10 = he.a.b(f3);
        } else {
            g10 = kVar.g(obj);
        }
        if (z10) {
            kotlin.jvm.internal.k.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            mf.h hVar = (mf.h) cVar;
            ne.c cVar2 = hVar.B;
            Object obj2 = hVar.D;
            le.h context = cVar2.getContext();
            Object m9 = mf.a.m(context, obj2);
            if (m9 != mf.a.f8847f) {
                j2Var = I(cVar2, context, m9);
            } else {
                j2Var = null;
            }
            try {
                cVar2.resumeWith(g10);
                if (j2Var != null && !j2Var.Z()) {
                    return;
                }
                mf.a.g(context, m9);
                return;
            } catch (Throwable th) {
                if (j2Var == null || j2Var.Z()) {
                    mf.a.g(context, m9);
                }
                throw th;
            }
        }
        cVar.resumeWith(g10);
    }

    public static final Object B(le.h hVar, ve.p pVar) {
        y0 y0Var;
        le.h m9;
        long j10;
        t tVar;
        Thread currentThread = Thread.currentThread();
        le.g gVar = le.d.f8352x;
        le.e eVar = (le.e) hVar.get(gVar);
        le.i iVar = le.i.f8353x;
        if (eVar == null) {
            y0Var = d2.a();
            m9 = m(iVar, hVar.plus(y0Var), true);
            of.e eVar2 = o0.f5693a;
            if (m9 != eVar2 && m9.get(gVar) == null) {
                m9 = m9.plus(eVar2);
            }
        } else {
            if (eVar instanceof y0) {
            }
            y0Var = (y0) d2.f5658a.get();
            m9 = m(iVar, hVar, true);
            of.e eVar3 = o0.f5693a;
            if (m9 != eVar3 && m9.get(gVar) == null) {
                m9 = m9.plus(eVar3);
            }
        }
        f fVar = new f(m9, currentThread, y0Var);
        fVar.Y(d0.f5655x, fVar, pVar);
        y0 y0Var2 = fVar.B;
        if (y0Var2 != null) {
            int i6 = y0.B;
            y0Var2.m0(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (y0Var2 != null) {
                    j10 = y0Var2.n0();
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (fVar.E() instanceof d1) {
                    LockSupport.parkNanos(fVar, j10);
                } else {
                    if (y0Var2 != null) {
                        int i10 = y0.B;
                        y0Var2.j0(false);
                    }
                    Object H = H(fVar.E());
                    if (H instanceof t) {
                        tVar = (t) H;
                    } else {
                        tVar = null;
                    }
                    if (tVar == null) {
                        return H;
                    }
                    throw tVar.f5710a;
                }
            } catch (Throwable th) {
                if (y0Var2 != null) {
                    int i11 = y0.B;
                    y0Var2.j0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        fVar.q(interruptedException);
        throw interruptedException;
    }

    public static Object D(ve.a aVar, ne.c cVar) {
        return J(le.i.f8353x, new androidx.lifecycle.z(aVar, null, 4), cVar);
    }

    public static final Object E(g2 g2Var, ve.p pVar) {
        Object tVar;
        Object L;
        t(g2Var, false, new r0(o(g2Var.A.getContext()).S(g2Var.B, g2Var, g2Var.f5647z), 0), 3);
        try {
            if (!(pVar instanceof ne.a)) {
                tVar = a8.c.u(pVar, g2Var, g2Var);
            } else {
                kotlin.jvm.internal.z.c(2, pVar);
                tVar = pVar.invoke(g2Var, g2Var);
            }
        } catch (Throwable th) {
            tVar = new t(th, false);
        }
        me.a aVar = me.a.f8833x;
        if (tVar != aVar && (L = g2Var.L(tVar)) != f5669e) {
            if (L instanceof t) {
                Throwable th2 = ((t) L).f5710a;
                if (th2 instanceof f2) {
                    if (((f2) th2).f5675x == g2Var) {
                        if (tVar instanceof t) {
                            throw ((t) tVar).f5710a;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    throw th2;
                }
            } else {
                tVar = H(L);
            }
            return tVar;
        }
        return aVar;
    }

    public static final String F(le.c cVar) {
        Object b10;
        if (cVar instanceof mf.h) {
            return cVar.toString();
        }
        try {
            b10 = cVar + '@' + p(cVar);
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        if (he.k.a(b10) != null) {
            b10 = cVar.getClass().getName() + '@' + p(cVar);
        }
        return (String) b10;
    }

    public static final long G(long j10) {
        boolean z10;
        int i6 = ef.a.A;
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long f3 = ef.a.f(j10, ef.f.p(999999L, ef.c.NANOSECONDS));
            if ((((int) f3) & 1) == 1 && !ef.a.e(f3)) {
                return f3 >> 1;
            }
            return ef.a.h(f3, ef.c.MILLISECONDS);
        }
        if (!z10) {
            return 0L;
        }
        throw new RuntimeException();
    }

    public static final Object H(Object obj) {
        e1 e1Var;
        d1 d1Var;
        if (obj instanceof e1) {
            e1Var = (e1) obj;
        } else {
            e1Var = null;
        }
        if (e1Var != null && (d1Var = e1Var.f5661a) != null) {
            return d1Var;
        }
        return obj;
    }

    public static final j2 I(le.c cVar, le.h hVar, Object obj) {
        j2 j2Var = null;
        if ((cVar instanceof ne.d) && hVar.get(k2.f5685x) != null) {
            ne.d dVar = (ne.d) cVar;
            while (true) {
                if ((dVar instanceof l0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof j2) {
                    j2Var = (j2) dVar;
                    break;
                }
            }
            if (j2Var != null) {
                j2Var.c0(hVar, obj);
            }
        }
        return j2Var;
    }

    public static final Object J(le.h hVar, ve.p pVar, le.c cVar) {
        le.h m9;
        le.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, v.f5716z)).booleanValue()) {
            m9 = context.plus(hVar);
        } else {
            m9 = m(context, hVar, false);
        }
        l(m9);
        if (m9 == context) {
            mf.t tVar = new mf.t(cVar, m9);
            return bf.y.x(tVar, tVar, pVar);
        }
        le.d dVar = le.d.f8352x;
        if (kotlin.jvm.internal.k.a(m9.get(dVar), context.get(dVar))) {
            j2 j2Var = new j2(cVar, m9);
            le.h hVar2 = j2Var.f5647z;
            Object m10 = mf.a.m(hVar2, null);
            try {
                return bf.y.x(j2Var, j2Var, pVar);
            } finally {
                mf.a.g(hVar2, m10);
            }
        }
        mf.t tVar2 = new mf.t(cVar, m9);
        android.support.v4.media.session.b.t(pVar, tVar2, tVar2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.B;
        do {
            int i6 = atomicIntegerFieldUpdater.get(tVar2);
            if (i6 != 0) {
                if (i6 == 2) {
                    Object H = H(tVar2.E());
                    if (H instanceof t) {
                        throw ((t) H).f5710a;
                    }
                    return H;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(tVar2, 0, 1));
        return me.a.f8833x;
    }

    public static final Object K(long j10, ve.p pVar, ne.c cVar) {
        if (j10 > 0) {
            return E(new g2(j10, cVar), pVar);
        }
        throw new f2("Timed out immediately", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object L(long r5, ve.p r7, le.c r8) {
        /*
            boolean r0 = r8 instanceof gf.h2
            if (r0 == 0) goto L13
            r0 = r8
            gf.h2 r0 = (gf.h2) r0
            int r1 = r0.f5681z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5681z = r1
            goto L18
        L13:
            gf.h2 r0 = new gf.h2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5680y
            int r1 = r0.f5681z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.jvm.internal.w r5 = r0.f5679x
            he.a.f(r8)     // Catch: gf.f2 -> L27
            return r8
        L27:
            r6 = move-exception
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            he.a.f(r8)
            r3 = 0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L3b
            goto L5d
        L3b:
            kotlin.jvm.internal.w r8 = new kotlin.jvm.internal.w
            r8.<init>()
            r0.f5679x = r8     // Catch: gf.f2 -> L55
            r0.f5681z = r2     // Catch: gf.f2 -> L55
            gf.g2 r1 = new gf.g2     // Catch: gf.f2 -> L55
            r1.<init>(r5, r0)     // Catch: gf.f2 -> L55
            r8.f8055x = r1     // Catch: gf.f2 -> L55
            java.lang.Object r5 = E(r1, r7)     // Catch: gf.f2 -> L55
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L54
            return r6
        L54:
            return r5
        L55:
            r6 = move-exception
            r5 = r8
        L57:
            gf.j1 r7 = r6.f5675x
            java.lang.Object r5 = r5.f8055x
            if (r7 != r5) goto L5f
        L5d:
            r5 = 0
            return r5
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.f0.L(long, ve.p, le.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.q, gf.t1] */
    public static q a() {
        ?? t1Var = new t1(true);
        t1Var.H(null);
        return t1Var;
    }

    public static final mf.e b(le.h hVar) {
        if (hVar.get(i1.f5682x) == null) {
            hVar = hVar.plus(c());
        }
        return new mf.e(hVar);
    }

    public static m1 c() {
        return new m1(null);
    }

    public static final mf.e d() {
        c2 e10 = e();
        of.e eVar = o0.f5693a;
        return new mf.e(cf.m.A(e10, mf.o.f8875a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.c2, gf.m1] */
    public static c2 e() {
        return new m1(null);
    }

    public static final Executor f(y yVar) {
        z0 z0Var;
        Executor j02;
        if (yVar instanceof z0) {
            z0Var = (z0) yVar;
        } else {
            z0Var = null;
        }
        if (z0Var != null && (j02 = z0Var.j0()) != null) {
            return j02;
        }
        return new n0(yVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gf.a, gf.j0] */
    public static j0 g(c0 c0Var, le.h hVar, ve.p pVar, int i6) {
        if ((i6 & 1) != 0) {
            hVar = le.i.f8353x;
        }
        ?? aVar = new a(x(c0Var, hVar), true);
        aVar.Y(d0.f5655x, aVar, pVar);
        return aVar;
    }

    public static final void h(le.h hVar, CancellationException cancellationException) {
        j1 j1Var = (j1) hVar.get(i1.f5682x);
        if (j1Var != null) {
            j1Var.d(cancellationException);
        }
    }

    public static void i(c0 c0Var) {
        j1 j1Var = (j1) c0Var.getCoroutineContext().get(i1.f5682x);
        if (j1Var != null) {
            j1Var.d(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + c0Var).toString());
        }
    }

    public static final Object j(ve.p pVar, le.c cVar) {
        mf.t tVar = new mf.t(cVar, cVar.getContext());
        return bf.y.x(tVar, tVar, pVar);
    }

    public static final Object k(long j10, ne.c cVar) {
        if (j10 > 0) {
            k kVar = new k(1, a8.c.i(cVar));
            kVar.s();
            if (j10 < Long.MAX_VALUE) {
                o(kVar.B).K(j10, kVar);
            }
            Object r10 = kVar.r();
            if (r10 == me.a.f8833x) {
                return r10;
            }
        }
        return he.y.f6101a;
    }

    public static final void l(le.h hVar) {
        j1 j1Var = (j1) hVar.get(i1.f5682x);
        if (j1Var != null && !j1Var.isActive()) {
            throw j1Var.m();
        }
    }

    public static final le.h m(le.h hVar, le.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        v vVar = v.f5716z;
        boolean booleanValue = ((Boolean) hVar.fold(bool, vVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, vVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        v vVar2 = new v(2, 2);
        le.i iVar = le.i.f8353x;
        le.h hVar3 = (le.h) hVar.fold(iVar, vVar2);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.fold(iVar, v.f5715y);
        }
        return hVar3.plus((le.h) obj);
    }

    public static final y n(Executor executor) {
        n0 n0Var;
        y yVar;
        if (executor instanceof n0) {
            n0Var = (n0) executor;
        } else {
            n0Var = null;
        }
        if (n0Var != null && (yVar = n0Var.f5691x) != null) {
            return yVar;
        }
        return new a1(executor);
    }

    public static final k0 o(le.h hVar) {
        k0 k0Var;
        le.f fVar = hVar.get(le.d.f8352x);
        if (fVar instanceof k0) {
            k0Var = (k0) fVar;
        } else {
            k0Var = null;
        }
        if (k0Var == null) {
            return h0.f5678a;
        }
        return k0Var;
    }

    public static final String p(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final j1 q(le.h hVar) {
        j1 j1Var = (j1) hVar.get(i1.f5682x);
        if (j1Var != null) {
            return j1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final k r(le.c cVar) {
        k kVar;
        k kVar2;
        if (!(cVar instanceof mf.h)) {
            return new k(1, cVar);
        }
        mf.h hVar = (mf.h) cVar;
        h5.a aVar = mf.a.f8845d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mf.h.E;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            kVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                kVar2 = null;
                break;
            }
            if (obj instanceof k) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                kVar2 = (k) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (kVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.D;
            Object obj2 = atomicReferenceFieldUpdater2.get(kVar2);
            if ((obj2 instanceof s) && ((s) obj2).f5702d != null) {
                kVar2.o();
            } else {
                k.C.set(kVar2, 536870911);
                atomicReferenceFieldUpdater2.set(kVar2, b.f5649x);
                kVar = kVar2;
            }
            if (kVar != null) {
                return kVar;
            }
        }
        return new k(2, cVar);
    }

    public static final void s(le.h hVar, Throwable th) {
        try {
            a0 a0Var = (a0) hVar.get(z.f5729x);
            if (a0Var != null) {
                a0Var.handleException(hVar, th);
            } else {
                mf.a.d(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                he.a.a(runtimeException, th);
                th = runtimeException;
            }
            mf.a.d(hVar, th);
        }
    }

    public static q0 t(j1 j1Var, boolean z10, o1 o1Var, int i6) {
        boolean z11 = false;
        if ((i6 & 1) != 0) {
            z10 = false;
        }
        if ((i6 & 2) != 0) {
            z11 = true;
        }
        if (j1Var instanceof t1) {
            return ((t1) j1Var).I(z10, z11, o1Var);
        }
        return j1Var.b0(z10, z11, new n1(1, o1Var, g1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean u(c0 c0Var) {
        j1 j1Var = (j1) c0Var.getCoroutineContext().get(i1.f5682x);
        if (j1Var != null) {
            return j1Var.isActive();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [gf.a, gf.a2] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final a2 v(c0 c0Var, le.h hVar, d0 d0Var, ve.p pVar) {
        ?? r22;
        le.h x10 = x(c0Var, hVar);
        d0Var.getClass();
        if (d0Var == d0.f5656y) {
            r22 = new u1(x10, pVar);
        } else {
            r22 = new a(x10, true);
        }
        r22.Y(d0Var, r22, pVar);
        return r22;
    }

    public static /* synthetic */ a2 w(c0 c0Var, le.h hVar, ve.p pVar, int i6) {
        d0 d0Var;
        if ((i6 & 1) != 0) {
            hVar = le.i.f8353x;
        }
        if ((i6 & 2) != 0) {
            d0Var = d0.f5655x;
        } else {
            d0Var = d0.A;
        }
        return v(c0Var, hVar, d0Var, pVar);
    }

    public static final le.h x(c0 c0Var, le.h hVar) {
        le.h m9 = m(c0Var.getCoroutineContext(), hVar, true);
        of.e eVar = o0.f5693a;
        if (m9 != eVar && m9.get(le.d.f8352x) == null) {
            return m9.plus(eVar);
        }
        return m9;
    }

    public static final mf.e y(c0 c0Var, le.h hVar) {
        return new mf.e(c0Var.getCoroutineContext().plus(hVar));
    }

    public static final Object z(Object obj) {
        if (obj instanceof t) {
            return he.a.b(((t) obj).f5710a);
        }
        return obj;
    }
}
