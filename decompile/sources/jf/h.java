package jf;

import gf.l2;
import j1.f0;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class h implements l {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final int f7452x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7450y = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7451z = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater B = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");

    public h(int i6) {
        long j;
        this.f7452x = i6;
        if (i6 >= 0) {
            p pVar = j.f7454a;
            if (i6 != 0) {
                if (i6 != Integer.MAX_VALUE) {
                    j = i6;
                } else {
                    j = Long.MAX_VALUE;
                }
            } else {
                j = 0;
            }
            this.bufferEnd$volatile = j;
            this.completedExpandBuffersAndPauseFlag$volatile = A.get(this);
            p pVar2 = new p(0L, null, this, 3);
            this.sendSegment$volatile = pVar2;
            this.receiveSegment$volatile = pVar2;
            if (z()) {
                pVar2 = j.f7454a;
                kotlin.jvm.internal.k.c(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = pVar2;
            this._closeCause$volatile = j.s;
            return;
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object C(jf.h r13, ne.c r14) {
        /*
            boolean r0 = r14 instanceof jf.f
            if (r0 == 0) goto L14
            r0 = r14
            jf.f r0 = (jf.f) r0
            int r1 = r0.f7446z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f7446z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            jf.f r0 = new jf.f
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f7444x
            int r0 = r6.f7446z
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            he.a.f(r14)
            jf.o r14 = (jf.o) r14
            java.lang.Object r13 = r14.f7476a
            return r13
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            he.a.f(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = jf.h.D
            java.lang.Object r14 = r14.get(r13)
            jf.p r14 = (jf.p) r14
        L3e:
            boolean r0 = r13.w()
            if (r0 == 0) goto L4e
            java.lang.Throwable r13 = r13.q()
            jf.m r14 = new jf.m
            r14.<init>(r13)
            return r14
        L4e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = jf.h.f7451z
            long r4 = r0.getAndIncrement(r13)
            int r0 = jf.j.f7455b
            long r2 = (long) r0
            long r7 = r4 / r2
            long r2 = r4 % r2
            int r3 = (int) r2
            long r9 = r14.f8877z
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L6b
            jf.p r0 = r13.p(r7, r14)
            if (r0 != 0) goto L69
            goto L3e
        L69:
            r2 = r0
            goto L6c
        L6b:
            r2 = r14
        L6c:
            r12 = 0
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.H(r8, r9, r10, r12)
            h5.a r14 = jf.j.f7465m
            if (r13 == r14) goto La0
            h5.a r14 = jf.j.f7467o
            if (r13 != r14) goto L8b
            long r13 = r7.t()
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 >= 0) goto L88
            r2.b()
        L88:
            r14 = r2
            r13 = r7
            goto L3e
        L8b:
            h5.a r14 = jf.j.f7466n
            if (r13 != r14) goto L9c
            r6.f7446z = r1
            r1 = r7
            java.lang.Object r13 = r1.D(r2, r3, r4, r6)
            me.a r14 = me.a.f8833x
            if (r13 != r14) goto L9b
            return r14
        L9b:
            return r13
        L9c:
            r2.b()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.C(jf.h, ne.c):java.lang.Object");
    }

    public static final p a(h hVar, long j, p pVar) {
        Object b10;
        h hVar2;
        p pVar2 = j.f7454a;
        i iVar = i.f7453x;
        loop0: while (true) {
            b10 = mf.a.b(pVar, j, iVar);
            if (!mf.a.e(b10)) {
                mf.u c10 = mf.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
                    mf.u uVar = (mf.u) atomicReferenceFieldUpdater.get(hVar);
                    if (uVar.f8877z >= c10.f8877z) {
                        break loop0;
                    }
                    if (!c10.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, uVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != uVar) {
                            if (c10.f()) {
                                c10.e();
                            }
                        }
                    }
                    if (uVar.f()) {
                        uVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean e10 = mf.a.e(b10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7451z;
        if (e10) {
            hVar.x();
            if (pVar.f8877z * j.f7455b < atomicLongFieldUpdater.get(hVar)) {
                pVar.b();
                return null;
            }
        } else {
            p pVar3 = (p) mf.a.c(b10);
            long j10 = pVar3.f8877z;
            if (j10 > j) {
                long j11 = j.f7455b * j10;
                while (true) {
                    long j12 = f7450y.get(hVar);
                    long j13 = 1152921504606846975L & j12;
                    if (j13 >= j11) {
                        hVar2 = hVar;
                        break;
                    }
                    hVar2 = hVar;
                    if (f7450y.compareAndSet(hVar2, j12, (((int) (j12 >> 60)) << 60) + j13)) {
                        break;
                    }
                    hVar = hVar2;
                }
                if (j10 * j.f7455b < atomicLongFieldUpdater.get(hVar2)) {
                    pVar3.b();
                }
            } else {
                return pVar3;
            }
        }
        return null;
    }

    public static final void e(h hVar, Object obj, gf.k kVar) {
        kVar.resumeWith(he.a.b(hVar.s()));
    }

    public static final int f(h hVar, p pVar, int i6, Object obj, long j, Object obj2, boolean z10) {
        pVar.n(i6, obj);
        if (z10) {
            return hVar.I(pVar, i6, obj, j, obj2, z10);
        }
        Object l10 = pVar.l(i6);
        if (l10 == null) {
            if (hVar.j(j)) {
                if (pVar.k(i6, null, j.f7457d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.k(i6, null, obj2)) {
                    return 2;
                }
            }
        } else if (l10 instanceof l2) {
            pVar.n(i6, null);
            if (hVar.F(l10, obj)) {
                pVar.o(i6, j.f7462i);
                return 0;
            }
            h5.a aVar = j.f7463k;
            if (pVar.C.getAndSet((i6 * 2) + 1, aVar) != aVar) {
                pVar.m(i6, true);
                return 5;
            }
            return 5;
        }
        return hVar.I(pVar, i6, obj, j, obj2, z10);
    }

    public static void u(h hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(long r6, jf.p r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.f8877z
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            mf.d r0 = r8.c()
            jf.p r0 = (jf.p) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.d()
            if (r6 == 0) goto L22
            mf.d r6 = r8.c()
            jf.p r6 = (jf.p) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = jf.h.E
            java.lang.Object r7 = r6.get(r5)
            mf.u r7 = (mf.u) r7
            long r0 = r7.f8877z
            long r2 = r8.f8877z
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r8.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r6.compareAndSet(r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.f()
            if (r6 == 0) goto L49
            r7.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r6.get(r5)
            if (r0 == r7) goto L3a
            boolean r6 = r8.f()
            if (r6 == 0) goto L22
            r8.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.A(long, jf.p):void");
    }

    public final Object B(Object obj, le.c cVar) {
        gf.k kVar = new gf.k(1, a8.c.i(cVar));
        kVar.s();
        kVar.resumeWith(he.a.b(s()));
        Object r10 = kVar.r();
        if (r10 == me.a.f8833x) {
            return r10;
        }
        return he.y.f6101a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(jf.p r14, int r15, long r16, ne.c r18) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.D(jf.p, int, long, ne.c):java.lang.Object");
    }

    public final void E(l2 l2Var, boolean z10) {
        Throwable s;
        if (l2Var instanceof gf.j) {
            le.c cVar = (le.c) l2Var;
            if (z10) {
                s = r();
            } else {
                s = s();
            }
            cVar.resumeWith(he.a.b(s));
            return;
        }
        if (l2Var instanceof w) {
            ((w) l2Var).f7481x.resumeWith(new o(new m(q())));
            return;
        }
        if (l2Var instanceof b) {
            b bVar = (b) l2Var;
            gf.k kVar = bVar.f7440y;
            kotlin.jvm.internal.k.b(kVar);
            bVar.f7440y = null;
            bVar.f7439x = j.f7464l;
            Throwable q9 = bVar.f7441z.q();
            if (q9 == null) {
                kVar.resumeWith(Boolean.FALSE);
                return;
            } else {
                kVar.resumeWith(he.a.b(q9));
                return;
            }
        }
        if (l2Var instanceof pf.f) {
            ((pf.e) ((pf.f) l2Var)).g(this, j.f7464l);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + l2Var).toString());
        }
    }

    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof pf.f) {
            return ((pf.e) ((pf.f) obj)).g(this, obj2);
        }
        if (obj instanceof w) {
            return j.a(((w) obj).f7481x, new o(obj2), null);
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            gf.k kVar = bVar.f7440y;
            kotlin.jvm.internal.k.b(kVar);
            bVar.f7440y = null;
            bVar.f7439x = obj2;
            return j.a(kVar, Boolean.TRUE, null);
        }
        if (obj instanceof gf.j) {
            return j.a((gf.j) obj, obj2, null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final boolean G(Object obj, p pVar, int i6) {
        pf.i iVar;
        boolean z10 = obj instanceof gf.j;
        he.y yVar = he.y.f6101a;
        if (z10) {
            return j.a((gf.j) obj, yVar, null);
        }
        if (obj instanceof pf.f) {
            int h4 = ((pf.e) obj).h(this, yVar);
            pf.i iVar2 = pf.i.f10779x;
            pf.i iVar3 = pf.i.f10780y;
            if (h4 != 0) {
                if (h4 != 1) {
                    if (h4 != 2) {
                        if (h4 == 3) {
                            iVar = pf.i.A;
                        } else {
                            throw new IllegalStateException(("Unexpected internal result: " + h4).toString());
                        }
                    } else {
                        iVar = pf.i.f10781z;
                    }
                } else {
                    iVar = iVar3;
                }
            } else {
                iVar = iVar2;
            }
            if (iVar == iVar3) {
                pVar.n(i6, null);
            }
            if (iVar == iVar2) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object H(p pVar, int i6, long j, Object obj) {
        Object l10 = pVar.l(i6);
        AtomicReferenceArray atomicReferenceArray = pVar.C;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7450y;
        if (l10 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.f7466n;
                }
                if (pVar.k(i6, l10, obj)) {
                    o();
                    return j.f7465m;
                }
            }
        } else if (l10 == j.f7457d && pVar.k(i6, l10, j.f7462i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i6 * 2);
            pVar.n(i6, null);
            return obj2;
        }
        while (true) {
            Object l11 = pVar.l(i6);
            if (l11 != null && l11 != j.f7458e) {
                if (l11 == j.f7457d) {
                    if (pVar.k(i6, l11, j.f7462i)) {
                        o();
                        Object obj3 = atomicReferenceArray.get(i6 * 2);
                        pVar.n(i6, null);
                        return obj3;
                    }
                } else {
                    h5.a aVar = j.j;
                    if (l11 == aVar) {
                        return j.f7467o;
                    }
                    if (l11 == j.f7461h) {
                        return j.f7467o;
                    }
                    if (l11 == j.f7464l) {
                        o();
                        return j.f7467o;
                    }
                    if (l11 != j.f7460g && pVar.k(i6, l11, j.f7459f)) {
                        boolean z10 = l11 instanceof z;
                        if (z10) {
                            l11 = ((z) l11).f7482a;
                        }
                        if (G(l11, pVar, i6)) {
                            pVar.o(i6, j.f7462i);
                            o();
                            Object obj4 = atomicReferenceArray.get(i6 * 2);
                            pVar.n(i6, null);
                            return obj4;
                        }
                        pVar.o(i6, aVar);
                        pVar.i();
                        if (z10) {
                            o();
                        }
                        return j.f7467o;
                    }
                }
            } else if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (pVar.k(i6, l11, j.f7461h)) {
                    o();
                    return j.f7467o;
                }
            } else {
                if (obj == null) {
                    return j.f7466n;
                }
                if (pVar.k(i6, l11, obj)) {
                    o();
                    return j.f7465m;
                }
            }
        }
    }

    public final int I(p pVar, int i6, Object obj, long j, Object obj2, boolean z10) {
        while (true) {
            Object l10 = pVar.l(i6);
            if (l10 == null) {
                if (j(j) && !z10) {
                    if (pVar.k(i6, null, j.f7457d)) {
                        break;
                    }
                } else if (z10) {
                    if (pVar.k(i6, null, j.j)) {
                        pVar.i();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (pVar.k(i6, null, obj2)) {
                        return 2;
                    }
                }
            } else if (l10 == j.f7458e) {
                if (pVar.k(i6, l10, j.f7457d)) {
                    break;
                }
            } else {
                h5.a aVar = j.f7463k;
                if (l10 == aVar) {
                    pVar.n(i6, null);
                    return 5;
                }
                if (l10 == j.f7461h) {
                    pVar.n(i6, null);
                    return 5;
                }
                if (l10 == j.f7464l) {
                    pVar.n(i6, null);
                    x();
                    return 4;
                }
                pVar.n(i6, null);
                if (l10 instanceof z) {
                    l10 = ((z) l10).f7482a;
                }
                if (F(l10, obj)) {
                    pVar.o(i6, j.f7462i);
                    return 0;
                }
                if (pVar.C.getAndSet((i6 * 2) + 1, aVar) != aVar) {
                    pVar.m(i6, true);
                }
                return 5;
            }
        }
        return 1;
    }

    public final void J(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z10;
        h hVar = this;
        if (!hVar.z()) {
            while (true) {
                atomicLongFieldUpdater = A;
                if (atomicLongFieldUpdater.get(hVar) > j) {
                    break;
                } else {
                    hVar = this;
                }
            }
            int i6 = j.f7456c;
            int i10 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = B;
                if (i10 < i6) {
                    long j10 = atomicLongFieldUpdater.get(hVar);
                    if (j10 != (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) || j10 != atomicLongFieldUpdater.get(hVar)) {
                        i10++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j11 = atomicLongFieldUpdater2.get(hVar);
                        if (atomicLongFieldUpdater2.compareAndSet(hVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        } else {
                            hVar = this;
                        }
                    }
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(hVar);
                        long j13 = atomicLongFieldUpdater2.get(hVar);
                        long j14 = j13 & 4611686018427387903L;
                        if ((j13 & 4611686018427387904L) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (j12 == j14 && j12 == atomicLongFieldUpdater.get(hVar)) {
                            break;
                        }
                        if (!z10) {
                            hVar = this;
                            atomicLongFieldUpdater2.compareAndSet(hVar, j13, 4611686018427387904L + j14);
                        } else {
                            hVar = this;
                        }
                    }
                    while (true) {
                        long j15 = atomicLongFieldUpdater2.get(hVar);
                        if (atomicLongFieldUpdater2.compareAndSet(hVar, j15, j15 & 4611686018427387903L)) {
                            return;
                        } else {
                            hVar = this;
                        }
                    }
                }
            }
        }
    }

    @Override // jf.x
    public final f0 b() {
        kotlin.jvm.internal.z.c(3, c.f7442x);
        kotlin.jvm.internal.z.c(3, d.f7443x);
        return new f0(this, (e) null);
    }

    @Override // jf.x
    public final Object c(lf.p pVar) {
        return C(this, pVar);
    }

    @Override // jf.x
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    @Override // jf.x
    public final Object g() {
        p pVar;
        l2 l2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7451z;
        long j = atomicLongFieldUpdater.get(this);
        long j10 = f7450y.get(this);
        if (v(true, j10)) {
            return new m(q());
        }
        long j11 = j10 & 1152921504606846975L;
        n nVar = o.f7475b;
        if (j >= j11) {
            return nVar;
        }
        Object obj = j.f7463k;
        p pVar2 = (p) D.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = j.f7455b;
            long j13 = andIncrement / j12;
            int i6 = (int) (andIncrement % j12);
            if (pVar2.f8877z != j13) {
                p p10 = p(j13, pVar2);
                if (p10 == null) {
                    continue;
                } else {
                    pVar = p10;
                }
            } else {
                pVar = pVar2;
            }
            Object H = H(pVar, i6, andIncrement, obj);
            p pVar3 = pVar;
            if (H == j.f7465m) {
                if (obj instanceof l2) {
                    l2Var = (l2) obj;
                } else {
                    l2Var = null;
                }
                if (l2Var != null) {
                    l2Var.b(pVar3, i6);
                }
                J(andIncrement);
                pVar3.i();
                return nVar;
            }
            if (H == j.f7467o) {
                if (andIncrement < t()) {
                    pVar3.b();
                }
                pVar2 = pVar3;
            } else {
                if (H != j.f7466n) {
                    pVar3.b();
                    return H;
                }
                throw new IllegalStateException("unexpected");
            }
        }
        return new m(q());
    }

    @Override // jf.y
    public Object h(Object obj) {
        boolean z10;
        l2 l2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7450y;
        long j = atomicLongFieldUpdater.get(this);
        boolean z11 = false;
        long j10 = 1152921504606846975L;
        if (v(false, j)) {
            z10 = false;
        } else {
            z10 = !j(j & 1152921504606846975L);
        }
        n nVar = o.f7475b;
        if (z10) {
            return nVar;
        }
        h5.f fVar = j.j;
        p pVar = (p) C.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & j10;
            boolean v10 = v(z11, andIncrement);
            int i6 = j.f7455b;
            long j12 = i6;
            long j13 = j11 / j12;
            int i10 = (int) (j11 % j12);
            if (pVar.f8877z != j13) {
                p a10 = a(this, j13, pVar);
                if (a10 == null) {
                    if (v10) {
                        return new m(s());
                    }
                    z11 = false;
                    j10 = 1152921504606846975L;
                } else {
                    pVar = a10;
                }
            }
            int f3 = f(this, pVar, i10, obj, j11, fVar, v10);
            he.y yVar = he.y.f6101a;
            if (f3 != 0) {
                if (f3 != 1) {
                    if (f3 != 2) {
                        if (f3 != 3) {
                            if (f3 != 4) {
                                if (f3 == 5) {
                                    pVar.b();
                                }
                                z11 = false;
                                j10 = 1152921504606846975L;
                            } else {
                                if (j11 < f7451z.get(this)) {
                                    pVar.b();
                                }
                                return new m(s());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else {
                        if (v10) {
                            pVar.i();
                            return new m(s());
                        }
                        if (fVar instanceof l2) {
                            l2Var = (l2) fVar;
                        } else {
                            l2Var = null;
                        }
                        if (l2Var != null) {
                            l2Var.b(pVar, i10 + i6);
                        }
                        pVar.i();
                        return nVar;
                    }
                } else {
                    return yVar;
                }
            } else {
                pVar.b();
                return yVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c7, code lost:
    
        e(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // jf.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.lang.Object r25, le.c r26) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.i(java.lang.Object, le.c):java.lang.Object");
    }

    @Override // jf.x
    public final b iterator() {
        return new b(this);
    }

    public final boolean j(long j) {
        if (j >= A.get(this) && j >= f7451z.get(this) + this.f7452x) {
            return false;
        }
        return true;
    }

    public final boolean k(Throwable th) {
        return l(th, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6.compareAndSet(r12, r5, r13) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r6.get(r12) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r14 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r3.compareAndSet(r4, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r13 = jf.h.G;
        r14 = r13.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r0 = jf.j.f7469q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r13.compareAndSet(r12, r14, r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r13.get(r12) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r14 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        kotlin.jvm.internal.z.c(1, r14);
        ((ve.l) r14).invoke(q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r0 = jf.j.f7470r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004c, code lost:
    
        r5 = r3.get(r12);
        r14 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r14 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r14 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r3.compareAndSet(r4, r5, (r7 << 60) + r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0024, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = jf.j.f7454a;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.compareAndSet(r4, r5, (r5 & 1152921504606846975L) + (1 << 60)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = jf.j.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r6 = jf.h.F;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.Throwable r13, boolean r14) {
        /*
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = jf.h.f7450y
            r9 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            jf.p r4 = jf.j.f7454a
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            h5.a r5 = jf.j.s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = jf.h.F
            boolean r7 = r6.compareAndSet(r12, r5, r13)
            if (r7 == 0) goto L31
            r10 = 1
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r13 = 0
            r10 = 0
        L39:
            r11 = 3
            if (r14 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r14 = (int) r13
            if (r14 == 0) goto L5e
            if (r14 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.x()
            if (r10 == 0) goto L98
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = jf.h.G
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            h5.a r0 = jf.j.f7469q
            goto L7b
        L79:
            h5.a r0 = jf.j.f7470r
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L91
            if (r14 != 0) goto L84
            goto L98
        L84:
            kotlin.jvm.internal.z.c(r9, r14)
            ve.l r14 = (ve.l) r14
            java.lang.Throwable r13 = r12.q()
            r14.invoke(r13)
            return r10
        L91:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.l(java.lang.Throwable, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008e, code lost:
    
        r1 = (jf.p) ((mf.d) mf.d.f8857y.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final jf.p m(long r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.m(long):jf.p");
    }

    public final void n(long j) {
        p pVar = (p) D.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7451z;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f7452x + j10, A.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = j.f7455b;
                long j12 = j10 / j11;
                int i6 = (int) (j10 % j11);
                if (pVar.f8877z != j12) {
                    p p10 = p(j12, pVar);
                    if (p10 != null) {
                        pVar = p10;
                    }
                }
                p pVar2 = pVar;
                if (H(pVar2, i6, j10, null) == j.f7467o) {
                    if (j10 < t()) {
                        pVar2.b();
                    }
                } else {
                    pVar2.b();
                }
                pVar = pVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bf, code lost:
    
        if ((r0.addAndGet(r16, r4 - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c8, code lost:
    
        if ((r0.get(r16) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.o():void");
    }

    public final p p(long j, p pVar) {
        Object b10;
        long j10;
        p pVar2 = j.f7454a;
        i iVar = i.f7453x;
        loop0: while (true) {
            b10 = mf.a.b(pVar, j, iVar);
            if (!mf.a.e(b10)) {
                mf.u c10 = mf.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                    mf.u uVar = (mf.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f8877z >= c10.f8877z) {
                        break loop0;
                    }
                    if (!c10.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (c10.f()) {
                                c10.e();
                            }
                        }
                    }
                    if (uVar.f()) {
                        uVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (mf.a.e(b10)) {
            x();
            if (pVar.f8877z * j.f7455b < t()) {
                pVar.b();
                return null;
            }
        } else {
            p pVar3 = (p) mf.a.c(b10);
            long j11 = pVar3.f8877z;
            if (!z() && j <= A.get(this) / j.f7455b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = E;
                    mf.u uVar2 = (mf.u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.f8877z >= j11) {
                        break;
                    }
                    if (!pVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, pVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                            if (pVar3.f()) {
                                pVar3.e();
                            }
                        }
                    }
                    if (uVar2.f()) {
                        uVar2.e();
                    }
                }
            }
            if (j11 > j) {
                long j12 = j11 * j.f7455b;
                do {
                    j10 = f7451z.get(this);
                    if (j10 >= j12) {
                        break;
                    }
                } while (!f7451z.compareAndSet(this, j10, j12));
                if (j11 * j.f7455b < t()) {
                    pVar3.b();
                }
            } else {
                return pVar3;
            }
        }
        return null;
    }

    public final Throwable q() {
        return (Throwable) F.get(this);
    }

    public final Throwable r() {
        Throwable q9 = q();
        if (q9 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return q9;
    }

    public final Throwable s() {
        Throwable q9 = q();
        if (q9 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return q9;
    }

    public final long t() {
        return f7450y.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c4, code lost:
    
        r3 = (jf.p) r3.c();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0166, code lost:
    
        jf.h.f7451z.compareAndSet(r14, r7, r7 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a5, code lost:
    
        r1 = (jf.p) ((mf.d) mf.d.f8857y.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(boolean r15, long r16) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.h.v(boolean, long):boolean");
    }

    public final boolean w() {
        return v(true, f7450y.get(this));
    }

    public final boolean x() {
        return v(false, f7450y.get(this));
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j = A.get(this);
        if (j != 0 && j != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }
}
