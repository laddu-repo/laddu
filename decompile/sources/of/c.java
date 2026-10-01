package of;

import gf.f0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import mf.s;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater E = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater F = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final h5.a H = new h5.a("NOT_IN_STACK", 1);
    public final String A;
    public final f B;
    public final f C;
    public final s D;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final int f10171x;

    /* renamed from: y, reason: collision with root package name */
    public final int f10172y;

    /* renamed from: z, reason: collision with root package name */
    public final long f10173z;

    /* JADX WARN: Type inference failed for: r4v10, types: [mf.l, of.f] */
    /* JADX WARN: Type inference failed for: r4v9, types: [mf.l, of.f] */
    public c(int i6, int i10, long j, String str) {
        this.f10171x = i6;
        this.f10172y = i10;
        this.f10173z = j;
        this.A = str;
        if (i6 >= 1) {
            if (i10 >= i6) {
                if (i10 <= 2097150) {
                    if (j > 0) {
                        this.B = new mf.l();
                        this.C = new mf.l();
                        this.D = new s((i6 + 1) * 2);
                        this.controlState$volatile = i6 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(h8.c.j(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(h8.c.l("Max pool size ", " should be greater than or equals to core pool size ", i10, i6).toString());
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Core pool size ", " should be at least 1").toString());
    }

    public static /* synthetic */ void l(c cVar, Runnable runnable, int i6) {
        boolean z10;
        o oVar = k.f10188g;
        if ((i6 & 4) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        cVar.f(runnable, oVar, z10);
    }

    public final boolean K() {
        h5.a aVar;
        int i6;
        while (true) {
            long j = E.get(this);
            a aVar2 = (a) this.D.b((int) (2097151 & j));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j10 = (2097152 + j) & (-2097152);
                Object c10 = aVar2.c();
                while (true) {
                    aVar = H;
                    if (c10 == aVar) {
                        i6 = -1;
                        break;
                    }
                    if (c10 == null) {
                        i6 = 0;
                        break;
                    }
                    a aVar3 = (a) c10;
                    i6 = aVar3.b();
                    if (i6 != 0) {
                        break;
                    }
                    c10 = aVar3.c();
                }
                if (i6 >= 0) {
                    if (E.compareAndSet(this, j, i6 | j10)) {
                        aVar2.g(aVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar2 == null) {
                return false;
            }
            if (a.F.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = of.c.G
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof of.a
            r3 = 0
            if (r1 == 0) goto L17
            of.a r0 = (of.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            of.c r1 = r0.E
            boolean r1 = kotlin.jvm.internal.k.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            mf.s r1 = r8.D
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = of.c.F     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r1)
            if (r2 > r5) goto L78
            r1 = 1
        L36:
            mf.s r4 = r8.D
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.k.b(r4)
            of.a r4 = (of.a) r4
            if (r4 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r4.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L43
        L54:
            of.m r4 = r4.f10165x
            of.f r6 = r8.C
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = of.m.f10191b
            java.lang.Object r7 = r7.getAndSet(r4, r3)
            of.i r7 = (of.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            of.i r7 = r4.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r5) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            of.f r1 = r8.C
            r1.b()
            of.f r1 = r8.B
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            of.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            of.f r1 = r8.B
            java.lang.Object r1 = r1.d()
            of.i r1 = (of.i) r1
            if (r1 != 0) goto Lb2
            of.f r1 = r8.C
            java.lang.Object r1 = r1.d()
            of.i r1 = (of.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            of.b r1 = of.b.B
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = of.c.E
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = of.c.F
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: of.c.close():void");
    }

    public final int d() {
        boolean z10;
        synchronized (this.D) {
            try {
                if (G.get(this) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = F;
                long j = atomicLongFieldUpdater.get(this);
                int i6 = (int) (j & 2097151);
                int i10 = i6 - ((int) ((j & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f10171x) {
                    return 0;
                }
                if (i6 >= this.f10172y) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 > 0 && this.D.b(i11) == null) {
                    a aVar = new a(this, i11);
                    this.D.c(i11, aVar);
                    if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i12 = i10 + 1;
                        aVar.start();
                        return i12;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        l(this, runnable, 6);
    }

    public final void f(Runnable runnable, o oVar, boolean z10) {
        i jVar;
        boolean z11;
        long j;
        a aVar;
        boolean a10;
        b bVar;
        k.f10187f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f10179x = nanoTime;
            jVar.f10180y = oVar;
        } else {
            jVar = new j(runnable, nanoTime, oVar);
        }
        boolean z12 = false;
        if (jVar.f10180y.f13330x == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = F;
        if (z11) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !kotlin.jvm.internal.k.a(aVar.E, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f10167z) != b.B && (jVar.f10180y.f13330x != 0 || bVar != b.f10169y)) {
            aVar.D = true;
            m mVar = aVar.f10165x;
            if (z10) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f10191b.getAndSet(mVar, jVar);
                if (iVar == null) {
                    jVar = null;
                } else {
                    jVar = mVar.a(iVar);
                }
            }
        }
        if (jVar != null) {
            if (jVar.f10180y.f13330x == 1) {
                a10 = this.C.a(jVar);
            } else {
                a10 = this.B.a(jVar);
            }
            if (!a10) {
                throw new RejectedExecutionException(r4.a.o(new StringBuilder(), this.A, " was terminated"));
            }
        }
        if (z10 && aVar != null) {
            z12 = true;
        }
        if (z11) {
            if (!z12 && !K() && !y(j)) {
                K();
                return;
            }
            return;
        }
        if (z12 || K() || y(atomicLongFieldUpdater.get(this))) {
            return;
        }
        K();
    }

    public final void m(a aVar, int i6, int i10) {
        while (true) {
            long j = E.get(this);
            int i11 = (int) (2097151 & j);
            long j10 = (2097152 + j) & (-2097152);
            if (i11 == i6) {
                if (i10 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == H) {
                            i11 = -1;
                            break;
                        }
                        if (c10 == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) c10;
                        i11 = aVar2.b();
                        if (i11 != 0) {
                            break;
                        } else {
                            c10 = aVar2.c();
                        }
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (E.compareAndSet(this, j, j10 | i11)) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        int i6;
        ArrayList arrayList = new ArrayList();
        s sVar = this.D;
        int a10 = sVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            a aVar = (a) sVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.f10165x;
                mVar.getClass();
                if (m.f10191b.get(mVar) != null) {
                    i6 = (m.f10192c.get(mVar) - m.f10193d.get(mVar)) + 1;
                } else {
                    i6 = m.f10192c.get(mVar) - m.f10193d.get(mVar);
                }
                int ordinal = aVar.f10167z.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i14++;
                                }
                            } else {
                                i13++;
                                if (i6 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i6);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        i11++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i6);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i10++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i6);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j = F.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.A);
        sb5.append('@');
        sb5.append(f0.p(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f10171x;
        sb5.append(i16);
        sb5.append(", max = ");
        sb5.append(this.f10172y);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i10);
        sb5.append(", blocking = ");
        sb5.append(i11);
        sb5.append(", parked = ");
        sb5.append(i12);
        sb5.append(", dormant = ");
        sb5.append(i13);
        sb5.append(", terminated = ");
        sb5.append(i14);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.B.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.C.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    public final boolean y(long j) {
        int i6 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i6 < 0) {
            i6 = 0;
        }
        int i10 = this.f10171x;
        if (i6 < i10) {
            int d10 = d();
            if (d10 == 1 && i10 > 1) {
                d();
            }
            if (d10 > 0) {
                return true;
            }
        }
        return false;
    }
}
