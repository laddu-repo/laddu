package i4;

import com.google.android.gms.internal.measurement.j5;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements n0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6341x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o0 f6342y;

    public /* synthetic */ e0(o0 o0Var, int i6) {
        this.f6341x = i6;
        this.f6342y = o0Var;
    }

    @Override // i4.n0
    public final void f(s sVar) {
        int i6 = this.f6341x;
        o0 o0Var = this.f6342y;
        switch (i6) {
            case 0:
                b0 b0Var = o0Var.f6473g;
                if (b0Var.f6318t.g1() != null) {
                    zb.d dVar = b0Var.f6305e;
                    b0Var.s(sVar);
                    dVar.getClass();
                    j5.l(new s1(-6));
                    return;
                }
                return;
            case 1:
                o0Var.f6473g.f6318t.P();
                return;
            case 2:
                o0Var.f6473g.f6318t.A();
                return;
            case 3:
                o0Var.f6473g.f6318t.N0();
                return;
            case 4:
                o0Var.f6473g.f6318t.L0();
                return;
            case 5:
                o0Var.f6473g.f6318t.c();
                return;
            case 6:
                o0Var.f6473g.f6318t.stop();
                return;
            case 7:
                b0 b0Var2 = o0Var.f6473g;
                l1 l1Var = b0Var2.f6318t;
                if (u1.a0.a0(l1Var, b0Var2.f6315p)) {
                    u1.a0.H(l1Var);
                    return;
                } else {
                    if (l1Var != null && l1Var.n0(1)) {
                        l1Var.pause();
                        return;
                    }
                    return;
                }
            case 8:
                o0Var.f6473g.f6318t.K0();
                return;
            case 9:
                o0Var.f6473g.f6318t.d0();
                return;
            case 10:
                o0Var.f6473g.g(sVar, true);
                return;
            default:
                l1 l1Var2 = o0Var.f6473g.f6318t;
                String str = u1.a0.f12750a;
                if (l1Var2 != null && l1Var2.n0(1)) {
                    l1Var2.pause();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ e0(o0 o0Var, r1.v0 v0Var) {
        this.f6341x = 0;
        this.f6342y = o0Var;
    }
}
