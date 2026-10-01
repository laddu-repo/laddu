package te;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import me.x;
import re.p;
import re.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater C = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater D = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final t F = new t(0, "NOT_IN_STACK");
    public final f A;
    public final p B;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f12558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f12559y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f12560z;

    public c(int i, int i10, long j8, String str) {
        this.f12556v = i;
        this.f12557w = i10;
        this.f12558x = j8;
        this.f12559y = str;
        if (i < 1) {
            throw new IllegalArgumentException(d0.d.i(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i10 < i) {
            throw new IllegalArgumentException(j4.a.k(i10, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(d0.d.i(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j8 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
        }
        this.f12560z = new f();
        this.A = new f();
        this.B = new p((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public final boolean A() {
        t tVar;
        int iB;
        while (true) {
            long j8 = C.get(this);
            a aVar = (a) this.B.b((int) (2097151 & j8));
            if (aVar == null) {
                aVar = null;
            } else {
                long j9 = (2097152 + j8) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    tVar = F;
                    if (objC == tVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (C.compareAndSet(this, j8, ((long) iB) | j9)) {
                        aVar.g(tVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.D.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final int a() {
        synchronized (this.B) {
            try {
                if (E.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = D;
                long j8 = atomicLongFieldUpdater.get(this);
                int i = (int) (j8 & 2097151);
                int i10 = i - ((int) ((j8 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f12556v) {
                    return 0;
                }
                if (i >= this.f12557w) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.B.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i11);
                this.B.c(i11, aVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                aVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = te.c.E
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof te.a
            r3 = 0
            if (r1 == 0) goto L17
            te.a r0 = (te.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            te.c r1 = r0.C
            boolean r1 = de.i.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            re.p r1 = r8.B
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = te.c.D     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            re.p r5 = r8.B
            java.lang.Object r5 = r5.b(r1)
            de.i.b(r5)
            te.a r5 = (te.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            te.m r5 = r5.f12546v
            te.f r6 = r8.A
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = te.m.f12575b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            te.i r7 = (te.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            te.i r7 = r5.a()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            te.f r1 = r8.A
            r1.b()
            te.f r1 = r8.f12560z
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            te.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            te.f r1 = r8.f12560z
            java.lang.Object r1 = r1.d()
            te.i r1 = (te.i) r1
            if (r1 != 0) goto Lb2
            te.f r1 = r8.A
            java.lang.Object r1 = r1.d()
            te.i r1 = (te.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            te.b r1 = te.b.f12555z
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = te.c.C
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = te.c.D
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
        throw new UnsupportedOperationException("Method not decompiled: te.c.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(runnable, false);
    }

    public final void i(Runnable runnable, boolean z2) {
        i jVar;
        b bVar;
        k.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f12566v = jNanoTime;
            jVar.f12567w = z2;
        } else {
            jVar = new j(runnable, jNanoTime, z2);
        }
        boolean z10 = jVar.f12567w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = D;
        long jAddAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !de.i.a(aVar.C, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f12548x) != b.f12555z && (jVar.f12567w || bVar != b.f12552w)) {
            aVar.B = true;
            m mVar = aVar.f12546v;
            mVar.getClass();
            jVar = (i) m.f12575b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f12579a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f12576c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.f12577d.get(mVar) != 127) {
                    if (jVar.f12567w) {
                        m.f12578e.incrementAndGet(mVar);
                    }
                    int i = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (!(jVar.f12567w ? this.A.a(jVar) : this.f12560z.a(jVar))) {
                throw new RejectedExecutionException(j4.a.n(new StringBuilder(), this.f12559y, " was terminated"));
            }
        }
        if (z10) {
            if (A() || m(jAddAndGet)) {
                return;
            }
            A();
            return;
        }
        if (A() || m(atomicLongFieldUpdater.get(this))) {
            return;
        }
        A();
    }

    public final void l(a aVar, int i, int i10) {
        while (true) {
            long j8 = C.get(this);
            int i11 = (int) (2097151 & j8);
            long j9 = (2097152 + j8) & (-2097152);
            if (i11 == i) {
                if (i10 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == F) {
                            i11 = -1;
                            break;
                        }
                        if (objC == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i11 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (C.compareAndSet(this, j8, ((long) i11) | j9)) {
                    return;
                }
            }
        }
    }

    public final boolean m(long j8) {
        int i = ((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i10 = this.f12556v;
        if (i < i10) {
            int iA = a();
            if (iA == 1 && i10 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.B;
        int iA = pVar.a();
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iA; i14++) {
            a aVar = (a) pVar.b(i14);
            if (aVar != null) {
                m mVar = aVar.f12546v;
                mVar.getClass();
                int i15 = m.f12575b.get(mVar) != null ? (m.f12576c.get(mVar) - m.f12577d.get(mVar)) + 1 : m.f12576c.get(mVar) - m.f12577d.get(mVar);
                int iOrdinal = aVar.f12548x.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i11++;
                } else if (iOrdinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new a5.d();
                    }
                    i13++;
                }
            }
        }
        long j8 = D.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f12559y);
        sb5.append('@');
        sb5.append(x.g(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f12556v;
        sb5.append(i16);
        sb5.append(", max = ");
        sb5.append(this.f12557w);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i);
        sb5.append(", blocking = ");
        sb5.append(i10);
        sb5.append(", parked = ");
        sb5.append(i11);
        sb5.append(", dormant = ");
        sb5.append(i12);
        sb5.append(", terminated = ");
        sb5.append(i13);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f12560z.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.A.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j8));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j8) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j8 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
