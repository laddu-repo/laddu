package kd;

import java.util.List;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7834a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wf.z, kd.a] */
    static {
        ?? obj = new Object();
        f7834a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.Ads", obj, 4);
        w0Var.j("adId", false);
        w0Var.j("enabled", false);
        w0Var.j("adNumber", false);
        w0Var.j("sponsors", false);
        descriptor = w0Var;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        he.f[] fVarArr = c.f7839e;
        String str = null;
        List list = null;
        boolean z10 = true;
        int i6 = 0;
        boolean z11 = false;
        int i10 = 0;
        while (z10) {
            int b10 = h4.b(gVar);
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 == 3) {
                                list = (List) h4.f(gVar, 3, (sf.a) fVarArr[3].getValue(), list);
                                i6 |= 8;
                            } else {
                                throw new sf.g(b10);
                            }
                        } else {
                            i10 = h4.t(gVar, 2);
                            i6 |= 4;
                        }
                    } else {
                        z11 = h4.n(gVar, 1);
                        i6 |= 2;
                    }
                } else {
                    str = h4.p(gVar, 0);
                    i6 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        h4.j(gVar);
        return new c(i6, str, z11, i10, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wf.z
    public final sf.a[] b() {
        return new sf.a[]{h1.f14332a, wf.f.f14317a, wf.f0.f14319a, c.f7839e[3].getValue()};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        c value = (c) obj;
        kotlin.jvm.internal.k.e(value, "value");
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        he.f[] fVarArr = c.f7839e;
        a10.t(gVar, 0, value.f7840a);
        a10.c(gVar, 1, value.f7841b);
        a10.l(2, value.f7842c, gVar);
        a10.p(gVar, 3, (sf.a) fVarArr[3].getValue(), value.f7843d);
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
