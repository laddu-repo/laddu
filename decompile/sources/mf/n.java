package mf;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8868e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8869f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final h5.a f8870g = new h5.a("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f8871a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8872b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8873c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f8874d;

    public n(int i6, boolean z10) {
        this.f8871a = i6;
        this.f8872b = z10;
        int i10 = i6 - 1;
        this.f8873c = i10;
        this.f8874d = new AtomicReferenceArray(i6);
        if (i10 <= 1073741823) {
            if ((i6 & i10) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8869f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                if ((2305843009213693952L & j) != 0) {
                    return 2;
                }
                return 1;
            }
            int i6 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            int i11 = this.f8873c;
            if (((i10 + 2) & i11) != (i6 & i11)) {
                boolean z10 = this.f8872b;
                AtomicReferenceArray atomicReferenceArray = this.f8874d;
                if (!z10 && atomicReferenceArray.get(i10 & i11) != null) {
                    int i12 = this.f8871a;
                    if (i12 < 1024 || ((i10 - i6) & 1073741823) > (i12 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f8869f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i10 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i10 & i11, obj);
                        n nVar = this;
                        while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = nVar.f8874d;
                            int i13 = nVar.f8873c & i10;
                            Object obj2 = atomicReferenceArray2.get(i13);
                            if ((obj2 instanceof m) && ((m) obj2).f8867a == i10) {
                                atomicReferenceArray2.set(i13, obj);
                            } else {
                                nVar = null;
                            }
                            if (nVar == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f8869f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f8869f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j10 = 1152921504606846976L | j;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j, j10)) {
                j = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8868e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f8871a * 2, nVar.f8872b);
            int i6 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i11 = nVar.f8873c;
                int i12 = i6 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = nVar.f8874d.get(i12);
                if (obj == null) {
                    obj = new m(i6);
                }
                nVar3.f8874d.set(nVar3.f8873c & i6, obj);
                i6++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8869f;
            long j = atomicLongFieldUpdater.get(nVar);
            if ((j & 1152921504606846976L) != 0) {
                return f8870g;
            }
            int i6 = (int) (j & 1073741823);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            int i11 = nVar.f8873c;
            int i12 = i6 & i11;
            if ((i10 & i11) == i12) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f8874d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z10 = nVar.f8872b;
            if (obj == null) {
                if (z10) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j10 = (i6 + 1) & 1073741823;
                if (f8869f.compareAndSet(nVar, j, (j & (-1073741824)) | j10)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                }
                nVar = this;
                if (z10) {
                    while (true) {
                        long j11 = atomicLongFieldUpdater.get(nVar);
                        int i13 = (int) (j11 & 1073741823);
                        if ((j11 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            if (f8869f.compareAndSet(nVar2, j11, (j11 & (-1073741824)) | j10)) {
                                nVar2.f8874d.set(i13 & nVar2.f8873c, null);
                                nVar = null;
                            } else {
                                nVar = nVar2;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
