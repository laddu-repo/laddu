package n9;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1 f9455e;

    public /* synthetic */ r1(t1 t1Var, String str, String str2, String str3, int i6) {
        this.f9451a = i6;
        this.f9452b = str;
        this.f9453c = str2;
        this.f9454d = str3;
        this.f9455e = t1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9451a) {
            case 0:
                t1 t1Var = this.f9455e;
                t1Var.f9483e.w();
                o oVar = t1Var.f9483e.f9303z;
                e4.P(oVar);
                return oVar.b2(this.f9452b, this.f9453c, this.f9454d);
            case 1:
                t1 t1Var2 = this.f9455e;
                t1Var2.f9483e.w();
                o oVar2 = t1Var2.f9483e.f9303z;
                e4.P(oVar2);
                return oVar2.b2(this.f9452b, this.f9453c, this.f9454d);
            case 2:
                t1 t1Var3 = this.f9455e;
                t1Var3.f9483e.w();
                o oVar3 = t1Var3.f9483e.f9303z;
                e4.P(oVar3);
                return oVar3.f2(this.f9452b, this.f9453c, this.f9454d);
            default:
                t1 t1Var4 = this.f9455e;
                t1Var4.f9483e.w();
                o oVar4 = t1Var4.f9483e.f9303z;
                e4.P(oVar4);
                return oVar4.f2(this.f9452b, this.f9453c, this.f9454d);
        }
    }
}
