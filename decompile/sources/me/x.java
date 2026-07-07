package me;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final re.t f8742a = new re.t(0, "RESUME_TOKEN");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final re.t f8743b = new re.t(0, "REMOVED_TASK");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final re.t f8744c = new re.t(0, "CLOSED_EMPTY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final re.t f8745d = new re.t(0, "COMPLETING_ALREADY");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final re.t f8746e = new re.t(0, "COMPLETING_WAITING_CHILDREN");
    public static final re.t f = new re.t(0, "COMPLETING_RETRY");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final re.t f8747g = new re.t(0, "TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final re.t f8748h = new re.t(0, "SEALED");
    public static final i0 i = new i0(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i0 f8749j = new i0(true);

    public static n a() {
        n nVar = new n(true);
        nVar.J(null);
        return nVar;
    }

    public static final re.c b(sd.h hVar) {
        if (hVar.A(t.f8732w) == null) {
            hVar = hVar.n0(new x0(null));
        }
        return new re.c(hVar);
    }

    public static a0 c(re.c cVar, ce.p pVar) {
        a0 a0Var = new a0(l(cVar, sd.i.f11797v), true, 0);
        a0Var.d0(w.f8737v, a0Var, pVar);
        return a0Var;
    }

    public static final sd.h d(sd.h hVar, sd.h hVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) hVar.m(bool, new q(0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.m(bool, new q(0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.n0(hVar2);
        }
        q qVar = new q(1);
        sd.i iVar = sd.i.f11797v;
        sd.h hVar3 = (sd.h) hVar.m(iVar, qVar);
        Object objM = hVar2;
        if (zBooleanValue2) {
            objM = hVar2.m(iVar, new q(2));
        }
        return hVar3.n0((sd.h) objM);
    }

    public static final s e(Executor executor) {
        return new q0(executor);
    }

    public static final b0 f(sd.h hVar) {
        sd.f fVarA = hVar.A(sd.d.f11796v);
        b0 b0Var = fVarA instanceof b0 ? (b0) fVarA : null;
        return b0Var == null ? z.f8751a : b0Var;
    }

    public static final String g(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final h h(sd.c cVar) {
        h hVar;
        h hVar2;
        if (!(cVar instanceof re.f)) {
            return new h(1, cVar);
        }
        re.f fVar = (re.f) cVar;
        re.t tVar = re.a.f11370c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = re.f.C;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            hVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, tVar);
                hVar2 = null;
                break;
            }
            if (obj instanceof h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                hVar2 = (h) obj;
                break loop0;
            }
            if (obj != tVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (hVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h.B;
            Object obj2 = atomicReferenceFieldUpdater2.get(hVar2);
            if (!(obj2 instanceof o) || ((o) obj2).f8716d == null) {
                h.A.set(hVar2, 536870911);
                atomicReferenceFieldUpdater2.set(hVar2, b.f8677a);
                hVar = hVar2;
            } else {
                hVar2.r();
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return new h(2, cVar);
    }

    public static final void i(Throwable th, sd.h hVar) {
        try {
            ne.b bVar = (ne.b) hVar.A(t.f8731v);
            if (bVar != null) {
                bVar.o0(th);
            } else {
                re.a.d(th, hVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                com.bumptech.glide.e.a(runtimeException, th);
                th = runtimeException;
            }
            re.a.d(th, hVar);
        }
    }

    public static final h0 j(v0 v0Var, boolean z2, z0 z0Var) {
        if (v0Var instanceof d1) {
            return ((d1) v0Var).K(z2, z0Var);
        }
        boolean zK = z0Var.k();
        y0 y0Var = new y0(1, z0Var, z0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 0);
        return ((d1) v0Var).K(z2, zK ? new u0(y0Var) : new j(2, y0Var));
    }

    public static a0 k(v vVar, u uVar, ce.p pVar, int i10) {
        boolean z2 = true;
        sd.h hVar = uVar;
        if ((i10 & 1) != 0) {
            hVar = sd.i.f11797v;
        }
        a0 a0Var = new a0(l(vVar, hVar), z2, 1);
        a0Var.d0(w.f8737v, a0Var, pVar);
        return a0Var;
    }

    public static final sd.h l(v vVar, sd.h hVar) {
        sd.h hVarD = d(vVar.b(), hVar, true);
        te.e eVar = f0.f8691a;
        return (hVarD == eVar || hVarD.A(sd.d.f11796v) != null) ? hVarD : hVarD.n0(eVar);
    }

    public static final Object m(Object obj) {
        return obj instanceof p ? fa.b.i(((p) obj).f8723a) : obj;
    }

    public static final void n(h hVar, sd.c cVar, boolean z2) {
        Object obj = h.B.get(hVar);
        Throwable thH = hVar.h(obj);
        Object objI = thH != null ? fa.b.i(thH) : hVar.i(obj);
        if (!z2) {
            cVar.g(objI);
            return;
        }
        de.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        re.f fVar = (re.f) cVar;
        ud.c cVar2 = fVar.f11380z;
        Object obj2 = fVar.B;
        sd.h hVarF = cVar2.f();
        Object objL = re.a.l(hVarF, obj2);
        o1 o1VarR = objL != re.a.f11371d ? r(cVar2, hVarF, objL) : null;
        try {
            cVar2.g(objI);
            if (o1VarR == null || o1VarR.e0()) {
                re.a.g(hVarF, objL);
            }
        } catch (Throwable th) {
            if (o1VarR == null || o1VarR.e0()) {
                re.a.g(hVarF, objL);
            }
            throw th;
        }
    }

    public static final Object o(sd.h hVar, ce.p pVar) throws Throwable {
        o0 o0VarA;
        sd.h hVarD;
        Thread threadCurrentThread = Thread.currentThread();
        sd.g gVar = sd.d.f11796v;
        sd.e eVar = (sd.e) hVar.A(gVar);
        sd.i iVar = sd.i.f11797v;
        if (eVar == null) {
            o0VarA = j1.a();
            hVarD = d(iVar, hVar.n0(o0VarA), true);
            te.e eVar2 = f0.f8691a;
            if (hVarD != eVar2 && hVarD.A(gVar) == null) {
                hVarD = hVarD.n0(eVar2);
            }
        } else {
            if (eVar instanceof o0) {
            }
            o0VarA = (o0) j1.f8703a.get();
            hVarD = d(iVar, hVar, true);
            te.e eVar3 = f0.f8691a;
            if (hVarD != eVar3 && hVarD.A(gVar) == null) {
                hVarD = hVarD.n0(eVar3);
            }
        }
        c cVar = new c(hVarD, threadCurrentThread, o0VarA);
        cVar.d0(w.f8737v, cVar, pVar);
        o0 o0Var = cVar.f8680z;
        if (o0Var != null) {
            int i10 = o0.A;
            o0Var.t0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jU0 = o0Var != null ? o0Var.u0() : Long.MAX_VALUE;
                if (cVar.L()) {
                    if (o0Var != null) {
                        int i11 = o0.A;
                        o0Var.r0(false);
                    }
                    Object objQ = q(d1.f8687v.get(cVar));
                    p pVar2 = objQ instanceof p ? (p) objQ : null;
                    if (pVar2 == null) {
                        return objQ;
                    }
                    throw pVar2.f8723a;
                }
                LockSupport.parkNanos(cVar, jU0);
            } catch (Throwable th) {
                if (o0Var != null) {
                    int i12 = o0.A;
                    o0Var.r0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        cVar.p(interruptedException);
        throw interruptedException;
    }

    public static final String p(sd.c cVar) {
        Object objI;
        if (cVar instanceof re.f) {
            return ((re.f) cVar).toString();
        }
        try {
            objI = cVar + '@' + g(cVar);
        } catch (Throwable th) {
            objI = fa.b.i(th);
        }
        if (od.h.a(objI) != null) {
            objI = cVar.getClass().getName() + '@' + g(cVar);
        }
        return (String) objI;
    }

    public static final Object q(Object obj) {
        s0 s0Var;
        t0 t0Var = obj instanceof t0 ? (t0) obj : null;
        return (t0Var == null || (s0Var = t0Var.f8733a) == null) ? obj : s0Var;
    }

    public static final o1 r(sd.c cVar, sd.h hVar, Object obj) {
        o1 o1Var = null;
        if ((cVar instanceof ud.d) && hVar.A(p1.f8724v) != null) {
            ud.d dVarC = (ud.d) cVar;
            while (true) {
                if ((dVarC instanceof c0) || (dVarC = dVarC.c()) == null) {
                    break;
                }
                if (dVarC instanceof o1) {
                    o1Var = (o1) dVarC;
                    break;
                }
            }
            if (o1Var != null) {
                o1Var.f0(hVar, obj);
            }
        }
        return o1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object s(sd.h hVar, ce.p pVar, sd.c cVar) throws Throwable {
        sd.h hVarF = cVar.f();
        sd.h hVarN0 = !((Boolean) hVar.m(Boolean.FALSE, new q(0))).booleanValue() ? hVarF.n0(hVar) : d(hVarF, hVar, false);
        v0 v0Var = (v0) hVarN0.A(t.f8732w);
        if (v0Var != null && !v0Var.a()) {
            throw ((d1) v0Var).x();
        }
        if (hVarN0 == hVarF) {
            re.q qVar = new re.q(cVar, hVarN0);
            return com.bumptech.glide.e.t(qVar, qVar, pVar);
        }
        sd.d dVar = sd.d.f11796v;
        if (de.i.a(hVarN0.A(dVar), hVarF.A(dVar))) {
            o1 o1Var = new o1(cVar, hVarN0);
            sd.h hVar2 = o1Var.f8675x;
            Object objL = re.a.l(hVar2, null);
            try {
                return com.bumptech.glide.e.t(o1Var, o1Var, pVar);
            } finally {
                re.a.g(hVar2, objL);
            }
        }
        c0 c0Var = new c0(cVar, hVarN0);
        try {
            re.a.h(od.l.f10126a, t1.h(((ud.a) pVar).l(c0Var, c0Var)));
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c0.f8681z;
            do {
                int i10 = atomicIntegerFieldUpdater.get(c0Var);
                if (i10 != 0) {
                    if (i10 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objQ = q(d1.f8687v.get(c0Var));
                    if (objQ instanceof p) {
                        throw ((p) objQ).f8723a;
                    }
                    return objQ;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c0Var, 0, 1));
            return td.a.f12544v;
        } catch (Throwable th) {
            c0Var.g(fa.b.i(th));
            throw th;
        }
    }

    public static final Object t(long j8, cb.e eVar, r4.r rVar) throws Throwable {
        long jE;
        Object pVar;
        Object objO;
        int i10 = le.a.f8338y;
        int i11 = 1;
        boolean z2 = j8 > 0;
        if (z2) {
            long jT = com.bumptech.glide.f.T(999999L, le.c.NANOSECONDS);
            if (le.a.d(j8)) {
                if (le.a.d(jT) && (jT ^ j8) < 0) {
                    throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
                }
            } else if (le.a.d(jT)) {
                j8 = jT;
            } else {
                int i12 = ((int) j8) & 1;
                if (i12 == (((int) jT) & 1)) {
                    long j9 = (j8 >> 1) + (jT >> 1);
                    j8 = i12 == 0 ? (-4611686018426999999L > j9 || j9 >= 4611686018427000000L) ? com.bumptech.glide.f.n(j9 / ((long) 1000000)) : com.bumptech.glide.f.o(j9) : (-4611686018426L > j9 || j9 >= 4611686018427L) ? com.bumptech.glide.f.n(android.support.v4.media.session.b.f(j9)) : com.bumptech.glide.f.o(j9 * ((long) 1000000));
                } else {
                    j8 = i12 == 1 ? le.a.a(j8 >> 1, jT >> 1) : le.a.a(jT >> 1, j8 >> 1);
                }
            }
            jE = ((((int) j8) & 1) != 1 || le.a.d(j8)) ? le.a.e(j8, le.c.MILLISECONDS) : j8 >> 1;
        } else {
            if (z2) {
                throw new a5.d();
            }
            jE = 0;
        }
        if (jE <= 0) {
            throw new l1("Timed out immediately", null);
        }
        m1 m1Var = new m1(jE, rVar);
        j(m1Var, true, new j(i11, f(m1Var.f11398y.f()).G(m1Var.f8711z, m1Var, m1Var.f8675x)));
        try {
            de.s.a(2, eVar);
            pVar = eVar.i(m1Var, m1Var);
        } catch (Throwable th) {
            pVar = new p(th, false);
        }
        Object obj = td.a.f12544v;
        if (pVar == obj || (objO = m1Var.O(pVar)) == f8746e) {
            return obj;
        }
        if (objO instanceof p) {
            Throwable th2 = ((p) objO).f8723a;
            if (!(th2 instanceof l1) || ((l1) th2).f8709v != m1Var) {
                throw th2;
            }
            if (pVar instanceof p) {
                throw ((p) pVar).f8723a;
            }
        } else {
            pVar = q(objO);
        }
        return pVar;
    }
}
