package kd;

import com.google.android.gms.internal.measurement.a4;
import java.util.List;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7844a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wf.z, kd.d] */
    static {
        ?? obj = new Object();
        f7844a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.AppData", obj, 5);
        w0Var.j("sig", false);
        w0Var.j("dataRows", false);
        w0Var.j("ads", false);
        w0Var.j("updateUrl", true);
        w0Var.j("items", true);
        descriptor = w0Var;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        he.f[] fVarArr = f.f7849f;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        List list2 = null;
        boolean z10 = true;
        int i6 = 0;
        while (z10) {
            int b10 = h4.b(gVar);
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 == 4) {
                                    list2 = (List) h4.f(gVar, 4, (sf.a) fVarArr[4].getValue(), list2);
                                    i6 |= 16;
                                } else {
                                    throw new sf.g(b10);
                                }
                            } else {
                                str3 = (String) h4.a(gVar, 3, h1.f14332a, str3);
                                i6 |= 8;
                            }
                        } else {
                            str2 = h4.p(gVar, 2);
                            i6 |= 4;
                        }
                    } else {
                        list = (List) h4.f(gVar, 1, (sf.a) fVarArr[1].getValue(), list);
                        i6 |= 2;
                    }
                } else {
                    str = (String) h4.a(gVar, 0, h1.f14332a, str);
                    i6 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        h4.j(gVar);
        return new f(i6, str, list, str2, str3, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wf.z
    public final sf.a[] b() {
        he.f[] fVarArr = f.f7849f;
        h1 h1Var = h1.f14332a;
        return new sf.a[]{a4.i(h1Var), fVarArr[1].getValue(), h1Var, a4.i(h1Var), fVarArr[4].getValue()};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        f value = (f) obj;
        kotlin.jvm.internal.k.e(value, "value");
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        he.f[] fVarArr = f.f7849f;
        h1 h1Var = h1.f14332a;
        String str = value.f7850a;
        List list = value.f7854e;
        String str2 = value.f7853d;
        a10.o(gVar, 0, h1Var, str);
        a10.p(gVar, 1, (sf.a) fVarArr[1].getValue(), value.f7851b);
        a10.t(gVar, 2, value.f7852c);
        if (a10.v(gVar) || str2 != null) {
            a10.o(gVar, 3, h1Var, str2);
        }
        if (a10.v(gVar) || !kotlin.jvm.internal.k.a(list, ie.r.f6846x)) {
            a10.p(gVar, 4, (sf.a) fVarArr[4].getValue(), list);
        }
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
