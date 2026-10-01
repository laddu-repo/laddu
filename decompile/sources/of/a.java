package of;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public long A;
    public long B;
    public int C;
    public boolean D;
    public final /* synthetic */ c E;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final m f10165x;

    /* renamed from: y, reason: collision with root package name */
    public final w f10166y;

    /* renamed from: z, reason: collision with root package name */
    public b f10167z;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.jvm.internal.w] */
    public a(c cVar, int i6) {
        this.E = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f10165x = new m();
        this.f10166y = new Object();
        this.f10167z = b.A;
        this.nextParkedWorker = c.H;
        int nanoTime = (int) System.nanoTime();
        this.C = nanoTime == 0 ? 42 : nanoTime;
        f(i6);
    }

    public final i a(boolean z10) {
        i e10;
        i e11;
        long j;
        b bVar = this.f10167z;
        c cVar = this.E;
        i iVar = null;
        boolean z11 = true;
        m mVar = this.f10165x;
        b bVar2 = b.f10168x;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.F;
            do {
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f10191b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || iVar2.f10180y.f13330x != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                break;
                            }
                        }
                        iVar = iVar2;
                    }
                    int i6 = m.f10193d.get(mVar);
                    int i10 = m.f10192c.get(mVar);
                    while (true) {
                        if (i6 == i10 || m.f10194e.get(mVar) == 0) {
                            break;
                        }
                        i10--;
                        i c10 = mVar.c(i10, true);
                        if (c10 != null) {
                            iVar = c10;
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar.C.d();
                        if (iVar3 == null) {
                            return i(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.F.compareAndSet(cVar, j, j - 4398046511104L));
            this.f10167z = bVar2;
        }
        if (z10) {
            if (d(cVar.f10171x * 2) != 0) {
                z11 = false;
            }
            if (z11 && (e11 = e()) != null) {
                return e11;
            }
            mVar.getClass();
            i iVar4 = (i) m.f10191b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z11 && (e10 = e()) != null) {
                return e10;
            }
        } else {
            i e12 = e();
            if (e12 != null) {
                return e12;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i6) {
        int i10 = this.C;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.C = i13;
        int i14 = i6 - 1;
        if ((i14 & i6) == 0) {
            return i13 & i14;
        }
        return (i13 & Integer.MAX_VALUE) % i6;
    }

    public final i e() {
        int d10 = d(2);
        c cVar = this.E;
        if (d10 == 0) {
            i iVar = (i) cVar.B.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.C.d();
        }
        i iVar2 = (i) cVar.C.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.B.d();
    }

    public final void f(int i6) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.E.A);
        sb2.append("-worker-");
        if (i6 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i6);
        }
        sb2.append(valueOf);
        setName(sb2.toString());
        this.indexInArray = i6;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        boolean z10;
        b bVar2 = this.f10167z;
        if (bVar2 == b.f10168x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.F.addAndGet(this.E, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f10167z = bVar;
        }
        return z10;
    }

    public final i i(int i6) {
        boolean z10;
        long j;
        i iVar;
        long j10;
        long j11;
        i iVar2;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.F;
        c cVar = this.E;
        int i11 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i11 < 2) {
            return null;
        }
        int d10 = d(i11);
        int i12 = 0;
        long j12 = Long.MAX_VALUE;
        while (i12 < i11) {
            d10++;
            if (d10 > i11) {
                d10 = 1;
            }
            a aVar = (a) cVar.D.b(d10);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f10165x;
                if (i6 == 3) {
                    iVar = mVar.b();
                    j = 0;
                } else {
                    mVar.getClass();
                    int i13 = m.f10193d.get(mVar);
                    int i14 = m.f10192c.get(mVar);
                    if (i6 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (true) {
                        if (i13 != i14) {
                            j = 0;
                            if (!z10 || m.f10194e.get(mVar) != 0) {
                                int i15 = i13 + 1;
                                iVar = mVar.c(i13, z10);
                                if (iVar != null) {
                                    break;
                                }
                                i13 = i15;
                            } else {
                                break;
                            }
                        } else {
                            j = 0;
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                w wVar = this.f10166y;
                if (iVar != null) {
                    wVar.f8055x = iVar;
                    iVar2 = iVar3;
                    j11 = -1;
                    j10 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f10191b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j10 = -1;
                            break;
                        }
                        j10 = -1;
                        if (iVar4.f10180y.f13330x == 1) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        if ((i10 & i6) == 0) {
                            break;
                        }
                        k.f10187f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f10179x;
                        long j13 = k.f10183b;
                        if (nanoTime < j13) {
                            j11 = j13 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                wVar.f8055x = iVar4;
                                j11 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j11 = -2;
                    iVar2 = iVar3;
                }
                if (j11 == j10) {
                    i iVar5 = (i) wVar.f8055x;
                    wVar.f8055x = iVar2;
                    return iVar5;
                }
                if (j11 > j) {
                    j12 = Math.min(j12, j11);
                }
            }
            i12++;
            iVar3 = null;
        }
        if (j12 == Long.MAX_VALUE) {
            j12 = 0;
        }
        this.B = j12;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: of.a.run():void");
    }
}
