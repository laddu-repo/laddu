package ue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import me.q1;
import od.l;
import re.r;
import re.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class g {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12988v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final me.g f12989w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12985x = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f12986y = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12987z = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");

    public g(int i) {
        this.f12988v = i;
        if (i <= 0) {
            throw new IllegalArgumentException(d0.d.h(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(d0.d.h(i, "The number of acquired permits should be in 0..").toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = i;
        this.f12989w = new me.g(2, this);
    }

    public final boolean b(q1 q1Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12987z;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = A.getAndIncrement(this);
        e eVar = e.D;
        long j8 = andIncrement / ((long) i.f);
        loop0: while (true) {
            objB = re.a.b(jVar, j8, eVar);
            if (!re.a.e(objB)) {
                r rVarC = re.a.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
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
        j jVar2 = (j) re.a.c(objB);
        AtomicReferenceArray atomicReferenceArray = jVar2.f12995e;
        int i = (int) (andIncrement % ((long) i.f));
        while (!atomicReferenceArray.compareAndSet(i, null, q1Var)) {
            if (atomicReferenceArray.get(i) != null) {
                t tVar = i.f12991b;
                t tVar2 = i.f12992c;
                while (!atomicReferenceArray.compareAndSet(i, tVar, tVar2)) {
                    if (atomicReferenceArray.get(i) != tVar) {
                        return false;
                    }
                }
                ((me.f) q1Var).e(l.f10126a, this.f12989w);
                return true;
            }
        }
        q1Var.a(jVar2, i);
        return true;
    }

    public final void c() {
        int i;
        Object objB;
        boolean z2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = B;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f12988v;
            if (andIncrement >= i10) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12985x;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f12986y.getAndIncrement(this);
            long j8 = andIncrement2 / ((long) i.f);
            f fVar = f.D;
            while (true) {
                objB = re.a.b(jVar, j8, fVar);
                if (re.a.e(objB)) {
                    break;
                }
                r rVarC = re.a.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f11400c >= rVarC.f11400c) {
                        break;
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
            }
            j jVar2 = (j) re.a.c(objB);
            AtomicReferenceArray atomicReferenceArray = jVar2.f12995e;
            jVar2.a();
            z2 = false;
            if (jVar2.f11400c <= j8) {
                int i11 = (int) (andIncrement2 % ((long) i.f));
                Object andSet = atomicReferenceArray.getAndSet(i11, i.f12991b);
                if (andSet == null) {
                    int i12 = i.f12990a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (atomicReferenceArray.get(i11) == i.f12992c) {
                            z2 = true;
                            break;
                        }
                    }
                    t tVar = i.f12991b;
                    t tVar2 = i.f12993d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i11, tVar, tVar2)) {
                            if (atomicReferenceArray.get(i11) != tVar) {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = !z2;
                } else if (andSet != i.f12994e) {
                    if (!(andSet instanceof me.f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    me.f fVar2 = (me.f) andSet;
                    t tVarK = fVar2.k(l.f10126a, this.f12989w);
                    if (tVarK != null) {
                        fVar2.n(tVarK);
                        z2 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z2);
    }
}
