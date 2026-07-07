package i4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6582x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b0 f6583y;

    public /* synthetic */ v(b0 b0Var, int i6) {
        this.f6582x = i6;
        this.f6583y = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6582x) {
            case 0:
                b0 b0Var = this.f6583y;
                z zVar = b0Var.f6319u;
                if (zVar != null) {
                    b0Var.f6318t.t(zVar);
                    return;
                }
                return;
            case 1:
                this.f6583y.getClass();
                return;
            case 2:
                b0.a(this.f6583y);
                return;
            default:
                this.f6583y.t();
                return;
        }
    }
}
