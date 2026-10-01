package ua;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends k6.e {
    @Override // k6.e
    public final void c(o7.b bVar, float f3, float f10) {
        float f11 = f10 * f3;
        bVar.d(f11, 180.0f, 90.0f);
        double d10 = f11;
        bVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d10), (float) (Math.sin(Math.toRadians(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) * d10));
    }
}
