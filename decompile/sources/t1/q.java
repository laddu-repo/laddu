package t1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f12079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f12081c = new r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o2.p f12082d = new o2.p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12083e = Collections.EMPTY_LIST;
    public final y9.f0 f = y9.z0.f14637z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g2.t f12085h = new g2.t();
    public final x i = x.f12153a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12084g = -9223372036854775807L;

    public final z a() {
        w wVar;
        o2.p pVar = this.f12082d;
        w1.a.j(((Uri) pVar.f9504x) == null || ((UUID) pVar.f9503w) != null);
        Uri uri = this.f12079a;
        if (uri != null) {
            String str = this.f12080b;
            o2.p pVar2 = this.f12082d;
            wVar = new w(uri, str, ((UUID) pVar2.f9503w) != null ? new u(pVar2) : null, this.f12083e, this.f, this.f12084g);
        } else {
            wVar = null;
        }
        r rVar = this.f12081c;
        rVar.getClass();
        t tVar = new t(rVar);
        g2.t tVar2 = this.f12085h;
        tVar2.getClass();
        return new z("", tVar, wVar, new v(tVar2), c0.B, this.i);
    }

    public final void b(u uVar) {
        this.f12082d = uVar.a();
    }
}
