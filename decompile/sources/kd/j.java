package kd;

import java.util.List;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final j f7868a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.j, java.lang.Object, wf.z] */
    static {
        ?? obj = new Object();
        f7868a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.Channel", obj, 5);
        w0Var.j("id", false);
        w0Var.j("title", false);
        w0Var.j("image", false);
        w0Var.j("formats", false);
        w0Var.j("isFav", true);
        descriptor = w0Var;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        he.f[] fVarArr = l.C;
        long j = 0;
        String str = null;
        String str2 = null;
        List list = null;
        boolean z10 = true;
        int i6 = 0;
        boolean z11 = false;
        while (z10) {
            int b10 = h4.b(gVar);
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 == 4) {
                                    z11 = h4.n(gVar, 4);
                                    i6 |= 16;
                                } else {
                                    throw new sf.g(b10);
                                }
                            } else {
                                list = (List) h4.f(gVar, 3, (sf.a) fVarArr[3].getValue(), list);
                                i6 |= 8;
                            }
                        } else {
                            str2 = h4.p(gVar, 2);
                            i6 |= 4;
                        }
                    } else {
                        str = h4.p(gVar, 1);
                        i6 |= 2;
                    }
                } else {
                    j = h4.y(gVar, 0);
                    i6 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        h4.j(gVar);
        return new l(i6, j, str, str2, list, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wf.z
    public final sf.a[] b() {
        he.f[] fVarArr = l.C;
        h1 h1Var = h1.f14332a;
        return new sf.a[]{wf.l0.f14350a, h1Var, h1Var, fVarArr[3].getValue(), wf.f.f14317a};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        l value = (l) obj;
        kotlin.jvm.internal.k.e(value, "value");
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        he.f[] fVarArr = l.C;
        long j = value.f7876x;
        a10.g(gVar, 0);
        a10.m(j);
        a10.t(gVar, 1, value.f7877y);
        a10.t(gVar, 2, value.f7878z);
        a10.p(gVar, 3, (sf.a) fVarArr[3].getValue(), value.A);
        if (a10.v(gVar) || value.B) {
            a10.c(gVar, 4, value.B);
        }
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
