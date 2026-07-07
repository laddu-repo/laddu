package o8;

import androidx.media3.decoder.DecoderInputBuffer;
import da.m0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements n, e, d, b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Executor f9972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f9973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f9974y;

    public /* synthetic */ k(Executor executor, a aVar, o oVar, int i) {
        this.f9971v = i;
        this.f9972w = executor;
        this.f9973x = aVar;
        this.f9974y = oVar;
    }

    @Override // o8.n
    public final void a(o oVar) {
        switch (this.f9971v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f9972w.execute(new m0(this, oVar, false, 25));
                break;
            default:
                this.f9972w.execute(new m0(this, oVar, false, 26));
                break;
        }
    }

    @Override // o8.b
    public void m() {
        this.f9974y.o();
    }

    @Override // o8.e
    public void n(Object obj) {
        this.f9974y.l(obj);
    }

    @Override // o8.d
    public void z(Exception exc) {
        this.f9974y.n(exc);
    }
}
