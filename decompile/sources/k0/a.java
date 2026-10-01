package k0;

import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f7538a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7539b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7540c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7541d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7542e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7543f;

    public a(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f7538a = f3;
        this.f7539b = f10;
        this.f7540c = f11;
        this.f7541d = f12;
        this.f7542e = f13;
        this.f7543f = f14;
    }

    public static a a(int i6) {
        float f3;
        m mVar = m.f7571k;
        float f10 = b.f(Color.red(i6));
        float f11 = b.f(Color.green(i6));
        float f12 = b.f(Color.blue(i6));
        float[][] fArr = b.f7547d;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[2] * f12) + (fArr2[1] * f11) + (fArr2[0] * f10);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[2] * f12) + (fArr3[1] * f11) + (fArr3[0] * f10);
        float[] fArr4 = fArr[2];
        float f15 = (f12 * fArr4[2]) + (f11 * fArr4[1]) + (f10 * fArr4[0]);
        float[][] fArr5 = b.f7544a;
        float[] fArr6 = fArr5[0];
        float f16 = (fArr6[2] * f15) + (fArr6[1] * f14) + (fArr6[0] * f13);
        float[] fArr7 = fArr5[1];
        float f17 = (fArr7[2] * f15) + (fArr7[1] * f14) + (fArr7[0] * f13);
        float[] fArr8 = fArr5[2];
        float f18 = (f15 * fArr8[2]) + (f14 * fArr8[1]) + (f13 * fArr8[0]);
        float[] fArr9 = mVar.f7578g;
        float f19 = mVar.f7580i;
        float f20 = mVar.f7575d;
        float f21 = mVar.f7572a;
        float f22 = fArr9[0] * f16;
        float f23 = fArr9[1] * f17;
        float f24 = fArr9[2] * f18;
        float f25 = mVar.f7579h;
        float pow = (float) Math.pow((Math.abs(f22) * f25) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f23) * f25) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f24) * f25) / 100.0d, 0.42d);
        float signum = ((Math.signum(f22) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f23) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f24) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f26 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d10)) / 11.0f;
        float f27 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f28 = signum2 * 20.0f;
        float f29 = ((21.0f * signum3) + ((signum * 20.0f) + f28)) / 20.0f;
        float f30 = (((signum * 40.0f) + f28) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f27, f26)) * 180.0f) / 3.1415927f;
        if (atan2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f31 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f30 * mVar.f7573b) / f21, mVar.j * f20)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f32 = f21 + 4.0f;
        if (atan2 < 20.14d) {
            f3 = 360.0f + atan2;
        } else {
            f3 = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f7577f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f3 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f7576e) * mVar.f7574c) * ((float) Math.sqrt((f27 * f27) + (f26 * f26)))) / (f29 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f20) / f32);
        float f33 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f19 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f31;
        return new a(atan2, pow5, pow4, f33, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public static a b(float f3, float f10, float f11) {
        m mVar = m.f7571k;
        float f12 = mVar.f7575d;
        Math.sqrt(f3 / 100.0d);
        float f13 = mVar.f7572a + 4.0f;
        float f14 = mVar.f7580i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * mVar.f7575d) / f13);
        float f15 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float log = ((float) Math.log((f14 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f3, f15, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(m mVar) {
        float f3;
        float f10 = this.f7539b;
        double d10 = f10;
        float f11 = this.f7540c;
        if (d10 != 0.0d) {
            double d11 = f11;
            if (d11 != 0.0d) {
                f3 = f10 / ((float) Math.sqrt(d11 / 100.0d));
                float f12 = mVar.f7577f;
                float f13 = mVar.f7579h;
                float pow = (float) Math.pow(f3 / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
                double d12 = (this.f7538a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
                float pow2 = mVar.f7572a * ((float) Math.pow(f11 / 100.0d, (1.0d / mVar.f7575d) / mVar.j));
                float f14 = cos * 3846.1538f * mVar.f7576e * mVar.f7574c;
                float f15 = pow2 / mVar.f7573b;
                float sin = (float) Math.sin(d12);
                float cos2 = (float) Math.cos(d12);
                float f16 = (((0.305f + f15) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f14 * 23.0f)));
                float f17 = cos2 * f16;
                float f18 = f16 * sin;
                float f19 = f15 * 460.0f;
                float f20 = ((288.0f * f18) + ((451.0f * f17) + f19)) / 1403.0f;
                float f21 = ((f19 - (891.0f * f17)) - (261.0f * f18)) / 1403.0f;
                float f22 = ((f19 - (f17 * 220.0f)) - (f18 * 6300.0f)) / 1403.0f;
                float f23 = 100.0f / f13;
                float signum = Math.signum(f20) * f23 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float signum2 = Math.signum(f21) * f23 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f21) * 27.13d) / (400.0d - Math.abs(f21))), 2.380952380952381d));
                float signum3 = Math.signum(f22) * f23 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f22) * 27.13d) / (400.0d - Math.abs(f22))), 2.380952380952381d));
                float[] fArr = mVar.f7578g;
                float f24 = signum / fArr[0];
                float f25 = signum2 / fArr[1];
                float f26 = signum3 / fArr[2];
                float[][] fArr2 = b.f7545b;
                float[] fArr3 = fArr2[0];
                float f27 = (fArr3[2] * f26) + (fArr3[1] * f25) + (fArr3[0] * f24);
                float[] fArr4 = fArr2[1];
                float f28 = (fArr4[2] * f26) + (fArr4[1] * f25) + (fArr4[0] * f24);
                float[] fArr5 = fArr2[2];
                return l0.b.a(f27, f28, (f26 * fArr5[2]) + (f25 * fArr5[1]) + (f24 * fArr5[0]));
            }
        }
        f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f122 = mVar.f7577f;
        float f132 = mVar.f7579h;
        float pow3 = (float) Math.pow(f3 / Math.pow(1.64d - Math.pow(0.29d, f122), 0.73d), 1.1111111111111112d);
        double d122 = (this.f7538a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d122) + 3.8d)) * 0.25f;
        float pow22 = mVar.f7572a * ((float) Math.pow(f11 / 100.0d, (1.0d / mVar.f7575d) / mVar.j));
        float f142 = cos3 * 3846.1538f * mVar.f7576e * mVar.f7574c;
        float f152 = pow22 / mVar.f7573b;
        float sin2 = (float) Math.sin(d122);
        float cos22 = (float) Math.cos(d122);
        float f162 = (((0.305f + f152) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f142 * 23.0f)));
        float f172 = cos22 * f162;
        float f182 = f162 * sin2;
        float f192 = f152 * 460.0f;
        float f202 = ((288.0f * f182) + ((451.0f * f172) + f192)) / 1403.0f;
        float f212 = ((f192 - (891.0f * f172)) - (261.0f * f182)) / 1403.0f;
        float f222 = ((f192 - (f172 * 220.0f)) - (f182 * 6300.0f)) / 1403.0f;
        float f232 = 100.0f / f132;
        float signum4 = Math.signum(f202) * f232 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float signum22 = Math.signum(f212) * f232 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f212) * 27.13d) / (400.0d - Math.abs(f212))), 2.380952380952381d));
        float signum32 = Math.signum(f222) * f232 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f222) * 27.13d) / (400.0d - Math.abs(f222))), 2.380952380952381d));
        float[] fArr6 = mVar.f7578g;
        float f242 = signum4 / fArr6[0];
        float f252 = signum22 / fArr6[1];
        float f262 = signum32 / fArr6[2];
        float[][] fArr22 = b.f7545b;
        float[] fArr32 = fArr22[0];
        float f272 = (fArr32[2] * f262) + (fArr32[1] * f252) + (fArr32[0] * f242);
        float[] fArr42 = fArr22[1];
        float f282 = (fArr42[2] * f262) + (fArr42[1] * f252) + (fArr42[0] * f242);
        float[] fArr52 = fArr22[2];
        return l0.b.a(f272, f282, (f262 * fArr52[2]) + (f252 * fArr52[1]) + (f242 * fArr52[0]));
    }
}
