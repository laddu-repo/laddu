package u9;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f12953a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final l1.a f12954b = new l1.a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final l1.a f12955c = new l1.a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final l1.a f12956d = new l1.b(l1.a.f8089e);

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f12957e = new DecelerateInterpolator();

    public static float a(float f3, float f10, float f11) {
        return h8.c.f(f10, f3, f11, f3);
    }

    public static float b(float f3, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f3;
        }
        if (f13 >= f12) {
            return f10;
        }
        return a(f3, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(float f3, int i6, int i10) {
        return Math.round(f3 * (i10 - i6)) + i6;
    }
}
