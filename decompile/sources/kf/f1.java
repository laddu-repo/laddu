package kf;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f1 extends lf.b implements r0, h, lf.r {
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "_state$volatile");
    public int B;
    private volatile /* synthetic */ Object _state$volatile;

    public f1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // lf.b
    public final lf.d b() {
        return new g1();
    }

    @Override // lf.b
    public final lf.d[] c() {
        return new g1[2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (r0.equals(r2) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
    
        if (r6 == r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r2 != r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x007e, code lost:
    
        if (((kf.i1) r0).a(r3) == r5) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0039, B:14:0x0096, B:16:0x009e, B:19:0x00a5, B:20:0x00a9, B:24:0x00ac, B:26:0x00cd, B:29:0x00dd, B:30:0x00f9, B:36:0x0109, B:32:0x0100, B:35:0x0106, B:45:0x00b2, B:48:0x00b9, B:56:0x0052, B:58:0x005d, B:59:0x0087), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0039, B:14:0x0096, B:16:0x009e, B:19:0x00a5, B:20:0x00a9, B:24:0x00ac, B:26:0x00cd, B:29:0x00dd, B:30:0x00f9, B:36:0x0109, B:32:0x0100, B:35:0x0106, B:45:0x00b2, B:48:0x00b9, B:56:0x0052, B:58:0x005d, B:59:0x0087), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00dc -> B:14:0x0096). Please report as a decompilation issue!!! */
    @Override // kf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(kf.i r18, le.c r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f1.collect(kf.i, le.c):java.lang.Object");
    }

    @Override // kf.q0, kf.i
    public final Object emit(Object obj, le.c cVar) {
        g(obj);
        return he.y.f6101a;
    }

    public final boolean f(Object obj, Object obj2) {
        h5.a aVar = lf.c.f8363b;
        if (obj == null) {
            obj = aVar;
        }
        if (obj2 == null) {
            obj2 = aVar;
        }
        return h(obj, obj2);
    }

    public final void g(Object obj) {
        if (obj == null) {
            obj = lf.c.f8363b;
        }
        h(null, obj);
    }

    @Override // kf.d1
    public final Object getValue() {
        h5.a aVar = lf.c.f8363b;
        Object obj = C.get(this);
        if (obj == aVar) {
            return null;
        }
        return obj;
    }

    public final boolean h(Object obj, Object obj2) {
        int i6;
        lf.d[] dVarArr;
        h5.a aVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.k.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.k.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.B;
            if ((i10 & 1) == 0) {
                int i11 = i10 + 1;
                this.B = i11;
                lf.d[] dVarArr2 = this.f8359x;
                while (true) {
                    g1[] g1VarArr = (g1[]) dVarArr2;
                    if (g1VarArr != null) {
                        for (g1 g1Var : g1VarArr) {
                            if (g1Var != null) {
                                AtomicReference atomicReference = g1Var.f7952a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (aVar = y0.f8038c)) {
                                        h5.a aVar2 = y0.f8037b;
                                        if (obj4 == aVar2) {
                                            while (!atomicReference.compareAndSet(obj4, aVar)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, aVar2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((gf.k) obj4).resumeWith(he.y.f6101a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i6 = this.B;
                        if (i6 == i11) {
                            this.B = i11 + 1;
                            return true;
                        }
                        dVarArr = this.f8359x;
                    }
                    dVarArr2 = dVarArr;
                    i11 = i6;
                }
            } else {
                this.B = i10 + 2;
                return true;
            }
        }
    }

    @Override // kf.q0
    public final void l() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kf.q0
    public final boolean m(Object obj) {
        g(obj);
        return true;
    }

    @Override // lf.r
    public final h r(le.h hVar, int i6, jf.a aVar) {
        if (((i6 >= 0 && i6 < 2) || i6 == -2) && aVar == jf.a.f7437y) {
            return this;
        }
        return y0.o(this, hVar, i6, aVar);
    }
}
