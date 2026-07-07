package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements u1.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f288x = 1;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r1.p1 f289y;

    public /* synthetic */ j0(b2.a aVar, r1.p1 p1Var) {
        this.f289y = p1Var;
    }

    @Override // u1.l
    public final void invoke(Object obj) {
        switch (this.f288x) {
            case 0:
                ((r1.s0) obj).b(this.f289y);
                return;
            default:
                b2.l lVar = (b2.l) obj;
                b2.k kVar = lVar.f1399p;
                r1.p1 p1Var = this.f289y;
                if (kVar != null) {
                    r1.q qVar = (r1.q) kVar.f1384z;
                    if (qVar.f11677v == -1) {
                        r1.p a10 = qVar.a();
                        a10.f11617t = p1Var.f11630a;
                        a10.f11618u = p1Var.f11631b;
                        lVar.f1399p = new b2.k(new r1.q(a10), kVar.f1383y, (String) kVar.A);
                    }
                }
                int i6 = p1Var.f11630a;
                return;
        }
    }

    public /* synthetic */ j0(r1.p1 p1Var) {
        this.f289y = p1Var;
    }
}
