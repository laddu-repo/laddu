package kd;

import com.google.android.gms.internal.measurement.a4;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final p f7888a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.p, java.lang.Object, wf.z] */
    static {
        ?? obj = new Object();
        f7888a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.Donate", obj, 3);
        w0Var.j("message", false);
        w0Var.j("address", false);
        w0Var.j("qrImage", true);
        descriptor = w0Var;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z10 = true;
        int i6 = 0;
        while (z10) {
            int b10 = h4.b(gVar);
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            str3 = (String) h4.a(gVar, 2, h1.f14332a, str3);
                            i6 |= 4;
                        } else {
                            throw new sf.g(b10);
                        }
                    } else {
                        str2 = h4.p(gVar, 1);
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
        return new r(i6, str, str2, str3);
    }

    @Override // wf.z
    public final sf.a[] b() {
        h1 h1Var = h1.f14332a;
        return new sf.a[]{h1Var, h1Var, a4.i(h1Var)};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        r value = (r) obj;
        kotlin.jvm.internal.k.e(value, "value");
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        String str = value.f7896a;
        String str2 = value.f7898c;
        a10.t(gVar, 0, str);
        a10.t(gVar, 1, value.f7897b);
        if (a10.v(gVar) || str2 != null) {
            a10.o(gVar, 2, h1.f14332a, str2);
        }
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
