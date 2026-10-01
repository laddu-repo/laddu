package sa;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f11645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ab.f f11646x;

    public /* synthetic */ m(q qVar, ab.f fVar, int i) {
        this.f11644v = i;
        this.f11645w = qVar;
        this.f11646x = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11644v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f11645w.a(this.f11646x);
                break;
            default:
                this.f11645w.a(this.f11646x);
                break;
        }
    }
}
