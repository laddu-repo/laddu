package l0;

import android.graphics.Color;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8060a = new ThreadLocal();

    public static int a(double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        int min;
        int min2;
        double d16 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d17 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d18 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = d17 * 12.92d;
        }
        if (d18 > 0.0031308d) {
            d15 = (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d15 = 12.92d * d18;
        }
        int round = (int) Math.round(d13 * 255.0d);
        int i6 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d14 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d15 * 255.0d);
        if (round3 >= 0) {
            i6 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i6);
    }

    public static int b(int i6, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i6);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i11, c(Color.red(i6), alpha2, Color.red(i10), alpha, i11), c(Color.green(i6), alpha2, Color.green(i10), alpha, i11), c(Color.blue(i6), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int c(int i6, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i6 * 255) * i10)) / (i13 * 255);
    }

    public static int d(int i6, int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return (i6 & 16777215) | (i10 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
