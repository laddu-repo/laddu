package mf;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s {
    private volatile AtomicReferenceArray<Object> array;

    public s(int i6) {
        this.array = new AtomicReferenceArray<>(i6);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i6) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i6 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i6);
        }
        return null;
    }

    public final void c(int i6, of.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i6 < length) {
            atomicReferenceArray.set(i6, aVar);
            return;
        }
        int i10 = i6 + 1;
        int i11 = length * 2;
        if (i10 < i11) {
            i10 = i11;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i10);
        for (int i12 = 0; i12 < length; i12++) {
            atomicReferenceArray2.set(i12, atomicReferenceArray.get(i12));
        }
        atomicReferenceArray2.set(i6, aVar);
        this.array = atomicReferenceArray2;
    }
}
