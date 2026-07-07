package me;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends o0 implements b0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(n0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0() {
        /*
            r7 = this;
            pd.h r0 = r7.f8720z
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = me.n0.C
            java.lang.Object r0 = r0.get(r7)
            me.m0 r0 = (me.m0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = re.x.f11409b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = me.n0.B
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof re.m
            if (r3 == 0) goto L4f
            re.m r0 = (re.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = re.m.f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            re.t r3 = me.x.f8744c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: me.n0.A0():boolean");
    }

    public final void B0(long j8, l0 l0Var) {
        int iD;
        Thread threadS0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
        if (D.get(this) != 0) {
            iD = 1;
        } else {
            m0 m0Var = (m0) atomicReferenceFieldUpdater.get(this);
            if (m0Var == null) {
                m0 m0Var2 = new m0();
                m0Var2.f8710c = j8;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, m0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                de.i.b(obj);
                m0Var = (m0) obj;
            }
            iD = l0Var.d(j8, m0Var, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                w0(j8, l0Var);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        m0 m0Var3 = (m0) atomicReferenceFieldUpdater.get(this);
        if (m0Var3 != null) {
            synchronized (m0Var3) {
                l0[] l0VarArr = m0Var3.f11410a;
                l0Var = l0VarArr != null ? l0VarArr[0] : null;
            }
        }
        if (l0Var != l0Var || Thread.currentThread() == (threadS0 = s0())) {
            return;
        }
        LockSupport.unpark(threadS0);
    }

    @Override // me.b0
    public final void D(long j8, h hVar) {
        long j9 = j8 > 0 ? j8 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j8 : 0L;
        if (j9 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            j0 j0Var = new j0(this, j9 + jNanoTime, hVar);
            B0(jNanoTime, j0Var);
            hVar.x(new e(2, j0Var));
        }
    }

    @Override // me.b0
    public h0 G(long j8, m1 m1Var, sd.h hVar) {
        return z.f8751a.G(j8, m1Var, hVar);
    }

    @Override // me.s
    public final void o0(sd.h hVar, Runnable runnable) {
        x0(runnable);
    }

    @Override // me.o0
    public void shutdown() {
        l0 l0VarC;
        j1.f8703a.set(null);
        D.set(this, 1);
        re.t tVar = x.f8744c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof re.m)) {
                    if (obj != tVar) {
                        re.m mVar = new re.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((re.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (u0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            m0 m0Var = (m0) C.get(this);
            if (m0Var == null) {
                return;
            }
            synchronized (m0Var) {
                l0VarC = re.x.f11409b.get(m0Var) > 0 ? m0Var.c(0) : null;
            }
            if (l0VarC == null) {
                return;
            } else {
                w0(jNanoTime, l0VarC);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // me.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u0() {
        /*
            r10 = this;
            re.t r0 = me.x.f8744c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = me.n0.B
            boolean r2 = r10.v0()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.y0()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof re.m
            if (r6 == 0) goto L3e
            r6 = r2
            re.m r6 = (re.m) r6
            java.lang.Object r7 = r6.d()
            re.t r8 = re.m.f11391g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            re.m r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            pd.h r2 = r10.f8720z
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof re.m
            if (r2 == 0) goto L8d
            re.m r1 = (re.m) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = re.m.f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = me.n0.C
            java.lang.Object r0 = r0.get(r10)
            me.m0 r0 = (me.m0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            me.l0[] r1 = r0.f11410a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f8707v
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.n0.u0():long");
    }

    public void x0(Runnable runnable) {
        y0();
        if (!z0(runnable)) {
            y.E.x0(runnable);
            return;
        }
        Thread threadS0 = s0();
        if (Thread.currentThread() != threadS0) {
            LockSupport.unpark(threadS0);
        }
    }

    public final void y0() {
        l0 l0VarC;
        m0 m0Var = (m0) C.get(this);
        if (m0Var == null || re.x.f11409b.get(m0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (m0Var) {
                try {
                    l0[] l0VarArr = m0Var.f11410a;
                    l0 l0Var = l0VarArr != null ? l0VarArr[0] : null;
                    if (l0Var != null) {
                        l0VarC = ((jNanoTime - l0Var.f8707v) > 0L ? 1 : ((jNanoTime - l0Var.f8707v) == 0L ? 0 : -1)) >= 0 ? z0(l0Var) : false ? m0Var.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (l0VarC != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = me.n0.B
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = me.n0.D
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
            boolean r4 = r1 instanceof re.m
            if (r4 == 0) goto L47
            r4 = r1
            re.m r4 = (re.m) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            re.m r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            re.t r4 = me.x.f8744c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            re.m r3 = new re.m
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
        throw new UnsupportedOperationException("Method not decompiled: me.n0.z0(java.lang.Runnable):boolean");
    }
}
