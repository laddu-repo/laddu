package k;

import android.animation.TimeInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f7519a;

    /* renamed from: b, reason: collision with root package name */
    public int f7520b;

    /* renamed from: c, reason: collision with root package name */
    public int f7521c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        float f10;
        int i6 = (int) ((f3 * this.f7521c) + 0.5f);
        int i10 = this.f7520b;
        int[] iArr = this.f7519a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i6 < i12) {
                break;
            }
            i6 -= i12;
            i11++;
        }
        if (i11 < i10) {
            f10 = i6 / this.f7521c;
        } else {
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return (i11 / i10) + f10;
    }
}
