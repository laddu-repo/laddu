package kd;

import com.google.android.gms.internal.measurement.a4;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final g f7855a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.g, java.lang.Object, wf.z] */
    static {
        ?? obj = new Object();
        f7855a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.Cat", obj, 5);
        w0Var.j("id", false);
        w0Var.j("title", false);
        w0Var.j("image", false);
        w0Var.j("isChecked", true);
        w0Var.j("catLink", true);
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
        int i10 = 0;
        boolean z11 = false;
        while (z10) {
            int b10 = h4.b(gVar);
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 == 4) {
                                    str3 = (String) h4.a(gVar, 4, h1.f14332a, str3);
                                    i6 |= 16;
                                } else {
                                    throw new sf.g(b10);
                                }
                            } else {
                                z11 = h4.n(gVar, 3);
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
        return new i(i6, i10, str, str2, str3, z11);
    }

    @Override // wf.z
    public final sf.a[] b() {
        h1 h1Var = h1.f14332a;
        return new sf.a[]{wf.f0.f14319a, h1Var, h1Var, wf.f.f14317a, a4.i(h1Var)};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        i value = (i) obj;
        kotlin.jvm.internal.k.e(value, "value");
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        int i6 = value.f7860a;
        String str = value.f7864e;
        boolean z10 = value.f7863d;
        a10.l(0, i6, gVar);
        a10.t(gVar, 1, value.f7861b);
        a10.t(gVar, 2, value.f7862c);
        if (a10.v(gVar) || z10) {
            a10.c(gVar, 3, z10);
        }
        if (a10.v(gVar) || str != null) {
            a10.o(gVar, 4, h1.f14332a, str);
        }
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
