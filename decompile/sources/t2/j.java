package t2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import r1.f1;
import r1.i1;
import r1.j1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends i1 {
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;

    public j(k kVar) {
        e(kVar);
        this.F = kVar.o0;
        this.G = kVar.f12532p0;
        this.H = kVar.f12533q0;
        this.I = kVar.f12534r0;
        this.J = kVar.f12535s0;
        this.K = kVar.f12536t0;
        this.L = kVar.f12537u0;
        SparseArray sparseArray = kVar.f12538v0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            sparseArray2.put(sparseArray.keyAt(i6), new HashMap((Map) sparseArray.valueAt(i6)));
        }
        this.M = sparseArray2;
        this.N = kVar.f12539w0.clone();
    }

    @Override // r1.i1
    public final j1 b() {
        return new k(this);
    }

    @Override // r1.i1
    public final i1 c() {
        super.c();
        return this;
    }

    @Override // r1.i1
    public final i1 d(int i6) {
        super.d(i6);
        return this;
    }

    @Override // r1.i1
    public final i1 g() {
        this.f11516y = -3;
        return this;
    }

    @Override // r1.i1
    public final i1 h(f1 f1Var) {
        super.h(f1Var);
        return this;
    }

    @Override // r1.i1
    public final i1 i() {
        super.i();
        return this;
    }

    @Override // r1.i1
    public final i1 j(String[] strArr) {
        super.j(strArr);
        return this;
    }

    @Override // r1.i1
    public final i1 k() {
        super.k();
        return this;
    }

    @Override // r1.i1
    public final i1 l(int i6, boolean z10) {
        super.l(i6, z10);
        return this;
    }

    public final void m(Set set) {
        this.E.clear();
        this.E.addAll(set);
    }

    public final void n() {
        super.i();
    }

    public j() {
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = true;
        this.L = true;
    }
}
