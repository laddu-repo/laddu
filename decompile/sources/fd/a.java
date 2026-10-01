package fd;

import ad.g;
import de.i;
import ed.o;
import java.util.List;
import s5.d;
import zc.e;
import zc.l;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f5383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f5384c;

    public a(d dVar, o oVar) {
        i.e(oVar, "fetchListener");
        this.f5382a = dVar;
        this.f5383b = oVar;
    }

    public final void a(ad.e eVar) {
        if (this.f5384c) {
            return;
        }
        eVar.E = l.B;
        this.f5382a.B(eVar);
        this.f5383b.f(eVar);
    }

    public final void b(ad.e eVar, jd.b bVar, int i) {
        i.e(eVar, "download");
        i.e(bVar, "downloadBlock");
        if (this.f5384c) {
            return;
        }
        this.f5383b.a(eVar, bVar, i);
    }

    public final void c(ad.e eVar, zc.b bVar, Exception exc) {
        l lVar = l.f14915y;
        i.e(eVar, "download");
        if (this.f5384c) {
            return;
        }
        int i = eVar.N;
        if (eVar.F == zc.b.F) {
            eVar.E = lVar;
            eVar.e(id.a.f6605d);
            this.f5382a.B(eVar);
            this.f5383b.c(eVar, true);
            return;
        }
        int i10 = eVar.O;
        if (i10 >= i) {
            eVar.E = l.D;
            this.f5382a.B(eVar);
            this.f5383b.h(eVar, bVar, exc);
        } else {
            eVar.O = i10 + 1;
            eVar.E = lVar;
            eVar.e(id.a.f6605d);
            this.f5382a.B(eVar);
            this.f5383b.c(eVar, true);
        }
    }

    public final void d(ad.e eVar, long j8, long j9) {
        i.e(eVar, "download");
        if (this.f5384c) {
            return;
        }
        this.f5383b.e(eVar, j8, j9);
    }

    public final void e(ad.e eVar, List list, int i) {
        i.e(eVar, "download");
        if (this.f5384c) {
            return;
        }
        eVar.E = l.f14916z;
        this.f5382a.B(eVar);
        this.f5383b.g(eVar, list, i);
    }

    public final void f(ad.e eVar) {
        i.e(eVar, "download");
        if (this.f5384c) {
            return;
        }
        eVar.E = l.f14916z;
        g gVar = (g) this.f5382a.f11493v;
        gVar.getClass();
        i.e(eVar, "downloadInfo");
        synchronized (gVar.f494w) {
            gVar.f493v.c0(eVar);
        }
    }
}
