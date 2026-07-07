package bg;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f1717a = new g0(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1718b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f1719c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1718b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i6 = 0; i6 < highestOneBit; i6++) {
            atomicReferenceArr[i6] = new AtomicReference();
        }
        f1719c = atomicReferenceArr;
    }

    public static final void a(g0 segment) {
        int i6;
        kotlin.jvm.internal.k.e(segment, "segment");
        if (segment.f1715f == null && segment.f1716g == null) {
            if (!segment.f1713d) {
                AtomicReference atomicReference = f1719c[(int) (Thread.currentThread().getId() & (f1718b - 1))];
                g0 g0Var = f1717a;
                g0 g0Var2 = (g0) atomicReference.getAndSet(g0Var);
                if (g0Var2 == g0Var) {
                    return;
                }
                if (g0Var2 != null) {
                    i6 = g0Var2.f1712c;
                } else {
                    i6 = 0;
                }
                if (i6 >= 65536) {
                    atomicReference.set(g0Var2);
                    return;
                }
                segment.f1715f = g0Var2;
                segment.f1711b = 0;
                segment.f1712c = i6 + 8192;
                atomicReference.set(segment);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final g0 b() {
        AtomicReference atomicReference = f1719c[(int) (Thread.currentThread().getId() & (f1718b - 1))];
        g0 g0Var = f1717a;
        g0 g0Var2 = (g0) atomicReference.getAndSet(g0Var);
        if (g0Var2 == g0Var) {
            return new g0();
        }
        if (g0Var2 == null) {
            atomicReference.set(null);
            return new g0();
        }
        atomicReference.set(g0Var2.f1715f);
        g0Var2.f1715f = null;
        g0Var2.f1712c = 0;
        return g0Var2;
    }
}
