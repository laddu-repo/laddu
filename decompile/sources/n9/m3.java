package n9;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m3 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final long f9395x;

    /* renamed from: y, reason: collision with root package name */
    public final long f9396y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ j1.f0 f9397z;

    public m3(j1.f0 f0Var, long j, long j10) {
        Objects.requireNonNull(f0Var);
        this.f9397z = f0Var;
        this.f9395x = j;
        this.f9396y = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var = ((n1) ((p3) this.f9397z.f6908z).f4301y).D;
        n1.g(l1Var);
        l1Var.m1(new a1.e(this, 12));
    }
}
