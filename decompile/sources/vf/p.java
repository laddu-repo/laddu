package vf;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f13639a = new o(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f13641c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f13640b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f13641c = atomicReferenceArr;
    }

    public static final void a(o oVar) {
        de.i.e(oVar, "segment");
        if (oVar.f != null || oVar.f13638g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (oVar.f13636d) {
            return;
        }
        AtomicReference atomicReference = f13641c[(int) (Thread.currentThread().getId() & (((long) f13640b) - 1))];
        o oVar2 = f13639a;
        o oVar3 = (o) atomicReference.getAndSet(oVar2);
        if (oVar3 == oVar2) {
            return;
        }
        int i = oVar3 != null ? oVar3.f13635c : 0;
        if (i >= 65536) {
            atomicReference.set(oVar3);
            return;
        }
        oVar.f = oVar3;
        oVar.f13634b = 0;
        oVar.f13635c = i + 8192;
        atomicReference.set(oVar);
    }

    public static final o b() {
        AtomicReference atomicReference = f13641c[(int) (Thread.currentThread().getId() & (((long) f13640b) - 1))];
        o oVar = f13639a;
        o oVar2 = (o) atomicReference.getAndSet(oVar);
        if (oVar2 == oVar) {
            return new o();
        }
        if (oVar2 == null) {
            atomicReference.set(null);
            return new o();
        }
        atomicReference.set(oVar2.f);
        oVar2.f = null;
        oVar2.f13635c = 0;
        return oVar2;
    }
}
