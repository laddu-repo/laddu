package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u0 extends v0 {

    /* renamed from: z, reason: collision with root package name */
    public final Runnable f5714z;

    public u0(Runnable runnable, long j) {
        super(j);
        this.f5714z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5714z.run();
    }

    @Override // gf.v0
    public final String toString() {
        return super.toString() + this.f5714z;
    }
}
