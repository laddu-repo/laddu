package u;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f12729a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f3, float f10, boolean z10) {
        if (z10) {
            return (float) (((1.0d - f12729a) * f10) + f3);
        }
        return f3;
    }

    public static float b(float f3, float f10, boolean z10) {
        if (z10) {
            return (float) (((1.0d - f12729a) * f10) + (f3 * 1.5f));
        }
        return f3 * 1.5f;
    }
}
