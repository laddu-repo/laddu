package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t0 extends v0 {
    public final /* synthetic */ x0 A;

    /* renamed from: z, reason: collision with root package name */
    public final k f5711z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(x0 x0Var, long j, k kVar) {
        super(j);
        this.A = x0Var;
        this.f5711z = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5711z.B(this.A);
    }

    @Override // gf.v0
    public final String toString() {
        return super.toString() + this.f5711z;
    }
}
