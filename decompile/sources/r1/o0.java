package r1;

import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final o0 f11593d = new o0(1.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final String f11594e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f11595f;

    /* renamed from: a, reason: collision with root package name */
    public final float f11596a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11597b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11598c;

    static {
        String str = u1.a0.f12750a;
        f11594e = Integer.toString(0, 36);
        f11595f = Integer.toString(1, 36);
    }

    public o0(float f3, float f10) {
        boolean z10;
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        u1.c.b(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f11596a = f3;
        this.f11597b = f10;
        this.f11598c = Math.round(f3 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            o0 o0Var = (o0) obj;
            if (this.f11596a == o0Var.f11596a && this.f11597b == o0Var.f11597b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f11597b) + ((Float.floatToRawIntBits(this.f11596a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f11596a), Float.valueOf(this.f11597b)};
        String str = u1.a0.f12750a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
