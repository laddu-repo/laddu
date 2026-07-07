package j2;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends Exception {
    public final String A;

    /* renamed from: x, reason: collision with root package name */
    public final String f7102x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f7103y;

    /* renamed from: z, reason: collision with root package name */
    public final q f7104z;

    public r(r1.q qVar, w wVar, boolean z10, int i6) {
        this("Decoder init failed: [" + i6 + "], " + qVar, wVar, qVar.f11670n, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i6 < 0 ? "neg_" : HttpUrl.FRAGMENT_ENCODE_SET) + Math.abs(i6));
    }

    public r(String str, Throwable th, String str2, boolean z10, q qVar, String str3) {
        super(str, th);
        this.f7102x = str2;
        this.f7103y = z10;
        this.f7104z = qVar;
        this.A = str3;
    }
}
