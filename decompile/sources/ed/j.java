package ed;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zc.e f4902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ad.e f4903x;

    public /* synthetic */ j(zc.e eVar, ad.e eVar2, int i) {
        this.f4901v = i;
        this.f4902w = eVar;
        this.f4903x = eVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4901v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f4902w.d(this.f4903x);
                break;
            case 1:
                this.f4902w.f(this.f4903x);
                break;
            default:
                this.f4902w.b(this.f4903x);
                break;
        }
    }
}
