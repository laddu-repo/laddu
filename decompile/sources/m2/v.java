package m2;

import android.net.Uri;
import java.util.ArrayList;
import javax.net.SocketFactory;
import r1.d1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends q2.a {
    public final d E;
    public final String F = "AndroidXMedia3/1.8.0";
    public final Uri G;
    public final SocketFactory H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public r1.e0 M;

    static {
        r1.f0.a("media3.exoplayer.rtsp");
    }

    public v(r1.e0 e0Var, d dVar, SocketFactory socketFactory) {
        this.M = e0Var;
        this.E = dVar;
        r1.a0 a0Var = e0Var.f11379b;
        a0Var.getClass();
        this.G = w(a0Var.f11283a);
        this.H = socketFactory;
        this.I = -9223372036854775807L;
        this.L = true;
    }

    public static Uri w(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && dg.b.f("rtspt", scheme)) {
            return Uri.parse("rtsp" + uri.toString().substring(5));
        }
        return uri;
    }

    @Override // q2.a
    public final boolean a(r1.e0 e0Var) {
        r1.a0 a0Var = e0Var.f11379b;
        if (a0Var != null && w(a0Var.f11283a).equals(this.G)) {
            return true;
        }
        return false;
    }

    @Override // q2.a
    public final q2.a0 c(q2.c0 c0Var, u2.e eVar, long j) {
        return new s(eVar, this.E, this.G, new lc.c(this), this.F, this.H);
    }

    @Override // q2.a
    public final synchronized r1.e0 i() {
        return this.M;
    }

    @Override // q2.a
    public final void n(w1.a0 a0Var) {
        x();
    }

    @Override // q2.a
    public final void q(q2.a0 a0Var) {
        s sVar = (s) a0Var;
        ArrayList arrayList = sVar.B;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            r rVar = (r) arrayList.get(i6);
            if (!rVar.f8538e) {
                rVar.f8535b.e(null);
                rVar.f8536c.D();
                rVar.f8538e = true;
            }
        }
        u1.a0.g(sVar.A);
        sVar.O = true;
    }

    @Override // q2.a
    public final synchronized void v(r1.e0 e0Var) {
        this.M = e0Var;
    }

    public final void x() {
        d1 d1Var = new q2.d1(this.I, this.J, this.K, i());
        if (this.L) {
            d1Var = new t(d1Var, 0);
        }
        p(d1Var);
    }

    @Override // q2.a
    public final void l() {
    }

    @Override // q2.a
    public final void s() {
    }
}
