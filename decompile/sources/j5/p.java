package j5;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6878c;

    public /* synthetic */ p(w wVar, int i, int i10) {
        this.f6876a = i10;
        this.f6877b = wVar;
        this.f6878c = i;
    }

    @Override // j5.v
    public final void run() {
        switch (this.f6876a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f6877b.p(this.f6878c);
                break;
            case 1:
                this.f6877b.s(this.f6878c);
                break;
            default:
                this.f6877b.o(this.f6878c);
                break;
        }
    }
}
