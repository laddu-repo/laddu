package kd;

import com.google.android.gms.internal.measurement.a4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import okhttp3.HttpUrl;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f7885a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.n0, java.lang.Object, wf.z] */
    static {
        ?? obj = new Object();
        f7885a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.StreamUrl", obj, 6);
        w0Var.j("title", true);
        w0Var.j("link", false);
        w0Var.j(HandleInvocationsFromAdViewer.KEY_AD_TYPE, true);
        w0Var.j("api", true);
        w0Var.j("drmType", true);
        w0Var.j("headers", true);
        descriptor = w0Var;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        he.f[] fVarArr = p0.f7889g;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Map map = null;
        boolean z10 = true;
        int i6 = 0;
        int i10 = 0;
        while (z10) {
            int b10 = h4.b(gVar);
            switch (b10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    str = h4.p(gVar, 0);
                    i6 |= 1;
                    break;
                case 1:
                    str2 = h4.p(gVar, 1);
                    i6 |= 2;
                    break;
                case 2:
                    i10 = h4.t(gVar, 2);
                    i6 |= 4;
                    break;
                case 3:
                    str3 = h4.p(gVar, 3);
                    i6 |= 8;
                    break;
                case 4:
                    str4 = (String) h4.a(gVar, 4, h1.f14332a, str4);
                    i6 |= 16;
                    break;
                case 5:
                    map = (Map) h4.a(gVar, 5, (sf.a) fVarArr[5].getValue(), map);
                    i6 |= 32;
                    break;
                default:
                    throw new sf.g(b10);
            }
        }
        h4.j(gVar);
        return new p0(i6, str, str2, i10, str3, str4, map);
    }

    @Override // wf.z
    public final sf.a[] b() {
        he.f[] fVarArr = p0.f7889g;
        h1 h1Var = h1.f14332a;
        return new sf.a[]{h1Var, h1Var, wf.f0.f14319a, h1Var, a4.i(h1Var), a4.i((sf.a) fVarArr[5].getValue())};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        p0 value = (p0) obj;
        kotlin.jvm.internal.k.e(value, "value");
        String str = value.f7890a;
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        he.f[] fVarArr = p0.f7889g;
        if (a10.v(gVar) || !kotlin.jvm.internal.k.a(str, HttpUrl.FRAGMENT_ENCODE_SET)) {
            a10.t(gVar, 0, str);
        }
        String str2 = value.f7891b;
        Map map = value.f7895f;
        String str3 = value.f7894e;
        String str4 = value.f7893d;
        int i6 = value.f7892c;
        a10.t(gVar, 1, str2);
        if (a10.v(gVar) || i6 != 0) {
            a10.l(2, i6, gVar);
        }
        if (a10.v(gVar) || !kotlin.jvm.internal.k.a(str4, HttpUrl.FRAGMENT_ENCODE_SET)) {
            a10.t(gVar, 3, str4);
        }
        if (a10.v(gVar) || str3 != null) {
            a10.o(gVar, 4, h1.f14332a, str3);
        }
        if (a10.v(gVar) || map != null) {
            a10.o(gVar, 5, (sf.a) fVarArr[5].getValue(), map);
        }
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
