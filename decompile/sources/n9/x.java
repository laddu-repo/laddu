package n9;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9520x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f9521y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c0 f9522z;

    public x(b0 b0Var, long j) {
        this.f9521y = j;
        Objects.requireNonNull(b0Var);
        this.f9522z = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9520x) {
            case 0:
                ((b0) this.f9522z).j1(this.f9521y);
                return;
            default:
                x2 x2Var = (x2) this.f9522z;
                b0 b0Var = ((n1) x2Var.f4301y).K;
                n1.d(b0Var);
                b0Var.g1(this.f9521y);
                x2Var.C = null;
                return;
        }
    }

    public x(x2 x2Var, long j) {
        this.f9521y = j;
        Objects.requireNonNull(x2Var);
        this.f9522z = x2Var;
    }
}
