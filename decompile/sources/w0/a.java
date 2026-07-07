package w0;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f13511a;

    /* renamed from: b, reason: collision with root package name */
    public int f13512b;

    /* renamed from: c, reason: collision with root package name */
    public float f13513c;

    /* renamed from: d, reason: collision with root package name */
    public float f13514d;

    /* renamed from: e, reason: collision with root package name */
    public long f13515e;

    /* renamed from: f, reason: collision with root package name */
    public long f13516f;

    /* renamed from: g, reason: collision with root package name */
    public long f13517g;

    /* renamed from: h, reason: collision with root package name */
    public float f13518h;

    /* renamed from: i, reason: collision with root package name */
    public int f13519i;

    public final float a(long j) {
        long j10 = this.f13515e;
        if (j < j10) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        long j11 = this.f13517g;
        if (j11 >= 0 && j >= j11) {
            float f3 = this.f13518h;
            return (d.b(((float) (j - j11)) / this.f13519i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * f3) + (1.0f - f3);
        }
        return d.b(((float) (j - j10)) / this.f13511a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 0.5f;
    }
}
