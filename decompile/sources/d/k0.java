package d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 implements androidx.lifecycle.d0, d {
    public final /* synthetic */ n0 A;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.y f3454x;

    /* renamed from: y, reason: collision with root package name */
    public final f0 f3455y;

    /* renamed from: z, reason: collision with root package name */
    public l0 f3456z;

    public k0(n0 n0Var, androidx.lifecycle.y yVar, f0 onBackPressedCallback) {
        kotlin.jvm.internal.k.e(onBackPressedCallback, "onBackPressedCallback");
        this.A = n0Var;
        this.f3454x = yVar;
        this.f3455y = onBackPressedCallback;
        yVar.a(this);
    }

    @Override // d.d
    public final void cancel() {
        this.f3454x.c(this);
        this.f3455y.f3433b.remove(this);
        l0 l0Var = this.f3456z;
        if (l0Var != null) {
            l0Var.cancel();
        }
        this.f3456z = null;
    }

    @Override // androidx.lifecycle.d0
    public final void onStateChanged(androidx.lifecycle.f0 f0Var, androidx.lifecycle.w wVar) {
        if (wVar == androidx.lifecycle.w.ON_START) {
            this.f3456z = this.A.b(this.f3455y);
            return;
        }
        if (wVar == androidx.lifecycle.w.ON_STOP) {
            l0 l0Var = this.f3456z;
            if (l0Var != null) {
                l0Var.cancel();
                return;
            }
            return;
        }
        if (wVar == androidx.lifecycle.w.ON_DESTROY) {
            cancel();
        }
    }
}
