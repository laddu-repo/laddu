package a2;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements u1.l, i4.g1 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f270x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f271y;

    public /* synthetic */ i0(int i6, db.c1 c1Var) {
        this.f270x = i6;
        this.f271y = c1Var;
    }

    @Override // i4.g1
    public Object c(i4.b0 b0Var, i4.s sVar, int i6) {
        switch (this.f270x) {
            case 2:
                return b0Var.l(sVar, this.f271y);
            default:
                return b0Var.l(sVar, this.f271y);
        }
    }

    @Override // u1.l
    public void invoke(Object obj) {
        switch (this.f270x) {
            case 0:
                ((r1.s0) obj).G(this.f271y);
                return;
            default:
                ((b2.l) obj).getClass();
                return;
        }
    }

    public /* synthetic */ i0(b2.a aVar, List list) {
        this.f270x = 1;
        this.f271y = list;
    }
}
