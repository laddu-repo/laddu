package s2;

import android.net.Uri;
import java.io.IOException;
import o2.u;
import w1.b0;
import y1.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements k {
    public volatile Object A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f11470v = u.f9532b.getAndIncrement();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y1.k f11471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f11472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f11473y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p f11474z;

    public q(y1.h hVar, y1.k kVar, int i, p pVar) {
        this.f11473y = new y(hVar);
        this.f11471w = kVar;
        this.f11472x = i;
        this.f11474z = pVar;
    }

    @Override // s2.k
    public final void c() {
        this.f11473y.f14400w = 0L;
        y1.j jVar = new y1.j(this.f11473y, this.f11471w);
        try {
            jVar.f14372v.h(jVar.f14373w);
            jVar.f14375y = true;
            Uri uriS = this.f11473y.f14399v.s();
            uriS.getClass();
            this.A = this.f11474z.j(uriS, jVar);
            try {
                jVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i = b0.f13686a;
            try {
                jVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // s2.k
    public final void j() {
    }
}
