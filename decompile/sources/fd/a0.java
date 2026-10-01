package fd;

import a2.n0;
import r1.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 extends e3.e {

    /* renamed from: z, reason: collision with root package name */
    public final n0 f5160z;

    public a0(n0 n0Var) {
        super(n0Var, 6);
        this.f5160z = n0Var;
    }

    @Override // e3.e, r1.u0
    public final int s() {
        n0 n0Var = this.f5160z;
        long duration = n0Var.getDuration();
        long a02 = n0Var.a0();
        if (duration == -9223372036854775807L || a02 <= 0) {
            return 0;
        }
        try {
            return ((u0) this.f4301y).s();
        } catch (Exception unused) {
            return (int) android.support.v4.media.session.b.e((a02 * 100) / duration, 0L, 100L);
        }
    }
}
