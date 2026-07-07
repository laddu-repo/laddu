package j6;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f6951b = new n(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f6952c = new n(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f6953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f6954e;
    public static final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a6.h f6955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f6956h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6957a;

    static {
        n nVar = new n(1);
        f6953d = nVar;
        f6954e = new n(3);
        f = nVar;
        f6955g = a6.h.a(nVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f6956h = true;
    }

    public /* synthetic */ n(int i) {
        this.f6957a = i;
    }

    public final int a(int i, int i10, int i11, int i12) {
        switch (this.f6957a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (b(i, i10, i11, i12) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (f6956h) {
                }
                break;
        }
        return 2;
    }

    public final float b(int i, int i10, int i11, int i12) {
        switch (this.f6957a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return Math.min(1.0f, f6951b.b(i, i10, i11, i12));
            case 1:
                return Math.max(i11 / i, i12 / i10);
            case 2:
                if (f6956h) {
                    return Math.min(i11 / i, i12 / i10);
                }
                if (Math.max(i10 / i12, i / i11) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
