package kd;

import java.util.List;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final v f7903a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.v, java.lang.Object, wf.z] */
    static {
        ?? obj = new Object();
        f7903a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.Events", obj, 2);
        w0Var.j("channels", false);
        w0Var.j("cats", false);
        descriptor = w0Var;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        he.f[] fVarArr = x.f7904c;
        List list = null;
        List list2 = null;
        boolean z10 = true;
        int i6 = 0;
        while (z10) {
            int b10 = h4.b(gVar);
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 == 1) {
                        list2 = (List) h4.f(gVar, 1, (sf.a) fVarArr[1].getValue(), list2);
                        i6 |= 2;
                    } else {
                        throw new sf.g(b10);
                    }
                } else {
                    list = (List) h4.f(gVar, 0, (sf.a) fVarArr[0].getValue(), list);
                    i6 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        h4.j(gVar);
        return new x(i6, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wf.z
    public final sf.a[] b() {
        he.f[] fVarArr = x.f7904c;
        return new sf.a[]{fVarArr[0].getValue(), fVarArr[1].getValue()};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        x value = (x) obj;
        kotlin.jvm.internal.k.e(value, "value");
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        he.f[] fVarArr = x.f7904c;
        a10.p(gVar, 0, (sf.a) fVarArr[0].getValue(), value.f7905a);
        a10.p(gVar, 1, (sf.a) fVarArr[1].getValue(), value.f7906b);
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
