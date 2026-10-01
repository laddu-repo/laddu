package kd;

import com.unity3d.ads.metadata.MediationMetaData;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final m f7879a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kd.m, wf.z] */
    static {
        ?? obj = new Object();
        f7879a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.DataRow", obj, 2);
        w0Var.j(MediationMetaData.KEY_NAME, false);
        w0Var.j("value", false);
        descriptor = w0Var;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        String str = null;
        String str2 = null;
        boolean z10 = true;
        int i6 = 0;
        while (z10) {
            int b10 = h4.b(gVar);
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 == 1) {
                        str2 = h4.p(gVar, 1);
                        i6 |= 2;
                    } else {
                        throw new sf.g(b10);
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
        return new o(i6, str, str2);
    }

    @Override // wf.z
    public final sf.a[] b() {
        h1 h1Var = h1.f14332a;
        return new sf.a[]{h1Var, h1Var};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        o value = (o) obj;
        kotlin.jvm.internal.k.e(value, "value");
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        a10.t(gVar, 0, value.f7886a);
        a10.t(gVar, 1, value.f7887b);
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
