package k0;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f7571k;

    /* renamed from: a, reason: collision with root package name */
    public final float f7572a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7573b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7574c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7575d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7576e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7577f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f7578g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7579h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7580i;
    public final float j;

    static {
        float f3;
        float[] fArr = b.f7546c;
        float n10 = (float) ((b.n() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f7544a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f3 = 0.69f;
        } else {
            f3 = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp(((-n10) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f18 = 1.0f / ((5.0f * n10) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(n10 * 5.0d))) + (f19 * n10);
        float n11 = b.n() / fArr[1];
        double d11 = n11;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f21 = fArr6[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr6[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr6[2];
        float[] fArr7 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f7571k = new m(n11, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f3, 1.0f, new float[]{(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public m(float f3, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f7577f = f3;
        this.f7572a = f10;
        this.f7573b = f11;
        this.f7574c = f12;
        this.f7575d = f13;
        this.f7576e = f14;
        this.f7578g = fArr;
        this.f7579h = f15;
        this.f7580i = f16;
        this.j = f17;
    }
}
