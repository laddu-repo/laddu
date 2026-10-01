package od;

import androidx.lifecycle.d1;
import androidx.lifecycle.j1;
import androidx.lifecycle.k1;
import java.text.SimpleDateFormat;
import java.util.List;
import kf.f1;
import kf.y0;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final f1 f10105b = y0.c(jd.w.f7411a);

    /* renamed from: c, reason: collision with root package name */
    public final f1 f10106c = y0.c("All");

    /* renamed from: d, reason: collision with root package name */
    public final f1 f10107d = y0.c(HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: e, reason: collision with root package name */
    public final f1 f10108e = y0.c(ie.r.f6846x);

    /* renamed from: f, reason: collision with root package name */
    public final he.m f10109f = he.a.d(new d.a0(18));

    public j() {
        getData();
    }

    public Object g(List list, kf.n nVar) {
        return he.y.f6101a;
    }

    public final void getData() {
        f1 f1Var = this.f10105b;
        f1Var.getClass();
        le.c cVar = null;
        f1Var.h(null, jd.w.f7411a);
        z7.b h4 = d1.h(this, new i(this, cVar, 0));
        i iVar = new i(this, cVar, 1);
        h4.D = true;
        h4.A = iVar;
        h4.f15225x = new df.v(this, 3);
    }

    public kf.h h(f1 f1Var) {
        kotlin.jvm.internal.k.e(f1Var, "<this>");
        return new j1.f0(24, f1Var, this);
    }

    public final SimpleDateFormat i() {
        return (SimpleDateFormat) this.f10109f.getValue();
    }

    public abstract w7.b j(gf.c0 c0Var, r7.a aVar);

    public kf.h f(j1 j1Var) {
        return j1Var;
    }
}
