package j5;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6875c;

    public /* synthetic */ o(w wVar, String str, int i) {
        this.f6873a = i;
        this.f6874b = wVar;
        this.f6875c = str;
    }

    @Override // j5.v
    public final void run() {
        switch (this.f6873a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f6874b.r(this.f6875c);
                break;
            case 1:
                this.f6874b.q(this.f6875c);
                break;
            default:
                this.f6874b.t(this.f6875c);
                break;
        }
    }
}
