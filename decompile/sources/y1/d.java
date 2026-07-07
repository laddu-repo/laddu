package y1;

import android.media.MediaCodec;
import android.os.Build;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14801a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f14802b;

    /* renamed from: c, reason: collision with root package name */
    public int f14803c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f14804d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f14805e;

    /* renamed from: f, reason: collision with root package name */
    public int f14806f;

    /* renamed from: g, reason: collision with root package name */
    public int f14807g;

    /* renamed from: h, reason: collision with root package name */
    public int f14808h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f14809i;
    public final c j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f14809i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.j = cVar;
    }
}
