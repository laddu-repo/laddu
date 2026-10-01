package od;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import androidx.lifecycle.o0;
import kf.f1;
import kf.r0;
import kf.y0;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class m extends k1 implements n {

    /* renamed from: b, reason: collision with root package name */
    public final f1 f10124b = y0.c(HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: c, reason: collision with root package name */
    public final f1 f10125c = y0.c(jd.w.f7411a);

    /* renamed from: d, reason: collision with root package name */
    public final he.m f10126d = he.a.d(new androidx.lifecycle.i(this, 20));

    public m() {
        mo157getData();
    }

    @Override // od.n
    public final r0 a() {
        return this.f10124b;
    }

    public kf.h f(f1 f1Var) {
        kotlin.jvm.internal.k.e(f1Var, "<this>");
        return f1Var;
    }

    public abstract w7.b g(gf.c0 c0Var, r7.a aVar);

    @Override // od.n
    public final o0 getData() {
        return (o0) this.f10126d.getValue();
    }

    @Override // od.n
    /* renamed from: getData */
    public final void mo157getData() {
        f1 f1Var = this.f10125c;
        f1Var.getClass();
        le.c cVar = null;
        f1Var.h(null, jd.w.f7411a);
        z7.b h4 = d1.h(this, new l(this, cVar, 0));
        l lVar = new l(this, cVar, 1);
        h4.D = true;
        h4.A = lVar;
        h4.f15225x = new df.v(this, 4);
    }
}
