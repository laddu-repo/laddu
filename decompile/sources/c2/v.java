package c2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final u f1926a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1927b;

    /* renamed from: c, reason: collision with root package name */
    public final u5.r f1928c;

    /* renamed from: d, reason: collision with root package name */
    public int f1929d;

    /* renamed from: e, reason: collision with root package name */
    public long f1930e;

    /* renamed from: f, reason: collision with root package name */
    public long f1931f;

    /* renamed from: g, reason: collision with root package name */
    public long f1932g;

    /* renamed from: h, reason: collision with root package name */
    public long f1933h;

    /* renamed from: i, reason: collision with root package name */
    public long f1934i;

    public v(AudioTrack audioTrack, u5.r rVar) {
        this.f1926a = new u(audioTrack);
        this.f1927b = audioTrack.getSampleRate();
        this.f1928c = rVar;
        a(0);
    }

    public final void a(int i6) {
        this.f1929d = i6;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2 && i6 != 3) {
                    if (i6 == 4) {
                        this.f1931f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f1931f = 10000000L;
                return;
            }
            this.f1931f = 10000L;
            return;
        }
        this.f1932g = 0L;
        this.f1933h = -1L;
        this.f1934i = -9223372036854775807L;
        this.f1930e = System.nanoTime() / 1000;
        this.f1931f = 10000L;
    }
}
