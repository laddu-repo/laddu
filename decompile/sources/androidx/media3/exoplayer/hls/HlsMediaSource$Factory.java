package androidx.media3.exoplayer.hls;

import a7.j;
import a9.g;
import d2.e;
import h2.n;
import i2.c;
import i2.l;
import j2.s;
import java.util.List;
import k8.a0;
import k8.z;
import o2.a;
import o2.c0;
import o9.f;
import sc.b;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource$Factory implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f1312c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f1316h = new j(28);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f1314e = new f(13);
    public final e f = j2.c.J;
    public final k8.c0 i = new k8.c0(24);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f1315g = new a0(20);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1318k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f1319l = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1317j = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1313d = true;

    public HlsMediaSource$Factory(y1.g gVar) {
        this.f1310a = new g(23, gVar);
    }

    @Override // o2.c0
    public final c0 a(boolean z2) {
        this.f1313d = z2;
        return this;
    }

    @Override // o2.c0
    public final c0 c(z zVar) {
        this.f1312c = zVar;
        return this;
    }

    @Override // o2.c0
    public final a d(t1.z zVar) {
        zVar.f12179b.getClass();
        if (this.f1311b == null) {
            c cVar = new c();
            cVar.f6360a = new z(28);
            this.f1311b = cVar;
        }
        z zVar2 = this.f1312c;
        if (zVar2 != null) {
            this.f1311b.f6360a = zVar2;
        }
        c cVar2 = this.f1311b;
        cVar2.f6361b = this.f1313d;
        List list = zVar.f12179b.f12132d;
        boolean zIsEmpty = list.isEmpty();
        s bVar = this.f1314e;
        if (!zIsEmpty) {
            bVar = new b(bVar, list, false, 19);
        }
        n nVarH = this.f1316h.h(zVar);
        this.f.getClass();
        g gVar = this.f1310a;
        k8.c0 c0Var = this.i;
        return new l(zVar, gVar, cVar2, this.f1315g, nVarH, c0Var, new j2.c(gVar, c0Var, bVar), this.f1319l, this.f1317j, this.f1318k);
    }

    @Override // o2.c0
    public final c0 b() {
        return this;
    }
}
