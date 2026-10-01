package kd;

import com.google.android.gms.internal.measurement.a4;
import okhttp3.HttpUrl;
import wf.h1;
import wf.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements wf.z {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f7838a;
    private static final uf.g descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.b0, java.lang.Object, wf.z] */
    static {
        ?? obj = new Object();
        f7838a = obj;
        w0 w0Var = new w0("com.playfy.tv.models.M3UPlaylist", obj, 3);
        w0Var.j("id", true);
        w0Var.j("title", true);
        w0Var.j("path", true);
        descriptor = w0Var;
    }

    @Override // sf.a
    public final Object a(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a h4 = bVar.h(gVar);
        Integer num = null;
        String str = null;
        String str2 = null;
        boolean z10 = true;
        int i6 = 0;
        while (z10) {
            int b10 = h4.b(gVar);
            if (b10 != -1) {
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            str2 = h4.p(gVar, 2);
                            i6 |= 4;
                        } else {
                            throw new sf.g(b10);
                        }
                    } else {
                        str = h4.p(gVar, 1);
                        i6 |= 2;
                    }
                } else {
                    num = (Integer) h4.a(gVar, 0, wf.f0.f14319a, num);
                    i6 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        h4.j(gVar);
        return new d0(i6, num, str, str2);
    }

    @Override // wf.z
    public final sf.a[] b() {
        h1 h1Var = h1.f14332a;
        return new sf.a[]{a4.i(wf.f0.f14319a), h1Var, h1Var};
    }

    @Override // sf.a
    public final void c(yf.t tVar, Object obj) {
        d0 value = (d0) obj;
        kotlin.jvm.internal.k.e(value, "value");
        String str = value.f7847c;
        String str2 = value.f7846b;
        Integer num = value.f7845a;
        uf.g gVar = descriptor;
        yf.t a10 = tVar.a(gVar);
        if (a10.v(gVar) || num != null) {
            a10.o(gVar, 0, wf.f0.f14319a, num);
        }
        if (a10.v(gVar) || !kotlin.jvm.internal.k.a(str2, HttpUrl.FRAGMENT_ENCODE_SET)) {
            a10.t(gVar, 1, str2);
        }
        if (a10.v(gVar) || !kotlin.jvm.internal.k.a(str, HttpUrl.FRAGMENT_ENCODE_SET)) {
            a10.t(gVar, 2, str);
        }
        a10.u(gVar);
    }

    @Override // sf.a
    public final uf.g d() {
        return descriptor;
    }
}
