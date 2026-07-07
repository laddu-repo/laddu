package qf;

import b1.r;
import gf.l2;
import he.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mf.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class i implements f {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final int f11219x;

    /* renamed from: y, reason: collision with root package name */
    public final r f11220y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11218z = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater C = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");

    public i(int i6) {
        this.f11219x = i6;
        if (i6 > 0) {
            if (i6 >= 0) {
                k kVar = new k(0L, null, 2);
                this.head$volatile = kVar;
                this.tail$volatile = kVar;
                this._availablePermits$volatile = i6;
                this.f11220y = new r(this, 3);
                return;
            }
            throw new IllegalArgumentException(h8.c.i(i6, "The number of acquired permits should be in 0..").toString());
        }
        throw new IllegalArgumentException(h8.c.i(i6, "Semaphore should have at least 1 permit, but had ").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        r5.e(r4.f11220y, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ne.c r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = qf.i.D
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f11219x
            if (r1 > r2) goto L0
            he.y r3 = he.y.f6101a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            le.c r5 = a8.c.i(r5)
            gf.k r5 = gf.f0.r(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            b1.r r0 = r4.f11220y     // Catch: java.lang.Throwable -> L3f
            r5.e(r0, r3)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.r()
            me.a r0 = me.a.f8833x
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.i.a(ne.c):java.lang.Object");
    }

    public final boolean b(l2 l2Var) {
        Object b10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = C.getAndIncrement(this);
        g gVar = g.f11216x;
        long j = andIncrement / j.f11226f;
        loop0: while (true) {
            b10 = mf.a.b(kVar, j, gVar);
            if (!mf.a.e(b10)) {
                u c10 = mf.a.c(b10);
                while (true) {
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
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
        k kVar2 = (k) mf.a.c(b10);
        AtomicReferenceArray atomicReferenceArray = kVar2.B;
        int i6 = (int) (andIncrement % j.f11226f);
        while (!atomicReferenceArray.compareAndSet(i6, null, l2Var)) {
            if (atomicReferenceArray.get(i6) != null) {
                h5.a aVar = j.f11222b;
                h5.a aVar2 = j.f11223c;
                while (!atomicReferenceArray.compareAndSet(i6, aVar, aVar2)) {
                    if (atomicReferenceArray.get(i6) != aVar) {
                        return false;
                    }
                }
                ((gf.j) l2Var).e(this.f11220y, y.f6101a);
                return true;
            }
        }
        l2Var.b(kVar2, i6);
        return true;
    }

    public final void c() {
        int i6;
        Object b10;
        boolean z10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f11219x;
            if (andIncrement < i10) {
                if (andIncrement < 0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11218z;
                    k kVar = (k) atomicReferenceFieldUpdater.get(this);
                    long andIncrement2 = A.getAndIncrement(this);
                    long j = andIncrement2 / j.f11226f;
                    h hVar = h.f11217x;
                    while (true) {
                        b10 = mf.a.b(kVar, j, hVar);
                        if (mf.a.e(b10)) {
                            break;
                        }
                        u c10 = mf.a.c(b10);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f8877z >= c10.f8877z) {
                                break;
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
                    }
                    k kVar2 = (k) mf.a.c(b10);
                    AtomicReferenceArray atomicReferenceArray = kVar2.B;
                    kVar2.b();
                    long j10 = kVar2.f8877z;
                    z10 = false;
                    if (j10 <= j) {
                        int i11 = (int) (andIncrement2 % j.f11226f);
                        Object andSet = atomicReferenceArray.getAndSet(i11, j.f11222b);
                        if (andSet == null) {
                            int i12 = j.f11221a;
                            for (int i13 = 0; i13 < i12; i13++) {
                                if (atomicReferenceArray.get(i11) == j.f11223c) {
                                    z10 = true;
                                    break;
                                }
                            }
                            h5.a aVar = j.f11222b;
                            h5.a aVar2 = j.f11224d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i11, aVar, aVar2)) {
                                    z10 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i11) != aVar) {
                                    break;
                                }
                            }
                            z10 = !z10;
                        } else if (andSet != j.f11225e) {
                            boolean z11 = andSet instanceof gf.j;
                            y yVar = y.f6101a;
                            if (z11) {
                                gf.j jVar = (gf.j) andSet;
                                h5.a a10 = jVar.a(this.f11220y, yVar);
                                if (a10 != null) {
                                    jVar.j(a10);
                                    z10 = true;
                                    break;
                                    break;
                                }
                            } else if (andSet instanceof pf.f) {
                                z10 = ((pf.e) ((pf.f) andSet)).g(this, yVar);
                            } else {
                                throw new IllegalStateException(("unexpected: " + andSet).toString());
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                do {
                    i6 = atomicIntegerFieldUpdater.get(this);
                    if (i6 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
        } while (!z10);
    }
}
