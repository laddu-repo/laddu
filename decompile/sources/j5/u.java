package j5;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6892b;

    public /* synthetic */ u(w wVar, int i) {
        this.f6891a = i;
        this.f6892b = wVar;
    }

    @Override // j5.v
    public final void run() {
        switch (this.f6891a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f6892b.n();
                break;
            default:
                this.f6892b.l();
                break;
        }
    }
}
