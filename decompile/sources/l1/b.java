package l1;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import h8.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f8090a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8091b;

    public b(float[] fArr) {
        this.f8090a = fArr;
        this.f8091b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float[] fArr = this.f8090a;
        int min = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f10 = this.f8091b;
        float f11 = (f3 - (min * f10)) / f10;
        float f12 = fArr[min];
        return c.f(fArr[min + 1], f12, f11, f12);
    }
}
