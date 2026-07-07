package q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10918x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s0 f10919y;

    public /* synthetic */ n0(s0 s0Var, int i6) {
        this.f10918x = i6;
        this.f10919y = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10918x) {
            case 0:
                this.f10919y.f10951g0 = true;
                return;
            case 1:
                this.f10919y.w();
                return;
            default:
                s0 s0Var = this.f10919y;
                if (!s0Var.f10957m0) {
                    z zVar = s0Var.P;
                    zVar.getClass();
                    zVar.j(s0Var);
                    return;
                }
                return;
        }
    }
}
