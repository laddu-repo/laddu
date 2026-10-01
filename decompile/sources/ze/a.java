package ze;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends ye.a {
    @Override // ye.d
    public final long d(long j, long j10) {
        return ThreadLocalRandom.current().nextLong(j, j10);
    }

    @Override // ye.a
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        k.d(current, "current(...)");
        return current;
    }
}
