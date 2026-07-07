package l2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Exception {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f8109v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f8110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o f8111x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f8112y;

    public q(t1.o oVar, v vVar, boolean z2, int i) {
        this("Decoder init failed: [" + i + "], " + oVar, vVar, oVar.f12061n, z2, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public q(String str, Throwable th, String str2, boolean z2, o oVar, String str3) {
        super(str, th);
        this.f8109v = str2;
        this.f8110w = z2;
        this.f8111x = oVar;
        this.f8112y = str3;
    }
}
