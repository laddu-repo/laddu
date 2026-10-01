package gf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class t1 implements j1, z1 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5712x = AtomicReferenceFieldUpdater.newUpdater(t1.class, Object.class, "_state$volatile");

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5713y = AtomicReferenceFieldUpdater.newUpdater(t1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public t1(boolean z10) {
        s0 s0Var;
        if (z10) {
            s0Var = f0.j;
        } else {
            s0Var = f0.f5673i;
        }
        this._state$volatile = s0Var;
    }

    public static o N(mf.k kVar) {
        while (kVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mf.k.f8864y;
            mf.k e10 = kVar.e();
            if (e10 == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (mf.k) obj;
                    if (!kVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = e10;
            }
        }
        while (true) {
            kVar = kVar.h();
            if (!kVar.i()) {
                if (kVar instanceof o) {
                    return (o) kVar;
                }
                if (kVar instanceof v1) {
                    return null;
                }
            }
        }
    }

    public static String U(Object obj) {
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            if (r1Var.d()) {
                return "Cancelling";
            }
            if (r1Var.e()) {
                return "Completing";
            }
            return "Active";
        }
        if (obj instanceof d1) {
            if (((d1) obj).isActive()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof t) {
            return "Cancelled";
        }
        return "Completed";
    }

    public final Throwable A(r1 r1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!r1Var.d()) {
                return null;
            }
            return new k1(t(), null, this);
        }
        int size = arrayList.size();
        int i6 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = arrayList.get(i10);
                i10++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof f2) {
            int size2 = arrayList.size();
            while (true) {
                if (i6 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i6);
                i6++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof f2)) {
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

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof q;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [gf.v1, mf.k] */
    public final v1 D(d1 d1Var) {
        v1 c10 = d1Var.c();
        if (c10 == null) {
            if (d1Var instanceof s0) {
                return new mf.k();
            }
            if (d1Var instanceof o1) {
                S((o1) d1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + d1Var).toString());
        }
        return c10;
    }

    public final Object E() {
        while (true) {
            Object obj = f5712x.get(this);
            if (!(obj instanceof mf.q)) {
                return obj;
            }
            ((mf.q) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public final void H(j1 j1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5713y;
        x1 x1Var = x1.f5725x;
        if (j1Var == null) {
            atomicReferenceFieldUpdater.set(this, x1Var);
            return;
        }
        j1Var.start();
        n Q = j1Var.Q(this);
        atomicReferenceFieldUpdater.set(this, Q);
        if (!(E() instanceof d1)) {
            Q.d();
            atomicReferenceFieldUpdater.set(this, x1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        return r1;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [gf.v1, mf.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final gf.q0 I(boolean r9, boolean r10, gf.g1 r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.t1.I(boolean, boolean, gf.g1):gf.q0");
    }

    public boolean J() {
        return this instanceof f;
    }

    public final boolean K(Object obj) {
        Object V;
        do {
            V = V(E(), obj);
            if (V == f0.f5668d) {
                return false;
            }
            if (V == f0.f5669e) {
                return true;
            }
        } while (V == f0.f5670f);
        n(V);
        return true;
    }

    public final Object L(Object obj) {
        Object V;
        t tVar;
        do {
            V = V(E(), obj);
            if (V == f0.f5668d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof t) {
                    tVar = (t) obj;
                } else {
                    tVar = null;
                }
                if (tVar != null) {
                    th = tVar.f5710a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (V == f0.f5670f);
        return V;
    }

    public String M() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, a2.x0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [gf.t1, java.lang.Object] */
    public final void O(v1 v1Var, Throwable th) {
        Object g10 = v1Var.g();
        kotlin.jvm.internal.k.c(g10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        mf.k kVar = (mf.k) g10;
        ?? r12 = 0;
        while (!kVar.equals(v1Var)) {
            if (kVar instanceof l1) {
                o1 o1Var = (o1) kVar;
                try {
                    o1Var.a(th);
                } catch (Throwable th2) {
                    if (r12 != 0) {
                        he.a.a(r12, th2);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + o1Var + " for " + ((Object) this), th2);
                    }
                }
            }
            kVar = kVar.h();
            r12 = r12;
        }
        if (r12 != 0) {
            G(r12);
        }
        s(th);
    }

    @Override // gf.j1
    public final n Q(t1 t1Var) {
        q0 t10 = f0.t(this, true, new o(t1Var), 2);
        kotlin.jvm.internal.k.c(t10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (n) t10;
    }

    public final void S(o1 o1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        mf.k kVar = new mf.k();
        o1Var.getClass();
        mf.k.f8864y.set(kVar, o1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = mf.k.f8863x;
        atomicReferenceFieldUpdater2.set(kVar, o1Var);
        loop0: while (true) {
            if (o1Var.g() != o1Var) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(o1Var, o1Var, kVar)) {
                if (atomicReferenceFieldUpdater2.get(o1Var) != o1Var) {
                    break;
                }
            }
            kVar.f(o1Var);
        }
        mf.k h4 = o1Var.h();
        do {
            atomicReferenceFieldUpdater = f5712x;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o1Var, h4)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o1Var);
    }

    public final int T(Object obj) {
        boolean z10 = obj instanceof s0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5712x;
        if (z10) {
            if (!((s0) obj).f5704x) {
                s0 s0Var = f0.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                R();
                return 1;
            }
            return 0;
        }
        if (obj instanceof c1) {
            v1 v1Var = ((c1) obj).f5653x;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, v1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            R();
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bf, code lost:
    
        if (r2 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cf, code lost:
    
        if (gf.f0.t(r2.B, false, new gf.q1(r6, r1, r2, r8), 1) == gf.x1.f5725x) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d4, code lost:
    
        r2 = N(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d8, code lost:
    
        if (r2 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d3, code lost:
    
        return gf.f0.f5669e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00de, code lost:
    
        return x(r1, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.t1.V(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public Object a0(ne.c cVar) {
        return p(cVar);
    }

    @Override // gf.j1
    public final q0 b0(boolean z10, boolean z11, n1 n1Var) {
        return I(z10, z11, new f1(n1Var));
    }

    @Override // gf.j1
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new k1(t(), null, this);
        }
        r(cancellationException);
    }

    public Object f() {
        return z();
    }

    @Override // le.h
    public final Object fold(Object obj, ve.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // le.h
    public final le.f get(le.g gVar) {
        return cf.m.o(this, gVar);
    }

    @Override // le.f
    public final le.g getKey() {
        return i1.f5682x;
    }

    @Override // gf.j1
    public final j1 getParent() {
        n nVar = (n) f5713y.get(this);
        if (nVar != null) {
            return nVar.getParent();
        }
        return null;
    }

    @Override // gf.j1
    public boolean isActive() {
        Object E = E();
        if ((E instanceof d1) && ((d1) E).isActive()) {
            return true;
        }
        return false;
    }

    @Override // gf.j1
    public final boolean isCancelled() {
        Object E = E();
        if (!(E instanceof t)) {
            if (!(E instanceof r1) || !((r1) E).d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean k(d1 d1Var, v1 v1Var, o1 o1Var) {
        mf.k e10;
        s1 s1Var = new s1(o1Var, this, d1Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mf.k.f8864y;
            e10 = v1Var.e();
            if (e10 == null) {
                Object obj = atomicReferenceFieldUpdater.get(v1Var);
                while (true) {
                    e10 = (mf.k) obj;
                    if (!e10.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e10);
                }
            }
            mf.k.f8864y.set(o1Var, e10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = mf.k.f8863x;
            atomicReferenceFieldUpdater2.set(o1Var, v1Var);
            s1Var.f5706c = v1Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(e10, v1Var, s1Var)) {
                if (atomicReferenceFieldUpdater2.get(e10) != v1Var) {
                    break;
                }
            }
        }
        if (s1Var.a(e10) == null) {
            return true;
        }
        return false;
    }

    @Override // gf.j1
    public final Object l(lf.i iVar) {
        Object E;
        he.y yVar;
        do {
            E = E();
            boolean z10 = E instanceof d1;
            yVar = he.y.f6101a;
            if (!z10) {
                f0.l(iVar.getContext());
                return yVar;
            }
        } while (T(E) < 0);
        k kVar = new k(1, a8.c.i(iVar));
        kVar.s();
        kVar.v(new h(f0.t(this, false, new r0(kVar, 3), 3), 2));
        Object r10 = kVar.r();
        me.a aVar = me.a.f8833x;
        if (r10 != aVar) {
            r10 = yVar;
        }
        if (r10 == aVar) {
            return r10;
        }
        return yVar;
    }

    @Override // gf.j1
    public final CancellationException m() {
        Object E = E();
        CancellationException cancellationException = null;
        if (E instanceof r1) {
            Throwable b10 = ((r1) E).b();
            if (b10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (b10 instanceof CancellationException) {
                    cancellationException = (CancellationException) b10;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = t();
                    }
                    return new k1(concat, b10, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(E instanceof d1)) {
            if (E instanceof t) {
                Throwable th = ((t) E).f5710a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new k1(t(), th, this);
                }
                return cancellationException;
            }
            return new k1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // le.h
    public final le.h minusKey(le.g gVar) {
        return cf.m.x(this, gVar);
    }

    public void o(Object obj) {
        n(obj);
    }

    public final Object p(le.c cVar) {
        Object E;
        do {
            E = E();
            if (!(E instanceof d1)) {
                if (!(E instanceof t)) {
                    return f0.H(E);
                }
                throw ((t) E).f5710a;
            }
        } while (T(E) < 0);
        p1 p1Var = new p1(a8.c.i(cVar), this);
        p1Var.s();
        p1Var.v(new h(f0.t(this, false, new r0(p1Var, 2), 3), 2));
        return p1Var.r();
    }

    @Override // le.h
    public final le.h plus(le.h hVar) {
        return cf.m.A(this, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = gf.f0.f5668d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != gf.f0.f5669e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fc, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = V(r0, new gf.t(w(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == gf.f0.f5670f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r0 != gf.f0.f5668d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r4 = E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if ((r4 instanceof gf.r1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if ((r4 instanceof gf.d1) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        r1 = w(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r5 = (gf.d1) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (C() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r5.isActive() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        r5 = V(r4, new gf.t(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (r5 == gf.f0.f5668d) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
    
        if (r5 == gf.f0.f5670f) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r6 = D(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r6 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
    
        r7 = new gf.r1(r6, r1);
        r8 = gf.t1.f5712x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        if (r8.compareAndSet(r9, r5, r7) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof gf.d1) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
    
        if (r8.get(r9) == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        O(r6, r1);
        r10 = gf.f0.f5668d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x005e, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:
    
        r10 = gf.f0.f5671g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0048, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0054, code lost:
    
        if (gf.r1.A.get((gf.r1) r4) != gf.f0.f5672h) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0056, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0059, code lost:
    
        if (r5 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005b, code lost:
    
        r10 = gf.f0.f5671g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x005d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0063, code lost:
    
        r5 = ((gf.r1) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof gf.r1) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006a, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006c, code lost:
    
        r1 = w(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0070, code lost:
    
        ((gf.r1) r4).a(r1);
        r10 = ((gf.r1) r4).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007d, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0080, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0081, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0083, code lost:
    
        O(((gf.r1) r4).f5698x, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x008a, code lost:
    
        r10 = gf.f0.f5668d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0058, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f5, code lost:
    
        if (r0 != gf.f0.f5668d) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fa, code lost:
    
        if (r0 != gf.f0.f5669e) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ff, code lost:
    
        if (r0 != gf.f0.f5671g) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0101, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0102, code lost:
    
        n(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((gf.r1) r0).e() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0105, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.t1.q(java.lang.Object):boolean");
    }

    public void r(CancellationException cancellationException) {
        q(cancellationException);
    }

    public final boolean s(Throwable th) {
        if (!J()) {
            boolean z10 = th instanceof CancellationException;
            n nVar = (n) f5713y.get(this);
            if (nVar != null && nVar != x1.f5725x) {
                if (!nVar.b(th) && !z10) {
                    return false;
                }
                return true;
            }
            return z10;
        }
        return true;
    }

    @Override // gf.j1
    public final boolean start() {
        int T;
        do {
            T = T(E());
            if (T == 0) {
                return false;
            }
        } while (T != 1);
        return true;
    }

    public String t() {
        return "Job was cancelled";
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(M() + '{' + U(E()) + '}');
        sb2.append('@');
        sb2.append(f0.p(this));
        return sb2.toString();
    }

    public boolean u(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (q(th) && B()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, a2.x0] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, a2.x0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [gf.t1, java.lang.Object] */
    public final void v(d1 d1Var, Object obj) {
        t tVar;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5713y;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        if (nVar != null) {
            nVar.d();
            atomicReferenceFieldUpdater.set(this, x1.f5725x);
        }
        ?? r12 = 0;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            th = tVar.f5710a;
        } else {
            th = null;
        }
        if (d1Var instanceof o1) {
            try {
                ((o1) d1Var).a(th);
                return;
            } catch (Throwable th2) {
                G(new RuntimeException("Exception in completion handler " + d1Var + " for " + ((Object) this), th2));
                return;
            }
        }
        v1 c10 = d1Var.c();
        if (c10 != null) {
            Object g10 = c10.g();
            kotlin.jvm.internal.k.c(g10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            mf.k kVar = (mf.k) g10;
            while (!kVar.equals(c10)) {
                if (kVar instanceof o1) {
                    o1 o1Var = (o1) kVar;
                    try {
                        o1Var.a(th);
                    } catch (Throwable th3) {
                        if (r12 != 0) {
                            he.a.a(r12, th3);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + o1Var + " for " + ((Object) this), th3);
                        }
                    }
                }
                kVar = kVar.h();
                r12 = r12;
            }
            if (r12 != 0) {
                G(r12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable w(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        t1 t1Var = (t1) ((z1) obj);
        Object E = t1Var.E();
        CancellationException cancellationException2 = null;
        if (E instanceof r1) {
            cancellationException = ((r1) E).b();
        } else if (E instanceof t) {
            cancellationException = ((t) E).f5710a;
        } else if (!(E instanceof d1)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + E).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new k1("Parent job is ".concat(U(E)), cancellationException, t1Var);
        }
        return cancellationException2;
    }

    public final Object x(r1 r1Var, Object obj) {
        t tVar;
        Throwable A;
        Object obj2;
        Throwable th = null;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            th = tVar.f5710a;
        }
        synchronized (r1Var) {
            r1Var.d();
            ArrayList f3 = r1Var.f(th);
            A = A(r1Var, f3);
            if (A != null && f3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f3.size()));
                int size = f3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj3 = f3.get(i6);
                    i6++;
                    Throwable th2 = (Throwable) obj3;
                    if (th2 != A && th2 != A && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        he.a.a(A, th2);
                    }
                }
            }
        }
        if (A != null && A != th) {
            obj = new t(A, false);
        }
        if (A != null && (s(A) || F(A))) {
            kotlin.jvm.internal.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            t.f5709b.compareAndSet((t) obj, 0, 1);
        }
        P(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5712x;
        if (obj instanceof d1) {
            obj2 = new e1((d1) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, r1Var, obj2) && atomicReferenceFieldUpdater.get(this) == r1Var) {
        }
        v(r1Var, obj);
        return obj;
    }

    @Override // gf.j1
    public final q0 y(ve.l lVar) {
        return I(false, true, new f1(lVar));
    }

    public final Object z() {
        Object E = E();
        if (!(E instanceof d1)) {
            if (!(E instanceof t)) {
                return f0.H(E);
            }
            throw ((t) E).f5710a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public void R() {
    }

    public void G(a2.x0 x0Var) {
        throw x0Var;
    }

    public void P(Object obj) {
    }

    public void n(Object obj) {
    }
}
