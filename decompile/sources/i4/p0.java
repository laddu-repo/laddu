package i4;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements e1, f1 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f6497x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f6498y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f6499z;

    public /* synthetic */ p0(h1 h1Var, int i6, int i10) {
        this.f6497x = h1Var;
        this.f6498y = i6;
        this.f6499z = i10;
    }

    @Override // i4.e1
    public void a(l1 l1Var, s sVar) {
        h1 h1Var = this.f6497x;
        l1Var.N(h1Var.M(sVar, l1Var, this.f6498y), h1Var.M(sVar, l1Var, this.f6499z));
    }

    @Override // i4.f1
    public void b(l1 l1Var, s sVar, List list) {
        h1 h1Var = this.f6497x;
        l1Var.K(h1Var.M(sVar, l1Var, this.f6498y), h1Var.M(sVar, l1Var, this.f6499z), list);
    }
}
