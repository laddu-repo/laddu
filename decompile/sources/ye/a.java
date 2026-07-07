package ye;

import java.util.Random;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a extends d {
    @Override // ye.d
    public final int a(int i6) {
        return ((-i6) >> 31) & (e().nextInt() >>> (32 - i6));
    }

    @Override // ye.d
    public final int b() {
        return e().nextInt();
    }

    @Override // ye.d
    public final long c() {
        return e().nextLong();
    }

    public abstract Random e();
}
