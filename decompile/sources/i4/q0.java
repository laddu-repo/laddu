package i4;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements e1, f1 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6508x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h1 f6509y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f6510z;

    public /* synthetic */ q0(h1 h1Var, int i6, int i10) {
        this.f6508x = i10;
        this.f6509y = h1Var;
        this.f6510z = i6;
    }

    @Override // i4.e1
    public void a(l1 l1Var, s sVar) {
        switch (this.f6508x) {
            case 0:
                l1Var.W(this.f6509y.M(sVar, l1Var, this.f6510z));
                return;
            default:
                l1Var.L(this.f6509y.M(sVar, l1Var, this.f6510z));
                return;
        }
    }

    @Override // i4.f1
    public void b(l1 l1Var, s sVar, List list) {
        switch (this.f6508x) {
            case 1:
                l1Var.Z(this.f6509y.M(sVar, l1Var, this.f6510z), list);
                return;
            case 2:
                h1 h1Var = this.f6509y;
                h1Var.getClass();
                int size = list.size();
                int i6 = this.f6510z;
                if (size == 1) {
                    l1Var.l0(h1Var.M(sVar, l1Var, i6), (r1.e0) list.get(0));
                    return;
                } else {
                    l1Var.K(h1Var.M(sVar, l1Var, i6), h1Var.M(sVar, l1Var, i6 + 1), list);
                    return;
                }
            default:
                l1Var.Z(this.f6509y.M(sVar, l1Var, this.f6510z), list);
                return;
        }
    }
}
