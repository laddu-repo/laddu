package kd;

import com.google.android.gms.internal.measurement.a4;
import com.unity3d.ads.metadata.MediationMetaData;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f7848a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.e0, java.lang.Object, wf.z] */
    static {
        ?? obj = new Object();
        f7848a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.PlaylistItem", obj, 12);
        w0Var.j(MediationMetaData.KEY_NAME, true);
        w0Var.j("groupTitle", true);
        w0Var.j("logo", true);
        w0Var.j("link", false);
        w0Var.j("userAgent", true);
        w0Var.j("referrer", true);
        w0Var.j("origin", true);
        w0Var.j("cookie", true);
        w0Var.j("drmLicense", true);
        w0Var.j("drmScheme", true);
        w0Var.j("id", true);
        w0Var.j("isFav", true);
        descriptor = w0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001d. Please report as an issue. */
    @Override // sf.a
    public final Object a(vf.b bVar) {
        boolean z10;
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i6 = 0;
        boolean z11 = true;
        boolean z12 = false;
        while (z11) {
            int b10 = h4.b(gVar);
            switch (b10) {
                case -1:
                    z11 = false;
                case 0:
                    z10 = z11;
                    str2 = (String) h4.a(gVar, 0, h1.f14332a, str2);
                    i6 |= 1;
                    z11 = z10;
                case 1:
                    z10 = z11;
                    str3 = (String) h4.a(gVar, 1, h1.f14332a, str3);
                    i6 |= 2;
                    z11 = z10;
                case 2:
                    z10 = z11;
                    str4 = (String) h4.a(gVar, 2, h1.f14332a, str4);
                    i6 |= 4;
                    z11 = z10;
                case 3:
                    str5 = h4.p(gVar, 3);
                    i6 |= 8;
                case 4:
                    z10 = z11;
                    str6 = (String) h4.a(gVar, 4, h1.f14332a, str6);
                    i6 |= 16;
                    z11 = z10;
                case 5:
                    z10 = z11;
                    str7 = (String) h4.a(gVar, 5, h1.f14332a, str7);
                    i6 |= 32;
                    z11 = z10;
                case 6:
                    z10 = z11;
                    str8 = (String) h4.a(gVar, 6, h1.f14332a, str8);
                    i6 |= 64;
                    z11 = z10;
                case 7:
                    z10 = z11;
                    str9 = (String) h4.a(gVar, 7, h1.f14332a, str9);
                    i6 |= 128;
                    z11 = z10;
                case 8:
                    z10 = z11;
                    str10 = (String) h4.a(gVar, 8, h1.f14332a, str10);
                    i6 |= 256;
                    z11 = z10;
                case 9:
                    z10 = z11;
                    str = (String) h4.a(gVar, 9, h1.f14332a, str);
                    i6 |= 512;
                    z11 = z10;
                case 10:
                    z10 = z11;
                    num = (Integer) h4.a(gVar, 10, wf.f0.f14319a, num);
                    i6 |= 1024;
                    z11 = z10;
                case 11:
                    z12 = h4.n(gVar, 11);
                    i6 |= 2048;
                default:
                    throw new sf.g(b10);
            }
        }
        h4.j(gVar);
        return new h0(i6, str2, str3, str4, str5, str6, str7, str8, str9, str10, str, num, z12);
    }

    @Override // wf.z
    public final sf.a[] b() {
        h1 h1Var = h1.f14332a;
        return new sf.a[]{a4.i(h1Var), a4.i(h1Var), a4.i(h1Var), h1Var, a4.i(h1Var), a4.i(h1Var), a4.i(h1Var), a4.i(h1Var), a4.i(h1Var), a4.i(h1Var), a4.i(wf.f0.f14319a), wf.f.f14317a};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        h0 value = (h0) obj;
        kotlin.jvm.internal.k.e(value, "value");
        String str = value.f7859z;
        String str2 = value.f7858y;
        String str3 = value.f7857x;
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        if (a10.v(gVar) || str3 != null) {
            a10.o(gVar, 0, h1.f14332a, str3);
        }
        if (a10.v(gVar) || str2 != null) {
            a10.o(gVar, 1, h1.f14332a, str2);
        }
        if (a10.v(gVar) || str != null) {
            a10.o(gVar, 2, h1.f14332a, str);
        }
        String str4 = value.A;
        Integer num = value.H;
        String str5 = value.G;
        String str6 = value.F;
        String str7 = value.E;
        String str8 = value.D;
        String str9 = value.C;
        String str10 = value.B;
        a10.t(gVar, 3, str4);
        if (a10.v(gVar) || str10 != null) {
            a10.o(gVar, 4, h1.f14332a, str10);
        }
        if (a10.v(gVar) || str9 != null) {
            a10.o(gVar, 5, h1.f14332a, str9);
        }
        if (a10.v(gVar) || str8 != null) {
            a10.o(gVar, 6, h1.f14332a, str8);
        }
        if (a10.v(gVar) || str7 != null) {
            a10.o(gVar, 7, h1.f14332a, str7);
        }
        if (a10.v(gVar) || str6 != null) {
            a10.o(gVar, 8, h1.f14332a, str6);
        }
        if (a10.v(gVar) || str5 != null) {
            a10.o(gVar, 9, h1.f14332a, str5);
        }
        if (a10.v(gVar) || num != null) {
            a10.o(gVar, 10, wf.f0.f14319a, num);
        }
        if (a10.v(gVar) || value.I) {
            a10.c(gVar, 11, value.I);
        }
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
