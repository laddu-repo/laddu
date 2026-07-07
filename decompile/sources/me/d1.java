package me;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class d1 implements v0, h1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8687v = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8688w = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public d1(boolean z2) {
        this._state$volatile = z2 ? x.f8749j : x.i;
    }

    public static l Q(re.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = re.j.f11386w;
            re.j jVarF = jVar.f();
            if (jVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (re.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarF;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof l) {
                    return (l) jVar;
                }
                if (jVar instanceof e1) {
                    return null;
                }
            }
        }
    }

    public static String X(Object obj) {
        if (!(obj instanceof c1)) {
            return obj instanceof s0 ? ((s0) obj).a() ? "Active" : "New" : obj instanceof p ? "Cancelled" : "Completed";
        }
        c1 c1Var = (c1) obj;
        return c1Var.e() ? "Cancelling" : c1.f8682w.get(c1Var) != 0 ? "Completing" : "Active";
    }

    @Override // sd.h
    public final sd.f A(sd.g gVar) {
        return com.bumptech.glide.d.k(this, gVar);
    }

    public boolean C() {
        return true;
    }

    public boolean D() {
        return this instanceof n;
    }

    public final e1 E(s0 s0Var) {
        e1 e1VarD = s0Var.d();
        if (e1VarD != null) {
            return e1VarD;
        }
        if (s0Var instanceof i0) {
            return new e1();
        }
        if (s0Var instanceof z0) {
            V((z0) s0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + s0Var).toString());
    }

    public boolean F(Throwable th) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, me.l, me.z0, re.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, me.h0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [me.e1, re.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(me.v0 r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = me.d1.f8688w
            me.f1 r1 = me.f1.f8692v
            if (r8 != 0) goto La
            r0.set(r7, r1)
            return
        La:
            me.d1 r8 = (me.d1) r8
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = me.d1.f8687v
            java.lang.Object r3 = r2.get(r8)
            int r3 = r8.W(r3)
            if (r3 == 0) goto L1c
            r4 = 1
            if (r3 == r4) goto L1c
            goto Lc
        L1c:
            me.l r3 = new me.l
            r3.<init>(r7)
            r3.f8752y = r8
        L23:
            java.lang.Object r4 = r2.get(r8)
            boolean r5 = r4 instanceof me.i0
            if (r5 == 0) goto L45
            r5 = r4
            me.i0 r5 = (me.i0) r5
            boolean r6 = r5.f8699v
            if (r6 == 0) goto L41
        L32:
            boolean r5 = r2.compareAndSet(r8, r4, r3)
            if (r5 == 0) goto L3a
            goto L9d
        L3a:
            java.lang.Object r5 = r2.get(r8)
            if (r5 == r4) goto L32
            goto L23
        L41:
            r8.U(r5)
            goto L23
        L45:
            boolean r5 = r4 instanceof me.s0
            r6 = 0
            if (r5 == 0) goto L89
            r5 = r4
            me.s0 r5 = (me.s0) r5
            me.e1 r5 = r5.d()
            if (r5 != 0) goto L59
            me.z0 r4 = (me.z0) r4
            r8.V(r4)
            goto L23
        L59:
            r4 = 7
            boolean r4 = r5.e(r3, r4)
            if (r4 == 0) goto L61
            goto L9d
        L61:
            r4 = 3
            boolean r4 = r5.e(r3, r4)
            java.lang.Object r8 = r2.get(r8)
            boolean r2 = r8 instanceof me.c1
            if (r2 == 0) goto L75
            me.c1 r8 = (me.c1) r8
            java.lang.Throwable r6 = r8.c()
            goto L81
        L75:
            boolean r2 = r8 instanceof me.p
            if (r2 == 0) goto L7c
            me.p r8 = (me.p) r8
            goto L7d
        L7c:
            r8 = r6
        L7d:
            if (r8 == 0) goto L81
            java.lang.Throwable r6 = r8.f8723a
        L81:
            r3.l(r6)
            if (r4 == 0) goto L87
            goto L9d
        L87:
            r3 = r1
            goto L9d
        L89:
            java.lang.Object r8 = r2.get(r8)
            boolean r2 = r8 instanceof me.p
            if (r2 == 0) goto L94
            me.p r8 = (me.p) r8
            goto L95
        L94:
            r8 = r6
        L95:
            if (r8 == 0) goto L99
            java.lang.Throwable r6 = r8.f8723a
        L99:
            r3.l(r6)
            goto L87
        L9d:
            r0.set(r7, r3)
            boolean r8 = r7.L()
            if (r8 == 0) goto Lac
            r3.b()
            r0.set(r7, r1)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.d1.J(me.v0):void");
    }

    public final h0 K(boolean z2, z0 z0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f1 f1Var;
        boolean z10;
        boolean zE;
        z0Var.f8752y = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f8687v;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof i0;
            f1Var = f1.f8692v;
            z10 = true;
            if (!z11) {
                if (!(obj instanceof s0)) {
                    z10 = false;
                    break;
                }
                s0 s0Var = (s0) obj;
                e1 e1VarD = s0Var.d();
                if (e1VarD == null) {
                    V((z0) obj);
                } else {
                    if (z0Var.k()) {
                        c1 c1Var = s0Var instanceof c1 ? (c1) s0Var : null;
                        Throwable thC = c1Var != null ? c1Var.c() : null;
                        if (thC == null) {
                            zE = e1VarD.e(z0Var, 5);
                        } else if (z2) {
                            z0Var.l(thC);
                            return f1Var;
                        }
                    } else {
                        zE = e1VarD.e(z0Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                i0 i0Var = (i0) obj;
                if (i0Var.f8699v) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                U(i0Var);
            }
        }
        if (z10) {
            return z0Var;
        }
        if (z2) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            p pVar = obj2 instanceof p ? (p) obj2 : null;
            z0Var.l(pVar != null ? pVar.f8723a : null);
        }
        return f1Var;
    }

    public final boolean L() {
        return !(f8687v.get(this) instanceof s0);
    }

    public boolean M() {
        return this instanceof c;
    }

    public final boolean N(Object obj) {
        Object objY;
        do {
            objY = Y(f8687v.get(this), obj);
            if (objY == x.f8745d) {
                return false;
            }
            if (objY == x.f8746e) {
                return true;
            }
        } while (objY == x.f);
        j(objY);
        return true;
    }

    public final Object O(Object obj) {
        Object objY;
        do {
            objY = Y(f8687v.get(this), obj);
            if (objY == x.f8745d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                p pVar = obj instanceof p ? (p) obj : null;
                throw new IllegalStateException(str, pVar != null ? pVar.f8723a : null);
            }
        } while (objY == x.f);
        return objY;
    }

    public String P() {
        return getClass().getSimpleName();
    }

    public final void R(e1 e1Var, Throwable th) {
        e1Var.e(new re.h(4), 4);
        Object obj = re.j.f11385v.get(e1Var);
        de.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        a5.d dVar = null;
        for (re.j jVarH = (re.j) obj; !jVarH.equals(e1Var); jVarH = jVarH.h()) {
            if ((jVarH instanceof z0) && ((z0) jVarH).k()) {
                try {
                    ((z0) jVarH).l(th);
                } catch (Throwable th2) {
                    if (dVar != null) {
                        com.bumptech.glide.e.a(dVar, th2);
                    } else {
                        dVar = new a5.d(9, "Exception in completion handler " + jVarH + " for " + this, th2);
                    }
                }
            }
        }
        if (dVar != null) {
            G(dVar);
        }
        r(th);
    }

    public final void U(i0 i0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e1 e1Var = new e1();
        Object r0Var = e1Var;
        if (!i0Var.f8699v) {
            r0Var = new r0(e1Var);
        }
        do {
            atomicReferenceFieldUpdater = f8687v;
            if (atomicReferenceFieldUpdater.compareAndSet(this, i0Var, r0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == i0Var);
    }

    public final void V(z0 z0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e1 e1Var = new e1();
        z0Var.getClass();
        re.j.f11386w.set(e1Var, z0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = re.j.f11385v;
        atomicReferenceFieldUpdater2.set(e1Var, z0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(z0Var) == z0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(z0Var, z0Var, e1Var)) {
                    if (atomicReferenceFieldUpdater2.get(z0Var) != z0Var) {
                        break;
                    }
                }
                e1Var.g(z0Var);
                break loop0;
            }
            break;
        }
        re.j jVarH = z0Var.h();
        do {
            atomicReferenceFieldUpdater = f8687v;
            if (atomicReferenceFieldUpdater.compareAndSet(this, z0Var, jVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == z0Var);
    }

    public final int W(Object obj) {
        boolean z2 = obj instanceof i0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8687v;
        if (z2) {
            if (((i0) obj).f8699v) {
                return 0;
            }
            i0 i0Var = x.f8749j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof r0)) {
            return 0;
        }
        e1 e1Var = ((r0) obj).f8729v;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object Y(Object obj, Object obj2) {
        if (!(obj instanceof s0)) {
            return x.f8745d;
        }
        if (((obj instanceof i0) || (obj instanceof z0)) && !(obj instanceof l) && !(obj2 instanceof p)) {
            s0 s0Var = (s0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8687v;
            Object t0Var = obj2 instanceof s0 ? new t0((s0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, s0Var, t0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != s0Var) {
                    return x.f;
                }
            }
            S(obj2);
            u(s0Var, obj2);
            return obj2;
        }
        s0 s0Var2 = (s0) obj;
        e1 e1VarE = E(s0Var2);
        if (e1VarE == null) {
            return x.f;
        }
        c1 c1Var = s0Var2 instanceof c1 ? (c1) s0Var2 : null;
        if (c1Var == null) {
            c1Var = new c1(e1VarE, null);
        }
        synchronized (c1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c1.f8682w;
            if (atomicIntegerFieldUpdater.get(c1Var) != 0) {
                return x.f8745d;
            }
            atomicIntegerFieldUpdater.set(c1Var, 1);
            if (c1Var != s0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8687v;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, s0Var2, c1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != s0Var2) {
                        return x.f;
                    }
                }
            }
            boolean zE = c1Var.e();
            p pVar = obj2 instanceof p ? (p) obj2 : null;
            if (pVar != null) {
                c1Var.b(pVar.f8723a);
            }
            Throwable thC = zE ? null : c1Var.c();
            if (thC != null) {
                R(e1VarE, thC);
            }
            l lVarQ = Q(e1VarE);
            if (lVarQ != null && Z(c1Var, lVarQ, obj2)) {
                return x.f8746e;
            }
            e1VarE.e(new re.h(2), 2);
            l lVarQ2 = Q(e1VarE);
            return (lVarQ2 == null || !Z(c1Var, lVarQ2, obj2)) ? w(c1Var, obj2) : x.f8746e;
        }
    }

    public final boolean Z(c1 c1Var, l lVar, Object obj) {
        while (x.j(lVar.f8706z, false, new b1(this, c1Var, lVar, obj)) == f1.f8692v) {
            lVar = Q(lVar);
            if (lVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // me.v0
    public boolean a() {
        Object obj = f8687v.get(this);
        return (obj instanceof s0) && ((s0) obj).a();
    }

    @Override // sd.f
    public final sd.g getKey() {
        return t.f8732w;
    }

    @Override // me.v0
    public void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new w0(s(), null, this);
        }
        q(cancellationException);
    }

    @Override // sd.h
    public final sd.h l(sd.g gVar) {
        return com.bumptech.glide.d.C(this, gVar);
    }

    @Override // sd.h
    public final Object m(Object obj, ce.p pVar) {
        return pVar.i(obj, this);
    }

    @Override // sd.h
    public final sd.h n0(sd.h hVar) {
        return com.bumptech.glide.d.G(this, hVar);
    }

    public void o(Object obj) {
        j(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.d1.p(java.lang.Object):boolean");
    }

    public void q(CancellationException cancellationException) {
        p(cancellationException);
    }

    public final boolean r(Throwable th) {
        if (M()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        k kVar = (k) f8688w.get(this);
        return (kVar == null || kVar == f1.f8692v) ? z2 : kVar.c(th) || z2;
    }

    public String s() {
        return "Job was cancelled";
    }

    public boolean t(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return p(th) && C();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(P() + '{' + X(f8687v.get(this)) + '}');
        sb2.append('@');
        sb2.append(x.g(this));
        return sb2.toString();
    }

    public final void u(s0 s0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8688w;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar != null) {
            kVar.b();
            atomicReferenceFieldUpdater.set(this, f1.f8692v);
        }
        a5.d dVar = null;
        p pVar = obj instanceof p ? (p) obj : null;
        Throwable th = pVar != null ? pVar.f8723a : null;
        if (s0Var instanceof z0) {
            try {
                ((z0) s0Var).l(th);
                return;
            } catch (Throwable th2) {
                G(new a5.d(9, "Exception in completion handler " + s0Var + " for " + this, th2));
                return;
            }
        }
        e1 e1VarD = s0Var.d();
        if (e1VarD != null) {
            e1VarD.e(new re.h(1), 1);
            Object obj2 = re.j.f11385v.get(e1VarD);
            de.i.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (re.j jVarH = (re.j) obj2; !jVarH.equals(e1VarD); jVarH = jVarH.h()) {
                if (jVarH instanceof z0) {
                    try {
                        ((z0) jVarH).l(th);
                    } catch (Throwable th3) {
                        if (dVar != null) {
                            com.bumptech.glide.e.a(dVar, th3);
                        } else {
                            dVar = new a5.d(9, "Exception in completion handler " + jVarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (dVar != null) {
                G(dVar);
            }
        }
    }

    public final Throwable v(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        d1 d1Var = (d1) ((h1) obj);
        Object obj2 = f8687v.get(d1Var);
        if (obj2 instanceof c1) {
            thC = ((c1) obj2).c();
        } else if (obj2 instanceof p) {
            thC = ((p) obj2).f8723a;
        } else {
            if (obj2 instanceof s0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new w0("Parent job is ".concat(X(obj2)), thC, d1Var) : cancellationException;
    }

    public final Object w(c1 c1Var, Object obj) {
        Throwable thZ;
        p pVar = obj instanceof p ? (p) obj : null;
        Throwable th = pVar != null ? pVar.f8723a : null;
        synchronized (c1Var) {
            c1Var.e();
            ArrayList arrayListF = c1Var.f(th);
            thZ = z(c1Var, arrayListF);
            if (thZ != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size = arrayListF.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListF.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thZ && th2 != thZ && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        com.bumptech.glide.e.a(thZ, th2);
                    }
                }
            }
        }
        if (thZ != null && thZ != th) {
            obj = new p(thZ, false);
        }
        if (thZ != null && (r(thZ) || F(thZ))) {
            de.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            p.f8722b.compareAndSet((p) obj, 0, 1);
        }
        S(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8687v;
        Object t0Var = obj instanceof s0 ? new t0((s0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c1Var, t0Var) && atomicReferenceFieldUpdater.get(this) == c1Var) {
        }
        u(c1Var, obj);
        return obj;
    }

    public final CancellationException x() {
        CancellationException cancellationException;
        Object obj = f8687v.get(this);
        if (!(obj instanceof c1)) {
            if (obj instanceof s0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof p)) {
                return new w0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((p) obj).f8723a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new w0(s(), th, this) : cancellationException;
        }
        Throwable thC = ((c1) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = s();
        }
        return new w0(strConcat, thC, this);
    }

    public final Object y() throws Throwable {
        Object obj = f8687v.get(this);
        if (obj instanceof s0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof p) {
            throw ((p) obj).f8723a;
        }
        return x.q(obj);
    }

    public final Throwable z(c1 c1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (c1Var.e()) {
                return new w0(s(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof l1) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof l1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public void T() {
    }

    public void G(a5.d dVar) {
        throw dVar;
    }

    public void S(Object obj) {
    }

    public void j(Object obj) {
    }
}
