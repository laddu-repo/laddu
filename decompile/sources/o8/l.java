package o8;

import androidx.media3.decoder.DecoderInputBuffer;
import da.m0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l implements n, e, d, b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9975v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Executor f9976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f9977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f9978y;

    public l(Executor executor, b bVar) {
        this.f9975v = 0;
        this.f9977x = new Object();
        this.f9976w = executor;
        this.f9978y = bVar;
    }

    private final void b(o oVar) {
        synchronized (this.f9977x) {
        }
        this.f9976w.execute(new m0(this, oVar, false, 27));
    }

    private final void c(o oVar) {
        if (oVar.j() || oVar.f9985d) {
            return;
        }
        synchronized (this.f9977x) {
            try {
                if (((d) this.f9978y) == null) {
                    return;
                }
                this.f9976w.execute(new m0(this, oVar, false, 28));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d(o oVar) {
        if (oVar.j()) {
            synchronized (this.f9977x) {
                try {
                    if (((e) this.f9978y) == null) {
                        return;
                    }
                    this.f9976w.execute(new m0(this, oVar, false, 29));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // o8.n
    public final void a(o oVar) {
        switch (this.f9975v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (oVar.f9985d) {
                    synchronized (this.f9977x) {
                        try {
                            if (((b) this.f9978y) != null) {
                                this.f9976w.execute(new androidx.fragment.app.m(23, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                b(oVar);
                return;
            case 2:
                c(oVar);
                return;
            case 3:
                d(oVar);
                return;
            default:
                this.f9976w.execute(new m(0, this, oVar));
                return;
        }
    }

    @Override // o8.b
    public void m() {
        ((o) this.f9978y).o();
    }

    @Override // o8.e
    public void n(Object obj) {
        ((o) this.f9978y).l(obj);
    }

    @Override // o8.d
    public void z(Exception exc) {
        ((o) this.f9978y).n(exc);
    }

    public l(Executor executor, c cVar) {
        this.f9975v = 1;
        this.f9977x = new Object();
        this.f9976w = executor;
        this.f9978y = cVar;
    }

    public l(Executor executor, d dVar) {
        this.f9975v = 2;
        this.f9977x = new Object();
        this.f9976w = executor;
        this.f9978y = dVar;
    }

    public l(Executor executor, e eVar) {
        this.f9975v = 3;
        this.f9977x = new Object();
        this.f9976w = executor;
        this.f9978y = eVar;
    }

    public l(Executor executor, g gVar, o oVar) {
        this.f9975v = 4;
        this.f9976w = executor;
        this.f9977x = gVar;
        this.f9978y = oVar;
    }
}
