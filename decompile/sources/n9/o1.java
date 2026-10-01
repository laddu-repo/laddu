package n9;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9420c;

    public /* synthetic */ o1(t1 t1Var, Object obj, int i6) {
        this.f9418a = i6;
        this.f9420c = obj;
        this.f9419b = t1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9418a) {
            case 0:
                t1 t1Var = (t1) this.f9419b;
                t1Var.f9483e.w();
                o oVar = t1Var.f9483e.f9303z;
                e4.P(oVar);
                return oVar.a2((String) this.f9420c);
            case 1:
                t1 t1Var2 = (t1) this.f9419b;
                t1Var2.f9483e.w();
                return new i(t1Var2.f9483e.m0(((l4) this.f9420c).f9386x));
            default:
                l4 l4Var = (l4) this.f9420c;
                String str = l4Var.f9386x;
                w8.x.g(str);
                e4 e4Var = (e4) this.f9419b;
                z1 a10 = e4Var.a(str);
                y1 y1Var = y1.ANALYTICS_STORAGE;
                if (a10.i(y1Var) && z1.c(100, l4Var.P).i(y1Var)) {
                    return e4Var.Y(l4Var).E();
                }
                e4Var.r().L.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public o1(e4 e4Var, l4 l4Var) {
        this.f9418a = 2;
        this.f9420c = l4Var;
        Objects.requireNonNull(e4Var);
        this.f9419b = e4Var;
    }
}
