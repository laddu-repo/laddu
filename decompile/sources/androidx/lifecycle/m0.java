package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 extends n0 implements d0 {
    public final f0 B;
    public final /* synthetic */ o0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, f0 f0Var, r0 r0Var) {
        super(o0Var, r0Var);
        this.C = o0Var;
        this.B = f0Var;
    }

    @Override // androidx.lifecycle.n0
    public final void b() {
        this.B.getLifecycle().c(this);
    }

    @Override // androidx.lifecycle.n0
    public final boolean c(f0 f0Var) {
        if (this.B == f0Var) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.n0
    public final boolean e() {
        if (this.B.getLifecycle().b().compareTo(x.A) >= 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.d0
    public final void onStateChanged(f0 f0Var, w wVar) {
        f0 f0Var2 = this.B;
        x b10 = f0Var2.getLifecycle().b();
        if (b10 == x.f991x) {
            o0.a("removeObserver");
            n0 n0Var = (n0) this.C.f970b.b(this.f965x);
            if (n0Var != null) {
                n0Var.b();
                n0Var.a(false);
                return;
            }
            return;
        }
        x xVar = null;
        while (xVar != b10) {
            a(e());
            xVar = b10;
            b10 = f0Var2.getLifecycle().b();
        }
    }
}
