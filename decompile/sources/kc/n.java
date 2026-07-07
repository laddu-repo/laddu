package kc;

import androidx.fragment.app.q0;
import androidx.fragment.app.y;
import androidx.fragment.app.y0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f7929b;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f7933g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.fragment.app.a f7931d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f7932e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7930c = 1;

    public n(o oVar, q0 q0Var) {
        this.f7933g = oVar;
        this.f7929b = q0Var;
    }

    @Override // i5.a
    public final void a(Object obj) {
        y yVar = (y) obj;
        if (this.f7931d == null) {
            q0 q0Var = this.f7929b;
            q0Var.getClass();
            this.f7931d = new androidx.fragment.app.a(q0Var);
        }
        androidx.fragment.app.a aVar = this.f7931d;
        aVar.getClass();
        q0 q0Var2 = yVar.N;
        if (q0Var2 != null && q0Var2 != aVar.f968p) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + yVar.toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new y0(6, yVar));
        if (yVar.equals(this.f7932e)) {
            this.f7932e = null;
        }
    }

    @Override // i5.a
    public final void b() {
        androidx.fragment.app.a aVar = this.f7931d;
        if (aVar != null) {
            if (!this.f) {
                try {
                    this.f = true;
                    if (aVar.f960g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    aVar.f968p.z(aVar, true);
                } finally {
                    this.f = false;
                }
            }
            this.f7931d = null;
        }
    }

    @Override // i5.a
    public final int c() {
        return this.f7933g.K0.size();
    }

    @Override // i5.a
    public final void e(i5.h hVar) {
        if (hVar.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
