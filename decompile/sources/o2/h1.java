package o2;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements c1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c1 f9451v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f9452w;

    public h1(c1 c1Var, long j8) {
        this.f9451v = c1Var;
        this.f9452w = j8;
    }

    @Override // o2.c1
    public final boolean a() {
        return this.f9451v.a();
    }

    @Override // o2.c1
    public final void b() {
        this.f9451v.b();
    }

    @Override // o2.c1
    public final int e(sc.b bVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int iE = this.f9451v.e(bVar, decoderInputBuffer, i);
        if (iE == -4) {
            decoderInputBuffer.timeUs += this.f9452w;
        }
        return iE;
    }

    @Override // o2.c1
    public final int k(long j8) {
        return this.f9451v.k(j8 - this.f9452w);
    }
}
