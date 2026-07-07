package androidx.media3.exoplayer.rtsp;

import dg.b;
import javax.net.SocketFactory;
import m2.d;
import m2.v;
import q2.a;
import q2.b0;
import r1.a0;
import r1.e0;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class RtspMediaSource$Factory implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final SocketFactory f1063a = SocketFactory.getDefault();

    @Override // q2.b0
    public final a b(e0 e0Var) {
        d dVar;
        e0Var.f11379b.getClass();
        a0 a0Var = e0Var.f11379b;
        a0Var.getClass();
        String scheme = a0Var.f11283a.getScheme();
        if (scheme != null && b.f("rtspt", scheme)) {
            dVar = new l(18);
        } else {
            dVar = new zb.d(18);
        }
        return new v(e0Var, dVar, this.f1063a);
    }

    @Override // q2.b0
    public final b0 d() {
        return this;
    }

    @Override // q2.b0
    public final b0 a(p.l lVar) {
        return this;
    }

    @Override // q2.b0
    public final b0 c(boolean z10) {
        return this;
    }
}
