package c6;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f2209b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f2210c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f2211d = new l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2212a;

    public /* synthetic */ l(int i) {
        this.f2212a = i;
    }

    public final boolean a(int i) {
        switch (this.f2212a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                break;
            case 1:
                if (i == 3 || i == 5) {
                }
                break;
            default:
                if (i == 2) {
                }
                break;
        }
        return false;
    }
}
