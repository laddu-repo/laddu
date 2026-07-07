package gf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class x0 extends y0 implements k0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(x0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // gf.k0
    public final void K(long j, k kVar) {
        long j10 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 1000000 * j;
            }
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            t0 t0Var = new t0(this, j10 + nanoTime, kVar);
            t0(nanoTime, t0Var);
            kVar.v(new h(t0Var, 2));
        }
    }

    public q0 S(long j, Runnable runnable, le.h hVar) {
        return h0.f5678a.S(j, runnable, hVar);
    }

    @Override // gf.y
    public final void f0(le.h hVar, Runnable runnable) {
        q0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cf, code lost:
    
        if (r3 == false) goto L89;
     */
    @Override // gf.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n0() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.x0.n0():long");
    }

    public void q0(Runnable runnable) {
        if (r0(runnable)) {
            Thread l02 = l0();
            if (Thread.currentThread() != l02) {
                LockSupport.unpark(l02);
                return;
            }
            return;
        }
        g0.F.q0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = gf.x0.C
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = gf.x0.E
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof mf.n
            if (r4 == 0) goto L47
            r4 = r1
            mf.n r4 = (mf.n) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            mf.n r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            h5.a r4 = gf.f0.f5667c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            mf.n r3 = new mf.n
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.x0.r0(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0 == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s0() {
        /*
            r7 = this;
            ie.h r0 = r7.A
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = 1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = gf.x0.D
            java.lang.Object r0 = r0.get(r7)
            gf.w0 r0 = (gf.w0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = mf.a0.f8848b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = gf.x0.C
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof mf.n
            if (r3 == 0) goto L4f
            mf.n r0 = (mf.n) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = mf.n.f8869f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r4 = (int) r3
            if (r0 != r4) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            h5.a r3 = gf.f0.f5667c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.x0.s0():boolean");
    }

    @Override // gf.y0
    public void shutdown() {
        v0 v0Var;
        d2.f5658a.set(null);
        E.set(this, 1);
        h5.a aVar = f0.f5667c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else {
                if (obj instanceof mf.n) {
                    ((mf.n) obj).b();
                    break;
                }
                if (obj != aVar) {
                    mf.n nVar = new mf.n(8, true);
                    nVar.a((Runnable) obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        do {
        } while (n0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            w0 w0Var = (w0) D.get(this);
            if (w0Var != null) {
                synchronized (w0Var) {
                    if (mf.a0.f8848b.get(w0Var) > 0) {
                        v0Var = w0Var.d(0);
                    } else {
                        v0Var = null;
                    }
                }
                if (v0Var != null) {
                    p0(nanoTime, v0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [gf.w0, java.lang.Object] */
    public final void t0(long j, v0 v0Var) {
        int c10;
        Thread l02;
        int i6 = E.get(this);
        v0 v0Var2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
        if (i6 != 0) {
            c10 = 1;
        } else {
            w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
            if (w0Var == null) {
                ?? obj = new Object();
                obj.f5721c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.k.b(obj2);
                w0Var = (w0) obj2;
            }
            c10 = v0Var.c(j, w0Var, this);
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            } else {
                p0(j, v0Var);
                return;
            }
        }
        w0 w0Var2 = (w0) atomicReferenceFieldUpdater.get(this);
        if (w0Var2 != null) {
            v0Var2 = w0Var2.b();
        }
        if (v0Var2 == v0Var && Thread.currentThread() != (l02 = l0())) {
            LockSupport.unpark(l02);
        }
    }
}
