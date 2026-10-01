package bg;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 extends o0 {
    @Override // bg.o0
    public final o0 timeout(long j, TimeUnit unit) {
        kotlin.jvm.internal.k.e(unit, "unit");
        return this;
    }

    @Override // bg.o0
    public final void throwIfReached() {
    }

    @Override // bg.o0
    public final o0 deadlineNanoTime(long j) {
        return this;
    }
}
