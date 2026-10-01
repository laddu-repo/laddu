package oe;

import com.google.android.gms.internal.measurement.ig;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import me.q1;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class c implements g {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10138v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10134w = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10135x = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10136y = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10137z = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");

    public c(int i) {
        this.f10138v = i;
        if (i < 0) {
            throw new IllegalArgumentException(d0.d.i(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f10139a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f10136y.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (u()) {
            kVar2 = e.f10139a;
            de.i.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f10155s;
    }

    public static final k a(c cVar, long j8, k kVar) {
        Object objB;
        c cVar2;
        k kVar2 = e.f10139a;
        d dVar = d.D;
        loop0: while (true) {
            objB = re.a.b(kVar, j8, dVar);
            if (!re.a.e(objB)) {
                re.r rVarC = re.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                    re.r rVar = (re.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f11400c >= rVarC.f11400c) {
                        break loop0;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                            if (rVarC.e()) {
                                rVarC.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = re.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10135x;
        if (zE) {
            cVar.j();
            if (kVar.f11400c * ((long) e.f10140b) < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) re.a.c(objB);
            long j9 = kVar3.f11400c;
            if (j9 <= j8) {
                return kVar3;
            }
            long j10 = ((long) e.f10140b) * j9;
            while (true) {
                long j11 = f10134w.get(cVar);
                long j12 = 1152921504606846975L & j11;
                if (j12 >= j10) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f10134w.compareAndSet(cVar2, j11, (((long) ((int) (j11 >> 60))) << 60) + j12)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j9 * ((long) e.f10140b) < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void b(c cVar, Object obj, me.h hVar) {
        hVar.g(fa.b.i(cVar.p()));
    }

    public static final int c(c cVar, k kVar, int i, Object obj, long j8, Object obj2, boolean z2) {
        kVar.m(i, obj);
        if (z2) {
            return cVar.B(kVar, i, obj, j8, obj2, z2);
        }
        Object objK = kVar.k(i);
        if (objK == null) {
            if (cVar.e(j8)) {
                if (kVar.j(i, null, e.f10142d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof q1) {
            kVar.m(i, null);
            if (cVar.y(objK, obj)) {
                kVar.n(i, e.i);
                return 0;
            }
            re.t tVar = e.f10147k;
            if (kVar.f.getAndSet((i * 2) + 1, tVar) == tVar) {
                return 5;
            }
            kVar.l(i, true);
            return 5;
        }
        return cVar.B(kVar, i, obj, j8, obj2, z2);
    }

    public static void r(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10137z;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (!(obj instanceof me.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        me.f fVar = (me.f) obj;
        k kVar = e.f10139a;
        re.t tVarK = fVar.k(od.l.f10126a, null);
        if (tVarK == null) {
            return false;
        }
        fVar.n(tVarK);
        return true;
    }

    public final Object A(k kVar, int i, long j8, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f;
        Object objK = kVar.k(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10134w;
        if (objK == null) {
            if (j8 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f10150n;
                }
                if (kVar.j(i, objK, obj)) {
                    l();
                    return e.f10149m;
                }
            }
        } else if (objK == e.f10142d && kVar.j(i, objK, e.i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i * 2);
            kVar.m(i, null);
            return obj2;
        }
        while (true) {
            Object objK2 = kVar.k(i);
            if (objK2 == null || objK2 == e.f10143e) {
                if (j8 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i, objK2, e.f10145h)) {
                        l();
                        return e.f10151o;
                    }
                } else {
                    if (obj == null) {
                        return e.f10150n;
                    }
                    if (kVar.j(i, objK2, obj)) {
                        l();
                        return e.f10149m;
                    }
                }
            } else if (objK2 != e.f10142d) {
                re.t tVar = e.f10146j;
                if (objK2 == tVar) {
                    return e.f10151o;
                }
                if (objK2 == e.f10145h) {
                    return e.f10151o;
                }
                if (objK2 == e.f10148l) {
                    l();
                    return e.f10151o;
                }
                if (objK2 != e.f10144g && kVar.j(i, objK2, e.f)) {
                    boolean z2 = objK2 instanceof t;
                    if (z2) {
                        objK2 = ((t) objK2).f10167a;
                    }
                    if (z(objK2)) {
                        kVar.n(i, e.i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        kVar.m(i, null);
                        return obj3;
                    }
                    kVar.n(i, tVar);
                    kVar.h();
                    if (z2) {
                        l();
                    }
                    return e.f10151o;
                }
            } else if (kVar.j(i, objK2, e.i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i * 2);
                kVar.m(i, null);
                return obj4;
            }
        }
    }

    public final int B(k kVar, int i, Object obj, long j8, Object obj2, boolean z2) {
        while (true) {
            Object objK = kVar.k(i);
            if (objK == null) {
                if (!e(j8) || z2) {
                    if (z2) {
                        if (kVar.j(i, null, e.f10146j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i, null, e.f10142d)) {
                    break;
                }
            } else {
                if (objK != e.f10143e) {
                    re.t tVar = e.f10147k;
                    if (objK == tVar) {
                        kVar.m(i, null);
                        return 5;
                    }
                    if (objK == e.f10145h) {
                        kVar.m(i, null);
                        return 5;
                    }
                    if (objK == e.f10148l) {
                        kVar.m(i, null);
                        j();
                        return 4;
                    }
                    kVar.m(i, null);
                    if (objK instanceof t) {
                        objK = ((t) objK).f10167a;
                    }
                    if (y(objK, obj)) {
                        kVar.n(i, e.i);
                        return 0;
                    }
                    if (kVar.f.getAndSet((i * 2) + 1, tVar) != tVar) {
                        kVar.l(i, true);
                    }
                    return 5;
                }
                if (kVar.j(i, objK, e.f10142d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void C(long j8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.u()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f10136y;
            if (atomicLongFieldUpdater.get(cVar) > j8) {
                break;
            } else {
                cVar = this;
            }
        }
        int i = e.f10141c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10137z;
            if (i10 < i) {
                long j9 = atomicLongFieldUpdater.get(cVar);
                if (j9 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j9 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j10, (j10 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(cVar);
                    long j12 = atomicLongFieldUpdater2.get(cVar);
                    long j13 = j12 & 4611686018427387903L;
                    boolean z2 = (j12 & 4611686018427387904L) != 0;
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z2) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j12, 4611686018427387904L + j13);
                    }
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j14, j14 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        b(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[RETURN] */
    @Override // oe.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.Object r23, sd.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.c.d(java.lang.Object, sd.c):java.lang.Object");
    }

    public final boolean e(long j8) {
        return j8 < f10136y.get(this) || j8 < f10135x.get(this) + ((long) this.f10138v);
    }

    public final boolean f(Throwable th, boolean z2) {
        c cVar;
        boolean z10;
        long j8;
        long j9;
        long j10;
        Object obj;
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10134w;
        if (!z2) {
            cVar = this;
            break;
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
            if (((int) (j12 >> 60)) != 0) {
                cVar = this;
                break;
            }
            k kVar = e.f10139a;
            cVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j12, (j12 & 1152921504606846975L) + (((long) 1) << 60)));
        re.t tVar = e.f10155s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, th)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                z10 = false;
                break;
            }
        }
        if (z2) {
            do {
                j11 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j11, (((long) 3) << 60) + (j11 & 1152921504606846975L)));
        } else {
            do {
                j8 = atomicLongFieldUpdater.get(this);
                int i = (int) (j8 >> 60);
                if (i == 0) {
                    j9 = j8 & 1152921504606846975L;
                    j10 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j9 = j8 & 1152921504606846975L;
                    j10 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j8, (j10 << 60) + j9));
        }
        j();
        if (z10) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = E;
                obj = atomicReferenceFieldUpdater2.get(this);
                re.t tVar2 = obj == null ? e.f10153q : e.f10154r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, tVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                de.s.a(1, obj);
                ((ce.l) obj).a(n());
                return z10;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (oe.k) ((re.b) re.b.f11375b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final oe.k g(long r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.c.g(long):oe.k");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // oe.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = oe.c.f10134w
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.s(r9, r1)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.e(r1)
            r1 = r1 ^ r10
        L1b:
            oe.i r13 = oe.j.f10160b
            if (r1 == 0) goto L20
            return r13
        L20:
            re.t r6 = oe.e.f10146j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = oe.c.A
            java.lang.Object r1 = r1.get(r15)
            oe.k r1 = (oe.k) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.s(r9, r2)
            int r14 = oe.e.f10140b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f11400c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            oe.k r3 = a(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.p()
            oe.h r2 = new oe.h
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = c(r0, r1, r2, r3, r4, r6, r7)
            od.l r3 = od.l.f10126a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.a()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = oe.c.f10135x
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r1 = r15.p()
            oe.h r2 = new oe.h
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.h()
            java.lang.Throwable r1 = r15.p()
            oe.h r2 = new oe.h
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof me.q1
            if (r3 == 0) goto Lb2
            me.q1 r6 = (me.q1) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.h()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.c.h(java.lang.Object):java.lang.Object");
    }

    @Override // oe.r
    public final void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final void j() {
        s(false, f10134w.get(this));
    }

    public final void k(long j8) {
        k kVar = (k) B.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10135x;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(((long) this.f10138v) + j9, f10136y.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, 1 + j9)) {
                long j10 = e.f10140b;
                long j11 = j9 / j10;
                int i = (int) (j9 % j10);
                if (kVar.f11400c != j11) {
                    k kVarM = m(j11, kVar);
                    if (kVarM != null) {
                        kVar = kVarM;
                    }
                }
                k kVar2 = kVar;
                if (A(kVar2, i, j9, null) != e.f10151o || j9 < q()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        r(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.c.l():void");
    }

    public final k m(long j8, k kVar) {
        Object objB;
        long j9;
        k kVar2 = e.f10139a;
        d dVar = d.D;
        loop0: while (true) {
            objB = re.a.b(kVar, j8, dVar);
            if (!re.a.e(objB)) {
                re.r rVarC = re.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                    re.r rVar = (re.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f11400c >= rVarC.f11400c) {
                        break loop0;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.e()) {
                                rVarC.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (re.a.e(objB)) {
            j();
            if (kVar.f11400c * ((long) e.f10140b) < q()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) re.a.c(objB);
            long j10 = kVar3.f11400c;
            if (!u() && j8 <= f10136y.get(this) / ((long) e.f10140b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C;
                    re.r rVar2 = (re.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f11400c >= j10 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (rVar2.e()) {
                        rVar2.d();
                    }
                }
            }
            if (j10 <= j8) {
                return kVar3;
            }
            long j11 = j10 * ((long) e.f10140b);
            do {
                j9 = f10135x.get(this);
                if (j9 >= j11) {
                    break;
                }
            } while (!f10135x.compareAndSet(this, j9, j11));
            if (j10 * ((long) e.f10140b) < q()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) D.get(this);
    }

    public final Throwable o() {
        Throwable thN = n();
        return thN == null ? new l("Channel was closed") : thN;
    }

    public final Throwable p() {
        Throwable thN = n();
        return thN == null ? new ig("Channel was closed") : thN;
    }

    public final long q() {
        return f10134w.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (oe.k) ((re.b) re.b.f11375b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(boolean r14, long r15) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.c.s(boolean, long):boolean");
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        r16 = r7;
        r3 = (oe.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.c.toString():java.lang.String");
    }

    public final boolean u() {
        long j8 = f10136y.get(this);
        return j8 == 0 || j8 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(long r5, oe.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f11400c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            re.b r0 = r7.b()
            oe.k r0 = (oe.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            re.b r5 = r7.b()
            oe.k r5 = (oe.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = oe.c.C
            java.lang.Object r6 = r5.get(r4)
            re.r r6 = (re.r) r6
            long r0 = r6.f11400c
            long r2 = r7.f11400c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.c.v(long, oe.k):void");
    }

    public final Object w(Object obj, sd.c cVar) throws Throwable {
        me.h hVar = new me.h(1, t1.h(cVar));
        hVar.v();
        hVar.g(fa.b.i(p()));
        Object objU = hVar.u();
        return objU == td.a.f12544v ? objU : od.l.f10126a;
    }

    public final void x(q1 q1Var, boolean z2) {
        if (q1Var instanceof me.f) {
            ((sd.c) q1Var).g(fa.b.i(z2 ? o() : p()));
            return;
        }
        if (!(q1Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + q1Var).toString());
        }
        b bVar = (b) q1Var;
        me.h hVar = bVar.f10132w;
        de.i.b(hVar);
        bVar.f10132w = null;
        bVar.f10131v = e.f10148l;
        Throwable thN = bVar.f10133x.n();
        if (thN == null) {
            hVar.g(Boolean.FALSE);
        } else {
            hVar.g(fa.b.i(thN));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof me.f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            me.f fVar = (me.f) obj;
            k kVar = e.f10139a;
            re.t tVarK = fVar.k(obj2, null);
            if (tVarK == null) {
                return false;
            }
            fVar.n(tVarK);
            return true;
        }
        b bVar = (b) obj;
        me.h hVar = bVar.f10132w;
        de.i.b(hVar);
        bVar.f10132w = null;
        bVar.f10131v = obj2;
        Boolean bool = Boolean.TRUE;
        k kVar2 = e.f10139a;
        re.t tVarK2 = hVar.k(bool, null);
        if (tVarK2 == null) {
            return false;
        }
        hVar.n(tVarK2);
        return true;
    }
}
