package kd;

import java.util.List;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final s f7899a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kd.s, wf.z] */
    static {
        ?? obj = new Object();
        f7899a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.EventChannel", obj, 6);
        w0Var.j("id", false);
        w0Var.j("title", false);
        w0Var.j("image", false);
        w0Var.j("category", false);
        w0Var.j("formats", false);
        w0Var.j("eventInfo", false);
        descriptor = w0Var;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        he.f[] fVarArr = u.D;
        a0 a0Var = null;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        boolean z10 = true;
        int i6 = 0;
        while (z10) {
            int b10 = h4.b(gVar);
            switch (b10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    j = h4.y(gVar, 0);
                    i6 |= 1;
                    break;
                case 1:
                    str = h4.p(gVar, 1);
                    i6 |= 2;
                    break;
                case 2:
                    str2 = h4.p(gVar, 2);
                    i6 |= 4;
                    break;
                case 3:
                    str3 = h4.p(gVar, 3);
                    i6 |= 8;
                    break;
                case 4:
                    list = (List) h4.f(gVar, 4, (sf.a) fVarArr[4].getValue(), list);
                    i6 |= 16;
                    break;
                case 5:
                    a0Var = (a0) h4.f(gVar, 5, y.f7907a, a0Var);
                    i6 |= 32;
                    break;
                default:
                    throw new sf.g(b10);
            }
        }
        h4.j(gVar);
        return new u(i6, j, str, str2, str3, list, a0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wf.z
    public final sf.a[] b() {
        he.f[] fVarArr = u.D;
        h1 h1Var = h1.f14332a;
        return new sf.a[]{wf.l0.f14350a, h1Var, h1Var, h1Var, fVarArr[4].getValue(), y.f7907a};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        u value = (u) obj;
        kotlin.jvm.internal.k.e(value, "value");
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        he.f[] fVarArr = u.D;
        long j = value.f7900x;
        a10.g(gVar, 0);
        a10.m(j);
        a10.t(gVar, 1, value.f7901y);
        a10.t(gVar, 2, value.f7902z);
        a10.t(gVar, 3, value.A);
        a10.p(gVar, 4, (sf.a) fVarArr[4].getValue(), value.B);
        a10.p(gVar, 5, y.f7907a, value.C);
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
