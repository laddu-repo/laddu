package p5;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10531a = new Object();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f3, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f10 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f11 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float f12 = h8.c.f(f11, f10, f3, f10);
        float f13 = h8.c.f(pow4, pow, f3, pow);
        float f14 = h8.c.f(pow5, pow2, f3, pow2);
        float f15 = h8.c.f(pow6, pow3, f3, pow3);
        float pow7 = ((float) Math.pow(f13, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(f14, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(f15, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
