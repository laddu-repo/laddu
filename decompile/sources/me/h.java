package me;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class h extends d0 implements f, ud.d, q1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sd.c f8696y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final sd.h f8697z;

    public h(int i, sd.c cVar) {
        super(i);
        this.f8696y = cVar;
        this.f8697z = cVar.f();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f8677a;
    }

    public static Object F(g1 g1Var, Object obj, int i, ce.q qVar) {
        if (obj instanceof p) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (qVar != null || (g1Var instanceof e)) {
            return new o(obj, g1Var instanceof e ? (e) g1Var : null, qVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void z(g1 g1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + g1Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void C() {
        sd.c cVar = this.f8696y;
        Throwable th = null;
        re.f fVar = cVar instanceof re.f ? (re.f) cVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = re.f.C;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                re.t tVar = re.a.f11370c;
                if (obj == tVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            r();
            q(th);
        }
    }

    public final void D(Object obj, int i, ce.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof g1) {
                Object objF = F((g1) obj2, obj, i, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    r();
                }
                s(i);
                return;
            }
            if (obj2 instanceof i) {
                i iVar = (i) obj2;
                if (i.f8698c.compareAndSet(iVar, 0, 1)) {
                    if (qVar != null) {
                        o(qVar, iVar.f8723a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void E(s sVar) {
        sd.c cVar = this.f8696y;
        re.f fVar = cVar instanceof re.f ? (re.f) cVar : null;
        D(od.l.f10126a, (fVar != null ? fVar.f11379y : null) == sVar ? 4 : this.f8686x, null);
    }

    @Override // me.q1
    public final void a(re.r rVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = A;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i));
        x(rVar);
    }

    @Override // me.d0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof g1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof p) {
                return;
            }
            if (!(obj instanceof o)) {
                cancellationException2 = cancellationException;
                o oVar = new o(obj, (e) null, (ce.q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            o oVar2 = (o) obj;
            if (oVar2.f8717e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            o oVarA = o.a(oVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            e eVar = oVar2.f8714b;
            if (eVar != null) {
                m(eVar, cancellationException);
            }
            ce.q qVar = oVar2.f8715c;
            if (qVar != null) {
                o(qVar, cancellationException, oVar2.f8713a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // ud.d
    public final ud.d c() {
        sd.c cVar = this.f8696y;
        if (cVar instanceof ud.d) {
            return (ud.d) cVar;
        }
        return null;
    }

    @Override // me.d0
    public final sd.c d() {
        return this.f8696y;
    }

    @Override // me.f
    public final void e(Object obj, ce.q qVar) {
        D(obj, this.f8686x, qVar);
    }

    @Override // sd.c
    public final sd.h f() {
        return this.f8697z;
    }

    @Override // sd.c
    public final void g(Object obj) {
        Throwable thA = od.h.a(obj);
        if (thA != null) {
            obj = new p(thA, false);
        }
        D(obj, this.f8686x, null);
    }

    @Override // me.d0
    public final Throwable h(Object obj) {
        Throwable thH = super.h(obj);
        if (thH != null) {
            return thH;
        }
        return null;
    }

    @Override // me.d0
    public final Object i(Object obj) {
        return obj instanceof o ? ((o) obj).f8713a : obj;
    }

    @Override // me.f
    public final re.t k(Object obj, ce.q qVar) {
        re.t tVar = x.f8742a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof g1)) {
                return null;
            }
            Object objF = F((g1) obj2, obj, this.f8686x, qVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!y()) {
                r();
            }
            return tVar;
        }
    }

    @Override // me.d0
    public final Object l() {
        return B.get(this);
    }

    public final void m(e eVar, Throwable th) {
        try {
            switch (eVar.f8689a) {
                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                    ((ScheduledFuture) eVar.f8690b).cancel(false);
                    break;
                case 1:
                    ((ce.l) eVar.f8690b).a(th);
                    break;
                default:
                    ((h0) eVar.f8690b).b();
                    break;
            }
        } catch (Throwable th2) {
            x.i(new a5.d(9, "Exception in invokeOnCancellation handler for " + this, th2), this.f8697z);
        }
    }

    @Override // me.f
    public final void n(Object obj) {
        s(this.f8686x);
    }

    public final void o(ce.q qVar, Throwable th, Object obj) {
        sd.h hVar = this.f8697z;
        try {
            qVar.h(th, obj, hVar);
        } catch (Throwable th2) {
            x.i(new a5.d(9, "Exception in resume onCancellation handler for " + this, th2), hVar);
        }
    }

    public final void p(re.r rVar, Throwable th) {
        sd.h hVar = this.f8697z;
        int i = A.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.g(i, hVar);
        } catch (Throwable th2) {
            x.i(new a5.d(9, "Exception in invokeOnCancellation handler for " + this, th2), hVar);
        }
    }

    public final boolean q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof g1)) {
                return false;
            }
            i iVar = new i(this, th, (obj instanceof e) || (obj instanceof re.r));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, iVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            g1 g1Var = (g1) obj;
            if (g1Var instanceof e) {
                m((e) obj, th);
            } else if (g1Var instanceof re.r) {
                p((re.r) obj, th);
            }
            if (!y()) {
                r();
            }
            s(this.f8686x);
            return true;
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
        h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
        if (h0Var == null) {
            return;
        }
        h0Var.b();
        atomicReferenceFieldUpdater.set(this, f1.f8692v);
    }

    public final void s(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = A;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i == 4;
                sd.c cVar = this.f8696y;
                if (!z2 && (cVar instanceof re.f)) {
                    boolean z10 = i == 1 || i == 2;
                    int i12 = this.f8686x;
                    if (z10 == (i12 == 1 || i12 == 2)) {
                        re.f fVar = (re.f) cVar;
                        s sVar = fVar.f11379y;
                        sd.h hVarF = fVar.f11380z.f();
                        if (sVar.p0(hVarF)) {
                            sVar.o0(hVarF, this);
                            return;
                        }
                        o0 o0VarA = j1.a();
                        if (o0VarA.f8718x < 4294967296L) {
                            o0VarA.t0(true);
                            try {
                                x.n(this, cVar, true);
                                do {
                                } while (o0VarA.v0());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            return;
                        }
                        pd.h hVar = o0VarA.f8720z;
                        if (hVar == null) {
                            hVar = new pd.h();
                            o0VarA.f8720z = hVar;
                        }
                        hVar.addLast(this);
                        return;
                    }
                }
                x.n(this, cVar, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable t(d1 d1Var) {
        return d1Var.x();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A());
        sb2.append('(');
        sb2.append(x.p(this.f8696y));
        sb2.append("){");
        Object obj = B.get(this);
        sb2.append(obj instanceof g1 ? "Active" : obj instanceof i ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(x.g(this));
        return sb2.toString();
    }

    public final Object u() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        v0 v0Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = A;
            i = atomicIntegerFieldUpdater.get(this);
            int i10 = i >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zY) {
                    C();
                }
                Object obj = B.get(this);
                if (obj instanceof p) {
                    throw ((p) obj).f8723a;
                }
                int i11 = this.f8686x;
                if ((i11 != 1 && i11 != 2) || (v0Var = (v0) this.f8697z.A(t.f8732w)) == null || v0Var.a()) {
                    return i(obj);
                }
                CancellationException cancellationExceptionX = ((d1) v0Var).x();
                b(cancellationExceptionX);
                throw cancellationExceptionX;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((h0) C.get(this)) == null) {
            w();
        }
        if (zY) {
            C();
        }
        return td.a.f12544v;
    }

    public final void v() {
        h0 h0VarW = w();
        if (h0VarW == null || (B.get(this) instanceof g1)) {
            return;
        }
        h0VarW.b();
        C.set(this, f1.f8692v);
    }

    public final h0 w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v0 v0Var = (v0) this.f8697z.A(t.f8732w);
        if (v0Var == null) {
            return null;
        }
        h0 h0VarJ = x.j(v0Var, true, new j(0, this));
        do {
            atomicReferenceFieldUpdater = C;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, h0VarJ)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return h0VarJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        z(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(me.g1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = me.h.B
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof me.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof me.e
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof re.r
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof me.p
            if (r1 == 0) goto L4d
            r0 = r2
            me.p r0 = (me.p) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = me.p.f8722b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof me.i
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.f8723a
            boolean r1 = r8 instanceof me.e
            if (r1 == 0) goto L43
            me.e r8 = (me.e) r8
            r7.m(r8, r0)
            return
        L43:
            re.r r8 = (re.r) r8
            r7.p(r8, r0)
            return
        L49:
            z(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof me.o
            if (r1 == 0) goto L80
            r1 = r2
            me.o r1 = (me.o) r1
            me.e r4 = r1.f8714b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof re.r
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            me.e r4 = (me.e) r4
            java.lang.Throwable r5 = r1.f8717e
            if (r5 == 0) goto L68
            r7.m(r4, r5)
            return
        L68:
            r5 = 29
            me.o r1 = me.o.a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            z(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof re.r
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            me.e r3 = (me.e) r3
            me.o r1 = new me.o
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            z(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: me.h.x(me.g1):void");
    }

    public final boolean y() {
        if (this.f8686x != 2) {
            return false;
        }
        sd.c cVar = this.f8696y;
        de.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return re.f.C.get((re.f) cVar) != null;
    }
}
