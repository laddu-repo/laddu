package c6;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r6.h f2221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f2222x;

    public /* synthetic */ n(q qVar, r6.h hVar, int i) {
        this.f2220v = i;
        this.f2222x = qVar;
        this.f2221w = hVar;
    }

    private final void a() {
        r6.h hVar = this.f2221w;
        hVar.f11312b.a();
        synchronized (hVar.f11313c) {
            synchronized (this.f2222x) {
                try {
                    if (this.f2222x.f2226v.f2225v.contains(new o(this.f2221w, v6.f.f13222b))) {
                        q qVar = this.f2222x;
                        try {
                            this.f2221w.i(qVar.L, 5);
                        } catch (Throwable th) {
                            throw new c(th);
                        }
                    }
                    this.f2222x.d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2220v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                a();
                return;
            default:
                r6.h hVar = this.f2221w;
                hVar.f11312b.a();
                synchronized (hVar.f11313c) {
                    synchronized (this.f2222x) {
                        try {
                            if (this.f2222x.f2226v.f2225v.contains(new o(this.f2221w, v6.f.f13222b))) {
                                this.f2222x.N.a();
                                q qVar = this.f2222x;
                                try {
                                    this.f2221w.k(qVar.N, qVar.J, qVar.Q);
                                    this.f2222x.j(this.f2221w);
                                } catch (Throwable th) {
                                    throw new c(th);
                                }
                            }
                            this.f2222x.d();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}
