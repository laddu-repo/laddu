package kd;

import com.google.android.gms.internal.measurement.a4;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final y f7907a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.y, java.lang.Object, wf.z] */
    static {
        ?? obj = new Object();
        f7907a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.LiveEvent", obj, 9);
        w0Var.j("eventName", true);
        w0Var.j("teamA", false);
        w0Var.j("teamB", false);
        w0Var.j("teamAFlag", false);
        w0Var.j("teamBFlag", false);
        w0Var.j("startTime", false);
        w0Var.j("endTime", false);
        w0Var.j("isPinned", true);
        w0Var.j("eventBanner", true);
        descriptor = w0Var;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
                    str = (String) h4.a(gVar, 0, h1.f14332a, str);
                    i6 |= 1;
                    break;
                case 1:
                    str2 = h4.p(gVar, 1);
                    i6 |= 2;
                    break;
                case 2:
                    str3 = h4.p(gVar, 2);
                    i6 |= 4;
                    break;
                case 3:
                    str4 = h4.p(gVar, 3);
                    i6 |= 8;
                    break;
                case 4:
                    str5 = h4.p(gVar, 4);
                    i6 |= 16;
                    break;
                case 5:
                    str6 = h4.p(gVar, 5);
                    i6 |= 32;
                    break;
                case 6:
                    str7 = h4.p(gVar, 6);
                    i6 |= 64;
                    break;
                case 7:
                    i10 = h4.t(gVar, 7);
                    i6 |= 128;
                    break;
                case 8:
                    str8 = (String) h4.a(gVar, 8, h1.f14332a, str8);
                    i6 |= 256;
                    break;
                default:
                    throw new sf.g(b10);
            }
        }
        h4.j(gVar);
        return new a0(i6, str, str2, str3, str4, str5, str6, str7, i10, str8);
    }

    @Override // wf.z
    public final sf.a[] b() {
        h1 h1Var = h1.f14332a;
        return new sf.a[]{a4.i(h1Var), h1Var, h1Var, h1Var, h1Var, h1Var, h1Var, wf.f0.f14319a, a4.i(h1Var)};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        a0 value = (a0) obj;
        kotlin.jvm.internal.k.e(value, "value");
        String str = value.f7835x;
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        if (a10.v(gVar) || str != null) {
            a10.o(gVar, 0, h1.f14332a, str);
        }
        String str2 = value.f7836y;
        String str3 = value.F;
        int i6 = value.E;
        a10.t(gVar, 1, str2);
        a10.t(gVar, 2, value.f7837z);
        a10.t(gVar, 3, value.A);
        a10.t(gVar, 4, value.B);
        a10.t(gVar, 5, value.C);
        a10.t(gVar, 6, value.D);
        if (a10.v(gVar) || i6 != 0) {
            a10.l(7, i6, gVar);
        }
        if (a10.v(gVar) || str3 != null) {
            a10.o(gVar, 8, h1.f14332a, str3);
        }
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
