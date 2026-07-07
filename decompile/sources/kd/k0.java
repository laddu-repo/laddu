package kd;

import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f7875a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.k0, java.lang.Object, wf.z] */
    static {
        ?? obj = new Object();
        f7875a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.Sponsor", obj, 5);
        w0Var.j("enabled", false);
        w0Var.j("image", false);
        w0Var.j("link", false);
        w0Var.j("showTime", false);
        w0Var.j("delayHours", true);
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
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (z10) {
            int b10 = h4.b(gVar);
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 == 4) {
                                    i12 = h4.t(gVar, 4);
                                    i6 |= 16;
                                } else {
                                    throw new sf.g(b10);
                                }
                            } else {
                                i11 = h4.t(gVar, 3);
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
                    i10 = h4.t(gVar, 0);
                    i6 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        h4.j(gVar);
        return new m0(i6, i10, str, str2, i11, i12);
    }

    @Override // wf.z
    public final sf.a[] b() {
        wf.f0 f0Var = wf.f0.f14319a;
        h1 h1Var = h1.f14332a;
        return new sf.a[]{f0Var, h1Var, h1Var, f0Var, f0Var};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        m0 value = (m0) obj;
        kotlin.jvm.internal.k.e(value, "value");
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        int i6 = value.f7880a;
        int i10 = value.f7884e;
        a10.l(0, i6, gVar);
        a10.t(gVar, 1, value.f7881b);
        a10.t(gVar, 2, value.f7882c);
        a10.l(3, value.f7883d, gVar);
        if (a10.v(gVar) || i10 != 1) {
            a10.l(4, i10, gVar);
        }
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
