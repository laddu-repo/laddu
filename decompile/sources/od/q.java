package od;

import androidx.lifecycle.a1;
import androidx.lifecycle.j1;
import gf.o0;
import java.util.Locale;
import kf.f1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends m {

    /* renamed from: e, reason: collision with root package name */
    public final hd.e f10139e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10140f;

    public q(a1 a1Var, hd.e eVar) {
        this.f10139e = eVar;
        Object b10 = a1Var.b("title");
        kotlin.jvm.internal.k.b(b10);
        String lowerCase = ((String) b10).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.k.d(lowerCase, "toLowerCase(...)");
        this.f10140f = h8.c.m("cats/", df.u.F(df.m.n0(lowerCase).toString(), " ", "-"), ".json");
    }

    @Override // od.m
    public final kf.h f(f1 f1Var) {
        kotlin.jvm.internal.k.e(f1Var, "<this>");
        hd.e eVar = this.f10139e;
        return new j1(f1Var, a8.i.d(eVar.f6053a, new String[]{"favorites"}, new cf.p(eVar)), new p(this, null));
    }

    @Override // od.m
    public final w7.b g(gf.c0 c0Var, r7.a aVar) {
        kotlin.jvm.internal.k.e(c0Var, "<this>");
        return new w7.b(gf.f0.g(c0Var, o0.f5694b.plus(gf.f0.e()), new androidx.lifecycle.z(this.f10140f, null, 7), 2));
    }
}
